package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzetd implements zzesg {
    final String zza;
    final int zzb;

    public /* synthetic */ zzetd(String str, int i7, zzetc zzetcVar) {
        this.zza = str;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        zzcts zzctsVar = (zzcts) obj;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkt)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                zzctsVar.zza.putString("topics", this.zza);
            }
            int i7 = this.zzb;
            if (i7 != -1) {
                zzctsVar.zza.putInt("atps", i7);
            }
        }
    }
}
