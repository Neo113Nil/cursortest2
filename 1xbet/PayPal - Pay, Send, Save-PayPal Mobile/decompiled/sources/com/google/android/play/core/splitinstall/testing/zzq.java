package com.google.android.play.core.splitinstall.testing;

/* loaded from: classes9.dex */
final class zzq implements com.google.android.play.core.splitinstall.zzf {
    final /* synthetic */ java.util.List zza;
    final /* synthetic */ java.util.List zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ java.util.List zze;
    final /* synthetic */ com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager zzf;

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() {
        this.zzf.zzr(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(int i) {
        this.zzf.zzs(6, i, null, null, null, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() {
        if (this.zzd) {
            return;
        }
        this.zzf.zzp(this.zze, this.zza, this.zzb, this.zzc, true);
    }

    zzq(com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager fakeSplitInstallManager, java.util.List list, java.util.List list2, long j, boolean z, java.util.List list3) {
        this.zzf = fakeSplitInstallManager;
        this.zza = list;
        this.zzb = list2;
        this.zzc = j;
        this.zzd = z;
        this.zze = list3;
    }
}
