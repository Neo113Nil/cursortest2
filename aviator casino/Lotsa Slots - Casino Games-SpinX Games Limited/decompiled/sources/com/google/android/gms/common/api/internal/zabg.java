package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
abstract class zabg {
    private final com.google.android.gms.common.api.internal.zabf zaa;

    protected zabg(com.google.android.gms.common.api.internal.zabf zabfVar) {
        this.zaa = zabfVar;
    }

    protected abstract void zaa();

    public final void zab(com.google.android.gms.common.api.internal.zabi zabiVar) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        com.google.android.gms.common.api.internal.zabf zabfVar;
        lock = zabiVar.zai;
        lock.lock();
        try {
            zabfVar = zabiVar.zan;
            if (zabfVar == this.zaa) {
                zaa();
            }
        } finally {
            lock2 = zabiVar.zai;
            lock2.unlock();
        }
    }
}
