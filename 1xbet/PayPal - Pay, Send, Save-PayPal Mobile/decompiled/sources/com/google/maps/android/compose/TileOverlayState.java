package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068A@AX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r"}, d2 = {"Lcom/google/maps/android/compose/TileOverlayState;", "", "<init>", "()V", "", "clearTileCache", "Lcom/google/android/gms/maps/model/TileOverlay;", "<set-?>", "tileOverlay$delegate", "Landroidx/compose/runtime/MutableState;", "getTileOverlay$maps_compose_release", "()Lcom/google/android/gms/maps/model/TileOverlay;", "setTileOverlay$maps_compose_release", "(Lcom/google/android/gms/maps/model/TileOverlay;)V", "tileOverlay", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TileOverlayState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.maps.android.compose.TileOverlayState.Companion INSTANCE = new com.google.maps.android.compose.TileOverlayState.Companion(null);

    /* renamed from: tileOverlay$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState tileOverlay;

    private TileOverlayState() {
        this.tileOverlay = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.maps.model.TileOverlay getTileOverlay$maps_compose_release() {
        return (com.google.android.gms.maps.model.TileOverlay) this.tileOverlay.getValue();
    }

    public final void setTileOverlay$maps_compose_release(com.google.android.gms.maps.model.TileOverlay tileOverlay) {
        this.tileOverlay.setValue(tileOverlay);
    }

    public final void clearTileCache() {
        com.google.android.gms.maps.model.TileOverlay tileOverlay$maps_compose_release = getTileOverlay$maps_compose_release();
        if (tileOverlay$maps_compose_release == null) {
            throw new java.lang.IllegalStateException("This TileOverlayState is not used in any TileOverlay".toString());
        }
        tileOverlay$maps_compose_release.clearTileCache();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/TileOverlayState$Companion;", "", "<init>", "()V", "Lcom/google/maps/android/compose/TileOverlayState;", "invoke", "()Lcom/google/maps/android/compose/TileOverlayState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.google.maps.android.compose.TileOverlayState invoke() {
            return new com.google.maps.android.compose.TileOverlayState(null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TileOverlayState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
