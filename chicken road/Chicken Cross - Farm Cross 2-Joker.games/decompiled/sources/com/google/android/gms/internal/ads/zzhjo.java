package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhjo extends zzhga {
    private final zzhjn zza;

    private zzhjo(zzhjn zzhjnVar) {
        this.zza = zzhjnVar;
    }

    public static zzhjo zzb(zzhjn zzhjnVar) {
        return new zzhjo(zzhjnVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhjo) && ((zzhjo) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhjo.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 40);
        sb.append("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza != zzhjn.zzc;
    }

    public final zzhjn zzc() {
        return this.zza;
    }
}
