package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;

/* loaded from: classes4.dex */
public final class zzjs {
    final Context zza;

    @Nullable
    Boolean zzb;
    long zzc;

    @Nullable
    com.google.android.gms.internal.measurement.zzdd zzd;
    boolean zze;

    @Nullable
    final Long zzf;

    @Nullable
    String zzg;

    public zzjs(Context context, @Nullable com.google.android.gms.internal.measurement.zzdd zzddVar, @Nullable Long l) {
        this.zze = true;
        C0875q.g(context);
        Context applicationContext = context.getApplicationContext();
        C0875q.g(applicationContext);
        this.zza = applicationContext;
        this.zzf = l;
        if (zzddVar != null) {
            this.zzd = zzddVar;
            this.zze = zzddVar.zzc;
            this.zzc = zzddVar.zzb;
            this.zzg = zzddVar.zze;
            Bundle bundle = zzddVar.zzd;
            if (bundle != null) {
                this.zzb = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
