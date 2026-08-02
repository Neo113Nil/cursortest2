package Z40;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Am.C2438a;
import B90.C2601c;
import F3.C3010o;
import H30.A;
import J30.a;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.s;
import V40.b;
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
import com.detmir.recycli.adapters.RecyclerItem;
import f3.AbstractC6409a;
import g30.InterfaceC6618a;
import j3.AbstractC7265g;
import j3.C7275q;
import j3.Q;
import j3.w;
import j3.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r3.b;
import ru.ozon.app.android.R;
import ru.ozon.fintech.base.NoScrollRecycler;
import ru.ozon.fintech.ui.common.CenterLinearLayoutManager;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ40/b;", "LE30/c;", "<init>", "()V", "cbottom-onboarding_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35376a = "OnboardingSlidesPageFragment";

    /* renamed from: b, reason: collision with root package name */
    private S40.b f35377b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f35378c;

    /* renamed from: d, reason: collision with root package name */
    private NoScrollRecycler f35379d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f35380e;

    /* renamed from: f, reason: collision with root package name */
    private TextureView f35381f;

    /* renamed from: g, reason: collision with root package name */
    private NoScrollRecycler f35382g;

    /* renamed from: h, reason: collision with root package name */
    private ScreenStateView f35383h;

    /* renamed from: i, reason: collision with root package name */
    private Y40.a f35384i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35385j;

    /* renamed from: k, reason: collision with root package name */
    private ExoPlayer f35386k;

    /* renamed from: l, reason: collision with root package name */
    private X40.c f35387l;

    /* renamed from: m, reason: collision with root package name */
    private int f35388m;

    /* renamed from: n, reason: collision with root package name */
    private int f35389n;

    /* renamed from: o, reason: collision with root package name */
    private int f35390o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f35391p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f35392q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final a f35393r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final i f35394s;

    public static final class a implements y.c {
        a() {
        }

        @Override // j3.y.c
        public final void onPlaybackStateChanged(int i11) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            String str;
            b bVar = b.this;
            if (i11 == 2) {
                U40.c.a("OnboardingSlidesPageFragment", "onPlaybackStateChanged STATE_BUFFERING framePos=" + bVar.f35388m + " ");
                bVar.T().u0();
                return;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                U40.c.a("OnboardingSlidesPageFragment", "onPlaybackStateChanged STATE_ENDED framePos=" + bVar.f35388m + " ");
                y yVar = bVar.f35386k;
                if (yVar != null) {
                    ((AbstractC7265g) yVar).B();
                    return;
                }
                return;
            }
            U40.c.a("OnboardingSlidesPageFragment", "onPlaybackStateChanged STATE_READY framePos=" + bVar.f35388m + " ");
            bVar.T().v0();
            if (bVar.f35392q) {
                bVar.f35392q = false;
                InterfaceC6618a e02 = bVar.T().e0();
                Y40.b h02 = bVar.T().h0();
                if (h02 == null || (str = h02.k()) == null) {
                    str = "";
                }
                e02.D(str, null, true);
            }
            bVar.P();
            V40.b j02 = bVar.T().j0();
            int i12 = bVar.f35388m;
            ExoPlayer exoPlayer = bVar.f35386k;
            j02.t(i12, exoPlayer != null ? exoPlayer.getDuration() : 0L);
            if (bVar.f35391p) {
                TextureView textureView = bVar.f35381f;
                if (textureView != null && (animate = textureView.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(500L)) != null) {
                    duration.start();
                }
                bVar.f35391p = false;
            }
        }

        @Override // j3.y.c
        public final void onPlayerError(w error) {
            String str;
            Intrinsics.checkNotNullParameter(error, "error");
            b bVar = b.this;
            U40.c.a("OnboardingSlidesPageFragment", "onPlayerError framePos=" + bVar.f35388m + " ");
            if (bVar.f35392q) {
                bVar.f35392q = false;
                InterfaceC6618a e02 = bVar.T().e0();
                Y40.b h02 = bVar.T().h0();
                if (h02 == null || (str = h02.k()) == null) {
                    str = "";
                }
                e02.D(str, error.getMessage(), false);
            }
            bVar.T().t0(error);
        }

        @Override // j3.y.c
        public final void onRenderedFirstFrame() {
            b bVar = b.this;
            bVar.T().v0();
            bVar.P();
            U40.c.a("OnboardingSlidesPageFragment", "onRenderedFirstFrame framePos=" + bVar.f35388m + " ");
        }

        @Override // j3.y.c
        public final void onVideoSizeChanged(Q videoSize) {
            Intrinsics.checkNotNullParameter(videoSize, "videoSize");
            b bVar = b.this;
            StringBuilder a11 = C2438a.a("onVideoSizeChanged framePos=", bVar.f35388m, " videoSize.width=", " videoSize.height=", videoSize.f69043a);
            int i11 = videoSize.f69044b;
            a11.append(i11);
            U40.c.a("OnboardingSlidesPageFragment", a11.toString());
            bVar.f35389n = videoSize.f69043a;
            bVar.f35390o = i11;
            bVar.P();
        }
    }

    /* renamed from: Z40.b$b, reason: collision with other inner class name */
    public static final class C0659b implements InterfaceC2395h<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0 f35396a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f35397b;

        /* renamed from: Z40.b$b$a */
        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f35398a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f35399b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$filter$1$2", f = "OnboardingSlidesPageFragment.kt", l = {223}, m = "emit")
            /* renamed from: Z40.b$b$a$a, reason: collision with other inner class name */
            public static final class C0660a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f35400d;

                /* renamed from: e, reason: collision with root package name */
                int f35401e;

                public C0660a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f35400d = obj;
                    this.f35401e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i, b bVar) {
                this.f35398a = interfaceC2397i;
                this.f35399b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0660a c0660a;
                int i11;
                if (dVar instanceof C0660a) {
                    c0660a = (C0660a) dVar;
                    int i12 = c0660a.f35401e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0660a.f35401e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0660a.f35400d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0660a.f35401e;
                        if (i11 != 0) {
                            s.b(obj2);
                            if (this.f35399b.f35388m == ((Number) obj).intValue()) {
                                c0660a.f35401e = 1;
                                if (this.f35398a.emit(obj, c0660a) == aVar) {
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
                c0660a = new C0660a(dVar);
                Object obj22 = c0660a.f35400d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0660a.f35401e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public C0659b(C0 c02, b bVar) {
            this.f35396a = c02;
            this.f35397b = bVar;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super Integer> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f35396a.collect(new a(interfaceC2397i, this.f35397b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$1", f = "OnboardingSlidesPageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35403d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f35404e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0659b f35406g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f35407h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$1$1", f = "OnboardingSlidesPageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f35408d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0659b f35409e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f35410f;

            /* renamed from: Z40.b$c$a$a, reason: collision with other inner class name */
            public static final class C0661a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f35411a;

                public C0661a(b bVar) {
                    this.f35411a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ((Number) t2).intValue();
                    b bVar = this.f35411a;
                    y yVar = bVar.f35386k;
                    if (yVar != null) {
                        ((AbstractC7265g) yVar).B();
                    }
                    X40.c cVar = bVar.f35387l;
                    if (cVar != null) {
                        cVar.n();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0659b c0659b, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f35409e = c0659b;
                this.f35410f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f35409e, dVar, this.f35410f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f35408d;
                if (i11 == 0) {
                    s.b(obj);
                    C0661a c0661a = new C0661a(this.f35410f);
                    this.f35408d = 1;
                    if (this.f35409e.collect(c0661a, this) == aVar) {
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
        public c(C0659b c0659b, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f35406g = c0659b;
            this.f35407h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = b.this.new c(this.f35406g, dVar, this.f35407h);
            cVar.f35404e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35403d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f35404e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f35406g, null, this.f35407h);
                    this.f35403d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$2", f = "OnboardingSlidesPageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35412d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f35413e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f35415g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f35416h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$2$1", f = "OnboardingSlidesPageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f35417d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f35418e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f35419f;

            /* renamed from: Z40.b$d$a$a, reason: collision with other inner class name */
            public static final class C0662a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f35420a;

                public C0662a(b bVar) {
                    this.f35420a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    if (Intrinsics.d((Boolean) t2, Boolean.TRUE)) {
                        b bVar = this.f35420a;
                        Y40.b h02 = bVar.T().h0();
                        if ((h02 != null ? h02.h() : null) != null) {
                            String h11 = h02.h();
                            String b11 = h02.b();
                            Long g10 = h02.g();
                            Boolean a11 = h02.a();
                            b.v(bVar, h11, b11, g10, a11 != null ? a11.booleanValue() : true);
                        } else {
                            if ((h02 != null ? h02.k() : null) == null || !(bVar.f35384i instanceof a.AbstractC0633a.b)) {
                                if ((h02 != null ? h02.k() : null) != null && (bVar.f35384i instanceof a.AbstractC0633a.C0634a)) {
                                    bVar.R(h02.k());
                                    Y40.a aVar = bVar.f35384i;
                                    a.AbstractC0633a.C0634a c0634a = aVar instanceof a.AbstractC0633a.C0634a ? (a.AbstractC0633a.C0634a) aVar : null;
                                    bVar.V(c0634a != null && c0634a.a());
                                }
                            } else {
                                bVar.R(h02.k());
                                bVar.U();
                            }
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f35418e = c02;
                this.f35419f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f35418e, dVar, this.f35419f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f35417d;
                if (i11 == 0) {
                    s.b(obj);
                    C0662a c0662a = new C0662a(this.f35419f);
                    this.f35417d = 1;
                    if (this.f35418e.collect(c0662a, this) == aVar) {
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
        public d(C0 c02, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f35415g = c02;
            this.f35416h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = b.this.new d(this.f35415g, dVar, this.f35416h);
            dVar2.f35413e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35412d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f35413e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f35415g, null, this.f35416h);
                    this.f35412d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$3", f = "OnboardingSlidesPageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35421d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f35422e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f35424g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f35425h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$3$1", f = "OnboardingSlidesPageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f35426d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f35427e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f35428f;

            /* renamed from: Z40.b$e$a$a, reason: collision with other inner class name */
            public static final class C0663a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f35429a;

                public C0663a(b bVar) {
                    this.f35429a = bVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    RecyclerView recyclerView;
                    List list = (List) t2;
                    b bVar = this.f35429a;
                    U40.c.a("OnboardingSlidesPageFragment", "topWidgetsFlow observe framePos=" + bVar.f35388m + " topRecycler=" + (bVar.f35379d != null));
                    if (list != null && (recyclerView = bVar.f35379d) != null) {
                        com.detmir.recycli.adapters.d.a(recyclerView, list);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f35427e = interfaceC2395h;
                this.f35428f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f35427e, dVar, this.f35428f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f35426d;
                if (i11 == 0) {
                    s.b(obj);
                    C0663a c0663a = new C0663a(this.f35428f);
                    this.f35426d = 1;
                    if (this.f35427e.collect(c0663a, this) == aVar) {
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
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f35424g = interfaceC2395h;
            this.f35425h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = b.this.new e(this.f35424g, dVar, this.f35425h);
            eVar.f35422e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35421d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f35422e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f35424g, null, this.f35425h);
                    this.f35421d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$4", f = "OnboardingSlidesPageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35430d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f35431e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f35433g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f35434h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$4$1", f = "OnboardingSlidesPageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f35435d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f35436e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f35437f;

            /* renamed from: Z40.b$f$a$a, reason: collision with other inner class name */
            public static final class C0664a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f35438a;

                public C0664a(b bVar) {
                    this.f35438a = bVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    RecyclerView recyclerView;
                    List list = (List) t2;
                    b bVar = this.f35438a;
                    U40.c.a("OnboardingSlidesPageFragment", "bottomWidgetsFlow observe framePos=" + bVar.f35388m + " bottomRecycler=" + (bVar.f35382g != null));
                    if (list != null && (recyclerView = bVar.f35382g) != null) {
                        com.detmir.recycli.adapters.d.a(recyclerView, list);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f35436e = interfaceC2395h;
                this.f35437f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f35436e, dVar, this.f35437f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f35435d;
                if (i11 == 0) {
                    s.b(obj);
                    C0664a c0664a = new C0664a(this.f35437f);
                    this.f35435d = 1;
                    if (this.f35436e.collect(c0664a, this) == aVar) {
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
        public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f35433g = interfaceC2395h;
            this.f35434h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = b.this.new f(this.f35433g, dVar, this.f35434h);
            fVar.f35431e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35430d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f35431e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f35433g, null, this.f35434h);
                    this.f35430d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$5", f = "OnboardingSlidesPageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35439d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f35440e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f35442g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f35443h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$5$1", f = "OnboardingSlidesPageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f35444d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f35445e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f35446f;

            /* renamed from: Z40.b$g$a$a, reason: collision with other inner class name */
            public static final class C0665a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f35447a;

                public C0665a(b bVar) {
                    this.f35447a = bVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    U40.c.a("OnboardingSlidesPageFragment", "centerWidgetsFlow observe framePos=" + this.f35447a.f35388m + " centerRecycler=false");
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f35445e = interfaceC2395h;
                this.f35446f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f35445e, dVar, this.f35446f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f35444d;
                if (i11 == 0) {
                    s.b(obj);
                    C0665a c0665a = new C0665a(this.f35446f);
                    this.f35444d = 1;
                    if (this.f35445e.collect(c0665a, this) == aVar) {
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
        public g(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f35442g = interfaceC2395h;
            this.f35443h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = b.this.new g(this.f35442g, dVar, this.f35443h);
            gVar.f35440e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35439d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f35440e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f35442g, null, this.f35443h);
                    this.f35439d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$6", f = "OnboardingSlidesPageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f35448d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f35449e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f35451g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f35452h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesPageFragment$onViewCreated$$inlined$observe$6$1", f = "OnboardingSlidesPageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f35453d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f35454e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f35455f;

            /* renamed from: Z40.b$h$a$a, reason: collision with other inner class name */
            public static final class C0666a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f35456a;

                public C0666a(b bVar) {
                    this.f35456a = bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ScreenState screenState = (ScreenState) t2;
                    boolean z11 = screenState instanceof ScreenState.Progress;
                    b bVar = this.f35456a;
                    if (z11) {
                        ScreenStateView screenStateView = bVar.f35383h;
                        if (screenStateView != null) {
                            screenStateView.setVisibility(0);
                        }
                        ScreenStateView screenStateView2 = bVar.f35383h;
                        if (screenStateView2 != null) {
                            screenStateView2.bindState(screenState);
                        }
                    } else if (screenState instanceof ScreenState.Error) {
                        ScreenStateView screenStateView3 = bVar.f35383h;
                        if (screenStateView3 != null) {
                            screenStateView3.setVisibility(0);
                        }
                        ScreenStateView screenStateView4 = bVar.f35383h;
                        if (screenStateView4 != null) {
                            screenStateView4.bindState(screenState);
                        }
                    } else {
                        ScreenStateView screenStateView5 = bVar.f35383h;
                        if (screenStateView5 != null) {
                            screenStateView5.reset();
                        }
                        ScreenStateView screenStateView6 = bVar.f35383h;
                        if (screenStateView6 != null) {
                            screenStateView6.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
                super(2, dVar);
                this.f35454e = interfaceC2395h;
                this.f35455f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f35454e, dVar, this.f35455f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f35453d;
                if (i11 == 0) {
                    s.b(obj);
                    C0666a c0666a = new C0666a(this.f35455f);
                    this.f35453d = 1;
                    if (this.f35454e.collect(c0666a, this) == aVar) {
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
        public h(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
            super(2, dVar);
            this.f35451g = interfaceC2395h;
            this.f35452h = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = b.this.new h(this.f35451g, dVar, this.f35452h);
            hVar.f35449e = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f35448d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f35449e)) {
                    J viewLifecycleOwner = b.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f35451g, null, this.f35452h);
                    this.f35448d = 1;
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

    public static final class i implements y.c {
        i() {
        }

        @Override // j3.y.c
        public final void onPlaybackStateChanged(int i11) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            b bVar = b.this;
            if (i11 == 2) {
                U40.c.a("OnboardingSlidesPageFragment", "picListener onPlaybackStateChanged STATE_BUFFERING framePos=" + bVar.f35388m + " ");
                bVar.T().r0();
                return;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                U40.c.a("OnboardingSlidesPageFragment", "picListener onPlaybackStateChanged STATE_ENDED framePos=" + bVar.f35388m + " ");
                X40.c cVar = bVar.f35387l;
                if (cVar != null) {
                    cVar.n();
                    return;
                }
                return;
            }
            U40.c.a("OnboardingSlidesPageFragment", "picListener onPlaybackStateChanged STATE_READY framePos=" + bVar.f35388m + " ");
            bVar.T().s0();
            V40.b j02 = bVar.T().j0();
            int i12 = bVar.f35388m;
            X40.c cVar2 = bVar.f35387l;
            j02.t(i12, cVar2 != null ? cVar2.f() : 0L);
            if (bVar.f35391p) {
                ImageView imageView = bVar.f35380e;
                if (imageView != null && (animate = imageView.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(500L)) != null) {
                    duration.start();
                }
                bVar.f35391p = false;
            }
        }

        @Override // j3.y.c
        public final void onPlayerError(w error) {
            Intrinsics.checkNotNullParameter(error, "error");
            b bVar = b.this;
            U40.c.a("OnboardingSlidesPageFragment", "picListener onPlayerError framePos=" + bVar.f35388m + " ");
            bVar.T().q0(error);
        }
    }

    public static final class j extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return b.this;
        }
    }

    public static final class k extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f35459b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f35459b = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f35459b.invoke();
        }
    }

    public static final class l extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f35460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f35460b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f35460b.getValue()).getViewModelStore();
        }
    }

    public static final class m extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f35461b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f35461b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f35461b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public b() {
        Ca.h hVar = new Ca.h(this, 4);
        InterfaceC4008j a11 = Sc.k.a(n.NONE, new k(new j()));
        this.f35378c = b0.b(this, kotlin.jvm.internal.N.b(Z40.c.class), new l(a11), new m(a11), hVar);
        this.f35391p = true;
        this.f35392q = true;
        this.f35393r = new a();
        this.f35394s = new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        int i11;
        int i12;
        TextureView textureView = this.f35381f;
        int width = textureView != null ? textureView.getWidth() : 0;
        TextureView textureView2 = this.f35381f;
        int height = textureView2 != null ? textureView2.getHeight() : 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("adjustAspectRatio framePos=" + this.f35388m + " ");
        sb2.append("viewWidth=" + width + " ");
        sb2.append("viewHeight=" + height + " ");
        sb2.append("videoWidth=" + this.f35389n + " ");
        sb2.append("videoHeight=" + this.f35390o);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        U40.c.a("OnboardingSlidesPageFragment", sb3);
        if (width == 0 || height == 0 || (i11 = this.f35389n) == 0 || (i12 = this.f35390o) == 0) {
            return;
        }
        Matrix f7 = new J30.a(new a.d(width, height), new a.d(i11, i12)).f(a.c.CENTER_CROP);
        TextureView textureView3 = this.f35381f;
        if (textureView3 != null) {
            textureView3.setOpaque(false);
        }
        TextureView textureView4 = this.f35381f;
        if (textureView4 != null) {
            textureView4.setTransform(f7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if ((r0 != null ? r0.b() : null) != null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void Q() {
        D3.h.g(this.f35388m, "beReady framePos=", "OnboardingSlidesPageFragment");
        Y40.b h02 = T().h0();
        if ((h02 != null ? h02.k() : null) != null) {
            if (this.f35381f == null) {
                TextureView textureView = new TextureView(requireContext());
                textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                textureView.setId(R.id.video_view_onboarding);
                this.f35381f = textureView;
                if (this.f35391p) {
                    textureView.setAlpha(0.0f);
                }
                S40.b bVar = this.f35377b;
                if (bVar != null) {
                    bVar.f25773c.addView(this.f35381f, 0);
                }
            }
            if (this.f35386k == null) {
                ExoPlayer.b bVar2 = new ExoPlayer.b(requireContext());
                C3010o c3010o = new C3010o(requireContext());
                c3010o.f(new C2601c(this));
                bVar2.e(c3010o);
                this.f35386k = bVar2.a();
            }
            ExoPlayer exoPlayer = this.f35386k;
            if (exoPlayer != null) {
                exoPlayer.t(this.f35393r);
            }
            ExoPlayer exoPlayer2 = this.f35386k;
            if (exoPlayer2 != null) {
                exoPlayer2.S(0);
            }
            ExoPlayer exoPlayer3 = this.f35386k;
            if (exoPlayer3 != null) {
                exoPlayer3.J(this.f35381f);
            }
            ExoPlayer exoPlayer4 = this.f35386k;
            if (exoPlayer4 != null) {
                exoPlayer4.D(false);
            }
        }
        if ((h02 != null ? h02.k() : null) == null) {
            if ((h02 != null ? h02.h() : null) == null) {
            }
            if (this.f35380e == null) {
                ImageView imageView = new ImageView(requireContext());
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setId(R.id.image_view_onboarding);
                this.f35380e = imageView;
                if (this.f35391p) {
                    imageView.setAlpha(0.0f);
                }
                S40.b bVar3 = this.f35377b;
                if (bVar3 != null) {
                    bVar3.f25773c.addView(this.f35380e, 0);
                }
            }
            if (this.f35387l == null) {
                this.f35387l = new X40.c(K.a(this));
            }
            X40.c cVar = this.f35387l;
            if (cVar != null) {
                cVar.p(Integer.valueOf(this.f35388m));
            }
            X40.c cVar2 = this.f35387l;
            if (cVar2 != null) {
                cVar2.c(this.f35394s);
            }
            X40.c cVar3 = this.f35387l;
            if (cVar3 != null) {
                cVar3.q(this.f35380e);
            }
        }
        S40.b bVar4 = this.f35377b;
        ConstraintLayout constraintLayout = bVar4 != null ? bVar4.f25775e : null;
        if (this.f35383h == null && constraintLayout != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ScreenStateView screenStateView = new ScreenStateView(requireContext, null, 0, 6, null);
            ConstraintLayout.b bVar5 = new ConstraintLayout.b(-1, 0);
            bVar5.f41617X = true;
            bVar5.f41612S = 0.5f;
            bVar5.f41655s = R.id.onboarding_slides_page_top;
            bVar5.f41656t = R.id.onboarding_slides_page_top;
            bVar5.f41636i = R.id.onboarding_slides_page_top;
            screenStateView.setLayoutParams(bVar5);
            screenStateView.setClickable(false);
            screenStateView.setFocusable(false);
            this.f35383h = screenStateView;
            constraintLayout.addView(screenStateView);
        }
        if (this.f35379d == null) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            NoScrollRecycler noScrollRecycler = new NoScrollRecycler(requireContext2, null, 6, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            noScrollRecycler.setLayoutParams(layoutParams);
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            noScrollRecycler.setLayoutManager(new CenterLinearLayoutManager(requireContext3, 1, false));
            noScrollRecycler.setId(R.id.top_widgets_recycler_onboarding);
            this.f35379d = noScrollRecycler;
            S40.b bVar6 = this.f35377b;
            if (bVar6 != null) {
                bVar6.f25774d.addView(noScrollRecycler);
            }
        }
        if (this.f35382g == null) {
            Context requireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
            NoScrollRecycler noScrollRecycler2 = new NoScrollRecycler(requireContext4, null, 6, 0);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 80;
            noScrollRecycler2.setLayoutParams(layoutParams2);
            Context requireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
            CenterLinearLayoutManager centerLinearLayoutManager = new CenterLinearLayoutManager(requireContext5, 1, false);
            centerLinearLayoutManager.setStackFromEnd(true);
            noScrollRecycler2.setLayoutManager(centerLinearLayoutManager);
            noScrollRecycler2.setId(R.id.bottom_widgets_recycler_onboarding);
            this.f35382g = noScrollRecycler2;
            S40.b bVar7 = this.f35377b;
            if (bVar7 != null) {
                bVar7.f25772b.addView(noScrollRecycler2);
            }
        }
        T().p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(String str) {
        this.f35392q = true;
        int i11 = C7275q.f69182g;
        C7275q.a aVar = new C7275q.a();
        aVar.j(str);
        C7275q a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "fromUri(...)");
        P();
        T().e0().F(this.f35388m, str);
        y yVar = this.f35386k;
        if (yVar != null) {
            ((AbstractC7265g) yVar).g0(a11);
        }
        ExoPlayer exoPlayer = this.f35386k;
        if (exoPlayer != null) {
            exoPlayer.prepare();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Z40.c T() {
        return (Z40.c) this.f35378c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U() {
        D3.h.g(this.f35388m, "pause framePos=", "OnboardingSlidesPageFragment");
        y yVar = this.f35386k;
        if (yVar != null) {
            ((AbstractC7265g) yVar).D(false);
        }
        y yVar2 = this.f35386k;
        if (yVar2 != null) {
            ((AbstractC7265g) yVar2).B();
        }
        X40.c cVar = this.f35387l;
        if (cVar != null) {
            cVar.i();
        }
        X40.c cVar2 = this.f35387l;
        if (cVar2 != null) {
            cVar2.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(boolean z11) {
        P();
        D3.h.g(this.f35388m, "play framePos=", "OnboardingSlidesPageFragment");
        if (z11) {
            y yVar = this.f35386k;
            if (yVar != null) {
                ((AbstractC7265g) yVar).D(false);
            }
            X40.c cVar = this.f35387l;
            if (cVar != null) {
                cVar.i();
                return;
            }
            return;
        }
        y yVar2 = this.f35386k;
        if (yVar2 != null) {
            ((AbstractC7265g) yVar2).D(true);
        }
        X40.c cVar2 = this.f35387l;
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
    private final void W() {
        ExoPlayer exoPlayer;
        C7275q A11;
        C7275q.f fVar;
        Uri uri;
        Boolean a11;
        U40.c.a("OnboardingSlidesPageFragment", "prepare framePos=" + this.f35388m + " player=" + this.f35386k);
        Y40.b h02 = T().h0();
        String str = null;
        String k11 = h02 != null ? h02.k() : null;
        Y40.b h03 = T().h0();
        String h11 = h03 != null ? h03.h() : null;
        Y40.b h04 = T().h0();
        String b11 = h04 != null ? h04.b() : null;
        Y40.b h05 = T().h0();
        Long g10 = h05 != null ? h05.g() : null;
        Y40.b h06 = T().h0();
        boolean booleanValue = (h06 == null || (a11 = h06.a()) == null) ? true : a11.booleanValue();
        if (k11 == null && (h11 != null || b11 != null)) {
            X40.c cVar = this.f35387l;
            if (Intrinsics.d(cVar != null ? cVar.h() : null, h11)) {
                X40.c cVar2 = this.f35387l;
            }
            X40.c cVar3 = this.f35387l;
            if (cVar3 != null) {
                cVar3.r(h11, b11, g10, booleanValue);
            }
            X40.c cVar4 = this.f35387l;
            if (cVar4 != null) {
                cVar4.k();
            }
        }
        if (k11 != null) {
            y yVar = this.f35386k;
            if (yVar != null && (A11 = ((AbstractC7265g) yVar).A()) != null && (fVar = A11.f69184b) != null && (uri = fVar.f69240a) != null) {
                str = uri.toString();
            }
            if (Intrinsics.d(str, k11) && (exoPlayer = this.f35386k) != null && exoPlayer.P() == 3) {
                return;
            }
            R(k11);
        }
    }

    public static r3.b t(b bVar) {
        return new b.a(bVar.T().i0()).createDataSource();
    }

    public static final void v(b bVar, String str, String str2, Long l11, boolean z11) {
        X40.c cVar = bVar.f35387l;
        if (cVar != null) {
            cVar.r(str, str2, l11, z11);
        }
        X40.c cVar2 = bVar.f35387l;
        if (cVar2 != null) {
            cVar2.k();
        }
    }

    public final long S() {
        ExoPlayer exoPlayer = this.f35386k;
        if (exoPlayer != null) {
            return exoPlayer.getCurrentPosition();
        }
        X40.c cVar = this.f35387l;
        if (cVar != null) {
            return cVar.e();
        }
        return 0L;
    }

    public final void X(Y40.a aVar) {
        if (Intrinsics.d(this.f35384i, aVar)) {
            return;
        }
        this.f35384i = aVar;
        if (!(aVar instanceof a.b)) {
            if (aVar instanceof a.AbstractC0633a.b) {
                this.f35385j = true;
                Q();
                W();
                U();
                return;
            }
            if (aVar instanceof a.AbstractC0633a.C0634a) {
                this.f35385j = true;
                Q();
                W();
                V(((a.AbstractC0633a.C0634a) aVar).a());
                return;
            }
            return;
        }
        this.f35385j = true;
        ExoPlayer exoPlayer = this.f35386k;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        ExoPlayer exoPlayer2 = this.f35386k;
        if (exoPlayer2 != null) {
            exoPlayer2.J(null);
        }
        ExoPlayer exoPlayer3 = this.f35386k;
        if (exoPlayer3 != null) {
            exoPlayer3.release();
        }
        X40.c cVar = this.f35387l;
        if (cVar != null) {
            cVar.s();
        }
        X40.c cVar2 = this.f35387l;
        if (cVar2 != null) {
            cVar2.q(null);
        }
        X40.c cVar3 = this.f35387l;
        if (cVar3 != null) {
            cVar3.l();
        }
        D3.h.g(this.f35388m, "relax framePos=", "OnboardingSlidesPageFragment");
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95692f() {
        return this.f35376a;
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
        ((T40.a) O30.a.a(O30.c.a(requireActivity)).a(T40.a.class)).R(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        int i11 = arguments != null ? arguments.getInt("FRAME_POS") : 0;
        this.f35388m = i11;
        D3.h.g(i11, "onCreate framePos=", "OnboardingSlidesPageFragment");
        T().m0(this.f35388m);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        S40.b b11 = S40.b.b(inflater, viewGroup);
        D3.h.g(this.f35388m, "onCreateView framePos=", "OnboardingSlidesPageFragment");
        this.f35377b = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        ExoPlayer exoPlayer = this.f35386k;
        if (exoPlayer != null) {
            exoPlayer.j(this.f35393r);
        }
        ExoPlayer exoPlayer2 = this.f35386k;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        X40.c cVar = this.f35387l;
        if (cVar != null) {
            cVar.m(this.f35394s);
        }
        X40.c cVar2 = this.f35387l;
        if (cVar2 != null) {
            cVar2.l();
        }
        D3.h.g(this.f35388m, "onDestroy framePos=", "OnboardingSlidesPageFragment");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        T().j0().o(this.f35388m);
        super.onDestroyView();
        ExoPlayer exoPlayer = this.f35386k;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        ExoPlayer exoPlayer2 = this.f35386k;
        if (exoPlayer2 != null) {
            exoPlayer2.J(null);
        }
        this.f35386k = null;
        X40.c cVar = this.f35387l;
        if (cVar != null) {
            cVar.s();
        }
        X40.c cVar2 = this.f35387l;
        if (cVar2 != null) {
            cVar2.q(null);
        }
        this.f35387l = null;
        this.f35379d = null;
        this.f35380e = null;
        this.f35381f = null;
        this.f35382g = null;
        this.f35383h = null;
        this.f35385j = false;
        D3.h.g(this.f35388m, "onDestroyView framePos=", "OnboardingSlidesPageFragment");
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Y40.a d11;
        ConstraintLayout a11;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        S40.b bVar = this.f35377b;
        if (bVar != null && (a11 = bVar.a()) != null) {
            S40.b bVar2 = this.f35377b;
            a11.getViewTreeObserver().addOnGlobalLayoutListener(new A(a11, bVar2 != null ? bVar2.f25773c : null));
        }
        Z40.c T11 = T();
        InterfaceC5431s parentFragment = getParentFragment();
        Intrinsics.g(parentFragment, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottomonboarding.interactor.v1.OnboardingSlidesInteractor.Provider");
        V40.b provideOnboardingInteractor = ((b.a) parentFragment).provideOnboardingInteractor();
        T11.getClass();
        Intrinsics.checkNotNullParameter(provideOnboardingInteractor, "<set-?>");
        T11.f35465d = provideOnboardingInteractor;
        T().n0();
        D3.h.g(this.f35388m, "onViewCreated framePos=", "OnboardingSlidesPageFragment");
        C0659b c0659b = new C0659b(T().j0().h(), this);
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new c(c0659b, null, this), 3);
        C0 k02 = T().k0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new d(k02, null, this), 3);
        x0<List<RecyclerItem>> l02 = T().l0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new e(l02, null, this), 3);
        x0<List<RecyclerItem>> f02 = T().f0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new f(f02, null, this), 3);
        x0<List<RecyclerItem>> g02 = T().g0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new g(g02, null, this), 3);
        x0<ScreenState> screenStateFlow = T().getScreenStateFlow();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new h(screenStateFlow, null, this), 3);
        T().j0().n(this.f35388m, this);
        if (this.f35385j || (d11 = T().j0().d(this.f35388m)) == null) {
            return;
        }
        this.f35384i = null;
        X(d11);
    }
}
