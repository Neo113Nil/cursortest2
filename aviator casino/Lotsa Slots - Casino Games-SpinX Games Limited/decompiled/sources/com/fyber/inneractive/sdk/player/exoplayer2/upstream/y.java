package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class y extends android.os.Handler implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.z f4101a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.x b;
    public final int c;
    public final long d;
    public java.io.IOException e;
    public int f;
    public volatile java.lang.Thread g;
    public volatile boolean h;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var, android.os.Looper looper, com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.x xVar, int i, long j) {
        super(looper);
        this.i = b0Var;
        this.f4101a = zVar;
        this.b = xVar;
        this.c = i;
        this.d = j;
    }

    public final void a(boolean z) {
        this.h = z;
        this.e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f4101a.b();
            if (this.g != null) {
                this.g.interrupt();
            }
        }
        if (z) {
            this.i.b = null;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.b.a(this.f4101a, elapsedRealtime, elapsedRealtime - this.d, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (this.h) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.e = null;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = this.i;
            b0Var.f4074a.execute(b0Var.b);
            return;
        }
        if (i == 4) {
            throw ((java.lang.Error) message.obj);
        }
        this.i.b = null;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.d;
        if (this.f4101a.a()) {
            this.b.a(this.f4101a, elapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            this.b.a(this.f4101a, elapsedRealtime, j, false);
            return;
        }
        if (i2 == 2) {
            this.b.a(this.f4101a, elapsedRealtime, j);
            return;
        }
        if (i2 != 3) {
            return;
        }
        java.io.IOException iOException = (java.io.IOException) message.obj;
        this.e = iOException;
        int a2 = this.b.a(this.f4101a, elapsedRealtime, j, iOException);
        if (a2 == 3) {
            this.i.c = this.e;
            return;
        }
        if (a2 != 2) {
            int i3 = a2 == 1 ? 1 : this.f + 1;
            this.f = i3;
            long min = java.lang.Math.min((i3 - 1) * 1000, 5000);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var2 = this.i;
            if (b0Var2.b != null) {
                throw new java.lang.IllegalStateException();
            }
            b0Var2.b = this;
            if (min > 0) {
                sendEmptyMessageDelayed(0, min);
            } else {
                this.e = null;
                b0Var2.f4074a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.g = java.lang.Thread.currentThread();
            if (!this.f4101a.a()) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("load:".concat(this.f4101a.getClass().getSimpleName()));
                try {
                    this.f4101a.load();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                } catch (java.lang.Throwable th) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                    throw th;
                }
            }
            if (this.h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (java.io.IOException e) {
            if (this.h) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (java.lang.Error e2) {
            android.util.Log.e("LoadTask", "Unexpected error loading stream", e2);
            if (!this.h) {
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (java.lang.InterruptedException unused) {
            if (!this.f4101a.a()) {
                throw new java.lang.IllegalStateException();
            }
            if (this.h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (java.lang.Exception e3) {
            android.util.Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (this.h) {
                return;
            }
            obtainMessage(3, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a0(e3)).sendToTarget();
        } catch (java.lang.OutOfMemoryError e4) {
            android.util.Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (this.h) {
                return;
            }
            obtainMessage(3, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a0(e4)).sendToTarget();
        }
    }
}
