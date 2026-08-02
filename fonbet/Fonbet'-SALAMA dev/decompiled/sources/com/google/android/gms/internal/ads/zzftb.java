package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzftb {
    private final String zza;
    private final zzfta zzb;
    private zzfta zzc;

    public /* synthetic */ zzftb(String str, zzftc zzftcVar) {
        zzfta zzftaVar = new zzfta();
        this.zzb = zzftaVar;
        this.zzc = zzftaVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfta zzftaVar = this.zzb.zzb;
        String str = "";
        while (zzftaVar != null) {
            Object obj = zzftaVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzftaVar = zzftaVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzftb zza(Object obj) {
        zzfta zzftaVar = new zzfta();
        this.zzc.zzb = zzftaVar;
        this.zzc = zzftaVar;
        zzftaVar.zza = obj;
        return this;
    }
}
