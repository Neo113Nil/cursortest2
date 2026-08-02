package com.google.maps.android.ktx;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/google/maps/android/ktx/CameraMoveStartedEvent;", "Lcom/google/maps/android/ktx/CameraEvent;", "", "reason", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/google/maps/android/ktx/CameraMoveStartedEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CameraMoveStartedEvent extends com.google.maps.android.ktx.CameraEvent {
    private final int reason;

    public CameraMoveStartedEvent(int i) {
        super(null);
        this.reason = i;
    }

    public final int getReason() {
        return this.reason;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraMoveStartedEvent(reason=");
        sb.append(this.reason);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.reason);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.google.maps.android.ktx.CameraMoveStartedEvent) && this.reason == ((com.google.maps.android.ktx.CameraMoveStartedEvent) other).reason;
    }

    public final com.google.maps.android.ktx.CameraMoveStartedEvent copy(int reason) {
        return new com.google.maps.android.ktx.CameraMoveStartedEvent(reason);
    }

    /* renamed from: component1, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    public static /* synthetic */ com.google.maps.android.ktx.CameraMoveStartedEvent copy$default(com.google.maps.android.ktx.CameraMoveStartedEvent cameraMoveStartedEvent, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = cameraMoveStartedEvent.reason;
        }
        return cameraMoveStartedEvent.copy(i);
    }
}
