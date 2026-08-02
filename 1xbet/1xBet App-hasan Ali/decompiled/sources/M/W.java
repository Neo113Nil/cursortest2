package M;

/* loaded from: classes.dex */
public final class W extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: m, reason: collision with root package name */
    public static final W f3257m = new W(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final W f3258n = new W(2, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final W f3259o = new W(2, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final W f3260p = new W(2, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3261l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i, int i5) {
        super(i);
        this.f3261l = i5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3261l) {
            case 0:
                return Integer.valueOf(((x0.N) obj).f(((Number) obj2).intValue()));
            case 1:
                return Integer.valueOf(((x0.N) obj).T(((Number) obj2).intValue()));
            case 2:
                return Integer.valueOf(((x0.N) obj).U(((Number) obj2).intValue()));
            default:
                return Integer.valueOf(((x0.N) obj).L(((Number) obj2).intValue()));
        }
    }
}
