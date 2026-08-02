package androidx.media3.session;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Util;
import androidx.media3.session.MediaController;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class MediaControllerHolder<T extends MediaController> extends com.google.common.util.concurrent.a<T> implements MediaController.ConnectionCallback {
    private boolean accepted;

    @Nullable
    private T controller;
    private final Handler handler;

    public MediaControllerHolder(Looper looper) {
        this.handler = new Handler(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setController$0(MediaController mediaController) {
        if (isCancelled()) {
            mediaController.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setController$1(Runnable runnable) {
        Util.postOrRun(this.handler, runnable);
    }

    private void maybeSetException() {
        setException(new SecurityException("Session rejected the connection request."));
    }

    private void maybeSetFutureResult() {
        T t = this.controller;
        if (t == null || !this.accepted) {
            return;
        }
        set(t);
    }

    @Override // androidx.media3.session.MediaController.ConnectionCallback
    public void onAccepted() {
        this.accepted = true;
        maybeSetFutureResult();
    }

    @Override // androidx.media3.session.MediaController.ConnectionCallback
    public void onRejected() {
        maybeSetException();
    }

    public void setController(final T t) {
        this.controller = t;
        maybeSetFutureResult();
        addListener(new Runnable() { // from class: androidx.media3.session.v
            @Override // java.lang.Runnable
            public final void run() {
                MediaControllerHolder.this.lambda$setController$0(t);
            }
        }, new Executor() { // from class: androidx.media3.session.w
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                MediaControllerHolder.this.lambda$setController$1(runnable);
            }
        });
    }
}
