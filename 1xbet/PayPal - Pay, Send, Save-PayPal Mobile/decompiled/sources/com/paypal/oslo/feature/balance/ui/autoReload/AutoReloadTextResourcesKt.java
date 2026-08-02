package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a)\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aE\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "config", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;", "choiceSheetUi", "", "isConsumerAccountType", "", "getLowBalanceDescription", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;ZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Ljava/util/Locale;", "userLocale", "Lkotlin/Function1;", "", "formatOrdinal", "getScheduledDescription", "(Ljava/util/Locale;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "isEnabled", "getBadgeTextResource", "(Z)I", "getButtonTextResource"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadTextResourcesKt {
    public static final java.lang.String getLowBalanceDescription(com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi, boolean z, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalance;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadChoiceSheetUi, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-165944622, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.getLowBalanceDescription (AutoReloadTextResources.kt:28)");
        }
        if (autoReloadConfig != null && (lowBalance = autoReloadConfig.getLowBalance()) != null && lowBalance.isEnabled() && autoReloadConfig.getLowBalance().getReloadAmount() != null && autoReloadConfig.getLowBalance().getReloadThreshold() != null) {
            composer.startReplaceGroup(-148537381);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_description_enabled, new java.lang.Object[]{autoReloadChoiceSheetUi.getLowBalanceReloadAmount(), autoReloadChoiceSheetUi.getLowBalanceThresholdAmount()}, composer, 0);
            composer.endReplaceGroup();
        } else if (z) {
            composer.startReplaceGroup(-148297193);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_description_disabled, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-148202674);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_low_balance_description_disabled_merchant, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r5.equals("BIWEEKLY") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e6, code lost:
    
        r9.startReplaceGroup(-989953693);
        r5 = r1.getStartDay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f0, code lost:
    
        if (r5 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f2, code lost:
    
        r5 = java.time.DayOfWeek.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        if (r5 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
    
        r8 = com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_reload_format;
        r6 = r6.getScheduledReloadAmount();
        r1 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_frequency_biweekly, r9, 0);
        r4 = r5.getDisplayName(java.time.format.TextStyle.FULL, r4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
        r3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r8, new java.lang.Object[]{r6, r1, r4}, r9, 0);
        r9.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0119, code lost:
    
        r9.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0120, code lost:
    
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0122, code lost:
    
        androidx.compose.runtime.ComposerKt.traceEventEnd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0125, code lost:
    
        r9.endReplaceGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e4, code lost:
    
        if (r5.equals("BI_WEEKLY") != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String getScheduledDescription(java.util.Locale locale, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi, boolean z, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> function1, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduled;
        java.lang.String str;
        java.time.DayOfWeek valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadChoiceSheetUi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        composer.startReplaceGroup(-1259069536);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1259069536, i, -1, "com.paypal.oslo.feature.balance.ui.autoReload.getScheduledDescription (AutoReloadTextResources.kt:53)");
        }
        if (z) {
            composer.startReplaceGroup(-990862613);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_description_disabled, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-990770078);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_description_disabled_merchant, composer, 0);
            composer.endReplaceGroup();
        }
        if (autoReloadConfig != null && (scheduled = autoReloadConfig.getScheduled()) != null) {
            java.lang.String str2 = null;
            if (!scheduled.isEnabled() || scheduled.getReloadAmount() == null) {
                scheduled = null;
            }
            if (scheduled != null) {
                java.lang.String recurrence = autoReloadConfig.getScheduled().getRecurrence();
                if (recurrence != null) {
                    str = recurrence.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                } else {
                    str = null;
                }
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1738378111:
                            if (str.equals("WEEKLY")) {
                                composer.startReplaceGroup(-990431899);
                                java.lang.String startDay = scheduled.getStartDay();
                                if (startDay != null && (valueOf = java.time.DayOfWeek.valueOf(startDay)) != null) {
                                    int i2 = com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_reload_format;
                                    java.lang.String scheduledReloadAmount = autoReloadChoiceSheetUi.getScheduledReloadAmount();
                                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_frequency_weekly, composer, 0);
                                    java.lang.String displayName = valueOf.getDisplayName(java.time.format.TextStyle.FULL, locale);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName, "");
                                    str2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(i2, new java.lang.Object[]{scheduledReloadAmount, stringResource2, displayName}, composer, 0);
                                    composer.endReplaceGroup();
                                    if (str2 != null) {
                                        stringResource = str2;
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    composer.endReplaceGroup();
                                    break;
                                } else {
                                    composer.endReplaceGroup();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    composer.endReplaceGroup();
                                    break;
                                }
                            }
                            break;
                        case 313318265:
                            break;
                        case 1954618349:
                            if (str.equals("MONTHLY")) {
                                composer.startReplaceGroup(-989482989);
                                try {
                                    str2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_scheduled_reload_format, new java.lang.Object[]{autoReloadChoiceSheetUi.getScheduledReloadAmount(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_frequency_monthly, composer, 0), function1.invoke(java.lang.Integer.valueOf(java.time.LocalDate.parse(scheduled.getStartDate()).getDayOfMonth()))}, composer, 0);
                                    composer.endReplaceGroup();
                                    if (str2 != null) {
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                    composer.endReplaceGroup();
                                    break;
                                } catch (java.lang.NullPointerException unused) {
                                    composer.endReplaceGroup();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    composer.endReplaceGroup();
                                    return stringResource;
                                } catch (java.time.format.DateTimeParseException unused2) {
                                    composer.endReplaceGroup();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    composer.endReplaceGroup();
                                    return stringResource;
                                }
                            }
                            break;
                        case 1981213576:
                            break;
                    }
                    return stringResource;
                }
                composer.startReplaceGroup(-988897059);
                composer.endReplaceGroup();
                if (str2 != null) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                return stringResource;
            }
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stringResource;
    }

    public static final int getBadgeTextResource(boolean z) {
        if (z) {
            return com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_on;
        }
        return com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_off;
    }

    public static final int getButtonTextResource(boolean z) {
        if (z) {
            return com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_edit_button;
        }
        return com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_setup_button;
    }
}
