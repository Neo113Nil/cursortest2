package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
final class zzii implements Runnable {
    private final /* synthetic */ boolean zzaqj;
    private final /* synthetic */ zzig zzaqk;
    private final /* synthetic */ zzig zzaql;
    private final /* synthetic */ zzih zzaqm;

    zzii(zzih zzihVar, boolean z, zzig zzigVar, zzig zzigVar2) {
        this.zzaqm = zzihVar;
        this.zzaqj = z;
        this.zzaqk = zzigVar;
        this.zzaql = zzigVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzaqj && this.zzaqm.zzaqd != null) {
            zzih zzihVar = this.zzaqm;
            zzihVar.zza(zzihVar.zzaqd);
        }
        zzig zzigVar = this.zzaqk;
        if ((zzigVar != null && zzigVar.zzaqb == this.zzaql.zzaqb && zzkd.zzs(this.zzaqk.zzaqa, this.zzaql.zzaqa) && zzkd.zzs(this.zzaqk.zzuk, this.zzaql.zzuk)) ? false : true) {
            Bundle bundle = new Bundle();
            zzih.zza(this.zzaql, bundle, true);
            zzig zzigVar2 = this.zzaqk;
            if (zzigVar2 != null) {
                if (zzigVar2.zzuk != null) {
                    bundle.putString("_pn", this.zzaqk.zzuk);
                }
                bundle.putString("_pc", this.zzaqk.zzaqa);
                bundle.putLong("_pi", this.zzaqk.zzaqb);
            }
            this.zzaqm.zzfy().zza("auto", "_vs", bundle);
        }
        zzih zzihVar2 = this.zzaqm;
        zzihVar2.zzaqd = this.zzaql;
        zzihVar2.zzga().zzb(this.zzaql);
    }
}
