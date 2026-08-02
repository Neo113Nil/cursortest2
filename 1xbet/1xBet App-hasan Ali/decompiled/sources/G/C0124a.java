package G;

/* renamed from: G.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124a extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final C0124a f1709m = new C0124a(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0124a f1710n = new C0124a(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0124a f1711o = new C0124a(1, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1712l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0124a(int i, int i5) {
        super(i);
        this.f1712l = i5;
    }

    @Override // i4.c
    public final /* synthetic */ Object c(Object obj) {
        switch (this.f1712l) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i = ((P0.j) obj).f4656a;
                break;
        }
        return W3.o.f6046a;
    }
}
