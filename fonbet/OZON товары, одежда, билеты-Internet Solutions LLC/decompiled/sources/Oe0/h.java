package Oe0;

import Le0.w;
import Sc.s;
import java.util.HashMap;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class h extends d {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final HashMap f20346i;

    static final class a extends AbstractC7737t implements Function2<Long, Long, Long> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20347b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Long invoke(Long l11, Long l12) {
            Long oldValue = l11;
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            Intrinsics.checkNotNullParameter(l12, "<unused var>");
            return Long.valueOf(oldValue.longValue() + 1);
        }
    }

    static final class b extends AbstractC7737t implements Function2<Long, Long, Long> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20348b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Long invoke(Long l11, Long l12) {
            Long oldValue = l11;
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            Intrinsics.checkNotNullParameter(l12, "<unused var>");
            return Long.valueOf(oldValue.longValue() - 1);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.cahce.LibreSimpleResourceCache$removeResourceByName$2", f = "LibreSimpleResourceCache.kt", l = {}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f20350e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f20350e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new c(this.f20350e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            Style u11 = h.this.e().u();
            if (u11 != null) {
                u11.p(this.f20350e);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull MapLibreMap mapLibreMap, @NotNull w mapView, @NotNull xe0.j pinSelectSynchronizer, boolean z11) {
        super(false, mapLibreMap, mapView, pinSelectSynchronizer, z11);
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        this.f20346i = new HashMap();
    }

    @Override // Oe0.d
    protected final void j(@NotNull String newResourceName) {
        Intrinsics.checkNotNullParameter(newResourceName, "newResourceName");
        this.f20346i.put(newResourceName, 1L);
    }

    @Override // Oe0.d
    protected final void k(@NotNull String existResourceName) {
        Intrinsics.checkNotNullParameter(existResourceName, "existResourceName");
        HashMap hashMap = this.f20346i;
        final a aVar = a.f20347b;
        hashMap.merge(existResourceName, 1L, new BiFunction() { // from class: Oe0.g
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (Long) Function2.this.invoke(obj, obj2);
            }
        });
    }

    @Override // Oe0.d
    public final void l(@NotNull String resourceName) {
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        HashMap hashMap = this.f20346i;
        Long l11 = (Long) hashMap.get(resourceName);
        if ((l11 != null ? l11.longValue() : 0L) > 1) {
            final b bVar = b.f20348b;
            hashMap.merge(resourceName, 1L, new BiFunction() { // from class: Oe0.f
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return (Long) Function2.this.invoke(obj, obj2);
                }
            });
            return;
        }
        hashMap.remove(resourceName);
        super.l(resourceName);
        if (i()) {
            C10727i.c(g(), null, null, new c(resourceName, null), 3);
            return;
        }
        Style u11 = e().u();
        if (u11 != null) {
            u11.p(resourceName);
        }
    }
}
