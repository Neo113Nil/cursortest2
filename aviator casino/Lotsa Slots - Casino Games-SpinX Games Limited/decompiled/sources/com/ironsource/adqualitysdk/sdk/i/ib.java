package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ib {

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.util.List<java.util.List<java.lang.reflect.Field>> f2480;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int f2481;

    public ib() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f2480 = arrayList;
        int i = (-1) + 1;
        this.f2481 = i;
        arrayList.add(i, new java.util.ArrayList());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    final void m7918(java.lang.reflect.Field field) {
        this.f2480.get(this.f2481).add(field);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m7916(java.lang.reflect.Field field) {
        this.f2480.get(this.f2481).remove(field);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m7915() {
        int i = this.f2481 + 1;
        this.f2481 = i;
        this.f2480.add(i, new java.util.ArrayList());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    final void m7919() {
        this.f2480.remove(this.f2481);
        this.f2481--;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    final java.util.List<java.util.List<java.lang.reflect.Field>> m7917() {
        return this.f2480;
    }
}
