package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import java.util.List;

/* loaded from: classes.dex */
final class zzdf implements zzbb {
    private final /* synthetic */ zzet zzjc;
    private final /* synthetic */ zzde zzjd;

    zzdf(zzde zzdeVar, zzet zzetVar) {
        this.zzjd = zzdeVar;
        this.zzjc = zzetVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbb
    public final void zzb(String str, String str2) {
        DatabaseError zzc;
        zzc = zzck.zzc(str, str2);
        this.zzjd.zzil.zzc((List<? extends zzgy>) this.zzjc.zzb(zzc));
    }
}
