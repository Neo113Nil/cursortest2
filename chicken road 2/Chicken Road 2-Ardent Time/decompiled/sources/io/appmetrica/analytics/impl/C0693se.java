package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693se implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0767va f6819a;

    public C0693se() {
        this(new io.appmetrica.analytics.impl.C0767va(20480, 100, io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Di fromModel(java.util.Map<java.lang.String, java.lang.String> map) {
        io.appmetrica.analytics.impl.Mn a2 = this.f6819a.a(map);
        io.appmetrica.analytics.impl.C0506l8 c0506l8 = new io.appmetrica.analytics.impl.C0506l8();
        c0506l8.f6349b = ((io.appmetrica.analytics.impl.C0554n4) a2.f4695b).f6457b;
        java.util.Map map2 = (java.util.Map) a2.f4694a;
        if (map2 != null) {
            c0506l8.f6348a = new io.appmetrica.analytics.impl.C0480k8[map2.size()];
            int i2 = 0;
            for (java.util.Map.Entry entry : map2.entrySet()) {
                c0506l8.f6348a[i2] = new io.appmetrica.analytics.impl.C0480k8();
                c0506l8.f6348a[i2].f6262a = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) entry.getKey());
                c0506l8.f6348a[i2].f6263b = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) entry.getValue());
                i2++;
            }
        }
        io.appmetrica.analytics.impl.InterfaceC0243b3 interfaceC0243b3 = a2.f4695b;
        int i3 = ((io.appmetrica.analytics.impl.C0554n4) interfaceC0243b3).f5453a;
        return new io.appmetrica.analytics.impl.Di(c0506l8, interfaceC0243b3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0693se(io.appmetrica.analytics.impl.C0767va c0767va) {
        this.f6819a = c0767va;
    }

    public final java.util.Map<java.lang.String, java.lang.String> a(io.appmetrica.analytics.impl.Di di) {
        throw new java.lang.UnsupportedOperationException();
    }
}
