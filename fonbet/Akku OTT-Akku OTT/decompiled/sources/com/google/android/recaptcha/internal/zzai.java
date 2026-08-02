package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;

/* loaded from: classes4.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        K k;
        zzan zzanVar = this.zza;
        k = zzanVar.zzb;
        C1082i.c(k, null, null, new zzaj(zzanVar, null), 3);
    }
}
