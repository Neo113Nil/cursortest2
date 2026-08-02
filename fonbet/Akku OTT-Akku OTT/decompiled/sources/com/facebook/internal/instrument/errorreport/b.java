package com.facebook.internal.instrument.errorreport;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        a aVar = (a) obj;
        a data = (a) obj2;
        Intrinsics.checkNotNullExpressionValue(data, "o2");
        aVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Long l = aVar.c;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = data.c;
        if (l2 != null) {
            return Intrinsics.compare(l2.longValue(), longValue);
        }
        return 1;
    }
}
