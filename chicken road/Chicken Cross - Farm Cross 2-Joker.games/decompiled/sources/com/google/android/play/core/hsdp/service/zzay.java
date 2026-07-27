package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzay {
    private int zza = 1;
    private HsdpDeepLinkService.HsdpDeepLinkServiceListener zzb;
    private final String zzc;

    public zzay(String str, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener) {
        this.zzc = str;
        this.zzb = hsdpDeepLinkServiceListener;
    }

    public final String toString() {
        return "HsdpOverlay{'" + this.zzc + "': " + this.zza + ", " + String.valueOf(this.zzb) + "}";
    }

    public final HsdpDeepLinkService.HsdpDeepLinkServiceListener zza() {
        return this.zzb;
    }

    public final void zzb(HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener) {
        this.zzb = hsdpDeepLinkServiceListener;
    }

    public final boolean zzc() {
        return this.zza == 2;
    }

    public final boolean zzd(int i) {
        int i2 = this.zza;
        if (i2 == i) {
            Log.w("HsdpOverlay", "targetPackage: " + this.zzc + " status was already set to " + i);
            return false;
        }
        if (i2 == 4) {
            Log.w("HsdpOverlay", "targetPackage: " + this.zzc + " status was destroyed so cannot be updated");
            return false;
        }
        if (Log.isLoggable("HsdpOverlay", 4)) {
            Log.i("HsdpOverlay", "targetPackage: " + this.zzc + " status: " + this.zza + "->" + i);
        }
        if (i == 2) {
            Bundle bundle = new Bundle();
            bundle.putString("targetPackage", this.zzc);
            this.zzb.onShown(bundle);
        } else if (i == 3) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("targetPackage", this.zzc);
            this.zzb.onDismissed(bundle2);
        } else if (i != 4) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("targetPackage", this.zzc);
            bundle3.putBoolean("dldpRedirect", true);
            this.zzb.onDismissed(bundle3);
        } else if (this.zza == 2) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("targetPackage", this.zzc);
            bundle4.putString("errorMessage", "HSDP overlay destroyed");
            this.zzb.onDismissed(bundle4);
        }
        this.zza = i;
        return true;
    }
}
