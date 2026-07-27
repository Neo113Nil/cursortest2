package io.appmetrica.analytics.idsync.impl;

import e2.AbstractC0290e;
import e2.AbstractC0292g;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.NetworkType;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(RequestConfig requestConfig) {
        m mVar = new m();
        String type = requestConfig.getType();
        Charset charset = v2.a.f10417a;
        mVar.f5601a = type.getBytes(charset);
        l lVar = new l();
        lVar.f5599a = w.f5625a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        mVar.f5602b = lVar;
        mVar.f5603c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            k kVar = new k();
            kVar.f5596a = key.getBytes(v2.a.f10417a);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i3 = 0; i3 < size; i3++) {
                bArr[i3] = value.get(i3).getBytes(v2.a.f10417a);
            }
            kVar.f5597b = bArr;
            arrayList.add(kVar);
        }
        Object[] array = arrayList.toArray(new k[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        mVar.f5604d = (k[]) array;
        mVar.f5605e = requestConfig.getResendIntervalForValidResponse();
        mVar.f = requestConfig.getResendIntervalForInvalidResponse();
        mVar.f5606g = AbstractC0292g.e0(requestConfig.getValidResponseCodes());
        return mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r4 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RequestConfig toModel(m mVar) {
        NetworkType networkType;
        byte[] bArr = mVar.f5601a;
        Charset charset = v2.a.f10417a;
        String str = new String(bArr, charset);
        l lVar = mVar.f5602b;
        if (lVar != null) {
            if (lVar.f5599a == 1) {
                networkType = NetworkType.CELL;
            } else {
                networkType = NetworkType.ANY;
            }
        }
        networkType = NetworkType.ANY;
        Preconditions preconditions = new Preconditions(networkType);
        String str2 = new String(mVar.f5603c, charset);
        k[] kVarArr = mVar.f5604d;
        int j02 = e2.s.j0(kVarArr.length);
        if (j02 < 16) {
            j02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j02);
        for (k kVar : kVarArr) {
            String str3 = new String(kVar.f5596a, v2.a.f10417a);
            byte[][] bArr2 = kVar.f5597b;
            ArrayList arrayList = new ArrayList(bArr2.length);
            for (byte[] bArr3 : bArr2) {
                arrayList.add(new String(bArr3, v2.a.f10417a));
            }
            linkedHashMap.put(str3, arrayList);
        }
        return new RequestConfig(str, str2, preconditions, linkedHashMap, mVar.f5605e, mVar.f, AbstractC0290e.Y(mVar.f5606g));
    }
}
