package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class zzfch implements zzcut {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzbyu zzc;

    public zzfch(Context context, zzbyu zzbyuVar) {
        this.zzb = context;
        this.zzc = zzbyuVar;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzcut
    public final synchronized void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.f10720a != 3) {
            this.zzc.zzl(this.zza);
        }
    }
}
