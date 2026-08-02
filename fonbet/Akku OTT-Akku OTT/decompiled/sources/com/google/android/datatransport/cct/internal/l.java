package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
public final class l extends v {
    public final long a;

    public l(long j) {
        this.a = j;
    }

    @Override // com.google.android.datatransport.cct.internal.v
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.a == ((v) obj).b();
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.session.f.c(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
