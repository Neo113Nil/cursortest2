package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class zzbvm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvm> CREATOR = new zzbvn();
    public final String zza;
    public final int zzb;

    public zzbvm(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    public static zzbvm zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbvm(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvm)) {
            zzbvm zzbvmVar = (zzbvm) obj;
            if (D.m(this.zza, zzbvmVar.zza)) {
                if (D.m(Integer.valueOf(this.zzb), Integer.valueOf(zzbvmVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 2, str, false);
        int i8 = this.zzb;
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(i8);
        Y4.D.z0(iX0, parcel);
    }
}
