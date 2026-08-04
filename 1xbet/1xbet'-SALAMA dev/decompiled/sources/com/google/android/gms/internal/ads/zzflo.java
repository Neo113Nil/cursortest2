package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzflo extends AsyncTask {
    private zzflp zza;
    protected final zzflg zzd;

    public zzflo(zzflg zzflgVar) {
        this.zzd = zzflgVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzflp zzflpVar = this.zza;
        if (zzflpVar != null) {
            zzflpVar.zza(this);
        }
    }

    public final void zzb(zzflp zzflpVar) {
        this.zza = zzflpVar;
    }
}
