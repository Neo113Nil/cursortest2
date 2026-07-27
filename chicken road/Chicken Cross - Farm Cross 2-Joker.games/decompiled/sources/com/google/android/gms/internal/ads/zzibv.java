package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzibv extends ThreadLocal {
    final /* synthetic */ zzibw zza;

    zzibv(zzibw zzibwVar) {
        Objects.requireNonNull(zzibwVar);
        this.zza = zzibwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzibh zzibhVar = zzibh.zzb;
            zzibw zzibwVar = this.zza;
            Mac mac = (Mac) zzibhVar.zzb(zzibwVar.zzb());
            mac.init(zzibwVar.zzc());
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
