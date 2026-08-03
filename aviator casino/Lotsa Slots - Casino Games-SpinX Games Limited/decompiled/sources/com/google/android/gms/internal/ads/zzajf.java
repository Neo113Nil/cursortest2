package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajf extends com.google.android.gms.internal.ads.zzajo {
    public final byte[] zza;

    public zzajf(java.lang.String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzajf zzajfVar = (com.google.android.gms.internal.ads.zzajf) obj;
            if (this.zzf.equals(zzajfVar.zzf) && java.util.Arrays.equals(this.zza, zzajfVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.zza);
    }
}
