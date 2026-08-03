package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzccb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzccb> CREATOR = new com.google.android.gms.internal.ads.zzccc();
    public final java.lang.String zza;
    public final int zzb;

    public zzccb(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public static com.google.android.gms.internal.ads.zzccb zza(org.json.JSONArray jSONArray) throws org.json.JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzccb(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzccb)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzccb zzccbVar = (com.google.android.gms.internal.ads.zzccb) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzccbVar.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(zzccbVar.zzb));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
