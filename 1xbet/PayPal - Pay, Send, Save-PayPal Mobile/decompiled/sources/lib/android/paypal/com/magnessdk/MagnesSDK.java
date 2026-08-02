package lib.android.paypal.com.magnessdk;

import lib.android.paypal.com.magnessdk.n.b;

/* loaded from: classes5.dex */
public final class MagnesSDK {
    private static lib.android.paypal.com.magnessdk.MagnesSDK getHighResolutionOutputSizeshNQ4ISI;
    lib.android.paypal.com.magnessdk.MagnesSettings Camera2StreamConfigurationMap;

    /* renamed from: a, reason: collision with root package name */
    public lib.android.paypal.com.magnessdk.e f6930a;
    private android.os.Handler getHighSpeedVideoFpsRanges;
    private android.os.HandlerThread getHighSpeedVideoFpsRangesFor;
    private org.json.JSONObject getHighSpeedVideoSizes;
    private lib.android.paypal.com.magnessdk.d getInputFormats;
    private lib.android.paypal.com.magnessdk.k getInputSizeshNQ4ISI = lib.android.paypal.com.magnessdk.k.b();
    private lib.android.paypal.com.magnessdk.i getOutputFormats = lib.android.paypal.com.magnessdk.i.getHighSpeedVideoFpsRanges();
    private lib.android.paypal.com.magnessdk.h getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private lib.android.paypal.com.magnessdk.MagnesResult getHighSpeedVideoFpsRangesFor(android.content.Context context, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap, boolean z) throws lib.android.paypal.com.magnessdk.InvalidInputException {
        org.json.JSONException e;
        java.lang.String str2;
        lib.android.paypal.com.magnessdk.i iVar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("COLLECT method called with paypalClientMetaDataId : ");
        sb.append(str);
        sb.append(" , Is pass in additionalData null? : ");
        sb.append(java.lang.Boolean.toString(hashMap == null));
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.MagnesSDK.class, 0, sb.toString());
        if (str != null && str.length() > 32) {
            throw new lib.android.paypal.com.magnessdk.InvalidInputException(lib.android.paypal.com.magnessdk.c.b.f.CMID_EXCEPTION_MESSAGE.toString());
        }
        if (this.Camera2StreamConfigurationMap == null && context != null) {
            getHighSpeedVideoFpsRanges(context);
        }
        if (this.f6930a.n()) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.MagnesSDK.class, 0, "nc presents, collecting coreData.");
            Camera2StreamConfigurationMap();
            this.f6930a.a(false);
        }
        org.json.JSONObject highSpeedVideoSizes = this.getOutputMinFrameDuration.getHighSpeedVideoSizes(new lib.android.paypal.com.magnessdk.j().getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, this.getInputFormats, this.f6930a, this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI, str, hashMap, this.getHighSpeedVideoFpsRanges));
        org.json.JSONObject jSONObject = null;
        try {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.MagnesSDK.class, 0, highSpeedVideoSizes);
            str2 = highSpeedVideoSizes.optString(lib.android.paypal.com.magnessdk.c.b.f6933a);
            try {
                jSONObject = highSpeedVideoSizes.optJSONObject(lib.android.paypal.com.magnessdk.c.e.SR.toString());
            } catch (org.json.JSONException e2) {
                e = e2;
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.MagnesSDK.class, 3, e);
                if (z) {
                    iVar = this.getOutputFormats;
                    if (iVar instanceof lib.android.paypal.com.magnessdk.q) {
                    }
                }
                lib.android.paypal.com.magnessdk.MagnesResult magnesResult = new lib.android.paypal.com.magnessdk.MagnesResult();
                magnesResult.getHighSpeedVideoFpsRangesFor = highSpeedVideoSizes;
                magnesResult.Camera2StreamConfigurationMap = str2;
                return magnesResult;
            }
        } catch (org.json.JSONException e3) {
            e = e3;
            str2 = null;
        }
        if (z && str2 != null && !str2.isEmpty() && jSONObject != null) {
            iVar = this.getOutputFormats;
            if (iVar instanceof lib.android.paypal.com.magnessdk.q) {
                iVar.getHighSpeedVideoFpsRanges(str2, jSONObject);
            }
        }
        lib.android.paypal.com.magnessdk.MagnesResult magnesResult2 = new lib.android.paypal.com.magnessdk.MagnesResult();
        magnesResult2.getHighSpeedVideoFpsRangesFor = highSpeedVideoSizes;
        magnesResult2.Camera2StreamConfigurationMap = str2;
        return magnesResult2;
    }

    public final lib.android.paypal.com.magnessdk.MagnesResult collect(android.content.Context context) {
        try {
            return getHighSpeedVideoFpsRangesFor(context, null, null, false);
        } catch (lib.android.paypal.com.magnessdk.InvalidInputException unused) {
            return null;
        }
    }

    public final lib.android.paypal.com.magnessdk.MagnesResult collectAndSubmit(android.content.Context context) {
        try {
            return collectAndSubmit(context, null, null);
        } catch (lib.android.paypal.com.magnessdk.InvalidInputException unused) {
            return null;
        }
    }

    private void Camera2StreamConfigurationMap() {
        lib.android.paypal.com.magnessdk.h hVar = new lib.android.paypal.com.magnessdk.h();
        this.getOutputMinFrameDuration = hVar;
        this.getHighSpeedVideoSizes = hVar.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, this.getInputFormats, this.f6930a);
    }

    public final lib.android.paypal.com.magnessdk.MagnesResult collect(android.content.Context context, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) throws lib.android.paypal.com.magnessdk.InvalidInputException {
        return getHighSpeedVideoFpsRangesFor(context, str, hashMap, false);
    }

    public final lib.android.paypal.com.magnessdk.MagnesResult collectAndSubmit(android.content.Context context, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) throws lib.android.paypal.com.magnessdk.InvalidInputException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SUBMIT method called with paypalClientMetaDataId : ");
        sb.append(str);
        sb.append(" , Is pass in additionalData null? : ");
        sb.append(java.lang.Boolean.toString(hashMap == null));
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.MagnesSDK.class, 0, sb.toString());
        if (str != null && str.length() > 32) {
            throw new lib.android.paypal.com.magnessdk.InvalidInputException(lib.android.paypal.com.magnessdk.c.b.f.CMID_EXCEPTION_MESSAGE.toString());
        }
        lib.android.paypal.com.magnessdk.MagnesResult highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context, str, hashMap, true);
        org.json.JSONObject deviceInfo = highSpeedVideoFpsRangesFor.getDeviceInfo();
        if (deviceInfo != null && deviceInfo.length() > 0) {
            try {
                deviceInfo = new org.json.JSONObject(deviceInfo.toString());
            } catch (org.json.JSONException unused) {
            }
            new lib.android.paypal.com.magnessdk.network.c(lib.android.paypal.com.magnessdk.c.h.e.DEVICE_INFO_URL, deviceInfo, false, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, lib.android.paypal.com.magnessdk.c.b.d.MAIN).c();
            if (!this.Camera2StreamConfigurationMap.isDisableBeacon() && this.Camera2StreamConfigurationMap.getEnvironment() == lib.android.paypal.com.magnessdk.Environment.LIVE) {
                new lib.android.paypal.com.magnessdk.network.b(lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_BEACON_URL, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, deviceInfo, null).c();
            }
        }
        lib.android.paypal.com.magnessdk.i iVar = this.getOutputFormats;
        if (iVar instanceof lib.android.paypal.com.magnessdk.q) {
            iVar.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor.getPaypalClientMetaDataId());
        }
        return highSpeedVideoFpsRangesFor;
    }

    private void getHighSpeedVideoFpsRanges(android.content.Context context) {
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.MagnesSDK.class, 2, "No MagnesSettings specified, using platform default.");
        if (!(context instanceof android.app.Application)) {
            context = context.getApplicationContext();
        }
        lib.android.paypal.com.magnessdk.MagnesSettings build = new lib.android.paypal.com.magnessdk.MagnesSettings.Builder(context).build();
        this.Camera2StreamConfigurationMap = build;
        setUp(build);
    }

    public final lib.android.paypal.com.magnessdk.MagnesSettings setUp(lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings) {
        this.Camera2StreamConfigurationMap = magnesSettings;
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("MagnesHandlerThread");
            this.getHighSpeedVideoFpsRangesFor = handlerThread;
            handlerThread.start();
            this.getHighSpeedVideoFpsRanges = lib.android.paypal.com.magnessdk.network.base.e.a(this.getHighSpeedVideoFpsRangesFor.getLooper(), this);
        }
        this.f6930a = new lib.android.paypal.com.magnessdk.e(magnesSettings, this.getHighSpeedVideoFpsRanges);
        lib.android.paypal.com.magnessdk.d dVar = new lib.android.paypal.com.magnessdk.d(magnesSettings, this.getHighSpeedVideoFpsRanges);
        this.getInputFormats = dVar;
        lib.android.paypal.com.magnessdk.k kVar = this.getInputSizeshNQ4ISI;
        android.os.Handler handler = this.getHighSpeedVideoFpsRanges;
        lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings2 = this.Camera2StreamConfigurationMap;
        kVar.getHighSpeedVideoFpsRangesFor = handler;
        kVar.getHighResolutionOutputSizeshNQ4ISI = dVar;
        kVar.Camera2StreamConfigurationMap = magnesSettings2;
        lib.android.paypal.com.magnessdk.i iVar = this.getOutputFormats;
        lib.android.paypal.com.magnessdk.d dVar2 = this.getInputFormats;
        lib.android.paypal.com.magnessdk.e eVar = this.f6930a;
        android.os.Handler handler2 = this.getHighSpeedVideoFpsRanges;
        lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings3 = this.Camera2StreamConfigurationMap;
        iVar.getHighSpeedVideoSizes = dVar2;
        iVar.getHighResolutionOutputSizeshNQ4ISI = handler2;
        iVar.getHighSpeedVideoFpsRangesFor = magnesSettings3;
        iVar.getHighSpeedVideoFpsRanges = eVar;
        lib.android.paypal.com.magnessdk.l lVar = iVar.getHighSpeedVideoSizesFor;
        lVar.getOutputFormats = handler2;
        lVar.getOutputMinFrameDuration = eVar;
        lVar.getHighSpeedVideoSizesFor = magnesSettings3;
        lVar.getInputFormats = dVar2;
        lib.android.paypal.com.magnessdk.m mVar = iVar.Camera2StreamConfigurationMap;
        lib.android.paypal.com.magnessdk.d dVar3 = iVar.getHighSpeedVideoSizes;
        lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings4 = iVar.getHighSpeedVideoFpsRangesFor;
        android.os.Handler handler3 = iVar.getHighResolutionOutputSizeshNQ4ISI;
        mVar.getHighSpeedVideoFpsRangesFor = dVar3;
        mVar.getInputSizeshNQ4ISI = magnesSettings4;
        mVar.getInputFormats = handler3;
        lib.android.paypal.com.magnessdk.n nVar = iVar.getOutputFormats;
        lib.android.paypal.com.magnessdk.d dVar4 = iVar.getHighSpeedVideoSizes;
        lib.android.paypal.com.magnessdk.e eVar2 = iVar.getHighSpeedVideoFpsRanges;
        lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings5 = iVar.getHighSpeedVideoFpsRangesFor;
        android.os.Handler handler4 = iVar.getHighResolutionOutputSizeshNQ4ISI;
        nVar.getHighResolutionOutputSizeshNQ4ISI = dVar4;
        nVar.getInputFormats = magnesSettings5;
        nVar.getOutputMinFrameDuration = handler4;
        nVar.getHighSpeedVideoFpsRangesFor = eVar2;
        nVar.getOutputSizes = lib.android.paypal.com.magnessdk.p.getHighSpeedVideoFpsRanges();
        try {
            android.os.Looper myLooper = android.os.Looper.myLooper();
            if (myLooper != null) {
                nVar.getInputSizeshNQ4ISI = nVar.new b(myLooper);
            }
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a(nVar.getClass(), 3, e);
        }
        lib.android.paypal.com.magnessdk.p pVar = nVar.getOutputSizes;
        java.util.concurrent.ArrayBlockingQueue<android.view.MotionEvent> arrayBlockingQueue = nVar.getHighSpeedVideoSizesFor;
        android.os.Handler handler5 = nVar.getInputSizeshNQ4ISI;
        pVar.getHighSpeedVideoFpsRangesFor = arrayBlockingQueue;
        pVar.getHighSpeedVideoFpsRanges = new java.lang.ref.WeakReference<>(handler5);
        a.c.a(magnesSettings5.getContext(), a.b.d);
        if (this.getOutputMinFrameDuration == null) {
            Camera2StreamConfigurationMap();
        }
        lib.android.paypal.com.magnessdk.network.base.f.a().a(magnesSettings.getContext());
        return magnesSettings;
    }

    public final void unregisterTouchCollection(android.app.Activity activity) {
        if (activity != null) {
            lib.android.paypal.com.magnessdk.i iVar = this.getOutputFormats;
            if (iVar instanceof lib.android.paypal.com.magnessdk.q) {
                iVar.Camera2StreamConfigurationMap(activity);
            }
        }
    }

    public final void setTelemetryFocusChanged(android.content.Context context, android.widget.EditText editText, java.lang.String str, java.lang.String str2, boolean z) {
        if (this.Camera2StreamConfigurationMap == null && context != null) {
            getHighSpeedVideoFpsRanges(context);
        }
        lib.android.paypal.com.magnessdk.i iVar = this.getOutputFormats;
        if (iVar instanceof lib.android.paypal.com.magnessdk.q) {
            iVar.getHighSpeedVideoSizes(str, str2, z);
        }
    }

    public final void registerTouchCollection(android.app.Activity activity) {
        if (activity != null) {
            if (this.Camera2StreamConfigurationMap == null) {
                getHighSpeedVideoFpsRanges(activity);
            }
            lib.android.paypal.com.magnessdk.i iVar = this.getOutputFormats;
            if (iVar instanceof lib.android.paypal.com.magnessdk.q) {
                iVar.getHighSpeedVideoSizes(activity);
            }
        }
    }

    public final void collectTouchData(android.view.MotionEvent motionEvent, android.content.Context context, java.lang.String str) {
        if (context != null) {
            if (this.Camera2StreamConfigurationMap == null) {
                getHighSpeedVideoFpsRanges(context);
            }
            if (context instanceof android.app.Activity) {
                lib.android.paypal.com.magnessdk.i iVar = this.getOutputFormats;
                if (iVar instanceof lib.android.paypal.com.magnessdk.q) {
                    iVar.getHighSpeedVideoFpsRanges(context, motionEvent);
                }
            }
        }
    }

    public final void collectTelemetryData(android.content.Context context, android.widget.EditText editText, java.lang.String str, java.lang.String str2, boolean z) {
        if (this.Camera2StreamConfigurationMap == null && context != null) {
            getHighSpeedVideoFpsRanges(context);
        }
        lib.android.paypal.com.magnessdk.i iVar = this.getOutputFormats;
        if (iVar instanceof lib.android.paypal.com.magnessdk.q) {
            iVar.getHighResolutionOutputSizeshNQ4ISI(editText, str, str2, z);
        }
    }

    public static lib.android.paypal.com.magnessdk.MagnesSDK getInstance() {
        lib.android.paypal.com.magnessdk.MagnesSDK magnesSDK;
        synchronized (lib.android.paypal.com.magnessdk.MagnesSDK.class) {
            if (getHighResolutionOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI = new lib.android.paypal.com.magnessdk.MagnesSDK();
            }
            magnesSDK = getHighResolutionOutputSizeshNQ4ISI;
        }
        return magnesSDK;
    }

    private MagnesSDK() {
    }
}
