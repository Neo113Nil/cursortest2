package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final /* synthetic */ class zzc extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        com.google.android.libraries.places.api.model.Place place = (com.google.android.libraries.places.api.model.Place) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        com.google.android.libraries.places.widget.internal.placedetails.zzf.zza((com.google.android.libraries.places.widget.internal.placedetails.zzf) this.receiver, place);
        return kotlin.Unit.INSTANCE;
    }

    zzc(java.lang.Object obj) {
        super(1, obj, com.google.android.libraries.places.widget.internal.placedetails.zzf.class, "updateUi", "updateUi(Lcom/google/android/libraries/places/api/model/Place;)V", 0);
    }
}
