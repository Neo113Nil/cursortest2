package com.google.maps.android.ktx;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/google/maps/android/ktx/IndoorLevelActivatedEvent;", "Lcom/google/maps/android/ktx/IndoorChangeEvent;", "Lcom/google/android/gms/maps/model/IndoorBuilding;", "building", "<init>", "(Lcom/google/android/gms/maps/model/IndoorBuilding;)V", "component1", "()Lcom/google/android/gms/maps/model/IndoorBuilding;", "copy", "(Lcom/google/android/gms/maps/model/IndoorBuilding;)Lcom/google/maps/android/ktx/IndoorLevelActivatedEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/gms/maps/model/IndoorBuilding;", "getBuilding"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IndoorLevelActivatedEvent extends com.google.maps.android.ktx.IndoorChangeEvent {
    private final com.google.android.gms.maps.model.IndoorBuilding building;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndoorLevelActivatedEvent(com.google.android.gms.maps.model.IndoorBuilding indoorBuilding) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indoorBuilding, "");
        this.building = indoorBuilding;
    }

    public final com.google.android.gms.maps.model.IndoorBuilding getBuilding() {
        return this.building;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IndoorLevelActivatedEvent(building=");
        sb.append(this.building);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.building.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.google.maps.android.ktx.IndoorLevelActivatedEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.building, ((com.google.maps.android.ktx.IndoorLevelActivatedEvent) other).building);
    }

    public final com.google.maps.android.ktx.IndoorLevelActivatedEvent copy(com.google.android.gms.maps.model.IndoorBuilding building) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(building, "");
        return new com.google.maps.android.ktx.IndoorLevelActivatedEvent(building);
    }

    /* renamed from: component1, reason: from getter */
    public final com.google.android.gms.maps.model.IndoorBuilding getBuilding() {
        return this.building;
    }

    public static /* synthetic */ com.google.maps.android.ktx.IndoorLevelActivatedEvent copy$default(com.google.maps.android.ktx.IndoorLevelActivatedEvent indoorLevelActivatedEvent, com.google.android.gms.maps.model.IndoorBuilding indoorBuilding, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            indoorBuilding = indoorLevelActivatedEvent.building;
        }
        return indoorLevelActivatedEvent.copy(indoorBuilding);
    }
}
