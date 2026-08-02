package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzaf implements com.google.android.play.core.splitinstall.internal.zzcb {
    private final com.google.android.play.core.splitinstall.internal.zzcb zza;

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* synthetic */ java.lang.Object zza() {
        java.lang.String string;
        android.content.Context zzb = ((com.google.android.play.core.splitinstall.zzad) this.zza).zzb();
        try {
            android.os.Bundle bundle = zzb.getPackageManager().getApplicationInfo(zzb.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new java.io.File(zzb.getExternalFilesDir(null), string);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public zzaf(com.google.android.play.core.splitinstall.internal.zzcb zzcbVar) {
        this.zza = zzcbVar;
    }
}
