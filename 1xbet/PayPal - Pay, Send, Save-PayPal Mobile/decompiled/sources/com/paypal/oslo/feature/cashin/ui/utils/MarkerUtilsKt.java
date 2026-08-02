package com.paypal.oslo.feature.cashin.ui.utils;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a3\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, d2 = {"DefaultMarkerWidthSize", "", "DefaultMarkerHeightSize", "rememberMarkerStateForLocation", "Lcom/google/maps/android/compose/MarkerState;", "location", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "markerUtils", "Lcom/paypal/oslo/feature/cashin/ui/utils/MarkerUtils;", "(Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lcom/paypal/oslo/feature/cashin/ui/utils/MarkerUtils;Landroidx/compose/runtime/Composer;I)Lcom/google/maps/android/compose/MarkerState;", "rememberMarkerIcon", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "markerUrl", "", "context", "Landroid/content/Context;", "imageLoader", "Lcom/paypal/oslo/core/commonui/components/ImageLoader;", "markerSize", "(Ljava/lang/String;Landroid/content/Context;Lcom/paypal/oslo/core/commonui/components/ImageLoader;ILandroidx/compose/runtime/Composer;II)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "cash-in_prodRelease", "bitmapDescriptor"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarkerUtilsKt {
    public static final com.google.maps.android.compose.MarkerState rememberMarkerStateForLocation(com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerUtils, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1027620630, i, -1, "com.paypal.oslo.feature.cashin.ui.utils.rememberMarkerStateForLocation (MarkerUtils.kt:154)");
        }
        com.google.android.gms.maps.model.LatLng locationToLatLng = markerUtils.locationToLatLng(cashInStore);
        boolean changed = composer.changed(locationToLatLng);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = com.google.maps.android.compose.MarkerState.INSTANCE.invoke(locationToLatLng);
            composer.updateRememberedValue(rememberedValue);
        }
        com.google.maps.android.compose.MarkerState markerState = (com.google.maps.android.compose.MarkerState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return markerState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.google.android.gms.maps.model.BitmapDescriptor rememberMarkerIcon(java.lang.String str, android.content.Context context, com.paypal.oslo.core.commonui.components.ImageLoader imageLoader, int i, androidx.compose.runtime.Composer composer, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLoader, "");
        if ((i3 & 8) != 0) {
            i = 96;
        }
        int i4 = i;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1398267006, i2, -1, "com.paypal.oslo.feature.cashin.ui.utils.rememberMarkerIcon (MarkerUtils.kt:177)");
        }
        int i5 = i2 & 14;
        int i6 = i5 ^ 6;
        boolean z = true;
        boolean z2 = (i6 > 4 && composer.changed(str)) || (i2 & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        boolean z3 = (i6 > 4 && composer.changed(str)) || (i2 & 6) == 4;
        boolean changed = composer.changed(mutableState);
        boolean changedInstance = composer.changedInstance(context);
        boolean z4 = (((i2 & 7168) ^ 3072) > 2048 && composer.changed(i4)) || (i2 & 3072) == 2048;
        if ((((i2 & 896) ^ 384) <= 256 || !composer.changedInstance(imageLoader)) && (i2 & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((z3 | changed | changedInstance | z4 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.utils.MarkerUtilsKt$rememberMarkerIcon$1$1(str, context, i4, imageLoader, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, i5);
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor = (com.google.android.gms.maps.model.BitmapDescriptor) mutableState.getValue();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return bitmapDescriptor;
    }
}
