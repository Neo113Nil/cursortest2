package com.google.android.gms.internal.ads;

import F2.InterfaceC0217a;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbjj implements H2.a {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ InterfaceC0217a zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzbjj(zzbjl zzbjlVar, boolean z4, InterfaceC0217a interfaceC0217a, Map map, Map map2) {
        this.zzb = z4;
        this.zzc = interfaceC0217a;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // H2.a
    public final void zza(boolean z4) {
        if (this.zza) {
            return;
        }
        if (z4 && this.zzb) {
            ((zzdcp) this.zzc).zzdd();
        }
        this.zza = true;
        this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z4));
        ((zzblu) this.zzc).zzd("openIntentAsync", this.zzd);
    }

    @Override // H2.a
    public final void zzb(int i7) {
    }
}
