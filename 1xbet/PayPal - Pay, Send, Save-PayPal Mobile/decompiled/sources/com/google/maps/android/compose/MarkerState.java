package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R+\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00108G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R1\u0010\u001d\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168G@AX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0017\u0010\f\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\fR(\u0010&\u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%"}, d2 = {"Lcom/google/maps/android/compose/MarkerState;", "", "Lcom/google/android/gms/maps/model/LatLng;", com.daon.sdk.face.license.License.FEATURE_POSITION, "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "", "showInfoWindow", "()V", "hideInfoWindow", "<set-?>", "position$delegate", "Landroidx/compose/runtime/MutableState;", "getPosition", "()Lcom/google/android/gms/maps/model/LatLng;", "setPosition", "", "isDragging$delegate", "isDragging", "()Z", "setDragging$maps_compose_release", "(Z)V", "Lcom/google/maps/android/compose/DragState;", "dragState$delegate", "getDragState", "()Lcom/google/maps/android/compose/DragState;", "setDragState$maps_compose_release", "(Lcom/google/maps/android/compose/DragState;)V", "getDragState$annotations", "dragState", "Landroidx/compose/runtime/MutableState;", "Lcom/google/android/gms/maps/model/Marker;", "markerState", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getMarker$maps_compose_release", "()Lcom/google/android/gms/maps/model/Marker;", "setMarker$maps_compose_release", "(Lcom/google/android/gms/maps/model/Marker;)V", "marker", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MarkerState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.maps.android.compose.MarkerState.Companion INSTANCE = new com.google.maps.android.compose.MarkerState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<com.google.maps.android.compose.MarkerState, com.google.android.gms.maps.model.LatLng> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.maps.model.LatLng Saver$lambda$0;
            Saver$lambda$0 = com.google.maps.android.compose.MarkerState.Saver$lambda$0((androidx.compose.runtime.saveable.SaverScope) obj, (com.google.maps.android.compose.MarkerState) obj2);
            return Saver$lambda$0;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            com.google.maps.android.compose.MarkerState Saver$lambda$1;
            Saver$lambda$1 = com.google.maps.android.compose.MarkerState.Saver$lambda$1((com.google.android.gms.maps.model.LatLng) obj);
            return Saver$lambda$1;
        }
    });

    /* renamed from: dragState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState dragState;

    /* renamed from: isDragging$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isDragging;
    private final androidx.compose.runtime.MutableState<com.google.android.gms.maps.model.Marker> markerState;

    /* renamed from: position$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState position;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use isDragging instead - dragState is not appropriate for representing \"state\"; it is a lossy representation of drag \"events\", promoting invalid usage.")
    public static /* synthetic */ void getDragState$annotations() {
    }

    private MarkerState(com.google.android.gms.maps.model.LatLng latLng) {
        this.position = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(latLng, null, 2, null);
        this.isDragging = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
        this.dragState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.google.maps.android.compose.DragState.END, null, 2, null);
        this.markerState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.maps.model.LatLng getPosition() {
        return (com.google.android.gms.maps.model.LatLng) this.position.getValue();
    }

    public final void setPosition(com.google.android.gms.maps.model.LatLng latLng) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
        this.position.setValue(latLng);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging() {
        return ((java.lang.Boolean) this.isDragging.getValue()).booleanValue();
    }

    public final void setDragging$maps_compose_release(boolean z) {
        this.isDragging.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.maps.android.compose.DragState getDragState() {
        return (com.google.maps.android.compose.DragState) this.dragState.getValue();
    }

    public final void setDragState$maps_compose_release(com.google.maps.android.compose.DragState dragState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dragState, "");
        this.dragState.setValue(dragState);
    }

    public final com.google.android.gms.maps.model.Marker getMarker$maps_compose_release() {
        return this.markerState.getValue();
    }

    public final void setMarker$maps_compose_release(com.google.android.gms.maps.model.Marker marker) {
        if (this.markerState.getValue() == null && marker == null) {
            return;
        }
        if (this.markerState.getValue() != null && marker != null) {
            throw new java.lang.IllegalStateException("MarkerState may only be associated with one Marker at a time.".toString());
        }
        this.markerState.setValue(marker);
    }

    public final void showInfoWindow() {
        com.google.android.gms.maps.model.Marker marker$maps_compose_release = getMarker$maps_compose_release();
        if (marker$maps_compose_release != null) {
            marker$maps_compose_release.showInfoWindow();
        }
    }

    public final void hideInfoWindow() {
        com.google.android.gms.maps.model.Marker marker$maps_compose_release = getMarker$maps_compose_release();
        if (marker$maps_compose_release != null) {
            marker$maps_compose_release.hideInfoWindow();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/google/maps/android/compose/MarkerState$Companion;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/LatLng;", com.daon.sdk.face.license.License.FEATURE_POSITION, "Lcom/google/maps/android/compose/MarkerState;", "invoke", "(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/maps/android/compose/MarkerState;", "Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.google.maps.android.compose.MarkerState invoke$default(com.google.maps.android.compose.MarkerState.Companion companion, com.google.android.gms.maps.model.LatLng latLng, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                latLng = new com.google.android.gms.maps.model.LatLng(0.0d, 0.0d);
            }
            return companion.invoke(latLng);
        }

        public final com.google.maps.android.compose.MarkerState invoke(com.google.android.gms.maps.model.LatLng position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
            return new com.google.maps.android.compose.MarkerState(position, null);
        }

        public final androidx.compose.runtime.saveable.Saver<com.google.maps.android.compose.MarkerState, com.google.android.gms.maps.model.LatLng> getSaver() {
            return com.google.maps.android.compose.MarkerState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.android.gms.maps.model.LatLng Saver$lambda$0(androidx.compose.runtime.saveable.SaverScope saverScope, com.google.maps.android.compose.MarkerState markerState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saverScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerState, "");
        return markerState.getPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.maps.android.compose.MarkerState Saver$lambda$1(com.google.android.gms.maps.model.LatLng latLng) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
        return new com.google.maps.android.compose.MarkerState(latLng);
    }

    public /* synthetic */ MarkerState(com.google.android.gms.maps.model.LatLng latLng, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(latLng);
    }
}
