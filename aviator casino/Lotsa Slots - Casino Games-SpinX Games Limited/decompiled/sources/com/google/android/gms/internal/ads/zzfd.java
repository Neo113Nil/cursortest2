package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfd extends java.lang.IllegalStateException {
    public final int zza;
    public final int zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzfd(int i, int i2) {
        super(r0);
        java.lang.String sb;
        if (i == 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 46);
            sb2.append("Player stuck buffering and not loading for ");
            sb2.append(i2);
            sb2.append(" ms");
            sb = sb2.toString();
        } else if (i == 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 47);
            sb3.append("Player stuck buffering with no progress for ");
            sb3.append(i2);
            sb3.append(" ms");
            sb = sb3.toString();
        } else if (i == 2) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 45);
            sb4.append("Player stuck playing with no progress for ");
            sb4.append(i2);
            sb4.append(" ms");
            sb = sb4.toString();
        } else if (i != 3) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 31);
            sb5.append("Player stuck suppressed for ");
            sb5.append(i2);
            sb5.append(" ms");
            sb = sb5.toString();
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 43);
            sb6.append("Player stuck playing without ending for ");
            sb6.append(i2);
            sb6.append(" ms");
            sb = sb6.toString();
        }
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzfd zzfdVar = (com.google.android.gms.internal.ads.zzfd) obj;
            if (this.zza == zzfdVar.zza && this.zzb == zzfdVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }
}
