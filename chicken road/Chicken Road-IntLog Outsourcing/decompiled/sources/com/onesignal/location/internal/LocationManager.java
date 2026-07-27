package com.onesignal.location.internal;

import D4.AbstractC0024y;
import E4.e;
import I4.o;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.ILocationManager;
import com.onesignal.location.internal.capture.ILocationCapturer;
import com.onesignal.location.internal.common.LocationConstants;
import com.onesignal.location.internal.common.LocationUtils;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.permissions.ILocationPermissionChangedHandler;
import com.onesignal.location.internal.permissions.LocationPermissionController;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class LocationManager implements ILocationManager, IStartableService, ILocationPermissionChangedHandler {
    private final IApplicationService _applicationService;
    private final ILocationCapturer _capturer;
    private boolean _isShared;
    private final ILocationController _locationController;
    private final LocationPermissionController _locationPermissionController;
    private final IPreferencesService _prefs;

    public LocationManager(IApplicationService _applicationService, ILocationCapturer _capturer, ILocationController _locationController, LocationPermissionController _locationPermissionController, IPreferencesService _prefs) {
        i.e(_applicationService, "_applicationService");
        i.e(_capturer, "_capturer");
        i.e(_locationController, "_locationController");
        i.e(_locationPermissionController, "_locationPermissionController");
        i.e(_prefs, "_prefs");
        this._applicationService = _applicationService;
        this._capturer = _capturer;
        this._locationController = _locationController;
        this._locationPermissionController = _locationPermissionController;
        this._prefs = _prefs;
        Boolean bool = _prefs.getBool("OneSignal", PreferenceOneSignalKeys.PREFS_OS_LOCATION_SHARED, Boolean.FALSE);
        i.b(bool);
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z, InterfaceC1218d interfaceC1218d) {
        return AndroidUtils.INSTANCE.hasPermission(LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING, false, this._applicationService) ? this._locationPermissionController.prompt(z, LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING, interfaceC1218d) : Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:17|18))(2:19|(1:21)(3:22|23|(1:25)))|11|(1:13)|15))|28|6|7|(0)(0)|11|(0)|15) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        com.onesignal.debug.internal.logging.Logging.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:10:0x0027, B:11:0x004f, B:13:0x0057, B:23:0x0044), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startGetLocation(InterfaceC1218d interfaceC1218d) {
        LocationManager$startGetLocation$1 locationManager$startGetLocation$1;
        Object obj;
        int i2;
        if (interfaceC1218d instanceof LocationManager$startGetLocation$1) {
            locationManager$startGetLocation$1 = (LocationManager$startGetLocation$1) interfaceC1218d;
            int i3 = locationManager$startGetLocation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                locationManager$startGetLocation$1.label = i3 - Integer.MIN_VALUE;
                obj = locationManager$startGetLocation$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = locationManager$startGetLocation$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    if (!isShared()) {
                        return vVar;
                    }
                    Logging.debug$default("LocationManager.startGetLocation()", null, 2, null);
                    ILocationController iLocationController = this._locationController;
                    locationManager$startGetLocation$1.label = 1;
                    obj = iLocationController.start(locationManager$startGetLocation$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    Logging.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
                }
                return vVar;
            }
        }
        locationManager$startGetLocation$1 = new LocationManager$startGetLocation$1(this, interfaceC1218d);
        obj = locationManager$startGetLocation$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = locationManager$startGetLocation$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return vVar2;
    }

    @Override // com.onesignal.location.ILocationManager
    public boolean isShared() {
        return this._isShared;
    }

    @Override // com.onesignal.location.internal.permissions.ILocationPermissionChangedHandler
    public void onLocationPermissionChanged(boolean z) {
        if (z) {
            ThreadUtilsKt.suspendifyOnIO(new LocationManager$onLocationPermissionChanged$1(this, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.location.ILocationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPermission(InterfaceC1218d interfaceC1218d) {
        LocationManager$requestPermission$1 locationManager$requestPermission$1;
        int i2;
        q qVar;
        if (interfaceC1218d instanceof LocationManager$requestPermission$1) {
            locationManager$requestPermission$1 = (LocationManager$requestPermission$1) interfaceC1218d;
            int i3 = locationManager$requestPermission$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                locationManager$requestPermission$1.label = i3 - Integer.MIN_VALUE;
                Object obj = locationManager$requestPermission$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = locationManager$requestPermission$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    Logging.log(LogLevel.DEBUG, "LocationManager.requestPermission()");
                    q qVar2 = new q();
                    e eVar = o.f1316a;
                    LocationManager$requestPermission$2 locationManager$requestPermission$2 = new LocationManager$requestPermission$2(this, qVar2, null);
                    locationManager$requestPermission$1.L$0 = qVar2;
                    locationManager$requestPermission$1.label = 1;
                    if (AbstractC0024y.w(eVar, locationManager$requestPermission$2, locationManager$requestPermission$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    qVar = qVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) locationManager$requestPermission$1.L$0;
                    g.y(obj);
                }
                return Boolean.valueOf(qVar.f10739a);
            }
        }
        locationManager$requestPermission$1 = new LocationManager$requestPermission$1(this, interfaceC1218d);
        Object obj2 = locationManager$requestPermission$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = locationManager$requestPermission$1.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(qVar.f10739a);
    }

    @Override // com.onesignal.location.ILocationManager
    public void setShared(boolean z) {
        Logging.debug$default("LocationManager.setIsShared(value: " + z + ')', null, 2, null);
        this._prefs.saveBool("OneSignal", PreferenceOneSignalKeys.PREFS_OS_LOCATION_SHARED, Boolean.valueOf(z));
        this._isShared = z;
        onLocationPermissionChanged(z);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._locationPermissionController.subscribe((ILocationPermissionChangedHandler) this);
        if (LocationUtils.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            ThreadUtilsKt.suspendifyOnIO(new LocationManager$start$1(this, null));
        }
    }
}
