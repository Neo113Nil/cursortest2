package com.google.android.gms.ads.formats;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public final class PublisherAdViewOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> CREATOR = new com.google.android.gms.ads.formats.zzf();
    private final boolean zza;
    private final com.google.android.gms.ads.internal.client.zzcl zzb;
    private final android.os.IBinder zzc;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    @java.lang.Deprecated
    public static final class Builder {
        public com.google.android.gms.ads.formats.PublisherAdViewOptions.Builder setShouldDelayBannerRenderingListener(com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }

    PublisherAdViewOptions(boolean z, android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        this.zza = z;
        this.zzb = iBinder != null ? com.google.android.gms.ads.internal.client.zzck.zzd(iBinder) : null;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzclVar == null ? null : zzclVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zza() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzcl zzb() {
        return this.zzb;
    }
}
