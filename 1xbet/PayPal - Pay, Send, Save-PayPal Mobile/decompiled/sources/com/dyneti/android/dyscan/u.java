package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class u implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double[] f3343a;

    public u(double[] dArr) {
        this.f3343a = dArr;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Double.compare(this.f3343a[((java.lang.Integer) obj).intValue()], this.f3343a[((java.lang.Integer) obj2).intValue()]) * (-1);
    }
}
