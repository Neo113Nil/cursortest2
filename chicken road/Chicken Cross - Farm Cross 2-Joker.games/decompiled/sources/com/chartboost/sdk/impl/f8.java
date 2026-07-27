package com.chartboost.sdk.impl;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes4.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    public static final f8 f4767a = new f8();

    public final d8 a(Element element, pj context) {
        String str;
        String str2;
        String a2;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        String a3 = ql.f4988a.a(element, "type");
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim((CharSequence) textContent).toString()) == null || str.length() <= 0) {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Intrinsics.checkNotNull(item, "null cannot be cast to non-null type org.w3c.dom.Element");
                Element element2 = (Element) item;
                String nodeName = element2.getNodeName();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length2 = element2.getAttributes().getLength();
                for (int i2 = 0; i2 < length2; i2++) {
                    Node item2 = element2.getAttributes().item(i2);
                    linkedHashMap.put(item2.getNodeName(), item2.getNodeValue());
                }
                String textContent2 = element2.getTextContent();
                if (textContent2 == null || (str2 = StringsKt.trim((CharSequence) textContent2).toString()) == null || str2.length() <= 0) {
                    str2 = null;
                }
                if (Intrinsics.areEqual(nodeName, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w) && Intrinsics.areEqual(element2.getParentNode(), element) && (a2 = ql.f4988a.a(element2, NotificationCompat.CATEGORY_EVENT)) != null && str2 != null) {
                    context.b().add(new ii(a2, str2, context.c(), null, null, 0L, 56, null));
                }
                Intrinsics.checkNotNull(nodeName);
                arrayList.add(new e8(nodeName, linkedHashMap, str2));
            }
        }
        return new d8(a3, str, arrayList);
    }

    public final List b(Element extensionsParentElement, pj context) {
        d8 d8Var;
        Intrinsics.checkNotNullParameter(extensionsParentElement, "extensionsParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        List c = ql.f4988a.c(extensionsParentElement, "Extension");
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                d8Var = f4767a.a((Element) it.next(), context);
            } catch (Exception e) {
                mb.b("Failed to parse Extension element: " + e.getMessage(), e);
                d8Var = null;
            }
            if (d8Var != null) {
                arrayList.add(d8Var);
            }
        }
        return arrayList;
    }
}
