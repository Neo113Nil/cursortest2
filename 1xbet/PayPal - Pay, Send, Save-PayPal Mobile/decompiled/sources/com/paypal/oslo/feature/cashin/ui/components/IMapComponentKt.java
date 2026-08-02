package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009f\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"RenderMap", "", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lcom/paypal/oslo/feature/cashin/ui/components/IMapComponent;", "locations", "", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "markerUtils", "Lcom/paypal/oslo/feature/cashin/ui/utils/MarkerUtils;", "userLocation", "onLocationSelect", "Lkotlin/Function1;", "onSelectStore", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "selectedLocation", "onSearch", "", "onDismissSelection", "searchResult", "Lcom/google/android/gms/maps/model/LatLng;", "(Lcom/paypal/oslo/feature/cashin/ui/components/IMapComponent;Ljava/util/List;Lcom/paypal/oslo/feature/cashin/ui/utils/MarkerUtils;Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/google/android/gms/maps/model/LatLng;Landroidx/compose/runtime/Composer;III)V", "cash-in_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IMapComponentKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderMap(final com.paypal.oslo.feature.cashin.ui.components.IMapComponent iMapComponent, final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> list, final com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils, final com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore2, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function02, com.google.android.gms.maps.model.LatLng latLng, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        com.google.android.gms.maps.model.LatLng latLng2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iMapComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerUtils, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2134082183);
        if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(iMapComponent) : startRestartGroup.changedInstance(iMapComponent) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(markerUtils) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(cashInStore) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changed(cashInStore2) ? 8388608 : 4194304;
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
            }
            i7 = i3 & 512;
            if (i7 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changedInstance(function02) ? 536870912 : 268435456;
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
                i10 = i2 | 6;
            } else {
                if ((i2 & 6) != 0) {
                    i9 = i2;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        cashInStore3 = cashInStore2;
                        function13 = function12;
                        function03 = function02;
                        latLng2 = latLng;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore4 = i5 != 0 ? null : cashInStore2;
                        if (i6 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.components.IMapComponentKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.cashin.ui.components.IMapComponentKt.m13439$r8$lambda$stJ9bVR4bbHXcOifqIWtCQn6sM((java.lang.String) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                        } else {
                            function14 = function12;
                        }
                        if (i7 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.components.IMapComponentKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        } else {
                            function04 = function02;
                        }
                        latLng2 = i8 != 0 ? null : latLng;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(2134082183, i4, i9, "com.paypal.oslo.feature.cashin.ui.components.RenderMap (IMapComponent.kt:82)");
                        }
                        composer2 = startRestartGroup;
                        iMapComponent.provideMapContent(cashInStore, list, function1, function0, markerUtils, modifier3, cashInStore4, function14, function04, latLng2).invoke(composer2, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        cashInStore3 = cashInStore4;
                        function13 = function14;
                        function03 = function04;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        final com.google.android.gms.maps.model.LatLng latLng3 = latLng2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.IMapComponentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.cashin.ui.components.IMapComponentKt.$r8$lambda$AQuMykOVE3Sc_WDCBh0m1zTldYY(com.paypal.oslo.feature.cashin.ui.components.IMapComponent.this, list, markerUtils, cashInStore, function1, function0, modifier2, cashInStore3, function13, function03, latLng3, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i10 = i2 | (startRestartGroup.changedInstance(latLng) ? 4 : 2);
            }
            i9 = i10;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        i9 = i10;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AQuMykOVE3Sc_WDCBh0m1zTldYY(com.paypal.oslo.feature.cashin.ui.components.IMapComponent iMapComponent, java.util.List list, com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore2, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function02, com.google.android.gms.maps.model.LatLng latLng, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        RenderMap(iMapComponent, list, markerUtils, cashInStore, function1, function0, modifier, cashInStore2, function12, function02, latLng, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$stJ9bVR4bbH-XcOifqIWtCQn6sM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13439$r8$lambda$stJ9bVR4bbHXcOifqIWtCQn6sM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
