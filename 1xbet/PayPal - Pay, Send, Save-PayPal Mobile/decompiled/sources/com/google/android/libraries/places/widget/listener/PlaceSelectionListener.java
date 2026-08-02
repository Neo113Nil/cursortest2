package com.google.android.libraries.places.widget.listener;

/* loaded from: classes8.dex */
public interface PlaceSelectionListener {
    void onError(com.google.android.gms.common.api.Status status);

    void onPlaceSelected(com.google.android.libraries.places.api.model.Place place);
}
