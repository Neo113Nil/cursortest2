package com.google.android.gms.internal.ads;

import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzfcq {
    private final zzfcp zza = new zzfcp();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzfcp zza() {
        zzfcp zzfcpVar = this.zza;
        zzfcp zzfcpVarClone = zzfcpVar.clone();
        zzfcpVar.zza = false;
        zzfcpVar.zzb = false;
        return zzfcpVarClone;
    }

    public final String zzb() {
        StringBuilder sb = new StringBuilder("\n\tPool does not exist: ");
        sb.append(this.zzd);
        sb.append("\n\tNew pools created: ");
        sb.append(this.zzb);
        sb.append("\n\tPools removed: ");
        sb.append(this.zzc);
        sb.append("\n\tEntries added: ");
        sb.append(this.zzf);
        sb.append("\n\tNo entries retrieved: ");
        return k.g(sb, this.zze, "\n");
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
