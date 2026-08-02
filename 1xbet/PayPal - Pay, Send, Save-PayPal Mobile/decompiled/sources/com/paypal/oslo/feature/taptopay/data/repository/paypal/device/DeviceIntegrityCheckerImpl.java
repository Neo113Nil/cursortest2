package com.paypal.oslo.feature.taptopay.data.repository.paypal.device;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/DeviceIntegrityCheckerImpl;", "Lcom/paypal/oslo/feature/taptopay/domain/capability/device/DeviceIntegrityChecker;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isDeviceCompromised", "()Z", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceIntegrityCheckerImpl implements com.paypal.oslo.feature.taptopay.domain.capability.device.DeviceIntegrityChecker {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DeviceIntegrityCheckerImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
    }

    private final boolean getHighSpeedVideoSizes() {
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"com.topjohnwu.magisk", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.noshufou.android.su", "com.thirdparty.superuser", "com.yellowes.su"});
        if ((listOf instanceof java.util.Collection) && listOf.isEmpty()) {
            return false;
        }
        java.util.Iterator it = listOf.iterator();
        while (it.hasNext()) {
            try {
                this.Camera2StreamConfigurationMap.getPackageManager().getPackageInfo((java.lang.String) it.next(), 0);
                return true;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.capability.device.DeviceIntegrityChecker
    public final boolean isDeviceCompromised() {
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"/system/bin/su", "/system/xbin/su", "/sbin/su", "/data/local/bin/su", "/data/local/xbin/su", "/data/local/su", "/system/app/Superuser.apk", "/system/app/SuperSU.apk"});
        boolean z = true;
        if (!(listOf instanceof java.util.Collection) || !listOf.isEmpty()) {
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (new java.io.File((java.lang.String) it.next()).exists()) {
                    break;
                }
            }
        }
        java.lang.String str = android.os.Build.TAGS;
        if ((str == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "test-keys", false, 2, (java.lang.Object) null)) && !getHighSpeedVideoSizes()) {
            z = false;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Device compromised check complete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isCompromised", java.lang.Boolean.valueOf(z))), null, 4, null);
        return z;
    }
}
