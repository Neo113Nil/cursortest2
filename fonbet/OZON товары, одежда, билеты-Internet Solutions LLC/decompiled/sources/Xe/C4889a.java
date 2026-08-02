package Xe;

import We.B;
import We.C;
import We.G;
import We.L;
import We.M;
import ef.C6355e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.G;
import sf.t;
import sf.z;
import uf.C10055b;

/* renamed from: Xe.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4889a implements B {

    /* renamed from: a, reason: collision with root package name */
    public static final C4889a f34418a = new C4889a();

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        M c11;
        String q11;
        G d11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (chain.request().d("Accept-Encoding") != null) {
            return chain.proceed(chain.request());
        }
        We.G request = chain.request();
        request.getClass();
        G.a aVar = new G.a(request);
        aVar.d("Accept-Encoding", "br,gzip");
        L response = chain.proceed(aVar.b());
        Intrinsics.checkNotNullParameter(response, "response");
        if (!C6355e.b(response) || (c11 = response.c()) == null || (q11 = L.q(response, "Content-Encoding")) == null) {
            return response;
        }
        if (q11.equalsIgnoreCase("br")) {
            d11 = z.d(z.k(new C10055b(c11.source().a2())));
        } else {
            if (!q11.equalsIgnoreCase("gzip")) {
                return response;
            }
            d11 = z.d(new t(c11.source()));
        }
        L.a aVar2 = new L.a(response);
        aVar2.q("Content-Encoding");
        aVar2.q("Content-Length");
        M.Companion companion = M.INSTANCE;
        C contentType = c11.contentType();
        companion.getClass();
        aVar2.b(M.Companion.b(d11, contentType, -1L));
        return aVar2.c();
    }
}
