package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ne implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0357a6[] fromModel(Map<String, String> map) {
        int size = map.size();
        C0357a6[] c0357a6Arr = new C0357a6[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            c0357a6Arr[i4] = new C0357a6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C0357a6 c0357a6 = c0357a6Arr[i3];
            String key = entry.getKey();
            Charset charset = v2.a.f10417a;
            c0357a6.f6952a = key.getBytes(charset);
            c0357a6Arr[i3].f6953b = entry.getValue().getBytes(charset);
            i3++;
        }
        return c0357a6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(C0357a6[] c0357a6Arr) {
        throw new UnsupportedOperationException();
    }
}
