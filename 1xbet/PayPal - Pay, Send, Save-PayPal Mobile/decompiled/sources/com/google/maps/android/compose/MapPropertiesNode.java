package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u00068\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,"}, d2 = {"Lcom/google/maps/android/compose/MapPropertiesNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/maps/android/compose/CameraPositionState;", "cameraPositionState", "", "contentDescription", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/compose/CameraPositionState;Ljava/lang/String;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;)V", "", "onAttached", "()V", "onRemoved", "onCleared", "Lcom/google/android/gms/maps/GoogleMap;", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getContentDescription", "()Ljava/lang/String;", "setContentDescription", "(Ljava/lang/String;)V", "Lcom/google/maps/android/compose/CameraPositionState;", "getCameraPositionState", "()Lcom/google/maps/android/compose/CameraPositionState;", "setCameraPositionState", "(Lcom/google/maps/android/compose/CameraPositionState;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapPropertiesNode implements com.google.maps.android.compose.MapNode {
    public static final int $stable = 8;
    private com.google.maps.android.compose.CameraPositionState cameraPositionState;
    private java.lang.String contentDescription;
    private androidx.compose.ui.unit.Density density;
    private androidx.compose.ui.unit.LayoutDirection layoutDirection;
    private final com.google.android.gms.maps.GoogleMap map;

    public MapPropertiesNode(com.google.android.gms.maps.GoogleMap googleMap, com.google.maps.android.compose.CameraPositionState cameraPositionState, java.lang.String str, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPositionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "");
        this.map = googleMap;
        this.density = density;
        this.layoutDirection = layoutDirection;
        com.google.maps.android.compose.MapUpdaterKt.applyContentPadding(this, googleMap, paddingValues);
        cameraPositionState.setMap$maps_compose_release(googleMap);
        if (str != null) {
            googleMap.setContentDescription(str);
        }
        this.contentDescription = str;
        this.cameraPositionState = cameraPositionState;
    }

    public final com.google.android.gms.maps.GoogleMap getMap() {
        return this.map;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final void setDensity(androidx.compose.ui.unit.Density density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        this.density = density;
    }

    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "");
        this.layoutDirection = layoutDirection;
    }

    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final void setContentDescription(java.lang.String str) {
        this.contentDescription = str;
        this.map.setContentDescription(str);
    }

    public final com.google.maps.android.compose.CameraPositionState getCameraPositionState() {
        return this.cameraPositionState;
    }

    public final void setCameraPositionState(com.google.maps.android.compose.CameraPositionState cameraPositionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPositionState, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(cameraPositionState, this.cameraPositionState)) {
            return;
        }
        this.cameraPositionState.setMap$maps_compose_release(null);
        this.cameraPositionState = cameraPositionState;
        cameraPositionState.setMap$maps_compose_release(this.map);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onAttached() {
        this.map.setOnCameraIdleListener(new com.google.android.gms.maps.GoogleMap.OnCameraIdleListener() { // from class: com.google.maps.android.compose.MapPropertiesNode$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
            public final void onCameraIdle() {
                com.google.maps.android.compose.MapPropertiesNode.onAttached$lambda$0(com.google.maps.android.compose.MapPropertiesNode.this);
            }
        });
        this.map.setOnCameraMoveCanceledListener(new com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener() { // from class: com.google.maps.android.compose.MapPropertiesNode$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener
            public final void onCameraMoveCanceled() {
                com.google.maps.android.compose.MapPropertiesNode.onAttached$lambda$1(com.google.maps.android.compose.MapPropertiesNode.this);
            }
        });
        this.map.setOnCameraMoveStartedListener(new com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener() { // from class: com.google.maps.android.compose.MapPropertiesNode$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
            public final void onCameraMoveStarted(int i) {
                com.google.maps.android.compose.MapPropertiesNode.onAttached$lambda$2(com.google.maps.android.compose.MapPropertiesNode.this, i);
            }
        });
        this.map.setOnCameraMoveListener(new com.google.android.gms.maps.GoogleMap.OnCameraMoveListener() { // from class: com.google.maps.android.compose.MapPropertiesNode$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
            public final void onCameraMove() {
                com.google.maps.android.compose.MapPropertiesNode.onAttached$lambda$3(com.google.maps.android.compose.MapPropertiesNode.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$0(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode) {
        mapPropertiesNode.cameraPositionState.setMoving$maps_compose_release(false);
        com.google.maps.android.compose.CameraPositionState cameraPositionState = mapPropertiesNode.cameraPositionState;
        com.google.android.gms.maps.model.CameraPosition cameraPosition = mapPropertiesNode.map.getCameraPosition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraPosition, "");
        cameraPositionState.setRawPosition$maps_compose_release(cameraPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$1(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode) {
        mapPropertiesNode.cameraPositionState.setMoving$maps_compose_release(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$2(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode, int i) {
        mapPropertiesNode.cameraPositionState.setCameraMoveStartedReason$maps_compose_release(com.google.maps.android.compose.CameraMoveStartedReason.INSTANCE.fromInt(i));
        mapPropertiesNode.cameraPositionState.setMoving$maps_compose_release(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$3(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode) {
        com.google.maps.android.compose.CameraPositionState cameraPositionState = mapPropertiesNode.cameraPositionState;
        com.google.android.gms.maps.model.CameraPosition cameraPosition = mapPropertiesNode.map.getCameraPosition();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraPosition, "");
        cameraPositionState.setRawPosition$maps_compose_release(cameraPosition);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        this.cameraPositionState.setMap$maps_compose_release(null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onCleared() {
        this.cameraPositionState.setMap$maps_compose_release(null);
    }
}
