package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Jf {

    /* renamed from: a, reason: collision with root package name */
    public final long f6651a;
    public final Map b;
    public final int c;
    public final String d;

    public Jf(long j, Map headers, int i, String str) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f6651a = j;
        this.b = headers;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jf)) {
            return false;
        }
        Jf jf = (Jf) obj;
        return this.f6651a == jf.f6651a && Intrinsics.areEqual(this.b, jf.b) && this.c == jf.c && Intrinsics.areEqual(this.d, jf.d);
    }

    public final int hashCode() {
        int a2 = Hj.a(this.c, (this.b.hashCode() + (Long.hashCode(this.f6651a) * 31)) * 31, 31);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NetworkMetaData(timeTaken=" + this.f6651a + ", headers=" + this.b + ", contentLength=" + this.c + ", contentType=" + this.d + ")";
    }
}
