package B50;

import A50.c;
import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Am.C2438a;
import C50.a;
import J30.a;
import Sc.InterfaceC4008j;
import Sc.s;
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
import j3.AbstractC7265g;
import j3.C7275q;
import j3.Q;
import j3.w;
import j3.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.base.NoScrollRecycler;
import ru.ozon.fintech.features.cbottomstories.presentation.views.LeftRightFrameLayout;
import ru.ozon.fintech.ui.common.CenterLinearLayoutManager;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import x50.C10660a;
import xe.C10727i;
import xe.M;
import xe.N;
import z50.C10989c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LB50/h;", "LE30/c;", "<init>", "()V", "cbottom-stories_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f2834a = "OneStoryPageFragment";

    /* renamed from: b, reason: collision with root package name */
    private C10660a f2835b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f2836c;

    /* renamed from: d, reason: collision with root package name */
    private NoScrollRecycler f2837d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f2838e;

    /* renamed from: f, reason: collision with root package name */
    private TextureView f2839f;

    /* renamed from: g, reason: collision with root package name */
    private NoScrollRecycler f2840g;

    /* renamed from: h, reason: collision with root package name */
    private NoScrollRecycler f2841h;

    /* renamed from: i, reason: collision with root package name */
    private ScreenStateView f2842i;

    /* renamed from: j, reason: collision with root package name */
    private C50.a f2843j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2844k;

    /* renamed from: l, reason: collision with root package name */
    private ExoPlayer f2845l;

    /* renamed from: m, reason: collision with root package name */
    private D50.c f2846m;

    /* renamed from: n, reason: collision with root package name */
    private int f2847n;

    /* renamed from: o, reason: collision with root package name */
    private int f2848o;

    /* renamed from: p, reason: collision with root package name */
    private int f2849p;

    /* renamed from: q, reason: collision with root package name */
    private int f2850q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2851r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final a f2852s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final k f2853t;

    public static final class a implements y.c {
        a() {
        }

        @Override // j3.y.c
        public final void onPlaybackStateChanged(int i11) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            h hVar = h.this;
            if (i11 == 2) {
                C10989c.a("OneFramePageFragment", Cm.e.c("onPlaybackStateChanged STATE_BUFFERING storyPos=", hVar.f2848o, " framePos=", " ", hVar.f2847n));
                hVar.T().s0();
                return;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                C10989c.a("OneFramePageFragment", Cm.e.c("onPlaybackStateChanged STATE_ENDED storyPos=", hVar.f2848o, " framePos=", " ", hVar.f2847n));
                hVar.T().i0().E(hVar.f2848o, hVar.f2847n);
                return;
            }
            C10989c.a("OneFramePageFragment", Cm.e.c("onPlaybackStateChanged STATE_READY storyPos=", hVar.f2848o, " framePos=", " ", hVar.f2847n));
            hVar.Q();
            hVar.T().t0();
            A50.c i02 = hVar.T().i0();
            int i12 = hVar.f2848o;
            int i13 = hVar.f2847n;
            ExoPlayer exoPlayer = hVar.f2845l;
            i02.J(i12, i13, exoPlayer != null ? exoPlayer.getDuration() : 0L);
            if (hVar.f2851r) {
                TextureView textureView = hVar.f2839f;
                if (textureView != null && (animate = textureView.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(500L)) != null) {
                    duration.start();
                }
                hVar.f2851r = false;
            }
        }

        @Override // j3.y.c
        public final void onPlayerError(w error) {
            String str;
            C7275q A11;
            C7275q.f fVar;
            Uri uri;
            Intrinsics.checkNotNullParameter(error, "error");
            h hVar = h.this;
            C10989c.a("OneFramePageFragment", Cm.e.c("onPlayerError storyPos=", hVar.f2848o, "  framePos=", " ", hVar.f2847n));
            B50.i T11 = hVar.T();
            y yVar = hVar.f2845l;
            if (yVar == null || (A11 = ((AbstractC7265g) yVar).A()) == null || (fVar = A11.f69184b) == null || (uri = fVar.f69240a) == null || (str = uri.toString()) == null) {
                str = "Url is null";
            }
            T11.r0(error, str, error.f69342a == 0 ? error.getMessage() : error.a());
        }

        @Override // j3.y.c
        public final void onRenderedFirstFrame() {
            h hVar = h.this;
            hVar.T().t0();
            hVar.Q();
            C10989c.a("OneFramePageFragment", Cm.e.c("onRenderedFirstFrame storyPos=", hVar.f2848o, " framePos=", " ", hVar.f2847n));
        }

        @Override // j3.y.c
        public final void onVideoSizeChanged(Q videoSize) {
            Intrinsics.checkNotNullParameter(videoSize, "videoSize");
            int i11 = videoSize.f69043a;
            h hVar = h.this;
            hVar.f2849p = i11;
            hVar.f2850q = videoSize.f69044b;
            hVar.Q();
        }
    }

    public static final class b implements InterfaceC2395h<Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0 f2855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f2856b;

        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f2857a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f2858b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$filter$1$2", f = "OneFramePageFragment.kt", l = {223}, m = "emit")
            /* renamed from: B50.h$b$a$a, reason: collision with other inner class name */
            public static final class C0066a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f2859d;

                /* renamed from: e, reason: collision with root package name */
                int f2860e;

                public C0066a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f2859d = obj;
                    this.f2860e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i, h hVar) {
                this.f2857a = interfaceC2397i;
                this.f2858b = hVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0066a c0066a;
                int i11;
                if (dVar instanceof C0066a) {
                    c0066a = (C0066a) dVar;
                    int i12 = c0066a.f2860e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0066a.f2860e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0066a.f2859d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0066a.f2860e;
                        if (i11 != 0) {
                            s.b(obj2);
                            Pair pair = (Pair) obj;
                            h hVar = this.f2858b;
                            if (hVar.f2848o == ((Number) pair.e()).intValue() && hVar.f2847n == ((Number) pair.f()).intValue()) {
                                c0066a.f2860e = 1;
                                if (this.f2857a.emit(obj, c0066a) == aVar) {
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
                c0066a = new C0066a(dVar);
                Object obj22 = c0066a.f2859d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0066a.f2860e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public b(C0 c02, h hVar) {
            this.f2855a = c02;
            this.f2856b = hVar;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super Pair<? extends Integer, ? extends Integer>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f2855a.collect(new a(interfaceC2397i, this.f2856b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$1", f = "OneFramePageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f2862d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f2863e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f2865g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f2866h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$1$1", f = "OneFramePageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f2867d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f2868e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f2869f;

            /* renamed from: B50.h$c$a$a, reason: collision with other inner class name */
            public static final class C0067a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ h f2870a;

                public C0067a(h hVar) {
                    this.f2870a = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    h hVar = this.f2870a;
                    y yVar = hVar.f2845l;
                    if (yVar != null) {
                        ((AbstractC7265g) yVar).B();
                    }
                    D50.c cVar = hVar.f2846m;
                    if (cVar != null) {
                        cVar.q();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, kotlin.coroutines.d dVar, h hVar) {
                super(2, dVar);
                this.f2868e = bVar;
                this.f2869f = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f2868e, dVar, this.f2869f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f2867d;
                if (i11 == 0) {
                    s.b(obj);
                    C0067a c0067a = new C0067a(this.f2869f);
                    this.f2867d = 1;
                    if (this.f2868e.collect(c0067a, this) == aVar) {
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
        public c(b bVar, kotlin.coroutines.d dVar, h hVar) {
            super(2, dVar);
            this.f2865g = bVar;
            this.f2866h = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = h.this.new c(this.f2865g, dVar, this.f2866h);
            cVar.f2863e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f2862d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f2863e)) {
                    J viewLifecycleOwner = h.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f2865g, null, this.f2866h);
                    this.f2862d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$2", f = "OneFramePageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f2871d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f2872e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f2874g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f2875h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$2$1", f = "OneFramePageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f2876d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f2877e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f2878f;

            /* renamed from: B50.h$d$a$a, reason: collision with other inner class name */
            public static final class C0068a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ h f2879a;

                public C0068a(h hVar) {
                    this.f2879a = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    if (Intrinsics.d((Boolean) t2, Boolean.TRUE)) {
                        h hVar = this.f2879a;
                        C50.b g02 = hVar.T().g0();
                        if ((g02 != null ? g02.f() : null) != null) {
                            String f7 = g02.f();
                            String b11 = g02.b();
                            Long e11 = g02.e();
                            Boolean a11 = g02.a();
                            h.w(hVar, f7, b11, e11, a11 != null ? a11.booleanValue() : true);
                        } else {
                            if ((g02 != null ? g02.h() : null) == null || !(hVar.f2843j instanceof a.AbstractC0108a.b)) {
                                if ((g02 != null ? g02.h() : null) != null && (hVar.f2843j instanceof a.AbstractC0108a.C0109a)) {
                                    h.x(hVar, g02.h());
                                    C50.a aVar = hVar.f2843j;
                                    a.AbstractC0108a.C0109a c0109a = aVar instanceof a.AbstractC0108a.C0109a ? (a.AbstractC0108a.C0109a) aVar : null;
                                    hVar.V(c0109a != null && c0109a.a());
                                }
                            } else {
                                h.x(hVar, g02.h());
                                hVar.U();
                            }
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, h hVar) {
                super(2, dVar);
                this.f2877e = c02;
                this.f2878f = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f2877e, dVar, this.f2878f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f2876d;
                if (i11 == 0) {
                    s.b(obj);
                    C0068a c0068a = new C0068a(this.f2878f);
                    this.f2876d = 1;
                    if (this.f2877e.collect(c0068a, this) == aVar) {
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
        public d(C0 c02, kotlin.coroutines.d dVar, h hVar) {
            super(2, dVar);
            this.f2874g = c02;
            this.f2875h = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = h.this.new d(this.f2874g, dVar, this.f2875h);
            dVar2.f2872e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f2871d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f2872e)) {
                    J viewLifecycleOwner = h.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f2874g, null, this.f2875h);
                    this.f2871d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$3", f = "OneFramePageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f2880d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f2881e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f2883g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f2884h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$3$1", f = "OneFramePageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f2885d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f2886e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f2887f;

            /* renamed from: B50.h$e$a$a, reason: collision with other inner class name */
            public static final class C0069a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ h f2888a;

                public C0069a(h hVar) {
                    this.f2888a = hVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    RecyclerView recyclerView;
                    List list = (List) t2;
                    h hVar = this.f2888a;
                    int i11 = hVar.f2848o;
                    int i12 = hVar.f2847n;
                    boolean z11 = hVar.f2837d != null;
                    StringBuilder a11 = C2438a.a("topWidgetsFlow observe storyPos=", i11, " framePos=", " topRecycler=", i12);
                    a11.append(z11);
                    C10989c.a("OneFramePageFragment", a11.toString());
                    if (list != null && (recyclerView = hVar.f2837d) != null) {
                        com.detmir.recycli.adapters.d.a(recyclerView, list);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, h hVar) {
                super(2, dVar);
                this.f2886e = interfaceC2395h;
                this.f2887f = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f2886e, dVar, this.f2887f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f2885d;
                if (i11 == 0) {
                    s.b(obj);
                    C0069a c0069a = new C0069a(this.f2887f);
                    this.f2885d = 1;
                    if (this.f2886e.collect(c0069a, this) == aVar) {
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
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, h hVar) {
            super(2, dVar);
            this.f2883g = interfaceC2395h;
            this.f2884h = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = h.this.new e(this.f2883g, dVar, this.f2884h);
            eVar.f2881e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f2880d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f2881e)) {
                    J viewLifecycleOwner = h.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f2883g, null, this.f2884h);
                    this.f2880d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$4", f = "OneFramePageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f2889d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f2890e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f2892g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f2893h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$4$1", f = "OneFramePageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f2894d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f2895e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f2896f;

            /* renamed from: B50.h$f$a$a, reason: collision with other inner class name */
            public static final class C0070a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ h f2897a;

                public C0070a(h hVar) {
                    this.f2897a = hVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    RecyclerView recyclerView;
                    List list = (List) t2;
                    if (list != null && (recyclerView = this.f2897a.f2840g) != null) {
                        com.detmir.recycli.adapters.d.a(recyclerView, list);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, h hVar) {
                super(2, dVar);
                this.f2895e = interfaceC2395h;
                this.f2896f = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f2895e, dVar, this.f2896f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f2894d;
                if (i11 == 0) {
                    s.b(obj);
                    C0070a c0070a = new C0070a(this.f2896f);
                    this.f2894d = 1;
                    if (this.f2895e.collect(c0070a, this) == aVar) {
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
        public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, h hVar) {
            super(2, dVar);
            this.f2892g = interfaceC2395h;
            this.f2893h = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = h.this.new f(this.f2892g, dVar, this.f2893h);
            fVar.f2890e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f2889d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f2890e)) {
                    J viewLifecycleOwner = h.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f2892g, null, this.f2893h);
                    this.f2889d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$5", f = "OneFramePageFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f2898d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f2899e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f2901g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f2902h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$5$1", f = "OneFramePageFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f2903d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f2904e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f2905f;

            /* renamed from: B50.h$g$a$a, reason: collision with other inner class name */
            public static final class C0071a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ h f2906a;

                public C0071a(h hVar) {
                    this.f2906a = hVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    RecyclerView recyclerView;
                    List list = (List) t2;
                    if (list != null && (recyclerView = this.f2906a.f2841h) != null) {
                        com.detmir.recycli.adapters.d.a(recyclerView, list);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, h hVar) {
                super(2, dVar);
                this.f2904e = interfaceC2395h;
                this.f2905f = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f2904e, dVar, this.f2905f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f2903d;
                if (i11 == 0) {
                    s.b(obj);
                    C0071a c0071a = new C0071a(this.f2905f);
                    this.f2903d = 1;
                    if (this.f2904e.collect(c0071a, this) == aVar) {
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
        public g(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, h hVar) {
            super(2, dVar);
            this.f2901g = interfaceC2395h;
            this.f2902h = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = h.this.new g(this.f2901g, dVar, this.f2902h);
            gVar.f2899e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f2898d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f2899e)) {
                    J viewLifecycleOwner = h.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f2901g, null, this.f2902h);
                    this.f2898d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$6", f = "OneFramePageFragment.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: B50.h$h, reason: collision with other inner class name */
    public static final class C0072h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f2907d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f2908e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f2910g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f2911h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.OneFramePageFragment$onViewCreated$$inlined$observe$6$1", f = "OneFramePageFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: B50.h$h$a */
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f2912d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f2913e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f2914f;

            /* renamed from: B50.h$h$a$a, reason: collision with other inner class name */
            public static final class C0073a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ h f2915a;

                public C0073a(h hVar) {
                    this.f2915a = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ScreenState screenState = (ScreenState) t2;
                    boolean z11 = screenState instanceof ScreenState.Progress;
                    h hVar = this.f2915a;
                    if (z11) {
                        ScreenStateView screenStateView = hVar.f2842i;
                        if (screenStateView != null) {
                            screenStateView.setVisibility(0);
                        }
                        ScreenStateView screenStateView2 = hVar.f2842i;
                        if (screenStateView2 != null) {
                            screenStateView2.bindState(screenState);
                        }
                    } else if (screenState instanceof ScreenState.Error) {
                        ScreenStateView screenStateView3 = hVar.f2842i;
                        if (screenStateView3 != null) {
                            screenStateView3.setVisibility(0);
                        }
                        ScreenStateView screenStateView4 = hVar.f2842i;
                        if (screenStateView4 != null) {
                            screenStateView4.bindState(screenState);
                        }
                    } else {
                        ScreenStateView screenStateView5 = hVar.f2842i;
                        if (screenStateView5 != null) {
                            screenStateView5.reset();
                        }
                        ScreenStateView screenStateView6 = hVar.f2842i;
                        if (screenStateView6 != null) {
                            screenStateView6.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, h hVar) {
                super(2, dVar);
                this.f2913e = interfaceC2395h;
                this.f2914f = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f2913e, dVar, this.f2914f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f2912d;
                if (i11 == 0) {
                    s.b(obj);
                    C0073a c0073a = new C0073a(this.f2914f);
                    this.f2912d = 1;
                    if (this.f2913e.collect(c0073a, this) == aVar) {
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
        public C0072h(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, h hVar) {
            super(2, dVar);
            this.f2910g = interfaceC2395h;
            this.f2911h = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C0072h c0072h = h.this.new C0072h(this.f2910g, dVar, this.f2911h);
            c0072h.f2908e = obj;
            return c0072h;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0072h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f2907d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f2908e)) {
                    J viewLifecycleOwner = h.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f2910g, null, this.f2911h);
                    this.f2907d = 1;
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

    /* synthetic */ class i extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            A50.c cVar = (A50.c) this.receiver;
            cVar.getClass();
            H30.o.a(cVar, new A50.a(cVar, 0));
            return Unit.f71690a;
        }
    }

    /* synthetic */ class j extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            A50.c cVar = (A50.c) this.receiver;
            cVar.getClass();
            H30.o.a(cVar, new A50.b(cVar, 0));
            return Unit.f71690a;
        }
    }

    public static final class k implements y.c {
        k() {
        }

        @Override // j3.y.c
        public final void onPlaybackStateChanged(int i11) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            h hVar = h.this;
            if (i11 == 2) {
                hVar.T().p0();
                return;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                hVar.T().i0().E(hVar.f2848o, hVar.f2847n);
                return;
            }
            hVar.T().q0();
            A50.c i02 = hVar.T().i0();
            int i12 = hVar.f2848o;
            int i13 = hVar.f2847n;
            D50.c cVar = hVar.f2846m;
            i02.J(i12, i13, cVar != null ? cVar.h() : 0L);
            if (hVar.f2851r) {
                ImageView imageView = hVar.f2838e;
                if (imageView != null && (animate = imageView.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(500L)) != null) {
                    duration.start();
                }
                hVar.f2851r = false;
            }
        }

        @Override // j3.y.c
        public final void onPlayerError(w error) {
            String str;
            Intrinsics.checkNotNullParameter(error, "error");
            h hVar = h.this;
            B50.i T11 = hVar.T();
            D50.c cVar = hVar.f2846m;
            if (cVar == null || (str = cVar.f()) == null) {
                str = "Url is null";
            }
            T11.n0(error, str, error.f69342a == 0 ? error.getMessage() : error.a());
        }
    }

    public static final class l extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return h.this;
        }
    }

    public static final class m extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f2918b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f2918b = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f2918b.invoke();
        }
    }

    public static final class n extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f2919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f2919b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f2919b.getValue()).getViewModelStore();
        }
    }

    public static final class o extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f2920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f2920b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f2920b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public h() {
        B50.g gVar = new B50.g(this, 0);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new m(new l()));
        this.f2836c = b0.b(this, kotlin.jvm.internal.N.b(B50.i.class), new n(a11), new o(a11), gVar);
        this.f2851r = true;
        this.f2852s = new a();
        this.f2853t = new k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        int i11;
        int i12;
        TextureView textureView = this.f2839f;
        int width = textureView != null ? textureView.getWidth() : 0;
        TextureView textureView2 = this.f2839f;
        int height = textureView2 != null ? textureView2.getHeight() : 0;
        if (width == 0 || height == 0 || (i11 = this.f2849p) == 0 || (i12 = this.f2850q) == 0) {
            return;
        }
        Matrix f7 = new J30.a(new a.d(width, height), new a.d(i11, i12)).f(a.c.CENTER_CROP);
        TextureView textureView3 = this.f2839f;
        if (textureView3 != null) {
            textureView3.setOpaque(false);
        }
        TextureView textureView4 = this.f2839f;
        if (textureView4 != null) {
            textureView4.setTransform(f7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if ((r0 != null ? r0.b() : null) != null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void R() {
        LeftRightFrameLayout leftRightFrameLayout;
        LeftRightFrameLayout leftRightFrameLayout2;
        LeftRightFrameLayout leftRightFrameLayout3;
        C50.b g02 = T().g0();
        if ((g02 != null ? g02.h() : null) != null) {
            if (this.f2839f == null) {
                TextureView textureView = new TextureView(requireContext());
                textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                textureView.setId(R.id.video_view);
                this.f2839f = textureView;
                if (this.f2851r) {
                    textureView.setAlpha(0.0f);
                }
                C10660a c10660a = this.f2835b;
                if (c10660a != null && (leftRightFrameLayout3 = c10660a.f105031c) != null) {
                    leftRightFrameLayout3.addView(this.f2839f, 0);
                }
            }
            if (this.f2845l == null) {
                ExoPlayer a11 = new ExoPlayer.b(requireContext()).a();
                this.f2845l = a11;
                a11.t(this.f2852s);
                ExoPlayer exoPlayer = this.f2845l;
                if (exoPlayer != null) {
                    exoPlayer.S(0);
                }
                ExoPlayer exoPlayer2 = this.f2845l;
                if (exoPlayer2 != null) {
                    exoPlayer2.J(this.f2839f);
                }
                ExoPlayer exoPlayer3 = this.f2845l;
                if (exoPlayer3 != null) {
                    exoPlayer3.D(false);
                }
            }
        }
        if ((g02 != null ? g02.h() : null) == null) {
            if ((g02 != null ? g02.f() : null) == null) {
            }
            if (this.f2838e == null) {
                ImageView imageView = new ImageView(requireContext());
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setId(R.id.image_view);
                this.f2838e = imageView;
                if (this.f2851r) {
                    imageView.setAlpha(0.0f);
                }
                C10660a c10660a2 = this.f2835b;
                if (c10660a2 != null && (leftRightFrameLayout2 = c10660a2.f105031c) != null) {
                    leftRightFrameLayout2.addView(this.f2838e, 0);
                }
            }
            if (this.f2846m == null) {
                D50.c cVar = new D50.c(K.a(this));
                this.f2846m = cVar;
                cVar.v(Integer.valueOf(this.f2848o));
                D50.c cVar2 = this.f2846m;
                if (cVar2 != null) {
                    cVar2.s(Integer.valueOf(this.f2847n));
                }
                D50.c cVar3 = this.f2846m;
                if (cVar3 != null) {
                    cVar3.d(this.f2853t);
                }
                D50.c cVar4 = this.f2846m;
                if (cVar4 != null) {
                    cVar4.t(this.f2838e);
                }
            }
        }
        if (this.f2842i == null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ScreenStateView screenStateView = new ScreenStateView(requireContext, null, 0, 6, null);
            screenStateView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            screenStateView.setClickable(false);
            screenStateView.setFocusable(false);
            this.f2842i = screenStateView;
            C10660a c10660a3 = this.f2835b;
            if (c10660a3 != null && (leftRightFrameLayout = c10660a3.f105031c) != null) {
                leftRightFrameLayout.addView(screenStateView);
            }
        }
        if (this.f2837d == null) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            NoScrollRecycler noScrollRecycler = new NoScrollRecycler(requireContext2, null, 6, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            noScrollRecycler.setLayoutParams(layoutParams);
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            noScrollRecycler.setLayoutManager(new CenterLinearLayoutManager(requireContext3, 1, false));
            noScrollRecycler.setId(R.id.top_widgets_recycler);
            this.f2837d = noScrollRecycler;
            C10660a c10660a4 = this.f2835b;
            if (c10660a4 != null) {
                c10660a4.f105030b.addView(noScrollRecycler);
            }
        }
        if (this.f2841h == null) {
            Context requireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
            NoScrollRecycler noScrollRecycler2 = new NoScrollRecycler(requireContext4, null, 6, 0);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 16;
            noScrollRecycler2.setLayoutParams(layoutParams2);
            Context requireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
            noScrollRecycler2.setLayoutManager(new CenterLinearLayoutManager(requireContext5, 1, false));
            noScrollRecycler2.setId(R.id.center_widgets_recycler);
            this.f2841h = noScrollRecycler2;
            C10660a c10660a5 = this.f2835b;
            if (c10660a5 != null) {
                c10660a5.f105030b.addView(noScrollRecycler2);
            }
        }
        if (this.f2840g == null) {
            Context requireContext6 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
            NoScrollRecycler noScrollRecycler3 = new NoScrollRecycler(requireContext6, null, 6, 0);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 80;
            noScrollRecycler3.setLayoutParams(layoutParams3);
            Context requireContext7 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext7, "requireContext(...)");
            CenterLinearLayoutManager centerLinearLayoutManager = new CenterLinearLayoutManager(requireContext7, 1, false);
            centerLinearLayoutManager.setStackFromEnd(true);
            noScrollRecycler3.setLayoutManager(centerLinearLayoutManager);
            noScrollRecycler3.setId(R.id.bottom_widgets_recycler);
            this.f2840g = noScrollRecycler3;
            C10660a c10660a6 = this.f2835b;
            if (c10660a6 != null) {
                c10660a6.f105030b.addView(noScrollRecycler3);
            }
        }
        T().m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B50.i T() {
        return (B50.i) this.f2836c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U() {
        y yVar = this.f2845l;
        if (yVar != null) {
            ((AbstractC7265g) yVar).D(false);
        }
        y yVar2 = this.f2845l;
        if (yVar2 != null) {
            ((AbstractC7265g) yVar2).B();
        }
        D50.c cVar = this.f2846m;
        if (cVar != null) {
            cVar.l();
        }
        D50.c cVar2 = this.f2846m;
        if (cVar2 != null) {
            cVar2.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(boolean z11) {
        Q();
        if (z11) {
            y yVar = this.f2845l;
            if (yVar != null) {
                ((AbstractC7265g) yVar).D(false);
            }
            D50.c cVar = this.f2846m;
            if (cVar != null) {
                cVar.l();
                return;
            }
            return;
        }
        y yVar2 = this.f2845l;
        if (yVar2 != null) {
            ((AbstractC7265g) yVar2).D(true);
        }
        D50.c cVar2 = this.f2846m;
        if (cVar2 != null) {
            cVar2.m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r6 != null ? r6.e() : null, r3) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void W() {
        ExoPlayer exoPlayer;
        C7275q A11;
        C7275q.f fVar;
        Uri uri;
        LeftRightFrameLayout leftRightFrameLayout;
        Boolean a11;
        C50.b g02 = T().g0();
        String str = null;
        String h11 = g02 != null ? g02.h() : null;
        C50.b g03 = T().g0();
        String f7 = g03 != null ? g03.f() : null;
        C50.b g04 = T().g0();
        String b11 = g04 != null ? g04.b() : null;
        C50.b g05 = T().g0();
        Long e11 = g05 != null ? g05.e() : null;
        C50.b g06 = T().g0();
        boolean booleanValue = (g06 == null || (a11 = g06.a()) == null) ? true : a11.booleanValue();
        C10660a c10660a = this.f2835b;
        if (c10660a != null && (leftRightFrameLayout = c10660a.f105031c) != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            Integer parseColor = styleParser.parseColor(requireContext, b11);
            leftRightFrameLayout.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        }
        if (h11 == null && (f7 != null || b11 != null)) {
            D50.c cVar = this.f2846m;
            if (Intrinsics.d(cVar != null ? cVar.j() : null, f7)) {
                D50.c cVar2 = this.f2846m;
            }
            D50.c cVar3 = this.f2846m;
            if (cVar3 != null) {
                cVar3.u(f7, b11, e11, booleanValue);
            }
            D50.c cVar4 = this.f2846m;
            if (cVar4 != null) {
                cVar4.n();
            }
        }
        if (h11 != null) {
            y yVar = this.f2845l;
            if (yVar != null && (A11 = ((AbstractC7265g) yVar).A()) != null && (fVar = A11.f69184b) != null && (uri = fVar.f69240a) != null) {
                str = uri.toString();
            }
            if (Intrinsics.d(str, h11) && (exoPlayer = this.f2845l) != null && exoPlayer.P() == 3) {
                return;
            }
            int i11 = C7275q.f69182g;
            C7275q.a aVar = new C7275q.a();
            aVar.j(h11);
            C7275q a12 = aVar.a();
            Intrinsics.checkNotNullExpressionValue(a12, "fromUri(...)");
            Q();
            y yVar2 = this.f2845l;
            if (yVar2 != null) {
                ((AbstractC7265g) yVar2).g0(a12);
            }
            ExoPlayer exoPlayer2 = this.f2845l;
            if (exoPlayer2 != null) {
                exoPlayer2.prepare();
            }
        }
    }

    public static Unit t(h hVar) {
        hVar.T().i0().t(false);
        return Unit.f71690a;
    }

    public static Unit u(h hVar) {
        hVar.T().i0().t(true);
        return Unit.f71690a;
    }

    public static final void w(h hVar, String str, String str2, Long l11, boolean z11) {
        D50.c cVar = hVar.f2846m;
        if (cVar != null) {
            cVar.u(str, str2, l11, z11);
        }
        D50.c cVar2 = hVar.f2846m;
        if (cVar2 != null) {
            cVar2.n();
        }
    }

    public static final void x(h hVar, String str) {
        int i11 = C7275q.f69182g;
        C7275q.a aVar = new C7275q.a();
        aVar.j(str);
        C7275q a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "fromUri(...)");
        hVar.Q();
        y yVar = hVar.f2845l;
        if (yVar != null) {
            ((AbstractC7265g) yVar).g0(a11);
        }
        ExoPlayer exoPlayer = hVar.f2845l;
        if (exoPlayer != null) {
            exoPlayer.prepare();
        }
    }

    public final long S() {
        ExoPlayer exoPlayer = this.f2845l;
        if (exoPlayer != null) {
            return exoPlayer.getCurrentPosition();
        }
        D50.c cVar = this.f2846m;
        if (cVar != null) {
            return cVar.g();
        }
        return 0L;
    }

    public final void X(C50.a aVar) {
        if (Intrinsics.d(this.f2843j, aVar)) {
            return;
        }
        this.f2843j = aVar;
        if (!(aVar instanceof a.b)) {
            if (aVar instanceof a.AbstractC0108a.b) {
                this.f2844k = true;
                R();
                W();
                U();
                return;
            }
            if (aVar instanceof a.AbstractC0108a.C0109a) {
                this.f2844k = true;
                R();
                W();
                V(((a.AbstractC0108a.C0109a) aVar).a());
                return;
            }
            return;
        }
        this.f2844k = true;
        ExoPlayer exoPlayer = this.f2845l;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        ExoPlayer exoPlayer2 = this.f2845l;
        if (exoPlayer2 != null) {
            exoPlayer2.J(null);
        }
        ExoPlayer exoPlayer3 = this.f2845l;
        if (exoPlayer3 != null) {
            exoPlayer3.j(this.f2852s);
        }
        ExoPlayer exoPlayer4 = this.f2845l;
        if (exoPlayer4 != null) {
            exoPlayer4.release();
        }
        this.f2845l = null;
        D50.c cVar = this.f2846m;
        if (cVar != null) {
            cVar.w();
        }
        D50.c cVar2 = this.f2846m;
        if (cVar2 != null) {
            cVar2.t(null);
        }
        D50.c cVar3 = this.f2846m;
        if (cVar3 != null) {
            cVar3.p(this.f2853t);
        }
        D50.c cVar4 = this.f2846m;
        if (cVar4 != null) {
            cVar4.o();
        }
        this.f2846m = null;
    }

    @Override // E30.c
    @NotNull
    public final String getFragmentName() {
        return this.f2834a;
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
        ((y50.g) O30.a.a(O30.c.a(requireActivity)).a(y50.g.class)).O(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f2847n = arguments != null ? arguments.getInt("FRAME_POS") : 0;
        Bundle arguments2 = getArguments();
        this.f2848o = arguments2 != null ? arguments2.getInt("STORY_POS") : 0;
        T().k0(this.f2848o, this.f2847n);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C10660a b11 = C10660a.b(inflater, viewGroup);
        C10989c.a("OneFramePageFragment", "onCreateView storyPos=" + this.f2848o + " framePos=" + this.f2847n);
        this.f2835b = b11;
        LeftRightFrameLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        ExoPlayer exoPlayer = this.f2845l;
        if (exoPlayer != null) {
            exoPlayer.j(this.f2852s);
        }
        ExoPlayer exoPlayer2 = this.f2845l;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        D50.c cVar = this.f2846m;
        if (cVar != null) {
            cVar.p(this.f2853t);
        }
        D50.c cVar2 = this.f2846m;
        if (cVar2 != null) {
            cVar2.o();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        T().i0().B(this.f2848o, this.f2847n);
        super.onDestroyView();
        ExoPlayer exoPlayer = this.f2845l;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        ExoPlayer exoPlayer2 = this.f2845l;
        if (exoPlayer2 != null) {
            exoPlayer2.J(null);
        }
        this.f2845l = null;
        D50.c cVar = this.f2846m;
        if (cVar != null) {
            cVar.w();
        }
        D50.c cVar2 = this.f2846m;
        if (cVar2 != null) {
            cVar2.t(null);
        }
        this.f2846m = null;
        this.f2837d = null;
        this.f2838e = null;
        this.f2839f = null;
        this.f2840g = null;
        this.f2841h = null;
        this.f2842i = null;
        this.f2844k = false;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        C50.a i11;
        LeftRightFrameLayout leftRightFrameLayout;
        LeftRightFrameLayout leftRightFrameLayout2;
        LeftRightFrameLayout leftRightFrameLayout3;
        LeftRightFrameLayout leftRightFrameLayout4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        B50.i T11 = T();
        InterfaceC5431s parentFragment = getParentFragment();
        Intrinsics.g(parentFragment, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottomstories.intercator.StoriesInteractor.Provider");
        A50.c provideStoriesInteractor = ((c.a) parentFragment).provideStoriesInteractor();
        T11.getClass();
        Intrinsics.checkNotNullParameter(provideStoriesInteractor, "<set-?>");
        T11.f2923c = provideStoriesInteractor;
        T().l0();
        C10989c.a("OneFramePageFragment", "onViewCreated storyPos=" + this.f2848o + " framePos=" + this.f2847n);
        C10660a c10660a = this.f2835b;
        if (c10660a != null && (leftRightFrameLayout4 = c10660a.f105031c) != null) {
            leftRightFrameLayout4.c(new i(0, T().i0(), A50.c.class, "leftClick", "leftClick()V", 0));
        }
        C10660a c10660a2 = this.f2835b;
        if (c10660a2 != null && (leftRightFrameLayout3 = c10660a2.f105031c) != null) {
            leftRightFrameLayout3.f(new j(0, T().i0(), A50.c.class, "rightClick", "rightClick()V", 0));
        }
        C10660a c10660a3 = this.f2835b;
        if (c10660a3 != null && (leftRightFrameLayout2 = c10660a3.f105031c) != null) {
            leftRightFrameLayout2.d(new B50.e(this, 0));
        }
        C10660a c10660a4 = this.f2835b;
        if (c10660a4 != null && (leftRightFrameLayout = c10660a4.f105031c) != null) {
            leftRightFrameLayout.e(new B50.f(this, 0));
        }
        b bVar = new b(T().i0().o(), this);
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new c(bVar, null, this), 3);
        C0 h02 = T().h0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new d(h02, null, this), 3);
        x0<List<RecyclerItem>> j02 = T().j0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new e(j02, null, this), 3);
        x0<List<RecyclerItem>> e02 = T().e0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new f(e02, null, this), 3);
        x0<List<RecyclerItem>> f02 = T().f0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new g(f02, null, this), 3);
        x0<ScreenState> screenStateFlow = T().getScreenStateFlow();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new C0072h(screenStateFlow, null, this), 3);
        T().i0().z(this.f2848o, this.f2847n, this);
        if (this.f2844k || (i11 = T().i0().i(this.f2848o, this.f2847n)) == null) {
            return;
        }
        this.f2843j = null;
        X(i11);
    }
}
