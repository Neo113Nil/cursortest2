package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0000\u001a\u00020\u00012\u0019\b\u0006\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a8\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0019\b\u0006\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\t\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\"\u0011\u0010\u000e\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"rememberCameraPositionState", "Lcom/google/maps/android/compose/CameraPositionState;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/maps/android/compose/CameraPositionState;", "key", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/maps/android/compose/CameraPositionState;", "LocalCameraPositionState", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalCameraPositionState", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "currentCameraPositionState", "getCurrentCameraPositionState", "(Landroidx/compose/runtime/Composer;I)Lcom/google/maps/android/compose/CameraPositionState;", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CameraPositionStateKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.google.maps.android.compose.CameraPositionState> LocalCameraPositionState = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.compose.CameraPositionStateKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            com.google.maps.android.compose.CameraPositionState LocalCameraPositionState$lambda$0;
            LocalCameraPositionState$lambda$0 = com.google.maps.android.compose.CameraPositionStateKt.LocalCameraPositionState$lambda$0();
            return LocalCameraPositionState$lambda$0;
        }
    });

    public static final com.google.maps.android.compose.CameraPositionState rememberCameraPositionState(kotlin.jvm.functions.Function1<? super com.google.maps.android.compose.CameraPositionState, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            function1 = com.google.maps.android.compose.CameraPositionStateKt$rememberCameraPositionState$1.INSTANCE;
        }
        return (com.google.maps.android.compose.CameraPositionState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(new java.lang.Object[0], (androidx.compose.runtime.saveable.Saver) com.google.maps.android.compose.CameraPositionState.INSTANCE.getSaver(), (kotlin.jvm.functions.Function0) new com.google.maps.android.compose.CameraPositionStateKt$rememberCameraPositionState$2(function1), composer, 0);
    }

    @kotlin.Deprecated(message = "The 'key' parameter is deprecated. Please use the new `rememberCameraPositionState` function without a key.", replaceWith = @kotlin.ReplaceWith(expression = "rememberCameraPositionState(init)", imports = {"com.google.maps.android.compose.rememberCameraPositionState"}))
    public static final com.google.maps.android.compose.CameraPositionState rememberCameraPositionState(java.lang.String str, final kotlin.jvm.functions.Function1<? super com.google.maps.android.compose.CameraPositionState, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        if ((i2 & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<com.google.maps.android.compose.CameraPositionState, kotlin.Unit>() { // from class: com.google.maps.android.compose.CameraPositionStateKt$rememberCameraPositionState$3
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.google.maps.android.compose.CameraPositionState cameraPositionState) {
                    invoke2(cameraPositionState);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.google.maps.android.compose.CameraPositionState cameraPositionState) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPositionState, "");
                }
            };
        }
        return (com.google.maps.android.compose.CameraPositionState) androidx.compose.runtime.saveable.RememberSaveableKt.m5464rememberSaveable(new java.lang.Object[0], (androidx.compose.runtime.saveable.Saver) com.google.maps.android.compose.CameraPositionState.INSTANCE.getSaver(), str2, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.google.maps.android.compose.CameraPositionState>() { // from class: com.google.maps.android.compose.CameraPositionStateKt$rememberCameraPositionState$4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.google.maps.android.compose.CameraPositionState invoke() {
                com.google.maps.android.compose.CameraPositionState invoke$default = com.google.maps.android.compose.CameraPositionState.Companion.invoke$default(com.google.maps.android.compose.CameraPositionState.INSTANCE, null, 1, null);
                function1.invoke(invoke$default);
                return invoke$default;
            }
        }, composer, (i << 6) & 896, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.maps.android.compose.CameraPositionState LocalCameraPositionState$lambda$0() {
        return com.google.maps.android.compose.CameraPositionState.Companion.invoke$default(com.google.maps.android.compose.CameraPositionState.INSTANCE, null, 1, null);
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.google.maps.android.compose.CameraPositionState> getLocalCameraPositionState() {
        return LocalCameraPositionState;
    }

    public static final com.google.maps.android.compose.CameraPositionState getCurrentCameraPositionState(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(629347539, i, -1, "com.google.maps.android.compose.<get-currentCameraPositionState> (CameraPositionState.kt:355)");
        }
        com.google.maps.android.compose.CameraPositionState cameraPositionState = (com.google.maps.android.compose.CameraPositionState) composer.consume(LocalCameraPositionState);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cameraPositionState;
    }
}
