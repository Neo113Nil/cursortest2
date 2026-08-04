package com.google.android.gms.internal.ads;

import J2.j;
import L2.i;
import L2.m;
import L2.o;
import L2.t;
import W5.AbstractC0486a1;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.D;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
public final class zzbpr implements i, m, o {
    private final zzbou zza;
    private t zzb;
    private zzbge zzc;

    public zzbpr(zzbou zzbouVar) {
        this.zza = zzbouVar;
    }

    @Override // L2.i
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.i
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i7) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdFailedToLoad with error. " + i7);
        try {
            this.zza.zzg(i7);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.o
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        t tVar = this.zzb;
        if (this.zzc == null) {
            if (tVar == null) {
                j.i("#007 Could not call remote method.", null);
                return;
            } else if (!tVar.f4326m) {
                j.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        j.b("Adapter called onAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.i
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.i
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onVideoEnd.");
        try {
            this.zza.zzw();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final t zza() {
        return this.zzb;
    }

    @Override // L2.i
    public final void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAppEvent.");
        try {
            this.zza.zzq(str, str2);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final zzbge zzc() {
        return this.zzc;
    }

    @Override // L2.o
    public final void zzd(MediationNativeAdapter mediationNativeAdapter, zzbge zzbgeVar) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(zzbgeVar.zzb())));
        this.zzc = zzbgeVar;
        try {
            this.zza.zzo();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.o
    public final void zze(MediationNativeAdapter mediationNativeAdapter, zzbge zzbgeVar, String str) {
        try {
            this.zza.zzr(zzbgeVar.zza(), str);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.m
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.i
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, C1057a c1057a) {
        D.d("#008 Must be called on the main UI thread.");
        StringBuilder sbJ = AbstractC0486a1.j(c1057a.a(), "Adapter called onAdFailedToLoad with error. ErrorCode: ", ". ErrorMessage: ");
        sbJ.append(c1057a.f18145b);
        sbJ.append(". ErrorDomain: ");
        sbJ.append(c1057a.f18146c);
        j.b(sbJ.toString());
        try {
            this.zza.zzh(c1057a.b());
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.m
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.m
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.o
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        t tVar = this.zzb;
        if (this.zzc == null) {
            if (tVar == null) {
                j.i("#007 Could not call remote method.", null);
                return;
            } else if (!tVar.f4327n) {
                j.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        j.b("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.o
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.o
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, t tVar) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdLoaded.");
        this.zzb = tVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            Object obj = new Object();
            new zzbpe();
            synchronized (obj) {
            }
        }
        try {
            this.zza.zzo();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.o
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.m
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i7) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdFailedToLoad with error " + i7 + ".");
        try {
            this.zza.zzg(i7);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.m
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, C1057a c1057a) {
        D.d("#008 Must be called on the main UI thread.");
        StringBuilder sbJ = AbstractC0486a1.j(c1057a.a(), "Adapter called onAdFailedToLoad with error. ErrorCode: ", ". ErrorMessage: ");
        sbJ.append(c1057a.f18145b);
        sbJ.append(". ErrorDomain: ");
        sbJ.append(c1057a.f18146c);
        j.b(sbJ.toString());
        try {
            this.zza.zzh(c1057a.b());
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i7) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdFailedToLoad with error " + i7 + ".");
        try {
            this.zza.zzg(i7);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // L2.o
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, C1057a c1057a) {
        D.d("#008 Must be called on the main UI thread.");
        StringBuilder sbJ = AbstractC0486a1.j(c1057a.a(), "Adapter called onAdFailedToLoad with error. ErrorCode: ", ". ErrorMessage: ");
        sbJ.append(c1057a.f18145b);
        sbJ.append(". ErrorDomain: ");
        sbJ.append(c1057a.f18146c);
        j.b(sbJ.toString());
        try {
            this.zza.zzh(c1057a.b());
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }
}
