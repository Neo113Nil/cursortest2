package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/widget/model/DebitCardWidget;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Success;", "toWidgetSuccessState", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/widget/model/DebitCardWidget;Landroid/content/Context;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState$Success;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWidgetDomainToUiMapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (r6 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success toWidgetSuccessState(com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget debitCardWidget, android.content.Context context) {
        java.lang.String string;
        java.lang.String str;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState;
        java.lang.String estimatedArrivalDate;
        java.lang.String str2;
        java.lang.String formatToMonthDayYear;
        int i;
        java.lang.String string2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWidget, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string3 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_widget_product_name, debitCardWidget.getLastFourDigits());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState2 = debitCardWidget.getDisplayState();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState lifecycleState = debitCardWidget.getLifecycleState();
        java.lang.String lastFourDigits = debitCardWidget.getLastFourDigits();
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName fromValue = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.fromValue(debitCardWidget.getProductName());
        java.lang.String id = debitCardWidget.getId();
        com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel.Companion companion = com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel.INSTANCE;
        switch (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitCardWidget.getDisplayState().ordinal()]) {
            case 1:
                string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_locked);
                str = string;
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState3 = debitCardWidget.getDisplayState();
                displayState = debitCardWidget.getDisplayState();
                estimatedArrivalDate = debitCardWidget.getEstimatedArrivalDate();
                if (estimatedArrivalDate != null && (formatToMonthDayYear = com.paypal.oslo.feature.debitcard.shared.util.DateFormattingExtensionsKt.formatToMonthDayYear(estimatedArrivalDate)) != null) {
                    i = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[displayState.ordinal()];
                    if (i != 2) {
                        if (i == 4) {
                            string2 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_widget_ordered_state_description, formatToMonthDayYear);
                            str2 = string2;
                            int i2 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitCardWidget.getDisplayState().ordinal()];
                            com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel create = companion.create(string3, str, displayState3, str2, (i2 != 2 || i2 == 5) ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate) : null, debitCardWidget.getCardArtUrl());
                            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus = debitCardWidget.getPinStatus();
                            java.lang.String billingAddressId = debitCardWidget.getBillingAddressId();
                            java.lang.String displayAddress = debitCardWidget.getDisplayAddress();
                            java.lang.String str3 = displayAddress == null ? "" : displayAddress;
                            java.lang.String cardArtUrl = debitCardWidget.getCardArtUrl();
                            java.lang.String str4 = cardArtUrl == null ? "" : cardArtUrl;
                            java.lang.String largeCardArtUrl = debitCardWidget.getLargeCardArtUrl();
                            return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success(displayState2, lifecycleState, lastFourDigits, fromValue, id, create, pinStatus, billingAddressId, str3, str4, largeCardArtUrl != null ? largeCardArtUrl : "", string3, debitCardWidget.getEstimatedArrivalDate());
                        }
                    }
                    string2 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_shipped_activate_state_description, formatToMonthDayYear);
                    str2 = string2;
                    int i22 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitCardWidget.getDisplayState().ordinal()];
                    com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel create2 = companion.create(string3, str, displayState3, str2, (i22 != 2 || i22 == 5) ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate) : null, debitCardWidget.getCardArtUrl());
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus2 = debitCardWidget.getPinStatus();
                    java.lang.String billingAddressId2 = debitCardWidget.getBillingAddressId();
                    java.lang.String displayAddress2 = debitCardWidget.getDisplayAddress();
                    if (displayAddress2 == null) {
                    }
                    java.lang.String cardArtUrl2 = debitCardWidget.getCardArtUrl();
                    if (cardArtUrl2 == null) {
                    }
                    java.lang.String largeCardArtUrl2 = debitCardWidget.getLargeCardArtUrl();
                    return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success(displayState2, lifecycleState, lastFourDigits, fromValue, id, create2, pinStatus2, billingAddressId2, str3, str4, largeCardArtUrl2 != null ? largeCardArtUrl2 : "", string3, debitCardWidget.getEstimatedArrivalDate());
                }
                str2 = null;
                int i222 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitCardWidget.getDisplayState().ordinal()];
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel create22 = companion.create(string3, str, displayState3, str2, (i222 != 2 || i222 == 5) ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate) : null, debitCardWidget.getCardArtUrl());
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus22 = debitCardWidget.getPinStatus();
                java.lang.String billingAddressId22 = debitCardWidget.getBillingAddressId();
                java.lang.String displayAddress22 = debitCardWidget.getDisplayAddress();
                if (displayAddress22 == null) {
                }
                java.lang.String cardArtUrl22 = debitCardWidget.getCardArtUrl();
                if (cardArtUrl22 == null) {
                }
                java.lang.String largeCardArtUrl22 = debitCardWidget.getLargeCardArtUrl();
                return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success(displayState2, lifecycleState, lastFourDigits, fromValue, id, create22, pinStatus22, billingAddressId22, str3, str4, largeCardArtUrl22 != null ? largeCardArtUrl22 : "", string3, debitCardWidget.getEstimatedArrivalDate());
            case 2:
                string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate);
                str = string;
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState32 = debitCardWidget.getDisplayState();
                displayState = debitCardWidget.getDisplayState();
                estimatedArrivalDate = debitCardWidget.getEstimatedArrivalDate();
                if (estimatedArrivalDate != null) {
                    i = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[displayState.ordinal()];
                    if (i != 2) {
                    }
                    string2 = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_shipped_activate_state_description, formatToMonthDayYear);
                    str2 = string2;
                    int i2222 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitCardWidget.getDisplayState().ordinal()];
                    com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel create222 = companion.create(string3, str, displayState32, str2, (i2222 != 2 || i2222 == 5) ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate) : null, debitCardWidget.getCardArtUrl());
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus222 = debitCardWidget.getPinStatus();
                    java.lang.String billingAddressId222 = debitCardWidget.getBillingAddressId();
                    java.lang.String displayAddress222 = debitCardWidget.getDisplayAddress();
                    if (displayAddress222 == null) {
                    }
                    java.lang.String cardArtUrl222 = debitCardWidget.getCardArtUrl();
                    if (cardArtUrl222 == null) {
                    }
                    java.lang.String largeCardArtUrl222 = debitCardWidget.getLargeCardArtUrl();
                    return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success(displayState2, lifecycleState, lastFourDigits, fromValue, id, create222, pinStatus222, billingAddressId222, str3, str4, largeCardArtUrl222 != null ? largeCardArtUrl222 : "", string3, debitCardWidget.getEstimatedArrivalDate());
                }
                str2 = null;
                int i22222 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitCardWidget.getDisplayState().ordinal()];
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel create2222 = companion.create(string3, str, displayState32, str2, (i22222 != 2 || i22222 == 5) ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate) : null, debitCardWidget.getCardArtUrl());
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus2222 = debitCardWidget.getPinStatus();
                java.lang.String billingAddressId2222 = debitCardWidget.getBillingAddressId();
                java.lang.String displayAddress2222 = debitCardWidget.getDisplayAddress();
                if (displayAddress2222 == null) {
                }
                java.lang.String cardArtUrl2222 = debitCardWidget.getCardArtUrl();
                if (cardArtUrl2222 == null) {
                }
                java.lang.String largeCardArtUrl2222 = debitCardWidget.getLargeCardArtUrl();
                return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success(displayState2, lifecycleState, lastFourDigits, fromValue, id, create2222, pinStatus2222, billingAddressId2222, str3, str4, largeCardArtUrl2222 != null ? largeCardArtUrl2222 : "", string3, debitCardWidget.getEstimatedArrivalDate());
            case 3:
                string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_deactivated);
                str = string;
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState322 = debitCardWidget.getDisplayState();
                displayState = debitCardWidget.getDisplayState();
                estimatedArrivalDate = debitCardWidget.getEstimatedArrivalDate();
                if (estimatedArrivalDate != null) {
                }
                str2 = null;
                int i222222 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitCardWidget.getDisplayState().ordinal()];
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel create22222 = companion.create(string3, str, displayState322, str2, (i222222 != 2 || i222222 == 5) ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate) : null, debitCardWidget.getCardArtUrl());
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus22222 = debitCardWidget.getPinStatus();
                java.lang.String billingAddressId22222 = debitCardWidget.getBillingAddressId();
                java.lang.String displayAddress22222 = debitCardWidget.getDisplayAddress();
                if (displayAddress22222 == null) {
                }
                java.lang.String cardArtUrl22222 = debitCardWidget.getCardArtUrl();
                if (cardArtUrl22222 == null) {
                }
                java.lang.String largeCardArtUrl22222 = debitCardWidget.getLargeCardArtUrl();
                return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success(displayState2, lifecycleState, lastFourDigits, fromValue, id, create22222, pinStatus22222, billingAddressId22222, str3, str4, largeCardArtUrl22222 != null ? largeCardArtUrl22222 : "", string3, debitCardWidget.getEstimatedArrivalDate());
            case 4:
                string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_ordered);
                str = string;
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState3222 = debitCardWidget.getDisplayState();
                displayState = debitCardWidget.getDisplayState();
                estimatedArrivalDate = debitCardWidget.getEstimatedArrivalDate();
                if (estimatedArrivalDate != null) {
                }
                str2 = null;
                int i2222222 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitCardWidget.getDisplayState().ordinal()];
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel create222222 = companion.create(string3, str, displayState3222, str2, (i2222222 != 2 || i2222222 == 5) ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate) : null, debitCardWidget.getCardArtUrl());
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus222222 = debitCardWidget.getPinStatus();
                java.lang.String billingAddressId222222 = debitCardWidget.getBillingAddressId();
                java.lang.String displayAddress222222 = debitCardWidget.getDisplayAddress();
                if (displayAddress222222 == null) {
                }
                java.lang.String cardArtUrl222222 = debitCardWidget.getCardArtUrl();
                if (cardArtUrl222222 == null) {
                }
                java.lang.String largeCardArtUrl222222 = debitCardWidget.getLargeCardArtUrl();
                return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success(displayState2, lifecycleState, lastFourDigits, fromValue, id, create222222, pinStatus222222, billingAddressId222222, str3, str4, largeCardArtUrl222222 != null ? largeCardArtUrl222222 : "", string3, debitCardWidget.getEstimatedArrivalDate());
            case 5:
                string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_shipped);
                str = string;
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState32222 = debitCardWidget.getDisplayState();
                displayState = debitCardWidget.getDisplayState();
                estimatedArrivalDate = debitCardWidget.getEstimatedArrivalDate();
                if (estimatedArrivalDate != null) {
                }
                str2 = null;
                int i22222222 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitCardWidget.getDisplayState().ordinal()];
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel create2222222 = companion.create(string3, str, displayState32222, str2, (i22222222 != 2 || i22222222 == 5) ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate) : null, debitCardWidget.getCardArtUrl());
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus2222222 = debitCardWidget.getPinStatus();
                java.lang.String billingAddressId2222222 = debitCardWidget.getBillingAddressId();
                java.lang.String displayAddress2222222 = debitCardWidget.getDisplayAddress();
                if (displayAddress2222222 == null) {
                }
                java.lang.String cardArtUrl2222222 = debitCardWidget.getCardArtUrl();
                if (cardArtUrl2222222 == null) {
                }
                java.lang.String largeCardArtUrl2222222 = debitCardWidget.getLargeCardArtUrl();
                return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success(displayState2, lifecycleState, lastFourDigits, fromValue, id, create2222222, pinStatus2222222, billingAddressId2222222, str3, str4, largeCardArtUrl2222222 != null ? largeCardArtUrl2222222 : "", string3, debitCardWidget.getEstimatedArrivalDate());
            case 6:
            case 7:
                str = null;
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState322222 = debitCardWidget.getDisplayState();
                displayState = debitCardWidget.getDisplayState();
                estimatedArrivalDate = debitCardWidget.getEstimatedArrivalDate();
                if (estimatedArrivalDate != null) {
                }
                str2 = null;
                int i222222222 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.WhenMappings.$EnumSwitchMapping$0[debitCardWidget.getDisplayState().ordinal()];
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel create22222222 = companion.create(string3, str, displayState322222, str2, (i222222222 != 2 || i222222222 == 5) ? context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate) : null, debitCardWidget.getCardArtUrl());
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus pinStatus22222222 = debitCardWidget.getPinStatus();
                java.lang.String billingAddressId22222222 = debitCardWidget.getBillingAddressId();
                java.lang.String displayAddress22222222 = debitCardWidget.getDisplayAddress();
                if (displayAddress22222222 == null) {
                }
                java.lang.String cardArtUrl22222222 = debitCardWidget.getCardArtUrl();
                if (cardArtUrl22222222 == null) {
                }
                java.lang.String largeCardArtUrl22222222 = debitCardWidget.getLargeCardArtUrl();
                return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success(displayState2, lifecycleState, lastFourDigits, fromValue, id, create22222222, pinStatus22222222, billingAddressId22222222, str3, str4, largeCardArtUrl22222222 != null ? largeCardArtUrl22222222 : "", string3, debitCardWidget.getEstimatedArrivalDate());
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.LOCKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ACTIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.DEACTIVATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ORDERED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.SHIPPED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ACTIVE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
