package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class fh {

    /* renamed from: a, reason: collision with root package name */
    public static final fh f4770a = new fh();

    public final eh a(Element element) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        String a2 = ql.f4988a.a(element, "creativeType");
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim((CharSequence) textContent).toString()) == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return new eh(a2, str);
        }
        return null;
    }
}
