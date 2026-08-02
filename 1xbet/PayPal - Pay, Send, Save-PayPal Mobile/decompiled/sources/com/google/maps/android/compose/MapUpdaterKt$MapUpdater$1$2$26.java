package com.google.maps.android.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class MapUpdaterKt$MapUpdater$1$2$26 implements kotlin.jvm.functions.Function2<com.google.maps.android.compose.MapPropertiesNode, com.google.maps.android.compose.CameraPositionState, kotlin.Unit> {
    public static final com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$26 INSTANCE = new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$26();

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode, com.google.maps.android.compose.CameraPositionState cameraPositionState) {
        invoke2(mapPropertiesNode, cameraPositionState);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.google.maps.android.compose.MapPropertiesNode mapPropertiesNode, com.google.maps.android.compose.CameraPositionState cameraPositionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapPropertiesNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPositionState, "");
        mapPropertiesNode.setCameraPositionState(cameraPositionState);
    }
}
