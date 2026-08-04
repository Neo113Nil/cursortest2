package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class zzgcf {
    public static Object zza(Future future) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
