package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4294a;
    public int b;

    public h1(int i, int i2) {
        this.f4294a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.util.h1.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.util.h1 h1Var = (com.fyber.inneractive.sdk.util.h1) obj;
        return this.f4294a == h1Var.f4294a && this.b == h1Var.b;
    }

    public final int hashCode() {
        return (this.f4294a * 31) + this.b;
    }
}
