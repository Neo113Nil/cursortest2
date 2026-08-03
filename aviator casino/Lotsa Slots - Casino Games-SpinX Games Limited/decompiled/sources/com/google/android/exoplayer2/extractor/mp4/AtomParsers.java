package com.google.android.exoplayer2.extractor.mp4;

/* loaded from: classes3.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final java.lang.String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = com.google.android.exoplayer2.util.Util.getUtf8Bytes("OpusHead");

    private interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static java.util.List<com.google.android.exoplayer2.extractor.mp4.TrackSampleTable> parseTraks(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom, com.google.android.exoplayer2.extractor.GaplessInfoHolder gaplessInfoHolder, long j, com.google.android.exoplayer2.drm.DrmInitData drmInitData, boolean z, boolean z2, com.google.common.base.Function<com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.extractor.mp4.Track> function) throws com.google.android.exoplayer2.ParserException {
        com.google.android.exoplayer2.extractor.mp4.Track apply;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < containerAtom.containerChildren.size(); i++) {
            com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i);
            if (containerAtom2.type == 1953653099 && (apply = function.apply(parseTrak(containerAtom2, (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(apply, (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(((com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(((com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835297121))).getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static android.util.Pair<com.google.android.exoplayer2.metadata.Metadata, com.google.android.exoplayer2.metadata.Metadata> parseUdta(com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom) {
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        com.google.android.exoplayer2.metadata.Metadata metadata = null;
        com.google.android.exoplayer2.metadata.Metadata metadata2 = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = parseUdtaMeta(parsableByteArray, position + readInt);
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata2 = parseSmta(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return android.util.Pair.create(metadata, metadata2);
    }

    public static com.google.android.exoplayer2.metadata.Metadata parseMdtaFromMeta(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom) {
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1751411826);
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1801812339);
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1768715124);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        java.lang.String[] strArr = new java.lang.String[readInt];
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i] = parsableByteArray.readString(readInt2 - 8);
        }
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int readInt3 = parsableByteArray2.readInt();
            int readInt4 = parsableByteArray2.readInt() - 1;
            if (readInt4 >= 0 && readInt4 < readInt) {
                com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                if (parseMdtaMetadataEntryFromIlst != null) {
                    arrayList.add(parseMdtaMetadataEntryFromIlst);
                }
            } else {
                com.google.android.exoplayer2.util.Log.w(TAG, "Skipped metadata with unknown key index: " + readInt4);
            }
            parsableByteArray2.setPosition(position + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.google.android.exoplayer2.metadata.Metadata(arrayList);
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static com.google.android.exoplayer2.extractor.mp4.Track parseTrak(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom, com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom, long j, com.google.android.exoplayer2.drm.DrmInitData drmInitData, boolean z, boolean z2) throws com.google.android.exoplayer2.ParserException {
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom2;
        long j2;
        long[] jArr;
        long[] jArr2;
        com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtomOfType;
        android.util.Pair<long[], long[]> parseEdts;
        com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom2 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom.getContainerAtomOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1751411826))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData parseTkhd = parseTkhd(((com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1953196132))).data);
        if (j == -9223372036854775807L) {
            leafAtom2 = leafAtom;
            j2 = parseTkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j2 = j;
        }
        long parseMvhd = parseMvhd(leafAtom2.data);
        long scaleLargeTimestamp = j2 != -9223372036854775807L ? com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j2, 1000000L, parseMvhd) : -9223372036854775807L;
        com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom3 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(((com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212));
        android.util.Pair<java.lang.Long, java.lang.String> parseMdhd = parseMdhd(((com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1835296868))).data);
        com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData parseStsd = parseStsd(((com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom3.getLeafAtomOfType(1937011556))).data, parseTkhd.id, parseTkhd.rotationDegrees, (java.lang.String) parseMdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom.getContainerAtomOfType(1701082227)) == null || (parseEdts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) parseEdts.first;
            jArr2 = (long[]) parseEdts.second;
            jArr = jArr3;
        }
        if (parseStsd.format == null) {
            return null;
        }
        return new com.google.android.exoplayer2.extractor.mp4.Track(parseTkhd.id, trackTypeForHdlr, ((java.lang.Long) parseMdhd.first).longValue(), parseMvhd, scaleLargeTimestamp, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.exoplayer2.extractor.mp4.TrackSampleTable parseStbl(com.google.android.exoplayer2.extractor.mp4.Track track, com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom, com.google.android.exoplayer2.extractor.GaplessInfoHolder gaplessInfoHolder) throws com.google.android.exoplayer2.ParserException {
        com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int i;
        int i2;
        int i3;
        int fixedSampleSize;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        com.google.android.exoplayer2.extractor.mp4.Track track2;
        int i10;
        long[] jArr;
        int[] iArr;
        int i11;
        long j;
        long[] jArr2;
        int[] iArr2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long[] jArr3;
        long[] jArr4;
        boolean z4;
        int i19;
        int i20;
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1937011578);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new com.google.android.exoplayer2.extractor.mp4.AtomParsers.StszSampleSizeBox(leafAtomOfType, track.format);
        } else {
            com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1937013298);
            if (leafAtomOfType2 == null) {
                throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new com.google.android.exoplayer2.extractor.mp4.AtomParsers.Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1937007471);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1668232756));
            z = true;
        } else {
            z = false;
        }
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray2 = ((com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1937011555))).data;
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray3 = ((com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1937011827))).data;
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(1937011571);
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(1668576371);
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        com.google.android.exoplayer2.extractor.mp4.AtomParsers.ChunkIterator chunkIterator = new com.google.android.exoplayer2.extractor.mp4.AtomParsers.ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray3.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray3.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i = parsableByteArray5.readUnsignedIntToInt();
        } else {
            i = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            i2 = parsableByteArray4.readUnsignedIntToInt();
            if (i2 > 0) {
                i3 = parsableByteArray4.readUnsignedIntToInt() - 1;
                fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
                java.lang.String str = track.format.sampleMimeType;
                if (fixedSampleSize == -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && readUnsignedIntToInt == 0 && i == 0 && i2 == 0)) {
                    i4 = i2;
                    z2 = true;
                } else {
                    i4 = i2;
                    z2 = false;
                }
                if (!z2) {
                    long[] jArr5 = new long[chunkIterator.length];
                    int[] iArr3 = new int[chunkIterator.length];
                    while (chunkIterator.moveNext()) {
                        jArr5[chunkIterator.index] = chunkIterator.offset;
                        iArr3[chunkIterator.index] = chunkIterator.numSamples;
                    }
                    com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker.Results rechunk = com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr5, iArr3, readUnsignedIntToInt3);
                    long[] jArr6 = rechunk.offsets;
                    int[] iArr4 = rechunk.sizes;
                    int i21 = rechunk.maximumSize;
                    long[] jArr7 = rechunk.timestamps;
                    int[] iArr5 = rechunk.flags;
                    long j2 = rechunk.duration;
                    track2 = track;
                    i10 = sampleCount;
                    jArr = jArr6;
                    iArr = iArr4;
                    i11 = i21;
                    iArr2 = iArr5;
                    j = j2;
                    jArr2 = jArr7;
                } else {
                    long[] jArr8 = new long[sampleCount];
                    int[] iArr6 = new int[sampleCount];
                    long[] jArr9 = new long[sampleCount];
                    int[] iArr7 = new int[sampleCount];
                    int i22 = i3;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    long j3 = 0;
                    long j4 = 0;
                    int i28 = i;
                    int i29 = readUnsignedIntToInt3;
                    int i30 = readUnsignedIntToInt2;
                    int i31 = readUnsignedIntToInt;
                    int i32 = i4;
                    while (true) {
                        i5 = i31;
                        if (i23 >= sampleCount) {
                            i6 = i30;
                            i7 = i25;
                            i8 = i26;
                            break;
                        }
                        long j5 = j4;
                        int i33 = i26;
                        boolean z5 = true;
                        while (i33 == 0) {
                            z5 = chunkIterator.moveNext();
                            if (!z5) {
                                break;
                            }
                            int i34 = i30;
                            long j6 = chunkIterator.offset;
                            i33 = chunkIterator.numSamples;
                            j5 = j6;
                            i30 = i34;
                            i29 = i29;
                            sampleCount = sampleCount;
                        }
                        int i35 = sampleCount;
                        i6 = i30;
                        int i36 = i29;
                        if (!z5) {
                            com.google.android.exoplayer2.util.Log.w(TAG, "Unexpected end of chunk data");
                            jArr8 = java.util.Arrays.copyOf(jArr8, i23);
                            iArr6 = java.util.Arrays.copyOf(iArr6, i23);
                            jArr9 = java.util.Arrays.copyOf(jArr9, i23);
                            iArr7 = java.util.Arrays.copyOf(iArr7, i23);
                            sampleCount = i23;
                            i7 = i25;
                            i8 = i33;
                            break;
                        }
                        if (parsableByteArray5 != null) {
                            while (i27 == 0 && i28 > 0) {
                                i27 = parsableByteArray5.readUnsignedIntToInt();
                                i25 = parsableByteArray5.readInt();
                                i28--;
                            }
                            i27--;
                        }
                        int i37 = i25;
                        jArr8[i23] = j5;
                        int readNextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                        iArr6[i23] = readNextSampleSize;
                        if (readNextSampleSize > i24) {
                            i24 = readNextSampleSize;
                        }
                        jArr9[i23] = j3 + i37;
                        iArr7[i23] = parsableByteArray4 == null ? 1 : 0;
                        if (i23 == i22) {
                            iArr7[i23] = 1;
                            i32--;
                            if (i32 > 0) {
                                i22 = ((com.google.android.exoplayer2.util.ParsableByteArray) com.google.android.exoplayer2.util.Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                            }
                        }
                        int i38 = i22;
                        j3 += i36;
                        int i39 = i6 - 1;
                        if (i39 != 0 || i5 <= 0) {
                            i12 = i36;
                            i13 = i5;
                        } else {
                            i39 = parsableByteArray3.readUnsignedIntToInt();
                            i12 = parsableByteArray3.readInt();
                            i13 = i5 - 1;
                        }
                        int i40 = i39;
                        long j7 = j5 + iArr6[i23];
                        i26 = i33 - 1;
                        i23++;
                        j4 = j7;
                        i22 = i38;
                        i29 = i12;
                        sampleCount = i35;
                        i25 = i37;
                        i31 = i13;
                        i30 = i40;
                    }
                    long j8 = j3 + i7;
                    if (parsableByteArray5 != null) {
                        while (i28 > 0) {
                            if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                                z3 = false;
                                break;
                            }
                            parsableByteArray5.readInt();
                            i28--;
                        }
                    }
                    z3 = true;
                    if (i32 == 0 && i6 == 0 && i8 == 0 && i5 == 0) {
                        i9 = i27;
                        if (i9 == 0 && z3) {
                            track2 = track;
                            i10 = sampleCount;
                            jArr = jArr8;
                            iArr = iArr6;
                            i11 = i24;
                            j = j8;
                            jArr2 = jArr9;
                            iArr2 = iArr7;
                        }
                    } else {
                        i9 = i27;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Inconsistent stbl box for track ");
                    track2 = track;
                    sb.append(track2.id);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(i32);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i6);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i8);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i5);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i9);
                    sb.append(!z3 ? ", ctts invalid" : "");
                    com.google.android.exoplayer2.util.Log.w(TAG, sb.toString());
                    i10 = sampleCount;
                    jArr = jArr8;
                    iArr = iArr6;
                    i11 = i24;
                    j = j8;
                    jArr2 = jArr9;
                    iArr2 = iArr7;
                }
                long scaleLargeTimestamp = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
                if (track2.editListDurations != null) {
                    com.google.android.exoplayer2.util.Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                    return new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable(track, jArr, iArr, i11, jArr2, iArr2, scaleLargeTimestamp);
                }
                if (track2.editListDurations.length == 1 && track2.type == 1 && jArr2.length >= 2) {
                    long j9 = ((long[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(track2.editListMediaTimes))[0];
                    long scaleLargeTimestamp2 = j9 + com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale);
                    i14 = i10;
                    if (canApplyEditWithGaplessInfo(jArr2, j, j9, scaleLargeTimestamp2)) {
                        long scaleLargeTimestamp3 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j9 - jArr2[0], track2.format.sampleRate, track2.timescale);
                        i15 = i11;
                        long scaleLargeTimestamp4 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j - scaleLargeTimestamp2, track2.format.sampleRate, track2.timescale);
                        if ((scaleLargeTimestamp3 != 0 || scaleLargeTimestamp4 != 0) && scaleLargeTimestamp3 <= 2147483647L && scaleLargeTimestamp4 <= 2147483647L) {
                            gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                            gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                            com.google.android.exoplayer2.util.Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                            return new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable(track, jArr, iArr, i15, jArr2, iArr2, com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                        }
                        if (track2.editListDurations.length != 1 && track2.editListDurations[0] == 0) {
                            long j10 = ((long[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(track2.editListMediaTimes))[0];
                            for (int i41 = 0; i41 < jArr2.length; i41++) {
                                jArr2[i41] = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(jArr2[i41] - j10, 1000000L, track2.timescale);
                            }
                            return new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable(track, jArr, iArr, i15, jArr2, iArr2, com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j - j10, 1000000L, track2.timescale));
                        }
                        boolean z6 = track2.type != 1;
                        int[] iArr8 = new int[track2.editListDurations.length];
                        int[] iArr9 = new int[track2.editListDurations.length];
                        long[] jArr10 = (long[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(track2.editListMediaTimes);
                        i16 = 0;
                        boolean z7 = false;
                        int i42 = 0;
                        int i43 = 0;
                        while (i16 < track2.editListDurations.length) {
                            long[] jArr11 = jArr;
                            int[] iArr10 = iArr;
                            long j11 = jArr10[i16];
                            if (j11 != -1) {
                                int i44 = i43;
                                jArr4 = jArr11;
                                boolean z8 = z7;
                                int i45 = i42;
                                long scaleLargeTimestamp5 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(track2.editListDurations[i16], track2.timescale, track2.movieTimescale);
                                iArr8[i16] = com.google.android.exoplayer2.util.Util.binarySearchFloor(jArr2, j11, true, true);
                                iArr9[i16] = com.google.android.exoplayer2.util.Util.binarySearchCeil(jArr2, j11 + scaleLargeTimestamp5, z6, false);
                                while (true) {
                                    i20 = iArr8[i16];
                                    i19 = iArr9[i16];
                                    if (i20 >= i19 || (iArr2[i20] & 1) != 0) {
                                        break;
                                    }
                                    iArr8[i16] = i20 + 1;
                                }
                                i42 = i45 + (i19 - i20);
                                z4 = z8 | (i44 != i20);
                            } else {
                                jArr4 = jArr11;
                                z4 = z7;
                                i19 = i43;
                            }
                            i16++;
                            z7 = z4;
                            i43 = i19;
                            iArr = iArr10;
                            jArr = jArr4;
                        }
                        long[] jArr12 = jArr;
                        int[] iArr11 = iArr;
                        boolean z9 = z7;
                        i17 = 0;
                        boolean z10 = z9 | (i42 != i14);
                        long[] jArr13 = !z10 ? new long[i42] : jArr12;
                        int[] iArr12 = !z10 ? new int[i42] : iArr11;
                        int i46 = !z10 ? 0 : i15;
                        int[] iArr13 = !z10 ? new int[i42] : iArr2;
                        long[] jArr14 = new long[i42];
                        int i47 = i46;
                        long j12 = 0;
                        int i48 = 0;
                        while (i17 < track2.editListDurations.length) {
                            long j13 = track2.editListMediaTimes[i17];
                            int i49 = iArr8[i17];
                            int[] iArr14 = iArr8;
                            int i50 = iArr9[i17];
                            int[] iArr15 = iArr9;
                            if (z10) {
                                int i51 = i50 - i49;
                                i18 = i17;
                                jArr3 = jArr12;
                                java.lang.System.arraycopy(jArr3, i49, jArr13, i48, i51);
                                java.lang.System.arraycopy(iArr11, i49, iArr12, i48, i51);
                                java.lang.System.arraycopy(iArr2, i49, iArr13, i48, i51);
                            } else {
                                i18 = i17;
                                jArr3 = jArr12;
                            }
                            int i52 = i47;
                            while (i49 < i50) {
                                int i53 = i50;
                                int i54 = i52;
                                long[] jArr15 = jArr2;
                                int[] iArr16 = iArr2;
                                int[] iArr17 = iArr13;
                                long j14 = j12;
                                jArr14[i48] = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j12, 1000000L, track2.movieTimescale) + com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(java.lang.Math.max(0L, jArr2[i49] - j13), 1000000L, track2.timescale);
                                if (z10) {
                                    i52 = i54;
                                    if (iArr12[i48] > i52) {
                                        i52 = iArr11[i49];
                                    }
                                } else {
                                    i52 = i54;
                                }
                                i48++;
                                i49++;
                                i50 = i53;
                                j12 = j14;
                                jArr2 = jArr15;
                                iArr2 = iArr16;
                                iArr13 = iArr17;
                            }
                            i47 = i52;
                            jArr12 = jArr3;
                            j12 += track2.editListDurations[i18];
                            jArr2 = jArr2;
                            iArr2 = iArr2;
                            iArr9 = iArr15;
                            iArr13 = iArr13;
                            i17 = i18 + 1;
                            iArr8 = iArr14;
                        }
                        return new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable(track, jArr13, iArr12, i47, jArr14, iArr13, com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j12, 1000000L, track2.movieTimescale));
                    }
                } else {
                    i14 = i10;
                }
                i15 = i11;
                if (track2.editListDurations.length != 1) {
                }
                if (track2.type != 1) {
                }
                int[] iArr82 = new int[track2.editListDurations.length];
                int[] iArr92 = new int[track2.editListDurations.length];
                long[] jArr102 = (long[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(track2.editListMediaTimes);
                i16 = 0;
                boolean z72 = false;
                int i422 = 0;
                int i432 = 0;
                while (i16 < track2.editListDurations.length) {
                }
                long[] jArr122 = jArr;
                int[] iArr112 = iArr;
                boolean z92 = z72;
                i17 = 0;
                boolean z102 = z92 | (i422 != i14);
                if (!z102) {
                }
                if (!z102) {
                }
                if (!z102) {
                }
                if (!z102) {
                }
                long[] jArr142 = new long[i422];
                int i472 = i46;
                long j122 = 0;
                int i482 = 0;
                while (i17 < track2.editListDurations.length) {
                }
                return new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable(track, jArr13, iArr12, i472, jArr142, iArr13, com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j122, 1000000L, track2.movieTimescale));
            }
            parsableByteArray4 = null;
        } else {
            i2 = 0;
        }
        i3 = -1;
        fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        java.lang.String str2 = track.format.sampleMimeType;
        if (fixedSampleSize == -1) {
        }
        i4 = i2;
        z2 = false;
        if (!z2) {
        }
        long scaleLargeTimestamp6 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
        if (track2.editListDurations != null) {
        }
    }

    private static com.google.android.exoplayer2.metadata.Metadata parseUdtaMeta(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    private static com.google.android.exoplayer2.metadata.Metadata parseIlst(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (parsableByteArray.getPosition() < i) {
            com.google.android.exoplayer2.metadata.Metadata.Entry parseIlstElement = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.google.android.exoplayer2.metadata.Metadata(arrayList);
    }

    private static com.google.android.exoplayer2.metadata.Metadata parseSmta(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (readInt < 14) {
                    return null;
                }
                parsableByteArray.skipBytes(5);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if (readUnsignedByte != 12 && readUnsignedByte != 13) {
                    return null;
                }
                float f = readUnsignedByte == 12 ? 240.0f : 120.0f;
                parsableByteArray.skipBytes(1);
                return new com.google.android.exoplayer2.metadata.Metadata(new com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry(f, parsableByteArray.readUnsignedByte()));
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    private static long parseMvhd(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData parseTkhd(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i = parseFullAtomVersion == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i3 < i) {
                if (parsableByteArray.getData()[position + i3] != -1) {
                    long readUnsignedInt = parseFullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                    if (readUnsignedInt != 0) {
                        j = readUnsignedInt;
                    }
                } else {
                    i3++;
                }
            } else {
                parsableByteArray.skipBytes(i);
                break;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i2 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i2 = 270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i2 = 180;
        }
        return new com.google.android.exoplayer2.extractor.mp4.AtomParsers.TkhdData(readInt, j, i2);
    }

    private static int parseHdlr(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static android.util.Pair<java.lang.Long, java.lang.String> parseMdhd(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 4 : 8);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return android.util.Pair.create(java.lang.Long.valueOf(readUnsignedInt), "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    private static com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData parseStsd(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2, java.lang.String str, com.google.android.exoplayer2.drm.DrmInitData drmInitData, boolean z) throws com.google.android.exoplayer2.ParserException {
        int i3;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData stsdData = new com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521) {
                i3 = position;
                parseVideoSampleEntry(parsableByteArray, readInt3, i3, readInt2, i, i2, drmInitData, stsdData, i4);
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667) {
                i3 = position;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, z, drmInitData, stsdData, i4);
            } else {
                if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, stsdData);
                } else if (readInt3 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray, readInt3, position, i, stsdData);
                } else if (readInt3 == 1667329389) {
                    stsdData.format = new com.google.android.exoplayer2.Format.Builder().setId(i).setSampleMimeType("application/x-camera-motion").build();
                }
                i3 = position;
            }
            parsableByteArray.setPosition(i3 + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, java.lang.String str, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        java.lang.String str2 = "application/ttml+xml";
        com.google.common.collect.ImmutableList immutableList = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableList = com.google.common.collect.ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new java.lang.IllegalStateException();
            }
        }
        stsdData.format = new com.google.android.exoplayer2.Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableList).build();
    }

    private static void parseVideoSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, com.google.android.exoplayer2.drm.DrmInitData drmInitData, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData stsdData, int i6) throws com.google.android.exoplayer2.ParserException {
        java.lang.String str;
        com.google.android.exoplayer2.drm.DrmInitData drmInitData2;
        int i7;
        int i8;
        byte[] bArr;
        float f;
        java.util.List<byte[]> list;
        java.lang.String str2;
        int i9 = i2;
        int i10 = i3;
        com.google.android.exoplayer2.drm.DrmInitData drmInitData3 = drmInitData;
        com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i9 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int i11 = i;
        if (i11 == 1701733238) {
            android.util.Pair<java.lang.Integer, com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i9, i10);
            if (parseSampleEntryEncryptionData != null) {
                i11 = ((java.lang.Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        java.lang.String str3 = "video/3gpp";
        if (i11 != 1831958048) {
            str = i11 == 1211250227 ? "video/3gpp" : null;
        } else {
            str = "video/mpeg";
        }
        float f2 = 1.0f;
        byte[] bArr2 = null;
        java.lang.String str4 = null;
        java.util.List<byte[]> list2 = null;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        java.nio.ByteBuffer byteBuffer = null;
        com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData esdsData = null;
        boolean z = false;
        while (true) {
            if (position - i9 >= i10) {
                drmInitData2 = drmInitData3;
                break;
            }
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            java.lang.String str5 = str3;
            int readInt = parsableByteArray.readInt();
            if (readInt == 0) {
                drmInitData2 = drmInitData3;
                if (parsableByteArray.getPosition() - i9 == i10) {
                    break;
                }
            } else {
                drmInitData2 = drmInitData3;
            }
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1635148611) {
                com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                com.google.android.exoplayer2.video.AvcConfig parse = com.google.android.exoplayer2.video.AvcConfig.parse(parsableByteArray);
                list2 = parse.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z) {
                    f2 = parse.pixelWidthHeightRatio;
                }
                str4 = parse.codecs;
                str2 = "video/avc";
            } else if (readInt2 == 1752589123) {
                com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                com.google.android.exoplayer2.video.HevcConfig parse2 = com.google.android.exoplayer2.video.HevcConfig.parse(parsableByteArray);
                list2 = parse2.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                if (!z) {
                    f2 = parse2.pixelWidthHeightRatio;
                }
                str4 = parse2.codecs;
                str2 = "video/hevc";
            } else {
                if (readInt2 == 1685480259 || readInt2 == 1685485123) {
                    i7 = readUnsignedShort2;
                    i8 = i11;
                    bArr = bArr2;
                    f = f2;
                    list = list2;
                    com.google.android.exoplayer2.video.DolbyVisionConfig parse3 = com.google.android.exoplayer2.video.DolbyVisionConfig.parse(parsableByteArray);
                    if (parse3 != null) {
                        str4 = parse3.codecs;
                        str = "video/dolby-vision";
                    }
                } else if (readInt2 == 1987076931) {
                    com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(str == null, null);
                    str2 = i11 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (readInt2 == 1635135811) {
                    com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(str == null, null);
                    str2 = "video/av01";
                } else if (readInt2 == 1668050025) {
                    if (byteBuffer == null) {
                        byteBuffer = allocateHdrStaticInfo();
                    }
                    java.nio.ByteBuffer byteBuffer2 = byteBuffer;
                    byteBuffer2.position(21);
                    byteBuffer2.putShort(parsableByteArray.readShort());
                    byteBuffer2.putShort(parsableByteArray.readShort());
                    byteBuffer = byteBuffer2;
                    i7 = readUnsignedShort2;
                    i8 = i11;
                    position += readInt;
                    i9 = i2;
                    i10 = i3;
                    stsdData2 = stsdData;
                    str3 = str5;
                    drmInitData3 = drmInitData2;
                    i11 = i8;
                    readUnsignedShort2 = i7;
                } else if (readInt2 == 1835295606) {
                    if (byteBuffer == null) {
                        byteBuffer = allocateHdrStaticInfo();
                    }
                    java.nio.ByteBuffer byteBuffer3 = byteBuffer;
                    short readShort = parsableByteArray.readShort();
                    short readShort2 = parsableByteArray.readShort();
                    short readShort3 = parsableByteArray.readShort();
                    i8 = i11;
                    short readShort4 = parsableByteArray.readShort();
                    short readShort5 = parsableByteArray.readShort();
                    java.util.List<byte[]> list3 = list2;
                    short readShort6 = parsableByteArray.readShort();
                    byte[] bArr3 = bArr2;
                    short readShort7 = parsableByteArray.readShort();
                    float f3 = f2;
                    short readShort8 = parsableByteArray.readShort();
                    long readUnsignedInt = parsableByteArray.readUnsignedInt();
                    long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
                    i7 = readUnsignedShort2;
                    byteBuffer3.position(1);
                    byteBuffer3.putShort(readShort5);
                    byteBuffer3.putShort(readShort6);
                    byteBuffer3.putShort(readShort);
                    byteBuffer3.putShort(readShort2);
                    byteBuffer3.putShort(readShort3);
                    byteBuffer3.putShort(readShort4);
                    byteBuffer3.putShort(readShort7);
                    byteBuffer3.putShort(readShort8);
                    byteBuffer3.putShort((short) (readUnsignedInt / 10000));
                    byteBuffer3.putShort((short) (readUnsignedInt2 / 10000));
                    byteBuffer = byteBuffer3;
                    list2 = list3;
                    bArr2 = bArr3;
                    f2 = f3;
                    position += readInt;
                    i9 = i2;
                    i10 = i3;
                    stsdData2 = stsdData;
                    str3 = str5;
                    drmInitData3 = drmInitData2;
                    i11 = i8;
                    readUnsignedShort2 = i7;
                } else {
                    i7 = readUnsignedShort2;
                    i8 = i11;
                    bArr = bArr2;
                    f = f2;
                    list = list2;
                    if (readInt2 == 1681012275) {
                        com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(str == null, null);
                        str = str5;
                    } else if (readInt2 == 1702061171) {
                        com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(str == null, null);
                        esdsData = parseEsdsFromParent(parsableByteArray, position2);
                        java.lang.String str6 = esdsData.mimeType;
                        byte[] bArr4 = esdsData.initializationData;
                        list2 = bArr4 != null ? com.google.common.collect.ImmutableList.of(bArr4) : list;
                        str = str6;
                        bArr2 = bArr;
                        f2 = f;
                        position += readInt;
                        i9 = i2;
                        i10 = i3;
                        stsdData2 = stsdData;
                        str3 = str5;
                        drmInitData3 = drmInitData2;
                        i11 = i8;
                        readUnsignedShort2 = i7;
                    } else if (readInt2 == 1885434736) {
                        f2 = parsePaspFromParent(parsableByteArray, position2);
                        list2 = list;
                        bArr2 = bArr;
                        z = true;
                        position += readInt;
                        i9 = i2;
                        i10 = i3;
                        stsdData2 = stsdData;
                        str3 = str5;
                        drmInitData3 = drmInitData2;
                        i11 = i8;
                        readUnsignedShort2 = i7;
                    } else if (readInt2 == 1937126244) {
                        bArr2 = parseProjFromParent(parsableByteArray, position2, readInt);
                        list2 = list;
                        f2 = f;
                        position += readInt;
                        i9 = i2;
                        i10 = i3;
                        stsdData2 = stsdData;
                        str3 = str5;
                        drmInitData3 = drmInitData2;
                        i11 = i8;
                        readUnsignedShort2 = i7;
                    } else if (readInt2 == 1936995172) {
                        int readUnsignedByte = parsableByteArray.readUnsignedByte();
                        parsableByteArray.skipBytes(3);
                        if (readUnsignedByte == 0) {
                            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                            if (readUnsignedByte2 == 0) {
                                i12 = 0;
                            } else if (readUnsignedByte2 == 1) {
                                i12 = 1;
                            } else if (readUnsignedByte2 == 2) {
                                i12 = 2;
                            } else if (readUnsignedByte2 == 3) {
                                i12 = 3;
                            }
                        }
                    } else if (readInt2 == 1668246642) {
                        int readInt3 = parsableByteArray.readInt();
                        if (readInt3 == TYPE_nclx || readInt3 == TYPE_nclc) {
                            int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                            int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                            parsableByteArray.skipBytes(2);
                            boolean z2 = readInt == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                            i13 = com.google.android.exoplayer2.video.ColorInfo.isoColorPrimariesToColorSpace(readUnsignedShort3);
                            i14 = z2 ? 1 : 2;
                            i15 = com.google.android.exoplayer2.video.ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedShort4);
                        } else {
                            com.google.android.exoplayer2.util.Log.w(TAG, "Unsupported color type: " + com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(readInt3));
                        }
                    }
                }
                list2 = list;
                bArr2 = bArr;
                f2 = f;
                position += readInt;
                i9 = i2;
                i10 = i3;
                stsdData2 = stsdData;
                str3 = str5;
                drmInitData3 = drmInitData2;
                i11 = i8;
                readUnsignedShort2 = i7;
            }
            str = str2;
            i7 = readUnsignedShort2;
            i8 = i11;
            position += readInt;
            i9 = i2;
            i10 = i3;
            stsdData2 = stsdData;
            str3 = str5;
            drmInitData3 = drmInitData2;
            i11 = i8;
            readUnsignedShort2 = i7;
        }
        int i16 = readUnsignedShort2;
        byte[] bArr5 = bArr2;
        float f4 = f2;
        java.util.List<byte[]> list4 = list2;
        if (str == null) {
            return;
        }
        com.google.android.exoplayer2.Format.Builder drmInitData4 = new com.google.android.exoplayer2.Format.Builder().setId(i4).setSampleMimeType(str).setCodecs(str4).setWidth(readUnsignedShort).setHeight(i16).setPixelWidthHeightRatio(f4).setRotationDegrees(i5).setProjectionData(bArr5).setStereoMode(i12).setInitializationData(list4).setDrmInitData(drmInitData2);
        int i17 = i13;
        int i18 = i14;
        int i19 = i15;
        if (i17 != -1 || i18 != -1 || i19 != -1 || byteBuffer != null) {
            drmInitData4.setColorInfo(new com.google.android.exoplayer2.video.ColorInfo(i17, i18, i19, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (esdsData != null) {
            drmInitData4.setAverageBitrate(com.google.common.primitives.Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(com.google.common.primitives.Ints.saturatedCast(esdsData.peakBitrate));
        }
        stsdData.format = drmInitData4.build();
    }

    private static java.nio.ByteBuffer allocateHdrStaticInfo() {
        return java.nio.ByteBuffer.allocate(25).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private static void parseMetaDataSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2, int i3, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            java.lang.String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new com.google.android.exoplayer2.Format.Builder().setId(i3).setSampleMimeType(readNullTerminatedString).build();
            }
        }
    }

    private static android.util.Pair<long[], long[]> parseEdts(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom) {
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1701606260);
        if (leafAtomOfType == null) {
            return null;
        }
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            jArr[i] = parseFullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = parseFullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new java.lang.IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return android.util.Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseAudioSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, java.lang.String str, boolean z, com.google.android.exoplayer2.drm.DrmInitData drmInitData, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData stsdData, int i5) throws com.google.android.exoplayer2.ParserException {
        int i6;
        int readUnsignedFixedPoint1616;
        int readInt;
        int i7;
        java.lang.String str2;
        java.lang.String str3;
        int i8;
        int i9 = i2;
        int i10 = i3;
        com.google.android.exoplayer2.drm.DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i9 + 16);
        if (z) {
            i6 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            readInt = parsableByteArray.readInt();
            if (i6 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i7 = readUnsignedShort;
        } else {
            if (i6 != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            readUnsignedFixedPoint1616 = (int) java.lang.Math.round(parsableByteArray.readDouble());
            i7 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
            readInt = 0;
        }
        int position = parsableByteArray.getPosition();
        int i11 = i;
        if (i11 == 1701733217) {
            android.util.Pair<java.lang.Integer, com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i9, i10);
            if (parseSampleEntryEncryptionData != null) {
                i11 = ((java.lang.Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.copyWithSchemeType(((com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        if (i11 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i11 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i11 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i11 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i11 == 1685353320 || i11 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i11 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i11 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i11 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i11 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            str3 = "audio/raw";
            if (i11 == 1819304813 || i11 == 1936684916) {
                i8 = 2;
            } else if (i11 == 1953984371) {
                i8 = 268435456;
            } else if (i11 == 778924082 || i11 == 778924083) {
                str2 = "audio/mpeg";
            } else if (i11 == 1835557169) {
                str2 = "audio/mha1";
            } else if (i11 == 1835560241) {
                str2 = "audio/mhm1";
            } else if (i11 == 1634492771) {
                str2 = "audio/alac";
            } else if (i11 == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (i11 == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (i11 == 1332770163) {
                str2 = "audio/opus";
            } else if (i11 == 1716281667) {
                str2 = "audio/flac";
            } else if (i11 == 1835823201) {
                str2 = "audio/true-hd";
            } else {
                i8 = -1;
                str3 = null;
            }
            java.lang.String str4 = str3;
            com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData esdsData = null;
            java.lang.String str5 = null;
            java.util.List<byte[]> list = null;
            while (position - i9 < i10) {
                parsableByteArray.setPosition(position);
                int readInt2 = parsableByteArray.readInt();
                com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
                int readInt3 = parsableByteArray.readInt();
                if (readInt3 == 1835557187) {
                    int i12 = readInt2 - 13;
                    byte[] bArr = new byte[i12];
                    parsableByteArray.setPosition(position + 13);
                    parsableByteArray.readBytes(bArr, 0, i12);
                    list = com.google.common.collect.ImmutableList.of(bArr);
                } else {
                    if (readInt3 == 1702061171 || (z && readInt3 == 2002876005)) {
                        int findBoxPosition = readInt3 == 1702061171 ? position : findBoxPosition(parsableByteArray, 1702061171, position, readInt2);
                        if (findBoxPosition != -1) {
                            esdsData = parseEsdsFromParent(parsableByteArray, findBoxPosition);
                            str4 = esdsData.mimeType;
                            byte[] bArr2 = esdsData.initializationData;
                            if (bArr2 != null) {
                                if ("audio/mp4a-latm".equals(str4)) {
                                    com.google.android.exoplayer2.audio.AacUtil.Config parseAudioSpecificConfig = com.google.android.exoplayer2.audio.AacUtil.parseAudioSpecificConfig(bArr2);
                                    readUnsignedFixedPoint1616 = parseAudioSpecificConfig.sampleRateHz;
                                    i7 = parseAudioSpecificConfig.channelCount;
                                    str5 = parseAudioSpecificConfig.codecs;
                                }
                                list = com.google.common.collect.ImmutableList.of(bArr2);
                            }
                        }
                    } else if (readInt3 == 1684103987) {
                        parsableByteArray.setPosition(position + 8);
                        stsdData.format = com.google.android.exoplayer2.audio.Ac3Util.parseAc3AnnexFFormat(parsableByteArray, java.lang.Integer.toString(i4), str, drmInitData2);
                    } else if (readInt3 == 1684366131) {
                        parsableByteArray.setPosition(position + 8);
                        stsdData.format = com.google.android.exoplayer2.audio.Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, java.lang.Integer.toString(i4), str, drmInitData2);
                    } else if (readInt3 == 1684103988) {
                        parsableByteArray.setPosition(position + 8);
                        stsdData.format = com.google.android.exoplayer2.audio.Ac4Util.parseAc4AnnexEFormat(parsableByteArray, java.lang.Integer.toString(i4), str, drmInitData2);
                    } else if (readInt3 == 1684892784) {
                        if (readInt <= 0) {
                            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + readInt, null);
                        }
                        readUnsignedFixedPoint1616 = readInt;
                        i7 = 2;
                    } else if (readInt3 == 1684305011) {
                        stsdData.format = new com.google.android.exoplayer2.Format.Builder().setId(i4).setSampleMimeType(str4).setChannelCount(i7).setSampleRate(readUnsignedFixedPoint1616).setDrmInitData(drmInitData2).setLanguage(str).build();
                    } else if (readInt3 == 1682927731) {
                        int i13 = readInt2 - 8;
                        byte[] bArr3 = opusMagic;
                        byte[] copyOf = java.util.Arrays.copyOf(bArr3, bArr3.length + i13);
                        parsableByteArray.setPosition(position + 8);
                        parsableByteArray.readBytes(copyOf, bArr3.length, i13);
                        list = com.google.android.exoplayer2.audio.OpusUtil.buildInitializationData(copyOf);
                    } else if (readInt3 == 1684425825) {
                        byte[] bArr4 = new byte[readInt2 - 8];
                        bArr4[0] = 102;
                        bArr4[1] = 76;
                        bArr4[2] = 97;
                        bArr4[3] = 67;
                        parsableByteArray.setPosition(position + 12);
                        parsableByteArray.readBytes(bArr4, 4, readInt2 - 12);
                        list = com.google.common.collect.ImmutableList.of(bArr4);
                    } else if (readInt3 == 1634492771) {
                        int i14 = readInt2 - 12;
                        byte[] bArr5 = new byte[i14];
                        parsableByteArray.setPosition(position + 12);
                        parsableByteArray.readBytes(bArr5, 0, i14);
                        android.util.Pair<java.lang.Integer, java.lang.Integer> parseAlacAudioSpecificConfig = com.google.android.exoplayer2.util.CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr5);
                        int intValue = ((java.lang.Integer) parseAlacAudioSpecificConfig.first).intValue();
                        int intValue2 = ((java.lang.Integer) parseAlacAudioSpecificConfig.second).intValue();
                        list = com.google.common.collect.ImmutableList.of(bArr5);
                        readUnsignedFixedPoint1616 = intValue;
                        i7 = intValue2;
                    }
                    position += readInt2;
                    i9 = i2;
                    i10 = i3;
                }
                position += readInt2;
                i9 = i2;
                i10 = i3;
            }
            if (stsdData.format == null || str4 == null) {
            }
            com.google.android.exoplayer2.Format.Builder language = new com.google.android.exoplayer2.Format.Builder().setId(i4).setSampleMimeType(str4).setCodecs(str5).setChannelCount(i7).setSampleRate(readUnsignedFixedPoint1616).setPcmEncoding(i8).setInitializationData(list).setDrmInitData(drmInitData2).setLanguage(str);
            if (esdsData != null) {
                language.setAverageBitrate(com.google.common.primitives.Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(com.google.common.primitives.Ints.saturatedCast(esdsData.peakBitrate));
            }
            stsdData.format = language.build();
            return;
        }
        str3 = str2;
        i8 = -1;
        java.lang.String str42 = str3;
        com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData esdsData2 = null;
        java.lang.String str52 = null;
        java.util.List<byte[]> list2 = null;
        while (position - i9 < i10) {
        }
        if (stsdData.format == null) {
        }
    }

    private static int findBoxPosition(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2, int i3) throws com.google.android.exoplayer2.ParserException {
        int position = parsableByteArray.getPosition();
        com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData parseEsdsFromParent(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        java.lang.String mimeTypeFromMp4ObjectType = com.google.android.exoplayer2.util.MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        return new com.google.android.exoplayer2.extractor.mp4.AtomParsers.EsdsData(mimeTypeFromMp4ObjectType, bArr, readUnsignedInt2 > 0 ? readUnsignedInt2 : -1L, readUnsignedInt > 0 ? readUnsignedInt : -1L);
    }

    private static android.util.Pair<java.lang.Integer, com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox> parseSampleEntryEncryptionData(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2) throws com.google.android.exoplayer2.ParserException {
        android.util.Pair<java.lang.Integer, com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    static android.util.Pair<java.lang.Integer, com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox> parseCommonEncryptionSinfFromParent(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2) throws com.google.android.exoplayer2.ParserException {
        int i3 = i + 8;
        java.lang.String str = null;
        java.lang.Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = java.lang.Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
        com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
        com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(parseSchiFromParent != null, "tenc atom is mandatory");
        return android.util.Pair.create(num, (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) com.google.android.exoplayer2.util.Util.castNonNull(parseSchiFromParent));
    }

    private static com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox parseSchiFromParent(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2, java.lang.String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullAtomVersion = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = readUnsignedByte & 15;
                    i4 = (readUnsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += readInt;
        }
    }

    private static byte[] parseProjFromParent(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return java.util.Arrays.copyOfRange(parsableByteArray.getData(), i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static int parseExpandableClassSize(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[com.google.android.exoplayer2.util.Util.constrainValue(4, 0, length)] && jArr[com.google.android.exoplayer2.util.Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private AtomParsers() {
    }

    private static final class ChunkIterator {
        private final com.google.android.exoplayer2.util.ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final com.google.android.exoplayer2.util.ParsableByteArray stsc;

        public ChunkIterator(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray2, boolean z) throws com.google.android.exoplayer2.ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            com.google.android.exoplayer2.extractor.ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long readUnsignedInt;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                readUnsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                readUnsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = readUnsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public com.google.android.exoplayer2.Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[i];
        }
    }

    private static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final java.lang.String mimeType;
        private final long peakBitrate;

        public EsdsData(java.lang.String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    static final class StszSampleSizeBox implements com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox {
        private final com.google.android.exoplayer2.util.ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom, com.google.android.exoplayer2.Format format) {
            com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = com.google.android.exoplayer2.util.Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.extractor.mp4.AtomParsers.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    static final class Stz2SampleSizeBox implements com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox {
        private int currentByte;
        private final com.google.android.exoplayer2.util.ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom) {
            com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 == 0) {
                int readUnsignedByte = this.data.readUnsignedByte();
                this.currentByte = readUnsignedByte;
                return (readUnsignedByte & 240) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}
