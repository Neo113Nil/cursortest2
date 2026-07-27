package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.vn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4170vn {

    /* renamed from: a, reason: collision with root package name */
    public final int f7443a;
    public final Config b;

    public C4170vn(int i, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f7443a = i;
        this.b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4170vn)) {
            return false;
        }
        C4170vn c4170vn = (C4170vn) obj;
        return this.f7443a == c4170vn.f7443a && Intrinsics.areEqual(this.b, c4170vn.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f7443a) * 31);
    }

    public final String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.f7443a + ", config=" + this.b + ")";
    }
}
