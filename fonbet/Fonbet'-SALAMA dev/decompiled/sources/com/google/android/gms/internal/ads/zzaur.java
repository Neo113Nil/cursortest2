package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzaur {
    private final I3.b zza;

    public zzaur(final Context context, Executor executor) {
        this.zza = zzgbc.zzj(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzauq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                try {
                    return zzfmk.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final I3.b zza() {
        return this.zza;
    }
}
