package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzank {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzank(int i7, String str, int i8, List list, byte[] bArr) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = i8;
        this.zzd = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i7 = this.zzc;
        if (i7 != 2) {
            return i7 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
