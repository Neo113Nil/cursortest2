package com.paypal.oslo.feature.settings.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/model/HalfSheetDefaults;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/settings/ui/model/HalfSheetData;", "fingerprintConfirmation", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/settings/ui/model/HalfSheetData;", "llsConfirmation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HalfSheetDefaults {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.ui.model.HalfSheetDefaults INSTANCE = new com.paypal.oslo.feature.settings.ui.model.HalfSheetDefaults();

    private HalfSheetDefaults() {
    }

    public final com.paypal.oslo.feature.settings.ui.model.HalfSheetData fingerprintConfirmation(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-649091456, i, -1, "com.paypal.oslo.feature.settings.ui.model.HalfSheetDefaults.fingerprintConfirmation (HalfSheetData.kt:32)");
        }
        com.paypal.oslo.feature.settings.ui.model.HalfSheetData halfSheetData = new com.paypal.oslo.feature.settings.ui.model.HalfSheetData(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_half_sheet_fingerprint_turn_off_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_half_sheet_fingerprint_turn_off_description, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_half_sheet_fingerprint_keep_touch_id, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_remove, composer, 0), com.paypal.pds.core.Icon.Fingerprint.INSTANCE);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return halfSheetData;
    }

    public final com.paypal.oslo.feature.settings.ui.model.HalfSheetData llsConfirmation(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1664511377, i, -1, "com.paypal.oslo.feature.settings.ui.model.HalfSheetDefaults.llsConfirmation (HalfSheetData.kt:41)");
        }
        com.paypal.oslo.feature.settings.ui.model.HalfSheetData halfSheetData = new com.paypal.oslo.feature.settings.ui.model.HalfSheetData(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_lls_opt_in_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_lls_opt_in_description, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_lls_opt_in_confirm, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_lls_opt_in_cancel, composer, 0), com.paypal.pds.core.Icon.Clock.INSTANCE);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return halfSheetData;
    }
}
