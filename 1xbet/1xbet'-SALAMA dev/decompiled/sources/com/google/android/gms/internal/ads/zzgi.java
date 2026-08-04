package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzgi extends zzfvx {
    private final Map zza;

    public zzgi(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, java.util.Map
    public final boolean containsValue(Object obj) {
        return zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, java.util.Map
    public final Set entrySet() {
        return zzfyj.zzc(this.zza.entrySet(), new zzfti() { // from class: com.google.android.gms.internal.ads.zzgg
            @Override // com.google.android.gms.internal.ads.zzfti
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, java.util.Map
    public final int hashCode() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, java.util.Map
    public final Set keySet() {
        return zzfyj.zzc(this.zza.keySet(), new zzfti() { // from class: com.google.android.gms.internal.ads.zzgh
            @Override // com.google.android.gms.internal.ads.zzfti
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfvx, com.google.android.gms.internal.ads.zzfvy
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvx
    public final Map zzb() {
        return this.zza;
    }
}
