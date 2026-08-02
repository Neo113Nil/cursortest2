package com.paypal.oslo.feature.activity.ui.webview.states;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "url", "", "onLoadSuccess", "(Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWebViewOnLoadSuccessStateKt {
    public static final void onLoadSuccess(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logWebViewDebug$activity_prodRelease(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_CONFIG_URL_PARAM, str)));
    }
}
