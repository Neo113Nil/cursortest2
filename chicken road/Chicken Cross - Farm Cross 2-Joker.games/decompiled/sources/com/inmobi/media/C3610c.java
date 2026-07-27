package com.inmobi.media;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* renamed from: com.inmobi.media.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3610c extends U5 {
    public final long b;
    public final Function0 c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final Handler f;
    public CoroutineScope g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3610c(long j, final V5 listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b = j;
        this.c = new Function0() { // from class: com.inmobi.media.c$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3610c.a(C3610c.this, listener);
            }
        };
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new Handler(Looper.getMainLooper());
    }

    public static final Unit a(C3610c c3610c, T5 t5) {
        if (c3610c.d.get()) {
            if (c3610c.f.hasMessages(2023)) {
                c3610c.f.removeMessages(2023);
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && c3610c.e.get()) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    Intrinsics.checkNotNull(stackTrace);
                    ((V5) t5).a(new C3892lq(stackTrace));
                }
            }
            c3610c.e.getAndSet(true);
            c3610c.f.sendEmptyMessage(2023);
        }
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.U5
    public final void b() {
        if (this.d.getAndSet(false)) {
            this.d.set(false);
            this.e.set(false);
            AbstractC3727g4.a(this.g);
        }
    }

    @Override // com.inmobi.media.U5
    public final void a() {
        if (this.d.getAndSet(true)) {
            return;
        }
        Intrinsics.checkNotNullParameter("ANRWatchDog", "name");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3932na("ANRWatchDog", false));
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(newSingleThreadExecutor));
        this.g = CoroutineScope;
        if (CoroutineScope != null) {
            AbstractC3727g4.a(CoroutineScope, 0L, this.b, new C3581b(this.c));
        }
    }
}
