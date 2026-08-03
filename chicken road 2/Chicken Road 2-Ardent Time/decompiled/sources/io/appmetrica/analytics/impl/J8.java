package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class J8 implements io.appmetrica.analytics.coreapi.internal.data.Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(java.util.Map<java.lang.String, byte[]> map) {
        io.appmetrica.analytics.impl.L8 l8 = new io.appmetrica.analytics.impl.L8();
        io.appmetrica.analytics.impl.K8[] k8Arr = new io.appmetrica.analytics.impl.K8[map.size()];
        int i2 = 0;
        for (java.lang.Object obj : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i1.AbstractC0191j.J();
                throw null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            io.appmetrica.analytics.impl.K8 k8 = new io.appmetrica.analytics.impl.K8();
            k8.f4538a = (java.lang.String) entry.getKey();
            k8.f4539b = (byte[]) entry.getValue();
            k8Arr[i2] = k8;
            i2 = i3;
        }
        l8.f4599a = k8Arr;
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(l8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.Map<java.lang.String, byte[]> toModel(byte[] bArr) {
        io.appmetrica.analytics.impl.K8[] k8Arr = ((io.appmetrica.analytics.impl.L8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.L8(), bArr)).f4599a;
        int E2 = i1.AbstractC0203v.E(k8Arr.length);
        if (E2 < 16) {
            E2 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E2);
        for (io.appmetrica.analytics.impl.K8 k8 : k8Arr) {
            linkedHashMap.put(k8.f4538a, k8.f4539b);
        }
        return linkedHashMap;
    }
}
