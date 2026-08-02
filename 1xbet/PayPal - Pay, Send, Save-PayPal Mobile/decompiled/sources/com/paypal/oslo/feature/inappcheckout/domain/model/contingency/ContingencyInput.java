package com.paypal.oslo.feature.inappcheckout.domain.model.contingency;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;", "", "<init>", "()V", "AddCardContingencyInput", "UpdateCardContingencyInput", "AuthChallengeContingencyInput", "EconsentContingencyInput", "CommonContingencyInput", "UnknownContingencyInput", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$AddCardContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$AuthChallengeContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$CommonContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$EconsentContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$UnknownContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$UpdateCardContingencyInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ContingencyInput {
    public static final int $stable = 0;

    private ContingencyInput() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$AddCardContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "entity", "", "isLoadComplete", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Z)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Z)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$AddCardContingencyInput;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getEntity", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddCardContingencyInput extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity;
        private final boolean isLoadComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddCardContingencyInput(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
            this.entity = contingencyEntity;
            this.isLoadComplete = z;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public final boolean isLoadComplete() {
            return this.isLoadComplete;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.entity;
            boolean z = this.isLoadComplete;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCardContingencyInput(entity=");
            sb.append(contingencyEntity);
            sb.append(", isLoadComplete=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.entity.hashCode() * 31) + java.lang.Boolean.hashCode(this.isLoadComplete);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AddCardContingencyInput)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AddCardContingencyInput addCardContingencyInput = (com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AddCardContingencyInput) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.entity, addCardContingencyInput.entity) && this.isLoadComplete == addCardContingencyInput.isLoadComplete;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AddCardContingencyInput copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity, boolean isLoadComplete) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AddCardContingencyInput(entity, isLoadComplete);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLoadComplete() {
            return this.isLoadComplete;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AddCardContingencyInput copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AddCardContingencyInput addCardContingencyInput, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contingencyEntity = addCardContingencyInput.entity;
            }
            if ((i & 2) != 0) {
                z = addCardContingencyInput.isLoadComplete;
            }
            return addCardContingencyInput.copy(contingencyEntity, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$UpdateCardContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$UpdateCardContingencyInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateCardContingencyInput extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateCardContingencyInput(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
            this.entity = contingencyEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.entity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateCardContingencyInput(entity=");
            sb.append(contingencyEntity);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.entity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UpdateCardContingencyInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UpdateCardContingencyInput) other).entity);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UpdateCardContingencyInput copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UpdateCardContingencyInput(entity);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UpdateCardContingencyInput copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UpdateCardContingencyInput updateCardContingencyInput, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contingencyEntity = updateCardContingencyInput.entity;
            }
            return updateCardContingencyInput.copy(contingencyEntity);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$AuthChallengeContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "entity", "", "selectedFundingInstrumentId", "", "useBalanceSelected", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$AuthChallengeContingencyInput;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getEntity", "Ljava/lang/String;", "getSelectedFundingInstrumentId", "Ljava/lang/Boolean;", "getUseBalanceSelected"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthChallengeContingencyInput extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity;
        private final java.lang.String selectedFundingInstrumentId;
        private final java.lang.Boolean useBalanceSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthChallengeContingencyInput(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, java.lang.String str, java.lang.Boolean bool) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
            this.entity = contingencyEntity;
            this.selectedFundingInstrumentId = str;
            this.useBalanceSelected = bool;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public final java.lang.String getSelectedFundingInstrumentId() {
            return this.selectedFundingInstrumentId;
        }

        public final java.lang.Boolean getUseBalanceSelected() {
            return this.useBalanceSelected;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.entity;
            java.lang.String str = this.selectedFundingInstrumentId;
            java.lang.Boolean bool = this.useBalanceSelected;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthChallengeContingencyInput(entity=");
            sb.append(contingencyEntity);
            sb.append(", selectedFundingInstrumentId=");
            sb.append(str);
            sb.append(", useBalanceSelected=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.entity.hashCode();
            java.lang.String str = this.selectedFundingInstrumentId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Boolean bool = this.useBalanceSelected;
            return (((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput authChallengeContingencyInput = (com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.entity, authChallengeContingencyInput.entity) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrumentId, authChallengeContingencyInput.selectedFundingInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.useBalanceSelected, authChallengeContingencyInput.useBalanceSelected);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity, java.lang.String selectedFundingInstrumentId, java.lang.Boolean useBalanceSelected) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput(entity, selectedFundingInstrumentId, useBalanceSelected);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getUseBalanceSelected() {
            return this.useBalanceSelected;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSelectedFundingInstrumentId() {
            return this.selectedFundingInstrumentId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput authChallengeContingencyInput, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contingencyEntity = authChallengeContingencyInput.entity;
            }
            if ((i & 2) != 0) {
                str = authChallengeContingencyInput.selectedFundingInstrumentId;
            }
            if ((i & 4) != 0) {
                bool = authChallengeContingencyInput.useBalanceSelected;
            }
            return authChallengeContingencyInput.copy(contingencyEntity, str, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$EconsentContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$EconsentContingencyInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EconsentContingencyInput extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EconsentContingencyInput(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
            this.entity = contingencyEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.entity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EconsentContingencyInput(entity=");
            sb.append(contingencyEntity);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.entity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.EconsentContingencyInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.EconsentContingencyInput) other).entity);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.EconsentContingencyInput copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.EconsentContingencyInput(entity);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.EconsentContingencyInput copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.EconsentContingencyInput econsentContingencyInput, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contingencyEntity = econsentContingencyInput.entity;
            }
            return econsentContingencyInput.copy(contingencyEntity);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$CommonContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$CommonContingencyInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CommonContingencyInput extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonContingencyInput(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
            this.entity = contingencyEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.entity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CommonContingencyInput(entity=");
            sb.append(contingencyEntity);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.entity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput) other).entity);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput(entity);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.CommonContingencyInput commonContingencyInput, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contingencyEntity = commonContingencyInput.entity;
            }
            return commonContingencyInput.copy(contingencyEntity);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$UnknownContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$UnknownContingencyInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownContingencyInput extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownContingencyInput(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
            this.entity = contingencyEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.entity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownContingencyInput(entity=");
            sb.append(contingencyEntity);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.entity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UnknownContingencyInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UnknownContingencyInput) other).entity);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UnknownContingencyInput copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity entity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UnknownContingencyInput(entity);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getEntity() {
            return this.entity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UnknownContingencyInput copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.UnknownContingencyInput unknownContingencyInput, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contingencyEntity = unknownContingencyInput.entity;
            }
            return unknownContingencyInput.copy(contingencyEntity);
        }
    }

    public /* synthetic */ ContingencyInput(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
