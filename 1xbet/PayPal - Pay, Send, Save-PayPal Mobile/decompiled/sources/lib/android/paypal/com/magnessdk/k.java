package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
public class k extends lib.android.paypal.com.magnessdk.g {
    private static lib.android.paypal.com.magnessdk.k getHighSpeedVideoSizesFor;
    lib.android.paypal.com.magnessdk.MagnesSettings Camera2StreamConfigurationMap;
    lib.android.paypal.com.magnessdk.d getHighResolutionOutputSizeshNQ4ISI;
    android.os.Handler getHighSpeedVideoFpsRangesFor;
    private org.json.JSONArray getInputFormats = new org.json.JSONArray();
    private org.json.JSONArray getOutputFormats = new org.json.JSONArray();
    private org.json.JSONArray getOutputMinFrameDuration = new org.json.JSONArray();

    @Override // lib.android.paypal.com.magnessdk.g
    final org.json.JSONObject Camera2StreamConfigurationMap() {
        return null;
    }

    public void a(lib.android.paypal.com.magnessdk.c.b.d dVar, java.lang.String str, java.lang.String str2) {
        org.json.JSONArray jSONArray;
        if (getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getMagnesSource(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges, "e", this.Camera2StreamConfigurationMap.getContext())) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.b.EnumC0219b.FIELD.toString(), str);
                jSONObject.put(lib.android.paypal.com.magnessdk.c.b.EnumC0219b.ISSUE.toString(), str2);
                jSONObject.put(lib.android.paypal.com.magnessdk.c.b.EnumC0219b.LOCATION.toString(), dVar.toString());
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
            int i = lib.android.paypal.com.magnessdk.k.a.getHighResolutionOutputSizeshNQ4ISI[dVar.ordinal()];
            if (i == 1) {
                jSONArray = this.getInputFormats;
            } else if (i == 2) {
                jSONArray = this.getOutputFormats;
            } else if (i != 3) {
                return;
            } else {
                jSONArray = this.getOutputMinFrameDuration;
            }
            jSONArray.put(jSONObject);
        }
    }

    @Override // lib.android.paypal.com.magnessdk.g
    final org.json.JSONObject getHighSpeedVideoFpsRanges(lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings, lib.android.paypal.com.magnessdk.d dVar, lib.android.paypal.com.magnessdk.e eVar) {
        return null;
    }

    @Override // lib.android.paypal.com.magnessdk.g
    final void getHighSpeedVideoSizes(int i, lib.android.paypal.com.magnessdk.MagnesSettings magnesSettings) {
    }

    public static lib.android.paypal.com.magnessdk.k b() {
        lib.android.paypal.com.magnessdk.k kVar;
        synchronized (lib.android.paypal.com.magnessdk.k.class) {
            if (getHighSpeedVideoSizesFor == null) {
                getHighSpeedVideoSizesFor = new lib.android.paypal.com.magnessdk.k();
            }
            kVar = getHighSpeedVideoSizesFor;
        }
        return kVar;
    }

    public void a(lib.android.paypal.com.magnessdk.c.b.d dVar, java.lang.String str) {
        a(dVar, str, "", "");
    }

    public void a(lib.android.paypal.com.magnessdk.c.b.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONArray jSONArray;
        if (getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getMagnesSource(), lib.android.paypal.com.magnessdk.g.getHighSpeedVideoFpsRanges, "e", this.Camera2StreamConfigurationMap.getContext())) {
            try {
                int i = lib.android.paypal.com.magnessdk.k.a.getHighResolutionOutputSizeshNQ4ISI[dVar.ordinal()];
                if (i == 1) {
                    org.json.JSONArray jSONArray2 = this.getInputFormats;
                    if (jSONArray2 == null || jSONArray2.length() <= 0) {
                        return;
                    }
                    org.json.JSONObject highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                    highResolutionOutputSizeshNQ4ISI.put(lib.android.paypal.com.magnessdk.c.b.f6933a, str);
                    if (str2 != null && !str2.isEmpty()) {
                        highResolutionOutputSizeshNQ4ISI.put(lib.android.paypal.com.magnessdk.c.d.APP_GUID.toString(), str2);
                    }
                    if (str3 != null && !str3.isEmpty()) {
                        highResolutionOutputSizeshNQ4ISI.put(lib.android.paypal.com.magnessdk.c.e.IP_ADDRS.toString(), str3);
                    }
                    highResolutionOutputSizeshNQ4ISI.put(lib.android.paypal.com.magnessdk.c.b.EnumC0219b.ERROR_DETAILS.toString(), this.getInputFormats);
                    new lib.android.paypal.com.magnessdk.network.c(lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_ERROR_URL, highResolutionOutputSizeshNQ4ISI, false, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, lib.android.paypal.com.magnessdk.c.b.d.ERROR).c();
                    this.getInputFormats = new org.json.JSONArray();
                    return;
                }
                if (i != 2) {
                    if (i != 3 || (jSONArray = this.getOutputMinFrameDuration) == null || jSONArray.length() <= 0) {
                        return;
                    }
                    org.json.JSONObject highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI();
                    highResolutionOutputSizeshNQ4ISI2.put(lib.android.paypal.com.magnessdk.c.b.f6933a, str);
                    highResolutionOutputSizeshNQ4ISI2.put(lib.android.paypal.com.magnessdk.c.b.EnumC0219b.ERROR_DETAILS.toString(), this.getOutputMinFrameDuration);
                    new lib.android.paypal.com.magnessdk.network.c(lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_ERROR_URL, highResolutionOutputSizeshNQ4ISI2, false, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, lib.android.paypal.com.magnessdk.c.b.d.ERROR).c();
                    this.getOutputMinFrameDuration = new org.json.JSONArray();
                    return;
                }
                org.json.JSONArray jSONArray3 = this.getOutputFormats;
                if (jSONArray3 == null || jSONArray3.length() <= 0) {
                    return;
                }
                org.json.JSONObject highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI();
                highResolutionOutputSizeshNQ4ISI3.put(lib.android.paypal.com.magnessdk.c.b.f6933a, str);
                highResolutionOutputSizeshNQ4ISI3.put(lib.android.paypal.com.magnessdk.c.b.EnumC0219b.ERROR_DETAILS.toString(), this.getOutputFormats);
                new lib.android.paypal.com.magnessdk.network.c(lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_ERROR_URL, highResolutionOutputSizeshNQ4ISI3, false, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, lib.android.paypal.com.magnessdk.c.b.d.ERROR).c();
                this.getOutputFormats = new org.json.JSONArray();
            } catch (java.lang.Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            }
        }
    }

    private org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.Map<java.lang.String, java.lang.String> b = lib.android.paypal.com.magnessdk.f.b(this.Camera2StreamConfigurationMap.getContext());
            if (b != null && b.size() > 0) {
                return new org.json.JSONObject(b);
            }
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
        }
        return jSONObject;
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.b.d.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.b.d.MAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[lib.android.paypal.com.magnessdk.c.b.d.SENSOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[lib.android.paypal.com.magnessdk.c.b.d.TOUCH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}
