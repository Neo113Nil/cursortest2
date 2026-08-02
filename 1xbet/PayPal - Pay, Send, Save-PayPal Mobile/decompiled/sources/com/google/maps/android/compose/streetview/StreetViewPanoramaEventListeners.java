package com.google.maps.android.compose.streetview;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003RC\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rRC\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "", "<set-?>", "onClick$delegate", "Landroidx/compose/runtime/MutableState;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "setOnClick", "(Lkotlin/jvm/functions/Function1;)V", "onClick", "onLongClick$delegate", "getOnLongClick", "setOnLongClick", "onLongClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StreetViewPanoramaEventListeners {
    public static final int $stable = 0;

    /* renamed from: onClick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onClick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit onClick_delegate$lambda$0;
            onClick_delegate$lambda$0 = com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners.onClick_delegate$lambda$0((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) obj);
            return onClick_delegate$lambda$0;
        }
    }, null, 2, null);

    /* renamed from: onLongClick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState onLongClick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit onLongClick_delegate$lambda$0;
            onLongClick_delegate$lambda$0 = com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners.onLongClick_delegate$lambda$0((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) obj);
            return onLongClick_delegate$lambda$0;
        }
    }, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onClick_delegate$lambda$0(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaOrientation, "");
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.StreetViewPanoramaOrientation, kotlin.Unit> getOnClick() {
        return (kotlin.jvm.functions.Function1) this.onClick.getValue();
    }

    public final void setOnClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.StreetViewPanoramaOrientation, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onClick.setValue(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onLongClick_delegate$lambda$0(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanoramaOrientation, "");
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.StreetViewPanoramaOrientation, kotlin.Unit> getOnLongClick() {
        return (kotlin.jvm.functions.Function1) this.onLongClick.getValue();
    }

    public final void setOnLongClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.StreetViewPanoramaOrientation, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onLongClick.setValue(function1);
    }
}
