package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t*\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0007J\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t*\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/pipe/FrameBuffers;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/FrameBuffer;", "Landroidx/camera/camera2/pipe/Frame;", "tryPeekFirst", "(Landroidx/camera/camera2/pipe/FrameBuffer;)Landroidx/camera/camera2/pipe/Frame;", "tryPeekLast", "", "tryPeekAll", "(Landroidx/camera/camera2/pipe/FrameBuffer;)Ljava/util/List;", "tryRemoveFirst", "tryRemoveLast", "tryRemoveAll"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameBuffers {
    public static final androidx.camera.camera2.pipe.FrameBuffers INSTANCE = new androidx.camera.camera2.pipe.FrameBuffers();

    private FrameBuffers() {
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.pipe.Frame tryPeekFirst(androidx.camera.camera2.pipe.FrameBuffer frameBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameBuffer, "");
        androidx.camera.camera2.pipe.FrameReference peekFirstReference = frameBuffer.peekFirstReference();
        if (peekFirstReference != null) {
            return androidx.camera.camera2.pipe.FrameReference.tryAcquire$default(peekFirstReference, null, 1, null);
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.pipe.Frame tryPeekLast(androidx.camera.camera2.pipe.FrameBuffer frameBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameBuffer, "");
        androidx.camera.camera2.pipe.FrameReference peekLastReference = frameBuffer.peekLastReference();
        if (peekLastReference != null) {
            return androidx.camera.camera2.pipe.FrameReference.tryAcquire$default(peekLastReference, null, 1, null);
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<androidx.camera.camera2.pipe.Frame> tryPeekAll(androidx.camera.camera2.pipe.FrameBuffer frameBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameBuffer, "");
        java.util.List<androidx.camera.camera2.pipe.FrameReference> peekAllReferences = frameBuffer.peekAllReferences();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = peekAllReferences.iterator();
        while (it.hasNext()) {
            androidx.camera.camera2.pipe.Frame tryAcquire$default = androidx.camera.camera2.pipe.FrameReference.tryAcquire$default((androidx.camera.camera2.pipe.FrameReference) it.next(), null, 1, null);
            if (tryAcquire$default != null) {
                arrayList.add(tryAcquire$default);
            }
        }
        return arrayList;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.pipe.Frame tryRemoveFirst(androidx.camera.camera2.pipe.FrameBuffer frameBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameBuffer, "");
        androidx.camera.camera2.pipe.FrameReference removeFirstReference = frameBuffer.removeFirstReference();
        if (removeFirstReference != null) {
            return androidx.camera.camera2.pipe.FrameReference.tryAcquire$default(removeFirstReference, null, 1, null);
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.pipe.Frame tryRemoveLast(androidx.camera.camera2.pipe.FrameBuffer frameBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameBuffer, "");
        androidx.camera.camera2.pipe.FrameReference removeLastReference = frameBuffer.removeLastReference();
        if (removeLastReference != null) {
            return androidx.camera.camera2.pipe.FrameReference.tryAcquire$default(removeLastReference, null, 1, null);
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<androidx.camera.camera2.pipe.Frame> tryRemoveAll(androidx.camera.camera2.pipe.FrameBuffer frameBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameBuffer, "");
        java.util.List<androidx.camera.camera2.pipe.FrameReference> removeAllReferences = frameBuffer.removeAllReferences();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = removeAllReferences.iterator();
        while (it.hasNext()) {
            androidx.camera.camera2.pipe.Frame tryAcquire$default = androidx.camera.camera2.pipe.FrameReference.tryAcquire$default((androidx.camera.camera2.pipe.FrameReference) it.next(), null, 1, null);
            if (tryAcquire$default != null) {
                arrayList.add(tryAcquire$default);
            }
        }
        return arrayList;
    }
}
