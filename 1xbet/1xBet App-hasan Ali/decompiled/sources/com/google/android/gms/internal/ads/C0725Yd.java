package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725Yd {

    /* renamed from: b, reason: collision with root package name */
    public long f12347b;

    /* renamed from: a, reason: collision with root package name */
    public final long f12346a = TimeUnit.MILLISECONDS.toNanos(((Long) Q2.r.f5053d.f5056c.a(F7.f8694H)).longValue());

    /* renamed from: c, reason: collision with root package name */
    public boolean f12348c = true;

    public final void a(SurfaceTexture surfaceTexture, C0711Wd c0711Wd) {
        if (c0711Wd == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f12348c) {
            long j5 = timestamp - this.f12347b;
            if (Math.abs(j5) < this.f12346a) {
                return;
            }
        }
        this.f12348c = false;
        this.f12347b = timestamp;
        T2.L.f5672l.post(new RunnableC0697Ud(c0711Wd, 3));
    }
}
