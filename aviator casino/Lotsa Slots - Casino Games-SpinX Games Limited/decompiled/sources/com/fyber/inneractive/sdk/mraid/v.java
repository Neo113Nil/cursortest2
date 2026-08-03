package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class v extends com.fyber.inneractive.sdk.mraid.e {
    public v(java.util.LinkedHashMap linkedHashMap, com.fyber.inneractive.sdk.web.i0 i0Var, com.fyber.inneractive.sdk.util.g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        java.lang.String str = (java.lang.String) this.b.get(com.facebook.share.internal.ShareConstants.MEDIA_URI);
        if (str != null) {
            java.lang.String str2 = "";
            if (!"".equals(str)) {
                com.fyber.inneractive.sdk.web.i0 i0Var = this.c;
                android.content.Context a2 = com.fyber.inneractive.sdk.util.o.a(i0Var.b);
                try {
                    str2 = android.os.Environment.getExternalStorageState();
                } catch (java.lang.Throwable unused) {
                }
                if (!"mounted".equals(str2) || com.fyber.inneractive.sdk.util.o.f4302a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    i0Var.a(com.fyber.inneractive.sdk.mraid.k.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                    com.fyber.inneractive.sdk.util.IAlog.a("Error downloading file. Please check if the Android permission is not granted, or maybe the device does not have an SD card mounted? ", new java.lang.Object[0]);
                    return;
                }
                if (a2 instanceof android.app.Activity) {
                    new android.app.AlertDialog.Builder(com.fyber.inneractive.sdk.util.o.a(i0Var.b)).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (android.content.DialogInterface.OnClickListener) null).setPositiveButton("Okay", new com.fyber.inneractive.sdk.web.y(i0Var, str)).setCancelable(true).show();
                    return;
                }
                com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.web.v("Downloading image to Picture gallery..."));
                new java.io.File(android.os.Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
                com.fyber.inneractive.sdk.flow.x xVar = i0Var.s;
                com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.b1(new com.fyber.inneractive.sdk.web.x(i0Var), str, xVar != null ? xVar.c : null));
                return;
            }
        }
        this.c.a(com.fyber.inneractive.sdk.mraid.k.STORE_PICTURE, "Image can't be stored with null or empty URL");
        com.fyber.inneractive.sdk.util.IAlog.a("Mraid Store Picture -Invalid URI ", new java.lang.Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final java.lang.String c() {
        return (java.lang.String) this.b.get(com.facebook.share.internal.ShareConstants.MEDIA_URI);
    }
}
