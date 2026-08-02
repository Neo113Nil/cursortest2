package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ m a;
    public final /* synthetic */ com.google.android.datatransport.runtime.d b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ l(m mVar, com.google.android.datatransport.runtime.d dVar, int i, Runnable runnable) {
        this.a = mVar;
        this.b = dVar;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final com.google.android.datatransport.runtime.d dVar = this.b;
        final int i = this.c;
        Runnable runnable = this.d;
        final m mVar = this.a;
        com.google.android.datatransport.runtime.synchronization.b bVar = mVar.f;
        try {
            try {
                com.google.android.datatransport.runtime.scheduling.persistence.d dVar2 = mVar.c;
                Objects.requireNonNull(dVar2);
                bVar.l(new androidx.credentials.playservices.q(dVar2, 3));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) mVar.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    bVar.l(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                        @Override // com.google.android.datatransport.runtime.synchronization.b.a
                        public final Object execute() {
                            m.this.d.a(dVar, i + 1);
                            return null;
                        }
                    });
                } else {
                    mVar.a(dVar, i);
                }
                runnable.run();
            } catch (com.google.android.datatransport.runtime.synchronization.a unused) {
                mVar.d.a(dVar, i + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
