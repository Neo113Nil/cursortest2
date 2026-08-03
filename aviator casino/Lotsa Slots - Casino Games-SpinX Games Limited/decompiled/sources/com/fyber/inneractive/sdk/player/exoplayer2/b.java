package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3917a;
    public static final java.util.UUID b;

    static {
        f3917a = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a < 23 ? 1020 : 6396;
        b = new java.util.UUID(0L, 0L);
        new java.util.UUID(1186680826959645954L, -5988876978535335093L);
        new java.util.UUID(-1301668207276963122L, -6645017420763422227L);
        new java.util.UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }
}
