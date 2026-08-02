package com.google.maps.android.compose.streetview;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewPanoramaApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/StreetViewPanorama;", "streetViewPanorama", "<init>", "(Lcom/google/android/gms/maps/StreetViewPanorama;)V", "", "onClear", "()V", "", "index", "instance", "insertBottomUp", "(ILcom/google/maps/android/compose/MapNode;)V", "insertTopDown", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "move", "(III)V", "remove", "(II)V", "Lcom/google/android/gms/maps/StreetViewPanorama;", "getStreetViewPanorama", "()Lcom/google/android/gms/maps/StreetViewPanorama;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StreetViewPanoramaApplier extends androidx.compose.runtime.AbstractApplier<com.google.maps.android.compose.MapNode> {
    public static final int $stable = 8;
    private final com.google.android.gms.maps.StreetViewPanorama streetViewPanorama;

    @Override // androidx.compose.runtime.Applier
    public final void move(int from, int to, int count) {
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void onClear() {
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int index, int count) {
    }

    public final com.google.android.gms.maps.StreetViewPanorama getStreetViewPanorama() {
        return this.streetViewPanorama;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewPanoramaApplier(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama) {
        super(com.google.maps.android.compose.streetview.StreetViewPanoramaNodeRoot.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanorama, "");
        this.streetViewPanorama = streetViewPanorama;
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int index, com.google.maps.android.compose.MapNode instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
        instance.onAttached();
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int index, com.google.maps.android.compose.MapNode instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
    }
}
