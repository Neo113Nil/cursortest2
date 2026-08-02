package com.google.maps.android.compose.streetview;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a@\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0080\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "cameraPositionState", "", "isPanningGesturesEnabled", "isStreetNamesEnabled", "isUserNavigationEnabled", "isZoomGesturesEnabled", "Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "clickListeners", "", "StreetViewUpdater", "(Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;ZZZZLcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StreetViewPanoramaUpdaterKt {
    public static final void StreetViewUpdater(com.google.maps.android.compose.streetview.StreetViewCameraPositionState streetViewCameraPositionState, boolean z, boolean z2, boolean z3, boolean z4, com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners streetViewPanoramaEventListeners, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewCameraPositionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaEventListeners, "");
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
        com.google.android.gms.maps.StreetViewPanorama streetViewPanorama = ((com.google.maps.android.compose.streetview.StreetViewPanoramaApplier) applier).getStreetViewPanorama();
        boolean changedInstance = composer.changedInstance(streetViewCameraPositionState);
        boolean changedInstance2 = composer.changedInstance(streetViewPanorama);
        boolean z5 = (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(streetViewPanoramaEventListeners)) || (i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z5 | changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function0) new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(streetViewCameraPositionState, streetViewPanorama, streetViewPanoramaEventListeners);
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        if (!(composer.getApplier() instanceof com.google.maps.android.compose.streetview.StreetViewPanoramaApplier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z), new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1(z));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z2), new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$2(z2));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z3), new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$3(z3));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z4), new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$4(z4));
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, streetViewPanoramaEventListeners, com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5.INSTANCE);
        composer.endNode();
    }
}
