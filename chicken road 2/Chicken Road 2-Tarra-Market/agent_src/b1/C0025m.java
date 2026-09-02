package b1;

/* renamed from: b1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025m extends kotlin.jvm.internal.k implements U0.p {

    /* renamed from: f, reason: collision with root package name */
    public static final C0025m f671f = new C0025m(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0025m f672g = new C0025m(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0025m(int i2, int i3) {
        super(i2);
        this.f673e = i3;
    }

    @Override // U0.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f673e) {
            case 0:
                return ((M0.i) obj).k((M0.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                return ((M0.i) obj).k((M0.g) obj2);
        }
    }
}
