package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgmi {
    private static final zzgvd zza = zzgvd.zzb(new byte[0]);
    private final Map zzb;

    public final Iterable zza(byte[] bArr) {
        List list = (List) this.zzb.get(zza);
        List list2 = bArr.length >= 5 ? (List) this.zzb.get(zzgvd.zzc(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new zzgme(this, list2, list);
    }
}
