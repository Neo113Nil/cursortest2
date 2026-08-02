package V40;

import Ae.C0;
import Ae.E0;
import D3.h;
import Sc.s;
import Y40.a;
import g30.InterfaceC6618a;
import h3.C6788a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2OnboardingDTO;
import ru.ozon.fintech.ui.ActionResult2UI;
import x40.C10656a;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.L0;
import xe.M;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10656a f28082a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f28083b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0 f28084c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f28085d;

    /* renamed from: e, reason: collision with root package name */
    public C6788a f28086e;

    /* renamed from: f, reason: collision with root package name */
    public Function0<Unit> f28087f;

    /* renamed from: g, reason: collision with root package name */
    public Function1<? super ActionResult2UI, Unit> f28088g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC6618a f28089h;

    /* renamed from: i, reason: collision with root package name */
    private Y40.c f28090i;

    /* renamed from: j, reason: collision with root package name */
    private int f28091j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f28092k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f28093l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f28094m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f28095n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28096o;

    /* renamed from: p, reason: collision with root package name */
    private B0 f28097p;

    public interface a {
        @NotNull
        b provideOnboardingInteractor();
    }

    @e(c = "ru.ozon.fintech.features.cbottomonboarding.interactor.v1.OnboardingSlidesInteractor$putOnboardingPageFragment$$inlined$post$1", f = "OnboardingSlidesInteractor.kt", l = {11}, m = "invokeSuspend")
    /* renamed from: V40.b$b, reason: collision with other inner class name */
    public static final class C0573b extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f28098d;

        @e(c = "ru.ozon.fintech.features.cbottomonboarding.interactor.v1.OnboardingSlidesInteractor$putOnboardingPageFragment$$inlined$post$1$1", f = "OnboardingSlidesInteractor.kt", l = {}, m = "invokeSuspend")
        /* renamed from: V40.b$b$a */
        public static final class a extends j implements Function2<M, d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f28100d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, d dVar) {
                super(2, dVar);
                this.f28100d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new a(this.f28100d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                b bVar = this.f28100d;
                b.b(bVar);
                C6788a c6788a = bVar.f28086e;
                if (c6788a == null) {
                    Intrinsics.n("viewModelScope");
                    throw null;
                }
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(c6788a, He.b.f10879b, null, bVar.new c(null), 2);
                return Unit.f71690a;
            }
        }

        public C0573b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new C0573b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((C0573b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f28098d;
            if (i11 == 0) {
                s.b(obj);
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                a aVar2 = new a(b.this, null);
                this.f28098d = 1;
                if (C10727i.f(l02, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @e(c = "ru.ozon.fintech.features.cbottomonboarding.interactor.v1.OnboardingSlidesInteractor$putOnboardingPageFragment$lambda$7$$inlined$postDelayed$1", f = "OnboardingSlidesInteractor.kt", l = {19, 20}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f28101d;

        @e(c = "ru.ozon.fintech.features.cbottomonboarding.interactor.v1.OnboardingSlidesInteractor$putOnboardingPageFragment$lambda$7$$inlined$postDelayed$1$1", f = "OnboardingSlidesInteractor.kt", l = {}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f28103d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, d dVar) {
                super(2, dVar);
                this.f28103d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new a(this.f28103d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                this.f28103d.i(false, false);
                return Unit.f71690a;
            }
        }

        public c(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (xe.C10727i.f(r6, r1, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        
            if (xe.Y.b(1000, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f28101d;
            if (i11 == 0) {
                s.b(obj);
                this.f28101d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            a aVar2 = new a(b.this, null);
            this.f28101d = 2;
        }
    }

    public b(@NotNull C10656a cbottomMapper2) {
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        this.f28082a = cbottomMapper2;
        EnumC11113a enumC11113a = EnumC11113a.DROP_LATEST;
        this.f28083b = E0.a(0, 1, enumC11113a);
        this.f28084c = E0.a(0, 1, enumC11113a);
        this.f28085d = E0.a(0, 1, enumC11113a);
        this.f28092k = new LinkedHashMap();
        this.f28093l = new LinkedHashMap();
        this.f28094m = new LinkedHashMap();
        this.f28095n = new LinkedHashMap();
    }

    public static Unit a(b bVar) {
        int i11 = bVar.f28091j;
        h.g(i11, "setFrameEnd framePos=", "OnboardingSlidesInteractor");
        Y40.c cVar = bVar.f28090i;
        if (i11 < (cVar != null ? ((ArrayList) cVar.a()).size() : 0)) {
            bVar.f28084c.tryEmit(Integer.valueOf(i11 + 1));
        }
        return Unit.f71690a;
    }

    public static final void b(b bVar) {
        LinkedHashMap linkedHashMap = bVar.f28092k;
        linkedHashMap.put(Integer.valueOf(bVar.f28091j), new a.AbstractC0633a.C0634a(false));
        U40.c.a("OnboardingSlidesInteractor", "startUp frameStatuses=" + linkedHashMap);
        bVar.r();
    }

    private final void r() {
        Z40.b bVar;
        for (Map.Entry entry : this.f28095n.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            WeakReference weakReference = (WeakReference) entry.getValue();
            Y40.a aVar = (Y40.a) this.f28092k.get(Integer.valueOf(intValue));
            if (aVar != null && weakReference != null && (bVar = (Z40.b) weakReference.get()) != null) {
                bVar.X(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        Z40.b bVar;
        Y40.c cVar = this.f28090i;
        if (cVar != null) {
            int i11 = 0;
            for (Object obj : cVar.a()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                Long l11 = (Long) this.f28093l.get(Integer.valueOf(i11));
                long longValue = l11 != null ? l11.longValue() : 0L;
                WeakReference weakReference = (WeakReference) this.f28095n.get(Integer.valueOf(i11));
                long S11 = (weakReference == null || (bVar = (Z40.b) weakReference.get()) == null) ? 0L : bVar.S();
                int i13 = this.f28091j;
                this.f28094m.put(Integer.valueOf(i11), Float.valueOf(i11 < i13 ? 1.0f : (i11 <= i13 && longValue != 0) ? S11 / longValue : 0.0f));
                i11 = i12;
            }
        }
        this.f28085d.tryEmit(Boolean.TRUE);
    }

    public final Y40.a d(int i11) {
        return (Y40.a) this.f28092k.get(Integer.valueOf(i11));
    }

    public final Y40.b e(int i11) {
        Y40.c cVar = this.f28090i;
        if (cVar != null) {
            return (Y40.b) ((ArrayList) cVar.a()).get(i11);
        }
        return null;
    }

    @NotNull
    public final C0 f() {
        return this.f28084c;
    }

    public final Y40.c g() {
        return this.f28090i;
    }

    @NotNull
    public final C0 h() {
        return this.f28083b;
    }

    public final void i(boolean z11, boolean z12) {
        String str;
        String b11;
        String str2;
        Y40.c cVar = this.f28090i;
        LinkedHashMap linkedHashMap = this.f28092k;
        if (cVar != null) {
            int i11 = 0;
            for (Object obj : cVar.a()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                int i13 = this.f28091j;
                if (i11 == i13) {
                    linkedHashMap.put(Integer.valueOf(i11), new a.AbstractC0633a.C0634a(z11));
                } else {
                    int i14 = i13 - 1;
                    if (i11 > i13 + 1 || i14 > i11) {
                        linkedHashMap.put(Integer.valueOf(i11), a.b.f34571a);
                    } else {
                        linkedHashMap.put(Integer.valueOf(i11), a.AbstractC0633a.b.f34570a);
                    }
                }
                i11 = i12;
            }
        }
        U40.c.a("OnboardingSlidesInteractor", "handleVisibleFrames frameStatuses=" + linkedHashMap);
        u();
        r();
        if (z11) {
            return;
        }
        InterfaceC6618a interfaceC6618a = this.f28089h;
        if (interfaceC6618a == null) {
            Intrinsics.n("fintechAnalyticInteractor");
            throw null;
        }
        int i15 = this.f28091j;
        Y40.c cVar2 = this.f28090i;
        String e11 = cVar2 != null ? cVar2.e() : null;
        Y40.c cVar3 = this.f28090i;
        if (cVar3 == null || (str = cVar3.b()) == null) {
            str = "";
        }
        interfaceC6618a.V0(i15, e11, str);
        if (z12) {
            InterfaceC6618a interfaceC6618a2 = this.f28089h;
            if (interfaceC6618a2 == null) {
                Intrinsics.n("fintechAnalyticInteractor");
                throw null;
            }
            int i16 = this.f28091j;
            Y40.c cVar4 = this.f28090i;
            String e12 = cVar4 != null ? cVar4.e() : null;
            Y40.c cVar5 = this.f28090i;
            if (cVar5 == null || (str2 = cVar5.b()) == null) {
                str2 = "";
            }
            interfaceC6618a2.l1(i16, e12, str2);
        }
        if (this.f28090i != null) {
            Function1<? super ActionResult2UI, Unit> function1 = this.f28088g;
            if (function1 == null) {
                Intrinsics.n("actionListenerV2");
                throw null;
            }
            Y40.c cVar6 = this.f28090i;
            function1.invoke(new ActionResult2UI((cVar6 == null || (b11 = cVar6.b()) == null) ? "" : b11, null, ActionResult2UI.Type.SELECTED, null, null, null, Integer.valueOf(this.f28091j), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097080, null));
        }
    }

    public final void j(int i11) {
        this.f28091j = i11;
    }

    public final void k() {
        this.f28096o = false;
        this.f28090i = null;
        B0 b02 = this.f28097p;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }

    public final void l() {
        B0 b02 = this.f28097p;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        LinkedHashMap linkedHashMap = this.f28092k;
        int i11 = 0;
        for (Object obj : linkedHashMap.values()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (((Y40.a) obj) instanceof a.AbstractC0633a.C0634a) {
                linkedHashMap.put(Integer.valueOf(i11), a.AbstractC0633a.b.f34570a);
            }
            i11 = i12;
        }
        r();
    }

    public final void m() {
        if (this.f28090i != null && this.f28096o) {
            i(false, false);
        }
        B0 b02 = this.f28097p;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        C6788a c6788a = this.f28086e;
        if (c6788a == null) {
            Intrinsics.n("viewModelScope");
            throw null;
        }
        this.f28097p = C10727i.c(c6788a, null, null, new V40.c(this, null), 3);
        this.f28096o = true;
    }

    public final void n(int i11, @NotNull Z40.b oneFramePageFragment) {
        Intrinsics.checkNotNullParameter(oneFramePageFragment, "oneFramePageFragment");
        this.f28095n.put(Integer.valueOf(i11), new WeakReference(oneFramePageFragment));
        if (this.f28091j == i11) {
            C6788a c6788a = this.f28086e;
            if (c6788a == null) {
                Intrinsics.n("viewModelScope");
                throw null;
            }
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(c6788a, He.b.f10879b, null, new C0573b(null), 2);
        }
    }

    public final void o(int i11) {
        this.f28095n.remove(Integer.valueOf(i11));
    }

    public final void p(@NotNull String actionId) {
        String e11;
        String b11;
        String b12;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        String str = "";
        if (kotlin.text.h.e0(actionId, "next", false)) {
            InterfaceC6618a interfaceC6618a = this.f28089h;
            if (interfaceC6618a == null) {
                Intrinsics.n("fintechAnalyticInteractor");
                throw null;
            }
            int i11 = this.f28091j;
            Y40.c cVar = this.f28090i;
            e11 = cVar != null ? cVar.e() : null;
            Y40.c cVar2 = this.f28090i;
            if (cVar2 != null && (b12 = cVar2.b()) != null) {
                str = b12;
            }
            interfaceC6618a.x1(i11, e11, str);
            return;
        }
        if (kotlin.text.h.e0(actionId, "login", false)) {
            InterfaceC6618a interfaceC6618a2 = this.f28089h;
            if (interfaceC6618a2 == null) {
                Intrinsics.n("fintechAnalyticInteractor");
                throw null;
            }
            int i12 = this.f28091j;
            Y40.c cVar3 = this.f28090i;
            e11 = cVar3 != null ? cVar3.e() : null;
            Y40.c cVar4 = this.f28090i;
            if (cVar4 != null && (b11 = cVar4.b()) != null) {
                str = b11;
            }
            interfaceC6618a2.c2(i12, e11, str);
        }
    }

    public final void q(int i11) {
        this.f28084c.tryEmit(Integer.valueOf(i11));
    }

    public final void s(Cbottom2OnboardingDTO cbottom2OnboardingDTO) {
        Y40.c cVar;
        int i11 = 0;
        if (cbottom2OnboardingDTO == null) {
            cVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            for (Object obj : cbottom2OnboardingDTO.getFrames()) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                Cbottom2OnboardingDTO.FrameDTO frameDTO = (Cbottom2OnboardingDTO.FrameDTO) obj;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                List<F40.a> topWidgets = frameDTO.getTopWidgets();
                C10656a c10656a = this.f28082a;
                if (topWidgets != null) {
                    String id2 = cbottom2OnboardingDTO.getId();
                    Function1<? super ActionResult2UI, Unit> function1 = this.f28088g;
                    if (function1 == null) {
                        Intrinsics.n("actionListenerV2");
                        throw null;
                    }
                    c10656a.getClass();
                    arrayList2.addAll(C10656a.b(id2, topWidgets, function1, null));
                }
                List<F40.a> bottomWidgets = frameDTO.getBottomWidgets();
                if (bottomWidgets != null) {
                    String id3 = cbottom2OnboardingDTO.getId();
                    Function1<? super ActionResult2UI, Unit> function12 = this.f28088g;
                    if (function12 == null) {
                        Intrinsics.n("actionListenerV2");
                        throw null;
                    }
                    c10656a.getClass();
                    arrayList3.addAll(C10656a.b(id3, bottomWidgets, function12, null));
                }
                List<F40.a> centerWidgets = frameDTO.getCenterWidgets();
                if (centerWidgets != null) {
                    String id4 = cbottom2OnboardingDTO.getId();
                    Function1<? super ActionResult2UI, Unit> function13 = this.f28088g;
                    if (function13 == null) {
                        Intrinsics.n("actionListenerV2");
                        throw null;
                    }
                    c10656a.getClass();
                    arrayList4.addAll(C10656a.b(id4, centerWidgets, function13, null));
                }
                arrayList.add(new Y40.b(frameDTO.getId(), i12, frameDTO.getBackground(), frameDTO.getDuration(), frameDTO.getAutoplay(), frameDTO.getImageUrl(), frameDTO.getVideoUrl(), arrayList2, arrayList3, arrayList4, null, null, null));
                i12 = i13;
            }
            cVar = new Y40.c(cbottom2OnboardingDTO.getId(), Math.min(Math.abs(cbottom2OnboardingDTO.getSelectedFrame()), cbottom2OnboardingDTO.getFrames().size() - 1), cbottom2OnboardingDTO.getWidgetName(), arrayList, null);
        }
        this.f28090i = cVar;
        this.f28091j = cVar != null ? cVar.d() : 0;
        Y40.c cVar2 = this.f28090i;
        if (cVar2 != null) {
            for (Object obj2 : cVar2.a()) {
                int i14 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                this.f28092k.put(Integer.valueOf(i11), a.b.f34571a);
                this.f28093l.put(Integer.valueOf(i11), 0L);
                this.f28094m.put(Integer.valueOf(i11), Float.valueOf(0.0f));
                this.f28095n.put(Integer.valueOf(i11), null);
                i11 = i14;
            }
        }
    }

    public final void t(int i11, long j11) {
        this.f28093l.put(Integer.valueOf(i11), Long.valueOf(j11));
    }
}
