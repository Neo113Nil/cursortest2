package com.google.android.exoplayer2.source.mediaparser;

/* loaded from: classes3.dex */
public final class OutputConsumerAdapterV30 implements android.media.MediaParser.OutputConsumer {
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final java.lang.String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final java.lang.String TAG = "OConsumerAdapterV30";
    private java.lang.String containerMimeType;
    private android.media.MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private com.google.android.exoplayer2.extractor.ChunkIndex lastChunkIndex;
    private final java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput.CryptoData> lastOutputCryptoDatas;
    private final java.util.ArrayList<android.media.MediaCodec.CryptoInfo> lastReceivedCryptoInfos;
    private android.media.MediaParser.SeekMap lastSeekMap;
    private java.util.List<com.google.android.exoplayer2.Format> muxedCaptionFormats;
    private int primaryTrackIndex;
    private final com.google.android.exoplayer2.Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.DataReaderAdapter scratchDataReaderAdapter;
    private boolean seekingDisabled;
    private com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;
    private final java.util.ArrayList<com.google.android.exoplayer2.Format> trackFormats;
    private final java.util.ArrayList<com.google.android.exoplayer2.extractor.TrackOutput> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;
    private static final android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> SEEK_POINT_PAIR_START = android.util.Pair.create(android.media.MediaParser.SeekPoint.START, android.media.MediaParser.SeekPoint.START);
    private static final java.util.regex.Pattern REGEX_CRYPTO_INFO_PATTERN = java.util.regex.Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    public OutputConsumerAdapterV30() {
        this(null, -2, false);
    }

    public OutputConsumerAdapterV30(com.google.android.exoplayer2.Format format, int i, boolean z) {
        this.expectDummySeekMap = z;
        this.primaryTrackManifestFormat = format;
        this.primaryTrackType = i;
        this.trackOutputs = new java.util.ArrayList<>();
        this.trackFormats = new java.util.ArrayList<>();
        this.lastReceivedCryptoInfos = new java.util.ArrayList<>();
        this.lastOutputCryptoDatas = new java.util.ArrayList<>();
        this.scratchDataReaderAdapter = new com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.DataReaderAdapter();
        this.extractorOutput = new com.google.android.exoplayer2.extractor.DummyExtractorOutput();
        this.sampleTimestampUpperLimitFilterUs = -9223372036854775807L;
        this.muxedCaptionFormats = com.google.common.collect.ImmutableList.of();
    }

    public void setSampleTimestampUpperLimitFilterUs(long j) {
        this.sampleTimestampUpperLimitFilterUs = j;
    }

    public void setTimestampAdjuster(com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
    }

