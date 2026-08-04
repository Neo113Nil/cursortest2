package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzdib implements zzbex {
    final /* synthetic */ zzdja zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdib(zzdja zzdjaVar, ViewGroup viewGroup) {
        this.zza = zzdjaVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzc() {
        zzfwh zzfwhVar = zzdhy.zza;
        Map mapZzm = this.zza.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = zzfwhVar.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = mapZzm.get((String) zzfwhVar.get(i7));
            i7++;
            if (obj != null) {
                this.zza.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
