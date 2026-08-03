package com.google.common.base.internal;

/* loaded from: classes2.dex */
public class Finalizer implements java.lang.Runnable {
    private static final java.lang.String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";

    @javax.annotation.CheckForNull
    private static final java.lang.reflect.Constructor<java.lang.Thread> bigThreadConstructor;

    @javax.annotation.CheckForNull
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
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        com.google.common.base.internal.Finalizer.logger.log(java.util.logging.Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:12:0x005a, B:14:0x005e), top: B:11:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void startFinalizer(java.lang.Class<?> finalizableReferenceClass, java.lang.ref.ReferenceQueue<java.lang.Object> queue, java.lang.ref.PhantomReference<java.lang.Object> frqReference) {
        java.lang.Thread thread;
        java.lang.reflect.Field field;
        if (!finalizableReferenceClass.getName().equals(FINALIZABLE_REFERENCE)) {
            throw new java.lang.IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        com.google.common.base.internal.Finalizer finalizer = new com.google.common.base.internal.Finalizer(finalizableReferenceClass, queue, frqReference);
        java.lang.String name = com.google.common.base.internal.Finalizer.class.getName();
        java.lang.reflect.Constructor<java.lang.Thread> constructor = bigThreadConstructor;
        if (constructor != null) {
            try {
                thread = constructor.newInstance(null, finalizer, name, 0L, false);
            } catch (java.lang.Throwable th) {
                logger.log(java.util.logging.Level.INFO, "Failed to create a thread without inherited thread-local values", th);
            }
            if (thread == null) {
                thread = new java.lang.Thread(null, finalizer, name);
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

    private Finalizer(java.lang.Class<?> finalizableReferenceClass, java.lang.ref.ReferenceQueue<java.lang.Object> queue, java.lang.ref.PhantomReference<java.lang.Object> frqReference) {
        this.queue = queue;
        this.finalizableReferenceClassReference = new java.lang.ref.WeakReference<>(finalizableReferenceClass);
        this.frqReference = frqReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (cleanUp(this.queue.remove())) {
        }
    }

    private boolean cleanUp(java.lang.ref.Reference<?> firstReference) {
        java.lang.ref.Reference<? extends java.lang.Object> poll;
        java.lang.reflect.Method finalizeReferentMethod = getFinalizeReferentMethod();
        if (finalizeReferentMethod == null || !finalizeReference(firstReference, finalizeReferentMethod)) {
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

    private boolean finalizeReference(java.lang.ref.Reference<?> reference, java.lang.reflect.Method finalizeReferentMethod) {
        reference.clear();
        if (reference == this.frqReference) {
            return false;
        }
        try {
            finalizeReferentMethod.invoke(reference, new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th) {
            logger.log(java.util.logging.Level.SEVERE, "Error cleaning up after reference.", th);
            return true;
        }
    }

    @javax.annotation.CheckForNull
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

    @javax.annotation.CheckForNull
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

    @javax.annotation.CheckForNull
    private static java.lang.reflect.Constructor<java.lang.Thread> getBigThreadConstructor() {
        try {
            return java.lang.Thread.class.getConstructor(java.lang.ThreadGroup.class, java.lang.Runnable.class, java.lang.String.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
