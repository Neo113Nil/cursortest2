package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* loaded from: classes.dex */
public final class Pg implements RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f6422a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6423b;

    public Pg(long j3, long j4) {
        this.f6422a = j3;
        this.f6423b = j4;
    }

    public final Pg a(long j3, long j4) {
        return new Pg(j3, j4);
    }

    public final long b() {
        return this.f6423b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pg)) {
            return false;
        }
        Pg pg = (Pg) obj;
        return this.f6422a == pg.f6422a && this.f6423b == pg.f6423b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f6422a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f6423b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6423b) + (Long.hashCode(this.f6422a) * 31);
    }

    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f6422a + ", lastUpdateTime=" + this.f6423b + ')';
    }

    public final long a() {
        return this.f6422a;
    }

    public static Pg a(Pg pg, long j3, long j4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j3 = pg.f6422a;
        }
        if ((i3 & 2) != 0) {
            j4 = pg.f6423b;
        }
        pg.getClass();
        return new Pg(j3, j4);
    }
}
