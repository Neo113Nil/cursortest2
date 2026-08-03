package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Fn implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bl f4307a;

    public Fn() {
        this(new io.appmetrica.analytics.impl.Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0246b6 fromModel(io.appmetrica.analytics.impl.Gn gn) {
        io.appmetrica.analytics.impl.C0246b6 c0246b6 = new io.appmetrica.analytics.impl.C0246b6();
        c0246b6.f5516a = (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(gn.f4353a, "");
        c0246b6.f5517b = io.appmetrica.analytics.coreutils.internal.StringUtils.correctIllFormedString((java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(gn.f4354b, ""));
        java.util.List<io.appmetrica.analytics.impl.Dl> list = gn.f4355c;
        if (list != null) {
            c0246b6.f5518c = this.f4307a.fromModel(list);
        }
        io.appmetrica.analytics.impl.Gn gn2 = gn.f4356d;
        if (gn2 != null) {
            c0246b6.f5519d = fromModel(gn2);
        }
        java.util.List list2 = gn.f4357e;
        int i2 = 0;
        if (list2 == null) {
            c0246b6.f5520e = new io.appmetrica.analytics.impl.C0246b6[0];
        } else {
            c0246b6.f5520e = new io.appmetrica.analytics.impl.C0246b6[list2.size()];
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                c0246b6.f5520e[i2] = fromModel((io.appmetrica.analytics.impl.Gn) it.next());
                i2++;
            }
        }
        return c0246b6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public Fn(io.appmetrica.analytics.impl.Bl bl) {
        this.f4307a = bl;
    }

    public final io.appmetrica.analytics.impl.Gn a(io.appmetrica.analytics.impl.C0246b6 c0246b6) {
        throw new java.lang.UnsupportedOperationException();
    }
}
