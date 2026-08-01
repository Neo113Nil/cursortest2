package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class N4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6734a;
    public final Config b;

    public N4(String url, Config availableConfig) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(availableConfig, "availableConfig");
        this.f6734a = url;
        this.b = availableConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N4) && Intrinsics.areEqual(this.b.getType(), ((N4) obj).b.getType());
    }

    public final int hashCode() {
        return this.b.getType().hashCode();
    }
}
