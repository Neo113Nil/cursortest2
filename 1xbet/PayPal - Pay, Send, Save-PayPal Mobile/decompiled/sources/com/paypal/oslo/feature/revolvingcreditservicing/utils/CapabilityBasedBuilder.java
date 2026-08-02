package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CapabilityBasedBuilder;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CardItemBuilder;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductCapability;", "capability", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "config", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;", "builder", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductCapability;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;Lkotlin/jvm/functions/Function1;)V", "details", "build", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductCapability;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CapabilityBasedBuilder implements com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public CapabilityBasedBuilder(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability productCapability, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails, ? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCapability, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productConfigurations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = productCapability;
        this.getHighSpeedVideoFpsRanges = productConfigurations;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder
    public final java.lang.Object build(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> continuation) {
        if (this.getHighSpeedVideoFpsRanges.checkCapability(this.getHighSpeedVideoFpsRangesFor)) {
            return this.getHighResolutionOutputSizeshNQ4ISI.invoke(manageCardDetails);
        }
        return null;
    }
}
