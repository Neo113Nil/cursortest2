package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B9\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÀ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0010"}, d2 = {"Lcom/google/maps/android/compose/GroundOverlayPosition;", "", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "Lcom/google/android/gms/maps/model/LatLng;", "location", "", "width", "height", "<init>", "(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Float;Ljava/lang/Float;)V", "component1", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "component2", "()Lcom/google/android/gms/maps/model/LatLng;", "component3", "()Ljava/lang/Float;", "component4", "copy$maps_compose_release", "(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Float;Ljava/lang/Float;)Lcom/google/maps/android/compose/GroundOverlayPosition;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/gms/maps/model/LatLngBounds;", "getLatLngBounds", "Lcom/google/android/gms/maps/model/LatLng;", "getLocation", "Ljava/lang/Float;", "getWidth", "getHeight", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GroundOverlayPosition {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.maps.android.compose.GroundOverlayPosition.Companion INSTANCE = new com.google.maps.android.compose.GroundOverlayPosition.Companion(null);
    private final java.lang.Float height;
    private final com.google.android.gms.maps.model.LatLngBounds latLngBounds;
    private final com.google.android.gms.maps.model.LatLng location;
    private final java.lang.Float width;

    public GroundOverlayPosition(com.google.android.gms.maps.model.LatLngBounds latLngBounds, com.google.android.gms.maps.model.LatLng latLng, java.lang.Float f, java.lang.Float f2) {
        this.latLngBounds = latLngBounds;
        this.location = latLng;
        this.width = f;
        this.height = f2;
    }

    public /* synthetic */ GroundOverlayPosition(com.google.android.gms.maps.model.LatLngBounds latLngBounds, com.google.android.gms.maps.model.LatLng latLng, java.lang.Float f, java.lang.Float f2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : latLngBounds, (i & 2) != 0 ? null : latLng, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2);
    }

    public final com.google.android.gms.maps.model.LatLngBounds getLatLngBounds() {
        return this.latLngBounds;
    }

    public final com.google.android.gms.maps.model.LatLng getLocation() {
        return this.location;
    }

    public final java.lang.Float getWidth() {
        return this.width;
    }

    public final java.lang.Float getHeight() {
        return this.height;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\u000e"}, d2 = {"Lcom/google/maps/android/compose/GroundOverlayPosition$Companion;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "Lcom/google/maps/android/compose/GroundOverlayPosition;", "create", "(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/maps/android/compose/GroundOverlayPosition;", "Lcom/google/android/gms/maps/model/LatLng;", "location", "", "width", "height", "(Lcom/google/android/gms/maps/model/LatLng;FLjava/lang/Float;)Lcom/google/maps/android/compose/GroundOverlayPosition;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.google.maps.android.compose.GroundOverlayPosition create(com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLngBounds, "");
            return new com.google.maps.android.compose.GroundOverlayPosition(latLngBounds, null, null, null, 14, null);
        }

        public static /* synthetic */ com.google.maps.android.compose.GroundOverlayPosition create$default(com.google.maps.android.compose.GroundOverlayPosition.Companion companion, com.google.android.gms.maps.model.LatLng latLng, float f, java.lang.Float f2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                f2 = null;
            }
            return companion.create(latLng, f, f2);
        }

        public final com.google.maps.android.compose.GroundOverlayPosition create(com.google.android.gms.maps.model.LatLng location, float width, java.lang.Float height) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
            return new com.google.maps.android.compose.GroundOverlayPosition(null, location, java.lang.Float.valueOf(width), height, 1, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GroundOverlayPosition(latLngBounds=");
        sb.append(this.latLngBounds);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = this.latLngBounds;
        int hashCode = latLngBounds == null ? 0 : latLngBounds.hashCode();
        com.google.android.gms.maps.model.LatLng latLng = this.location;
        int hashCode2 = latLng == null ? 0 : latLng.hashCode();
        java.lang.Float f = this.width;
        int hashCode3 = f == null ? 0 : f.hashCode();
        java.lang.Float f2 = this.height;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (f2 != null ? f2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.maps.android.compose.GroundOverlayPosition)) {
            return false;
        }
        com.google.maps.android.compose.GroundOverlayPosition groundOverlayPosition = (com.google.maps.android.compose.GroundOverlayPosition) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.latLngBounds, groundOverlayPosition.latLngBounds) && kotlin.jvm.internal.Intrinsics.areEqual(this.location, groundOverlayPosition.location) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.width, (java.lang.Object) groundOverlayPosition.width) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.height, (java.lang.Object) groundOverlayPosition.height);
    }

    public final com.google.maps.android.compose.GroundOverlayPosition copy$maps_compose_release(com.google.android.gms.maps.model.LatLngBounds latLngBounds, com.google.android.gms.maps.model.LatLng location, java.lang.Float width, java.lang.Float height) {
        return new com.google.maps.android.compose.GroundOverlayPosition(latLngBounds, location, width, height);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Float getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Float getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final com.google.android.gms.maps.model.LatLng getLocation() {
        return this.location;
    }

    /* renamed from: component1, reason: from getter */
    public final com.google.android.gms.maps.model.LatLngBounds getLatLngBounds() {
        return this.latLngBounds;
    }

    public static /* synthetic */ com.google.maps.android.compose.GroundOverlayPosition copy$maps_compose_release$default(com.google.maps.android.compose.GroundOverlayPosition groundOverlayPosition, com.google.android.gms.maps.model.LatLngBounds latLngBounds, com.google.android.gms.maps.model.LatLng latLng, java.lang.Float f, java.lang.Float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            latLngBounds = groundOverlayPosition.latLngBounds;
        }
        if ((i & 2) != 0) {
            latLng = groundOverlayPosition.location;
        }
        if ((i & 4) != 0) {
            f = groundOverlayPosition.width;
        }
        if ((i & 8) != 0) {
            f2 = groundOverlayPosition.height;
        }
        return groundOverlayPosition.copy$maps_compose_release(latLngBounds, latLng, f, f2);
    }

    public GroundOverlayPosition() {
        this(null, null, null, null, 15, null);
    }
}
