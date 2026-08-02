package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzgi implements Runnable {
    private final /* synthetic */ zzgh zzahx;

    zzgi(zzgh zzghVar) {
        this.zzahx = zzghVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.zzahx.mLock;
        synchronized (obj) {
            z = this.zzahx.zzahr;
            if (z) {
                z2 = this.zzahx.zzahs;
                if (z2) {
                    zzgh.zza(this.zzahx, false);
                    zzakb.zzck("App went background");
                    list = this.zzahx.zzaht;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzgj) it.next()).zzh(false);
                        } catch (Exception e) {
                            zzane.zzb("", e);
                        }
                    }
                }
            }
            zzakb.zzck("App is still foreground");
        }
    }
}
