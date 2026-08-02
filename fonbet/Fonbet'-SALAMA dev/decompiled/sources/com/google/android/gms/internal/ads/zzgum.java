package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class zzgum implements zzgut {
    @Override // com.google.android.gms.internal.ads.zzgut
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
