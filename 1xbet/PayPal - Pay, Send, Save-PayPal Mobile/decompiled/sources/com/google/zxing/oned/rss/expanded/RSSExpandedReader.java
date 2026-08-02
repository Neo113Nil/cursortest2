package com.google.zxing.oned.rss.expanded;

/* loaded from: classes9.dex */
public final class RSSExpandedReader extends com.google.zxing.oned.rss.AbstractRSSReader {
    private static final float DATA_CHARACTER_MODULES = 17.0f;
    private static final float FINDER_PATTERN_MODULES = 15.0f;
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final float MAX_FINDER_PATTERN_DISTANCE_VARIANCE = 0.1f;
    private static final int MAX_PAIRS = 11;
    private final java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> pairs = new java.util.ArrayList(11);
    private final java.util.List<com.google.zxing.oned.rss.expanded.ExpandedRow> rows = new java.util.ArrayList();
    private final int[] startEnd = new int[2];
    private boolean startFromEven;
    private static final int[] SYMBOL_WIDEST = {7, 5, 4, 3, 1};
    private static final int[] EVEN_TOTAL_SUBSET = {4, 20, 52, 104, 204};
    private static final int[] GSUM = {0, 348, 1388, 2948, 3988};
    private static final int[][] FINDER_PATTERNS = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] WEIGHTS = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 118, 143, 7, 21, 63}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 145, 13, 39, 117, 140, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 85, 44, 132}, new int[]{185, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 52, 156}, new int[]{46, 138, 203, 187, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 206, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 166}, new int[]{76, 17, 51, 153, 37, 111, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, new int[]{109, 116, 137, 200, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 112, 125, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, new int[]{70, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, 202, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 130, 179, 115}, new int[]{134, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 151, 31, 93, 68, 204, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, new int[]{148, 22, 66, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 94, 71, 2}, new int[]{6, 18, 54, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, new int[]{161, 61, 183, 127, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, 160, 58, 174, 100, 89}};
    private static final int[][] FINDER_PATTERN_SEQUENCES = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    @Override // com.google.zxing.oned.OneDReader
    public final com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        this.startFromEven = false;
        try {
            return constructResult(decodeRow2pairs(i, bitArray));
        } catch (com.google.zxing.NotFoundException unused) {
            this.startFromEven = true;
            return constructResult(decodeRow2pairs(i, bitArray));
        }
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public final void reset() {
        this.pairs.clear();
        this.rows.clear();
    }

    final java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> decodeRow2pairs(int i, com.google.zxing.common.BitArray bitArray) throws com.google.zxing.NotFoundException {
        this.pairs.clear();
        boolean z = false;
        while (!z) {
            try {
                java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list = this.pairs;
                list.add(retrieveNextPair(bitArray, list, i));
            } catch (com.google.zxing.NotFoundException e) {
                if (this.pairs.isEmpty()) {
                    throw e;
                }
                z = true;
            }
        }
        if (checkChecksum() && isValidSequence(this.pairs, true)) {
            return this.pairs;
        }
        boolean isEmpty = this.rows.isEmpty();
        storeRow(i);
        if (!isEmpty) {
            java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> checkRows = checkRows(false);
            if (checkRows != null) {
                return checkRows;
            }
            java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> checkRows2 = checkRows(true);
            if (checkRows2 != null) {
                return checkRows2;
            }
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> checkRows(boolean z) {
        java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list = null;
        if (this.rows.size() > 25) {
            this.rows.clear();
            return null;
        }
        this.pairs.clear();
        if (z) {
            java.util.Collections.reverse(this.rows);
        }
        try {
            list = checkRows(new java.util.ArrayList(), 0);
        } catch (com.google.zxing.NotFoundException unused) {
        }
        if (z) {
            java.util.Collections.reverse(this.rows);
        }
        return list;
    }

    private java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> checkRows(java.util.List<com.google.zxing.oned.rss.expanded.ExpandedRow> list, int i) throws com.google.zxing.NotFoundException {
        while (i < this.rows.size()) {
            com.google.zxing.oned.rss.expanded.ExpandedRow expandedRow = this.rows.get(i);
            this.pairs.addAll(expandedRow.getPairs());
            int size = expandedRow.getPairs().size();
            if (isValidSequence(this.pairs, false)) {
                if (checkChecksum()) {
                    return this.pairs;
                }
                list.add(expandedRow);
                try {
                    return checkRows(list, i + 1);
                } catch (com.google.zxing.NotFoundException unused) {
                    list.remove(list.size() - 1);
                    this.pairs.subList(this.pairs.size() - size, this.pairs.size()).clear();
                }
            } else {
                java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list2 = this.pairs;
                list2.subList(list2.size() - size, this.pairs.size()).clear();
            }
            i++;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean isValidSequence(java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list, boolean z) {
        int i;
        for (int[] iArr : FINDER_PATTERN_SEQUENCES) {
            int size = list.size();
            int length = iArr.length;
            if (z) {
                if (size != length) {
                    continue;
                }
                for (0; i < list.size(); i + 1) {
                    i = list.get(i).getFinderPattern().getValue() == iArr[i] ? i + 1 : 0;
                }
                return true;
            }
            if (size > length) {
                continue;
            }
            while (i < list.size()) {
            }
            return true;
        }
        return false;
    }

    private static boolean mayFollow(java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list, int i) {
        int i2;
        if (list.isEmpty()) {
            return true;
        }
        for (int[] iArr : FINDER_PATTERN_SEQUENCES) {
            if (list.size() + 1 <= iArr.length) {
                for (int size = list.size(); size < iArr.length; size++) {
                    if (iArr[size] == i) {
                        for (0; i2 < list.size(); i2 + 1) {
                            i2 = iArr[(size - i2) - 1] == list.get((list.size() - i2) - 1).getFinderPattern().getValue() ? i2 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void storeRow(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= this.rows.size()) {
                break;
            }
            com.google.zxing.oned.rss.expanded.ExpandedRow expandedRow = this.rows.get(i2);
            if (expandedRow.getRowNumber() > i) {
                if (expandedRow.isEquivalent(this.pairs)) {
                    return;
                }
            } else {
                z = expandedRow.isEquivalent(this.pairs);
                i2++;
            }
        }
        if (z || isPartialRow(this.pairs, this.rows)) {
            return;
        }
        this.rows.add(i2, new com.google.zxing.oned.rss.expanded.ExpandedRow(this.pairs, i));
        removePartialRows(this.pairs, this.rows);
    }

    private static void removePartialRows(java.util.Collection<com.google.zxing.oned.rss.expanded.ExpandedPair> collection, java.util.Collection<com.google.zxing.oned.rss.expanded.ExpandedRow> collection2) {
        java.util.Iterator<com.google.zxing.oned.rss.expanded.ExpandedRow> it = collection2.iterator();
        while (it.hasNext()) {
            com.google.zxing.oned.rss.expanded.ExpandedRow next = it.next();
            if (next.getPairs().size() != collection.size()) {
                java.util.Iterator<com.google.zxing.oned.rss.expanded.ExpandedPair> it2 = next.getPairs().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!collection.contains(it2.next())) {
                            break;
                        }
                    } else {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }

    private static boolean isPartialRow(java.lang.Iterable<com.google.zxing.oned.rss.expanded.ExpandedPair> iterable, java.lang.Iterable<com.google.zxing.oned.rss.expanded.ExpandedRow> iterable2) {
        for (com.google.zxing.oned.rss.expanded.ExpandedRow expandedRow : iterable2) {
            for (com.google.zxing.oned.rss.expanded.ExpandedPair expandedPair : iterable) {
                java.util.Iterator<com.google.zxing.oned.rss.expanded.ExpandedPair> it = expandedRow.getPairs().iterator();
                while (it.hasNext()) {
                    if (expandedPair.equals(it.next())) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    final java.util.List<com.google.zxing.oned.rss.expanded.ExpandedRow> getRows() {
        return this.rows;
    }

    static com.google.zxing.Result constructResult(java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        java.lang.String parseInformation = com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder.createDecoder(com.google.zxing.oned.rss.expanded.BitArrayBuilder.buildBitArray(list)).parseInformation();
        com.google.zxing.ResultPoint[] resultPoints = list.get(0).getFinderPattern().getResultPoints();
        com.google.zxing.ResultPoint[] resultPoints2 = list.get(list.size() - 1).getFinderPattern().getResultPoints();
        com.google.zxing.Result result = new com.google.zxing.Result(parseInformation, null, new com.google.zxing.ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, com.google.zxing.BarcodeFormat.RSS_EXPANDED);
        result.putMetadata(com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]e0");
        return result;
    }

    private boolean checkChecksum() {
        com.google.zxing.oned.rss.expanded.ExpandedPair expandedPair = this.pairs.get(0);
        com.google.zxing.oned.rss.DataCharacter leftChar = expandedPair.getLeftChar();
        com.google.zxing.oned.rss.DataCharacter rightChar = expandedPair.getRightChar();
        if (rightChar == null) {
            return false;
        }
        int checksumPortion = rightChar.getChecksumPortion();
        int i = 2;
        for (int i2 = 1; i2 < this.pairs.size(); i2++) {
            com.google.zxing.oned.rss.expanded.ExpandedPair expandedPair2 = this.pairs.get(i2);
            checksumPortion += expandedPair2.getLeftChar().getChecksumPortion();
            com.google.zxing.oned.rss.DataCharacter rightChar2 = expandedPair2.getRightChar();
            if (rightChar2 != null) {
                checksumPortion += rightChar2.getChecksumPortion();
                i += 2;
            } else {
                i++;
            }
        }
        return ((i + (-4)) * 211) + (checksumPortion % 211) == leftChar.getValue();
    }

    private static int getNextSecondBar(com.google.zxing.common.BitArray bitArray, int i) {
        if (bitArray.get(i)) {
            return bitArray.getNextSet(bitArray.getNextUnset(i));
        }
        return bitArray.getNextUnset(bitArray.getNextSet(i));
    }

    final com.google.zxing.oned.rss.expanded.ExpandedPair retrieveNextPair(com.google.zxing.common.BitArray bitArray, java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list, int i) throws com.google.zxing.NotFoundException {
        com.google.zxing.oned.rss.FinderPattern parseFoundFinderPattern;
        boolean z = list.size() % 2 == 0;
        if (this.startFromEven) {
            z = !z;
        }
        com.google.zxing.oned.rss.DataCharacter dataCharacter = null;
        int i2 = -1;
        boolean z2 = true;
        com.google.zxing.oned.rss.DataCharacter dataCharacter2 = null;
        do {
            findNextPair(bitArray, list, i2);
            parseFoundFinderPattern = parseFoundFinderPattern(bitArray, i, z, list);
            if (parseFoundFinderPattern == null) {
                i2 = getNextSecondBar(bitArray, this.startEnd[0]);
            } else {
                try {
                    dataCharacter2 = decodeDataCharacter(bitArray, parseFoundFinderPattern, z, true);
                    z2 = false;
                } catch (com.google.zxing.NotFoundException unused) {
                    i2 = getNextSecondBar(bitArray, this.startEnd[0]);
                }
            }
        } while (z2);
        if (!list.isEmpty() && list.get(list.size() - 1).mustBeLast()) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        try {
            dataCharacter = decodeDataCharacter(bitArray, parseFoundFinderPattern, z, false);
        } catch (com.google.zxing.NotFoundException unused2) {
        }
        return new com.google.zxing.oned.rss.expanded.ExpandedPair(dataCharacter2, dataCharacter, parseFoundFinderPattern);
    }

    private void findNextPair(com.google.zxing.common.BitArray bitArray, java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list, int i) throws com.google.zxing.NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).getFinderPattern().getStartEnd()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.startFromEven) {
            z = !z;
        }
        boolean z2 = false;
        while (true) {
            if (i >= size) {
                break;
            }
            boolean z3 = bitArray.get(i);
            boolean z4 = !z3;
            if (z3) {
                z2 = z4;
                break;
            } else {
                i++;
                z2 = z4;
            }
        }
        int i2 = 0;
        boolean z5 = z2;
        int i3 = i;
        while (i < size) {
            if (bitArray.get(i) != z5) {
                decodeFinderCounters[i2] = decodeFinderCounters[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        reverseCounters(decodeFinderCounters);
                    }
                    if (isFinderPattern(decodeFinderCounters)) {
                        int[] iArr = this.startEnd;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        reverseCounters(decodeFinderCounters);
                    }
                    i3 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                decodeFinderCounters[i2] = 1;
                z5 = !z5;
            }
            i++;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static void reverseCounters(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    private com.google.zxing.oned.rss.FinderPattern parseFoundFinderPattern(com.google.zxing.common.BitArray bitArray, int i, boolean z, java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.startEnd[0] - 1;
            while (i5 >= 0 && !bitArray.get(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.startEnd;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.startEnd;
            int i7 = iArr2[0];
            int nextUnset = bitArray.getNextUnset(iArr2[1] + 1);
            i2 = nextUnset;
            i3 = i7;
            i4 = nextUnset - this.startEnd[1];
        }
        int[] decodeFinderCounters = getDecodeFinderCounters();
        java.lang.System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i4;
        try {
            int parseFinderValue = parseFinderValue(decodeFinderCounters, FINDER_PATTERNS);
            if (!mayFollow(list, parseFinderValue)) {
                return null;
            }
            if (!list.isEmpty()) {
                com.google.zxing.oned.rss.expanded.ExpandedPair expandedPair = list.get(list.size() - 1);
                int i8 = expandedPair.getFinderPattern().getStartEnd()[0];
                int i9 = expandedPair.getFinderPattern().getStartEnd()[1];
                float f = (i9 - i8) / FINDER_PATTERN_MODULES;
                float f2 = i9;
                float f3 = f * 17.0f * 2.0f;
                float f4 = i3;
                if (f4 < (0.9f * f3) + f2 || f4 > f2 + (f3 * 1.1f)) {
                    return null;
                }
            }
            return new com.google.zxing.oned.rss.FinderPattern(parseFinderValue, new int[]{i3, i2}, i3, i2, i);
        } catch (com.google.zxing.NotFoundException unused) {
            return null;
        }
    }

    final com.google.zxing.oned.rss.DataCharacter decodeDataCharacter(com.google.zxing.common.BitArray bitArray, com.google.zxing.oned.rss.FinderPattern finderPattern, boolean z, boolean z2) throws com.google.zxing.NotFoundException {
        int[] dataCharacterCounters = getDataCharacterCounters();
        java.util.Arrays.fill(dataCharacterCounters, 0);
        if (z2) {
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
        float sum = com.google.zxing.common.detector.MathUtils.sum(dataCharacterCounters) / 17.0f;
        float f = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / FINDER_PATTERN_MODULES;
        if (java.lang.Math.abs(sum - f) / f > 0.3f) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i3 = 0; i3 < dataCharacterCounters.length; i3++) {
            float f2 = (dataCharacterCounters[i3] * 1.0f) / sum;
            int i4 = (int) (0.5f + f2);
            if (i4 <= 0) {
                if (f2 < 0.3f) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                i4 = 1;
            } else if (i4 > 8) {
                if (f2 > 8.7f) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                i4 = 8;
            }
            int i5 = i3 / 2;
            if ((i3 & 1) == 0) {
                oddCounts[i5] = i4;
                oddRoundingErrors[i5] = f2 - i4;
            } else {
                evenCounts[i5] = i4;
                evenRoundingErrors[i5] = f2 - i4;
            }
        }
        adjustOddEvenCounts(17);
        int value = (((finderPattern.getValue() * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
        int i6 = 0;
        int i7 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            if (isNotA1left(finderPattern, z, z2)) {
                i6 += oddCounts[length2] * WEIGHTS[value][length2 * 2];
            }
            i7 += oddCounts[length2];
        }
        int i8 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            if (isNotA1left(finderPattern, z, z2)) {
                i8 += evenCounts[length3] * WEIGHTS[value][(length3 * 2) + 1];
            }
        }
        if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int i9 = (13 - i7) / 2;
        int i10 = SYMBOL_WIDEST[i9];
        return new com.google.zxing.oned.rss.DataCharacter((com.google.zxing.oned.rss.RSSUtils.getRSSvalue(oddCounts, i10, true) * EVEN_TOTAL_SUBSET[i9]) + com.google.zxing.oned.rss.RSSUtils.getRSSvalue(evenCounts, 9 - i10, false) + GSUM[i9], i6 + i8);
    }

    private static boolean isNotA1left(com.google.zxing.oned.rss.FinderPattern finderPattern, boolean z, boolean z2) {
        return (finderPattern.getValue() == 0 && z && z2) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void adjustOddEvenCounts(int i) throws com.google.zxing.NotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int sum = com.google.zxing.common.detector.MathUtils.sum(getOddCounts());
        int sum2 = com.google.zxing.common.detector.MathUtils.sum(getEvenCounts());
        boolean z5 = true;
        if (sum > 13) {
            z = true;
            z2 = false;
        } else if (sum < 4) {
            z2 = true;
            z = false;
        } else {
            z = false;
            z2 = false;
        }
        if (sum2 > 13) {
            z4 = true;
            z3 = false;
        } else if (sum2 < 4) {
            z3 = true;
            z4 = false;
        } else {
            z3 = false;
            z4 = false;
        }
        int i2 = (sum + sum2) - i;
        boolean z6 = (sum & 1) == 1;
        boolean z7 = (sum2 & 1) == 0;
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                if (z6) {
                    if (z7) {
                        throw com.google.zxing.NotFoundException.getNotFoundInstance();
                    }
                } else {
                    if (!z7) {
                        throw com.google.zxing.NotFoundException.getNotFoundInstance();
                    }
                    z4 = true;
                    z5 = z;
                }
            } else if (!z6) {
                if (z7) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                z5 = z;
            } else {
                if (!z7) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                if (sum < sum2) {
                    z4 = true;
                    if (z5) {
                        if (z) {
                            throw com.google.zxing.NotFoundException.getNotFoundInstance();
                        }
                        increment(getOddCounts(), getOddRoundingErrors());
                    }
                    if (z) {
                        decrement(getOddCounts(), getOddRoundingErrors());
                    }
                    if (z3) {
                        if (z4) {
                            throw com.google.zxing.NotFoundException.getNotFoundInstance();
                        }
                        increment(getEvenCounts(), getOddRoundingErrors());
                    }
                    if (z4) {
                        decrement(getEvenCounts(), getEvenRoundingErrors());
                        return;
                    }
                    return;
                }
                z3 = true;
            }
        } else if (z6) {
            if (z7) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            if (z5) {
            }
            if (z) {
            }
            if (z3) {
            }
            if (z4) {
            }
        } else {
            if (!z7) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            z3 = true;
            z5 = z;
        }
        z = z5;
        z5 = z2;
        if (z5) {
        }
        if (z) {
        }
        if (z3) {
        }
        if (z4) {
        }
    }
}
