package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zze {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    /* synthetic */ zze(org.json.JSONObject jSONObject, com.android.billingclient.api.zzd zzdVar) {
        this.zza = jSONObject.optString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.zzb = jSONObject.optString(com.ironsource.X3.i.m);
        java.lang.String optString = jSONObject.optString("offerToken");
        this.zzc = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.android.billingclient.api.zze)) {
            return false;
        }
        com.android.billingclient.api.zze zzeVar = (com.android.billingclient.api.zze) obj;
        return this.zza.equals(zzeVar.zza) && this.zzb.equals(zzeVar.zzb) && java.util.Objects.equals(this.zzc, zzeVar.zzc);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("{id: %s, type: %s, offer token: %s}", this.zza, this.zzb, this.zzc);
    }
}
