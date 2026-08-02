package com.google.android.gms.common.api;

/* loaded from: classes8.dex */
final class zza implements android.os.Parcelable.Creator {
    private static final com.google.android.gms.common.api.zza zzb = new com.google.android.gms.common.api.zza(new com.google.android.gms.common.api.zzb());
    private final android.os.Parcelable.Creator zza;

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return com.google.android.gms.common.api.zzb.zza(parcel);
        }
        parcel.setDataPosition(dataPosition - 4);
        return com.google.android.gms.common.api.ApiMetadata.getEmptyInstance();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.common.api.ApiMetadata[i];
    }

    public static com.google.android.gms.common.api.zza zza() {
        return zzb;
    }

    private zza(android.os.Parcelable.Creator creator) {
        this.zza = creator;
    }
}
