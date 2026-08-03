package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzht {
    public static final /* synthetic */ int zzh = 0;
    public final android.net.Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final java.util.Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        com.google.android.gms.internal.ads.zzal.zzb("media3.datasource");
    }

    private zzht(android.net.Uri uri, long j, int i, byte[] bArr, java.util.Map map, long j2, long j3, java.lang.String str, int i2, java.lang.Object obj) {
        boolean z = false;
        boolean z2 = j2 >= 0;
        com.google.android.gms.internal.ads.zzgtj.zza(z2);
        com.google.android.gms.internal.ads.zzgtj.zza(z2);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1L : j3;
            com.google.android.gms.internal.ads.zzgtj.zza(z);
            uri.getClass();
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
            this.zze = j2;
            this.zzf = j3;
            this.zzg = i2;
        }
        z = true;
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
        this.zze = j2;
        this.zzf = j3;
        this.zzg = i2;
    }

    /* synthetic */ zzht(android.net.Uri uri, long j, int i, byte[] bArr, java.util.Map map, long j2, long j3, java.lang.String str, int i2, java.lang.Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j2, j3, null, i2, null);
    }

    @java.lang.Deprecated
    public zzht(android.net.Uri uri, long j, long j2, java.lang.String str) {
        this(uri, 0L, 1, null, java.util.Collections.emptyMap(), j, j2, null, 0, null);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        long j = this.zze;
        int length2 = java.lang.String.valueOf(j).length();
        long j2 = this.zzf;
        int length3 = java.lang.String.valueOf(j2).length();
        int i = this.zzg;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 15 + length2 + 2 + length3 + 8 + java.lang.String.valueOf(i).length() + 1);
        sb.append("DataSpec[GET ");
        sb.append(obj);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", null, ");
        sb.append(i);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    public final boolean zza(int i) {
        return (this.zzg & i) == i;
    }

    public final com.google.android.gms.internal.ads.zzhs zzb() {
        return new com.google.android.gms.internal.ads.zzhs(this, null);
    }
}
