package com.paypal.oslo.feature.inappcheckout.ui.thanks.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract;", "", "<init>", "()V", "State", "Event", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ThanksContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract();

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$State;", "", "", "showReturnToMerchantButton", "", "merchantName", "returnUrl", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getShowReturnToMerchantButton", "Ljava/lang/String;", "getMerchantName", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 0;
        private final java.lang.String merchantName;
        private final java.lang.String returnUrl;
        private final boolean showReturnToMerchantButton;

        public State(boolean z, java.lang.String str, java.lang.String str2) {
            this.showReturnToMerchantButton = z;
            this.merchantName = str;
            this.returnUrl = str2;
        }

        public /* synthetic */ State(boolean z, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final boolean getShowReturnToMerchantButton() {
            return this.showReturnToMerchantButton;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        public final java.lang.String toString() {
            boolean z = this.showReturnToMerchantButton;
            java.lang.String str = this.merchantName;
            java.lang.String str2 = this.returnUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State(showReturnToMerchantButton=");
            sb.append(z);
            sb.append(", merchantName=");
            sb.append(str);
            sb.append(", returnUrl=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.showReturnToMerchantButton);
            java.lang.String str = this.merchantName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.returnUrl;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State) other;
            return this.showReturnToMerchantButton == state.showReturnToMerchantButton && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, state.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, state.returnUrl);
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State copy(boolean showReturnToMerchantButton, java.lang.String merchantName, java.lang.String returnUrl) {
            return new com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State(showReturnToMerchantButton, merchantName, returnUrl);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowReturnToMerchantButton() {
            return this.showReturnToMerchantButton;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State copy$default(com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State state, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = state.showReturnToMerchantButton;
            }
            if ((i & 2) != 0) {
                str = state.merchantName;
            }
            if ((i & 4) != 0) {
                str2 = state.returnUrl;
            }
            return state.copy(z, str, str2);
        }

        public State() {
            this(false, null, null, 7, null);
        }
    }

    private ThanksContract() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event;", "", "<init>", "()V", "Initialise", "HandleBackPress", "HandleReturnToMerchantButtonClick", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event$HandleBackPress;", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event$HandleReturnToMerchantButtonClick;", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event$Initialise;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event$Initialise;", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "thanksScreenData", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;)Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event$Initialise;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "getThanksScreenData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Initialise extends com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Initialise(com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thanksScreenData, "");
                this.thanksScreenData = thanksScreenData;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData getThanksScreenData() {
                return this.thanksScreenData;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData = this.thanksScreenData;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialise(thanksScreenData=");
                sb.append(thanksScreenData);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.thanksScreenData.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise) && kotlin.jvm.internal.Intrinsics.areEqual(this.thanksScreenData, ((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise) other).thanksScreenData);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise copy(com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thanksScreenData, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise(thanksScreenData);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData getThanksScreenData() {
                return this.thanksScreenData;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise copy$default(com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise initialise, com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    thanksScreenData = initialise.thanksScreenData;
                }
                return initialise.copy(thanksScreenData);
            }
        }

        private Event() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event$HandleBackPress;", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HandleBackPress extends com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.HandleBackPress INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.HandleBackPress();

            public final int hashCode() {
                return 603246305;
            }

            private HandleBackPress() {
                super(null);
            }

            public final java.lang.String toString() {
                return "HandleBackPress";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.HandleBackPress)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event$HandleReturnToMerchantButtonClick;", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HandleReturnToMerchantButtonClick extends com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.HandleReturnToMerchantButtonClick INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.HandleReturnToMerchantButtonClick();

            public final int hashCode() {
                return 690927816;
            }

            private HandleReturnToMerchantButtonClick() {
                super(null);
            }

            public final java.lang.String toString() {
                return "HandleReturnToMerchantButtonClick";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.HandleReturnToMerchantButtonClick)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Event(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Effect;", "", "<init>", "()V", "NavigateToReturnUrl", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Effect$NavigateToReturnUrl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Effect$NavigateToReturnUrl;", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Effect;", "", "returnUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Effect$NavigateToReturnUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToReturnUrl extends com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect {
            public static final int $stable = 0;
            private final java.lang.String returnUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToReturnUrl(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.returnUrl = str;
            }

            public final java.lang.String getReturnUrl() {
                return this.returnUrl;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.returnUrl;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReturnUrl(returnUrl=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.returnUrl.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect.NavigateToReturnUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, ((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect.NavigateToReturnUrl) other).returnUrl);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect.NavigateToReturnUrl copy(java.lang.String returnUrl) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUrl, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect.NavigateToReturnUrl(returnUrl);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getReturnUrl() {
                return this.returnUrl;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect.NavigateToReturnUrl copy$default(com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect.NavigateToReturnUrl navigateToReturnUrl, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = navigateToReturnUrl.returnUrl;
                }
                return navigateToReturnUrl.copy(str);
            }
        }

        private Effect() {
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
