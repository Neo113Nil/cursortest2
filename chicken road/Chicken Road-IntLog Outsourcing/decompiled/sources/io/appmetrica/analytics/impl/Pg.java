package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* loaded from: classes.dex */
public final class Pg implements RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f7279a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7280b;

    public Pg(long j2, long j6) {
        this.f7279a = j2;
        this.f7280b = j6;
    }

    public final Pg a(long j2, long j6) {
        return new Pg(j2, j6);
    }

    public final long b() {
        return this.f7280b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pg)) {
            return false;
        }
        Pg pg = (Pg) obj;
        return this.f7279a == pg.f7279a && this.f7280b == pg.f7280b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f7279a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f7280b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7280b) + (Long.hashCode(this.f7279a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfigMetaInfoModel(firstSendTime=");
        sb.append(this.f7279a);
        sb.append(", lastUpdateTime=");
        return AbstractC0279e.g(sb, this.f7280b, ')');
    }

    public final long a() {
        return this.f7279a;
    }

    public static Pg a(Pg pg, long j2, long j6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = pg.f7279a;
        }
        if ((i2 & 2) != 0) {
            j6 = pg.f7280b;
        }
        pg.getClass();
        return new Pg(j2, j6);
    }
}
