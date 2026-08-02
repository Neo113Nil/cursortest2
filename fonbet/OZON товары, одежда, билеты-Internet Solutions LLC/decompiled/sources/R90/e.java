package R90;

import H30.C3133b;
import H30.l;
import We.B;
import We.G;
import We.L;
import We.y;
import g30.InterfaceC6618a;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.models.Pin;
import ru.ozon.fintech.settings.models.Pins;

/* loaded from: classes3.dex */
public final class e implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f24830a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f24831b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q90.c f24832c;

    public e(@NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull Q90.c featureToggles) {
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        this.f24830a = fintechAnalyticInteractor;
        this.f24831b = fintechSettings;
        this.f24832c = featureToggles;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0081, code lost:
    
        if (r10.size() == 3) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Type inference failed for: r15v5, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.ArrayList] */
    @Override // We.B
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final L intercept(@NotNull B.a chain) {
        List<Certificate> list;
        boolean z11;
        List<Certificate> list2;
        List<Pin> pins;
        Object obj;
        int i11;
        String str;
        List<Pin> pins2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        URL x11 = request.j().x();
        L proceed = chain.proceed(request);
        String host = x11.getHost();
        Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
        int i12 = 0;
        if (h.t(host, "finance.ozon.ru", false)) {
            String host2 = x11.getHost();
            Intrinsics.checkNotNullExpressionValue(host2, "getHost(...)");
            if (!h.t(host2, "pins.finance.ozon.ru", false)) {
                S90.c cVar = S90.c.MOB_SSL_PINNING;
                Q90.c cVar2 = this.f24832c;
                boolean f7 = Tl.a.f(cVar2, cVar);
                ru.ozon.fintech.settings.domain.a aVar = this.f24831b;
                if (f7) {
                    Pins d11 = aVar.d();
                    int i13 = 1;
                    if ((d11 != null ? d11.getPiningState() : null) != S90.e.DISABLE) {
                        try {
                            y p11 = proceed.p();
                            list = p11 != null ? p11.c() : null;
                            try {
                                list2 = list;
                            } catch (Exception e11) {
                                e = e11;
                                z11 = false;
                                L80.a.c("SslInterceptorDelegate", null, e);
                                if (!z11) {
                                }
                                if (Tl.a.f(cVar2, S90.c.MOB_CERT_ANTIFRAUD)) {
                                }
                                return proceed;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            list = null;
                        }
                        if (list2 != null) {
                            if (list2.isEmpty()) {
                            }
                            Iterator<T> it = list.iterator();
                            z11 = false;
                            while (it.hasNext()) {
                                try {
                                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                                    byte[] a11 = encoded != null ? l.a(encoded) : null;
                                    String a12 = a11 != null ? C3133b.a(a11) : null;
                                    if (d11 != null && (pins = d11.getPins()) != null) {
                                        Iterator<T> it2 = pins.iterator();
                                        while (it2.hasNext()) {
                                            if (Intrinsics.d(a12, ((Pin) it2.next()).getHash())) {
                                                z11 = true;
                                            }
                                        }
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    L80.a.c("SslInterceptorDelegate", null, e);
                                    if (!z11) {
                                    }
                                    if (Tl.a.f(cVar2, S90.c.MOB_CERT_ANTIFRAUD)) {
                                    }
                                    return proceed;
                                }
                            }
                            if (!z11) {
                                String valueOf = String.valueOf(d11 != null ? d11.getPiningState() : null);
                                String V11 = (d11 == null || (pins2 = d11.getPins()) == null) ? null : C7714v.V(pins2, ", ", null, null, new d(0), 30);
                                if (V11 == null) {
                                    V11 = "";
                                }
                                List<Certificate> list3 = list;
                                if (list3 == null || list3.isEmpty()) {
                                    obj = K.f71697a;
                                } else {
                                    Regex regex = new Regex("Issuer:\\s*(.+?)\\n");
                                    Regex regex2 = new Regex("Subject:\\s*(.+?)\\n");
                                    obj = new ArrayList();
                                    Iterator<Certificate> it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        String certificate = it3.next().toString();
                                        Intrinsics.checkNotNullExpressionValue(certificate, "toString(...)");
                                        MatchResult b11 = regex.b(i12, certificate);
                                        if (b11 != null) {
                                            str = b11.c().get(i13);
                                            i11 = 0;
                                        } else {
                                            i11 = i12;
                                            str = null;
                                        }
                                        MatchResult b12 = regex2.b(i11, certificate);
                                        obj.add(new Pair(str, b12 != null ? b12.c().get(1) : null));
                                        i12 = 0;
                                        i13 = 1;
                                    }
                                }
                                String obj2 = obj.toString();
                                String url = x11.toString();
                                Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                                this.f24830a.U1(valueOf, V11, obj2, url);
                            }
                        }
                        if (list != null) {
                        }
                    } else {
                        list = null;
                    }
                    z11 = false;
                    if (!z11) {
                    }
                }
                if (Tl.a.f(cVar2, S90.c.MOB_CERT_ANTIFRAUD)) {
                    try {
                        y p12 = proceed.p();
                        List<Certificate> c11 = p12 != null ? p12.c() : null;
                        List<Certificate> list4 = c11;
                        if (list4 != null && !list4.isEmpty()) {
                            byte[] encoded2 = ((Certificate) C7714v.K(c11)).getEncoded();
                            byte[] a13 = encoded2 != null ? l.a(encoded2) : null;
                            aVar.x(a13 != null ? C3133b.a(a13) : null);
                        }
                    } catch (Exception e14) {
                        L80.a.c("SslInterceptorDelegate", null, e14);
                    }
                }
            }
        }
        return proceed;
    }
}
