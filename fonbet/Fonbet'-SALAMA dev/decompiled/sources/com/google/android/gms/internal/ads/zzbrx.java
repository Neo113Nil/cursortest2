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
import y2.o;
import y2.p;
import y2.q;
import y2.r;
import y2.v;

/* loaded from: classes.dex */
public final class zzbrx extends NativeAd {
    private final zzbhd zza;
    private final zzbrw zzc;
    private final O2.a zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(3:2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6)))|(3:19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23)))|(2:36|37)|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        J2.j.e("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[Catch: RemoteException -> 0x00a9, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00a9, blocks: (B:42:0x0094, B:44:0x009c), top: B:41:0x0094 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbrx(zzbhd zzbhdVar) {
        zzbrw zzbrwVar;
        zzbfj zzk;
        this.zza = zzbhdVar;
        zzbru zzbruVar = null;
        try {
            List zzu = zzbhdVar.zzu();
            if (zzu != null) {
                for (Object obj : zzu) {
                    zzbfj zzg = obj instanceof IBinder ? zzbfi.zzg((IBinder) obj) : null;
                    if (zzg != null) {
                        this.zzb.add(new zzbrw(zzg));
                    }
                }
            }
        } catch (RemoteException e7) {
            j.e("", e7);
        }
        try {
            List zzv = this.zza.zzv();
            if (zzv != null) {
                for (Object obj2 : zzv) {
                    InterfaceC0250q0 Z6 = obj2 instanceof IBinder ? V0.Z((IBinder) obj2) : null;
                    if (Z6 != null) {
                        this.zze.add(new C0251r0(Z6));
                    }
                }
            }
        } catch (RemoteException e8) {
            j.e("", e8);
        }
        try {
            zzk = this.zza.zzk();
        } catch (RemoteException e9) {
            j.e("", e9);
        }
        if (zzk != null) {
            zzbrwVar = new zzbrw(zzk);
            this.zzc = zzbrwVar;
            if (this.zza.zzi() != null) {
                zzbruVar = new zzbru(this.zza.zzi());
            }
            this.zzd = zzbruVar;
        }
        zzbrwVar = null;
        this.zzc = zzbrwVar;
        if (this.zza.zzi() != null) {
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
            Bundle zzf = this.zza.zzf();
            if (zzf != null) {
                return zzf;
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
        F0 f02;
        try {
            f02 = this.zza.zzg();
        } catch (RemoteException e7) {
            j.e("", e7);
            f02 = null;
        }
        if (f02 != null) {
            return new v(f02);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double zze = this.zza.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
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
