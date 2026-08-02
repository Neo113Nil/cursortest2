package Te0;

import Ae.C2399j;
import Ae.C2408n0;
import De.C2862e;
import Le0.w;
import android.content.Context;
import android.graphics.drawable.Drawable;
import hd.C6915b;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ne0.g;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import ru.ozon.app.android.R;
import se0.AbstractC9672a;
import we0.InterfaceC10542A;
import we0.m;
import we0.p;
import we0.u;
import we0.z;
import xe.B0;
import xe.H0;
import xe0.InterfaceC10766e;

/* loaded from: classes3.dex */
public final class b extends AbstractC9672a {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2862e f27137g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC10766e f27138h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final e f27139i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final AbstractC9672a.b f27140j;

    /* renamed from: k, reason: collision with root package name */
    private B0 f27141k;

    private static final class a extends AbstractC9672a.b {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final u f27142c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final u f27143d;

        public a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int c11 = C6915b.c(48 * context.getResources().getDisplayMetrics().density);
            m mVar = new m(0.0d, 0.0d);
            Drawable drawable = context.getDrawable(R.drawable.map_user_marker_with_arrow_user);
            Intrinsics.f(drawable);
            u uVar = new u(mVar, new z(new InterfaceC10542A.c(androidx.core.graphics.drawable.b.b(drawable, c11, c11, 4)), null, false, false, 0.0f, 0.0f, 0.0f, 254), null, "USER_BEARING_STATIC_IMAGE", null, 756);
            uVar.m("userLocationIcon");
            this.f27142c = uVar;
            m mVar2 = new m(0.0d, 0.0d);
            Drawable drawable2 = context.getDrawable(R.drawable.map_user_marker_with_arrow);
            Intrinsics.f(drawable2);
            u uVar2 = new u(mVar2, new z(new InterfaceC10542A.c(androidx.core.graphics.drawable.b.b(drawable2, c11, c11, 4)), null, false, false, 0.0f, 0.0f, 0.0f, 254), null, "USER_BEARING_PIN_ARROW", null, 756);
            uVar2.m("userLocationIcon");
            this.f27143d = uVar2;
        }

        @Override // se0.AbstractC9672a.b
        public final void d(Object obj) {
            this.f27142c.m(obj);
            this.f27143d.m(obj);
        }

        @NotNull
        public final u e() {
            return this.f27143d;
        }

        @NotNull
        public final u f() {
            return this.f27142c;
        }
    }

    public b(w mapView, MapLibreMap mapboxMap, C2862e coroutineScope, InterfaceC10766e placemarkController) {
        e accuracyHaloController = new e(mapView, mapboxMap, coroutineScope);
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(placemarkController, "placemarkController");
        Intrinsics.checkNotNullParameter(accuracyHaloController, "accuracyHaloController");
        this.f27137g = coroutineScope;
        this.f27138h = placemarkController;
        this.f27139i = accuracyHaloController;
        Context context = mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f27140j = new a(context);
    }

    @Override // se0.AbstractC9672a, se0.c
    public final void a(@NotNull p location) {
        Intrinsics.checkNotNullParameter(location, "location");
        super.a(location);
    }

    @Override // se0.AbstractC9672a, se0.c
    public final void b(@NotNull g userMode) {
        Intrinsics.checkNotNullParameter(userMode, "userMode");
        this.f27138h.clear();
        super.b(userMode);
        this.f27139i.b();
    }

    @Override // se0.AbstractC9672a
    @NotNull
    protected final AbstractC9672a.b e() {
        return this.f27140j;
    }

    @Override // se0.AbstractC9672a
    public final void h(@NotNull u placemark) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        this.f27138h.insertPlacemark(placemark);
    }

    @Override // se0.AbstractC9672a
    protected final void m(@NotNull AbstractC9672a.b userMode) {
        Float d11;
        Intrinsics.checkNotNullParameter(userMode, "userMode");
        if (userMode instanceof a) {
            a aVar = (a) userMode;
            u e11 = aVar.e();
            z d12 = aVar.e().d();
            p c11 = c();
            List a02 = C7714v.a0(k(e11, "USER_BEARING_PIN_ARROW", z.a(d12, null, null, false, 0.0f, (c11 == null || (d11 = c11.d()) == null) ? 0.0f : d11.floatValue(), 159)));
            InterfaceC10766e interfaceC10766e = this.f27138h;
            interfaceC10766e.h(1L, a02);
            interfaceC10766e.h(2L, C7714v.a0(k(aVar.f(), "USER_BEARING_STATIC_IMAGE", z.a(aVar.f().d(), null, null, false, 1.0f, 0.0f, 223))));
        }
    }

    @Override // se0.AbstractC9672a
    protected final void q(boolean z11) {
        n(d());
        if (z11) {
            B0 b02 = this.f27141k;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f27141k = C2399j.C(new C2408n0(this.f27138h.k(), new c(this, null)), this.f27137g);
            return;
        }
        B0 b03 = this.f27141k;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
    }
}
