package com.amplitude.analytics.connector;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {
    public d b;
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock(true);
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();

    public e() {
        String str = null;
        this.b = new d(str, str, 7);
    }

    /* JADX WARN: Finally extract failed */
    public final void a(d identity) {
        Set set;
        Intrinsics.checkNotNullParameter(identity, "identity");
        ReentrantReadWriteLock.ReadLock readLock = this.a.readLock();
        readLock.lock();
        try {
            d dVar = this.b;
            readLock.unlock();
            ReentrantReadWriteLock reentrantReadWriteLock = this.a;
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.b = identity;
                Unit unit = Unit.INSTANCE;
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
                if (Intrinsics.areEqual(identity, dVar)) {
                    return;
                }
                synchronized (this.c) {
                    set = CollectionsKt.toSet(this.d);
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(identity);
                }
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }
}
