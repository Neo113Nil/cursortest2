package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzye<JcePrimitiveT> implements zzyj<JcePrimitiveT> {
    private final zzyl<JcePrimitiveT> zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyj
    public final JcePrimitiveT zza(String str) {
        Iterator<Provider> it = zzyf.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
        return this.zza.zza(str, null);
    }

    private zzye(zzyl<JcePrimitiveT> zzylVar) {
        this.zza = zzylVar;
    }
}
