package com.zettle.sdk.core.permission;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020!H\u0002¢\u0006\u0004\b\u001f\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0016\u0010(\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0015\u0010,\u001a\u00020*8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0015\u0010\u001d\u001a\u00020.8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b'\u0010+R\u0016\u00101\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00103\u001a\u0004\u0018\u0001028CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b1\u0010+R\u0016\u00104\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/permission/PermissionModule;", "Lcom/zettle/sdk/core/BaseModule;", "Lcom/zettle/sdk/core/permission/Permission;", "Lcom/zettle/sdk/core/log/Loggable;", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/core/auth/AuthModule;", "auth", "Lcom/zettle/sdk/core/auth/AuthProvider;", "authProvider", "Lcom/zettle/sdk/core/user/UserModule;", "userModule", "Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "<init>", "(Landroid/content/Context;Lcom/zettle/sdk/core/auth/AuthModule;Lcom/zettle/sdk/core/auth/AuthProvider;Lcom/zettle/sdk/core/user/UserModule;Lcom/zettle/sdk/core/network/NetworkModule;)V", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "requested", "checkApprovedPermissions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/core/permission/Prerequisite$Authentication;", "requirement", "checkAuth", "(Lcom/zettle/sdk/core/permission/Prerequisite$Authentication;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "p0", "", "Camera2StreamConfigurationMap", "([Ljava/lang/String;)Z", "getHighSpeedVideoFpsRangesFor", "(Lcom/zettle/sdk/core/permission/Prerequisite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature;", "(Lcom/zettle/sdk/core/permission/Prerequisite$SystemFeature;)Z", "Lcom/zettle/sdk/core/requirements/PermissionDeniedStorage;", "permissionDeniedStorage", "()Lcom/zettle/sdk/core/requirements/PermissionDeniedStorage;", "Lcom/zettle/sdk/core/auth/AuthModule;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/auth/AuthProvider;", "Landroid/bluetooth/BluetoothManager;", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Landroid/location/LocationManager;", "getHighSpeedVideoSizesFor", "Lcom/zettle/sdk/core/network/NetworkModule;", "getOutputMinFrameDuration", "Landroid/nfc/NfcAdapter;", "getInputSizeshNQ4ISI", "getInputFormats", "Lcom/zettle/sdk/core/user/UserModule;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PermissionModule extends com.zettle.sdk.core.BaseModule implements com.zettle.sdk.core.permission.Permission, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.AuthModule getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    private final com.zettle.sdk.core.auth.AuthProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.core.network.NetworkModule getOutputMinFrameDuration;
    private final com.zettle.sdk.core.user.UserModule getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.Lazy getInputSizeshNQ4ISI;

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionModule(android.content.Context context, com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.core.auth.AuthProvider authProvider, com.zettle.sdk.core.user.UserModule userModule, com.zettle.sdk.core.network.NetworkModule networkModule) {
        super(null, 1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = authModule;
        this.getHighSpeedVideoSizes = authProvider;
        this.getInputFormats = userModule;
        this.getOutputMinFrameDuration = networkModule;
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<android.bluetooth.BluetoothManager>() { // from class: com.zettle.sdk.core.permission.PermissionModule$bluetoothManager$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final android.bluetooth.BluetoothManager invoke() {
                android.content.Context context2;
                context2 = com.zettle.sdk.core.permission.PermissionModule.this.getHighSpeedVideoFpsRangesFor;
                java.lang.Object systemService = context2.getSystemService("bluetooth");
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
                return (android.bluetooth.BluetoothManager) systemService;
            }

            {
                super(0);
            }
        });
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<android.location.LocationManager>() { // from class: com.zettle.sdk.core.permission.PermissionModule$locationManager$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final android.location.LocationManager invoke() {
                android.content.Context context2;
                context2 = com.zettle.sdk.core.permission.PermissionModule.this.getHighSpeedVideoFpsRangesFor;
                java.lang.Object systemService = context2.getSystemService("location");
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
                return (android.location.LocationManager) systemService;
            }

            {
                super(0);
            }
        });
        this.getInputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<android.nfc.NfcAdapter>() { // from class: com.zettle.sdk.core.permission.PermissionModule$nfcAdapter$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final android.nfc.NfcAdapter invoke() {
                java.lang.Object m23436constructorimpl;
                android.content.Context context2;
                com.zettle.sdk.core.permission.PermissionModule permissionModule = com.zettle.sdk.core.permission.PermissionModule.this;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    context2 = permissionModule.getHighSpeedVideoFpsRangesFor;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(android.nfc.NfcAdapter.getDefaultAdapter(context2));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                    m23436constructorimpl = null;
                }
                return (android.nfc.NfcAdapter) m23436constructorimpl;
            }

            {
                super(0);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0075 -> B:10:0x0078). Please report as a decompilation issue!!! */
    @Override // com.zettle.sdk.core.permission.Permission
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkApprovedPermissions(java.util.List<? extends com.zettle.sdk.core.permission.Prerequisite> list, kotlin.coroutines.Continuation<? super java.util.List<? extends com.zettle.sdk.core.permission.Prerequisite>> continuation) {
        com.zettle.sdk.core.permission.PermissionModule$checkApprovedPermissions$1 permissionModule$checkApprovedPermissions$1;
        int i;
        java.util.Iterator it;
        com.zettle.sdk.core.permission.PermissionModule permissionModule;
        java.util.Collection collection;
        if (continuation instanceof com.zettle.sdk.core.permission.PermissionModule$checkApprovedPermissions$1) {
            permissionModule$checkApprovedPermissions$1 = (com.zettle.sdk.core.permission.PermissionModule$checkApprovedPermissions$1) continuation;
            if ((permissionModule$checkApprovedPermissions$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                permissionModule$checkApprovedPermissions$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = permissionModule$checkApprovedPermissions$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = permissionModule$checkApprovedPermissions$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(list, new java.util.Comparator() { // from class: com.zettle.sdk.core.permission.PermissionModule$checkApprovedPermissions$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.zettle.sdk.core.permission.Prerequisite) t).getPrio()), java.lang.Integer.valueOf(((com.zettle.sdk.core.permission.Prerequisite) t2).getPrio()));
                        }
                    });
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    it = sortedWith.iterator();
                    permissionModule = this;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) permissionModule$checkApprovedPermissions$1.getHighSpeedVideoFpsRanges;
                    collection = (java.util.Collection) permissionModule$checkApprovedPermissions$1.getHighResolutionOutputSizeshNQ4ISI;
                    permissionModule = (com.zettle.sdk.core.permission.PermissionModule) permissionModule$checkApprovedPermissions$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.core.permission.Prerequisite prerequisite = (com.zettle.sdk.core.permission.Prerequisite) obj;
                    if (prerequisite != null) {
                        collection.add(prerequisite);
                    }
                    if (it.hasNext()) {
                        com.zettle.sdk.core.permission.Prerequisite prerequisite2 = (com.zettle.sdk.core.permission.Prerequisite) it.next();
                        permissionModule$checkApprovedPermissions$1.getHighSpeedVideoFpsRangesFor = permissionModule;
                        permissionModule$checkApprovedPermissions$1.getHighResolutionOutputSizeshNQ4ISI = collection;
                        permissionModule$checkApprovedPermissions$1.getHighSpeedVideoFpsRanges = it;
                        permissionModule$checkApprovedPermissions$1.Camera2StreamConfigurationMap = 1;
                        obj = permissionModule.getHighSpeedVideoFpsRangesFor(prerequisite2, permissionModule$checkApprovedPermissions$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.zettle.sdk.core.permission.Prerequisite prerequisite3 = (com.zettle.sdk.core.permission.Prerequisite) obj;
                        if (prerequisite3 != null) {
                        }
                        if (it.hasNext()) {
                            return (java.util.List) collection;
                        }
                    }
                }
            }
        }
        permissionModule$checkApprovedPermissions$1 = new com.zettle.sdk.core.permission.PermissionModule$checkApprovedPermissions$1(this, continuation);
        java.lang.Object obj2 = permissionModule$checkApprovedPermissions$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = permissionModule$checkApprovedPermissions$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    @Override // com.zettle.sdk.core.permission.Permission
    public final com.zettle.sdk.core.requirements.PermissionDeniedStorage permissionDeniedStorage() {
        return com.zettle.sdk.core.requirements.PermissionDeniedStorage.INSTANCE.create(this.getHighSpeedVideoFpsRangesFor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.zettle.sdk.core.permission.Prerequisite prerequisite, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.permission.Prerequisite> continuation) {
        if (prerequisite instanceof com.zettle.sdk.core.permission.Prerequisite.Authentication) {
            return checkAuth((com.zettle.sdk.core.permission.Prerequisite.Authentication) prerequisite, continuation);
        }
        com.zettle.sdk.core.permission.Prerequisite.SystemFeature systemFeature = null;
        if (prerequisite instanceof com.zettle.sdk.core.permission.Prerequisite.Permission) {
            com.zettle.sdk.core.permission.Prerequisite.Permission permission = (com.zettle.sdk.core.permission.Prerequisite.Permission) prerequisite;
            boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(permission.getIdentifier());
            if (!Camera2StreamConfigurationMap) {
                if (Camera2StreamConfigurationMap) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                systemFeature = permission;
            }
            return systemFeature;
        }
        if (!(prerequisite instanceof com.zettle.sdk.core.permission.Prerequisite.SystemFeature)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.zettle.sdk.core.permission.Prerequisite.SystemFeature systemFeature2 = (com.zettle.sdk.core.permission.Prerequisite.SystemFeature) prerequisite;
        boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(systemFeature2);
        if (!highSpeedVideoFpsRangesFor) {
            if (highSpeedVideoFpsRangesFor) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            systemFeature = systemFeature2;
        }
        return systemFeature;
    }

    public final java.lang.Object checkAuth(com.zettle.sdk.core.permission.Prerequisite.Authentication authentication, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.permission.Prerequisite> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.zettle.sdk.core.permission.PermissionModule$checkAuth$2(this, authentication, null), continuation);
    }

    private final boolean getHighSpeedVideoFpsRangesFor(com.zettle.sdk.core.permission.Prerequisite.SystemFeature p0) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(p0, com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network.INSTANCE)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(p0, com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Bluetooth.INSTANCE)) {
                return ((android.bluetooth.BluetoothManager) this.getHighSpeedVideoFpsRanges.getValue()).getAdapter().isEnabled();
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(p0, com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location.INSTANCE)) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    return ((android.location.LocationManager) this.Camera2StreamConfigurationMap.getValue()).isLocationEnabled();
                }
                return ((android.location.LocationManager) this.Camera2StreamConfigurationMap.getValue()).isProviderEnabled("network") || ((android.location.LocationManager) this.Camera2StreamConfigurationMap.getValue()).isProviderEnabled("gps");
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(p0, com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            android.nfc.NfcAdapter nfcAdapter = (android.nfc.NfcAdapter) this.getInputSizeshNQ4ISI.getValue();
            return nfcAdapter != null && nfcAdapter.isEnabled();
        }
        com.zettle.sdk.core.network.NetworkModule networkModule = this.getOutputMinFrameDuration;
        return (networkModule == null || kotlin.jvm.internal.Intrinsics.areEqual(networkModule.getConnection(), com.zettle.sdk.core.network.Connection.Disconnected.INSTANCE)) ? false : true;
    }

    private final boolean Camera2StreamConfigurationMap(java.lang.String[] p0) {
        for (java.lang.String str : p0) {
            if (androidx.core.content.ContextCompat.checkSelfPermission(this.getHighSpeedVideoFpsRangesFor, str) != 0) {
                return false;
            }
        }
        return true;
    }
}
