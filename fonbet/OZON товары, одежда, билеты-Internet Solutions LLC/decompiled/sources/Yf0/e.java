package Yf0;

import Cf0.J;
import Sc.InterfaceC4008j;
import Sc.o;
import We.A;
import We.B;
import We.G;
import We.L;
import Yf0.a;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.m;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class e implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f35009a = Sc.k.b(a.f35010b);

    static final class a extends AbstractC7737t implements Function0<h> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f35010b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final h invoke() {
            J j11 = m.f80514a;
            if (j11 != null) {
                return j11.l();
            }
            throw new RuntimeException("NetworkDi must be initialized.");
        }
    }

    public static final h a(e eVar) {
        return (h) eVar.f35009a.getValue();
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        boolean contains;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        String b11 = ((h) this.f35009a.getValue()).b();
        if (b11 == null) {
            return chain.proceed(request);
        }
        A j11 = request.j();
        Yf0.a aVar = (Yf0.a) C10727i.d(kotlin.coroutines.g.f71771a, new f(this, null));
        if (aVar instanceof a.C0651a) {
            contains = true;
        } else {
            if (!(aVar instanceof a.b)) {
                throw new o();
            }
            List<String> a11 = ((a.b) aVar).a();
            String c11 = j11.c();
            Charset charset = StandardCharsets.UTF_8;
            String decode = URLDecoder.decode(c11, charset.name());
            String e11 = j11.e();
            if (e11 == null || e11.length() == 0) {
                Intrinsics.f(decode);
            } else {
                decode = G.g.c(decode, "?", URLDecoder.decode(j11.e(), charset.name()));
            }
            contains = a11.contains(decode);
        }
        if (contains) {
            A.a j12 = j11.j();
            j12.s("https");
            j12.j(b11);
            A e12 = j12.e();
            G.a aVar2 = new G.a(request);
            aVar2.j(e12);
            aVar2.a("x-o3-original-domain", j11.h());
            request = aVar2.b();
        }
        return chain.proceed(request);
    }
}
