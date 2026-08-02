package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzgug implements zzguj {
    private final zzgut zza;

    @Override // com.google.android.gms.internal.ads.zzguj
    public final Object zza(String str) {
        Iterator it = zzgul.zzb("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
