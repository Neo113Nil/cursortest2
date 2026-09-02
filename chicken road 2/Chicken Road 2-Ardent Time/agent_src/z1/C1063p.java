package z1;

/* renamed from: z1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1063p extends kotlin.jvm.internal.j implements s1.p {

    /* renamed from: f, reason: collision with root package name */
    public static final z1.C1063p f8584f = new z1.C1063p(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final z1.C1063p f8585g = new z1.C1063p(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1063p(int i2, int i3) {
        super(i2);
        this.f8586e = i3;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f8586e) {
            case 0:
                return ((k1.i) obj).g((k1.g) obj2);
            case 1:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((k1.i) obj).g((k1.g) obj2);
        }
    }
}
