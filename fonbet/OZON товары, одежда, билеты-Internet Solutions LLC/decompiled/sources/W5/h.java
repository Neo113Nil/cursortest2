package W5;

/* loaded from: classes8.dex */
public final class h implements a<int[]> {
    @Override // W5.a
    public final int a(int[] iArr) {
        return iArr.length;
    }

    @Override // W5.a
    public final int b() {
        return 4;
    }

    @Override // W5.a
    public final String getTag() {
        return "IntegerArrayPool";
    }

    @Override // W5.a
    public final int[] newArray(int i11) {
        return new int[i11];
    }
}
