package Ne0;

import De.C2862e;
import Le0.w;
import Ne0.e;
import Re0.g;
import ce0.InterfaceC5817a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import xe0.InterfaceC10766e;
import xe0.InterfaceC10767f;
import xe0.j;

/* loaded from: classes3.dex */
public final class d implements InterfaceC10767f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f19494a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f19495b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC5817a f19496c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e f19497d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f19498e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final j f19499f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2862e f19500g;

    /* renamed from: h, reason: collision with root package name */
    private g f19501h;

    public d(@NotNull w map, @NotNull MapLibreMap mapLibreMap, @NotNull InterfaceC5817a cameraController, @NotNull e librePlacemarkImplementation, @NotNull a draggableControllerProvider, @NotNull j pinSelectSync, @NotNull C2862e coroutineScope) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(librePlacemarkImplementation, "librePlacemarkImplementation");
        Intrinsics.checkNotNullParameter(draggableControllerProvider, "draggableControllerProvider");
        Intrinsics.checkNotNullParameter(pinSelectSync, "pinSelectSync");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f19494a = map;
        this.f19495b = mapLibreMap;
        this.f19496c = cameraController;
        this.f19497d = librePlacemarkImplementation;
        this.f19498e = draggableControllerProvider;
        this.f19499f = pinSelectSync;
        this.f19500g = coroutineScope;
    }

    @Override // xe0.InterfaceC10767f
    @NotNull
    public final InterfaceC10766e a() {
        e eVar = this.f19497d;
        boolean z11 = eVar instanceof e.c;
        MapLibreMap mapLibreMap = this.f19495b;
        if (z11) {
            return new g(this.f19500g, this.f19494a, this.f19496c, mapLibreMap, this.f19499f, false);
        }
        boolean z12 = eVar instanceof e.b;
        a aVar = this.f19498e;
        if (z12) {
            return new Pe0.d(this.f19494a, mapLibreMap, aVar.c(), this.f19496c, this.f19500g, false, false, false, this.f19499f);
        }
        return new Qe0.c(this.f19494a, mapLibreMap, aVar.b(), this.f19496c, this.f19500g, false, false, false, this.f19499f);
    }

    @Override // xe0.InterfaceC10767f
    @NotNull
    public final InterfaceC10766e b() {
        e eVar = this.f19497d;
        boolean z11 = eVar instanceof e.c;
        MapLibreMap mapLibreMap = this.f19495b;
        if (z11) {
            g gVar = this.f19501h;
            if (gVar != null) {
                return gVar;
            }
            g gVar2 = new g(this.f19500g, this.f19494a, this.f19496c, mapLibreMap, this.f19499f, true);
            this.f19501h = gVar2;
            return gVar2;
        }
        boolean z12 = eVar instanceof e.b;
        a aVar = this.f19498e;
        if (z12) {
            return new Pe0.d(this.f19494a, mapLibreMap, aVar.c(), this.f19496c, this.f19500g, true, true, true, this.f19499f);
        }
        return new Qe0.c(this.f19494a, mapLibreMap, aVar.b(), this.f19496c, this.f19500g, true, true, true, this.f19499f);
    }
}
