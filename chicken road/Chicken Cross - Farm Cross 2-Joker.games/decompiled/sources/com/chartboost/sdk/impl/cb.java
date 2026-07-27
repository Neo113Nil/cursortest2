package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    public static final cb f4709a = new cb();

    public final bb a(Element element) {
        String obj;
        Intrinsics.checkNotNullParameter(element, "element");
        ql qlVar = ql.f4988a;
        String a2 = qlVar.a(element, "apiFramework");
        String a3 = qlVar.a(element, "browserOptional");
        String str = null;
        Boolean valueOf = a3 != null ? Boolean.valueOf(Boolean.parseBoolean(a3)) : null;
        String textContent = element.getTextContent();
        if (textContent != null && (obj = StringsKt.trim((CharSequence) textContent).toString()) != null && obj.length() > 0) {
            str = obj;
        }
        return new bb(a2, valueOf, str);
    }
}
