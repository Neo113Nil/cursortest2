package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class cl {

    /* renamed from: a, reason: collision with root package name */
    public static final cl f4717a = new cl();

    public final bl a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        ql qlVar = ql.f4988a;
        return new bl(qlVar.a(element, "id"), qlVar.e(element, "Viewable"), qlVar.e(element, "NotViewable"), qlVar.e(element, "ViewUndetermined"));
    }

    public final List b(Element parentElement) {
        bl blVar;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        List c = ql.f4988a.c(parentElement, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                blVar = f4717a.a((Element) it.next());
            } catch (Exception e) {
                mb.b("Failed to parse ViewableImpression element: " + e.getMessage(), e);
                blVar = null;
            }
            if (blVar != null) {
                arrayList.add(blVar);
            }
        }
        return arrayList;
    }
}
