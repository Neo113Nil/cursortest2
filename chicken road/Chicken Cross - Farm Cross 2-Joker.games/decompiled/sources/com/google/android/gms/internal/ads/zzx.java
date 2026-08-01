package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzx {
    public final String zza;
    public final String zzb;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzx(String str, String str2) {
        this.zza = zzfm.zzi(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzx zzxVar = (zzx) obj;
            if (Objects.equals(this.zza, zzxVar.zza) && Objects.equals(this.zzb, zzxVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        String str = this.zza;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 10 + String.valueOf(str2).length() + 3);
        sb.append("{ lang=");
        sb.append(str);
        sb.append(", '");
        sb.append(str2);
        sb.append("' }");
        return sb.toString();
    }
}
