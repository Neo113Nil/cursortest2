package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431ia implements io.appmetrica.analytics.impl.N9 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.J8 f6093a = new io.appmetrica.analytics.impl.J8();

    public final io.appmetrica.analytics.impl.C0275c9[] a(byte[] bArr) {
        int i2 = 0;
        if (bArr == null) {
            return new io.appmetrica.analytics.impl.C0275c9[0];
        }
        java.util.Map<java.lang.String, byte[]> model = this.f6093a.toModel(bArr);
        io.appmetrica.analytics.impl.C0275c9[] c0275c9Arr = new io.appmetrica.analytics.impl.C0275c9[model.size()];
        for (java.lang.Object obj : model.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i1.AbstractC0191j.J();
                throw null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            io.appmetrica.analytics.impl.C0275c9 c0275c9 = new io.appmetrica.analytics.impl.C0275c9();
            c0275c9.f5641a = ((java.lang.String) entry.getKey()).getBytes(y1.a.f8486a);
            c0275c9.f5642b = (byte[]) entry.getValue();
            c0275c9Arr[i2] = c0275c9;
            i2 = i3;
        }
        return c0275c9Arr;
    }
}
