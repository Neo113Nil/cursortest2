package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class vb {

    /* renamed from: a, reason: collision with root package name */
    public static final vb f5044a = new vb();

    public final ub a(Element element) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        ql qlVar = ql.f4988a;
        String a2 = qlVar.a(element, "type");
        if (a2 == null) {
            a2 = "";
        }
        String a3 = qlVar.a(element, "width");
        Integer intOrNull = a3 != null ? StringsKt.toIntOrNull(a3) : null;
        String a4 = qlVar.a(element, "height");
        Integer intOrNull2 = a4 != null ? StringsKt.toIntOrNull(a4) : null;
        String a5 = qlVar.a(element, "bitrate");
        Integer intOrNull3 = a5 != null ? StringsKt.toIntOrNull(a5) : null;
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim((CharSequence) textContent).toString()) == null) {
            str = "";
        }
        String a6 = qlVar.a(element, "weight");
        return new ub(a2, intOrNull, intOrNull2, intOrNull3, str, a6 != null ? StringsKt.toDoubleOrNull(a6) : null);
    }

    public final List b(Element parentElement) {
        ub ubVar;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        List<Element> c = ql.f4988a.c(parentElement, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u);
        ArrayList arrayList = new ArrayList();
        for (Element element : c) {
            try {
                ubVar = f5044a.a(element);
            } catch (Exception e) {
                ql qlVar = ql.f4988a;
                mb.b("MediaFile parse failed: mimeType=" + qlVar.a(element, "type") + ", width=" + qlVar.a(element, "width") + ", height=" + qlVar.a(element, "height") + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                ubVar = null;
            }
            if (ubVar != null) {
                arrayList.add(ubVar);
            }
        }
        return arrayList;
    }
}
