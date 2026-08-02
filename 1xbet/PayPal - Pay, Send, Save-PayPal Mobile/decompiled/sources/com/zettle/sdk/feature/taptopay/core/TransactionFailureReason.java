package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u001b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+B!\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nR\u0017\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\u0082\u0001\u001b,-./0123456789:;<=>?@ABCDEF"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "", "", "p0", "p1", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "p2", "<init>", "(IILcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "title", "getTitle", "AboveMaximum", "AttestationFailed", "AuthRequired", "BackendError", "BelowMinimum", "CanceledByNetworkTimeout", "CanceledByTimeout", "CanceledByUser", "CardReadInvalid", "CountryNotSupported", "DeveloperOptionsDetected", "EmptyPayload", "EmptyResponse", "GratuityAmountTooHigh", "GratuityAmountTooLow", "InvalidArguments", "NFCUnexpectedError", "NetworkError", "ParsingError", "PaymentDeclined", "PinEntranceCanceled", "RequireBankVerification", "ScaChallenge", "SignatureCanceled", "TechnicalError", "TimeMismatchDetected", "UnsuccessfulResponse", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$AboveMaximum;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$AttestationFailed;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$AuthRequired;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$BackendError;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$BelowMinimum;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$CanceledByNetworkTimeout;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$CanceledByTimeout;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$CanceledByUser;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$CardReadInvalid;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$CountryNotSupported;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$DeveloperOptionsDetected;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$EmptyPayload;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$EmptyResponse;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$GratuityAmountTooHigh;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$GratuityAmountTooLow;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$InvalidArguments;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$NFCUnexpectedError;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$NetworkError;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$ParsingError;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$PaymentDeclined;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$PinEntranceCanceled;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$RequireBankVerification;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$ScaChallenge;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$SignatureCanceled;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$TechnicalError;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$TimeMismatchDetected;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$UnsuccessfulResponse;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TransactionFailureReason {
    private final java.lang.String description;
    private final java.lang.String title;

    private TransactionFailureReason(java.lang.String str, java.lang.String str2) {
        this.title = str;
        this.description = str2;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    private TransactionFailureReason(int i, int i2, com.zettle.sdk.feature.taptopay.core.Translations translations) {
        this(translations.translate(com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource.Device, i, new java.lang.Object[0]), translations.translate(com.zettle.sdk.feature.taptopay.core.Translations.LocaleSource.Device, i2, new java.lang.Object[0]), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$AuthRequired;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AuthRequired extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthRequired(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.technical_error_abort_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "AuthRequired";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$AttestationFailed;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "", "error", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getError"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AttestationFailed extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        private final java.lang.String error;

        public final java.lang.String getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttestationFailed(com.zettle.sdk.feature.taptopay.core.Translations translations, java.lang.String str) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_general_attestation_title, com.zettle.sdk.feature.taptopay.core.R.string.error_general_attestation_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AttestationFailed(");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$DeveloperOptionsDetected;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Actionable;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DeveloperOptionsDetected extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason implements com.zettle.sdk.feature.taptopay.core.Actionable {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        @Override // com.zettle.sdk.feature.taptopay.core.Actionable
        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeveloperOptionsDetected(com.zettle.sdk.feature.taptopay.core.Translations translations, com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_developer_options_on_title, com.zettle.sdk.feature.taptopay.core.R.string.error_developer_options_on_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final java.lang.String toString() {
            return "DeveloperOptionsDetected";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$TimeMismatchDetected;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Actionable;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TimeMismatchDetected extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason implements com.zettle.sdk.feature.taptopay.core.Actionable {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        @Override // com.zettle.sdk.feature.taptopay.core.Actionable
        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeMismatchDetected(com.zettle.sdk.feature.taptopay.core.Translations translations, com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_datetime_sync_title, com.zettle.sdk.feature.taptopay.core.R.string.error_datetime_sync_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final java.lang.String toString() {
            return "TimeMismatchDetected";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$InvalidArguments;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidArguments extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidArguments(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_cancelled_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_cancelled_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "InvalidArguments";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$PinEntranceCanceled;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PinEntranceCanceled extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinEntranceCanceled(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_cancelled_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_cancelled_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "PinEntranceCanceled";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$EmptyResponse;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EmptyResponse extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyResponse(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "EmptyResponse";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$BackendError;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "", "error", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getError$core_publicRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BackendError extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        private final java.lang.String error;

        /* renamed from: getError$core_publicRelease, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackendError(com.zettle.sdk.feature.taptopay.core.Translations translations, java.lang.String str) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
            this.error = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BackendError(");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$ScaChallenge;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ScaChallenge extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScaChallenge(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_use_another_card_title, com.zettle.sdk.feature.taptopay.core.R.string.error_use_another_card_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "ScaChallenge";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$EmptyPayload;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EmptyPayload extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyPayload(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "EmptyPayload";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$NetworkError;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NetworkError extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_network_connectivity_title, com.zettle.sdk.feature.taptopay.core.R.string.error_network_connectivity_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "NetworkError";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$CanceledByUser;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CanceledByUser extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CanceledByUser(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_cancelled_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_cancelled_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "CanceledByUser";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$CanceledByTimeout;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CanceledByTimeout extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CanceledByTimeout(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_timeout_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_timeout_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "CanceledByTimeOut";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$CanceledByNetworkTimeout;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CanceledByNetworkTimeout extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CanceledByNetworkTimeout(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "CanceledByNetworkTimeOut";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$SignatureCanceled;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SignatureCanceled extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignatureCanceled(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_cancelled_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_cancelled_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "SignatureCanceled";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$AboveMaximum;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Ljava/util/Currency;", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Currency;)V", "toString", "()Ljava/lang/String;", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AboveMaximum extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        private final java.util.Currency currency;

        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AboveMaximum(java.lang.String str, java.lang.String str2, java.util.Currency currency) {
            super(str, str2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
            this.currency = currency;
        }

        public final java.lang.String toString() {
            return "AboveMaximum";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$BelowMinimum;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "minAmount", "Ljava/util/Currency;", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Currency;)V", "toString", "()Ljava/lang/String;", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "J", "getMinAmount", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BelowMinimum extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        private final java.util.Currency currency;
        private final long minAmount;

        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        public final long getMinAmount() {
            return this.minAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BelowMinimum(java.lang.String str, java.lang.String str2, long j, java.util.Currency currency) {
            super(str, str2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
            this.minAmount = j;
            this.currency = currency;
        }

        public final java.lang.String toString() {
            return "BelowMinimum";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$UnsuccessfulResponse;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnsuccessfulResponse extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsuccessfulResponse(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "UnsuccessfulResponse";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$ParsingError;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ParsingError extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingError(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "ParsingError";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$RequireBankVerification;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequireBankVerification extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequireBankVerification(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.miss_bank_info_error_title, com.zettle.sdk.feature.taptopay.core.R.string.miss_bank_info_error_message, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "RequireBankVerification";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$CountryNotSupported;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CountryNotSupported extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountryNotSupported(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.technical_error_abort_title, com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_failed_problem_ocurred_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "CountryNotSupported";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$CardReadInvalid;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CardReadInvalid extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardReadInvalid(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_use_another_card_title, com.zettle.sdk.feature.taptopay.core.R.string.error_use_another_card_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "CardReadInvalid";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$TechnicalError;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TechnicalError extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TechnicalError(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "TechnicalError";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$NFCUnexpectedError;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NFCUnexpectedError extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NFCUnexpectedError(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_failed_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "NFCUnexpectedError";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$PaymentDeclined;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "", "transactionId", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getTransactionId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PaymentDeclined extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        private final java.lang.String transactionId;

        public /* synthetic */ PaymentDeclined(com.zettle.sdk.feature.taptopay.core.Translations translations, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(translations, (i & 2) != 0 ? null : str);
        }

        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentDeclined(com.zettle.sdk.feature.taptopay.core.Translations translations, java.lang.String str) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_declined_title, com.zettle.sdk.feature.taptopay.core.R.string.error_payment_declined_subtitle, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
            this.transactionId = str;
        }

        public final java.lang.String toString() {
            return "PaymentDeclined";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$GratuityAmountTooLow;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GratuityAmountTooLow extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GratuityAmountTooLow(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_cancelled_title, com.zettle.sdk.feature.taptopay.core.R.string.gratuity_amount_too_low, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "GratuityAmountTooLow";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason$GratuityAmountTooHigh;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GratuityAmountTooHigh extends com.zettle.sdk.feature.taptopay.core.TransactionFailureReason {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GratuityAmountTooHigh(com.zettle.sdk.feature.taptopay.core.Translations translations) {
            super(com.zettle.sdk.feature.taptopay.core.R.string.error_payment_cancelled_title, com.zettle.sdk.feature.taptopay.core.R.string.gratuity_amount_too_high, translations, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        }

        public final java.lang.String toString() {
            return "GratuityAmountTooHigh";
        }
    }

    public /* synthetic */ TransactionFailureReason(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ TransactionFailureReason(int i, int i2, com.zettle.sdk.feature.taptopay.core.Translations translations, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, translations);
    }
}
