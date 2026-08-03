package com.inmobi.media;

/* renamed from: com.inmobi.media.q4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2687q4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5405a;
    public final com.inmobi.media.core.config.models.Config b;

    public C2687q4(java.lang.String url, com.inmobi.media.core.config.models.Config availableConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableConfig, "availableConfig");
        this.f5405a = url;
        this.b = availableConfig;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.C2687q4) && kotlin.jvm.internal.Intrinsics.areEqual(this.b.getType(), ((com.inmobi.media.C2687q4) obj).b.getType());
    }

    public final int hashCode() {
        return this.b.getType().hashCode();
    }
}
