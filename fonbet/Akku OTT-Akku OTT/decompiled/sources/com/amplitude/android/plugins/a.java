package com.amplitude.android.plugins;

import com.amplitude.analytics.connector.a;
import com.amplitude.core.platform.j;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends j {
    public com.amplitude.analytics.connector.a b;

    @Override // com.amplitude.core.platform.k
    public final void b(com.amplitude.core.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
    }

    @Override // com.amplitude.core.platform.k
    public final void c(com.amplitude.core.b amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.c(amplitude);
        String str = amplitude.a.e;
        com.amplitude.analytics.connector.a.Companion.getClass();
        com.amplitude.analytics.connector.a a = a.C0033a.a(str);
        this.b = a;
        com.amplitude.analytics.connector.e eVar = a.a;
        com.amplitude.core.j jVar = amplitude.b;
        eVar.a(new com.amplitude.analytics.connector.d(jVar.a, jVar.b, 4));
    }

    @Override // com.amplitude.core.platform.j
    public final void h(String str) {
        com.amplitude.analytics.connector.a aVar = this.b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connector");
            aVar = null;
        }
        com.amplitude.analytics.connector.e eVar = aVar.a;
        ReentrantReadWriteLock.ReadLock readLock = eVar.a.readLock();
        readLock.lock();
        try {
            com.amplitude.analytics.connector.d dVar = eVar.b;
            readLock.unlock();
            eVar.a(new com.amplitude.analytics.connector.d(dVar.a, str, (Map<String, ? extends Object>) dVar.c));
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // com.amplitude.core.platform.j
    public final void i(String str) {
        com.amplitude.analytics.connector.a aVar = this.b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connector");
            aVar = null;
        }
        com.amplitude.analytics.connector.e eVar = aVar.a;
        ReentrantReadWriteLock.ReadLock readLock = eVar.a.readLock();
        readLock.lock();
        try {
            com.amplitude.analytics.connector.d dVar = eVar.b;
            readLock.unlock();
            String str2 = dVar.a;
            eVar.a(new com.amplitude.analytics.connector.d(str, dVar.b, (Map<String, ? extends Object>) dVar.c));
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }
}
