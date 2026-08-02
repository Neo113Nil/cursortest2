package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzin implements zzio {
    private final long zzrs;

    public zzin(zzja zzjaVar) {
        this.zzrs = Math.max(512L, (long) Math.sqrt(zzkl.zzn(zzjaVar) * 100));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzio
    public final boolean zze(zzim zzimVar) {
        if (zzimVar.zzfp() > this.zzrs) {
            return zzimVar.zzfq().isEmpty() || !zzimVar.zzfq().zzbz().equals(zzid.zzfe());
        }
        return false;
    }
}
