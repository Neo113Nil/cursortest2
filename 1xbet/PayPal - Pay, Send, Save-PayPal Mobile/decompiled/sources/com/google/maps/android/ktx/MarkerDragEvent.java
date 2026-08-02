package com.google.maps.android.ktx;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/google/maps/android/ktx/MarkerDragEvent;", "Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "Lcom/google/android/gms/maps/model/Marker;", "marker", "<init>", "(Lcom/google/android/gms/maps/model/Marker;)V", "component1", "()Lcom/google/android/gms/maps/model/Marker;", "copy", "(Lcom/google/android/gms/maps/model/Marker;)Lcom/google/maps/android/ktx/MarkerDragEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/gms/maps/model/Marker;", "getMarker"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MarkerDragEvent extends com.google.maps.android.ktx.OnMarkerDragEvent {
    private final com.google.android.gms.maps.model.Marker marker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkerDragEvent(com.google.android.gms.maps.model.Marker marker) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        this.marker = marker;
    }

    @Override // com.google.maps.android.ktx.OnMarkerDragEvent
    public final com.google.android.gms.maps.model.Marker getMarker() {
        return this.marker;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MarkerDragEvent(marker=");
        sb.append(this.marker);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.marker.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.google.maps.android.ktx.MarkerDragEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.marker, ((com.google.maps.android.ktx.MarkerDragEvent) other).marker);
    }

    public final com.google.maps.android.ktx.MarkerDragEvent copy(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return new com.google.maps.android.ktx.MarkerDragEvent(marker);
    }

    /* renamed from: component1, reason: from getter */
    public final com.google.android.gms.maps.model.Marker getMarker() {
        return this.marker;
    }

    public static /* synthetic */ com.google.maps.android.ktx.MarkerDragEvent copy$default(com.google.maps.android.ktx.MarkerDragEvent markerDragEvent, com.google.android.gms.maps.model.Marker marker, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            marker = markerDragEvent.marker;
        }
        return markerDragEvent.copy(marker);
    }
}
