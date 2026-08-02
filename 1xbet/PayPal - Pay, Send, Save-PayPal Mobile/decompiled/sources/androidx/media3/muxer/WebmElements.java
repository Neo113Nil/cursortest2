package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class WebmElements {
    private WebmElements() {
    }

    public static java.nio.ByteBuffer Camera2StreamConfigurationMap(long j, long j2) {
        return getHighResolutionOutputSizeshNQ4ISI(231L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(j2)));
    }

    public static java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor(int i, long j, boolean z, java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer highSpeedVideoSizes = androidx.media3.muxer.EbmlUtils.getHighSpeedVideoSizes(i);
        byte b = (byte) ((j >> 8) & 255);
        byte b2 = (byte) (j & 255);
        int i2 = z ? 128 : 0;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(highSpeedVideoSizes.remaining() + 3 + byteBuffer.remaining());
        allocate.put(highSpeedVideoSizes);
        allocate.put(b);
        allocate.put(b2);
        allocate.put((byte) i2);
        allocate.put(byteBuffer);
        allocate.flip();
        return getHighResolutionOutputSizeshNQ4ISI(163L, java.util.Collections.singletonList(allocate));
    }

    public static java.nio.ByteBuffer getHighSpeedVideoSizes() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(17030L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(1L))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(17143L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(1L))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(17138L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(4L))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(17139L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(8L))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(17026L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes("webm")))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(17031L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(2L))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(17029L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(2L))));
        return getHighResolutionOutputSizeshNQ4ISI(440786851L, arrayList);
    }

    public static java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor(long j, long j2, long j3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(getHighResolutionOutputSizeshNQ4ISI(21419L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(357149030L))));
        arrayList2.add(getHighResolutionOutputSizeshNQ4ISI(21420L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(j))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(19899L, arrayList2));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(getHighResolutionOutputSizeshNQ4ISI(21419L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(374648427L))));
        arrayList3.add(getHighResolutionOutputSizeshNQ4ISI(21420L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(j2))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(19899L, arrayList3));
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(getHighResolutionOutputSizeshNQ4ISI(21419L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(475249515L))));
        arrayList4.add(getHighResolutionOutputSizeshNQ4ISI(21420L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(j3))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(19899L, arrayList4));
        return getHighResolutionOutputSizeshNQ4ISI(290298740L, arrayList);
    }

    public static java.nio.ByteBuffer getHighSpeedVideoSizes(int i) {
        java.nio.ByteBuffer highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(236L);
        int remaining = highSpeedVideoFpsRanges.remaining();
        com.google.common.base.Preconditions.checkArgument(i >= 2);
        int i2 = i >= 9 ? 8 : 1;
        int i3 = (i - remaining) - i2;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i);
        allocate.put(highSpeedVideoFpsRanges);
        allocate.put(androidx.media3.muxer.EbmlUtils.Camera2StreamConfigurationMap(i3, i2));
        allocate.position(allocate.position() + i3);
        allocate.flip();
        return allocate;
    }

    public static java.nio.ByteBuffer getHighResolutionOutputSizeshNQ4ISI(float f) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(17545L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(f)))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(2807729L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(1000000L))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(19840L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME)))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(22337L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME)))));
        return getHighResolutionOutputSizeshNQ4ISI(357149030L, arrayList);
    }

    public static java.nio.ByteBuffer Camera2StreamConfigurationMap(long j, int i, long j2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(179L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(j))));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(getHighResolutionOutputSizeshNQ4ISI(247L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(i))));
        arrayList2.add(getHighResolutionOutputSizeshNQ4ISI(241L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(j2))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(183L, arrayList2));
        return getHighResolutionOutputSizeshNQ4ISI(187L, arrayList);
    }

    public static java.nio.ByteBuffer getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.media3.muxer.Track> list) {
        java.nio.ByteBuffer wrap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.muxer.Track track = list.get(i);
            int trackType = androidx.media3.common.MimeTypes.getTrackType(track.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType);
            if (trackType == 1) {
                int i2 = track.getHighSpeedVideoSizes;
                androidx.media3.common.Format format = track.getHighResolutionOutputSizeshNQ4ISI;
                java.util.List<java.nio.ByteBuffer> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(2, i2, 2, format);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(getHighResolutionOutputSizeshNQ4ISI(159L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(format.channelCount))));
                arrayList2.add(getHighResolutionOutputSizeshNQ4ISI(181L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(format.sampleRate)))));
                arrayList2.add(getHighResolutionOutputSizeshNQ4ISI(25188L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(format.pcmEncoding)))));
                if (((java.lang.String) com.google.common.base.Preconditions.checkNotNull(format.sampleMimeType)).equals(androidx.media3.common.MimeTypes.AUDIO_VORBIS)) {
                    wrap = androidx.media3.common.util.CodecSpecificDataUtil.getVorbisInitializationData(format);
                } else {
                    wrap = java.nio.ByteBuffer.wrap(format.initializationData.get(0));
                }
                java.nio.ByteBuffer highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(225L, arrayList2);
                java.nio.ByteBuffer highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(25506L, java.util.Collections.singletonList(wrap));
                highSpeedVideoFpsRangesFor.add(highResolutionOutputSizeshNQ4ISI);
                highSpeedVideoFpsRangesFor.add(highResolutionOutputSizeshNQ4ISI2);
                arrayList.add(getHighResolutionOutputSizeshNQ4ISI(174L, highSpeedVideoFpsRangesFor));
            } else if (trackType == 2) {
                int i3 = track.getHighSpeedVideoSizes;
                androidx.media3.common.Format format2 = track.getHighResolutionOutputSizeshNQ4ISI;
                java.util.List<java.nio.ByteBuffer> highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(1, i3, 1, format2);
                com.google.common.base.Preconditions.checkNotNull(format2.sampleMimeType);
                if (!format2.initializationData.isEmpty()) {
                    highSpeedVideoFpsRangesFor2.add(getHighResolutionOutputSizeshNQ4ISI(25506L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(format2.initializationData.get(0)))));
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(getHighResolutionOutputSizeshNQ4ISI(176L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(format2.width))));
                arrayList3.add(getHighResolutionOutputSizeshNQ4ISI(186L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(format2.height))));
                if (format2.colorInfo != null) {
                    androidx.media3.common.ColorInfo colorInfo = format2.colorInfo;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(getHighResolutionOutputSizeshNQ4ISI(21947L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(androidx.media3.common.ColorInfo.colorSpaceToIsoColorPrimaries(colorInfo.colorSpace)))));
                    arrayList4.add(getHighResolutionOutputSizeshNQ4ISI(21946L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(androidx.media3.common.ColorInfo.colorTransferToIsoTransferCharacteristics(colorInfo.colorTransfer)))));
                    arrayList4.add(getHighResolutionOutputSizeshNQ4ISI(21937L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(androidx.media3.common.ColorInfo.colorSpaceToIsoMatrixCoefficients(colorInfo.colorSpace)))));
                    arrayList4.add(getHighResolutionOutputSizeshNQ4ISI(21945L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(colorInfo.colorRange))));
                    byte[] bArr = colorInfo.hdrStaticInfo;
                    if (bArr != null && bArr.length == 25) {
                        java.nio.ByteBuffer order = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                        if (order.get() == 0) {
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21969L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(order.getShort() / 50000.0f)))));
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21970L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(order.getShort() / 50000.0f)))));
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21971L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(order.getShort() / 50000.0f)))));
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21972L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(order.getShort() / 50000.0f)))));
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21973L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(order.getShort() / 50000.0f)))));
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21974L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(order.getShort() / 50000.0f)))));
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21975L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(order.getShort() / 50000.0f)))));
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21976L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(order.getShort() / 50000.0f)))));
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21977L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(order.getShort())))));
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21978L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.toByteArray(order.getShort() * 1.0E-4f)))));
                            short s = order.getShort();
                            short s2 = order.getShort();
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21948L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(s))));
                            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(21949L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(s2))));
                            arrayList4.add(getHighResolutionOutputSizeshNQ4ISI(21968L, arrayList5));
                        }
                    }
                    arrayList3.add(getHighResolutionOutputSizeshNQ4ISI(21936L, arrayList4));
                }
                highSpeedVideoFpsRangesFor2.add(getHighResolutionOutputSizeshNQ4ISI(224L, arrayList3));
                arrayList.add(getHighResolutionOutputSizeshNQ4ISI(174L, highSpeedVideoFpsRangesFor2));
            } else {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Track MimeType %s is not supported in WebM.", track.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType));
            }
        }
        return getHighResolutionOutputSizeshNQ4ISI(374648427L, arrayList);
    }

    private static java.util.List<java.nio.ByteBuffer> getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, androidx.media3.common.Format format) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(215L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(i))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(29637L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(i2))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(156L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(0L))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(2274716L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes((java.lang.String) com.google.common.base.Preconditions.checkNotNull(format.language))))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(134L, java.util.Collections.singletonList(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes(getHighSpeedVideoFpsRangesFor((java.lang.String) com.google.common.base.Preconditions.checkNotNull(format.sampleMimeType)))))));
        arrayList.add(getHighResolutionOutputSizeshNQ4ISI(131L, java.util.Collections.singletonList(getHighSpeedVideoFpsRanges(i3))));
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1003765268:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_VORBIS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_OPUS)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_VP8)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_VP9)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return "A_VORBIS";
        }
        if (c == 1) {
            return "A_OPUS";
        }
        if (c == 2) {
            return "V_VP8";
        }
        if (c == 3) {
            return "V_VP9";
        }
        throw new java.lang.IllegalArgumentException("Unsupported mime type: ".concat(java.lang.String.valueOf(str)));
    }

    public static java.nio.ByteBuffer getHighSpeedVideoFpsRanges(long j) {
        int numberOfLeadingZeros = j == 0 ? 1 : (71 - java.lang.Long.numberOfLeadingZeros(j)) / 8;
        byte[] bArr = new byte[numberOfLeadingZeros];
        while (true) {
            numberOfLeadingZeros--;
            if (numberOfLeadingZeros >= 0) {
                bArr[numberOfLeadingZeros] = (byte) (255 & j);
                j >>>= 8;
            } else {
                return java.nio.ByteBuffer.wrap(bArr);
            }
        }
    }

    public static java.nio.ByteBuffer getHighResolutionOutputSizeshNQ4ISI(long j, java.util.List<java.nio.ByteBuffer> list) {
        java.util.Iterator<java.nio.ByteBuffer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().remaining();
        }
        java.nio.ByteBuffer highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(j);
        java.nio.ByteBuffer highSpeedVideoSizes = androidx.media3.muxer.EbmlUtils.getHighSpeedVideoSizes(i);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(highSpeedVideoFpsRanges.remaining() + highSpeedVideoSizes.remaining() + i);
        allocate.put(highSpeedVideoFpsRanges);
        allocate.put(highSpeedVideoSizes);
        java.util.Iterator<java.nio.ByteBuffer> it2 = list.iterator();
        while (it2.hasNext()) {
            allocate.put(it2.next());
        }
        allocate.flip();
        return allocate;
    }
}
