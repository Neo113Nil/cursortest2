package androidx.activity;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements s6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8093b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f8092a = i7;
        this.f8093b = obj;
    }

    @Override // s6.a
    public final Object invoke() {
        switch (this.f8092a) {
            case 0:
                ((androidx.fragment.app.A) this.f8093b).reportFullyDrawn();
                return null;
            default:
                return ((I4.j) this.f8093b).b().getPackageName() + ".flutter.share_provider";
        }
    }
}
