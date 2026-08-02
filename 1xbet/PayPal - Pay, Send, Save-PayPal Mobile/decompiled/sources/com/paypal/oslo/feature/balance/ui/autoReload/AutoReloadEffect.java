package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.paypal.oslo.feature.balance.common.AutoReloadConstants.EffectNames.EFFECT_COMPLETE_FLOW_WITH_RESULT, "NavigateToLowBalance", "NavigateToScheduled", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect$CompleteAutoReloadFlowWithResult;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect$NavigateToLowBalance;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect$NavigateToScheduled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AutoReloadEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AutoReloadEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect$CompleteAutoReloadFlowWithResult;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect;", "Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;)Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect$CompleteAutoReloadFlowWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CompleteAutoReloadFlowWithResult extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompleteAutoReloadFlowWithResult(com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult) {
            super(com.paypal.oslo.feature.balance.common.AutoReloadConstants.EffectNames.EFFECT_COMPLETE_FLOW_WITH_RESULT, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowNavResult, "");
            this.result = autoReloadFlowNavResult;
        }

        public final com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CompleteAutoReloadFlowWithResult(result=");
            sb.append(autoReloadFlowNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult) other).result);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult copy(com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult copy$default(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult completeAutoReloadFlowWithResult, com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoReloadFlowNavResult = completeAutoReloadFlowWithResult.result;
            }
            return completeAutoReloadFlowWithResult.copy(autoReloadFlowNavResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect$NavigateToLowBalance;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect;", "", "xSellAmount", "", "xSellCurrencyCode", "xSellTransferSpeed", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Double;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect$NavigateToLowBalance;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Double;", "getXSellAmount", "Ljava/lang/String;", "getXSellCurrencyCode", "getXSellTransferSpeed"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLowBalance extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect {
        public static final int $stable = 0;
        private final java.lang.Double xSellAmount;
        private final java.lang.String xSellCurrencyCode;
        private final java.lang.String xSellTransferSpeed;

        public NavigateToLowBalance(java.lang.Double d, java.lang.String str, java.lang.String str2) {
            super("NavigateToLowBalance", null);
            this.xSellAmount = d;
            this.xSellCurrencyCode = str;
            this.xSellTransferSpeed = str2;
        }

        public /* synthetic */ NavigateToLowBalance(java.lang.Double d, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final java.lang.Double getXSellAmount() {
            return this.xSellAmount;
        }

        public final java.lang.String getXSellCurrencyCode() {
            return this.xSellCurrencyCode;
        }

        public final java.lang.String getXSellTransferSpeed() {
            return this.xSellTransferSpeed;
        }

        public final java.lang.String toString() {
            java.lang.Double d = this.xSellAmount;
            java.lang.String str = this.xSellCurrencyCode;
            java.lang.String str2 = this.xSellTransferSpeed;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToLowBalance(xSellAmount=");
            sb.append(d);
            sb.append(", xSellCurrencyCode=");
            sb.append(str);
            sb.append(", xSellTransferSpeed=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Double d = this.xSellAmount;
            int hashCode = d == null ? 0 : d.hashCode();
            java.lang.String str = this.xSellCurrencyCode;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.xSellTransferSpeed;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance navigateToLowBalance = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.xSellAmount, (java.lang.Object) navigateToLowBalance.xSellAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.xSellCurrencyCode, navigateToLowBalance.xSellCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.xSellTransferSpeed, navigateToLowBalance.xSellTransferSpeed);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance copy(java.lang.Double xSellAmount, java.lang.String xSellCurrencyCode, java.lang.String xSellTransferSpeed) {
            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance(xSellAmount, xSellCurrencyCode, xSellTransferSpeed);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getXSellTransferSpeed() {
            return this.xSellTransferSpeed;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getXSellCurrencyCode() {
            return this.xSellCurrencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Double getXSellAmount() {
            return this.xSellAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance copy$default(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance navigateToLowBalance, java.lang.Double d, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = navigateToLowBalance.xSellAmount;
            }
            if ((i & 2) != 0) {
                str = navigateToLowBalance.xSellCurrencyCode;
            }
            if ((i & 4) != 0) {
                str2 = navigateToLowBalance.xSellTransferSpeed;
            }
            return navigateToLowBalance.copy(d, str, str2);
        }

        public NavigateToLowBalance() {
            this(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect$NavigateToScheduled;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToScheduled extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToScheduled INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToScheduled();

        public final int hashCode() {
            return -425853285;
        }

        private NavigateToScheduled() {
            super("NavigateToScheduled", null);
        }

        public final java.lang.String toString() {
            return "NavigateToScheduled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToScheduled)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AutoReloadEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
