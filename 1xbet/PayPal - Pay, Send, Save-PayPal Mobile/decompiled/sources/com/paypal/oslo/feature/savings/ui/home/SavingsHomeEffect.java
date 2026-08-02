package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0010\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0010\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowToast", com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_TRANSFER_MONEY, com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_ADD_MONEY, com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_ADD_MONEY_GENERAL_SAVINGS, "NavigateToAddMoneyWithFiType", com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_SMART_ROUTE, com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_AUTO_SAVE, "NavigateToAutoSaveManage", com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_INTEREST_EARNINGS, com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_CREATE_GOAL, com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_GOAL_DETAILS, com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_EDUCATIONAL_DETAILS, com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_SHOW_SAVINGS_STATEMENTS_INFO, com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_SHOW_FDIC_INSURANCE, com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_SHOW_TAX_STATEMENT_DELIVERY_PREFERENCE, com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_TRIGGER_TILE_RETRY, "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAddMoney;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAddMoneyGeneralSavings;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAddMoneyWithFiType;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAutoSave;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAutoSaveManage;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToCreateGoal;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToEducationalDetails;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToGoalDetails;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToInterestEarnings;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToSmartRoute;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToTransferMoney;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$ShowFdicInsurance;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$ShowSavingsStatementsInfo;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$ShowTaxStatementDeliveryPreference;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$ShowToast;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$TriggerTileRetry;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsHomeEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SavingsHomeEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$ShowToast;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "", "message", "", "duration", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$ShowToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "J", "getDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToast extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        private final long duration;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowToast(java.lang.String str, long j) {
            super("ShowToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.duration = j;
        }

        public /* synthetic */ ShowToast(java.lang.String str, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? 3000L : j);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            long j = this.duration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowToast(message=");
            sb.append(str);
            sb.append(", duration=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + java.lang.Long.hashCode(this.duration);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast showToast = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, showToast.message) && this.duration == showToast.duration;
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast copy(java.lang.String message, long duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast(message, duration);
        }

        /* renamed from: component2, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast showToast, java.lang.String str, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showToast.message;
            }
            if ((i & 2) != 0) {
                j = showToast.duration;
            }
            return showToast.copy(str, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToTransferMoney;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToTransferMoney extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToTransferMoney INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToTransferMoney();

        public final int hashCode() {
            return 1947356713;
        }

        private NavigateToTransferMoney() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_TRANSFER_MONEY, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_TRANSFER_MONEY;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToTransferMoney)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAddMoney;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddMoney extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoney INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoney();

        public final int hashCode() {
            return 1501629835;
        }

        private NavigateToAddMoney() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_ADD_MONEY, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_ADD_MONEY;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoney)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAddMoneyGeneralSavings;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddMoneyGeneralSavings extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyGeneralSavings INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyGeneralSavings();

        public final int hashCode() {
            return 2039083292;
        }

        private NavigateToAddMoneyGeneralSavings() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_ADD_MONEY_GENERAL_SAVINGS, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_ADD_MONEY_GENERAL_SAVINGS;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyGeneralSavings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAddMoneyWithFiType;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "", "fiType", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAddMoneyWithFiType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFiType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddMoneyWithFiType extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        private final java.lang.String fiType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToAddMoneyWithFiType(java.lang.String str) {
            super("NavigateToAddMoneyWithFiType", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fiType = str;
        }

        public final java.lang.String getFiType() {
            return this.fiType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fiType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAddMoneyWithFiType(fiType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fiType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyWithFiType) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiType, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyWithFiType) other).fiType);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyWithFiType copy(java.lang.String fiType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiType, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyWithFiType(fiType);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFiType() {
            return this.fiType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyWithFiType copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyWithFiType navigateToAddMoneyWithFiType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToAddMoneyWithFiType.fiType;
            }
            return navigateToAddMoneyWithFiType.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToSmartRoute;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSmartRoute extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToSmartRoute INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToSmartRoute();

        public final int hashCode() {
            return -710217748;
        }

        private NavigateToSmartRoute() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_SMART_ROUTE, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_SMART_ROUTE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToSmartRoute)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAutoSave;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAutoSave extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSave INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSave();

        public final int hashCode() {
            return -102056776;
        }

        private NavigateToAutoSave() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_AUTO_SAVE, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_AUTO_SAVE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSave)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAutoSaveManage;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToAutoSaveManage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAutoSaveManage extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToAutoSaveManage(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
            super("NavigateToAutoSaveManage", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.goal = goalSummaryDTO;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAutoSaveManage(goal=");
            sb.append(goalSummaryDTO);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.goal.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSaveManage) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSaveManage) other).goal);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSaveManage copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSaveManage(goal);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSaveManage copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSaveManage navigateToAutoSaveManage, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = navigateToAutoSaveManage.goal;
            }
            return navigateToAutoSaveManage.copy(goalSummaryDTO);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToInterestEarnings;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToInterestEarnings extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToInterestEarnings INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToInterestEarnings();

        public final int hashCode() {
            return 1912654559;
        }

        private NavigateToInterestEarnings() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_INTEREST_EARNINGS, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_INTEREST_EARNINGS;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToInterestEarnings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToCreateGoal;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCreateGoal extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToCreateGoal INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToCreateGoal();

        public final int hashCode() {
            return -1818344421;
        }

        private NavigateToCreateGoal() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_CREATE_GOAL, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_CREATE_GOAL;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToCreateGoal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToGoalDetails;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goal", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToGoalDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToGoalDetails extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToGoalDetails(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_GOAL_DETAILS, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
            this.goal = goalSummaryDTO;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.goal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToGoalDetails(goal=");
            sb.append(goalSummaryDTO);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.goal.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToGoalDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.goal, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToGoalDetails) other).goal);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToGoalDetails copy(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToGoalDetails(goal);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getGoal() {
            return this.goal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToGoalDetails copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToGoalDetails navigateToGoalDetails, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                goalSummaryDTO = navigateToGoalDetails.goal;
            }
            return navigateToGoalDetails.copy(goalSummaryDTO);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToEducationalDetails;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "", "title", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$NavigateToEducationalDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToEducationalDetails extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        private final java.lang.String content;
        private final java.lang.String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToEducationalDetails(java.lang.String str, java.lang.String str2) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_NAVIGATE_TO_EDUCATIONAL_DETAILS, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.title = str;
            this.content = str2;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getContent() {
            return this.content;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.content;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToEducationalDetails(title=");
            sb.append(str);
            sb.append(", content=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + this.content.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToEducationalDetails)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToEducationalDetails navigateToEducationalDetails = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToEducationalDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, navigateToEducationalDetails.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, navigateToEducationalDetails.content);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToEducationalDetails copy(java.lang.String title, java.lang.String content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToEducationalDetails(title, content);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getContent() {
            return this.content;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToEducationalDetails copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToEducationalDetails navigateToEducationalDetails, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToEducationalDetails.title;
            }
            if ((i & 2) != 0) {
                str2 = navigateToEducationalDetails.content;
            }
            return navigateToEducationalDetails.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$ShowSavingsStatementsInfo;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowSavingsStatementsInfo extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowSavingsStatementsInfo INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowSavingsStatementsInfo();

        public final int hashCode() {
            return 170723534;
        }

        private ShowSavingsStatementsInfo() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_SHOW_SAVINGS_STATEMENTS_INFO, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_SHOW_SAVINGS_STATEMENTS_INFO;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowSavingsStatementsInfo)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$ShowFdicInsurance;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowFdicInsurance extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowFdicInsurance INSTANCE = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowFdicInsurance();

        public final int hashCode() {
            return -810518939;
        }

        private ShowFdicInsurance() {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_SHOW_FDIC_INSURANCE, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_SHOW_FDIC_INSURANCE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowFdicInsurance)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$ShowTaxStatementDeliveryPreference;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "", "currentPreference", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$ShowTaxStatementDeliveryPreference;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getCurrentPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowTaxStatementDeliveryPreference extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        private final java.lang.Boolean currentPreference;

        public ShowTaxStatementDeliveryPreference(java.lang.Boolean bool) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_SHOW_TAX_STATEMENT_DELIVERY_PREFERENCE, null);
            this.currentPreference = bool;
        }

        public final java.lang.Boolean getCurrentPreference() {
            return this.currentPreference;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.currentPreference;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowTaxStatementDeliveryPreference(currentPreference=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.currentPreference;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowTaxStatementDeliveryPreference) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentPreference, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowTaxStatementDeliveryPreference) other).currentPreference);
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowTaxStatementDeliveryPreference copy(java.lang.Boolean currentPreference) {
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowTaxStatementDeliveryPreference(currentPreference);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getCurrentPreference() {
            return this.currentPreference;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowTaxStatementDeliveryPreference copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowTaxStatementDeliveryPreference showTaxStatementDeliveryPreference, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = showTaxStatementDeliveryPreference.currentPreference;
            }
            return showTaxStatementDeliveryPreference.copy(bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$TriggerTileRetry;", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;", "componentType", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;)Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect$TriggerTileRetry;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;", "getComponentType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TriggerTileRetry extends com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType componentType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TriggerTileRetry(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType) {
            super(com.paypal.oslo.feature.savings.constants.SavingsConstants.EffectNames.EFFECT_TRIGGER_TILE_RETRY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHubComponentType, "");
            this.componentType = savingsHubComponentType;
        }

        public final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType getComponentType() {
            return this.componentType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType = this.componentType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TriggerTileRetry(componentType=");
            sb.append(savingsHubComponentType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.TriggerTileRetry) && this.componentType == ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.TriggerTileRetry) other).componentType;
        }

        public final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.TriggerTileRetry copy(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType componentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
            return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.TriggerTileRetry(componentType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType getComponentType() {
            return this.componentType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.TriggerTileRetry copy$default(com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.TriggerTileRetry triggerTileRetry, com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsHubComponentType = triggerTileRetry.componentType;
            }
            return triggerTileRetry.copy(savingsHubComponentType);
        }
    }

    public /* synthetic */ SavingsHomeEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
