package com.squareup.picasso;

/* loaded from: classes5.dex */
class FetchAction extends com.squareup.picasso.Action<java.lang.Object> {
    private com.squareup.picasso.Callback callback;
    private final java.lang.Object target;

    FetchAction(com.squareup.picasso.Picasso picasso, com.squareup.picasso.Request request, int i, int i2, java.lang.Object obj, java.lang.String str, com.squareup.picasso.Callback callback) {
        super(picasso, null, request, i, i2, 0, null, str, obj, false);
        this.target = new java.lang.Object();
        this.callback = callback;
    }

    @Override // com.squareup.picasso.Action
    void complete(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedFrom) {
        com.squareup.picasso.Callback callback = this.callback;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Override // com.squareup.picasso.Action
    void error(java.lang.Exception exc) {
        com.squareup.picasso.Callback callback = this.callback;
        if (callback != null) {
            callback.onError(exc);
        }
    }

    @Override // com.squareup.picasso.Action
    void cancel() {
        super.cancel();
        this.callback = null;
    }

    @Override // com.squareup.picasso.Action
    java.lang.Object getTarget() {
        return this.target;
    }
}
