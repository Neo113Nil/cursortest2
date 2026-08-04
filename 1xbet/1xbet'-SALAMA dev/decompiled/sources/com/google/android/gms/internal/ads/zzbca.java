package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
public final class zzbca {
    public static Object zza(zzftz zzftzVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzftzVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
