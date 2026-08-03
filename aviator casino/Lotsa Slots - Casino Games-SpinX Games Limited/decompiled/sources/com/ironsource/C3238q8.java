package com.ironsource;

/* renamed from: com.ironsource.q8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3238q8 {

    /* renamed from: a, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, java.lang.Object> f6571a = new java.util.HashMap<>();

    public java.util.HashMap<java.lang.String, java.lang.Object> a() {
        return this.f6571a;
    }

    public com.ironsource.C3238q8 a(java.lang.String str, java.lang.Object obj) {
        if (obj != null) {
            this.f6571a.put(str, com.ironsource.sdk.utils.SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
