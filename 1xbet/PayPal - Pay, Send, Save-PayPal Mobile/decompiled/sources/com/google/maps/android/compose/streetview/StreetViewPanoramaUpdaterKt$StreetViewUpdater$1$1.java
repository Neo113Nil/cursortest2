package com.google.maps.android.compose.streetview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1 implements kotlin.jvm.functions.Function0<com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode> {
    final /* synthetic */ com.google.maps.android.compose.streetview.StreetViewCameraPositionState $cameraPositionState;
    final /* synthetic */ com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners $clickListeners;
    final /* synthetic */ com.google.android.gms.maps.StreetViewPanorama $streetViewPanorama;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode invoke() {
        return new com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode(this.$cameraPositionState, this.$streetViewPanorama, this.$clickListeners);
    }

    public StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(com.google.maps.android.compose.streetview.StreetViewCameraPositionState streetViewCameraPositionState, com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        this.$cameraPositionState = streetViewCameraPositionState;
        this.$streetViewPanorama = streetViewPanorama;
        this.$clickListeners = streetViewPanoramaEventListeners;
    }
}
