package W;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.O0;
import androidx.concurrent.futures.b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
final class h0 extends AbstractC5111p {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33066a = true;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f33067b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b.a f33068c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ O0.b f33069d;

    h0(AtomicBoolean atomicBoolean, b.a aVar, O0.b bVar) {
        this.f33067b = atomicBoolean;
        this.f33068c = aVar;
        this.f33069d = bVar;
    }

    @Override // androidx.camera.core.impl.AbstractC5111p
    public final void b(int i11, @NonNull InterfaceC5130z interfaceC5130z) {
        Object c11;
        if (this.f33066a) {
            this.f33066a = false;
            C.S.a("VideoCapture", "cameraCaptureResult timestampNs = " + interfaceC5130z.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        AtomicBoolean atomicBoolean = this.f33067b;
        if (atomicBoolean.get() || (c11 = interfaceC5130z.a().c("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int intValue = ((Integer) c11).intValue();
        b.a aVar = this.f33068c;
        if (intValue == aVar.hashCode() && aVar.c(null) && !atomicBoolean.getAndSet(true)) {
            ScheduledExecutorService e11 = H.c.e();
            final O0.b bVar = this.f33069d;
            e11.execute(new Runnable() { // from class: W.g0
                @Override // java.lang.Runnable
                public final void run() {
                    h0 h0Var = h0.this;
                    h0Var.getClass();
                    bVar.o(h0Var);
                }
            });
        }
    }
}
