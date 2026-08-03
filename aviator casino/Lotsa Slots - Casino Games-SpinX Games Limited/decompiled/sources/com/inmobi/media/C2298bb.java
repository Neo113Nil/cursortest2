package com.inmobi.media;

/* renamed from: com.inmobi.media.bb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2298bb {

    /* renamed from: a, reason: collision with root package name */
    public final int f5121a;
    public final java.lang.Integer b;

    public C2298bb(int i) {
        this.f5121a = i;
        this.b = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2298bb)) {
            return false;
        }
        com.inmobi.media.C2298bb c2298bb = (com.inmobi.media.C2298bb) obj;
        return this.f5121a == c2298bb.f5121a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2298bb.b);
    }

    public final int hashCode() {
        int i = this.f5121a * 31;
        java.lang.Integer num = this.b;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "OpenRequestResultData(result=" + this.f5121a + ", errorCode=" + this.b + ")";
    }

    public C2298bb(int i, java.lang.Integer num) {
        this.f5121a = i;
        this.b = num;
    }
}
