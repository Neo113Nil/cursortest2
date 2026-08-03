package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Rn implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fn f4919a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.W f4920b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0401h6 f4921c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bl f4922d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.He f4923e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ie f4924f;

    public Rn() {
        this(new io.appmetrica.analytics.impl.Fn(), new io.appmetrica.analytics.impl.W(new io.appmetrica.analytics.impl.C0832xn()), new io.appmetrica.analytics.impl.C0401h6(), new io.appmetrica.analytics.impl.Bl(), new io.appmetrica.analytics.impl.He(), new io.appmetrica.analytics.impl.Ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.V5 fromModel(io.appmetrica.analytics.impl.Qn qn) {
        io.appmetrica.analytics.impl.V5 v5 = new io.appmetrica.analytics.impl.V5();
        io.appmetrica.analytics.impl.Gn gn = qn.f4873a;
        if (gn != null) {
            v5.f5123a = this.f4919a.fromModel(gn);
        }
        io.appmetrica.analytics.impl.V v2 = qn.f4874b;
        if (v2 != null) {
            v5.f5124b = this.f4920b.fromModel(v2);
        }
        java.util.List<io.appmetrica.analytics.impl.Dl> list = qn.f4875c;
        if (list != null) {
            v5.f5127e = this.f4922d.fromModel(list);
        }
        java.lang.String str = qn.f4879g;
        if (str != null) {
            v5.f5125c = str;
        }
        v5.f5126d = this.f4921c.a(qn.f4880h);
        if (!android.text.TextUtils.isEmpty(qn.f4876d)) {
            v5.f5130h = this.f4923e.fromModel(qn.f4876d);
        }
        if (!android.text.TextUtils.isEmpty(qn.f4877e)) {
            v5.f5131i = qn.f4877e.getBytes();
        }
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(qn.f4878f)) {
            v5.f5132j = this.f4924f.fromModel(qn.f4878f);
        }
        return v5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public Rn(io.appmetrica.analytics.impl.Fn fn, io.appmetrica.analytics.impl.W w2, io.appmetrica.analytics.impl.C0401h6 c0401h6, io.appmetrica.analytics.impl.Bl bl, io.appmetrica.analytics.impl.He he, io.appmetrica.analytics.impl.Ie ie) {
        this.f4920b = w2;
        this.f4919a = fn;
        this.f4921c = c0401h6;
        this.f4922d = bl;
        this.f4923e = he;
        this.f4924f = ie;
    }

    public final io.appmetrica.analytics.impl.Qn a(io.appmetrica.analytics.impl.V5 v5) {
        throw new java.lang.UnsupportedOperationException();
    }
}
