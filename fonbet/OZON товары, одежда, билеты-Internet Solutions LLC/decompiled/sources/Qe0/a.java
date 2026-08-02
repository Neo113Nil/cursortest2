package Qe0;

import Le0.w;
import Sc.InterfaceC3999a;
import eg.o;
import eg.q;
import eg.s;
import eg.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;

@InterfaceC3999a
/* loaded from: classes3.dex */
public final class a extends u {

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final b f23355s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final ArrayList f23356t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull w mapView, @NotNull MapLibreMap mapLibreMap, @NotNull Style style, String str, String str2, @NotNull b draggableSymbolController) {
        super(mapView, mapLibreMap, style, str, str2);
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(draggableSymbolController, "draggableSymbolController");
        this.f23355s = draggableSymbolController;
        this.f23356t = new ArrayList();
    }

    public final void A(o oVar) {
        q dragListener = (q) oVar;
        Intrinsics.checkNotNullParameter(dragListener, "dragListener");
        this.f23356t.add(dragListener);
    }

    @Override // eg.c
    public final void i(List<s> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f23355s.g((s) it.next());
            }
        }
        super.i(list);
    }

    @NotNull
    public final ArrayList n() {
        return this.f23356t;
    }
}
