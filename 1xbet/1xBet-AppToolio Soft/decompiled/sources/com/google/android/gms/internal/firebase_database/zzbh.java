package com.google.android.gms.internal.firebase_database;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zzbh implements zzbg, zzjw {
    final /* synthetic */ zzbc zzff;
    private zzjr zzfg;

    private zzbh(zzbc zzbcVar, zzjr zzjrVar) {
        this.zzff = zzbcVar;
        this.zzfg = zzjrVar;
        this.zzfg.zza(this);
    }

    /* synthetic */ zzbh(zzbc zzbcVar, zzjr zzjrVar, zzbd zzbdVar) {
        this(zzbcVar, zzjrVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbg
    public final void close() {
        this.zzfg.close();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbg
    public final void connect() {
        zzhz zzhzVar;
        zzhz zzhzVar2;
        zzhz zzhzVar3;
        try {
            this.zzfg.connect();
        } catch (zzjx e) {
            zzhzVar = this.zzff.zzbs;
            if (zzhzVar.zzfa()) {
                zzhzVar3 = this.zzff.zzbs;
                zzhzVar3.zza("Error connecting", e, new Object[0]);
            }
            this.zzfg.close();
            try {
                this.zzfg.zzgm();
            } catch (InterruptedException e2) {
                zzhzVar2 = this.zzff.zzbs;
                zzhzVar2.zza("Interrupted while shutting down websocket threads", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzjw
    public final void onClose() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzff.zzbc;
        scheduledExecutorService.execute(new zzbk(this));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzjw
    public final void zza(zzjx zzjxVar) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzff.zzbc;
        scheduledExecutorService.execute(new zzbl(this, zzjxVar));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzjw
    public final void zza(zzjz zzjzVar) {
        zzhz zzhzVar;
        ScheduledExecutorService scheduledExecutorService;
        zzhz zzhzVar2;
        String text = zzjzVar.getText();
        zzhzVar = this.zzff.zzbs;
        if (zzhzVar.zzfa()) {
            zzhzVar2 = this.zzff.zzbs;
            String valueOf = String.valueOf(text);
            zzhzVar2.zza(valueOf.length() != 0 ? "ws message: ".concat(valueOf) : new String("ws message: "), null, new Object[0]);
        }
        scheduledExecutorService = this.zzff.zzbc;
        scheduledExecutorService.execute(new zzbj(this, text));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzjw
    public final void zzav() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzff.zzbc;
        scheduledExecutorService.execute(new zzbi(this));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbg
    public final void zzm(String str) {
        this.zzfg.zzm(str);
    }
}
