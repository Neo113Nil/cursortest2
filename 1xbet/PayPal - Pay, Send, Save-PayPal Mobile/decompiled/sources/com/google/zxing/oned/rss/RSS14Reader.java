package com.google.zxing.oned.rss;

/* loaded from: classes9.dex */
public final class RSS14Reader extends com.google.zxing.oned.rss.AbstractRSSReader {
    private final java.util.List<com.google.zxing.oned.rss.Pair> possibleLeftPairs = new java.util.ArrayList();
    private final java.util.List<com.google.zxing.oned.rss.Pair> possibleRightPairs = new java.util.ArrayList();
    private static final int[] OUTSIDE_EVEN_TOTAL_SUBSET = {1, 10, 34, 70, 126};
    private static final int[] INSIDE_ODD_TOTAL_SUBSET = {4, 20, 48, 81};
    private static final int[] OUTSIDE_GSUM = {0, 161, 961, 2015, 2715};
    private static final int[] INSIDE_GSUM = {0, 336, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL, 1516};
    private static final int[] OUTSIDE_ODD_WIDEST = {8, 6, 4, 3, 1};
    private static final int[] INSIDE_ODD_WIDEST = {2, 4, 6, 8};
    private static final int[][] FINDER_PATTERNS = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    @Override // com.google.zxing.oned.OneDReader
    public final com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
        addOrTally(this.possibleLeftPairs, decodePair(bitArray, false, i, map));
        bitArray.reverse();
        addOrTally(this.possibleRightPairs, decodePair(bitArray, true, i, map));
        bitArray.reverse();
        for (com.google.zxing.oned.rss.Pair pair : this.possibleLeftPairs) {
            if (pair.getCount() > 1) {
                for (com.google.zxing.oned.rss.Pair pair2 : this.possibleRightPairs) {
                    if (pair2.getCount() > 1 && checkChecksum(pair, pair2)) {
                        return constructResult(pair, pair2);
                    }
                }
            }
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static void addOrTally(java.util.Collection<com.google.zxing.oned.rss.Pair> collection, com.google.zxing.oned.rss.Pair pair) {
        if (pair == null) {
            return;
        }
        for (com.google.zxing.oned.rss.Pair pair2 : collection) {
            if (pair2.getValue() == pair.getValue()) {
                pair2.incrementCount();
                return;
            }
        }
        collection.add(pair);
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public final void reset() {
        this.possibleLeftPairs.clear();
        this.possibleRightPairs.clear();
    }

    private static com.google.zxing.Result constructResult(com.google.zxing.oned.rss.Pair pair, com.google.zxing.oned.rss.Pair pair2) {
        java.lang.String valueOf = java.lang.String.valueOf((pair.getValue() * 4537077) + pair2.getValue());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        com.google.zxing.ResultPoint[] resultPoints = pair.getFinderPattern().getResultPoints();
        com.google.zxing.ResultPoint[] resultPoints2 = pair2.getFinderPattern().getResultPoints();
        com.google.zxing.Result result = new com.google.zxing.Result(sb.toString(), null, new com.google.zxing.ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, com.google.zxing.BarcodeFormat.RSS_14);
        result.putMetadata(com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]e0");
        return result;
    }

    private static boolean checkChecksum(com.google.zxing.oned.rss.Pair pair, com.google.zxing.oned.rss.Pair pair2) {
        int checksumPortion = pair.getChecksumPortion();
        int checksumPortion2 = pair2.getChecksumPortion();
        int value = (pair.getFinderPattern().getValue() * 9) + pair2.getFinderPattern().getValue();
        if (value > 72) {
            value--;
        }
        if (value > 8) {
            value--;
        }
        return (checksumPortion + (checksumPortion2 * 16)) % 79 == value;
    }

    private com.google.zxing.oned.rss.Pair decodePair(com.google.zxing.common.BitArray bitArray, boolean z, int i, java.util.Map<com.google.zxing.DecodeHintType, ?> map) {
        try {
            com.google.zxing.oned.rss.FinderPattern parseFoundFinderPattern = parseFoundFinderPattern(bitArray, i, z, findFinderPattern(bitArray, z));
            com.google.zxing.ResultPointCallback resultPointCallback = map == null ? null : (com.google.zxing.ResultPointCallback) map.get(com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (resultPointCallback != null) {
                int[] startEnd = parseFoundFinderPattern.getStartEnd();
                float f = ((startEnd[0] + startEnd[1]) - 1) / 2.0f;
                if (z) {
                    f = (bitArray.getSize() - 1) - f;
                }
                resultPointCallback.foundPossibleResultPoint(new com.google.zxing.ResultPoint(f, i));
            }
            com.google.zxing.oned.rss.DataCharacter decodeDataCharacter = decodeDataCharacter(bitArray, parseFoundFinderPattern, true);
            com.google.zxing.oned.rss.DataCharacter decodeDataCharacter2 = decodeDataCharacter(bitArray, parseFoundFinderPattern, false);
            return new com.google.zxing.oned.rss.Pair((decodeDataCharacter.getValue() * 1597) + decodeDataCharacter2.getValue(), decodeDataCharacter.getChecksumPortion() + (decodeDataCharacter2.getChecksumPortion() * 4), parseFoundFinderPattern);
        } catch (com.google.zxing.NotFoundException unused) {
            return null;
        }
    }

    private com.google.zxing.oned.rss.DataCharacter decodeDataCharacter(com.google.zxing.common.BitArray bitArray, com.google.zxing.oned.rss.FinderPattern finderPattern, boolean z) throws com.google.zxing.NotFoundException {
        int[] dataCharacterCounters = getDataCharacterCounters();
        java.util.Arrays.fill(dataCharacterCounters, 0);
        if (z) {
            recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            recordPattern(bitArray, finderPattern.getStartEnd()[1], dataCharacterCounters);
            int i = 0;
            for (int length = dataCharacterCounters.length - 1; i < length; length--) {
                int i2 = dataCharacterCounters[i];
                dataCharacterCounters[i] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i2;
                i++;
            }
        }
        int i3 = z ? 16 : 15;
        float sum = com.google.zxing.common.detector.MathUtils.sum(dataCharacterCounters) / i3;
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i4 = 0; i4 < dataCharacterCounters.length; i4++) {
            float f = dataCharacterCounters[i4] / sum;
            int i5 = (int) (0.5f + f);
            if (i5 <= 0) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                oddCounts[i6] = i5;
                oddRoundingErrors[i6] = f - i5;
            } else {
                evenCounts[i6] = i5;
                evenRoundingErrors[i6] = f - i5;
            }
        }
        adjustOddEvenCounts(z, i3);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            int i9 = oddCounts[length2];
            i7 = (i7 * 9) + i9;
            i8 += i9;
        }
        int i10 = 0;
        int i11 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            int i12 = evenCounts[length3];
            i10 = (i10 * 9) + i12;
            i11 += i12;
        }
        int i13 = i7 + (i10 * 3);
        if (!z) {
            if ((i11 & 1) != 0 || i11 > 10 || i11 < 4) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            int i14 = (10 - i11) / 2;
            int i15 = INSIDE_ODD_WIDEST[i14];
            return new com.google.zxing.oned.rss.DataCharacter((com.google.zxing.oned.rss.RSSUtils.getRSSvalue(evenCounts, 9 - i15, false) * INSIDE_ODD_TOTAL_SUBSET[i14]) + com.google.zxing.oned.rss.RSSUtils.getRSSvalue(oddCounts, i15, true) + INSIDE_GSUM[i14], i13);
        }
        if ((i8 & 1) != 0 || i8 > 12 || i8 < 4) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int i16 = (12 - i8) / 2;
        int i17 = OUTSIDE_ODD_WIDEST[i16];
        return new com.google.zxing.oned.rss.DataCharacter((com.google.zxing.oned.rss.RSSUtils.getRSSvalue(oddCounts, i17, false) * OUTSIDE_EVEN_TOTAL_SUBSET[i16]) + com.google.zxing.oned.rss.RSSUtils.getRSSvalue(evenCounts, 9 - i17, true) + OUTSIDE_GSUM[i16], i13);
    }

    private int[] findFinderPattern(com.google.zxing.common.BitArray bitArray, boolean z) throws com.google.zxing.NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            z2 = !bitArray.get(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        int i3 = i;
        while (i < size) {
            if (bitArray.get(i) != z2) {
                decodeFinderCounters[i2] = decodeFinderCounters[i2] + 1;
            } else {
                if (i2 != 3) {
                    i2++;
                } else {
                    if (isFinderPattern(decodeFinderCounters)) {
                        return new int[]{i3, i};
                    }
                    i3 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i2--;
                }
                decodeFinderCounters[i2] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private com.google.zxing.oned.rss.FinderPattern parseFoundFinderPattern(com.google.zxing.common.BitArray bitArray, int i, boolean z, int[] iArr) throws com.google.zxing.NotFoundException {
        int i2;
        int i3;
        boolean z2 = bitArray.get(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && z2 != bitArray.get(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int i6 = iArr[0];
        int[] decodeFinderCounters = getDecodeFinderCounters();
        java.lang.System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i6 - i5;
        int parseFinderValue = parseFinderValue(decodeFinderCounters, FINDER_PATTERNS);
        int i7 = iArr[1];
        if (z) {
            int size = bitArray.getSize();
            i2 = (bitArray.getSize() - 1) - i7;
            i3 = (size - 1) - i5;
        } else {
            i2 = i7;
            i3 = i5;
        }
        return new com.google.zxing.oned.rss.FinderPattern(parseFinderValue, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0041, code lost:
    
        r5 = false;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x003f, code lost:
    
        if (r1 < 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 < 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void adjustOddEvenCounts(boolean z, int i) throws com.google.zxing.NotFoundException {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int sum = com.google.zxing.common.detector.MathUtils.sum(getOddCounts());
        int sum2 = com.google.zxing.common.detector.MathUtils.sum(getEvenCounts());
        boolean z6 = true;
        if (z) {
            if (sum > 12) {
                z2 = false;
                z3 = true;
            } else if (sum < 4) {
                z3 = false;
                z2 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (sum2 <= 12) {
            }
            z4 = false;
            z5 = true;
        } else {
            if (sum > 11) {
                z2 = false;
                z3 = true;
            } else if (sum < 5) {
                z3 = false;
                z2 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (sum2 <= 10) {
            }
            z4 = false;
            z5 = true;
        }
        int i2 = (sum + sum2) - i;
        boolean z7 = (sum & 1) == z;
        boolean z8 = (sum2 & 1) == 1;
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                if (z7) {
                    if (z8) {
                        throw com.google.zxing.NotFoundException.getNotFoundInstance();
                    }
                } else {
                    if (!z8) {
                        throw com.google.zxing.NotFoundException.getNotFoundInstance();
                    }
                    z5 = true;
                    z6 = z3;
                }
            } else if (!z7) {
                if (z8) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                z6 = z3;
            } else {
                if (!z8) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                if (sum < sum2) {
                    z5 = true;
                    if (z6) {
                        if (z3) {
                            throw com.google.zxing.NotFoundException.getNotFoundInstance();
                        }
                        increment(getOddCounts(), getOddRoundingErrors());
                    }
                    if (z3) {
                        decrement(getOddCounts(), getOddRoundingErrors());
                    }
                    if (z4) {
                        if (z5) {
                            throw com.google.zxing.NotFoundException.getNotFoundInstance();
                        }
                        increment(getEvenCounts(), getOddRoundingErrors());
                    }
                    if (z5) {
                        decrement(getEvenCounts(), getEvenRoundingErrors());
                        return;
                    }
                    return;
                }
                z4 = true;
            }
        } else if (z7) {
            if (z8) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            if (z6) {
            }
            if (z3) {
            }
            if (z4) {
            }
            if (z5) {
            }
        } else {
            if (!z8) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            z4 = true;
            z6 = z3;
        }
        z3 = z6;
        z6 = z2;
        if (z6) {
        }
        if (z3) {
        }
        if (z4) {
        }
        if (z5) {
        }
    }
}
