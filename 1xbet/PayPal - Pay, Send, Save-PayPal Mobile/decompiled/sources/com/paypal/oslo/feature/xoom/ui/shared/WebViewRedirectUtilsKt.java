package com.paypal.oslo.feature.xoom.ui.shared;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"", "url", "Lkotlin/Function0;", "", "onRedirect", "", "shouldOverrideUrlLoadingForRedirect", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Z", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WebViewRedirectUtilsKt {
    private static final java.util.List<java.lang.String> getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"/sign-in", "/signout", "/sign-up", "/signup", "timeout=1"});

    public static final boolean shouldOverrideUrlLoadingForRedirect(java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        java.util.List<java.lang.String> list = getHighSpeedVideoSizes;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) it.next(), true)) {
                function0.invoke();
                return true;
            }
        }
        return false;
    }
}
