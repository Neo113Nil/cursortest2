package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class Ik {

    /* renamed from: a, reason: collision with root package name */
    public final C0459e5 f6115a;

    /* renamed from: b, reason: collision with root package name */
    public final Zk f6116b;

    /* renamed from: c, reason: collision with root package name */
    public final Lk f6117c;

    /* renamed from: d, reason: collision with root package name */
    public long f6118d;

    /* renamed from: e, reason: collision with root package name */
    public long f6119e;
    public AtomicLong f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6120g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Xk f6121h;

    /* renamed from: i, reason: collision with root package name */
    public long f6122i;

    /* renamed from: j, reason: collision with root package name */
    public long f6123j;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f6124k;

    public Ik(C0459e5 c0459e5, Zk zk, Lk lk, SystemTimeProvider systemTimeProvider) {
        this.f6115a = c0459e5;
        this.f6116b = zk;
        this.f6117c = lk;
        this.f6124k = systemTimeProvider;
        a();
    }

    public final void a() {
        Lk lk = this.f6117c;
        long elapsedRealtime = this.f6124k.elapsedRealtime();
        Long l3 = lk.f6244c;
        if (l3 != null) {
            elapsedRealtime = l3.longValue();
        }
        this.f6119e = elapsedRealtime;
        Long l4 = this.f6117c.f6243b;
        this.f6118d = l4 == null ? -1L : l4.longValue();
        Long l5 = this.f6117c.f6246e;
        this.f = new AtomicLong(l5 == null ? 0L : l5.longValue());
        Boolean bool = this.f6117c.f;
        this.f6120g = bool == null ? true : bool.booleanValue();
        Long l6 = this.f6117c.f6247g;
        long longValue = l6 != null ? l6.longValue() : 0L;
        this.f6122i = longValue;
        Lk lk2 = this.f6117c;
        long j3 = longValue - this.f6119e;
        Long l7 = lk2.f6248h;
        if (l7 != null) {
            j3 = l7.longValue();
        }
        this.f6123j = j3;
    }

    public final String toString() {
        return "Session{id=" + this.f6118d + ", creationTime=" + this.f6119e + ", currentReportId=" + this.f + ", sessionRequestParams=" + this.f6121h + ", sleepStart=" + this.f6122i + '}';
    }
}
