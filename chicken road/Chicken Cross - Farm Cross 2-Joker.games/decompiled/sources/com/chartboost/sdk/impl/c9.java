package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class c9 {

    /* renamed from: a, reason: collision with root package name */
    public static final c9 f4707a = new c9();

    public final b9 a(Element element) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim((CharSequence) textContent).toString()) == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return new b9(str);
        }
        return null;
    }
}
