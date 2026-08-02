package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes.dex */
public final class b extends g {
    public final long a;
    public final com.google.android.datatransport.runtime.n b;
    public final com.google.android.datatransport.runtime.i c;

    public b(long j, com.google.android.datatransport.runtime.n nVar, com.google.android.datatransport.runtime.i iVar) {
        this.a = j;
        if (nVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = nVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.c = iVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.g
    public final com.google.android.datatransport.runtime.i a() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.g
    public final long b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.g
    public final com.google.android.datatransport.runtime.n c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.b() && this.b.equals(gVar.c()) && this.c.equals(gVar.a());
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
