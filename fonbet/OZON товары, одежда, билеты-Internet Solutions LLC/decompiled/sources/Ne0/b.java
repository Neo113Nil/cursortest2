package Ne0;

import De.C2862e;
import Le0.w;
import ce0.InterfaceC5817a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import we0.u;
import xe0.AbstractC10765d;
import xe0.j;

/* loaded from: classes3.dex */
public abstract class b extends AbstractC10765d {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Re0.e f19483h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final HashMap f19484i;

    static final class a extends AbstractC7737t implements Function1<ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f19485b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f19486c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f19487d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f19488e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z11, b bVar, u uVar, Function1<? super ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> function1) {
            super(1);
            this.f19485b = z11;
            this.f19486c = bVar;
            this.f19487d = uVar;
            this.f19488e = (AbstractC7737t) function1;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.mapsdk.libre.placemark.view.b<?> bVar) {
            ru.ozon.mapsdk.libre.placemark.view.b<?> libreMarker = bVar;
            Intrinsics.checkNotNullParameter(libreMarker, "libreMarker");
            if (this.f19485b) {
                Map<String, u> w11 = this.f19486c.w();
                u uVar = this.f19487d;
                w11.put(uVar.e(), uVar);
            }
            this.f19488e.invoke(libreMarker);
            return Unit.f71690a;
        }
    }

    /* renamed from: Ne0.b$b, reason: collision with other inner class name */
    static final class C0385b extends AbstractC7737t implements Function1<ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f19489b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f19490c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f19491d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0385b(boolean z11, b bVar, u uVar) {
            super(1);
            this.f19489b = z11;
            this.f19490c = bVar;
            this.f19491d = uVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.mapsdk.libre.placemark.view.b<?> bVar) {
            ru.ozon.mapsdk.libre.placemark.view.b<?> it = bVar;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f19489b) {
                Map<String, u> w11 = this.f19490c.w();
                u uVar = this.f19491d;
                w11.put(uVar.e(), uVar);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.mapsdk.libre.placemark.view.b<?> f19493c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ru.ozon.mapsdk.libre.placemark.view.b<?> bVar) {
            super(0);
            this.f19493c = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            b.this.v().f(this.f19493c);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull C2862e coroutineScope, @NotNull w map, @NotNull InterfaceC5817a cameraController, @NotNull MapLibreMap mapLibreMap, @NotNull j pinSelectSynchronizer, boolean z11) {
        super(z11, pinSelectSynchronizer, cameraController, coroutineScope);
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        this.f19483h = new Re0.e(map, mapLibreMap, cameraController.e(), pinSelectSynchronizer, new Ne0.c(1, this, b.class, "processMapPlacemarkClicked", "processMapPlacemarkClicked$mapsdk_fullFirebaseOpenglRelease(Lru/ozon/mapsdk/common/model/MapPlacemark;)V", 0));
        this.f19484i = new HashMap();
    }

    @Override // xe0.InterfaceC10766e
    @NotNull
    public final List<u> a() {
        return C7714v.U0(w().values());
    }

    @Override // xe0.AbstractC10765d
    public void t() {
        super.t();
        this.f19483h.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final Re0.e v() {
        return this.f19483h;
    }

    @NotNull
    protected Map<String, u> w() {
        return this.f19484i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(@NotNull u placemark, boolean z11, @NotNull Function1<? super ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> onPlacemarkAdded) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        Intrinsics.checkNotNullParameter(onPlacemarkAdded, "onPlacemarkAdded");
        this.f19483h.a(placemark, new a(z11, this, placemark, onPlacemarkAdded), new C0385b(z11, this, placemark));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(long j11, @NotNull String placemarkId) {
        Intrinsics.checkNotNullParameter(placemarkId, "placemarkId");
        w().remove(placemarkId);
        Re0.e eVar = this.f19483h;
        ru.ozon.mapsdk.libre.placemark.view.b<?> e11 = eVar.e(placemarkId);
        if (e11 == null) {
            return;
        }
        if (j11 != 0) {
            e11.n(j11, new c(e11));
        } else {
            eVar.f(e11);
        }
    }
}
