package com.paypal.android.threeds.transaction.devicedata;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/android/threeds/transaction/devicedata/PackageManagerData;", "Lcom/paypal/android/threeds/interfaces/DeviceDataFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "", "deviceData", "deviceParamNotAvailable", "", "updateDeviceData", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PackageManagerData implements com.paypal.android.threeds.interfaces.DeviceDataFactory {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.transaction.devicedata.PackageManagerData INSTANCE = new com.paypal.android.threeds.transaction.devicedata.PackageManagerData();

    private PackageManagerData() {
    }

    @Override // com.paypal.android.threeds.interfaces.DeviceDataFactory
    public final void updateDeviceData(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        java.util.List<android.content.pm.ApplicationInfo> installedApplications;
        java.lang.String installerPackageName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.PACKAGE_IS_SAFE_MODE.getCode(), java.lang.String.valueOf(packageManager.isSafeMode()));
        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.PACKAGE_SYSTEM_AVAILABLE_FEATURES.getCode(), java.lang.String.valueOf(packageManager.getSystemAvailableFeatures().length));
        java.lang.String[] systemSharedLibraryNames = packageManager.getSystemSharedLibraryNames();
        if (systemSharedLibraryNames == null || systemSharedLibraryNames.length == 0) {
            java.lang.String code = com.paypal.android.threeds.data.model.DeviceDataParam.PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES.getCode();
            java.lang.String[] systemSharedLibraryNames2 = packageManager.getSystemSharedLibraryNames();
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemSharedLibraryNames2);
            deviceData.put(code, java.lang.Integer.valueOf(systemSharedLibraryNames2.length));
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(packageManager);
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 33) {
            android.content.pm.PackageManager.ApplicationInfoFlags of = android.content.pm.PackageManager.ApplicationInfoFlags.of(8192L);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "");
            installedApplications = packageManager.getInstalledApplications(of);
        } else {
            installedApplications = packageManager.getInstalledApplications(128);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(installedApplications);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (android.content.pm.ApplicationInfo applicationInfo : installedApplications) {
            java.lang.String str = applicationInfo.packageName;
            kotlin.jvm.internal.Intrinsics.checkNotNull(applicationInfo);
            if ((applicationInfo.flags & 1) == 0) {
                arrayList2.add(str);
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 30) {
                    installerPackageName = context.getPackageManager().getInstallSourceInfo(str).getInstallingPackageName();
                } else {
                    installerPackageName = context.getPackageManager().getInstallerPackageName(str);
                }
                if (installerPackageName != null && !arrayList.contains(installerPackageName)) {
                    arrayList.add(installerPackageName);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.PACKAGE_GET_INSTALLED_APPS.getCode(), arrayList2.toArray());
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.PACKAGE_GET_INSTALLED_APPS.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
        }
        if (!arrayList.isEmpty()) {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.PACKAGE_INSTALLER_PACKAGE_NAME.getCode(), arrayList.toString());
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.PACKAGE_INSTALLER_PACKAGE_NAME.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
        }
    }
}
