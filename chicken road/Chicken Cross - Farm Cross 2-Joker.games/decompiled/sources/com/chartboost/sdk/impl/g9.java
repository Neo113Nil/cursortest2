package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    public static final g9 f4778a = new g9();

    public final f9 a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        ql qlVar = ql.f4988a;
        String d = qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H);
        List e = qlVar.e(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I);
        ArrayList arrayList = new ArrayList();
        Element b = qlVar.b(element, "IconClickFallbackImages");
        if (b != null) {
            Iterator it = qlVar.c(b, "IconClickFallbackImage").iterator();
            while (it.hasNext()) {
                e9 b2 = f4778a.b((Element) it.next());
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        if (d == null && e.isEmpty() && arrayList.isEmpty()) {
            return null;
        }
        return new f9(d, e, arrayList);
    }

    public final e9 b(Element element) {
        ql qlVar = ql.f4988a;
        String a2 = qlVar.a(element, "width");
        Integer intOrNull = a2 != null ? StringsKt.toIntOrNull(a2) : null;
        String a3 = qlVar.a(element, "height");
        Integer intOrNull2 = a3 != null ? StringsKt.toIntOrNull(a3) : null;
        String d = qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K);
        Element b = qlVar.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D);
        eh a4 = b != null ? fh.f4770a.a(b) : null;
        if (a4 != null) {
            return new e9(intOrNull, intOrNull2, d, a4);
        }
        return null;
    }
}
