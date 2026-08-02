package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbsi extends com.google.android.libraries.places.internal.zzbwn {
    private boolean zzb;
    private final com.google.android.libraries.places.internal.zzbnp zzc;
    private final com.google.android.libraries.places.internal.zzbpm zzd;
    private final com.google.android.libraries.places.internal.zzbje[] zze;

    public zzbsi(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, com.google.android.libraries.places.internal.zzbje[] zzbjeVarArr) {
        com.google.common.base.Preconditions.checkArgument(!zzbnpVar.zzj(), "error must not be OK");
        this.zzc = zzbnpVar;
        this.zzd = zzbpmVar;
        this.zze = zzbjeVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzbwn, com.google.android.libraries.places.internal.zzbpl
    public final void zzf(com.google.android.libraries.places.internal.zzbpn zzbpnVar) {
        com.google.common.base.Preconditions.checkState(!this.zzb, "already started");
        this.zzb = true;
        int i = 0;
        while (true) {
            com.google.android.libraries.places.internal.zzbje[] zzbjeVarArr = this.zze;
            if (i >= zzbjeVarArr.length) {
                zzbpnVar.zzc(this.zzc, this.zzd, new com.google.android.libraries.places.internal.zzbmg());
                return;
            } else {
                com.google.android.libraries.places.internal.zzbje zzbjeVar = zzbjeVarArr[i];
                i++;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwn, com.google.android.libraries.places.internal.zzbpl
    public final void zzn(com.google.android.libraries.places.internal.zzbtf zzbtfVar) {
        zzbtfVar.zzb("error", this.zzc);
        zzbtfVar.zzb("progress", this.zzd);
    }
}
