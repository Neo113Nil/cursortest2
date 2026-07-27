package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class w4 {

    /* renamed from: a, reason: collision with root package name */
    public static final w4 f5052a = new w4();

    public final v4 a(Element element, pj pjVar) {
        List emptyList;
        List c = ql.f4988a.c(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D);
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            eh a2 = fh.f4770a.a((Element) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        List c2 = ql.f4988a.c(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = c2.iterator();
        while (it2.hasNext()) {
            b9 a3 = c9.f4707a.a((Element) it2.next());
            if (a3 != null) {
                arrayList2.add(a3);
            }
        }
        List c3 = ql.f4988a.c(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = c3.iterator();
        while (it3.hasNext()) {
            u8 a4 = v8.f5042a.a((Element) it3.next());
            if (a4 != null) {
                arrayList3.add(a4);
            }
        }
        ql qlVar = ql.f4988a;
        Element b = qlVar.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
        if (b == null || (emptyList = ki.f4846a.a(b, pjVar, false)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = emptyList;
        String d = qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N);
        List e = qlVar.e(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O);
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty() && list.isEmpty() && e.isEmpty()) {
            return null;
        }
        String a5 = qlVar.a(element, "id");
        String a6 = qlVar.a(element, "width");
        Integer intOrNull = a6 != null ? StringsKt.toIntOrNull(a6) : null;
        String a7 = qlVar.a(element, "height");
        Integer intOrNull2 = a7 != null ? StringsKt.toIntOrNull(a7) : null;
        String a8 = qlVar.a(element, "assetWidth");
        Integer intOrNull3 = a8 != null ? StringsKt.toIntOrNull(a8) : null;
        String a9 = qlVar.a(element, "assetHeight");
        Integer intOrNull4 = a9 != null ? StringsKt.toIntOrNull(a9) : null;
        String a10 = qlVar.a(element, "expandedWidth");
        Integer intOrNull5 = a10 != null ? StringsKt.toIntOrNull(a10) : null;
        String a11 = qlVar.a(element, "expandedHeight");
        return new v4(a5, intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, a11 != null ? StringsKt.toIntOrNull(a11) : null, qlVar.a(element, "apiFramework"), qlVar.a(element, "adSlotID"), qlVar.a(element, "pxratio"), qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K), qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.r), arrayList, arrayList2, arrayList3, list, d, e, null, 262144, null);
    }

    public final y4 b(Element element, pj context) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        ql qlVar = ql.f4988a;
        String a2 = qlVar.a(element, "required");
        ArrayList arrayList = new ArrayList();
        Iterator it = qlVar.c(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M).iterator();
        while (it.hasNext()) {
            v4 a3 = f5052a.a((Element) it.next(), context);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return new y4(a2, arrayList);
    }
}
