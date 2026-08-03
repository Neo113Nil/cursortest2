package a1;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061a implements a1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1942a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1944c;

    public /* synthetic */ C0061a(int i2, java.lang.Object obj, java.lang.Object obj2) {
        this.f1942a = i2;
        this.f1944c = obj;
        this.f1943b = obj2;
    }

    @Override // a1.e
    public final void a(java.nio.ByteBuffer byteBuffer) {
        switch (this.f1942a) {
            case 0:
                F.C0014n c0014n = (F.C0014n) this.f1944c;
                try {
                    ((a1.InterfaceC0063c) this.f1943b).f(((a1.j) c0014n.f500c).decodeMessage(byteBuffer));
                    break;
                } catch (java.lang.RuntimeException e2) {
                    android.util.Log.e("BasicMessageChannel#" + ((java.lang.String) c0014n.f499b), "Failed to handle message reply", e2);
                    return;
                }
            default:
                I0.b bVar = (I0.b) this.f1944c;
                Z0.j jVar = (Z0.j) this.f1943b;
                try {
                    if (byteBuffer == null) {
                        jVar.getClass();
                    } else {
                        try {
                            jVar.c(((a1.l) bVar.f659d).c(byteBuffer));
                        } catch (a1.g e3) {
                            jVar.a(e3.f1945a, e3.getMessage(), e3.f1946b);
                        }
                    }
                    break;
                } catch (java.lang.RuntimeException e4) {
                    android.util.Log.e("MethodChannel#" + ((java.lang.String) bVar.f658c), "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
