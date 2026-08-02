package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DataSnapshot;

/* loaded from: classes.dex */
public final class zzgx implements zzgy {
    private final zzce zzoo;
    private final zzgz zzoq;
    private final DataSnapshot zzou;
    private final String zzov;

    public zzgx(zzgz zzgzVar, zzce zzceVar, DataSnapshot dataSnapshot, String str) {
        this.zzoq = zzgzVar;
        this.zzoo = zzceVar;
        this.zzou = dataSnapshot;
        this.zzov = str;
    }

    private final zzch zzg() {
        zzch zzg = this.zzou.getRef().zzg();
        return this.zzoq == zzgz.VALUE ? zzg : zzg.zzby();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgy
    public final String toString() {
        if (this.zzoq == zzgz.VALUE) {
            String valueOf = String.valueOf(zzg());
            String valueOf2 = String.valueOf(this.zzoq);
            String valueOf3 = String.valueOf(this.zzou.getValue(true));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb.append(valueOf);
            sb.append(": ");
            sb.append(valueOf2);
            sb.append(": ");
            sb.append(valueOf3);
            return sb.toString();
        }
        String valueOf4 = String.valueOf(zzg());
        String valueOf5 = String.valueOf(this.zzoq);
        String key = this.zzou.getKey();
        String valueOf6 = String.valueOf(this.zzou.getValue(true));
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 10 + String.valueOf(valueOf5).length() + String.valueOf(key).length() + String.valueOf(valueOf6).length());
        sb2.append(valueOf4);
        sb2.append(": ");
        sb2.append(valueOf5);
        sb2.append(": { ");
        sb2.append(key);
        sb2.append(": ");
        sb2.append(valueOf6);
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgy
    public final void zzdr() {
        this.zzoo.zza(this);
    }

    public final zzgz zzdt() {
        return this.zzoq;
    }

    public final DataSnapshot zzdw() {
        return this.zzou;
    }

    public final String zzdx() {
        return this.zzov;
    }
}
