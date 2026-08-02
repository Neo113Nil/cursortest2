package com.plaid.internal;

/* loaded from: classes16.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5765a;
    public final java.lang.Exception b;
    public final java.lang.String c;

    public D0(java.lang.String str, java.lang.Exception exc, java.lang.String str2) {
        this.f5765a = str;
        this.b = exc;
        this.c = str2;
    }

    public final java.lang.String a() {
        return this.f5765a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceDescriptor{ip='");
        sb.append(this.f5765a);
        sb.append("', mno='null', phoneNumber='null', preCheckError=");
        sb.append(this.b);
        sb.append(", desc='");
        sb.append(this.c);
        sb.append("'}");
        return sb.toString();
    }
}
