package com.zettle.sdk.feature.taptopay.core.proxy;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u0012J\u001f\u0010-\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010\u0017J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00182\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00104\u001a\u00020\n2\u0006\u00107\u001a\u0002062\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00108J\u000f\u00109\u001a\u00020.H\u0016¢\u0006\u0004\b9\u00100J'\u0010>\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxyImpl;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceBehaviour;", "behaviour", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceBehaviour;)V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "attest", "(Landroid/content/Context;Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;)Z", "fullProvisioning", "fullAttestation", "attestFull", "(Landroid/content/Context;ZZLcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;)Z", "cancelTransaction", "()Z", "", "organizationId", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;", "confirmResetProvision", "(Landroid/content/Context;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;", "Landroid/app/Activity;", "activity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionPINParams;", "transactionPinParams", "", "enterPin", "(Landroid/app/Activity;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionPINParams;)[B", "Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "getSoftspaceReaderInfo", "()Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "", "permissionArray", "hasGrantPermission", "([I)Z", "hasRequiredPermission", "(Landroid/content/Context;)Z", "Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;", "configurationInit", "init", "(Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;)Z", "isInitialised", "login", "", "logout", "()V", "activityContext", "", "requestCode", "requestPermissionIfRequired", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "fragmentContext", "(Landroidx/fragment/app/Fragment;I)Z", "resetAttestationCache", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionParams;", "transactionParams", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;", "transactionEvents", "startTransaction", "(Landroid/app/Activity;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionParams;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceBehaviour;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SoftspaceProxyImpl implements com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour getHighResolutionOutputSizeshNQ4ISI;

    public SoftspaceProxyImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour softspaceBehaviour) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceBehaviour, "");
        this.getHighResolutionOutputSizeshNQ4ISI = softspaceBehaviour;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean init(com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit configurationInit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationInit, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.init(configurationInit);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean isInitialised() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isInitialised();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult login(android.content.Context context, java.lang.String organizationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(organizationId, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.login(context, organizationId);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult confirmResetProvision(android.content.Context context, java.lang.String organizationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(organizationId, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.confirmResetProvision(context, organizationId);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final void resetAttestationCache() {
        this.getHighResolutionOutputSizeshNQ4ISI.resetAttestationCache();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final void logout() {
        this.getHighResolutionOutputSizeshNQ4ISI.logout();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean attest(android.content.Context context, com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.attest(context, listener);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean attestFull(android.content.Context context, boolean fullProvisioning, boolean fullAttestation, com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.attestFull(context, fullProvisioning, fullAttestation, listener);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo getSoftspaceReaderInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSoftspaceReaderInfo();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean startTransaction(android.app.Activity activity, com.zettle.sdk.feature.taptopay.core.transaction.TransactionParams transactionParams, com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents transactionEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionParams, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEvents, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.startTransaction(activity, transactionParams, transactionEvents);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final byte[] enterPin(android.app.Activity activity, com.zettle.sdk.feature.taptopay.core.transaction.TransactionPINParams transactionPinParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionPinParams, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.enterPin(activity, transactionPinParams);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean cancelTransaction() {
        return this.getHighResolutionOutputSizeshNQ4ISI.cancelTransaction();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean requestPermissionIfRequired(android.app.Activity activityContext, int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.requestPermissionIfRequired(activityContext, requestCode);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean requestPermissionIfRequired(androidx.fragment.app.Fragment fragmentContext, int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentContext, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.requestPermissionIfRequired(fragmentContext, requestCode);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean hasRequiredPermission(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.hasRequiredPermission(context);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean hasGrantPermission(int[] permissionArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionArray, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.hasGrantPermission(permissionArray);
    }
}
