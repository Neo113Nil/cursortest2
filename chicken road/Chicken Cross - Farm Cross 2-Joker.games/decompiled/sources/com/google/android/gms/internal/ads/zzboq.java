package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzboq extends zzbnv {
    final /* synthetic */ zzbos zza;

    /* synthetic */ zzboq(zzbos zzbosVar, byte[] bArr) {
        Objects.requireNonNull(zzbosVar);
        this.zza = zzbosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zze(zzbnm zzbnmVar, String str) {
        zzbos zzbosVar = this.zza;
        if (zzbosVar.zzd() == null) {
            return;
        }
        zzbosVar.zzd().zzc(zzbosVar.zze(zzbnmVar), str);
    }
}
