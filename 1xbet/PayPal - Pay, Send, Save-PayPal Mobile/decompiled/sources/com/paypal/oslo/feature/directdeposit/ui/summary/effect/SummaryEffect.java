package com.paypal.oslo.feature.directdeposit.ui.summary.effect;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;", "", "<init>", "()V", "CopyAccountNumberClicked", "ShowToast", "LaunchAtomicSDK", "CloseAtomicSDK", "ShowDepositSwitchSuccess", "NavigateToSmartRouteSetup", "NavigateToDirectDepositForm", "NavigateToSmartRouteEdit", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$CloseAtomicSDK;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$CopyAccountNumberClicked;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$LaunchAtomicSDK;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$NavigateToDirectDepositForm;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$NavigateToSmartRouteEdit;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$NavigateToSmartRouteSetup;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$ShowDepositSwitchSuccess;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$ShowToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class SummaryEffect {
    public static final int $stable = 0;

    private SummaryEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$CopyAccountNumberClicked;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;", "", "routingNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$CopyAccountNumberClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRoutingNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyAccountNumberClicked extends com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect {
        public static final int $stable = 0;
        private final java.lang.String routingNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyAccountNumberClicked(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.routingNumber = str;
        }

        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.routingNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CopyAccountNumberClicked(routingNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.routingNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.CopyAccountNumberClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, ((com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.CopyAccountNumberClicked) other).routingNumber);
        }

        public final com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.CopyAccountNumberClicked copy(java.lang.String routingNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber, "");
            return new com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.CopyAccountNumberClicked(routingNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.CopyAccountNumberClicked copy$default(com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.CopyAccountNumberClicked copyAccountNumberClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = copyAccountNumberClicked.routingNumber;
            }
            return copyAccountNumberClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$ShowToast;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$ShowToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToast extends com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowToast(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowToast(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.ShowToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.ShowToast) other).message);
        }

        public final com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.ShowToast copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.ShowToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.ShowToast copy$default(com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.ShowToast showToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showToast.message;
            }
            return showToast.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$LaunchAtomicSDK;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;", "", "publicToken", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$LaunchAtomicSDK;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchAtomicSDK extends com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect {
        public static final int $stable = 0;
        private final java.lang.String publicToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchAtomicSDK(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.publicToken = str;
        }

        public final java.lang.String getPublicToken() {
            return this.publicToken;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.publicToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchAtomicSDK(publicToken=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicToken.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.LaunchAtomicSDK) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicToken, ((com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.LaunchAtomicSDK) other).publicToken);
        }

        public final com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.LaunchAtomicSDK copy(java.lang.String publicToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicToken, "");
            return new com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.LaunchAtomicSDK(publicToken);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPublicToken() {
            return this.publicToken;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.LaunchAtomicSDK copy$default(com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.LaunchAtomicSDK launchAtomicSDK, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = launchAtomicSDK.publicToken;
            }
            return launchAtomicSDK.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$CloseAtomicSDK;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CloseAtomicSDK extends com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.CloseAtomicSDK INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.CloseAtomicSDK();

        private CloseAtomicSDK() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$ShowDepositSwitchSuccess;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ShowDepositSwitchSuccess extends com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.ShowDepositSwitchSuccess INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.ShowDepositSwitchSuccess();

        private ShowDepositSwitchSuccess() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$NavigateToSmartRouteSetup;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigateToSmartRouteSetup extends com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToSmartRouteSetup INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToSmartRouteSetup();

        private NavigateToSmartRouteSetup() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$NavigateToDirectDepositForm;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;", "", "routingNumber", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "bankName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$NavigateToDirectDepositForm;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRoutingNumber", "getAccountNumber", "getBankName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDirectDepositForm extends com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect {
        public static final int $stable = 0;
        private final java.lang.String accountNumber;
        private final java.lang.String bankName;
        private final java.lang.String routingNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToDirectDepositForm(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.routingNumber = str;
            this.accountNumber = str2;
            this.bankName = str3;
        }

        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        public final java.lang.String getAccountNumber() {
            return this.accountNumber;
        }

        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.routingNumber;
            java.lang.String str2 = this.accountNumber;
            java.lang.String str3 = this.bankName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDirectDepositForm(routingNumber=");
            sb.append(str);
            sb.append(", accountNumber=");
            sb.append(str2);
            sb.append(", bankName=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.routingNumber.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.bankName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm)) {
                return false;
            }
            com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm navigateToDirectDepositForm = (com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, navigateToDirectDepositForm.routingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountNumber, navigateToDirectDepositForm.accountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, navigateToDirectDepositForm.bankName);
        }

        public final com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm copy(java.lang.String routingNumber, java.lang.String accountNumber, java.lang.String bankName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
            return new com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm(routingNumber, accountNumber, bankName);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm copy$default(com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm navigateToDirectDepositForm, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToDirectDepositForm.routingNumber;
            }
            if ((i & 2) != 0) {
                str2 = navigateToDirectDepositForm.accountNumber;
            }
            if ((i & 4) != 0) {
                str3 = navigateToDirectDepositForm.bankName;
            }
            return navigateToDirectDepositForm.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect$NavigateToSmartRouteEdit;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigateToSmartRouteEdit extends com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToSmartRouteEdit INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToSmartRouteEdit();

        private NavigateToSmartRouteEdit() {
            super(null);
        }
    }

    public /* synthetic */ SummaryEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
