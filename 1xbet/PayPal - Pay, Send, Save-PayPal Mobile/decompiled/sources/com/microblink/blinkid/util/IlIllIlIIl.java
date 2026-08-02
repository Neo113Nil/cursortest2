package com.microblink.blinkid.util;

/* loaded from: classes10.dex */
public final class IlIllIlIIl implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ com.microblink.blinkid.util.IllIIIllII IlIllIlIIl;
    public final /* synthetic */ boolean llIIlIlIIl;

    public IlIllIlIIl(com.microblink.blinkid.util.IllIIIllII illIIIllII, boolean z) {
        this.IlIllIlIIl = illIIIllII;
        this.llIIlIlIIl = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        android.view.View view;
        com.microblink.blinkid.secured.lIIIIIllIl liiiiillil;
        com.microblink.blinkid.secured.lIIIIIllIl liiiiillil2;
        dialogInterface.dismiss();
        view = this.IlIllIlIIl.llIIlIlIIl.getHighSpeedVideoSizes;
        view.setVisibility(8);
        if (this.llIIlIlIIl) {
            return;
        }
        liiiiillil = this.IlIllIlIIl.llIIlIlIIl.getHighSpeedVideoFpsRanges;
        android.content.Context context = liiiiillil.llIIIlllll;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("package:");
        liiiiillil2 = this.IlIllIlIIl.llIIlIlIIl.getHighSpeedVideoFpsRanges;
        sb.append(liiiiillil2.llIIIlllll.getPackageName());
        context.startActivity(new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.parse(sb.toString())));
    }
}
