package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class zzak extends TimerTask {
    final /* synthetic */ zzap zza;

    public zzak(zzap zzapVar) {
        this.zza = zzapVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C c3;
        zzap zzapVar = this.zza;
        c3 = zzapVar.zzb;
        E.p(c3, new zzal(zzapVar, null));
    }
}
