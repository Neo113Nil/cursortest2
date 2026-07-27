package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ji, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3825ji {

    /* renamed from: a, reason: collision with root package name */
    public final String f7184a;
    public final boolean b;

    public C3825ji(String str, boolean z) {
        this.f7184a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3825ji)) {
            return false;
        }
        C3825ji c3825ji = (C3825ji) obj;
        return Intrinsics.areEqual(this.f7184a, c3825ji.f7184a) && this.b == c3825ji.b;
    }

    public final int hashCode() {
        String str = this.f7184a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PublisherAccountSnapshot(persistedAccountId=" + this.f7184a + ", accountIdResetEnabled=" + this.b + ")";
    }
}
