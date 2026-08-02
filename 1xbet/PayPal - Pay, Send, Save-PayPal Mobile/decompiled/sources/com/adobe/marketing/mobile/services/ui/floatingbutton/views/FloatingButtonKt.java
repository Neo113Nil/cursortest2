package com.adobe.marketing.mobile.services.ui.floatingbutton.views;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"FloatingButton", "", "settings", "Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings;", "graphic", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/ImageBitmap;", "offset", "Landroidx/compose/ui/geometry/Offset;", "onClick", "Lkotlin/Function0;", "onDragFinished", "Lkotlin/Function1;", "FloatingButton-Su4bsnU", "(Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings;Landroidx/compose/runtime/State;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class FloatingButtonKt {
    /* renamed from: FloatingButton-Su4bsnU, reason: not valid java name */
    public static final void m9885FloatingButtonSu4bsnU(final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings floatingButtonSettings, final androidx.compose.runtime.State<? extends androidx.compose.ui.graphics.ImageBitmap> state, long j, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        long j2;
        androidx.compose.ui.Modifier then;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(floatingButtonSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1368059556);
        long m5767getUnspecifiedF1C5BW0 = (i2 & 4) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0() : j;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1368059556, i, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButton (FloatingButton.kt:52)");
        }
        androidx.compose.runtime.MutableState mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(((android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp)), null, 2, null);
        androidx.compose.runtime.MutableState mutableStateOf$default2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(((android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp)), null, 2, null);
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(floatingButtonSettings.getHeight()));
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        float m8615unboximpl = ((androidx.compose.ui.unit.Dp) rememberedValue).m8615unboximpl();
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(floatingButtonSettings.getWidth()));
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        float m8615unboximpl2 = ((androidx.compose.ui.unit.Dp) rememberedValue2).m8615unboximpl();
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f));
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        float m8615unboximpl3 = ((androidx.compose.ui.unit.Dp) rememberedValue3).m8615unboximpl();
        startRestartGroup.startReplaceableGroup(1952321679);
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = java.lang.Float.valueOf(density.mo1418toPx0680j_4(((androidx.compose.ui.unit.Dp) mutableStateOf$default2.getValue()).m8615unboximpl()));
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        float floatValue = ((java.lang.Number) rememberedValue4).floatValue();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1952321764);
        androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = java.lang.Float.valueOf(density2.mo1418toPx0680j_4(m8615unboximpl2));
            startRestartGroup.updateRememberedValue(rememberedValue5);
        }
        startRestartGroup.endReplaceableGroup();
        float floatValue2 = ((java.lang.Number) rememberedValue5).floatValue();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1952321845);
        androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = java.lang.Float.valueOf(density3.mo1418toPx0680j_4(m8615unboximpl3));
            startRestartGroup.updateRememberedValue(rememberedValue6);
        }
        startRestartGroup.endReplaceableGroup();
        float floatValue3 = ((java.lang.Number) rememberedValue6).floatValue();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5767getUnspecifiedF1C5BW0, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0()) ? androidx.compose.ui.geometry.OffsetKt.Offset((floatValue - floatValue2) - floatValue3, 0.0f) : m5767getUnspecifiedF1C5BW0);
            startRestartGroup.updateRememberedValue(rememberedValue7);
        }
        startRestartGroup.endReplaceableGroup();
        long m5762unboximpl = ((androidx.compose.ui.geometry.Offset) rememberedValue7).m5762unboximpl();
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m5741boximpl(m5762unboximpl), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue8);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue8;
        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, ((androidx.compose.ui.unit.Dp) mutableStateOf$default.getValue()).m8615unboximpl()), ((androidx.compose.ui.unit.Dp) mutableStateOf$default2.getValue()).m8615unboximpl()), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), null, 2, null), com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonTestTags.FLOATING_BUTTON_AREA);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.ui.unit.Density density4 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(testTag);
        long j3 = m5767getUnspecifiedF1C5BW0;
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, density4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, m8615unboximpl), m8615unboximpl2), m8615unboximpl3), null, false, 3, null);
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(mutableState);
        java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density5) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density5, "");
                    return androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m5752getXimpl(mutableState.getValue().m5762unboximpl())), kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m5753getYimpl(mutableState.getValue().m5762unboximpl()))));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue9);
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.Modifier offset = androidx.compose.foundation.layout.OffsetKt.offset(wrapContentSize$default, (kotlin.jvm.functions.Function1) rememberedValue9);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        java.lang.Object[] objArr = {function1, mutableState, mutableStateOf$default2, androidx.compose.ui.unit.Dp.m8599boximpl(m8615unboximpl2), mutableStateOf$default, androidx.compose.ui.unit.Dp.m8599boximpl(m8615unboximpl)};
        startRestartGroup.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 6; i3++) {
            z |= startRestartGroup.changed(objArr[i3]);
        }
        com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1 rememberedValue10 = startRestartGroup.rememberedValue();
        if (z || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            j2 = j3;
            rememberedValue10 = new com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1(function1, mutableState, mutableStateOf$default2, m8615unboximpl2, mutableStateOf$default, m8615unboximpl, null);
            startRestartGroup.updateRememberedValue(rememberedValue10);
        } else {
            j2 = j3;
        }
        startRestartGroup.endReplaceableGroup();
        then = offset.then(new androidx.compose.ui.input.pointer.SuspendPointerInputElement(unit, null, null, new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((kotlin.jvm.functions.Function2) rememberedValue10), 6, null));
        androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(then, com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonTestTags.FLOATING_BUTTON);
        androidx.compose.material.FloatingActionButtonElevation m2639elevationxZ9QkE = androidx.compose.material.FloatingActionButtonDefaults.INSTANCE.m2639elevationxZ9QkE(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), 0.0f, 0.0f, startRestartGroup, (androidx.compose.material.FloatingActionButtonDefaults.$stable << 12) | 54, 12);
        androidx.compose.foundation.shape.RoundedCornerShape m1971RoundedCornerShape0680j_4 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(floatingButtonSettings.getCornerRadius()));
        long m6031getTransparent0d7_KjU = androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU();
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed2 = startRestartGroup.changed(function0);
        java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue11 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$3$1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    function0.invoke();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue11);
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.material.FloatingActionButtonKt.m2646FloatingActionButtonbogVsAg((kotlin.jvm.functions.Function0) rememberedValue11, testTag2, null, m1971RoundedCornerShape0680j_4, m6031getTransparent0d7_KjU, 0L, m2639elevationxZ9QkE, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1818417068, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$4
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                if ((intValue & 11) != 2 || !composer3.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1818417068, intValue, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButton.<anonymous>.<anonymous> (FloatingButton.kt:135)");
                    }
                    androidx.compose.foundation.ImageKt.m1335Image5hnEew(state.getValue(), "Floating Button", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), null, 2, null), null, false, 3, null), com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonTestTags.FLOATING_BUTTON_GRAPHIC), null, null, 0.0f, null, 0, composer3, 56, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        }), startRestartGroup, 12607488, 36);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final long j4 = j2;
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt.m9885FloatingButtonSu4bsnU(com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings.this, state, j4, function0, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        });
    }
}
