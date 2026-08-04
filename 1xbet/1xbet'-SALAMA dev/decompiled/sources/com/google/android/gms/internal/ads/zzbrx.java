package com.google.android.gms.internal.ads;

import F2.BinderC0246o0;
import F2.C0251r0;
import F2.F0;
import F2.InterfaceC0250q0;
import F2.V0;
import F2.X0;
import F2.g1;
import J2.j;
import O2.d;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import p167y2.o;
import p167y2.p;
import p167y2.q;
import p167y2.r;
import p167y2.v;

/* JADX INFO: loaded from: classes.dex */
public final class zzbrx extends NativeAd {
    private final zzbhd zza;
    private final zzbrw zzc;
    private final O2.a zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();

    public zzbrx(zzbhd zzbhdVar) {
        zzbrw zzbrwVar;
        this.zza = zzbhdVar;
        zzbru zzbruVar = null;
        try {
            List listZzu = zzbhdVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    zzbfj zzbfjVarZzg = obj instanceof IBinder ? zzbfi.zzg((IBinder) obj) : null;
                    if (zzbfjVarZzg != null) {
                        this.zzb.add(new zzbrw(zzbfjVarZzg));
                    }
                }
            }
        } catch (RemoteException e7) {
            j.e("", e7);
        }
        try {
            List listZzv = this.zza.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    InterfaceC0250q0 interfaceC0250q0Z = obj2 instanceof IBinder ? V0.Z((IBinder) obj2) : null;
                    if (interfaceC0250q0Z != null) {
                        this.zze.add(new C0251r0(interfaceC0250q0Z));
                    }
                }
            }
        } catch (RemoteException e8) {
            j.e("", e8);
        }
        try {
            zzbfj zzbfjVarZzk = this.zza.zzk();
            zzbrwVar = zzbfjVarZzk != null ? new zzbrw(zzbfjVarZzk) : null;
        } catch (RemoteException e9) {
            j.e("", e9);
        }
        this.zzc = zzbrwVar;
        try {
            if (this.zza.zzi() != null) {
                zzbruVar = new zzbru(this.zza.zzi());
            }
        } catch (RemoteException e10) {
            j.e("", e10);
        }
        this.zzd = zzbruVar;
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        } catch (RemoteException e7) {
            j.e("Failed to cancelUnconfirmedClick", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.zza.zzx();
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final O2.a getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle bundleZzf = this.zza.zzf();
            if (bundleZzf != null) {
                return bundleZzf;
            }
        } catch (RemoteException e7) {
            j.e("", e7);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final O2.b getIcon() {
        return this.zzc;
    }

    public final List<O2.b> getImages() {
        return this.zzb;
    }

    public final o getMediaContent() {
        try {
            if (this.zza.zzj() != null) {
                return new X0(this.zza.zzj(), null);
            }
        } catch (RemoteException e7) {
            j.e("", e7);
        }
        return null;
    }

    public final List<q> getMuteThisAdReasons() {
        return this.zze;
    }

    public final String getPrice() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final v getResponseInfo() {
        F0 f0Zzg;
        try {
            f0Zzg = this.zza.zzg();
        } catch (RemoteException e7) {
            j.e("", e7);
            f0Zzg = null;
        }
        if (f0Zzg != null) {
            return new v(f0Zzg);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double dZze = this.zza.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzH();
        } catch (RemoteException e7) {
            j.e("", e7);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzI();
        } catch (RemoteException e7) {
            j.e("", e7);
            return false;
        }
    }

    public final void muteThisAd(q qVar) {
        try {
            try {
                if (this.zza.zzI()) {
                    if (qVar == null) {
                        this.zza.zzy(null);
                        return;
                    } else if (qVar instanceof C0251r0) {
                        this.zza.zzy(((C0251r0) qVar).f2716b);
                        return;
                    } else {
                        j.d("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e7) {
                j.e("", e7);
            }
            j.d("Ad is not custom mute enabled");
        } catch (RemoteException e8) {
            j.e("", e8);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException e7) {
            j.e("Failed to record native event", e7);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzJ(bundle);
        } catch (RemoteException e7) {
            j.e("", e7);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final void setMuteThisAdListener(p pVar) {
        try {
            this.zza.zzE(new BinderC0246o0("com.google.android.gms.ads.internal.client.IMuteThisAdListener"));
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(r rVar) {
        try {
            this.zza.zzF(new g1(rVar));
        } catch (RemoteException e7) {
            j.e("Failed to setOnPaidEventListener", e7);
        }
    }

    public final void setUnconfirmedClickListener(d dVar) {
        try {
            this.zza.zzG(new zzbse(dVar));
        } catch (RemoteException e7) {
            j.e("Failed to setUnconfirmedClickListener", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }
}
