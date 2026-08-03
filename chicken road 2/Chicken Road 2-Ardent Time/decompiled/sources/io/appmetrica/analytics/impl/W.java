package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class W implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0832xn f5181a;

    public W(io.appmetrica.analytics.impl.C0832xn c0832xn) {
        this.f5181a = c0832xn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.R5 fromModel(io.appmetrica.analytics.impl.V v2) {
        io.appmetrica.analytics.impl.R5 r5 = new io.appmetrica.analytics.impl.R5();
        io.appmetrica.analytics.impl.C0806wn c0806wn = v2.f5096a;
        if (c0806wn != null) {
            r5.f4893a = this.f5181a.fromModel(c0806wn);
        }
        r5.f4894b = new io.appmetrica.analytics.impl.C0220a6[v2.f5097b.size()];
        java.util.Iterator it = v2.f5097b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            r5.f4894b[i2] = this.f5181a.fromModel((io.appmetrica.analytics.impl.C0806wn) it.next());
            i2++;
        }
        java.lang.String str = v2.f5098c;
        if (str != null) {
            r5.f4895c = str;
        }
        return r5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final io.appmetrica.analytics.impl.V a(io.appmetrica.analytics.impl.R5 r5) {
        throw new java.lang.UnsupportedOperationException();
    }
}
