package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f4107a;
    public long[] b = new long[32];

    public final void a(long j) {
        int i = this.f4107a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = java.util.Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.f4107a;
        this.f4107a = i2 + 1;
        jArr2[i2] = j;
    }
}
