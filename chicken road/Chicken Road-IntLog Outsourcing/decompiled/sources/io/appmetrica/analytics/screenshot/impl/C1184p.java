package io.appmetrica.analytics.screenshot.impl;

import b2.AbstractC0279e;
import g4.AbstractC0464i;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10048a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10049b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10050c;

    public C1184p(boolean z, List list, long j2) {
        this.f10048a = z;
        this.f10049b = list;
        this.f10050c = j2;
    }

    public final long a() {
        return this.f10050c;
    }

    public final boolean b() {
        return this.f10048a;
    }

    public final List c() {
        return this.f10049b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentObserverCaptorConfig(enabled=");
        sb.append(this.f10048a);
        sb.append(", mediaStoreColumnNames='");
        sb.append(this.f10049b);
        sb.append("', detectWindowSeconds=");
        return AbstractC0279e.g(sb, this.f10050c, ')');
    }

    public C1184p() {
        this(new O().f9978a, AbstractC0464i.a0(new O().f9980c), new O().f9979b);
    }
}
