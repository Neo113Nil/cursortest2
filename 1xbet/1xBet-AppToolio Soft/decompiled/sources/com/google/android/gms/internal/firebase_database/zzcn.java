package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

/* loaded from: classes.dex */
final class zzcn implements zzbb {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzck zzil;
    private final /* synthetic */ DatabaseReference.CompletionListener zzio;

    zzcn(zzck zzckVar, zzch zzchVar, DatabaseReference.CompletionListener completionListener) {
        this.zzil = zzckVar;
        this.zzgy = zzchVar;
        this.zzio = completionListener;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbb
    public final void zzb(String str, String str2) {
        DatabaseError zzc;
        zzdy zzdyVar;
        zzc = zzck.zzc(str, str2);
        if (zzc == null) {
            zzdyVar = this.zzil.zzhw;
            zzdyVar.zzq(this.zzgy);
        }
        this.zzil.zza(this.zzio, zzc, this.zzgy);
    }
}
