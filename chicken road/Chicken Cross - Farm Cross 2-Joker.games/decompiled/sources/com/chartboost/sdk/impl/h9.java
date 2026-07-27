package com.chartboost.sdk.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class h9 {

    /* renamed from: a, reason: collision with root package name */
    public static final h9 f4790a = new h9();

    public final d9 a(Element element, pj context) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
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
        Element b = qlVar.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G);
        f9 a5 = b != null ? g9.f4778a.a(b) : null;
        List e = qlVar.e(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J);
        Iterator it4 = e.iterator();
        while (it4.hasNext()) {
            context.b().add(new ii("iconView", (String) it4.next(), context.c(), null, null, 0L, 56, null));
        }
        ql qlVar2 = ql.f4988a;
        String a6 = qlVar2.a(element, "program");
        String a7 = qlVar2.a(element, "width");
        Integer intOrNull = a7 != null ? StringsKt.toIntOrNull(a7) : null;
        String a8 = qlVar2.a(element, "height");
        return new d9(a6, intOrNull, a8 != null ? StringsKt.toIntOrNull(a8) : null, qlVar2.a(element, "xPosition"), qlVar2.a(element, "yPosition"), qlVar2.a(element, IronSourceConstants.EVENTS_DURATION), qlVar2.a(element, "offset"), qlVar2.a(element, "apiFramework"), qlVar2.a(element, "pxratio"), qlVar2.a(element, "altText"), qlVar2.a(element, "hoverText"), arrayList, arrayList2, arrayList3, a5, e);
    }

    public final List b(Element parentElement, pj context) {
        List c;
        d9 d9Var;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        ql qlVar = ql.f4988a;
        Element b = qlVar.b(parentElement, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B);
        if (b == null || (c = qlVar.c(b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                d9Var = f4790a.a((Element) it.next(), context);
            } catch (Exception e) {
                mb.b("Failed to parse Icon element: " + e.getMessage(), e);
                d9Var = null;
            }
            if (d9Var != null) {
                arrayList.add(d9Var);
            }
        }
        return arrayList;
    }
}
