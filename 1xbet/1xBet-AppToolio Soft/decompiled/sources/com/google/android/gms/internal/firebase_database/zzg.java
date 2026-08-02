package com.google.android.gms.internal.firebase_database;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class zzg {
    private final ConcurrentHashMap<zzh, List<Throwable>> zzh = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzi = new ReferenceQueue<>();

    zzg() {
    }

    public final List<Throwable> zza(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.zzi.poll();
            if (poll == null) {
                return this.zzh.get(new zzh(th, null));
            }
            this.zzh.remove(poll);
        }
    }
}
