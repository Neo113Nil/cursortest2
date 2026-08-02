package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC1094i implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final ChoreographerFrameCallbackC1094i f13841o = new ChoreographerFrameCallbackC1094i();

    /* renamed from: k, reason: collision with root package name */
    public volatile long f13842k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f13843l;

    /* renamed from: m, reason: collision with root package name */
    public Choreographer f13844m;

    /* renamed from: n, reason: collision with root package name */
    public int f13845n;

    public ChoreographerFrameCallbackC1094i() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f13843l = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        this.f13842k = j5;
        Choreographer choreographer = this.f13844m;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f13844m = Choreographer.getInstance();
            } catch (RuntimeException e3) {
                JB.n("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e3);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.f13844m;
            if (choreographer != null) {
                int i5 = this.f13845n + 1;
                this.f13845n = i5;
                if (i5 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f13844m;
        if (choreographer2 != null) {
            int i6 = this.f13845n - 1;
            this.f13845n = i6;
            if (i6 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f13842k = -9223372036854775807L;
            }
        }
        return true;
    }
}
