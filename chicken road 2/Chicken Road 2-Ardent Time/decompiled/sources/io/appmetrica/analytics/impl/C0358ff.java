package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358ff implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0668rf f5890a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0229af f5891b;

    public C0358ff() {
        this(new io.appmetrica.analytics.impl.C0668rf(), new io.appmetrica.analytics.impl.C0229af());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0565nf fromModel(io.appmetrica.analytics.impl.C0307df c0307df) {
        io.appmetrica.analytics.impl.C0565nf c0565nf = new io.appmetrica.analytics.impl.C0565nf();
        c0565nf.f6531a = this.f5890a.fromModel(c0307df.f5726a);
        c0565nf.f6532b = new io.appmetrica.analytics.impl.C0539mf[c0307df.f5727b.size()];
        java.util.Iterator<io.appmetrica.analytics.impl.C0281cf> it = c0307df.f5727b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c0565nf.f6532b[i2] = this.f5891b.fromModel(it.next());
            i2++;
        }
        return c0565nf;
    }

    public C0358ff(io.appmetrica.analytics.impl.C0668rf c0668rf, io.appmetrica.analytics.impl.C0229af c0229af) {
        this.f5890a = c0668rf;
        this.f5891b = c0229af;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0307df toModel(io.appmetrica.analytics.impl.C0565nf c0565nf) {
        io.appmetrica.analytics.impl.C0643qf model;
        java.util.ArrayList arrayList = new java.util.ArrayList(c0565nf.f6532b.length);
        for (io.appmetrica.analytics.impl.C0539mf c0539mf : c0565nf.f6532b) {
            arrayList.add(this.f5891b.toModel(c0539mf));
        }
        io.appmetrica.analytics.impl.C0513lf c0513lf = c0565nf.f6531a;
        if (c0513lf == null) {
            model = this.f5890a.toModel(new io.appmetrica.analytics.impl.C0513lf());
        } else {
            model = this.f5890a.toModel(c0513lf);
        }
        return new io.appmetrica.analytics.impl.C0307df(model, arrayList);
    }
}
