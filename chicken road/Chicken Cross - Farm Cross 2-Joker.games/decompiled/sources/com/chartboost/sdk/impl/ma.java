package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class ma {

    /* renamed from: a, reason: collision with root package name */
    public static final ma f4874a = new ma();

    public final Object a(Element element, pj context) {
        List emptyList;
        List c;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        ql qlVar = ql.f4988a;
        String d = qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h);
        String d2 = qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i);
        String d3 = qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j);
        List e = qlVar.e(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
        Iterator it = e.iterator();
        while (it.hasNext()) {
            context.b().add(new ii("error", (String) it.next(), context.c(), null, null, 0L, 56, null));
        }
        List e2 = ql.f4988a.e(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n);
        Iterator it2 = e2.iterator();
        while (it2.hasNext()) {
            context.b().add(new ii("impression", (String) it2.next(), context.c(), null, null, 0L, 56, null));
        }
        ql qlVar2 = ql.f4988a;
        Element b = qlVar2.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o);
        if (b == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new gc("Creatives in InLine", null, 2, null)));
        }
        Object b2 = m5.f4871a.b(b, context);
        if (Result.m8085isFailureimpl(b2)) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(b2);
            Intrinsics.checkNotNull(m8082exceptionOrNullimpl);
            return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
        }
        Element b3 = qlVar2.b(element, "Extensions");
        if (b3 == null || (emptyList = f8.f4767a.b(b3, context)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = emptyList;
        ArrayList arrayList = new ArrayList();
        Element b4 = qlVar2.b(element, "AdVerifications");
        if (b4 != null) {
            arrayList.addAll(v0.f5036a.b(b4, context));
        }
        if (b3 != null && (c = qlVar2.c(b3, "Extension")) != null) {
            Iterator it3 = c.iterator();
            while (it3.hasNext()) {
                Element b5 = ql.f4988a.b((Element) it3.next(), "AdVerifications");
                if (b5 != null) {
                    arrayList.addAll(v0.f5036a.b(b5, context));
                }
            }
        }
        List distinct = CollectionsKt.distinct(arrayList);
        context.a().addAll(distinct);
        List b6 = cl.f4717a.b(element);
        Result.Companion companion3 = Result.INSTANCE;
        ResultKt.throwOnFailure(b2);
        return Result.m8079constructorimpl(new la(d, d2, d3, e, e2, (List) b2, list, distinct, b6));
    }
}
