package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0801w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Feature[] f11198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11200c;

    public AbstractC0801w(Feature[] featureArr, boolean z4, int i7) {
        this.f11198a = featureArr;
        boolean z7 = false;
        if (featureArr != null && z4) {
            z7 = true;
        }
        this.f11199b = z7;
        this.f11200c = i7;
    }

    public static C0800v a() {
        C0800v c0800v = new C0800v();
        c0800v.f11195b = true;
        c0800v.f11194a = 0;
        return c0800v;
    }
}
