package com.microblink.blinkid.util;

/* loaded from: classes10.dex */
public final class IllIIIllII implements android.view.View.OnClickListener {
    public final /* synthetic */ com.microblink.blinkid.util.CameraPermissionManager llIIlIlIIl;

    public IllIIIllII(com.microblink.blinkid.util.CameraPermissionManager cameraPermissionManager) {
        this.llIIlIlIIl = cameraPermissionManager;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.microblink.blinkid.secured.lIIIIIllIl liiiiillil;
        liiiiillil = this.llIIlIlIIl.getHighSpeedVideoFpsRanges;
        android.content.Context IlIllIlIIl = liiiiillil.IlIllIlIIl();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(IlIllIlIIl);
        boolean Camera2StreamConfigurationMap = com.microblink.blinkid.util.CameraPermissionManager.Camera2StreamConfigurationMap(IlIllIlIIl);
        builder.setCancelable(false).setTitle(com.microblink.blinkid.library.R.string.mb_warning_title).setMessage(Camera2StreamConfigurationMap ? com.microblink.blinkid.library.R.string.mb_enable_permission_help_instant_app : com.microblink.blinkid.library.R.string.mb_enable_permission_help).setNeutralButton(android.R.string.ok, new com.microblink.blinkid.util.IlIllIlIIl(this, Camera2StreamConfigurationMap)).create().show();
    }
}
