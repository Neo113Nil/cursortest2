package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzs implements Comparator<zzr>, Parcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzp();
    public final String zza;
    public final int zzb;
    private final zzr[] zzc;
    private int zzd;

    public zzs(Parcel parcel) {
        this.zza = parcel.readString();
        zzr[] zzrVarArr = (zzr[]) parcel.createTypedArray(zzr.CREATOR);
        int i7 = zzen.zza;
        this.zzc = zzrVarArr;
        this.zzb = zzrVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzr zzrVar, zzr zzrVar2) {
        zzr zzrVar3 = zzrVar;
        zzr zzrVar4 = zzrVar2;
        UUID uuid = zzh.zza;
        return uuid.equals(zzrVar3.zza) ? !uuid.equals(zzrVar4.zza) ? 1 : 0 : zzrVar3.zza.compareTo(zzrVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzs.class == obj.getClass()) {
            zzs zzsVar = (zzs) obj;
            String str = this.zza;
            String str2 = zzsVar.zza;
            int i7 = zzen.zza;
            if (Objects.equals(str, str2) && Arrays.equals(this.zzc, zzsVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzd;
        if (i7 != 0) {
            return i7;
        }
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzr zza(int i7) {
        return this.zzc[i7];
    }

    public final zzs zzb(String str) {
        int i7 = zzen.zza;
        return Objects.equals(this.zza, str) ? this : new zzs(str, false, this.zzc);
    }

    private zzs(String str, boolean z4, zzr... zzrVarArr) {
        this.zza = str;
        zzrVarArr = z4 ? (zzr[]) zzrVarArr.clone() : zzrVarArr;
        this.zzc = zzrVarArr;
        this.zzb = zzrVarArr.length;
        Arrays.sort(zzrVarArr, this);
    }

    public zzs(String str, zzr... zzrVarArr) {
        this(null, true, zzrVarArr);
    }

    public zzs(List list) {
        this(null, false, (zzr[]) list.toArray(new zzr[0]));
    }
}
