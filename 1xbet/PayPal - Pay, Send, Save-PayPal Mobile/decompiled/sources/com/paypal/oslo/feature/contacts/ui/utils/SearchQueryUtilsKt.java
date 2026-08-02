package com.paypal.oslo.feature.contacts.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "isEmail", "(Ljava/lang/String;)Z", "Lkotlin/text/Regex;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchQueryUtilsKt {
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("^[^@.\\s]+(?:\\.[^@.\\s]+)*@[^@.\\s]+(?:\\.[^@.\\s]+)+$");

    public static final boolean isEmail(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighResolutionOutputSizeshNQ4ISI.matches(str);
    }
}
