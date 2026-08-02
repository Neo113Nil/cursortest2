package com.amplitude.id;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {
    public final h a;
    public final ReentrantReadWriteLock b;
    public c c;
    public final Object d;
    public final LinkedHashSet e;
    public boolean f;

    public g(h identityStorage) {
        Intrinsics.checkNotNullParameter(identityStorage, "identityStorage");
        this.a = identityStorage;
        this.b = new ReentrantReadWriteLock(true);
        this.c = new c(null, null);
        this.d = new Object();
        this.e = new LinkedHashSet();
        b(identityStorage.load(), i.a);
    }

    public final c a() {
        ReentrantReadWriteLock.ReadLock readLock = this.b.readLock();
        readLock.lock();
        try {
            return this.c;
        } finally {
            readLock.unlock();
        }
    }

    public final void b(c identity, i updateType) {
        Set<f> set;
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        c a = a();
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.c = identity;
            if (updateType == i.a) {
                this.f = true;
            }
            Unit unit = Unit.INSTANCE;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            if (Intrinsics.areEqual(identity, a)) {
                return;
            }
            synchronized (this.d) {
                set = CollectionsKt.toSet(this.e);
            }
            if (updateType != i.a) {
                if (!Intrinsics.areEqual(identity.a, a.a)) {
                    this.a.a(identity.a);
                }
                if (!Intrinsics.areEqual(identity.b, a.b)) {
                    this.a.b(identity.b);
                }
            }
            for (f fVar : set) {
                if (!Intrinsics.areEqual(identity.a, a.a)) {
                    fVar.b(identity.a);
                }
                if (!Intrinsics.areEqual(identity.b, a.b)) {
                    fVar.a(identity.b);
                }
                fVar.c(identity, updateType);
            }
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
