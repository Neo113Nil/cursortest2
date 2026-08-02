package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
class p extends lib.android.paypal.com.magnessdk.network.base.c {
    private static lib.android.paypal.com.magnessdk.p Camera2StreamConfigurationMap;
    java.lang.ref.WeakReference<android.os.Handler> getHighSpeedVideoFpsRanges;
    java.util.concurrent.ArrayBlockingQueue<android.view.MotionEvent> getHighSpeedVideoFpsRangesFor;
    private java.util.Timer getOutputMinFrameDurationlomOqCM;
    private org.json.JSONObject getHighSpeedVideoSizes = new org.json.JSONObject();
    private org.json.JSONArray getHighSpeedVideoSizesFor = new org.json.JSONArray();
    private org.json.JSONArray getInputFormats = new org.json.JSONArray();
    private boolean getOutputMinFrameDuration = false;
    private boolean getInputSizeshNQ4ISI = false;
    private boolean getOutputFormats = true;
    private volatile boolean getOutputSizeshNQ4ISI = true;
    private boolean getOutputStallDurationlomOqCM = false;
    private int getOutputSizes = 0;

    private void getHighSpeedVideoSizes(int i) {
        org.json.JSONArray jSONArray = this.getInputFormats;
        if (jSONArray != null && jSONArray.length() > 0) {
            this.getOutputSizeshNQ4ISI = false;
            try {
                ((org.json.JSONObject) this.getInputFormats.get(this.getInputFormats.length() - 1)).put(lib.android.paypal.com.magnessdk.c.n.REASON.toString(), java.lang.String.valueOf(i));
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        if (!this.getOutputMinFrameDuration) {
            this.getOutputMinFrameDuration = true;
            android.os.Handler handler = this.getHighSpeedVideoFpsRanges.get();
            org.json.JSONArray jSONArray2 = this.getInputFormats;
            if (jSONArray2 == null || jSONArray2.length() == 0 || handler == null) {
                return;
            }
            try {
                if (this.getInputFormats.length() > 0) {
                    org.json.JSONArray highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getInputFormats);
                    android.os.Message message = new android.os.Message();
                    message.obj = highSpeedVideoFpsRangesFor;
                    message.what = lib.android.paypal.com.magnessdk.c.b.e.TOUCHWORKER_MESSAGE.b();
                    handler.sendMessage(message);
                }
            } catch (java.lang.Exception e2) {
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e2);
            }
        }
        this.getInputSizeshNQ4ISI = false;
        this.getOutputSizes = 0;
        this.getOutputFormats = true;
        this.getHighSpeedVideoSizesFor = new org.json.JSONArray();
        this.getInputFormats = new org.json.JSONArray();
    }

