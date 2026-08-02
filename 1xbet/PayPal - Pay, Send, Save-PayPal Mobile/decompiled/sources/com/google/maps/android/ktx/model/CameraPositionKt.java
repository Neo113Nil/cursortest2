package com.google.maps.android.ktx.model;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/CameraPosition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "optionsActions", "Lcom/google/android/gms/maps/model/CameraPosition;", "cameraPosition", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/model/CameraPosition;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CameraPositionKt {
    public static final com.google.android.gms.maps.model.CameraPosition cameraPosition(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.CameraPosition.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.google.android.gms.maps.model.CameraPosition.Builder builder = new com.google.android.gms.maps.model.CameraPosition.Builder();
        function1.invoke(builder);
        com.google.android.gms.maps.model.CameraPosition build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
