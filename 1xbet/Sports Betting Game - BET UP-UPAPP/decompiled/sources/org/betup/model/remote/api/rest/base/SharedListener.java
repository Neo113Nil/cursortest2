package org.betup.model.remote.api.rest.base;

import java.lang.ref.WeakReference;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;

/* loaded from: classes2.dex */
class SharedListener<T, S> {
    final boolean autoRemove;
    private final BaseCachedSharedInteractor.OnFetchedListener<T, S> strongRef;
    private final WeakReference<BaseCachedSharedInteractor.OnFetchedListener<T, S>> weakRef;

    public SharedListener(BaseCachedSharedInteractor.OnFetchedListener<T, S> listener, boolean autoRemove) {
        this.autoRemove = autoRemove;
        if (autoRemove) {
            this.strongRef = listener;
            this.weakRef = null;
        } else {
            this.strongRef = null;
            this.weakRef = new WeakReference<>(listener);
        }
    }

    public BaseCachedSharedInteractor.OnFetchedListener<T, S> getListener() {
        BaseCachedSharedInteractor.OnFetchedListener<T, S> onFetchedListener = this.strongRef;
        if (onFetchedListener != null) {
            return onFetchedListener;
        }
        WeakReference<BaseCachedSharedInteractor.OnFetchedListener<T, S>> weakReference = this.weakRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SharedListener)) {
            return false;
        }
        BaseCachedSharedInteractor.OnFetchedListener<T, S> listener = getListener();
        BaseCachedSharedInteractor.OnFetchedListener<T, S> listener2 = ((SharedListener) obj).getListener();
        return (listener == null || listener2 == null || listener != listener2) ? false : true;
    }
}
