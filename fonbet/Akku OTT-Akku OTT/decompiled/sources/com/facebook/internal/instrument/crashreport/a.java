package com.facebook.internal.instrument.crashreport;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.facebook.internal.instrument.c cVar = (com.facebook.internal.instrument.c) obj;
        com.facebook.internal.instrument.c data = (com.facebook.internal.instrument.c) obj2;
        Intrinsics.checkNotNullExpressionValue(data, "o2");
        cVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Long l = cVar.g;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = data.g;
        if (l2 != null) {
            return Intrinsics.compare(l2.longValue(), longValue);
        }
        return 1;
    }
}
