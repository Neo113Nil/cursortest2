package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"L0VisibilityTrackingEffect", "", "isL0Visible", "", "l1Expanded", "l0Entry", "Landroidx/navigation3/runtime/NavEntry;", "Landroidx/navigation3/runtime/NavKey;", "l1Entry", "(ZZLandroidx/navigation3/runtime/NavEntry;Landroidx/navigation3/runtime/NavEntry;Landroidx/compose/runtime/Composer;I)V", "telemetry_release", "l0ShownAtLeastOnce"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L0VisibilityTrackingEffectKt {
    public static final void L0VisibilityTrackingEffect(final boolean z, final boolean z2, final androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> navEntry, final androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> navEntry2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1400674597);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(navEntry) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(navEntry2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1400674597, i2, -1, "com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffect (L0VisibilityTrackingEffect.kt:80)");
            }
            com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker = (com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker) startRestartGroup.consume(com.paypal.oslo.core.telemetry.compose.LocalNav3ViewTrackerKt.getLocalNav3ViewTracker());
            if (nav3ViewTracker != null) {
                java.lang.Object obj = navEntry.getMetadata().get(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.MetadataNavKey);
                androidx.navigation3.runtime.NavKey navKey = obj instanceof androidx.navigation3.runtime.NavKey ? (androidx.navigation3.runtime.NavKey) obj : null;
                java.lang.Object obj2 = navEntry2.getMetadata().get(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.MetadataNavKey);
                androidx.navigation3.runtime.NavKey navKey2 = obj2 instanceof androidx.navigation3.runtime.NavKey ? (androidx.navigation3.runtime.NavKey) obj2 : null;
                if (navKey == null || navKey2 == null) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    } else {
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffectKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                                return com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffectKt.$r8$lambda$sY_ZSUS7AI_Fpx2PIKAZms8J7CQ(z, z2, navEntry, navEntry2, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                            }
                        };
                    }
                } else {
                    boolean changed = startRestartGroup.changed(navKey);
                    boolean changed2 = startRestartGroup.changed(navKey2);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    int i4 = i2 & 112;
                    boolean z3 = i4 == 32;
                    boolean changed3 = startRestartGroup.changed(mutableState);
                    com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffectKt$L0VisibilityTrackingEffect$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z3 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffectKt$L0VisibilityTrackingEffect$2$1(z2, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i2 >> 3) & 14);
                    boolean z4 = i4 == 32;
                    int i5 = i2 & 14;
                    boolean z5 = i5 == 4;
                    boolean changed4 = startRestartGroup.changed(mutableState);
                    boolean changed5 = startRestartGroup.changed(nav3ViewTracker);
                    boolean changedInstance = startRestartGroup.changedInstance(navKey);
                    boolean changedInstance2 = startRestartGroup.changedInstance(navKey2);
                    com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffectKt$L0VisibilityTrackingEffect$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if (((z4 | z5 | changed4 | changed5 | changedInstance) || changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i3 = i5;
                        rememberedValue3 = new com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffectKt$L0VisibilityTrackingEffect$3$1(z2, z, nav3ViewTracker, navKey, navKey2, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    } else {
                        i3 = i5;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, i3);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                } else {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffectKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffectKt.m11692$r8$lambda$tMB6xuY3azkvuChAkW7shBGpEg(z, z2, navEntry, navEntry2, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    };
                }
            }
            endRestartGroup.updateScope(function2);
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffectKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.core.telemetry.compose.L0VisibilityTrackingEffectKt.$r8$lambda$uU9wWLZR4jsovpj7k03OlwLm6Vo(z, z2, navEntry, navEntry2, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sY_ZSUS7AI_Fpx2PIKAZms8J7CQ(boolean z, boolean z2, androidx.navigation3.runtime.NavEntry navEntry, androidx.navigation3.runtime.NavEntry navEntry2, int i, androidx.compose.runtime.Composer composer, int i2) {
        L0VisibilityTrackingEffect(z, z2, navEntry, navEntry2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tMB6xuY3azkvuChAkW7shB-GpEg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11692$r8$lambda$tMB6xuY3azkvuChAkW7shBGpEg(boolean z, boolean z2, androidx.navigation3.runtime.NavEntry navEntry, androidx.navigation3.runtime.NavEntry navEntry2, int i, androidx.compose.runtime.Composer composer, int i2) {
        L0VisibilityTrackingEffect(z, z2, navEntry, navEntry2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uU9wWLZR4jsovpj7k03OlwLm6Vo(boolean z, boolean z2, androidx.navigation3.runtime.NavEntry navEntry, androidx.navigation3.runtime.NavEntry navEntry2, int i, androidx.compose.runtime.Composer composer, int i2) {
        L0VisibilityTrackingEffect(z, z2, navEntry, navEntry2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
