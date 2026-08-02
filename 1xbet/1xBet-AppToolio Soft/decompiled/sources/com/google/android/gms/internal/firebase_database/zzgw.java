package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzgw {
    private final zzit zzol;
    private final zzgz zzoq;
    private final zzit zzor;
    private final zzid zzos;
    private final zzid zzot;

    private zzgw(zzgz zzgzVar, zzit zzitVar, zzid zzidVar, zzid zzidVar2, zzit zzitVar2) {
        this.zzoq = zzgzVar;
        this.zzol = zzitVar;
        this.zzos = zzidVar;
        this.zzot = zzidVar2;
        this.zzor = zzitVar2;
    }

    public static zzgw zza(zzid zzidVar, zzit zzitVar) {
        return new zzgw(zzgz.CHILD_ADDED, zzitVar, zzidVar, null, null);
    }

    public static zzgw zza(zzid zzidVar, zzit zzitVar, zzit zzitVar2) {
        return new zzgw(zzgz.CHILD_CHANGED, zzitVar, zzidVar, null, zzitVar2);
    }

    public static zzgw zza(zzid zzidVar, zzja zzjaVar, zzja zzjaVar2) {
        return zza(zzidVar, zzit.zzj(zzjaVar), zzit.zzj(zzjaVar2));
    }

    public static zzgw zza(zzit zzitVar) {
        return new zzgw(zzgz.VALUE, zzitVar, null, null, null);
    }

    public static zzgw zzb(zzid zzidVar, zzit zzitVar) {
        return new zzgw(zzgz.CHILD_REMOVED, zzitVar, zzidVar, null, null);
    }

    public static zzgw zzc(zzid zzidVar, zzit zzitVar) {
        return new zzgw(zzgz.CHILD_MOVED, zzitVar, zzidVar, null, null);
    }

    public static zzgw zzc(zzid zzidVar, zzja zzjaVar) {
        return zza(zzidVar, zzit.zzj(zzjaVar));
    }

    public static zzgw zzd(zzid zzidVar, zzja zzjaVar) {
        return zzb(zzidVar, zzit.zzj(zzjaVar));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzoq);
        String valueOf2 = String.valueOf(this.zzos);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9 + String.valueOf(valueOf2).length());
        sb.append("Change: ");
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final zzit zzdq() {
        return this.zzol;
    }

    public final zzid zzds() {
        return this.zzos;
    }

    public final zzgz zzdt() {
        return this.zzoq;
    }

    public final zzid zzdu() {
        return this.zzot;
    }

    public final zzit zzdv() {
        return this.zzor;
    }

    public final zzgw zzg(zzid zzidVar) {
        return new zzgw(this.zzoq, this.zzol, this.zzos, zzidVar, this.zzor);
    }
}
