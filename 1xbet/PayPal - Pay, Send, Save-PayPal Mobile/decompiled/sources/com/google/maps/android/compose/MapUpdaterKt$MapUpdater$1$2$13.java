package com.google.maps.android.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class MapUpdaterKt$MapUpdater$1$2$13 implements kotlin.jvm.functions.Function2<com.google.maps.android.compose.MapPropertiesNode, java.lang.Float, kotlin.Unit> {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap $map;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode, java.lang.Float f) {
        invoke(mapPropertiesNode, f.floatValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapPropertiesNode, "");
        this.$map.setMaxZoomPreference(f);
    }

    public MapUpdaterKt$MapUpdater$1$2$13(com.google.android.gms.maps.GoogleMap googleMap) {
        this.$map = googleMap;
    }
}
