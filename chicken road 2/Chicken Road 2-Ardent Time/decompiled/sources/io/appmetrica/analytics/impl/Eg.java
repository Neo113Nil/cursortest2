package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Eg implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fn f4264a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.W f4265b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0401h6 f4266c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bl f4267d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.He f4268e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ie f4269f;

    public Eg() {
        this(new io.appmetrica.analytics.impl.Fn(), new io.appmetrica.analytics.impl.W(new io.appmetrica.analytics.impl.C0832xn()), new io.appmetrica.analytics.impl.C0401h6(), new io.appmetrica.analytics.impl.Bl(), new io.appmetrica.analytics.impl.He(), new io.appmetrica.analytics.impl.Ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.X5 fromModel(io.appmetrica.analytics.impl.Dg dg) {
        io.appmetrica.analytics.impl.X5 x5 = new io.appmetrica.analytics.impl.X5();
        x5.f5286f = io.appmetrica.analytics.coreutils.internal.StringUtils.correctIllFormedString((java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(dg.f4210a, x5.f5286f));
        io.appmetrica.analytics.impl.Qn qn = dg.f4211b;
        if (qn != null) {
            io.appmetrica.analytics.impl.Gn gn = qn.f4873a;
            if (gn != null) {
                x5.f5281a = this.f4264a.fromModel(gn);
            }
            io.appmetrica.analytics.impl.V v2 = qn.f4874b;
            if (v2 != null) {
                x5.f5282b = this.f4265b.fromModel(v2);
            }
            java.util.List<io.appmetrica.analytics.impl.Dl> list = qn.f4875c;
            if (list != null) {
                x5.f5285e = this.f4267d.fromModel(list);
            }
            x5.f5283c = (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(qn.f4879g, x5.f5283c);
            x5.f5284d = this.f4266c.a(qn.f4880h);
            if (!android.text.TextUtils.isEmpty(qn.f4876d)) {
                x5.f5289i = this.f4268e.fromModel(qn.f4876d);
            }
            if (!android.text.TextUtils.isEmpty(qn.f4877e)) {
                x5.f5290j = qn.f4877e.getBytes();
            }
            if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(qn.f4878f)) {
                x5.f5291k = this.f4269f.fromModel(qn.f4878f);
            }
        }
        return x5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public Eg(io.appmetrica.analytics.impl.Fn fn, io.appmetrica.analytics.impl.W w2, io.appmetrica.analytics.impl.C0401h6 c0401h6, io.appmetrica.analytics.impl.Bl bl, io.appmetrica.analytics.impl.He he, io.appmetrica.analytics.impl.Ie ie) {
        this.f4264a = fn;
        this.f4265b = w2;
        this.f4266c = c0401h6;
        this.f4267d = bl;
        this.f4268e = he;
        this.f4269f = ie;
    }

    public final io.appmetrica.analytics.impl.Dg a(io.appmetrica.analytics.impl.X5 x5) {
        throw new java.lang.UnsupportedOperationException();
    }
}
