package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.kF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198kF {

    /* renamed from: a, reason: collision with root package name */
    public final C1276m3 f14233a;

    /* renamed from: b, reason: collision with root package name */
    public int f14234b;

    /* renamed from: c, reason: collision with root package name */
    public long f14235c;

    /* renamed from: d, reason: collision with root package name */
    public long f14236d;

    /* renamed from: e, reason: collision with root package name */
    public long f14237e;
    public long f;

    public C1198kF(AudioTrack audioTrack) {
        this.f14233a = new C1276m3(audioTrack);
        a(0);
    }

    public final void a(int i) {
        this.f14234b = i;
        long j5 = 10000;
        if (i == 0) {
            this.f14237e = 0L;
            this.f = -1L;
            this.f14235c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f14236d = 10000L;
                return;
            }
            j5 = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f14236d = j5;
    }
}
