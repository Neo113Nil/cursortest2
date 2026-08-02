package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0003J\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/LocationPermissionViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Landroid/content/Context;", "context", "", "checkAndUpdatePermissionStatus", "(Landroid/content/Context;)Z", "", "onLocationPermissionGranted", "onLocationPermissionDenied", "openAppSettings", "(Landroid/content/Context;)V", "openLocationSettings", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/LocationPermissionState;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "permissionState", "Lkotlinx/coroutines/flow/StateFlow;", "getPermissionState", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "locationEnabledState", "getLocationEnabledState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocationPermissionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> locationEnabledState;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState> permissionState;

    @javax.inject.Inject
    public LocationPermissionViewModel() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.NOT_REQUESTED);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.permissionState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.Camera2StreamConfigurationMap = MutableStateFlow2;
        this.locationEnabledState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState> getPermissionState() {
        return this.permissionState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getLocationEnabledState() {
        return this.locationEnabledState;
    }

    public final boolean checkAndUpdatePermissionStatus(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        boolean z = androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || (androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0);
        java.lang.Object systemService = context.getSystemService("location");
        android.location.LocationManager locationManager = systemService instanceof android.location.LocationManager ? (android.location.LocationManager) systemService : null;
        boolean isLocationEnabled = locationManager != null ? androidx.core.location.LocationManagerCompat.isLocationEnabled(locationManager) : false;
        if (z) {
            this.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.GRANTED);
        } else if (this.getHighSpeedVideoFpsRanges.getValue() != com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.DENIED) {
            this.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.NOT_REQUESTED);
        }
        this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(isLocationEnabled));
        return (z && isLocationEnabled) ? false : true;
    }

    public final void onLocationPermissionGranted() {
        this.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.GRANTED);
    }

    public final void onLocationPermissionDenied() {
        this.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.DENIED);
    }

    public final void openAppSettings(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(android.net.Uri.fromParts("package", context.getPackageName(), null));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final void openLocationSettings(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
