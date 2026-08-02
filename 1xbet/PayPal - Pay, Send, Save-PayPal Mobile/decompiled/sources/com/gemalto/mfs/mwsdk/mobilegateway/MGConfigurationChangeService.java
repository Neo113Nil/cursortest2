package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes8.dex */
public class MGConfigurationChangeService extends androidx.core.app.JobIntentService {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 60;

    static {
        int i = 60 % 2;
    }

    public static void enqueueWork(android.content.Context context, android.content.Intent intent) {
        int i = getHighSpeedVideoSizes + 95;
        getHighSpeedVideoFpsRangesFor = i % 128;
        enqueueWork(context, (java.lang.Class<?>) com.gemalto.mfs.mwsdk.mobilegateway.MGConfigurationChangeService.class, i % 2 == 0 ? 48 : 110, intent);
        int i2 = getHighSpeedVideoSizes;
        int i3 = ((i2 | 53) << 1) - (i2 ^ 53);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 51) % 128;
        super.onStartCommand(intent, i, i2);
        if (util.h.xy.ag.a.m24556().m24558() == null) {
            int i3 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i3 & 89) + (i3 | 89)) % 128;
            util.h.xy.ag.a.m24556().m24559(getApplicationContext());
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 69) % 128;
        return 1;
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(android.content.Intent intent) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f804);
        sb.append(util.h.xy.al.ra.f540);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String stringExtra = intent.getStringExtra(util.h.xy.al.ra.f359);
        if (stringExtra != null && stringExtra.equalsIgnoreCase(util.h.xy.al.ra.f477)) {
            int i = getHighSpeedVideoFpsRangesFor + 91;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                intent.getStringExtra(util.h.xy.al.ra.f536);
                throw null;
            }
            java.lang.String stringExtra2 = intent.getStringExtra(util.h.xy.al.ra.f536);
            if (stringExtra2 != null) {
                int i2 = getHighSpeedVideoSizes;
                int i3 = (i2 & 49) + (i2 | 49);
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                if (stringExtra2.length() > 0) {
                    util.h.xy.au.rb.f877.m25200(stringExtra2);
                    int i4 = getHighSpeedVideoSizes;
                    int i5 = (i4 ^ 61) + ((i4 & 61) << 1);
                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 4 / 3;
                    }
                }
            }
            int i7 = getHighSpeedVideoSizes;
            int i8 = (i7 & 103) + (i7 | 103);
            getHighSpeedVideoFpsRangesFor = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 / 4;
                return;
            }
            return;
        }
        if (stringExtra != null) {
            int i10 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (((i10 | 99) << 1) - (i10 ^ 99)) % 128;
            if (stringExtra.equalsIgnoreCase(util.h.xy.al.ra.f522)) {
                int i11 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = (((i11 | 113) << 1) - (i11 ^ 113)) % 128;
                java.lang.String stringExtra3 = intent.getStringExtra(util.h.xy.al.ra.f536);
                if (stringExtra3 != null) {
                    int i12 = getHighSpeedVideoSizes;
                    int i13 = (i12 ^ 17) + ((i12 & 17) << 1);
                    getHighSpeedVideoFpsRangesFor = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (stringExtra3.length() > 0) {
                        try {
                            util.h.xy.au.rb.f877.m25201(stringExtra3);
                            return;
                        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e) {
                            e.getMessage();
                            e.printStackTrace();
                            return;
                        } catch (org.json.JSONException e2) {
                            e2.getMessage();
                            e2.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (stringExtra == null || !intent.getStringExtra(util.h.xy.al.ra.f359).equalsIgnoreCase(util.h.xy.al.ra.f525)) {
            return;
        }
        util.h.xy.au.rb.f877.m25199();
        int i14 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (((i14 | 77) << 1) - (i14 ^ 77)) % 128;
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onDestroy() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 41) + ((i & 41) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
        } else {
            super.onDestroy();
            throw null;
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
