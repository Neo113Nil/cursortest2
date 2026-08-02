package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIlIlIIIII extends android.view.OrientationEventListener {
    public com.microblink.blinkid.hardware.orientation.Orientation IlIllIlIIl;
    public final int IllIIIllII;
    public final com.microblink.blinkid.hardware.orientation.OrientationChangeListener llIIlIlIIl;

    public lIlIlIIIII(com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl, com.microblink.blinkid.hardware.orientation.OrientationChangeListener orientationChangeListener) {
        super(ilIlIlllIl.IlIllIlIIl);
        this.llIIlIlIIl = orientationChangeListener;
        int rotation = ((android.view.WindowManager) ilIlIlllIl.IlIllIlIIl.getApplicationContext().getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).getDefaultDisplay().getRotation();
        if (com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(ilIlIlllIl.IlIllIlIIl)) {
            com.microblink.blinkid.util.Log.d(this, "Screen is in portrait", new java.lang.Object[0]);
            if (rotation == 0) {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 0", new java.lang.Object[0]);
                this.IllIIIllII = 0;
            } else if (rotation == 2) {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 180", new java.lang.Object[0]);
                this.IllIIIllII = 0;
            } else if (rotation == 3) {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 270", new java.lang.Object[0]);
                this.IllIIIllII = 270;
            } else {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 90", new java.lang.Object[0]);
                this.IllIIIllII = 270;
            }
        } else {
            com.microblink.blinkid.util.Log.d(this, "Screen is in landscape", new java.lang.Object[0]);
            if (rotation == 1) {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 90", new java.lang.Object[0]);
                this.IllIIIllII = 0;
            } else if (rotation == 3) {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 270", new java.lang.Object[0]);
                this.IllIIIllII = 0;
            } else if (rotation == 0) {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 0", new java.lang.Object[0]);
                this.IllIIIllII = 270;
            } else {
                com.microblink.blinkid.util.Log.d(this, "Screen orientation is 180", new java.lang.Object[0]);
                this.IllIIIllII = 270;
            }
        }
        com.microblink.blinkid.util.Log.d(this, "Calculated degrees offset: {}", java.lang.Integer.valueOf(this.IllIIIllII));
        if (this.IllIIIllII == 270) {
            com.microblink.blinkid.util.Log.d(this, "Natural Orientation is landscape", new java.lang.Object[0]);
            com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl = ilIlIlllIl.IlIllIlIIl();
            if (IlIllIlIIl == null || !ilIlIlllIl.llIIlIlIIl(IlIllIlIIl.lIIIIIllll)) {
                this.IllIIIllII = 270;
            } else {
                this.IllIIIllII = 90;
            }
        } else {
            com.microblink.blinkid.util.Log.d(this, "Natural Orientation is portrait", new java.lang.Object[0]);
        }
        this.IlIllIlIIl = com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2 = this.IllIIIllII;
        com.microblink.blinkid.hardware.orientation.OrientationChangeListener orientationChangeListener = this.llIIlIlIIl;
        if (orientationChangeListener == null || i == -1) {
            return;
        }
        int i3 = (i + i2) % 360;
        com.microblink.blinkid.hardware.orientation.Orientation orientation = i3 < 0 ? this.IlIllIlIIl : (i3 >= 315 || i3 < 45) ? com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT : (i3 < 45 || i3 >= 135) ? (i3 < 135 || i3 >= 225) ? (i3 < 225 || i3 >= 315) ? this.IlIllIlIIl : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT;
        if (orientation != this.IlIllIlIIl) {
            this.IlIllIlIIl = orientation;
            orientationChangeListener.onOrientationChange(orientation);
        }
    }
}
