package com.google.zxing.oned.rss;

/* loaded from: classes4.dex */
public final class RSS14Reader extends com.google.zxing.oned.rss.AbstractRSSReader {
    private final java.util.List<com.google.zxing.oned.rss.Pair> possibleLeftPairs = new java.util.ArrayList();
    private final java.util.List<com.google.zxing.oned.rss.Pair> possibleRightPairs = new java.util.ArrayList();
    private static final int[] OUTSIDE_EVEN_TOTAL_SUBSET = {1, 10, 34, 70, 126};
    private static final int[] INSIDE_ODD_TOTAL_SUBSET = {4, 20, 48, 81};
    private static final int[] OUTSIDE_GSUM = {0, 161, 961, 2015, 2715};
    private static final int[] INSIDE_GSUM = {0, 336, com.ironsource.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 1516};
    private static final int[] OUTSIDE_ODD_WIDEST = {8, 6, 4, 3, 1};
    private static final int[] INSIDE_ODD_WIDEST = {2, 4, 6, 8};
    private static final int[][] FINDER_PATTERNS = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    @Override // com.google.zxing.oned.OneDReader
    public com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
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
    public void reset() {
        this.possibleLeftPairs.clear();
        this.possibleRightPairs.clear();
    }

    private static com.google.zxing.Result constructResult(com.google.zxing.oned.rss.Pair pair, com.google.zxing.oned.rss.Pair pair2) {
        java.lang.String valueOf = java.lang.String.valueOf((pair.getValue() * 4537077) + pair2.getValue());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
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
        return new com.google.zxing.Result(sb.toString(), null, new com.google.zxing.ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, com.google.zxing.BarcodeFormat.RSS_14);
    }

    private static boolean checkChecksum(com.google.zxing.oned.rss.Pair pair, com.google.zxing.oned.rss.Pair pair2) {
        int checksumPortion = (pair.getChecksumPortion() + (pair2.getChecksumPortion() * 16)) % 79;
        int value = (pair.getFinderPattern().getValue() * 9) + pair2.getFinderPattern().getValue();
        if (value > 72) {
            value--;
        }
        if (value > 8) {
            value--;
        }
        return checksumPortion == value;
    }

    private com.google.zxing.oned.rss.Pair decodePair(com.google.zxing.common.BitArray bitArray, boolean z, int i, java.util.Map<com.google.zxing.DecodeHintType, ?> map) {
        try {
            com.google.zxing.oned.rss.FinderPattern parseFoundFinderPattern = parseFoundFinderPattern(bitArray, i, z, findFinderPattern(bitArray, z));
            com.google.zxing.ResultPointCallback resultPointCallback = map == null ? null : (com.google.zxing.ResultPointCallback) map.get(com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (resultPointCallback != null) {
                float f = (r1[0] + r1[1]) / 2.0f;
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
        for (int i = 0; i < dataCharacterCounters.length; i++) {
            dataCharacterCounters[i] = 0;
        }
        if (z) {
            recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            recordPattern(bitArray, finderPattern.getStartEnd()[1] + 1, dataCharacterCounters);
            int i2 = 0;
            for (int length = dataCharacterCounters.length - 1; i2 < length; length--) {
                int i3 = dataCharacterCounters[i2];
                dataCharacterCounters[i2] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i3;
                i2++;
            }
        }
        int i4 = z ? 16 : 15;
        float sum = com.google.zxing.common.detector.MathUtils.sum(dataCharacterCounters) / i4;
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i5 = 0; i5 < dataCharacterCounters.length; i5++) {
            float f = dataCharacterCounters[i5] / sum;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                oddCounts[i7] = i6;
                oddRoundingErrors[i7] = f - i6;
            } else {
                evenCounts[i7] = i6;
                evenRoundingErrors[i7] = f - i6;
            }
        }
        adjustOddEvenCounts(z, i4);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            int i10 = oddCounts[length2];
            i8 = (i8 * 9) + i10;
            i9 += i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            int i13 = evenCounts[length3];
            i11 = (i11 * 9) + i13;
            i12 += i13;
        }
        int i14 = i8 + (i11 * 3);
        if (!z) {
            if ((i12 & 1) != 0 || i12 > 10 || i12 < 4) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            int i15 = (10 - i12) / 2;
            int i16 = INSIDE_ODD_WIDEST[i15];
            return new com.google.zxing.oned.rss.DataCharacter((com.google.zxing.oned.rss.RSSUtils.getRSSvalue(evenCounts, 9 - i16, false) * INSIDE_ODD_TOTAL_SUBSET[i15]) + com.google.zxing.oned.rss.RSSUtils.getRSSvalue(oddCounts, i16, true) + INSIDE_GSUM[i15], i14);
        }
        if ((i9 & 1) != 0 || i9 > 12 || i9 < 4) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int i17 = (12 - i9) / 2;
        int i18 = OUTSIDE_ODD_WIDEST[i17];
        return new com.google.zxing.oned.rss.DataCharacter((com.google.zxing.oned.rss.RSSUtils.getRSSvalue(oddCounts, i18, false) * OUTSIDE_EVEN_TOTAL_SUBSET[i17]) + com.google.zxing.oned.rss.RSSUtils.getRSSvalue(evenCounts, 9 - i18, true) + OUTSIDE_GSUM[i17], i14);
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
        int i2 = i;
        int i3 = 0;
        while (i < size) {
            if (bitArray.get(i) != z2) {
                decodeFinderCounters[i3] = decodeFinderCounters[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else {
                    if (isFinderPattern(decodeFinderCounters)) {
                        return new int[]{i2, i};
                    }
                    i2 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i3--;
                }
                decodeFinderCounters[i3] = 1;
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
        int i6 = iArr[0] - i5;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        java.lang.System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i6;
        int parseFinderValue = parseFinderValue(decodeFinderCounters, FINDER_PATTERNS);
        int i7 = iArr[1];
        if (z) {
            int size = (bitArray.getSize() - 1) - i5;
            i2 = (bitArray.getSize() - 1) - i7;
            i3 = size;
        } else {
            i2 = i7;
            i3 = i5;
        }
        return new com.google.zxing.oned.rss.FinderPattern(parseFinderValue, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x003f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r1 < 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x003d, code lost:
    
        if (r1 < 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r5 = false;
     */
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
            } else {
                z2 = sum < 4;
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
            } else {
                z2 = sum < 5;
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
        if (i2 == 1) {
            if (z7) {
                if (z8) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                z6 = z2;
                z3 = true;
            } else {
                if (!z8) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                z6 = z2;
                z5 = true;
            }
        } else if (i2 == -1) {
            if (z7) {
                if (z8) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
            } else {
                if (!z8) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                z6 = z2;
                z4 = true;
            }
        } else {
            if (i2 != 0) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            if (z7) {
                if (!z8) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                if (sum >= sum2) {
                    z6 = z2;
                    z4 = true;
                    z3 = true;
                }
                z5 = true;
            } else {
                if (z8) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                z6 = z2;
            }
        }
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
        }
    }
}
