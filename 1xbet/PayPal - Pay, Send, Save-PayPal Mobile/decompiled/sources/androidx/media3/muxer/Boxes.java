package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class Boxes {
    public static final com.google.common.collect.ImmutableList<java.lang.Byte> getHighSpeedVideoSizes = com.google.common.collect.ImmutableList.of((byte) -66, (byte) 122, java.lang.Byte.valueOf(com.visa.cbp.getEncExpo.kernelVersion), (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, java.lang.Byte.valueOf(com.visa.cbp.getEncExpo.registerForActivityResult), (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);

    public static int Camera2StreamConfigurationMap(int i, boolean z) {
        return ((z ? 4 : 3) * i * 4) + 12;
    }

    private Boxes() {
    }

    public static java.nio.ByteBuffer getHighSpeedVideoFpsRanges(java.util.List<androidx.media3.muxer.Track> list, androidx.media3.muxer.MetadataCollector metadataCollector, boolean z, int i) {
        java.nio.ByteBuffer highSpeedVideoFpsRangesFor;
        java.nio.ByteBuffer highSpeedVideoFpsRanges;
        long j;
        int i2;
        int i3;
        long j2;
        int i4;
        int i5;
        java.nio.ByteBuffer allocate;
        java.nio.ByteBuffer highSpeedVideoFpsRangesFor2;
        int i6;
        java.nio.ByteBuffer highSpeedVideoFpsRangesFor3;
        java.nio.ByteBuffer highSpeedVideoFpsRanges2;
        java.lang.String str;
        java.lang.String str2;
        androidx.media3.muxer.MetadataCollector metadataCollector2;
        int i7;
        int i8;
        byte[] byteArray;
        java.nio.ByteBuffer allocate2;
        short s;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.nio.ByteBuffer allocate3;
        java.nio.ByteBuffer highSpeedVideoFpsRangesFor4;
        java.util.List<java.lang.Integer> list2;
        java.util.List<androidx.media3.muxer.Track> list3 = list;
        androidx.media3.muxer.MetadataCollector metadataCollector3 = metadataCollector;
        int i9 = (int) metadataCollector3.getHighSpeedVideoSizes.creationTimestampSeconds;
        int i10 = (int) metadataCollector3.getHighSpeedVideoSizes.modificationTimestampSeconds;
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < list.size(); i11++) {
            androidx.media3.muxer.Track track = list3.get(i11);
            if (!track.getOutputMinFrameDurationlomOqCM.isEmpty()) {
                j3 = java.lang.Math.min(track.getOutputMinFrameDurationlomOqCM.get(0).presentationTimeUs, j3);
            }
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = -9223372036854775807L;
        }
        if (!z && j3 == androidx.media3.common.C.TIME_UNSET) {
            return java.nio.ByteBuffer.allocate(0);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int i12 = 0;
        int i13 = 1;
        long j4 = 0;
        while (i12 < list.size()) {
            androidx.media3.muxer.Track track2 = list3.get(i12);
            if (z || !track2.getOutputMinFrameDurationlomOqCM.isEmpty()) {
                androidx.media3.common.Format format = track2.getHighResolutionOutputSizeshNQ4ISI;
                if (java.util.Objects.equals(track2.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_AV1) && format.initializationData.isEmpty()) {
                    format = format.buildUpon().setInitializationData(com.google.common.collect.ImmutableList.of((byte[]) com.google.common.base.Preconditions.checkNotNull(track2.getHighSpeedVideoFpsRangesFor))).build();
                }
                java.lang.String str3 = format.language;
                if (str3 == null) {
                    str3 = null;
                } else {
                    java.util.Locale forLanguageTag = java.util.Locale.forLanguageTag(str3);
                    if (!forLanguageTag.getISO3Language().isEmpty()) {
                        str3 = forLanguageTag.getISO3Language();
                    }
                }
                java.util.List<androidx.media3.muxer.BufferInfo> list4 = track2.getOutputMinFrameDurationlomOqCM;
                if (androidx.media3.common.MimeTypes.isAudio(track2.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType)) {
                    i2 = track2.getHighResolutionOutputSizeshNQ4ISI.sampleRate;
                    j = j4;
                } else {
                    j = j4;
                    i2 = 90000;
                }
                i3 = i12;
                java.util.List<java.lang.Integer> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(list4, i2, i, track2.Camera2StreamConfigurationMap);
                int i14 = 0;
                long j5 = 0;
                while (i14 < highResolutionOutputSizeshNQ4ISI.size()) {
                    j5 += highResolutionOutputSizeshNQ4ISI.get(i14).intValue();
                    i14++;
                    arrayList3 = arrayList3;
                    arrayList4 = arrayList4;
                }
                java.util.ArrayList arrayList5 = arrayList3;
                java.util.ArrayList arrayList6 = arrayList4;
                long j6 = track2.getOutputMinFrameDurationlomOqCM.isEmpty() ? 0L : track2.getOutputMinFrameDurationlomOqCM.get(0).presentationTimeUs;
                if (androidx.media3.common.MimeTypes.isAudio(track2.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType)) {
                    i4 = track2.getHighResolutionOutputSizeshNQ4ISI.sampleRate;
                    j2 = j3;
                } else {
                    j2 = j3;
                    i4 = 90000;
                }
                long scaleLargeValue = androidx.media3.common.util.Util.scaleLargeValue(j5, 1000000L, i4, java.math.RoundingMode.HALF_UP);
                if (j6 < 0) {
                    scaleLargeValue -= java.lang.Math.abs(j6);
                }
                int trackType = androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType);
                java.lang.String str4 = str3;
                java.nio.ByteBuffer allocate4 = java.nio.ByteBuffer.allocate((highResolutionOutputSizeshNQ4ISI.size() * 8) + 200);
                allocate4.putInt(0);
                long j7 = j5;
                int position = allocate4.position();
                allocate4.putInt(0);
                long j8 = -1;
                long j9 = j6;
                int i15 = -1;
                int i16 = 0;
                int i17 = 0;
                while (i17 < highResolutionOutputSizeshNQ4ISI.size()) {
                    int intValue = highResolutionOutputSizeshNQ4ISI.get(i17).intValue();
                    long j10 = scaleLargeValue;
                    long j11 = intValue;
                    if (j8 != j11) {
                        i15 = allocate4.position();
                        allocate4.putInt(1);
                        allocate4.putInt(intValue);
                        i16++;
                        j8 = j11;
                    } else {
                        allocate4.putInt(i15, allocate4.getInt(i15) + 1);
                    }
                    i17++;
                    scaleLargeValue = j10;
                }
                long j12 = scaleLargeValue;
                allocate4.putInt(position, i16);
                allocate4.flip();
                java.nio.ByteBuffer highSpeedVideoFpsRangesFor5 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("stts", allocate4);
                if (!androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType)) {
                    i5 = 0;
                    allocate = java.nio.ByteBuffer.allocate(0);
                } else {
                    java.util.List<java.lang.Integer> highSpeedVideoFpsRangesFor6 = getHighSpeedVideoFpsRangesFor(track2.getOutputMinFrameDurationlomOqCM, highResolutionOutputSizeshNQ4ISI, androidx.media3.common.MimeTypes.isAudio(track2.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType) ? track2.getHighResolutionOutputSizeshNQ4ISI.sampleRate : 90000);
                    if (highSpeedVideoFpsRangesFor6.isEmpty()) {
                        highSpeedVideoFpsRangesFor4 = java.nio.ByteBuffer.allocate(0);
                    } else {
                        java.nio.ByteBuffer allocate5 = java.nio.ByteBuffer.allocate((highSpeedVideoFpsRangesFor6.size() * 8) + 8);
                        allocate5.putInt(16777216);
                        int position2 = allocate5.position();
                        allocate5.putInt(0);
                        int i18 = 0;
                        int i19 = 0;
                        int i20 = -1;
                        int i21 = -1;
                        while (i18 < highSpeedVideoFpsRangesFor6.size()) {
                            int intValue2 = highSpeedVideoFpsRangesFor6.get(i18).intValue();
                            if (i20 != intValue2) {
                                int position3 = allocate5.position();
                                allocate5.putInt(1);
                                allocate5.putInt(intValue2);
                                i19++;
                                list2 = highSpeedVideoFpsRangesFor6;
                                i21 = position3;
                                i20 = intValue2;
                            } else {
                                list2 = highSpeedVideoFpsRangesFor6;
                                allocate5.putInt(i21, allocate5.getInt(i21) + 1);
                            }
                            i18++;
                            highSpeedVideoFpsRangesFor6 = list2;
                        }
                        allocate5.putInt(position2, i19);
                        allocate5.flip();
                        highSpeedVideoFpsRangesFor4 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("ctts", allocate5);
                    }
                    allocate = highSpeedVideoFpsRangesFor4;
                    i5 = 0;
                }
                java.util.List<androidx.media3.muxer.BufferInfo> list5 = track2.getOutputMinFrameDurationlomOqCM;
                java.nio.ByteBuffer allocate6 = java.nio.ByteBuffer.allocate((list5.size() * 4) + 200);
                allocate6.putInt(i5);
                allocate6.putInt(i5);
                allocate6.putInt(list5.size());
                for (int i22 = 0; i22 < list5.size(); i22++) {
                    allocate6.putInt(list5.get(i22).size);
                }
                allocate6.flip();
                java.nio.ByteBuffer highSpeedVideoFpsRangesFor7 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("stsz", allocate6);
                java.util.List<java.lang.Integer> list6 = track2.getOutputFormats;
                java.nio.ByteBuffer allocate7 = java.nio.ByteBuffer.allocate((list6.size() * 12) + 200);
                allocate7.putInt(0);
                int position4 = allocate7.position();
                allocate7.putInt(0);
                int i23 = i10;
                int i24 = i13;
                int i25 = 1;
                int i26 = -1;
                int i27 = 0;
                for (int i28 = 0; i28 < list6.size(); i28++) {
                    int intValue3 = list6.get(i28).intValue();
                    if (intValue3 != i26) {
                        allocate7.putInt(i25);
                        allocate7.putInt(intValue3);
                        allocate7.putInt(1);
                        i27++;
                        i26 = intValue3;
                    }
                    i25++;
                }
                allocate7.putInt(position4, i27);
                allocate7.flip();
                java.nio.ByteBuffer highSpeedVideoFpsRangesFor8 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("stsc", allocate7);
                java.util.List<java.lang.Long> list7 = track2.getHighSpeedVideoSizesFor;
                if (z) {
                    java.nio.ByteBuffer allocate8 = java.nio.ByteBuffer.allocate((list7.size() * 4) + 8);
                    allocate8.putInt(0);
                    allocate8.putInt(list7.size());
                    for (int i29 = 0; i29 < list7.size(); i29++) {
                        long longValue = list7.get(i29).longValue();
                        com.google.common.base.Preconditions.checkState(longValue <= 4294967295L, "Only 32-bit chunk offset is allowed");
                        allocate8.putInt((int) longValue);
                    }
                    allocate8.flip();
                    highSpeedVideoFpsRangesFor2 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("stco", allocate8);
                } else {
                    java.nio.ByteBuffer allocate9 = java.nio.ByteBuffer.allocate((list7.size() * 8) + 8);
                    allocate9.putInt(0);
                    allocate9.putInt(list7.size());
                    for (int i30 = 0; i30 < list7.size(); i30++) {
                        allocate9.putLong(list7.get(i30).longValue());
                    }
                    allocate9.flip();
                    highSpeedVideoFpsRangesFor2 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("co64", allocate9);
                }
                if (trackType == -1 || trackType == 5) {
                    i6 = i9;
                    java.nio.ByteBuffer allocate10 = java.nio.ByteBuffer.allocate(200);
                    allocate10.putInt(0);
                    allocate10.flip();
                    highSpeedVideoFpsRangesFor3 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("nmhd", allocate10);
                    java.nio.ByteBuffer allocate11 = java.nio.ByteBuffer.allocate(200);
                    byte[] utf8Bytes = androidx.media3.common.util.Util.getUtf8Bytes((java.lang.String) com.google.common.base.Preconditions.checkNotNull(format.sampleMimeType));
                    allocate11.put(utf8Bytes);
                    allocate11.put((byte) 0);
                    allocate11.put(utf8Bytes);
                    allocate11.put((byte) 0);
                    allocate11.flip();
                    highSpeedVideoFpsRanges2 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("stbl", java.util.Arrays.asList(getHighSpeedVideoSizes(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("mett", allocate11)), highSpeedVideoFpsRangesFor5, highSpeedVideoFpsRangesFor7, highSpeedVideoFpsRangesFor8, highSpeedVideoFpsRangesFor2));
                    str = com.adjust.sdk.Constants.REFERRER_API_META;
                    str2 = "MetaHandle";
                } else if (trackType != 1) {
                    if (trackType != 2) {
                        throw new java.lang.IllegalArgumentException("Unsupported track type");
                    }
                    java.nio.ByteBuffer allocate12 = java.nio.ByteBuffer.allocate(200);
                    allocate12.putInt(0);
                    allocate12.putShort((short) 0);
                    allocate12.putShort((short) 0);
                    allocate12.putShort((short) 0);
                    allocate12.putShort((short) 0);
                    allocate12.flip();
                    java.nio.ByteBuffer highSpeedVideoFpsRangesFor9 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("vmhd", allocate12);
                    java.nio.ByteBuffer Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(format);
                    java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(format);
                    java.nio.ByteBuffer allocate13 = java.nio.ByteBuffer.allocate(Camera2StreamConfigurationMap.limit() + 200);
                    allocate13.putInt(0);
                    allocate13.putShort((short) 0);
                    allocate13.putShort((short) 1);
                    allocate13.putShort((short) 0);
                    allocate13.putShort((short) 0);
                    allocate13.putInt(0);
                    allocate13.putInt(0);
                    allocate13.putInt(0);
                    allocate13.putShort(format.width != -1 ? (short) format.width : (short) 0);
                    allocate13.putShort(format.height != -1 ? (short) format.height : (short) 0);
                    allocate13.putInt(4718592);
                    allocate13.putInt(4718592);
                    allocate13.putInt(0);
                    allocate13.putShort((short) 1);
                    allocate13.putLong(0L);
                    allocate13.putLong(0L);
                    allocate13.putLong(0L);
                    allocate13.putLong(0L);
                    allocate13.putShort((short) 24);
                    allocate13.putShort((short) -1);
                    allocate13.put(Camera2StreamConfigurationMap);
                    if (format.colorInfo != null && highSpeedVideoSizes.equals("vp09")) {
                        byte[] bArr = format.colorInfo.hdrStaticInfo;
                        if (bArr != null) {
                            java.nio.ByteBuffer allocate14 = java.nio.ByteBuffer.allocate(200);
                            allocate14.putInt(0);
                            allocate14.put(bArr);
                            allocate14.flip();
                            allocate3 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("SmDm", allocate14);
                        } else {
                            allocate3 = java.nio.ByteBuffer.allocate(0);
                        }
                        allocate13.put(allocate3);
                    }
                    java.nio.ByteBuffer allocate15 = java.nio.ByteBuffer.allocate(8);
                    allocate15.putInt(65536);
                    allocate15.putInt(65536);
                    allocate15.rewind();
                    allocate13.put(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("pasp", allocate15));
                    if (format.colorInfo != null) {
                        androidx.media3.common.ColorInfo colorInfo = format.colorInfo;
                        java.nio.ByteBuffer allocate16 = java.nio.ByteBuffer.allocate(20);
                        allocate16.put((byte) 110);
                        allocate16.put((byte) 99);
                        allocate16.put((byte) 108);
                        allocate16.put((byte) 120);
                        short colorSpaceToIsoColorPrimaries = (short) androidx.media3.common.ColorInfo.colorSpaceToIsoColorPrimaries(colorInfo.colorSpace);
                        short colorTransferToIsoTransferCharacteristics = (short) androidx.media3.common.ColorInfo.colorTransferToIsoTransferCharacteristics(colorInfo.colorTransfer);
                        i6 = i9;
                        short colorSpaceToIsoMatrixCoefficients = (short) androidx.media3.common.ColorInfo.colorSpaceToIsoMatrixCoefficients(colorInfo.colorSpace);
                        byte b = colorInfo.colorRange == 1 ? Byte.MIN_VALUE : (byte) 0;
                        allocate16.putShort(colorSpaceToIsoColorPrimaries);
                        allocate16.putShort(colorTransferToIsoTransferCharacteristics);
                        allocate16.putShort(colorSpaceToIsoMatrixCoefficients);
                        allocate16.put(b);
                        allocate16.flip();
                        allocate13.put(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("colr", allocate16));
                    } else {
                        i6 = i9;
                    }
                    allocate13.flip();
                    java.nio.ByteBuffer[] byteBufferArr = new java.nio.ByteBuffer[7];
                    byteBufferArr[0] = getHighSpeedVideoSizes(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, allocate13));
                    byteBufferArr[1] = highSpeedVideoFpsRangesFor5;
                    byteBufferArr[2] = allocate;
                    byteBufferArr[3] = highSpeedVideoFpsRangesFor7;
                    byteBufferArr[4] = highSpeedVideoFpsRangesFor8;
                    byteBufferArr[5] = highSpeedVideoFpsRangesFor2;
                    java.util.List<androidx.media3.muxer.BufferInfo> list8 = track2.getOutputMinFrameDurationlomOqCM;
                    java.nio.ByteBuffer allocate17 = java.nio.ByteBuffer.allocate((list8.size() * 4) + 200);
                    allocate17.putInt(0);
                    int position5 = allocate17.position();
                    allocate17.putInt(list8.size());
                    int i31 = 1;
                    int i32 = 0;
                    for (int i33 = 0; i33 < list8.size(); i33++) {
                        if ((list8.get(i33).flags & 1) > 0) {
                            allocate17.putInt(i31);
                            i32++;
                        }
                        i31++;
                    }
                    allocate17.putInt(position5, i32);
                    allocate17.flip();
                    byteBufferArr[6] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("stss", allocate17);
                    highSpeedVideoFpsRanges2 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("stbl", java.util.Arrays.asList(byteBufferArr));
                    str = "vide";
                    str2 = "VideoHandle";
                    highSpeedVideoFpsRangesFor3 = highSpeedVideoFpsRangesFor9;
                } else {
                    i6 = i9;
                    java.nio.ByteBuffer allocate18 = java.nio.ByteBuffer.allocate(200);
                    allocate18.putInt(0);
                    allocate18.putShort((short) 0);
                    allocate18.putShort((short) 0);
                    allocate18.flip();
                    highSpeedVideoFpsRangesFor3 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("smhd", allocate18);
                    java.lang.String highSpeedVideoSizes2 = getHighSpeedVideoSizes(format);
                    java.nio.ByteBuffer Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(format);
                    java.nio.ByteBuffer allocate19 = java.nio.ByteBuffer.allocate(Camera2StreamConfigurationMap2.remaining() + 200);
                    allocate19.putInt(0);
                    allocate19.putShort((short) 0);
                    allocate19.putShort((short) 1);
                    allocate19.putInt(0);
                    allocate19.putInt(0);
                    allocate19.putShort((short) format.channelCount);
                    allocate19.putShort((short) 16);
                    allocate19.putShort((short) 0);
                    allocate19.putShort((short) 0);
                    allocate19.putInt(format.sampleRate << 16);
                    allocate19.put(Camera2StreamConfigurationMap2);
                    allocate19.flip();
                    highSpeedVideoFpsRanges2 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("stbl", java.util.Arrays.asList(getHighSpeedVideoSizes(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes2, allocate19)), highSpeedVideoFpsRangesFor5, highSpeedVideoFpsRangesFor7, highSpeedVideoFpsRangesFor8, highSpeedVideoFpsRangesFor2));
                    str = "soun";
                    str2 = "SoundHandle";
                }
                java.nio.ByteBuffer[] byteBufferArr2 = new java.nio.ByteBuffer[3];
                metadataCollector2 = metadataCollector;
                int i34 = metadataCollector2.getHighSpeedVideoFpsRanges.orientation;
                java.nio.ByteBuffer allocate20 = java.nio.ByteBuffer.allocate(200);
                allocate20.putInt(7);
                i7 = i6;
                allocate20.putInt(i7);
                i8 = i23;
                allocate20.putInt(i8);
                allocate20.putInt(i24);
                allocate20.putInt(0);
                allocate20.putInt((int) androidx.media3.common.util.Util.scaleLargeValue(j12, 10000L, 1000000L, java.math.RoundingMode.HALF_UP));
                allocate20.putInt(0);
                allocate20.putInt(0);
                allocate20.putInt(0);
                allocate20.putShort(androidx.media3.common.MimeTypes.isAudio(format.sampleMimeType) ? com.visa.cbp.getEncExpo.initializeViewTreeOwners : (short) 0);
                allocate20.putShort((short) 0);
                if (i34 == 0) {
                    byteArray = androidx.media3.common.util.Util.toByteArray(65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824);
                } else if (i34 == 90) {
                    byteArray = androidx.media3.common.util.Util.toByteArray(0, 65536, 0, androidx.core.internal.view.SupportMenu.CATEGORY_MASK, 0, 0, 0, 0, 1073741824);
                } else if (i34 == 180) {
                    byteArray = androidx.media3.common.util.Util.toByteArray(androidx.core.internal.view.SupportMenu.CATEGORY_MASK, 0, 0, 0, androidx.core.internal.view.SupportMenu.CATEGORY_MASK, 0, 0, 0, 1073741824);
                } else if (i34 == 270) {
                    byteArray = androidx.media3.common.util.Util.toByteArray(0, androidx.core.internal.view.SupportMenu.CATEGORY_MASK, 0, 65536, 0, 0, 0, 0, 1073741824);
                } else {
                    throw new java.lang.IllegalArgumentException("invalid orientation ".concat(java.lang.String.valueOf(i34)));
                }
                allocate20.put(byteArray);
                int i35 = format.width != -1 ? format.width : 0;
                int i36 = format.height != -1 ? format.height : 0;
                allocate20.putInt(i35 << 16);
                allocate20.putInt(i36 << 16);
                allocate20.flip();
                byteBufferArr2[0] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("tkhd", allocate20);
                long j13 = androidx.media3.common.MimeTypes.isAudio(track2.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType) ? track2.getHighResolutionOutputSizeshNQ4ISI.sampleRate : 90000;
                if (j2 > 0) {
                    j9 -= j2;
                }
                if (j9 == 0) {
                    allocate2 = java.nio.ByteBuffer.allocate(0);
                } else {
                    java.nio.ByteBuffer allocate21 = java.nio.ByteBuffer.allocate(50);
                    allocate21.putInt(16777216);
                    if (j9 > 0) {
                        allocate21.putInt(2);
                        allocate21.put(getHighSpeedVideoSizes(androidx.media3.common.util.Util.scaleLargeValue(j9, 10000L, 1000000L, java.math.RoundingMode.HALF_UP), -1L));
                        allocate21.put(getHighSpeedVideoSizes(androidx.media3.common.util.Util.scaleLargeValue(j12, 10000L, 1000000L, java.math.RoundingMode.HALF_UP), 0L));
                    } else {
                        allocate21.putInt(1);
                        allocate21.put(getHighSpeedVideoSizes(androidx.media3.common.util.Util.scaleLargeValue(j12, 10000L, 1000000L, java.math.RoundingMode.HALF_UP), androidx.media3.common.util.Util.scaleLargeValue(java.lang.Math.abs(j9), j13, 1000000L, java.math.RoundingMode.HALF_UP)));
                    }
                    allocate21.flip();
                    allocate2 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("edts", androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("elst", allocate21));
                }
                byteBufferArr2[1] = allocate2;
                java.nio.ByteBuffer[] byteBufferArr3 = new java.nio.ByteBuffer[3];
                int i37 = androidx.media3.common.MimeTypes.isAudio(track2.getHighResolutionOutputSizeshNQ4ISI.sampleMimeType) ? track2.getHighResolutionOutputSizeshNQ4ISI.sampleRate : 90000;
                java.nio.ByteBuffer allocate22 = java.nio.ByteBuffer.allocate(200);
                allocate22.putInt(0);
                allocate22.putInt(i7);
                allocate22.putInt(i8);
                allocate22.putInt(i37);
                allocate22.putInt((int) j7);
                if (str4 != null) {
                    byte[] utf8Bytes2 = androidx.media3.common.util.Util.getUtf8Bytes(str4);
                    if (utf8Bytes2.length == 3) {
                        s = (short) (((utf8Bytes2[2] & com.google.common.base.Ascii.US) + ((utf8Bytes2[1] & com.google.common.base.Ascii.US) << 5) + ((utf8Bytes2[0] & com.google.common.base.Ascii.US) << 10)) & 32767);
                        allocate22.putShort(s);
                        allocate22.putShort((short) 0);
                        allocate22.flip();
                        byteBufferArr3[0] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("mdhd", allocate22);
                        byteBufferArr3[1] = Camera2StreamConfigurationMap(str, str2);
                        java.nio.ByteBuffer allocate23 = java.nio.ByteBuffer.allocate(4);
                        allocate23.putInt(1);
                        allocate23.flip();
                        java.nio.ByteBuffer[] byteBufferArr4 = {androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("url ", allocate23)};
                        java.nio.ByteBuffer allocate24 = java.nio.ByteBuffer.allocate(8);
                        allocate24.putInt(0);
                        allocate24.putInt(1);
                        allocate24.flip();
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(allocate24);
                        java.util.Collections.addAll(arrayList7, byteBufferArr4);
                        byteBufferArr3[2] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("minf", java.util.Arrays.asList(highSpeedVideoFpsRangesFor3, androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("dinf", androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("dref", arrayList7)), highSpeedVideoFpsRanges2));
                        byteBufferArr2[2] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("mdia", java.util.Arrays.asList(byteBufferArr3));
                        arrayList = arrayList5;
                        arrayList.add(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("trak", java.util.Arrays.asList(byteBufferArr2)));
                        j4 = java.lang.Math.max(j, j12);
                        java.nio.ByteBuffer allocate25 = java.nio.ByteBuffer.allocate(24);
                        allocate25.putInt(0);
                        allocate25.putInt(i24);
                        allocate25.putInt(1);
                        allocate25.putInt(0);
                        allocate25.putInt(0);
                        allocate25.putInt(0);
                        allocate25.flip();
                        arrayList2 = arrayList6;
                        arrayList2.add(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("trex", allocate25));
                        i13 = i24 + 1;
                    }
                }
                s = 0;
                allocate22.putShort(s);
                allocate22.putShort((short) 0);
                allocate22.flip();
                byteBufferArr3[0] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("mdhd", allocate22);
                byteBufferArr3[1] = Camera2StreamConfigurationMap(str, str2);
                java.nio.ByteBuffer allocate232 = java.nio.ByteBuffer.allocate(4);
                allocate232.putInt(1);
                allocate232.flip();
                java.nio.ByteBuffer[] byteBufferArr42 = {androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("url ", allocate232)};
                java.nio.ByteBuffer allocate242 = java.nio.ByteBuffer.allocate(8);
                allocate242.putInt(0);
                allocate242.putInt(1);
                allocate242.flip();
                java.util.ArrayList arrayList72 = new java.util.ArrayList();
                arrayList72.add(allocate242);
                java.util.Collections.addAll(arrayList72, byteBufferArr42);
                byteBufferArr3[2] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("minf", java.util.Arrays.asList(highSpeedVideoFpsRangesFor3, androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("dinf", androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("dref", arrayList72)), highSpeedVideoFpsRanges2));
                byteBufferArr2[2] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("mdia", java.util.Arrays.asList(byteBufferArr3));
                arrayList = arrayList5;
                arrayList.add(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("trak", java.util.Arrays.asList(byteBufferArr2)));
                j4 = java.lang.Math.max(j, j12);
                java.nio.ByteBuffer allocate252 = java.nio.ByteBuffer.allocate(24);
                allocate252.putInt(0);
                allocate252.putInt(i24);
                allocate252.putInt(1);
                allocate252.putInt(0);
                allocate252.putInt(0);
                allocate252.putInt(0);
                allocate252.flip();
                arrayList2 = arrayList6;
                arrayList2.add(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("trex", allocate252));
                i13 = i24 + 1;
            } else {
                i7 = i9;
                arrayList2 = arrayList4;
                j2 = j3;
                i3 = i12;
                i8 = i10;
                metadataCollector2 = metadataCollector3;
                arrayList = arrayList3;
            }
            i12 = i3 + 1;
            list3 = list;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            metadataCollector3 = metadataCollector2;
            i9 = i7;
            i10 = i8;
            j3 = j2;
        }
        int i38 = i9;
        int i39 = i10;
        java.util.ArrayList arrayList8 = arrayList4;
        int i40 = i13;
        androidx.media3.muxer.MetadataCollector metadataCollector4 = metadataCollector3;
        java.util.ArrayList arrayList9 = arrayList3;
        java.nio.ByteBuffer allocate26 = java.nio.ByteBuffer.allocate(200);
        allocate26.putInt(0);
        allocate26.putInt(i38);
        allocate26.putInt(i39);
        allocate26.putInt(10000);
        allocate26.putInt((int) androidx.media3.common.util.Util.scaleLargeValue(j4, 10000L, 1000000L, java.math.RoundingMode.HALF_UP));
        allocate26.putInt(65536);
        allocate26.putShort(com.visa.cbp.getEncExpo.initializeViewTreeOwners);
        allocate26.putShort((short) 0);
        allocate26.putInt(0);
        allocate26.putInt(0);
        int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
        for (int i41 = 0; i41 < 9; i41++) {
            allocate26.putInt(iArr[i41]);
        }
        for (int i42 = 0; i42 < 6; i42++) {
            allocate26.putInt(0);
        }
        allocate26.putInt(i40);
        allocate26.flip();
        java.nio.ByteBuffer highSpeedVideoFpsRangesFor10 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("mvhd", allocate26);
        androidx.media3.container.Mp4LocationData mp4LocationData = metadataCollector4.getHighResolutionOutputSizeshNQ4ISI;
        if (mp4LocationData == null) {
            highSpeedVideoFpsRangesFor = java.nio.ByteBuffer.allocate(0);
        } else {
            java.lang.String formatInvariant = androidx.media3.common.util.Util.formatInvariant("%+.4f%+.4f/", java.lang.Float.valueOf(mp4LocationData.latitude), java.lang.Float.valueOf(mp4LocationData.longitude));
            java.nio.ByteBuffer allocate27 = java.nio.ByteBuffer.allocate(formatInvariant.length() + 4);
            allocate27.putShort((short) (allocate27.capacity() - 4));
            allocate27.putShort((short) 5575);
            allocate27.put(androidx.media3.common.util.Util.getUtf8Bytes(formatInvariant));
            com.google.common.base.Preconditions.checkState(allocate27.limit() == allocate27.capacity());
            allocate27.flip();
            highSpeedVideoFpsRangesFor = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("udta", androidx.media3.muxer.BoxUtils.Camera2StreamConfigurationMap(new byte[]{-87, 120, 121, 122}, allocate27));
        }
        if (metadataCollector4.Camera2StreamConfigurationMap.isEmpty()) {
            highSpeedVideoFpsRanges = java.nio.ByteBuffer.allocate(0);
        } else {
            java.nio.ByteBuffer[] byteBufferArr5 = new java.nio.ByteBuffer[3];
            byteBufferArr5[0] = Camera2StreamConfigurationMap("mdta", "");
            java.util.ArrayList newArrayList = com.google.common.collect.Lists.newArrayList(metadataCollector4.Camera2StreamConfigurationMap);
            int i43 = 0;
            for (int i44 = 0; i44 < newArrayList.size(); i44++) {
                i43 += ((androidx.media3.container.MdtaMetadataEntry) newArrayList.get(i44)).key.length() + 8;
            }
            java.nio.ByteBuffer allocate28 = java.nio.ByteBuffer.allocate(i43 + 8);
            allocate28.putInt(0);
            allocate28.putInt(newArrayList.size());
            for (int i45 = 0; i45 < newArrayList.size(); i45++) {
                allocate28.put(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("mdta", java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes(((androidx.media3.container.MdtaMetadataEntry) newArrayList.get(i45)).key))));
            }
            allocate28.flip();
            byteBufferArr5[1] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor(org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, allocate28);
            java.util.ArrayList newArrayList2 = com.google.common.collect.Lists.newArrayList(metadataCollector4.Camera2StreamConfigurationMap);
            int i46 = 0;
            for (int i47 = 0; i47 < newArrayList2.size(); i47++) {
                i46 += ((androidx.media3.container.MdtaMetadataEntry) newArrayList2.get(i47)).value.length + 24;
            }
            java.nio.ByteBuffer allocate29 = java.nio.ByteBuffer.allocate(i46);
            int i48 = 0;
            while (i48 < newArrayList2.size()) {
                int i49 = i48 + 1;
                androidx.media3.container.MdtaMetadataEntry mdtaMetadataEntry = (androidx.media3.container.MdtaMetadataEntry) newArrayList2.get(i48);
                java.nio.ByteBuffer allocate30 = java.nio.ByteBuffer.allocate(mdtaMetadataEntry.value.length + 8);
                allocate30.putInt(mdtaMetadataEntry.typeIndicator);
                allocate30.putInt(mdtaMetadataEntry.localeIndicator);
                allocate30.put(mdtaMetadataEntry.value);
                allocate30.flip();
                java.nio.ByteBuffer highSpeedVideoFpsRangesFor11 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, allocate30);
                allocate29.putInt(highSpeedVideoFpsRangesFor11.remaining() + 8);
                allocate29.putInt(i49);
                allocate29.put(highSpeedVideoFpsRangesFor11);
                i48 = i49;
            }
            allocate29.flip();
            byteBufferArr5[2] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("ilst", allocate29);
            highSpeedVideoFpsRanges = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges(com.adjust.sdk.Constants.REFERRER_API_META, java.util.Arrays.asList(byteBufferArr5));
        }
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(highSpeedVideoFpsRangesFor10);
        arrayList10.add(highSpeedVideoFpsRangesFor);
        arrayList10.add(highSpeedVideoFpsRanges);
        arrayList10.addAll(arrayList9);
        if (z) {
            arrayList10.add(androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("mvex", arrayList8));
        }
        java.nio.ByteBuffer highSpeedVideoFpsRanges3 = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("moov", arrayList10);
        if (metadataCollector4.getHighSpeedVideoFpsRangesFor == null) {
            return highSpeedVideoFpsRanges3;
        }
        java.nio.ByteBuffer[] byteBufferArr6 = new java.nio.ByteBuffer[2];
        byteBufferArr6[0] = highSpeedVideoFpsRanges3;
        com.google.common.collect.ImmutableList<java.lang.Byte> immutableList = getHighSpeedVideoSizes;
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(metadataCollector4.getHighSpeedVideoFpsRangesFor.data);
        com.google.common.base.Preconditions.checkArgument(wrap.remaining() > 0);
        byteBufferArr6[1] = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, com.google.common.collect.ImmutableList.of(java.nio.ByteBuffer.wrap(com.google.common.primitives.Bytes.toArray(immutableList)), wrap));
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoSizes(byteBufferArr6);
    }

    private static java.nio.ByteBuffer Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(200);
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.put(androidx.media3.common.util.Util.getUtf8Bytes(str));
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.put(androidx.media3.common.util.Util.getUtf8Bytes(str2));
        allocate.put((byte) 0);
        allocate.flip();
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("hdlr", allocate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static java.nio.ByteBuffer Camera2StreamConfigurationMap(androidx.media3.common.Format format) {
        char c;
        java.nio.ByteBuffer highSpeedVideoFpsRangesFor;
        int i;
        int i2;
        java.lang.String str = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(format.sampleMimeType);
        str.hashCode();
        byte b = 10;
        byte b2 = 8;
        int i3 = 1;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1664118616:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_H263)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_AV1)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_H265)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_AMR_WB)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1003765268:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_VORBIS)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_RAW)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_MP4V)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1331836563:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_APV)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_AMR_NB)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_OPUS)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_VP9)) {
                    c = '\r';
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
                com.google.common.base.Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd is not found in the format for dolby vision");
                byte[] bArr = (byte[]) com.google.common.collect.Iterables.getLast(format.initializationData);
                androidx.media3.container.DolbyVisionConfig inputFormats = getInputFormats(format);
                com.google.common.base.Preconditions.checkNotNull(inputFormats, "Dolby vision codec is not supported.");
                java.nio.ByteBuffer outputMinFrameDuration = inputFormats.profile <= 8 ? getOutputMinFrameDuration(format) : getHighResolutionOutputSizeshNQ4ISI(format);
                int i4 = inputFormats.profile;
                com.google.common.base.Preconditions.checkArgument(bArr.length > 0, "csd is empty for dovi box.");
                if (i4 <= 7) {
                    highSpeedVideoFpsRangesFor = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("dvcC", java.nio.ByteBuffer.wrap(bArr));
                } else if (i4 <= 10) {
                    highSpeedVideoFpsRangesFor = androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("dvvC", java.nio.ByteBuffer.wrap(bArr));
                } else {
                    highSpeedVideoFpsRangesFor = (i4 <= 19 || i4 != 20) ? androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("dvwC", java.nio.ByteBuffer.wrap(bArr)) : androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("dvcC", java.nio.ByteBuffer.wrap(bArr));
                }
                return androidx.media3.muxer.BoxUtils.getHighSpeedVideoSizes(outputMinFrameDuration, highSpeedVideoFpsRangesFor);
            case 1:
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(7);
                allocate.put("    ".getBytes(java.nio.charset.StandardCharsets.UTF_8));
                allocate.put((byte) 0);
                android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format);
                if (codecProfileAndLevel == null) {
                    codecProfileAndLevel = new android.util.Pair<>(1, 1);
                }
                allocate.put(((java.lang.Integer) codecProfileAndLevel.second).byteValue());
                allocate.put(((java.lang.Integer) codecProfileAndLevel.first).byteValue());
                allocate.flip();
                return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("d263", allocate);
            case 2:
                return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("av1C", java.nio.ByteBuffer.wrap(format.initializationData.get(0)));
            case 3:
                return getOutputMinFrameDuration(format);
            case 4:
                return Camera2StreamConfigurationMap((short) -31745);
            case 5:
            case 6:
                return getHighSpeedVideoFpsRanges(format);
            case 7:
                return java.nio.ByteBuffer.allocate(0);
            case '\b':
                return getHighSpeedVideoFpsRanges(format);
            case '\t':
                com.google.common.base.Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd-0 is not found in the format for apvC box");
                byte[] bArr2 = format.initializationData.get(0);
                com.google.common.base.Preconditions.checkArgument(bArr2.length > 0, "csd-0 is empty for apvC box.");
                java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(bArr2.length + 4);
                allocate2.putInt(0);
                allocate2.put(bArr2);
                allocate2.flip();
                return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("apvC", allocate2);
            case '\n':
                return getHighResolutionOutputSizeshNQ4ISI(format);
            case 11:
                return Camera2StreamConfigurationMap((short) -32257);
            case '\f':
                com.google.common.base.Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd-0 not found in the format for dOps box.");
                byte[] bArr3 = format.initializationData.get(0);
                com.google.common.base.Preconditions.checkArgument(bArr3.length >= 8, "As csd0 contains 'OpusHead' in first 8 bytes, csd0 length should be greater than 8");
                java.nio.ByteBuffer allocate3 = java.nio.ByteBuffer.allocate(bArr3.length);
                allocate3.put(bArr3, 8, bArr3.length - 8);
                allocate3.flip();
                return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("dOps", allocate3);
            case '\r':
                com.google.common.base.Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd-0 is not found in the format for vpcC box");
                byte[] bArr4 = format.initializationData.get(0);
                com.google.common.base.Preconditions.checkArgument(bArr4.length > 3, "csd-0 for vp9 is invalid.");
                if (com.google.common.primitives.Ints.fromByteArray(bArr4) == 16777216) {
                    return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("vpcC", java.nio.ByteBuffer.wrap(bArr4));
                }
                java.nio.ByteBuffer allocate4 = java.nio.ByteBuffer.allocate(200);
                allocate4.putInt(16777216);
                int i5 = (format.colorInfo == null || format.colorInfo.colorRange == -1) ? 0 : format.colorInfo.colorRange;
                byte b3 = 0;
                byte b4 = 0;
                for (int i6 = 0; i6 < bArr4.length; i6 += 3) {
                    byte b5 = bArr4[i6];
                    int i7 = i6 + 2;
                    if (b5 == 1) {
                        b3 = bArr4[i7];
                    } else if (b5 == 2) {
                        b = bArr4[i7];
                    } else if (b5 == 3) {
                        b2 = bArr4[i7];
                    } else if (b5 == 4) {
                        b4 = bArr4[i7];
                    }
                }
                java.nio.ByteBuffer allocate5 = java.nio.ByteBuffer.allocate(3);
                allocate5.put(b3);
                allocate5.put(b);
                allocate5.put((byte) ((b2 << 4) | (b4 << 1) | i5));
                allocate5.flip();
                allocate4.put(allocate5);
                if (format.colorInfo != null) {
                    i3 = androidx.media3.common.ColorInfo.colorSpaceToIsoColorPrimaries(format.colorInfo.colorSpace);
                    i2 = androidx.media3.common.ColorInfo.colorTransferToIsoTransferCharacteristics(format.colorInfo.colorTransfer);
                    i = androidx.media3.common.ColorInfo.colorSpaceToIsoMatrixCoefficients(format.colorInfo.colorSpace);
                } else {
                    i = 1;
                    i2 = 1;
                }
                allocate4.put((byte) i3);
                allocate4.put((byte) i2);
                allocate4.put((byte) i);
                allocate4.putShort((short) 0);
                allocate4.flip();
                return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("vpcC", allocate4);
            default:
                throw new java.lang.IllegalArgumentException("Unsupported format: ".concat(java.lang.String.valueOf(str)));
        }
    }

    private static java.nio.ByteBuffer getHighSpeedVideoSizes(long j, long j2) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(20);
        allocate.putLong(j);
        allocate.putLong(j2);
        allocate.putShort((short) 1);
        allocate.putShort((short) 0);
        allocate.flip();
        return allocate;
    }

    public static java.util.List<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.media3.muxer.BufferInfo> list, int i, int i2, long j) {
        long j2;
        int i3;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        if (list.isEmpty()) {
            return arrayList2;
        }
        long j3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i4 < list.size()) {
            long j4 = list.get(i4).presentationTimeUs;
            arrayList.add(java.lang.Long.valueOf(j4));
            if (j4 < j3) {
                z = true;
            }
            i4++;
            j3 = j4;
        }
        if (z) {
            java.util.Collections.sort(arrayList);
        }
        long longValue = ((java.lang.Long) arrayList.get(0)).longValue();
        int i5 = 1;
        while (i5 < arrayList.size()) {
            long longValue2 = ((java.lang.Long) arrayList.get(i5)).longValue();
            int i6 = i5;
            long scaleLargeValue = androidx.media3.common.util.Util.scaleLargeValue(longValue2 - longValue, i, 1000000L, java.math.RoundingMode.HALF_UP);
            com.google.common.base.Preconditions.checkState(scaleLargeValue <= androidx.collection.SieveCacheKt.NodeLinkMask, "Only 32-bit sample duration is allowed");
            arrayList2.add(java.lang.Integer.valueOf((int) scaleLargeValue));
            i5 = i6 + 1;
            longValue = longValue2;
        }
        if (j != androidx.media3.common.C.TIME_UNSET) {
            long j5 = i;
            j2 = androidx.media3.common.util.Util.scaleLargeValue(j, j5, 1000000L, java.math.RoundingMode.HALF_UP) - androidx.media3.common.util.Util.scaleLargeValue(longValue, j5, 1000000L, java.math.RoundingMode.HALF_UP);
            com.google.common.base.Preconditions.checkState(j2 <= androidx.collection.SieveCacheKt.NodeLinkMask, "Only 32-bit sample duration is allowed");
        } else {
            j2 = -1;
        }
        int i7 = (int) j2;
        if (i2 != 0) {
            if (i2 == 1) {
                if (i7 != -1) {
                    i3 = i7;
                } else if (arrayList2.size() >= 2) {
                    i3 = ((java.lang.Integer) com.google.common.collect.Iterables.getLast(arrayList2)).intValue();
                }
                arrayList2.add(java.lang.Integer.valueOf(i3));
                return arrayList2;
            }
            throw new java.lang.IllegalArgumentException("Unexpected value for the last frame duration behavior ".concat(java.lang.String.valueOf(i2)));
        }
        i3 = 0;
        arrayList2.add(java.lang.Integer.valueOf(i3));
        return arrayList2;
    }

    public static java.util.List<java.lang.Integer> getHighSpeedVideoFpsRangesFor(java.util.List<androidx.media3.muxer.BufferInfo> list, java.util.List<java.lang.Integer> list2, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        if (!list.isEmpty()) {
            boolean z = false;
            long j = list.get(0).presentationTimeUs;
            long j2 = 0;
            int i2 = 0;
            boolean z2 = false;
            long j3 = 0;
            while (i2 < list.size()) {
                long j4 = list.get(i2).presentationTimeUs - j;
                long scaleLargeValue = androidx.media3.common.util.Util.scaleLargeValue(j4, i, 1000000L, java.math.RoundingMode.HALF_UP) - j2;
                com.google.common.base.Preconditions.checkState(scaleLargeValue <= androidx.collection.SieveCacheKt.NodeLinkMask ? true : z, "Only 32-bit composition offset is allowed");
                long j5 = j;
                j2 += list2.get(i2).intValue();
                arrayList.add(java.lang.Integer.valueOf((int) scaleLargeValue));
                if (j4 < j3) {
                    z2 = true;
                }
                i2++;
                j3 = j4;
                j = j5;
                z = false;
            }
            if (!z2) {
                arrayList.clear();
            }
        }
        return arrayList;
    }

    private static java.nio.ByteBuffer getHighSpeedVideoSizes(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.limit() + 200);
        allocate.putInt(0);
        allocate.putInt(1);
        allocate.put(byteBuffer);
        allocate.flip();
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("stsd", allocate);
    }

    public static java.nio.ByteBuffer Camera2StreamConfigurationMap() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes("isom")));
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.putInt(131072);
        allocate.flip();
        arrayList.add(allocate);
        java.lang.String[] strArr = {"isom", "iso2", "mp41"};
        for (int i = 0; i < 3; i++) {
            arrayList.add(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes(strArr[i])));
        }
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("ftyp", arrayList);
    }

    public static java.nio.ByteBuffer getHighResolutionOutputSizeshNQ4ISI(java.nio.ByteBuffer byteBuffer, java.util.List<java.nio.ByteBuffer> list) {
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("moof", new com.google.common.collect.ImmutableList.Builder().add((com.google.common.collect.ImmutableList.Builder) byteBuffer).addAll((java.lang.Iterable) list).build());
    }

    public static java.nio.ByteBuffer Camera2StreamConfigurationMap(int i) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.putInt(0);
        allocate.putInt(i);
        allocate.flip();
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("mfhd", allocate);
    }

    public static java.nio.ByteBuffer Camera2StreamConfigurationMap(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) {
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRanges("traf", com.google.common.collect.ImmutableList.of(byteBuffer, byteBuffer2));
    }

    public static java.nio.ByteBuffer getHighSpeedVideoSizes(int i, long j) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(16);
        allocate.putInt(1);
        allocate.putInt(i);
        allocate.putLong(j);
        allocate.flip();
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("tfhd", allocate);
    }

    public static java.nio.ByteBuffer Camera2StreamConfigurationMap(androidx.media3.common.Format format, java.util.List<androidx.media3.muxer.FragmentedMp4Writer.SampleMetadata> list, int i, boolean z) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(((z ? 4 : 3) * list.size() * 4) + 12);
        allocate.putInt(z ? 16781057 : 16779009);
        allocate.putInt(list.size());
        allocate.putInt(i);
        boolean allSamplesAreSyncSamples = androidx.media3.common.MimeTypes.allSamplesAreSyncSamples(format.sampleMimeType, format.codecs);
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.media3.muxer.FragmentedMp4Writer.SampleMetadata sampleMetadata = list.get(i2);
            allocate.putInt(sampleMetadata.durationVu);
            allocate.putInt(sampleMetadata.size);
            allocate.putInt(((sampleMetadata.flags & 1) != 0 || allSamplesAreSyncSamples) ? 33554432 : android.R.attr.theme);
            if (z) {
                allocate.putInt(sampleMetadata.compositionTimeOffsetVu);
            }
        }
        allocate.flip();
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("trun", allocate);
    }

    public static java.nio.ByteBuffer getHighSpeedVideoSizes(long j) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(16);
        allocate.putInt(1);
        allocate.put(androidx.media3.common.util.Util.getUtf8Bytes("axte"));
        allocate.putLong(j + 16);
        allocate.flip();
        return allocate;
    }

    private static java.nio.ByteBuffer getHighResolutionOutputSizeshNQ4ISI(androidx.media3.common.Format format) {
        com.google.common.base.Preconditions.checkArgument(format.initializationData.size() >= 2, "csd-0 and/or csd-1 not found in the format for avcC box.");
        byte[] bArr = format.initializationData.get(0);
        com.google.common.base.Preconditions.checkArgument(bArr.length > 0, "csd-0 is empty for avcC box.");
        byte[] bArr2 = format.initializationData.get(1);
        com.google.common.base.Preconditions.checkArgument(bArr2.length > 0, "csd-1 is empty for avcC box.");
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        java.nio.ByteBuffer wrap2 = java.nio.ByteBuffer.wrap(bArr2);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(wrap.limit() + wrap2.limit() + 200);
        allocate.put((byte) 1);
        com.google.common.collect.ImmutableList<java.nio.ByteBuffer> highSpeedVideoFpsRangesFor = androidx.media3.muxer.AnnexBUtils.getHighSpeedVideoFpsRangesFor(wrap);
        com.google.common.base.Preconditions.checkArgument(!highSpeedVideoFpsRangesFor.isEmpty(), "SPS data not found in csd0 for avcC box.");
        java.nio.ByteBuffer byteBuffer = highSpeedVideoFpsRangesFor.get(0);
        int remaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[remaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnit = androidx.media3.container.NalUnitUtil.parseSpsNalUnit(bArr3, 0, remaining);
        allocate.put((byte) parseSpsNalUnit.profileIdc);
        allocate.put((byte) parseSpsNalUnit.constraintsFlagsAndReservedZero2Bits);
        allocate.put((byte) parseSpsNalUnit.levelIdc);
        allocate.put((byte) -1);
        allocate.put((byte) -31);
        allocate.putShort((short) byteBuffer.remaining());
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        com.google.common.collect.ImmutableList<java.nio.ByteBuffer> highSpeedVideoFpsRangesFor2 = androidx.media3.muxer.AnnexBUtils.getHighSpeedVideoFpsRangesFor(wrap2);
        com.google.common.base.Preconditions.checkState(!highSpeedVideoFpsRangesFor2.isEmpty(), "PPS data not found in csd1 for avcC box.");
        allocate.put((byte) 1);
        java.nio.ByteBuffer byteBuffer2 = highSpeedVideoFpsRangesFor2.get(0);
        allocate.putShort((short) byteBuffer2.remaining());
        allocate.put(byteBuffer2);
        byteBuffer2.rewind();
        allocate.flip();
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("avcC", allocate);
    }

    private static java.nio.ByteBuffer getOutputMinFrameDuration(androidx.media3.common.Format format) {
        com.google.common.base.Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd-0 not found in the format for hvcC box.");
        byte[] bArr = format.initializationData.get(0);
        com.google.common.base.Preconditions.checkArgument(bArr.length > 0, "csd-0 is empty for hvcC box.");
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(wrap.limit() + 200);
        com.google.common.collect.ImmutableList<java.nio.ByteBuffer> highSpeedVideoFpsRangesFor = androidx.media3.muxer.AnnexBUtils.getHighSpeedVideoFpsRangesFor(wrap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < highSpeedVideoFpsRangesFor.size(); i++) {
            arrayList.add(androidx.media3.muxer.AnnexBUtils.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor.get(i)));
        }
        allocate.put((byte) 1);
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) arrayList.get(0);
        if (byteBuffer.get(byteBuffer.position()) != 64) {
            throw new java.lang.IllegalArgumentException("First NALU in csd-0 is not the VPS.");
        }
        allocate.put(byteBuffer.get(6));
        allocate.putInt(byteBuffer.getInt(7));
        allocate.putInt(byteBuffer.getInt(11));
        allocate.putShort(byteBuffer.getShort(15));
        allocate.put(byteBuffer.get(17));
        allocate.putShort((short) -4096);
        allocate.put((byte) -4);
        java.nio.ByteBuffer byteBuffer2 = highSpeedVideoFpsRangesFor.get(1);
        int remaining = byteBuffer2.remaining();
        byte[] bArr2 = new byte[remaining];
        byteBuffer2.get(bArr2);
        byteBuffer2.rewind();
        androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnit = androidx.media3.container.NalUnitUtil.parseH265SpsNalUnit(bArr2, 0, remaining, null);
        byte b = (byte) (parseH265SpsNalUnit.chromaFormatIdc | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        byte b2 = (byte) (parseH265SpsNalUnit.bitDepthLumaMinus8 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        byte b3 = (byte) (parseH265SpsNalUnit.bitDepthChromaMinus8 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        allocate.put(b);
        allocate.put(b2);
        allocate.put(b3);
        allocate.putShort((short) 0);
        allocate.put(com.google.common.base.Ascii.SI);
        allocate.put((byte) highSpeedVideoFpsRangesFor.size());
        for (int i2 = 0; i2 < highSpeedVideoFpsRangesFor.size(); i2++) {
            java.nio.ByteBuffer byteBuffer3 = highSpeedVideoFpsRangesFor.get(i2);
            allocate.put((byte) ((byteBuffer3.get(0) >> 1) & 63));
            allocate.putShort((short) 1);
            allocate.putShort((short) byteBuffer3.limit());
            allocate.put(byteBuffer3);
        }
        allocate.flip();
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("hvcC", allocate);
    }

    private static androidx.media3.container.DolbyVisionConfig getInputFormats(androidx.media3.common.Format format) {
        androidx.media3.container.DolbyVisionConfig parse = androidx.media3.container.DolbyVisionConfig.parse(new androidx.media3.common.util.ParsableByteArray((byte[]) com.google.common.collect.Iterables.getLast(format.initializationData)));
        if (parse != null || format.codecs == null) {
            return parse;
        }
        android.util.Pair<java.lang.Integer, java.lang.Integer> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(format);
        com.google.common.base.Preconditions.checkNotNull(highSpeedVideoFpsRangesFor, "Dolby Vision profile and level is not found.");
        return androidx.media3.container.DolbyVisionConfig.parse(new androidx.media3.common.util.ParsableByteArray(androidx.media3.common.util.CodecSpecificDataUtil.buildDolbyVisionInitializationData(((java.lang.Integer) highSpeedVideoFpsRangesFor.first).intValue(), ((java.lang.Integer) highSpeedVideoFpsRangesFor.second).intValue())));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static java.lang.String getHighSpeedVideoSizes(androidx.media3.common.Format format) {
        char c;
        java.lang.String str = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(format.sampleMimeType);
        str.hashCode();
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1664118616:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_H263)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_AV1)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_H265)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_AMR_WB)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1003765268:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_VORBIS)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_RAW)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_MP4V)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1331836563:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_APV)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_AMR_NB)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals(androidx.media3.common.MimeTypes.AUDIO_OPUS)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals(androidx.media3.common.MimeTypes.VIDEO_VP9)) {
                    c = '\r';
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
                androidx.media3.container.DolbyVisionConfig inputFormats = getInputFormats(format);
                com.google.common.base.Preconditions.checkNotNull(inputFormats, "Dolby Vision Initialization data is not found for format: %s", format.sampleMimeType);
                int i = inputFormats.profile;
                if (i == 5) {
                    return "dvh1";
                }
                if (i == 8) {
                    return "hvc1";
                }
                if (i == 9) {
                    return "avc1";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported profile ");
                sb.append(inputFormats.profile);
                sb.append(" for format: ");
                sb.append(format.sampleMimeType);
                throw new java.lang.IllegalArgumentException(sb.toString());
            case 1:
                return "s263";
            case 2:
                return "av01";
            case 3:
                return "hvc1";
            case 4:
                return "sawb";
            case 5:
            case 6:
                return "mp4a";
            case 7:
                if (format.pcmEncoding == 2) {
                    return "sowt";
                }
                if (format.pcmEncoding == 268435456) {
                    return "twos";
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported PCM encoding: ");
                sb2.append(format.pcmEncoding);
                throw new java.lang.IllegalArgumentException(sb2.toString());
            case '\b':
                return "mp4v-es";
            case '\t':
                return "apv1";
            case '\n':
                return "avc1";
            case 11:
                return "samr";
            case '\f':
                return "Opus";
            case '\r':
                return "vp09";
            default:
                throw new java.lang.IllegalArgumentException("Unsupported format: ".concat(java.lang.String.valueOf(str)));
        }
    }

    private static java.nio.ByteBuffer getHighSpeedVideoFpsRanges(androidx.media3.common.Format format) {
        java.nio.ByteBuffer wrap;
        com.google.common.base.Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd-0 not found in the format for esds box.");
        byte[] bArr = format.initializationData.get(0);
        com.google.common.base.Preconditions.checkArgument(bArr.length > 0, "csd-0 is empty for esds box.");
        java.lang.String str = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(format.sampleMimeType);
        if (str.equals(androidx.media3.common.MimeTypes.AUDIO_VORBIS)) {
            wrap = androidx.media3.common.util.CodecSpecificDataUtil.getVorbisInitializationData(format);
        } else {
            wrap = java.nio.ByteBuffer.wrap(bArr);
        }
        int i = format.peakBitrate;
        int i2 = format.averageBitrate;
        boolean isVideo = androidx.media3.common.MimeTypes.isVideo(str);
        int remaining = wrap.remaining();
        java.nio.ByteBuffer highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(remaining);
        java.nio.ByteBuffer highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor.remaining() + remaining + 14);
        java.nio.ByteBuffer highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor.remaining() + remaining + highSpeedVideoFpsRangesFor2.remaining() + 21);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(remaining + 200);
        allocate.putInt(0);
        allocate.put((byte) 3);
        allocate.put(highSpeedVideoFpsRangesFor3);
        allocate.putShort((short) 0);
        allocate.put(isVideo ? com.google.common.base.Ascii.US : (byte) 0);
        allocate.put((byte) 4);
        allocate.put(highSpeedVideoFpsRangesFor2);
        allocate.put(((java.lang.Byte) com.google.common.base.Preconditions.checkNotNull(androidx.media3.common.MimeTypes.getMp4ObjectTypeFromMimeType(str))).byteValue());
        allocate.put((byte) ((isVideo ? 16 : 20) | 1));
        allocate.putShort((short) (((isVideo ? androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE : com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS) >> 8) & 65535));
        allocate.put((byte) 0);
        if (i == -1) {
            i = 0;
        }
        allocate.putInt(i);
        allocate.putInt(i2 != -1 ? i2 : 0);
        allocate.put((byte) 5);
        allocate.put(highSpeedVideoFpsRangesFor);
        allocate.put(wrap);
        wrap.rewind();
        allocate.put((byte) 6);
        allocate.put((byte) 1);
        allocate.put((byte) 2);
        allocate.flip();
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("esds", allocate);
    }

    private static java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor(int i) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        int i2 = 0;
        while (true) {
            arrayDeque.push(java.lang.Byte.valueOf((byte) (i2 | (i & 127))));
            i >>= 7;
            if (i <= 0) {
                break;
            }
            i2 = 128;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            allocate.put(((java.lang.Byte) arrayDeque.removeFirst()).byteValue());
        }
        allocate.flip();
        return allocate;
    }

    private static java.nio.ByteBuffer Camera2StreamConfigurationMap(short s) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(200);
        allocate.put("    ".getBytes(java.nio.charset.StandardCharsets.UTF_8));
        allocate.put((byte) 0);
        allocate.putShort(s);
        allocate.put((byte) 0);
        allocate.put((byte) 1);
        allocate.flip();
        return androidx.media3.muxer.BoxUtils.getHighSpeedVideoFpsRangesFor("damr", allocate);
    }

    static android.util.Pair<java.lang.Integer, java.lang.Integer> getHighSpeedVideoFpsRangesFor(androidx.media3.common.Format format) {
        com.google.common.base.Preconditions.checkNotNull(format.codecs, "Codec string is null for Dolby Vision format.");
        java.util.List<java.lang.String> splitToList = com.google.common.base.Splitter.on(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR).splitToList(format.codecs);
        if (splitToList.size() < 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid Dolby Vision codec string: ");
            sb.append(format.codecs);
            androidx.media3.common.util.Log.w("Boxes", sb.toString());
            return null;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(java.lang.Integer.parseInt(splitToList.get(1))), java.lang.Integer.valueOf(java.lang.Integer.parseInt(splitToList.get(2))));
    }
}
