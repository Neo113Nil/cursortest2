package com.paypal.oslo.feature.taptopay.domain.model.card;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0005\n\u000b\f\r\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "", "Success", "Failure", "GetCardsFailed", "SetDefaultCardFailed", "SetDefaultCardSkipped", "OTPError", "ThreeDsError", "ThreeDsEvent", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$GetCardsFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$SetDefaultCardFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$SetDefaultCardSkipped;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AddCardState {

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "AddCardInitiated", "EligibilityCheck", "HandleTermsAndConditions", "DigitizingCard", "DigitizationCompleted", "SelectIdentityVerificationMethod", "HandleOtpIdentityVerification", "Handle3dsVerification", "HandleAppToAppIdentityVerification", "CardActivated", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$AddCardInitiated;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$CardActivated;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$DigitizationCompleted;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$DigitizingCard;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$EligibilityCheck;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$Handle3dsVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$HandleAppToAppIdentityVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$HandleOtpIdentityVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$HandleTermsAndConditions;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$SelectIdentityVerificationMethod;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Success extends com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$AddCardInitiated;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AddCardInitiated implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.AddCardInitiated INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.AddCardInitiated();

            public final int hashCode() {
                return 377427953;
            }

            private AddCardInitiated() {
            }

            public final java.lang.String toString() {
                return "AddCardInitiated";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.AddCardInitiated)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$EligibilityCheck;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EligibilityCheck implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.EligibilityCheck INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.EligibilityCheck();

            public final int hashCode() {
                return -1637712686;
            }

            private EligibilityCheck() {
            }

            public final java.lang.String toString() {
                return "EligibilityCheck";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.EligibilityCheck)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$HandleTermsAndConditions;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "", "tcText", "Lkotlin/Function0;", "", "accept", "decline", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/String;", "getTcText", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getAccept", "()Lkotlin/jvm/functions/Function0;", "getDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class HandleTermsAndConditions implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success {
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

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$DigitizingCard;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DigitizingCard implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizingCard INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizingCard();

            public final int hashCode() {
                return -1757946293;
            }

            private DigitizingCard() {
            }

            public final java.lang.String toString() {
                return "DigitizingCard";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizingCard)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$DigitizationCompleted;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "", "digitizedCardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$DigitizationCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDigitizedCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DigitizationCompleted implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success {
            public static final int $stable = 0;
            private final java.lang.String digitizedCardId;

            public DigitizationCompleted(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.digitizedCardId = str;
            }

            public final java.lang.String getDigitizedCardId() {
                return this.digitizedCardId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.digitizedCardId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DigitizationCompleted(digitizedCardId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.digitizedCardId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.digitizedCardId, ((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted) other).digitizedCardId);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted copy(java.lang.String digitizedCardId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted(digitizedCardId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDigitizedCardId() {
                return this.digitizedCardId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted digitizationCompleted, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = digitizationCompleted.digitizedCardId;
                }
                return digitizationCompleted.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022$\b\u0002\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR6\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$SelectIdentityVerificationMethod;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "methods", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "onSelected", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "component1", "()Ljava/util/List;", "component2", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$SelectIdentityVerificationMethod;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMethods", "Lkotlin/jvm/functions/Function2;", "getOnSelected"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SelectIdentityVerificationMethod implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success {
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
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod selectIdentityVerificationMethod = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.methods, selectIdentityVerificationMethod.methods) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSelected, selectIdentityVerificationMethod.onSelected);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod copy(java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> methods, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onSelected) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methods, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSelected, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod(methods, onSelected);
            }

            public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> component2() {
                return this.onSelected;
            }

            public final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> component1() {
                return this.methods;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod selectIdentityVerificationMethod, java.util.List list, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = selectIdentityVerificationMethod.methods;
                }
                if ((i & 2) != 0) {
                    function2 = selectIdentityVerificationMethod.onSelected;
                }
                return selectIdentityVerificationMethod.copy(list, function2);
            }
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002$\b\u0002\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R3\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$HandleOtpIdentityVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "", "onOtp", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$HandleOtpIdentityVerification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "getOnOtp"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HandleOtpIdentityVerification implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success {
            public static final int $stable = 8;
            private final kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onOtp;

            /* JADX WARN: Multi-variable type inference failed */
            public HandleOtpIdentityVerification(kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
                this.onOtp = function2;
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
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleOtpIdentityVerification) && kotlin.jvm.internal.Intrinsics.areEqual(this.onOtp, ((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleOtpIdentityVerification) other).onOtp);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleOtpIdentityVerification copy(kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onOtp) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onOtp, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleOtpIdentityVerification(onOtp);
            }

            public final kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> component1() {
                return this.onOtp;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleOtpIdentityVerification copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleOtpIdentityVerification handleOtpIdentityVerification, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    function2 = handleOtpIdentityVerification.onOtp;
                }
                return handleOtpIdentityVerification.copy(function2);
            }
        }

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002$\b\u0002\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R3\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$Handle3dsVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent;", "Lkotlin/coroutines/Continuation;", "", "", "on3dsAuth", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$Handle3dsVerification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "getOn3dsAuth"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Handle3dsVerification implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success {
            public static final int $stable = 8;
            private final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> on3dsAuth;

            /* JADX WARN: Multi-variable type inference failed */
            public Handle3dsVerification(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
                this.on3dsAuth = function2;
            }

            public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getOn3dsAuth() {
                return this.on3dsAuth;
            }

            public final java.lang.String toString() {
                kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.on3dsAuth;
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
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.Handle3dsVerification) && kotlin.jvm.internal.Intrinsics.areEqual(this.on3dsAuth, ((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.Handle3dsVerification) other).on3dsAuth);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.Handle3dsVerification copy(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> on3dsAuth) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(on3dsAuth, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.Handle3dsVerification(on3dsAuth);
            }

            public final kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> component1() {
                return this.on3dsAuth;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.Handle3dsVerification copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.Handle3dsVerification handle3dsVerification, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    function2 = handle3dsVerification.on3dsAuth;
                }
                return handle3dsVerification.copy(function2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$HandleAppToAppIdentityVerification;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "", "scheme", "payload", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$HandleAppToAppIdentityVerification;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getScheme", "getPayload", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HandleAppToAppIdentityVerification implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success {
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
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleAppToAppIdentityVerification)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleAppToAppIdentityVerification handleAppToAppIdentityVerification = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleAppToAppIdentityVerification) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.scheme, handleAppToAppIdentityVerification.scheme) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, handleAppToAppIdentityVerification.payload) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, handleAppToAppIdentityVerification.source);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleAppToAppIdentityVerification copy(java.lang.String scheme, java.lang.String payload, java.lang.String source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleAppToAppIdentityVerification(scheme, payload, source);
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

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleAppToAppIdentityVerification copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleAppToAppIdentityVerification handleAppToAppIdentityVerification, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$CardActivated;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "card", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Success$CardActivated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "getCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardActivated implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard card;

            public CardActivated(com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCard, "");
                this.card = digitizedCard;
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard getCard() {
                return this.card;
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
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) && kotlin.jvm.internal.Intrinsics.areEqual(this.card, ((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) other).card);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated copy(com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard card) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated(card);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard getCard() {
                return this.card;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    digitizedCard = cardActivated.card;
                }
                return cardActivated.copy(digitizedCard);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "EligibilityCheckFailed", "UserDeclinedTermsAndConditions", "DigitizationFailed", "ActivationFailed", "InitCheckFailed", "CardNotFound", "OTPError", "ThreeDsError", "ContinueAddCardError", "DefaultError", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$ActivationFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$CardNotFound;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$ContinueAddCardError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$DefaultError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$DigitizationFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$EligibilityCheckFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$InitCheckFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$OTPError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$ThreeDsError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$UserDeclinedTermsAndConditions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Failure extends com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState {

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$EligibilityCheckFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$EligibilityCheckFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EligibilityCheckFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure {
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
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.EligibilityCheckFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.EligibilityCheckFailed eligibilityCheckFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.EligibilityCheckFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, eligibilityCheckFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, eligibilityCheckFailed.throwable);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.EligibilityCheckFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.EligibilityCheckFailed(debugMessage, throwable);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.EligibilityCheckFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.EligibilityCheckFailed eligibilityCheckFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = eligibilityCheckFailed.debugMessage;
                }
                if ((i & 2) != 0) {
                    th = eligibilityCheckFailed.throwable;
                }
                return eligibilityCheckFailed.copy(str, th);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$UserDeclinedTermsAndConditions;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UserDeclinedTermsAndConditions implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.UserDeclinedTermsAndConditions INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.UserDeclinedTermsAndConditions();

            public final int hashCode() {
                return 829674321;
            }

            private UserDeclinedTermsAndConditions() {
            }

            public final java.lang.String toString() {
                return "UserDeclinedTermsAndConditions";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.UserDeclinedTermsAndConditions)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$DigitizationFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$DigitizationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DigitizationFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure {
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
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed digitizationFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, digitizationFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, digitizationFailed.throwable);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed(debugMessage, throwable);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed digitizationFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = digitizationFailed.debugMessage;
                }
                if ((i & 2) != 0) {
                    th = digitizationFailed.throwable;
                }
                return digitizationFailed.copy(str, th);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$ActivationFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$ActivationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ActivationFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure {
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
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed activationFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, activationFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, activationFailed.throwable);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed(debugMessage, throwable);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed activationFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activationFailed.debugMessage;
                }
                if ((i & 2) != 0) {
                    th = activationFailed.throwable;
                }
                return activationFailed.copy(str, th);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$InitCheckFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$InitCheckFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InitCheckFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure {
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
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed initCheckFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, initCheckFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, initCheckFailed.throwable);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed(debugMessage, throwable);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.InitCheckFailed initCheckFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = initCheckFailed.debugMessage;
                }
                if ((i & 2) != 0) {
                    th = initCheckFailed.throwable;
                }
                return initCheckFailed.copy(str, th);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$CardNotFound;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardNotFound implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.CardNotFound INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.CardNotFound();

            public final int hashCode() {
                return 1236703311;
            }

            private CardNotFound() {
            }

            public final java.lang.String toString() {
                return "CardNotFound";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.CardNotFound)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$OTPError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$OTPError;", "otpError", "", "debugMessage", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$OTPError;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$OTPError;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$OTPError;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$OTPError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$OTPError;", "getOtpError", "Ljava/lang/String;", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OTPError implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure {
            public static final int $stable = 0;
            private final java.lang.String debugMessage;
            private final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError otpError;

            public OTPError(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError oTPError, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oTPError, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.otpError = oTPError;
                this.debugMessage = str;
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError getOtpError() {
                return this.otpError;
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError oTPError = this.otpError;
                java.lang.String str = this.debugMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OTPError(otpError=");
                sb.append(oTPError);
                sb.append(", debugMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.otpError.hashCode() * 31) + this.debugMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError oTPError = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError) other;
                return this.otpError == oTPError.otpError && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, oTPError.debugMessage);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError copy(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError otpError, java.lang.String debugMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpError, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError(otpError, debugMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError getOtpError() {
                return this.otpError;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.OTPError oTPError, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError oTPError2, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oTPError2 = oTPError.otpError;
                }
                if ((i & 2) != 0) {
                    str = oTPError.debugMessage;
                }
                return oTPError.copy(oTPError2, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$ThreeDsError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;", "threeDsError", "", "debugMessage", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$ThreeDsError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;", "getThreeDsError", "Ljava/lang/String;", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ThreeDsError implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure {
            public static final int $stable = 0;
            private final java.lang.String debugMessage;
            private final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError;

            public ThreeDsError(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsError, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.threeDsError = threeDsError;
                this.debugMessage = str;
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError getThreeDsError() {
                return this.threeDsError;
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError = this.threeDsError;
                java.lang.String str = this.debugMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreeDsError(threeDsError=");
                sb.append(threeDsError);
                sb.append(", debugMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.threeDsError.hashCode() * 31) + this.debugMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ThreeDsError)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ThreeDsError threeDsError = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ThreeDsError) other;
                return this.threeDsError == threeDsError.threeDsError && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, threeDsError.debugMessage);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ThreeDsError copy(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError, java.lang.String debugMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsError, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ThreeDsError(threeDsError, debugMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError getThreeDsError() {
                return this.threeDsError;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ThreeDsError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ThreeDsError threeDsError, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError2, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    threeDsError2 = threeDsError.threeDsError;
                }
                if ((i & 2) != 0) {
                    str = threeDsError.debugMessage;
                }
                return threeDsError.copy(threeDsError2, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$ContinueAddCardError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ContinueAddCardError implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ContinueAddCardError INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ContinueAddCardError();

            public final int hashCode() {
                return -1353077714;
            }

            private ContinueAddCardError() {
            }

            public final java.lang.String toString() {
                return "ContinueAddCardError";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ContinueAddCardError)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$DefaultError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure;", "", "errorCode", "debugMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$Failure$DefaultError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DefaultError implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure {
            public static final int $stable = 0;
            private final java.lang.String debugMessage;
            private final java.lang.String errorCode;

            public DefaultError(java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.errorCode = str;
                this.debugMessage = str2;
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
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError defaultError = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, defaultError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, defaultError.debugMessage);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError copy(java.lang.String errorCode, java.lang.String debugMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError(errorCode, debugMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DefaultError defaultError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$GetCardsFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$GetCardsFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GetCardsFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState {
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
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed getCardsFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, getCardsFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, getCardsFailed.throwable);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed(debugMessage, throwable);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.GetCardsFailed getCardsFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = getCardsFailed.debugMessage;
            }
            if ((i & 2) != 0) {
                th = getCardsFailed.throwable;
            }
            return getCardsFailed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$SetDefaultCardFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$SetDefaultCardFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetDefaultCardFailed implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState {
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
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed setDefaultCardFailed = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, setDefaultCardFailed.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, setDefaultCardFailed.throwable);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed(debugMessage, throwable);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardFailed setDefaultCardFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = setDefaultCardFailed.debugMessage;
            }
            if ((i & 2) != 0) {
                th = setDefaultCardFailed.throwable;
            }
            return setDefaultCardFailed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$SetDefaultCardSkipped;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "", "debugMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$SetDefaultCardSkipped;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetDefaultCardSkipped implements com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState {
        public static final int $stable = 0;
        private final java.lang.String debugMessage;

        public SetDefaultCardSkipped(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.debugMessage = str;
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
            return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardSkipped) && kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, ((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardSkipped) other).debugMessage);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardSkipped copy(java.lang.String debugMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardSkipped(debugMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebugMessage() {
            return this.debugMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardSkipped copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.SetDefaultCardSkipped setDefaultCardSkipped, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = setDefaultCardSkipped.debugMessage;
            }
            return setDefaultCardSkipped.copy(str);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$OTPError;", "", "<init>", "(Ljava/lang/String;I)V", "IncorrectOtp", "IncorrectOtpMaxTryExceeded", "OtpExpired"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OTPError {
        public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError IncorrectOtp;
        public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError IncorrectOtpMaxTryExceeded;
        public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError OtpExpired;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError[] getHighSpeedVideoSizes;

        private OTPError(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError oTPError = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError("IncorrectOtp", 0);
            IncorrectOtp = oTPError;
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError oTPError2 = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError("IncorrectOtpMaxTryExceeded", 1);
            IncorrectOtpMaxTryExceeded = oTPError2;
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError oTPError3 = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError("OtpExpired", 2);
            OtpExpired = oTPError3;
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError[] oTPErrorArr = {oTPError, oTPError2, oTPError3};
            getHighSpeedVideoSizes = oTPErrorArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(oTPErrorArr);
        }

        public static com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError[] values() {
            return (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.OTPError> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_AUTHENTICATED", "NETWORK_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ThreeDsError {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError NETWORK_ERROR;
        public static final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError NOT_AUTHENTICATED;
        private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError[] getHighSpeedVideoSizes;

        private ThreeDsError(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError("NOT_AUTHENTICATED", 0);
            NOT_AUTHENTICATED = threeDsError;
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError2 = new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError("NETWORK_ERROR", 1);
            NETWORK_ERROR = threeDsError2;
            com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError[] threeDsErrorArr = {threeDsError, threeDsError2};
            getHighSpeedVideoSizes = threeDsErrorArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(threeDsErrorArr);
        }

        public static com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError[] values() {
            return (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent;", "", "<init>", "()V", "Success", "Error", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent$Error;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ThreeDsEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent$Success;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent;", "", "proofOfAuth", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getProofOfAuth"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent {
            public static final int $stable = 0;
            private final java.lang.String proofOfAuth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.proofOfAuth = str;
            }

            public final java.lang.String getProofOfAuth() {
                return this.proofOfAuth;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.proofOfAuth;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(proofOfAuth=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.proofOfAuth.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.proofOfAuth, ((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Success) other).proofOfAuth);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Success copy(java.lang.String proofOfAuth) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proofOfAuth, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Success(proofOfAuth);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getProofOfAuth() {
                return this.proofOfAuth;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Success copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Success success, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = success.proofOfAuth;
                }
                return success.copy(str);
            }
        }

        private ThreeDsEvent() {
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent$Error;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;", "error", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsError;", "getError", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError error;
            private final java.lang.String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsError, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.error = threeDsError;
                this.reason = str;
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError getError() {
                return this.error;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError = this.error;
                java.lang.String str = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
                sb.append(threeDsError);
                sb.append(", reason=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.error.hashCode() * 31) + this.reason.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Error)) {
                    return false;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Error error = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Error) other;
                return this.error == error.error && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, error.reason);
            }

            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Error copy(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError error, java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Error(error, reason);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Error copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Error error, com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsError threeDsError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    threeDsError = error.error;
                }
                if ((i & 2) != 0) {
                    str = error.reason;
                }
                return error.copy(threeDsError, str);
            }
        }

        public /* synthetic */ ThreeDsEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
