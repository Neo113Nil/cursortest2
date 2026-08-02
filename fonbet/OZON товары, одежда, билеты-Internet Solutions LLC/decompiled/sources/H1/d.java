package H1;

import D1.AbstractC2810k0;
import De.C2862e;
import I1.r;
import S0.C3961h0;
import Sc.s;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import androidx.recyclerview.widget.LinearLayoutManager;
import hd.C6915b;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l1.C7844u;
import l1.C7845v;
import l1.x0;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.N0;

/* loaded from: classes8.dex */
public final class d implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f10458a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Z1.o f10459b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o f10460c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2862e f10461d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final l f10462e;

    public interface a {
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {190}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f10463d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Runnable f10465f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f10465f = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return d.this.new b(this.f10465f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f10463d;
            d dVar = d.this;
            if (i11 == 0) {
                s.b(obj);
                l lVar = dVar.f10462e;
                this.f10463d = 1;
                if (lVar.g(0.0f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            ((o) dVar.f10460c).c();
            this.f10465f.run();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {116}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f10466d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f10468f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Rect f10469g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Consumer<Rect> f10470h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f10468f = scrollCaptureSession;
            this.f10469g = rect;
            this.f10470h = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return d.this.new c(this.f10468f, this.f10469g, this.f10470h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f10466d;
            if (i11 == 0) {
                s.b(obj);
                ScrollCaptureSession scrollCaptureSession = this.f10468f;
                Rect rect = this.f10469g;
                Z1.o oVar = new Z1.o(rect.left, rect.top, rect.right, rect.bottom);
                this.f10466d = 1;
                obj = d.d(d.this, scrollCaptureSession, oVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            this.f10470h.accept(x0.a((Z1.o) obj));
            return Unit.f71690a;
        }
    }

    public d(@NotNull r rVar, @NotNull Z1.o oVar, @NotNull C2862e c2862e, @NotNull o oVar2) {
        this.f10458a = rVar;
        this.f10459b = oVar;
        this.f10460c = oVar2;
        this.f10461d = N.g(c2862e, j.f10486a);
        this.f10462e = new l(oVar.d(), new g(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        if (r5.f(r9, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(d dVar, ScrollCaptureSession scrollCaptureSession, Z1.o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        Wc.a aVar;
        int i11;
        int g10;
        int c11;
        d dVar2;
        ScrollCaptureSession scrollCaptureSession2;
        int i12;
        int i13;
        int c12;
        int c13;
        Surface surface;
        Surface surface2;
        Surface surface3;
        Z1.o oVar2;
        BlendMode unused;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f10478k;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f10478k = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f10476i;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f10478k;
                if (i11 != 0) {
                    s.b(obj);
                    g10 = oVar.g();
                    c11 = oVar.c();
                    l lVar = dVar.f10462e;
                    eVar.f10471d = dVar;
                    eVar.f10472e = scrollCaptureSession;
                    eVar.f10473f = oVar;
                    eVar.f10474g = g10;
                    eVar.f10475h = c11;
                    eVar.f10478k = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i13 = eVar.f10475h;
                        i12 = eVar.f10474g;
                        oVar = eVar.f10473f;
                        scrollCaptureSession2 = H1.a.a(eVar.f10472e);
                        dVar2 = eVar.f10471d;
                        s.b(obj);
                        c12 = dVar2.f10462e.c(i12);
                        c13 = dVar2.f10462e.c(i13);
                        Z1.o b11 = Z1.o.b(oVar, c12, c13);
                        if (c12 != c13) {
                            oVar2 = Z1.o.f35326e;
                            return oVar2;
                        }
                        AbstractC2810k0 d11 = dVar2.f10458a.d();
                        if (d11 == null) {
                            throw new IllegalStateException("Could not find coordinator for semantics node.");
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            unused = BlendMode.CLEAR;
                            lockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
                            int i15 = C7845v.f72284b;
                            C7844u c7844u = new C7844u();
                            c7844u.w(lockHardwareCanvas);
                            c7844u.f(-b11.e(), -b11.g());
                            d11.S1(c7844u, null);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            return b11.k(C6915b.c(dVar2.f10462e.b()));
                        } catch (Throwable th2) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th2;
                        }
                    }
                    int i16 = eVar.f10475h;
                    int i17 = eVar.f10474g;
                    oVar = eVar.f10473f;
                    ScrollCaptureSession a11 = H1.a.a(eVar.f10472e);
                    d dVar3 = eVar.f10471d;
                    s.b(obj);
                    g10 = i17;
                    scrollCaptureSession = a11;
                    c11 = i16;
                    dVar = dVar3;
                }
                eVar.f10471d = dVar;
                eVar.f10472e = scrollCaptureSession;
                eVar.f10473f = oVar;
                eVar.f10474g = g10;
                eVar.f10475h = c11;
                eVar.f10478k = 2;
                if (C3961h0.a(eVar.getContext()).v(f.f10479b, eVar) != aVar) {
                    dVar2 = dVar;
                    scrollCaptureSession2 = scrollCaptureSession;
                    i12 = g10;
                    i13 = c11;
                    c12 = dVar2.f10462e.c(i12);
                    c13 = dVar2.f10462e.c(i13);
                    Z1.o b112 = Z1.o.b(oVar, c12, c13);
                    if (c12 != c13) {
                    }
                }
                return aVar;
            }
        }
        eVar = new e(dVar, cVar);
        Object obj2 = eVar.f10476i;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f10478k;
        if (i11 != 0) {
        }
        eVar.f10471d = dVar;
        eVar.f10472e = scrollCaptureSession;
        eVar.f10473f = oVar;
        eVar.f10474g = g10;
        eVar.f10475h = c11;
        eVar.f10478k = 2;
        if (C3961h0.a(eVar.getContext()).v(f.f10479b, eVar) != aVar) {
        }
        return aVar;
    }

    public final void onScrollCaptureEnd(@NotNull Runnable runnable) {
        C10727i.c(this.f10461d, N0.f105411a, null, new b(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(@NotNull ScrollCaptureSession scrollCaptureSession, @NotNull CancellationSignal cancellationSignal, @NotNull Rect rect, @NotNull Consumer<Rect> consumer) {
        final B0 c11 = C10727i.c(this.f10461d, null, null, new c(scrollCaptureSession, rect, consumer, null), 3);
        ((H0) c11).y(new i(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: H1.h
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                ((H0) B0.this).j(null);
            }
        });
    }

    public final void onScrollCaptureSearch(@NotNull CancellationSignal cancellationSignal, @NotNull Consumer<Rect> consumer) {
        consumer.accept(x0.a(this.f10459b));
    }

    public final void onScrollCaptureStart(@NotNull ScrollCaptureSession scrollCaptureSession, @NotNull CancellationSignal cancellationSignal, @NotNull Runnable runnable) {
        this.f10462e.d();
        this.f10460c.d();
        runnable.run();
    }
}
