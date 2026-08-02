package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class zzdh extends TimerTask {
    final /* synthetic */ zzdk zza;

    public zzdh(zzdk zzdkVar) {
        this.zza = zzdkVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C c3;
        zzdk zzdkVar = this.zza;
        c3 = zzdkVar.zzd;
        E.p(c3, new zzdi(zzdkVar, null));
    }
}
