package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbyo implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyp zza;

    zzbyo(zzbyp zzbypVar) {
        Objects.requireNonNull(zzbypVar);
        this.zza = zzbypVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
