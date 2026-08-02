package com.zettle.sdk.feature.taptopay.core.attestation.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult;", "", "<init>", "()V", "AttestationRequirementsOk", "DeveloperOptionsDetected", "NotInitialised", "RequiredPermissionsMissing", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult$AttestationRequirementsOk;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult$DeveloperOptionsDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult$NotInitialised;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult$RequiredPermissionsMissing;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AttestationRequirementsResult {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult$DeveloperOptionsDetected;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DeveloperOptionsDetected extends com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.DeveloperOptionsDetected INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.DeveloperOptionsDetected();

        private DeveloperOptionsDetected() {
            super(null);
        }
    }

    private AttestationRequirementsResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult$RequiredPermissionsMissing;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequiredPermissionsMissing extends com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.RequiredPermissionsMissing INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.RequiredPermissionsMissing();

        private RequiredPermissionsMissing() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult$NotInitialised;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotInitialised extends com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.NotInitialised INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.NotInitialised();

        private NotInitialised() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult$AttestationRequirementsOk;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AttestationRequirementsOk extends com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult {
        public static final com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.AttestationRequirementsOk INSTANCE = new com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.AttestationRequirementsOk();

        private AttestationRequirementsOk() {
            super(null);
        }
    }

    public /* synthetic */ AttestationRequirementsResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
