package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzak extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzak> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzal();
    private static final byte[] zza = "WebAuthn PRF\u0000".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    private final byte[][] zzb;

    public zzak(byte[][] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(bArr != null);
        com.google.android.gms.common.internal.Preconditions.checkArgument(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            com.google.android.gms.common.internal.Preconditions.checkArgument(bArr[i2] != null);
            int length = bArr[i2].length;
            com.google.android.gms.common.internal.Preconditions.checkArgument(length == 32 || length == 64);
            i += 2;
        }
        this.zzb = bArr;
    }

    public static com.google.android.gms.fido.fido2.api.common.zzak zza(org.json.JSONObject jSONObject, boolean z) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(zzd(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(zze(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    arrayList.add(com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(next));
                    if (z) {
                        arrayList.add(zzd(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(zze(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new com.google.android.gms.fido.fido2.api.common.zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (java.lang.IllegalArgumentException unused) {
            throw new org.json.JSONException("invalid base64url value");
        }
    }

    private static org.json.JSONObject zzb(byte[] bArr) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(bArr));
            return jSONObject;
        }
        jSONObject.put("first", android.util.Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", android.util.Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    private static byte[] zzc(byte[] bArr) {
        com.google.android.gms.internal.fido.zzfv zza2 = com.google.android.gms.internal.fido.zzfx.zza().zza();
        zza2.zza(zza);
        zza2.zza(bArr);
        return zza2.zzc().zzd();
    }

    private static byte[] zzd(org.json.JSONObject jSONObject) throws org.json.JSONException {
        byte[] decodeUrlSafeNoPadding = com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("first"));
        if (decodeUrlSafeNoPadding.length != 32) {
            throw new org.json.JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return decodeUrlSafeNoPadding;
        }
        byte[] decodeUrlSafeNoPadding2 = com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("second"));
        if (decodeUrlSafeNoPadding2.length == 32) {
            return com.google.android.gms.internal.fido.zzgj.zza(decodeUrlSafeNoPadding, decodeUrlSafeNoPadding2);
        }
        throw new org.json.JSONException("hashed PRF value with wrong length");
    }

    private static byte[] zze(org.json.JSONObject jSONObject) throws org.json.JSONException {
        byte[] zzc = zzc(com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("first")));
        return !jSONObject.has("second") ? zzc : com.google.android.gms.internal.fido.zzgj.zza(zzc, zzc(com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("second"))));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.fido.fido2.api.common.zzak) {
            return java.util.Arrays.deepEquals(this.zzb, ((com.google.android.gms.fido.fido2.api.common.zzak) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.zzb) {
            if (bArr != null) {
                i ^= com.google.android.gms.common.internal.Objects.hashCode(bArr);
            }
        }
        return i;
    }

    public final java.lang.String toString() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i = 0;
            org.json.JSONObject jSONObject2 = null;
            while (true) {
                byte[][] bArr = this.zzb;
                if (i >= bArr.length) {
                    return "PrfExtension{" + jSONObject.toString() + "}";
                }
                if (bArr[i] == null) {
                    jSONObject.put("eval", zzb(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new org.json.JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(this.zzb[i]), zzb(this.zzb[i + 1]));
                }
                i += 2;
            }
        } catch (org.json.JSONException e) {
            return "PrfExtension{Exception:" + e.getMessage() + "}";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        byte[][] bArr = this.zzb;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArrayArray(parcel, 1, bArr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
