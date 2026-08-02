package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes4.dex */
public final class e extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new l();
    public final b a;
    public final String b;
    public final String c;

    public e(@NonNull b bVar, @NonNull String str, @NonNull String str2) {
        C0875q.g(bVar);
        this.a = bVar;
        this.c = str;
        this.b = str2;
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.c;
        if (str == null) {
            if (eVar.c != null) {
                return false;
            }
        } else if (!str.equals(eVar.c)) {
            return false;
        }
        b bVar = eVar.a;
        String str2 = eVar.b;
        if (!this.a.equals(bVar)) {
            return false;
        }
        String str3 = this.b;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = this.a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @NonNull
    public final String toString() {
        b bVar = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(bVar.b, 11));
            c cVar = bVar.c;
            if (cVar != c.UNKNOWN) {
                jSONObject.put("version", cVar.a);
            }
            List list = bVar.d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
