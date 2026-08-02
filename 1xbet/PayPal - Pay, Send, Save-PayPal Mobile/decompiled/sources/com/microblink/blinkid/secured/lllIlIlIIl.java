package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class lllIlIlIIl {
    public static final /* synthetic */ int[] llIIlIlIIl;

    static {
        int[] iArr = new int[com.microblink.blinkid.hardware.orientation.Orientation.values().length];
        llIIlIlIIl = iArr;
        try {
            iArr[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
    }
}
