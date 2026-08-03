package androidx.browser.trusted;

/* loaded from: classes.dex */
class FutureUtils {
    static <T> com.google.common.util.concurrent.ListenableFuture<T> immediateFailedFuture(java.lang.Throwable th) {
        androidx.concurrent.futures.ResolvableFuture create = androidx.concurrent.futures.ResolvableFuture.create();
        create.setException(th);
        return create;
    }

    private FutureUtils() {
    }
}
