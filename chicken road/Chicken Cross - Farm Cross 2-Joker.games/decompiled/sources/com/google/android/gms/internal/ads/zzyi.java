package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzyi extends zzagw {
    final /* synthetic */ zzyu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzyi(zzyu zzyuVar, zzahk zzahkVar) {
        super(zzahkVar);
        Objects.requireNonNull(zzyuVar);
        this.zza = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagw, com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zza.zzQ();
    }
}
