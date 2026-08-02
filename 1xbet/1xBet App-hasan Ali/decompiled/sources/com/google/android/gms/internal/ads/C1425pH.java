package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.pH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1425pH {

    /* renamed from: a, reason: collision with root package name */
    public int f14988a;

    /* renamed from: b, reason: collision with root package name */
    public int f14989b;

    /* renamed from: c, reason: collision with root package name */
    public int f14990c = 0;

    /* renamed from: d, reason: collision with root package name */
    public C1290mH[] f14991d = new C1290mH[100];

    public final synchronized void a(int i) {
        int i5 = this.f14988a;
        this.f14988a = i;
        if (i < i5) {
            b();
        }
    }

    public final synchronized void b() {
        int i = this.f14988a;
        int i5 = AbstractC1260lo.f14419a;
        int max = Math.max(0, ((i + 65535) / 65536) - this.f14989b);
        int i6 = this.f14990c;
        if (max >= i6) {
            return;
        }
        Arrays.fill(this.f14991d, max, i6, (Object) null);
        this.f14990c = max;
    }
}
