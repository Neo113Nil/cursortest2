package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class FaceTecCustomization {
    public static int activityThemeId;
    public static java.lang.String overrideResultScreenSuccessMessage;
    static java.util.HashMap<com.facetec.sdk.dt, java.lang.String> q;
    static java.util.HashMap<com.facetec.sdk.cz, java.lang.String> t;

    /* renamed from: a, reason: collision with root package name */
    boolean f3360a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    public boolean enableOfficialIDPhoto;
    public int exitAnimationSuccessResourceID;
    public int exitAnimationUnsuccessResourceID;
    com.facetec.sdk.FaceTecOCRConfirmationCustomization f;
    com.facetec.sdk.FaceTecGuidanceCustomization g;
    com.facetec.sdk.FaceTecResultScreenCustomization h;
    com.facetec.sdk.FaceTecIDScanCustomization i;
    com.facetec.sdk.FaceTecOverlayCustomization j;
    com.facetec.sdk.FaceTecOvalCustomization k;
    com.facetec.sdk.FaceTecFeedbackCustomization l;
    com.facetec.sdk.FaceTecInitialLoadingAnimationCustomization m;
    com.facetec.sdk.FaceTecFrameCustomization n;

    /* renamed from: o, reason: collision with root package name */
    com.facetec.sdk.FaceTecCancelButtonCustomization f3361o;
    java.util.Map<java.lang.String, java.lang.String> p;
    com.facetec.sdk.FaceTecExitAnimationStyle r;
    com.facetec.sdk.FaceTecExitAnimationStyle s;
    public com.facetec.sdk.FaceTecSecurityWatermarkImage securityWatermarkImage;
    public com.facetec.sdk.FaceTecVocalGuidanceCustomization vocalGuidanceCustomization;

    public static void setIDScanResultScreenMessageOverrides(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15) {
        java.util.HashMap<com.facetec.sdk.cz, java.lang.String> hashMap = new java.util.HashMap<>();
        t = hashMap;
        hashMap.put(com.facetec.sdk.cz.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str11);
        t.put(com.facetec.sdk.cz.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str12);
        t.put(com.facetec.sdk.cz.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str13);
        t.put(com.facetec.sdk.cz.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED, str14);
        t.put(com.facetec.sdk.cz.IDSCAN_SKIP_OR_ERROR_NFC, str15);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE, str);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT, str3);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_BACK_SIDE, str4);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT, str5);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_PASSPORT, str6);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_PASSPORT_NFC_NEXT, str7);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_USER_CONFIRMATION, str8);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_NFC, str9);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_ADDITIONAL_REVIEW, str10);
    }

    @java.lang.Deprecated
    public static void setIDScanResultScreenMessageOverrides(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14) {
        com.facetec.sdk.at.a(java.lang.String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", "setIDScanResultScreenMessageOverrides"));
        java.util.HashMap<com.facetec.sdk.cz, java.lang.String> hashMap = new java.util.HashMap<>();
        t = hashMap;
        hashMap.put(com.facetec.sdk.cz.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str10);
        t.put(com.facetec.sdk.cz.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str11);
        t.put(com.facetec.sdk.cz.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str12);
        t.put(com.facetec.sdk.cz.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED, str13);
        t.put(com.facetec.sdk.cz.IDSCAN_SKIP_OR_ERROR_NFC, str14);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE, str);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT, str3);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_BACK_SIDE, str4);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT, str5);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_PASSPORT, str6);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_PASSPORT_NFC_NEXT, str7);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_USER_CONFIRMATION, str8);
        t.put(com.facetec.sdk.cz.IDSCAN_SUCCESS_NFC, str9);
    }

    public static void setIDScanUploadMessageOverrides(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20) {
        java.util.HashMap<com.facetec.sdk.dt, java.lang.String> hashMap = new java.util.HashMap<>();
        q = hashMap;
        hashMap.put(com.facetec.sdk.dt.IDSCAN_FRONT_SIDE_UPLOAD_STARTED, str);
        q.put(com.facetec.sdk.dt.IDSCAN_FRONT_SIDE_STILL_UPLOADING, str2);
        q.put(com.facetec.sdk.dt.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str3);
        q.put(com.facetec.sdk.dt.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str4);
        q.put(com.facetec.sdk.dt.IDSCAN_BACK_SIDE_UPLOAD_STARTED, str5);
        q.put(com.facetec.sdk.dt.IDSCAN_BACK_SIDE_STILL_UPLOADING, str6);
        q.put(com.facetec.sdk.dt.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str7);
        q.put(com.facetec.sdk.dt.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str8);
        q.put(com.facetec.sdk.dt.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED, str9);
        q.put(com.facetec.sdk.dt.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING, str10);
        q.put(com.facetec.sdk.dt.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE, str11);
        q.put(com.facetec.sdk.dt.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING, str12);
        q.put(com.facetec.sdk.dt.NFC_UPLOAD_STARTED, str13);
        q.put(com.facetec.sdk.dt.NFC_STILL_UPLOADING, str14);
        q.put(com.facetec.sdk.dt.NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE, str15);
        q.put(com.facetec.sdk.dt.NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING, str16);
        q.put(com.facetec.sdk.dt.SKIPPED_NFC_UPLOAD_STARTED, str17);
        q.put(com.facetec.sdk.dt.SKIPPED_NFC_STILL_UPLOADING, str18);
        q.put(com.facetec.sdk.dt.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE, str19);
        q.put(com.facetec.sdk.dt.SKIPPED_NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING, str20);
    }

    public FaceTecCustomization(java.util.Map<java.lang.String, java.lang.String> map) {
        this.c = true;
        this.f3360a = false;
        this.e = false;
        this.b = false;
        this.d = false;
        this.enableOfficialIDPhoto = false;
        this.n = new com.facetec.sdk.FaceTecFrameCustomization();
        this.l = new com.facetec.sdk.FaceTecFeedbackCustomization();
        this.k = new com.facetec.sdk.FaceTecOvalCustomization();
        this.f3361o = new com.facetec.sdk.FaceTecCancelButtonCustomization();
        this.g = new com.facetec.sdk.FaceTecGuidanceCustomization();
        this.h = new com.facetec.sdk.FaceTecResultScreenCustomization();
        this.j = new com.facetec.sdk.FaceTecOverlayCustomization();
        this.i = new com.facetec.sdk.FaceTecIDScanCustomization();
        this.f = new com.facetec.sdk.FaceTecOCRConfirmationCustomization();
        this.m = new com.facetec.sdk.FaceTecInitialLoadingAnimationCustomization();
        this.s = com.facetec.sdk.FaceTecExitAnimationStyle.RIPPLE_OUT;
        this.r = com.facetec.sdk.FaceTecExitAnimationStyle.NONE;
        this.exitAnimationUnsuccessResourceID = -1;
        this.exitAnimationSuccessResourceID = -1;
        this.p = map;
        this.securityWatermarkImage = com.facetec.sdk.FaceTecSecurityWatermarkImage.FACETEC_ZOOM;
        this.vocalGuidanceCustomization = new com.facetec.sdk.FaceTecVocalGuidanceCustomization();
    }

    public FaceTecCustomization() {
        this(new java.util.HashMap());
    }

    public final void setExitAnimationSuccessCustom(com.facetec.sdk.FaceTecExitAnimationStyle faceTecExitAnimationStyle) {
        if (faceTecExitAnimationStyle == null) {
            faceTecExitAnimationStyle = com.facetec.sdk.FaceTecExitAnimationStyle.CIRCLE_FADE;
        }
        this.s = faceTecExitAnimationStyle;
        com.facetec.sdk.FaceTecExitAnimationStyle faceTecExitAnimationStyle2 = com.facetec.sdk.FaceTecExitAnimationStyle.CIRCLE_FADE;
    }

    public final com.facetec.sdk.FaceTecExitAnimationStyle getExitAnimationSuccessCustom() {
        return this.s;
    }

    public final void setExitAnimationUnsuccessCustom(com.facetec.sdk.FaceTecExitAnimationStyle faceTecExitAnimationStyle) {
        if (faceTecExitAnimationStyle == null) {
            faceTecExitAnimationStyle = com.facetec.sdk.FaceTecExitAnimationStyle.CIRCLE_FADE;
        }
        this.r = faceTecExitAnimationStyle;
        com.facetec.sdk.FaceTecExitAnimationStyle faceTecExitAnimationStyle2 = com.facetec.sdk.FaceTecExitAnimationStyle.CIRCLE_FADE;
    }

    public final com.facetec.sdk.FaceTecExitAnimationStyle getExitAnimationUnsuccessCustom() {
        return this.r;
    }

    public final void setFrameCustomization(com.facetec.sdk.FaceTecFrameCustomization faceTecFrameCustomization) {
        if (faceTecFrameCustomization == null) {
            faceTecFrameCustomization = new com.facetec.sdk.FaceTecFrameCustomization();
        }
        this.n = faceTecFrameCustomization;
    }

    public final com.facetec.sdk.FaceTecFrameCustomization getFrameCustomization() {
        return this.n;
    }

    public final void setFeedbackCustomization(com.facetec.sdk.FaceTecFeedbackCustomization faceTecFeedbackCustomization) {
        if (faceTecFeedbackCustomization == null) {
            faceTecFeedbackCustomization = new com.facetec.sdk.FaceTecFeedbackCustomization();
        }
        this.l = faceTecFeedbackCustomization;
    }

    public final com.facetec.sdk.FaceTecFeedbackCustomization getFeedbackCustomization() {
        return this.l;
    }

    public final void setOvalCustomization(com.facetec.sdk.FaceTecOvalCustomization faceTecOvalCustomization) {
        if (faceTecOvalCustomization == null) {
            faceTecOvalCustomization = new com.facetec.sdk.FaceTecOvalCustomization();
        }
        this.k = faceTecOvalCustomization;
    }

    public final com.facetec.sdk.FaceTecOvalCustomization getOvalCustomization() {
        return this.k;
    }

    public final void setCancelButtonCustomization(com.facetec.sdk.FaceTecCancelButtonCustomization faceTecCancelButtonCustomization) {
        if (faceTecCancelButtonCustomization == null) {
            faceTecCancelButtonCustomization = new com.facetec.sdk.FaceTecCancelButtonCustomization();
        }
        this.f3361o = faceTecCancelButtonCustomization;
    }

    public final com.facetec.sdk.FaceTecCancelButtonCustomization getCancelButtonCustomization() {
        return this.f3361o;
    }

    public final com.facetec.sdk.FaceTecGuidanceCustomization getGuidanceCustomization() {
        return this.g;
    }

    public final void setGuidanceCustomization(com.facetec.sdk.FaceTecGuidanceCustomization faceTecGuidanceCustomization) {
        if (faceTecGuidanceCustomization == null) {
            faceTecGuidanceCustomization = new com.facetec.sdk.FaceTecGuidanceCustomization();
        }
        this.g = faceTecGuidanceCustomization;
    }

    public final com.facetec.sdk.FaceTecResultScreenCustomization getResultScreenCustomization() {
        return this.h;
    }

    public final void setResultScreenCustomization(com.facetec.sdk.FaceTecResultScreenCustomization faceTecResultScreenCustomization) {
        if (faceTecResultScreenCustomization == null) {
            faceTecResultScreenCustomization = new com.facetec.sdk.FaceTecResultScreenCustomization();
        }
        this.h = faceTecResultScreenCustomization;
    }

    public final com.facetec.sdk.FaceTecOverlayCustomization getOverlayCustomization() {
        return this.j;
    }

    public final void setOverlayCustomization(com.facetec.sdk.FaceTecOverlayCustomization faceTecOverlayCustomization) {
        if (faceTecOverlayCustomization == null) {
            faceTecOverlayCustomization = new com.facetec.sdk.FaceTecOverlayCustomization();
        }
        this.j = faceTecOverlayCustomization;
    }

    public final com.facetec.sdk.FaceTecIDScanCustomization getIdScanCustomization() {
        return this.i;
    }

    public final void setIdScanCustomization(com.facetec.sdk.FaceTecIDScanCustomization faceTecIDScanCustomization) {
        if (faceTecIDScanCustomization == null) {
            faceTecIDScanCustomization = new com.facetec.sdk.FaceTecIDScanCustomization();
        }
        this.i = faceTecIDScanCustomization;
    }

    public final com.facetec.sdk.FaceTecOCRConfirmationCustomization getOcrConfirmationCustomization() {
        return this.f;
    }

    public final void setOcrConfirmationCustomization(com.facetec.sdk.FaceTecOCRConfirmationCustomization faceTecOCRConfirmationCustomization) {
        if (faceTecOCRConfirmationCustomization == null) {
            faceTecOCRConfirmationCustomization = new com.facetec.sdk.FaceTecOCRConfirmationCustomization();
        }
        this.f = faceTecOCRConfirmationCustomization;
    }

    public final com.facetec.sdk.FaceTecInitialLoadingAnimationCustomization getInitialLoadingAnimationCustomization() {
        return this.m;
    }

    public final void setInitialLoadingAnimationCustomization(com.facetec.sdk.FaceTecInitialLoadingAnimationCustomization faceTecInitialLoadingAnimationCustomization) {
        if (faceTecInitialLoadingAnimationCustomization == null) {
            faceTecInitialLoadingAnimationCustomization = new com.facetec.sdk.FaceTecInitialLoadingAnimationCustomization();
        }
        this.m = faceTecInitialLoadingAnimationCustomization;
    }
}
