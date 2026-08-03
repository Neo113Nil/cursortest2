package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class FinalizableSoftReference<T> extends java.lang.ref.SoftReference<T> implements com.google.common.base.FinalizableReference {
    protected FinalizableSoftReference(@javax.annotation.CheckForNull T referent, com.google.common.base.FinalizableReferenceQueue queue) {
        super(referent, queue.queue);
        queue.cleanUp();
    }
}
