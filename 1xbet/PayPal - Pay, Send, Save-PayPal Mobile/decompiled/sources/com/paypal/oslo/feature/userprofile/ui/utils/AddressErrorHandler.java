package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/AddressErrorHandler;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/userprofile/domain/model/GraphQLErrorDetail;", "detail", "", "getErrorMessageForDetail", "(Lcom/paypal/oslo/feature/userprofile/domain/model/GraphQLErrorDetail;)Ljava/lang/String;", "errorString", "Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState;", "mapAddressLayoutError", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/AddressFormUiState;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddressErrorHandler {
    public static final int $stable = 8;
    private final android.content.Context getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AddressErrorHandler(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r2.equals("WALLET_SETTING_ADDRESS_ALREADY_EXISTS") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r2.equals("WALLET_SETTING_ADDRESS_ALREADY_EXISTS_V2") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0074, code lost:
    
        r2 = r1.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_already_address_saved);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007f, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String getErrorMessageForDetail(com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "");
        java.lang.String issue = detail.getIssue();
        if (issue != null) {
            switch (issue.hashCode()) {
                case -1916979709:
                    break;
                case -1603169181:
                    if (issue.equals("WALLET_SETTING_ADDRESS_COUNT_EXCEEDED")) {
                        java.lang.String string = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_max_addresses_reached);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                        return string;
                    }
                    break;
                case -1157328083:
                    if (issue.equals("ADDRESS_VALIDATION_AMS_INVALID_ERROR")) {
                        java.lang.String string2 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_check_the_address_you_entered_and_try_again);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
                        return string2;
                    }
                    break;
                case 626306855:
                    if (issue.equals("ADDRESS_CONTAINS_PO_BOX_OR_RURAL_ROUTE")) {
                        java.lang.String string3 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_po_box_error);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(string3);
                        return string3;
                    }
                    break;
                case 1217582141:
                    if (issue.equals("WALLET_SETTING_ADDRESS_COMBINATION_WRONG")) {
                        java.lang.String string4 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_address_combination_wrong);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(string4);
                        return string4;
                    }
                    break;
                case 1437718104:
                    break;
            }
        }
        java.lang.String string5 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string5);
        return string5;
    }

    public final com.paypal.oslo.feature.userprofile.ui.AddressFormUiState mapAddressLayoutError(java.lang.String errorString) {
        com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error error;
        if (errorString != null) {
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) errorString, (java.lang.CharSequence) "NoInternet", false, 2, (java.lang.Object) null)) {
                java.lang.String string = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_looks_like_you_are_offline);
                java.lang.String string2 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_check_your_connection_and_try_again);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                error = new com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error(string2, string, true);
            } else {
                java.lang.String string3 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                error = new com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error(string3, null, true, 2, null);
            }
            return error;
        }
        java.lang.String string4 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_failed_to_load_address_layout);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
        return new com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Error(string4, null, false, 6, null);
    }
}
