package com.paypal.oslo.feature.bnplservicing.domain.model.planlist;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\t()*+,-./0R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0004R\u0014\u0010%\u001a\u00020\"8'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0004\u0082\u0001\u00011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;", "", "", "getCreditAccountId", "()Ljava/lang/String;", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;", "getVariantPolicy", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;", "variantPolicy", "getMerchantLogoUrl", "merchantLogoUrl", "getProductName", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "getStatus", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "status", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;", "getInstrumentFormat", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;", "instrumentFormat", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;", "getUsageChannel", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;", "usageChannel", "getRawValue", "rawValue", "getCurrencyCode", "currencyCode", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/ContextualLabel;", "getContextualLabel", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/ContextualLabel;", "contextualLabel", "getMerchantName", "merchantName", "CommonFieldsPlan", "AlmostCompletePlan", "CompletedPlan", "MaturedPlan", "DelinquentPlan", "OnTrackPlan", "PastDuePlan", "PendingPlan", "ReadyToUsePlan", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CommonFieldsPlan;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PlanListSnapshot {
    com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel getContextualLabel();

    java.lang.String getCreditAccountId();

    com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier();

    java.lang.String getCurrencyCode();

    com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat getInstrumentFormat();

    java.lang.String getMerchantLogoUrl();

    java.lang.String getMerchantName();

    java.lang.String getProductName();

    java.lang.String getRawValue();

    com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus getStatus();

    com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel getUsageChannel();

    com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy getVariantPolicy();

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000bR\u0014\u0010(\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u000bR\u0014\u0010,\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CommonFieldsPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "planCommonFields", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "getPlanCommonFields", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "", "getCreditAccountId", "()Ljava/lang/String;", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;", "getVariantPolicy", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;", "variantPolicy", "getMerchantLogoUrl", "merchantLogoUrl", "getProductName", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "getStatus", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "status", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;", "getInstrumentFormat", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$InstrumentFormat;", "instrumentFormat", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;", "getUsageChannel", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy$UsageChannel;", "usageChannel", "getRawValue", "rawValue", "getCurrencyCode", "currencyCode", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/ContextualLabel;", "getContextualLabel", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/ContextualLabel;", "contextualLabel", "getMerchantName", "merchantName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class CommonFieldsPlan implements com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields;

        public CommonFieldsPlan(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            this.planCommonFields = planCommonFields;
        }

        protected com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public java.lang.String getCreditAccountId() {
            return getPlanCommonFields().getCreditAccountId();
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
            return getPlanCommonFields().getCreditProductIdentifier();
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy getVariantPolicy() {
            return getPlanCommonFields().getVariantPolicy();
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public java.lang.String getMerchantLogoUrl() {
            return getPlanCommonFields().getMerchantLogoUrl();
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public java.lang.String getProductName() {
            return getPlanCommonFields().getProductName();
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus getStatus() {
            return getPlanCommonFields().getStatus();
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat getInstrumentFormat() {
            return getPlanCommonFields().getVariantPolicy().getInstrumentFormat();
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel getUsageChannel() {
            return getPlanCommonFields().getVariantPolicy().getUsageChannel();
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public java.lang.String getRawValue() {
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount = getPlanCommonFields().getAmount();
            java.lang.String value = amount != null ? amount.getValue() : null;
            return value == null ? "" : value;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public java.lang.String getCurrencyCode() {
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount = getPlanCommonFields().getAmount();
            java.lang.String currencyCode = amount != null ? amount.getCurrencyCode() : null;
            return currencyCode == null ? "" : currencyCode;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel getContextualLabel() {
            return getPlanCommonFields().getContextualLabel();
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot
        public java.lang.String getMerchantName() {
            return getPlanCommonFields().getMerchantName();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÄ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$AlmostCompletePlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CommonFieldsPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "planCommonFields", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$AlmostCompletePlan;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "getPlanCommonFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AlmostCompletePlan extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlmostCompletePlan(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            super(planCommonFields);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            this.planCommonFields = planCommonFields;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields = this.planCommonFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AlmostCompletePlan(planCommonFields=");
            sb.append(planCommonFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.planCommonFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.AlmostCompletePlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.planCommonFields, ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.AlmostCompletePlan) other).planCommonFields);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.AlmostCompletePlan copy(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.AlmostCompletePlan(planCommonFields);
        }

        /* renamed from: component1, reason: from getter */
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.AlmostCompletePlan copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.AlmostCompletePlan almostCompletePlan, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planCommonFields = almostCompletePlan.planCommonFields;
            }
            return almostCompletePlan.copy(planCommonFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÄ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JN\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CompletedPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CommonFieldsPlan;", "", "planCompletedDateTime", "", "totalInstallmentsPaid", "totalInstallmentsRemaining", "totalInstallmentsCount", "", "isRefundPending", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "planCommonFields", "<init>", "(Ljava/lang/String;IIIZLcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Z", "component6", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "copy", "(Ljava/lang/String;IIIZLcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CompletedPlan;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getPlanCompletedDateTime", com.visa.cbp.getEncExpo.warmup, "getTotalInstallmentsPaid", "getTotalInstallmentsRemaining", "getTotalInstallmentsCount", "Z", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "getPlanCommonFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CompletedPlan extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan {
        public static final int $stable = 0;
        private final boolean isRefundPending;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields;
        private final java.lang.String planCompletedDateTime;
        private final int totalInstallmentsCount;
        private final int totalInstallmentsPaid;
        private final int totalInstallmentsRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompletedPlan(java.lang.String str, int i, int i2, int i3, boolean z, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            super(planCommonFields);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            this.planCompletedDateTime = str;
            this.totalInstallmentsPaid = i;
            this.totalInstallmentsRemaining = i2;
            this.totalInstallmentsCount = i3;
            this.isRefundPending = z;
            this.planCommonFields = planCommonFields;
        }

        public final java.lang.String getPlanCompletedDateTime() {
            return this.planCompletedDateTime;
        }

        public final int getTotalInstallmentsPaid() {
            return this.totalInstallmentsPaid;
        }

        public final int getTotalInstallmentsRemaining() {
            return this.totalInstallmentsRemaining;
        }

        public final int getTotalInstallmentsCount() {
            return this.totalInstallmentsCount;
        }

        public final boolean isRefundPending() {
            return this.isRefundPending;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.planCompletedDateTime;
            int i = this.totalInstallmentsPaid;
            int i2 = this.totalInstallmentsRemaining;
            int i3 = this.totalInstallmentsCount;
            boolean z = this.isRefundPending;
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields = this.planCommonFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CompletedPlan(planCompletedDateTime=");
            sb.append(str);
            sb.append(", totalInstallmentsPaid=");
            sb.append(i);
            sb.append(", totalInstallmentsRemaining=");
            sb.append(i2);
            sb.append(", totalInstallmentsCount=");
            sb.append(i3);
            sb.append(", isRefundPending=");
            sb.append(z);
            sb.append(", planCommonFields=");
            sb.append(planCommonFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.planCompletedDateTime;
            return ((((((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsPaid)) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsRemaining)) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsCount)) * 31) + java.lang.Boolean.hashCode(this.isRefundPending)) * 31) + this.planCommonFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan completedPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.planCompletedDateTime, completedPlan.planCompletedDateTime) && this.totalInstallmentsPaid == completedPlan.totalInstallmentsPaid && this.totalInstallmentsRemaining == completedPlan.totalInstallmentsRemaining && this.totalInstallmentsCount == completedPlan.totalInstallmentsCount && this.isRefundPending == completedPlan.isRefundPending && kotlin.jvm.internal.Intrinsics.areEqual(this.planCommonFields, completedPlan.planCommonFields);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan copy(java.lang.String planCompletedDateTime, int totalInstallmentsPaid, int totalInstallmentsRemaining, int totalInstallmentsCount, boolean isRefundPending, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan(planCompletedDateTime, totalInstallmentsPaid, totalInstallmentsRemaining, totalInstallmentsCount, isRefundPending, planCommonFields);
        }

        /* renamed from: component6, reason: from getter */
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsRefundPending() {
            return this.isRefundPending;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTotalInstallmentsCount() {
            return this.totalInstallmentsCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTotalInstallmentsRemaining() {
            return this.totalInstallmentsRemaining;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTotalInstallmentsPaid() {
            return this.totalInstallmentsPaid;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPlanCompletedDateTime() {
            return this.planCompletedDateTime;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan completedPlan, java.lang.String str, int i, int i2, int i3, boolean z, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                str = completedPlan.planCompletedDateTime;
            }
            if ((i4 & 2) != 0) {
                i = completedPlan.totalInstallmentsPaid;
            }
            int i5 = i;
            if ((i4 & 4) != 0) {
                i2 = completedPlan.totalInstallmentsRemaining;
            }
            int i6 = i2;
            if ((i4 & 8) != 0) {
                i3 = completedPlan.totalInstallmentsCount;
            }
            int i7 = i3;
            if ((i4 & 16) != 0) {
                z = completedPlan.isRefundPending;
            }
            boolean z2 = z;
            if ((i4 & 32) != 0) {
                planCommonFields = completedPlan.planCommonFields;
            }
            return completedPlan.copy(str, i5, i6, i7, z2, planCommonFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÄ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$MaturedPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CommonFieldsPlan;", "", "planCompletedDateTime", "", "isRefundPending", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "planCommonFields", "<init>", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "copy", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$MaturedPlan;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlanCompletedDateTime", "Z", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "getPlanCommonFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MaturedPlan extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan {
        public static final int $stable = 0;
        private final boolean isRefundPending;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields;
        private final java.lang.String planCompletedDateTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaturedPlan(java.lang.String str, boolean z, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            super(planCommonFields);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            this.planCompletedDateTime = str;
            this.isRefundPending = z;
            this.planCommonFields = planCommonFields;
        }

        public final java.lang.String getPlanCompletedDateTime() {
            return this.planCompletedDateTime;
        }

        public final boolean isRefundPending() {
            return this.isRefundPending;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.planCompletedDateTime;
            boolean z = this.isRefundPending;
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields = this.planCommonFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MaturedPlan(planCompletedDateTime=");
            sb.append(str);
            sb.append(", isRefundPending=");
            sb.append(z);
            sb.append(", planCommonFields=");
            sb.append(planCommonFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.planCompletedDateTime;
            return ((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRefundPending)) * 31) + this.planCommonFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan maturedPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.planCompletedDateTime, maturedPlan.planCompletedDateTime) && this.isRefundPending == maturedPlan.isRefundPending && kotlin.jvm.internal.Intrinsics.areEqual(this.planCommonFields, maturedPlan.planCommonFields);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan copy(java.lang.String planCompletedDateTime, boolean isRefundPending, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan(planCompletedDateTime, isRefundPending, planCommonFields);
        }

        /* renamed from: component3, reason: from getter */
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRefundPending() {
            return this.isRefundPending;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPlanCompletedDateTime() {
            return this.planCompletedDateTime;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan maturedPlan, java.lang.String str, boolean z, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = maturedPlan.planCompletedDateTime;
            }
            if ((i & 2) != 0) {
                z = maturedPlan.isRefundPending;
            }
            if ((i & 4) != 0) {
                planCommonFields = maturedPlan.planCommonFields;
            }
            return maturedPlan.copy(str, z, planCommonFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÄ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$DelinquentPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CommonFieldsPlan;", "", "totalInstallmentsPaid", "totalInstallmentsOverdue", "totalInstallmentsRemaining", "totalInstallmentsCount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "planCommonFields", "<init>", "(IIIILcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)V", "component1", "()I", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "copy", "(IIIILcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$DelinquentPlan;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotalInstallmentsPaid", "getTotalInstallmentsOverdue", "getTotalInstallmentsRemaining", "getTotalInstallmentsCount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "getPlanCommonFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DelinquentPlan extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields;
        private final int totalInstallmentsCount;
        private final int totalInstallmentsOverdue;
        private final int totalInstallmentsPaid;
        private final int totalInstallmentsRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DelinquentPlan(int i, int i2, int i3, int i4, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            super(planCommonFields);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            this.totalInstallmentsPaid = i;
            this.totalInstallmentsOverdue = i2;
            this.totalInstallmentsRemaining = i3;
            this.totalInstallmentsCount = i4;
            this.planCommonFields = planCommonFields;
        }

        public final int getTotalInstallmentsPaid() {
            return this.totalInstallmentsPaid;
        }

        public final int getTotalInstallmentsOverdue() {
            return this.totalInstallmentsOverdue;
        }

        public final int getTotalInstallmentsRemaining() {
            return this.totalInstallmentsRemaining;
        }

        public final int getTotalInstallmentsCount() {
            return this.totalInstallmentsCount;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        public final java.lang.String toString() {
            int i = this.totalInstallmentsPaid;
            int i2 = this.totalInstallmentsOverdue;
            int i3 = this.totalInstallmentsRemaining;
            int i4 = this.totalInstallmentsCount;
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields = this.planCommonFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DelinquentPlan(totalInstallmentsPaid=");
            sb.append(i);
            sb.append(", totalInstallmentsOverdue=");
            sb.append(i2);
            sb.append(", totalInstallmentsRemaining=");
            sb.append(i3);
            sb.append(", totalInstallmentsCount=");
            sb.append(i4);
            sb.append(", planCommonFields=");
            sb.append(planCommonFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((java.lang.Integer.hashCode(this.totalInstallmentsPaid) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsOverdue)) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsRemaining)) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsCount)) * 31) + this.planCommonFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan delinquentPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan) other;
            return this.totalInstallmentsPaid == delinquentPlan.totalInstallmentsPaid && this.totalInstallmentsOverdue == delinquentPlan.totalInstallmentsOverdue && this.totalInstallmentsRemaining == delinquentPlan.totalInstallmentsRemaining && this.totalInstallmentsCount == delinquentPlan.totalInstallmentsCount && kotlin.jvm.internal.Intrinsics.areEqual(this.planCommonFields, delinquentPlan.planCommonFields);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan copy(int totalInstallmentsPaid, int totalInstallmentsOverdue, int totalInstallmentsRemaining, int totalInstallmentsCount, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan(totalInstallmentsPaid, totalInstallmentsOverdue, totalInstallmentsRemaining, totalInstallmentsCount, planCommonFields);
        }

        /* renamed from: component5, reason: from getter */
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTotalInstallmentsCount() {
            return this.totalInstallmentsCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTotalInstallmentsRemaining() {
            return this.totalInstallmentsRemaining;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTotalInstallmentsOverdue() {
            return this.totalInstallmentsOverdue;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalInstallmentsPaid() {
            return this.totalInstallmentsPaid;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan delinquentPlan, int i, int i2, int i3, int i4, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                i = delinquentPlan.totalInstallmentsPaid;
            }
            if ((i5 & 2) != 0) {
                i2 = delinquentPlan.totalInstallmentsOverdue;
            }
            int i6 = i2;
            if ((i5 & 4) != 0) {
                i3 = delinquentPlan.totalInstallmentsRemaining;
            }
            int i7 = i3;
            if ((i5 & 8) != 0) {
                i4 = delinquentPlan.totalInstallmentsCount;
            }
            int i8 = i4;
            if ((i5 & 16) != 0) {
                planCommonFields = delinquentPlan.planCommonFields;
            }
            return delinquentPlan.copy(i, i6, i7, i8, planCommonFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÄ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JN\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u0007\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$OnTrackPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CommonFieldsPlan;", "", "totalInstallmentsPaid", "totalInstallmentsRemaining", "totalInstallmentsCount", "", "isDueToday", "", "nextPaymentDueDate", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "planCommonFields", "<init>", "(IIIZLjava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)V", "component1", "()I", "component2", "component3", "component4", "()Z", "component5", "()Ljava/lang/String;", "component6", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "copy", "(IIIZLjava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$OnTrackPlan;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getTotalInstallmentsPaid", "getTotalInstallmentsRemaining", "getTotalInstallmentsCount", "Z", "Ljava/lang/String;", "getNextPaymentDueDate", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "getPlanCommonFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTrackPlan extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan {
        public static final int $stable = 0;
        private final boolean isDueToday;
        private final java.lang.String nextPaymentDueDate;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields;
        private final int totalInstallmentsCount;
        private final int totalInstallmentsPaid;
        private final int totalInstallmentsRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnTrackPlan(int i, int i2, int i3, boolean z, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            super(planCommonFields);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            this.totalInstallmentsPaid = i;
            this.totalInstallmentsRemaining = i2;
            this.totalInstallmentsCount = i3;
            this.isDueToday = z;
            this.nextPaymentDueDate = str;
            this.planCommonFields = planCommonFields;
        }

        public final int getTotalInstallmentsPaid() {
            return this.totalInstallmentsPaid;
        }

        public final int getTotalInstallmentsRemaining() {
            return this.totalInstallmentsRemaining;
        }

        public final int getTotalInstallmentsCount() {
            return this.totalInstallmentsCount;
        }

        public final boolean isDueToday() {
            return this.isDueToday;
        }

        public final java.lang.String getNextPaymentDueDate() {
            return this.nextPaymentDueDate;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        public final java.lang.String toString() {
            int i = this.totalInstallmentsPaid;
            int i2 = this.totalInstallmentsRemaining;
            int i3 = this.totalInstallmentsCount;
            boolean z = this.isDueToday;
            java.lang.String str = this.nextPaymentDueDate;
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields = this.planCommonFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTrackPlan(totalInstallmentsPaid=");
            sb.append(i);
            sb.append(", totalInstallmentsRemaining=");
            sb.append(i2);
            sb.append(", totalInstallmentsCount=");
            sb.append(i3);
            sb.append(", isDueToday=");
            sb.append(z);
            sb.append(", nextPaymentDueDate=");
            sb.append(str);
            sb.append(", planCommonFields=");
            sb.append(planCommonFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.totalInstallmentsPaid);
            int hashCode2 = java.lang.Integer.hashCode(this.totalInstallmentsRemaining);
            int hashCode3 = java.lang.Integer.hashCode(this.totalInstallmentsCount);
            int hashCode4 = java.lang.Boolean.hashCode(this.isDueToday);
            java.lang.String str = this.nextPaymentDueDate;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.planCommonFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan onTrackPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan) other;
            return this.totalInstallmentsPaid == onTrackPlan.totalInstallmentsPaid && this.totalInstallmentsRemaining == onTrackPlan.totalInstallmentsRemaining && this.totalInstallmentsCount == onTrackPlan.totalInstallmentsCount && this.isDueToday == onTrackPlan.isDueToday && kotlin.jvm.internal.Intrinsics.areEqual(this.nextPaymentDueDate, onTrackPlan.nextPaymentDueDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.planCommonFields, onTrackPlan.planCommonFields);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan copy(int totalInstallmentsPaid, int totalInstallmentsRemaining, int totalInstallmentsCount, boolean isDueToday, java.lang.String nextPaymentDueDate, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan(totalInstallmentsPaid, totalInstallmentsRemaining, totalInstallmentsCount, isDueToday, nextPaymentDueDate, planCommonFields);
        }

        /* renamed from: component6, reason: from getter */
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNextPaymentDueDate() {
            return this.nextPaymentDueDate;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsDueToday() {
            return this.isDueToday;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTotalInstallmentsCount() {
            return this.totalInstallmentsCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTotalInstallmentsRemaining() {
            return this.totalInstallmentsRemaining;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalInstallmentsPaid() {
            return this.totalInstallmentsPaid;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan onTrackPlan, int i, int i2, int i3, boolean z, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = onTrackPlan.totalInstallmentsPaid;
            }
            if ((i4 & 2) != 0) {
                i2 = onTrackPlan.totalInstallmentsRemaining;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                i3 = onTrackPlan.totalInstallmentsCount;
            }
            int i6 = i3;
            if ((i4 & 8) != 0) {
                z = onTrackPlan.isDueToday;
            }
            boolean z2 = z;
            if ((i4 & 16) != 0) {
                str = onTrackPlan.nextPaymentDueDate;
            }
            java.lang.String str2 = str;
            if ((i4 & 32) != 0) {
                planCommonFields = onTrackPlan.planCommonFields;
            }
            return onTrackPlan.copy(i, i5, i6, z2, str2, planCommonFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÄ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$PastDuePlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CommonFieldsPlan;", "", "totalInstallmentsPaid", "totalInstallmentsRemaining", "totalInstallmentsOverdue", "totalInstallmentsCount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "planCommonFields", "<init>", "(IIIILcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)V", "component1", "()I", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "copy", "(IIIILcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$PastDuePlan;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotalInstallmentsPaid", "getTotalInstallmentsRemaining", "getTotalInstallmentsOverdue", "getTotalInstallmentsCount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "getPlanCommonFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PastDuePlan extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields;
        private final int totalInstallmentsCount;
        private final int totalInstallmentsOverdue;
        private final int totalInstallmentsPaid;
        private final int totalInstallmentsRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PastDuePlan(int i, int i2, int i3, int i4, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            super(planCommonFields);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            this.totalInstallmentsPaid = i;
            this.totalInstallmentsRemaining = i2;
            this.totalInstallmentsOverdue = i3;
            this.totalInstallmentsCount = i4;
            this.planCommonFields = planCommonFields;
        }

        public final int getTotalInstallmentsPaid() {
            return this.totalInstallmentsPaid;
        }

        public final int getTotalInstallmentsRemaining() {
            return this.totalInstallmentsRemaining;
        }

        public final int getTotalInstallmentsOverdue() {
            return this.totalInstallmentsOverdue;
        }

        public final int getTotalInstallmentsCount() {
            return this.totalInstallmentsCount;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        public final java.lang.String toString() {
            int i = this.totalInstallmentsPaid;
            int i2 = this.totalInstallmentsRemaining;
            int i3 = this.totalInstallmentsOverdue;
            int i4 = this.totalInstallmentsCount;
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields = this.planCommonFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PastDuePlan(totalInstallmentsPaid=");
            sb.append(i);
            sb.append(", totalInstallmentsRemaining=");
            sb.append(i2);
            sb.append(", totalInstallmentsOverdue=");
            sb.append(i3);
            sb.append(", totalInstallmentsCount=");
            sb.append(i4);
            sb.append(", planCommonFields=");
            sb.append(planCommonFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((java.lang.Integer.hashCode(this.totalInstallmentsPaid) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsRemaining)) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsOverdue)) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsCount)) * 31) + this.planCommonFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan pastDuePlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan) other;
            return this.totalInstallmentsPaid == pastDuePlan.totalInstallmentsPaid && this.totalInstallmentsRemaining == pastDuePlan.totalInstallmentsRemaining && this.totalInstallmentsOverdue == pastDuePlan.totalInstallmentsOverdue && this.totalInstallmentsCount == pastDuePlan.totalInstallmentsCount && kotlin.jvm.internal.Intrinsics.areEqual(this.planCommonFields, pastDuePlan.planCommonFields);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan copy(int totalInstallmentsPaid, int totalInstallmentsRemaining, int totalInstallmentsOverdue, int totalInstallmentsCount, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan(totalInstallmentsPaid, totalInstallmentsRemaining, totalInstallmentsOverdue, totalInstallmentsCount, planCommonFields);
        }

        /* renamed from: component5, reason: from getter */
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTotalInstallmentsCount() {
            return this.totalInstallmentsCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTotalInstallmentsOverdue() {
            return this.totalInstallmentsOverdue;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTotalInstallmentsRemaining() {
            return this.totalInstallmentsRemaining;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalInstallmentsPaid() {
            return this.totalInstallmentsPaid;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan pastDuePlan, int i, int i2, int i3, int i4, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                i = pastDuePlan.totalInstallmentsPaid;
            }
            if ((i5 & 2) != 0) {
                i2 = pastDuePlan.totalInstallmentsRemaining;
            }
            int i6 = i2;
            if ((i5 & 4) != 0) {
                i3 = pastDuePlan.totalInstallmentsOverdue;
            }
            int i7 = i3;
            if ((i5 & 8) != 0) {
                i4 = pastDuePlan.totalInstallmentsCount;
            }
            int i8 = i4;
            if ((i5 & 16) != 0) {
                planCommonFields = pastDuePlan.planCommonFields;
            }
            return pastDuePlan.copy(i, i6, i7, i8, planCommonFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÄ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$PendingPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CommonFieldsPlan;", "", "totalInstallmentsPaid", "totalInstallmentsRemaining", "totalInstallmentsCount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "planCommonFields", "<init>", "(IIILcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)V", "component1", "()I", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "copy", "(IIILcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$PendingPlan;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotalInstallmentsPaid", "getTotalInstallmentsRemaining", "getTotalInstallmentsCount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "getPlanCommonFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PendingPlan extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields;
        private final int totalInstallmentsCount;
        private final int totalInstallmentsPaid;
        private final int totalInstallmentsRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingPlan(int i, int i2, int i3, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            super(planCommonFields);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            this.totalInstallmentsPaid = i;
            this.totalInstallmentsRemaining = i2;
            this.totalInstallmentsCount = i3;
            this.planCommonFields = planCommonFields;
        }

        public final int getTotalInstallmentsPaid() {
            return this.totalInstallmentsPaid;
        }

        public final int getTotalInstallmentsRemaining() {
            return this.totalInstallmentsRemaining;
        }

        public final int getTotalInstallmentsCount() {
            return this.totalInstallmentsCount;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        public final java.lang.String toString() {
            int i = this.totalInstallmentsPaid;
            int i2 = this.totalInstallmentsRemaining;
            int i3 = this.totalInstallmentsCount;
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields = this.planCommonFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PendingPlan(totalInstallmentsPaid=");
            sb.append(i);
            sb.append(", totalInstallmentsRemaining=");
            sb.append(i2);
            sb.append(", totalInstallmentsCount=");
            sb.append(i3);
            sb.append(", planCommonFields=");
            sb.append(planCommonFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Integer.hashCode(this.totalInstallmentsPaid) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsRemaining)) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsCount)) * 31) + this.planCommonFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan pendingPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan) other;
            return this.totalInstallmentsPaid == pendingPlan.totalInstallmentsPaid && this.totalInstallmentsRemaining == pendingPlan.totalInstallmentsRemaining && this.totalInstallmentsCount == pendingPlan.totalInstallmentsCount && kotlin.jvm.internal.Intrinsics.areEqual(this.planCommonFields, pendingPlan.planCommonFields);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan copy(int totalInstallmentsPaid, int totalInstallmentsRemaining, int totalInstallmentsCount, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan(totalInstallmentsPaid, totalInstallmentsRemaining, totalInstallmentsCount, planCommonFields);
        }

        /* renamed from: component4, reason: from getter */
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTotalInstallmentsCount() {
            return this.totalInstallmentsCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTotalInstallmentsRemaining() {
            return this.totalInstallmentsRemaining;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalInstallmentsPaid() {
            return this.totalInstallmentsPaid;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan pendingPlan, int i, int i2, int i3, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = pendingPlan.totalInstallmentsPaid;
            }
            if ((i4 & 2) != 0) {
                i2 = pendingPlan.totalInstallmentsRemaining;
            }
            if ((i4 & 4) != 0) {
                i3 = pendingPlan.totalInstallmentsCount;
            }
            if ((i4 & 8) != 0) {
                planCommonFields = pendingPlan.planCommonFields;
            }
            return pendingPlan.copy(i, i2, i3, planCommonFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÄ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$ReadyToUsePlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CommonFieldsPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard$CardArt;", "virtualCardArt", "", "validityDuration", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "planCommonFields", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard$CardArt;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard$CardArt;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard$CardArt;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$ReadyToUsePlan;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard$CardArt;", "getVirtualCardArt", "Ljava/lang/String;", "getValidityDuration", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "getPlanCommonFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyToUsePlan extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields;
        private final java.lang.String validityDuration;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt virtualCardArt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadyToUsePlan(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt cardArt, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            super(planCommonFields);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            this.virtualCardArt = cardArt;
            this.validityDuration = str;
            this.planCommonFields = planCommonFields;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt getVirtualCardArt() {
            return this.virtualCardArt;
        }

        public final java.lang.String getValidityDuration() {
            return this.validityDuration;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt cardArt = this.virtualCardArt;
            java.lang.String str = this.validityDuration;
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields = this.planCommonFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyToUsePlan(virtualCardArt=");
            sb.append(cardArt);
            sb.append(", validityDuration=");
            sb.append(str);
            sb.append(", planCommonFields=");
            sb.append(planCommonFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt cardArt = this.virtualCardArt;
            int hashCode = cardArt == null ? 0 : cardArt.hashCode();
            java.lang.String str = this.validityDuration;
            return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.planCommonFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan readyToUsePlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.virtualCardArt, readyToUsePlan.virtualCardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.validityDuration, readyToUsePlan.validityDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.planCommonFields, readyToUsePlan.planCommonFields);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan copy(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt virtualCardArt, java.lang.String validityDuration, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCommonFields, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan(virtualCardArt, validityDuration, planCommonFields);
        }

        /* renamed from: component3, reason: from getter */
        protected final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getPlanCommonFields() {
            return this.planCommonFields;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValidityDuration() {
            return this.validityDuration;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt getVirtualCardArt() {
            return this.virtualCardArt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan readyToUsePlan, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt cardArt, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields planCommonFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardArt = readyToUsePlan.virtualCardArt;
            }
            if ((i & 2) != 0) {
                str = readyToUsePlan.validityDuration;
            }
            if ((i & 4) != 0) {
                planCommonFields = readyToUsePlan.planCommonFields;
            }
            return readyToUsePlan.copy(cardArt, str, planCommonFields);
        }
    }
}
