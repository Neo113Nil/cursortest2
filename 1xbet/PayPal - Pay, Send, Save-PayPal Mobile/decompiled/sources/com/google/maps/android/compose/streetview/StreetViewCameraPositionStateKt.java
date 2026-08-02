package com.google.maps.android.compose.streetview;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\u0019\b\u0006\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"rememberStreetViewCameraPositionState", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StreetViewCameraPositionStateKt {
    public static final com.google.maps.android.compose.streetview.StreetViewCameraPositionState rememberStreetViewCameraPositionState(kotlin.jvm.functions.Function1<? super com.google.maps.android.compose.streetview.StreetViewCameraPositionState, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            function1 = com.google.maps.android.compose.streetview.StreetViewCameraPositionStateKt$rememberStreetViewCameraPositionState$1.INSTANCE;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = com.google.maps.android.compose.streetview.StreetViewCameraPositionState.INSTANCE.invoke();
            function1.invoke(rememberedValue);
            composer.updateRememberedValue(rememberedValue);
        }
        return (com.google.maps.android.compose.streetview.StreetViewCameraPositionState) rememberedValue;
    }
}
