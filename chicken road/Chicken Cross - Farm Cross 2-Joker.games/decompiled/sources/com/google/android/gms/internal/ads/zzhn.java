package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhn extends zzhk {
    private final zzhm zza;
    private Uri zzb;
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhn(final byte[] bArr) {
        super(false);
        zzhm zzhmVar = new zzhm() { // from class: com.google.android.gms.internal.ads.zzhl
            @Override // com.google.android.gms.internal.ads.zzhm
            public final /* synthetic */ byte[] zza(Uri uri) {
                return bArr;
            }
        };
        this.zza = zzhmVar;
        zzguk.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zze;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i, min);
        this.zzd += min;
        this.zze -= min;
        zzh(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long zzb(zzhw zzhwVar) throws IOException {
        zzf(zzhwVar);
        Uri uri = zzhwVar.zza;
        this.zzb = uri;
        this.zzc = this.zza.zza(uri);
        long j = zzhwVar.zze;
        int length = this.zzc.length;
        if (j > length) {
            throw new zzht(2008);
        }
        int i = (int) j;
        this.zzd = i;
        int i2 = length - i;
        this.zze = i2;
        long j2 = zzhwVar.zzf;
        if (j2 != -1) {
            this.zze = (int) Math.min(i2, j2);
        }
        this.zzf = true;
        zzg(zzhwVar);
        return j2 != -1 ? j2 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
