package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2613a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2614b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2615c;

    public D(Object obj, Object obj2, Object obj3) {
        this.f2613a = obj;
        this.f2614b = obj2;
        this.f2615c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f2613a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj) + "=" + String.valueOf(this.f2614b) + " and " + String.valueOf(obj) + "=" + String.valueOf(this.f2615c));
    }
}
