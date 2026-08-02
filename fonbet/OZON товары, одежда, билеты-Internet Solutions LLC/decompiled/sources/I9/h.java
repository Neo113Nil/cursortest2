package I9;

/* loaded from: classes9.dex */
public enum h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    private final int bits;
    private final int[] characterCountBitsForVersions;

    h(int[] iArr, int i11) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i11;
    }

    public final int a() {
        return this.bits;
    }

    public final int b(j jVar) {
        int i11 = jVar.i();
        return this.characterCountBitsForVersions[i11 <= 9 ? (char) 0 : i11 <= 26 ? (char) 1 : (char) 2];
    }
}
