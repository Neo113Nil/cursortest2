package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089hv {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13814a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13815b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13816c;

    public C1089hv(Object obj, Object obj2, Object obj3) {
        this.f13814a = obj;
        this.f13815b = obj2;
        this.f13816c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f13814a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj) + "=" + String.valueOf(this.f13815b) + " and " + String.valueOf(obj) + "=" + String.valueOf(this.f13816c));
    }
}
