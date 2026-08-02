package Cb0;

import Sc.InterfaceC4008j;
import We.A;
import We.C4873o;
import We.InterfaceC4875q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class l implements InterfaceC4875q {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC4875q> f4653b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<zb0.g> f4654c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Tc.j f4655d;

    public l(@NotNull InterfaceC4008j fixedMeshCookieJar, @NotNull List ozonIdCookieHandlers, @NotNull Tc.j unmodifiableCookieNames) {
        Intrinsics.checkNotNullParameter(fixedMeshCookieJar, "fixedMeshCookieJar");
        Intrinsics.checkNotNullParameter(ozonIdCookieHandlers, "ozonIdCookieHandlers");
        Intrinsics.checkNotNullParameter(unmodifiableCookieNames, "unmodifiableCookieNames");
        this.f4653b = fixedMeshCookieJar;
        this.f4654c = ozonIdCookieHandlers;
        this.f4655d = unmodifiableCookieNames;
    }

    @Override // We.InterfaceC4875q
    @NotNull
    public final List<C4873o> loadForRequest(@NotNull A url) {
        Tc.j jVar;
        Intrinsics.checkNotNullParameter(url, "url");
        List<C4873o> loadForRequest = this.f4653b.getValue().loadForRequest(url);
        List<zb0.g> list = this.f4654c;
        if (list.isEmpty()) {
            return loadForRequest;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = loadForRequest.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jVar = this.f4655d;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (jVar.contains(((C4873o) next).f())) {
                arrayList.add(next);
            }
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            loadForRequest = ((zb0.g) it2.next()).handleCookiesForRequest(url, loadForRequest);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : loadForRequest) {
            if (!jVar.contains(((C4873o) obj).f())) {
                arrayList2.add(obj);
            }
        }
        return C7714v.p0(arrayList2, arrayList);
    }

    @Override // We.InterfaceC4875q
    public final void saveFromResponse(@NotNull A url, @NotNull List<C4873o> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        this.f4653b.getValue().saveFromResponse(url, cookies);
        Iterator<T> it = this.f4654c.iterator();
        while (it.hasNext()) {
            ((zb0.g) it.next()).handleCookiesFromResponse(url, cookies);
        }
    }
}
