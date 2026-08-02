package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public final class zzgun implements zzgut {
    @Override // com.google.android.gms.internal.ads.zzgut
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
