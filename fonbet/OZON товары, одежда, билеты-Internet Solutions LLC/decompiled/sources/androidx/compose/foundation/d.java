package androidx.compose.foundation;

import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.C2811l;
import D1.H;
import D1.I0;
import J0.C3349u1;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import n0.C8394o;
import org.jetbrains.annotations.NotNull;
import r0.C9107H;
import r0.InterfaceC9143w;
import t0.s;
import xe.B0;
import xe.C10727i;
import xe.E0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1139, 1141, 1148, 1149, 1158}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    boolean f38916d;

    /* renamed from: e, reason: collision with root package name */
    int f38917e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f38918f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC9143w f38919g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f38920h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ t0.q f38921i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ AbstractC5157a f38922j;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1133, 1136}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        s.b f38923d;

        /* renamed from: e, reason: collision with root package name */
        int f38924e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5157a f38925f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f38926g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ t0.q f38927h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC5157a abstractC5157a, long j11, t0.q qVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f38925f = abstractC5157a;
            this.f38926g = j11;
            this.f38927h = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f38925f, this.f38926g, this.f38927h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x013f, code lost:
        
            if (r17.f38927h.emit(r1, r17) == r2) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0141, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x012b, code lost:
        
            if (xe.Y.b(r6, r17) == r2) goto L83;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
        /* JADX WARN: Type inference failed for: r11v19 */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5, types: [androidx.compose.ui.e$c] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z11;
            boolean z12;
            C2804h0 c02;
            e.c cVar;
            s.b bVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f38924e;
            AbstractC5157a abstractC5157a = this.f38925f;
            if (i11 == 0) {
                Sc.s.b(obj);
                abstractC5157a.getClass();
                I i12 = new I();
                C9107H.a aVar2 = C9107H.f82403c;
                j jVar = new j(i12);
                if (!abstractC5157a.getNode().isAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                e.c parent$ui_release = abstractC5157a.getNode().getParent$ui_release();
                H f7 = C2809k.f(abstractC5157a);
                loop0: while (f7 != null) {
                    int i13 = 262144;
                    if ((C3349u1.c(f7) & 262144) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & i13) != 0) {
                                AbstractC2813m abstractC2813m = parent$ui_release;
                                U0.b bVar2 = null;
                                while (abstractC2813m != 0) {
                                    if (abstractC2813m instanceof I0) {
                                        I0 i02 = (I0) abstractC2813m;
                                        if (!(aVar2.equals(i02.K0()) ? ((Boolean) jVar.invoke(i02)).booleanValue() : true)) {
                                            break loop0;
                                        }
                                    } else {
                                        if (((abstractC2813m.getKindSet$ui_release() & i13) != 0) && (abstractC2813m instanceof AbstractC2813m)) {
                                            e.c J12 = abstractC2813m.J1();
                                            int i14 = 0;
                                            cVar = abstractC2813m;
                                            bVar2 = bVar2;
                                            while (J12 != null) {
                                                if ((J12.getKindSet$ui_release() & i13) != 0) {
                                                    i14++;
                                                    bVar2 = bVar2;
                                                    if (i14 == 1) {
                                                        cVar = J12;
                                                    } else {
                                                        if (bVar2 == null) {
                                                            bVar2 = new U0.b(new e.c[16]);
                                                        }
                                                        if (cVar != null) {
                                                            bVar2.b(cVar);
                                                            cVar = null;
                                                        }
                                                        bVar2.b(J12);
                                                    }
                                                }
                                                J12 = J12.getChild$ui_release();
                                                i13 = 262144;
                                                cVar = cVar;
                                                bVar2 = bVar2;
                                            }
                                            if (i14 == 1) {
                                                i13 = 262144;
                                                abstractC2813m = cVar;
                                                bVar2 = bVar2;
                                            }
                                        }
                                    }
                                    cVar = C2809k.b(bVar2);
                                    i13 = 262144;
                                    abstractC2813m = cVar;
                                    bVar2 = bVar2;
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                            i13 = 262144;
                        }
                    }
                    f7 = f7.g0();
                    parent$ui_release = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
                }
                if (!i12.f71783a) {
                    int i15 = C8394o.f76211b;
                    ViewParent parent = C2811l.a(abstractC5157a).getParent();
                    while (parent != null && (parent instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (viewGroup.shouldDelayChildPressedState()) {
                            z12 = true;
                            break;
                        }
                        parent = viewGroup.getParent();
                    }
                    z12 = false;
                    if (!z12) {
                        z11 = false;
                        if (z11) {
                            long a11 = C8394o.a();
                            this.f38924e = 1;
                        }
                    }
                }
                z11 = true;
                if (z11) {
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = this.f38923d;
                    Sc.s.b(obj);
                    abstractC5157a.f38891m = bVar;
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
            }
            bVar = new s.b(this.f38926g);
            this.f38923d = bVar;
            this.f38924e = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(InterfaceC9143w interfaceC9143w, long j11, t0.q qVar, AbstractC5157a abstractC5157a, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f38919g = interfaceC9143w;
        this.f38920h = j11;
        this.f38921i = qVar;
        this.f38922j = abstractC5157a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        d dVar2 = new d(this.f38919g, this.f38920h, this.f38921i, this.f38922j, dVar);
        dVar2.f38918f = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a4, code lost:
    
        if (r10.emit(r2, r17) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
    
        if (r10.emit(r3, r17) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        B0 c11;
        Object M02;
        s.b bVar;
        boolean z11;
        s.c cVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f38917e;
        AbstractC5157a abstractC5157a = this.f38922j;
        t0.q qVar = this.f38921i;
        if (i11 == 0) {
            Sc.s.b(obj);
            c11 = C10727i.c((M) this.f38918f, null, null, new a(this.f38922j, this.f38920h, this.f38921i, null), 3);
            this.f38918f = c11;
            this.f38917e = 1;
            M02 = this.f38919g.M0(this);
        } else if (i11 == 1) {
            c11 = (B0) this.f38918f;
            Sc.s.b(obj);
            M02 = obj;
        } else {
            if (i11 == 2) {
                z11 = this.f38916d;
                Sc.s.b(obj);
                if (z11) {
                    s.b bVar2 = new s.b(this.f38920h);
                    s.c cVar2 = new s.c(bVar2);
                    this.f38918f = cVar2;
                    this.f38917e = 3;
                    if (qVar.emit(bVar2, this) != aVar) {
                        cVar = cVar2;
                        this.f38918f = null;
                        this.f38917e = 4;
                    }
                    return aVar;
                }
                abstractC5157a.f38891m = null;
                return Unit.f71690a;
            }
            if (i11 != 3) {
                if (i11 != 4 && i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                abstractC5157a.f38891m = null;
                return Unit.f71690a;
            }
            cVar = (s.c) this.f38918f;
            Sc.s.b(obj);
            this.f38918f = null;
            this.f38917e = 4;
        }
        boolean booleanValue = ((Boolean) M02).booleanValue();
        if (!c11.isActive()) {
            bVar = abstractC5157a.f38891m;
            if (bVar != null) {
                t0.n cVar3 = booleanValue ? new s.c(bVar) : new s.a(bVar);
                this.f38918f = null;
                this.f38917e = 5;
            }
            abstractC5157a.f38891m = null;
            return Unit.f71690a;
        }
        this.f38918f = null;
        this.f38916d = booleanValue;
        this.f38917e = 2;
        if (E0.c(c11, this) != aVar) {
            z11 = booleanValue;
            if (z11) {
            }
            abstractC5157a.f38891m = null;
            return Unit.f71690a;
        }
        return aVar;
    }
}
