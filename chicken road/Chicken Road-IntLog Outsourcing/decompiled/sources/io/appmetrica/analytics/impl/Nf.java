package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Nf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1130ya f7182a;

    public Nf() {
        this(new C1130ya(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(List<String> list) {
        On a6 = this.f7182a.a((List<Object>) list);
        List list2 = (List) a6.f7230a;
        C1025u8[] c1025u8Arr = new C1025u8[0];
        if (list2 != null) {
            c1025u8Arr = new C1025u8[list2.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C1025u8 c1025u8 = new C1025u8();
                c1025u8Arr[i2] = c1025u8;
                c1025u8.f9363a = StringUtils.getUTF8Bytes((String) list2.get(i2));
            }
        }
        a6.f7231b.getBytesTruncated();
        return new Ii(c1025u8Arr, a6.f7231b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Nf(C1130ya c1130ya) {
        this.f7182a = c1130ya;
    }

    public final List<String> a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
