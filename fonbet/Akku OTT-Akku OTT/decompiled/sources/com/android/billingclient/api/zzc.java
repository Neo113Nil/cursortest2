package com.android.billingclient.api;

import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.c;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzc {
    private final String zza;
    private final String zzb;

    @Nullable
    private final String zzc;

    public /* synthetic */ zzc(JSONObject jSONObject, zzd zzdVar) {
        this.zza = jSONObject.optString("productId");
        this.zzb = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.zzc = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj;
        return this.zza.equals(zzcVar.zza) && this.zzb.equals(zzcVar.zzb) && Objects.equals(this.zzc, zzcVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return androidx.concurrent.futures.a.a(c.a("{id: ", str, ", type: ", str2, ", offer token: "), this.zzc, "}");
    }
}
