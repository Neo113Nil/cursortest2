package a50;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Am.C2438a;
import B90.C2615q;
import C.D;
import F3.C3010o;
import J30.a;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.s;
import W40.a;
import Y40.a;
import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f3.AbstractC6409a;
import g30.InterfaceC6618a;
import j3.AbstractC7265g;
import j3.C7275q;
import j3.Q;
import j3.w;
import j3.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r3.b;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.common.CenterLinearLayoutManager;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/b;", "LE30/c;", "<init>", "()V", "cbottom-onboarding_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: a50.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4950b extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f36268a = "OnboardingSlidesV2PageVideoFragment";

    /* renamed from: b, reason: collision with root package name */
    private S40.d f36269b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f36270c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f36271d;

    /* renamed from: e, reason: collision with root package name */
    private TextureView f36272e;

    /* renamed from: f, reason: collision with root package name */
    private ScreenStateView f36273f;

    /* renamed from: g, reason: collision with root package name */
    private Y40.a f36274g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36275h;

    /* renamed from: i, reason: collision with root package name */
    private ExoPlayer f36276i;

    /* renamed from: j, reason: collision with root package name */
    private X40.c f36277j;

    /* renamed from: k, reason: collision with root package name */
    private int f36278k;

    /* renamed from: l, reason: collision with root package name */
    private int f36279l;

    /* renamed from: m, reason: collision with root package name */
    private int f36280m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f36281n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f36282o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final a f36283p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final g f36284q;

    /* renamed from: a50.b$a */
    public static final class a implements y.c {
        a() {
        }

        @Override // j3.y.c
        public final void onPlaybackStateChanged(int i11) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            String str;
            C4950b c4950b = C4950b.this;
            if (i11 == 2) {
                U40.c.a("OnboardingSlidesV2PageVideoFragment", "onPlaybackStateChanged STATE_BUFFERING framePos=" + c4950b.f36278k + " ");
                c4950b.S().s0();
                return;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                U40.c.a("OnboardingSlidesV2PageVideoFragment", "onPlaybackStateChanged STATE_ENDED framePos=" + c4950b.f36278k + " ");
                y yVar = c4950b.f36276i;
                if (yVar != null) {
                    ((AbstractC7265g) yVar).B();
                    return;
                }
                return;
            }
            U40.c.a("OnboardingSlidesV2PageVideoFragment", "onPlaybackStateChanged STATE_READY framePos=" + c4950b.f36278k + " ");
            c4950b.S().t0();
            if (c4950b.f36282o) {
                c4950b.f36282o = false;
                InterfaceC6618a e02 = c4950b.S().e0();
                Y40.b f02 = c4950b.S().f0();
                if (f02 == null || (str = f02.k()) == null) {
                    str = "";
                }
                e02.D(str, null, true);
            }
            c4950b.O();
            W40.a i02 = c4950b.S().i0();
            int i12 = c4950b.f36278k;
            ExoPlayer exoPlayer = c4950b.f36276i;
            i02.w(i12, exoPlayer != null ? exoPlayer.getDuration() : 0L);
            if (c4950b.f36281n) {
                TextureView textureView = c4950b.f36272e;
                if (textureView != null && (animate = textureView.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(500L)) != null) {
                    duration.start();
                }
                c4950b.f36281n = false;
            }
        }

        @Override // j3.y.c
        public final void onPlayerError(w error) {
            String str;
            Intrinsics.checkNotNullParameter(error, "error");
            C4950b c4950b = C4950b.this;
            U40.c.a("OnboardingSlidesV2PageVideoFragment", "onPlayerError framePos=" + c4950b.f36278k + " ");
            if (c4950b.f36282o) {
                c4950b.f36282o = false;
                InterfaceC6618a e02 = c4950b.S().e0();
                Y40.b f02 = c4950b.S().f0();
                if (f02 == null || (str = f02.k()) == null) {
                    str = "";
                }
                e02.D(str, error.getMessage(), false);
            }
            c4950b.S().r0(error);
        }

        @Override // j3.y.c
        public final void onRenderedFirstFrame() {
            C4950b c4950b = C4950b.this;
            c4950b.S().t0();
            c4950b.O();
            U40.c.a("OnboardingSlidesV2PageVideoFragment", "onRenderedFirstFrame framePos=" + c4950b.f36278k + " ");
        }

        @Override // j3.y.c
        public final void onVideoSizeChanged(Q videoSize) {
            Intrinsics.checkNotNullParameter(videoSize, "videoSize");
            C4950b c4950b = C4950b.this;
            StringBuilder a11 = C2438a.a("onVideoSizeChanged framePos=", c4950b.f36278k, " videoSize.width=", " videoSize.height=", videoSize.f69043a);
            int i11 = videoSize.f69044b;
            a11.append(i11);
            U40.c.a("OnboardingSlidesV2PageVideoFragment", a11.toString());
            c4950b.f36279l = videoSize.f69043a;
            c4950b.f36280m = i11;
            c4950b.O();
        }
    }

    /* renamed from: a50.b$b, reason: collision with other inner class name */
    public static final class C0691b implements InterfaceC2395h<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0 f36286a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4950b f36287b;

        /* renamed from: a50.b$b$a */
        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f36288a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4950b f36289b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2PageFragment$onViewCreated$$inlined$filter$1$2", f = "OnboardingSlidesV2PageFragment.kt", l = {223}, m = "emit")
            /* renamed from: a50.b$b$a$a, reason: collision with other inner class name */
            public static final class C0692a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f36290d;

                /* renamed from: e, reason: collision with root package name */
                int f36291e;

                public C0692a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f36290d = obj;
                    this.f36291e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i, C4950b c4950b) {
                this.f36288a = interfaceC2397i;
                this.f36289b = c4950b;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0692a c0692a;
                int i11;
                if (dVar instanceof C0692a) {
                    c0692a = (C0692a) dVar;
                    int i12 = c0692a.f36291e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0692a.f36291e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0692a.f36290d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0692a.f36291e;
                        if (i11 != 0) {
                            s.b(obj2);
                            if (this.f36289b.f36278k == ((Number) obj).intValue()) {
                                c0692a.f36291e = 1;
                                if (this.f36288a.emit(obj, c0692a) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c0692a = new C0692a(dVar);
                Object obj22 = c0692a.f36290d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0692a.f36291e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public C0691b(C0 c02, C4950b c4950b) {
            this.f36286a = c02;
            this.f36287b = c4950b;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super Integer> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f36286a.collect(new a(interfaceC2397i, this.f36287b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2PageFragment$onViewCreated$$inlined$observe$1", f = "OnboardingSlidesV2PageFragment.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: a50.b$c */
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36293d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f36294e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0691b f36296g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C4950b f36297h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2PageFragment$onViewCreated$$inlined$observe$1$1", f = "OnboardingSlidesV2PageFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: a50.b$c$a */
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f36298d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0691b f36299e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C4950b f36300f;

            /* renamed from: a50.b$c$a$a, reason: collision with other inner class name */
            public static final class C0693a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C4950b f36301a;

                public C0693a(C4950b c4950b) {
                    this.f36301a = c4950b;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ((Number) t2).intValue();
                    C4950b c4950b = this.f36301a;
                    y yVar = c4950b.f36276i;
                    if (yVar != null) {
                        ((AbstractC7265g) yVar).B();
                    }
                    X40.c cVar = c4950b.f36277j;
                    if (cVar != null) {
                        cVar.n();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0691b c0691b, kotlin.coroutines.d dVar, C4950b c4950b) {
                super(2, dVar);
                this.f36299e = c0691b;
                this.f36300f = c4950b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f36299e, dVar, this.f36300f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f36298d;
                if (i11 == 0) {
                    s.b(obj);
                    C0693a c0693a = new C0693a(this.f36300f);
                    this.f36298d = 1;
                    if (this.f36299e.collect(c0693a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0691b c0691b, kotlin.coroutines.d dVar, C4950b c4950b) {
            super(2, dVar);
            this.f36296g = c0691b;
            this.f36297h = c4950b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = C4950b.this.new c(this.f36296g, dVar, this.f36297h);
            cVar.f36294e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36293d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f36294e)) {
                    J viewLifecycleOwner = C4950b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f36296g, null, this.f36297h);
                    this.f36293d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2PageFragment$onViewCreated$$inlined$observe$2", f = "OnboardingSlidesV2PageFragment.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: a50.b$d */
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36302d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f36303e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f36305g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C4950b f36306h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2PageFragment$onViewCreated$$inlined$observe$2$1", f = "OnboardingSlidesV2PageFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: a50.b$d$a */
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f36307d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f36308e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C4950b f36309f;

            /* renamed from: a50.b$d$a$a, reason: collision with other inner class name */
            public static final class C0694a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C4950b f36310a;

                public C0694a(C4950b c4950b) {
                    this.f36310a = c4950b;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    Y40.d dVar2 = (Y40.d) t2;
                    S40.d dVar3 = this.f36310a.f36269b;
                    if (dVar3 != null) {
                        RecyclerView recyclerView = dVar3.f25786c;
                        if (dVar2 != null) {
                            com.detmir.recycli.adapters.d.a(recyclerView, dVar2.a());
                            recyclerView.setPadding(D.d(dVar2.b().left), D.d(dVar2.b().top), D.d(dVar2.b().right), D.d(dVar2.b().bottom));
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C4950b c4950b) {
                super(2, dVar);
                this.f36308e = interfaceC2395h;
                this.f36309f = c4950b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f36308e, dVar, this.f36309f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f36307d;
                if (i11 == 0) {
                    s.b(obj);
                    C0694a c0694a = new C0694a(this.f36309f);
                    this.f36307d = 1;
                    if (this.f36308e.collect(c0694a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C4950b c4950b) {
            super(2, dVar);
            this.f36305g = interfaceC2395h;
            this.f36306h = c4950b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = C4950b.this.new d(this.f36305g, dVar, this.f36306h);
            dVar2.f36303e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36302d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f36303e)) {
                    J viewLifecycleOwner = C4950b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f36305g, null, this.f36306h);
                    this.f36302d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2PageFragment$onViewCreated$$inlined$observe$3", f = "OnboardingSlidesV2PageFragment.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: a50.b$e */
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36311d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f36312e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f36314g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C4950b f36315h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2PageFragment$onViewCreated$$inlined$observe$3$1", f = "OnboardingSlidesV2PageFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: a50.b$e$a */
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f36316d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f36317e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C4950b f36318f;

            /* renamed from: a50.b$e$a$a, reason: collision with other inner class name */
            public static final class C0695a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C4950b f36319a;

                public C0695a(C4950b c4950b) {
                    this.f36319a = c4950b;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    if (Intrinsics.d((Boolean) t2, Boolean.TRUE)) {
                        C4950b c4950b = this.f36319a;
                        Y40.b f02 = c4950b.S().f0();
                        if ((f02 != null ? f02.h() : null) != null) {
                            String h11 = f02.h();
                            String b11 = f02.b();
                            Long g10 = f02.g();
                            Boolean a11 = f02.a();
                            C4950b.v(c4950b, h11, b11, g10, a11 != null ? a11.booleanValue() : true);
                        } else {
                            if ((f02 != null ? f02.k() : null) == null || !(c4950b.f36274g instanceof a.AbstractC0633a.b)) {
                                if ((f02 != null ? f02.k() : null) != null && (c4950b.f36274g instanceof a.AbstractC0633a.C0634a)) {
                                    c4950b.Q(f02.k());
                                    Y40.a aVar = c4950b.f36274g;
                                    a.AbstractC0633a.C0634a c0634a = aVar instanceof a.AbstractC0633a.C0634a ? (a.AbstractC0633a.C0634a) aVar : null;
                                    c4950b.U(c0634a != null && c0634a.a());
                                }
                            } else {
                                c4950b.Q(f02.k());
                                c4950b.T();
                            }
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, C4950b c4950b) {
                super(2, dVar);
                this.f36317e = c02;
                this.f36318f = c4950b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f36317e, dVar, this.f36318f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f36316d;
                if (i11 == 0) {
                    s.b(obj);
                    C0695a c0695a = new C0695a(this.f36318f);
                    this.f36316d = 1;
                    if (this.f36317e.collect(c0695a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0 c02, kotlin.coroutines.d dVar, C4950b c4950b) {
            super(2, dVar);
            this.f36314g = c02;
            this.f36315h = c4950b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = C4950b.this.new e(this.f36314g, dVar, this.f36315h);
            eVar.f36312e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36311d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f36312e)) {
                    J viewLifecycleOwner = C4950b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f36314g, null, this.f36315h);
                    this.f36311d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2PageFragment$onViewCreated$$inlined$observe$4", f = "OnboardingSlidesV2PageFragment.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: a50.b$f */
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f36320d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f36321e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f36323g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C4950b f36324h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2PageFragment$onViewCreated$$inlined$observe$4$1", f = "OnboardingSlidesV2PageFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: a50.b$f$a */
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f36325d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f36326e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C4950b f36327f;

            /* renamed from: a50.b$f$a$a, reason: collision with other inner class name */
            public static final class C0696a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C4950b f36328a;

                public C0696a(C4950b c4950b) {
                    this.f36328a = c4950b;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ScreenState screenState = (ScreenState) t2;
                    boolean z11 = screenState instanceof ScreenState.Progress;
                    C4950b c4950b = this.f36328a;
                    if (z11 || (screenState instanceof ScreenState.Error)) {
                        ScreenStateView screenStateView = c4950b.f36273f;
                        if (screenStateView != null) {
                            screenStateView.setVisibility(0);
                        }
                        ScreenStateView screenStateView2 = c4950b.f36273f;
                        if (screenStateView2 != null) {
                            screenStateView2.bindState(screenState);
                        }
                    } else {
                        ScreenStateView screenStateView3 = c4950b.f36273f;
                        if (screenStateView3 != null) {
                            screenStateView3.reset();
                        }
                        ScreenStateView screenStateView4 = c4950b.f36273f;
                        if (screenStateView4 != null) {
                            screenStateView4.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C4950b c4950b) {
                super(2, dVar);
                this.f36326e = interfaceC2395h;
                this.f36327f = c4950b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f36326e, dVar, this.f36327f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f36325d;
                if (i11 == 0) {
                    s.b(obj);
                    C0696a c0696a = new C0696a(this.f36327f);
                    this.f36325d = 1;
                    if (this.f36326e.collect(c0696a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C4950b c4950b) {
            super(2, dVar);
            this.f36323g = interfaceC2395h;
            this.f36324h = c4950b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = C4950b.this.new f(this.f36323g, dVar, this.f36324h);
            fVar.f36321e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f36320d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f36321e)) {
                    J viewLifecycleOwner = C4950b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f36323g, null, this.f36324h);
                    this.f36320d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    /* renamed from: a50.b$g */
    public static final class g implements y.c {
        g() {
        }

        @Override // j3.y.c
        public final void onPlaybackStateChanged(int i11) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            C4950b c4950b = C4950b.this;
            if (i11 == 2) {
                U40.c.a("OnboardingSlidesV2PageVideoFragment", "picListener onPlaybackStateChanged STATE_BUFFERING framePos=" + c4950b.f36278k + " ");
                c4950b.S().p0();
                return;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                U40.c.a("OnboardingSlidesV2PageVideoFragment", "picListener onPlaybackStateChanged STATE_ENDED framePos=" + c4950b.f36278k + " ");
                X40.c cVar = c4950b.f36277j;
                if (cVar != null) {
                    cVar.n();
                    return;
                }
                return;
            }
            U40.c.a("OnboardingSlidesV2PageVideoFragment", "picListener onPlaybackStateChanged STATE_READY framePos=" + c4950b.f36278k + " ");
            c4950b.S().q0();
            W40.a i02 = c4950b.S().i0();
            int i12 = c4950b.f36278k;
            X40.c cVar2 = c4950b.f36277j;
            i02.w(i12, cVar2 != null ? cVar2.f() : 0L);
            if (c4950b.f36281n) {
                ImageView imageView = c4950b.f36271d;
                if (imageView != null && (animate = imageView.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(500L)) != null) {
                    duration.start();
                }
                c4950b.f36281n = false;
            }
        }

        @Override // j3.y.c
        public final void onPlayerError(w error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C4950b c4950b = C4950b.this;
            U40.c.a("OnboardingSlidesV2PageVideoFragment", "picListener onPlayerError framePos=" + c4950b.f36278k + " ");
            c4950b.S().n0(error);
        }
    }

    /* renamed from: a50.b$h */
    public static final class h extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return C4950b.this;
        }
    }

    /* renamed from: a50.b$i */
    public static final class i extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f36331b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f36331b = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f36331b.invoke();
        }
    }

    /* renamed from: a50.b$j */
    public static final class j extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f36332b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f36332b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f36332b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: a50.b$k */
    public static final class k extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f36333b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f36333b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f36333b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public C4950b() {
        K70.c cVar = new K70.c(this, 2);
        InterfaceC4008j a11 = Sc.k.a(n.NONE, new i(new h()));
        this.f36270c = b0.b(this, kotlin.jvm.internal.N.b(C4951c.class), new j(a11), new k(a11), cVar);
        this.f36281n = true;
        this.f36282o = true;
        this.f36283p = new a();
        this.f36284q = new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        int i11;
        int i12;
        TextureView textureView = this.f36272e;
        int width = textureView != null ? textureView.getWidth() : 0;
        TextureView textureView2 = this.f36272e;
        int height = textureView2 != null ? textureView2.getHeight() : 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("adjustAspectRatio framePos=" + this.f36278k + " ");
        sb2.append("viewWidth=" + width + " ");
        sb2.append("viewHeight=" + height + " ");
        sb2.append("videoWidth=" + this.f36279l + " ");
        sb2.append("videoHeight=" + this.f36280m);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        U40.c.a("OnboardingSlidesV2PageVideoFragment", sb3);
        if (width == 0 || height == 0 || (i11 = this.f36279l) == 0 || (i12 = this.f36280m) == 0) {
            return;
        }
        Matrix f7 = new J30.a(new a.d(width, height), new a.d(i11, i12)).f(a.c.CENTER_CROP);
        TextureView textureView3 = this.f36272e;
        if (textureView3 != null) {
            textureView3.setOpaque(false);
        }
        TextureView textureView4 = this.f36272e;
        if (textureView4 != null) {
            textureView4.setTransform(f7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if ((r0 != null ? r0.b() : null) != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void P() {
        D3.h.g(this.f36278k, "beReady framePos=", "OnboardingSlidesV2PageVideoFragment");
        Y40.b f02 = S().f0();
        if ((f02 != null ? f02.k() : null) != null) {
            if (this.f36272e == null) {
                TextureView textureView = new TextureView(requireContext());
                textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                textureView.setId(R.id.video_view_onboarding);
                this.f36272e = textureView;
                if (this.f36281n) {
                    textureView.setAlpha(0.0f);
                }
                S40.d dVar = this.f36269b;
                if (dVar != null) {
                    dVar.f25785b.addView(this.f36272e, 0);
                }
            }
            if (this.f36276i == null) {
                ExoPlayer.b bVar = new ExoPlayer.b(requireContext());
                C3010o c3010o = new C3010o(requireContext());
                c3010o.f(new C2615q(this, 6));
                bVar.e(c3010o);
                this.f36276i = bVar.a();
            }
            ExoPlayer exoPlayer = this.f36276i;
            if (exoPlayer != null) {
                exoPlayer.t(this.f36283p);
            }
            ExoPlayer exoPlayer2 = this.f36276i;
            if (exoPlayer2 != null) {
                exoPlayer2.S(0);
            }
            ExoPlayer exoPlayer3 = this.f36276i;
            if (exoPlayer3 != null) {
                exoPlayer3.J(this.f36272e);
            }
            ExoPlayer exoPlayer4 = this.f36276i;
            if (exoPlayer4 != null) {
                exoPlayer4.D(false);
            }
        }
        if ((f02 != null ? f02.k() : null) == null) {
            if ((f02 != null ? f02.h() : null) == null) {
            }
            if (this.f36271d == null) {
                ImageView imageView = new ImageView(requireContext());
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setId(R.id.image_view_onboarding);
                this.f36271d = imageView;
                if (this.f36281n) {
                    imageView.setAlpha(0.0f);
                }
                S40.d dVar2 = this.f36269b;
                if (dVar2 != null) {
                    dVar2.f25785b.addView(this.f36271d, 0);
                }
            }
            if (this.f36277j == null) {
                this.f36277j = new X40.c(K.a(this));
            }
            X40.c cVar = this.f36277j;
            if (cVar != null) {
                cVar.p(Integer.valueOf(this.f36278k));
            }
            X40.c cVar2 = this.f36277j;
            if (cVar2 != null) {
                cVar2.c(this.f36284q);
            }
            X40.c cVar3 = this.f36277j;
            if (cVar3 != null) {
                cVar3.q(this.f36271d);
            }
        }
        if (this.f36273f == null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ScreenStateView screenStateView = new ScreenStateView(requireContext, null, 0, 6, null);
            ConstraintLayout.b bVar2 = new ConstraintLayout.b(-1, -1);
            bVar2.f41656t = 0;
            bVar2.f41658v = 0;
            bVar2.f41636i = 0;
            bVar2.f41642l = 0;
            screenStateView.setLayoutParams(bVar2);
            screenStateView.setClickable(false);
            screenStateView.setFocusable(false);
            this.f36273f = screenStateView;
            S40.d dVar3 = this.f36269b;
            if (dVar3 != null) {
                dVar3.f25785b.addView(screenStateView);
            }
        }
        S().m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(String str) {
        this.f36282o = true;
        int i11 = C7275q.f69182g;
        C7275q.a aVar = new C7275q.a();
        aVar.j(str);
        C7275q a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "fromUri(...)");
        O();
        S().e0().F(this.f36278k, str);
        y yVar = this.f36276i;
        if (yVar != null) {
            ((AbstractC7265g) yVar).g0(a11);
        }
        ExoPlayer exoPlayer = this.f36276i;
        if (exoPlayer != null) {
            exoPlayer.prepare();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4951c S() {
        return (C4951c) this.f36270c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        D3.h.g(this.f36278k, "pause framePos=", "OnboardingSlidesV2PageVideoFragment");
        y yVar = this.f36276i;
        if (yVar != null) {
            ((AbstractC7265g) yVar).D(false);
        }
        y yVar2 = this.f36276i;
        if (yVar2 != null) {
            ((AbstractC7265g) yVar2).B();
        }
        X40.c cVar = this.f36277j;
        if (cVar != null) {
            cVar.i();
        }
        X40.c cVar2 = this.f36277j;
        if (cVar2 != null) {
            cVar2.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(boolean z11) {
        O();
        D3.h.g(this.f36278k, "play framePos=", "OnboardingSlidesV2PageVideoFragment");
        if (z11) {
            y yVar = this.f36276i;
            if (yVar != null) {
                ((AbstractC7265g) yVar).D(false);
            }
            X40.c cVar = this.f36277j;
            if (cVar != null) {
                cVar.i();
                return;
            }
            return;
        }
        y yVar2 = this.f36276i;
        if (yVar2 != null) {
            ((AbstractC7265g) yVar2).D(true);
        }
        X40.c cVar2 = this.f36277j;
        if (cVar2 != null) {
            cVar2.j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r6 != null ? r6.d() : null, r3) == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void V() {
        ExoPlayer exoPlayer;
        C7275q A11;
        C7275q.f fVar;
        Uri uri;
        Boolean a11;
        U40.c.a("OnboardingSlidesV2PageVideoFragment", "prepare framePos=" + this.f36278k + " player=" + this.f36276i);
        Y40.b f02 = S().f0();
        String str = null;
        String k11 = f02 != null ? f02.k() : null;
        Y40.b f03 = S().f0();
        String h11 = f03 != null ? f03.h() : null;
        Y40.b f04 = S().f0();
        String b11 = f04 != null ? f04.b() : null;
        Y40.b f05 = S().f0();
        Long g10 = f05 != null ? f05.g() : null;
        Y40.b f06 = S().f0();
        boolean booleanValue = (f06 == null || (a11 = f06.a()) == null) ? true : a11.booleanValue();
        if (k11 == null && (h11 != null || b11 != null)) {
            X40.c cVar = this.f36277j;
            if (Intrinsics.d(cVar != null ? cVar.h() : null, h11)) {
                X40.c cVar2 = this.f36277j;
            }
            X40.c cVar3 = this.f36277j;
            if (cVar3 != null) {
                cVar3.r(h11, b11, g10, booleanValue);
            }
            X40.c cVar4 = this.f36277j;
            if (cVar4 != null) {
                cVar4.k();
            }
        }
        if (k11 != null) {
            y yVar = this.f36276i;
            if (yVar != null && (A11 = ((AbstractC7265g) yVar).A()) != null && (fVar = A11.f69184b) != null && (uri = fVar.f69240a) != null) {
                str = uri.toString();
            }
            if (Intrinsics.d(str, k11) && (exoPlayer = this.f36276i) != null && exoPlayer.P() == 3) {
                return;
            }
            Q(k11);
        }
    }

    public static r3.b t(C4950b c4950b) {
        return new b.a(c4950b.S().h0()).createDataSource();
    }

    public static final void v(C4950b c4950b, String str, String str2, Long l11, boolean z11) {
        X40.c cVar = c4950b.f36277j;
        if (cVar != null) {
            cVar.r(str, str2, l11, z11);
        }
        X40.c cVar2 = c4950b.f36277j;
        if (cVar2 != null) {
            cVar2.k();
        }
    }

    public final long R() {
        ExoPlayer exoPlayer = this.f36276i;
        if (exoPlayer != null) {
            return exoPlayer.getCurrentPosition();
        }
        X40.c cVar = this.f36277j;
        if (cVar != null) {
            return cVar.e();
        }
        return 0L;
    }

    public final void W(Y40.a aVar) {
        if (Intrinsics.d(this.f36274g, aVar)) {
            return;
        }
        this.f36274g = aVar;
        if (!(aVar instanceof a.b)) {
            if (aVar instanceof a.AbstractC0633a.b) {
                this.f36275h = true;
                P();
                V();
                T();
                return;
            }
            if (aVar instanceof a.AbstractC0633a.C0634a) {
                this.f36275h = true;
                P();
                V();
                U(((a.AbstractC0633a.C0634a) aVar).a());
                return;
            }
            return;
        }
        this.f36275h = true;
        ExoPlayer exoPlayer = this.f36276i;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        ExoPlayer exoPlayer2 = this.f36276i;
        if (exoPlayer2 != null) {
            exoPlayer2.J(null);
        }
        ExoPlayer exoPlayer3 = this.f36276i;
        if (exoPlayer3 != null) {
            exoPlayer3.release();
        }
        X40.c cVar = this.f36277j;
        if (cVar != null) {
            cVar.s();
        }
        X40.c cVar2 = this.f36277j;
        if (cVar2 != null) {
            cVar2.q(null);
        }
        X40.c cVar3 = this.f36277j;
        if (cVar3 != null) {
            cVar3.l();
        }
        D3.h.g(this.f36278k, "relax framePos=", "OnboardingSlidesV2PageVideoFragment");
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95692f() {
        return this.f36268a;
    }

    @Override // E30.c
    /* renamed from: isNeedSendOnCreateAnalytic */
    public final boolean getIsNeedSendOnCreateAnalytic() {
        return false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((T40.a) O30.a.a(O30.c.a(requireActivity)).a(T40.a.class)).n0(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        int i11 = arguments != null ? arguments.getInt("FRAME_POS") : 0;
        this.f36278k = i11;
        D3.h.g(i11, "onCreate framePos=", "OnboardingSlidesV2PageVideoFragment");
        S().k0(this.f36278k);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        S40.d b11 = S40.d.b(inflater, viewGroup);
        D3.h.g(this.f36278k, "onCreateView framePos=", "OnboardingSlidesV2PageVideoFragment");
        this.f36269b = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        ExoPlayer exoPlayer = this.f36276i;
        if (exoPlayer != null) {
            exoPlayer.j(this.f36283p);
        }
        ExoPlayer exoPlayer2 = this.f36276i;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        X40.c cVar = this.f36277j;
        if (cVar != null) {
            cVar.m(this.f36284q);
        }
        X40.c cVar2 = this.f36277j;
        if (cVar2 != null) {
            cVar2.l();
        }
        D3.h.g(this.f36278k, "onDestroy framePos=", "OnboardingSlidesV2PageVideoFragment");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        S().i0().r(this.f36278k);
        super.onDestroyView();
        ExoPlayer exoPlayer = this.f36276i;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        ExoPlayer exoPlayer2 = this.f36276i;
        if (exoPlayer2 != null) {
            exoPlayer2.J(null);
        }
        this.f36276i = null;
        X40.c cVar = this.f36277j;
        if (cVar != null) {
            cVar.s();
        }
        X40.c cVar2 = this.f36277j;
        if (cVar2 != null) {
            cVar2.q(null);
        }
        this.f36277j = null;
        this.f36271d = null;
        this.f36272e = null;
        this.f36273f = null;
        this.f36275h = false;
        D3.h.g(this.f36278k, "onDestroyView framePos=", "OnboardingSlidesV2PageVideoFragment");
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Y40.a e11;
        Float c11;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C4951c S11 = S();
        InterfaceC5431s parentFragment = getParentFragment();
        Intrinsics.g(parentFragment, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottomonboarding.interactor.v2.OnboardingSlidesInteractorV2.Provider");
        W40.a provideOnboardingInteractor = ((a.InterfaceC0586a) parentFragment).provideOnboardingInteractor();
        S11.getClass();
        Intrinsics.checkNotNullParameter(provideOnboardingInteractor, "<set-?>");
        S11.f36337d = provideOnboardingInteractor;
        Y40.c i11 = S().i0().i();
        if (i11 != null && (c11 = i11.c()) != null) {
            float floatValue = c11.floatValue();
            S40.d dVar = this.f36269b;
            if (dVar != null) {
                FrameLayout frameLayout = dVar.f25785b;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.f41600G = "H," + floatValue;
                frameLayout.setLayoutParams(bVar);
            }
        }
        S().l0();
        D3.h.g(this.f36278k, "onViewCreated framePos=", "OnboardingSlidesV2PageVideoFragment");
        C0691b c0691b = new C0691b(S().i0().j(), this);
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new c(c0691b, null, this), 3);
        S40.d dVar2 = this.f36269b;
        if (dVar2 != null) {
            RecyclerView recyclerView = dVar2.f25786c;
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.setLayoutManager(new CenterLinearLayoutManager(context, 1, false));
        }
        x0<Y40.d> g02 = S().g0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new d(g02, null, this), 3);
        C0 j02 = S().j0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new e(j02, null, this), 3);
        x0<ScreenState> screenStateFlow = S().getScreenStateFlow();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new f(screenStateFlow, null, this), 3);
        S().i0().q(this.f36278k, this);
        if (this.f36275h || (e11 = S().i0().e(this.f36278k)) == null) {
            return;
        }
        this.f36274g = null;
        W(e11);
    }
}
