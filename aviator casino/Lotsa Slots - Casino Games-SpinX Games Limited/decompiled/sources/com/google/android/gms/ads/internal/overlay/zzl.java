package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzl extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zza;

    /* synthetic */ zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzmVar);
        this.zza = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final android.graphics.drawable.BitmapDrawable bitmapDrawable;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zza;
        android.graphics.Bitmap zza = com.google.android.gms.ads.internal.zzt.zzy().zza(java.lang.Integer.valueOf(zzmVar.zzc.zzo.zzf));
        if (zza != null) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.zzl zzlVar = zzmVar.zzc.zzo;
            boolean z = zzlVar.zzd;
            float f = zzlVar.zze;
            android.app.Activity activity = zzmVar.zzb;
            if (!z || f <= 0.0f || f > 25.0f) {
                bitmapDrawable = new android.graphics.drawable.BitmapDrawable(activity.getResources(), zza);
            } else {
                try {
                    android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(zza, zza.getWidth(), zza.getHeight(), false);
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(createScaledBitmap);
                    android.renderscript.RenderScript create = android.renderscript.RenderScript.create(activity);
                    android.renderscript.ScriptIntrinsicBlur create2 = android.renderscript.ScriptIntrinsicBlur.create(create, android.renderscript.Element.U8_4(create));
                    android.renderscript.Allocation createFromBitmap = android.renderscript.Allocation.createFromBitmap(create, createScaledBitmap);
                    android.renderscript.Allocation createFromBitmap2 = android.renderscript.Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(activity.getResources(), createBitmap);
                } catch (java.lang.RuntimeException unused) {
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(activity.getResources(), zza);
                }
            }
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.internal.overlay.zzl.this.zza.zzb.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
