package com.paypal.oslo.feature.wallet.banks.ui.details;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankDetailViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner bankBanner, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        try {
            androidx.navigation3.runtime.NavKey destination = bankBanner.getClickableSegments().get(java.lang.Integer.parseInt(str2)).getDestination();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(destination.getClass()).getSimpleName();
            if (simpleName != null) {
                str3 = simpleName;
            }
            com.paypal.android.logger.Logger.i$default(logger, "Banner link clicked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("destination", str3)), null, 4, null);
            function1.invoke(destination);
        } catch (java.lang.IndexOutOfBoundsException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Banner link index out of bounds", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tag", str2)), null, e, 4, null);
        } catch (java.lang.NumberFormatException e2) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to parse banner link tag", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tag", str2)), null, e2, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailInfo access$toUiState(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, android.content.Context context, com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil getBankBannersUiUtil, final kotlin.jvm.functions.Function1 function1) {
        java.lang.String str;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus confirmationStatus;
        java.lang.String string;
        com.paypal.pds.components.BannerStyle.Warning warning;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner> invoke = getBankBannersUiUtil.invoke(bankAccountDetails);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(invoke, 10));
        for (final com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner bankBanner : invoke) {
            int i = 0;
            if (bankBanner.getMessageArgs().isEmpty()) {
                string = context.getString(bankBanner.getMessageResId());
            } else if (bankBanner.getMessageArgs().size() == 1) {
                string = context.getString(bankBanner.getMessageResId(), bankBanner.getMessageArgs().get(0));
            } else {
                int messageResId = bankBanner.getMessageResId();
                java.lang.String[] strArr = (java.lang.String[]) bankBanner.getMessageArgs().toArray(new java.lang.String[0]);
                string = context.getString(messageResId, java.util.Arrays.copyOf(strArr, strArr.length));
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment> clickableSegments = bankBanner.getClickableSegments();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(clickableSegments, 10));
            for (java.lang.Object obj : clickableSegments) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.lang.String string2 = context.getString(((com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment) obj).getTextResId());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList2.add(kotlin.TuplesKt.to(string2, java.lang.String.valueOf(i)));
                i++;
            }
            com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(string, arrayList2);
            int i2 = com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModelKt.WhenMappings.$EnumSwitchMapping$0[bankBanner.getStyle().ordinal()];
            if (i2 == 1) {
                warning = com.paypal.pds.components.BannerStyle.Warning.INSTANCE;
            } else if (i2 == 2) {
                warning = com.paypal.pds.components.BannerStyle.Info.INSTANCE.invoke(com.paypal.pds.core.Icon.Lightning.INSTANCE);
            } else {
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                warning = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
            }
            arrayList.add(new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailBanner(richText, warning, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModelKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModelKt.Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner.this, function1, (java.lang.String) obj2, (java.lang.String) obj3);
                    return Camera2StreamConfigurationMap;
                }
            }));
        }
        java.util.ArrayList arrayList3 = arrayList;
        com.paypal.pds.core.Icon.Bank bank = com.paypal.pds.core.Icon.Bank.INSTANCE;
        java.lang.String string3 = context.getString(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_details_icon_description);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage institutionImage = (com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) bankAccountDetails.getInstitutionImages());
        if (institutionImage == null || (str = institutionImage.getUrl()) == null || kotlin.text.StringsKt.isBlank(str)) {
            str = null;
        }
        java.lang.String str2 = str;
        java.lang.String name2 = bankAccountDetails.getIssuer().getName();
        java.lang.String nickname = bankAccountDetails.getNickname();
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type = bankAccountDetails.getType();
        java.lang.String string4 = context.getString(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_details_routing_not_available);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
        java.lang.String lastNChars = bankAccountDetails.getLastNChars();
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation confirmation = bankAccountDetails.getConfirmation();
        if (confirmation == null || (confirmationStatus = confirmation.getStatus()) == null) {
            confirmationStatus = com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.UNKNOWN;
        }
        return new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailInfo(arrayList3, bank, string3, str2, name2, nickname, type, string4, lastNChars, confirmationStatus);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle.WARNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle.INFO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
