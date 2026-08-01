package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzazx extends zzazv {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzazx() {
        this.zza = ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = ExifInterface.LONGITUDE_EAST;
        this.zzd = ExifInterface.LONGITUDE_EAST;
        this.zze = ExifInterface.LONGITUDE_EAST;
    }

    public zzazx(String str) {
        String str2 = ExifInterface.LONGITUDE_EAST;
        this.zza = ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = ExifInterface.LONGITUDE_EAST;
        this.zzd = ExifInterface.LONGITUDE_EAST;
        this.zze = ExifInterface.LONGITUDE_EAST;
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = zzb.get(0) == null ? ExifInterface.LONGITUDE_EAST : (String) zzb.get(0);
            this.zzb = zzb.get(1) != null ? ((Long) zzb.get(1)).longValue() : -1L;
            this.zzc = zzb.get(2) == null ? ExifInterface.LONGITUDE_EAST : (String) zzb.get(2);
            this.zzd = zzb.get(3) == null ? ExifInterface.LONGITUDE_EAST : (String) zzb.get(3);
            this.zze = zzb.get(4) != null ? (String) zzb.get(4) : str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazv
    protected final HashMap zza() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(4, this.zze);
        hashMap.put(3, this.zzd);
        hashMap.put(2, this.zzc);
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }
}
