package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class lIllIIlllI {
    public static final /* synthetic */ int[] llIIlIlIIl;

    static {
        int[] iArr = new int[com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset.values().length];
        llIIlIlIIl = iArr;
        try {
            iArr[com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset.DEFAULT_CORNERS_FROM_PHOTOPAY_ACTIVITY.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset.DEFAULT_CORNERS_FROM_BARCODE_SCAN_ACTIVITY.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset.DEFAULT_FROM_OCR_LINE_SCAN_ACTIVITY.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset.DEFAULT_FROM_OCR_LINE_SCAN_ACTIVITY_WITH_INFO.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset.DEFAULT_FROM_DOCUMENT_SCAN_ACTIVITY.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset.DEFAULT_DOCUMENT_DETECTION.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
    }
}
