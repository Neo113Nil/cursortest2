package com.microblink.blinkid.util;

/* loaded from: classes10.dex */
public final class llIIlIlIIl implements android.view.View.OnClickListener {
    public final /* synthetic */ com.microblink.blinkid.util.CameraPermissionManager llIIlIlIIl;

    public llIIlIlIIl(com.microblink.blinkid.util.CameraPermissionManager cameraPermissionManager) {
        this.llIIlIlIIl = cameraPermissionManager;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.microblink.blinkid.util.CameraPermissionManager.getHighSpeedVideoFpsRanges(this.llIIlIlIIl);
    }
}
