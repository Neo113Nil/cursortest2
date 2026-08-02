package F2;

import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes.dex */
public final class h1 extends AbstractBinderC0264y {

    /* renamed from: a, reason: collision with root package name */
    public final y2.d f2674a;

    public h1(y2.d dVar) {
        this.f2674a = dVar;
    }

    @Override // F2.InterfaceC0266z
    public final void zzc() {
        y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdClicked();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzd() {
        y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdClosed();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzf(zze zzeVar) {
        y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdFailedToLoad(zzeVar.k());
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzg() {
        y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdImpression();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzi() {
        y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdLoaded();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzj() {
        y2.d dVar = this.f2674a;
        if (dVar != null) {
            dVar.onAdOpened();
        }
    }

    @Override // F2.InterfaceC0266z
    public final void zzk() {
        y2.d dVar = this.f2674a;
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
