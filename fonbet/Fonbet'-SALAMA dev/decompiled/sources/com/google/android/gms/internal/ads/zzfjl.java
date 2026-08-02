package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfjl extends zzfjh {
    private final zzfjj zza;
    private zzflt zzc;
    private zzfks zzd;
    private final String zzg;
    private final zzfkg zzb = new zzfkg();
    private boolean zze = false;
    private boolean zzf = false;

    public zzfjl(zzfji zzfjiVar, zzfjj zzfjjVar, String str) {
        this.zza = zzfjjVar;
        this.zzg = str;
        zzk(null);
        if (zzfjjVar.zzd() == zzfjk.HTML || zzfjjVar.zzd() == zzfjk.JAVASCRIPT) {
            this.zzd = new zzfkt(str, zzfjjVar.zza());
        } else {
            this.zzd = new zzfkw(str, zzfjjVar.zzi(), null);
        }
        this.zzd.zzo();
        zzfkc.zza().zzd(this);
        this.zzd.zzf(zzfjiVar);
    }

    private final void zzk(View view) {
        this.zzc = new zzflt(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfjh
    public final void zzb(View view, zzfjo zzfjoVar, String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfjoVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzfjh
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zze();
        zzfkc.zza().zze(this);
        this.zzd.zzc();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfjh
    public final void zzd(View view) {
        if (this.zzf || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzb();
        Collection<zzfjl> zzc = zzfkc.zza().zzc();
        if (zzc == null || zzc.isEmpty()) {
            return;
        }
        for (zzfjl zzfjlVar : zzc) {
            if (zzfjlVar != this && zzfjlVar.zzf() == view) {
                zzfjlVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjh
    public final void zze() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzfkc.zza().zzf(this);
        this.zzd.zzl(zzfkk.zzb().zza());
        this.zzd.zzg(zzfka.zza().zzb());
        this.zzd.zzi(this, this.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzf() {
        return (View) this.zzc.get();
    }

    public final zzfks zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzb.zza();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
