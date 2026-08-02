package com.google.maps.android.compose.streetview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5 implements kotlin.jvm.functions.Function2<com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode, com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners, kotlin.Unit> {
    public static final com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5 INSTANCE = new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5();

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        invoke2(streetViewPanoramaPropertiesNode, streetViewPanoramaEventListeners);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaPropertiesNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaEventListeners, "");
        streetViewPanoramaPropertiesNode.setEventListeners(streetViewPanoramaEventListeners);
    }
}
