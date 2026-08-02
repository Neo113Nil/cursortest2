package com.zettle.sdk.feature.taptopay.core.attestation.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\bà\u0080\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001J(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsFullStartedUseCase;", "Lkotlin/Function3;", "Landroid/content/Context;", "", "", "context", "fullProvisioning", "fullAttestation", "invoke", "(Landroid/content/Context;ZZ)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AttestationAnalyticsFullStartedUseCase extends kotlin.jvm.functions.Function3<android.content.Context, java.lang.Boolean, java.lang.Boolean, kotlin.Unit> {
    void invoke(android.content.Context context, boolean fullProvisioning, boolean fullAttestation);
}
