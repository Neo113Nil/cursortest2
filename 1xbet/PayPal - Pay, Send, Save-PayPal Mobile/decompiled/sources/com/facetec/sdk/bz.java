package com.facetec.sdk;

/* loaded from: classes8.dex */
class bz implements android.hardware.SensorEventListener {
    private static /* synthetic */ boolean h = true;
    private java.util.Timer b;
    private android.content.Context c;
    private java.util.Timer d;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.facetec.sdk.bz.d> f3453a = new java.lang.ref.WeakReference<>(null);
    private java.lang.ref.WeakReference<com.facetec.sdk.cn> i = new java.lang.ref.WeakReference<>(null);
    private boolean f = false;
    private boolean j = false;
    private int g = 0;
    private android.hardware.Sensor e = d().getDefaultSensor(5);

    @java.lang.FunctionalInterface
    interface d {
        void onDarkLightDetected();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    static com.facetec.sdk.bz a(android.content.Context context) {
        if (context == null) {
            return null;
        }
        return new com.facetec.sdk.bz(context);
    }

    private android.hardware.SensorManager d() {
        return (android.hardware.SensorManager) this.c.getSystemService("sensor");
    }

    private bz(android.content.Context context) {
        this.c = context.getApplicationContext();
    }

    final void d(com.facetec.sdk.bz.d dVar, com.facetec.sdk.cn cnVar) {
        synchronized (this) {
            this.f3453a = new java.lang.ref.WeakReference<>(dVar);
            this.i = new java.lang.ref.WeakReference<>(cnVar);
            if (this.e != null) {
                new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.bz$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bz.this.c(this);
                    }
                }, 50L);
                this.j = true;
            }
            com.facetec.sdk.dg dgVar = new com.facetec.sdk.dg(new java.lang.Runnable() { // from class: com.facetec.sdk.bz$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bz.this.j();
                }
            });
            java.util.Timer timer = new java.util.Timer();
            this.b = timer;
            try {
                timer.scheduleAtFixedRate(dgVar, 500L, 1000L);
            } catch (java.lang.IllegalStateException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.facetec.sdk.bz bzVar) {
        d().registerListener(bzVar, this.e, 0);
    }

    private void a() {
        synchronized (this) {
            if (this.d == null) {
                java.util.Timer timer = new java.util.Timer();
                this.d = timer;
                try {
                    timer.schedule(new com.facetec.sdk.dg(new java.lang.Runnable() { // from class: com.facetec.sdk.bz$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.bz.this.e();
                        }
                    }), 200L);
                } catch (java.lang.IllegalStateException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        com.facetec.sdk.bz.d dVar = this.f3453a.get();
        if (dVar != null) {
            dVar.onDarkLightDetected();
            c();
        }
    }

    private void b() {
        java.util.Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    final void c() {
        this.f = true;
        final android.hardware.Sensor sensor = this.e;
        if (sensor != null) {
            this.e = null;
            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bz$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bz.this.e(sensor);
                }
            });
        }
        b();
        java.util.Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b = null;
        }
        this.f3453a.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(android.hardware.Sensor sensor) {
        d().unregisterListener(this, sensor);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (this.f) {
            return;
        }
        this.g = 0;
        if (sensorEvent.values[0] < 3.0f) {
            a();
        } else {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        java.lang.Object j$56fe9f7;
        this.g++;
        com.facetec.sdk.cn cnVar = this.i.get();
        if (cnVar != null) {
            if ((!this.j || this.g > 1) && (j$56fe9f7 = cnVar.j$56fe9f7()) != null) {
                java.lang.Object d2 = com.facetec.sdk.al.d(-1677945636);
                float f = 0.0f;
                if (d2 == null) {
                    d2 = com.facetec.sdk.al.c((char) (5485 - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 24, 1007939108, false, "c", null);
                }
                byte[] bArr = (byte[]) ((java.lang.reflect.Field) d2).get(j$56fe9f7);
                java.lang.Object d3 = com.facetec.sdk.al.d(-1679792678);
                if (d3 == null) {
                    d3 = com.facetec.sdk.al.c((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5487), android.graphics.drawable.Drawable.resolveOpacity(0, 0), 24 - android.text.TextUtils.getOffsetBefore("", 0), 1007623970, false, "a", null);
                }
                int i = ((java.lang.reflect.Field) d3).getInt(j$56fe9f7);
                java.lang.Object d4 = com.facetec.sdk.al.d(-1676098594);
                if (d4 == null) {
                    d4 = com.facetec.sdk.al.c((char) (5485 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.graphics.Color.green(0), 23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1006090534, false, "e", null);
                }
                int i2 = ((java.lang.reflect.Field) d4).getInt(j$56fe9f7);
                if (!h && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    throw new java.lang.AssertionError();
                }
                int i3 = i * i2;
                int i4 = i3 / 4;
                int i5 = 0;
                for (int i6 = 1; i6 <= i3; i6 += 4) {
                    i5 += bArr[i6 - 1] & 255;
                    if (i6 % 8421504 == 0) {
                        f += i5 / i4;
                        i5 = 0;
                    }
                }
                if (((int) (f + (i5 / i4))) < 75.0f) {
                    a();
                } else {
                    b();
                }
            }
        }
    }
}
