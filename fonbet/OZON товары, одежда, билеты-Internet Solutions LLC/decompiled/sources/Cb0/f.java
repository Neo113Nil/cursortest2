package Cb0;

import Sc.InterfaceC4008j;
import We.A;
import We.C4873o;
import We.InterfaceC4875q;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f implements InterfaceC4875q {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<CookieHandler> f4641b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull InterfaceC4008j<? extends CookieHandler> cookieHandler) {
        Intrinsics.checkNotNullParameter(cookieHandler, "cookieHandler");
        this.f4641b = cookieHandler;
    }

    @Override // We.InterfaceC4875q
    @NotNull
    public final List<C4873o> loadForRequest(@NotNull A url) {
        p002if.j jVar;
        int g10;
        Intrinsics.checkNotNullParameter(url, "url");
        Fb0.h.c();
        try {
            Map<String, List<String>> map = this.f4641b.getValue().get(url.w(), U.c());
            Intrinsics.f(map);
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    Intrinsics.f(value);
                    if (!value.isEmpty()) {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Intrinsics.f(str);
                            ArrayList arrayList2 = new ArrayList();
                            int length = str.length();
                            for (int i11 = 0; i11 < length; i11 = g10 + 1) {
                                g10 = Ye.b.g(i11, length, str, ";,");
                                int h11 = Ye.b.h(str, '=', i11, g10);
                                String D11 = Ye.b.D(i11, h11, str);
                                if (g10 != length && (Intrinsics.d(D11, "x-o3-meshversion") || Intrinsics.d(D11, "x-o3-ab-variants"))) {
                                    g10 = length;
                                }
                                if (!kotlin.text.h.e0(D11, "$", false)) {
                                    String D12 = h11 < g10 ? Ye.b.D(h11 + 1, g10, str) : "";
                                    if (kotlin.text.h.e0(D12, "\"", false) && kotlin.text.h.A(D12, "\"", false)) {
                                        D12 = D12.substring(1, D12.length() - 1);
                                        Intrinsics.checkNotNullExpressionValue(D12, "substring(...)");
                                    }
                                    C4873o.a aVar = new C4873o.a();
                                    aVar.d(D11);
                                    aVar.e(D12);
                                    aVar.b(url.h());
                                    arrayList2.add(aVar.a());
                                }
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            if (arrayList == null) {
                return K.f71697a;
            }
            List<C4873o> unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.f(unmodifiableList);
            return unmodifiableList;
        } catch (IOException e11) {
            p002if.j.f66400c.getClass();
            jVar = p002if.j.f66398a;
            A t2 = url.t("/...");
            Intrinsics.f(t2);
            jVar.getClass();
            p002if.j.j(5, "Loading cookies failed for " + t2, e11);
            return K.f71697a;
        }
    }

    @Override // We.InterfaceC4875q
    public final void saveFromResponse(@NotNull A url, @NotNull List<C4873o> cookies) {
        p002if.j jVar;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Fb0.h.c();
        ArrayList arrayList = new ArrayList();
        for (C4873o cookie : cookies) {
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            arrayList.add(cookie.h(true));
        }
        try {
            this.f4641b.getValue().put(url.w(), U.i(new Pair("Set-Cookie", arrayList)));
        } catch (IOException e11) {
            p002if.j.f66400c.getClass();
            jVar = p002if.j.f66398a;
            A t2 = url.t("/...");
            Intrinsics.f(t2);
            jVar.getClass();
            p002if.j.j(5, "Saving cookies failed for " + t2, e11);
        }
    }
}
