package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;

/* loaded from: classes4.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        K k;
        zzes zzesVar = this.zza;
        k = zzesVar.zzd;
        C1082i.c(k, null, null, new zzeq(zzesVar, null), 3);
    }
}
