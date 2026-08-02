package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
final class l extends lib.android.paypal.com.magnessdk.g {
    private static lib.android.paypal.com.magnessdk.l getOutputSizes;
    lib.android.paypal.com.magnessdk.o Camera2StreamConfigurationMap;
    lib.android.paypal.com.magnessdk.o getHighResolutionOutputSizeshNQ4ISI;
    lib.android.paypal.com.magnessdk.o getHighSpeedVideoFpsRangesFor;
    lib.android.paypal.com.magnessdk.MagnesSettings getHighSpeedVideoSizesFor;
    lib.android.paypal.com.magnessdk.d getInputFormats;
    org.json.JSONObject getInputSizeshNQ4ISI;
    android.os.Handler getOutputFormats;
    lib.android.paypal.com.magnessdk.e getOutputMinFrameDuration;

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
        lib.android.paypal.com.magnessdk.o oVar;
        try {
            android.content.Context context = magnesSettings.getContext();
            if (i != 96) {
                if (i != 97) {
                    if (i != 102 || !this.getOutputMinFrameDuration.a(i)) {
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = new lib.android.paypal.com.magnessdk.o(context, this.getOutputFormats, 2, this.getOutputMinFrameDuration.k());
                    if (!this.getInputSizeshNQ4ISI.optBoolean(lib.android.paypal.com.magnessdk.c.l.MG.toString(), false)) {
                        return;
                    } else {
                        oVar = this.getHighResolutionOutputSizeshNQ4ISI;
                    }
                } else {
                    if (!this.getOutputMinFrameDuration.a(i)) {
                        return;
                    }
                    this.Camera2StreamConfigurationMap = new lib.android.paypal.com.magnessdk.o(context, this.getOutputFormats, 4, this.getOutputMinFrameDuration.k());
                    if (!this.getInputSizeshNQ4ISI.optBoolean(lib.android.paypal.com.magnessdk.c.l.GY.toString(), false)) {
                        return;
                    } else {
                        oVar = this.Camera2StreamConfigurationMap;
                    }
                }
            } else {
                if (!this.getOutputMinFrameDuration.a(i)) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = new lib.android.paypal.com.magnessdk.o(context, this.getOutputFormats, 1, this.getOutputMinFrameDuration.k());
                if (!this.getInputSizeshNQ4ISI.optBoolean(lib.android.paypal.com.magnessdk.c.l.AC.toString(), false)) {
                    return;
                } else {
                    oVar = this.getHighSpeedVideoFpsRangesFor;
                }
            }
            oVar.c();
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.l.class, 3, e);
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(lib.android.paypal.com.magnessdk.l lVar, java.lang.String str, org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject;
        try {
            boolean a2 = lib.android.paypal.com.magnessdk.g.a(lVar.getInputFormats, lib.android.paypal.com.magnessdk.g.n2);
            if (a2) {
                jSONObject = lib.android.paypal.com.magnessdk.g.getHighSpeedVideoSizes(str, jSONArray, lib.android.paypal.com.magnessdk.g.n2);
            } else {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(lib.android.paypal.com.magnessdk.c.b.f6933a, str);
                jSONObject2.put(lib.android.paypal.com.magnessdk.g.n2, jSONArray);
                jSONObject = jSONObject2;
            }
            new lib.android.paypal.com.magnessdk.network.c(lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_JSON_URL, jSONObject, a2, lVar.getHighSpeedVideoSizesFor, lVar.getOutputFormats, lib.android.paypal.com.magnessdk.c.b.d.SENSOR).c();
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.l.class, 3, e);
        }
    }

    class a implements java.lang.Runnable {
        final /* synthetic */ lib.android.paypal.com.magnessdk.o Camera2StreamConfigurationMap;
        final /* synthetic */ lib.android.paypal.com.magnessdk.o getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ lib.android.paypal.com.magnessdk.o getHighSpeedVideoSizes;

        @Override // java.lang.Runnable
        public void run() {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (this.Camera2StreamConfigurationMap != null && lib.android.paypal.com.magnessdk.l.this.getInputSizeshNQ4ISI.optBoolean(lib.android.paypal.com.magnessdk.c.l.AC.toString(), false)) {
                jSONArray.put(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes());
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI != null && lib.android.paypal.com.magnessdk.l.this.getInputSizeshNQ4ISI.optBoolean(lib.android.paypal.com.magnessdk.c.l.GY.toString(), false)) {
                jSONArray.put(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes());
            }
            if (this.getHighSpeedVideoSizes != null && lib.android.paypal.com.magnessdk.l.this.getInputSizeshNQ4ISI.optBoolean(lib.android.paypal.com.magnessdk.c.l.MG.toString(), false)) {
                jSONArray.put(this.getHighSpeedVideoSizes.getHighSpeedVideoSizes());
            }
            if (jSONArray.length() > 0) {
                lib.android.paypal.com.magnessdk.l.Camera2StreamConfigurationMap(lib.android.paypal.com.magnessdk.l.this, this.getHighSpeedVideoFpsRanges, jSONArray);
            }
        }

        a(lib.android.paypal.com.magnessdk.o oVar, lib.android.paypal.com.magnessdk.o oVar2, lib.android.paypal.com.magnessdk.o oVar3, java.lang.String str) {
            this.Camera2StreamConfigurationMap = oVar;
            this.getHighResolutionOutputSizeshNQ4ISI = oVar2;
            this.getHighSpeedVideoSizes = oVar3;
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    static lib.android.paypal.com.magnessdk.l getHighSpeedVideoFpsRangesFor() {
        lib.android.paypal.com.magnessdk.l lVar;
        synchronized (lib.android.paypal.com.magnessdk.l.class) {
            if (getOutputSizes == null) {
                getOutputSizes = new lib.android.paypal.com.magnessdk.l();
            }
            lVar = getOutputSizes;
        }
        return lVar;
    }

    l() {
    }
}
