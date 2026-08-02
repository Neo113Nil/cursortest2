package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final /* synthetic */ class zzbw extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        com.google.android.libraries.places.api.model.Place place = (com.google.android.libraries.places.api.model.Place) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.widget.internal.placedetails.zzby.zza((com.google.android.libraries.places.widget.internal.placedetails.zzby) this.receiver, place);
        return kotlin.Unit.INSTANCE;
    }

    zzbw(java.lang.Object obj) {
        super(1, obj, com.google.android.libraries.places.widget.internal.placedetails.zzby.class, "updateUi", "updateUi(Lcom/google/android/libraries/places/api/model/Place;)V", 0);
    }
}
