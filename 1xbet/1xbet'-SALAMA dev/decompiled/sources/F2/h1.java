package F2;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends AbstractBinderC0264y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p167y2.d f2674a;

    public h1(p167y2.d dVar) {
        this.f2674a = dVar;
    }

    @Override // F2.InterfaceC0266z
    public final void zzc() {
        p167y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdClicked();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzd() {
        p167y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdClosed();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzf(zze zzeVar) {
        p167y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdFailedToLoad(zzeVar.k());
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzg() {
        p167y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdImpression();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzi() {
        p167y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdLoaded();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzj() {
        p167y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdOpened();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzk() {
        p167y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdSwipeGestureClicked();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzh() {
    }

    @Override // F2.InterfaceC0266z
    public final void zze(int i7) {
    }
}
