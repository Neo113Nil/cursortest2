package androidx.compose.foundation.text.selection;

/* compiled from: SelectionManager.android.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionManager_androidKt$selectionMagnifier$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier> {
    final /* synthetic */ androidx.compose.foundation.text.selection.SelectionManager $manager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager_androidKt$selectionMagnifier$1(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        super(3);
        this.$manager = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1914520728);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C45@1920L7,46@1957L41:SelectionManager.android.kt#eksfi3");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1914520728, i, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:45)");
        }
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localDensity);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        final androidx.compose.foundation.text.selection.SelectionManager selectionManager = this.$manager;
        kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset> function0 = new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke() {
                return androidx.compose.ui.geometry.Offset.m1860boximpl(m1058invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m1058invokeF1C5BW0() {
                return androidx.compose.foundation.text.selection.SelectionManagerKt.m1054calculateSelectionMagnifierCenterAndroidO0kMr_c(androidx.compose.foundation.text.selection.SelectionManager.this, androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1.invoke$lambda$1(mutableState));
            }
        };
        composer.startReplaceableGroup(-1347892975);
        boolean changed = composer.changed(mutableState) | composer.changed(density);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<? extends androidx.compose.ui.geometry.Offset>, androidx.compose.ui.Modifier>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(kotlin.jvm.functions.Function0<? extends androidx.compose.ui.geometry.Offset> function02) {
                    return invoke2((kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>) function02);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final androidx.compose.ui.Modifier invoke2(final kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset> function02) {
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke(androidx.compose.ui.unit.Density density2) {
                            return androidx.compose.ui.geometry.Offset.m1860boximpl(m1059invoketuRUvjQ(density2));
                        }

                        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                        public final long m1059invoketuRUvjQ(androidx.compose.ui.unit.Density density2) {
                            return function02.invoke().getPackedValue();
                        }
                    };
                    final androidx.compose.ui.unit.Density density2 = androidx.compose.ui.unit.Density.this;
                    final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> mutableState2 = mutableState;
                    return androidx.compose.foundation.Magnifier_androidKt.m283magnifierjPUL71Q$default(companion, function1, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.DpSize, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.DpSize dpSize) {
                            m1060invokeEaSLcWc(dpSize.getPackedValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke-EaSLcWc, reason: not valid java name */
                        public final void m1060invokeEaSLcWc(long j) {
                            androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> mutableState3 = mutableState2;
                            androidx.compose.ui.unit.Density density3 = androidx.compose.ui.unit.Density.this;
                            androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1.invoke$lambda$2(mutableState3, androidx.compose.ui.unit.IntSizeKt.IntSize(density3.mo309roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(j)), density3.mo309roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j))));
                        }
                    }, 0.0f, true, 0L, 0.0f, 0.0f, false, androidx.compose.foundation.PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform(), 490, null);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.ui.Modifier animatedSelectionMagnifier = androidx.compose.foundation.text.selection.SelectionMagnifierKt.animatedSelectionMagnifier(modifier, function0, (kotlin.jvm.functions.Function1) rememberedValue2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animatedSelectionMagnifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$1(androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> mutableState, long j) {
        mutableState.setValue(androidx.compose.ui.unit.IntSize.m4644boximpl(j));
    }
}
