package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzafx extends zzagf {
    public final byte[] zza;

    public zzafx(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafx.class == obj.getClass()) {
            zzafx zzafxVar = (zzafx) obj;
            if (this.zzf.equals(zzafxVar.zzf) && Arrays.equals(this.zza, zzafxVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        return Arrays.hashCode(this.zza) + (hashCode * 31);
    }
}
