package com.google.android.recaptcha.internal;

import D6.E;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class zzdh extends TimerTask {
    final /* synthetic */ zzdk zza;

    public zzdh(zzdk zzdkVar) {
        this.zza = zzdkVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzdk zzdkVar = this.zza;
        E.p(zzdkVar.zzd, new zzdi(zzdkVar, null));
    }
}
