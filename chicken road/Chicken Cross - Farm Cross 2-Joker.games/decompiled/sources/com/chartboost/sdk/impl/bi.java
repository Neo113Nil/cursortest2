package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.g7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class bi implements ai {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4696a;

    public bi(AtomicReference sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f4696a = sdkConfiguration;
    }

    @Override // com.chartboost.sdk.impl.ai
    public List a(g7.b eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.f4696a.get();
        List b = aVar != null ? aVar.b() : null;
        List emptyList = (b == null || b.isEmpty()) ? CollectionsKt.emptyList() : a(b, eventType);
        ArrayList arrayList = new ArrayList();
        for (Object obj : emptyList) {
            if (!StringsKt.isBlank(((xh) obj).d())) {
                arrayList.add(obj);
            }
        }
        return (arrayList.isEmpty() && eventType == g7.b.q) ? CollectionsKt.listOf(j7.f4821a.a()) : arrayList;
    }

    public final List a(List list, g7.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt.equals(((g7) obj).d(), bVar.b(), true)) {
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
            String e = g7Var.e();
            String c = g7Var.c();
            String a2 = g7Var.a();
            if (a2 == null || a2.length() <= 0) {
                a2 = null;
            }
            arrayList2.add(new xh(e, c, a2, g7Var.b()));
        }
        return arrayList2;
    }
}
