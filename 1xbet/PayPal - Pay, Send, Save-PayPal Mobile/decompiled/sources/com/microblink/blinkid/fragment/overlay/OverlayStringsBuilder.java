package com.microblink.blinkid.fragment.overlay;

/* loaded from: classes10.dex */
public abstract class OverlayStringsBuilder<Self, Key> {
    private final java.util.HashMap getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
    private final android.content.Context getHighSpeedVideoSizes;

    public OverlayStringsBuilder(android.content.Context context) {
        this.getHighSpeedVideoSizes = context;
    }

    protected abstract java.lang.Object llIIlIlIIl();

    public final java.lang.String llIIlIlIIl(int i) {
        return this.getHighSpeedVideoSizes.getString(i);
    }

    public final java.lang.String llIIlIlIIl(java.lang.Object obj) {
        return (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.get(obj);
    }

    public final java.lang.Object llIIlIlIIl(java.lang.Object obj, java.lang.String str) {
        if (str != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.put(obj, str);
        }
        return llIIlIlIIl();
    }
}
