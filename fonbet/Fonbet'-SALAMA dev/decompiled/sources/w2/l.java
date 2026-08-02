package w2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import v2.AbstractC1664a;
import v2.t;

/* loaded from: classes.dex */
public final class l implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final l f18019e = new l();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f18020a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f18021b;

    /* renamed from: c, reason: collision with root package name */
    public Choreographer f18022c;

    /* renamed from: d, reason: collision with root package name */
    public int f18023d;

    public l() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i7 = t.f17153a;
        Handler handler = new Handler(looper, this);
        this.f18021b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f18020a = j;
        Choreographer choreographer = this.f18022c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            try {
                this.f18022c = Choreographer.getInstance();
            } catch (RuntimeException e7) {
                AbstractC1664a.G(e7, "VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error");
            }
            return true;
        }
        if (i7 == 1) {
            Choreographer choreographer = this.f18022c;
            if (choreographer != null) {
                int i8 = this.f18023d + 1;
                this.f18023d = i8;
                if (i8 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f18022c;
        if (choreographer2 != null) {
            int i9 = this.f18023d - 1;
            this.f18023d = i9;
            if (i9 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f18020a = -9223372036854775807L;
            }
        }
        return true;
    }
}
