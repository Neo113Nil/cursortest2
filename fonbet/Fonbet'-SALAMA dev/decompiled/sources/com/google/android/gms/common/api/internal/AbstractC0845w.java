package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0845w {

    /* renamed from: a, reason: collision with root package name */
    public final Feature[] f11198a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11199b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11200c;

    public AbstractC0845w(Feature[] featureArr, boolean z4, int i7) {
        this.f11198a = featureArr;
        boolean z7 = false;
        if (featureArr != null && z4) {
            z7 = true;
        }
        this.f11199b = z7;
        this.f11200c = i7;
    }

    public static C0844v a() {
        C0844v c0844v = new C0844v();
        c0844v.f11195b = true;
        c0844v.f11194a = 0;
        return c0844v;
    }
}
