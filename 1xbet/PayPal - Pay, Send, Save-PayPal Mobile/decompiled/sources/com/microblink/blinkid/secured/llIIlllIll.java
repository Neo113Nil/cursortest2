package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class llIIlllIll {
    public static final /* synthetic */ int[] llIIlIlIIl;

    static {
        int[] iArr = new int[com.microblink.blinkid.view.surface.CameraSurface.values().length];
        llIIlIlIIl = iArr;
        try {
            iArr[com.microblink.blinkid.view.surface.CameraSurface.SURFACE_SURFACE_VIEW.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.surface.CameraSurface.SURFACE_TEXTURE_VIEW.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.surface.CameraSurface.SURFACE_DEFAULT.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}
