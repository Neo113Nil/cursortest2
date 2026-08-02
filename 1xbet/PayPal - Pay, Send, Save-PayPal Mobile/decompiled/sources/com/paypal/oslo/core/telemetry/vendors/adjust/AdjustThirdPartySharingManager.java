package com.paypal.oslo.core.telemetry.vendors.adjust;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\r\u001a\u0004\u0018\u00010\u0012*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustThirdPartySharingManager;", "", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "Lcom/paypal/oslo/core/userstore/model/UserState;", "userState", "", "onUpdateThirdPartySharing", "(Lcom/paypal/oslo/core/userstore/model/UserState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/userstore/model/User;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/userstore/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighSpeedVideoSizes", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress$Address;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/userstore/model/ProfileAddress$Address;)Z", "(Lcom/paypal/oslo/core/userstore/model/User;)Lcom/paypal/oslo/core/userstore/model/ProfileAddress$Address;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "", "", "Ljava/util/Set;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdjustThirdPartySharingManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AdjustThirdPartySharingManager(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoFpsRangesFor = appStorage;
        this.getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf("CA");
        this.getHighSpeedVideoSizes = kotlin.collections.SetsKt.emptySet();
        this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("adjust_third_party_sharing_enabled");
    }

    public final java.lang.Object onUpdateThirdPartySharing(com.paypal.oslo.core.userstore.model.UserState userState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser(), continuation);
            return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fc, code lost:
    
        if (getHighSpeedVideoSizes(r6, r2) == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.core.userstore.model.User user, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager$onUpdateThirdPartySharing$2 adjustThirdPartySharingManager$onUpdateThirdPartySharing$2;
        java.lang.Object obj;
        int i;
        com.paypal.oslo.core.userstore.model.ProfileAddress.Address Camera2StreamConfigurationMap;
        boolean highSpeedVideoFpsRanges;
        int i2;
        com.paypal.oslo.core.userstore.model.User user2;
        if (continuation instanceof com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager$onUpdateThirdPartySharing$2) {
            adjustThirdPartySharingManager$onUpdateThirdPartySharing$2 = (com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager$onUpdateThirdPartySharing$2) continuation;
            if ((adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getOutputFormats & Integer.MIN_VALUE) != 0) {
                adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getOutputFormats -= 2147483648;
                obj = adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(user);
                    if (Camera2StreamConfigurationMap == null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Adjust] Failed to retrieve user account primary address. Will not update Adjust third party sharing preference.", null, null, 6, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
                    i2 = !highSpeedVideoFpsRanges ? 1 : 0;
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = this.getHighResolutionOutputSizeshNQ4ISI;
                    adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user);
                    adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap;
                    adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRanges;
                    adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighSpeedVideoSizes = i2;
                    adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getOutputFormats = 1;
                    obj = appStorage.getBoolean(unencrypted, false, adjustThirdPartySharingManager$onUpdateThirdPartySharing$2);
                    if (obj != coroutine_suspended) {
                        user2 = user;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighSpeedVideoSizes;
                    boolean z = adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                i2 = adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighSpeedVideoSizes;
                highSpeedVideoFpsRanges = adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = (com.paypal.oslo.core.userstore.model.ProfileAddress.Address) adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.Camera2StreamConfigurationMap;
                user2 = (com.paypal.oslo.core.userstore.model.User) adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue() != i2) {
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to("is_enabled", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i2 != 0));
                pairArr[1] = kotlin.TuplesKt.to("country_code", Camera2StreamConfigurationMap.getCountryCode());
                pairArr[2] = kotlin.TuplesKt.to("state", Camera2StreamConfigurationMap.getAdminArea1());
                java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(pairArr);
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Adjust] Updating track third party sharing", mapOf, null, 4, null);
                boolean z2 = i2 != 0;
                adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user2);
                adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(Camera2StreamConfigurationMap);
                adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mapOf);
                adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRanges;
                adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getHighSpeedVideoSizes = i2;
                adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getOutputFormats = 2;
            }
        }
        adjustThirdPartySharingManager$onUpdateThirdPartySharing$2 = new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager$onUpdateThirdPartySharing$2(this, continuation);
        obj = adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = adjustThirdPartySharingManager$onUpdateThirdPartySharing$2.getOutputFormats;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue() != i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager$updateThirdPartySharing$1 adjustThirdPartySharingManager$updateThirdPartySharing$1;
        int i;
        com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing;
        if (continuation instanceof com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager$updateThirdPartySharing$1) {
            adjustThirdPartySharingManager$updateThirdPartySharing$1 = (com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager$updateThirdPartySharing$1) continuation;
            if ((adjustThirdPartySharingManager$updateThirdPartySharing$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                adjustThirdPartySharingManager$updateThirdPartySharing$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = adjustThirdPartySharingManager$updateThirdPartySharing$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = adjustThirdPartySharingManager$updateThirdPartySharing$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing2 = new com.adjust.sdk.AdjustThirdPartySharing(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = this.getHighResolutionOutputSizeshNQ4ISI;
                    adjustThirdPartySharingManager$updateThirdPartySharing$1.getHighResolutionOutputSizeshNQ4ISI = adjustThirdPartySharing2;
                    adjustThirdPartySharingManager$updateThirdPartySharing$1.getHighSpeedVideoFpsRangesFor = z;
                    adjustThirdPartySharingManager$updateThirdPartySharing$1.Camera2StreamConfigurationMap = 1;
                    if (appStorage.setBoolean(unencrypted, z, adjustThirdPartySharingManager$updateThirdPartySharing$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    adjustThirdPartySharing = adjustThirdPartySharing2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = adjustThirdPartySharingManager$updateThirdPartySharing$1.getHighSpeedVideoFpsRangesFor;
                    adjustThirdPartySharing = (com.adjust.sdk.AdjustThirdPartySharing) adjustThirdPartySharingManager$updateThirdPartySharing$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.adjust.sdk.Adjust.trackThirdPartySharing(adjustThirdPartySharing);
                return kotlin.Unit.INSTANCE;
            }
        }
        adjustThirdPartySharingManager$updateThirdPartySharing$1 = new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager$updateThirdPartySharing$1(this, continuation);
        java.lang.Object obj2 = adjustThirdPartySharingManager$updateThirdPartySharing$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = adjustThirdPartySharingManager$updateThirdPartySharing$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.adjust.sdk.Adjust.trackThirdPartySharing(adjustThirdPartySharing);
        return kotlin.Unit.INSTANCE;
    }

    private final boolean getHighSpeedVideoFpsRanges(com.paypal.oslo.core.userstore.model.ProfileAddress.Address address) {
        java.lang.String str;
        java.lang.String upperCase = address.getCountryCode().toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "US")) {
            java.util.Set<java.lang.String> set = this.getHighSpeedVideoSizes;
            java.lang.String upperCase2 = address.getCountryCode().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
            return set.contains(upperCase2);
        }
        java.util.Set<java.lang.String> set2 = this.getHighSpeedVideoFpsRanges;
        java.lang.String adminArea1 = address.getAdminArea1();
        if (adminArea1 != null) {
            str = adminArea1.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        } else {
            str = null;
        }
        return kotlin.collections.CollectionsKt.contains(set2, str);
    }

    private static com.paypal.oslo.core.userstore.model.ProfileAddress.Address Camera2StreamConfigurationMap(com.paypal.oslo.core.userstore.model.User user) {
        java.lang.Object obj;
        java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> profileAddresses = user.getProfileAddresses();
        if (profileAddresses == null) {
            profileAddresses = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Iterator<T> it = profileAddresses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.core.userstore.model.ProfileAddress) obj).getPrimary()) {
                break;
            }
        }
        com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress = (com.paypal.oslo.core.userstore.model.ProfileAddress) obj;
        if (profileAddress != null) {
            return profileAddress.getAddress();
        }
        return null;
    }
}
