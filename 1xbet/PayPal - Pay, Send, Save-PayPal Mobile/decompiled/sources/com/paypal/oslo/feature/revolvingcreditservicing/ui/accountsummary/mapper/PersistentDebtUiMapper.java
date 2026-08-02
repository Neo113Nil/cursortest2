package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/PersistentDebtUiMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;", "phoneNumberFormatter", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PersistentDebt;", "persistentDebt", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/PersistentDebtUiModel;", "toUiModel$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PersistentDebt;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/PersistentDebtUiModel;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PersistentDebtUiMapper {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PersistentDebtUiMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade phoneNumberFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberFormatterFacade, "");
        this.Camera2StreamConfigurationMap = phoneNumberFormatterFacade;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        if (r3.intValue() != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
    
        r3 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_persistent_debt_more_info_link);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009e, code lost:
    
        if (r3.intValue() != 4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:
    
        r16 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_persistent_debt_stage_4, new java.lang.Object[]{r22.getTimeDuration(), java.lang.String.valueOf(r22.getStage().intValue())}, r23, false, 8, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.PersistentDebtUiModel toUiModel$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt persistentDebt, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.LinkedText linkedText;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper persistentDebtUiMapper;
        java.lang.Integer stage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        if (persistentDebt == null) {
            return null;
        }
        try {
            try {
                if (persistentDebt.getTimeDuration() == null) {
                    throw new java.lang.IllegalStateException("Missing timeDuration".toString());
                }
                java.lang.Integer stage2 = persistentDebt.getStage();
                if (stage2 != null && stage2.intValue() == 1) {
                    stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_persistent_debt_stage_1, new java.lang.Object[]{persistentDebt.getTimeDuration(), java.lang.String.valueOf(persistentDebt.getStage().intValue())}, cpi, false, 8, null);
                } else {
                    if ((stage2 != null && stage2.intValue() == 2) || (stage2 != null && stage2.intValue() == 3)) {
                        stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_persistent_debt_stage_2_and_3, new java.lang.Object[]{persistentDebt.getTimeDuration(), java.lang.String.valueOf(persistentDebt.getStage().intValue())}, cpi, false, 8, null);
                    }
                    throw new java.lang.IllegalStateException("Unknown stage ".concat(java.lang.String.valueOf(persistentDebt.getStage())).toString());
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter2 = stringResWithParameter;
                if (persistentDebt.getPersistentDebtUrl() != null) {
                    java.lang.Integer stage3 = persistentDebt.getStage();
                    if ((stage3 != null && stage3.intValue() == 1) || ((stage3 != null && stage3.intValue() == 2) || (stage3 != null && stage3.intValue() == 3))) {
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_persistent_debt_how_to_link);
                        linkedText = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.LinkedText(persistentDebt.getPersistentDebtUrl(), uiString);
                        persistentDebtUiMapper = this;
                    }
                    throw new java.lang.IllegalStateException("Unknown stage ".concat(java.lang.String.valueOf(persistentDebt.getStage())).toString());
                }
                persistentDebtUiMapper = this;
                linkedText = null;
                java.lang.String format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade.format$default(persistentDebtUiMapper.Camera2StreamConfigurationMap, persistentDebt.getSupportPhoneNumber(), false, null, 6, null);
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.PersistentDebtUiModel(stringResWithParameter2, linkedText, (format$default == null || (stage = persistentDebt.getStage()) == null || stage.intValue() != 4) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.LinkedText(format$default, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_persistent_debt_call_us_link, new java.lang.Object[]{format$default}, null, false, 12, null)));
            } catch (java.lang.IllegalStateException e) {
                e = e;
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log;
                java.lang.String message = e.getMessage();
                com.paypal.android.logger.Logger.w$default(logger, message == null ? "" : message, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("persistentDebt", persistentDebt)), null, 4, null);
                return null;
            }
        } catch (java.lang.IllegalStateException e2) {
            e = e2;
        }
    }
}
