package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzguq implements zzgut {
    @Override // com.google.android.gms.internal.ads.zzgut
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
