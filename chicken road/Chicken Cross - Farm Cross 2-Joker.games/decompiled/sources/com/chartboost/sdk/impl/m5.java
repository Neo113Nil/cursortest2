package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.l5;
import com.ironsource.sdk.controller.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class m5 {

    /* renamed from: a, reason: collision with root package name */
    public static final m5 f4871a = new m5();

    public final l5 a(Element element, pj context) {
        List emptyList;
        List c;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        ql qlVar = ql.f4988a;
        String a2 = qlVar.a(element, "id");
        String a3 = qlVar.a(element, "AdID");
        if (a3 == null) {
            a3 = qlVar.a(element, f.b.c);
        }
        String str = a3;
        String a4 = qlVar.a(element, "sequence");
        Integer intOrNull = a4 != null ? StringsKt.toIntOrNull(a4) : null;
        List b = ri.f5001a.b(element);
        Element b2 = qlVar.b(element, "CreativeExtensions");
        if (b2 == null || (c = qlVar.c(b2, "CreativeExtension")) == null) {
            emptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c, 10));
            Iterator it = c.iterator();
            while (it.hasNext()) {
                arrayList.add(o5.f4924a.a((Element) it.next()));
            }
            emptyList = arrayList;
        }
        ql qlVar2 = ql.f4988a;
        Element b3 = qlVar2.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q);
        if (b3 != null) {
            return new l5.b(a2, str, intOrNull, b, eb.f4751a.a(b3, context), emptyList);
        }
        Element b4 = qlVar2.b(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L);
        if (b4 != null) {
            return new l5.a(a2, str, intOrNull, b, w4.f5052a.b(b4, context), emptyList);
        }
        qlVar2.b(element, "NonLinearAds");
        return null;
    }

    public final Object b(Element creativesParentElement, pj context) {
        l5 l5Var;
        Intrinsics.checkNotNullParameter(creativesParentElement, "creativesParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        List c = ql.f4988a.c(creativesParentElement, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p);
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                l5Var = f4871a.a((Element) it.next(), context);
            } catch (Exception e) {
                mb.b("Failed to parse Creative element: " + e.getMessage(), e);
                l5Var = null;
            }
            if (l5Var != null) {
                arrayList.add(l5Var);
            }
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m8079constructorimpl(arrayList);
    }
}
