package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbsb extends zzbry {
    final /* synthetic */ zzcgo zza;

    zzbsb(zzbsc zzbscVar, zzcgo zzcgoVar) {
        this.zza = zzcgoVar;
        Objects.requireNonNull(zzbscVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrz
    public final void zza(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}
