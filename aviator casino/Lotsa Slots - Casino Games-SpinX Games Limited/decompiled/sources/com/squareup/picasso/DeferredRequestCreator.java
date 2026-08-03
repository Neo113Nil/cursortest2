package com.squareup.picasso;

/* loaded from: classes5.dex */
class DeferredRequestCreator implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    com.squareup.picasso.Callback callback;
    private final com.squareup.picasso.RequestCreator creator;
    final java.lang.ref.WeakReference<android.widget.ImageView> target;

    DeferredRequestCreator(com.squareup.picasso.RequestCreator requestCreator, android.widget.ImageView imageView, com.squareup.picasso.Callback callback) {
        this.creator = requestCreator;
        this.target = new java.lang.ref.WeakReference<>(imageView);
        this.callback = callback;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.widget.ImageView imageView = this.target.get();
        if (imageView == null) {
            return true;
        }
        android.view.ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.target.clear();
            this.creator.unfit().resize(width, height).into(imageView, this.callback);
        }
        return true;
    }

    void cancel() {
        this.creator.clearTag();
        this.callback = null;
        android.widget.ImageView imageView = this.target.get();
        if (imageView == null) {
            return;
        }
        this.target.clear();
        imageView.removeOnAttachStateChangeListener(this);
        android.view.ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    java.lang.Object getTag() {
        return this.creator.getTag();
    }
}
