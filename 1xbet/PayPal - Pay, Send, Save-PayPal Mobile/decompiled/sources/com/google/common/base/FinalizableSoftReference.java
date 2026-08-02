package com.google.common.base;

/* loaded from: classes9.dex */
public abstract class FinalizableSoftReference<T> extends java.lang.ref.SoftReference<T> implements com.google.common.base.FinalizableReference {
    protected FinalizableSoftReference(T t, com.google.common.base.FinalizableReferenceQueue finalizableReferenceQueue) {
        super(t, finalizableReferenceQueue.queue);
        finalizableReferenceQueue.cleanUp();
    }
}
