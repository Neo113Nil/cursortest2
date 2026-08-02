package Vg;

import C.C2699t;
import Sc.InterfaceC3999a;
import Vg.f;
import WZ.l;
import WZ.m;
import WZ.t;
import WZ.x;
import a00.C4911f;
import a00.h;
import java.util.LinkedHashMap;
import java.util.Map;
import k20.C7475g;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
public final class e extends Vg.a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4911f f32762c;

    /* renamed from: d, reason: collision with root package name */
    private final c f32763d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1<Tg.b, Boolean> f32764e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C7475g f32765f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final l f32766g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function0<C7854a> f32767h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final h f32768i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Map<Class<? extends Tg.b>, Function1<Tg.b, Unit>> f32769j;

    private e() {
        throw null;
    }

    public e(Tg.a aVar, InterfaceC7851b interfaceC7851b, C4911f c4911f, c cVar, Function1 function1, C7475g c7475g, l lVar, Function0 function0, h hVar, Map map) {
        super(interfaceC7851b, aVar);
        this.f32762c = c4911f;
        this.f32763d = cVar;
        this.f32764e = function1;
        this.f32765f = c7475g;
        this.f32766g = lVar;
        this.f32767h = function0;
        this.f32768i = hVar;
        this.f32769j = map;
    }

    private final void b(Tg.b bVar, ru.ozon.composer.ui.widget.l lVar) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t b11;
        if (!(bVar instanceof AtomAction.SendAnalytics) || (trackingInfo = ((AtomAction.SendAnalytics) bVar).getTrackingInfo()) == null || (b11 = x.b(trackingInfo, Long.valueOf(lVar.f()), null)) == null) {
            return;
        }
        boolean z11 = bVar instanceof AtomAction.ViewAction;
        l lVar2 = this.f32766g;
        if (z11) {
            m.c(lVar2, b11, null);
        } else if (bVar instanceof AtomAction.IgnoreViewPoolViewAction) {
            m.b(lVar2, b11, null);
        } else {
            m.a(lVar2, b11, null);
        }
    }

    @Override // Vg.a
    public final void a(@NotNull Tg.b action) {
        c cVar;
        Intrinsics.checkNotNullParameter(action, "action");
        C7854a invoke = this.f32767h.invoke();
        Intrinsics.g(invoke, "null cannot be cast to non-null type ru.ozon.composer.ui.widget.WidgetViewItem");
        ru.ozon.composer.ui.widget.l lVar = (ru.ozon.composer.ui.widget.l) invoke;
        Function1<Tg.b, Boolean> function1 = this.f32764e;
        if (function1 != null && function1.invoke(action).booleanValue()) {
            b(action, lVar);
            return;
        }
        String id2 = action.getId();
        f fVar = null;
        if (id2 != null && (cVar = this.f32763d) != null) {
            fVar = cVar.getHandler(id2);
        }
        if (fVar != null) {
            fVar.processWidgetAction(action, new f.a(this.f32768i, this.f32762c, lVar), this.f32765f);
            if (fVar.getManualAnalyticTracking()) {
                return;
            }
            b(action, lVar);
            return;
        }
        b(action, lVar);
        Function1<Tg.b, Unit> function12 = this.f32769j.get(action.getClass());
        if (function12 != null) {
            function12.invoke(action);
        } else {
            super.a(action);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C4911f f32770a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final h f32771b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Function0<C7854a> f32772c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final l f32773d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final Tg.a f32774e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final InterfaceC7851b f32775f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final C7475g f32776g;

        /* renamed from: h, reason: collision with root package name */
        private c f32777h;

        /* renamed from: i, reason: collision with root package name */
        private Function1<? super Tg.b, Boolean> f32778i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap f32779j;

        /* renamed from: Vg.e$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0582a extends C7735q implements Function1<Tg.b, Unit> {
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Tg.b bVar) {
                Tg.b p02 = bVar;
                Intrinsics.checkNotNullParameter(p02, "p0");
                ((e) this.receiver).a(p02);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC3999a
        public a(@NotNull C4911f container, @NotNull h viewModelOwnerProvider, @NotNull Function0<? extends C7854a> widgetViewItemProvider, @NotNull Ug.a component) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
            Intrinsics.checkNotNullParameter(widgetViewItemProvider, "widgetViewItemProvider");
            Intrinsics.checkNotNullParameter(component, "component");
            this.f32779j = new LinkedHashMap();
            this.f32770a = container;
            this.f32771b = viewModelOwnerProvider;
            this.f32772c = widgetViewItemProvider;
            this.f32773d = component.getTokenizedAnalytics();
            this.f32774e = ((C2699t) component.getActionNavigatorFactory()).a(container);
            this.f32775f = component.getController();
            this.f32776g = component.getStorage();
        }

        @NotNull
        public final e a() {
            c cVar = this.f32777h;
            Function1<? super Tg.b, Boolean> function1 = this.f32778i;
            Map t2 = U.t(this.f32779j);
            return new e(this.f32774e, this.f32775f, this.f32770a, cVar, function1, this.f32776g, this.f32773d, this.f32772c, this.f32771b, t2);
        }

        @NotNull
        public final Function1<Tg.b, Unit> b() {
            return new C0582a(1, a(), e.class, "handleAction", "handleAction(Lru/ozon/android/action/AtomAction;)V", 0);
        }

        @NotNull
        public final void c(@NotNull c store) {
            Intrinsics.checkNotNullParameter(store, "store");
            this.f32777h = store;
        }

        @NotNull
        public final void d(@NotNull Class key, @NotNull Function1 handler) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(handler, "handler");
            LinkedHashMap linkedHashMap = this.f32779j;
            kotlin.jvm.internal.U.g(1, handler);
            linkedHashMap.put(key, handler);
        }

        @NotNull
        public final void e(@NotNull Function1 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.f32778i = handler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull C4911f container, @NotNull h viewModelOwnerProvider, @NotNull Function0<? extends C7854a> widgetViewItemProvider, @NotNull l tokenizedAnalytics, @NotNull Tg.a actionNavigator, @NotNull InterfaceC7851b composerController, @NotNull C7475g widgetComponentStorage) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
            Intrinsics.checkNotNullParameter(widgetViewItemProvider, "widgetViewItemProvider");
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            Intrinsics.checkNotNullParameter(actionNavigator, "actionNavigator");
            Intrinsics.checkNotNullParameter(composerController, "composerController");
            Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
            this.f32779j = new LinkedHashMap();
            this.f32770a = container;
            this.f32771b = viewModelOwnerProvider;
            this.f32772c = widgetViewItemProvider;
            this.f32773d = tokenizedAnalytics;
            this.f32774e = actionNavigator;
            this.f32775f = composerController;
            this.f32776g = widgetComponentStorage;
        }
    }
}
