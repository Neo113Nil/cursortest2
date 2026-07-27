package com.chartboost.sdk.impl;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f5036a = new v0();

    public final u0 a(Element element, pj context) {
        List<Element> c;
        String obj;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        ql qlVar = ql.f4988a;
        String a2 = qlVar.a(element, "vendor");
        List c2 = qlVar.c(element, "JavaScriptResource");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c2, 10));
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            arrayList.add(cb.f4709a.a((Element) it.next()));
        }
        ql qlVar2 = ql.f4988a;
        Element b = qlVar2.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
        ArrayList arrayList2 = new ArrayList();
        if (b != null && (c = qlVar2.c(b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w)) != null) {
            for (Element element2 : c) {
                ql qlVar3 = ql.f4988a;
                String a3 = qlVar3.a(element2, NotificationCompat.CATEGORY_EVENT);
                String a4 = qlVar3.a(element2, "offset");
                String textContent = element2.getTextContent();
                String str = (textContent == null || (obj = StringsKt.trim((CharSequence) textContent).toString()) == null || obj.length() <= 0) ? null : obj;
                if (a3 != null && str != null) {
                    arrayList2.add(new ii(a3, str, context.c(), a4, null, 0L, 48, null));
                }
            }
        }
        Element b2 = ql.f4988a.b(element, "VerificationParameters");
        return new u0(a2, arrayList, arrayList2, b2 != null ? b2.getTextContent() : null);
    }

    public final List b(Element adVerificationsParentElement, pj context) {
        u0 u0Var;
        Intrinsics.checkNotNullParameter(adVerificationsParentElement, "adVerificationsParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        List c = ql.f4988a.c(adVerificationsParentElement, "Verification");
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                u0Var = f5036a.a((Element) it.next(), context);
            } catch (Exception e) {
                mb.b("Failed to parse AdVerification element: " + e.getMessage(), e);
                u0Var = null;
            }
            if (u0Var != null) {
                arrayList.add(u0Var);
            }
        }
        return arrayList;
    }
}
