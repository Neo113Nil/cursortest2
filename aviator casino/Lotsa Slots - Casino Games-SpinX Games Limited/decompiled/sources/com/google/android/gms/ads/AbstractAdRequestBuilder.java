package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class AbstractAdRequestBuilder<T extends com.google.android.gms.ads.AbstractAdRequestBuilder<T>> {
    protected final com.google.android.gms.ads.internal.client.zzeg zza;

    protected AbstractAdRequestBuilder() {
        com.google.android.gms.ads.internal.client.zzeg zzegVar = new com.google.android.gms.ads.internal.client.zzeg();
        this.zza = zzegVar;
        zzegVar.zze(com.google.android.gms.ads.AdRequest.DEVICE_ID_EMULATOR);
    }

    @java.lang.Deprecated
    public T addCustomEventExtrasBundle(java.lang.Class<? extends com.google.android.gms.ads.mediation.customevent.CustomEvent> cls, android.os.Bundle bundle) {
        this.zza.zzd(cls, bundle);
        return self();
    }

    public T addCustomTargeting(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str2) && str2.contains(",")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        }
        this.zza.zzl(str, str2);
        return self();
    }

    public T addKeyword(java.lang.String str) {
        this.zza.zza(str);
        return self();
    }

    public T addNetworkExtrasBundle(java.lang.Class<? extends com.google.android.gms.ads.mediation.MediationExtrasReceiver> cls, android.os.Bundle bundle) {
        com.google.android.gms.ads.internal.client.zzeg zzegVar = this.zza;
        zzegVar.zzc(cls, bundle);
        if (cls.equals(com.google.ads.mediation.admob.AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            zzegVar.zzf(com.google.android.gms.ads.AdRequest.DEVICE_ID_EMULATOR);
        }
        return self();
    }

    protected abstract T self();

    public T setAdString(java.lang.String str) {
        this.zza.zzo(str);
        return self();
    }

    public T setContentUrl(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Content URL must be non-null.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
        int length = str.length();
        com.google.android.gms.common.internal.Preconditions.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, java.lang.Integer.valueOf(str.length()));
        this.zza.zzg(str);
        return self();
    }

    public T setHttpTimeoutMillis(int i) {
        this.zza.zzp(i);
        return self();
    }

    public T setNeighboringContentUrls(java.util.List<java.lang.String> list) {
        if (list == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("neighboring content URLs list should not be null");
            return self();
        }
        this.zza.zzh(list);
        return self();
    }

    public T setPlacementId(long j) {
        this.zza.zzq(j);
        return self();
    }

    public T setRequestAgent(java.lang.String str) {
        this.zza.zzj(str);
        return self();
    }

    public final com.google.android.gms.ads.AbstractAdRequestBuilder zza(android.os.Bundle bundle) {
        this.zza.zzb(bundle);
        return self();
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.AbstractAdRequestBuilder zzb(java.lang.String str) {
        this.zza.zze(str);
        return self();
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.AbstractAdRequestBuilder zzc(boolean z) {
        this.zza.zzk(z);
        return self();
    }

    @java.lang.Deprecated
    public final com.google.android.gms.ads.AbstractAdRequestBuilder zzd(boolean z) {
        this.zza.zzn(z);
        return self();
    }

    public T addCustomTargeting(java.lang.String str, java.util.List<java.lang.String> list) {
        if (list != null) {
            for (java.lang.String str2 : list) {
                if (!android.text.TextUtils.isEmpty(str2) && str2.contains(",")) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 108);
                    sb.append("Value ");
                    sb.append(str2);
                    sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
                }
            }
            this.zza.zzl(str, android.text.TextUtils.join(",", list));
        }
        return self();
    }
}
