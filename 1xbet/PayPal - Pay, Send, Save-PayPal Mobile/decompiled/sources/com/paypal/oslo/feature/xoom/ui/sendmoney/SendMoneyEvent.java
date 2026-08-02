package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "OnInitialized", "OnSuccessfulTransaction", "OnForbiddenUserEncountered", "OnUnlinkedUserEncountered", "OnNetworkError", "ShowInterstitial", "OnInactiveUserEncountered", "OnInvalidUrlEncountered", "OnYodleePostMessage", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$Initialize;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnForbiddenUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnInactiveUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnInitialized;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnInvalidUrlEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnNetworkError;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnSuccessfulTransaction;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnUnlinkedUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnYodleePostMessage;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$ShowInterstitial;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class SendMoneyEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SendMoneyEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJV\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$Initialize;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "", "sendCurrencyCode", "receiveCurrencyCode", "destinationCountryCode", "amount", "refTag", "sendMoneyUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSendCurrencyCode", "getReceiveCurrencyCode", "getDestinationCountryCode", "getAmount", "getRefTag", "getSendMoneyUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String destinationCountryCode;
        private final java.lang.String receiveCurrencyCode;
        private final java.lang.String refTag;
        private final java.lang.String sendCurrencyCode;
        private final java.lang.String sendMoneyUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            super("Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.sendCurrencyCode = str;
            this.receiveCurrencyCode = str2;
            this.destinationCountryCode = str3;
            this.amount = str4;
            this.refTag = str5;
            this.sendMoneyUrl = str6;
        }

        public final java.lang.String getSendCurrencyCode() {
            return this.sendCurrencyCode;
        }

        public final java.lang.String getReceiveCurrencyCode() {
            return this.receiveCurrencyCode;
        }

        public final java.lang.String getDestinationCountryCode() {
            return this.destinationCountryCode;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getRefTag() {
            return this.refTag;
        }

        public final java.lang.String getSendMoneyUrl() {
            return this.sendMoneyUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sendCurrencyCode;
            java.lang.String str2 = this.receiveCurrencyCode;
            java.lang.String str3 = this.destinationCountryCode;
            java.lang.String str4 = this.amount;
            java.lang.String str5 = this.refTag;
            java.lang.String str6 = this.sendMoneyUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(sendCurrencyCode=");
            sb.append(str);
            sb.append(", receiveCurrencyCode=");
            sb.append(str2);
            sb.append(", destinationCountryCode=");
            sb.append(str3);
            sb.append(", amount=");
            sb.append(str4);
            sb.append(", refTag=");
            sb.append(str5);
            sb.append(", sendMoneyUrl=");
            sb.append(str6);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.sendCurrencyCode;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.receiveCurrencyCode;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.destinationCountryCode;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.amount;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            int hashCode5 = this.refTag.hashCode();
            java.lang.String str5 = this.sendMoneyUrl;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize initialize = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sendCurrencyCode, initialize.sendCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyCode, initialize.receiveCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationCountryCode, initialize.destinationCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, initialize.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.refTag, initialize.refTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendMoneyUrl, initialize.sendMoneyUrl);
        }

        public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize copy(java.lang.String sendCurrencyCode, java.lang.String receiveCurrencyCode, java.lang.String destinationCountryCode, java.lang.String amount, java.lang.String refTag, java.lang.String sendMoneyUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refTag, "");
            return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize(sendCurrencyCode, receiveCurrencyCode, destinationCountryCode, amount, refTag, sendMoneyUrl);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getSendMoneyUrl() {
            return this.sendMoneyUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getRefTag() {
            return this.refTag;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDestinationCountryCode() {
            return this.destinationCountryCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReceiveCurrencyCode() {
            return this.receiveCurrencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSendCurrencyCode() {
            return this.sendCurrencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize copy$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize initialize, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.sendCurrencyCode;
            }
            if ((i & 2) != 0) {
                str2 = initialize.receiveCurrencyCode;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = initialize.destinationCountryCode;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = initialize.amount;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = initialize.refTag;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = initialize.sendMoneyUrl;
            }
            return initialize.copy(str, str7, str8, str9, str10, str6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnInitialized;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiModel;", "copy", "(Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiModel;)Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInitialized extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnInitialized(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiModel sendMoneyUiModel) {
            super("OnInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendMoneyUiModel, "");
            this.uiModel = sendMoneyUiModel;
        }

        public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiModel sendMoneyUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInitialized(uiModel=");
            sb.append(sendMoneyUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInitialized) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInitialized) other).uiModel);
        }

        public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInitialized copy(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInitialized(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInitialized copy$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInitialized onInitialized, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiModel sendMoneyUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                sendMoneyUiModel = onInitialized.uiModel;
            }
            return onInitialized.copy(sendMoneyUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnSuccessfulTransaction;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSuccessfulTransaction extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnSuccessfulTransaction INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnSuccessfulTransaction();

        public final int hashCode() {
            return 1685555233;
        }

        private OnSuccessfulTransaction() {
            super("OnSuccessfulTransaction", null);
        }

        public final java.lang.String toString() {
            return "OnSuccessfulTransaction";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnSuccessfulTransaction)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnForbiddenUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "", "titleRes", "descriptionRes", "primaryButtonTextRes", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnForbiddenUserEncountered;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "getDescriptionRes", "getPrimaryButtonTextRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnForbiddenUserEncountered extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent {
        public static final int $stable = 0;
        private final int descriptionRes;
        private final int primaryButtonTextRes;
        private final int titleRes;

        public OnForbiddenUserEncountered(int i, int i2, int i3) {
            super("OnForbiddenUserEncountered", null);
            this.titleRes = i;
            this.descriptionRes = i2;
            this.primaryButtonTextRes = i3;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        public final int getPrimaryButtonTextRes() {
            return this.primaryButtonTextRes;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            int i2 = this.descriptionRes;
            int i3 = this.primaryButtonTextRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnForbiddenUserEncountered(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(i2);
            sb.append(", primaryButtonTextRes=");
            sb.append(i3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Integer.hashCode(this.titleRes) * 31) + java.lang.Integer.hashCode(this.descriptionRes)) * 31) + java.lang.Integer.hashCode(this.primaryButtonTextRes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered)) {
                return false;
            }
            com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered onForbiddenUserEncountered = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered) other;
            return this.titleRes == onForbiddenUserEncountered.titleRes && this.descriptionRes == onForbiddenUserEncountered.descriptionRes && this.primaryButtonTextRes == onForbiddenUserEncountered.primaryButtonTextRes;
        }

        public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered copy(int titleRes, int descriptionRes, int primaryButtonTextRes) {
            return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered(titleRes, descriptionRes, primaryButtonTextRes);
        }

        /* renamed from: component3, reason: from getter */
        public final int getPrimaryButtonTextRes() {
            return this.primaryButtonTextRes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered copy$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered onForbiddenUserEncountered, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = onForbiddenUserEncountered.titleRes;
            }
            if ((i4 & 2) != 0) {
                i2 = onForbiddenUserEncountered.descriptionRes;
            }
            if ((i4 & 4) != 0) {
                i3 = onForbiddenUserEncountered.primaryButtonTextRes;
            }
            return onForbiddenUserEncountered.copy(i, i2, i3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnUnlinkedUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUnlinkedUserEncountered extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnUnlinkedUserEncountered INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnUnlinkedUserEncountered();

        public final int hashCode() {
            return 1820560626;
        }

        private OnUnlinkedUserEncountered() {
            super("OnUnlinkedUserEncountered", null);
        }

        public final java.lang.String toString() {
            return "OnUnlinkedUserEncountered";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnUnlinkedUserEncountered)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnNetworkError;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNetworkError extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnNetworkError INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnNetworkError();

        public final int hashCode() {
            return -1188753507;
        }

        private OnNetworkError() {
            super("OnNetworkError", null);
        }

        public final java.lang.String toString() {
            return "OnNetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnNetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$ShowInterstitial;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowInterstitial extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.ShowInterstitial INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.ShowInterstitial();

        public final int hashCode() {
            return 1687714157;
        }

        private ShowInterstitial() {
            super("ShowInterstitial", null);
        }

        public final java.lang.String toString() {
            return "ShowInterstitial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.ShowInterstitial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnInactiveUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "failedPaymentInfo", "<init>", "(Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "copy", "(Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;)Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnInactiveUserEncountered;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "getFailedPaymentInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInactiveUserEncountered extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnInactiveUserEncountered(com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo) {
            super("OnInactiveUserEncountered", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedPaymentInfo, "");
            this.failedPaymentInfo = failedPaymentInfo;
        }

        public final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo getFailedPaymentInfo() {
            return this.failedPaymentInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo = this.failedPaymentInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInactiveUserEncountered(failedPaymentInfo=");
            sb.append(failedPaymentInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.failedPaymentInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInactiveUserEncountered) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedPaymentInfo, ((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInactiveUserEncountered) other).failedPaymentInfo);
        }

        public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInactiveUserEncountered copy(com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedPaymentInfo, "");
            return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInactiveUserEncountered(failedPaymentInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo getFailedPaymentInfo() {
            return this.failedPaymentInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInactiveUserEncountered copy$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInactiveUserEncountered onInactiveUserEncountered, com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                failedPaymentInfo = onInactiveUserEncountered.failedPaymentInfo;
            }
            return onInactiveUserEncountered.copy(failedPaymentInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnInvalidUrlEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInvalidUrlEncountered extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInvalidUrlEncountered INSTANCE = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInvalidUrlEncountered();

        public final int hashCode() {
            return 673737271;
        }

        private OnInvalidUrlEncountered() {
            super("OnInvalidUrlEncountered", null);
        }

        public final java.lang.String toString() {
            return "OnInvalidUrlEncountered";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInvalidUrlEncountered)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnYodleePostMessage;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "", "jsonData", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent$OnYodleePostMessage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getJsonData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnYodleePostMessage extends com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent {
        public static final int $stable = 0;
        private final java.lang.String jsonData;

        public OnYodleePostMessage(java.lang.String str) {
            super("OnYodleePostMessage", null);
            this.jsonData = str;
        }

        public final java.lang.String getJsonData() {
            return this.jsonData;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.jsonData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnYodleePostMessage(jsonData=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.jsonData;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnYodleePostMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.jsonData, ((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnYodleePostMessage) other).jsonData);
        }

        public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnYodleePostMessage copy(java.lang.String jsonData) {
            return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnYodleePostMessage(jsonData);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getJsonData() {
            return this.jsonData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnYodleePostMessage copy$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnYodleePostMessage onYodleePostMessage, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onYodleePostMessage.jsonData;
            }
            return onYodleePostMessage.copy(str);
        }
    }

    public /* synthetic */ SendMoneyEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
