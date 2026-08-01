package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhjh extends zzhga {
    private final zzhjg zza;
    private final int zzb;

    private zzhjh(zzhjg zzhjgVar, int i) {
        this.zza = zzhjgVar;
        this.zzb = i;
    }

    public static zzhjh zzb(zzhjg zzhjgVar, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzhjh(zzhjgVar, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhjh)) {
            return false;
        }
        zzhjh zzhjhVar = (zzhjh) obj;
        return zzhjhVar.zza == this.zza && zzhjhVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhjh.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(obj);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza != zzhjg.zzb;
    }

    public final zzhjg zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}
