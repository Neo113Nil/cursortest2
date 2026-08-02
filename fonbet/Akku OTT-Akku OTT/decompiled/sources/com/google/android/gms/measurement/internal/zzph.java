package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.C0875q;

@VisibleForTesting
/* loaded from: classes4.dex */
public final class zzph {
    final Context zza;

    @VisibleForTesting
    public zzph(Context context) {
        C0875q.g(context);
        Context applicationContext = context.getApplicationContext();
        C0875q.g(applicationContext);
        this.zza = applicationContext;
    }
}
