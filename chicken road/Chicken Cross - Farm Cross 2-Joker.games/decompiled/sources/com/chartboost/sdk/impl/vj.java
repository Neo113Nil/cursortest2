package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vj {

    /* renamed from: a, reason: collision with root package name */
    public final String f5048a;
    public final String b;
    public final String c;

    public vj(String url, String vendor, String params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f5048a = url;
        this.b = vendor;
        this.c = params;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.f5048a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        return Intrinsics.areEqual(this.f5048a, vjVar.f5048a) && Intrinsics.areEqual(this.b, vjVar.b) && Intrinsics.areEqual(this.c, vjVar.c);
    }

    public int hashCode() {
        return (((this.f5048a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "VerificationModel(url=" + this.f5048a + ", vendor=" + this.b + ", params=" + this.c + ")";
    }
}
