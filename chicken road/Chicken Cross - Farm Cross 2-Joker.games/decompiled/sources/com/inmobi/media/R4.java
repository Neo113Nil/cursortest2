package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class R4 extends Q4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6818a;
    public final Config b;

    public R4(int i, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f6818a = i;
        this.b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R4)) {
            return false;
        }
        R4 r4 = (R4) obj;
        return this.f6818a == r4.f6818a && Intrinsics.areEqual(this.b, r4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f6818a) * 31);
    }

    public final String toString() {
        return "ConfigSuccess(statusCode=" + this.f6818a + ", config=" + this.b + ")";
    }
}
