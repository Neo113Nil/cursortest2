package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzfka implements zzfkd {
    private static final zzfka zza = new zzfka(new zzfke());
    private Date zzb;
    private boolean zzc;
    private final zzfke zzd;
    private boolean zze;

    private zzfka(zzfke zzfkeVar) {
        this.zzd = zzfkeVar;
    }

    public static zzfka zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfkd
    public final void zzc(boolean z4) {
        if (!this.zze && z4) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzfkc.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((zzfjl) it.next()).zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zze = z4;
    }

    public final void zzd(Context context) {
        if (this.zzc) {
            return;
        }
        this.zzd.zzd(context);
        this.zzd.zze(this);
        this.zzd.zzf();
        this.zze = this.zzd.zza;
        this.zzc = true;
    }
}
