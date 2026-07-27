package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class U8 implements ProtobufConverter {
    public static B9 a(T8 t8) {
        B9 b9 = new B9();
        b9.f5763d = new int[t8.f6649b.size()];
        Iterator it = t8.f6649b.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            b9.f5763d[i3] = ((Integer) it.next()).intValue();
            i3++;
        }
        b9.f5762c = t8.f6651d;
        b9.f5761b = t8.f6650c;
        b9.f5760a = t8.f6648a;
        return b9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((T8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        B9 b9 = (B9) obj;
        return new T8(b9.f5760a, b9.f5761b, b9.f5762c, CollectionUtils.hashSetFromIntArray(b9.f5763d));
    }
}
