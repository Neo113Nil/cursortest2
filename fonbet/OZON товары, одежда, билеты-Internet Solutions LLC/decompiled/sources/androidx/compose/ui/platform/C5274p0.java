package androidx.compose.ui.platform;

import Sc.InterfaceC4008j;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: androidx.compose.ui.platform.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5274p0 extends xe.I {

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<CoroutineContext> f40970l = Sc.k.b(a.f40983b);

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final b f40971m = new b();

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f40972n = 0;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Choreographer f40973b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f40974c;

    /* renamed from: h, reason: collision with root package name */
    private boolean f40979h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f40980i;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C5277q0 f40982k;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f40975d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C7704k<Runnable> f40976e = new C7704k<>();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private ArrayList f40977f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private ArrayList f40978g = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final c f40981j = new c();

    /* renamed from: androidx.compose.ui.platform.p0$a */
    static final class a extends AbstractC7737t implements Function0<CoroutineContext> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40983b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineContext invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                C10720e0 c10720e0 = C10720e0.f105451a;
                choreographer = (Choreographer) C10727i.d(De.s.f6650a, new C5271o0());
            }
            C5274p0 c5274p0 = new C5274p0(choreographer, androidx.core.os.h.a(Looper.getMainLooper()));
            return c5274p0.plus(c5274p0.V0());
        }
    }

    /* renamed from: androidx.compose.ui.platform.p0$b */
    public static final class b extends ThreadLocal<CoroutineContext> {
        @Override // java.lang.ThreadLocal
        public final CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            C5274p0 c5274p0 = new C5274p0(choreographer, androidx.core.os.h.a(myLooper));
            return c5274p0.plus(c5274p0.V0());
        }
    }

    /* renamed from: androidx.compose.ui.platform.p0$c */
    public static final class c implements Choreographer.FrameCallback, Runnable {
        c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j11) {
            C5274p0 c5274p0 = C5274p0.this;
            c5274p0.f40974c.removeCallbacks(this);
            C5274p0.L0(c5274p0);
            C5274p0.K0(c5274p0, j11);
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5274p0.L0(C5274p0.this);
            Object obj = C5274p0.this.f40975d;
            C5274p0 c5274p0 = C5274p0.this;
            synchronized (obj) {
                try {
                    if (((ArrayList) c5274p0.f40977f).isEmpty()) {
                        c5274p0.T0().removeFrameCallback(this);
                        c5274p0.f40980i = false;
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C5274p0(Choreographer choreographer, Handler handler) {
        this.f40973b = choreographer;
        this.f40974c = handler;
        this.f40982k = new C5277q0(choreographer, this);
    }

    public static final void K0(C5274p0 c5274p0, long j11) {
        synchronized (c5274p0.f40975d) {
            if (c5274p0.f40980i) {
                c5274p0.f40980i = false;
                ArrayList arrayList = c5274p0.f40977f;
                c5274p0.f40977f = c5274p0.f40978g;
                c5274p0.f40978g = arrayList;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((Choreographer.FrameCallback) arrayList.get(i11)).doFrame(j11);
                }
                arrayList.clear();
            }
        }
    }

    public static final void L0(C5274p0 c5274p0) {
        Runnable A11;
        boolean z11;
        do {
            synchronized (c5274p0.f40975d) {
                A11 = c5274p0.f40976e.A();
            }
            while (A11 != null) {
                A11.run();
                synchronized (c5274p0.f40975d) {
                    A11 = c5274p0.f40976e.A();
                }
            }
            synchronized (c5274p0.f40975d) {
                if (c5274p0.f40976e.isEmpty()) {
                    z11 = false;
                    c5274p0.f40979h = false;
                } else {
                    z11 = true;
                }
            }
        } while (z11);
    }

    @NotNull
    public final Choreographer T0() {
        return this.f40973b;
    }

    @NotNull
    public final C5277q0 V0() {
        return this.f40982k;
    }

    public final void W0(@NotNull Choreographer.FrameCallback frameCallback) {
        synchronized (this.f40975d) {
            try {
                this.f40977f.add(frameCallback);
                if (!this.f40980i) {
                    this.f40980i = true;
                    this.f40973b.postFrameCallback(this.f40981j);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a1(@NotNull Choreographer.FrameCallback frameCallback) {
        synchronized (this.f40975d) {
            this.f40977f.remove(frameCallback);
        }
    }

    @Override // xe.I
    public final void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        synchronized (this.f40975d) {
            try {
                this.f40976e.addLast(runnable);
                if (!this.f40979h) {
                    this.f40979h = true;
                    this.f40974c.post(this.f40981j);
                    if (!this.f40980i) {
                        this.f40980i = true;
                        this.f40973b.postFrameCallback(this.f40981j);
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
