package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.compose.runtime.C0211b;

/* loaded from: classes.dex */
public final class a extends e {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public a(int i, int i2, long j, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final long b() {
        return this.e;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final int c() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final int d() {
        return this.f;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.b == eVar.e() && this.c == eVar.c() && this.d == eVar.a() && this.e == eVar.b() && this.f == eVar.d();
    }

    public final int hashCode() {
        long j = this.b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.b);
        sb.append(", loadBatchSize=");
        sb.append(this.c);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.d);
        sb.append(", eventCleanUpAge=");
        sb.append(this.e);
        sb.append(", maxBlobByteSizePerRow=");
        return C0211b.a(sb, this.f, "}");
    }
}
