package com.onesignal.location.internal.background;

import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.ILocationManager;
import com.onesignal.location.internal.capture.ILocationCapturer;
import com.onesignal.location.internal.common.LocationUtils;
import com.onesignal.location.internal.preferences.ILocationPreferencesService;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class LocationBackgroundService implements IBackgroundService {
    private final IApplicationService _applicationService;
    private final ILocationCapturer _capturer;
    private final ILocationManager _locationManager;
    private final ILocationPreferencesService _prefs;
    private final ITime _time;

    public LocationBackgroundService(IApplicationService _applicationService, ILocationManager _locationManager, ILocationPreferencesService _prefs, ILocationCapturer _capturer, ITime _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_locationManager, "_locationManager");
        i.e(_prefs, "_prefs");
        i.e(_capturer, "_capturer");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._locationManager = _locationManager;
        this._prefs = _prefs;
        this._capturer = _capturer;
        this._time = _time;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundService
    public Object backgroundRun(InterfaceC1218d interfaceC1218d) {
        this._capturer.captureLastLocation();
        return v.f5689a;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundService
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            Logging.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (LocationUtils.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        Logging.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
