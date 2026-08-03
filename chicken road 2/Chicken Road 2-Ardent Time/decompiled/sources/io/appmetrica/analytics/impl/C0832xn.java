package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832xn implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bl f7122a;

    public C0832xn() {
        this(new io.appmetrica.analytics.impl.Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0220a6 fromModel(io.appmetrica.analytics.impl.C0806wn c0806wn) {
        io.appmetrica.analytics.impl.C0220a6 c0220a6 = new io.appmetrica.analytics.impl.C0220a6();
        java.lang.Integer num = c0806wn.f7068e;
        c0220a6.f5466e = num == null ? -1 : num.intValue();
        c0220a6.f5465d = c0806wn.f7067d;
        c0220a6.f5463b = c0806wn.f7065b;
        c0220a6.f5462a = c0806wn.f7064a;
        c0220a6.f5464c = c0806wn.f7066c;
        io.appmetrica.analytics.impl.Bl bl = this.f7122a;
        java.util.List list = c0806wn.f7069f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new io.appmetrica.analytics.impl.Dl((java.lang.StackTraceElement) it.next()));
        }
        c0220a6.f5467f = bl.fromModel(arrayList);
        return c0220a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0832xn(io.appmetrica.analytics.impl.Bl bl) {
        this.f7122a = bl;
    }

    public final io.appmetrica.analytics.impl.C0806wn a(io.appmetrica.analytics.impl.C0220a6 c0220a6) {
        throw new java.lang.UnsupportedOperationException();
    }
}
