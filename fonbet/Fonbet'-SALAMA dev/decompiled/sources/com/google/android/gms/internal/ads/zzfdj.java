package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.M;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class zzfdj {
    private final zzfcn zza;
    private final zzfdh zzb;
    private final zzfcj zzc;
    private zzfdp zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfdj(zzfcn zzfcnVar, zzfcj zzfcjVar, zzfdh zzfdhVar) {
        this.zza = zzfcnVar;
        this.zzc = zzfcjVar;
        this.zzb = zzfdhVar;
        zzfcjVar.zzb(new zzfde(this));
    }

    public static /* synthetic */ void zzc(zzfdj zzfdjVar) {
        synchronized (zzfdjVar) {
            zzfdjVar.zzf = 1;
            zzfdjVar.zzh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgj)).booleanValue() && !((M) o.f1952C.f1961g.zzi()).n().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfdi zzfdiVar = (zzfdi) this.zzd.pollFirst();
                if (zzfdiVar == null || (zzfdiVar.zza() != null && this.zza.zze(zzfdiVar.zza()))) {
                    zzfdp zzfdpVar = new zzfdp(this.zza, this.zzb, zzfdiVar);
                    this.zze = zzfdpVar;
                    zzfdpVar.zzd(new zzfdf(this, zzfdiVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized I3.b zza(zzfdi zzfdiVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzc(zzfdiVar);
    }

    public final synchronized void zzf(zzfdi zzfdiVar) {
        this.zzd.add(zzfdiVar);
    }
}
