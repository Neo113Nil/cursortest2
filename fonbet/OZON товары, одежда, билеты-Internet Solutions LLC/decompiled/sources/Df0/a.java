package Df0;

import We.A;
import We.B;
import We.G;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements B {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6685a;

    /* renamed from: Df0.a$a, reason: collision with other inner class name */
    private static final class C0139a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0139a f6686a = new C0139a();

        private C0139a() {
        }
    }

    public a(boolean z11) {
        this.f6685a = z11;
    }

    private static G a(G g10, String str) {
        A.a j11 = g10.j().j();
        j11.s(str);
        A e11 = j11.e();
        G.a aVar = new G.a(g10);
        aVar.j(e11);
        if (str.equals("http")) {
            aVar.i(C0139a.class, C0139a.f6686a);
        } else {
            aVar.i(C0139a.class, null);
        }
        return aVar.b();
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        L proceed;
        G L11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (this.f6685a) {
            G request = chain.request();
            if (request.j().i()) {
                request = a(request, "http");
            }
            proceed = chain.proceed(request);
            L11 = proceed.L();
            if (L11.i(C0139a.class) != null) {
                L11 = a(L11, "https");
            }
        } else {
            G request2 = chain.request();
            if (request2.i(C0139a.class) != null) {
                request2 = a(request2, "https");
            }
            proceed = chain.proceed(request2);
            L11 = proceed.L();
            if (L11.j().i()) {
                L11 = a(L11, "http");
            }
        }
        L.a aVar = new L.a(proceed);
        aVar.r(L11);
        return aVar.c();
    }
}
