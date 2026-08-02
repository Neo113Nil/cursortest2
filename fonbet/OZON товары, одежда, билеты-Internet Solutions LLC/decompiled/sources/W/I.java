package W;

import W.K;
import androidx.concurrent.futures.b;
import d0.C5996g;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public final /* synthetic */ class I implements InterfaceC10646a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f32873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f32874b;

    public /* synthetic */ I(K k11, b.a aVar) {
        this.f32873a = k11;
        this.f32874b = aVar;
    }

    @Override // x2.InterfaceC10646a
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        K k11 = this.f32873a;
        if (k11.f32906V == null) {
            if (th2 instanceof C5996g) {
                k11.I(K.g.ERROR_ENCODER);
            } else {
                k11.I(K.g.ERROR_SOURCE);
            }
            k11.f32906V = th2;
            k11.V();
            this.f32874b.c(null);
        }
    }
}
