package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToLoading", "NavigateBack", "CloseFlow", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect$CloseFlow;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect$NavigateToLoading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PpwEnterAmountUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PpwEnterAmountUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect$NavigateToLoading;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect;", "", "receiverAmount", "senderAmount", "senderCurrencyCode", "receiverCurrencyCode", "senderCountryCode", "receiverCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect$NavigateToLoading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReceiverAmount", "getSenderAmount", "getSenderCurrencyCode", "getReceiverCurrencyCode", "getSenderCountryCode", "getReceiverCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLoading extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect {
        public static final int $stable = 0;
        private final java.lang.String receiverAmount;
        private final java.lang.String receiverCountryCode;
        private final java.lang.String receiverCurrencyCode;
        private final java.lang.String senderAmount;
        private final java.lang.String senderCountryCode;
        private final java.lang.String senderCurrencyCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToLoading(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            super("PpwEnterAmountUiEffect.NavigateToLoading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            this.receiverAmount = str;
            this.senderAmount = str2;
            this.senderCurrencyCode = str3;
            this.receiverCurrencyCode = str4;
            this.senderCountryCode = str5;
            this.receiverCountryCode = str6;
        }

        public final java.lang.String getReceiverAmount() {
            return this.receiverAmount;
        }

        public final java.lang.String getSenderAmount() {
            return this.senderAmount;
        }

        public final java.lang.String getSenderCurrencyCode() {
            return this.senderCurrencyCode;
        }

        public final java.lang.String getReceiverCurrencyCode() {
            return this.receiverCurrencyCode;
        }

        public final java.lang.String getSenderCountryCode() {
            return this.senderCountryCode;
        }

        public final java.lang.String getReceiverCountryCode() {
            return this.receiverCountryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.receiverAmount;
            java.lang.String str2 = this.senderAmount;
            java.lang.String str3 = this.senderCurrencyCode;
            java.lang.String str4 = this.receiverCurrencyCode;
            java.lang.String str5 = this.senderCountryCode;
            java.lang.String str6 = this.receiverCountryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToLoading(receiverAmount=");
            sb.append(str);
            sb.append(", senderAmount=");
            sb.append(str2);
            sb.append(", senderCurrencyCode=");
            sb.append(str3);
            sb.append(", receiverCurrencyCode=");
            sb.append(str4);
            sb.append(", senderCountryCode=");
            sb.append(str5);
            sb.append(", receiverCountryCode=");
            sb.append(str6);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.receiverAmount.hashCode() * 31) + this.senderAmount.hashCode()) * 31) + this.senderCurrencyCode.hashCode()) * 31) + this.receiverCurrencyCode.hashCode()) * 31) + this.senderCountryCode.hashCode()) * 31) + this.receiverCountryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading navigateToLoading = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.receiverAmount, navigateToLoading.receiverAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.senderAmount, navigateToLoading.senderAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.senderCurrencyCode, navigateToLoading.senderCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiverCurrencyCode, navigateToLoading.receiverCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.senderCountryCode, navigateToLoading.senderCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiverCountryCode, navigateToLoading.receiverCountryCode);
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading copy(java.lang.String receiverAmount, java.lang.String senderAmount, java.lang.String senderCurrencyCode, java.lang.String receiverCurrencyCode, java.lang.String senderCountryCode, java.lang.String receiverCountryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderCurrencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverCurrencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderCountryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverCountryCode, "");
            return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading(receiverAmount, senderAmount, senderCurrencyCode, receiverCurrencyCode, senderCountryCode, receiverCountryCode);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getReceiverCountryCode() {
            return this.receiverCountryCode;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSenderCountryCode() {
            return this.senderCountryCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getReceiverCurrencyCode() {
            return this.receiverCurrencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSenderCurrencyCode() {
            return this.senderCurrencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSenderAmount() {
            return this.senderAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReceiverAmount() {
            return this.receiverAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading navigateToLoading, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToLoading.receiverAmount;
            }
            if ((i & 2) != 0) {
                str2 = navigateToLoading.senderAmount;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = navigateToLoading.senderCurrencyCode;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = navigateToLoading.receiverCurrencyCode;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = navigateToLoading.senderCountryCode;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = navigateToLoading.receiverCountryCode;
            }
            return navigateToLoading.copy(str, str7, str8, str9, str10, str6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateBack();

        public final int hashCode() {
            return 1808170766;
        }

        private NavigateBack() {
            super("PpwEnterAmountUiEffect.NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect$CloseFlow;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseFlow extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.CloseFlow INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.CloseFlow();

        public final int hashCode() {
            return 1489731056;
        }

        private CloseFlow() {
            super("PpwEnterAmountUiEffect.CloseFlow", null);
        }

        public final java.lang.String toString() {
            return "CloseFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.CloseFlow)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PpwEnterAmountUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
