package com.squareup.picasso;

/* loaded from: classes5.dex */
final class TargetAction extends com.squareup.picasso.Action<com.squareup.picasso.Target> {
    TargetAction(com.squareup.picasso.Picasso picasso, com.squareup.picasso.Target target, com.squareup.picasso.Request request, int i, int i2, android.graphics.drawable.Drawable drawable, java.lang.String str, java.lang.Object obj, int i3) {
        super(picasso, target, request, i, i2, i3, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.Action
    void complete(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new java.lang.AssertionError(java.lang.String.format("Attempted to complete action with no result!\n%s", this));
        }
        com.squareup.picasso.Target target = getTarget();
        if (target != null) {
            target.onBitmapLoaded(bitmap, loadedFrom);
            if (bitmap.isRecycled()) {
                throw new java.lang.IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.Action
    void error(java.lang.Exception exc) {
        com.squareup.picasso.Target target = getTarget();
        if (target != null) {
            if (this.errorResId != 0) {
                target.onBitmapFailed(exc, this.picasso.context.getResources().getDrawable(this.errorResId));
            } else {
                target.onBitmapFailed(exc, this.errorDrawable);
            }
        }
    }
}
