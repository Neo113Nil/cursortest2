package com.google.android.libraries.places.widget;

/* loaded from: classes8.dex */
final /* synthetic */ class zzaf extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        com.google.android.libraries.places.api.model.Place place = (com.google.android.libraries.places.api.model.Place) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.widget.PlaceDetailsFragment.zza((com.google.android.libraries.places.widget.PlaceDetailsFragment) this.receiver, place);
        return kotlin.Unit.INSTANCE;
    }

    zzaf(java.lang.Object obj) {
        super(1, obj, com.google.android.libraries.places.widget.PlaceDetailsFragment.class, "updateUi", "updateUi(Lcom/google/android/libraries/places/api/model/Place;)V", 0);
    }
}
