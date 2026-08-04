package P2;

import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzheg;
import com.google.android.gms.internal.ads.zzheo;

/* JADX INFO: loaded from: classes.dex */
public final class p implements zzheg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0388n f5543a;

    public p(C0388n c0388n) {
        this.f5543a = c0388n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        byte b7;
        zzbbd.zza.EnumC0000zza enumC0000zza;
        switch (this.f5543a.f5535a) {
            case "NATIVE":
                b7 = 2;
                break;
            case "INTERSTITIAL":
                b7 = 1;
                break;
            case "REWARDED":
                b7 = 3;
                break;
            case "BANNER":
                b7 = 0;
                break;
            default:
                b7 = -1;
                break;
        }
        if (b7 == 0) {
            enumC0000zza = zzbbd.zza.EnumC0000zza.BANNER;
        } else if (b7 == 1) {
            enumC0000zza = zzbbd.zza.EnumC0000zza.INTERSTITIAL;
        } else if (b7 != 2) {
            enumC0000zza = b7 != 3 ? zzbbd.zza.EnumC0000zza.AD_INITIATER_UNSPECIFIED : zzbbd.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD;
        } else {
            enumC0000zza = zzbbd.zza.EnumC0000zza.AD_LOADER;
        }
        zzheo.zzb(enumC0000zza);
        return enumC0000zza;
    }
}
