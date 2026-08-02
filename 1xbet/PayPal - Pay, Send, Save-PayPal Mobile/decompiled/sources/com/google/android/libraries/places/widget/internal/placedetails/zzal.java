package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final /* synthetic */ class zzal extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        com.google.android.libraries.places.api.model.Place place = (com.google.android.libraries.places.api.model.Place) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        ((com.google.android.libraries.places.widget.internal.placedetails.zzao) this.receiver).zzh(place);
        return kotlin.Unit.INSTANCE;
    }

    zzal(java.lang.Object obj) {
        super(1, obj, com.google.android.libraries.places.widget.internal.placedetails.zzao.class, "updateUi", "updateUi(Lcom/google/android/libraries/places/api/model/Place;)V", 0);
    }
}
