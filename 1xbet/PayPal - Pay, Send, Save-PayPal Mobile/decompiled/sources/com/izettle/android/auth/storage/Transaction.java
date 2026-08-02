package com.izettle.android.auth.storage;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0013J&\u0010\u0017\u001a\u00020\t2\u0017\u0010\u0016\u001a\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR+\u0010 \u001a\u0019\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\t0\u00140\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00190\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!"}, d2 = {"Lcom/izettle/android/auth/storage/Transaction;", "", "Landroid/content/SharedPreferences$Editor;", "editor", "Ljava/util/concurrent/locks/Lock;", "lock", "<init>", "(Landroid/content/SharedPreferences$Editor;Ljava/util/concurrent/locks/Lock;)V", "Lcom/izettle/android/core/data/result/Result;", "", "", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.QUERY_COMMIT, "()Lcom/izettle/android/core/data/result/Result;", "", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerFailureListener", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "registerSuccessfulListener", "(Lkotlin/jvm/functions/Function0;)V", "remove", "(Ljava/lang/String;)V", "Landroid/content/SharedPreferences$Editor;", "", "failedListeners", "Ljava/util/List;", "Ljava/util/concurrent/locks/Lock;", "successfulListeners"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Transaction {
    private final android.content.SharedPreferences.Editor editor;
    private final java.util.List<kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> failedListeners;
    private final java.util.concurrent.locks.Lock lock;
    private final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> successfulListeners;

    public Transaction(android.content.SharedPreferences.Editor editor, java.util.concurrent.locks.Lock lock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lock, "");
        this.editor = editor;
        this.lock = lock;
        this.successfulListeners = new java.util.ArrayList();
        this.failedListeners = new java.util.ArrayList();
    }

    public final void registerSuccessfulListener(kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.successfulListeners.add(listener);
    }

    public final void registerFailureListener(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.failedListeners.add(listener);
    }

    public final void put(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.editor.putString(key, value);
    }

    public final void put(java.lang.String key, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.editor.putBoolean(key, value);
    }

    public final void remove(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.editor.remove(key);
    }

    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> commit() {
        com.izettle.android.core.data.result.Failure asFailure;
        java.util.concurrent.locks.Lock lock = this.lock;
        lock.lock();
        try {
            if (this.editor.commit()) {
                asFailure = com.izettle.android.core.data.result.ResultKt.asSuccess(kotlin.Unit.INSTANCE);
            } else {
                asFailure = com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.Exception("Failed to commit storage transaction"));
            }
            if (asFailure instanceof com.izettle.android.core.data.result.Success) {
                java.util.Iterator<T> it = this.successfulListeners.iterator();
                while (it.hasNext()) {
                    ((kotlin.jvm.functions.Function0) it.next()).invoke();
                }
            }
            if (asFailure instanceof com.izettle.android.core.data.result.Failure) {
                java.lang.Exception exc = (java.lang.Exception) ((com.izettle.android.core.data.result.Failure) asFailure).getError();
                java.util.Iterator<T> it2 = this.failedListeners.iterator();
                while (it2.hasNext()) {
                    ((kotlin.jvm.functions.Function1) it2.next()).invoke(exc);
                }
            }
            return asFailure;
        } finally {
            lock.unlock();
        }
    }
}
