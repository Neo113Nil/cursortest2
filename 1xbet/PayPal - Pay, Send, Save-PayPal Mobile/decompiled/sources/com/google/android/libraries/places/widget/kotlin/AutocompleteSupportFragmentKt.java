package com.google.android.libraries.places.widget.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionResult;", "placeSelectionEvents", "(Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutocompleteSupportFragmentKt {
    @kotlin.Deprecated(message = "Use PlaceAutocomplete and PredictionSelectionListener instead.", replaceWith = @kotlin.ReplaceWith(expression = "PredictionSelectionListener", imports = {"com.google.android.libraries.places.widget.PlaceAutocomplete", "com.google.android.libraries.places.widget.listener.PredictionSelectionListener"}))
    public static final kotlinx.coroutines.flow.Flow<com.google.android.libraries.places.widget.kotlin.PlaceSelectionResult> placeSelectionEvents(com.google.android.libraries.places.widget.AutocompleteSupportFragment autocompleteSupportFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autocompleteSupportFragment, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.android.libraries.places.widget.kotlin.AutocompleteSupportFragmentKt$placeSelectionEvents$1(autocompleteSupportFragment, null));
    }
}
