package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzdf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.measurement.zzdf> CREATOR = new com.google.android.gms.internal.measurement.zzdg();
    public final int zza;
    public final java.lang.String zzb;
    public final android.content.Intent zzc;

    public zzdf(int i, java.lang.String str, android.content.Intent intent) {
        this.zza = i;
        this.zzb = str;
        this.zzc = intent;
    }

    public static com.google.android.gms.internal.measurement.zzdf zza(android.app.Activity activity) {
        return new com.google.android.gms.internal.measurement.zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzdf)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzdf zzdfVar = (com.google.android.gms.internal.measurement.zzdf) obj;
        return this.zza == zzdfVar.zza && java.util.Objects.equals(this.zzb, zzdfVar.zzb) && java.util.Objects.equals(this.zzc, zzdfVar.zzc);
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
