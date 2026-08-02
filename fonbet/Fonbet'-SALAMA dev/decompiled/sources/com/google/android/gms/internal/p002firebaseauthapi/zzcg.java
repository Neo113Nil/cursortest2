package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w1.L;

/* loaded from: classes.dex */
public final class zzcg {
    private static final CopyOnWriteArrayList<zzcd> zza = new CopyOnWriteArrayList<>();

    public static zzcd zza(String str) {
        Iterator<zzcd> it = zza.iterator();
        while (it.hasNext()) {
            zzcd next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(L.i("No KMS client does support: ", str));
    }
}
