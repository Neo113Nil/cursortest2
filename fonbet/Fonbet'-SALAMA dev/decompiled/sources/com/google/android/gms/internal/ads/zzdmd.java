package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdmd implements zzbiz {
    final /* synthetic */ zzdmf zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbiz zzd;

    public /* synthetic */ zzdmd(zzdmf zzdmfVar, WeakReference weakReference, String str, zzbiz zzbizVar, zzdme zzdmeVar) {
        this.zza = zzdmfVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzn(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
