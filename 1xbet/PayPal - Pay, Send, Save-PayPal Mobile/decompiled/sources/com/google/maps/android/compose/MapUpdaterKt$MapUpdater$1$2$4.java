package com.google.maps.android.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class MapUpdaterKt$MapUpdater$1$2$4 implements kotlin.jvm.functions.Function2<com.google.maps.android.compose.MapPropertiesNode, androidx.compose.foundation.layout.PaddingValues, kotlin.Unit> {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap $map;

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        invoke2(mapPropertiesNode, paddingValues);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapPropertiesNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "");
        com.google.maps.android.compose.MapUpdaterKt.applyContentPadding(mapPropertiesNode, this.$map, paddingValues);
    }

    public MapUpdaterKt$MapUpdater$1$2$4(com.google.android.gms.maps.GoogleMap googleMap) {
        this.$map = googleMap;
    }
}
