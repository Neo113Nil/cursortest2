package com.zettle.sdk.feature.taptopay.core.attestation.analytics;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalytics;", "", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "proxy", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsEndedUseCaseImpl;", "attestationAnalyticsEndedUseCase", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsEndedUseCaseImpl;", "getAttestationAnalyticsEndedUseCase", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsEndedUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsFullStartedUseCaseImpl;", "attestationAnalyticsFullStartedUseCase", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsFullStartedUseCaseImpl;", "getAttestationAnalyticsFullStartedUseCase", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsFullStartedUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsLoginUseCaseImpl;", "attestationAnalyticsLoginUseCase", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsLoginUseCaseImpl;", "getAttestationAnalyticsLoginUseCase", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsLoginUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsLogoutUseCaseImpl;", "attestationAnalyticsLogoutUseCase", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsLogoutUseCaseImpl;", "getAttestationAnalyticsLogoutUseCase", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsLogoutUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsResetProvisionUseCaseImpl;", "attestationAnalyticsResetProvisionUseCase", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsResetProvisionUseCaseImpl;", "getAttestationAnalyticsResetProvisionUseCase", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsResetProvisionUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsStartedUseCaseImpl;", "attestationAnalyticsStartedUseCase", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsStartedUseCaseImpl;", "getAttestationAnalyticsStartedUseCase", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsStartedUseCaseImpl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttestationAnalytics {
    private final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsEndedUseCaseImpl attestationAnalyticsEndedUseCase;
    private final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsFullStartedUseCaseImpl attestationAnalyticsFullStartedUseCase;
    private final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsLoginUseCaseImpl attestationAnalyticsLoginUseCase;
    private final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsLogoutUseCaseImpl attestationAnalyticsLogoutUseCase;
    private final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsResetProvisionUseCaseImpl attestationAnalyticsResetProvisionUseCase;
    private final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsStartedUseCaseImpl attestationAnalyticsStartedUseCase;

    public AttestationAnalytics(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.attestationAnalyticsLoginUseCase = new com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsLoginUseCaseImpl(softspaceProxy, analytics, appInfo);
        this.attestationAnalyticsLogoutUseCase = new com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsLogoutUseCaseImpl(softspaceProxy, analytics, appInfo);
        this.attestationAnalyticsStartedUseCase = new com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsStartedUseCaseImpl(softspaceProxy, analytics, appInfo);
        this.attestationAnalyticsEndedUseCase = new com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsEndedUseCaseImpl(softspaceProxy, analytics, appInfo);
        this.attestationAnalyticsResetProvisionUseCase = new com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsResetProvisionUseCaseImpl(softspaceProxy, analytics, appInfo);
        this.attestationAnalyticsFullStartedUseCase = new com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsFullStartedUseCaseImpl(softspaceProxy, analytics, appInfo);
    }

    public final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsLoginUseCaseImpl getAttestationAnalyticsLoginUseCase() {
        return this.attestationAnalyticsLoginUseCase;
    }

    public final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsLogoutUseCaseImpl getAttestationAnalyticsLogoutUseCase() {
        return this.attestationAnalyticsLogoutUseCase;
    }

    public final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsStartedUseCaseImpl getAttestationAnalyticsStartedUseCase() {
        return this.attestationAnalyticsStartedUseCase;
    }

    public final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsEndedUseCaseImpl getAttestationAnalyticsEndedUseCase() {
        return this.attestationAnalyticsEndedUseCase;
    }

    public final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsResetProvisionUseCaseImpl getAttestationAnalyticsResetProvisionUseCase() {
        return this.attestationAnalyticsResetProvisionUseCase;
    }

    public final com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsFullStartedUseCaseImpl getAttestationAnalyticsFullStartedUseCase() {
        return this.attestationAnalyticsFullStartedUseCase;
    }
}
