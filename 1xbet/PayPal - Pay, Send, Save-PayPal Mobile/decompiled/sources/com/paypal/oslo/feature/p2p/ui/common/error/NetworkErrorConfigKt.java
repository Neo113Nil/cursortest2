package com.paypal.oslo.feature.p2p.ui.common.error;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000f\u0010\r"}, d2 = {"Lkotlin/Function0;", "", "onDismiss", "Lcom/paypal/oslo/feature/p2p/ui/common/error/ErrorScreenConfig;", "networkErrorConfig", "(Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/p2p/ui/common/error/ErrorScreenConfig;", "Lcom/paypal/pds/components/AvatarEmphasis$Custom;", "NetworkErrorAvatarEmphasis", "Lcom/paypal/pds/components/AvatarEmphasis$Custom;", "getNetworkErrorAvatarEmphasis", "()Lcom/paypal/pds/components/AvatarEmphasis$Custom;", "", "NetworkErrorTitle", "Ljava/lang/String;", "NetworkErrorDescription", "NetworkErrorOkButton"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NetworkErrorConfigKt {
    private static final com.paypal.pds.components.AvatarEmphasis.Custom NetworkErrorAvatarEmphasis = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE);
    public static final java.lang.String NetworkErrorDescription = "Right now, we're not able to complete this transaction. Please try again later.";
    public static final java.lang.String NetworkErrorOkButton = "OK";
    public static final java.lang.String NetworkErrorTitle = "There's a problem";

    public static final com.paypal.pds.components.AvatarEmphasis.Custom getNetworkErrorAvatarEmphasis() {
        return NetworkErrorAvatarEmphasis;
    }

    public static final com.paypal.oslo.feature.p2p.ui.common.error.ErrorScreenConfig networkErrorConfig(final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new com.paypal.oslo.feature.p2p.ui.common.error.ErrorScreenConfig(com.paypal.pds.core.Icon.Alert.INSTANCE, NetworkErrorTitle, NetworkErrorDescription, null, NetworkErrorOkButton, NetworkErrorAvatarEmphasis, false, false, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.$r8$lambda$mY2b2DN0LNNlFRB9ZQMyJijVaTw(kotlin.jvm.functions.Function0.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.m17244$r8$lambda$NINpRo8c0kDliOmN6xLwn9Gbic(kotlin.jvm.functions.Function0.this);
            }
        }, 72, null);
    }

    /* renamed from: $r8$lambda$NINpRo8c0kDliOmN6x-Lwn9Gbic, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17244$r8$lambda$NINpRo8c0kDliOmN6xLwn9Gbic(kotlin.jvm.functions.Function0 function0) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TAPPED_NETWORK_ERROR_OK, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_DISPLAY_TYPE, "full_screen"), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.BUTTON_TYPE, "ok")), null, 4, null);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mY2b2DN0LNNlFRB9ZQMyJijVaTw(kotlin.jvm.functions.Function0 function0) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_DISMISSED_NETWORK_ERROR_SCREEN, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_DISPLAY_TYPE, "full_screen"), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.BUTTON_TYPE, "close")), null, 4, null);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
