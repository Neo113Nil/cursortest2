package F2;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzblt;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p167y2.e f2680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzblt f2681b;

    public i1(p167y2.e eVar, zzblt zzbltVar) {
        this.f2680a = eVar;
        this.f2681b = zzbltVar;
    }

    @Override // F2.C
    public final void zzb(zze zzeVar) {
        p167y2.e eVar = this.f2680a;
        if (eVar != null) {
            eVar.onAdFailedToLoad(zzeVar.k());
        }
    }

    @Override // F2.C
    public final void zzc() {
        zzblt zzbltVar;
        p167y2.e eVar = this.f2680a;
        if (eVar == null || (zzbltVar = this.f2681b) == null) {
            return;
        }
        eVar.onAdLoaded(zzbltVar);
    }
}
