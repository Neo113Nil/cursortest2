package androidx.camera.featurecombinationquery;

/* loaded from: classes6.dex */
public class CameraDeviceSetupCompatFactory {
    private androidx.camera.featurecombinationquery.CameraDeviceSetupCompatProvider getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private androidx.camera.featurecombinationquery.CameraDeviceSetupCompatProvider getHighSpeedVideoSizes;

    public CameraDeviceSetupCompatFactory(android.content.Context context) {
        this.getHighSpeedVideoFpsRanges = context;
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.featurecombinationquery.Camera2CameraDeviceSetupCompatProvider(context);
        }
        this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRangesFor();
    }

    public androidx.camera.featurecombinationquery.CameraDeviceSetupCompat getCameraDeviceSetupCompat(java.lang.String str) throws android.hardware.camera2.CameraAccessException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.camera.featurecombinationquery.CameraDeviceSetupCompatProvider cameraDeviceSetupCompatProvider = this.getHighSpeedVideoSizes;
        if (cameraDeviceSetupCompatProvider != null) {
            arrayList.add(cameraDeviceSetupCompatProvider.getCameraDeviceSetupCompat(str));
        }
        androidx.camera.featurecombinationquery.CameraDeviceSetupCompatProvider cameraDeviceSetupCompatProvider2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (cameraDeviceSetupCompatProvider2 != null) {
            try {
                arrayList.add(cameraDeviceSetupCompatProvider2.getCameraDeviceSetupCompat(str));
            } catch (java.lang.UnsupportedOperationException unused) {
            }
        }
        return new androidx.camera.featurecombinationquery.AggregatedCameraDeviceSetupCompat(arrayList);
    }

    private androidx.camera.featurecombinationquery.CameraDeviceSetupCompatProvider getHighSpeedVideoFpsRangesFor() throws java.lang.IllegalStateException {
        java.lang.String string;
        try {
            android.content.pm.PackageInfo packageInfo = this.getHighSpeedVideoFpsRanges.getPackageManager().getPackageInfo(this.getHighSpeedVideoFpsRanges.getPackageName(), 132);
            if (packageInfo.services == null) {
                return null;
            }
            java.lang.String str = null;
            for (android.content.pm.ServiceInfo serviceInfo : packageInfo.services) {
                if (serviceInfo.metaData != null && (string = serviceInfo.metaData.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                    if (str != null) {
                        throw new java.lang.IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                    }
                    str = string;
                }
            }
            if (str == null) {
                return null;
            }
            return Camera2StreamConfigurationMap(str);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private androidx.camera.featurecombinationquery.CameraDeviceSetupCompatProvider Camera2StreamConfigurationMap(java.lang.String str) {
        try {
            return (androidx.camera.featurecombinationquery.CameraDeviceSetupCompatProvider) java.lang.Class.forName(str).getConstructor(android.content.Context.class).newInstance(this.getHighSpeedVideoFpsRanges);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
        }
    }
}
