package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/google/maps/android/compose/TileOverlayNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/model/TileOverlay;", "tileOverlay", "Lcom/google/maps/android/compose/TileOverlayState;", "tileOverlayState", "Lkotlin/Function1;", "", "onTileOverlayClick", "<init>", "(Lcom/google/android/gms/maps/model/TileOverlay;Lcom/google/maps/android/compose/TileOverlayState;Lkotlin/jvm/functions/Function1;)V", "onAttached", "()V", "onRemoved", "Lcom/google/android/gms/maps/model/TileOverlay;", "getTileOverlay", "()Lcom/google/android/gms/maps/model/TileOverlay;", "setTileOverlay", "(Lcom/google/android/gms/maps/model/TileOverlay;)V", "Lcom/google/maps/android/compose/TileOverlayState;", "getTileOverlayState", "()Lcom/google/maps/android/compose/TileOverlayState;", "setTileOverlayState", "(Lcom/google/maps/android/compose/TileOverlayState;)V", "Lkotlin/jvm/functions/Function1;", "getOnTileOverlayClick", "()Lkotlin/jvm/functions/Function1;", "setOnTileOverlayClick", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
final class TileOverlayNode implements com.google.maps.android.compose.MapNode {
    private kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit> onTileOverlayClick;
    private com.google.android.gms.maps.model.TileOverlay tileOverlay;
    private com.google.maps.android.compose.TileOverlayState tileOverlayState;

    public TileOverlayNode(com.google.android.gms.maps.model.TileOverlay tileOverlay, com.google.maps.android.compose.TileOverlayState tileOverlayState, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlay, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlayState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.tileOverlay = tileOverlay;
        this.tileOverlayState = tileOverlayState;
        this.onTileOverlayClick = function1;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final /* bridge */ void onCleared() {
        super.onCleared();
    }

    public final com.google.android.gms.maps.model.TileOverlay getTileOverlay() {
        return this.tileOverlay;
    }

    public final void setTileOverlay(com.google.android.gms.maps.model.TileOverlay tileOverlay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlay, "");
        this.tileOverlay = tileOverlay;
    }

    public final com.google.maps.android.compose.TileOverlayState getTileOverlayState() {
        return this.tileOverlayState;
    }

    public final void setTileOverlayState(com.google.maps.android.compose.TileOverlayState tileOverlayState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlayState, "");
        this.tileOverlayState = tileOverlayState;
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.TileOverlay, kotlin.Unit> getOnTileOverlayClick() {
        return this.onTileOverlayClick;
    }

    public final void setOnTileOverlayClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onTileOverlayClick = function1;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onAttached() {
        this.tileOverlayState.setTileOverlay$maps_compose_release(this.tileOverlay);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        this.tileOverlay.remove();
    }
}
