package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzgdd {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzgdc zza(String str) {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzgdc zzgdcVar = (zzgdc) it.next();
            if (zzgdcVar.zza()) {
                return zzgdcVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
