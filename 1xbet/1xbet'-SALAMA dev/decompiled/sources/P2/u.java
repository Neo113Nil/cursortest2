package P2;

import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzfdy;
import com.google.android.gms.internal.ads.zzheg;
import com.google.android.gms.internal.ads.zzhep;

/* JADX INFO: loaded from: classes.dex */
public final class u implements zzheg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzhep f5562b;

    public /* synthetic */ u(zzhep zzhepVar, int i7) {
        this.f5561a = i7;
        this.f5562b = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        switch (this.f5561a) {
            case 0:
                return new t(zzfdy.zzc(), ((zzdvv) this.f5562b).zzb());
            default:
                return new L((zzdqv) this.f5562b.zzb());
        }
    }
}
