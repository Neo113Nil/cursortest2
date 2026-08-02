package com.google.maps.android.compose.streetview;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u0001:\u00010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00158A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b \u0010!R+\u0010'\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010!\"\u0004\b%\u0010&R.\u0010*\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(8\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "", "durationMs", "", "animateTo", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;I)V", "Lcom/google/android/gms/maps/model/LatLng;", com.daon.sdk.face.license.License.FEATURE_POSITION, "radius", "Lcom/google/android/gms/maps/model/StreetViewSource;", "source", "setPosition", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Integer;Lcom/google/android/gms/maps/model/StreetViewSource;)V", "", "panoId", "(Ljava/lang/String;)V", "Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "getLocation", "()Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "location", "<set-?>", "rawLocation$delegate", "Landroidx/compose/runtime/MutableState;", "getRawLocation$maps_compose_release", "setRawLocation$maps_compose_release", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;)V", "rawLocation", "getPanoramaCamera", "()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "panoramaCamera", "rawPanoramaCamera$delegate", "getRawPanoramaCamera$maps_compose_release", "setRawPanoramaCamera$maps_compose_release", "(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)V", "rawPanoramaCamera", "Lcom/google/android/gms/maps/StreetViewPanorama;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "panorama", "Lcom/google/android/gms/maps/StreetViewPanorama;", "getPanorama$maps_compose_release", "()Lcom/google/android/gms/maps/StreetViewPanorama;", "setPanorama$maps_compose_release", "(Lcom/google/android/gms/maps/StreetViewPanorama;)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StreetViewCameraPositionState {
    private com.google.android.gms.maps.StreetViewPanorama panorama;

    /* renamed from: rawLocation$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState rawLocation;

    /* renamed from: rawPanoramaCamera$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState rawPanoramaCamera;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.maps.android.compose.streetview.StreetViewCameraPositionState.Companion INSTANCE = new com.google.maps.android.compose.streetview.StreetViewCameraPositionState.Companion(null);
    public static final int $stable = 8;

    private StreetViewCameraPositionState() {
        this.rawLocation = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new com.google.android.gms.maps.model.StreetViewPanoramaLocation(new com.google.android.gms.maps.model.StreetViewPanoramaLink[0], new com.google.android.gms.maps.model.LatLng(0.0d, 0.0d), ""), null, 2, null);
        this.rawPanoramaCamera = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new com.google.android.gms.maps.model.StreetViewPanoramaCamera(0.0f, 0.0f, 0.0f), null, 2, null);
    }

    public final com.google.android.gms.maps.model.StreetViewPanoramaLocation getLocation() {
        return getRawLocation$maps_compose_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.maps.model.StreetViewPanoramaLocation getRawLocation$maps_compose_release() {
        return (com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.rawLocation.getValue();
    }

    public final void setRawLocation$maps_compose_release(com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaLocation, "");
        this.rawLocation.setValue(streetViewPanoramaLocation);
    }

    public final com.google.android.gms.maps.model.StreetViewPanoramaCamera getPanoramaCamera() {
        return getRawPanoramaCamera$maps_compose_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.maps.model.StreetViewPanoramaCamera getRawPanoramaCamera$maps_compose_release() {
        return (com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.rawPanoramaCamera.getValue();
    }

    public final void setRawPanoramaCamera$maps_compose_release(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaCamera, "");
        this.rawPanoramaCamera.setValue(streetViewPanoramaCamera);
    }

    /* renamed from: getPanorama$maps_compose_release, reason: from getter */
    public final com.google.android.gms.maps.StreetViewPanorama getPanorama() {
        return this.panorama;
    }

    public final void setPanorama$maps_compose_release(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama) {
        com.google.android.gms.maps.StreetViewPanorama streetViewPanorama2 = this.panorama;
        if (streetViewPanorama2 == null && streetViewPanorama == null) {
            return;
        }
        if (streetViewPanorama2 != null && streetViewPanorama != null) {
            throw new java.lang.IllegalStateException("StreetViewCameraPositionState may only be associated with one StreetView at a time.".toString());
        }
        this.panorama = streetViewPanorama;
    }

    public final void animateTo(com.google.android.gms.maps.model.StreetViewPanoramaCamera camera, int durationMs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
        com.google.android.gms.maps.StreetViewPanorama streetViewPanorama = this.panorama;
        if (streetViewPanorama != null) {
            streetViewPanorama.animateTo(camera, durationMs);
        }
    }

    public static /* synthetic */ void setPosition$default(com.google.maps.android.compose.streetview.StreetViewCameraPositionState streetViewCameraPositionState, com.google.android.gms.maps.model.LatLng latLng, java.lang.Integer num, com.google.android.gms.maps.model.StreetViewSource streetViewSource, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            streetViewSource = null;
        }
        streetViewCameraPositionState.setPosition(latLng, num, streetViewSource);
    }

    public final void setPosition(com.google.android.gms.maps.model.LatLng position, java.lang.Integer radius, com.google.android.gms.maps.model.StreetViewSource source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
        if (radius != null && source != null) {
            com.google.android.gms.maps.StreetViewPanorama streetViewPanorama = this.panorama;
            if (streetViewPanorama != null) {
                streetViewPanorama.setPosition(position, radius.intValue(), source);
                return;
            }
            return;
        }
        if (radius != null) {
            com.google.android.gms.maps.StreetViewPanorama streetViewPanorama2 = this.panorama;
            if (streetViewPanorama2 != null) {
                streetViewPanorama2.setPosition(position, radius.intValue());
                return;
            }
            return;
        }
        com.google.android.gms.maps.StreetViewPanorama streetViewPanorama3 = this.panorama;
        if (streetViewPanorama3 != null) {
            streetViewPanorama3.setPosition(position);
        }
    }

    public final void setPosition(java.lang.String panoId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(panoId, "");
        com.google.android.gms.maps.StreetViewPanorama streetViewPanorama = this.panorama;
        if (streetViewPanorama != null) {
            streetViewPanorama.setPosition(panoId);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState$Companion;", "", "<init>", "()V", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "invoke", "()Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.google.maps.android.compose.streetview.StreetViewCameraPositionState invoke() {
            return new com.google.maps.android.compose.streetview.StreetViewCameraPositionState(null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StreetViewCameraPositionState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
