package com.google.android.gms.internal.ads;

import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.ks, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1219ks {

    /* renamed from: a, reason: collision with root package name */
    public final long f14297a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14298b;

    /* renamed from: e, reason: collision with root package name */
    public long f14301e;

    /* renamed from: d, reason: collision with root package name */
    public long f14300d = 5;
    public final Random f = new Random();

    /* renamed from: c, reason: collision with root package name */
    public long f14299c = 0;

    public C1219ks(long j5, long j6) {
        this.f14297a = j5;
        this.f14298b = j6;
        this.f14301e = j5;
    }

    public final synchronized void a(int i) {
        m3.v.a(i > 0);
        this.f14300d = i;
    }
}
