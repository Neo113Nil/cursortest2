package com.paypal.oslo.feature.identity.shared.data.capability;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/data/capability/EmulatorDetectorImpl;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/EmulatorDetector;", "Lcom/paypal/oslo/core/appidentity/domain/DeviceInformation;", "deviceInformation", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/DeviceInformation;)V", "", "isEmulator", "()Z", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/appidentity/domain/DeviceInformation;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmulatorDetectorImpl implements com.paypal.oslo.feature.identity.shared.domain.capability.EmulatorDetector {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.DeviceInformation getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public EmulatorDetectorImpl(com.paypal.oslo.core.appidentity.domain.DeviceInformation deviceInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInformation, "");
        this.getHighSpeedVideoFpsRanges = deviceInformation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
    
        if (kotlin.text.StringsKt.contains((java.lang.CharSequence) r0, (java.lang.CharSequence) "generic", true) != false) goto L27;
     */
    @Override // com.paypal.oslo.feature.identity.shared.domain.capability.EmulatorDetector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isEmulator() {
        java.lang.String str = android.os.Build.FINGERPRINT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) "generic", true)) {
            java.lang.String str2 = android.os.Build.FINGERPRINT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
            if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) str2, (java.lang.CharSequence) "unknown", true) && !kotlin.text.StringsKt.contains((java.lang.CharSequence) this.getHighSpeedVideoFpsRanges.getDeviceModel(), (java.lang.CharSequence) "Emulator", true) && !kotlin.text.StringsKt.contains((java.lang.CharSequence) this.getHighSpeedVideoFpsRanges.getDeviceModel(), (java.lang.CharSequence) "Android SDK", true) && !kotlin.text.StringsKt.contains((java.lang.CharSequence) this.getHighSpeedVideoFpsRanges.getDeviceManufacturer(), (java.lang.CharSequence) "Genymotion", true) && !kotlin.text.StringsKt.equals(this.getHighSpeedVideoFpsRanges.getDeviceManufacturer(), "unknown", true)) {
                java.lang.String str3 = android.os.Build.BRAND;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) str3, (java.lang.CharSequence) "generic", true)) {
                    java.lang.String str4 = android.os.Build.DEVICE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
                }
                java.lang.String str5 = android.os.Build.PRODUCT;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "");
                if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) str5, (java.lang.CharSequence) "sdk", true)) {
                    java.lang.String str6 = android.os.Build.PRODUCT;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
                    if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) str6, (java.lang.CharSequence) "google_sdk", true)) {
                        java.lang.String str7 = android.os.Build.PRODUCT;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                        if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) str7, (java.lang.CharSequence) "sdk_gphone", true)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
