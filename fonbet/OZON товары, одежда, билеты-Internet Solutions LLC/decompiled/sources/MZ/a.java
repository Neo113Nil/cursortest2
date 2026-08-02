package MZ;

import AZ.a;
import EZ.e;
import GZ.j;
import GZ.k;
import android.net.Uri;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import pZ.f;

/* loaded from: classes3.dex */
public final class a implements c<LZ.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HZ.c f17748a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f17749b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final HZ.d f17750c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final GZ.a f17751d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<KZ.c> f17752e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<KZ.d> f17753f;

    public a(@NotNull HZ.c cache, @NotNull k routeFactory, @NotNull HZ.d miniAppMapper, @NotNull GZ.a commonPageProvider, @NotNull List deeplinkInterceptors, @NotNull List destinationInterceptors) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        Intrinsics.checkNotNullParameter(miniAppMapper, "miniAppMapper");
        Intrinsics.checkNotNullParameter(commonPageProvider, "commonPageProvider");
        Intrinsics.checkNotNullParameter(deeplinkInterceptors, "deeplinkInterceptors");
        Intrinsics.checkNotNullParameter(destinationInterceptors, "destinationInterceptors");
        this.f17748a = cache;
        this.f17749b = routeFactory;
        this.f17750c = miniAppMapper;
        this.f17751d = commonPageProvider;
        this.f17752e = deeplinkInterceptors;
        this.f17753f = destinationInterceptors;
    }

    @Override // MZ.c
    public final boolean a(LZ.a aVar) {
        LZ.a request = aVar;
        Intrinsics.checkNotNullParameter(request, "request");
        String deeplink = request.a();
        k kVar = this.f17749b;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return kVar.c(Uri.parse(deeplink)) != null;
    }

    @Override // MZ.c
    public final e b(r context, LZ.c cVar) {
        f destination;
        LZ.a request = (LZ.a) cVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        String a11 = request.a();
        GZ.c b11 = request.b();
        HZ.d dVar = this.f17750c;
        String b12 = dVar.b(a11, b11);
        j route = this.f17749b.a(b12, request.c(), request.b());
        if (route != null) {
            int i11 = AZ.b.f679a;
            ru.ozon.android.ozonLogger.core.c cVar2 = ru.ozon.android.ozonLogger.core.c.DEBUG;
            AZ.b.b();
            AZ.a a12 = AZ.b.a();
            if (a12 != AZ.d.a()) {
                cVar2.getClass();
                a12.a(new a.C0019a("open deeplink: " + route));
            }
            List<KZ.c> list = this.f17752e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((KZ.c) obj).canIntercept(route)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                route = ((KZ.c) it.next()).intercept(route);
                if (route == null) {
                    route = null;
                    break;
                }
            }
            if (route != null) {
                IZ.a b13 = this.f17748a.b(route);
                if (b13 == null) {
                    f destination2 = dVar.d(this.f17751d.getDestination(route, b12), route);
                    Intrinsics.checkNotNullParameter(route, "route");
                    Intrinsics.checkNotNullParameter(destination2, "destination");
                    e.a aVar = new e.a(destination2);
                    aVar.b(route);
                    return aVar.a();
                }
                IZ.c cVar3 = b13 instanceof IZ.c ? (IZ.c) b13 : null;
                KZ.a deeplinkInterceptor = cVar3 != null ? cVar3.getDeeplinkInterceptor() : null;
                if ((deeplinkInterceptor == null || (route = deeplinkInterceptor.intercept(route)) != null) && (destination = b13.getDestination(context, route)) != null) {
                    List<KZ.d> list2 = this.f17753f;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (((KZ.d) obj2).canIntercept(destination, route)) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        KZ.d dVar2 = (KZ.d) it2.next();
                        if (destination == null) {
                            destination = null;
                            break;
                        }
                        destination = dVar2.intercept(context, destination, route);
                    }
                    if (destination != null) {
                        KZ.b destinationInterceptor = cVar3 != null ? cVar3.getDestinationInterceptor() : null;
                        if (destinationInterceptor == null || (destination = destinationInterceptor.intercept(context, destination, route)) != null) {
                            int i12 = AZ.b.f679a;
                            ru.ozon.android.ozonLogger.core.c cVar4 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                            AZ.b.b();
                            AZ.a a13 = AZ.b.a();
                            if (a13 != AZ.d.a()) {
                                cVar4.getClass();
                                a13.a(new a.C0019a("navigate " + route + " in " + N.b(b13.getClass()).B() + " with dest: " + destination));
                            }
                            f destination3 = dVar.d(destination, route);
                            Intrinsics.checkNotNullParameter(route, "route");
                            Intrinsics.checkNotNullParameter(destination3, "destination");
                            e.a aVar2 = new e.a(destination3);
                            aVar2.b(route);
                            return aVar2.a();
                        }
                    }
                }
            }
        }
        return null;
    }
}
