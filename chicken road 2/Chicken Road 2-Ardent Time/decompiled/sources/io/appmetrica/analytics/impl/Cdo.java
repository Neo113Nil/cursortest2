package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f5756c = {0, 1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f5757a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f5758b = 0;

    public Cdo(int[] iArr) {
        for (int i2 : iArr) {
            this.f5757a.put(i2, new java.util.HashMap());
        }
    }
}
