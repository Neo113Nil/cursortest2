package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeIdentitiesManager;", "", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "telemetryFeatureGateProvider", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;)V", "Lcom/paypal/oslo/core/userstore/model/UserState;", "userState", "", "onUpdateIdentities", "(Lcom/paypal/oslo/core/userstore/model/UserState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/userstore/model/User;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/userstore/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdobeIdentitiesManager {
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    @javax.inject.Inject
    public AdobeIdentitiesManager(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryFeatureGateProvider, "");
        this.Camera2StreamConfigurationMap = appStorage;
        this.getHighSpeedVideoFpsRangesFor = telemetryFeatureGateProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("adobe_identity_last_customer_id");
    }

    public final java.lang.Object onUpdateIdentities(com.paypal.oslo.core.userstore.model.UserState userState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!this.getHighSpeedVideoFpsRangesFor.isAdobeEnabled()) {
            return kotlin.Unit.INSTANCE;
        }
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        if (!(userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser(), continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010c, code lost:
    
        if (r9.setString(r10, r4, r2) != r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.core.userstore.model.User user, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$updateIdentity$1 adobeIdentitiesManager$updateIdentity$1;
        int i;
        com.paypal.oslo.core.userstore.model.User user2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        if (continuation instanceof com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$updateIdentity$1) {
            adobeIdentitiesManager$updateIdentity$1 = (com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$updateIdentity$1) continuation;
            if ((adobeIdentitiesManager$updateIdentity$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                adobeIdentitiesManager$updateIdentity$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = adobeIdentitiesManager$updateIdentity$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = adobeIdentitiesManager$updateIdentity$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String id = user.getId();
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = this.getHighResolutionOutputSizeshNQ4ISI;
                    adobeIdentitiesManager$updateIdentity$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user);
                    adobeIdentitiesManager$updateIdentity$1.Camera2StreamConfigurationMap = id;
                    adobeIdentitiesManager$updateIdentity$1.getOutputMinFrameDuration = 1;
                    java.lang.Object string = appStorage.getString(unencrypted, adobeIdentitiesManager$updateIdentity$1);
                    if (string != coroutine_suspended) {
                        user2 = user;
                        str = id;
                        obj = string;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    str = (java.lang.String) adobeIdentitiesManager$updateIdentity$1.Camera2StreamConfigurationMap;
                    user2 = (com.paypal.oslo.core.userstore.model.User) adobeIdentitiesManager$updateIdentity$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Adobe] Requested identity update", null, null, 6, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    str4 = (java.lang.String) adobeIdentitiesManager$updateIdentity$1.getHighResolutionOutputSizeshNQ4ISI;
                    str3 = (java.lang.String) adobeIdentitiesManager$updateIdentity$1.Camera2StreamConfigurationMap;
                    user2 = (com.paypal.oslo.core.userstore.model.User) adobeIdentitiesManager$updateIdentity$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str4;
                    str = str3;
                    com.adobe.marketing.mobile.edge.identity.IdentityItem identityItem = new com.adobe.marketing.mobile.edge.identity.IdentityItem(str, com.adobe.marketing.mobile.edge.identity.AuthenticatedState.AUTHENTICATED, true);
                    com.adobe.marketing.mobile.edge.identity.IdentityMap identityMap = new com.adobe.marketing.mobile.edge.identity.IdentityMap();
                    identityMap.addItem(identityItem, "custIdEcrpt");
                    com.adobe.marketing.mobile.edge.identity.Identity.updateIdentities(identityMap);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    adobeIdentitiesManager$updateIdentity$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user2);
                    adobeIdentitiesManager$updateIdentity$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    adobeIdentitiesManager$updateIdentity$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    adobeIdentitiesManager$updateIdentity$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityItem);
                    adobeIdentitiesManager$updateIdentity$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityMap);
                    adobeIdentitiesManager$updateIdentity$1.getOutputMinFrameDuration = 3;
                }
                str2 = (java.lang.String) obj;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, str)) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Adobe] Identity unchanged, skipping update", null, null, 6, null);
                    return kotlin.Unit.INSTANCE;
                }
                if (str2 != null) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Adobe] Removing previous identity before update", null, null, 6, null);
                    adobeIdentitiesManager$updateIdentity$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user2);
                    adobeIdentitiesManager$updateIdentity$1.Camera2StreamConfigurationMap = str;
                    adobeIdentitiesManager$updateIdentity$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    adobeIdentitiesManager$updateIdentity$1.getOutputMinFrameDuration = 2;
                    if (getHighSpeedVideoFpsRanges(str2, adobeIdentitiesManager$updateIdentity$1) != coroutine_suspended) {
                        str3 = str;
                        str4 = str2;
                        str2 = str4;
                        str = str3;
                    }
                    return coroutine_suspended;
                }
                com.adobe.marketing.mobile.edge.identity.IdentityItem identityItem2 = new com.adobe.marketing.mobile.edge.identity.IdentityItem(str, com.adobe.marketing.mobile.edge.identity.AuthenticatedState.AUTHENTICATED, true);
                com.adobe.marketing.mobile.edge.identity.IdentityMap identityMap2 = new com.adobe.marketing.mobile.edge.identity.IdentityMap();
                identityMap2.addItem(identityItem2, "custIdEcrpt");
                com.adobe.marketing.mobile.edge.identity.Identity.updateIdentities(identityMap2);
                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage22 = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted22 = this.getHighResolutionOutputSizeshNQ4ISI;
                adobeIdentitiesManager$updateIdentity$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user2);
                adobeIdentitiesManager$updateIdentity$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                adobeIdentitiesManager$updateIdentity$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                adobeIdentitiesManager$updateIdentity$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityItem2);
                adobeIdentitiesManager$updateIdentity$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityMap2);
                adobeIdentitiesManager$updateIdentity$1.getOutputMinFrameDuration = 3;
            }
        }
        adobeIdentitiesManager$updateIdentity$1 = new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$updateIdentity$1(this, continuation);
        java.lang.Object obj2 = adobeIdentitiesManager$updateIdentity$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = adobeIdentitiesManager$updateIdentity$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        str2 = (java.lang.String) obj2;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, str)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (getHighSpeedVideoFpsRanges(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r6 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$removeIdentity$1 adobeIdentitiesManager$removeIdentity$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$removeIdentity$1) {
            adobeIdentitiesManager$removeIdentity$1 = (com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$removeIdentity$1) continuation;
            if ((adobeIdentitiesManager$removeIdentity$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                adobeIdentitiesManager$removeIdentity$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = adobeIdentitiesManager$removeIdentity$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = adobeIdentitiesManager$removeIdentity$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = this.getHighResolutionOutputSizeshNQ4ISI;
                    adobeIdentitiesManager$removeIdentity$1.Camera2StreamConfigurationMap = 1;
                    obj = appStorage.getString(unencrypted, adobeIdentitiesManager$removeIdentity$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    return kotlin.Unit.INSTANCE;
                }
                adobeIdentitiesManager$removeIdentity$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                adobeIdentitiesManager$removeIdentity$1.Camera2StreamConfigurationMap = 2;
            }
        }
        adobeIdentitiesManager$removeIdentity$1 = new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$removeIdentity$1(this, continuation);
        java.lang.Object obj2 = adobeIdentitiesManager$removeIdentity$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = adobeIdentitiesManager$removeIdentity$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$removeIdentity$2 adobeIdentitiesManager$removeIdentity$2;
        int i;
        if (continuation instanceof com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$removeIdentity$2) {
            adobeIdentitiesManager$removeIdentity$2 = (com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$removeIdentity$2) continuation;
            if ((adobeIdentitiesManager$removeIdentity$2.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                adobeIdentitiesManager$removeIdentity$2.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = adobeIdentitiesManager$removeIdentity$2.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = adobeIdentitiesManager$removeIdentity$2.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.adobe.marketing.mobile.edge.identity.IdentityItem identityItem = new com.adobe.marketing.mobile.edge.identity.IdentityItem(str, com.adobe.marketing.mobile.edge.identity.AuthenticatedState.AUTHENTICATED, true);
                    com.adobe.marketing.mobile.edge.identity.Identity.removeIdentity(identityItem, "custIdEcrpt");
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = this.getHighResolutionOutputSizeshNQ4ISI;
                    adobeIdentitiesManager$removeIdentity$2.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    adobeIdentitiesManager$removeIdentity$2.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityItem);
                    adobeIdentitiesManager$removeIdentity$2.Camera2StreamConfigurationMap = 1;
                    if (appStorage.remove(unencrypted, adobeIdentitiesManager$removeIdentity$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Adobe] Requested identity removal", null, null, 6, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        adobeIdentitiesManager$removeIdentity$2 = new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$removeIdentity$2(this, continuation);
        java.lang.Object obj2 = adobeIdentitiesManager$removeIdentity$2.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = adobeIdentitiesManager$removeIdentity$2.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Adobe] Requested identity removal", null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }
}