    private static org.json.JSONArray getHighSpeedVideoFpsRangesFor(org.json.JSONArray jSONArray) throws org.json.JSONException {
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.getJSONObject(i));
        }
        return jSONArray2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[Catch: JSONException -> 0x00e8, TryCatch #0 {JSONException -> 0x00e8, blocks: (B:4:0x0003, B:12:0x003b, B:15:0x0062, B:16:0x0085, B:18:0x00cd, B:19:0x00da, B:23:0x002a, B:24:0x0032, B:25:0x002d, B:26:0x0030), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[Catch: JSONException -> 0x00e8, TryCatch #0 {JSONException -> 0x00e8, blocks: (B:4:0x0003, B:12:0x003b, B:15:0x0062, B:16:0x0085, B:18:0x00cd, B:19:0x00da, B:23:0x002a, B:24:0x0032, B:25:0x002d, B:26:0x0030), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cd A[Catch: JSONException -> 0x00e8, TryCatch #0 {JSONException -> 0x00e8, blocks: (B:4:0x0003, B:12:0x003b, B:15:0x0062, B:16:0x0085, B:18:0x00cd, B:19:0x00da, B:23:0x002a, B:24:0x0032, B:25:0x002d, B:26:0x0030), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private org.json.JSONObject getHighSpeedVideoFpsRanges(android.view.MotionEvent motionEvent) {
        lib.android.paypal.com.magnessdk.c.n.b bVar;
        int b;
        if (motionEvent == null) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            float pressure = motionEvent.getPressure();
            float size = motionEvent.getSize();
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int pointerCount = motionEvent.getPointerCount();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                bVar = lib.android.paypal.com.magnessdk.c.n.b.FINGER_DOWN;
            } else if (actionMasked == 1) {
                bVar = lib.android.paypal.com.magnessdk.c.n.b.FINGER_UP;
            } else {
                if (actionMasked != 2) {
                    b = 3;
                    if (pressure != 0.0f) {
                        double d = pressure;
                        jSONObject.put(lib.android.paypal.com.magnessdk.c.n.FORCE.toString(), java.math.BigDecimal.valueOf(java.lang.Math.round(d * r2.b()) / lib.android.paypal.com.magnessdk.c.n.MAXIMUM_PRECISION.b()).toPlainString());
                    }
                    if (size != 0.0f) {
                        double d2 = size;
                        jSONObject.put(lib.android.paypal.com.magnessdk.c.n.RADIUS.toString(), java.math.BigDecimal.valueOf(java.lang.Math.round(d2 * r3.b()) / lib.android.paypal.com.magnessdk.c.n.MAXIMUM_PRECISION.b()).toPlainString());
                    }
                    jSONObject.put(lib.android.paypal.com.magnessdk.c.n.TOUCH_LOCATION_X.toString(), java.math.BigDecimal.valueOf(java.lang.Math.round(rawX * r8.b()) / lib.android.paypal.com.magnessdk.c.n.MAXIMUM_PRECISION.b()).toPlainString());
                    double d3 = rawY;
                    jSONObject.put(lib.android.paypal.com.magnessdk.c.n.TOUCH_LOCATION_Y.toString(), java.math.BigDecimal.valueOf(java.lang.Math.round(d3 * r5.b()) / lib.android.paypal.com.magnessdk.c.n.MAXIMUM_PRECISION.b()).toPlainString());
                    if (pointerCount > 1) {
                        jSONObject.put(lib.android.paypal.com.magnessdk.c.n.TOUCH_COUNT.toString(), java.lang.String.valueOf(pointerCount));
                    }
                    jSONObject.put(lib.android.paypal.com.magnessdk.c.n.EVENT_TYPE.toString(), java.lang.String.valueOf(b));
                    return jSONObject;
                }
                bVar = lib.android.paypal.com.magnessdk.c.n.b.FINGER_MOVE;
            }
            b = bVar.b();
            if (pressure != 0.0f) {
            }
            if (size != 0.0f) {
            }
            jSONObject.put(lib.android.paypal.com.magnessdk.c.n.TOUCH_LOCATION_X.toString(), java.math.BigDecimal.valueOf(java.lang.Math.round(rawX * r8.b()) / lib.android.paypal.com.magnessdk.c.n.MAXIMUM_PRECISION.b()).toPlainString());
            double d32 = rawY;
            jSONObject.put(lib.android.paypal.com.magnessdk.c.n.TOUCH_LOCATION_Y.toString(), java.math.BigDecimal.valueOf(java.lang.Math.round(d32 * r5.b()) / lib.android.paypal.com.magnessdk.c.n.MAXIMUM_PRECISION.b()).toPlainString());
            if (pointerCount > 1) {
            }
            jSONObject.put(lib.android.paypal.com.magnessdk.c.n.EVENT_TYPE.toString(), java.lang.String.valueOf(b));
            return jSONObject;
        } catch (org.json.JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6 A[Catch: JSONException -> 0x00e3, Exception -> 0x00f1, InterruptedException -> 0x00f2, TryCatch #0 {JSONException -> 0x00e3, blocks: (B:15:0x005c, B:17:0x0066, B:18:0x0075, B:20:0x0079, B:22:0x0081, B:23:0x0083, B:24:0x00a7, B:25:0x00b2, B:27:0x00b6, B:29:0x00cc, B:30:0x00cf, B:32:0x00d9, B:36:0x0086, B:38:0x0091, B:40:0x00a0), top: B:14:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9 A[Catch: JSONException -> 0x00e3, Exception -> 0x00f1, InterruptedException -> 0x00f2, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00e3, blocks: (B:15:0x005c, B:17:0x0066, B:18:0x0075, B:20:0x0079, B:22:0x0081, B:23:0x0083, B:24:0x00a7, B:25:0x00b2, B:27:0x00b6, B:29:0x00cc, B:30:0x00cf, B:32:0x00d9, B:36:0x0086, B:38:0x0091, B:40:0x00a0), top: B:14:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec A[SYNTHETIC] */
    @Override // lib.android.paypal.com.magnessdk.network.base.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        boolean z;
        org.json.JSONObject jSONObject;
        java.util.Timer timer;
        while (true) {
            try {
                android.view.MotionEvent take = this.getHighSpeedVideoFpsRangesFor.take();
                if (take == null) {
                    return;
                }
                if (this.getOutputSizeshNQ4ISI) {
                    lib.android.paypal.com.magnessdk.c.n nVar = lib.android.paypal.com.magnessdk.c.n.UNINITIALIZED_TIME;
                    long d = nVar.d();
                    long d2 = nVar.d();
                    int actionMasked = take.getActionMasked();
                    if (actionMasked == 0) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        this.getOutputMinFrameDurationlomOqCM = new java.util.Timer();
                        lib.android.paypal.com.magnessdk.p.a aVar = new lib.android.paypal.com.magnessdk.p.a();
                        this.getInputSizeshNQ4ISI = true;
                        this.getOutputMinFrameDurationlomOqCM.schedule(aVar, lib.android.paypal.com.magnessdk.c.n.MAXIMUM_GESTURE_TIME.d());
                        this.getOutputFormats = false;
                        d = currentTimeMillis;
                    } else if (actionMasked == 1) {
                        d2 = java.lang.System.currentTimeMillis();
                        if (this.getInputSizeshNQ4ISI && (timer = this.getOutputMinFrameDurationlomOqCM) != null) {
                            timer.cancel();
                        }
                        this.getInputSizeshNQ4ISI = false;
                    } else if (actionMasked != 2) {
                        z = false;
                        if (!z) {
                            try {
                                lib.android.paypal.com.magnessdk.c.n nVar2 = lib.android.paypal.com.magnessdk.c.n.UNINITIALIZED_TIME;
                                if (d != nVar2.d()) {
                                    this.getHighSpeedVideoSizes.put(lib.android.paypal.com.magnessdk.c.n.START_TIME.toString(), java.lang.String.valueOf(d));
                                }
                                if (this.getOutputFormats || d2 == nVar2.d()) {
                                    if (this.getOutputSizes >= lib.android.paypal.com.magnessdk.c.n.MAXIMUM_EVENT_COUNT.c() - 1 || this.getHighSpeedVideoSizesFor.length() >= lib.android.paypal.com.magnessdk.c.n.MAXIMUM_GESTURE_EVENT_COUNT.c() - 1) {
                                        d2 = java.lang.System.currentTimeMillis();
                                        jSONObject = this.getHighSpeedVideoSizes;
                                    }
                                    if (!this.getOutputFormats) {
                                        this.getHighSpeedVideoSizesFor.put(getHighSpeedVideoFpsRanges(take));
                                        this.getOutputSizes++;
                                        if (d2 != nVar2.d()) {
                                            Camera2StreamConfigurationMap();
                                        }
                                    }
                                    if (this.getOutputSizes < lib.android.paypal.com.magnessdk.c.n.MAXIMUM_EVENT_COUNT.c()) {
                                        getHighSpeedVideoSizes(lib.android.paypal.com.magnessdk.c.n.EnumC0226c.EVENT_LIMIT.b());
                                    }
                                } else {
                                    jSONObject = this.getHighSpeedVideoSizes;
                                }
                                jSONObject.put(lib.android.paypal.com.magnessdk.c.n.END_TIME.toString(), java.lang.String.valueOf(d2));
                                if (!this.getOutputFormats) {
                                }
                                if (this.getOutputSizes < lib.android.paypal.com.magnessdk.c.n.MAXIMUM_EVENT_COUNT.c()) {
                                }
                            } catch (org.json.JSONException e) {
                                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
                take.recycle();
            } catch (java.lang.InterruptedException unused) {
                this.getOutputStallDurationlomOqCM = true;
                getHighSpeedVideoSizes();
                getHighSpeedVideoSizes(lib.android.paypal.com.magnessdk.c.n.EnumC0226c.TIMER_LIMIT.b());
                this.getOutputSizeshNQ4ISI = true;
                this.getOutputMinFrameDuration = false;
                this.getOutputStallDurationlomOqCM = false;
                return;
            } catch (java.lang.Exception unused2) {
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
    }

    static lib.android.paypal.com.magnessdk.p getHighSpeedVideoFpsRanges() {
        lib.android.paypal.com.magnessdk.p pVar;
        synchronized (lib.android.paypal.com.magnessdk.p.class) {
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new lib.android.paypal.com.magnessdk.p();
            }
            pVar = Camera2StreamConfigurationMap;
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes() {
        try {
            if (this.getOutputFormats) {
                return;
            }
            org.json.JSONObject jSONObject = this.getHighSpeedVideoSizes;
            lib.android.paypal.com.magnessdk.c.n nVar = lib.android.paypal.com.magnessdk.c.n.END_TIME;
            java.lang.String optString = jSONObject.optString(nVar.toString());
            if (optString == null || optString.isEmpty()) {
                this.getHighSpeedVideoSizes.put(nVar.toString(), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            }
            Camera2StreamConfigurationMap();
        } catch (org.json.JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
        }
    }

    private void Camera2StreamConfigurationMap() throws org.json.JSONException {
        int length = this.getInputFormats.length();
        lib.android.paypal.com.magnessdk.c.n nVar = lib.android.paypal.com.magnessdk.c.n.MAXIMUM_TOUCH_COUNT;
        if (length < nVar.c()) {
            org.json.JSONArray jSONArray = this.getHighSpeedVideoSizesFor;
            if (jSONArray != null && jSONArray.length() > 0) {
                this.getHighSpeedVideoSizes.put(lib.android.paypal.com.magnessdk.c.n.TOUCH_EVENT.toString(), getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor));
                this.getInputFormats.put(this.getHighSpeedVideoSizes);
            }
            this.getOutputFormats = true;
            this.getHighSpeedVideoSizesFor = new org.json.JSONArray();
            this.getHighSpeedVideoSizes = new org.json.JSONObject();
        }
        if (this.getOutputStallDurationlomOqCM || this.getInputFormats.length() < nVar.c()) {
            return;
        }
        getHighSpeedVideoSizes(lib.android.paypal.com.magnessdk.c.n.EnumC0226c.GESTURE_LIMIT.b());
    }

    p() {
    }

    class a extends java.util.TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            lib.android.paypal.com.magnessdk.p pVar = lib.android.paypal.com.magnessdk.p.this;
            if (pVar.getOutputFormats || !pVar.getOutputSizeshNQ4ISI) {
                return;
            }
            lib.android.paypal.com.magnessdk.p.this.getHighSpeedVideoSizes();
            lib.android.paypal.com.magnessdk.p.this.getInputSizeshNQ4ISI = false;
        }

        a() {
        }
    }
}
