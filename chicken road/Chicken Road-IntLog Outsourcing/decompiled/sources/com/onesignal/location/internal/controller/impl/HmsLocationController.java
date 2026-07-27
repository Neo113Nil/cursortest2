package com.onesignal.location.internal.controller.impl;

import D4.AbstractC0024y;
import D4.E;
import K4.c;
import L4.d;
import L4.e;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.common.LocationConstants;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.controller.ILocationUpdatedHandler;
import e5.g;
import f4.v;
import java.io.Closeable;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class HmsLocationController implements ILocationController {
    private final IApplicationService _applicationService;
    private final EventProducer<ILocationUpdatedHandler> event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final LocationHandlerThread locationHandlerThread;
    private LocationUpdateListener locationUpdateListener;
    private final L4.a startStopMutex;

    public static final class LocationHandlerThread extends HandlerThread {
        private Handler mHandler;

        public LocationHandlerThread() {
            super("OSH_LocationHandlerThread");
            start();
            this.mHandler = new Handler(getLooper());
        }

        public final Handler getMHandler() {
            return this.mHandler;
        }

        public final void setMHandler(Handler handler) {
            i.e(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class LocationUpdateListener extends LocationCallback implements IApplicationLifecycleHandler, Closeable {
        private final IApplicationService _applicationService;
        private final HmsLocationController _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public LocationUpdateListener(HmsLocationController _parent, IApplicationService _applicationService, FusedLocationProviderClient huaweiFusedLocationProviderClient) {
            i.e(_parent, "_parent");
            i.e(_applicationService, "_applicationService");
            i.e(huaweiFusedLocationProviderClient, "huaweiFusedLocationProviderClient");
            this._parent = _parent;
            this._applicationService = _applicationService;
            this.huaweiFusedLocationProviderClient = huaweiFusedLocationProviderClient;
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
            long j2 = this._applicationService.isInForeground() ? LocationConstants.FOREGROUND_UPDATE_TIME_MS : LocationConstants.BACKGROUND_UPDATE_TIME_MS;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j2).setInterval(j2).setMaxWaitTime((long) (j2 * 1.5d)).setPriority(102);
            Logging.debug$default("HMSLocationController Huawei LocationServices requestLocationUpdates!", null, 2, null);
            this.huaweiFusedLocationProviderClient.requestLocationUpdates(priority, this, this._parent.locationHandlerThread.getLooper());
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onFocus(boolean z) {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(LocationResult locationResult) {
            i.e(locationResult, "locationResult");
            Logging.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
        public void onUnfocused() {
            Logging.log(LogLevel.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    public HmsLocationController(IApplicationService _applicationService) {
        i.e(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
        this.locationHandlerThread = new LocationHandlerThread();
        this.startStopMutex = e.a();
        this.event = new EventProducer<>();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // com.onesignal.location.internal.controller.ILocationController
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        s sVar = new s();
        ThreadUtilsKt.suspendifyOnIO(new HmsLocationController$getLastLocation$1(fusedLocationProviderClient, sVar, null));
        return (Location) sVar.f10741a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(InterfaceC1218d interfaceC1218d) {
        HmsLocationController$start$1 hmsLocationController$start$1;
        int i2;
        q qVar;
        if (interfaceC1218d instanceof HmsLocationController$start$1) {
            hmsLocationController$start$1 = (HmsLocationController$start$1) interfaceC1218d;
            int i3 = hmsLocationController$start$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hmsLocationController$start$1.label = i3 - Integer.MIN_VALUE;
                Object obj = hmsLocationController$start$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = hmsLocationController$start$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    s sVar = new s();
                    sVar.f10741a = this;
                    q qVar2 = new q();
                    c cVar = E.f461c;
                    HmsLocationController$start$2 hmsLocationController$start$2 = new HmsLocationController$start$2(this, qVar2, sVar, null);
                    hmsLocationController$start$1.L$0 = qVar2;
                    hmsLocationController$start$1.label = 1;
                    if (AbstractC0024y.w(cVar, hmsLocationController$start$2, hmsLocationController$start$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    qVar = qVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) hmsLocationController$start$1.L$0;
                    g.y(obj);
                }
                return Boolean.valueOf(qVar.f10739a);
            }
        }
        hmsLocationController$start$1 = new HmsLocationController$start$1(this, interfaceC1218d);
        Object obj2 = hmsLocationController$start$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = hmsLocationController$start$1.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(qVar.f10739a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.location.internal.controller.ILocationController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(InterfaceC1218d interfaceC1218d) {
        HmsLocationController$stop$1 hmsLocationController$stop$1;
        int i2;
        HmsLocationController hmsLocationController;
        L4.a aVar;
        LocationUpdateListener locationUpdateListener;
        try {
            if (interfaceC1218d instanceof HmsLocationController$stop$1) {
                hmsLocationController$stop$1 = (HmsLocationController$stop$1) interfaceC1218d;
                int i3 = hmsLocationController$stop$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hmsLocationController$stop$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = hmsLocationController$stop$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = hmsLocationController$stop$1.label;
                    if (i2 != 0) {
                        g.y(obj);
                        L4.a aVar2 = this.startStopMutex;
                        hmsLocationController$stop$1.L$0 = this;
                        hmsLocationController$stop$1.L$1 = aVar2;
                        hmsLocationController$stop$1.label = 1;
                        d dVar = (d) aVar2;
                        if (dVar.c(hmsLocationController$stop$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        hmsLocationController = this;
                        aVar = dVar;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (L4.a) hmsLocationController$stop$1.L$1;
                        hmsLocationController = (HmsLocationController) hmsLocationController$stop$1.L$0;
                        g.y(obj);
                    }
                    locationUpdateListener = hmsLocationController.locationUpdateListener;
                    if (locationUpdateListener != null) {
                        locationUpdateListener.close();
                        hmsLocationController.locationUpdateListener = null;
                    }
                    if (hmsLocationController.hmsFusedLocationClient != null) {
                        hmsLocationController.hmsFusedLocationClient = null;
                    }
                    hmsLocationController.lastLocation = null;
                    ((d) aVar).e(null);
                    return v.f5689a;
                }
            }
            locationUpdateListener = hmsLocationController.locationUpdateListener;
            if (locationUpdateListener != null) {
            }
            if (hmsLocationController.hmsFusedLocationClient != null) {
            }
            hmsLocationController.lastLocation = null;
            ((d) aVar).e(null);
            return v.f5689a;
        } catch (Throwable th) {
            ((d) aVar).e(null);
            throw th;
        }
        hmsLocationController$stop$1 = new HmsLocationController$stop$1(this, interfaceC1218d);
        Object obj2 = hmsLocationController$stop$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = hmsLocationController$stop$1.label;
        if (i2 != 0) {
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ILocationUpdatedHandler handler) {
        i.e(handler, "handler");
        this.event.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ILocationUpdatedHandler handler) {
        i.e(handler, "handler");
        this.event.unsubscribe(handler);
    }
}
