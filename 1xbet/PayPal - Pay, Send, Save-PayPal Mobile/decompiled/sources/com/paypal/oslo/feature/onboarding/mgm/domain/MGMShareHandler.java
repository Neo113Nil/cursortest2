package com.paypal.oslo.feature.onboarding.mgm.domain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/mgm/domain/MGMShareHandler;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "message", "", "shareInvite", "(Landroid/content/Context;Ljava/lang/String;)V", "", "isValidMGMMessage$onboarding_prodRelease", "(Ljava/lang/String;)Z", "Companion", "ValidationError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MGMShareHandler {
    public static final int $stable = 0;
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;
    private static final kotlin.text.Regex getHighSpeedVideoSizes;
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor = new kotlin.text.Regex("\\bhttps://(?:(?:(?:www\\.)?paypal\\.com|(?:[A-Za-z0-9-]+\\.)*stage\\.paypal\\.com|(?:[A-Za-z0-9-]+\\.)*sandbox\\.paypal\\.com)/cgp/mgm/[^\\s]*|py\\.pl/[^\\s]+)", (java.util.Set<? extends kotlin.text.RegexOption>) kotlin.collections.SetsKt.setOf(kotlin.text.RegexOption.IGNORE_CASE));

    static {
        java.util.List<java.lang.String> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"invite", "join", "refer", "share"});
        getHighSpeedVideoFpsRanges = listOf;
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(listOf, com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.$r8$lambda$u_oc60X87v2gvRrIjSaOUcqhDFQ((java.lang.String) obj);
            }
        }, 30, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\\b(");
        sb.append(joinToString$default);
        sb.append(")\\b");
        getHighSpeedVideoSizes = new kotlin.text.Regex(sb.toString(), kotlin.text.RegexOption.IGNORE_CASE);
    }

    public final void shareInvite(android.content.Context context, java.lang.String message) {
        com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError validationError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.lang.String obj = kotlin.text.StringsKt.trim(message).toString();
        java.lang.String str = obj;
        if (str.length() == 0) {
            validationError = com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError.Camera2StreamConfigurationMap;
        } else if (obj.length() > 2000) {
            validationError = com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            validationError = !isValidMGMMessage$onboarding_prodRelease(obj) ? com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError.getHighSpeedVideoFpsRangesFor : null;
        }
        if (validationError != null) {
            int i = com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.WhenMappings.$EnumSwitchMapping$0[validationError.ordinal()];
            if (i == 1) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Share invite called with empty message", null, null, 6, null);
                return;
            }
            if (i == 2) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Share message exceeds maximum length", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("length", java.lang.Integer.valueOf(obj.length())), kotlin.TuplesKt.to(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, 2000)), null, 4, null);
                return;
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.onboarding.LoggerKt.log;
                kotlin.Pair pair = kotlin.TuplesKt.to("length", java.lang.Integer.valueOf(obj.length()));
                kotlin.text.Regex regex = getHighSpeedVideoFpsRangesFor;
                com.paypal.android.logger.Logger.d$default(logger, "Share message does not contain expected MGM patterns", kotlin.collections.MapsKt.mapOf(pair, kotlin.TuplesKt.to("has_paypal_url", java.lang.Boolean.valueOf(regex.containsMatchIn(str))), kotlin.TuplesKt.to("has_referral_keywords", java.lang.Boolean.valueOf(getHighSpeedVideoSizes.containsMatchIn(regex.replace(str, " "))))), null, 4, null);
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", obj);
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, null);
        if (!(context instanceof android.app.Activity)) {
            createChooser.addFlags(268435456);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createChooser, "");
        try {
            context.startActivity(createChooser);
        } catch (android.content.ActivityNotFoundException unused) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "No share-capable apps found on device", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("length", java.lang.Integer.valueOf(obj.length()))), null, 4, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/mgm/domain/MGMShareHandler$ValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class ValidationError {
        public static final com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError[] getHighSpeedVideoFpsRanges;
        public static final com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private ValidationError(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError validationError = new com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError("EMPTY", 0);
            Camera2StreamConfigurationMap = validationError;
            com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError validationError2 = new com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError("TOO_LONG", 1);
            getHighResolutionOutputSizeshNQ4ISI = validationError2;
            com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError validationError3 = new com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError("INVALID_PATTERN", 2);
            getHighSpeedVideoFpsRangesFor = validationError3;
            com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError[] validationErrorArr = {validationError, validationError2, validationError3};
            getHighSpeedVideoFpsRanges = validationErrorArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(validationErrorArr);
        }

        public static com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError[] values() {
            return (com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError.class, str);
        }
    }

    public final boolean isValidMGMMessage$onboarding_prodRelease(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.lang.String obj = kotlin.text.StringsKt.trim(message).toString();
        if (obj.length() == 0) {
            return false;
        }
        kotlin.text.Regex regex = getHighSpeedVideoFpsRangesFor;
        return regex.containsMatchIn(obj) && getHighSpeedVideoSizes.containsMatchIn(regex.replace(obj, " "));
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$u_oc60X87v2gvRrIjSaOUcqhDFQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.Regex.INSTANCE.escape(str);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError.Camera2StreamConfigurationMap.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.mgm.domain.MGMShareHandler.ValidationError.getHighSpeedVideoFpsRangesFor.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
