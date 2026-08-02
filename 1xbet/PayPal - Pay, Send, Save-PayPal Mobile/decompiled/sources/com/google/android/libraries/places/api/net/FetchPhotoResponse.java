package com.google.android.libraries.places.api.net;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class FetchPhotoResponse {
    public static com.google.android.libraries.places.api.net.FetchPhotoResponse newInstance(android.graphics.Bitmap bitmap) {
        return new com.google.android.libraries.places.api.net.zzc(bitmap);
    }

    public abstract android.graphics.Bitmap getBitmap();
}
