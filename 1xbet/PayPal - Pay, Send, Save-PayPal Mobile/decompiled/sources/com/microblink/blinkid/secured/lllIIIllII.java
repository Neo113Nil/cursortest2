package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lllIIIllII extends android.hardware.camera2.CameraDevice.StateCallback {
    public final /* synthetic */ com.microblink.blinkid.secured.IlllllIIIl llIIlIlIIl;

    public lllIIIllII(com.microblink.blinkid.secured.IlllllIIIl illlllIIIl) {
        this.llIIlIlIIl = illlllIIIl;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
        com.microblink.blinkid.secured.IlllllIIIl illlllIIIl = this.llIIlIlIIl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Closing from disconnected ");
        sb.append(this.llIIlIlIIl.hashCode());
        com.microblink.blinkid.util.Log.d(illlllIIIl, sb.toString(), new java.lang.Object[0]);
        this.llIIlIlIIl.llIIlIlIIl();
        this.llIIlIlIIl.IllIIIIllI.llIIlIlIIl(new java.lang.Exception("Camera has been disconnected!"));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(android.hardware.camera2.CameraDevice cameraDevice, int i) {
        com.microblink.blinkid.secured.IlllllIIIl illlllIIIl = this.llIIlIlIIl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Closing from error ");
        sb.append(this.llIIlIlIIl.hashCode());
        com.microblink.blinkid.util.Log.d(illlllIIIl, sb.toString(), new java.lang.Object[0]);
        this.llIIlIlIIl.llIIlIlIIl();
        this.llIIlIlIIl.IllIIIIllI.llIIlIlIIl(new java.lang.Exception(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown camera error: ".concat(java.lang.String.valueOf(i)) : "Camera service has encountered a fatal error. Please reboot the device!" : "Camera device has encountered a fatal error." : "Camera device could not be opened due to a device policy." : "Too many other open camera devices" : "Camera device is already in use."));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
        com.microblink.blinkid.secured.IlllllIIIl illlllIIIl = this.llIIlIlIIl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OPENED ");
        sb.append(this.llIIlIlIIl.hashCode());
        com.microblink.blinkid.util.Log.d(illlllIIIl, sb.toString(), new java.lang.Object[0]);
        com.microblink.blinkid.secured.IlllllIIIl illlllIIIl2 = this.llIIlIlIIl;
        illlllIIIl2.llIIlIlIIl = cameraDevice;
        if (illlllIIIl2.llIIlIIlll != 4) {
            illlllIIIl2.llIIlIlIIl(5);
            this.llIIlIlIIl.lIlIIIIlIl.llIIlIlIIl();
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Closing from on opened ");
            sb2.append(this.llIIlIlIIl.hashCode());
            com.microblink.blinkid.util.Log.d(illlllIIIl2, sb2.toString(), new java.lang.Object[0]);
            this.llIIlIlIIl.llIIlIlIIl();
        }
    }
}
