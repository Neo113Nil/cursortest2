package com.paypal.oslo.feature.moneymovement.api.ui.summary;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State;", "state", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State;)Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State;", "getState", "State"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SummaryData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State state;

    public SummaryData(com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.state = state;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State getState() {
        return this.state;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State;", "", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface State {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State$Loading;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading implements com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Loading INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Loading();

            public final int hashCode() {
                return -440059197;
            }

            private Loading() {
            }

            public final java.lang.String toString() {
                return "Loading";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Loading)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\nHÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0094\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010\"R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010&R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010*R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bK\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bM\u0010-R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010N\u001a\u0004\bO\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State$Ready;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/Intent;", "intent", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "paymentPlan", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FiatCurrencyExchange;", "fxQuote", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentReceiver;", "receiver", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/LegalConsentItem;", "legalConsentItems", "", "pointsRedeemed", "", "showFeeInfoIcon", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ConversionMethod;", "conversionMethod", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosure;", "disclosures", "Ljava/util/Date;", "expiryDateForPayPalLink", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "totalToRecipientAmount", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/Intent;Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;Lcom/paypal/oslo/feature/moneymovement/api/domain/FiatCurrencyExchange;Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentReceiver;Ljava/util/List;Ljava/lang/Integer;ZLcom/paypal/oslo/feature/moneymovement/api/domain/ConversionMethod;Ljava/util/List;Ljava/util/Date;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/Intent;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "component3", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/FiatCurrencyExchange;", "component4", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentReceiver;", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/Integer;", "component7", "()Z", "component8", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/ConversionMethod;", "component9", "component10", "()Ljava/util/Date;", "component11", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/Intent;Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;Lcom/paypal/oslo/feature/moneymovement/api/domain/FiatCurrencyExchange;Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentReceiver;Ljava/util/List;Ljava/lang/Integer;ZLcom/paypal/oslo/feature/moneymovement/api/domain/ConversionMethod;Ljava/util/List;Ljava/util/Date;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData$State$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/Intent;", "getIntent", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "getPaymentPlan", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FiatCurrencyExchange;", "getFxQuote", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentReceiver;", "getReceiver", "Ljava/util/List;", "getLegalConsentItems", "Ljava/lang/Integer;", "getPointsRedeemed", "Z", "getShowFeeInfoIcon", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ConversionMethod;", "getConversionMethod", "getDisclosures", "Ljava/util/Date;", "getExpiryDateForPayPalLink", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getTotalToRecipientAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Ready implements com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod conversionMethod;
            private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure> disclosures;
            private final java.util.Date expiryDateForPayPalLink;
            private final com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange fxQuote;
            private final com.paypal.oslo.feature.moneymovement.api.domain.Intent intent;
            private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem> legalConsentItems;
            private final com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan;
            private final java.lang.Integer pointsRedeemed;
            private final com.paypal.oslo.feature.moneymovement.api.domain.PaymentReceiver receiver;
            private final boolean showFeeInfoIcon;
            private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount totalToRecipientAmount;

            public Ready(com.paypal.oslo.feature.moneymovement.api.domain.Intent intent, com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan, com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange fiatCurrencyExchange, com.paypal.oslo.feature.moneymovement.api.domain.PaymentReceiver paymentReceiver, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem> list, java.lang.Integer num, boolean z, com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod conversionMethod, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure> list2, java.util.Date date, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlan, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReceiver, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
                this.intent = intent;
                this.paymentPlan = paymentPlan;
                this.fxQuote = fiatCurrencyExchange;
                this.receiver = paymentReceiver;
                this.legalConsentItems = list;
                this.pointsRedeemed = num;
                this.showFeeInfoIcon = z;
                this.conversionMethod = conversionMethod;
                this.disclosures = list2;
                this.expiryDateForPayPalLink = date;
                this.totalToRecipientAmount = moneyAmount;
            }

            public final com.paypal.oslo.feature.moneymovement.api.domain.Intent getIntent() {
                return this.intent;
            }

            public final com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan getPaymentPlan() {
                return this.paymentPlan;
            }

            public final com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange getFxQuote() {
                return this.fxQuote;
            }

            public final com.paypal.oslo.feature.moneymovement.api.domain.PaymentReceiver getReceiver() {
                return this.receiver;
            }

            public /* synthetic */ Ready(com.paypal.oslo.feature.moneymovement.api.domain.Intent intent, com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan, com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange fiatCurrencyExchange, com.paypal.oslo.feature.moneymovement.api.domain.PaymentReceiver paymentReceiver, java.util.List list, java.lang.Integer num, boolean z, com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod conversionMethod, java.util.List list2, java.util.Date date, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(intent, paymentPlan, (i & 4) != 0 ? null : fiatCurrencyExchange, paymentReceiver, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : num, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : conversionMethod, (i & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 512) != 0 ? null : date, (i & 1024) != 0 ? null : moneyAmount);
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem> getLegalConsentItems() {
                return this.legalConsentItems;
            }

            public final java.lang.Integer getPointsRedeemed() {
                return this.pointsRedeemed;
            }

            public final boolean getShowFeeInfoIcon() {
                return this.showFeeInfoIcon;
            }

            public final com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod getConversionMethod() {
                return this.conversionMethod;
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure> getDisclosures() {
                return this.disclosures;
            }

            public final java.util.Date getExpiryDateForPayPalLink() {
                return this.expiryDateForPayPalLink;
            }

            public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getTotalToRecipientAmount() {
                return this.totalToRecipientAmount;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.moneymovement.api.domain.Intent intent = this.intent;
                com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan = this.paymentPlan;
                com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange fiatCurrencyExchange = this.fxQuote;
                com.paypal.oslo.feature.moneymovement.api.domain.PaymentReceiver paymentReceiver = this.receiver;
                java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem> list = this.legalConsentItems;
                java.lang.Integer num = this.pointsRedeemed;
                boolean z = this.showFeeInfoIcon;
                com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod conversionMethod = this.conversionMethod;
                java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure> list2 = this.disclosures;
                java.util.Date date = this.expiryDateForPayPalLink;
                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.totalToRecipientAmount;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(intent=");
                sb.append(intent);
                sb.append(", paymentPlan=");
                sb.append(paymentPlan);
                sb.append(", fxQuote=");
                sb.append(fiatCurrencyExchange);
                sb.append(", receiver=");
                sb.append(paymentReceiver);
                sb.append(", legalConsentItems=");
                sb.append(list);
                sb.append(", pointsRedeemed=");
                sb.append(num);
                sb.append(", showFeeInfoIcon=");
                sb.append(z);
                sb.append(", conversionMethod=");
                sb.append(conversionMethod);
                sb.append(", disclosures=");
                sb.append(list2);
                sb.append(", expiryDateForPayPalLink=");
                sb.append(date);
                sb.append(", totalToRecipientAmount=");
                sb.append(moneyAmount);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.intent.hashCode();
                int hashCode2 = this.paymentPlan.hashCode();
                com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange fiatCurrencyExchange = this.fxQuote;
                int hashCode3 = fiatCurrencyExchange == null ? 0 : fiatCurrencyExchange.hashCode();
                int hashCode4 = this.receiver.hashCode();
                int hashCode5 = this.legalConsentItems.hashCode();
                java.lang.Integer num = this.pointsRedeemed;
                int hashCode6 = num == null ? 0 : num.hashCode();
                int hashCode7 = java.lang.Boolean.hashCode(this.showFeeInfoIcon);
                com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod conversionMethod = this.conversionMethod;
                int hashCode8 = conversionMethod == null ? 0 : conversionMethod.hashCode();
                int hashCode9 = this.disclosures.hashCode();
                java.util.Date date = this.expiryDateForPayPalLink;
                int hashCode10 = date == null ? 0 : date.hashCode();
                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.totalToRecipientAmount;
                return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (moneyAmount != null ? moneyAmount.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Ready)) {
                    return false;
                }
                com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Ready) other;
                return this.intent == ready.intent && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentPlan, ready.paymentPlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuote, ready.fxQuote) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiver, ready.receiver) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalConsentItems, ready.legalConsentItems) && kotlin.jvm.internal.Intrinsics.areEqual(this.pointsRedeemed, ready.pointsRedeemed) && this.showFeeInfoIcon == ready.showFeeInfoIcon && kotlin.jvm.internal.Intrinsics.areEqual(this.conversionMethod, ready.conversionMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.disclosures, ready.disclosures) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryDateForPayPalLink, ready.expiryDateForPayPalLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalToRecipientAmount, ready.totalToRecipientAmount);
            }

            public final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Ready copy(com.paypal.oslo.feature.moneymovement.api.domain.Intent intent, com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan, com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange fxQuote, com.paypal.oslo.feature.moneymovement.api.domain.PaymentReceiver receiver, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem> legalConsentItems, java.lang.Integer pointsRedeemed, boolean showFeeInfoIcon, com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod conversionMethod, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure> disclosures, java.util.Date expiryDateForPayPalLink, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount totalToRecipientAmount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlan, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalConsentItems, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disclosures, "");
                return new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Ready(intent, paymentPlan, fxQuote, receiver, legalConsentItems, pointsRedeemed, showFeeInfoIcon, conversionMethod, disclosures, expiryDateForPayPalLink, totalToRecipientAmount);
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure> component9() {
                return this.disclosures;
            }

            /* renamed from: component8, reason: from getter */
            public final com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod getConversionMethod() {
                return this.conversionMethod;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getShowFeeInfoIcon() {
                return this.showFeeInfoIcon;
            }

            /* renamed from: component6, reason: from getter */
            public final java.lang.Integer getPointsRedeemed() {
                return this.pointsRedeemed;
            }

            public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.LegalConsentItem> component5() {
                return this.legalConsentItems;
            }

            /* renamed from: component4, reason: from getter */
            public final com.paypal.oslo.feature.moneymovement.api.domain.PaymentReceiver getReceiver() {
                return this.receiver;
            }

            /* renamed from: component3, reason: from getter */
            public final com.paypal.oslo.feature.moneymovement.api.domain.FiatCurrencyExchange getFxQuote() {
                return this.fxQuote;
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan getPaymentPlan() {
                return this.paymentPlan;
            }

            /* renamed from: component11, reason: from getter */
            public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getTotalToRecipientAmount() {
                return this.totalToRecipientAmount;
            }

            /* renamed from: component10, reason: from getter */
            public final java.util.Date getExpiryDateForPayPalLink() {
                return this.expiryDateForPayPalLink;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.moneymovement.api.domain.Intent getIntent() {
                return this.intent;
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State state = this.state;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SummaryData(state=");
        sb.append(state);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.state.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, ((com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData) other).state);
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData copy(com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData(state);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State getState() {
        return this.state;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData copy$default(com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData summaryData, com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State state, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            state = summaryData.state;
        }
        return summaryData.copy(state);
    }
}
