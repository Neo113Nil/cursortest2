package com.chartboost.sdk.impl;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class ki {

    /* renamed from: a, reason: collision with root package name */
    public static final ki f4846a = new ki();

    public static /* synthetic */ List a(ki kiVar, Element element, pj pjVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return kiVar.a(element, pjVar, z);
    }

    public final List a(Element trackingEventsParentElement, pj context, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(trackingEventsParentElement, "trackingEventsParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        for (Element element : ql.f4988a.c(trackingEventsParentElement, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w)) {
            ql qlVar = ql.f4988a;
            String a2 = qlVar.a(element, NotificationCompat.CATEGORY_EVENT);
            String a3 = qlVar.a(element, "offset");
            String textContent = element.getTextContent();
            if (textContent == null || (str = StringsKt.trim((CharSequence) textContent).toString()) == null || str.length() <= 0) {
                str = null;
            }
            String str2 = str;
            if (str2 != null) {
                ii iiVar = new ii(a2, str2, context.c(), a3, null, 0L, 48, null);
                arrayList.add(iiVar);
                if (z) {
                    context.b().add(iiVar);
                }
            }
        }
        return arrayList;
    }
}
