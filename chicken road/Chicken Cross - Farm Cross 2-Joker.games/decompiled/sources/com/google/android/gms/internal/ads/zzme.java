package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzme {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ zzme(zzmd zzmdVar, byte[] bArr) {
        this.zza = zzmdVar.zze();
        this.zzb = zzmdVar.zzf();
        this.zzc = zzmdVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzme)) {
            return false;
        }
        zzme zzmeVar = (zzme) obj;
        return this.zza == zzmeVar.zza && this.zzb == zzmeVar.zzb && this.zzc == zzmeVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public final zzmd zza() {
        return new zzmd(this, null);
    }
}
