package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class v0 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<v0> CREATOR = new w0();
    public final boolean a;

    @Nullable
    public final zzgx b;

    public v0(boolean z, @Nullable zzgx zzgxVar) {
        this.a = z;
        this.b = zzgxVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && C0874p.a(this.b, v0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final JSONObject l() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            zzgx zzgxVar = this.b;
            byte[] zzm = zzgxVar == null ? null : zzgxVar.zzm();
            if (zzm != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(zzm, 32), 11));
                if (zzm.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(zzm, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final String toString() {
        return android.support.v4.media.b.b("AuthenticationExtensionsPrfOutputs{", l().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        zzgx zzgxVar = this.b;
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, zzgxVar == null ? null : zzgxVar.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
