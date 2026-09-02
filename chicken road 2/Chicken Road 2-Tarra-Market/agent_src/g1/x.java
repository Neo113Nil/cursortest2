package g1;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.k implements U0.p {

    /* renamed from: f, reason: collision with root package name */
    public static final x f1182f = new x(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final x f1183g = new x(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final x f1184h = new x(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1185e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i2, int i3) {
        super(i2);
        this.f1185e = i3;
    }

    @Override // U0.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1185e) {
            case 0:
                return obj;
            case 1:
                C0.g.j(obj);
                return null;
            default:
                return (z) obj;
        }
    }
}
