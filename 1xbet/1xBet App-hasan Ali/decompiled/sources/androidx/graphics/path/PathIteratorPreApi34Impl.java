package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int i, float f);

    private final native void destroyInternalPathIterator(long j5);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j5);

    @FastNative
    private final native int internalPathIteratorNext(long j5, float[] fArr, int i);

    @FastNative
    private final native int internalPathIteratorPeek(long j5);

    @FastNative
    private final native int internalPathIteratorRawSize(long j5);

    @FastNative
    private final native int internalPathIteratorSize(long j5);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
