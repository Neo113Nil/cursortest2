package Ue0;

import Ae.M0;
import Je0.d;
import Sc.InterfaceC4008j;
import android.content.Context;
import ce0.InterfaceC5817a;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.logo.Alignment;
import com.yandex.mapkit.logo.HorizontalAlignment;
import com.yandex.mapkit.logo.Padding;
import com.yandex.mapkit.logo.VerticalAlignment;
import com.yandex.mapkit.map.RootMapObjectCollection;
import com.yandex.mapkit.mapview.MapView;
import ei0.InterfaceC6369b;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import me0.InterfaceC8137a;
import ne0.AbstractC8582a;
import ne0.InterfaceC8585d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import ve0.AbstractC10313a;
import xe0.InterfaceC10766e;
import xe0.InterfaceC10767f;
import xe0.InterfaceC10768g;
import ye0.InterfaceC10889a;
import ze0.InterfaceC11117a;

/* loaded from: classes3.dex */
public final class h extends AbstractC10313a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f27678b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M0<we0.x> f27679c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Ve0.a f27680d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xe0.j f27681e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27682f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f27683g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f27684h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f27685i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f27686j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f27687k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Object f27688l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Object f27689m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f27690n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f27691o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final A f27692p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final Object f27693q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final Object f27694r;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27695a;

        static {
            int[] iArr = new int[we0.r.values().length];
            try {
                iArr[we0.r.LEFT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[we0.r.RIGHT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[we0.r.LEFT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[we0.r.RIGHT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27695a = iArr;
        }
    }

    public h(@NotNull Context context, @NotNull M0 mapState, @NotNull GeoProviderConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapState, "mapState");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f27678b = context;
        this.f27679c = mapState;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27680d = new Ve0.a(context);
        this.f27681e = new xe0.j(0);
        this.f27682f = Sc.k.b(new l(this));
        Sc.n nVar = Sc.n.NONE;
        this.f27683g = Sc.k.a(nVar, new i(this));
        this.f27684h = Sc.k.a(nVar, new m(this));
        this.f27685i = Sc.k.a(nVar, new n(this));
        this.f27686j = Sc.k.a(nVar, new u(this));
        this.f27687k = Sc.k.a(nVar, new o(this));
        this.f27688l = Sc.k.a(nVar, new p(this));
        this.f27689m = Sc.k.a(nVar, new k(this));
        this.f27690n = Sc.k.a(nVar, new s(this));
        this.f27691o = Sc.k.a(nVar, new t(this));
        this.f27692p = new A(getContentView(), config);
        this.f27693q = Sc.k.a(nVar, new r(this));
        this.f27694r = Sc.k.a(nVar, new q(this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final RootMapObjectCollection n(h hVar) {
        return (RootMapObjectCollection) hVar.f27687k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final InterfaceC10767f o(h hVar) {
        return (InterfaceC10767f) hVar.f27694r.getValue();
    }

    @Override // be0.b
    public final void a(@NotNull Function0<Unit> onMapReady) {
        Je0.c cVar;
        InterfaceC6369b ozonTracker;
        Intrinsics.checkNotNullParameter(onMapReady, "onMapReady");
        ie0.g.f66321a.getClass();
        Je0.c cVar2 = null;
        if (ie0.g.c() == null) {
            Je0.c.f14654d = null;
        } else {
            cVar = Je0.c.f14654d;
            if (cVar != null) {
                cVar2 = Je0.c.f14654d;
            } else {
                GeoProxyConfig c11 = ie0.g.c();
                if (c11 == null || (ozonTracker = c11.getOzonTracker()) == null) {
                    d.a.a();
                } else {
                    Je0.c.f14654d = new Je0.c(ozonTracker);
                    cVar2 = Je0.c.f14654d;
                }
            }
        }
        if (cVar2 != null) {
            cVar2.c(this.f27692p.getTilesLoadingFlow());
        }
        onMapReady.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final InterfaceC10766e b() {
        return (InterfaceC10766e) this.f27688l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final InterfaceC8585d c() {
        return (InterfaceC8585d) this.f27685i.getValue();
    }

    @Override // ve0.b
    public final void clear() {
        b().d(0L);
        ye0.b.a(e());
        de0.e f7 = f();
        Iterator<T> it = f7.b().iterator();
        while (it.hasNext()) {
            f7.a(((de0.d) it.next()).getId());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final InterfaceC8137a d() {
        return (InterfaceC8137a) this.f27684h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    public final void dispose() {
        InterfaceC5817a g10 = g();
        Intrinsics.g(g10, "null cannot be cast to non-null type ru.ozon.mapsdk.yandex.YandexCameraController");
        ((c) g10).i();
        InterfaceC8585d c11 = c();
        Intrinsics.g(c11, "null cannot be cast to non-null type ru.ozon.mapsdk.common.locationcontroller.BaseLocationController");
        ((AbstractC8582a) c11).b();
        b().d(0L);
        ye0.b.a(e());
        InterfaceC10768g interfaceC10768g = (InterfaceC10768g) this.f27693q.getValue();
        Intrinsics.g(interfaceC10768g, "null cannot be cast to non-null type ru.ozon.mapsdk.common.placemarkscontroller.PlacemarkSelectionControllerImpl");
        ((xe0.h) interfaceC10768g).a();
        InterfaceC8137a d11 = d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.mapsdk.yandex.YandexGesturesController");
        ((d) d11).k();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final InterfaceC10889a e() {
        return (InterfaceC10889a) this.f27690n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final de0.e f() {
        return (de0.e) this.f27689m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final InterfaceC5817a g() {
        return (InterfaceC5817a) this.f27683g.getValue();
    }

    @Override // ve0.b
    @NotNull
    public final Ie0.c h() {
        return this.f27692p;
    }

    @Override // ve0.AbstractC10313a, ve0.b
    public final void onDestroy() {
        super.onDestroy();
        de0.e f7 = f();
        Intrinsics.g(f7, "null cannot be cast to non-null type ru.ozon.mapsdk.common.clustercontroller.implementation.PlacemarkClusterizersControllerImpl");
        ((ee0.j) f7).d();
        A a11 = this.f27692p;
        if (a11 == null) {
            a11 = null;
        }
        if (a11 != null) {
            a11.g();
        }
    }

    @Override // ve0.b
    public final void onPause() {
    }

    @Override // ve0.b
    public final void onResume() {
    }

    @Override // ve0.b
    public final void onStart() {
        getContentView().onStart();
        MapKitFactory.getInstance().onStart();
    }

    @Override // ve0.b
    public final void onStop() {
        getContentView().onStop();
        MapKitFactory.getInstance().onStop();
    }

    @Override // ve0.b
    @NotNull
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final MapView getContentView() {
        return (MapView) this.f27682f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final InterfaceC11117a r() {
        return (InterfaceC11117a) this.f27686j.getValue();
    }

    @Override // ve0.b
    public final void setLogoConfig(@NotNull we0.q logoConfig) {
        Alignment alignment;
        Intrinsics.checkNotNullParameter(logoConfig, "logoConfig");
        int i11 = a.f27695a[logoConfig.b().ordinal()];
        if (i11 == 1) {
            alignment = new Alignment(HorizontalAlignment.LEFT, VerticalAlignment.TOP);
        } else if (i11 == 2) {
            alignment = new Alignment(HorizontalAlignment.RIGHT, VerticalAlignment.TOP);
        } else if (i11 == 3) {
            alignment = new Alignment(HorizontalAlignment.LEFT, VerticalAlignment.BOTTOM);
        } else {
            if (i11 != 4) {
                throw new Sc.o();
            }
            alignment = new Alignment(HorizontalAlignment.RIGHT, VerticalAlignment.BOTTOM);
        }
        float f7 = this.f27678b.getResources().getDisplayMetrics().density;
        getContentView().getMap().getLogo().setAlignment(alignment);
        getContentView().getMap().getLogo().setPadding(new Padding((int) (logoConfig.a().e().floatValue() * f7), (int) (logoConfig.a().f().floatValue() * f7)));
    }
}
