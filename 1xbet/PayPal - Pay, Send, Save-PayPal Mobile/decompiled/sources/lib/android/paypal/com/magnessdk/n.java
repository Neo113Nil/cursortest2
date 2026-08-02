package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
class n extends lib.android.paypal.com.magnessdk.g {
    private static lib.android.paypal.com.magnessdk.n toString;
    java.lang.ref.WeakReference<android.content.Context> Camera2StreamConfigurationMap;
    lib.android.paypal.com.magnessdk.d getHighResolutionOutputSizeshNQ4ISI;
    lib.android.paypal.com.magnessdk.e getHighSpeedVideoFpsRangesFor;
    lib.android.paypal.com.magnessdk.MagnesSettings getInputFormats;
    android.os.Handler getInputSizeshNQ4ISI;
    android.os.Handler getOutputMinFrameDuration;
    lib.android.paypal.com.magnessdk.p getOutputSizes;
    java.util.concurrent.Future getValidOutputFormatsForInputhNQ4ISI;
    boolean getOutputStallDuration = false;
    private final int unwrapAs = 3;
    private java.util.concurrent.CopyOnWriteArraySet<java.lang.String> isOutputSupportedForhNQ4ISI = new java.util.concurrent.CopyOnWriteArraySet<>();
    int getOutputStallDurationlomOqCM = lib.android.paypal.com.magnessdk.c.n.a.INIT.b();
    java.lang.String getOutputFormats = "";
    private java.lang.String isOutputSupportedFor = "TOUCHDATA_";
    java.util.concurrent.ArrayBlockingQueue<android.view.MotionEvent> getHighSpeedVideoSizesFor = new java.util.concurrent.ArrayBlockingQueue<>(200);
    java.util.concurrent.ScheduledExecutorService getOutputMinFrameDurationlomOqCM = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    java.util.Timer getOutputSizeshNQ4ISI = new java.util.Timer();

