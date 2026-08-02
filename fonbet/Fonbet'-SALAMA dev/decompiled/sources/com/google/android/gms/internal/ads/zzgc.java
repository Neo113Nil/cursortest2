package com.google.android.gms.internal.ads;

import android.net.Uri;
import e1.k;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgc {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzaq.zzb("media3.datasource");
    }

    public final String toString() {
        StringBuilder k7 = k.k("DataSpec[GET ", this.zza.toString(), ", ");
        k7.append(this.zze);
        k7.append(", ");
        k7.append(this.zzf);
        k7.append(", null, ");
        return k.g(k7, this.zzg, "]");
    }

    public final zzga zza() {
        return new zzga(this, null);
    }

    public final boolean zzb(int i7) {
        return (this.zzg & i7) == i7;
    }

    private zzgc(Uri uri, long j, int i7, byte[] bArr, Map map, long j3, long j7, String str, int i8, Object obj) {
        boolean z4 = false;
        boolean z7 = j3 >= 0;
        zzcv.zzd(z7);
        zzcv.zzd(z7);
        if (j7 <= 0) {
            j7 = j7 == -1 ? -1L : j7;
            zzcv.zzd(z4);
            uri.getClass();
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zze = j3;
            this.zzf = j7;
            this.zzg = i8;
        }
        z4 = true;
        zzcv.zzd(z4);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j3;
        this.zzf = j7;
        this.zzg = i8;
    }

    @Deprecated
    public zzgc(Uri uri, long j, long j3, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j3, null, 0, null);
    }
}
