package com.google.maps.android.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class MapUpdaterKt$MapUpdater$1$1$1 implements kotlin.jvm.functions.Function0<com.google.maps.android.compose.MapPropertiesNode> {
    final /* synthetic */ androidx.compose.ui.unit.Density $density;
    final /* synthetic */ androidx.compose.ui.unit.LayoutDirection $layoutDirection;
    final /* synthetic */ com.google.android.gms.maps.GoogleMap $map;
    final /* synthetic */ com.google.maps.android.compose.MapUpdaterState $this_with;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final com.google.maps.android.compose.MapPropertiesNode invoke() {
        java.lang.String contentDescription = this.$this_with.getContentDescription();
        return new com.google.maps.android.compose.MapPropertiesNode(this.$map, this.$this_with.getCameraPositionState(), contentDescription, this.$density, this.$layoutDirection, this.$this_with.getContentPadding());
    }

    public MapUpdaterKt$MapUpdater$1$1$1(com.google.maps.android.compose.MapUpdaterState mapUpdaterState, com.google.android.gms.maps.GoogleMap googleMap, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.$this_with = mapUpdaterState;
        this.$map = googleMap;
        this.$density = density;
        this.$layoutDirection = layoutDirection;
    }
}
