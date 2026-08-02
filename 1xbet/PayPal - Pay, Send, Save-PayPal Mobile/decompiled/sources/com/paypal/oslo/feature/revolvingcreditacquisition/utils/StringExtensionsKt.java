package com.paypal.oslo.feature.revolvingcreditacquisition.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0017\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "isTelLink", "(Ljava/lang/String;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StringExtensionsKt {
    public static final boolean isTelLink(java.lang.String str) {
        return str != null && kotlin.text.StringsKt.startsWith(str, "tel:", true);
    }
}
