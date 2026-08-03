package com.inmobi.media;

/* renamed from: com.inmobi.media.u4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2794u4 extends com.inmobi.media.AbstractC2767t4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5479a;
    public final com.inmobi.media.core.config.models.Config b;

    public C2794u4(int i, com.inmobi.media.core.config.models.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f5479a = i;
        this.b = config;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2794u4)) {
            return false;
        }
        com.inmobi.media.C2794u4 c2794u4 = (com.inmobi.media.C2794u4) obj;
        return this.f5479a == c2794u4.f5479a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2794u4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5479a * 31);
    }

    public final java.lang.String toString() {
        return "ConfigSuccess(statusCode=" + this.f5479a + ", config=" + this.b + ")";
    }
}
