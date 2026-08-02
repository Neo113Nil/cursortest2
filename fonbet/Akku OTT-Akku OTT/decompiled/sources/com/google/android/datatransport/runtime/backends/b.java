package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.g;

/* loaded from: classes.dex */
public final class b extends g {
    public final g.a a;
    public final long b;

    public b(g.a aVar, long j) {
        this.a = aVar;
        this.b = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public final long a() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public final g.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.b()) && this.b == gVar.a();
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.a);
        sb.append(", nextRequestWaitMillis=");
        return android.support.v4.media.session.f.c(sb, this.b, "}");
    }
}
