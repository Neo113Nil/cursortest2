package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcm implements zzbb {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzck zzil;
    private final /* synthetic */ Map zzim;
    private final /* synthetic */ DatabaseReference.CompletionListener zzin;

    zzcm(zzck zzckVar, zzch zzchVar, Map map, DatabaseReference.CompletionListener completionListener) {
        this.zzil = zzckVar;
        this.zzgy = zzchVar;
        this.zzim = map;
        this.zzin = completionListener;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbb
    public final void zzb(String str, String str2) {
        DatabaseError zzc;
        zzdy zzdyVar;
        zzc = zzck.zzc(str, str2);
        this.zzil.zza("onDisconnect().updateChildren", this.zzgy, zzc);
        if (zzc == null) {
            for (Map.Entry entry : this.zzim.entrySet()) {
                zzdyVar = this.zzil.zzhw;
                zzdyVar.zzh(this.zzgy.zzh((zzch) entry.getKey()), (zzja) entry.getValue());
            }
        }
        this.zzil.zza(this.zzin, zzc, this.zzgy);
    }
}
