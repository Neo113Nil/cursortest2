package com.squareup.picasso;

/* loaded from: classes5.dex */
class GetAction extends com.squareup.picasso.Action<java.lang.Void> {
    @Override // com.squareup.picasso.Action
    void complete(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedFrom) {
    }

    @Override // com.squareup.picasso.Action
    public void error(java.lang.Exception exc) {
    }

    GetAction(com.squareup.picasso.Picasso picasso, com.squareup.picasso.Request request, int i, int i2, java.lang.Object obj, java.lang.String str) {
        super(picasso, null, request, i, i2, 0, null, str, obj, false);
    }
}
