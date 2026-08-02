package com.paypal.oslo.feature.packagetracking.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "", "toDisplayName", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "", "toIcon", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)I"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailProviderExtensionsKt {
    public static final java.lang.String toDisplayName(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1144968468, i, -1, "com.paypal.oslo.feature.packagetracking.ui.utils.toDisplayName (EmailProviderExtensions.kt:24)");
        }
        int i2 = com.paypal.oslo.feature.packagetracking.ui.utils.EmailProviderExtensionsKt.WhenMappings.$EnumSwitchMapping$0[emailProvider.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-803066318);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_email_provider_gmail, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(-803067944);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-803062587);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_settings_email_provider_outlook, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final int toIcon(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        int i = com.paypal.oslo.feature.packagetracking.ui.utils.EmailProviderExtensionsKt.WhenMappings.$EnumSwitchMapping$0[emailProvider.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.packagetracking.R.drawable.feature_package_tracking_ic_gmail;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.packagetracking.R.drawable.feature_package_tracking_ic_outlook;
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
