package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
abstract class zzgah extends zzfzr.zzi {
    public static final /* synthetic */ int zza = 0;
    private static final zzgad zzbf;
    private static final zzgbl zzbg = new zzgbl(zzgah.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzgad zzgafVar;
        zzgag zzgagVar = null;
        try {
            zzgafVar = new zzgae(zzgagVar);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgafVar = new zzgaf(zzgagVar);
        }
        zzbf = zzgafVar;
        if (th != null) {
            zzbg.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzgah(int i7) {
        this.remaining = i7;
    }

    public final int zzA() {
        return zzbf.zza(this);
    }

    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzu(setNewSetFromMap);
        zzbf.zzb(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    public abstract void zzu(Set set);
}
