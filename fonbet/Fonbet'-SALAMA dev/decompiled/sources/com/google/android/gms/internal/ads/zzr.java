package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzr implements Parcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzq();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    public zzr(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i7 = zzen.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzr zzrVar = (zzr) obj;
        String str = this.zzb;
        String str2 = zzrVar.zzb;
        int i7 = zzen.zza;
        return Objects.equals(str, str2) && Objects.equals(this.zzc, zzrVar.zzc) && Objects.equals(this.zza, zzrVar.zza) && Arrays.equals(this.zzd, zzrVar.zzd);
    }

    public final int hashCode() {
        int i7 = this.zze;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int d7 = AbstractC1663a.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.zzc) + Arrays.hashCode(this.zzd);
        this.zze = d7;
        return d7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzr(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = zzay.zze(str2);
        this.zzd = bArr;
    }
}
