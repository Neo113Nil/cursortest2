package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class BasicAlphabetMapper implements org.bouncycastle.crypto.AlphabetMapper {
    private java.util.Map<java.lang.Character, java.lang.Integer> getHighSpeedVideoFpsRanges;
    private java.util.Map<java.lang.Integer, java.lang.Character> getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public int getRadix() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public byte[] convertToIndexes(char[] cArr) {
        int i = 0;
        if (this.getHighSpeedVideoFpsRanges.size() <= 256) {
            byte[] bArr = new byte[cArr.length];
            while (i != cArr.length) {
                bArr[i] = this.getHighSpeedVideoFpsRanges.get(java.lang.Character.valueOf(cArr[i])).byteValue();
                i++;
            }
            return bArr;
        }
        byte[] bArr2 = new byte[cArr.length * 2];
        while (i != cArr.length) {
            int intValue = this.getHighSpeedVideoFpsRanges.get(java.lang.Character.valueOf(cArr[i])).intValue();
            int i2 = i * 2;
            bArr2[i2] = (byte) ((intValue >> 8) & 255);
            bArr2[i2 + 1] = (byte) (intValue & 255);
            i++;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public char[] convertToChars(byte[] bArr) {
        int i = 0;
        if (this.getHighSpeedVideoFpsRangesFor.size() <= 256) {
            char[] cArr = new char[bArr.length];
            while (i != bArr.length) {
                cArr[i] = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(bArr[i] & 255)).charValue();
                i++;
            }
            return cArr;
        }
        if ((bArr.length & 1) != 0) {
            throw new java.lang.IllegalArgumentException("two byte radix and input string odd length");
        }
        char[] cArr2 = new char[bArr.length / 2];
        while (i != bArr.length) {
            cArr2[i / 2] = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(((bArr[i] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[i + 1] & 255))).charValue();
            i += 2;
        }
        return cArr2;
    }

    public BasicAlphabetMapper(char[] cArr) {
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        for (int i = 0; i != cArr.length; i++) {
            if (this.getHighSpeedVideoFpsRanges.containsKey(java.lang.Character.valueOf(cArr[i]))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("duplicate key detected in alphabet: ");
                sb.append(cArr[i]);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighSpeedVideoFpsRanges.put(java.lang.Character.valueOf(cArr[i]), java.lang.Integer.valueOf(i));
            this.getHighSpeedVideoFpsRangesFor.put(java.lang.Integer.valueOf(i), java.lang.Character.valueOf(cArr[i]));
        }
    }

    public BasicAlphabetMapper(java.lang.String str) {
        this(str.toCharArray());
    }
}
