package com.fyber.inneractive.sdk.util;

/* loaded from: classes4.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5951a;
    public int b;

    public h1(int i, int i2) {
        this.f5951a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h1.class != obj.getClass()) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f5951a == h1Var.f5951a && this.b == h1Var.b;
    }

    public final int hashCode() {
        return (this.f5951a * 31) + this.b;
    }
}
