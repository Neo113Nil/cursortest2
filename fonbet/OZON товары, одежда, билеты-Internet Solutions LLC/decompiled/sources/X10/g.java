package X10;

import Ae.C;
import Ae.C0;
import Ae.C2399j;
import Ae.C2401k;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.Z;
import Sc.s;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.K;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.H0;

/* loaded from: classes7.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f33981a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final He.c f33982b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33983c;

    /* renamed from: d, reason: collision with root package name */
    private B0 f33984d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C0 f33985e;

    /* renamed from: f, reason: collision with root package name */
    private l10.i f33986f;

    /* renamed from: g, reason: collision with root package name */
    private fk0.a f33987g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.widget.async.WidgetViewAsyncCreatorImpl$init$1", f = "WidgetViewAsyncCreator.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<List<? extends ru.ozon.composer.ui.widget.l>, kotlin.coroutines.d<? super InterfaceC2395h<? extends ru.ozon.composer.ui.widget.l>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f33988d;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(2, dVar);
            aVar.f33988d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends ru.ozon.composer.ui.widget.l> list, kotlin.coroutines.d<? super InterfaceC2395h<? extends ru.ozon.composer.ui.widget.l>> dVar) {
            return ((a) create(list, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            return new C2401k((List) this.f33988d);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.widget.async.WidgetViewAsyncCreatorImpl$init$2", f = "WidgetViewAsyncCreator.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.composer.ui.widget.l, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f33989d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = g.this.new b(dVar);
            bVar.f33989d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.composer.ui.widget.l lVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(lVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            g.c(g.this, (ru.ozon.composer.ui.widget.l) this.f33989d);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.widget.async.WidgetViewAsyncCreatorImpl$init$3", f = "WidgetViewAsyncCreator.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super ru.ozon.composer.ui.widget.l>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Throwable f33991d;

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super ru.ozon.composer.ui.widget.l> interfaceC2397i, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = new c(3, dVar);
            cVar.f33991d = th2;
            return cVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            H00.c.a(this.f33991d);
            return Unit.f71690a;
        }
    }

    public g(n20.k widgetStore) {
        He.c defaultDispatcher = C10720e0.a();
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.f33981a = widgetStore;
        this.f33982b = defaultDispatcher;
        this.f33985e = E0.b(0, 1, null, 5);
    }

    public static final void c(g gVar, ru.ozon.composer.ui.widget.l lVar) {
        fk0.a aVar;
        View createView;
        androidx.recyclerview.widget.g e02;
        androidx.recyclerview.widget.g e03;
        l10.i iVar = gVar.f33986f;
        androidx.recyclerview.widget.g e04 = iVar != null ? iVar.e0() : null;
        if (e04 == null || (aVar = gVar.f33987g) == null) {
            return;
        }
        int j11 = lVar.j();
        InterfaceC8046a<?, ? extends l20.c> viewMapper = gVar.f33981a.getViewMapper(j11);
        if (!(viewMapper instanceof ru.ozon.composer.ui.widget.g)) {
            viewMapper = null;
        }
        ru.ozon.composer.ui.widget.g gVar2 = (ru.ozon.composer.ui.widget.g) viewMapper;
        if (gVar2 == null) {
            return;
        }
        l10.i iVar2 = gVar.f33986f;
        Object context = (iVar2 == null || (e03 = iVar2.e0()) == null) ? null : e03.getContext();
        fk0.d dVar = context instanceof fk0.d ? (fk0.d) context : null;
        fk0.c prefetchViewPool = dVar != null ? dVar.getPrefetchViewPool() : null;
        if (prefetchViewPool != null) {
            Integer d11 = prefetchViewPool.d(j11);
            if ((d11 != null ? d11.intValue() : 0) >= prefetchViewPool.c(j11)) {
                return;
            }
        }
        Integer layout = gVar2.getLayout();
        try {
            if (layout != null) {
                createView = aVar.a(layout.intValue(), e04);
            } else {
                createView = gVar2.createView(e04);
                if (createView == null) {
                    return;
                }
            }
            l10.i iVar3 = gVar.f33986f;
            Object context2 = (iVar3 == null || (e02 = iVar3.e0()) == null) ? null : e02.getContext();
            fk0.d dVar2 = context2 instanceof fk0.d ? (fk0.d) context2 : null;
            fk0.c prefetchViewPool2 = dVar2 != null ? dVar2.getPrefetchViewPool() : null;
            if (prefetchViewPool2 != null) {
                prefetchViewPool2.e(j11, createView);
            }
        } catch (Exception unused) {
        }
    }

    @Override // X10.f
    public final void a(@NotNull l10.i container) {
        InterfaceC2395h a11;
        Intrinsics.checkNotNullParameter(container, "container");
        this.f33986f = container;
        Context context = container.e0().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f33987g = new fk0.a(context);
        B0 b02 = this.f33984d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        a11 = Z.a(this.f33985e, new a(2, null));
        this.f33984d = C2399j.C(C2399j.B(new C(new C2408n0(a11, new b(null)), new c(3, null)), this.f33982b), K.a(container.Q().g()));
    }

    @Override // X10.f
    public final void b(@NotNull ArrayList viewItems) {
        Intrinsics.checkNotNullParameter(viewItems, "viewItems");
        if (this.f33983c) {
            return;
        }
        this.f33985e.tryEmit(viewItems);
    }

    @Override // X10.f
    public final void disable() {
        this.f33983c = true;
    }

    @Override // X10.f
    public final void onDestroy() {
        B0 b02 = this.f33984d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f33984d = null;
        this.f33987g = null;
        this.f33986f = null;
    }
}
