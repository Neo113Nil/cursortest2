package com.google.android.libraries.places.widget.listener;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/google/android/libraries/places/widget/listener/PredictionSelectionListener;", "", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "prediction", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken", "", "onPredictionSelected", "(Lcom/google/android/libraries/places/api/model/AutocompletePrediction;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;)V", "Lcom/google/android/gms/common/api/Status;", "errorStatus", "onError", "(Lcom/google/android/gms/common/api/Status;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface PredictionSelectionListener {
    void onError(com.google.android.gms.common.api.Status errorStatus);

    void onPredictionSelected(com.google.android.libraries.places.api.model.AutocompletePrediction prediction, com.google.android.libraries.places.api.model.AutocompleteSessionToken sessionToken);
}
