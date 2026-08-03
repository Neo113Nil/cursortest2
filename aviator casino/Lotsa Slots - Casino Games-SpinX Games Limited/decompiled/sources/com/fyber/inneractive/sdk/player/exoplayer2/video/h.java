package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.g f4128a;
    public final boolean b;
    public final long c;
    public final long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public long k;

    public h() {
        double refreshRate = ((android.view.WindowManager) com.fyber.inneractive.sdk.config.IAConfigManager.N.u.a().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        this.b = true;
        this.f4128a = com.fyber.inneractive.sdk.player.exoplayer2.video.g.e;
        long j = (long) (1.0E9d / refreshRate);
        this.c = j;
        this.d = (j * 80) / 100;
    }
}
