package com.google.android.gms.games.internal.v2.appshortcuts;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.v2.appshortcuts.zzs> CREATOR = new com.google.android.gms.games.internal.v2.appshortcuts.zzt();
    private final long zza;
    private final java.lang.String zzb;
    private final int zzc;
    private final android.content.ComponentName zzd;
    private final java.lang.String zze;

    zzs(long j, java.lang.String str, int i, android.content.ComponentName componentName, java.lang.String str2) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
        this.zzd = componentName;
        this.zze = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzc;
    }

    public final java.lang.String zzb() {
        return this.zze;
    }
}
