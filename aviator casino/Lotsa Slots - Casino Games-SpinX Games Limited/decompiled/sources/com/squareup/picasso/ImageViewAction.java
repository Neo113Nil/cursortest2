package com.squareup.picasso;

/* loaded from: classes5.dex */
class ImageViewAction extends com.squareup.picasso.Action<android.widget.ImageView> {
    com.squareup.picasso.Callback callback;

    ImageViewAction(com.squareup.picasso.Picasso picasso, android.widget.ImageView imageView, com.squareup.picasso.Request request, int i, int i2, int i3, android.graphics.drawable.Drawable drawable, java.lang.String str, java.lang.Object obj, com.squareup.picasso.Callback callback, boolean z) {
        super(picasso, imageView, request, i, i2, i3, drawable, str, obj, z);
        this.callback = callback;
    }

    @Override // com.squareup.picasso.Action
    public void complete(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new java.lang.AssertionError(java.lang.String.format("Attempted to complete action with no result!\n%s", this));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.target.get();
        if (imageView == null) {
            return;
        }
        com.squareup.picasso.PicassoDrawable.setBitmap(imageView, this.picasso.context, bitmap, loadedFrom, this.noFade, this.picasso.indicatorsEnabled);
        com.squareup.picasso.Callback callback = this.callback;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Override // com.squareup.picasso.Action
    public void error(java.lang.Exception exc) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.target.get();
        if (imageView == null) {
            return;
        }
        java.lang.Object drawable = imageView.getDrawable();
        if (drawable instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) drawable).stop();
        }
        if (this.errorResId != 0) {
            imageView.setImageResource(this.errorResId);
        } else if (this.errorDrawable != null) {
            imageView.setImageDrawable(this.errorDrawable);
        }
        com.squareup.picasso.Callback callback = this.callback;
        if (callback != null) {
            callback.onError(exc);
        }
    }

    @Override // com.squareup.picasso.Action
    void cancel() {
        super.cancel();
        if (this.callback != null) {
            this.callback = null;
        }
    }
}
