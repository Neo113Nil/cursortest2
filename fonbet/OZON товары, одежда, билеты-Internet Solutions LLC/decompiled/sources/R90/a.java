package R90;

import A30.m;
import We.B;
import We.G;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements B {

    /* renamed from: a, reason: collision with root package name */
    private m f24826a;

    public final void a(m mVar) {
        this.f24826a = mVar;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        String m11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        m mVar = this.f24826a;
        if (mVar == null || !h.t(request.j().toString(), "mobile/auth/pinpad", false) || !mVar.t()) {
            return chain.proceed(request);
        }
        L80.a.a("FastEntryInterceptor", "intercept");
        G.a aVar = new G.a(request);
        m mVar2 = this.f24826a;
        if (mVar2 != null) {
            if (Intrinsics.d(request.e().c("x-ob-cold-start"), "true") && mVar2.u() && (m11 = mVar2.m()) != null) {
                aVar.a("x-ob-biometry-token", m11);
                L80.a.a("FastEntryInterceptor", "addHeader x-ob-biometry-token");
            }
            aVar.a("x-ob-fast-entry", mVar2.u() ? "1" : "0");
        }
        return chain.proceed(aVar.b());
    }
}
