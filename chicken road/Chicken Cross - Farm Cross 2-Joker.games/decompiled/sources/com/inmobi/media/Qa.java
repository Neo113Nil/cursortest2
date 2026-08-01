package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Qa {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6799a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;

    public Qa(boolean z, String telemetryUrl, int i, long j, long j2) {
        Intrinsics.checkNotNullParameter(telemetryUrl, "telemetryUrl");
        this.f6799a = z;
        this.b = telemetryUrl;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qa)) {
            return false;
        }
        Qa qa = (Qa) obj;
        return this.f6799a == qa.f6799a && Intrinsics.areEqual(this.b, qa.b) && this.c == qa.c && this.d == qa.d && this.e == qa.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((Long.hashCode(this.d) + Hj.a(this.c, (this.b.hashCode() + (Boolean.hashCode(this.f6799a) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "InitTelemetryConfigSnapshot(enabled=" + this.f6799a + ", telemetryUrl=" + this.b + ", maxRetries=" + this.c + ", retryInterval=" + this.d + ", timeout=" + this.e + ")";
    }
}
