package com.paypal.oslo.feature.moneymovement.ui.transfer;

@kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010#\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010$J)\u0010*\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J/\u0010/\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020-2\u0006\u0010\u0015\u001a\u00020.2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J/\u00104\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u0002012\u0006\u0010\u001c\u001a\u0002022\u0006\u0010\u0015\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u00105J/\u00109\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u0002062\u0006\u0010\u001c\u001a\u0002072\u0006\u0010\u0015\u001a\u0002082\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u0010:J'\u0010=\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020;2\u0006\u0010\u0015\u001a\u00020<2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010?\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010F\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010HR\u0014\u0010K\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/TransferScreenComponentsImpl;", "Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/purposefield/PurposeField;", "purposeField", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/purposecodeaccordion/PurposeCodeAccordion;", "purposeCodeAccordion", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/paymenttypeaccordion/PaymentTypeAccordion;", "paymentTypeAccordion", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/PlanAccordion;", "planAccordion", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/ShippingAccordion;", "shippingAccordion", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/TransferPeriodAccordion;", "transferPeriodAccordion", "Lcom/paypal/oslo/feature/moneymovement/ui/summary/Summary;", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "<init>", "(Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/purposefield/PurposeField;Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/purposecodeaccordion/PurposeCodeAccordion;Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/paymenttypeaccordion/PaymentTypeAccordion;Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/PlanAccordion;Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/ShippingAccordion;Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/TransferPeriodAccordion;Lcom/paypal/oslo/feature/moneymovement/ui/summary/Summary;)V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig;", "config", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldCallbacks;", "callbacks", "Landroidx/compose/ui/Modifier;", "modifier", "", "PurposeField", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeFieldCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCodeAccordionCallbacks;", "PurposeCodeAccordion", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeAccordionData;Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCodeAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionCallbacks;", "PaymentTypeAccordion", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "selectedTypeId", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "enabled", "createPaymentTypeData", "(Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionCallbacks;", "PlanAccordion", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionCallbacks;", "ShippingAccordion", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionData;Lcom/paypal/oslo/feature/moneymovement/api/ui/shipping/ShippingAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionCallbacks;", "TransferPeriodAccordion", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionConfig;Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionData;Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryCallbacks;", "Summary", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData;Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/purposefield/PurposeField;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/purposecodeaccordion/PurposeCodeAccordion;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/paymenttypeaccordion/PaymentTypeAccordion;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/PlanAccordion;", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/ShippingAccordion;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/transferperiodaccordion/TransferPeriodAccordion;", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/moneymovement/ui/summary/Summary;", "getInputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferScreenComponentsImpl implements com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.moneymovement.ui.summary.Summary getInputFormats;

    @javax.inject.Inject
    public TransferScreenComponentsImpl(com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField purposeField, com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion purposeCodeAccordion, com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion paymentTypeAccordion, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion planAccordion, com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion shippingAccordion, com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion transferPeriodAccordion, com.paypal.oslo.feature.moneymovement.ui.summary.Summary summary) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeCodeAccordion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planAccordion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferPeriodAccordion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(summary, "");
        this.Camera2StreamConfigurationMap = purposeField;
        this.getHighSpeedVideoFpsRangesFor = purposeCodeAccordion;
        this.getHighSpeedVideoFpsRanges = paymentTypeAccordion;
        this.getHighSpeedVideoSizes = planAccordion;
        this.getHighResolutionOutputSizeshNQ4ISI = shippingAccordion;
        this.getHighSpeedVideoSizesFor = transferPeriodAccordion;
        this.getInputFormats = summary;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents
    public final void PurposeField(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldConfig purposeFieldConfig, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeFieldCallbacks purposeFieldCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeFieldConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeFieldCallbacks, "");
        composer.startReplaceGroup(1076867038);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1076867038, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl.PurposeField (TransferScreenComponentsImpl.kt:67)");
        }
        this.Camera2StreamConfigurationMap.Content(purposeFieldConfig, purposeFieldCallbacks, modifier, composer, i & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents
    public final void PurposeCodeAccordion(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeAccordionData purposeAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCodeAccordionCallbacks purposeCodeAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purposeCodeAccordionCallbacks, "");
        composer.startReplaceGroup(-902800558);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-902800558, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl.PurposeCodeAccordion (TransferScreenComponentsImpl.kt:80)");
        }
        this.getHighSpeedVideoFpsRangesFor.Content(purposeAccordionData, purposeCodeAccordionCallbacks, modifier, composer, i & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents
    public final void PaymentTypeAccordion(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig paymentTypeAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData paymentTypeAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks paymentTypeAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionCallbacks, "");
        composer.startReplaceGroup(-300342024);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-300342024, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl.PaymentTypeAccordion (TransferScreenComponentsImpl.kt:94)");
        }
        this.getHighSpeedVideoFpsRanges.Content(paymentTypeAccordionConfig, paymentTypeAccordionData, paymentTypeAccordionCallbacks, modifier, composer, i & 8190, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents
    public final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData createPaymentTypeData(java.lang.String str, boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-2039272484);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2039272484, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl.createPaymentTypeData (TransferScreenComponentsImpl.kt:108)");
        }
        com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData fromDomainModels = com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.INSTANCE.fromDomainModels(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.moneymovement.api.domain.PaymentType[]{new com.paypal.oslo.feature.moneymovement.api.domain.PaymentType(com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.FRIENDS_FAMILY, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_paymenttype_friends_family_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_paymenttype_friends_family_description, composer, 0), "SMILEY", null, null), new com.paypal.oslo.feature.moneymovement.api.domain.PaymentType(com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.GOODS_SERVICES, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_paymenttype_goods_services_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_paymenttype_goods_services_description, composer, 0), "STORE", null, new com.paypal.oslo.feature.moneymovement.api.domain.PaymentType.InfoLink(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_paymenttype_purchase_protection_link, composer, 0), "https://www.paypal.com/us/webapps/mpp/paypal-safety-and-security"))}), str, z, z2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fromDomainModels;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents
    public final void PlanAccordion(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionConfig planAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks planAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planAccordionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planAccordionCallbacks, "");
        composer.startReplaceGroup(-516017840);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-516017840, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl.PlanAccordion (TransferScreenComponentsImpl.kt:141)");
        }
        this.getHighSpeedVideoSizes.Content(planAccordionConfig, planAccordionData, planAccordionCallbacks, modifier, composer, i & 8190, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents
    public final void ShippingAccordion(com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData shippingAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks shippingAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionCallbacks, "");
        composer.startReplaceGroup(1902870500);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1902870500, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl.ShippingAccordion (TransferScreenComponentsImpl.kt:156)");
        }
        this.getHighResolutionOutputSizeshNQ4ISI.Content(shippingAccordionConfig, shippingAccordionData, shippingAccordionCallbacks, modifier, composer, i & 8190, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents
    public final void TransferPeriodAccordion(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig transferPeriodAccordionConfig, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionData transferPeriodAccordionData, com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionCallbacks transferPeriodAccordionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferPeriodAccordionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferPeriodAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferPeriodAccordionCallbacks, "");
        composer.startReplaceGroup(-1606334500);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1606334500, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl.TransferPeriodAccordion (TransferScreenComponentsImpl.kt:171)");
        }
        this.getHighSpeedVideoSizesFor.Content(transferPeriodAccordionConfig, transferPeriodAccordionData, transferPeriodAccordionCallbacks, modifier, composer, i & 8190, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents
    public final void Summary(com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData summaryData, com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryCallbacks summaryCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(summaryData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(summaryCallbacks, "");
        composer.startReplaceGroup(-1680975376);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1680975376, i, -1, "com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl.Summary (TransferScreenComponentsImpl.kt:185)");
        }
        this.getInputFormats.Content(summaryData, summaryCallbacks, modifier, composer, i & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
