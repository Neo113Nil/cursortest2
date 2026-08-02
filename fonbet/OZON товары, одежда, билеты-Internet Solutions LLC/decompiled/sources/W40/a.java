package W40;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import D3.h;
import E30.i;
import Sc.s;
import Y40.a;
import Y40.d;
import a50.C4950b;
import android.graphics.Rect;
import com.detmir.recycli.adapters.RecyclerItem;
import g30.InterfaceC6618a;
import h3.C6788a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2OnboardingV2DTO;
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
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10656a f33227a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f33228b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0 f33229c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f33230d;

    /* renamed from: e, reason: collision with root package name */
    public C6788a f33231e;

    /* renamed from: f, reason: collision with root package name */
    public Function0<Unit> f33232f;

    /* renamed from: g, reason: collision with root package name */
    public Function1<? super ActionResult2UI, Unit> f33233g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC6618a f33234h;

    /* renamed from: i, reason: collision with root package name */
    private Y40.c f33235i;

    /* renamed from: j, reason: collision with root package name */
    private int f33236j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f33237k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f33238l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f33239m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f33240n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f33241o;

    /* renamed from: p, reason: collision with root package name */
    private B0 f33242p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final x0<d> f33243q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final x0<d> f33244r;

    /* renamed from: W40.a$a, reason: collision with other inner class name */
    public interface InterfaceC0586a {
        @NotNull
        a provideOnboardingInteractor();
    }

    @e(c = "ru.ozon.fintech.features.cbottomonboarding.interactor.v2.OnboardingSlidesInteractorV2$putOnboardingPageVideoFragment$$inlined$post$1", f = "OnboardingSlidesInteractorV2.kt", l = {11}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f33245d;

        @e(c = "ru.ozon.fintech.features.cbottomonboarding.interactor.v2.OnboardingSlidesInteractorV2$putOnboardingPageVideoFragment$$inlined$post$1$1", f = "OnboardingSlidesInteractorV2.kt", l = {}, m = "invokeSuspend")
        /* renamed from: W40.a$b$a, reason: collision with other inner class name */
        public static final class C0587a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f33247d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0587a(a aVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f33247d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0587a(this.f33247d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0587a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                a aVar2 = this.f33247d;
                a.b(aVar2);
                C6788a c6788a = aVar2.f33231e;
                if (c6788a == null) {
                    Intrinsics.n("viewModelScope");
                    throw null;
                }
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(c6788a, He.b.f10879b, null, aVar2.new c(null), 2);
                return Unit.f71690a;
            }
        }

        public b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f33245d;
            if (i11 == 0) {
                s.b(obj);
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                C0587a c0587a = new C0587a(a.this, null);
                this.f33245d = 1;
                if (C10727i.f(l02, c0587a, this) == aVar) {
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

    @e(c = "ru.ozon.fintech.features.cbottomonboarding.interactor.v2.OnboardingSlidesInteractorV2$putOnboardingPageVideoFragment$lambda$9$$inlined$postDelayed$1", f = "OnboardingSlidesInteractorV2.kt", l = {19, 20}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f33248d;

        @e(c = "ru.ozon.fintech.features.cbottomonboarding.interactor.v2.OnboardingSlidesInteractorV2$putOnboardingPageVideoFragment$lambda$9$$inlined$postDelayed$1$1", f = "OnboardingSlidesInteractorV2.kt", l = {}, m = "invokeSuspend")
        /* renamed from: W40.a$c$a, reason: collision with other inner class name */
        public static final class C0588a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f33250d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0588a(a aVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f33250d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0588a(this.f33250d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0588a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                this.f33250d.k(false, false);
                return Unit.f71690a;
            }
        }

        public c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
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
            int i11 = this.f33248d;
            if (i11 == 0) {
                s.b(obj);
                this.f33248d = 1;
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
            C0588a c0588a = new C0588a(a.this, null);
            this.f33248d = 2;
        }
    }

    public a(@NotNull C10656a cbottomMapper2) {
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        this.f33227a = cbottomMapper2;
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.f33228b = E0.a(0, 1, enumC11113a);
        this.f33229c = E0.a(0, 1, enumC11113a);
        this.f33230d = E0.a(0, 1, enumC11113a);
        this.f33237k = new LinkedHashMap();
        this.f33238l = new LinkedHashMap();
        this.f33239m = new LinkedHashMap();
        this.f33240n = new LinkedHashMap();
        this.f33243q = O0.a(null);
        this.f33244r = O0.a(null);
    }

    public static Unit a(a aVar) {
        int i11 = aVar.f33236j;
        h.g(i11, "setFrameEnd framePos=", "OnboardingSlidesInteractor");
        Y40.c cVar = aVar.f33235i;
        if (i11 < (cVar != null ? ((ArrayList) cVar.a()).size() : 0)) {
            aVar.f33229c.tryEmit(Integer.valueOf(i11 + 1));
        }
        return Unit.f71690a;
    }

    public static final void b(a aVar) {
        LinkedHashMap linkedHashMap = aVar.f33237k;
        linkedHashMap.put(Integer.valueOf(aVar.f33236j), new a.AbstractC0633a.C0634a(false));
        U40.c.a("OnboardingSlidesInteractor", "startUp frameStatuses=" + linkedHashMap);
        aVar.u();
    }

    private final void u() {
        C4950b c4950b;
        for (Map.Entry entry : this.f33240n.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            WeakReference weakReference = (WeakReference) entry.getValue();
            Y40.a aVar = (Y40.a) this.f33237k.get(Integer.valueOf(intValue));
            if (aVar != null && weakReference != null && (c4950b = (C4950b) weakReference.get()) != null) {
                c4950b.W(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        C4950b c4950b;
        Y40.c cVar = this.f33235i;
        if (cVar != null) {
            int i11 = 0;
            for (Object obj : cVar.a()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                Long l11 = (Long) this.f33238l.get(Integer.valueOf(i11));
                long longValue = l11 != null ? l11.longValue() : 0L;
                WeakReference weakReference = (WeakReference) this.f33240n.get(Integer.valueOf(i11));
                long R11 = (weakReference == null || (c4950b = (C4950b) weakReference.get()) == null) ? 0L : c4950b.R();
                int i13 = this.f33236j;
                this.f33239m.put(Integer.valueOf(i11), Float.valueOf(i11 < i13 ? 1.0f : (i11 <= i13 && longValue != 0) ? R11 / longValue : 0.0f));
                i11 = i12;
            }
        }
        this.f33230d.tryEmit(Boolean.TRUE);
    }

    private final void y(Y40.b bVar) {
        List<RecyclerItem> i11 = bVar.i();
        Rect j11 = bVar.j();
        if (j11 == null) {
            j11 = i.a();
        }
        this.f33243q.setValue(new d(j11, i11));
        List<RecyclerItem> c11 = bVar.c();
        Rect d11 = bVar.d();
        if (d11 == null) {
            d11 = i.a();
        }
        this.f33244r.setValue(new d(d11, c11));
    }

    @NotNull
    public final x0<d> d() {
        return this.f33244r;
    }

    public final Y40.a e(int i11) {
        return (Y40.a) this.f33237k.get(Integer.valueOf(i11));
    }

    public final Y40.b f(int i11) {
        Y40.c cVar = this.f33235i;
        if (cVar != null) {
            return (Y40.b) ((ArrayList) cVar.a()).get(i11);
        }
        return null;
    }

    @NotNull
    public final x0<d> g() {
        return this.f33243q;
    }

    @NotNull
    public final C0 h() {
        return this.f33229c;
    }

    public final Y40.c i() {
        return this.f33235i;
    }

    @NotNull
    public final C0 j() {
        return this.f33228b;
    }

    public final void k(boolean z11, boolean z12) {
        String str;
        String b11;
        String str2;
        Y40.c cVar = this.f33235i;
        LinkedHashMap linkedHashMap = this.f33237k;
        if (cVar != null) {
            int i11 = 0;
            for (Object obj : cVar.a()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                Y40.b bVar = (Y40.b) obj;
                int i13 = this.f33236j;
                if (i11 == i13) {
                    linkedHashMap.put(Integer.valueOf(i11), new a.AbstractC0633a.C0634a(z11));
                    if (!z11) {
                        y(bVar);
                    }
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
        x();
        u();
        if (z11) {
            return;
        }
        InterfaceC6618a interfaceC6618a = this.f33234h;
        if (interfaceC6618a == null) {
            Intrinsics.n("fintechAnalyticInteractor");
            throw null;
        }
        int i15 = this.f33236j;
        Y40.c cVar2 = this.f33235i;
        String e11 = cVar2 != null ? cVar2.e() : null;
        Y40.c cVar3 = this.f33235i;
        if (cVar3 == null || (str = cVar3.b()) == null) {
            str = "";
        }
        interfaceC6618a.V0(i15, e11, str);
        if (z12) {
            InterfaceC6618a interfaceC6618a2 = this.f33234h;
            if (interfaceC6618a2 == null) {
                Intrinsics.n("fintechAnalyticInteractor");
                throw null;
            }
            int i16 = this.f33236j;
            Y40.c cVar4 = this.f33235i;
            String e12 = cVar4 != null ? cVar4.e() : null;
            Y40.c cVar5 = this.f33235i;
            if (cVar5 == null || (str2 = cVar5.b()) == null) {
                str2 = "";
            }
            interfaceC6618a2.l1(i16, e12, str2);
        }
        if (this.f33235i != null) {
            Function1<? super ActionResult2UI, Unit> function1 = this.f33233g;
            if (function1 == null) {
                Intrinsics.n("actionListenerV2");
                throw null;
            }
            Y40.c cVar6 = this.f33235i;
            function1.invoke(new ActionResult2UI((cVar6 == null || (b11 = cVar6.b()) == null) ? "" : b11, null, ActionResult2UI.Type.SELECTED, null, null, null, Integer.valueOf(this.f33236j), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097080, null));
        }
    }

    public final void l(int i11) {
        this.f33236j = i11;
    }

    public final void m() {
        this.f33241o = false;
        this.f33235i = null;
        B0 b02 = this.f33242p;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }

    public final void n() {
        B0 b02 = this.f33242p;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        LinkedHashMap linkedHashMap = this.f33237k;
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
        u();
    }

    public final void o() {
        if (this.f33235i != null && this.f33241o) {
            k(false, false);
        }
        B0 b02 = this.f33242p;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        C6788a c6788a = this.f33231e;
        if (c6788a == null) {
            Intrinsics.n("viewModelScope");
            throw null;
        }
        this.f33242p = C10727i.c(c6788a, null, null, new W40.b(this, null), 3);
        this.f33241o = true;
    }

    public final void p() {
        Y40.c cVar = this.f33235i;
        if (cVar != null) {
            Y40.b bVar = (Y40.b) ((ArrayList) cVar.a()).get(this.f33236j);
            if (bVar != null) {
                y(bVar);
            }
        }
    }

    public final void q(int i11, @NotNull C4950b oneFramePageFragment) {
        Intrinsics.checkNotNullParameter(oneFramePageFragment, "oneFramePageFragment");
        this.f33240n.put(Integer.valueOf(i11), new WeakReference(oneFramePageFragment));
        if (this.f33236j == i11) {
            C6788a c6788a = this.f33231e;
            if (c6788a == null) {
                Intrinsics.n("viewModelScope");
                throw null;
            }
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(c6788a, He.b.f10879b, null, new b(null), 2);
        }
    }

    public final void r(int i11) {
        this.f33240n.remove(Integer.valueOf(i11));
    }

    public final void s(@NotNull String actionId) {
        String e11;
        String b11;
        String b12;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        String str = "";
        if (kotlin.text.h.e0(actionId, "next", false)) {
            InterfaceC6618a interfaceC6618a = this.f33234h;
            if (interfaceC6618a == null) {
                Intrinsics.n("fintechAnalyticInteractor");
                throw null;
            }
            int i11 = this.f33236j;
            Y40.c cVar = this.f33235i;
            e11 = cVar != null ? cVar.e() : null;
            Y40.c cVar2 = this.f33235i;
            if (cVar2 != null && (b12 = cVar2.b()) != null) {
                str = b12;
            }
            interfaceC6618a.x1(i11, e11, str);
            return;
        }
        if (kotlin.text.h.e0(actionId, "login", false)) {
            InterfaceC6618a interfaceC6618a2 = this.f33234h;
            if (interfaceC6618a2 == null) {
                Intrinsics.n("fintechAnalyticInteractor");
                throw null;
            }
            int i12 = this.f33236j;
            Y40.c cVar3 = this.f33235i;
            e11 = cVar3 != null ? cVar3.e() : null;
            Y40.c cVar4 = this.f33235i;
            if (cVar4 != null && (b11 = cVar4.b()) != null) {
                str = b11;
            }
            interfaceC6618a2.c2(i12, e11, str);
        }
    }

    public final void t(int i11) {
        this.f33229c.tryEmit(Integer.valueOf(i11));
    }

    public final void v(Cbottom2OnboardingV2DTO cbottom2OnboardingV2DTO) {
        Y40.c cVar;
        Rect a11;
        Rect a12;
        Rect a13;
        int i11 = 0;
        if (cbottom2OnboardingV2DTO == null) {
            cVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            for (Object obj : cbottom2OnboardingV2DTO.getFrames()) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                Cbottom2OnboardingV2DTO.FrameDTO frameDTO = (Cbottom2OnboardingV2DTO.FrameDTO) obj;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                List<F40.a> header = frameDTO.getHeader();
                C10656a c10656a = this.f33227a;
                if (header != null) {
                    String id2 = cbottom2OnboardingV2DTO.getId();
                    Function1<? super ActionResult2UI, Unit> function1 = this.f33233g;
                    if (function1 == null) {
                        Intrinsics.n("actionListenerV2");
                        throw null;
                    }
                    c10656a.getClass();
                    arrayList2.addAll(C10656a.b(id2, header, function1, null));
                }
                List<F40.a> footer = frameDTO.getFooter();
                if (footer != null) {
                    String id3 = cbottom2OnboardingV2DTO.getId();
                    Function1<? super ActionResult2UI, Unit> function12 = this.f33233g;
                    if (function12 == null) {
                        Intrinsics.n("actionListenerV2");
                        throw null;
                    }
                    c10656a.getClass();
                    arrayList3.addAll(C10656a.b(id3, footer, function12, null));
                }
                List<F40.a> main = frameDTO.getMain();
                if (main != null) {
                    String id4 = cbottom2OnboardingV2DTO.getId();
                    Function1<? super ActionResult2UI, Unit> function13 = this.f33233g;
                    if (function13 == null) {
                        Intrinsics.n("actionListenerV2");
                        throw null;
                    }
                    c10656a.getClass();
                    arrayList4.addAll(C10656a.b(id4, main, function13, null));
                }
                String id5 = frameDTO.getId();
                String background = frameDTO.getBackground();
                Long duration = frameDTO.getDuration();
                Boolean autoplay = frameDTO.getAutoplay();
                String imageUrl = frameDTO.getImageUrl();
                String videoUrl = frameDTO.getVideoUrl();
                List<Integer> headerPaddings = frameDTO.getHeaderPaddings();
                if (headerPaddings == null || (a11 = i.b(headerPaddings)) == null) {
                    a11 = i.a();
                }
                Rect rect = a11;
                List<Integer> mainPaddings = frameDTO.getMainPaddings();
                if (mainPaddings == null || (a12 = i.b(mainPaddings)) == null) {
                    a12 = i.a();
                }
                Rect rect2 = a12;
                List<Integer> footerPaddings = frameDTO.getFooterPaddings();
                if (footerPaddings == null || (a13 = i.b(footerPaddings)) == null) {
                    a13 = i.a();
                }
                arrayList.add(new Y40.b(id5, i12, background, duration, autoplay, imageUrl, videoUrl, arrayList2, arrayList3, arrayList4, rect, rect2, a13));
                i12 = i13;
            }
            cVar = new Y40.c(cbottom2OnboardingV2DTO.getId(), Math.min(Math.abs(cbottom2OnboardingV2DTO.getSelectedFrame()), cbottom2OnboardingV2DTO.getFrames().size() - 1), cbottom2OnboardingV2DTO.getWidgetName(), arrayList, Float.valueOf(cbottom2OnboardingV2DTO.getRatio()));
        }
        this.f33235i = cVar;
        this.f33236j = cVar != null ? cVar.d() : 0;
        Y40.c cVar2 = this.f33235i;
        if (cVar2 != null) {
            for (Object obj2 : cVar2.a()) {
                int i14 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                this.f33237k.put(Integer.valueOf(i11), a.b.f34571a);
                this.f33238l.put(Integer.valueOf(i11), 0L);
                this.f33239m.put(Integer.valueOf(i11), Float.valueOf(0.0f));
                this.f33240n.put(Integer.valueOf(i11), null);
                i11 = i14;
            }
        }
    }

    public final void w(int i11, long j11) {
        this.f33238l.put(Integer.valueOf(i11), Long.valueOf(j11));
    }
}
