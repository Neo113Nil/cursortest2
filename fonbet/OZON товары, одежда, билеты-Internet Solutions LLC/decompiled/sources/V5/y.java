package V5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    private boolean f28318a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f28319b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).a();
            return true;
        }
    }

    y() {
    }

    final synchronized void a(v<?> vVar, boolean z11) {
        try {
            if (!this.f28318a && !z11) {
                this.f28318a = true;
                vVar.a();
                this.f28318a = false;
            }
            this.f28319b.obtainMessage(1, vVar).sendToTarget();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
