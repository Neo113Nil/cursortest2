package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/google/maps/android/compose/PolygonNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/model/Polygon;", "polygon", "Lkotlin/Function1;", "", "onPolygonClick", "<init>", "(Lcom/google/android/gms/maps/model/Polygon;Lkotlin/jvm/functions/Function1;)V", "onRemoved", "()V", "Lcom/google/android/gms/maps/model/Polygon;", "getPolygon", "()Lcom/google/android/gms/maps/model/Polygon;", "Lkotlin/jvm/functions/Function1;", "getOnPolygonClick", "()Lkotlin/jvm/functions/Function1;", "setOnPolygonClick", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PolygonNode implements com.google.maps.android.compose.MapNode {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polygon, kotlin.Unit> onPolygonClick;
    private final com.google.android.gms.maps.model.Polygon polygon;

    public PolygonNode(com.google.android.gms.maps.model.Polygon polygon, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polygon, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polygon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.polygon = polygon;
        this.onPolygonClick = function1;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final /* bridge */ void onAttached() {
        super.onAttached();
    }

    @Override // com.google.maps.android.compose.MapNode
    public final /* bridge */ void onCleared() {
        super.onCleared();
    }

    public final com.google.android.gms.maps.model.Polygon getPolygon() {
        return this.polygon;
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Polygon, kotlin.Unit> getOnPolygonClick() {
        return this.onPolygonClick;
    }

    public final void setOnPolygonClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polygon, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onPolygonClick = function1;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        this.polygon.remove();
    }
}
