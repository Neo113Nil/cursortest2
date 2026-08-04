package com.google.android.recaptcha.internal;

import D6.E;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class zzak extends TimerTask {
    final /* synthetic */ zzap zza;

    public zzak(zzap zzapVar) {
        this.zza = zzapVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzap zzapVar = this.zza;
        E.p(zzapVar.zzb, new zzal(zzapVar, null));
    }
}
