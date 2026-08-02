package com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/nextBestAction/NbaUrlClassifier;", "", "<init>", "()V", "", "url", "", "isInternal", "(Ljava/lang/String;)Z", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/String;", "", "Camera2StreamConfigurationMap", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NbaUrlClassifier {
    public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction.NbaUrlClassifier INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction.NbaUrlClassifier();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"paypal.com", "paypal.me"});
    public static final int $stable = 8;

    private NbaUrlClassifier() {
    }

    public final boolean isInternal(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(url);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = highResolutionOutputSizeshNQ4ISI.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                java.util.List<java.lang.String> list = getHighResolutionOutputSizeshNQ4ISI;
                if ((list instanceof java.util.Collection) && list.isEmpty()) {
                    return false;
                }
                for (java.lang.String str : list) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, str) || kotlin.text.StringsKt.endsWith$default(lowerCase, ".".concat(java.lang.String.valueOf(str)), false, 2, (java.lang.Object) null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.balance.ui.balanceDashboard.nextBestAction.NbaUrlClassifier nbaUrlClassifier = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(new java.net.URI(p0).getHost());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        return (java.lang.String) m23436constructorimpl;
    }
}
