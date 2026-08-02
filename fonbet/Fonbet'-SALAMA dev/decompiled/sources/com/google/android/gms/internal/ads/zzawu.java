package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class zzawu extends zzaxe {
    private List zzh;
    private final Context zzi;

    public zzawu(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, Context context) {
        super(zzavrVar, "bG+XqwiSuuiSQqDJYzFySEsAbIA1H8uMEv4Fq5XreeaHTwzYlb/A5xSXvgG7+Sns", "APVOkq0Gz4B2bIz+C2PxrsnZ7/n2oTnYdV7sM1bdTS4=", zzarrVar, i7, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        this.zzd.zzU(-1L);
        this.zzd.zzQ(-1L);
        Context context = this.zzi;
        if (context == null) {
            context = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, context);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zzd) {
            this.zzd.zzU(((Long) this.zzh.get(0)).longValue());
            this.zzd.zzQ(((Long) this.zzh.get(1)).longValue());
        }
    }
}
