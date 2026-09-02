package m0;

/* renamed from: m0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056m extends g0.i implements f0.p {

    /* renamed from: d, reason: collision with root package name */
    public static final C0056m f935d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0056m f936e;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f937c;

    static {
        int i2 = 2;
        f935d = new C0056m(i2, 0);
        f936e = new C0056m(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0056m(int i2, int i3) {
        super(i2);
        this.f937c = i3;
    }

    @Override // f0.p
    public final Object g(Object obj, Object obj2) {
        switch (this.f937c) {
            case 0:
                return ((Y.i) obj).g((Y.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                return ((Y.i) obj).g((Y.g) obj2);
        }
    }
}
