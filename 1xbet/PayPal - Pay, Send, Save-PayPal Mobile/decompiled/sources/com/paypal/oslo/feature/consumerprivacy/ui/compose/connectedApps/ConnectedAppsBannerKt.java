package com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "toBannerState", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;)Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyBannerState;", "", "PackageTrackingSettingsTag", "Ljava/lang/String;", "PackageTrackingSettingsLinkText", "ContactUsTag", "ContactUsLinkText"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConnectedAppsBannerKt {
    public static final java.lang.String ContactUsLinkText = "Contact us";
    public static final java.lang.String ContactUsTag = "contact_us";
    public static final java.lang.String PackageTrackingSettingsLinkText = "package tracking settings.";
    public static final java.lang.String PackageTrackingSettingsTag = "package_tracking_settings";

    public static final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState toBannerState(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult connectedAppsOperationResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsOperationResult, "");
        if (connectedAppsOperationResult instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.GenericError) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, null, 2, null);
        }
        if (connectedAppsOperationResult instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkAndDeleteSuccess) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_connected_apps_banner_unlink_and_delete_success, null, 2, null);
        }
        if (connectedAppsOperationResult instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkSuccess) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_connected_apps_banner_unlink_success, new com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig(PackageTrackingSettingsLinkText, PackageTrackingSettingsTag));
        }
        if (connectedAppsOperationResult instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkDeleteFailed) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_connected_apps_banner_unlink_delete_failed, new com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig(PackageTrackingSettingsLinkText, PackageTrackingSettingsTag));
        }
        if (!(connectedAppsOperationResult instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkFailed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Warning(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_connected_apps_banner_unlink_failed, new com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig(ContactUsLinkText, ContactUsTag));
    }
}
