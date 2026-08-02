package com.google.maps.android.compose.streetview;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewPanoramaPropertiesNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "cameraPositionState", "Lcom/google/android/gms/maps/StreetViewPanorama;", "panorama", "Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "eventListeners", "<init>", "(Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;Lcom/google/android/gms/maps/StreetViewPanorama;Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;)V", "", "onAttached", "()V", "onRemoved", "onCleared", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "getCameraPositionState", "()Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "Lcom/google/android/gms/maps/StreetViewPanorama;", "getPanorama", "()Lcom/google/android/gms/maps/StreetViewPanorama;", "Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "getEventListeners", "()Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "setEventListeners", "(Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StreetViewPanoramaPropertiesNode implements com.google.maps.android.compose.MapNode {
    public static final int $stable = 8;
    private final com.google.maps.android.compose.streetview.StreetViewCameraPositionState cameraPositionState;
    private com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners eventListeners;
    private final com.google.android.gms.maps.StreetViewPanorama panorama;

    public StreetViewPanoramaPropertiesNode(com.google.maps.android.compose.streetview.StreetViewCameraPositionState streetViewCameraPositionState, com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewCameraPositionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanorama, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaEventListeners, "");
        this.cameraPositionState = streetViewCameraPositionState;
        this.panorama = streetViewPanorama;
        this.eventListeners = streetViewPanoramaEventListeners;
        streetViewCameraPositionState.setPanorama$maps_compose_release(streetViewPanorama);
    }

    public final com.google.maps.android.compose.streetview.StreetViewCameraPositionState getCameraPositionState() {
        return this.cameraPositionState;
    }

    public final com.google.android.gms.maps.StreetViewPanorama getPanorama() {
        return this.panorama;
    }

    public final com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners getEventListeners() {
        return this.eventListeners;
    }

    public final void setEventListeners(com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaEventListeners, "");
        this.eventListeners = streetViewPanoramaEventListeners;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onAttached() {
        super.onAttached();
        this.panorama.setOnStreetViewPanoramaClickListener(new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener
            public final void onStreetViewPanoramaClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode.onAttached$lambda$0(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode.this, streetViewPanoramaOrientation);
            }
        });
        this.panorama.setOnStreetViewPanoramaLongClickListener(new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener
            public final void onStreetViewPanoramaLongClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode.onAttached$lambda$1(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode.this, streetViewPanoramaOrientation);
            }
        });
        this.panorama.setOnStreetViewPanoramaCameraChangeListener(new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener
            public final void onStreetViewPanoramaCameraChange(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
                com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode.onAttached$lambda$2(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode.this, streetViewPanoramaCamera);
            }
        });
        this.panorama.setOnStreetViewPanoramaChangeListener(new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener
            public final void onStreetViewPanoramaChange(com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation) {
                com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode.onAttached$lambda$3(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode.this, streetViewPanoramaLocation);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$0(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaOrientation, "");
        streetViewPanoramaPropertiesNode.eventListeners.getOnClick().invoke(streetViewPanoramaOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$1(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaOrientation, "");
        streetViewPanoramaPropertiesNode.eventListeners.getOnLongClick().invoke(streetViewPanoramaOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$2(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaCamera, "");
        streetViewPanoramaPropertiesNode.cameraPositionState.setRawPanoramaCamera$maps_compose_release(streetViewPanoramaCamera);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$3(com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaLocation, "");
        streetViewPanoramaPropertiesNode.cameraPositionState.setRawLocation$maps_compose_release(streetViewPanoramaLocation);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        this.cameraPositionState.setPanorama$maps_compose_release(null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onCleared() {
        this.cameraPositionState.setPanorama$maps_compose_release(null);
    }
}
