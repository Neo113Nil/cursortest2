package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class ri {

    /* renamed from: a, reason: collision with root package name */
    public static final ri f5001a = new ri();

    public final qi a(Element element) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        String a2 = ql.f4988a.a(element, "idRegistry");
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim((CharSequence) textContent).toString()) == null || str.length() <= 0) {
            str = null;
        }
        return new qi(a2, str);
    }

    public final List b(Element parentElement) {
        qi qiVar;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        List c = ql.f4988a.c(parentElement, "UniversalAdId");
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                qiVar = f5001a.a((Element) it.next());
            } catch (Exception e) {
                mb.b("Failed to parse UniversalAdId element: " + e.getMessage(), e);
                qiVar = null;
            }
            if (qiVar != null) {
                arrayList.add(qiVar);
            }
        }
        return arrayList;
    }
}
