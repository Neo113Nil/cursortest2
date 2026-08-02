package com.google.maps.android.ktx.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/PolygonOptions;", "", "Lkotlin/ExtensionFunctionType;", "optionsActions", "polygonOptions", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/model/PolygonOptions;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PolygonOptionsKt {
    public static final com.google.android.gms.maps.model.PolygonOptions polygonOptions(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.PolygonOptions, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.android.gms.maps.model.PolygonOptions polygonOptions = new com.google.android.gms.maps.model.PolygonOptions();
        function1.invoke(polygonOptions);
        return polygonOptions;
    }
}
