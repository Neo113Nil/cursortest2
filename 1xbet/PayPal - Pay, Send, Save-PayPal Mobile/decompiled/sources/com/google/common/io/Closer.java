package com.google.common.io;

/* loaded from: classes9.dex */
public final class Closer implements java.io.Closeable {
    private static final com.google.common.io.Closer.Suppressor SUPPRESSING_SUPPRESSOR = new com.google.common.io.Closer.Suppressor() { // from class: com.google.common.io.Closer$$ExternalSyntheticLambda0
        @Override // com.google.common.io.Closer.Suppressor
        public final void suppress(java.io.Closeable closeable, java.lang.Throwable th, java.lang.Throwable th2) {
            com.google.common.io.Closer.lambda$static$0(closeable, th, th2);
        }
    };
    private final java.util.Deque<java.io.Closeable> stack = new java.util.ArrayDeque(4);
    final com.google.common.io.Closer.Suppressor suppressor;
    private java.lang.Throwable thrown;

    interface Suppressor {
        void suppress(java.io.Closeable closeable, java.lang.Throwable th, java.lang.Throwable th2);
    }

    public static com.google.common.io.Closer create() {
        return new com.google.common.io.Closer(SUPPRESSING_SUPPRESSOR);
    }

    Closer(com.google.common.io.Closer.Suppressor suppressor) {
        this.suppressor = (com.google.common.io.Closer.Suppressor) com.google.common.base.Preconditions.checkNotNull(suppressor);
    }

    public final <C extends java.io.Closeable> C register(C c) {
        if (c != null) {
            this.stack.addFirst(c);
        }
        return c;
    }

    public final java.lang.RuntimeException rethrow(java.lang.Throwable th) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(th);
        this.thrown = th;
        com.google.common.base.Throwables.throwIfInstanceOf(th, java.io.IOException.class);
        com.google.common.base.Throwables.throwIfUnchecked(th);
        throw new java.lang.RuntimeException(th);
    }

    public final <X extends java.lang.Exception> java.lang.RuntimeException rethrow(java.lang.Throwable th, java.lang.Class<X> cls) throws java.io.IOException, java.lang.Exception {
        com.google.common.base.Preconditions.checkNotNull(th);
        this.thrown = th;
        com.google.common.base.Throwables.throwIfInstanceOf(th, java.io.IOException.class);
        com.google.common.base.Throwables.throwIfInstanceOf(th, cls);
        com.google.common.base.Throwables.throwIfUnchecked(th);
        throw new java.lang.RuntimeException(th);
    }

    public final <X1 extends java.lang.Exception, X2 extends java.lang.Exception> java.lang.RuntimeException rethrow(java.lang.Throwable th, java.lang.Class<X1> cls, java.lang.Class<X2> cls2) throws java.io.IOException, java.lang.Exception, java.lang.Exception {
        com.google.common.base.Preconditions.checkNotNull(th);
        this.thrown = th;
        com.google.common.base.Throwables.throwIfInstanceOf(th, java.io.IOException.class);
        com.google.common.base.Throwables.throwIfInstanceOf(th, cls);
        com.google.common.base.Throwables.throwIfInstanceOf(th, cls2);
        com.google.common.base.Throwables.throwIfUnchecked(th);
        throw new java.lang.RuntimeException(th);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.lang.Throwable th = this.thrown;
        while (!this.stack.isEmpty()) {
            java.io.Closeable removeFirst = this.stack.removeFirst();
            try {
                removeFirst.close();
            } catch (java.lang.Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.suppressor.suppress(removeFirst, th, th2);
                }
            }
        }
        if (this.thrown != null || th == null) {
            return;
        }
        com.google.common.base.Throwables.throwIfInstanceOf(th, java.io.IOException.class);
        com.google.common.base.Throwables.throwIfUnchecked(th);
        throw new java.lang.AssertionError(th);
    }

    static /* synthetic */ void lambda$static$0(java.io.Closeable closeable, java.lang.Throwable th, java.lang.Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            th.addSuppressed(th2);
        } catch (java.lang.Throwable unused) {
            com.google.common.io.Closeables.logger.log(java.util.logging.Level.WARNING, "Suppressing exception thrown when closing ".concat(java.lang.String.valueOf(closeable)), th2);
        }
    }
}
