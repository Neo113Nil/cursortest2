package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class P8 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    public static io.appmetrica.analytics.impl.C0740u9 a(io.appmetrica.analytics.impl.O8 o8) {
        io.appmetrica.analytics.impl.C0740u9 c0740u9 = new io.appmetrica.analytics.impl.C0740u9();
        c0740u9.f6903d = new int[o8.f4765b.size()];
        java.util.Iterator it = o8.f4765b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c0740u9.f6903d[i2] = ((java.lang.Integer) it.next()).intValue();
            i2++;
        }
        c0740u9.f6902c = o8.f4767d;
        c0740u9.f6901b = o8.f4766c;
        c0740u9.f6900a = o8.f4764a;
        return c0740u9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ java.lang.Object fromModel(java.lang.Object obj) {
        return a((io.appmetrica.analytics.impl.O8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        io.appmetrica.analytics.impl.C0740u9 c0740u9 = (io.appmetrica.analytics.impl.C0740u9) obj;
        return new io.appmetrica.analytics.impl.O8(c0740u9.f6900a, c0740u9.f6901b, c0740u9.f6902c, io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.hashSetFromIntArray(c0740u9.f6903d));
    }
}
