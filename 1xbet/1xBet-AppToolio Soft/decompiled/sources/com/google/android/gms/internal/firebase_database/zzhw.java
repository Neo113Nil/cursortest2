package com.google.android.gms.internal.firebase_database;

import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhw extends zzhx {
    public zzhw(zzib zzibVar, List<String> list) {
        super(zzibVar, list);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzhx
    protected final String zza(zzib zzibVar, String str, String str2, long j) {
        return str2;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzhx
    protected final void zze(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzhx
    protected final void zzf(String str, String str2) {
        Log.w(str, str2);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzhx
    protected final void zzg(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzhx
    protected final void zzh(String str, String str2) {
        Log.d(str, str2);
    }
}
