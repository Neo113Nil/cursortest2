package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3628ch {

    /* renamed from: a, reason: collision with root package name */
    public final Vg f7049a;
    public final int b;
    public final String c;
    public final long d;

    public C3628ch(Vg ping, int i, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(ping, "ping");
        this.f7049a = ping;
        this.b = i;
        this.c = str;
        this.d = currentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3628ch)) {
            return false;
        }
        C3628ch c3628ch = (C3628ch) obj;
        return Intrinsics.areEqual(this.f7049a, c3628ch.f7049a) && this.b == c3628ch.b && Intrinsics.areEqual(this.c, c3628ch.c) && this.d == c3628ch.d;
    }

    public final int hashCode() {
        int a2 = Hj.a(this.b, this.f7049a.hashCode() * 31, 31);
        String str = this.c;
        return Long.hashCode(this.d) + ((a2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PingResult(ping=" + this.f7049a + ", statusCode=" + this.b + ", error=" + this.c + ", timestamp=" + this.d + ")";
    }
}
