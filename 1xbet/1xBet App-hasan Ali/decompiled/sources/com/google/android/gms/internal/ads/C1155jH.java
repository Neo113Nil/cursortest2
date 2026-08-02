package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155jH {

    /* renamed from: a, reason: collision with root package name */
    public final C1292mb f14097a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f14098b;

    public C1155jH(C1292mb c1292mb, int[] iArr) {
        if (iArr.length == 0) {
            JB.g("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f14097a = c1292mb;
        this.f14098b = iArr;
    }
}
