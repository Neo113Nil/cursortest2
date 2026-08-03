package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class FinalizableWeakReference<T> extends java.lang.ref.WeakReference<T> implements com.google.common.base.FinalizableReference {
    protected FinalizableWeakReference(@javax.annotation.CheckForNull T referent, com.google.common.base.FinalizableReferenceQueue queue) {
        super(referent, queue.queue);
        queue.cleanUp();
    }
}
