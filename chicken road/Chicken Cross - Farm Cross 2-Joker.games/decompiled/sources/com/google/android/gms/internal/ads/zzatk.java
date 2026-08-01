package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.U3;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzatk {
    private final String zza;
    private final String zzb;

    public zzatk(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzatk zzatkVar = (zzatk) obj;
            if (TextUtils.equals(this.zza, zzatkVar.zza) && TextUtils.equals(this.zzb, zzatkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append(U3.j.e);
        return sb.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
