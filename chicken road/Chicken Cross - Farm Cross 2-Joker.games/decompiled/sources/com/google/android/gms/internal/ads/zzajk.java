package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzajk implements zzao {
    public final long zza;

    public zzajk(long j) {
        this.zza = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zza == ((zzajk) obj).zza;
    }

    public final int hashCode() {
        return Long.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        long j = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 38);
        sb.append("ThumbnailMetadata: presentationTimeUs=");
        sb.append(j);
        return sb.toString();
    }
}
