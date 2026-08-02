package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgva implements zzgde {
    private static final byte[] zza = {0};
    private final zzgpn zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgva(zzgnl zzgnlVar) {
        this.zzb = new zzgux(zzgnlVar.zze().zzd(zzgcr.zza()));
        this.zzc = zzgnlVar.zzc().zzb();
        this.zzd = zzgnlVar.zzd().zzd();
        if (zzgnlVar.zzc().zzf().equals(zzgnr.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgde zza(zzgnl zzgnlVar) {
        return new zzgva(zzgnlVar);
    }

    public static zzgde zzb(zzgoa zzgoaVar) {
        return new zzgva(zzgoaVar);
    }

    public final byte[] zzc(byte[] bArr) {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzgud.zzb(this.zzd, this.zzb.zza(zzgud.zzb(bArr, bArr2), this.zzc)) : zzgud.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgva(zzgoa zzgoaVar) {
        String valueOf = String.valueOf(zzgoaVar.zzc().zzf());
        this.zzb = new zzguz("HMAC".concat(valueOf), new SecretKeySpec(zzgoaVar.zze().zzd(zzgcr.zza()), "HMAC"));
        this.zzc = zzgoaVar.zzc().zzb();
        this.zzd = zzgoaVar.zzd().zzd();
        if (zzgoaVar.zzc().zzg().equals(zzgoi.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgva(zzgpn zzgpnVar, int i7) {
        this.zzb = zzgpnVar;
        this.zzc = i7;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgpnVar.zza(new byte[0], i7);
    }
}
