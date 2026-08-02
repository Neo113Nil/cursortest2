package com.google.android.gms.internal.firebase_database;

import java.io.EOFException;

/* loaded from: classes.dex */
final class zzbl implements Runnable {
    private final /* synthetic */ zzbh zzfh;
    private final /* synthetic */ zzjx zzfj;

    zzbl(zzbh zzbhVar, zzjx zzjxVar) {
        this.zzfh = zzbhVar;
        this.zzfj = zzjxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhz zzhzVar;
        String str;
        zzjx zzjxVar;
        Object[] objArr;
        if (this.zzfj.getCause() == null || !(this.zzfj.getCause() instanceof EOFException)) {
            zzhzVar = this.zzfh.zzff.zzbs;
            str = "WebSocket error.";
            zzjxVar = this.zzfj;
            objArr = new Object[0];
        } else {
            zzhzVar = this.zzfh.zzff.zzbs;
            str = "WebSocket reached EOF.";
            objArr = new Object[0];
            zzjxVar = null;
        }
        zzhzVar.zza(str, zzjxVar, objArr);
        this.zzfh.zzff.zzat();
    }
}
