package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhhd extends zzhga {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhhc zzd;

    /* synthetic */ zzhhd(int i, int i2, int i3, zzhhc zzhhcVar, byte[] bArr) {
        this.zza = i;
        this.zzd = zzhhcVar;
    }

    public static zzhhb zzb() {
        return new zzhhb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhd)) {
            return false;
        }
        zzhhd zzhhdVar = (zzhhd) obj;
        if (zzhhdVar.zza == this.zza) {
            int i = zzhhdVar.zzb;
            int i2 = zzhhdVar.zzc;
            if (zzhhdVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzhhd.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhhc.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhhc zzd() {
        return this.zzd;
    }
}
