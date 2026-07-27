package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbdj extends zzbdt {
    private List zzh;
    private final Context zzi;

    public zzbdj(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2, Context context) {
        super(zzbcgVar, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", zzayaVar, i, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaya zzayaVar = this.zzd;
        zzayaVar.zzq(-1L);
        zzayaVar.zzr(-1L);
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
        synchronized (zzayaVar) {
            zzayaVar.zzq(((Long) this.zzh.get(0)).longValue());
            zzayaVar.zzr(((Long) this.zzh.get(1)).longValue());
        }
    }
}
