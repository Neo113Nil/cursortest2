package lib.android.paypal.com.magnessdk;

import lib.android.paypal.com.magnessdk.l.a;
import lib.android.paypal.com.magnessdk.m.a;
import lib.android.paypal.com.magnessdk.m.b;
import lib.android.paypal.com.magnessdk.n.a;

/* loaded from: classes5.dex */
class i implements lib.android.paypal.com.magnessdk.q {
    private static lib.android.paypal.com.magnessdk.i getInputSizeshNQ4ISI;
    android.os.Handler getHighResolutionOutputSizeshNQ4ISI;
    lib.android.paypal.com.magnessdk.e getHighSpeedVideoFpsRanges;
    lib.android.paypal.com.magnessdk.MagnesSettings getHighSpeedVideoFpsRangesFor;
    lib.android.paypal.com.magnessdk.d getHighSpeedVideoSizes;
    lib.android.paypal.com.magnessdk.m Camera2StreamConfigurationMap = lib.android.paypal.com.magnessdk.m.getHighSpeedVideoSizes();
    lib.android.paypal.com.magnessdk.n getOutputFormats = lib.android.paypal.com.magnessdk.n.getHighSpeedVideoSizes();
    lib.android.paypal.com.magnessdk.l getHighSpeedVideoSizesFor = lib.android.paypal.com.magnessdk.l.getHighSpeedVideoFpsRangesFor();

