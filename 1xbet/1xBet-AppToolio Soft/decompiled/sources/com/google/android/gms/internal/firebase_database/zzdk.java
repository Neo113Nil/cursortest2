package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

/* loaded from: classes.dex */
final class zzdk implements zzbb {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzck zzil;
    private final /* synthetic */ DatabaseReference.CompletionListener zzio;
    private final /* synthetic */ zzja zzji;

    zzdk(zzck zzckVar, zzch zzchVar, zzja zzjaVar, DatabaseReference.CompletionListener completionListener) {
        this.zzil = zzckVar;
        this.zzgy = zzchVar;
        this.zzji = zzjaVar;
        this.zzio = completionListener;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbb
    public final void zzb(String str, String str2) {
        DatabaseError zzc;
        zzdy zzdyVar;
        zzc = zzck.zzc(str, str2);
        this.zzil.zza("onDisconnect().setValue", this.zzgy, zzc);
        if (zzc == null) {
            zzdyVar = this.zzil.zzhw;
            zzdyVar.zzh(this.zzgy, this.zzji);
        }
        this.zzil.zza(this.zzio, zzc, this.zzgy);
    }
}
