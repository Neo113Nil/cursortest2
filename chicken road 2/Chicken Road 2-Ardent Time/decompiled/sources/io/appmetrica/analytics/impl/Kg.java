package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kg implements io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f4546a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4547b;

    public Kg(long j2, long j3) {
        this.f4546a = j2;
        this.f4547b = j3;
    }

    public final io.appmetrica.analytics.impl.Kg a(long j2, long j3) {
        return new io.appmetrica.analytics.impl.Kg(j2, j3);
    }

    public final long b() {
        return this.f4547b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.Kg)) {
            return false;
        }
        io.appmetrica.analytics.impl.Kg kg = (io.appmetrica.analytics.impl.Kg) obj;
        return this.f4546a == kg.f4546a && this.f4547b == kg.f4547b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f4546a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f4547b;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f4547b) + (java.lang.Long.hashCode(this.f4546a) * 31);
    }

    public final java.lang.String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f4546a + ", lastUpdateTime=" + this.f4547b + ')';
    }

    public final long a() {
        return this.f4546a;
    }

    public static io.appmetrica.analytics.impl.Kg a(io.appmetrica.analytics.impl.Kg kg, long j2, long j3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j2 = kg.f4546a;
        }
        if ((i2 & 2) != 0) {
            j3 = kg.f4547b;
        }
        kg.getClass();
        return new io.appmetrica.analytics.impl.Kg(j2, j3);
    }
}
