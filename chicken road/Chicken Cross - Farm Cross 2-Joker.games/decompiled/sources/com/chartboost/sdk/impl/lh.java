package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.g7;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class lh {
    public static final List a(List list, g7.b eventType) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt.equals(((g7) obj).d(), eventType.b(), true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            g7 g7Var = (g7) obj2;
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        return arrayList2;
    }
}
