package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzn {
    private final java.util.List zza = new java.util.ArrayList();

    public final java.util.List zza() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.play.core.splitinstall.internal.zzp zzpVar : this.zza) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, zzpVar.zza());
            bundle.putLong("event_timestamp", zzpVar.zzb());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void zzb(int i) {
        this.zza.add(com.google.android.play.core.splitinstall.internal.zzp.zzc(i, java.lang.System.currentTimeMillis()));
    }
}
