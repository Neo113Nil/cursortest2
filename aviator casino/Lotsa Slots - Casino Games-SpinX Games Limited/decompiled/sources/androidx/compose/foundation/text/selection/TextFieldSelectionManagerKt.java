package androidx.compose.foundation.text.selection;

/* compiled from: TextFieldSelectionManager.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"TextFieldSelectionHandle", "", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "isSelectionHandleInVisibleBound", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    /* compiled from: TextFieldSelectionManager.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    public static final void TextFieldSelectionHandle(final boolean z, final androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1344558920);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldSelectionHandle)P(1)958@37140L90,962@37236L346:TextFieldSelectionManager.kt#eksfi3");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1344558920, i, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:957)");
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(textFieldSelectionManager);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = textFieldSelectionManager.handleDragObserver$foundation_release(z);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.text.TextDragObserver textDragObserver = (androidx.compose.foundation.text.TextDragObserver) rememberedValue;
        androidx.compose.foundation.text.selection.OffsetProvider offsetProvider = new androidx.compose.foundation.text.selection.OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1
            @Override // androidx.compose.foundation.text.selection.OffsetProvider
            /* renamed from: provide-F1C5BW0 */
            public final long mo850provideF1C5BW0() {
                return androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m1077getHandlePositiontuRUvjQ$foundation_release(z);
            }
        };
        boolean m3963getReversedimpl = androidx.compose.ui.text.TextRange.m3963getReversedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
        androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.Modifier.INSTANCE, textDragObserver, new androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(textDragObserver, null));
        int i2 = i << 3;
        androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle(offsetProvider, z, resolvedTextDirection, m3963getReversedimpl, pointerInput, startRestartGroup, (i2 & 112) | (i2 & 896));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                    androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle(z, resolvedTextDirection, textFieldSelectionManager, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean isSelectionHandleInVisibleBound(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        androidx.compose.ui.geometry.Rect visibleBounds;
        androidx.compose.foundation.text.TextFieldState state = textFieldSelectionManager.getState();
        if (state == null || (layoutCoordinates = state.getLayoutCoordinates()) == null || (visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return androidx.compose.foundation.text.selection.SelectionManagerKt.m1055containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m1077getHandlePositiontuRUvjQ$foundation_release(z));
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1078calculateSelectionMagnifierCenterAndroidO0kMr_c(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, long j) {
        int m3964getStartimpl;
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
        androidx.compose.foundation.text.TextDelegate textDelegate;
        androidx.compose.ui.text.AnnotatedString text;
        androidx.compose.ui.geometry.Offset m1075getCurrentDragPosition_m7T9E = textFieldSelectionManager.m1075getCurrentDragPosition_m7T9E();
        if (m1075getCurrentDragPosition_m7T9E == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        long packedValue = m1075getCurrentDragPosition_m7T9E.getPackedValue();
        androidx.compose.ui.text.AnnotatedString transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release();
        if (transformedText$foundation_release == null || transformedText$foundation_release.length() == 0) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        androidx.compose.foundation.text.Handle draggingHandle = textFieldSelectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            m3964getStartimpl = androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            m3964getStartimpl = androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
        }
        androidx.compose.foundation.text.TextFieldState state = textFieldSelectionManager.getState();
        if (state == null || (layoutResult = state.getLayoutResult()) == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        androidx.compose.foundation.text.TextFieldState state2 = textFieldSelectionManager.getState();
        if (state2 == null || (textDelegate = state2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        int coerceIn = kotlin.ranges.RangesKt.coerceIn(textFieldSelectionManager.getOffsetMapping().originalToTransformed(m3964getStartimpl), 0, text.length());
        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(layoutResult.m954translateDecorationToInnerCoordinatesMKHz9U$foundation_release(packedValue));
        androidx.compose.ui.text.TextLayoutResult value = layoutResult.getValue();
        int lineForOffset = value.getLineForOffset(coerceIn);
        float lineLeft = value.getLineLeft(lineForOffset);
        float lineRight = value.getLineRight(lineForOffset);
        float coerceIn2 = kotlin.ranges.RangesKt.coerceIn(m1871getXimpl, java.lang.Math.min(lineLeft, lineRight), java.lang.Math.max(lineLeft, lineRight));
        if (java.lang.Math.abs(m1871getXimpl - coerceIn2) > androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j) / 2) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        float lineTop = value.getLineTop(lineForOffset);
        return androidx.compose.ui.geometry.OffsetKt.Offset(coerceIn2, ((value.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop);
    }
}
