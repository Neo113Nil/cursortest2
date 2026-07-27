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
public final class ol {

    /* renamed from: a, reason: collision with root package name */
    public static final ol f4948a = new ol();

    public final Object a(Element element, pj context) {
        Object m8079constructorimpl;
        List emptyList;
        List c;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        ql qlVar = ql.f4988a;
        String d = qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h);
        List e = qlVar.e(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
        List e2 = qlVar.e(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n);
        String d2 = qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g);
        if (d2 == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new gc("VASTAdTagURI in Wrapper", null, 2, null)));
        }
        Element b = qlVar.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o);
        if (b != null) {
            m8079constructorimpl = m5.f4871a.b(b, context);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(CollectionsKt.emptyList());
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            Result.Companion companion3 = Result.INSTANCE;
            Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
            Intrinsics.checkNotNull(m8082exceptionOrNullimpl);
            return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
        }
        Element b2 = qlVar.b(element, "Extensions");
        if (b2 == null || (emptyList = f8.f4767a.b(b2, context)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = emptyList;
        ArrayList arrayList = new ArrayList();
        Element b3 = qlVar.b(element, "AdVerifications");
        if (b3 != null) {
            arrayList.addAll(v0.f5036a.b(b3, context));
        }
        if (b2 != null && (c = qlVar.c(b2, "Extension")) != null) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                Element b4 = ql.f4988a.b((Element) it.next(), "AdVerifications");
                if (b4 != null) {
                    arrayList.addAll(v0.f5036a.b(b4, context));
                }
            }
        }
        List b5 = cl.f4717a.b(element);
        Result.Companion companion4 = Result.INSTANCE;
        ResultKt.throwOnFailure(m8079constructorimpl);
        return Result.m8079constructorimpl(new nl(d, e, e2, (List) m8079constructorimpl, list, d2, arrayList, b5));
    }
}
