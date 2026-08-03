package com.squareup.picasso;

/* loaded from: classes5.dex */
public interface Target {
    void onBitmapFailed(java.lang.Exception exc, android.graphics.drawable.Drawable drawable);

    void onBitmapLoaded(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedFrom);

    void onPrepareLoad(android.graphics.drawable.Drawable drawable);
}
