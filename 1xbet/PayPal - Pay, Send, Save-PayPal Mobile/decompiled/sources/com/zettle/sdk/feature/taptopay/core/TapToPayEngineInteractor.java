package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 -2\u00020\u0001:\u0001-J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TapToPayEngineInteractor;", "", "", "organizationId", "", "configure", "(Ljava/lang/String;)V", "", "permissionArray", "", "hasGrantPermission", "([I)Z", "Landroid/content/Context;", "context", "hasRequiredPermission", "(Landroid/content/Context;)Z", "Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;", "initConfiguration", "init", "(Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;)Z", "Landroid/app/Activity;", "activityContext", "", "requestCode", "requestPermissionIfRequired", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "fragmentContext", "(Landroidx/fragment/app/Fragment;I)Z", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation;", "getAttestation", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation;", "attestation", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "getRefund", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "refund", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransaction;", "getRetrieveTransaction", "()Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransaction;", "retrieveTransaction", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction;", "getTransaction", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction;", "transaction", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TapToPayEngineInteractor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor.Companion.getHighResolutionOutputSizeshNQ4ISI;

    void configure(java.lang.String organizationId);

    com.zettle.sdk.feature.taptopay.core.attestation.Attestation getAttestation();

    com.zettle.sdk.feature.taptopay.core.refunds.Refund getRefund();

    com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransaction getRetrieveTransaction();

    com.zettle.sdk.feature.taptopay.core.transaction.Transaction getTransaction();

    boolean hasGrantPermission(int[] permissionArray);

    boolean hasRequiredPermission(android.content.Context context);

    boolean init(com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit initConfiguration);

    boolean requestPermissionIfRequired(android.app.Activity activityContext, int requestCode);

    boolean requestPermissionIfRequired(androidx.fragment.app.Fragment fragmentContext, int requestCode);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TapToPayEngineInteractor$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "", "isRunningOnRemoteProcess", "(Landroid/content/Context;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor.Companion();

        private Companion() {
        }

        public final boolean isRunningOnRemoteProcess(android.content.Context applicationContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
            return com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy.INSTANCE.isRunningOnRemoteProcess(applicationContext);
        }
    }
}
