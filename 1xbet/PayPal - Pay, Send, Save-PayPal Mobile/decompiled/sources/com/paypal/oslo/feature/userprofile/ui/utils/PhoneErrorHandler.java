package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/PhoneErrorHandler;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/userprofile/domain/model/GraphQLErrorDetail;", "detail", "", "getErrorMessageForDetail", "(Lcom/paypal/oslo/feature/userprofile/domain/model/GraphQLErrorDetail;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhoneErrorHandler {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PhoneErrorHandler(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }

    public final java.lang.String getErrorMessageForDetail(com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "");
        java.lang.String issue = detail.getIssue();
        if (kotlin.jvm.internal.Intrinsics.areEqual(issue, "WALLET_SETTING_PHONE_EXCEEDED_MAX")) {
            java.lang.String string = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_wallet_setting_phone_exceeded_max);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(issue, "WALLET_SETTING_ERROR_DUPLICATE_PHONE")) {
            java.lang.String string2 = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_wallet_setting_error_duplicate_phone);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        java.lang.String string3 = this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string3);
        return string3;
    }
}
