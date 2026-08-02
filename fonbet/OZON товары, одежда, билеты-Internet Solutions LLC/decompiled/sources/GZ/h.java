package GZ;

import AZ.a;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f9854a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EZ.h f9855b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final HZ.c f9856c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final MZ.d f9857d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Handler f9858e;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MZ.c f9860b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LZ.c f9861c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f9862d;

        public a(MZ.c cVar, LZ.c cVar2, Integer num) {
            this.f9860b = cVar;
            this.f9861c = cVar2;
            this.f9862d = num;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Integer num = this.f9862d;
            h.f(h.this, this.f9860b, this.f9861c, num != null ? num.intValue() : 0);
        }
    }

    public h(@NotNull k routeFactory, @NotNull EZ.h navigatorHolder, @NotNull HZ.c deeplinkHandlersCache, @NotNull MZ.d requestHandlersCache) {
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        Intrinsics.checkNotNullParameter(navigatorHolder, "navigatorHolder");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        Intrinsics.checkNotNullParameter(requestHandlersCache, "requestHandlersCache");
        this.f9854a = routeFactory;
        this.f9855b = navigatorHolder;
        this.f9856c = deeplinkHandlersCache;
        this.f9857d = requestHandlersCache;
        this.f9858e = new Handler(Looper.getMainLooper());
    }

    public static final void f(h hVar, MZ.c cVar, LZ.c cVar2, int i11) {
        EZ.h hVar2 = hVar.f9855b;
        if (!hVar2.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            hVar2.getLifecycle().a(new i(hVar2, hVar, cVar, cVar2, i11));
            return;
        }
        EZ.e<?> b11 = cVar.b(hVar2.e().getActivity(), cVar2);
        if (b11 != null) {
            hVar2.f(b11, i11);
        }
    }

    @Override // GZ.g
    public final boolean a(@NotNull String deeplink, @NotNull Map<String, ? extends Object> properties, @NotNull c deeplinkSourceType) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(deeplinkSourceType, "deeplinkSourceType");
        return c(new LZ.a(deeplink, properties, deeplinkSourceType), 0);
    }

    @Override // GZ.g
    public final boolean b(@NotNull String deeplink, int i11, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return c(new LZ.a(deeplink, 4, properties), Integer.valueOf(i11));
    }

    @Override // GZ.g
    public final boolean c(@NotNull LZ.c request, Integer num) {
        Intrinsics.checkNotNullParameter(request, "request");
        MZ.c<LZ.c> a11 = this.f9857d.a(request);
        if (a11 == null) {
            return false;
        }
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            f(this, a11, request, num != null ? num.intValue() : 0);
            return true;
        }
        this.f9858e.post(new a(a11, request, num));
        return true;
    }

    @Override // GZ.g
    public final pZ.f d(@NotNull r context, @NotNull String deeplink) {
        IZ.a b11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        j b12 = k.b(this.f9854a, deeplink, null, 6);
        if (b12 == null || (b11 = this.f9856c.b(b12)) == null) {
            return null;
        }
        int i11 = AZ.b.f679a;
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
        AZ.b.b();
        AZ.a a11 = AZ.b.a();
        if (a11 != AZ.d.a()) {
            cVar.getClass();
            a11.a(new a.C0019a("SELECTED HANDLER: " + N.b(b11.getClass()).B() + ". For " + b12 + " and null"));
        }
        return b11.getDestination(context, b12);
    }
}
