package com.zettle.sdk.feature.taptopay.core.attestation;

@kotlin.Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:-\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001-789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abc"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "ADBDetected", "Abort", "ActivationScrpFail", "AttestationCOTSFail", "AttestationScrpFail", "BufferOverflow", "BufferUnderFlow", "CertificateNotFound", "CryptoError", "DebuggingDetected", "DeveloperOptionsDetected", "DiffScrpId", "DifferentUserIdentifier", "DukptKeyInvalid", "EmulatorDetected", "GeneralBusinessError", "GeneralError", "GooglePlayServiceError", "HookedDetected", "InvalidArgument", "InvalidCACertificate", "InvalidCertificate", "InvalidResponse", "InvalidState", "KeyExchangeFail", "KeyInvalid", "LibInvalidKey", "NeedsPermissions", "NetworkError", "NoEntry", "NoKey", "NotInit", "NotPermit", "NullPointer", "OutOfMemory", "OutdatedSecurityPatch", "PlayIntegrityFail", "ProvisionFail", "RequiredPermissionsMissing", "RootedDetected", "SafetyNetError", "TimeMismatchDetected", "Todo", "UnknownError", "UnknownInstallationSource", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$ADBDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$Abort;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$ActivationScrpFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$AttestationCOTSFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$AttestationScrpFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$BufferOverflow;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$BufferUnderFlow;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$CertificateNotFound;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$CryptoError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$DebuggingDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$DeveloperOptionsDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$DiffScrpId;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$DifferentUserIdentifier;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$DukptKeyInvalid;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$EmulatorDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$GeneralBusinessError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$GeneralError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$GooglePlayServiceError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$HookedDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$InvalidArgument;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$InvalidCACertificate;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$InvalidCertificate;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$InvalidResponse;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$InvalidState;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$KeyExchangeFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$KeyInvalid;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$LibInvalidKey;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NeedsPermissions;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NetworkError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NoEntry;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NoKey;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NotInit;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NotPermit;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NullPointer;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$OutOfMemory;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$OutdatedSecurityPatch;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$PlayIntegrityFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$ProvisionFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$RequiredPermissionsMissing;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$RootedDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$SafetyNetError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$TimeMismatchDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$Todo;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$UnknownError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$UnknownInstallationSource;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ErrorReason extends com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult {
    private final java.lang.String Camera2StreamConfigurationMap;

    private ErrorReason(java.lang.String str) {
        super("", null);
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult
    /* renamed from: toString, reason: from getter */
    public java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$Abort;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Abort extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.Abort INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.Abort();

        private Abort() {
            super("Abort", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$DeveloperOptionsDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DeveloperOptionsDetected extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeveloperOptionsDetected(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("DeveloperOptionsDetected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$TimeMismatchDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TimeMismatchDetected extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeMismatchDetected(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("TimeMismatchDetected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$RequiredPermissionsMissing;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequiredPermissionsMissing extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredPermissionsMissing(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("RequiredPermissionsMissing", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$OutdatedSecurityPatch;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OutdatedSecurityPatch extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OutdatedSecurityPatch(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("OutdatedSecurityPatch", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$UnknownInstallationSource;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownInstallationSource extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownInstallationSource(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("UnknownInstallationSource", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$PlayIntegrityFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayIntegrityFail extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayIntegrityFail(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("PlayIntegrityFail", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$ADBDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ADBDetected extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ADBDetected(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("ADBDetected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$RootedDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RootedDetected extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RootedDetected(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("RootedDetected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$DebuggingDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DebuggingDetected extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DebuggingDetected(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("DebuggingDetected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$EmulatorDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EmulatorDetected extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmulatorDetected(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("EmulatorDetected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$HookedDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recommendedAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getRecommendedAction", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HookedDetected extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        private final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HookedDetected(com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction) {
            super("HookedDetected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedAction, "");
            this.recommendedAction = recommendedAction;
        }

        public final com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction getRecommendedAction() {
            return this.recommendedAction;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$AttestationCOTSFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AttestationCOTSFail extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.AttestationCOTSFail INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.AttestationCOTSFail();

        private AttestationCOTSFail() {
            super("DefaultAttestationCOTSFail", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NotInit;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotInit extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotInit INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotInit();

        private NotInit() {
            super("NotInit", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NeedsPermissions;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NeedsPermissions extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NeedsPermissions INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NeedsPermissions();

        private NeedsPermissions() {
            super("NeedsPermissions", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$GeneralError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GeneralError extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.GeneralError INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.GeneralError();

        private GeneralError() {
            super("GeneralError", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$GeneralBusinessError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GeneralBusinessError extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.GeneralBusinessError INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.GeneralBusinessError();

        private GeneralBusinessError() {
            super("GeneralBusinessError", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$InvalidState;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidState extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidState INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidState();

        private InvalidState() {
            super("InvalidState", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$GooglePlayServiceError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GooglePlayServiceError extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.GooglePlayServiceError INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.GooglePlayServiceError();

        private GooglePlayServiceError() {
            super("GooglePlayServiceError", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$SafetyNetError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SafetyNetError extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.SafetyNetError INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.SafetyNetError();

        private SafetyNetError() {
            super("SafetyNetError", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$LibInvalidKey;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LibInvalidKey extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.LibInvalidKey INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.LibInvalidKey();

        private LibInvalidKey() {
            super("InvalidKey", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NoEntry;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NoEntry extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NoEntry INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NoEntry();

        private NoEntry() {
            super("NoEntry", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NetworkError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NetworkError extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NetworkError INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NetworkError();

        private NetworkError() {
            super("NetworkError", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$InvalidResponse;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidResponse extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidResponse INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidResponse();

        private InvalidResponse() {
            super("InvalidResponse", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$InvalidCertificate;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidCertificate extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidCertificate INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidCertificate();

        private InvalidCertificate() {
            super("InvalidCertificate", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$CertificateNotFound;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CertificateNotFound extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.CertificateNotFound INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.CertificateNotFound();

        private CertificateNotFound() {
            super("CertificateNotFound", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$DifferentUserIdentifier;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DifferentUserIdentifier extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DifferentUserIdentifier INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DifferentUserIdentifier();

        private DifferentUserIdentifier() {
            super("DifferentUserIdentifier", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$BufferOverflow;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BufferOverflow extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.BufferOverflow INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.BufferOverflow();

        private BufferOverflow() {
            super("BufferOverflow", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$BufferUnderFlow;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BufferUnderFlow extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.BufferUnderFlow INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.BufferUnderFlow();

        private BufferUnderFlow() {
            super("BufferUnderFlow", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$InvalidArgument;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidArgument extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidArgument INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidArgument();

        private InvalidArgument() {
            super("InvalidArgument", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NotPermit;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotPermit extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotPermit INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotPermit();

        private NotPermit() {
            super("NotPermit", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NullPointer;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NullPointer extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NullPointer INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NullPointer();

        private NullPointer() {
            super("NullPointer", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$OutOfMemory;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OutOfMemory extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.OutOfMemory INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.OutOfMemory();

        private OutOfMemory() {
            super("OutOfMemory", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$ActivationScrpFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ActivationScrpFail extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.ActivationScrpFail INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.ActivationScrpFail();

        private ActivationScrpFail() {
            super("ActivationScrpFail", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$AttestationScrpFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AttestationScrpFail extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.AttestationScrpFail INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.AttestationScrpFail();

        private AttestationScrpFail() {
            super("AttestationScrpFail", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$CryptoError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CryptoError extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.CryptoError INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.CryptoError();

        private CryptoError() {
            super("CryptoError", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$DiffScrpId;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DiffScrpId extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DiffScrpId INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DiffScrpId();

        private DiffScrpId() {
            super("DiffScrpId", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$DukptKeyInvalid;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DukptKeyInvalid extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DukptKeyInvalid INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DukptKeyInvalid();

        private DukptKeyInvalid() {
            super("DukptKeyInvalid", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$InvalidCACertificate;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidCACertificate extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidCACertificate INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidCACertificate();

        private InvalidCACertificate() {
            super("InvalidCACertificate", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$KeyExchangeFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KeyExchangeFail extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.KeyExchangeFail INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.KeyExchangeFail();

        private KeyExchangeFail() {
            super("KeyExchangeFail", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$KeyInvalid;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KeyInvalid extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.KeyInvalid INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.KeyInvalid();

        private KeyInvalid() {
            super("KeyInvalid", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$NoKey;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NoKey extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NoKey INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NoKey();

        private NoKey() {
            super("NoKey", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$ProvisionFail;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ProvisionFail extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.ProvisionFail INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.ProvisionFail();

        private ProvisionFail() {
            super("ProvisionFail", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$Todo;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Todo extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.Todo INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.Todo();

        private Todo() {
            super("Todo", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason$UnknownError;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "", "status", "<init>", "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownError extends com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason {
        public UnknownError(int i) {
            super("UnknownError=".concat(java.lang.String.valueOf(i)), null);
        }
    }

    public /* synthetic */ ErrorReason(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
