package io.appmetrica.analytics.impl;

import e2.AbstractC0293h;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class O8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        Q8 q8 = new Q8();
        P8[] p8Arr = new P8[map.size()];
        int i3 = 0;
        for (Object obj : map.entrySet()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0293h.T();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            P8 p8 = new P8();
            p8.f6414a = (String) entry.getKey();
            p8.f6415b = (byte[]) entry.getValue();
            p8Arr[i3] = p8;
            i3 = i4;
        }
        q8.f6463a = p8Arr;
        return MessageNano.toByteArray(q8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        P8[] p8Arr = ((Q8) MessageNano.mergeFrom(new Q8(), bArr)).f6463a;
        int j02 = e2.s.j0(p8Arr.length);
        if (j02 < 16) {
            j02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j02);
        for (P8 p8 : p8Arr) {
            linkedHashMap.put(p8.f6414a, p8.f6415b);
        }
        return linkedHashMap;
    }
}
