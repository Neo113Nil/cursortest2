package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "", "", "toLogString", "()Ljava/lang/String;", "Success", "Failure", "GetCardsFailed", "SetDefaultCardFailed", "SetCardArtFailed", "SetDefaultCardSkipped", "NotifyCardAddedError", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$DefaultError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$OTPError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$GetCardsFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$NotifyCardAddedError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$SetCardArtFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$SetDefaultCardFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$SetDefaultCardSkipped;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PayPalAddCardState {

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "AddCardInitiated", "EligibilityCheck", "HandleTermsAndConditions", "DigitizingCard", "DigitizationCompleted", "SelectIdentityVerificationMethod", "HandleOtpIdentityVerification", "Handle3dsVerification", "HandleAppToAppIdentityVerification", "CardActivated", "PrepareAddCardSuccess", "SetupAuthChallenge", "RiskDeclined", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$AddCardInitiated;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$CardActivated;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$DigitizationCompleted;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$DigitizingCard;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$EligibilityCheck;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$Handle3dsVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$HandleAppToAppIdentityVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$HandleOtpIdentityVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$HandleTermsAndConditions;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$PrepareAddCardSuccess;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$RiskDeclined;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$SelectIdentityVerificationMethod;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$SetupAuthChallenge;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Success extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState {

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static java.lang.String toLogString(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success success) {
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.super.toLogString();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$AddCardInitiated;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AddCardInitiated implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.AddCardInitiated INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.AddCardInitiated();

            public final int hashCode() {
                return 1011760807;
            }

            private AddCardInitiated() {
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String toString() {
                return "AddCardInitiated";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.AddCardInitiated)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$EligibilityCheck;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EligibilityCheck implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.EligibilityCheck INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.EligibilityCheck();

            public final int hashCode() {
                return -1003379832;
            }

            private EligibilityCheck() {
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String toString() {
                return "EligibilityCheck";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.EligibilityCheck)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$HandleTermsAndConditions;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "", "tcText", "Lkotlin/Function0;", "", "accept", "decline", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/String;", "getTcText", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getAccept", "()Lkotlin/jvm/functions/Function0;", "getDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class HandleTermsAndConditions implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 0;
            private final kotlin.jvm.functions.Function0<kotlin.Unit> accept;
            private final kotlin.jvm.functions.Function0<kotlin.Unit> decline;
            private final java.lang.String tcText;

            public HandleTermsAndConditions(java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
                this.tcText = str;
                this.accept = function0;
                this.decline = function02;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String getTcText() {
                return this.tcText;
            }

            public final kotlin.jvm.functions.Function0<kotlin.Unit> getAccept() {
                return this.accept;
            }

            public final kotlin.jvm.functions.Function0<kotlin.Unit> getDecline() {
                return this.decline;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$DigitizingCard;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DigitizingCard implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizingCard INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizingCard();

            public final int hashCode() {
                return 1424833153;
            }

            private DigitizingCard() {
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String toString() {
                return "DigitizingCard";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizingCard)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$DigitizationCompleted;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DigitizationCompleted implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizationCompleted INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizationCompleted();

            public final int hashCode() {
                return 856285063;
            }

            private DigitizationCompleted() {
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String toString() {
                return "DigitizationCompleted";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizationCompleted)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022$\b\u0002\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR6\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$SelectIdentityVerificationMethod;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "methods", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "onSelected", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "component1", "()Ljava/util/List;", "component2", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$SelectIdentityVerificationMethod;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMethods", "Lkotlin/jvm/functions/Function2;", "getOnSelected"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SelectIdentityVerificationMethod implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> methods;
            private final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onSelected;

            /* JADX WARN: Multi-variable type inference failed */
            public SelectIdentityVerificationMethod(java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> list, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
                this.methods = list;
                this.onSelected = function2;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> getMethods() {
                return this.methods;
            }

            public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getOnSelected() {
                return this.onSelected;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> list = this.methods;
                kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.onSelected;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectIdentityVerificationMethod(methods=");
                sb.append(list);
                sb.append(", onSelected=");
                sb.append(function2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.methods.hashCode() * 31) + this.onSelected.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SelectIdentityVerificationMethod)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SelectIdentityVerificationMethod selectIdentityVerificationMethod = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SelectIdentityVerificationMethod) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.methods, selectIdentityVerificationMethod.methods) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSelected, selectIdentityVerificationMethod.onSelected);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SelectIdentityVerificationMethod copy(java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> methods, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onSelected) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methods, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSelected, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SelectIdentityVerificationMethod(methods, onSelected);
            }

            public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> component2() {
                return this.onSelected;
            }

            public final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> component1() {
                return this.methods;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SelectIdentityVerificationMethod copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SelectIdentityVerificationMethod selectIdentityVerificationMethod, java.util.List list, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = selectIdentityVerificationMethod.methods;
                }
                if ((i & 2) != 0) {
                    function2 = selectIdentityVerificationMethod.onSelected;
                }
                return selectIdentityVerificationMethod.copy(list, function2);
            }
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002$\b\u0002\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R3\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$HandleOtpIdentityVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "", "onOtp", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$HandleOtpIdentityVerification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "getOnOtp"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HandleOtpIdentityVerification implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 8;
            private final kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onOtp;

            /* JADX WARN: Multi-variable type inference failed */
            public HandleOtpIdentityVerification(kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
                this.onOtp = function2;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getOnOtp() {
                return this.onOtp;
            }

            public final java.lang.String toString() {
                kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.onOtp;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleOtpIdentityVerification(onOtp=");
                sb.append(function2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.onOtp.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleOtpIdentityVerification) && kotlin.jvm.internal.Intrinsics.areEqual(this.onOtp, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleOtpIdentityVerification) other).onOtp);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleOtpIdentityVerification copy(kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onOtp) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onOtp, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleOtpIdentityVerification(onOtp);
            }

            public final kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> component1() {
                return this.onOtp;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleOtpIdentityVerification copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleOtpIdentityVerification handleOtpIdentityVerification, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    function2 = handleOtpIdentityVerification.onOtp;
                }
                return handleOtpIdentityVerification.copy(function2);
            }
        }

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002$\b\u0002\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R3\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$Handle3dsVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent;", "Lkotlin/coroutines/Continuation;", "", "", "on3dsAuth", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$Handle3dsVerification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "getOn3dsAuth"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Handle3dsVerification implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 8;
            private final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> on3dsAuth;

            /* JADX WARN: Multi-variable type inference failed */
            public Handle3dsVerification(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
                this.on3dsAuth = function2;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getOn3dsAuth() {
                return this.on3dsAuth;
            }

            public final java.lang.String toString() {
                kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.on3dsAuth;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Handle3dsVerification(on3dsAuth=");
                sb.append(function2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.on3dsAuth.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.Handle3dsVerification) && kotlin.jvm.internal.Intrinsics.areEqual(this.on3dsAuth, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.Handle3dsVerification) other).on3dsAuth);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.Handle3dsVerification copy(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> on3dsAuth) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(on3dsAuth, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.Handle3dsVerification(on3dsAuth);
            }

            public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> component1() {
                return this.on3dsAuth;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.Handle3dsVerification copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.Handle3dsVerification handle3dsVerification, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    function2 = handle3dsVerification.on3dsAuth;
                }
                return handle3dsVerification.copy(function2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$HandleAppToAppIdentityVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "", "scheme", "payload", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$HandleAppToAppIdentityVerification;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getScheme", "getPayload", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HandleAppToAppIdentityVerification implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 0;
            private final java.lang.String payload;
            private final java.lang.String scheme;
            private final java.lang.String source;

            public HandleAppToAppIdentityVerification(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                this.scheme = str;
                this.payload = str2;
                this.source = str3;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String getScheme() {
                return this.scheme;
            }

            public final java.lang.String getPayload() {
                return this.payload;
            }

            public final java.lang.String getSource() {
                return this.source;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.scheme;
                java.lang.String str2 = this.payload;
                java.lang.String str3 = this.source;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleAppToAppIdentityVerification(scheme=");
                sb.append(str);
                sb.append(", payload=");
                sb.append(str2);
                sb.append(", source=");
                sb.append(str3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((this.scheme.hashCode() * 31) + this.payload.hashCode()) * 31) + this.source.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleAppToAppIdentityVerification)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleAppToAppIdentityVerification handleAppToAppIdentityVerification = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleAppToAppIdentityVerification) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.scheme, handleAppToAppIdentityVerification.scheme) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, handleAppToAppIdentityVerification.payload) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, handleAppToAppIdentityVerification.source);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleAppToAppIdentityVerification copy(java.lang.String scheme, java.lang.String payload, java.lang.String source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleAppToAppIdentityVerification(scheme, payload, source);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getPayload() {
                return this.payload;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getScheme() {
                return this.scheme;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleAppToAppIdentityVerification copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleAppToAppIdentityVerification handleAppToAppIdentityVerification, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = handleAppToAppIdentityVerification.scheme;
                }
                if ((i & 2) != 0) {
                    str2 = handleAppToAppIdentityVerification.payload;
                }
                if ((i & 4) != 0) {
                    str3 = handleAppToAppIdentityVerification.source;
                }
                return handleAppToAppIdentityVerification.copy(str, str2, str3);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$CardActivated;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "card", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$CardActivated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "getCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardActivated implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard card;

            public CardActivated(com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCard, "");
                this.card = digitizedCard;
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard getCard() {
                return this.card;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard = this.card;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CardActivated(card=");
                sb.append(digitizedCard);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.card.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated) && kotlin.jvm.internal.Intrinsics.areEqual(this.card, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated) other).card);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated copy(com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard card) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated(card);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard getCard() {
                return this.card;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated cardActivated, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    digitizedCard = cardActivated.card;
                }
                return cardActivated.copy(digitizedCard);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$PrepareAddCardSuccess;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "deviceWalletServiceCardId", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$PrepareAddCardSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "getDeviceWalletServiceCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PrepareAddCardSuccess implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;

            public PrepareAddCardSuccess(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
                this.deviceWalletServiceCardId = deviceWalletServiceCardId;
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId getDeviceWalletServiceCardId() {
                return this.deviceWalletServiceCardId;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = this.deviceWalletServiceCardId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PrepareAddCardSuccess(deviceWalletServiceCardId=");
                sb.append(deviceWalletServiceCardId);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.deviceWalletServiceCardId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.PrepareAddCardSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceWalletServiceCardId, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.PrepareAddCardSuccess) other).deviceWalletServiceCardId);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.PrepareAddCardSuccess copy(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.PrepareAddCardSuccess(deviceWalletServiceCardId);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId getDeviceWalletServiceCardId() {
                return this.deviceWalletServiceCardId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.PrepareAddCardSuccess copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.PrepareAddCardSuccess prepareAddCardSuccess, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    deviceWalletServiceCardId = prepareAddCardSuccess.deviceWalletServiceCardId;
                }
                return prepareAddCardSuccess.copy(deviceWalletServiceCardId);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$SetupAuthChallenge;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "", "contextId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$SetupAuthChallenge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContextId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SetupAuthChallenge implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 0;
            private final java.lang.String contextId;

            public SetupAuthChallenge(java.lang.String str) {
                this.contextId = str;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String getContextId() {
                return this.contextId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.contextId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SetupAuthChallenge(contextId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.contextId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.contextId, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge) other).contextId);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge copy(java.lang.String contextId) {
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge(contextId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getContextId() {
                return this.contextId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge setupAuthChallenge, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = setupAuthChallenge.contextId;
                }
                return setupAuthChallenge.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success$RiskDeclined;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RiskDeclined implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.RiskDeclined INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.RiskDeclined();

            public final int hashCode() {
                return 1717730474;
            }

            private RiskDeclined() {
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String toString() {
                return "RiskDeclined";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.RiskDeclined)) {
                    return false;
                }
                return true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "InitCheckFailed", "PrepareAddCardError", "EligibilityCheckFailed", "UserDeclinedTermsAndConditions", "DigitizationFailed", "ActivationFailed", "CardNotFound", "OTPError", "ThreeDsError", "DefaultError", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$ActivationFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$CardNotFound;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$DigitizationFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$EligibilityCheckFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$InitCheckFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$ThreeDsError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$UserDeclinedTermsAndConditions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Failure extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState {

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static java.lang.String toLogString(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure failure) {
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.super.toLogString();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$InitCheckFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$InitCheckFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InitCheckFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure {
            public static final int $stable = 8;
            private final java.lang.String debugMessage;
            private final java.lang.Throwable throwable;

            public InitCheckFailed(java.lang.String str, java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.debugMessage = str;
                this.throwable = th;
            }

            public /* synthetic */ InitCheckFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : th);
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.debugMessage;
                java.lang.Throwable th = this.throwable;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InitCheckFailed(debugMessage=");
                sb.append(str);
                sb.append(", throwable=");
                sb.append(th);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.debugMessage.hashCode();
                java.lang.Throwable th = this.throwable;
                return (hashCode * 31) + (th == null ? 0 : th.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed initCheckFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, initCheckFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, initCheckFailed.throwable);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed(debugMessage, throwable);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed initCheckFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = initCheckFailed.debugMessage;
                }
                if ((i & 2) != 0) {
                    th = initCheckFailed.throwable;
                }
                return initCheckFailed.copy(str, th);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "Offline", "ResponseError", "ServiceApiError", "DefaultError", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$DefaultError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$Offline;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$ResponseError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$ServiceApiError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface PrepareAddCardError extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure {

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class DefaultImpls {
                @java.lang.Deprecated
                public static java.lang.String toLogString(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError prepareAddCardError) {
                    return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.super.toLogString();
                }
            }

            @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$Offline;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Offline implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError {
                public static final int $stable = 0;
                public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.Offline INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.Offline();

                public final int hashCode() {
                    return -1706305395;
                }

                private Offline() {
                }

                @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
                public final /* bridge */ java.lang.String toLogString() {
                    return super.toLogString();
                }

                public final java.lang.String toString() {
                    return "Offline";
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.Offline)) {
                        return false;
                    }
                    return true;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$ResponseError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError;", "", "responseCode", "", "errorBody", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$ResponseError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getResponseCode", "Ljava/lang/String;", "getErrorBody"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ResponseError implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError {
                public static final int $stable = 0;
                private final java.lang.String errorBody;
                private final int responseCode;

                public ResponseError(int i, java.lang.String str) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    this.responseCode = i;
                    this.errorBody = str;
                }

                public final java.lang.String getErrorBody() {
                    return this.errorBody;
                }

                public final int getResponseCode() {
                    return this.responseCode;
                }

                @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
                public final /* bridge */ java.lang.String toLogString() {
                    return super.toLogString();
                }

                public final java.lang.String toString() {
                    int i = this.responseCode;
                    java.lang.String str = this.errorBody;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseError(responseCode=");
                    sb.append(i);
                    sb.append(", errorBody=");
                    sb.append(str);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return (java.lang.Integer.hashCode(this.responseCode) * 31) + this.errorBody.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError)) {
                        return false;
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError responseError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError) other;
                    return this.responseCode == responseError.responseCode && kotlin.jvm.internal.Intrinsics.areEqual(this.errorBody, responseError.errorBody);
                }

                public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError copy(int responseCode, java.lang.String errorBody) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorBody, "");
                    return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError(responseCode, errorBody);
                }

                /* renamed from: component2, reason: from getter */
                public final java.lang.String getErrorBody() {
                    return this.errorBody;
                }

                /* renamed from: component1, reason: from getter */
                public final int getResponseCode() {
                    return this.responseCode;
                }

                public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError responseError, int i, java.lang.String str, int i2, java.lang.Object obj) {
                    if ((i2 & 1) != 0) {
                        i = responseError.responseCode;
                    }
                    if ((i2 & 2) != 0) {
                        str = responseError.errorBody;
                    }
                    return responseError.copy(i, str);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$ServiceApiError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$ServiceApiError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ServiceApiError implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError {
                public static final int $stable = 8;
                private final java.lang.Throwable throwable;

                public ServiceApiError(java.lang.Throwable th) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                    this.throwable = th;
                }

                public final java.lang.Throwable getThrowable() {
                    return this.throwable;
                }

                @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
                public final /* bridge */ java.lang.String toLogString() {
                    return super.toLogString();
                }

                public final java.lang.String toString() {
                    java.lang.Throwable th = this.throwable;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("ServiceApiError(throwable=");
                    sb.append(th);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return this.throwable.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ServiceApiError) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ServiceApiError) other).throwable);
                }

                public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ServiceApiError copy(java.lang.Throwable throwable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
                    return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ServiceApiError(throwable);
                }

                /* renamed from: component1, reason: from getter */
                public final java.lang.Throwable getThrowable() {
                    return this.throwable;
                }

                public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ServiceApiError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ServiceApiError serviceApiError, java.lang.Throwable th, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        th = serviceApiError.throwable;
                    }
                    return serviceApiError.copy(th);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$DefaultError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError;", "", "debugMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$PrepareAddCardError$DefaultError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class DefaultError implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError {
                public static final int $stable = 0;
                private final java.lang.String debugMessage;

                public DefaultError(java.lang.String str) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    this.debugMessage = str;
                }

                public final java.lang.String getDebugMessage() {
                    return this.debugMessage;
                }

                @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
                public final /* bridge */ java.lang.String toLogString() {
                    return super.toLogString();
                }

                public final java.lang.String toString() {
                    java.lang.String str = this.debugMessage;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultError(debugMessage=");
                    sb.append(str);
                    sb.append(")");
                    return sb.toString();
                }

                public final int hashCode() {
                    return this.debugMessage.hashCode();
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.DefaultError) && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.DefaultError) other).debugMessage);
                }

                public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.DefaultError copy(java.lang.String debugMessage) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                    return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.DefaultError(debugMessage);
                }

                /* renamed from: component1, reason: from getter */
                public final java.lang.String getDebugMessage() {
                    return this.debugMessage;
                }

                public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.DefaultError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.DefaultError defaultError, java.lang.String str, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = defaultError.debugMessage;
                    }
                    return defaultError.copy(str);
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$EligibilityCheckFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$EligibilityCheckFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EligibilityCheckFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure {
            public static final int $stable = 8;
            private final java.lang.String debugMessage;
            private final java.lang.Throwable throwable;

            public EligibilityCheckFailed(java.lang.String str, java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.debugMessage = str;
                this.throwable = th;
            }

            public /* synthetic */ EligibilityCheckFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : th);
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.debugMessage;
                java.lang.Throwable th = this.throwable;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibilityCheckFailed(debugMessage=");
                sb.append(str);
                sb.append(", throwable=");
                sb.append(th);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.debugMessage.hashCode();
                java.lang.Throwable th = this.throwable;
                return (hashCode * 31) + (th == null ? 0 : th.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed eligibilityCheckFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, eligibilityCheckFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, eligibilityCheckFailed.throwable);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed(debugMessage, throwable);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed eligibilityCheckFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = eligibilityCheckFailed.debugMessage;
                }
                if ((i & 2) != 0) {
                    th = eligibilityCheckFailed.throwable;
                }
                return eligibilityCheckFailed.copy(str, th);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$UserDeclinedTermsAndConditions;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UserDeclinedTermsAndConditions implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.UserDeclinedTermsAndConditions INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.UserDeclinedTermsAndConditions();

            public final int hashCode() {
                return -188349561;
            }

            private UserDeclinedTermsAndConditions() {
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String toString() {
                return "UserDeclinedTermsAndConditions";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.UserDeclinedTermsAndConditions)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$DigitizationFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$DigitizationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DigitizationFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure {
            public static final int $stable = 8;
            private final java.lang.String debugMessage;
            private final java.lang.Throwable throwable;

            public DigitizationFailed(java.lang.String str, java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.debugMessage = str;
                this.throwable = th;
            }

            public /* synthetic */ DigitizationFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : th);
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.debugMessage;
                java.lang.Throwable th = this.throwable;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DigitizationFailed(debugMessage=");
                sb.append(str);
                sb.append(", throwable=");
                sb.append(th);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.debugMessage.hashCode();
                java.lang.Throwable th = this.throwable;
                return (hashCode * 31) + (th == null ? 0 : th.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed digitizationFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, digitizationFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, digitizationFailed.throwable);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed(debugMessage, throwable);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed digitizationFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = digitizationFailed.debugMessage;
                }
                if ((i & 2) != 0) {
                    th = digitizationFailed.throwable;
                }
                return digitizationFailed.copy(str, th);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$ActivationFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$ActivationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ActivationFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure {
            public static final int $stable = 8;
            private final java.lang.String debugMessage;
            private final java.lang.Throwable throwable;

            public ActivationFailed(java.lang.String str, java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.debugMessage = str;
                this.throwable = th;
            }

            public /* synthetic */ ActivationFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : th);
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.debugMessage;
                java.lang.Throwable th = this.throwable;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivationFailed(debugMessage=");
                sb.append(str);
                sb.append(", throwable=");
                sb.append(th);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.debugMessage.hashCode();
                java.lang.Throwable th = this.throwable;
                return (hashCode * 31) + (th == null ? 0 : th.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed activationFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, activationFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, activationFailed.throwable);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed(debugMessage, throwable);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed activationFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activationFailed.debugMessage;
                }
                if ((i & 2) != 0) {
                    th = activationFailed.throwable;
                }
                return activationFailed.copy(str, th);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$CardNotFound;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardNotFound implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.CardNotFound INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.CardNotFound();

            public final int hashCode() {
                return -2040428027;
            }

            private CardNotFound() {
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String toString() {
                return "CardNotFound";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.CardNotFound)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$OTPError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "otpErrorCode", "", "debugMessage", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$OTPError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "getOtpErrorCode", "Ljava/lang/String;", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OTPError implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState {
            public static final int $stable = 0;
            private final java.lang.String debugMessage;
            private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode otpErrorCode;

            public OTPError(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oTPErrorCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.otpErrorCode = oTPErrorCode;
                this.debugMessage = str;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode getOtpErrorCode() {
                return this.otpErrorCode;
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode = this.otpErrorCode;
                java.lang.String str = this.debugMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OTPError(otpErrorCode=");
                sb.append(oTPErrorCode);
                sb.append(", debugMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.otpErrorCode.hashCode() * 31) + this.debugMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError oTPError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError) other;
                return this.otpErrorCode == oTPError.otpErrorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, oTPError.debugMessage);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError copy(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode otpErrorCode, java.lang.String debugMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpErrorCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError(otpErrorCode, debugMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode getOtpErrorCode() {
                return this.otpErrorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError oTPError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oTPErrorCode = oTPError.otpErrorCode;
                }
                if ((i & 2) != 0) {
                    str = oTPError.debugMessage;
                }
                return oTPError.copy(oTPErrorCode, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$ThreeDsError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;", "threeDsErrorCode", "", "debugMessage", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$ThreeDsError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;", "getThreeDsErrorCode", "Ljava/lang/String;", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ThreeDsError implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure {
            public static final int $stable = 0;
            private final java.lang.String debugMessage;
            private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode;

            public ThreeDsError(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsErrorCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.threeDsErrorCode = threeDsErrorCode;
                this.debugMessage = str;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode getThreeDsErrorCode() {
                return this.threeDsErrorCode;
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode = this.threeDsErrorCode;
                java.lang.String str = this.debugMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreeDsError(threeDsErrorCode=");
                sb.append(threeDsErrorCode);
                sb.append(", debugMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.threeDsErrorCode.hashCode() * 31) + this.debugMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError threeDsError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError) other;
                return this.threeDsErrorCode == threeDsError.threeDsErrorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, threeDsError.debugMessage);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError copy(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode, java.lang.String debugMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsErrorCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError(threeDsErrorCode, debugMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode getThreeDsErrorCode() {
                return this.threeDsErrorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError threeDsError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    threeDsErrorCode = threeDsError.threeDsErrorCode;
                }
                if ((i & 2) != 0) {
                    str = threeDsError.debugMessage;
                }
                return threeDsError.copy(threeDsErrorCode, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$DefaultError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "", "errorCode", "debugMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$Failure$DefaultError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DefaultError implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState {
            public static final int $stable = 0;
            private final java.lang.String debugMessage;
            private final java.lang.String errorCode;

            public DefaultError(java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.errorCode = str;
                this.debugMessage = str2;
            }

            @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
            public final /* bridge */ java.lang.String toLogString() {
                return super.toLogString();
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.String str2 = this.debugMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultError(errorCode=");
                sb.append(str);
                sb.append(", debugMessage=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.errorCode.hashCode() * 31) + this.debugMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError defaultError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, defaultError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, defaultError.debugMessage);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError copy(java.lang.String errorCode, java.lang.String debugMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError(errorCode, debugMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError defaultError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = defaultError.errorCode;
                }
                if ((i & 2) != 0) {
                    str2 = defaultError.debugMessage;
                }
                return defaultError.copy(str, str2);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$GetCardsFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$GetCardsFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GetCardsFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState {
        public static final int $stable = 8;
        private final java.lang.String debugMessage;
        private final java.lang.Throwable throwable;

        public GetCardsFailed(java.lang.String str, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.debugMessage = str;
            this.throwable = th;
        }

        public /* synthetic */ GetCardsFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
        public final /* bridge */ java.lang.String toLogString() {
            return super.toLogString();
        }

        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.debugMessage;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCardsFailed(debugMessage=");
            sb.append(str);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.debugMessage.hashCode();
            java.lang.Throwable th = this.throwable;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.GetCardsFailed)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.GetCardsFailed getCardsFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.GetCardsFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, getCardsFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, getCardsFailed.throwable);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.GetCardsFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.GetCardsFailed(debugMessage, throwable);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.GetCardsFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.GetCardsFailed getCardsFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = getCardsFailed.debugMessage;
            }
            if ((i & 2) != 0) {
                th = getCardsFailed.throwable;
            }
            return getCardsFailed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$SetDefaultCardFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$SetDefaultCardFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetDefaultCardFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState {
        public static final int $stable = 8;
        private final java.lang.String debugMessage;
        private final java.lang.Throwable throwable;

        public SetDefaultCardFailed(java.lang.String str, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.debugMessage = str;
            this.throwable = th;
        }

        public /* synthetic */ SetDefaultCardFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
        public final /* bridge */ java.lang.String toLogString() {
            return super.toLogString();
        }

        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.debugMessage;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SetDefaultCardFailed(debugMessage=");
            sb.append(str);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.debugMessage.hashCode();
            java.lang.Throwable th = this.throwable;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardFailed)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardFailed setDefaultCardFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, setDefaultCardFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, setDefaultCardFailed.throwable);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardFailed(debugMessage, throwable);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardFailed setDefaultCardFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = setDefaultCardFailed.debugMessage;
            }
            if ((i & 2) != 0) {
                th = setDefaultCardFailed.throwable;
            }
            return setDefaultCardFailed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$SetCardArtFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$SetCardArtFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetCardArtFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState {
        public static final int $stable = 8;
        private final java.lang.String debugMessage;
        private final java.lang.Throwable throwable;

        public SetCardArtFailed(java.lang.String str, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.debugMessage = str;
            this.throwable = th;
        }

        public /* synthetic */ SetCardArtFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
        public final /* bridge */ java.lang.String toLogString() {
            return super.toLogString();
        }

        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.debugMessage;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SetCardArtFailed(debugMessage=");
            sb.append(str);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.debugMessage.hashCode();
            java.lang.Throwable th = this.throwable;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetCardArtFailed)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetCardArtFailed setCardArtFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetCardArtFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, setCardArtFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, setCardArtFailed.throwable);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetCardArtFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetCardArtFailed(debugMessage, throwable);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetCardArtFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetCardArtFailed setCardArtFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = setCardArtFailed.debugMessage;
            }
            if ((i & 2) != 0) {
                th = setCardArtFailed.throwable;
            }
            return setCardArtFailed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$SetDefaultCardSkipped;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "", "debugMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$SetDefaultCardSkipped;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetDefaultCardSkipped implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState {
        public static final int $stable = 0;
        private final java.lang.String debugMessage;

        public SetDefaultCardSkipped(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.debugMessage = str;
        }

        @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
        public final /* bridge */ java.lang.String toLogString() {
            return super.toLogString();
        }

        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.debugMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SetDefaultCardSkipped(debugMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debugMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardSkipped) && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardSkipped) other).debugMessage);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardSkipped copy(java.lang.String debugMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardSkipped(debugMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardSkipped copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardSkipped setDefaultCardSkipped, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = setDefaultCardSkipped.debugMessage;
            }
            return setDefaultCardSkipped.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$NotifyCardAddedError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;", "", "debugMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState$NotifyCardAddedError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotifyCardAddedError implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState {
        public static final int $stable = 0;
        private final java.lang.String debugMessage;

        public NotifyCardAddedError(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.debugMessage = str;
        }

        @Override // com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState
        public final /* bridge */ java.lang.String toLogString() {
            return super.toLogString();
        }

        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.debugMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotifyCardAddedError(debugMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debugMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.NotifyCardAddedError) && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.NotifyCardAddedError) other).debugMessage);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.NotifyCardAddedError copy(java.lang.String debugMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.NotifyCardAddedError(debugMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.NotifyCardAddedError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.NotifyCardAddedError notifyCardAddedError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notifyCardAddedError.debugMessage;
            }
            return notifyCardAddedError.copy(str);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.String toLogString(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState payPalAddCardState) {
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.super.toLogString();
        }
    }

    default java.lang.String toLogString() {
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DefaultError) {
            return "DefaultError";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ActivationFailed) {
            return "ActivationFailed";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.CardNotFound.INSTANCE)) {
            return "CardNotFound";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.DigitizationFailed) {
            return "DigitizationFailed";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.EligibilityCheckFailed) {
            return "EligibilityCheckFailed";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.InitCheckFailed) {
            return "InitCheckFailed";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.DefaultError) {
            return "DefaultError";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.Offline.INSTANCE)) {
            return "Offline";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ResponseError) {
            return "ResponseError";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.PrepareAddCardError.ServiceApiError) {
            return "ServiceApiError";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.UserDeclinedTermsAndConditions.INSTANCE)) {
            return "UserDeclinedTermsAndConditions";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.GetCardsFailed) {
            return "GetCardsFailed";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.NotifyCardAddedError) {
            return "NotifyCardAddedError";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.OTPError) {
            return "OTPError";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetCardArtFailed) {
            return "SetCardArtFailed";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardFailed) {
            return "SetDefaultCardFailed";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.SetDefaultCardSkipped) {
            return "SetDefaultCardSkipped";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.AddCardInitiated.INSTANCE)) {
            return "AddCardInitiated";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.CardActivated) {
            return "CardActivated";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizationCompleted.INSTANCE)) {
            return "DigitizationCompleted";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.DigitizingCard.INSTANCE)) {
            return "DigitizingCard";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.EligibilityCheck.INSTANCE)) {
            return "EligibilityCheck";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleAppToAppIdentityVerification) {
            return "HandleAppToAppIdentityVerification";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleOtpIdentityVerification) {
            return "HandleOtpIdentityVerification";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.HandleTermsAndConditions) {
            return "HandleTermsAndConditions";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.PrepareAddCardSuccess) {
            return "PrepareAddCardSuccess";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.RiskDeclined.INSTANCE)) {
            return "RiskDeclined";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SelectIdentityVerificationMethod) {
            return "SelectIdentityVerificationMethod";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.SetupAuthChallenge) {
            return "SetupAuthChallenge";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.ThreeDsError) {
            return "3DSError";
        }
        if (this instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Success.Handle3dsVerification) {
            return "Handle3dsVerification";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
