package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzdrn implements zzbmi {
    final /* synthetic */ zzdso zza;
    final /* synthetic */ ViewGroup zzb;

    zzdrn(zzdso zzdsoVar, ViewGroup viewGroup) {
        this.zza = zzdsoVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zza() {
        zzgxm zzgxmVar = zzdrm.zza;
        zzdso zzdsoVar = this.zza;
        Map zzi = zzdsoVar.zzi();
        if (zzi == null) {
            return;
        }
        int size = zzgxmVar.size();
        int i = 0;
        while (i < size) {
            Object obj = zzi.get((String) zzgxmVar.get(i));
            i++;
            if (obj != null) {
                zzdsoVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final JSONObject zzc() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final JSONObject zzd() {
        return this.zza.zzo();
    }
}
