package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class zzgur implements zzgut {
    @Override // com.google.android.gms.internal.ads.zzgut
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
