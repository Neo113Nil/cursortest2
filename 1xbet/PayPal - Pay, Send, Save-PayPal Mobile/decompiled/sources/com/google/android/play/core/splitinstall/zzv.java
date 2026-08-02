package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzv implements com.google.android.play.core.splitinstall.zzf {
    final /* synthetic */ com.google.android.play.core.splitinstall.SplitInstallSessionState zza;
    final /* synthetic */ android.content.Intent zzb;
    final /* synthetic */ android.content.Context zzc;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzx zzd;

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() {
        r0.zzd.post(new com.google.android.play.core.splitinstall.zzw(this.zzd, this.zza, 5, 0));
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(int i) {
        r0.zzd.post(new com.google.android.play.core.splitinstall.zzw(this.zzd, this.zza, 6, i));
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        if (this.zzb.getBooleanExtra("triggered_from_app_after_verification", false)) {
            zzuVar = this.zzd.zza;
            zzuVar.zzb("Splits copied and verified more than once.", new java.lang.Object[0]);
        } else {
            this.zzb.putExtra("triggered_from_app_after_verification", true);
            this.zzc.sendBroadcast(this.zzb);
        }
    }

    zzv(com.google.android.play.core.splitinstall.zzx zzxVar, com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, android.content.Intent intent, android.content.Context context) {
        this.zzd = zzxVar;
        this.zza = splitInstallSessionState;
        this.zzb = intent;
        this.zzc = context;
    }
}
