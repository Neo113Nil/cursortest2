package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12263a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f12264b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final C0783b1 f12265c = new C0783b1(0);

    /* renamed from: d, reason: collision with root package name */
    public Qt f12266d;

    /* renamed from: e, reason: collision with root package name */
    public int f12267e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public long f12268g;

    public final long a(B b3, int i) {
        b3.F(this.f12263a, 0, i, false);
        long j5 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            j5 = (j5 << 8) | (r0[i5] & 255);
        }
        return j5;
    }
}
