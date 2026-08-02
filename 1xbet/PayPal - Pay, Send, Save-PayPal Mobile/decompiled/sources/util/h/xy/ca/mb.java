package util.h.xy.ca;

/* loaded from: classes5.dex */
public class mb implements com.gemalto.mfs.mwsdk.provisioning.sdkconfig.VasProvisioningBusinessService {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final java.lang.String getHighSpeedVideoSizes = "util.h.xy.ca.mb";

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.ca.mb f1089;
    private com.gemalto.mfs.mwsdk.provisioning.listener.DataPreparationListener getHighSpeedVideoFpsRangesFor;

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.listener.DataPreparationListener getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.mb mbVar) {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 101) << 1) - (i ^ 101)) % 128;
        com.gemalto.mfs.mwsdk.provisioning.listener.DataPreparationListener dataPreparationListener = mbVar.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 1) + ((i & 1) << 1)) % 128;
        return dataPreparationListener;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.mb mbVar, final java.lang.String str, final com.gemalto.mfs.mwsdk.provisioning.model.DataPreparationResponse dataPreparationResponse) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 49) + (i | 49);
        Camera2StreamConfigurationMap = i2 % 128;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.mb.3
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighResolutionOutputSizeshNQ4ISI;

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = Camera2StreamConfigurationMap + 41;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    if (util.h.xy.ca.mb.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.mb.this) != null) {
                        util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f598);
                        util.h.xy.ca.mb.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.mb.this).onSuccess(str, dataPreparationResponse);
                        int i4 = Camera2StreamConfigurationMap;
                        getHighResolutionOutputSizeshNQ4ISI = (((i4 | 97) << 1) - (i4 ^ 97)) % 128;
                    }
                    int i5 = Camera2StreamConfigurationMap;
                    int i6 = ((i5 | 51) << 1) - (i5 ^ 51);
                    getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    return;
                }
                util.h.xy.ca.mb.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.mb.this);
                throw new java.lang.ArithmeticException();
            }
        });
        int i3 = Camera2StreamConfigurationMap;
        int i4 = (i3 & 81) + (i3 | 81);
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        throw null;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(util.h.xy.ca.mb mbVar, final java.lang.String str, final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        int i = Camera2StreamConfigurationMap + 21;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.mb.2
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = (((i2 | 83) << 1) - (i2 ^ 83)) % 128;
                if (util.h.xy.ca.mb.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.mb.this) != null) {
                    int i3 = Camera2StreamConfigurationMap;
                    getHighResolutionOutputSizeshNQ4ISI = (((i3 | 65) << 1) - (i3 ^ 65)) % 128;
                    util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f611);
                    util.h.xy.ca.mb.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.mb.this).onError(str, provisioningServiceError);
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
                }
                int i4 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = (((i4 | 55) << 1) - (i4 ^ 55)) % 128;
            }
        });
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 75;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            if (i % 2 == 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes() {
        int i = (Camera2StreamConfigurationMap + 113) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        java.lang.String str = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i ^ 115) + ((i & 115) << 1)) % 128;
        return str;
    }

    static {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 75) + (i | 75)) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.ca.mb m25841(android.content.Context context) {
        util.h.xy.ca.mb mbVar;
        synchronized (util.h.xy.ca.mb.class) {
            int i = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 39) + (i | 39)) % 128;
            if (f1089 == null) {
                f1089 = new util.h.xy.ca.mb();
                int i2 = Camera2StreamConfigurationMap;
                int i3 = ((i2 | 19) << 1) - (i2 ^ 19);
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                int i4 = i3 % 2;
            }
            mbVar = f1089;
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 35;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
        return mbVar;
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void initialize() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f722);
        sb.append(util.h.xy.al.ra.f439);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 59) + (i | 59)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void reset() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f722);
        sb.append(30);
        util.h.xy.am.ma.m25027(str, sb.toString());
        this.getHighSpeedVideoFpsRangesFor = null;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i ^ 101) + ((i & 101) << 1)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.VasProvisioningBusinessService
    public void requestDataPreparation(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.gemalto.mfs.mwsdk.provisioning.listener.DataPreparationListener dataPreparationListener) {
        java.lang.String str3 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f722);
        sb.append(util.h.xy.al.ra.f626);
        util.h.xy.am.ma.m25027(str3, sb.toString());
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (((i | 65) << 1) - (i ^ 65)) % 128;
        Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRangesFor = dataPreparationListener;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 95) % 128;
        if (((util.h.xy.ca.ra) com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getEnrollingBusinessService()).isEnrolled() == com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_COMPLETE) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            int i4 = i3 + 3;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                Camera2StreamConfigurationMap = (((i3 | 77) << 1) - (i3 ^ 77)) % 128;
                if (!android.text.TextUtils.isEmpty(str)) {
                    int i5 = Camera2StreamConfigurationMap + 97;
                    getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                    if (i5 % 2 == 0) {
                        android.text.TextUtils.isEmpty(str2);
                        throw new java.lang.ArithmeticException();
                    }
                    if (!android.text.TextUtils.isEmpty(str2) && jSONObject != null) {
                        int i6 = getHighResolutionOutputSizeshNQ4ISI + 5;
                        Camera2StreamConfigurationMap = i6 % 128;
                        if (i6 % 2 != 0) {
                            jSONObject.toString().equals("");
                            throw null;
                        }
                        if (!jSONObject.toString().equals("") && dataPreparationListener != null) {
                            int i7 = getHighResolutionOutputSizeshNQ4ISI + 25;
                            Camera2StreamConfigurationMap = i7 % 128;
                            if (i7 % 2 != 0) {
                                throw null;
                            }
                            new java.lang.Thread(new util.h.xy.ca.mb.b(str, str2, getHighSpeedVideoFpsRangesFor(jSONObject))).start();
                            int i8 = Camera2StreamConfigurationMap;
                            int i9 = (i8 ^ 37) + ((i8 & 37) << 1);
                            getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
                            if (i9 % 2 == 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            int i10 = getHighResolutionOutputSizeshNQ4ISI;
                            Camera2StreamConfigurationMap = ((i10 ^ 71) + ((i10 & 71) << 1)) % 128;
                        }
                    }
                }
                throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f282);
            }
        } else {
            int i11 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i11 ^ 85) + ((i11 & 85) << 1)) % 128;
        }
        dataPreparationListener.onError(str, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ENROLLMENT_REQUIRED, 0, 0, null, util.h.xy.al.ra.f858, null));
        int i12 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i12 ^ 51) + ((i12 & 51) << 1)) % 128;
        int i102 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i102 ^ 71) + ((i102 & 71) << 1)) % 128;
    }

    /* loaded from: classes18.dex */
    final class b implements java.lang.Runnable {
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRangesFor;
        private final java.lang.String Camera2StreamConfigurationMap;
        private final org.json.JSONObject getHighSpeedVideoSizes;
        private final java.lang.String getInputSizeshNQ4ISI;

        b(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
            this.getInputSizeshNQ4ISI = str;
            this.Camera2StreamConfigurationMap = str2;
            this.getHighSpeedVideoSizes = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> m25709 = new util.h.xy.bv.f(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes).m25709();
            if (m25709 != null) {
                int i = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = ((i & 97) + (i | 97)) % 128;
                if (m25709.isSuccessful()) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
                    util.h.xy.ca.mb.getHighSpeedVideoSizes();
                    util.h.xy.bv.rg rgVar = (util.h.xy.bv.rg) m25709.getResult();
                    if (rgVar != null) {
                        util.h.xy.ca.mb.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.mb.this, this.getInputSizeshNQ4ISI, new com.gemalto.mfs.mwsdk.provisioning.model.DataPreparationResponse(rgVar.m25759(), rgVar.m25758()));
                        int i2 = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoFpsRangesFor = (((i2 | 99) << 1) - (i2 ^ 99)) % 128;
                        return;
                    }
                    int i3 = getHighSpeedVideoFpsRangesFor + 91;
                    getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                    if (i3 % 2 != 0) {
                        util.h.xy.ca.mb.getHighSpeedVideoFpsRanges(util.h.xy.ca.mb.this, this.getInputSizeshNQ4ISI, util.h.xy.cg.ra.m25922(m25709));
                        return;
                    } else {
                        util.h.xy.ca.mb.getHighSpeedVideoFpsRanges(util.h.xy.ca.mb.this, this.getInputSizeshNQ4ISI, util.h.xy.cg.ra.m25922(m25709));
                        throw null;
                    }
                }
            }
            util.h.xy.ca.mb.getHighSpeedVideoSizes();
            util.h.xy.ca.mb.getHighSpeedVideoFpsRanges(util.h.xy.ca.mb.this, this.getInputSizeshNQ4ISI, util.h.xy.cg.ra.m25922(m25709));
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
        }
    }

    private org.json.JSONObject getHighSpeedVideoFpsRangesFor(org.json.JSONObject jSONObject) {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 55) + (i | 55)) % 128;
        try {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = (((i2 | 113) << 1) - (i2 ^ 113)) % 128;
                java.lang.String next = keys.next();
                java.lang.Object opt = jSONObject.opt(next);
                if (opt instanceof java.lang.String) {
                    jSONObject.put(next, new java.lang.String(util.h.xy.bx.ra.f1063.m25785(util.h.xy.ar.b.m25076(jSONObject.getString(next)))));
                }
                if (opt instanceof org.json.JSONObject) {
                    int i3 = Camera2StreamConfigurationMap + 119;
                    getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                    if (i3 % 2 == 0) {
                        getHighSpeedVideoFpsRangesFor((org.json.JSONObject) opt);
                        throw null;
                    }
                    getHighSpeedVideoFpsRangesFor((org.json.JSONObject) opt);
                }
            }
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            int i5 = (i4 ^ 59) + ((i4 & 59) << 1);
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                return jSONObject;
            }
            throw null;
        } catch (org.json.JSONException unused) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f283);
        }
    }
}
