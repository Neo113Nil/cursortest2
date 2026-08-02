package com.google.android.gms.internal.measurement;

import android.os.Binder;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
interface zzjv {
    static Object zzh(zzju zzjuVar) {
        try {
            return zzjuVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzjuVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    @Nullable
    Object zze(String str);
}
