package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C4 extends Q4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6488a;
    public final int b;
    public final long c;

    public C4(int i, long j, String configType) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        this.f6488a = configType;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4)) {
            return false;
        }
        C4 c4 = (C4) obj;
        return Intrinsics.areEqual(this.f6488a, c4.f6488a) && this.b == c4.b && this.c == c4.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + Hj.a(this.b, this.f6488a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConfigFailure(configType=" + this.f6488a + ", errorCode=" + this.b + ", lastUpdatedTimestamp=" + this.c + ")";
    }
}
