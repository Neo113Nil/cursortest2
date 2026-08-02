package androidx.camera.core.impl.utils.futures;

@java.lang.FunctionalInterface
/* loaded from: classes6.dex */
public interface AsyncFunction<I, O> {
    com.google.common.util.concurrent.ListenableFuture<O> apply(I i) throws java.lang.Exception;
}
