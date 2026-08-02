package com.zettle.sdk.feature.taptopay.core.proxy;

@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u0012J\u001f\u0010-\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010\u0017J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00182\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00104\u001a\u00020\n2\u0006\u00107\u001a\u0002062\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00108J\u000f\u00109\u001a\u00020.H\u0016¢\u0006\u0004\b9\u00100J'\u0010>\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J!\u0010C\u001a\b\u0012\u0004\u0012\u00020B0@*\n\u0012\u0004\u0012\u00020A\u0018\u00010@H\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceBehaviourImpl;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceBehaviour;", "Lcom/zettle/sdk/core/log/Loggable;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "context", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "attest", "(Landroid/content/Context;Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;)Z", "fullProvisioning", "fullAttestation", "attestFull", "(Landroid/content/Context;ZZLcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResultListener;)Z", "cancelTransaction", "()Z", "", "organizationId", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;", "confirmResetProvision", "(Landroid/content/Context;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;", "Landroid/app/Activity;", "activity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionPINParams;", "transactionPinParams", "", "enterPin", "(Landroid/app/Activity;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionPINParams;)[B", "Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "getSoftspaceReaderInfo", "()Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "", "permissionArray", "hasGrantPermission", "([I)Z", "hasRequiredPermission", "(Landroid/content/Context;)Z", "Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;", "configurationInit", "init", "(Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;)Z", "isInitialised", "login", "", "logout", "()V", "activityContext", "", "requestCode", "requestPermissionIfRequired", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "fragmentContext", "(Landroidx/fragment/app/Fragment;I)Z", "resetAttestationCache", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionParams;", "transactionParams", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;", "transactionEvents", "startTransaction", "(Landroid/app/Activity;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionParams;Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;)Z", "", "Lmy/com/softspace/ssfasstapsdk/pog/RecoverableAction;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;)Ljava/util/List;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Result;", "Lmy/com/softspace/ssfasstapsdk/SSFasstapSDK;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SoftspaceBehaviourImpl implements com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour, com.zettle.sdk.core.log.Loggable {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    public SoftspaceBehaviourImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Not Initialised")));
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean init(com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit configurationInit) {
        java.lang.Object m23436constructorimpl;
        java.lang.Object m23436constructorimpl2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationInit, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl softspaceBehaviourImpl = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(my.com.softspace.ssfasstapsdk.SSFasstapSDK.getInstance());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        if (m23436constructorimpl != null) {
            com.zettle.sdk.core.log.LogKt.debug(this, "fast instance");
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.Result.m23436constructorimpl(my.com.softspace.ssfasstapsdk.SSFasstapSDK.getInstance());
            return true;
        }
        my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration build = my.com.softspace.ssfasstapsdk.FasstapSDKConfiguration.Builder.create().setLibGooglePlayProjNum(configurationInit.getLibGooglePlayProjNum()).setAttestationHost(configurationInit.getAttestationHost()).setAttestationHostCertPinning(configurationInit.getAttestationHostCertPinning()).setLibAccessKey(configurationInit.getLibAccessKey()).setLibSecretKey(configurationInit.getLibSecretKey()).setAttestationHostReadTimeout(java.lang.Long.valueOf(configurationInit.getAttestationHostReadTimeOut())).setAttestationRefreshInterval(java.lang.Long.valueOf(configurationInit.getAttestationRefreshInterval())).setAttestationConnectionTimeout(java.lang.Long.valueOf(configurationInit.getAttestationConnectionTimeout())).setAttestationMinRefreshInterval(java.lang.Long.valueOf(configurationInit.getAttestationMinimumRefreshInterval())).setKeyloadingHost(configurationInit.getKeyLoadingHost()).setKeyLoadingHostCertPinning(configurationInit.getKeyLoadingCertPinning()).setKeyLoadingCACert(configurationInit.getKeyLoadingCaCert()).setAttestationStrictHttp(java.lang.Boolean.TRUE).build();
        com.zettle.sdk.core.log.LogKt.debug(this, "init called");
        try {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl softspaceBehaviourImpl2 = this;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(my.com.softspace.ssfasstapsdk.SSFasstapSDK.init(this.getHighSpeedVideoFpsRangesFor, build, new my.com.softspace.ssfasstapsdk.SSFasstapSDK.EncryptionModel() { // from class: com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl$init$2$1
                @Override // my.com.softspace.ssfasstapsdk.SSFasstapSDK.EncryptionModel
                public final java.lang.Object[] cipherOperation(boolean isEncrypt, byte[] data, boolean increaseKSN) {
                    android.content.Context context;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                    my.com.softspace.ssfasstapsdk.pog.AttestationPOG attestationPog = my.com.softspace.ssfasstapsdk.SSFasstapSDK.getInstance().getAttestationPog();
                    context = com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl.this.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object[] cryptoOperation = attestationPog.cryptoOperation(context, isEncrypt, data, increaseKSN);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cryptoOperation, "");
                    return cryptoOperation;
                }

                @Override // my.com.softspace.ssfasstapsdk.SSFasstapSDK.EncryptionModel
                public final java.lang.Object[] cmac(byte[] bytes) {
                    android.content.Context context;
                    my.com.softspace.ssfasstapsdk.pog.AttestationPOG attestationPog = my.com.softspace.ssfasstapsdk.SSFasstapSDK.getInstance().getAttestationPog();
                    context = com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl.this.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object[] cmac = attestationPog.cmac(context, bytes);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cmac, "");
                    return cmac;
                }
            }));
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = m23436constructorimpl2;
        return kotlin.Result.m23442isSuccessimpl(m23436constructorimpl2);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean isInitialised() {
        return kotlin.Result.m23442isSuccessimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult login(android.content.Context context, java.lang.String organizationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(organizationId, "");
        com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult attestationResult = com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotInit.INSTANCE;
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "login", m23439exceptionOrNullimpl);
            attestationResult = com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotInit.INSTANCE;
        }
        if (kotlin.Result.m23442isSuccessimpl(obj)) {
            attestationResult = com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultKt.resolveAttestationStatus(((my.com.softspace.ssfasstapsdk.SSFasstapSDK) obj).getAttestationPog().login(context, organizationId), kotlin.collections.CollectionsKt.emptyList());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("login(");
            sb.append(organizationId);
            sb.append(", ");
            sb.append(attestationResult);
            sb.append(")");
            com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
        }
        return attestationResult;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult confirmResetProvision(android.content.Context context, java.lang.String organizationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(organizationId, "");
        com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult attestationResult = com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotInit.INSTANCE;
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "confirmResetProvision", m23439exceptionOrNullimpl);
            attestationResult = com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotInit.INSTANCE;
        }
        if (kotlin.Result.m23442isSuccessimpl(obj)) {
            attestationResult = com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultKt.resolveAttestationStatus(((my.com.softspace.ssfasstapsdk.SSFasstapSDK) obj).getAttestationPog().confirmResetProvision(context, organizationId), kotlin.collections.CollectionsKt.emptyList());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("confirmResetProvision(");
            sb.append(organizationId);
            sb.append(", ");
            sb.append(attestationResult);
            sb.append(")");
            com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
        }
        return attestationResult;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final void resetAttestationCache() {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "resetAttestationCache", m23439exceptionOrNullimpl);
        }
        if (kotlin.Result.m23442isSuccessimpl(obj)) {
            com.zettle.sdk.core.log.LogKt.debug(this, "resetAttestationCache()");
            ((my.com.softspace.ssfasstapsdk.SSFasstapSDK) obj).getAttestationPog().resetAttestationCache();
        }
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final void logout() {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        if (kotlin.Result.m23439exceptionOrNullimpl(obj) != null) {
            com.zettle.sdk.core.log.LogKt.warn$default(this, "logout", null, 2, null);
        }
        if (kotlin.Result.m23442isSuccessimpl(obj)) {
            com.zettle.sdk.core.log.LogKt.debug(this, "logout()");
            ((my.com.softspace.ssfasstapsdk.SSFasstapSDK) obj).getAttestationPog().logout(this.getHighSpeedVideoFpsRangesFor);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Not Initialised")));
        }
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean attest(android.content.Context context, final com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "attest", m23439exceptionOrNullimpl);
        }
        if (!kotlin.Result.m23442isSuccessimpl(obj)) {
            return false;
        }
        my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent = new my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent() { // from class: com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl$$ExternalSyntheticLambda0
            @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent
            public final void onAttestationFinished(int i, java.util.List list) {
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl.$r8$lambda$YOoPEFLJ4u7uaQ6Bc6KMBQzVAzI(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl.this, listener, i, list);
            }
        };
        com.zettle.sdk.core.log.LogKt.debug(this, "attest()");
        ((my.com.softspace.ssfasstapsdk.SSFasstapSDK) obj).getAttestationPog().attest(context, attestationEvent);
        return true;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean attestFull(android.content.Context context, boolean fullProvisioning, boolean fullAttestation, final com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "attestFull", m23439exceptionOrNullimpl);
        }
        if (!kotlin.Result.m23442isSuccessimpl(obj)) {
            return false;
        }
        my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent = new my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent() { // from class: com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl$$ExternalSyntheticLambda1
            @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent
            public final void onAttestationFinished(int i, java.util.List list) {
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl.$r8$lambda$psufuSP4QIjD9l5t32bBjuzfgT0(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl.this, listener, i, list);
            }
        };
        java.lang.StringBuilder sb = new java.lang.StringBuilder("attestFull(fullProvisioning=");
        sb.append(fullProvisioning);
        sb.append(", fullAttestation=");
        sb.append(fullAttestation);
        sb.append(")");
        com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
        ((my.com.softspace.ssfasstapsdk.SSFasstapSDK) obj).getAttestationPog().attest(context, attestationEvent, fullProvisioning, fullAttestation);
        return true;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean startTransaction(android.app.Activity activity, com.zettle.sdk.feature.taptopay.core.transaction.TransactionParams transactionParams, final com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents transactionEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionParams, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEvents, "");
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "startTransaction", m23439exceptionOrNullimpl);
        }
        if (!kotlin.Result.m23442isSuccessimpl(obj)) {
            return false;
        }
        my.com.softspace.ssfasstapsdk.SSFasstapSDK sSFasstapSDK = (my.com.softspace.ssfasstapsdk.SSFasstapSDK) obj;
        java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> terminalCVMLimit = transactionParams.getKernelConfig().getTerminalCVMLimit();
        long terminalDefaultCVMLimit = transactionParams.getKernelConfig().getTerminalDefaultCVMLimit();
        java.lang.Long l = terminalCVMLimit.get(com.zettle.sdk.feature.taptopay.core.models.CardScheme.MASTER);
        java.lang.Long valueOf = l != null ? java.lang.Long.valueOf(l.longValue() - 1) : null;
        java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> linkedHashMap = new java.util.LinkedHashMap<>();
        java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> linkedHashMap2 = linkedHashMap;
        java.lang.Long l2 = terminalCVMLimit.get(com.zettle.sdk.feature.taptopay.core.models.CardScheme.AMEX);
        linkedHashMap2.put(16, java.lang.Long.valueOf(l2 != null ? l2.longValue() : terminalDefaultCVMLimit));
        java.lang.Long l3 = terminalCVMLimit.get(com.zettle.sdk.feature.taptopay.core.models.CardScheme.VISA);
        linkedHashMap2.put(2, java.lang.Long.valueOf(l3 != null ? l3.longValue() : terminalDefaultCVMLimit));
        linkedHashMap2.put(4, java.lang.Long.valueOf(valueOf != null ? valueOf.longValue() : terminalDefaultCVMLimit));
        java.lang.Long l4 = terminalCVMLimit.get(com.zettle.sdk.feature.taptopay.core.models.CardScheme.DISCOVER);
        linkedHashMap2.put(128, java.lang.Long.valueOf(l4 != null ? l4.longValue() : terminalDefaultCVMLimit));
        java.lang.Long l5 = terminalCVMLimit.get(com.zettle.sdk.feature.taptopay.core.models.CardScheme.JCB);
        linkedHashMap2.put(8, java.lang.Long.valueOf(l5 != null ? l5.longValue() : terminalDefaultCVMLimit));
        java.lang.Long l6 = terminalCVMLimit.get(com.zettle.sdk.feature.taptopay.core.models.CardScheme.UNKNOWN);
        linkedHashMap2.put(0, java.lang.Long.valueOf(l6 != null ? l6.longValue() : terminalDefaultCVMLimit));
        java.lang.Long l7 = terminalCVMLimit.get(com.zettle.sdk.feature.taptopay.core.models.CardScheme.MCCS);
        linkedHashMap2.put(1, java.lang.Long.valueOf(l7 != null ? l7.longValue() : terminalDefaultCVMLimit));
        java.lang.Long l8 = terminalCVMLimit.get(com.zettle.sdk.feature.taptopay.core.models.CardScheme.CUP);
        linkedHashMap2.put(32, java.lang.Long.valueOf(l8 != null ? l8.longValue() : terminalDefaultCVMLimit));
        java.lang.Long l9 = terminalCVMLimit.get(com.zettle.sdk.feature.taptopay.core.models.CardScheme.VCCS);
        linkedHashMap2.put(64, java.lang.Long.valueOf(l9 != null ? l9.longValue() : terminalDefaultCVMLimit));
        java.lang.Long l10 = terminalCVMLimit.get(com.zettle.sdk.feature.taptopay.core.models.CardScheme.MADA);
        if (l10 != null) {
            terminalDefaultCVMLimit = l10.longValue();
        }
        linkedHashMap2.put(256, java.lang.Long.valueOf(terminalDefaultCVMLimit));
        my.com.softspace.ssfasstapsdk.transaction.KernelConfigurationParams kernelConfigurationParams = new my.com.softspace.ssfasstapsdk.transaction.KernelConfigurationParams();
        kernelConfigurationParams.setTerminalCVMLimit(linkedHashMap);
        kernelConfigurationParams.setTransactionCurrencyCode(transactionParams.getKernelConfig().getTransactionCurrencyCode());
        kernelConfigurationParams.setTransactionCurrencyExponent(transactionParams.getKernelConfig().getTransactionCurrencyExponent());
        kernelConfigurationParams.setTerminalCountryCode(transactionParams.getKernelConfig().getTerminalCountryCode());
        my.com.softspace.ssfasstapsdk.transaction.TransactionalParams build = my.com.softspace.ssfasstapsdk.transaction.TransactionalParams.Builder.create().setAmount(transactionParams.getAmount()).setKernelConfig(kernelConfigurationParams).setWaitForUserInputTimeout(java.lang.Integer.valueOf(transactionParams.getWaitForUserInputTimeout())).setBerTlvMode(transactionParams.isBerTlvMode()).setDebitOptIn(transactionParams.isDebitOptIn()).build();
        com.zettle.sdk.core.log.LogKt.debug(this, "startTransaction()");
        return sSFasstapSDK.getTransaction().startTransaction(activity, build, new my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents() { // from class: com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl$startTransaction$2$1
            @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents
            public final void onCardEvent(int p0) {
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents.this.onCardEvent(com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.INSTANCE.from(p0));
            }

            @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents
            public final void onTransactionResult(int p0, byte[] p1) {
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents.this.onTransactionResult(com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.INSTANCE.from(p0), p1);
            }

            @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents
            public final void onTransactionUIEvent(int p0) {
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents.this.onTransactionUIEvent(com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent.INSTANCE.from(p0));
            }

            @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents
            public final byte[] onTransactionRequestOnlineAuthentication(byte[] p0, java.util.Map<java.lang.String, byte[]> p1) {
                return com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents.this.onTransactionRequestOnlineAuthentication(p0, p1);
            }

            @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents
            public final java.util.Map<java.lang.String, byte[]> mapRawOnlineRequest(byte[] p0) {
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                my.com.softspace.ssfasstapsdk.common.Utils.parseTLVStringMap(p0, linkedHashMap3);
                return linkedHashMap3;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final byte[] enterPin(android.app.Activity activity, com.zettle.sdk.feature.taptopay.core.transaction.TransactionPINParams transactionPinParams) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionPinParams, "");
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "enterPin", m23439exceptionOrNullimpl);
            objectRef.element = null;
        }
        if (kotlin.Result.m23442isSuccessimpl(obj)) {
            my.com.softspace.ssfasstapsdk.SSFasstapSDK sSFasstapSDK = (my.com.softspace.ssfasstapsdk.SSFasstapSDK) obj;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl softspaceBehaviourImpl = this;
                my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams build = my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams.Builder.create().setSpannableFormattedAmount(transactionPinParams.getSpannableFormattedAmount()).setFormattedAmount(transactionPinParams.getFormattedAmount()).setCurrency(transactionPinParams.getCurrency()).setCurrencyDisplayBack(transactionPinParams.isCurrencyDisplayBack()).setPanToken(transactionPinParams.getPanToken()).setTimeout(transactionPinParams.getTimeout()).setDrawableBtnOKColor(transactionPinParams.getDrawableBtnOKColor()).setFallbackMode(transactionPinParams.getFallbackMode()).build();
                com.zettle.sdk.core.log.LogKt.debug(this, "enterPin()");
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(sSFasstapSDK.getTransaction().enterPin(activity, build));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            objectRef.element = kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? 0 : m23436constructorimpl;
        }
        return (byte[]) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo] */
    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo getSoftspaceReaderInfo() {
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        if (kotlin.Result.m23439exceptionOrNullimpl(obj) != null) {
            com.zettle.sdk.core.log.LogKt.warn$default(this, "ReaderInfo not available", null, 2, null);
            objectRef.element = null;
        }
        if (kotlin.Result.m23442isSuccessimpl(obj)) {
            my.com.softspace.ssfasstapsdk.FasstapSDKInfo fasstapSDKInfo = ((my.com.softspace.ssfasstapsdk.SSFasstapSDK) obj).getFasstapSDKInfo(this.getHighSpeedVideoFpsRangesFor);
            java.lang.String sdkVersion = fasstapSDKInfo.getSdkVersion();
            java.lang.String cotsId = fasstapSDKInfo.getCotsId();
            java.lang.String sdkInitTimeStamp = fasstapSDKInfo.getSdkInitTimeStamp();
            java.util.List<my.com.softspace.ssfasstapsdk.KernelInfo> kernelInfo = fasstapSDKInfo.getKernelInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(kernelInfo, "");
            java.util.List<my.com.softspace.ssfasstapsdk.KernelInfo> list = kernelInfo;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (my.com.softspace.ssfasstapsdk.KernelInfo kernelInfo2 : list) {
                java.lang.String name2 = kernelInfo2.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                arrayList.add(new com.zettle.sdk.feature.taptopay.core.models.KernelInfo(name2, kernelInfo2.getChecksum(), kernelInfo2.getVersion()));
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sdkVersion, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cotsId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sdkInitTimeStamp, "");
            objectRef.element = new com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo(sdkVersion, null, cotsId, arrayList, sdkInitTimeStamp, 2, null);
            com.zettle.sdk.core.log.LogKt.debug(this, "SoftspaceReaderInfo::".concat(java.lang.String.valueOf(objectRef.element)));
        }
        return (com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo) objectRef.element;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean cancelTransaction() {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "cancelTransaction", m23439exceptionOrNullimpl);
        }
        if (!kotlin.Result.m23442isSuccessimpl(obj)) {
            return false;
        }
        my.com.softspace.ssfasstapsdk.SSFasstapSDK sSFasstapSDK = (my.com.softspace.ssfasstapsdk.SSFasstapSDK) obj;
        if (sSFasstapSDK.getTransaction().isTransactionRunning()) {
            return sSFasstapSDK.getTransaction().cancelTransaction();
        }
        return false;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean requestPermissionIfRequired(android.app.Activity activityContext, int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "requestPermissionIfRequired", m23439exceptionOrNullimpl);
        }
        if (!kotlin.Result.m23442isSuccessimpl(obj)) {
            return false;
        }
        return my.com.softspace.ssfasstapsdk.SSFasstapSDK.requestPermissionIfRequired(activityContext, requestCode);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean requestPermissionIfRequired(androidx.fragment.app.Fragment fragmentContext, int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentContext, "");
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "requestPermissionIfRequired", m23439exceptionOrNullimpl);
        }
        if (!kotlin.Result.m23442isSuccessimpl(obj)) {
            return false;
        }
        return my.com.softspace.ssfasstapsdk.SSFasstapSDK.requestPermissionIfRequired(fragmentContext, requestCode);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean hasRequiredPermission(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "hasRequiredPermission", m23439exceptionOrNullimpl);
        }
        if (!kotlin.Result.m23442isSuccessimpl(obj)) {
            return false;
        }
        return my.com.softspace.ssfasstapsdk.SSFasstapSDK.hasRequiredPermission(context);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour
    public final boolean hasGrantPermission(int[] permissionArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionArray, "");
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl != null) {
            com.zettle.sdk.core.log.LogKt.warn(this, "hasGrantPermission", m23439exceptionOrNullimpl);
        }
        if (!kotlin.Result.m23442isSuccessimpl(obj)) {
            return false;
        }
        return my.com.softspace.ssfasstapsdk.SSFasstapSDK.hasGrantPermission(permissionArray);
    }

    private static java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends my.com.softspace.ssfasstapsdk.pog.RecoverableAction> list) {
        if (list != null) {
            java.util.List<? extends my.com.softspace.ssfasstapsdk.pog.RecoverableAction> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (my.com.softspace.ssfasstapsdk.pog.RecoverableAction recoverableAction : list2) {
                java.lang.String intent = recoverableAction.getIntent();
                boolean isIncludePackage = recoverableAction.isIncludePackage();
                java.lang.String message = recoverableAction.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message, "");
                int errorCode = recoverableAction.getErrorCode();
                java.lang.String action = recoverableAction.getAction();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(action, "");
                java.lang.String messageKey = recoverableAction.getMessageKey();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messageKey, "");
                arrayList.add(new com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction(intent, isIncludePackage, message, errorCode, action, messageKey));
            }
            return arrayList;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static /* synthetic */ void $r8$lambda$YOoPEFLJ4u7uaQ6Bc6KMBQzVAzI(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl softspaceBehaviourImpl, com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener attestationResultListener, int i, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceBehaviourImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationResultListener, "");
        java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(list);
        com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult resolveAttestationStatus = com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultKt.resolveAttestationStatus(i, highResolutionOutputSizeshNQ4ISI);
        com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl softspaceBehaviourImpl2 = softspaceBehaviourImpl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("attest::attestationStatus(");
        sb.append(resolveAttestationStatus);
        sb.append(")");
        com.zettle.sdk.core.log.LogKt.debug(softspaceBehaviourImpl2, sb.toString());
        java.lang.String arrays = java.util.Arrays.toString(highResolutionOutputSizeshNQ4ISI.toArray(new com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction[0]));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("attest::recommendedActionList(");
        sb2.append(arrays);
        sb2.append(")");
        com.zettle.sdk.core.log.LogKt.debug(softspaceBehaviourImpl2, sb2.toString());
        attestationResultListener.onAttestationFinished(resolveAttestationStatus, highResolutionOutputSizeshNQ4ISI);
    }

    public static /* synthetic */ void $r8$lambda$psufuSP4QIjD9l5t32bBjuzfgT0(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl softspaceBehaviourImpl, com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultListener attestationResultListener, int i, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceBehaviourImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationResultListener, "");
        java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(list);
        com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult resolveAttestationStatus = com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultKt.resolveAttestationStatus(i, highResolutionOutputSizeshNQ4ISI);
        com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl softspaceBehaviourImpl2 = softspaceBehaviourImpl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("attestFull::attestationStatus(");
        sb.append(resolveAttestationStatus);
        sb.append(")");
        com.zettle.sdk.core.log.LogKt.debug(softspaceBehaviourImpl2, sb.toString());
        java.lang.String arrays = java.util.Arrays.toString(highResolutionOutputSizeshNQ4ISI.toArray(new com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction[0]));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("attestFull::recommendedActionList(");
        sb2.append(arrays);
        sb2.append(")");
        com.zettle.sdk.core.log.LogKt.debug(softspaceBehaviourImpl2, sb2.toString());
        attestationResultListener.onAttestationFinished(resolveAttestationStatus, highResolutionOutputSizeshNQ4ISI);
    }
}
