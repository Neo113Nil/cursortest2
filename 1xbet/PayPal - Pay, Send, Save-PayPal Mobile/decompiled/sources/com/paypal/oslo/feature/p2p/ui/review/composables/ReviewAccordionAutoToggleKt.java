package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u001a7\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\u0014\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u001a\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;", "selectedPaymentType", "", "isPaymentTypeSectionExpanded", "hasUpdateReceiverAttempt", "Lkotlin/Function0;", "", "onTogglePaymentType", "HandlePaymentTypeAccordionAutoToggle", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "selectedAddressId", "noShippingSelected", "isShippingSectionExpanded", "", "backendSyncCount", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "shippingAddresses", "onToggleShipping", "HandleShippingAccordionAutoToggle", "(Ljava/lang/String;ZZILjava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "selectedPaymentMethodId", "isPaymentMethodSectionExpanded", "isPaymentMethodLoading", "onTogglePaymentMethod", "HandlePaymentMethodAccordionAutoToggle", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewAccordionAutoToggleKt {
    public static final void HandlePaymentTypeAccordionAutoToggle(final com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType, final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2115500513);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(paymentType == null ? -1 : paymentType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2115500513, i4, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.HandlePaymentTypeAccordionAutoToggle (ReviewAccordionAutoToggle.kt:46)");
            }
            int i5 = i4 & 14;
            boolean z3 = i5 == 4;
            boolean z4 = (i4 & 112) == 32;
            boolean z5 = (i4 & 896) == 256;
            boolean z6 = (i4 & 7168) == 2048;
            com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt$HandlePaymentTypeAccordionAutoToggle$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((z3 | z4 | z5) || z6) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i5;
                rememberedValue = new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt$HandlePaymentTypeAccordionAutoToggle$1$1(paymentType, z, z2, function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = i5;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(paymentType, java.lang.Boolean.valueOf(z2), (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, ((i4 >> 3) & 112) | i3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt.$r8$lambda$dUpQc8EboOfKmgDKojYgglJnoZc(com.paypal.oslo.feature.p2p.domain.model.PaymentType.this, z, z2, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void HandleShippingAccordionAutoToggle(final java.lang.String str, final boolean z, final boolean z2, final int i, final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> list, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2024794739);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2024794739, i3, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.HandleShippingAccordionAutoToggle (ReviewAccordionAutoToggle.kt:103)");
            }
            boolean z3 = (i <= 0 || list == null || (str != null || z)) ? false : true;
            boolean changed = startRestartGroup.changed(z3);
            boolean z4 = (i3 & 896) == 256;
            boolean z5 = (458752 & i3) == 131072;
            com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt$HandleShippingAccordionAutoToggle$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | z4 | z5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt$HandleShippingAccordionAutoToggle$1$1(z3, z2, function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Integer.valueOf(i), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (i3 >> 9) & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt.$r8$lambda$OkZOoWxTDlbZBwFTdMn6zlt1VuE(str, z, z2, i, list, function0, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void HandlePaymentMethodAccordionAutoToggle(final java.lang.String str, final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1934188967);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1934188967, i4, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.HandlePaymentMethodAccordionAutoToggle (ReviewAccordionAutoToggle.kt:134)");
            }
            int i5 = i4 & 14;
            boolean z3 = i5 == 4;
            boolean z4 = (i4 & 112) == 32;
            boolean z5 = (i4 & 896) == 256;
            boolean z6 = (i4 & 7168) == 2048;
            com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt$HandlePaymentMethodAccordionAutoToggle$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((z3 | z4 | z5) || z6) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i5;
                rememberedValue = new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt$HandlePaymentMethodAccordionAutoToggle$1$1(str, z, z2, function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = i5;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(str, java.lang.Boolean.valueOf(z2), (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, ((i4 >> 3) & 112) | i3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt.m17338$r8$lambda$tIJ97zONJv0LisbecsMDYkHUQY(str, z, z2, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OkZOoWxTDlbZBwFTdMn6zlt1VuE(java.lang.String str, boolean z, boolean z2, int i, java.util.List list, kotlin.jvm.functions.Function0 function0, int i2, androidx.compose.runtime.Composer composer, int i3) {
        HandleShippingAccordionAutoToggle(str, z, z2, i, list, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dUpQc8EboOfKmgDKojYgglJnoZc(com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        HandlePaymentTypeAccordionAutoToggle(paymentType, z, z2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tIJ-97zONJv0LisbecsMDYkHUQY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17338$r8$lambda$tIJ97zONJv0LisbecsMDYkHUQY(java.lang.String str, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        HandlePaymentMethodAccordionAutoToggle(str, z, z2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
