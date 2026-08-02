package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.r;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.InterfaceC1053e0;
import kotlinx.coroutines.K0;
import kotlinx.coroutines.W0;
import kotlinx.coroutines.internal.p;

@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,212:1\n13#2:213\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n140#1:213\n*E\n"})
/* loaded from: classes5.dex */
public final class e extends f {
    public final Handler a;
    public final boolean b;
    public final e c;

    public e(Handler handler, boolean z) {
        this.a = handler;
        this.b = z;
        this.c = z ? this : new e(handler, true);
    }

    @Override // kotlinx.coroutines.U
    public final void H(long j, C1100n c1100n) {
        d dVar = new d(c1100n, this);
        if (this.a.postDelayed(dVar, RangesKt.coerceAtMost(j, 4611686018427387903L))) {
            c1100n.t(new androidx.compose.runtime.snapshots.tooling.a(1, this, dVar));
        } else {
            X(c1100n.e, dVar);
        }
    }

    @Override // kotlinx.coroutines.android.f
    public final f W() {
        return this.c;
    }

    public final void X(CoroutineContext coroutineContext, Runnable runnable) {
        r.b(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
        kotlinx.coroutines.scheduling.b.a.dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.android.f, kotlinx.coroutines.U
    public final InterfaceC1053e0 d(long j, final W0 w0, CoroutineContext coroutineContext) {
        if (this.a.postDelayed(w0, RangesKt.coerceAtMost(j, 4611686018427387903L))) {
            return new InterfaceC1053e0() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.InterfaceC1053e0
                public final void dispose() {
                    e.this.a.removeCallbacks(w0);
                }
            };
        }
        X(coroutineContext, w0);
        return K0.a;
    }

    @Override // kotlinx.coroutines.I
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        X(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.a == this.a && eVar.b == this.b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) ^ (this.b ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.I
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return (this.b && Intrinsics.areEqual(Looper.myLooper(), this.a.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.android.f, kotlinx.coroutines.I
    public final String toString() {
        f fVar;
        String str;
        kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
        f fVar2 = p.a;
        if (this == fVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                fVar = fVar2.W();
            } catch (UnsupportedOperationException unused) {
                fVar = null;
            }
            str = this == fVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.a.toString();
        return this.b ? androidx.compose.runtime.changelist.d.b(handler, ".immediate") : handler;
    }
}
