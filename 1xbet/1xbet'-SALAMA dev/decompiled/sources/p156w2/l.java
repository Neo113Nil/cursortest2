package p156w2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import p151v2.a;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f18025e = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f18026a = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f18027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Choreographer f18028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18029d;

    public l() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i7 = t.f17159a;
        Handler handler = new Handler(looper, this);
        this.f18027b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f18026a = j;
        Choreographer choreographer = this.f18028c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            try {
                this.f18028c = Choreographer.getInstance();
            } catch (RuntimeException e7) {
                a.G(e7, "VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error");
            }
            return true;
        }
        if (i7 == 1) {
            Choreographer choreographer = this.f18028c;
            if (choreographer != null) {
                int i8 = this.f18029d + 1;
                this.f18029d = i8;
                if (i8 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f18028c;
        if (choreographer2 != null) {
            int i9 = this.f18029d - 1;
            this.f18029d = i9;
            if (i9 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f18026a = -9223372036854775807L;
            }
        }
        return true;
    }
}
