package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class C implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.idsync.impl.k fromModel(io.appmetrica.analytics.idsync.internal.model.RequestConfig requestConfig) {
        io.appmetrica.analytics.idsync.impl.k kVar = new io.appmetrica.analytics.idsync.impl.k();
        java.lang.String type = requestConfig.getType();
        java.nio.charset.Charset charset = y1.a.f8486a;
        kVar.f3936a = type.getBytes(charset);
        io.appmetrica.analytics.idsync.impl.j jVar = new io.appmetrica.analytics.idsync.impl.j();
        jVar.f3934a = io.appmetrica.analytics.idsync.impl.B.f3883a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        kVar.f3937b = jVar;
        kVar.f3938c = requestConfig.getUrl().getBytes(charset);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = requestConfig.getHeaders();
        java.util.ArrayList arrayList = new java.util.ArrayList(headers.size());
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headers.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<java.lang.String> value = entry.getValue();
            io.appmetrica.analytics.idsync.impl.i iVar = new io.appmetrica.analytics.idsync.impl.i();
            iVar.f3931a = key.getBytes(y1.a.f8486a);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i2 = 0; i2 < size; i2++) {
                bArr[i2] = value.get(i2).getBytes(y1.a.f8486a);
            }
            iVar.f3932b = bArr;
            arrayList.add(iVar);
        }
        java.lang.Object[] array = arrayList.toArray(new io.appmetrica.analytics.idsync.impl.i[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kVar.f3939d = (io.appmetrica.analytics.idsync.impl.i[]) array;
        kVar.f3940e = requestConfig.getResendIntervalForValidResponse();
        kVar.f3941f = requestConfig.getResendIntervalForInvalidResponse();
        kVar.f3942g = i1.AbstractC0190i.W(requestConfig.getValidResponseCodes());
        kVar.f3943h = requestConfig.getReportEventEnabled();
        java.lang.String reportUrl = requestConfig.getReportUrl();
        if (reportUrl == null) {
            reportUrl = "";
        }
        kVar.f3944i = reportUrl;
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r2 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.idsync.internal.model.RequestConfig toModel(io.appmetrica.analytics.idsync.impl.k kVar) {
        io.appmetrica.analytics.idsync.internal.model.NetworkType networkType;
        byte[] bArr = kVar.f3936a;
        java.nio.charset.Charset charset = y1.a.f8486a;
        java.lang.String str = new java.lang.String(bArr, charset);
        io.appmetrica.analytics.idsync.impl.j jVar = kVar.f3937b;
        if (jVar != null) {
            if (jVar.f3934a == 1) {
                networkType = io.appmetrica.analytics.idsync.internal.model.NetworkType.CELL;
            } else {
                networkType = io.appmetrica.analytics.idsync.internal.model.NetworkType.ANY;
            }
        }
        networkType = io.appmetrica.analytics.idsync.internal.model.NetworkType.ANY;
        io.appmetrica.analytics.idsync.internal.model.Preconditions preconditions = new io.appmetrica.analytics.idsync.internal.model.Preconditions(networkType);
        java.lang.String str2 = new java.lang.String(kVar.f3938c, charset);
        io.appmetrica.analytics.idsync.impl.i[] iVarArr = kVar.f3939d;
        int E2 = i1.AbstractC0203v.E(iVarArr.length);
        if (E2 < 16) {
            E2 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E2);
        for (io.appmetrica.analytics.idsync.impl.i iVar : iVarArr) {
            java.lang.String str3 = new java.lang.String(iVar.f3931a, y1.a.f8486a);
            byte[][] bArr2 = iVar.f3932b;
            java.util.ArrayList arrayList = new java.util.ArrayList(bArr2.length);
            for (byte[] bArr3 : bArr2) {
                arrayList.add(new java.lang.String(bArr3, y1.a.f8486a));
            }
            linkedHashMap.put(str3, arrayList);
        }
        long j2 = kVar.f3940e;
        long j3 = kVar.f3941f;
        java.util.List R2 = i1.AbstractC0189h.R(kVar.f3942g);
        boolean z2 = kVar.f3943h;
        java.lang.String str4 = kVar.f3944i;
        if (str4.length() <= 0) {
            str4 = null;
        }
        return new io.appmetrica.analytics.idsync.internal.model.RequestConfig(str, str2, preconditions, linkedHashMap, j2, j3, R2, z2, str4);
    }
}