    public void setExtractorOutput(com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public void setMuxedCaptionFormats(java.util.List<com.google.android.exoplayer2.Format> list) {
        this.muxedCaptionFormats = list;
    }

    public void disableSeeking() {
        this.seekingDisabled = true;
    }

    public android.media.MediaParser.SeekMap getDummySeekMap() {
        return this.dummySeekMap;
    }

    public com.google.android.exoplayer2.extractor.ChunkIndex getChunkIndex() {
        return this.lastChunkIndex;
    }

    public android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> getSeekPoints(long j) {
        android.media.MediaParser.SeekMap seekMap = this.lastSeekMap;
        return seekMap != null ? seekMap.getSeekPoints(j) : SEEK_POINT_PAIR_START;
    }

    public void setSelectedParserName(java.lang.String str) {
        this.containerMimeType = getMimeType(str);
    }

    public com.google.android.exoplayer2.Format[] getSampleFormats() {
        if (!this.tracksFoundCalled) {
            return null;
        }
        com.google.android.exoplayer2.Format[] formatArr = new com.google.android.exoplayer2.Format[this.trackFormats.size()];
        for (int i = 0; i < this.trackFormats.size(); i++) {
            formatArr[i] = (com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.trackFormats.get(i));
        }
        return formatArr;
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackCountFound(int i) {
        this.tracksFoundCalled = true;
        maybeEndTracks();
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSeekMapFound(android.media.MediaParser.SeekMap seekMap) {
        com.google.android.exoplayer2.extractor.SeekMap seekMapAdapter;
        if (this.expectDummySeekMap && this.dummySeekMap == null) {
            this.dummySeekMap = seekMap;
            return;
        }
        this.lastSeekMap = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput = this.extractorOutput;
        if (this.seekingDisabled) {
            if (durationMicros == -2147483648L) {
                durationMicros = -9223372036854775807L;
            }
            seekMapAdapter = new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(durationMicros);
        } else {
            seekMapAdapter = new com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30.SeekMapAdapter(seekMap);
        }
        extractorOutput.seekMap(seekMapAdapter);
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackDataFound(int i, android.media.MediaParser.TrackData trackData) {
        if (maybeObtainChunkIndex(trackData.mediaFormat)) {
            return;
        }
        ensureSpaceForTrackIndex(i);
        com.google.android.exoplayer2.extractor.TrackOutput trackOutput = this.trackOutputs.get(i);
        if (trackOutput == null) {
            java.lang.String string = trackData.mediaFormat.getString(MEDIA_FORMAT_KEY_TRACK_TYPE);
            int trackTypeConstant = toTrackTypeConstant(string != null ? string : trackData.mediaFormat.getString("mime"));
            if (trackTypeConstant == this.primaryTrackType) {
                this.primaryTrackIndex = i;
            }
            com.google.android.exoplayer2.extractor.TrackOutput track = this.extractorOutput.track(i, trackTypeConstant);
            this.trackOutputs.set(i, track);
            if (string != null) {
                return;
            } else {
                trackOutput = track;
            }
        }
        com.google.android.exoplayer2.Format exoPlayerFormat = toExoPlayerFormat(trackData);
        com.google.android.exoplayer2.Format format = this.primaryTrackManifestFormat;
        trackOutput.format((format == null || i != this.primaryTrackIndex) ? exoPlayerFormat : exoPlayerFormat.withManifestFormatInfo(format));
        this.trackFormats.set(i, exoPlayerFormat);
        maybeEndTracks();
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleDataFound(int i, android.media.MediaParser.InputReader inputReader) throws java.io.IOException {
        ensureSpaceForTrackIndex(i);
        this.scratchDataReaderAdapter.input = inputReader;
        com.google.android.exoplayer2.extractor.TrackOutput trackOutput = this.trackOutputs.get(i);
        if (trackOutput == null) {
            trackOutput = this.extractorOutput.track(i, -1);
            this.trackOutputs.set(i, trackOutput);
        }
        trackOutput.sampleData((com.google.android.exoplayer2.upstream.DataReader) this.scratchDataReaderAdapter, (int) inputReader.getLength(), true);
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleCompleted(int i, long j, int i2, int i3, int i4, android.media.MediaCodec.CryptoInfo cryptoInfo) {
        long j2 = this.sampleTimestampUpperLimitFilterUs;
        if (j2 == -9223372036854775807L || j < j2) {
            com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j = timestampAdjuster.adjustSampleTimestamp(j);
            }
            ((com.google.android.exoplayer2.extractor.TrackOutput) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.trackOutputs.get(i))).sampleMetadata(j, i2, i3, i4, toExoPlayerCryptoData(i, cryptoInfo));
        }
    }

    private boolean maybeObtainChunkIndex(android.media.MediaFormat mediaFormat) {
        java.nio.ByteBuffer byteBuffer = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES);
        if (byteBuffer == null) {
            return false;
        }
        java.nio.IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        java.nio.LongBuffer asLongBuffer = ((java.nio.ByteBuffer) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS))).asLongBuffer();
        java.nio.LongBuffer asLongBuffer2 = ((java.nio.ByteBuffer) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS))).asLongBuffer();
        java.nio.LongBuffer asLongBuffer3 = ((java.nio.ByteBuffer) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES))).asLongBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        long[] jArr = new long[asLongBuffer.remaining()];
        long[] jArr2 = new long[asLongBuffer2.remaining()];
        long[] jArr3 = new long[asLongBuffer3.remaining()];
        asIntBuffer.get(iArr);
        asLongBuffer.get(jArr);
        asLongBuffer2.get(jArr2);
        asLongBuffer3.get(jArr3);
        com.google.android.exoplayer2.extractor.ChunkIndex chunkIndex = new com.google.android.exoplayer2.extractor.ChunkIndex(iArr, jArr, jArr2, jArr3);
        this.lastChunkIndex = chunkIndex;
        this.extractorOutput.seekMap(chunkIndex);
        return true;
    }

    private void ensureSpaceForTrackIndex(int i) {
        for (int size = this.trackOutputs.size(); size <= i; size++) {
            this.trackOutputs.add(null);
            this.trackFormats.add(null);
            this.lastReceivedCryptoInfos.add(null);
            this.lastOutputCryptoDatas.add(null);
        }
    }

    private com.google.android.exoplayer2.extractor.TrackOutput.CryptoData toExoPlayerCryptoData(int i, android.media.MediaCodec.CryptoInfo cryptoInfo) {
        int i2;
        int i3;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.lastReceivedCryptoInfos.get(i) == cryptoInfo) {
            return (com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.lastOutputCryptoDatas.get(i));
        }
        try {
            java.util.regex.Matcher matcher = REGEX_CRYPTO_INFO_PATTERN.matcher(cryptoInfo.toString());
            matcher.find();
            i2 = java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(matcher.group(1)));
            i3 = java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(matcher.group(2)));
        } catch (java.lang.RuntimeException e) {
            com.google.android.exoplayer2.util.Log.e(TAG, "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e);
            i2 = 0;
            i3 = 0;
        }
        com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData = new com.google.android.exoplayer2.extractor.TrackOutput.CryptoData(cryptoInfo.mode, cryptoInfo.key, i2, i3);
        this.lastReceivedCryptoInfos.set(i, cryptoInfo);
        this.lastOutputCryptoDatas.set(i, cryptoData);
        return cryptoData;
    }

    private void maybeEndTracks() {
        if (!this.tracksFoundCalled || this.tracksEnded) {
            return;
        }
        int size = this.trackOutputs.size();
        for (int i = 0; i < size; i++) {
            if (this.trackOutputs.get(i) == null) {
                return;
            }
        }
        this.extractorOutput.endTracks();
        this.tracksEnded = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int toTrackTypeConstant(java.lang.String str) {
        char c;
        if (str == null) {
            return -1;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -450004177:
                if (str.equals("metadata")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 112202875:
                if (str.equals("video")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 5;
            case 1:
                return -1;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return com.google.android.exoplayer2.util.MimeTypes.getTrackType(str);
        }
    }

    private com.google.android.exoplayer2.Format toExoPlayerFormat(android.media.MediaParser.TrackData trackData) {
        android.media.MediaFormat mediaFormat = trackData.mediaFormat;
        java.lang.String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        int i = 0;
        com.google.android.exoplayer2.Format.Builder accessibilityChannel = new com.google.android.exoplayer2.Format.Builder().setDrmInitData(toExoPlayerDrmInitData(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).setContainerMimeType(this.containerMimeType).setPeakBitrate(mediaFormat.getInteger("bitrate", -1)).setChannelCount(mediaFormat.getInteger("channel-count", -1)).setColorInfo(com.google.android.exoplayer2.util.MediaFormatUtil.getColorInfo(mediaFormat)).setSampleMimeType(string).setCodecs(mediaFormat.getString("codecs-string")).setFrameRate(mediaFormat.getFloat("frame-rate", -1.0f)).setWidth(mediaFormat.getInteger("width", -1)).setHeight(mediaFormat.getInteger("height", -1)).setInitializationData(getInitializationData(mediaFormat)).setLanguage(mediaFormat.getString("language")).setMaxInputSize(mediaFormat.getInteger("max-input-size", -1)).setPcmEncoding(mediaFormat.getInteger("exo-pcm-encoding", -1)).setRotationDegrees(mediaFormat.getInteger("rotation-degrees", 0)).setSampleRate(mediaFormat.getInteger("sample-rate", -1)).setSelectionFlags(getSelectionFlags(mediaFormat)).setEncoderDelay(mediaFormat.getInteger("encoder-delay", 0)).setEncoderPadding(mediaFormat.getInteger("encoder-padding", 0)).setPixelWidthHeightRatio(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).setSubsampleOffsetUs(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).setAccessibilityChannel(integer);
        while (true) {
            if (i >= this.muxedCaptionFormats.size()) {
                break;
            }
            com.google.android.exoplayer2.Format format = this.muxedCaptionFormats.get(i);
            if (com.google.android.exoplayer2.util.Util.areEqual(format.sampleMimeType, string) && format.accessibilityChannel == integer) {
                accessibilityChannel.setLanguage(format.language).setRoleFlags(format.roleFlags).setSelectionFlags(format.selectionFlags).setLabel(format.label).setMetadata(format.metadata);
                break;
            }
            i++;
        }
        return accessibilityChannel.build();
    }

    private static com.google.android.exoplayer2.drm.DrmInitData toExoPlayerDrmInitData(java.lang.String str, android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        com.google.android.exoplayer2.drm.DrmInitData.SchemeData[] schemeDataArr = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[schemeInitDataCount];
        for (int i = 0; i < schemeInitDataCount; i++) {
            android.media.DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i);
            schemeDataArr[i] = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new com.google.android.exoplayer2.drm.DrmInitData(str, schemeDataArr);
    }

    private static int getSelectionFlags(android.media.MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | getFlag(mediaFormat, "is-default", 1);
    }

    private static int getFlag(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i;
        }
        return 0;
    }

    private static java.util.List<byte[]> getInitializationData(android.media.MediaFormat mediaFormat) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (true) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("csd-");
            int i2 = i + 1;
            sb.append(i);
            java.nio.ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(com.google.android.exoplayer2.util.MediaFormatUtil.getArray(byteBuffer));
            i = i2;
        }
    }

    private static java.lang.String getMimeType(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                return "video/mp4";
            case "android.media.mediaparser.OggParser":
                return "audio/ogg";
            case "android.media.mediaparser.TsParser":
                return "video/mp2t";
            case "android.media.mediaparser.AdtsParser":
                return "audio/mp4a-latm";
            case "android.media.mediaparser.WavParser":
                return "audio/raw";
            case "android.media.mediaparser.PsParser":
                return "video/mp2p";
            case "android.media.mediaparser.Ac3Parser":
                return "audio/ac3";
            case "android.media.mediaparser.AmrParser":
                return "audio/amr";
            case "android.media.mediaparser.FlacParser":
                return "audio/flac";
            case "android.media.mediaparser.MatroskaParser":
                return "video/webm";
            case "android.media.mediaparser.Ac4Parser":
                return "audio/ac4";
            case "android.media.mediaparser.Mp3Parser":
                return "audio/mpeg";
            case "android.media.mediaparser.FlvParser":
                return "video/x-flv";
            default:
                throw new java.lang.IllegalArgumentException("Illegal parser name: " + str);
        }
    }

    private static final class SeekMapAdapter implements com.google.android.exoplayer2.extractor.SeekMap {
        private final android.media.MediaParser.SeekMap adaptedSeekMap;

        public SeekMapAdapter(android.media.MediaParser.SeekMap seekMap) {
            this.adaptedSeekMap = seekMap;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return this.adaptedSeekMap.isSeekable();
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            long durationMicros = this.adaptedSeekMap.getDurationMicros();
            if (durationMicros != -2147483648L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
            android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> seekPoints = this.adaptedSeekMap.getSeekPoints(j);
            if (seekPoints.first == seekPoints.second) {
                return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(asExoPlayerSeekPoint((android.media.MediaParser.SeekPoint) seekPoints.first));
            }
            return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(asExoPlayerSeekPoint((android.media.MediaParser.SeekPoint) seekPoints.first), asExoPlayerSeekPoint((android.media.MediaParser.SeekPoint) seekPoints.second));
        }

        private static com.google.android.exoplayer2.extractor.SeekPoint asExoPlayerSeekPoint(android.media.MediaParser.SeekPoint seekPoint) {
            return new com.google.android.exoplayer2.extractor.SeekPoint(seekPoint.timeMicros, seekPoint.position);
        }
    }

    private static final class DataReaderAdapter implements com.google.android.exoplayer2.upstream.DataReader {
        public android.media.MediaParser.InputReader input;

        private DataReaderAdapter() {
        }

        @Override // com.google.android.exoplayer2.upstream.DataReader
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            return ((android.media.MediaParser.InputReader) com.google.android.exoplayer2.util.Util.castNonNull(this.input)).read(bArr, i, i2);
        }
    }
}
