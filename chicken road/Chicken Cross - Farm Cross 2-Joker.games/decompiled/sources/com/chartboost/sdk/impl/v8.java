package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class v8 {

    /* renamed from: a, reason: collision with root package name */
    public static final v8 f5042a = new v8();

    public final u8 a(Element element) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim((CharSequence) textContent).toString()) == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return new u8(str);
        }
        return null;
    }
}
