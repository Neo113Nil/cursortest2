package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u009a\u0001\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/components/DefaultMapComponent;", "Lcom/paypal/oslo/feature/cashin/ui/components/IMapComponent;", "<init>", "()V", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "userLocation", "", "locations", "Lkotlin/Function1;", "", "onLocationSelect", "Lkotlin/Function0;", "onSelectStore", "Lcom/paypal/oslo/feature/cashin/ui/utils/MarkerUtils;", "markerUtils", "Landroidx/compose/ui/Modifier;", "modifier", "selectedLocation", "", "onSearch", "onDismissSelection", "Lcom/google/android/gms/maps/model/LatLng;", "searchResult", "Landroidx/compose/runtime/Composable;", "provideMapContent", "(Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/cashin/ui/utils/MarkerUtils;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/google/android/gms/maps/model/LatLng;)Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DefaultMapComponent implements com.paypal.oslo.feature.cashin.ui.components.IMapComponent {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DefaultMapComponent() {
    }

    @Override // com.paypal.oslo.feature.cashin.ui.components.IMapComponent
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> provideMapContent(final com.paypal.oslo.feature.cashin.domain.model.CashInStore userLocation, final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> locations, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore, kotlin.Unit> onLocationSelect, final kotlin.jvm.functions.Function0<kotlin.Unit> onSelectStore, final com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils, final androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.cashin.domain.model.CashInStore selectedLocation, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearch, final kotlin.jvm.functions.Function0<kotlin.Unit> onDismissSelection, final com.google.android.gms.maps.model.LatLng searchResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLocationSelect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSelectStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerUtils, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSearch, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDismissSelection, "");
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1130276703, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent.$r8$lambda$coQIdmbf8NVgipPB53ayVXkpBAw(locations, markerUtils, userLocation, onLocationSelect, onSelectStore, modifier, selectedLocation, onSearch, onDismissSelection, searchResult, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$coQIdmbf8NVgipPB53ayVXkpBAw(java.util.List list, com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore2, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function02, com.google.android.gms.maps.model.LatLng latLng, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1130276703, i, -1, "com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent.provideMapContent.<anonymous> (DefaultMapComponent.kt:38)");
            }
            com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt.CashInMapView(list, markerUtils, cashInStore, function1, function0, modifier, cashInStore2, function12, function02, latLng, null, composer, 0, 0, 1024);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
