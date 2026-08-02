package com.paypal.oslo.feature.identity.devicebinding;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/BiometricBindSchemeProvider;", "Lcom/paypal/oslo/feature/identity/login/domain/BindSchemeProvider;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "deviceBindingTokenStorage", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;)V", "", "getBindSchemeAvailable", "()Ljava/lang/String;", "getBindSchemeEnrolled", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "getHighSpeedVideoFpsRanges", "Companion_"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BiometricBindSchemeProvider implements com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage getHighSpeedVideoFpsRanges;
    private final android.content.Context getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider.Companion_ Companion_ = new com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider.Companion_(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public BiometricBindSchemeProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingTokenStorage, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRanges = deviceBindingTokenStorage;
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider
    public final java.lang.String getBindSchemeAvailable() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object systemService = this.getHighSpeedVideoSizes.getSystemService("keyguard");
        android.app.KeyguardManager keyguardManager = systemService instanceof android.app.KeyguardManager ? (android.app.KeyguardManager) systemService : null;
        if (keyguardManager != null && keyguardManager.isDeviceSecure()) {
            arrayList.add("crypto:kmli");
        }
        androidx.biometric.BiometricManager from = androidx.biometric.BiometricManager.from(this.getHighSpeedVideoSizes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        if (from.canAuthenticate(15) == 0) {
            arrayList.add("biometric:fingerprint");
            arrayList.add("biometric:deviceauth");
        }
        if (!arrayList.isEmpty()) {
            return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        }
        return "none";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getBindSchemeEnrolled(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider$getBindSchemeEnrolled$1 biometricBindSchemeProvider$getBindSchemeEnrolled$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.util.List list;
        java.lang.Object bindingToken;
        java.lang.String str;
        java.util.List list2;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider$getBindSchemeEnrolled$1) {
            biometricBindSchemeProvider$getBindSchemeEnrolled$1 = (com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider$getBindSchemeEnrolled$1) continuation;
            if ((biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoFpsRanges;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC;
                    biometricBindSchemeProvider$getBindSchemeEnrolled$1.Camera2StreamConfigurationMap = arrayList;
                    biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object bindingToken2 = deviceBindingTokenStorage.getBindingToken(deviceAuthMethod, biometricBindSchemeProvider$getBindSchemeEnrolled$1);
                    if (bindingToken2 != coroutine_suspended) {
                        list = arrayList;
                        obj = bindingToken2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoSizes;
                    list2 = (java.util.List) biometricBindSchemeProvider$getBindSchemeEnrolled$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = (java.lang.String) obj;
                    if (str != null) {
                        list2.add("biometric:fingerprint");
                        list2.add("biometric:deviceauth");
                    }
                    if (str2 != null) {
                        list2.add("crypto:kmli");
                    }
                    if (list2.isEmpty()) {
                        return kotlin.collections.CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null);
                    }
                    return "none";
                }
                list = (java.util.List) biometricBindSchemeProvider$getBindSchemeEnrolled$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str3 = (java.lang.String) obj;
                com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage2 = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod2 = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS;
                biometricBindSchemeProvider$getBindSchemeEnrolled$1.Camera2StreamConfigurationMap = list;
                biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoSizes = str3;
                biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoFpsRangesFor = 2;
                bindingToken = deviceBindingTokenStorage2.getBindingToken(deviceAuthMethod2, biometricBindSchemeProvider$getBindSchemeEnrolled$1);
                if (bindingToken != coroutine_suspended) {
                    str = str3;
                    obj = bindingToken;
                    list2 = list;
                    str2 = (java.lang.String) obj;
                    if (str != null) {
                    }
                    if (str2 != null) {
                    }
                    if (list2.isEmpty()) {
                    }
                }
                return coroutine_suspended;
            }
        }
        biometricBindSchemeProvider$getBindSchemeEnrolled$1 = new com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider$getBindSchemeEnrolled$1(this, continuation);
        java.lang.Object obj2 = biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoFpsRanges;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.lang.String str32 = (java.lang.String) obj2;
        com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage22 = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod22 = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS;
        biometricBindSchemeProvider$getBindSchemeEnrolled$1.Camera2StreamConfigurationMap = list;
        biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoSizes = str32;
        biometricBindSchemeProvider$getBindSchemeEnrolled$1.getHighSpeedVideoFpsRangesFor = 2;
        bindingToken = deviceBindingTokenStorage22.getBindingToken(deviceAuthMethod22, biometricBindSchemeProvider$getBindSchemeEnrolled$1);
        if (bindingToken != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/BiometricBindSchemeProvider$Companion_;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
