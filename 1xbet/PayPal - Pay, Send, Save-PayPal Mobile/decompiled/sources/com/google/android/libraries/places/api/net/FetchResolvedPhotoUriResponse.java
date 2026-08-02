package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class FetchResolvedPhotoUriResponse {
    public abstract android.net.Uri getUri();

    public static com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse newInstance(android.net.Uri uri) {
        return new com.google.android.libraries.places.api.net.zzi(uri);
    }
}
