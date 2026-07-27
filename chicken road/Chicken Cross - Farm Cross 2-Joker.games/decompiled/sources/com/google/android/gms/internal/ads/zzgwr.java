package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgwr extends zzgwd {
    final /* synthetic */ zzgwt zza;
    private final Object zzb;
    private int zzc;

    zzgwr(zzgwt zzgwtVar, int i) {
        Objects.requireNonNull(zzgwtVar);
        this.zza = zzgwtVar;
        this.zzb = zzgwtVar.zzo(i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            zzgwt zzgwtVar = this.zza;
            if (i < zzgwtVar.size() && Objects.equals(this.zzb, zzgwtVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgwd, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwd, java.util.Map.Entry
    public final Object getValue() {
        zzgwt zzgwtVar = this.zza;
        Map zzc = zzgwtVar.zzc();
        if (zzc != null) {
            return zzc.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzgwtVar.zzp(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgwd, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgwt zzgwtVar = this.zza;
        Map zzc = zzgwtVar.zzc();
        if (zzc != null) {
            return zzc.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzgwtVar.put(this.zzb, obj);
            return null;
        }
        Object zzp = zzgwtVar.zzp(i);
        zzgwtVar.zzq(this.zzc, obj);
        return zzp;
    }
}
