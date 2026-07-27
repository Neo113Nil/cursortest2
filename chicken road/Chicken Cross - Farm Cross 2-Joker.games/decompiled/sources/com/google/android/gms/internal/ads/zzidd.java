package com.google.android.gms.internal.ads;

import com.ironsource.U3;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzidd implements Map.Entry {
    zzidd zza;
    zzidd zzb;
    zzidd zzc;
    zzidd zzd;
    zzidd zze;
    final Object zzf;
    final boolean zzg;
    Object zzh;
    int zzi;

    zzidd(boolean z) {
        this.zzf = null;
        this.zzg = z;
        this.zze = this;
        this.zzd = this;
    }

    zzidd(boolean z, zzidd zziddVar, Object obj, zzidd zziddVar2, zzidd zziddVar3) {
        this.zza = zziddVar;
        this.zzf = obj;
        this.zzg = z;
        this.zzi = 1;
        this.zzd = zziddVar2;
        this.zze = zziddVar3;
        zziddVar3.zzd = this;
        zziddVar2.zze = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zzf;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.zzh;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zzf;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzh;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zzf;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzh;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.zzh;
        this.zzh = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzf);
        String valueOf2 = String.valueOf(this.zzh);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(U3.j.b);
        sb.append(valueOf2);
        return sb.toString();
    }
}
