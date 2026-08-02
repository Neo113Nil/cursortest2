package com.google.android.gms.internal.firebase_database;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class zzhx implements zzia {
    private final Set<String> zzqm;
    private final zzib zzqn;

    public zzhx(zzib zzibVar, List<String> list) {
        if (list != null) {
            this.zzqm = new HashSet(list);
        } else {
            this.zzqm = null;
        }
        this.zzqn = zzibVar;
    }

    protected String zza(zzib zzibVar, String str, String str2, long j) {
        String date = new Date(j).toString();
        String valueOf = String.valueOf(zzibVar);
        StringBuilder sb = new StringBuilder(String.valueOf(date).length() + 6 + String.valueOf(valueOf).length() + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append(date);
        sb.append(" [");
        sb.append(valueOf);
        sb.append("] ");
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzia
    public final void zzb(zzib zzibVar, String str, String str2, long j) {
        if (zzibVar.ordinal() >= this.zzqn.ordinal() && (this.zzqm == null || zzibVar.ordinal() > zzib.DEBUG.ordinal() || this.zzqm.contains(str))) {
            String zza = zza(zzibVar, str, str2, j);
            switch (zzibVar) {
                case ERROR:
                    zze(str, zza);
                    return;
                case WARN:
                    zzf(str, zza);
                    return;
                case INFO:
                    zzg(str, zza);
                    return;
                case DEBUG:
                    zzh(str, zza);
                    return;
                default:
                    throw new RuntimeException("Should not reach here!");
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzia
    public final zzib zzbn() {
        return this.zzqn;
    }

    protected void zze(String str, String str2) {
        System.err.println(str2);
    }

    protected void zzf(String str, String str2) {
        System.out.println(str2);
    }

    protected void zzg(String str, String str2) {
        System.out.println(str2);
    }

    protected void zzh(String str, String str2) {
        System.out.println(str2);
    }
}
