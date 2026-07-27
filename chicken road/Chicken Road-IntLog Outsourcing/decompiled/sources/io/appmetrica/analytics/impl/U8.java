package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class U8 implements ProtobufConverter {
    public static B9 a(T8 t8) {
        B9 b9 = new B9();
        b9.f6595d = new int[t8.f7520b.size()];
        Iterator it = t8.f7520b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            b9.f6595d[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        b9.f6594c = t8.f7522d;
        b9.f6593b = t8.f7521c;
        b9.f6592a = t8.f7519a;
        return b9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((T8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        B9 b9 = (B9) obj;
        return new T8(b9.f6592a, b9.f6593b, b9.f6594c, CollectionUtils.hashSetFromIntArray(b9.f6595d));
    }
}
