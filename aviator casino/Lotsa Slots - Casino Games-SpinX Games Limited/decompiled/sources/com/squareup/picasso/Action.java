package com.squareup.picasso;

/* loaded from: classes5.dex */
abstract class Action<T> {
    boolean cancelled;
    final android.graphics.drawable.Drawable errorDrawable;
    final int errorResId;
    final java.lang.String key;
    final int memoryPolicy;
    final int networkPolicy;
    final boolean noFade;
    final com.squareup.picasso.Picasso picasso;
    final com.squareup.picasso.Request request;
    final java.lang.Object tag;
    final java.lang.ref.WeakReference<T> target;
    boolean willReplay;

    abstract void complete(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedFrom);

    abstract void error(java.lang.Exception exc);

    static class RequestWeakReference<M> extends java.lang.ref.WeakReference<M> {
        final com.squareup.picasso.Action action;

        RequestWeakReference(com.squareup.picasso.Action action, M m, java.lang.ref.ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.action = action;
        }
    }

    Action(com.squareup.picasso.Picasso picasso, T t, com.squareup.picasso.Request request, int i, int i2, int i3, android.graphics.drawable.Drawable drawable, java.lang.String str, java.lang.Object obj, boolean z) {
        this.picasso = picasso;
        this.request = request;
        this.target = t == null ? null : new com.squareup.picasso.Action.RequestWeakReference(this, t, picasso.referenceQueue);
        this.memoryPolicy = i;
        this.networkPolicy = i2;
        this.noFade = z;
        this.errorResId = i3;
        this.errorDrawable = drawable;
        this.key = str;
        this.tag = obj == null ? this : obj;
    }

    void cancel() {
        this.cancelled = true;
    }

    com.squareup.picasso.Request getRequest() {
        return this.request;
    }

    T getTarget() {
        java.lang.ref.WeakReference<T> weakReference = this.target;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    java.lang.String getKey() {
        return this.key;
    }

    boolean isCancelled() {
        return this.cancelled;
    }

    boolean willReplay() {
        return this.willReplay;
    }

    int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    int getNetworkPolicy() {
        return this.networkPolicy;
    }

    com.squareup.picasso.Picasso getPicasso() {
        return this.picasso;
    }

    com.squareup.picasso.Picasso.Priority getPriority() {
        return this.request.priority;
    }

    java.lang.Object getTag() {
        return this.tag;
    }
}
