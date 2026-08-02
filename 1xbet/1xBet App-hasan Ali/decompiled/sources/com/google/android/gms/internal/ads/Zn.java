package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Zn {

    /* renamed from: a, reason: collision with root package name */
    public final String f12520a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12521b;

    /* renamed from: c, reason: collision with root package name */
    public int f12522c;

    /* renamed from: d, reason: collision with root package name */
    public long f12523d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f12524e;

    public Zn(String str, String str2, int i, long j5, Integer num) {
        this.f12520a = str;
        this.f12521b = str2;
        this.f12522c = i;
        this.f12523d = j5;
        this.f12524e = num;
    }

    public final String toString() {
        Integer num;
        String str = this.f12520a + "." + this.f12522c + "." + this.f12523d;
        String str2 = this.f12521b;
        if (!TextUtils.isEmpty(str2)) {
            str = AbstractC0467k.v(str, ".", str2);
        }
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8661B1)).booleanValue() || (num = this.f12524e) == null || TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + "." + num;
    }
}
