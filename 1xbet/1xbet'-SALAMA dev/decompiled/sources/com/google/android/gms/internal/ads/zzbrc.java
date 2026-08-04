package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p167y2.w;

/* JADX INFO: loaded from: classes.dex */
public final class zzbrc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrc> CREATOR = new zzbrd();
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzbrc(int i7, int i8, int i9) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
    }

    public static zzbrc zza(w wVar) {
        return new zzbrc(wVar.f18192a, wVar.f18193b, wVar.f18194c);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbrc)) {
            zzbrc zzbrcVar = (zzbrc) obj;
            if (zzbrcVar.zzc == this.zzc && zzbrcVar.zzb == this.zzb && zzbrcVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        int i9 = this.zzb;
        D.B0(parcel, 2, 4);
        parcel.writeInt(i9);
        int i10 = this.zzc;
        D.B0(parcel, 3, 4);
        parcel.writeInt(i10);
        D.z0(iX0, parcel);
    }
}
