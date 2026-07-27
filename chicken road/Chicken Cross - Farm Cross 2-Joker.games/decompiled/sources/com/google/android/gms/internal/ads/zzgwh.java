package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgwh extends zzgzg implements Serializable {
    final zzgub zza;
    final zzgzg zzb;

    zzgwh(zzgub zzgubVar, zzgzg zzgzgVar) {
        this.zza = zzgubVar;
        this.zzb = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgub zzgubVar = this.zza;
        return this.zzb.compare(zzgubVar.apply(obj), zzgubVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgwh) {
            zzgwh zzgwhVar = (zzgwh) obj;
            if (this.zza.equals(zzgwhVar.zza) && this.zzb.equals(zzgwhVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String obj = this.zzb.toString();
        int length = obj.length();
        String obj2 = this.zza.toString();
        StringBuilder sb = new StringBuilder(length + 12 + obj2.length() + 1);
        sb.append(obj);
        sb.append(".onResultOf(");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }
}
