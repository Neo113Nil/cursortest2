package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611p9 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0559n9 fromModel(io.appmetrica.analytics.impl.C0585o9 c0585o9) {
        io.appmetrica.analytics.impl.C0559n9 c0559n9 = new io.appmetrica.analytics.impl.C0559n9();
        java.lang.String str = c0585o9.f6577a;
        if (str != null) {
            c0559n9.f6483a = str.getBytes();
        }
        return c0559n9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0585o9 toModel(io.appmetrica.analytics.impl.C0559n9 c0559n9) {
        return new io.appmetrica.analytics.impl.C0585o9(new java.lang.String(c0559n9.f6483a));
    }
}
