package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public abstract class SQLiteClosable implements java.io.Closeable {
    private int mReferenceCount = 1;

    protected abstract void onAllReferencesReleased();

    @java.lang.Deprecated
    protected void onAllReferencesReleasedFromContainer() {
        onAllReferencesReleased();
    }

    public void acquireReference() {
        synchronized (this) {
            int i = this.mReferenceCount;
            if (i <= 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("attempt to re-open an already-closed object: ");
                sb.append(this);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.mReferenceCount = i + 1;
        }
    }

    public void releaseReference() {
        boolean z;
        synchronized (this) {
            int i = this.mReferenceCount - 1;
            this.mReferenceCount = i;
            z = i == 0;
        }
        if (z) {
            onAllReferencesReleased();
        }
    }

    @java.lang.Deprecated
    public void releaseReferenceFromContainer() {
        boolean z;
        synchronized (this) {
            int i = this.mReferenceCount - 1;
            this.mReferenceCount = i;
            z = i == 0;
        }
        if (z) {
            onAllReferencesReleasedFromContainer();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        releaseReference();
    }
}
