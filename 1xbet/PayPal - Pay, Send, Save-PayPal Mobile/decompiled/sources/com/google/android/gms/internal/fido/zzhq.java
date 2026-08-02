package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzhq {
    static final com.google.android.gms.internal.fido.zzhp zza(java.io.InputStream inputStream, com.google.android.gms.internal.fido.zzhs zzhsVar) throws com.google.android.gms.internal.fido.zzhj {
        try {
            return zzb(inputStream, zzhsVar);
        } finally {
            try {
                zzhsVar.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private static final com.google.android.gms.internal.fido.zzhp zzb(java.io.InputStream inputStream, com.google.android.gms.internal.fido.zzhs zzhsVar) throws com.google.android.gms.internal.fido.zzhj {
        try {
            com.google.android.gms.internal.fido.zzhr zzd = zzhsVar.zzd();
            if (zzd == null) {
                throw new com.google.android.gms.internal.fido.zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte zza = zzd.zza();
                byte zzb = zzd.zzb();
                int i = 0;
                if (zzb == Byte.MIN_VALUE) {
                    long zza2 = zzhsVar.zza();
                    if (zza2 > 1000) {
                        throw new com.google.android.gms.internal.fido.zzhj("Parser being asked to read a large CBOR array");
                    }
                    zzc(zza, zza2, inputStream, zzhsVar);
                    com.google.android.gms.internal.fido.zzhp[] zzhpVarArr = new com.google.android.gms.internal.fido.zzhp[(int) zza2];
                    while (i < zza2) {
                        zzhpVarArr[i] = zzb(inputStream, zzhsVar);
                        i++;
                    }
                    return new com.google.android.gms.internal.fido.zzhg(com.google.android.gms.internal.fido.zzcc.zzi(zzhpVarArr));
                }
                if (zzb != -96) {
                    if (zzb == -64) {
                        throw new com.google.android.gms.internal.fido.zzhj("Tags are currently unsupported");
                    }
                    if (zzb == -32) {
                        return new com.google.android.gms.internal.fido.zzhh(zzhsVar.zzf());
                    }
                    if (zzb == 0 || zzb == 32) {
                        long zzb2 = zzhsVar.zzb();
                        zzc(zza, zzb2 > 0 ? zzb2 : ~zzb2, inputStream, zzhsVar);
                        return new com.google.android.gms.internal.fido.zzhk(zzb2);
                    }
                    if (zzb == 64) {
                        byte[] zzg = zzhsVar.zzg();
                        int length = zzg.length;
                        zzc(zza, length, inputStream, zzhsVar);
                        return new com.google.android.gms.internal.fido.zzhi(com.google.android.gms.internal.fido.zzgx.zzl(zzg, 0, length));
                    }
                    if (zzb == 96) {
                        java.lang.String zze = zzhsVar.zze();
                        zzc(zza, zze.length(), inputStream, zzhsVar);
                        return new com.google.android.gms.internal.fido.zzhn(zze);
                    }
                    throw new com.google.android.gms.internal.fido.zzhj("Unidentifiable major type: " + zzd.zzc());
                }
                long zzc = zzhsVar.zzc();
                if (zzc > 1000) {
                    throw new com.google.android.gms.internal.fido.zzhj("Parser being asked to read a large CBOR map");
                }
                zzc(zza, zzc, inputStream, zzhsVar);
                int i2 = (int) zzc;
                com.google.android.gms.internal.fido.zzhl[] zzhlVarArr = new com.google.android.gms.internal.fido.zzhl[i2];
                com.google.android.gms.internal.fido.zzhp zzhpVar = null;
                int i3 = 0;
                while (i3 < zzc) {
                    com.google.android.gms.internal.fido.zzhp zzb3 = zzb(inputStream, zzhsVar);
                    if (zzhpVar != null && zzb3.compareTo(zzhpVar) <= 0) {
                        throw new com.google.android.gms.internal.fido.zzhf(java.lang.String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", zzhpVar.toString(), zzb3.toString()));
                    }
                    zzhlVarArr[i3] = new com.google.android.gms.internal.fido.zzhl(zzb3, zzb(inputStream, zzhsVar));
                    i3++;
                    zzhpVar = zzb3;
                }
                java.util.TreeMap treeMap = new java.util.TreeMap();
                while (i < i2) {
                    com.google.android.gms.internal.fido.zzhl zzhlVar = zzhlVarArr[i];
                    if (treeMap.containsKey(zzhlVar.zza())) {
                        throw new com.google.android.gms.internal.fido.zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(zzhlVar.zza(), zzhlVar.zzb());
                    i++;
                }
                return new com.google.android.gms.internal.fido.zzhm(com.google.android.gms.internal.fido.zzcj.zzf(treeMap));
            } catch (java.io.IOException | java.lang.RuntimeException e) {
                throw new com.google.android.gms.internal.fido.zzhj("Error in decoding CborValue from bytes", e);
            }
        } catch (java.io.IOException e2) {
            throw new com.google.android.gms.internal.fido.zzhj("Error in decoding CborValue from bytes", e2);
        }
    }

    private static final void zzc(byte b, long j, java.io.InputStream inputStream, com.google.android.gms.internal.fido.zzhs zzhsVar) throws java.io.IOException {
        switch (b) {
            case 24:
                if (j >= 24) {
                    return;
                }
                throw new com.google.android.gms.internal.fido.zzhf("Integer value " + j + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j >= 256) {
                    return;
                }
                throw new com.google.android.gms.internal.fido.zzhf("Integer value " + j + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j >= 65536) {
                    return;
                }
                throw new com.google.android.gms.internal.fido.zzhf("Integer value " + j + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j >= 4294967296L) {
                    return;
                }
                throw new com.google.android.gms.internal.fido.zzhf("Integer value " + j + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
