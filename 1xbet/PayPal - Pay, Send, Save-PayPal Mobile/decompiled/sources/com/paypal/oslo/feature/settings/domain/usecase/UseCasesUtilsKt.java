package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "", "positiveText", "negativeText", "warningText", "actionText", "getText", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "itemName", "sectionName", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemUiData;", "createUnknownItemAndErrorMessage", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemUiData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UseCasesUtilsKt {
    public static /* synthetic */ java.lang.String getText$default(com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        return getText(settingsItemStatus, str, str2, str3, str4);
    }

    public static final java.lang.String getText(com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsItemStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        if (settingsItemStatus instanceof com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle) {
            return "";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(settingsItemStatus, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Action.INSTANCE)) {
            return str4;
        }
        if (!(settingsItemStatus instanceof com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        int i = com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge) settingsItemStatus).getType().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return str2;
        }
        if (i == 3) {
            return str3;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "   ";
    }

    public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData createUnknownItemAndErrorMessage(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown ");
        sb.append(str2);
        sb.append(" setting item: ");
        sb.append(str);
        com.paypal.android.logger.Logger.e$default(logger, sb.toString(), null, null, null, 14, null);
        return new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Section.UNKNOWN.concat(java.lang.String.valueOf(str)), "", "", null, null, false, false, false, null, false, null, androidx.media3.common.PlaybackException.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.domain.model.BadgeType.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.domain.model.BadgeType.Positive.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.domain.model.BadgeType.Negative.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.domain.model.BadgeType.Warning.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.domain.model.BadgeType.Loading.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
