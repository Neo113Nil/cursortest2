package com.paypal.oslo.feature.subscriptions.hub.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionListPreviewParams;", "", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "item", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;)Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionListPreviewParams;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SubscriptionListPreviewParams {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel item;

    public SubscriptionListPreviewParams(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
        this.item = subscriptionItemUiModel;
    }

    public final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel getItem() {
        return this.item;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ SubscriptionListPreviewParams(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r17 = this;
            r0 = r19 & 1
            if (r0 == 0) goto L4f
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType$Subscription r0 = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE
            com.paypal.oslo.feature.subscriptions.hub.domain.Merchant r7 = new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant
            java.lang.String r1 = "Default Service"
            r2 = 0
            java.lang.String r3 = "merchant_id"
            r7.<init>(r3, r1, r2)
            com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData r1 = com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel r8 = r1.getCreditCard()
            java.lang.String r9 = "fi_preferred"
            r10 = 0
            java.lang.String r11 = "Credit"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 58
            r16 = 0
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel r5 = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData r1 = com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel r8 = r1.getPaypalBalance()
            java.lang.String r9 = "fi_balance"
            r11 = 0
            r15 = 62
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel r6 = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel r8 = new com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel
            java.lang.String r1 = "$9.99"
            java.lang.String r2 = "Paid Jan 15"
            r8.<init>(r1, r2)
            r3 = r0
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType r3 = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) r3
            com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel r0 = new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel
            java.lang.String r2 = "sub_default"
            r4 = 0
            r9 = 4
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r17
            goto L53
        L4f:
            r1 = r17
            r0 = r18
        L53:
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams.<init>(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel = this.item;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionListPreviewParams(item=");
        sb.append(subscriptionItemUiModel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.item.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams) other).item);
    }

    public final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams copy(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        return new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(item);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel getItem() {
        return this.item;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams copy$default(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams subscriptionListPreviewParams, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            subscriptionItemUiModel = subscriptionListPreviewParams.item;
        }
        return subscriptionListPreviewParams.copy(subscriptionItemUiModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionListPreviewParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
