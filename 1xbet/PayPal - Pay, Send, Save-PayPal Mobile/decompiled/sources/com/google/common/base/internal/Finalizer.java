package com.google.common.base.internal;

/* loaded from: classes9.dex */
public class Finalizer implements java.lang.Runnable {
    private static final java.lang.String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";
    private static final java.lang.reflect.Constructor<java.lang.Thread> bigThreadConstructor;
    private static final java.lang.reflect.Field inheritableThreadLocals;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.base.internal.Finalizer.class.getName());
    private final java.lang.ref.WeakReference<java.lang.Class<?>> finalizableReferenceClassReference;
    private final java.lang.ref.PhantomReference<java.lang.Object> frqReference;
    private final java.lang.ref.ReferenceQueue<java.lang.Object> queue;

    static {
        java.lang.reflect.Constructor<java.lang.Thread> bigThreadConstructor2 = getBigThreadConstructor();
        bigThreadConstructor = bigThreadConstructor2;
        inheritableThreadLocals = bigThreadConstructor2 == null ? getInheritableThreadLocalsField() : null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(10:5|6|7|(1:9)|10|11|12|(1:14)|16|17)|24|(0)|10|11|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        com.google.common.base.internal.Finalizer.logger.log(java.util.logging.Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:12:0x0052, B:14:0x0056), top: B:11:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void startFinalizer(java.lang.Class<?> cls, java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue, java.lang.ref.PhantomReference<java.lang.Object> phantomReference) {
        java.lang.Thread thread;
        java.lang.reflect.Field field;
        if (!cls.getName().equals(FINALIZABLE_REFERENCE)) {
            throw new java.lang.IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        com.google.common.base.internal.Finalizer finalizer = new com.google.common.base.internal.Finalizer(cls, referenceQueue, phantomReference);
        java.lang.String name2 = com.google.common.base.internal.Finalizer.class.getName();
        java.lang.reflect.Constructor<java.lang.Thread> constructor = bigThreadConstructor;
        if (constructor != null) {
            try {
                thread = constructor.newInstance(null, finalizer, name2, 0L, java.lang.Boolean.FALSE);
            } catch (java.lang.Throwable th) {
                logger.log(java.util.logging.Level.INFO, "Failed to create a thread without inherited thread-local values", th);
            }
            if (thread == null) {
                thread = new java.lang.Thread(null, finalizer, name2);
            }
            thread.setDaemon(true);
            field = inheritableThreadLocals;
            if (field != null) {
                field.set(thread, null);
            }
            thread.start();
        }
        thread = null;
        if (thread == null) {
        }
        thread.setDaemon(true);
        field = inheritableThreadLocals;
        if (field != null) {
        }
        thread.start();
    }

    private Finalizer(java.lang.Class<?> cls, java.lang.ref.ReferenceQueue<java.lang.Object> referenceQueue, java.lang.ref.PhantomReference<java.lang.Object> phantomReference) {
        this.queue = referenceQueue;
        this.finalizableReferenceClassReference = new java.lang.ref.WeakReference<>(cls);
        this.frqReference = phantomReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (cleanUp(this.queue.remove())) {
        }
    }

    private boolean cleanUp(java.lang.ref.Reference<?> reference) {
        java.lang.ref.Reference<? extends java.lang.Object> poll;
        java.lang.reflect.Method finalizeReferentMethod = getFinalizeReferentMethod();
        if (finalizeReferentMethod == null || !finalizeReference(reference, finalizeReferentMethod)) {
            return false;
        }
        do {
            poll = this.queue.poll();
            if (poll == null) {
                return true;
            }
        } while (finalizeReference(poll, finalizeReferentMethod));
        return false;
    }

    private boolean finalizeReference(java.lang.ref.Reference<?> reference, java.lang.reflect.Method method) {
        reference.clear();
        if (reference == this.frqReference) {
            return false;
        }
        try {
            method.invoke(reference, new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th) {
            logger.log(java.util.logging.Level.SEVERE, "Error cleaning up after reference.", th);
            return true;
        }
    }

    private java.lang.reflect.Method getFinalizeReferentMethod() {
        java.lang.Class<?> cls = this.finalizableReferenceClassReference.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    private static java.lang.reflect.Field getInheritableThreadLocalsField() {
        try {
            java.lang.reflect.Field declaredField = java.lang.Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Throwable unused) {
            logger.log(java.util.logging.Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    private static java.lang.reflect.Constructor<java.lang.Thread> getBigThreadConstructor() {
        try {
            return java.lang.Thread.class.getConstructor(java.lang.ThreadGroup.class, java.lang.Runnable.class, java.lang.String.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
