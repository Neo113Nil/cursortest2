package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzgwz {
    private static final zzgwz zza = new zzgwx();
    private static final zzgwz zzb = new zzgwy(-1);
    private static final zzgwz zzc = new zzgwy(1);

    /* synthetic */ zzgwz(byte[] bArr) {
    }

    public static zzgwz zzg() {
        return zza;
    }

    public abstract zzgwz zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgwz zzb(int i, int i2);

    public abstract zzgwz zzc(boolean z, boolean z2);

    public abstract zzgwz zzd(boolean z, boolean z2);

    public abstract int zze();
}
