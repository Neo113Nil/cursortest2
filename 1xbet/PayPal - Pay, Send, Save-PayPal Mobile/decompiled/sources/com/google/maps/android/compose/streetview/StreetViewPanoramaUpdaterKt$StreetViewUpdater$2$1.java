package com.google.maps.android.compose.streetview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1 implements kotlin.jvm.functions.Function2<com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode, java.lang.Boolean, kotlin.Unit> {
    final /* synthetic */ boolean $isPanningGesturesEnabled;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, java.lang.Boolean bool) {
        invoke(streetViewPanoramaPropertiesNode, bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaPropertiesNode, "");
        streetViewPanoramaPropertiesNode.getPanorama().setPanningGesturesEnabled(this.$isPanningGesturesEnabled);
    }

    public StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1(boolean z) {
        this.$isPanningGesturesEnabled = z;
    }
}
