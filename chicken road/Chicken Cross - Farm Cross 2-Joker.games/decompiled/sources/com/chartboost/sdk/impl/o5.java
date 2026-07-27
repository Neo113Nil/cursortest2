package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    public static final o5 f4924a = new o5();

    public final n5 a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        ql qlVar = ql.f4988a;
        String a2 = qlVar.a(element, "type");
        Element b = qlVar.b(element, "UniversalAdId");
        return new n5(a2, b != null ? ri.f5001a.a(b) : null);
    }
}
