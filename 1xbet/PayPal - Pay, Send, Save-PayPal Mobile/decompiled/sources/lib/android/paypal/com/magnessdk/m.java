package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
class m extends lib.android.paypal.com.magnessdk.g {
    private static lib.android.paypal.com.magnessdk.m getOutputMinFrameDuration;
    lib.android.paypal.com.magnessdk.d getHighSpeedVideoFpsRangesFor;
    android.os.Handler getInputFormats;
    lib.android.paypal.com.magnessdk.MagnesSettings getInputSizeshNQ4ISI;
    private java.util.List<java.lang.String> getOutputSizes = new java.util.ArrayList();
    private long getOutputStallDurationlomOqCM = 0;
    private boolean getHighSpeedVideoSizesFor = false;
    private boolean getOutputFormats = false;
    boolean Camera2StreamConfigurationMap = false;
    private lib.android.paypal.com.magnessdk.m.d getOutputMinFrameDurationlomOqCM = lib.android.paypal.com.magnessdk.m.d.getHighResolutionOutputSizeshNQ4ISI();
    java.util.HashMap<java.lang.String, android.widget.EditText> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap<>();

    /* loaded from: classes17.dex */
    class c {
        java.lang.String[] Camera2StreamConfigurationMap;
        org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        java.lang.String getHighSpeedVideoSizes;

