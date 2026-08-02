package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a:\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\u0002\b\u0018*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "", "TextFieldSelectionHandle", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "isSelectionHandleInVisibleBoundDefault", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Z)Z", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "Landroidx/compose/ui/geometry/Offset;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "contextMenuState", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "itemsAvailability", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "Lkotlin/ExtensionFunctionType;", "contextMenuBuilder", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldSelectionManagerKt {
    public static final void TextFieldSelectionHandle(final boolean z, final androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1344558920);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(resolvedTextDirection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(textFieldSelectionManager) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1344558920, i2, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1356)");
            }
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            boolean changed = startRestartGroup.changed(textFieldSelectionManager);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = textFieldSelectionManager.handleDragObserver$foundation(z);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.foundation.text.TextDragObserver textDragObserver = (androidx.compose.foundation.text.TextDragObserver) rememberedValue;
            boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionManager);
            boolean z3 = i3 == 4;
            androidx.compose.foundation.text.selection.OffsetProvider rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new androidx.compose.foundation.text.selection.OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1
                    @Override // androidx.compose.foundation.text.selection.OffsetProvider
                    /* renamed from: provide-F1C5BW0 */
                    public final long mo1994provideF1C5BW0() {
                        return androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2446getHandlePositiontuRUvjQ$foundation(z);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.foundation.text.selection.OffsetProvider offsetProvider = (androidx.compose.foundation.text.selection.OffsetProvider) rememberedValue2;
            boolean m8038getReversedimpl = androidx.compose.ui.text.TextRange.m8038getReversedimpl(textFieldSelectionManager.getValue$foundation().getSelection());
            float handleLineHeight$foundation = textFieldSelectionManager.getHandleLineHeight$foundation(z);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changedInstance2 = startRestartGroup.changedInstance(textDragObserver);
            androidx.compose.ui.input.pointer.PointerInputEventHandler rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        java.lang.Object detectDownAndDragGesturesWithObserver = androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, androidx.compose.foundation.text.TextDragObserver.this, continuation);
                        return detectDownAndDragGesturesWithObserver == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDownAndDragGesturesWithObserver : kotlin.Unit.INSTANCE;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m2370SelectionHandlewLIcFTc(offsetProvider, z, resolvedTextDirection, m8038getReversedimpl, 0L, handleLineHeight$foundation, androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue3), startRestartGroup, (i2 << 3) & 1008, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.$r8$lambda$gxw0hlJRMZsag8BGNiseRYaPYtI(z, resolvedTextDirection, textFieldSelectionManager, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final boolean isSelectionHandleInVisibleBoundDefault(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        androidx.compose.ui.geometry.Rect visibleBounds;
        androidx.compose.foundation.text.LegacyTextFieldState state = textFieldSelectionManager.getState();
        if (state == null || (layoutCoordinates = state.getLayoutCoordinates()) == null || (visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return androidx.compose.foundation.text.selection.SelectionManagerKt.m2425containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m2446getHandlePositiontuRUvjQ$foundation(z));
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m2454calculateSelectionMagnifierCenterAndroidO0kMr_c(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, long j) {
        int m8039getStartimpl;
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
        androidx.compose.foundation.text.TextDelegate textDelegate;
        androidx.compose.ui.text.AnnotatedString text;
        androidx.compose.ui.geometry.Offset m2444getCurrentDragPosition_m7T9E = textFieldSelectionManager.m2444getCurrentDragPosition_m7T9E();
        if (m2444getCurrentDragPosition_m7T9E == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        long m5762unboximpl = m2444getCurrentDragPosition_m7T9E.m5762unboximpl();
        androidx.compose.ui.text.AnnotatedString transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation();
        if (transformedText$foundation == null || transformedText$foundation.length() == 0) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        androidx.compose.foundation.text.Handle draggingHandle = textFieldSelectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldSelectionManager.getValue$foundation().getSelection());
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            m8039getStartimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldSelectionManager.getValue$foundation().getSelection());
        }
        androidx.compose.foundation.text.LegacyTextFieldState state = textFieldSelectionManager.getState();
        if (state == null || (layoutResult = state.getLayoutResult()) == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        androidx.compose.foundation.text.LegacyTextFieldState state2 = textFieldSelectionManager.getState();
        if (state2 == null || (textDelegate = state2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        int coerceIn = kotlin.ranges.RangesKt.coerceIn(textFieldSelectionManager.getOffsetMapping().originalToTransformed(m8039getStartimpl), 0, text.length());
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (layoutResult.m2138translateDecorationToInnerCoordinatesMKHz9U$foundation(m5762unboximpl) >> 32));
        androidx.compose.ui.text.TextLayoutResult value = layoutResult.getValue();
        int lineForOffset = value.getLineForOffset(coerceIn);
        float lineLeft = value.getLineLeft(lineForOffset);
        float lineRight = value.getLineRight(lineForOffset);
        float coerceIn2 = kotlin.ranges.RangesKt.coerceIn(intBitsToFloat, java.lang.Math.min(lineLeft, lineRight), java.lang.Math.max(lineLeft, lineRight));
        if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(j, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g()) && java.lang.Math.abs(intBitsToFloat - coerceIn2) > ((int) (j >> 32)) / 2) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        float lineTop = value.getLineTop(lineForOffset);
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(((value.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop) & 4294967295L) | (java.lang.Float.floatToRawIntBits(coerceIn2) << 32));
    }

    public static final kotlin.jvm.functions.Function1<androidx.compose.foundation.contextmenu.ContextMenuScope, kotlin.Unit> contextMenuBuilder(final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, final androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState, final androidx.compose.runtime.State<androidx.compose.foundation.text.MenuItemsAvailability> state) {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.m2453$r8$lambda$zYCNq0UkbzaQgfWxOjgd1KeGo(androidx.compose.runtime.State.this, textFieldSelectionManager, contextMenuState, (androidx.compose.foundation.contextmenu.ContextMenuScope) obj);
            }
        };
    }

    private static final void Camera2StreamConfigurationMap(androidx.compose.foundation.contextmenu.ContextMenuScope contextMenuScope, androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState, androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        if (z) {
            androidx.compose.foundation.contextmenu.ContextMenuScope.item$default(contextMenuScope, new androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$1(textContextMenuItems), null, false, null, new androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$2(function0, contextMenuState), 14, null);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7TgNYnqXAshciBc4excdDEpwVWE(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.copy$foundation(false);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gxw0hlJRMZsag8BGNiseRYaPYtI(boolean z, androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, int i, androidx.compose.runtime.Composer composer, int i2) {
        TextFieldSelectionHandle(z, resolvedTextDirection, textFieldSelectionManager, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UiksigVL3SzuH7AlWA5Y_SyQnfg(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.autofill$foundation();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j3epNIIXttQDRCcQfI3V86-R_jg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2452$r8$lambda$j3epNIIXttQDRCcQfI3V86R_jg(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.selectAll$foundation();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p34YjtOTpkMbxOzGpUm2lk2FLYo(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.paste$foundation();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tVTge5KO0kG_vO6HhRA7d9nYztY(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.cut$foundation();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zYCNq0Ukbz-aQgf-WxOjgd1KeGo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2453$r8$lambda$zYCNq0UkbzaQgfWxOjgd1KeGo(androidx.compose.runtime.State state, final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState, androidx.compose.foundation.contextmenu.ContextMenuScope contextMenuScope) {
        int m2090unboximpl = ((androidx.compose.foundation.text.MenuItemsAvailability) state.getValue()).m2090unboximpl();
        Camera2StreamConfigurationMap(contextMenuScope, contextMenuState, androidx.compose.foundation.text.TextContextMenuItems.Cut, androidx.compose.foundation.text.MenuItemsAvailability.m2085getCanCutimpl(m2090unboximpl), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.$r8$lambda$tVTge5KO0kG_vO6HhRA7d9nYztY(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
            }
        });
        Camera2StreamConfigurationMap(contextMenuScope, contextMenuState, androidx.compose.foundation.text.TextContextMenuItems.Copy, androidx.compose.foundation.text.MenuItemsAvailability.m2084getCanCopyimpl(m2090unboximpl), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.$r8$lambda$7TgNYnqXAshciBc4excdDEpwVWE(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
            }
        });
        Camera2StreamConfigurationMap(contextMenuScope, contextMenuState, androidx.compose.foundation.text.TextContextMenuItems.Paste, androidx.compose.foundation.text.MenuItemsAvailability.m2086getCanPasteimpl(m2090unboximpl), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.$r8$lambda$p34YjtOTpkMbxOzGpUm2lk2FLYo(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
            }
        });
        Camera2StreamConfigurationMap(contextMenuScope, contextMenuState, androidx.compose.foundation.text.TextContextMenuItems.SelectAll, androidx.compose.foundation.text.MenuItemsAvailability.m2087getCanSelectAllimpl(m2090unboximpl), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.m2452$r8$lambda$j3epNIIXttQDRCcQfI3V86R_jg(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
            }
        });
        if (androidx.compose.foundation.internal.PlatformUtils_androidKt.isAutofillAvailable()) {
            Camera2StreamConfigurationMap(contextMenuScope, contextMenuState, androidx.compose.foundation.text.TextContextMenuItems.Autofill, androidx.compose.foundation.text.MenuItemsAvailability.m2083getCanAutofillimpl(m2090unboximpl), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.$r8$lambda$UiksigVL3SzuH7AlWA5Y_SyQnfg(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.Handle.values().length];
            try {
                iArr[androidx.compose.foundation.text.Handle.Cursor.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.Handle.SelectionStart.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.Handle.SelectionEnd.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
