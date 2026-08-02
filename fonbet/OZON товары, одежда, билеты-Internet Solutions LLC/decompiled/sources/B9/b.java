package B9;

/* loaded from: classes9.dex */
final class b extends f {
    @Override // B9.i
    protected final void g(int i11, StringBuilder sb2) {
        if (i11 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // B9.i
    protected final int h(int i11) {
        return i11 < 10000 ? i11 : i11 - 10000;
    }
}
