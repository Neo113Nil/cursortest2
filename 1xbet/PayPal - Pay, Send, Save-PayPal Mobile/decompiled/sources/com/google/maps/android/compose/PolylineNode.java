package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/google/maps/android/compose/PolylineNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/model/Polyline;", "polyline", "Lkotlin/Function1;", "", "onPolylineClick", "<init>", "(Lcom/google/android/gms/maps/model/Polyline;Lkotlin/jvm/functions/Function1;)V", "onRemoved", "()V", "Lcom/google/android/gms/maps/model/Polyline;", "getPolyline", "()Lcom/google/android/gms/maps/model/Polyline;", "Lkotlin/jvm/functions/Function1;", "getOnPolylineClick", "()Lkotlin/jvm/functions/Function1;", "setOnPolylineClick", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PolylineNode implements com.google.maps.android.compose.MapNode {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polyline, kotlin.Unit> onPolylineClick;
    private final com.google.android.gms.maps.model.Polyline polyline;

    public PolylineNode(com.google.android.gms.maps.model.Polyline polyline, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polyline, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polyline, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.polyline = polyline;
        this.onPolylineClick = function1;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final /* bridge */ void onAttached() {
        super.onAttached();
    }

    @Override // com.google.maps.android.compose.MapNode
    public final /* bridge */ void onCleared() {
        super.onCleared();
    }

    public final com.google.android.gms.maps.model.Polyline getPolyline() {
        return this.polyline;
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Polyline, kotlin.Unit> getOnPolylineClick() {
        return this.onPolylineClick;
    }

    public final void setOnPolylineClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polyline, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onPolylineClick = function1;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        this.polyline.remove();
    }
}
