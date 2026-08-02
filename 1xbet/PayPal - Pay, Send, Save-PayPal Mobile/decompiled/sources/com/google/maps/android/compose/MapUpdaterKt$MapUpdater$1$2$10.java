package com.google.maps.android.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class MapUpdaterKt$MapUpdater$1$2$10 implements kotlin.jvm.functions.Function2<com.google.maps.android.compose.MapPropertiesNode, com.google.android.gms.maps.model.LatLngBounds, kotlin.Unit> {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap $map;

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode, com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        invoke2(mapPropertiesNode, latLngBounds);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode, com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapPropertiesNode, "");
        this.$map.setLatLngBoundsForCameraTarget(latLngBounds);
    }

    public MapUpdaterKt$MapUpdater$1$2$10(com.google.android.gms.maps.GoogleMap googleMap) {
        this.$map = googleMap;
    }
}
