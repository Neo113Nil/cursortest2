package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1748wi implements Ei {

    /* renamed from: k, reason: collision with root package name */
    public final String f16140k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16141l;

    public /* synthetic */ C1748wi(String str, String str2) {
        this.f16140k = str;
        this.f16141l = str2;
    }

    public static C1748wi a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new C1748wi(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        ((K2.d) obj).w(this.f16140k, this.f16141l);
    }
}
