package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

/* loaded from: classes.dex */
final class zzdi implements zzbb {
    private final /* synthetic */ zzch zzgy;
    private final /* synthetic */ zzck zzil;
    private final /* synthetic */ DatabaseReference.CompletionListener zzio;
    private final /* synthetic */ long zzjh;

    zzdi(zzck zzckVar, zzch zzchVar, long j, DatabaseReference.CompletionListener completionListener) {
        this.zzil = zzckVar;
        this.zzgy = zzchVar;
        this.zzjh = j;
        this.zzio = completionListener;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbb
    public final void zzb(String str, String str2) {
        DatabaseError zzc;
        zzc = zzck.zzc(str, str2);
        this.zzil.zza("setValue", this.zzgy, zzc);
        this.zzil.zza(this.zzjh, this.zzgy, zzc);
        this.zzil.zza(this.zzio, zzc, this.zzgy);
    }
}
