package com.paypal.oslo.feature.cryptocurrency.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/CryptoLinkClickHandler;", "", "<init>", "()V", "", "href", "expectedHref", "Lkotlin/Function0;", "", com.sun.jna.Callback.METHOD_NAME, "handleLinkClick", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoLinkClickHandler {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoLinkClickHandler INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoLinkClickHandler();

    private CryptoLinkClickHandler() {
    }

    public final void handleLinkClick(java.lang.String href, java.lang.String expectedHref, kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(href, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedHref, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(href, expectedHref)) {
            callback.invoke();
        }
    }

    public final void handleLinkClick(android.content.Context context, java.lang.String href, java.lang.String expectedHref) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(href, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedHref, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(href, expectedHref)) {
            com.paypal.oslo.feature.cryptocurrency.ui.common.util.ContextExtensionsKt.openUrl(context, href);
        }
    }
}
