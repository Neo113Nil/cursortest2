package com.google.maps.android.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class GoogleMapKt$GoogleMap$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<android.content.Context, com.google.android.gms.maps.GoogleMapOptions, com.google.android.gms.maps.MapView> {
    public static final com.google.maps.android.compose.GoogleMapKt$GoogleMap$2$1 INSTANCE = new com.google.maps.android.compose.GoogleMapKt$GoogleMap$2$1();

    @Override // kotlin.jvm.functions.Function2
    public final com.google.android.gms.maps.MapView invoke(android.content.Context context, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.google.android.gms.maps.MapView(context, googleMapOptions);
    }

    GoogleMapKt$GoogleMap$2$1() {
        super(2, com.google.android.gms.maps.MapView.class, "<init>", "<init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V", 0);
    }
}
