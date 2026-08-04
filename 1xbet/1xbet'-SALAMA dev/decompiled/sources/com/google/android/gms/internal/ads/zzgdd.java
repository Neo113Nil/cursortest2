package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzgdd {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzgdc zza(String str) throws GeneralSecurityException {
        for (zzgdc zzgdcVar : zza) {
            if (zzgdcVar.zza()) {
                return zzgdcVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
