package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Lk {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4823a;
    public final java.util.Map b;

    public Lk(java.lang.String str, java.util.Map map) {
        this.f4823a = str;
        this.b = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Lk)) {
            return false;
        }
        com.inmobi.media.Lk lk = (com.inmobi.media.Lk) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f4823a, lk.f4823a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, lk.b);
    }

    public final int hashCode() {
        java.lang.String str = this.f4823a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.Map map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TokenMetaData(keywords=" + this.f4823a + ", extras=" + this.b + ")";
    }
}
