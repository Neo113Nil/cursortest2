package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbos;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbov;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzi;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public class AdLoader {
    private final zzq zza;
    private final Context zzb;
    private final zzbn zzc;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    public static class Builder {
        private final Context zza;
        private final zzbq zzb;

        public Builder(Context context, String str) {
            Context context2 = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            zzbq zzc = zzay.zzb().zzc(context, str, new zzbvq());
            this.zza = context2;
            this.zzb = zzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzq.zza);
            } catch (RemoteException e) {
                zzo.zzg("Failed to build AdLoader.", e);
                return new AdLoader(this.zza, new zzff().zza(), zzq.zza);
            }
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbzg zzbzgVar = new zzbzg(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzi(str, zzbzgVar.zza(), zzbzgVar.zzb());
            } catch (RemoteException e) {
                zzo.zzj("Failed to add custom format ad listener", e);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzm(new zzbzi(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzo.zzj("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzf(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e) {
                zzo.zzj("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzp(adManagerAdViewOptions);
            } catch (RemoteException e) {
                zzo.zzj("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzj(new zzbmk(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfw(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zzb(), nativeAdOptions.zzc(), nativeAdOptions.zzd() - 1));
            } catch (RemoteException e) {
                zzo.zzj("Failed to specify native ad options", e);
            }
            return this;
        }

        @Deprecated
        public final Builder zza(com.google.android.gms.ads.formats.zzg zzgVar) {
            try {
                this.zzb.zzm(new zzbov(zzgVar));
            } catch (RemoteException e) {
                zzo.zzj("Failed to add google native ad listener", e);
            }
            return this;
        }

        @Deprecated
        public final Builder zzb(String str, com.google.android.gms.ads.formats.zze zzeVar, com.google.android.gms.ads.formats.zzd zzdVar) {
            zzbos zzbosVar = new zzbos(zzeVar, zzdVar);
            try {
                this.zzb.zzi(str, zzbosVar.zza(), zzbosVar.zzb());
            } catch (RemoteException e) {
                zzo.zzj("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @Deprecated
        public final Builder zzc(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzj(new zzbmk(nativeAdOptions));
            } catch (RemoteException e) {
                zzo.zzj("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.zzk(new zzbou(onAdManagerAdViewLoadedListener), new zzr(this.zza, adSizeArr));
            } catch (RemoteException e) {
                zzo.zzj("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }
    }

    AdLoader(Context context, zzbn zzbnVar, zzq zzqVar) {
        this.zzb = context;
        this.zzc = zzbnVar;
        this.zza = zzqVar;
    }

    private final void zzb(final zzeh zzehVar) {
        Context context = this.zzb;
        zzbjg.zza(context);
        if (((Boolean) zzblf.zzc.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzd(zzbjg.zzmO)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdLoader.this.zza(zzehVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zze(this.zza.zza(context, zzehVar));
        } catch (RemoteException e) {
            zzo.zzg("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzg();
        } catch (RemoteException e) {
            zzo.zzj("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzc.zzi(this.zza.zza(this.zzb, adRequest.zza), i);
        } catch (RemoteException e) {
            zzo.zzg("Failed to load ads.", e);
        }
    }

    final /* synthetic */ void zza(zzeh zzehVar) {
        try {
            this.zzc.zze(this.zza.zza(this.zzb, zzehVar));
        } catch (RemoteException e) {
            zzo.zzg("Failed to load ad.", e);
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
