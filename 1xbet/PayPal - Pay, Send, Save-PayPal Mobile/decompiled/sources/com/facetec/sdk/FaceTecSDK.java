package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class FaceTecSDK {
    public static final java.lang.String EXTRA_ID_SCAN_RESULTS = "facetecsdk.signup.idScanResult";
    public static final java.lang.String EXTRA_SESSION_RESULTS = "facetecsdk.signup.sessionResult";
    public static final int REQUEST_CODE_SESSION = 1002;
    private static final boolean isMinimalLibrary = com.facetec.sdk.bj.d();

    /* renamed from: a, reason: collision with root package name */
    static com.facetec.sdk.FaceTecCustomization f3366a = new com.facetec.sdk.FaceTecCustomization();
    static com.facetec.sdk.FaceTecCustomization d = null;
    static com.facetec.sdk.FaceTecCustomization c = null;
    static com.facetec.sdk.FaceTecSDK.b e = com.facetec.sdk.FaceTecSDK.b.NORMAL;
    protected static int b = 0;
    protected static int h = 0;
    protected static int j = 0;

    public interface InitializeCallback {
        void onCompletion(boolean z);
    }

    enum b {
        NORMAL,
        LOW_LIGHT_FROM_PHX_FACE,
        LOW_LIGHT_FROM_PHX_ENV,
        LOW_LIGHT_FROM_SENSOR,
        BRIGHT_LIGHT
    }

    public enum CameraPermissionStatus {
        GRANTED("Authorized"),
        NOT_YET_REQUESTED("Not Yet Requested"),
        DENIED("Denied");

        private final java.lang.String c;

        CameraPermissionStatus(java.lang.String str) {
            this.c = str;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.c;
        }
    }

    static boolean b() {
        return e == com.facetec.sdk.FaceTecSDK.b.LOW_LIGHT_FROM_PHX_FACE || e == com.facetec.sdk.FaceTecSDK.b.LOW_LIGHT_FROM_PHX_ENV || e == com.facetec.sdk.FaceTecSDK.b.LOW_LIGHT_FROM_SENSOR;
    }

    static boolean e() {
        return b() && d != null;
    }

    static boolean a() {
        return e == com.facetec.sdk.FaceTecSDK.b.BRIGHT_LIGHT && c != null;
    }

    private FaceTecSDK() {
    }

    public static void initializeInDevelopmentMode(android.content.Context context, java.lang.String str, java.lang.String str2, com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback) {
        com.facetec.sdk.bj.c(context, str, str2, null, initializeCallback);
    }

    public static void initializeInProductionMode(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.facetec.sdk.FaceTecSDK.InitializeCallback initializeCallback) {
        com.facetec.sdk.bj.d(context, str, str2, str3, initializeCallback);
    }

    public static void deinitialize() {
        com.facetec.sdk.bj.a();
    }

    public static void setLowLightCustomization(com.facetec.sdk.FaceTecCustomization faceTecCustomization) {
        d = faceTecCustomization;
    }

    public static void setDynamicDimmingCustomization(com.facetec.sdk.FaceTecCustomization faceTecCustomization) {
        c = faceTecCustomization;
    }

    public static void setCustomization(com.facetec.sdk.FaceTecCustomization faceTecCustomization) {
        if (faceTecCustomization != null) {
            for (int i = 0; i < com.facetec.sdk.du.e.length(); i++) {
                try {
                    org.json.JSONObject jSONObject = com.facetec.sdk.du.e.getJSONObject(i);
                    java.lang.String string = jSONObject.getString("overrideKey");
                    com.facetec.sdk.Cdo cdo = (com.facetec.sdk.Cdo) jSONObject.get("type");
                    if (faceTecCustomization.p.get(string) != null && faceTecCustomization.p.get(string).equals(jSONObject.getString("overrideValue"))) {
                        int i2 = com.facetec.sdk.FaceTecSDK.AnonymousClass3.f3367a[cdo.ordinal()];
                        if (i2 == 1) {
                            faceTecCustomization.f3360a = true;
                        } else if (i2 == 2) {
                            faceTecCustomization.c = false;
                        } else if (i2 == 3) {
                            faceTecCustomization.e = true;
                        } else if (i2 == 4) {
                            faceTecCustomization.b = true;
                        } else if (i2 == 5) {
                            faceTecCustomization.d = true;
                            com.facetec.sdk.du.e(cdo);
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            if (!d(faceTecCustomization.g.buttonBorderWidth)) {
                faceTecCustomization.g.buttonBorderWidth = -1;
            }
            if (!d(faceTecCustomization.i.buttonBorderWidth)) {
                faceTecCustomization.i.buttonBorderWidth = -1;
            }
            if (!d(faceTecCustomization.n.borderWidth)) {
                faceTecCustomization.n.borderWidth = -1;
            }
            if (!d(faceTecCustomization.i.captureScreenTextBackgroundBorderWidth)) {
                faceTecCustomization.i.captureScreenTextBackgroundBorderWidth = -1;
            }
            if (!d(faceTecCustomization.i.reviewScreenTextBackgroundBorderWidth)) {
                faceTecCustomization.i.reviewScreenTextBackgroundBorderWidth = -1;
            }
            if (!d(faceTecCustomization.g.retryScreenImageBorderWidth)) {
                faceTecCustomization.g.retryScreenImageBorderWidth = -1;
            }
            if (!d(faceTecCustomization.f.mainHeaderDividerLineWidth)) {
                faceTecCustomization.f.mainHeaderDividerLineWidth = -1;
            }
            if (!d(faceTecCustomization.f.inputFieldBorderWidth)) {
                faceTecCustomization.f.inputFieldBorderWidth = -1;
            }
            int i3 = faceTecCustomization.n.cornerRadius;
            boolean z = (i3 >= 0 && i3 <= 30) || i3 == -1;
            if (!z) {
                com.facetec.sdk.at.a("An error occurred while setting FaceTecCustomization due to a corner radius value set outside allowed range. Reverting corner radius value to default.");
            }
            if (!z) {
                faceTecCustomization.n.cornerRadius = -1;
            }
            if (!e(faceTecCustomization.l.cornerRadius)) {
                faceTecCustomization.l.cornerRadius = -1;
            }
            if (!e(faceTecCustomization.g.buttonCornerRadius)) {
                faceTecCustomization.g.buttonCornerRadius = -1;
            }
            if (!e(faceTecCustomization.i.buttonCornerRadius)) {
                faceTecCustomization.i.buttonCornerRadius = -1;
            }
            if (!e(faceTecCustomization.i.captureScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.i.captureScreenTextBackgroundCornerRadius = -1;
            }
            if (!e(faceTecCustomization.i.reviewScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.i.reviewScreenTextBackgroundCornerRadius = -1;
            }
            if (!e(faceTecCustomization.g.readyScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.g.readyScreenTextBackgroundCornerRadius = -1;
            }
            if (!e(faceTecCustomization.g.retryScreenImageCornerRadius)) {
                faceTecCustomization.g.retryScreenImageCornerRadius = -1;
            }
            if (!e(faceTecCustomization.f.inputFieldCornerRadius)) {
                faceTecCustomization.f.inputFieldCornerRadius = -1;
            }
            if (!a(faceTecCustomization.k.strokeWidth)) {
                faceTecCustomization.k.strokeWidth = -1;
            }
            if (!a(faceTecCustomization.k.progressStrokeWidth)) {
                faceTecCustomization.k.progressStrokeWidth = -1;
            }
            int i4 = faceTecCustomization.k.progressRadialOffset;
            boolean z2 = (i4 >= 2 && i4 <= 20) || i4 == -1;
            if (!z2) {
                com.facetec.sdk.at.a("An error occurred while setting FaceTecCustomization due to a radial offset value set outside allowed range. Reverting radial offset value to default.");
            }
            if (!z2) {
                faceTecCustomization.k.progressRadialOffset = -1;
            }
            if (faceTecCustomization.g.retryScreenHeaderAttributedString != null && !faceTecCustomization.g.retryScreenHeaderAttributedString.isEmpty()) {
                com.facetec.sdk.dm.i(true);
            }
            if (faceTecCustomization.g.retryScreenSubtextAttributedString != null && !faceTecCustomization.g.retryScreenSubtextAttributedString.isEmpty()) {
                com.facetec.sdk.dm.j(true);
            }
            if (faceTecCustomization.g.readyScreenHeaderAttributedString != null && !faceTecCustomization.g.readyScreenHeaderAttributedString.isEmpty()) {
                com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -1814743289, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{true}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1814743322);
            }
            if (faceTecCustomization.g.readyScreenSubtextAttributedString != null && !faceTecCustomization.g.readyScreenSubtextAttributedString.isEmpty()) {
                com.facetec.sdk.dm.h(true);
            }
            f3366a = faceTecCustomization;
            com.facetec.sdk.bd.a();
        }
    }

    /* renamed from: com.facetec.sdk.FaceTecSDK$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3367a;

        static {
            int[] iArr = new int[com.facetec.sdk.Cdo.values().length];
            f3367a = iArr;
            try {
                iArr[com.facetec.sdk.Cdo.CLICKABLE_READY_SCREEN_SUBTEXT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3367a[com.facetec.sdk.Cdo.DEV_MODE_TAG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3367a[com.facetec.sdk.Cdo.UNCONSTRAINED_GUIDANCE_STRING_LENGTHS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f3367a[com.facetec.sdk.Cdo.STANDALONE_IDSCAN_WATERMARK_CUSTOMIZATION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f3367a[com.facetec.sdk.Cdo.ENABLE_SCREEN_CAPTURING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private static boolean d(int i) {
        boolean z = (i >= 0 && i <= 20) || i == -1;
        if (!z) {
            com.facetec.sdk.at.a("An error occurred while setting FaceTecCustomization due to a border width value set outside allowed range. Reverting border width value to default.");
        }
        return z;
    }

    private static boolean e(int i) {
        boolean z = (i >= 0 && i <= 40) || i == -1;
        if (!z) {
            com.facetec.sdk.at.a("An error occurred while setting FaceTecCustomization due to a corner radius value set outside allowed range. Reverting corner radius value to default.");
        }
        return z;
    }

    private static boolean a(int i) {
        boolean z = (i >= 2 && i <= 20) || i == -1;
        if (!z) {
            com.facetec.sdk.at.a("An error occurred while setting FaceTecCustomization due to a stroke width value set outside allowed range. Reverting stroke width value to default.");
        }
        return z;
    }

    public static com.facetec.sdk.FaceTecSDKStatus getStatus(android.content.Context context) {
        return (com.facetec.sdk.FaceTecSDKStatus) com.facetec.sdk.bj.e(new java.lang.Object[]{context}, -1332564622, 1332564630, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
    }

    public static java.lang.Long getLockoutEndTime(android.content.Context context) {
        return com.facetec.sdk.bj.a(context);
    }

    public static boolean isLockedOut(android.content.Context context) {
        return com.facetec.sdk.bj.b(context);
    }

    public static void preload(android.content.Context context) {
        com.facetec.sdk.bj.e(context, false);
    }

    @java.lang.Deprecated
    public static void unload() {
        com.facetec.sdk.bj.a();
    }

    public static com.facetec.sdk.FaceTecSDK.CameraPermissionStatus getCameraPermissionStatus(android.content.Context context) {
        return com.facetec.sdk.bj.d(context);
    }

    public static void setAuditTrailType(com.facetec.sdk.FaceTecAuditTrailType faceTecAuditTrailType) {
        com.facetec.sdk.bj.e(faceTecAuditTrailType);
    }

    public static void setMaxAuditTrailImages(com.facetec.sdk.FaceTecAuditTrailImagesToReturn faceTecAuditTrailImagesToReturn) {
        com.facetec.sdk.bj.c = faceTecAuditTrailImagesToReturn;
    }

    public static java.lang.String version() {
        return "9.7.108";
    }

    public static java.lang.String createFaceTecAPIUserAgentString(java.lang.String str) {
        return (java.lang.String) com.facetec.sdk.bj.e(new java.lang.Object[]{str}, -1029329835, 1029329840, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
    }

    public static void setDynamicStrings(java.util.Map<java.lang.Integer, java.lang.String> map) {
        com.facetec.sdk.dl.c(map);
    }

    public static void configureOCRLocalization(org.json.JSONObject jSONObject) {
        com.facetec.sdk.bj.d(jSONObject);
    }
}
