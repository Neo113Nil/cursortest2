package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class zzuh {
    private static final AtomicLong zza = new AtomicLong();

    public zzuh(long j, zzgc zzgcVar, Uri uri, Map map, long j3, long j7, long j8) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }

    public zzuh(long j, zzgc zzgcVar, long j3) {
        Uri uri = zzgcVar.zza;
        Collections.emptyMap();
    }
}
