package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public class AuthenticatorAttestationResponse extends com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzk();
    private final com.google.android.gms.internal.fido.zzgx zza;
    private final com.google.android.gms.internal.fido.zzgx zzb;
    private final com.google.android.gms.internal.fido.zzgx zzc;
    private final java.lang.String[] zzd;

    AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.String[] strArr) {
        byte[] bArr4 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        com.google.android.gms.internal.fido.zzgx zzgxVar = com.google.android.gms.internal.fido.zzgx.zzb;
        com.google.android.gms.internal.fido.zzgx zzl = com.google.android.gms.internal.fido.zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr2);
        com.google.android.gms.internal.fido.zzgx zzl2 = com.google.android.gms.internal.fido.zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr3);
        com.google.android.gms.internal.fido.zzgx zzl3 = com.google.android.gms.internal.fido.zzgx.zzl(bArr6, 0, bArr6.length);
        this.zza = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzl);
        this.zzb = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzl2);
        this.zzc = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzl3);
        this.zzd = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse authenticatorAttestationResponse = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, authenticatorAttestationResponse.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, authenticatorAttestationResponse.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, authenticatorAttestationResponse.zzc);
    }

    public byte[] getAttestationObject() {
        return this.zzc.zzm();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        return this.zzb.zzm();
    }

    @java.lang.Deprecated
    public byte[] getKeyHandle() {
        return this.zza.zzm();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(com.google.android.gms.common.internal.Objects.hashCode(this.zza)), java.lang.Integer.valueOf(com.google.android.gms.common.internal.Objects.hashCode(this.zzb)), java.lang.Integer.valueOf(com.google.android.gms.common.internal.Objects.hashCode(this.zzc)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public java.lang.String toString() {
        com.google.android.gms.internal.fido.zzbi zza = com.google.android.gms.internal.fido.zzbj.zza(this);
        com.google.android.gms.internal.fido.zzgf zzf = com.google.android.gms.internal.fido.zzgf.zzf();
        byte[] keyHandle = getKeyHandle();
        zza.zzb(com.google.android.gms.fido.u2f.api.common.SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzf.zzg(keyHandle, 0, keyHandle.length));
        com.google.android.gms.internal.fido.zzgf zzf2 = com.google.android.gms.internal.fido.zzgf.zzf();
        byte[] clientDataJSON = getClientDataJSON();
        zza.zzb("clientDataJSON", zzf2.zzg(clientDataJSON, 0, clientDataJSON.length));
        com.google.android.gms.internal.fido.zzgf zzf3 = com.google.android.gms.internal.fido.zzgf.zzf();
        byte[] attestationObject = getAttestationObject();
        zza.zzb("attestationObject", zzf3.zzg(attestationObject, 0, attestationObject.length));
        zza.zzb("transports", java.util.Arrays.toString(this.zzd));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, getAttestationObject(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 5, getTransports(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01ee A[Catch: JSONException -> 0x0245, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0245, blocks: (B:3:0x0002, B:5:0x000b, B:6:0x0018, B:8:0x001c, B:9:0x0029, B:10:0x0030, B:12:0x0035, B:14:0x0043, B:16:0x0050, B:17:0x0049, B:20:0x0053, B:22:0x005c, B:24:0x0064, B:26:0x0076, B:27:0x007e, B:29:0x0082, B:31:0x0094, B:33:0x00b2, B:34:0x00ca, B:39:0x00f0, B:45:0x01da, B:47:0x01ee, B:50:0x010b, B:52:0x011d, B:57:0x0131, B:60:0x0153, B:62:0x0169, B:64:0x016f, B:65:0x0186, B:66:0x018b, B:67:0x018c, B:68:0x0191, B:73:0x019c, B:75:0x01ac, B:77:0x01ba, B:78:0x01cd, B:79:0x01d2, B:80:0x01d3, B:81:0x01d8, B:82:0x01f8, B:83:0x01fd, B:85:0x01ff, B:86:0x0206, B:87:0x0207, B:88:0x020c, B:92:0x0210, B:93:0x0217, B:95:0x0218, B:96:0x021f, B:98:0x0221, B:99:0x0228, B:100:0x0229, B:101:0x0230, B:103:0x0232, B:104:0x0239, B:108:0x023d, B:109:0x0244), top: B:2:0x0002, inners: #0, #5, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.json.JSONObject zza() {
        byte[] zza;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.zzb != null) {
                jSONObject.put("clientDataJSON", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(getClientDataJSON()));
            }
            if (this.zzc != null) {
                jSONObject.put("attestationObject", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(getAttestationObject()));
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int i = 0;
            while (true) {
                java.lang.String[] strArr = this.zzd;
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i].equals(com.google.android.gms.fido.common.Transport.HYBRID.toString())) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, this.zzd[i]);
                }
                i++;
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    com.google.android.gms.internal.fido.zzhp zzhpVar = (com.google.android.gms.internal.fido.zzhp) com.google.android.gms.internal.fido.zzhp.zzj(getAttestationObject()).zzh().zzc().get(com.google.android.gms.internal.fido.zzhp.zzi("authData"));
                    if (zzhpVar == null) {
                        throw new java.lang.IllegalArgumentException("attestation object missing authData");
                    }
                    com.google.android.gms.internal.fido.zzgx zzc = zzhpVar.zze().zzc();
                    java.nio.ByteBuffer zzi = zzc.zzi();
                    try {
                        zzi.position(zzi.position() + 32);
                        if ((zzi.get() & 64) == 0) {
                            throw new java.lang.IllegalArgumentException("authData does not include credential data");
                        }
                        zzi.position(zzi.position() + 4);
                        zzi.position(zzi.position() + 16);
                        zzi.position(zzi.position() + zzi.getShort());
                        try {
                            com.google.android.gms.internal.fido.zzhm zzh = com.google.android.gms.internal.fido.zzhp.zzk(zzc.zzg(zzi.position(), zzc.zzd()).zzh()).zzh();
                            com.google.android.gms.internal.fido.zzhp zzhpVar2 = (com.google.android.gms.internal.fido.zzhp) zzh.zzc().get(com.google.android.gms.internal.fido.zzhp.zzg(3L));
                            com.google.android.gms.internal.fido.zzhp zzhpVar3 = (com.google.android.gms.internal.fido.zzhp) zzh.zzc().get(com.google.android.gms.internal.fido.zzhp.zzg(1L));
                            if (zzhpVar2 == null || zzhpVar3 == null) {
                                throw new java.lang.IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long zzc2 = zzhpVar2.zzf().zzc();
                                long zzc3 = zzhpVar3.zzf().zzc();
                                if (zzc3 != 1) {
                                    if (zzc3 == 2) {
                                        zzc3 = 2;
                                    }
                                    zza = null;
                                    jSONObject.put("authenticatorData", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                    jSONObject.put("publicKeyAlgorithm", zzc2);
                                    if (zza != null) {
                                        jSONObject.put("publicKey", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(zza));
                                    }
                                    return jSONObject;
                                }
                                com.google.android.gms.internal.fido.zzhp zzhpVar4 = (com.google.android.gms.internal.fido.zzhp) zzh.zzc().get(com.google.android.gms.internal.fido.zzhp.zzg(-1L));
                                if (zzhpVar4 == null) {
                                    throw new java.lang.IllegalArgumentException("COSE key missing required fields");
                                }
                                long zzc4 = zzhpVar4.zzf().zzc();
                                if (zzc3 == 2 && zzc4 == 1) {
                                    com.google.android.gms.internal.fido.zzhp zzhpVar5 = (com.google.android.gms.internal.fido.zzhp) zzh.zzc().get(com.google.android.gms.internal.fido.zzhp.zzg(-2L));
                                    com.google.android.gms.internal.fido.zzhp zzhpVar6 = (com.google.android.gms.internal.fido.zzhp) zzh.zzc().get(com.google.android.gms.internal.fido.zzhp.zzg(-3L));
                                    if (zzhpVar5 == null || zzhpVar6 == null) {
                                        throw new java.lang.IllegalArgumentException("COSE key missing required fields");
                                    }
                                    com.google.android.gms.internal.fido.zzgx zzc5 = zzhpVar5.zze().zzc();
                                    com.google.android.gms.internal.fido.zzgx zzc6 = zzhpVar6.zze().zzc();
                                    if (zzc5.zzd() != 32 || zzc6.zzd() != 32) {
                                        throw new java.lang.IllegalArgumentException("COSE coordinates are the wrong size");
                                    }
                                    zza = com.google.android.gms.internal.fido.zzgj.zza(android.util.Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzc5.zzm(), zzc6.zzm());
                                } else {
                                    if (zzc3 == 1 && zzc4 == 6) {
                                        com.google.android.gms.internal.fido.zzhp zzhpVar7 = (com.google.android.gms.internal.fido.zzhp) zzh.zzc().get(com.google.android.gms.internal.fido.zzhp.zzg(-2L));
                                        if (zzhpVar7 == null) {
                                            throw new java.lang.IllegalArgumentException("COSE key missing required fields");
                                        }
                                        com.google.android.gms.internal.fido.zzgx zzc7 = zzhpVar7.zze().zzc();
                                        if (zzc7.zzd() != 32) {
                                            throw new java.lang.IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        zza = com.google.android.gms.internal.fido.zzgj.zza(android.util.Base64.decode("MCowBQYDK2VwAyEA", 0), zzc7.zzm());
                                    }
                                    zza = null;
                                }
                                jSONObject.put("authenticatorData", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                jSONObject.put("publicKeyAlgorithm", zzc2);
                                if (zza != null) {
                                }
                                return jSONObject;
                            } catch (com.google.android.gms.internal.fido.zzho e) {
                                throw new java.lang.IllegalArgumentException("COSE key ill-formed", e);
                            }
                        } catch (com.google.android.gms.internal.fido.zzhj e2) {
                            e = e2;
                            throw new java.lang.IllegalArgumentException("failed to parse COSE key", e);
                        } catch (com.google.android.gms.internal.fido.zzho e3) {
                            e = e3;
                            throw new java.lang.IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (java.lang.IllegalArgumentException e4) {
                        throw new java.lang.IllegalArgumentException("ill-formed authenticator data", e4);
                    }
                } catch (com.google.android.gms.internal.fido.zzho e5) {
                    throw new java.lang.IllegalArgumentException("authData value has wrong type", e5);
                }
            } catch (com.google.android.gms.internal.fido.zzhj e6) {
                e = e6;
                throw new java.lang.IllegalArgumentException("failed to parse attestation object", e);
            } catch (com.google.android.gms.internal.fido.zzho e7) {
                e = e7;
                throw new java.lang.IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (org.json.JSONException e8) {
            throw new java.lang.RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e8);
        }
    }

    public java.lang.String[] getTransports() {
        return this.zzd;
    }

    public com.google.android.gms.internal.fido.zzgx getKeyHandleAsByteString() {
        return this.zza;
    }

    public com.google.android.gms.internal.fido.zzgx getClientDataJSONAsByteString() {
        return this.zzb;
    }

    public com.google.android.gms.internal.fido.zzgx getAttestationObjectAsByteString() {
        return this.zzc;
    }
}
