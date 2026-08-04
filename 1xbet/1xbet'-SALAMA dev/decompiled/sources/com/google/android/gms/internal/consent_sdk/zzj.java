package com.google.android.gms.internal.consent_sdk;

import B3.d;
import B3.e;
import B3.f;
import B3.g;
import B3.h;
import B3.i;
import android.app.Activity;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    private final zzaq zza;
    private final zzw zzb;
    private final zzbo zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private h zzh = new h(new g(0));

    public zzj(zzaq zzaqVar, zzw zzwVar, zzbo zzboVar) {
        this.zza = zzaqVar;
        this.zzb = zzwVar;
        this.zzc = zzboVar;
    }

    public final boolean canRequestAds() {
        zzaq zzaqVar = this.zza;
        if (!zzaqVar.zzk()) {
            int iZza = !zzc() ? 0 : zzaqVar.zza();
            if (iZza != 1 && iZza != 3) {
                return false;
            }
        }
        return true;
    }

    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    public final f getPrivacyOptionsRequirementStatus() {
        return !zzc() ? f.f1057a : this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    public final void requestConsentInfoUpdate(Activity activity, h hVar, e eVar, d dVar) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = hVar;
        this.zzb.zzc(activity, hVar, eVar, dVar);
    }

    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new e() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // B3.e
                public final void onConsentInfoUpdateSuccess() {
                    this.zza.zzb(false);
                }
            }, new d() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // B3.d
                public final void onConsentInfoUpdateFailure(i iVar) {
                    this.zza.zzb(false);
                }
            });
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z4) {
        synchronized (this.zze) {
            this.zzg = z4;
        }
    }

    public final boolean zzc() {
        boolean z4;
        synchronized (this.zzd) {
            z4 = this.zzf;
        }
        return z4;
    }

    public final boolean zzd() {
        boolean z4;
        synchronized (this.zze) {
            z4 = this.zzg;
        }
        return z4;
    }
}
