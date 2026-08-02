package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class GoogleMapsLinks implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.GoogleMapsLinks build();

        public abstract com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder setDirectionsUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder setPhotosUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder setPlaceUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder setReviewsUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder setWriteAReviewUri(android.net.Uri uri);
    }

    public abstract android.net.Uri getDirectionsUri();

    public abstract android.net.Uri getPhotosUri();

    public abstract android.net.Uri getPlaceUri();

    public abstract android.net.Uri getReviewsUri();

    public abstract android.net.Uri getWriteAReviewUri();

    public static com.google.android.libraries.places.api.model.GoogleMapsLinks.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzaj();
    }
}
