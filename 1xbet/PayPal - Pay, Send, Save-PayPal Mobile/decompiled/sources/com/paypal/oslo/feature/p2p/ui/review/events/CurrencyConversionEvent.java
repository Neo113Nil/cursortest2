package com.paypal.oslo.feature.p2p.ui.review.events;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\r\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\r\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowConversionSheet", "CancelConversion", "SelectConversionOption", "ConfirmConversion", "FxQuoteLoaded", "UpdateTransferAttemptId", "CacheFxQuote", "ClearCachedFxQuote", "CachePlanCurrencyExchange", "UpdatePaymentPlanId", "ProviderUpdateSucceeded", "ProviderUpdateFailed", "ProviderUpdateStarted", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$CacheFxQuote;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$CachePlanCurrencyExchange;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$CancelConversion;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ClearCachedFxQuote;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ConfirmConversion;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$FxQuoteLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ProviderUpdateFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ProviderUpdateStarted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ProviderUpdateSucceeded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$SelectConversionOption;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ShowConversionSheet;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$UpdatePaymentPlanId;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$UpdateTransferAttemptId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CurrencyConversionEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CurrencyConversionEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ShowConversionSheet;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "", "senderAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ShowConversionSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSenderAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowConversionSheet extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        private final java.lang.String senderAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowConversionSheet(java.lang.String str) {
            super("ShowConversionSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.senderAmount = str;
        }

        public final java.lang.String getSenderAmount() {
            return this.senderAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.senderAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowConversionSheet(senderAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.senderAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.senderAmount, ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet) other).senderAmount);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet copy(java.lang.String senderAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderAmount, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet(senderAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSenderAmount() {
            return this.senderAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet copy$default(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet showConversionSheet, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showConversionSheet.senderAmount;
            }
            return showConversionSheet.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$CancelConversion;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelConversion extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CancelConversion INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CancelConversion();

        public final int hashCode() {
            return 22407379;
        }

        private CancelConversion() {
            super("CancelConversion", null);
        }

        public final java.lang.String toString() {
            return "CancelConversion";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CancelConversion)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$SelectConversionOption;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;)Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$SelectConversionOption;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "getOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectConversionOption extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.ConversionOption option;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectConversionOption(com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption) {
            super("SelectConversionOption", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOption, "");
            this.option = conversionOption;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getOption() {
            return this.option;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption = this.option;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectConversionOption(option=");
            sb.append(conversionOption);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption) && this.option == ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption) other).option;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption copy(com.paypal.oslo.feature.p2p.domain.model.ConversionOption option) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption(option);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getOption() {
            return this.option;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption copy$default(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.SelectConversionOption selectConversionOption, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                conversionOption = selectConversionOption.option;
            }
            return selectConversionOption.copy(conversionOption);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ConfirmConversion;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;)Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ConfirmConversion;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "getOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmConversion extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.ConversionOption option;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmConversion(com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption) {
            super("ConfirmConversion", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOption, "");
            this.option = conversionOption;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getOption() {
            return this.option;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption = this.option;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmConversion(option=");
            sb.append(conversionOption);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion) && this.option == ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion) other).option;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion copy(com.paypal.oslo.feature.p2p.domain.model.ConversionOption option) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion(option);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getOption() {
            return this.option;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion copy$default(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ConfirmConversion confirmConversion, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                conversionOption = confirmConversion.option;
            }
            return confirmConversion.copy(conversionOption);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$FxQuoteLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "", "formattedAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE, "fxQuoteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$FxQuoteLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount", "getConversionRate", "getFxQuoteId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FxQuoteLoaded extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        private final java.lang.String conversionRate;
        private final java.lang.String formattedAmount;
        private final java.lang.String fxQuoteId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FxQuoteLoaded(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("FxQuoteLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.formattedAmount = str;
            this.conversionRate = str2;
            this.fxQuoteId = str3;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String getConversionRate() {
            return this.conversionRate;
        }

        public final java.lang.String getFxQuoteId() {
            return this.fxQuoteId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            java.lang.String str2 = this.conversionRate;
            java.lang.String str3 = this.fxQuoteId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FxQuoteLoaded(formattedAmount=");
            sb.append(str);
            sb.append(", conversionRate=");
            sb.append(str2);
            sb.append(", fxQuoteId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.formattedAmount.hashCode() * 31) + this.conversionRate.hashCode()) * 31) + this.fxQuoteId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded fxQuoteLoaded = (com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, fxQuoteLoaded.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.conversionRate, fxQuoteLoaded.conversionRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuoteId, fxQuoteLoaded.fxQuoteId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded copy(java.lang.String formattedAmount, java.lang.String conversionRate, java.lang.String fxQuoteId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionRate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fxQuoteId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded(formattedAmount, conversionRate, fxQuoteId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFxQuoteId() {
            return this.fxQuoteId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getConversionRate() {
            return this.conversionRate;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded copy$default(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded fxQuoteLoaded, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fxQuoteLoaded.formattedAmount;
            }
            if ((i & 2) != 0) {
                str2 = fxQuoteLoaded.conversionRate;
            }
            if ((i & 4) != 0) {
                str3 = fxQuoteLoaded.fxQuoteId;
            }
            return fxQuoteLoaded.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$UpdateTransferAttemptId;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$UpdateTransferAttemptId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransferAttemptId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateTransferAttemptId extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        private final java.lang.String transferAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateTransferAttemptId(java.lang.String str) {
            super("UpdateTransferAttemptId", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.transferAttemptId = str;
        }

        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transferAttemptId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateTransferAttemptId(transferAttemptId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transferAttemptId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdateTransferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdateTransferAttemptId) other).transferAttemptId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdateTransferAttemptId copy(java.lang.String transferAttemptId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdateTransferAttemptId(transferAttemptId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdateTransferAttemptId copy$default(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdateTransferAttemptId updateTransferAttemptId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateTransferAttemptId.transferAttemptId;
            }
            return updateTransferAttemptId.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$CacheFxQuote;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "fxQuote", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;)Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$CacheFxQuote;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "getFxQuote"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CacheFxQuote extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CacheFxQuote(com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote) {
            super("CacheFxQuote", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fxQuote, "");
            this.fxQuote = fxQuote;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote = this.fxQuote;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CacheFxQuote(fxQuote=");
            sb.append(fxQuote);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fxQuote.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CacheFxQuote) && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuote, ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CacheFxQuote) other).fxQuote);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CacheFxQuote copy(com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fxQuote, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CacheFxQuote(fxQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CacheFxQuote copy$default(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CacheFxQuote cacheFxQuote, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fxQuote = cacheFxQuote.fxQuote;
            }
            return cacheFxQuote.copy(fxQuote);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ClearCachedFxQuote;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearCachedFxQuote extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ClearCachedFxQuote INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ClearCachedFxQuote();

        public final int hashCode() {
            return -2781986;
        }

        private ClearCachedFxQuote() {
            super("ClearCachedFxQuote", null);
        }

        public final java.lang.String toString() {
            return "ClearCachedFxQuote";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ClearCachedFxQuote)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$CachePlanCurrencyExchange;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "planCurrencyExchange", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;)Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$CachePlanCurrencyExchange;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "getPlanCurrencyExchange"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CachePlanCurrencyExchange extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CachePlanCurrencyExchange(com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange) {
            super("CachePlanCurrencyExchange", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCurrencyExchange, "");
            this.planCurrencyExchange = planCurrencyExchange;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange getPlanCurrencyExchange() {
            return this.planCurrencyExchange;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange = this.planCurrencyExchange;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CachePlanCurrencyExchange(planCurrencyExchange=");
            sb.append(planCurrencyExchange);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.planCurrencyExchange.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CachePlanCurrencyExchange) && kotlin.jvm.internal.Intrinsics.areEqual(this.planCurrencyExchange, ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CachePlanCurrencyExchange) other).planCurrencyExchange);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CachePlanCurrencyExchange copy(com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCurrencyExchange, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CachePlanCurrencyExchange(planCurrencyExchange);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange getPlanCurrencyExchange() {
            return this.planCurrencyExchange;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CachePlanCurrencyExchange copy$default(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CachePlanCurrencyExchange cachePlanCurrencyExchange, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planCurrencyExchange = cachePlanCurrencyExchange.planCurrencyExchange;
            }
            return cachePlanCurrencyExchange.copy(planCurrencyExchange);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$UpdatePaymentPlanId;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_PLAN_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$UpdatePaymentPlanId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentPlanId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdatePaymentPlanId extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        private final java.lang.String paymentPlanId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatePaymentPlanId(java.lang.String str) {
            super("UpdatePaymentPlanId", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.paymentPlanId = str;
        }

        public final java.lang.String getPaymentPlanId() {
            return this.paymentPlanId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.paymentPlanId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePaymentPlanId(paymentPlanId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentPlanId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdatePaymentPlanId) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentPlanId, ((com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdatePaymentPlanId) other).paymentPlanId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdatePaymentPlanId copy(java.lang.String paymentPlanId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlanId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdatePaymentPlanId(paymentPlanId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPaymentPlanId() {
            return this.paymentPlanId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdatePaymentPlanId copy$default(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.UpdatePaymentPlanId updatePaymentPlanId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updatePaymentPlanId.paymentPlanId;
            }
            return updatePaymentPlanId.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ProviderUpdateSucceeded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "provider", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "fundingOptions", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ProviderUpdateSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "getProvider", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "getFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProviderUpdateSucceeded extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions;
        private final com.paypal.oslo.feature.p2p.domain.model.ConversionOption provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderUpdateSucceeded(com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
            super("ProviderUpdateSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOption, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
            this.provider = conversionOption;
            this.fundingOptions = fundingOptions;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getProvider() {
            return this.provider;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption = this.provider;
            com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.fundingOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProviderUpdateSucceeded(provider=");
            sb.append(conversionOption);
            sb.append(", fundingOptions=");
            sb.append(fundingOptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.provider.hashCode() * 31) + this.fundingOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded providerUpdateSucceeded = (com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded) other;
            return this.provider == providerUpdateSucceeded.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptions, providerUpdateSucceeded.fundingOptions);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded copy(com.paypal.oslo.feature.p2p.domain.model.ConversionOption provider, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded(provider, fundingOptions);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded copy$default(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded providerUpdateSucceeded, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                conversionOption = providerUpdateSucceeded.provider;
            }
            if ((i & 2) != 0) {
                fundingOptions = providerUpdateSucceeded.fundingOptions;
            }
            return providerUpdateSucceeded.copy(conversionOption, fundingOptions);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ProviderUpdateFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "provider", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "error", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;)Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ProviderUpdateFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "getProvider", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProviderUpdateFailed extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.error.TransferError error;
        private final com.paypal.oslo.feature.p2p.domain.model.ConversionOption provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProviderUpdateFailed(com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, com.paypal.oslo.feature.p2p.domain.error.TransferError transferError) {
            super("ProviderUpdateFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOption, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferError, "");
            this.provider = conversionOption;
            this.error = transferError;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getProvider() {
            return this.provider;
        }

        public final com.paypal.oslo.feature.p2p.domain.error.TransferError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption = this.provider;
            com.paypal.oslo.feature.p2p.domain.error.TransferError transferError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProviderUpdateFailed(provider=");
            sb.append(conversionOption);
            sb.append(", error=");
            sb.append(transferError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.provider.hashCode() * 31) + this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateFailed)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateFailed providerUpdateFailed = (com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateFailed) other;
            return this.provider == providerUpdateFailed.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.error, providerUpdateFailed.error);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateFailed copy(com.paypal.oslo.feature.p2p.domain.model.ConversionOption provider, com.paypal.oslo.feature.p2p.domain.error.TransferError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateFailed(provider, error);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.error.TransferError getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateFailed copy$default(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateFailed providerUpdateFailed, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, com.paypal.oslo.feature.p2p.domain.error.TransferError transferError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                conversionOption = providerUpdateFailed.provider;
            }
            if ((i & 2) != 0) {
                transferError = providerUpdateFailed.error;
            }
            return providerUpdateFailed.copy(conversionOption, transferError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent$ProviderUpdateStarted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProviderUpdateStarted extends com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateStarted INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateStarted();

        public final int hashCode() {
            return 27367748;
        }

        private ProviderUpdateStarted() {
            super("ProviderUpdateStarted", null);
        }

        public final java.lang.String toString() {
            return "ProviderUpdateStarted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateStarted)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CurrencyConversionEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
