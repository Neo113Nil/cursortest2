package j$.time.temporal;

/* loaded from: classes6.dex */
public final /* synthetic */ class o implements n {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ o(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.n
    public final m e(m mVar) {
        switch (this.a) {
            case 0:
                int f = mVar.f(a.DAY_OF_WEEK);
                int i = this.b;
                if (f == i) {
                    return mVar;
                }
                return mVar.d(f - i >= 0 ? 7 - r0 : -r0, b.DAYS);
            default:
                int f2 = mVar.f(a.DAY_OF_WEEK);
                int i2 = this.b;
                if (f2 == i2) {
                    return mVar;
                }
                return mVar.a(i2 - f2 >= 0 ? 7 - r1 : -r1, b.DAYS);
        }
    }
}
