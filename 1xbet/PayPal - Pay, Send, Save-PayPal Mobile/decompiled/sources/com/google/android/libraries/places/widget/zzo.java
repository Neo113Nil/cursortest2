package com.google.android.libraries.places.widget;

/* loaded from: classes8.dex */
final /* synthetic */ class zzo extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        com.google.android.libraries.places.api.model.Place place = (com.google.android.libraries.places.api.model.Place) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.widget.PlaceDetailsCompactFragment.zza((com.google.android.libraries.places.widget.PlaceDetailsCompactFragment) this.receiver, place);
        return kotlin.Unit.INSTANCE;
    }

    zzo(java.lang.Object obj) {
        super(1, obj, com.google.android.libraries.places.widget.PlaceDetailsCompactFragment.class, "updateUi", "updateUi(Lcom/google/android/libraries/places/api/model/Place;)V", 0);
    }
}
