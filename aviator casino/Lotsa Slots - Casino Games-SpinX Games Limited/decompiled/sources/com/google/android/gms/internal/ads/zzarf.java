package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzarf {
    public final int zza;
    public final java.lang.String zzb;
    public final int zzc;
    public final java.util.List zzd;
    public final byte[] zze;

    public zzarf(int i, java.lang.String str, int i2, java.util.List list, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
        this.zzd = list == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i = this.zzc;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }
}
