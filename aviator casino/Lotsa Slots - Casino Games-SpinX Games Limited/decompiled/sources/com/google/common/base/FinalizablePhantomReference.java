package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class FinalizablePhantomReference<T> extends java.lang.ref.PhantomReference<T> implements com.google.common.base.FinalizableReference {
    protected FinalizablePhantomReference(@javax.annotation.CheckForNull T referent, com.google.common.base.FinalizableReferenceQueue queue) {
        super(referent, queue.queue);
        queue.cleanUp();
    }
}
