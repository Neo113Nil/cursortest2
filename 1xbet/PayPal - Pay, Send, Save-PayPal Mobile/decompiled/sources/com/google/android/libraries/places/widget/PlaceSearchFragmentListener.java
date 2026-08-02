package com.google.android.libraries.places.widget;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceSearchFragmentListener;", "", "", "Lcom/google/android/libraries/places/api/model/Place;", "places", "", "onLoad", "(Ljava/util/List;)V", "place", "onPlaceSelected", "(Lcom/google/android/libraries/places/api/model/Place;)V", "Ljava/lang/Exception;", "e", "onRequestError", "(Ljava/lang/Exception;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface PlaceSearchFragmentListener {
    void onLoad(java.util.List<? extends com.google.android.libraries.places.api.model.Place> places);

    void onRequestError(java.lang.Exception e);

    default void onPlaceSelected(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
    }
}
