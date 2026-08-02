package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzfv;
import com.google.android.gms.internal.fido.zzfx;
import com.google.android.gms.internal.fido.zzgj;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class V extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<V> CREATOR = new W();
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public V(byte[][] bArr) {
        C0875q.a(bArr != null);
        C0875q.a(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            C0875q.a(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            C0875q.a(bArr[i2] != null);
            int length = bArr[i2].length;
            C0875q.a(length == 32 || length == 64);
            i += 2;
        }
        this.a = bArr;
    }

    public static V l(JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(n(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(o(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(Base64Utils.decodeUrlSafeNoPadding(next));
                    if (z) {
                        arrayList.add(n(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(o(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new V((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject m(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64Utils.encodeUrlSafeNoPadding(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] n(JSONObject jSONObject) throws JSONException {
        byte[] decodeUrlSafeNoPadding = Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("first"));
        if (decodeUrlSafeNoPadding.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return decodeUrlSafeNoPadding;
        }
        byte[] decodeUrlSafeNoPadding2 = Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("second"));
        if (decodeUrlSafeNoPadding2.length == 32) {
            return zzgj.zza(decodeUrlSafeNoPadding, decodeUrlSafeNoPadding2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] o(JSONObject jSONObject) throws JSONException {
        byte[] decodeUrlSafeNoPadding = Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("first"));
        zzfv zza = zzfx.zza().zza();
        byte[] bArr = b;
        zza.zza(bArr);
        zza.zza(decodeUrlSafeNoPadding);
        byte[] zzd = zza.zzc().zzd();
        if (!jSONObject.has("second")) {
            return zzd;
        }
        byte[] decodeUrlSafeNoPadding2 = Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("second"));
        zzfv zza2 = zzfx.zza().zza();
        zza2.zza(bArr);
        zza2.zza(decodeUrlSafeNoPadding2);
        return zzgj.zza(zzd, zza2.zzc().zzd());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof V) {
            return Arrays.deepEquals(this.a, ((V) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", m(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(Base64Utils.encodeUrlSafeNoPadding(bArr[i]), m(bArr[i + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return android.support.v4.media.b.b("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        byte[][] bArr = this.a;
        if (bArr != null) {
            int q2 = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            com.google.android.gms.common.internal.safeparcel.c.r(parcel, q2);
        }
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
