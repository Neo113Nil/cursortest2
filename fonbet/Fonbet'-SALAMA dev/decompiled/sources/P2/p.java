package P2;

import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzheg;
import com.google.android.gms.internal.ads.zzheo;

/* loaded from: classes.dex */
public final class p implements zzheg {

    /* renamed from: a, reason: collision with root package name */
    public final C0388n f5543a;

    public p(C0388n c0388n) {
        this.f5543a = c0388n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        char c3;
        String str = this.f5543a.f5535a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        zzbbd.zza.EnumC0000zza enumC0000zza = c3 != 0 ? c3 != 1 ? c3 != 2 ? c3 != 3 ? zzbbd.zza.EnumC0000zza.AD_INITIATER_UNSPECIFIED : zzbbd.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD : zzbbd.zza.EnumC0000zza.AD_LOADER : zzbbd.zza.EnumC0000zza.INTERSTITIAL : zzbbd.zza.EnumC0000zza.BANNER;
        zzheo.zzb(enumC0000zza);
        return enumC0000zza;
    }
}
