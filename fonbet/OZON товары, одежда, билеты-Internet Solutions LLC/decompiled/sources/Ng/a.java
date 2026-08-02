package Ng;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f19551a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19552b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19553c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19554d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f19555e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Handler f19556f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomicReference<C0388a> f19557g;

    /* renamed from: Ng.a$a, reason: collision with other inner class name */
    private static final class C0388a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final C0388a f19558c = new C0388a(Long.MAX_VALUE, 0);

        /* renamed from: a, reason: collision with root package name */
        private final long f19559a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19560b;

        public C0388a(long j11, int i11) {
            this.f19559a = j11;
            this.f19560b = i11;
        }

        public final int b() {
            return this.f19560b;
        }

        public final long c() {
            return this.f19559a;
        }
    }

    private final class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            a aVar = a.this;
            aVar.f19557g.set(C0388a.f19558c);
            aVar.f19555e.invoke();
            return true;
        }
    }

    public a(Function0 block) {
        Looper looper = Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper()");
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f19551a = 1000L;
        this.f19552b = Long.MAX_VALUE;
        this.f19553c = 1L;
        this.f19554d = Long.MAX_VALUE;
        this.f19555e = block;
        this.f19556f = new Handler(looper, new b());
        this.f19557g = new AtomicReference<>(C0388a.f19558c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(a aVar) {
        long j11;
        long j12;
        long j13;
        C0388a c0388a;
        aVar.getClass();
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AtomicReference<C0388a> atomicReference = aVar.f19557g;
            C0388a c0388a2 = atomicReference.get();
            int b11 = c0388a2.b();
            long c11 = c0388a2.c();
            long j14 = b11;
            long j15 = aVar.f19554d;
            if (j14 > j15) {
                return;
            }
            int i11 = b11 + 1;
            if (b11 != 0) {
                if (c11 < Long.MAX_VALUE) {
                    j11 = c11;
                } else {
                    long j16 = aVar.f19552b;
                    if (j16 < Long.MAX_VALUE) {
                        j11 = j16 + elapsedRealtime;
                    }
                }
                j12 = Long.MAX_VALUE;
                j13 = i11;
                if (j13 <= j15) {
                    c11 = elapsedRealtime;
                } else if (j13 >= aVar.f19553c) {
                    c11 = Math.min(aVar.f19551a + elapsedRealtime, c11);
                }
                c0388a = new C0388a(j11, i11);
                while (!atomicReference.compareAndSet(c0388a2, c0388a)) {
                    if (atomicReference.get() != c0388a2) {
                        break;
                    }
                }
                Handler handler = aVar.f19556f;
                handler.removeMessages(0);
                if (c11 >= j12) {
                    handler.sendEmptyMessageDelayed(0, c11 - elapsedRealtime);
                    return;
                }
                return;
            }
            j11 = Long.MAX_VALUE;
            j12 = Long.MAX_VALUE;
            j13 = i11;
            if (j13 <= j15) {
            }
            c0388a = new C0388a(j11, i11);
            while (!atomicReference.compareAndSet(c0388a2, c0388a)) {
            }
            Handler handler2 = aVar.f19556f;
            handler2.removeMessages(0);
            if (c11 >= j12) {
            }
        }
    }
}
