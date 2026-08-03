package androidx.media3.extractor.text;

/* loaded from: classes2.dex */
public class SubtitleExtractor implements androidx.media3.extractor.Extractor {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final int STATE_CREATED = 0;
    private static final int STATE_EXTRACTING = 2;
    private static final int STATE_FINISHED = 4;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 5;
    private static final int STATE_SEEKING = 3;
    private int bytesRead;
    private final androidx.media3.common.Format format;
    private final androidx.media3.extractor.text.SubtitleParser subtitleParser;
    private androidx.media3.extractor.TrackOutput trackOutput;
    private final androidx.media3.extractor.text.CueEncoder cueEncoder = new androidx.media3.extractor.text.CueEncoder();
    private byte[] subtitleData = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    private final androidx.media3.common.util.ParsableByteArray scratchSampleArray = new androidx.media3.common.util.ParsableByteArray();
    private final java.util.List<androidx.media3.extractor.text.SubtitleExtractor.Sample> samples = new java.util.ArrayList();
    private int state = 0;
    private long[] timestamps = androidx.media3.common.util.Util.EMPTY_LONG_ARRAY;
    private long seekTimeUs = -9223372036854775807L;

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ java.util.List getSniffFailureDetails() {
        java.util.List of;
        of = com.google.common.collect.ImmutableList.of();
        return of;
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ androidx.media3.extractor.Extractor getUnderlyingImplementation() {
        return androidx.media3.extractor.Extractor.CC.$default$getUnderlyingImplementation(this);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return true;
    }

    public SubtitleExtractor(androidx.media3.extractor.text.SubtitleParser subtitleParser, androidx.media3.common.Format format) {
        this.subtitleParser = subtitleParser;
        this.format = format.buildUpon().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_MEDIA3_CUES).setCodecs(format.sampleMimeType).setCueReplacementBehavior(subtitleParser.getCueReplacementBehavior()).build();
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        androidx.media3.common.util.Assertions.checkState(this.state == 0);
        androidx.media3.extractor.TrackOutput track = extractorOutput.track(0, 3);
        this.trackOutput = track;
        track.format(this.format);
        extractorOutput.endTracks();
        extractorOutput.seekMap(new androidx.media3.extractor.IndexSeekMap(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.state = 1;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int i = this.state;
        androidx.media3.common.util.Assertions.checkState((i == 0 || i == 5) ? false : true);
        if (this.state == 1) {
            int checkedCast = extractorInput.getLength() != -1 ? com.google.common.primitives.Ints.checkedCast(extractorInput.getLength()) : 1024;
            if (checkedCast > this.subtitleData.length) {
                this.subtitleData = new byte[checkedCast];
            }
            this.bytesRead = 0;
            this.state = 2;
        }
        if (this.state == 2 && readFromInput(extractorInput)) {
            parseAndWriteToOutput();
            this.state = 4;
        }
        if (this.state == 3 && skipInput(extractorInput)) {
            writeToOutput();
            this.state = 4;
        }
        return this.state == 4 ? -1 : 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        int i = this.state;
        androidx.media3.common.util.Assertions.checkState((i == 0 || i == 5) ? false : true);
        this.seekTimeUs = j2;
        if (this.state == 2) {
            this.state = 1;
        }
        if (this.state == 4) {
            this.state = 3;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        if (this.state == 5) {
            return;
        }
        this.subtitleParser.reset();
        this.state = 5;
    }

    private boolean skipInput(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return extractorInput.skip((extractorInput.getLength() > (-1L) ? 1 : (extractorInput.getLength() == (-1L) ? 0 : -1)) != 0 ? com.google.common.primitives.Ints.checkedCast(extractorInput.getLength()) : 1024) == -1;
    }

    private boolean readFromInput(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        byte[] bArr = this.subtitleData;
        if (bArr.length == this.bytesRead) {
            this.subtitleData = java.util.Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.subtitleData;
        int i = this.bytesRead;
        int read = extractorInput.read(bArr2, i, bArr2.length - i);
        if (read != -1) {
            this.bytesRead += read;
        }
        long length = extractorInput.getLength();
        return (length != -1 && ((long) this.bytesRead) == length) || read == -1;
    }

    private void parseAndWriteToOutput() throws java.io.IOException {
        androidx.media3.extractor.text.SubtitleParser.OutputOptions allCues;
        try {
            long j = this.seekTimeUs;
            if (j != -9223372036854775807L) {
                allCues = androidx.media3.extractor.text.SubtitleParser.OutputOptions.cuesAfterThenRemainingCuesBefore(j);
            } else {
                allCues = androidx.media3.extractor.text.SubtitleParser.OutputOptions.allCues();
            }
            this.subtitleParser.parse(this.subtitleData, 0, this.bytesRead, allCues, new androidx.media3.common.util.Consumer() { // from class: androidx.media3.extractor.text.SubtitleExtractor$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    androidx.media3.extractor.text.SubtitleExtractor.this.m4915xdbba10ad((androidx.media3.extractor.text.CuesWithTiming) obj);
                }
            });
            java.util.Collections.sort(this.samples);
            this.timestamps = new long[this.samples.size()];
            for (int i = 0; i < this.samples.size(); i++) {
                this.timestamps[i] = this.samples.get(i).timeUs;
            }
            this.subtitleData = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        } catch (java.lang.RuntimeException e) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("SubtitleParser failed.", e);
        }
    }

    /* renamed from: lambda$parseAndWriteToOutput$0$androidx-media3-extractor-text-SubtitleExtractor, reason: not valid java name */
    /* synthetic */ void m4915xdbba10ad(androidx.media3.extractor.text.CuesWithTiming cuesWithTiming) {
        androidx.media3.extractor.text.SubtitleExtractor.Sample sample = new androidx.media3.extractor.text.SubtitleExtractor.Sample(cuesWithTiming.startTimeUs, this.cueEncoder.encode(cuesWithTiming.cues, cuesWithTiming.durationUs));
        this.samples.add(sample);
        if (this.seekTimeUs == -9223372036854775807L || cuesWithTiming.startTimeUs >= this.seekTimeUs) {
            writeToOutput(sample);
        }
    }

    private void writeToOutput() {
        long j = this.seekTimeUs;
        for (int binarySearchFloor = j == -9223372036854775807L ? 0 : androidx.media3.common.util.Util.binarySearchFloor(this.timestamps, j, true, true); binarySearchFloor < this.samples.size(); binarySearchFloor++) {
            writeToOutput(this.samples.get(binarySearchFloor));
        }
    }

    private void writeToOutput(androidx.media3.extractor.text.SubtitleExtractor.Sample sample) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.trackOutput);
        int length = sample.data.length;
        this.scratchSampleArray.reset(sample.data);
        this.trackOutput.sampleData(this.scratchSampleArray, length);
        this.trackOutput.sampleMetadata(sample.timeUs, 1, length, 0, null);
    }

    private static class Sample implements java.lang.Comparable<androidx.media3.extractor.text.SubtitleExtractor.Sample> {
        private final byte[] data;
        private final long timeUs;

        private Sample(long j, byte[] bArr) {
            this.timeUs = j;
            this.data = bArr;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.extractor.text.SubtitleExtractor.Sample sample) {
            return java.lang.Long.compare(this.timeUs, sample.timeUs);
        }
    }
}
