package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzfbp {
    public zzfbp() {
        try {
            zzgdn.zza();
        } catch (GeneralSecurityException e7) {
            J.k("Failed to Configure Aead. ".concat(e7.toString()));
            o.f1952C.f1961g.zzw(e7, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] byteArray;
        try {
            zzgdb zzgdbVarZzb = zzgdb.zzb(zzgcv.zza(zzglq.zzb().zza("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgcl.zzb(zzgdbVarZzb, zzgck.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e7) {
            J.k("Failed to generate key".concat(e7.toString()));
            o.f1952C.f1961g.zzw(e7, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdqk zzdqkVar) {
        zzgdb zzgdbVarZzc;
        if (str != null && (zzgdbVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzgci) zzgdbVarZzc.zzd(zzgdv.zza(), zzgci.class)).zza(bArr, bArr2);
                zzdqkVar.zzb().put("ds", "1");
                return new String(bArrZza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e7) {
                J.k("Failed to decrypt ".concat(e7.toString()));
                o.f1952C.f1961g.zzw(e7, "CryptoUtils.decrypt");
                zzdqkVar.zzb().put("dsf", e7.toString());
            }
        }
        return null;
    }

    private static final zzgdb zzc(String str) {
        try {
            try {
                return zzgcl.zza(zzgcj.zzb(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e7) {
            J.k("Failed to get keysethandle".concat(e7.toString()));
            o.f1952C.f1961g.zzw(e7, "CryptoUtils.getHandle");
            return null;
        }
    }
}
