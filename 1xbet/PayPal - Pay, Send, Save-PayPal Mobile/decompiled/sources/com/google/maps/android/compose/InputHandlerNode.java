package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b.\b\u0000\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016RG\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRG\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dRG\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dRG\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dRG\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dRG\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dRG\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dRG\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dRG\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0019\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dRG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0019\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dRG\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001d"}, d2 = {"Lcom/google/maps/android/compose/InputHandlerNode;", "Lcom/google/maps/android/compose/MapNode;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Circle;", "", "onCircleClick", "Lcom/google/android/gms/maps/model/GroundOverlay;", "onGroundOverlayClick", "Lcom/google/android/gms/maps/model/Polygon;", "onPolygonClick", "Lcom/google/android/gms/maps/model/Polyline;", "onPolylineClick", "Lcom/google/android/gms/maps/model/Marker;", "", "onMarkerClick", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "onCircleClick$delegate", "Landroidx/compose/runtime/MutableState;", "getOnCircleClick", "()Lkotlin/jvm/functions/Function1;", "setOnCircleClick", "(Lkotlin/jvm/functions/Function1;)V", "onGroundOverlayClick$delegate", "getOnGroundOverlayClick", "setOnGroundOverlayClick", "onPolygonClick$delegate", "getOnPolygonClick", "setOnPolygonClick", "onPolylineClick$delegate", "getOnPolylineClick", "setOnPolylineClick", "onMarkerClick$delegate", "getOnMarkerClick", "setOnMarkerClick", "onInfoWindowClick$delegate", "getOnInfoWindowClick", "setOnInfoWindowClick", "onInfoWindowClose$delegate", "getOnInfoWindowClose", "setOnInfoWindowClose", "onInfoWindowLongClick$delegate", "getOnInfoWindowLongClick", "setOnInfoWindowLongClick", "onMarkerDrag$delegate", "getOnMarkerDrag", "setOnMarkerDrag", "onMarkerDragEnd$delegate", "getOnMarkerDragEnd", "setOnMarkerDragEnd", "onMarkerDragStart$delegate", "getOnMarkerDragStart", "setOnMarkerDragStart"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputHandlerNode implements com.google.maps.android.compose.MapNode {
    public static final int $stable = 0;

    /* renamed from: onCircleClick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onCircleClick;

    /* renamed from: onGroundOverlayClick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onGroundOverlayClick;

    /* renamed from: onInfoWindowClick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onInfoWindowClick;

    /* renamed from: onInfoWindowClose$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onInfoWindowClose;

    /* renamed from: onInfoWindowLongClick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onInfoWindowLongClick;

    /* renamed from: onMarkerClick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onMarkerClick;

    /* renamed from: onMarkerDrag$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onMarkerDrag;

    /* renamed from: onMarkerDragEnd$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onMarkerDragEnd;

    /* renamed from: onMarkerDragStart$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onMarkerDragStart;

    /* renamed from: onPolygonClick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onPolygonClick;

    /* renamed from: onPolylineClick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onPolylineClick;

    public InputHandlerNode(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Circle, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.GroundOverlay, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polygon, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polyline, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function15, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function16, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function17, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function18, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function19, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function110, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function111) {
        this.onCircleClick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function1, null, 2, null);
        this.onGroundOverlayClick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function12, null, 2, null);
        this.onPolygonClick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function13, null, 2, null);
        this.onPolylineClick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function14, null, 2, null);
        this.onMarkerClick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function15, null, 2, null);
        this.onInfoWindowClick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function16, null, 2, null);
        this.onInfoWindowClose = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function17, null, 2, null);
        this.onInfoWindowLongClick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function18, null, 2, null);
        this.onMarkerDrag = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function19, null, 2, null);
        this.onMarkerDragEnd = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function110, null, 2, null);
        this.onMarkerDragStart = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function111, null, 2, null);
    }

    public /* synthetic */ InputHandlerNode(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, kotlin.jvm.functions.Function1 function16, kotlin.jvm.functions.Function1 function17, kotlin.jvm.functions.Function1 function18, kotlin.jvm.functions.Function1 function19, kotlin.jvm.functions.Function1 function110, kotlin.jvm.functions.Function1 function111, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14, (i & 16) != 0 ? null : function15, (i & 32) != 0 ? null : function16, (i & 64) != 0 ? null : function17, (i & 128) != 0 ? null : function18, (i & 256) != 0 ? null : function19, (i & 512) != 0 ? null : function110, (i & 1024) == 0 ? function111 : null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final /* bridge */ void onAttached() {
        super.onAttached();
    }

    @Override // com.google.maps.android.compose.MapNode
    public final /* bridge */ void onCleared() {
        super.onCleared();
    }

    @Override // com.google.maps.android.compose.MapNode
    public final /* bridge */ void onRemoved() {
        super.onRemoved();
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Circle, kotlin.Unit> getOnCircleClick() {
        return (kotlin.jvm.functions.Function1) this.onCircleClick.getValue();
    }

    public final void setOnCircleClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Circle, kotlin.Unit> function1) {
        this.onCircleClick.setValue(function1);
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.GroundOverlay, kotlin.Unit> getOnGroundOverlayClick() {
        return (kotlin.jvm.functions.Function1) this.onGroundOverlayClick.getValue();
    }

    public final void setOnGroundOverlayClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.GroundOverlay, kotlin.Unit> function1) {
        this.onGroundOverlayClick.setValue(function1);
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Polygon, kotlin.Unit> getOnPolygonClick() {
        return (kotlin.jvm.functions.Function1) this.onPolygonClick.getValue();
    }

    public final void setOnPolygonClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polygon, kotlin.Unit> function1) {
        this.onPolygonClick.setValue(function1);
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Polyline, kotlin.Unit> getOnPolylineClick() {
        return (kotlin.jvm.functions.Function1) this.onPolylineClick.getValue();
    }

    public final void setOnPolylineClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polyline, kotlin.Unit> function1) {
        this.onPolylineClick.setValue(function1);
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, java.lang.Boolean> getOnMarkerClick() {
        return (kotlin.jvm.functions.Function1) this.onMarkerClick.getValue();
    }

    public final void setOnMarkerClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1) {
        this.onMarkerClick.setValue(function1);
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> getOnInfoWindowClick() {
        return (kotlin.jvm.functions.Function1) this.onInfoWindowClick.getValue();
    }

    public final void setOnInfoWindowClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function1) {
        this.onInfoWindowClick.setValue(function1);
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> getOnInfoWindowClose() {
        return (kotlin.jvm.functions.Function1) this.onInfoWindowClose.getValue();
    }

    public final void setOnInfoWindowClose(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function1) {
        this.onInfoWindowClose.setValue(function1);
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> getOnInfoWindowLongClick() {
        return (kotlin.jvm.functions.Function1) this.onInfoWindowLongClick.getValue();
    }

    public final void setOnInfoWindowLongClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function1) {
        this.onInfoWindowLongClick.setValue(function1);
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> getOnMarkerDrag() {
        return (kotlin.jvm.functions.Function1) this.onMarkerDrag.getValue();
    }

    public final void setOnMarkerDrag(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function1) {
        this.onMarkerDrag.setValue(function1);
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> getOnMarkerDragEnd() {
        return (kotlin.jvm.functions.Function1) this.onMarkerDragEnd.getValue();
    }

    public final void setOnMarkerDragEnd(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function1) {
        this.onMarkerDragEnd.setValue(function1);
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Marker, kotlin.Unit> getOnMarkerDragStart() {
        return (kotlin.jvm.functions.Function1) this.onMarkerDragStart.getValue();
    }

    public final void setOnMarkerDragStart(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function1) {
        this.onMarkerDragStart.setValue(function1);
    }

    public InputHandlerNode() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
