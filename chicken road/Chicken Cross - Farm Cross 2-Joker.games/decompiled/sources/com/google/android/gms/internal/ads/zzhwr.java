package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhwr extends zzhym {
    private final zzhwp zza;
    private final zzhwq zzb;

    private zzhwr(zzhwp zzhwpVar, zzhwq zzhwqVar) {
        this.zza = zzhwpVar;
        this.zzb = zzhwqVar;
    }

    public static zzhwr zzb(zzhwp zzhwpVar, zzhwq zzhwqVar) {
        return new zzhwr(zzhwpVar, zzhwqVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwr)) {
            return false;
        }
        zzhwr zzhwrVar = (zzhwr) obj;
        return zzhwrVar.zza == this.zza && zzhwrVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhwr.class, this.zza, this.zzb);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 47 + obj2.length() + 1);
        sb.append("ML-DSA Parameters (ML-DSA instance: ");
        sb.append(obj);
        sb.append(", variant: ");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzb != zzhwq.zzb;
    }
}
