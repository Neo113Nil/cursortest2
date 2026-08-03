package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Al {

    /* renamed from: a, reason: collision with root package name */
    public final int f4607a;
    public final com.inmobi.media.core.config.models.Config b;

    public Al(int i, com.inmobi.media.core.config.models.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f4607a = i;
        this.b = config;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Al)) {
            return false;
        }
        com.inmobi.media.Al al = (com.inmobi.media.Al) obj;
        return this.f4607a == al.f4607a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, al.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4607a * 31);
    }

    public final java.lang.String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.f4607a + ", config=" + this.b + ")";
    }
}
