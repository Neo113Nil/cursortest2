package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class e extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final com.dyneti.android.dyscan.n2 f3298a;
    public final java.lang.String b;
    public final long c;
    public final java.lang.String d;
    public final com.dyneti.android.dyscan.f e;
    public final com.dyneti.android.dyscan.b f;
    public final com.dyneti.android.dyscan.m2 g;
    public final com.dyneti.android.dyscan.h h;
    public final com.dyneti.android.dyscan.i i;
    public final com.dyneti.android.dyscan.a j;
    public final com.dyneti.android.dyscan.t1 k;
    public boolean l;
    public com.dyneti.android.dyscan.c m;
    public com.dyneti.android.dyscan.d n;

    public e(com.dyneti.android.dyscan.f fVar, java.lang.String str, com.dyneti.android.dyscan.b bVar, com.dyneti.android.dyscan.m2 m2Var, com.dyneti.android.dyscan.h hVar) {
        this(fVar, str, bVar, m2Var, hVar, new com.dyneti.android.dyscan.n2(), com.dyneti.android.dyscan.i.a(), com.dyneti.android.dyscan.a.a(), com.dyneti.android.dyscan.t1.a());
    }

    public static /* synthetic */ com.dyneti.android.dyscan.n1 a(java.lang.String str, java.lang.Boolean bool) {
        return null;
    }

    public final com.dyneti.android.dyscan.n1 b(final byte[] bArr, final byte[] bArr2, final byte[] bArr3, final java.lang.String str, final com.dyneti.android.dyscan.l lVar, final com.dyneti.android.dyscan.l lVar2, final boolean z) {
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(new com.dyneti.android.dyscan.l1(new java.lang.RuntimeException()));
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.dyneti.android.dyscan.e.this.a(bArr, bArr2, lVar, lVar2, str, z, atomicReference, bArr3);
            }
        });
        thread.start();
        try {
            thread.join(10000L);
        } catch (java.lang.IllegalArgumentException | java.lang.InterruptedException e) {
            e.getMessage();
        }
        return (com.dyneti.android.dyscan.n1) atomicReference.get();
    }

    @Override // android.os.AsyncTask
    public final java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.dyneti.android.dyscan.d[] dVarArr = (com.dyneti.android.dyscan.d[]) objArr;
        android.net.TrafficStats.setThreadStatsTag((int) java.lang.Thread.currentThread().getId());
        try {
            javax.net.ssl.HttpsURLConnection a2 = a();
            a(a2);
            a2.connect();
            int responseCode = a2.getResponseCode();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(a2.getInputStream(), com.dyneti.android.dyscan.r2.c()));
            java.lang.String str = "";
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = str.concat(readLine.concat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE));
            }
            bufferedReader.close();
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (responseCode != 200) {
                return new com.dyneti.android.dyscan.i2(new java.lang.Exception(java.lang.String.valueOf(responseCode)));
            }
            if (dVarArr.length > 0) {
                this.n = dVarArr[0];
            }
            return a(jSONObject);
        } catch (java.net.SocketTimeoutException e) {
            e.getMessage();
            return new com.dyneti.android.dyscan.i2(e);
        } catch (java.io.IOException e2) {
            e = e2;
            e.getMessage();
            return new com.dyneti.android.dyscan.i2(e);
        } catch (org.json.JSONException e3) {
            e = e3;
            e.getMessage();
            return new com.dyneti.android.dyscan.i2(e);
        }
    }

    public e(com.dyneti.android.dyscan.f fVar, java.lang.String str, com.dyneti.android.dyscan.b bVar, com.dyneti.android.dyscan.m2 m2Var, com.dyneti.android.dyscan.h hVar, com.dyneti.android.dyscan.n2 n2Var, com.dyneti.android.dyscan.i iVar, com.dyneti.android.dyscan.a aVar, com.dyneti.android.dyscan.t1 t1Var) {
        this.l = false;
        this.n = new com.dyneti.android.dyscan.d() { // from class: com.dyneti.android.dyscan.e$$ExternalSyntheticLambda1
            @Override // com.dyneti.android.dyscan.d
            public final com.dyneti.android.dyscan.n1 a(java.lang.String str2, java.lang.Boolean bool) {
                return com.dyneti.android.dyscan.e.a(str2, bool);
            }
        };
        this.e = fVar;
        com.dyneti.android.dyscan.DyScanView dyScanView = (com.dyneti.android.dyscan.DyScanView) fVar;
        android.provider.Settings.Secure.getString(dyScanView.getActivity().getContentResolver(), a.b.l);
        this.c = dyScanView.l;
        this.b = str;
        this.f3298a = n2Var;
        this.d = dyScanView.j0;
        this.f = bVar;
        this.g = m2Var;
        this.h = hVar;
        this.i = iVar;
        this.j = aVar;
        this.k = t1Var;
    }

    public final void a(byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.String str, com.dyneti.android.dyscan.l lVar, com.dyneti.android.dyscan.l lVar2, boolean z) {
        this.m = new com.dyneti.android.dyscan.c(bArr, bArr2, lVar, lVar2);
        try {
            javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL("https://api.dyneti.com/scans/image/").openConnection();
            a(httpsURLConnection, str, z);
            httpsURLConnection.getResponseCode();
            a(bArr3, str);
        } catch (java.io.IOException e) {
            e.getMessage();
        }
    }

    public final void a(byte[] bArr, byte[] bArr2, com.dyneti.android.dyscan.l lVar, com.dyneti.android.dyscan.l lVar2, java.lang.String str, boolean z, java.util.concurrent.atomic.AtomicReference atomicReference, byte[] bArr3) {
        this.m = new com.dyneti.android.dyscan.c(bArr, bArr2, lVar, lVar2);
        try {
            javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL("https://api.dyneti.com/scans/image/").openConnection();
            a(httpsURLConnection, str, z);
            int responseCode = httpsURLConnection.getResponseCode();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpsURLConnection.getInputStream(), com.dyneti.android.dyscan.r2.c()));
            java.lang.String str2 = "";
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else {
                    str2 = str2.concat(readLine.concat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE));
                }
            }
            bufferedReader.close();
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if (responseCode == 200) {
                java.lang.Boolean bool = (java.lang.Boolean) jSONObject.opt("isGenerated");
                if (bool != null) {
                    atomicReference.set(new com.dyneti.android.dyscan.m1(bool));
                } else {
                    atomicReference.set(new com.dyneti.android.dyscan.m1(null));
                }
            } else {
                atomicReference.set(new com.dyneti.android.dyscan.l1(new java.lang.RuntimeException()));
            }
            a(bArr3, str);
        } catch (java.io.IOException | org.json.JSONException e) {
            e.getMessage();
        }
    }

    public final void b() {
        this.l = true;
        this.f3298a.a("timeTakenInMilliseconds", (int) (android.os.SystemClock.elapsedRealtime() - this.c));
        this.f3298a.a("appLanguage", ((com.dyneti.android.dyscan.DyScanView) this.e).v);
        this.f3298a.a("isChallenge", ((com.dyneti.android.dyscan.DyScanView) this.e).k0);
        this.f3298a.a("deviceName", com.dyneti.android.dyscan.i.a(((com.dyneti.android.dyscan.DyScanView) this.e).getActivity().getContentResolver()));
        this.f3298a.a("usingView", ((com.dyneti.android.dyscan.DyScanView) this.e).m);
        this.f3298a.a("scanRegionVertical", ((com.dyneti.android.dyscan.DyScanView) this.e).r);
        this.f3298a.a("needsReview", ((com.dyneti.android.dyscan.DyScanView) this.e).f0);
        this.f3298a.a("enableSidewaysScanning", ((com.dyneti.android.dyscan.DyScanView) this.e).p0);
        com.dyneti.android.dyscan.n2 n2Var = new com.dyneti.android.dyscan.n2();
        n2Var.a("helperTextString", ((com.dyneti.android.dyscan.DyScanView) this.e).y);
        n2Var.a("helperTextColor", a(((com.dyneti.android.dyscan.DyScanView) this.e).z));
        com.dyneti.android.dyscan.DyScanView dyScanView = (com.dyneti.android.dyscan.DyScanView) this.e;
        n2Var.a("helperTextFont", java.lang.String.format("%s|%f", dyScanView.B, java.lang.Float.valueOf(dyScanView.A)));
        n2Var.a("showHelperText", ((com.dyneti.android.dyscan.DyScanView) this.e).x);
        n2Var.a("helperTextPosition", ((com.dyneti.android.dyscan.DyScanView) this.e).C);
        n2Var.a("showCorners", ((com.dyneti.android.dyscan.DyScanView) this.e).M);
        n2Var.a("cornerThickness", ((com.dyneti.android.dyscan.DyScanView) this.e).L);
        n2Var.a("cornerInactiveColor", a(((com.dyneti.android.dyscan.DyScanView) this.e).N));
        n2Var.a("cornerActiveColor", a(((com.dyneti.android.dyscan.DyScanView) this.e).O));
        n2Var.a("cornerCompletedColor", a(((com.dyneti.android.dyscan.DyScanView) this.e).P));
        n2Var.a("bgColor", a(((com.dyneti.android.dyscan.DyScanView) this.e).Q));
        n2Var.a("bgOpacity", ((com.dyneti.android.dyscan.DyScanView) this.e).R);
        n2Var.a("showRotateButton", ((com.dyneti.android.dyscan.DyScanView) this.e).V);
        n2Var.a("showManualEntryButton", ((com.dyneti.android.dyscan.DyScanView) this.e).b0);
        n2Var.a("manualEntryButtonString", ((com.dyneti.android.dyscan.DyScanView) this.e).c0);
        n2Var.a("showResultOverlay", ((com.dyneti.android.dyscan.DyScanView) this.e).S);
        n2Var.a("showDynetiLogo", ((com.dyneti.android.dyscan.DyScanView) this.e).d0);
        n2Var.a("cardFrameContentDescription", ((com.dyneti.android.dyscan.DyScanView) this.e).e0);
        n2Var.a("resultOverlayAnimationMs", ((com.dyneti.android.dyscan.DyScanView) this.e).T);
        n2Var.a("resultOverlayAlwaysHorizontal", ((com.dyneti.android.dyscan.DyScanView) this.e).U);
        n2Var.a("showCardOverlay", ((com.dyneti.android.dyscan.DyScanView) this.e).G);
        n2Var.a("cardOverlayColor", a(((com.dyneti.android.dyscan.DyScanView) this.e).H));
        n2Var.a("cardOverlayOpacity", ((com.dyneti.android.dyscan.DyScanView) this.e).I);
        n2Var.a("cardOverlayNumber", ((com.dyneti.android.dyscan.DyScanView) this.e).J);
        n2Var.a("cardOverlayDate", ((com.dyneti.android.dyscan.DyScanView) this.e).K);
        n2Var.a("lightTorchWhenDark", ((com.dyneti.android.dyscan.DyScanView) this.e).W);
        n2Var.a("vibrateOnCompletion", ((com.dyneti.android.dyscan.DyScanView) this.e).F);
        n2Var.a("extendedModelName", (java.lang.String) null);
        n2Var.a("customerEnableSidewaysScanning", ((com.dyneti.android.dyscan.DyScanView) this.e).q0);
        com.dyneti.android.dyscan.n2 n2Var2 = this.f3298a;
        try {
            n2Var2.f3326a.put("sdkParams", n2Var.f3326a);
        } catch (org.json.JSONException e) {
            n2Var2.a("sdkParams", e);
        }
        com.dyneti.android.dyscan.t1 t1Var = this.k;
        com.dyneti.android.dyscan.n2 n2Var3 = this.f3298a;
        com.dyneti.android.dyscan.t1.a(n2Var3);
        n2Var3.b("foundFormats", t1Var.e.toArray());
        n2Var3.a("supportCheckCalled", t1Var.f);
        n2Var3.a("isReactNative", t1Var.b);
        n2Var3.a("focusDistance", (java.lang.Object) null);
        n2Var3.a("iso", (java.lang.Object) null);
        long j = t1Var.k.b;
        n2Var3.a("avgFramesPerBatch", j > 0 ? java.lang.Double.valueOf(r3.f3332a / j) : null);
        com.dyneti.android.dyscan.s1 s1Var = t1Var.l;
        int i = s1Var.e;
        n2Var3.a("avgTensorFlowTimeMs", i > 0 ? java.lang.Long.valueOf(s1Var.b / i) : null);
        com.dyneti.android.dyscan.s1 s1Var2 = t1Var.m;
        int i2 = s1Var2.e;
        n2Var3.a("avgPostProcessTimeMs", i2 > 0 ? java.lang.Long.valueOf(s1Var2.b / i2) : null);
        n2Var3.a("minTimePerFrameS", t1Var.n.d != null ? java.lang.Double.valueOf(r3.longValue() / 1000.0d) : null);
        n2Var3.a("maxTimePerFrameS", t1Var.n.c != null ? java.lang.Double.valueOf(r3.longValue() / 1000.0d) : null);
        n2Var3.a("clientField", t1Var.c);
        n2Var3.a("androidCamDisconnectTime", (java.lang.Object) null);
        n2Var3.a("androidCamErrorTime", (java.lang.Object) null);
        n2Var3.a("androidFirstRealFrameTime", t1Var.g);
        n2Var3.a("firstDigitTime", t1Var.h);
        n2Var3.a("first3CornersTime", t1Var.i);
        n2Var3.a("permissionsGrantedTime", t1Var.j);
        n2Var3.a("cardAspectRatio", t1Var.d);
        n2Var3.a("androidWindowAttachTime", t1Var.f3342o.f3335a);
        n2Var3.a("androidWindowAttachCount", t1Var.f3342o.b);
        n2Var3.a("androidWindowDetachTime", t1Var.p.f3335a);
        n2Var3.a("androidWindowDetachCount", t1Var.p.b);
        n2Var3.a("androidResumeTime", t1Var.q.f3335a);
        n2Var3.a("androidResumeCount", t1Var.q.b);
        n2Var3.a("androidPauseTime", t1Var.r.f3335a);
        n2Var3.a("androidPauseCount", t1Var.r.b);
        n2Var3.a("androidDestroyTime", t1Var.s.f3335a);
        n2Var3.a("androidDestroyCount", t1Var.s.b);
        new com.dyneti.android.dyscan.g2().a(n2Var3);
        new com.dyneti.android.dyscan.p1().a(n2Var3);
        com.dyneti.android.dyscan.q1 q1Var = t1Var.k;
        q1Var.f3332a = 0L;
        q1Var.b = 0L;
        com.dyneti.android.dyscan.s1 s1Var3 = t1Var.n;
        s1Var3.f3338a = 0L;
        s1Var3.b = 0L;
        s1Var3.c = null;
        s1Var3.d = null;
        s1Var3.e = 0;
        com.dyneti.android.dyscan.s1 s1Var4 = t1Var.m;
        s1Var4.f3338a = 0L;
        s1Var4.b = 0L;
        s1Var4.c = null;
        s1Var4.d = null;
        s1Var4.e = 0;
        com.dyneti.android.dyscan.s1 s1Var5 = t1Var.l;
        s1Var5.f3338a = 0L;
        s1Var5.b = 0L;
        s1Var5.c = null;
        s1Var5.d = null;
        s1Var5.e = 0;
        com.dyneti.android.dyscan.r1 r1Var = t1Var.f3342o;
        r1Var.f3335a = null;
        r1Var.b = 0;
        com.dyneti.android.dyscan.r1 r1Var2 = t1Var.p;
        r1Var2.f3335a = null;
        r1Var2.b = 0;
        com.dyneti.android.dyscan.r1 r1Var3 = t1Var.q;
        r1Var3.f3335a = null;
        r1Var3.b = 0;
        com.dyneti.android.dyscan.r1 r1Var4 = t1Var.r;
        r1Var4.f3335a = null;
        r1Var4.b = 0;
        com.dyneti.android.dyscan.r1 r1Var5 = t1Var.s;
        r1Var5.f3335a = null;
        r1Var5.b = 0;
        t1Var.g = null;
        t1Var.h = null;
        t1Var.i = null;
        t1Var.j = null;
        t1Var.d = null;
        t1Var.e.clear();
        new com.dyneti.android.dyscan.r0(this.e).a(this.f3298a);
        com.dyneti.android.dyscan.b bVar = this.f;
        if (bVar != null) {
            this.f3298a.a("androidCameraHardwareLevel", bVar.f3291a);
            this.f3298a.a("androidHasManualCapability", this.f.b);
            this.f3298a.a("androidMinFocusDistance", this.f.c);
            this.f3298a.a("androidFocusDistanceCalibration", this.f.d);
            this.f3298a.a("androidSupportsOis", this.f.f);
            this.f3298a.a("androidMaxAfRegions", this.f.g);
            this.f3298a.a("androidCameraVersion", this.f.h);
            this.f3298a.a("androidManualFocusFailed", false);
            this.f3298a.b("androidCameraCapabilities", this.f.i);
            this.f3298a.a("didTapToFocus", this.f.j);
            this.f3298a.a("tapToFocusCount", this.f.k);
            this.f3298a.a("exposureCompensationTriggered", this.f.l);
            android.graphics.Rect rect = this.f.e;
            if (rect != null) {
                this.f3298a.b("androidSensorRect", new int[]{rect.left, rect.top, rect.right, rect.bottom});
            }
        }
        com.dyneti.android.dyscan.m2 m2Var = this.g;
        if (m2Var != null) {
            com.dyneti.android.dyscan.n2 n2Var4 = this.f3298a;
            int i3 = m2Var.k;
            n2Var4.a("avgMagneticField", i3 != 0 ? java.lang.Float.valueOf(m2Var.j / i3) : null);
            this.f3298a.a("maxMagneticField", this.g.h);
            this.f3298a.a("minMagneticField", this.g.i);
            this.f3298a.b("deviceOrientation", this.g.a());
            com.dyneti.android.dyscan.n2 n2Var5 = this.f3298a;
            com.dyneti.android.dyscan.m2 m2Var2 = this.g;
            n2Var5.b("magnetometer", !m2Var2.c ? null : m2Var2.e);
        }
        com.dyneti.android.dyscan.h hVar = this.h;
        if (hVar != null) {
            this.f3298a.a("androidLastAmbientLight", hVar.b);
            com.dyneti.android.dyscan.n2 n2Var6 = this.f3298a;
            com.dyneti.android.dyscan.h hVar2 = this.h;
            int i4 = hVar2.f;
            n2Var6.a("androidAvgAmbientLight", i4 != 0 ? java.lang.Float.valueOf(hVar2.e / i4) : null);
            this.f3298a.a("androidMinAmbientLight", this.h.d);
            this.f3298a.a("androidMaxAmbientLight", this.h.c);
        }
        if (com.dyneti.android.dyscan.DyScan.isEuVersion()) {
            java.lang.String[] strArr = {"cardBIN", "lastFourDigits", "deviceOS", "deviceModel", "deviceIDs", "acceleration", "deviceOrientation", "magnetometer", "deviceName", "wifiIp", "cellularIp", "wiredIp", "androidCameraVersion"};
            for (int i5 = 0; i5 < 13; i5++) {
                this.f3298a.f3326a.remove(strArr[i5]);
            }
        }
    }

    public final void a(byte[] bArr, java.lang.String str) {
        if (bArr == null) {
            return;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("https://api.dyneti.com/scans/full/");
            sb.append(str);
            javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL(sb.toString()).openConnection();
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty("User-Agent", "Android Multipart HTTP Client 1.0");
            httpsURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.CONNECTION, com.google.common.net.HttpHeaders.KEEP_ALIVE);
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setReadTimeout(120000);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setRequestProperty("X-API-KEY", this.d);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("multipart/form-data; boundary=");
            sb2.append(obj);
            httpsURLConnection.setRequestProperty("Content-Type", sb2.toString());
            java.io.OutputStream outputStream = httpsURLConnection.getOutputStream();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("--");
            sb3.append(obj);
            sb3.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            outputStream.write(sb3.toString().getBytes());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Content-Disposition: form-data; name=\"file\"; filename=\"");
            sb4.append(str);
            sb4.append(".jpg\"\r\n");
            outputStream.write(sb4.toString().getBytes());
            outputStream.write("Content-Type: image/jpeg\r\n".getBytes());
            outputStream.write(io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes());
            outputStream.write(bArr);
            outputStream.write(io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("--");
            sb5.append(obj);
            sb5.append("--");
            outputStream.write(sb5.toString().getBytes());
            outputStream.flush();
            outputStream.close();
            httpsURLConnection.getResponseCode();
        } catch (java.io.IOException e) {
            e.getMessage();
        }
    }

    public final javax.net.ssl.HttpsURLConnection a() {
        if (this.b.equals("GET")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("https://api.dyneti.com/tokens/");
            sb.append(this.d);
            return (javax.net.ssl.HttpsURLConnection) new java.net.URL(sb.toString()).openConnection();
        }
        return (javax.net.ssl.HttpsURLConnection) new java.net.URL("https://api.dyneti.com/scans/").openConnection();
    }

    public final void a(javax.net.ssl.HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setDoInput(true);
        if (this.b.equals("GET")) {
            httpsURLConnection.setRequestMethod("GET");
            return;
        }
        if (!this.l) {
            b();
        }
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setRequestProperty("Content-Type", "application/json");
        httpsURLConnection.setRequestProperty("X-API-KEY", this.d);
        httpsURLConnection.setRequestMethod("POST");
        java.io.OutputStream outputStream = httpsURLConnection.getOutputStream();
        org.json.JSONObject jSONObject = this.f3298a.f3326a;
        outputStream.write(this.f3298a.f3326a.toString().getBytes());
        outputStream.close();
    }

    public final void a(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.lang.String str, boolean z) {
        com.dyneti.android.dyscan.c cVar = this.m;
        com.dyneti.android.dyscan.l lVar = cVar.c;
        com.dyneti.android.dyscan.l lVar2 = cVar.d;
        byte[] bArr = cVar.f3293a;
        byte[] bArr2 = cVar.b;
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("--");
        sb.append(obj);
        sb.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        java.lang.String obj2 = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("--");
        sb2.append(obj);
        sb2.append("--");
        java.lang.String obj3 = sb2.toString();
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty("User-Agent", "Android Multipart HTTP Client 1.0");
        httpsURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.CONNECTION, com.google.common.net.HttpHeaders.KEEP_ALIVE);
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(120000);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setRequestProperty("X-API-KEY", this.d);
        httpsURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=".concat(java.lang.String.valueOf(obj)));
        java.io.OutputStream outputStream = httpsURLConnection.getOutputStream();
        outputStream.write(obj2.getBytes());
        outputStream.write("Content-Disposition: form-data; name=\"scanId\"\r\n".getBytes());
        outputStream.write(io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes());
        outputStream.write(str.getBytes());
        outputStream.write(io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(256);
        double[] dArr = {lVar.f3318a, lVar.c, lVar.b, lVar.d};
        for (int i = 0; i < 4; i++) {
            double d = dArr[i];
            sb3.append(obj2);
            sb3.append("Content-Disposition: form-data; name=\"cardNumberLocation\"\r\n\r\n");
            sb3.append(d);
            sb3.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        }
        outputStream.write(sb3.toString().getBytes());
        outputStream.write(obj2.getBytes());
        outputStream.write("Content-Disposition: form-data; name=\"awaitScanStorage\"\r\n".getBytes());
        outputStream.write(io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes());
        outputStream.write((z ? "enabled" : "disabled").getBytes());
        outputStream.write(io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes());
        if (bArr2 != null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(256);
            double[] dArr2 = {lVar2.f3318a, lVar2.c, lVar2.b, lVar2.d};
            for (int i2 = 0; i2 < 4; i2++) {
                double d2 = dArr2[i2];
                sb4.append(obj2);
                sb4.append("Content-Disposition: form-data; name=\"scanFrameSize\"\r\n\r\n");
                sb4.append(d2);
                sb4.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            }
            outputStream.write(sb4.toString().getBytes());
            outputStream.write(obj2.getBytes());
            outputStream.write("Content-Disposition: form-data; name=\"resizedWideCrop\"; filename=\"resizedWideblackoutImage.jpg\"\r\n".getBytes());
            outputStream.write("Content-Type: image/jpeg\r\n".getBytes());
            outputStream.write(io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes());
            outputStream.write(bArr2);
            outputStream.write(io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes());
        }
        outputStream.write(obj2.getBytes());
        outputStream.write("Content-Disposition: form-data; name=\"image\"; filename=\"blackoutImage.jpg\"\r\n".getBytes());
        outputStream.write("Content-Type: image/jpeg\r\n".getBytes());
        outputStream.write(io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes());
        outputStream.write(bArr);
        outputStream.write(io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes());
        outputStream.write(obj3.getBytes());
        outputStream.flush();
        outputStream.close();
    }

    public static java.lang.String a(int i) {
        return java.lang.String.format("#%06X", java.lang.Integer.valueOf(i & 16777215));
    }

    public final com.dyneti.android.dyscan.j2 a(org.json.JSONObject jSONObject) {
        if (this.b.equals("GET")) {
            if (!jSONObject.has("isValid") || !((java.lang.Boolean) jSONObject.get("isValid")).booleanValue()) {
                com.dyneti.android.dyscan.e eVar = new com.dyneti.android.dyscan.e(this.e, "POST", this.f, this.g, this.h, new com.dyneti.android.dyscan.n2(), com.dyneti.android.dyscan.i.a(), com.dyneti.android.dyscan.a.a(), com.dyneti.android.dyscan.t1.a());
                eVar.f3298a.a("scanSuccessful", false);
                eVar.f3298a.a("error", "API auth failed");
                eVar.execute(new com.dyneti.android.dyscan.d[0]);
                com.dyneti.android.dyscan.DyScanView dyScanView = (com.dyneti.android.dyscan.DyScanView) this.e;
                dyScanView.i0 = true;
                dyScanView.onPause();
                dyScanView.onDestroy();
                dyScanView.a0.onFailure(2);
            }
        } else if (this.b.equals("POST") && jSONObject.has("scanId")) {
            java.lang.String string = jSONObject.getString("scanId");
            java.lang.Boolean bool = (java.lang.Boolean) jSONObject.opt("allowWaitUntilImageUpload");
            if (!string.isEmpty()) {
                return new com.dyneti.android.dyscan.j2(this.n.a(string, bool));
            }
        }
        return new com.dyneti.android.dyscan.j2(null);
    }
}
