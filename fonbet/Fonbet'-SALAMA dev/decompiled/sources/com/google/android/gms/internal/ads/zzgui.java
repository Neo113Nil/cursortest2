package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzgui implements zzguj {
    private final zzgut zza;

    @Override // com.google.android.gms.internal.ads.zzguj
    public final Object zza(String str) {
        Iterator it = zzgul.zzb("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
