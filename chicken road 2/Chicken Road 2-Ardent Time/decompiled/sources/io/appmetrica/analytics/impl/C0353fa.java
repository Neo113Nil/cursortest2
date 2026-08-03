package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353fa implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.AbstractC0538me f5884a;

    public C0353fa() {
        this(new io.appmetrica.analytics.impl.Sl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0675rm fromModel(io.appmetrica.analytics.impl.C0502l4 c0502l4) {
        io.appmetrica.analytics.impl.C0675rm c0675rm = new io.appmetrica.analytics.impl.C0675rm();
        c0675rm.f6758b = c0502l4.f6324b;
        c0675rm.f6757a = c0502l4.f6323a;
        c0675rm.f6759c = c0502l4.f6325c;
        c0675rm.f6760d = c0502l4.f6326d;
        c0675rm.f6761e = c0502l4.f6327e;
        c0675rm.f6762f = this.f5884a.a(c0502l4.f6328f);
        return c0675rm;
    }

    public C0353fa(io.appmetrica.analytics.impl.Sl sl) {
        this.f5884a = sl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0502l4 toModel(io.appmetrica.analytics.impl.C0675rm c0675rm) {
        io.appmetrica.analytics.impl.C0450j4 c0450j4 = new io.appmetrica.analytics.impl.C0450j4();
        c0450j4.f6156d = c0675rm.f6760d;
        c0450j4.f6155c = c0675rm.f6759c;
        c0450j4.f6154b = c0675rm.f6758b;
        c0450j4.f6153a = c0675rm.f6757a;
        c0450j4.f6157e = c0675rm.f6761e;
        c0450j4.f6158f = this.f5884a.a(c0675rm.f6762f);
        return new io.appmetrica.analytics.impl.C0502l4(c0450j4);
    }
}