    private org.json.JSONArray getHighResolutionOutputSizeshNQ4ISI() {
        android.content.Context context = this.getInputFormats.getContext();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.isOutputSupportedFor);
        sb.append(this.getOutputFormats);
        java.lang.String a2 = a.c.a(context, a.b.d, sb.toString());
        if (a2 == null) {
            return null;
        }
        try {
            if (a2.isEmpty()) {
                return null;
            }
            return new org.json.JSONArray(a2);
        } catch (org.json.JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            return null;
        }
    }

    static lib.android.paypal.com.magnessdk.n getHighSpeedVideoSizes() {
        lib.android.paypal.com.magnessdk.n nVar;
        synchronized (lib.android.paypal.com.magnessdk.n.class) {
            if (toString == null) {
                toString = new lib.android.paypal.com.magnessdk.n();
            }
            nVar = toString;
        }
        return nVar;
    }

    private void getHighSpeedVideoSizes(java.lang.String str) {
        if (this.isOutputSupportedForhNQ4ISI.size() >= 3) {
            java.util.Iterator<java.lang.String> it = this.isOutputSupportedForhNQ4ISI.iterator();
            if (it.hasNext()) {
                this.isOutputSupportedForhNQ4ISI.remove(it.next());
            }
        }
        this.isOutputSupportedForhNQ4ISI.add(str);
    }

    @Override // lib.android.paypal.com.magnessdk.g
    final org.json.JSONObject Camera2StreamConfigurationMap() {
        return null;
    }

    @Override // lib.android.paypal.com.magnessdk.g
    final org.json.JSONObject getHighSpeedVideoFpsRanges(lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings, lib.android.paypal.com.magnessdk.d dVar, lib.android.paypal.com.magnessdk.e eVar) {
        return null;
    }

    @Override // lib.android.paypal.com.magnessdk.g
    final void getHighSpeedVideoSizes(int i, lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings) {
    }

    private boolean getHighSpeedVideoFpsRanges(boolean z) {
        java.util.concurrent.CopyOnWriteArraySet<java.lang.String> copyOnWriteArraySet;
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (this.getOutputStallDurationlomOqCM != lib.android.paypal.com.magnessdk.c.n.a.INIT.b()) {
            return ((z && ((weakReference = this.Camera2StreamConfigurationMap) == null || weakReference.get() == null)) || (copyOnWriteArraySet = this.isOutputSupportedForhNQ4ISI) == null || copyOnWriteArraySet.size() <= 0) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, org.json.JSONArray jSONArray, boolean z) {
        org.json.JSONObject jSONObject;
        if (getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats.getMagnesSource(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges, lib.android.paypal.com.magnessdk.g.q2, this.getInputFormats.getContext())) {
            if (this.isOutputSupportedForhNQ4ISI != null && str != null && !str.isEmpty()) {
                getHighSpeedVideoSizes(str);
            }
            getHighSpeedVideoFpsRangesFor();
            if (getHighSpeedVideoFpsRanges(z)) {
                if (jSONArray != null) {
                    try {
                        if (jSONArray.length() > 0) {
                            if (jSONArray != null || jSONArray.length() <= 0) {
                            }
                            boolean a2 = lib.android.paypal.com.magnessdk.g.a(this.getHighResolutionOutputSizeshNQ4ISI, lib.android.paypal.com.magnessdk.g.q2);
                            java.util.Iterator<java.lang.String> it = this.isOutputSupportedForhNQ4ISI.iterator();
                            while (it.hasNext()) {
                                java.lang.String next = it.next();
                                if (next != null && !next.isEmpty()) {
                                    if (a2) {
                                        jSONObject = lib.android.paypal.com.magnessdk.g.getHighSpeedVideoSizes(next, jSONArray, lib.android.paypal.com.magnessdk.g.q2);
                                    } else {
                                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                        jSONObject2.put(lib.android.paypal.com.magnessdk.c.b.f6933a, next);
                                        jSONObject2.put(lib.android.paypal.com.magnessdk.g.q2, jSONArray);
                                        jSONObject = jSONObject2;
                                    }
                                    new lib.android.paypal.com.magnessdk.network.c(lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_JSON_URL, jSONObject, a2, this.getInputFormats, this.getOutputMinFrameDuration, lib.android.paypal.com.magnessdk.c.b.d.TOUCH).c();
                                }
                            }
                            this.isOutputSupportedForhNQ4ISI.clear();
                            return;
                        }
                    } catch (org.json.JSONException unused) {
                        return;
                    }
                }
                jSONArray = getHighResolutionOutputSizeshNQ4ISI();
                if (jSONArray != null) {
                }
            }
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(lib.android.paypal.com.magnessdk.n nVar, java.lang.String str) {
        android.content.Context context = nVar.getInputFormats.getContext();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(nVar.isOutputSupportedFor);
        sb.append(nVar.getOutputFormats);
        a.c.a(context, a.b.d, sb.toString(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRangesFor() {
        java.util.concurrent.Future future;
        try {
            if (!this.getOutputStallDuration || (future = this.getValidOutputFormatsForInputhNQ4ISI) == null || future.isDone()) {
                return;
            }
            this.getValidOutputFormatsForInputhNQ4ISI.cancel(true);
            this.getOutputStallDuration = false;
        } catch (java.lang.Exception unused) {
        }
    }

    n() {
    }

    class a extends java.util.TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            lib.android.paypal.com.magnessdk.n.this.getHighSpeedVideoFpsRangesFor();
            lib.android.paypal.com.magnessdk.n.this.getOutputStallDurationlomOqCM = lib.android.paypal.com.magnessdk.c.n.a.INACTIVE.b();
        }

        a() {
        }
    }

    class b extends android.os.Handler {
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            org.json.JSONArray jSONArray;
            if (lib.android.paypal.com.magnessdk.n.c.getHighSpeedVideoSizes[lib.android.paypal.com.magnessdk.c.b.e.a(message.what).ordinal()] == 1 && (jSONArray = (org.json.JSONArray) message.obj) != null && jSONArray.length() > 0) {
                try {
                    org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.get(jSONArray.length() - 1);
                    jSONObject.put(lib.android.paypal.com.magnessdk.c.n.SCREEN_NAME.toString(), lib.android.paypal.com.magnessdk.n.this.getOutputFormats);
                    if (lib.android.paypal.com.magnessdk.n.this.getOutputStallDurationlomOqCM == lib.android.paypal.com.magnessdk.c.n.a.ACTIVE.b()) {
                        jSONObject.put(lib.android.paypal.com.magnessdk.c.n.REASON.toString(), lib.android.paypal.com.magnessdk.c.n.EnumC0226c.COLLECTANDSUBMIT_TRIGGERED.b());
                        lib.android.paypal.com.magnessdk.n.this.getOutputStallDurationlomOqCM = lib.android.paypal.com.magnessdk.c.n.a.INACTIVE.b();
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
                lib.android.paypal.com.magnessdk.n.this.getHighResolutionOutputSizeshNQ4ISI("", jSONArray, false);
                lib.android.paypal.com.magnessdk.n.Camera2StreamConfigurationMap(lib.android.paypal.com.magnessdk.n.this, jSONArray.toString());
            }
            super.handleMessage(message);
        }

        b(android.os.Looper looper) {
            super(looper);
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.b.e.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.b.e.TOUCHWORKER_MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }
}
