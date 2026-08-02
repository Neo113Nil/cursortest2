package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TimePickerKt$ClockFace$1 implements kotlin.jvm.functions.Function3<androidx.collection.IntList, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.material3.TimePickerColors getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.AnalogTimePickerState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(androidx.collection.IntList intList, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        float f;
        final androidx.collection.IntList intList2 = intList;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(747010833, intValue, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1609)");
        }
        androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.m5106getClockDialContainerSizeD9Ej5fM());
        java.lang.Object rememberedValue = composer2.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.TimePickerKt$ClockFace$1.Camera2StreamConfigurationMap((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1740size3ABfNKs, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
        f = androidx.compose.material3.TimePickerKt.getOutputStallDuration;
        final androidx.compose.material3.TimePickerColors timePickerColors = this.getHighSpeedVideoFpsRanges;
        final androidx.compose.material3.AnalogTimePickerState analogTimePickerState = this.getHighSpeedVideoFpsRangesFor;
        final boolean z = this.getHighSpeedVideoSizes;
        androidx.compose.material3.TimePickerKt.getHighSpeedVideoFpsRangesFor(semantics$default, f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-99063847, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1.2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                androidx.compose.runtime.Composer composer4 = composer3;
                int intValue2 = num2.intValue();
                if (!composer4.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer4.skipToGroupEnd();
                } else {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-99063847, intValue2, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1613)");
                    }
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.material3.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.material3.TimePickerColors.this.m3989clockDialContentColorvNxB06k$material3(false))), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-596940007, true, new androidx.compose.material3.TimePickerKt$ClockFace$1.AnonymousClass2.AnonymousClass1(intList2, analogTimePickerState, z), composer4, 54), composer4, androidx.compose.runtime.ProvidedValue.$stable | 48);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                final /* synthetic */ androidx.compose.material3.AnalogTimePickerState getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
                final /* synthetic */ androidx.collection.IntList getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    float f;
                    int i;
                    androidx.compose.runtime.Composer composer2 = composer;
                    int intValue = num.intValue();
                    if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-596940007, intValue, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1616)");
                        }
                        composer2.startReplaceGroup(1866272144);
                        int i2 = this.getHighSpeedVideoSizes._size;
                        androidx.compose.material3.AnalogTimePickerState analogTimePickerState = this.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.collection.IntList intList = this.getHighSpeedVideoSizes;
                        boolean z = this.getHighSpeedVideoFpsRanges;
                        for (final int i3 = 0; i3 < i2; i3++) {
                            if (!analogTimePickerState.getGetHighSpeedVideoSizes() || androidx.compose.material3.TimePickerSelectionMode.m4054equalsimpl0(analogTimePickerState.mo2876getSelectionyecRtBI(), androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4059getMinuteyecRtBI())) {
                                i = intList.get(i3);
                            } else {
                                i = intList.get(i3) % 12;
                            }
                            int i4 = i;
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                            boolean changed = composer2.changed(i3);
                            java.lang.Object rememberedValue = composer2.rememberedValue();
                            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material3.TimePickerKt$ClockFace$1.AnonymousClass2.AnonymousClass1.getHighSpeedVideoFpsRanges(i3, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.material3.TimePickerKt.getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), analogTimePickerState, i4, z, composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        if (androidx.compose.material3.TimePickerSelectionMode.m4054equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI.mo2876getSelectionyecRtBI(), androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4058getHouryecRtBI()) && this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoSizes()) {
                            composer2.startReplaceGroup(2020585964);
                            androidx.compose.ui.Modifier m1285backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m1285backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.LayoutId.Camera2StreamConfigurationMap), androidx.compose.material3.tokens.TimePickerTokens.INSTANCE.m5106getClockDialContainerSizeD9Ej5fM()), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                            f = androidx.compose.material3.TimePickerKt.getHighSpeedVideoSizesFor;
                            androidx.compose.material3.TimePickerKt.getHighSpeedVideoFpsRangesFor(m1285backgroundbw27NRU, f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1385767514, true, new androidx.compose.material3.TimePickerKt$ClockFace$1.AnonymousClass2.AnonymousClass1.C00312(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges), composer2, 54), composer2, 432, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(2021505641);
                            composer2.endReplaceGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2, reason: invalid class name and collision with other inner class name */
                static final class C00312 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
                    final /* synthetic */ androidx.compose.material3.AnalogTimePickerState getHighSpeedVideoSizes;

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                        androidx.collection.IntList intList;
                        androidx.collection.IntList intList2;
                        androidx.compose.runtime.Composer composer2 = composer;
                        int intValue = num.intValue();
                        if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1385767514, intValue, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1639)");
                            }
                            intList = androidx.compose.material3.TimePickerKt.getOutputMinFrameDuration;
                            int i = intList._size;
                            androidx.compose.material3.AnalogTimePickerState analogTimePickerState = this.getHighSpeedVideoSizes;
                            boolean z = this.getHighSpeedVideoFpsRanges;
                            for (final int i2 = 0; i2 < i; i2++) {
                                intList2 = androidx.compose.material3.TimePickerKt.getOutputMinFrameDuration;
                                int i3 = intList2.get(i2);
                                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                                boolean changed = composer2.changed(i2);
                                java.lang.Object rememberedValue = composer2.rememberedValue();
                                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return androidx.compose.material3.TimePickerKt$ClockFace$1.AnonymousClass2.AnonymousClass1.C00312.getHighResolutionOutputSizeshNQ4ISI(i2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue);
                                }
                                androidx.compose.material3.TimePickerKt.getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), analogTimePickerState, i3, z, composer2, 0);
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(int i, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i + 12.0f);
                        return kotlin.Unit.INSTANCE;
                    }

                    C00312(androidx.compose.material3.AnalogTimePickerState analogTimePickerState, boolean z) {
                        this.getHighSpeedVideoSizes = analogTimePickerState;
                        this.getHighSpeedVideoFpsRanges = z;
                    }
                }

                public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(int i, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i + 1.0f);
                    return kotlin.Unit.INSTANCE;
                }

                AnonymousClass1(androidx.collection.IntList intList, androidx.compose.material3.AnalogTimePickerState analogTimePickerState, boolean z) {
                    this.getHighSpeedVideoSizes = intList;
                    this.getHighResolutionOutputSizeshNQ4ISI = analogTimePickerState;
                    this.getHighSpeedVideoFpsRanges = z;
                }
            }
        }, composer2, 54), composer2, 432, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    TimePickerKt$ClockFace$1(androidx.compose.material3.TimePickerColors timePickerColors, androidx.compose.material3.AnalogTimePickerState analogTimePickerState, boolean z) {
        this.getHighSpeedVideoFpsRanges = timePickerColors;
        this.getHighSpeedVideoFpsRangesFor = analogTimePickerState;
        this.getHighSpeedVideoSizes = z;
    }
}
