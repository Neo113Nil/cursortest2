package com.paypal.oslo.feature.packagetracking.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/mapper/ErrorInfoMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "error", "Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;", "fromError", "(Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;)Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;", "emailAlreadyLinked", "()Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;", "fetchError", "generic", "genericUnlink", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "", "isSettingsScreen", "emailUnlinked", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Z)Lcom/paypal/oslo/feature/packagetracking/domain/error/ErrorInfo;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorInfoMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.packagetracking.ui.mapper.ErrorInfoMapper INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.mapper.ErrorInfoMapper();

    private ErrorInfoMapper() {
    }

    public final com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo fromError(com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        java.lang.String errorCode = error.getErrorCode();
        if (errorCode != null) {
            int hashCode = errorCode.hashCode();
            if (hashCode != -1240938727) {
                if (hashCode != -774578923) {
                    if (hashCode == 312473036 && errorCode.equals("EMAIL_ALREADY_LINKED_ERROR")) {
                        return emailAlreadyLinked();
                    }
                } else if (errorCode.equals("FETCH_EMAIL_ADDRESS_ERROR")) {
                    return fetchError();
                }
            } else if (errorCode.equals("ACCOUNT_NOT_AUTHORIZED")) {
                return generic();
            }
        }
        return generic();
    }

    public final com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo emailAlreadyLinked() {
        return new com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_email_already_linked_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_email_already_linked_body), com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorCodes.EMAIL_ALREADY_LINKED);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo fetchError() {
        return new com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_email_already_linked_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_cannot_link_email_body), com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorCodes.EMAIL_CANNOT_BE_LINKED);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo generic() {
        return new com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_generic_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_generic_link_body), com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorCodes.GENERIC_LINK_ERROR);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo genericUnlink() {
        return new com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_generic_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_generic_unlink_body), com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorCodes.GENERIC_UNLINK_ERROR);
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo emailUnlinked$default(com.paypal.oslo.feature.packagetracking.ui.mapper.ErrorInfoMapper errorInfoMapper, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return errorInfoMapper.emailUnlinked(emailProvider, z);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo emailUnlinked(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean isSettingsScreen) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        com.paypal.oslo.feature.packagetracking.domain.UiString.Companion companion = com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE;
        int i3 = com.paypal.oslo.feature.packagetracking.ui.mapper.ErrorInfoMapper.WhenMappings.$EnumSwitchMapping$0[emailProvider.ordinal()];
        if (i3 == 1) {
            i = com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_unlink_gmail;
        } else {
            if (i3 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            i = com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_unlink_outlook;
        }
        com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource invoke = companion.invoke(i);
        com.paypal.oslo.feature.packagetracking.domain.UiString.Companion companion2 = com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE;
        if (isSettingsScreen) {
            i2 = com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_unlink_settings_description;
        } else {
            i2 = com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_unlink_description;
        }
        return new com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo(invoke, companion2.invoke(i2), com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorCodes.UNLINKED_BY_SYSTEM);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.values().length];
            try {
                iArr[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.OUTLOOK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
