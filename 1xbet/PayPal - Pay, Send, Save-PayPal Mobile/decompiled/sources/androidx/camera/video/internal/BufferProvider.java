package androidx.camera.video.internal;

/* loaded from: classes6.dex */
public interface BufferProvider<T> extends androidx.camera.core.impl.Observable<androidx.camera.video.internal.BufferProvider.State> {

    public enum State {
        ACTIVE,
        INACTIVE
    }

    com.google.common.util.concurrent.ListenableFuture<T> acquireBuffer();
}
