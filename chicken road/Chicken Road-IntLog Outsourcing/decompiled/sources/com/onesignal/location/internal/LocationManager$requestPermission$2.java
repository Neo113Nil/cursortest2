package com.onesignal.location.internal;

import D4.InterfaceC0022w;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.capture.ILocationCapturer;
import com.onesignal.location.internal.common.LocationConstants;
import com.onesignal.location.internal.permissions.LocationPermissionController;
import e5.g;
import f4.v;
import g4.AbstractC0466k;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.q;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.location.internal.LocationManager$requestPermission$2", f = "LocationManager.kt", l = {110, 151, 156, 159}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LocationManager$requestPermission$2 extends h implements InterfaceC1445p {
    final /* synthetic */ q $result;
    Object L$0;
    int label;
    final /* synthetic */ LocationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationManager$requestPermission$2(LocationManager locationManager, q qVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = locationManager;
        this.$result = qVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new LocationManager$requestPermission$2(this.this$0, this.$result, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((LocationManager$requestPermission$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IApplicationService iApplicationService;
        boolean z;
        Object startGetLocation;
        Object backgroundLocationPermissionLogic;
        q qVar;
        IApplicationService iApplicationService2;
        q qVar2;
        LocationPermissionController locationPermissionController;
        Object prompt;
        q qVar3;
        Object startGetLocation2;
        IApplicationService iApplicationService3;
        IApplicationService iApplicationService4;
        ILocationCapturer iLocationCapturer;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            String str = null;
            if (!this.this$0.isShared()) {
                Logging.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", null, 2, null);
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            iApplicationService = this.this$0._applicationService;
            boolean hasPermission = androidUtils.hasPermission(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING, true, iApplicationService);
            boolean z5 = false;
            if (hasPermission) {
                z = false;
            } else {
                iApplicationService4 = this.this$0._applicationService;
                z = androidUtils.hasPermission(LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING, true, iApplicationService4);
                iLocationCapturer = this.this$0._capturer;
                iLocationCapturer.setLocationCoarse(true);
            }
            int androidSDKInt = androidUtils.getAndroidSDKInt();
            if (androidSDKInt >= 29) {
                iApplicationService3 = this.this$0._applicationService;
                z5 = androidUtils.hasPermission(LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING, true, iApplicationService3);
            }
            if (androidSDKInt < 23) {
                if (!hasPermission && !z) {
                    Logging.info$default("Location permissions not added on AndroidManifest file < M", null, 2, null);
                    return Boolean.FALSE;
                }
                LocationManager locationManager = this.this$0;
                this.label = 1;
                startGetLocation2 = locationManager.startGetLocation(this);
                if (startGetLocation2 == enumC1260a) {
                    return enumC1260a;
                }
                this.$result.f10739a = true;
            } else if (!hasPermission) {
                List<String> A02 = AbstractC0466k.A0(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING, LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING, LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING);
                iApplicationService2 = this.this$0._applicationService;
                List<String> filterManifestPermissions = androidUtils.filterManifestPermissions(A02, iApplicationService2);
                if (filterManifestPermissions.contains(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING)) {
                    str = LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING;
                } else if (!filterManifestPermissions.contains(LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING)) {
                    Logging.info$default("Location permissions not added on AndroidManifest file >= M", null, 2, null);
                } else if (!z) {
                    str = LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING;
                } else if (androidSDKInt >= 29 && filterManifestPermissions.contains(LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING)) {
                    str = LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING;
                }
                qVar2 = this.$result;
                if (str != null) {
                    locationPermissionController = this.this$0._locationPermissionController;
                    this.L$0 = qVar2;
                    this.label = 2;
                    prompt = locationPermissionController.prompt(true, str, this);
                    if (prompt == enumC1260a) {
                        return enumC1260a;
                    }
                    qVar3 = qVar2;
                    z = ((Boolean) prompt).booleanValue();
                    qVar2 = qVar3;
                }
                qVar2.f10739a = z;
            } else if (androidSDKInt < 29 || z5) {
                this.$result.f10739a = true;
                LocationManager locationManager2 = this.this$0;
                this.label = 4;
                startGetLocation = locationManager2.startGetLocation(this);
                if (startGetLocation == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                q qVar4 = this.$result;
                LocationManager locationManager3 = this.this$0;
                this.L$0 = qVar4;
                this.label = 3;
                backgroundLocationPermissionLogic = locationManager3.backgroundLocationPermissionLogic(true, this);
                if (backgroundLocationPermissionLogic == enumC1260a) {
                    return enumC1260a;
                }
                qVar = qVar4;
                qVar.f10739a = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
            }
        } else if (i2 == 1) {
            g.y(obj);
            this.$result.f10739a = true;
        } else if (i2 == 2) {
            qVar3 = (q) this.L$0;
            g.y(obj);
            prompt = obj;
            z = ((Boolean) prompt).booleanValue();
            qVar2 = qVar3;
            qVar2.f10739a = z;
        } else if (i2 == 3) {
            qVar = (q) this.L$0;
            g.y(obj);
            backgroundLocationPermissionLogic = obj;
            qVar.f10739a = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return v.f5689a;
    }
}