    @Override // lib.android.paypal.com.magnessdk.q
    public final void getHighSpeedVideoFpsRanges(java.lang.String str, org.json.JSONObject jSONObject) {
        lib.android.paypal.com.magnessdk.l lVar = this.getHighSpeedVideoSizesFor;
        lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings = this.getHighSpeedVideoFpsRangesFor;
        lVar.getInputSizeshNQ4ISI = jSONObject;
        if (lVar.getHighSpeedVideoFpsRanges(lVar.getInputFormats, magnesSettings.getMagnesSource(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges, lib.android.paypal.com.magnessdk.g.n2, magnesSettings.getContext())) {
            lVar.getHighSpeedVideoSizes(96, magnesSettings);
            lVar.getHighSpeedVideoSizes(97, magnesSettings);
            lVar.getHighSpeedVideoSizes(102, magnesSettings);
            if (jSONObject.optBoolean(lib.android.paypal.com.magnessdk.c.l.AC.toString(), false) || jSONObject.optBoolean(lib.android.paypal.com.magnessdk.c.l.GY.toString(), false) || jSONObject.optBoolean(lib.android.paypal.com.magnessdk.c.l.MG.toString(), false)) {
                java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
                newSingleThreadScheduledExecutor.schedule(lVar.new a(lVar.getHighSpeedVideoFpsRangesFor, lVar.Camera2StreamConfigurationMap, lVar.getHighResolutionOutputSizeshNQ4ISI, str), lVar.getOutputMinFrameDuration.j(), java.util.concurrent.TimeUnit.SECONDS);
                newSingleThreadScheduledExecutor.shutdown();
            }
        }
    }

    @Override // lib.android.paypal.com.magnessdk.q
    public final void getHighResolutionOutputSizeshNQ4ISI(android.widget.EditText editText, java.lang.String str, java.lang.String str2, boolean z) {
        lib.android.paypal.com.magnessdk.m mVar = this.Camera2StreamConfigurationMap;
        if (mVar.getHighSpeedVideoFpsRanges(mVar.getHighSpeedVideoFpsRangesFor, mVar.getInputSizeshNQ4ISI.getMagnesSource(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges, lib.android.paypal.com.magnessdk.g.p2, mVar.getInputSizeshNQ4ISI.getContext())) {
            if (mVar.getHighResolutionOutputSizeshNQ4ISI.get(str) == null) {
                mVar.getHighResolutionOutputSizeshNQ4ISI.put(str, editText);
            }
            editText.addTextChangedListener(mVar.new a(str));
            if (z) {
                return;
            }
            editText.setOnFocusChangeListener(mVar.new b(str, str2));
        }
    }

    @Override // lib.android.paypal.com.magnessdk.q
    public final void getHighSpeedVideoFpsRanges(android.content.Context context, android.view.MotionEvent motionEvent) {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        android.content.Context context2;
        lib.android.paypal.com.magnessdk.n nVar = this.getOutputFormats;
        if (!nVar.getHighSpeedVideoFpsRanges(nVar.getHighResolutionOutputSizeshNQ4ISI, nVar.getInputFormats.getMagnesSource(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges, lib.android.paypal.com.magnessdk.g.q2, nVar.getInputFormats.getContext()) || (weakReference = nVar.Camera2StreamConfigurationMap) == null || (context2 = weakReference.get()) == null || !context.equals(context2) || motionEvent == null) {
            return;
        }
        try {
            if (nVar.getHighResolutionOutputSizeshNQ4ISI != null) {
                if (!nVar.getOutputStallDuration) {
                    nVar.getOutputStallDuration = true;
                    nVar.getValidOutputFormatsForInputhNQ4ISI = nVar.getOutputMinFrameDurationlomOqCM.submit(nVar.getOutputSizes);
                    nVar.getOutputSizeshNQ4ISI.schedule(nVar.new a(), lib.android.paypal.com.magnessdk.c.n.MAXIMUM_TIME_ALLOWED.d());
                }
                nVar.getHighSpeedVideoSizesFor.offer(android.view.MotionEvent.obtain(motionEvent));
            }
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a(nVar.getClass(), 3, e);
        }
    }

    static lib.android.paypal.com.magnessdk.i getHighSpeedVideoFpsRanges() {
        lib.android.paypal.com.magnessdk.i iVar;
        synchronized (lib.android.paypal.com.magnessdk.i.class) {
            if (getInputSizeshNQ4ISI == null) {
                getInputSizeshNQ4ISI = new lib.android.paypal.com.magnessdk.i();
            }
            iVar = getInputSizeshNQ4ISI;
        }
        return iVar;
    }

    @Override // lib.android.paypal.com.magnessdk.q
    public final void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, boolean z) {
        lib.android.paypal.com.magnessdk.m mVar = this.Camera2StreamConfigurationMap;
        if (mVar.getHighResolutionOutputSizeshNQ4ISI.get(str) != null) {
            if (z) {
                mVar.Camera2StreamConfigurationMap = true;
            } else {
                mVar.Camera2StreamConfigurationMap = false;
                mVar.getHighSpeedVideoSizes(str, str2);
            }
        }
    }

    @Override // lib.android.paypal.com.magnessdk.q
    public final void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        lib.android.paypal.com.magnessdk.n nVar = this.getOutputFormats;
        if (nVar.getOutputStallDurationlomOqCM == lib.android.paypal.com.magnessdk.c.n.a.INIT.b()) {
            nVar.getOutputStallDurationlomOqCM = lib.android.paypal.com.magnessdk.c.n.a.INACTIVE.b();
        }
        if (nVar.getOutputStallDuration) {
            nVar.getOutputStallDurationlomOqCM = lib.android.paypal.com.magnessdk.c.n.a.ACTIVE.b();
        }
        nVar.getHighResolutionOutputSizeshNQ4ISI(str, null, true);
    }

    @Override // lib.android.paypal.com.magnessdk.q
    public final void Camera2StreamConfigurationMap(android.app.Activity activity) {
        lib.android.paypal.com.magnessdk.n nVar = this.getOutputFormats;
        if (nVar.getHighSpeedVideoFpsRanges(nVar.getHighResolutionOutputSizeshNQ4ISI, nVar.getInputFormats.getMagnesSource(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges, lib.android.paypal.com.magnessdk.g.q2, nVar.getInputFormats.getContext())) {
            java.lang.Class<?> cls = activity.getClass();
            java.lang.ref.WeakReference<android.content.Context> weakReference = nVar.Camera2StreamConfigurationMap;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            java.lang.String simpleName = cls.getSimpleName();
            android.content.Context context = nVar.Camera2StreamConfigurationMap.get();
            if (simpleName.isEmpty() || !context.equals(activity)) {
                return;
            }
            nVar.getHighResolutionOutputSizeshNQ4ISI("", null, false);
            nVar.Camera2StreamConfigurationMap = null;
        }
    }

    @Override // lib.android.paypal.com.magnessdk.q
    public final void getHighSpeedVideoSizes(android.app.Activity activity) {
        lib.android.paypal.com.magnessdk.n nVar = this.getOutputFormats;
        if (nVar.getHighSpeedVideoFpsRanges(nVar.getHighResolutionOutputSizeshNQ4ISI, nVar.getInputFormats.getMagnesSource(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges, lib.android.paypal.com.magnessdk.g.q2, nVar.getInputFormats.getContext())) {
            java.lang.String simpleName = activity.getClass().getSimpleName();
            if (simpleName.isEmpty()) {
                return;
            }
            nVar.Camera2StreamConfigurationMap = new java.lang.ref.WeakReference<>(activity);
            nVar.getOutputFormats = simpleName;
        }
    }

    i() {
    }
}
