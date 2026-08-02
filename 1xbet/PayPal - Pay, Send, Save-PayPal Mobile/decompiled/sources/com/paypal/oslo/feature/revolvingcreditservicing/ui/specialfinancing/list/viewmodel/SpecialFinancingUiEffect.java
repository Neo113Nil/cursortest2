package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToDetail", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect$NavigateToDetail;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SpecialFinancingUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateBack();

        public final int hashCode() {
            return -695938033;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    private SpecialFinancingUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect$NavigateToDetail;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;", "specialFinancingActivityItem", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect$NavigateToDetail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;", "getSpecialFinancingActivityItem", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDetail extends com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity specialFinancingActivityItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToDetail(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
            super("NavigateToDetail", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionalActivity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.specialFinancingActivityItem = promotionalActivity;
            this.cpi = creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity getSpecialFinancingActivityItem() {
            return this.specialFinancingActivityItem;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity = this.specialFinancingActivityItem;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDetail(specialFinancingActivityItem=");
            sb.append(promotionalActivity);
            sb.append(", cpi=");
            sb.append(creditProductIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.specialFinancingActivityItem.hashCode() * 31) + this.cpi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateToDetail)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateToDetail navigateToDetail = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateToDetail) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.specialFinancingActivityItem, navigateToDetail.specialFinancingActivityItem) && this.cpi == navigateToDetail.cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateToDetail copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity specialFinancingActivityItem, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingActivityItem, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateToDetail(specialFinancingActivityItem, cpi);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity getSpecialFinancingActivityItem() {
            return this.specialFinancingActivityItem;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateToDetail copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateToDetail navigateToDetail, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                promotionalActivity = navigateToDetail.specialFinancingActivityItem;
            }
            if ((i & 2) != 0) {
                creditProductIdentifier = navigateToDetail.cpi;
            }
            return navigateToDetail.copy(promotionalActivity, creditProductIdentifier);
        }
    }

    public /* synthetic */ SpecialFinancingUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
