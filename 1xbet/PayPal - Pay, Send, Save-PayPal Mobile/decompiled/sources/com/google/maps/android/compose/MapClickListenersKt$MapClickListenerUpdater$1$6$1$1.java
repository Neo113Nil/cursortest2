package com.google.maps.android.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class MapClickListenersKt$MapClickListenerUpdater$1$6$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.google.android.gms.maps.GoogleMap, com.google.android.gms.maps.GoogleMap.OnMapLongClickListener, kotlin.Unit> {
    public static final com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$6$1$1 INSTANCE = new com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$6$1$1();

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        invoke2(googleMap, onMapLongClickListener);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        googleMap.setOnMapLongClickListener(onMapLongClickListener);
    }

    MapClickListenersKt$MapClickListenerUpdater$1$6$1$1() {
        super(2, com.google.android.gms.maps.GoogleMap.class, "setOnMapLongClickListener", "setOnMapLongClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;)V", 0);
    }
}
