package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* loaded from: classes.dex */
final class zzyw extends ThreadLocal<Mac> {
    private final /* synthetic */ zzyx zza;

    public zzyw(zzyx zzyxVar) {
        this.zza = zzyxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzyf<zzyo, Mac> zzyfVar = zzyf.zzb;
            str = this.zza.zzc;
            Mac zza = zzyfVar.zza(str);
            key = this.zza.zzd;
            zza.init(key);
            return zza;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