        c(java.lang.String str, java.util.List<java.lang.String> list, org.json.JSONObject jSONObject, java.lang.String str2) {
            java.lang.String[] strArr = new java.lang.String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i);
            }
            this.getHighSpeedVideoSizes = str;
            this.Camera2StreamConfigurationMap = strArr;
            this.getHighResolutionOutputSizeshNQ4ISI = jSONObject;
            this.getHighSpeedVideoFpsRangesFor = str2;
        }
    }

    static lib.android.paypal.com.magnessdk.m getHighSpeedVideoSizes() {
        lib.android.paypal.com.magnessdk.m mVar;
        synchronized (lib.android.paypal.com.magnessdk.m.class) {
            if (getOutputMinFrameDuration == null) {
                getOutputMinFrameDuration = new lib.android.paypal.com.magnessdk.m();
            }
            mVar = getOutputMinFrameDuration;
        }
        return mVar;
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

    final void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        lib.android.paypal.com.magnessdk.m.d dVar = this.getOutputMinFrameDurationlomOqCM;
        boolean z = dVar.getHighSpeedVideoSizes || dVar.getHighSpeedVideoFpsRanges || dVar.getHighSpeedVideoFpsRangesFor || dVar.Camera2StreamConfigurationMap;
        if (!this.getOutputSizes.isEmpty() || z) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(lib.android.paypal.com.magnessdk.c.m.REGULAR_TYPING_EVENT.toString(), this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes);
                jSONObject.put(lib.android.paypal.com.magnessdk.c.m.AUTO_COMPLETE_EVENT.toString(), this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges);
                jSONObject.put(lib.android.paypal.com.magnessdk.c.m.CUT_EVENT.toString(), this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRangesFor);
                jSONObject.put(lib.android.paypal.com.magnessdk.c.m.BACKSPACE_EVENT.toString(), this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap);
            } catch (java.lang.Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
            }
            getHighSpeedVideoFpsRangesFor(new lib.android.paypal.com.magnessdk.m.c(str, this.getOutputSizes, jSONObject, str2));
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.get(str) != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.remove(str);
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private void getHighSpeedVideoFpsRangesFor(lib.android.paypal.com.magnessdk.m.c cVar) {
        org.json.JSONObject jSONObject;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(lib.android.paypal.com.magnessdk.c.m.FLIGHT_TIME.toString(), new org.json.JSONArray(cVar.Camera2StreamConfigurationMap));
            jSONObject2.put(lib.android.paypal.com.magnessdk.c.m.TELEMETRY_EVENTS.toString(), cVar.getHighResolutionOutputSizeshNQ4ISI);
            jSONObject2.put(lib.android.paypal.com.magnessdk.c.m.VIEW_ID.toString(), cVar.getHighSpeedVideoSizes);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(jSONObject2);
            boolean a2 = lib.android.paypal.com.magnessdk.g.a(this.getHighSpeedVideoFpsRangesFor, lib.android.paypal.com.magnessdk.g.p2);
            if (a2) {
                jSONObject = lib.android.paypal.com.magnessdk.g.getHighSpeedVideoSizes(cVar.getHighSpeedVideoFpsRangesFor, jSONArray, lib.android.paypal.com.magnessdk.g.p2);
            } else {
                java.lang.String str = cVar.getHighSpeedVideoFpsRangesFor;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put(lib.android.paypal.com.magnessdk.c.b.f6933a, str);
                jSONObject3.put(lib.android.paypal.com.magnessdk.g.p2, jSONArray);
                jSONObject = jSONObject3;
            }
            new lib.android.paypal.com.magnessdk.network.c(lib.android.paypal.com.magnessdk.c.h.e.PRODUCTION_JSON_URL, jSONObject, a2, this.getInputSizeshNQ4ISI, this.getInputFormats, lib.android.paypal.com.magnessdk.c.b.d.TELEMETRY).c();
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(lib.android.paypal.com.magnessdk.m mVar, java.lang.String str, java.lang.String str2, boolean z) {
        if (z) {
            mVar.Camera2StreamConfigurationMap = true;
        } else {
            mVar.Camera2StreamConfigurationMap = false;
            mVar.getHighSpeedVideoSizes(str, str2);
        }
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(lib.android.paypal.com.magnessdk.m mVar, java.lang.String str) {
        return mVar.getHighResolutionOutputSizeshNQ4ISI.get(str) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        if (r0 >= r4.length()) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.String Camera2StreamConfigurationMap(lib.android.paypal.com.magnessdk.m mVar, java.lang.String str, java.lang.String str2) {
        int i;
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        if (str != str2) {
            i = 0;
            if (str != null && str2 != null) {
                while (i < str.length() && i < str2.length() && str.charAt(i) == str2.charAt(i)) {
                    i++;
                }
                if (i >= str2.length()) {
                }
            }
            return i != -1000000 ? "" : str2.substring(i);
        }
        i = -1000000;
        if (i != -1000000) {
        }
    }

    static /* synthetic */ void getInputFormats(lib.android.paypal.com.magnessdk.m mVar) {
        mVar.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes = true;
        if (mVar.getOutputStallDurationlomOqCM == 0) {
            mVar.getOutputStallDurationlomOqCM = java.lang.System.currentTimeMillis();
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j = currentTimeMillis - mVar.getOutputStallDurationlomOqCM;
        mVar.getOutputStallDurationlomOqCM = currentTimeMillis;
        if (mVar.getHighSpeedVideoSizesFor) {
            j *= -1;
            mVar.getHighSpeedVideoSizesFor = false;
        }
        if (j != 0) {
            mVar.getOutputSizes.add(java.lang.String.valueOf(j));
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        lib.android.paypal.com.magnessdk.m.d dVar = this.getOutputMinFrameDurationlomOqCM;
        dVar.getHighSpeedVideoSizes = false;
        dVar.getHighSpeedVideoFpsRanges = false;
        dVar.getHighSpeedVideoFpsRangesFor = false;
        dVar.Camera2StreamConfigurationMap = false;
        this.getOutputSizes.clear();
        this.getOutputStallDurationlomOqCM = 0L;
    }

    m() {
    }

    class a implements android.text.TextWatcher {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        java.lang.String getHighSpeedVideoSizes = "";

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            if (!lib.android.paypal.com.magnessdk.m.getHighSpeedVideoFpsRangesFor(lib.android.paypal.com.magnessdk.m.this, this.Camera2StreamConfigurationMap) || charSequence == null) {
                return;
            }
            java.lang.String Camera2StreamConfigurationMap = lib.android.paypal.com.magnessdk.m.Camera2StreamConfigurationMap(lib.android.paypal.com.magnessdk.m.this, this.getHighSpeedVideoSizes, charSequence.toString());
            if (charSequence.length() == 0) {
                lib.android.paypal.com.magnessdk.m mVar = lib.android.paypal.com.magnessdk.m.this;
                if (!mVar.getOutputFormats) {
                    mVar.getOutputStallDurationlomOqCM = java.lang.System.currentTimeMillis();
                    return;
                } else {
                    mVar.getOutputFormats = false;
                    return;
                }
            }
            if (Camera2StreamConfigurationMap.length() > 1) {
                lib.android.paypal.com.magnessdk.m mVar2 = lib.android.paypal.com.magnessdk.m.this;
                if (mVar2.Camera2StreamConfigurationMap) {
                    mVar2.getOutputSizes.add(lib.android.paypal.com.magnessdk.c.m.AUTO_COMPLETE_EVENT.toString());
                    lib.android.paypal.com.magnessdk.m.this.getOutputStallDurationlomOqCM = java.lang.System.currentTimeMillis();
                    lib.android.paypal.com.magnessdk.m.this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges = true;
                    return;
                }
                if (charSequence != "") {
                    mVar2.getOutputSizes.add(lib.android.paypal.com.magnessdk.c.m.PRE_FILLED_EVENT.toString());
                    lib.android.paypal.com.magnessdk.m.this.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI = true;
                    return;
                }
                return;
            }
            lib.android.paypal.com.magnessdk.m mVar3 = lib.android.paypal.com.magnessdk.m.this;
            if (mVar3.getOutputFormats) {
                return;
            }
            if (i2 > i3) {
                mVar3.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap = true;
                mVar3.getHighSpeedVideoSizesFor = true;
            }
            lib.android.paypal.com.magnessdk.m.getInputFormats(mVar3);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            if (!lib.android.paypal.com.magnessdk.m.getHighSpeedVideoFpsRangesFor(lib.android.paypal.com.magnessdk.m.this, this.Camera2StreamConfigurationMap) || charSequence == null) {
                return;
            }
            this.getHighSpeedVideoSizes = charSequence.toString();
            if (i2 - i3 > 1) {
                lib.android.paypal.com.magnessdk.m.this.getOutputSizes.add(lib.android.paypal.com.magnessdk.c.m.CUT_EVENT.toString());
                lib.android.paypal.com.magnessdk.m.this.getOutputStallDurationlomOqCM = java.lang.System.currentTimeMillis();
                lib.android.paypal.com.magnessdk.m mVar = lib.android.paypal.com.magnessdk.m.this;
                mVar.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRangesFor = true;
                mVar.getOutputFormats = true;
            }
        }

        a(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }
    }

    class b implements android.view.View.OnFocusChangeListener {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View view, boolean z) {
            if (lib.android.paypal.com.magnessdk.m.getHighSpeedVideoFpsRangesFor(lib.android.paypal.com.magnessdk.m.this, this.getHighSpeedVideoFpsRanges)) {
                lib.android.paypal.com.magnessdk.m.getHighSpeedVideoFpsRangesFor(lib.android.paypal.com.magnessdk.m.this, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, z);
            }
        }

        b(java.lang.String str, java.lang.String str2) {
            this.getHighSpeedVideoFpsRanges = str;
            this.Camera2StreamConfigurationMap = str2;
        }
    }

    static class d {
        private static lib.android.paypal.com.magnessdk.m.d getInputSizeshNQ4ISI;
        boolean getHighSpeedVideoSizes = false;
        boolean getHighSpeedVideoFpsRangesFor = false;
        boolean getHighSpeedVideoFpsRanges = false;
        boolean getHighResolutionOutputSizeshNQ4ISI = false;
        boolean Camera2StreamConfigurationMap = false;

        static lib.android.paypal.com.magnessdk.m.d getHighResolutionOutputSizeshNQ4ISI() {
            lib.android.paypal.com.magnessdk.m.d dVar;
            synchronized (lib.android.paypal.com.magnessdk.m.d.class) {
                if (getInputSizeshNQ4ISI == null) {
                    getInputSizeshNQ4ISI = new lib.android.paypal.com.magnessdk.m.d();
                }
                dVar = getInputSizeshNQ4ISI;
            }
            return dVar;
        }

        private d() {
        }
    }
}
