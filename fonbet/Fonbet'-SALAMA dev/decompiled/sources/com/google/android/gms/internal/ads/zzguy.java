package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* loaded from: classes.dex */
final class zzguy extends ThreadLocal {
    final /* synthetic */ zzguz zza;

    public zzguy(zzguz zzguzVar) {
        this.zza = zzguzVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgul zzgulVar = zzgul.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzgulVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
