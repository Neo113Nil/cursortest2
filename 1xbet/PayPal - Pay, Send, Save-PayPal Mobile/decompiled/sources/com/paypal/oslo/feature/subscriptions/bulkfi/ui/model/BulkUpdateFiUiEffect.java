package com.paypal.oslo.feature.subscriptions.bulkfi.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "NavigateToUpdateFi", "ShowMaxFiSelectedError", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiUiEffect$NavigateToUpdateFi;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiUiEffect$ShowMaxFiSelectedError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BulkUpdateFiUiEffect extends com.paypal.oslo.core.mvi.UiEffect {

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiUiEffect$NavigateToUpdateFi;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiUiEffect;", "", "", "agreementIds", "", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "agreementsMap", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiUiEffect$NavigateToUpdateFi;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAgreementIds", "Ljava/util/Map;", "getAgreementsMap", "getName", "name"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToUpdateFi implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> agreementIds;
        private final java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> agreementsMap;

        public NavigateToUpdateFi(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.agreementIds = list;
            this.agreementsMap = map;
        }

        public final java.util.List<java.lang.String> getAgreementIds() {
            return this.agreementIds;
        }

        public final java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> getAgreementsMap() {
            return this.agreementsMap;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return "BulkUpdateFiUiEffect.NavigateToUpdateFi";
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.agreementIds;
            java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> map = this.agreementsMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToUpdateFi(agreementIds=");
            sb.append(list);
            sb.append(", agreementsMap=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.agreementIds.hashCode() * 31) + this.agreementsMap.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.NavigateToUpdateFi)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.NavigateToUpdateFi navigateToUpdateFi = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.NavigateToUpdateFi) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.agreementIds, navigateToUpdateFi.agreementIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementsMap, navigateToUpdateFi.agreementsMap);
        }

        public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.NavigateToUpdateFi copy(java.util.List<java.lang.String> agreementIds, java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> agreementsMap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementIds, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementsMap, "");
            return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.NavigateToUpdateFi(agreementIds, agreementsMap);
        }

        public final java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> component2() {
            return this.agreementsMap;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.agreementIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.NavigateToUpdateFi copy$default(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.NavigateToUpdateFi navigateToUpdateFi, java.util.List list, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = navigateToUpdateFi.agreementIds;
            }
            if ((i & 2) != 0) {
                map = navigateToUpdateFi.agreementsMap;
            }
            return navigateToUpdateFi.copy(list, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiUiEffect$ShowMaxFiSelectedError;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiUiEffect;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiUiEffect$ShowMaxFiSelectedError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType", "getName", "name"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowMaxFiSelectedError implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;

        public ShowMaxFiSelectedError(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            this.agreementType = agreementType;
        }

        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return "BulkUpdateFiUiEffect.ShowMaxFiSelectedError";
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowMaxFiSelectedError(agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            if (agreementType == null) {
                return 0;
            }
            return agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.ShowMaxFiSelectedError) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, ((com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.ShowMaxFiSelectedError) other).agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.ShowMaxFiSelectedError copy(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.ShowMaxFiSelectedError(agreementType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.ShowMaxFiSelectedError copy$default(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.ShowMaxFiSelectedError showMaxFiSelectedError, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                agreementType = showMaxFiSelectedError.agreementType;
            }
            return showMaxFiSelectedError.copy(agreementType);
        }
    }
}
