package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class zzaco {
    private final zzacn zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzaco(zzacn zzacnVar) {
        this.zza = zzacnVar;
    }

    public final zzacv zza(Object... objArr) {
        Constructor zza;
        synchronized (this.zzb) {
            if (!this.zzb.get()) {
                try {
                    zza = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (zzacv) zza.newInstance(objArr);
        } catch (Exception e8) {
            throw new IllegalStateException("Unexpected error creating extractor", e8);
        }
    }
}
