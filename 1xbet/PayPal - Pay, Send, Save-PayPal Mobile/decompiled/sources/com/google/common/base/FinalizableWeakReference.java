package com.google.common.base;

/* loaded from: classes9.dex */
public abstract class FinalizableWeakReference<T> extends java.lang.ref.WeakReference<T> implements com.google.common.base.FinalizableReference {
    protected FinalizableWeakReference(T t, com.google.common.base.FinalizableReferenceQueue finalizableReferenceQueue) {
        super(t, finalizableReferenceQueue.queue);
        finalizableReferenceQueue.cleanUp();
    }
}
