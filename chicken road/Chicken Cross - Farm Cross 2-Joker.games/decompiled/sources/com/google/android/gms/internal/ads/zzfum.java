package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfum {
    private final String zza;
    private final AdFormat zzb;
    private final String zzc;

    /* synthetic */ zzfum(zzful zzfulVar, byte[] bArr) {
        this.zza = zzfulVar.zzb();
        this.zzb = zzfulVar.zzc();
        this.zzc = zzfulVar.zzd();
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzfum) {
            zzfum zzfumVar = (zzfum) obj;
            if (this.zza.equals(zzfumVar.zza) && (adFormat = this.zzb) != null && (adFormat2 = zzfumVar.zzb) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final String zzc() {
        return this.zzc;
    }
}
