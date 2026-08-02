package P;

/* renamed from: P.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public static final C0294h f4471l = new C0294h(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C0294h f4472m = new C0294h(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4473k;

    public /* synthetic */ C0294h(int i) {
        this.f4473k = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4473k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                int intValue = ((Number) obj2).intValue();
                if (!c0315s.P(intValue & 1, (intValue & 3) != 2)) {
                    c0315s.S();
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!c0315s2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c0315s2.S();
                }
                break;
        }
        return W3.o.f6046a;
    }
}
