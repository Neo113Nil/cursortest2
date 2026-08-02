package Re0;

import De.C2862e;
import Le0.w;
import android.animation.Animator;
import android.animation.AnimatorSet;
import ce0.InterfaceC5817a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import we0.u;
import we0.z;
import xe0.j;

/* loaded from: classes3.dex */
public final class g extends Ne0.b {

    static final class a extends AbstractC7737t implements Function1<ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f25056b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11) {
            super(1);
            this.f25056b = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.mapsdk.libre.placemark.view.b<?> bVar) {
            ru.ozon.mapsdk.libre.placemark.view.b<?> libreMarker = bVar;
            Intrinsics.checkNotNullParameter(libreMarker, "libreMarker");
            long j11 = this.f25056b;
            if (j11 != 0) {
                libreMarker.m(j11);
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f25057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList arrayList) {
            super(1);
            this.f25057b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.mapsdk.libre.placemark.view.b<?> bVar) {
            ru.ozon.mapsdk.libre.placemark.view.b<?> libreMarker = bVar;
            Intrinsics.checkNotNullParameter(libreMarker, "libreMarker");
            this.f25057b.add(libreMarker.g());
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f25058b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.mapsdk.libre.placemark.view.b<?> bVar) {
            ru.ozon.mapsdk.libre.placemark.view.b<?> it = bVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f71690a;
        }
    }

    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f25059a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f25060b;

        public d(ArrayList arrayList, g gVar) {
            this.f25059a = arrayList;
            this.f25060b = gVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
            ArrayList arrayList = this.f25059a;
            e v11 = this.f25060b.v();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v11.f((ru.ozon.mapsdk.libre.placemark.view.b) it.next());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull C2862e coroutineScope, @NotNull w map, @NotNull InterfaceC5817a cameraController, @NotNull MapLibreMap mapLibreMap, @NotNull j pinSelectSynchronizer, boolean z11) {
        super(coroutineScope, map, cameraController, mapLibreMap, pinSelectSynchronizer, z11);
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
    }

    @Override // xe0.InterfaceC10766e
    public final void b(long j11, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        z(j11, id2);
    }

    @Override // xe0.InterfaceC10766e
    public final void c(long j11, @NotNull List placemarks) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        ArrayList arrayList = new ArrayList();
        Iterator it = placemarks.iterator();
        while (it.hasNext()) {
            x((u) it.next(), true, new b(arrayList));
        }
        if (j11 != 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(j11);
            animatorSet.start();
        }
    }

    @Override // xe0.InterfaceC10766e
    public final u getPlacemarkById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        try {
            return (u) ((HashMap) w()).get(id2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // xe0.InterfaceC10766e
    public final void j(long j11, @NotNull List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ids.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) w()).remove(str);
            ru.ozon.mapsdk.libre.placemark.view.b<?> e11 = v().e(str);
            if (e11 != null) {
                if (j11 != 0) {
                    arrayList.add(e11.h());
                    arrayList2.add(e11);
                } else {
                    v().f(e11);
                }
            }
        }
        if (j11 != 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(j11);
            animatorSet.addListener(new d(arrayList2, this));
            animatorSet.start();
        }
    }

    @Override // xe0.InterfaceC10766e
    public final void m(@NotNull u placemark, long j11) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        x(placemark, true, new a(j11));
    }

    @Override // xe0.AbstractC10765d
    public final void s(@NotNull String id2, @NotNull z displayOptions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        u uVar = (u) ((HashMap) w()).get(id2);
        if (uVar != null) {
            x(u.a(uVar, null, displayOptions, null, null, 1021), false, c.f25058b);
        }
    }
}
