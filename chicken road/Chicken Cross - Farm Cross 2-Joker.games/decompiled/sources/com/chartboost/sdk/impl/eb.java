package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    public static final eb f4751a = new eb();

    public final db a(Element element, pj context) {
        List emptyList;
        List emptyList2;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        ql qlVar = ql.f4988a;
        String d = qlVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.s);
        Element b = qlVar.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v);
        if (b == null || (emptyList = ki.a(ki.f4846a, b, context, false, 4, null)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = emptyList;
        Element b2 = qlVar.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x);
        bk a2 = b2 != null ? ck.f4716a.a(b2) : null;
        Element b3 = qlVar.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t);
        if (b3 == null || (emptyList2 = vb.f5044a.b(b3)) == null) {
            emptyList2 = CollectionsKt.emptyList();
        }
        return new db(d, list, a2, emptyList2, h9.f4790a.b(element, context));
    }
}
