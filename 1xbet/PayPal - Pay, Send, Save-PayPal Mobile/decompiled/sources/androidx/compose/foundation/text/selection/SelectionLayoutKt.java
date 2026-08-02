package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\b*\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextRange;", "previousSelectionRange", "", "isStartOfSelection", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getTextFieldSelectionLayout-RcvT-LA", "(Landroidx/compose/ui/text/TextLayoutResult;IIIJZZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "getTextFieldSelectionLayout", "Landroidx/compose/foundation/text/selection/Direction;", "x", "y", "resolve2dDirection", "(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)Landroidx/compose/foundation/text/selection/Direction;", "Landroidx/compose/foundation/text/selection/Selection;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "isCollapsed", "(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "UNASSIGNED_SLOT", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionLayoutKt {
    public static final int UNASSIGNED_SLOT = -1;

    /* renamed from: getTextFieldSelectionLayout-RcvT-LA, reason: not valid java name */
    public static final androidx.compose.foundation.text.selection.SelectionLayout m2402getTextFieldSelectionLayoutRcvTLA(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, int i2, int i3, long j, boolean z, boolean z2) {
        return new androidx.compose.foundation.text.selection.SingleSelectionLayout(z2, 1, 1, z ? null : new androidx.compose.foundation.text.selection.Selection(new androidx.compose.foundation.text.selection.Selection.AnchorInfo(androidx.compose.foundation.text.selection.SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, androidx.compose.ui.text.TextRange.m8039getStartimpl(j)), androidx.compose.ui.text.TextRange.m8039getStartimpl(j), 1L), new androidx.compose.foundation.text.selection.Selection.AnchorInfo(androidx.compose.foundation.text.selection.SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, androidx.compose.ui.text.TextRange.m8034getEndimpl(j)), androidx.compose.ui.text.TextRange.m8034getEndimpl(j), 1L), androidx.compose.ui.text.TextRange.m8038getReversedimpl(j)), new androidx.compose.foundation.text.selection.SelectableInfo(1L, 1, i, i2, i3, textLayoutResult));
    }

    public static final androidx.compose.foundation.text.selection.Direction resolve2dDirection(androidx.compose.foundation.text.selection.Direction direction, androidx.compose.foundation.text.selection.Direction direction2) {
        int i = androidx.compose.foundation.text.selection.SelectionLayoutKt.WhenMappings.$EnumSwitchMapping$0[direction2.ordinal()];
        if (i == 1) {
            return androidx.compose.foundation.text.selection.Direction.BEFORE;
        }
        if (i != 2) {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return androidx.compose.foundation.text.selection.Direction.AFTER;
        }
        int i2 = androidx.compose.foundation.text.selection.SelectionLayoutKt.WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i2 == 1) {
            return androidx.compose.foundation.text.selection.Direction.BEFORE;
        }
        if (i2 == 2) {
            return androidx.compose.foundation.text.selection.Direction.ON;
        }
        if (i2 != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return androidx.compose.foundation.text.selection.Direction.AFTER;
    }

    public static final boolean isCollapsed(androidx.compose.foundation.text.selection.Selection selection, androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
        if (selection == null || selectionLayout == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (selectionLayout.getFirstInfo().getTextLength() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        booleanRef.element = true;
        selectionLayout.forEachMiddleInfo(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionLayoutKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionLayoutKt.m2401$r8$lambda$7n12Oo0IQn8GRs7Z7qlrftD8n0(kotlin.jvm.internal.Ref.BooleanRef.this, (androidx.compose.foundation.text.selection.SelectableInfo) obj);
            }
        });
        return booleanRef.element;
    }

    /* renamed from: $r8$lambda$7n12-Oo0IQn8GRs7Z7qlrftD8n0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2401$r8$lambda$7n12Oo0IQn8GRs7Z7qlrftD8n0(kotlin.jvm.internal.Ref.BooleanRef booleanRef, androidx.compose.foundation.text.selection.SelectableInfo selectableInfo) {
        if (selectableInfo.getInputText().length() > 0) {
            booleanRef.element = false;
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.selection.Direction.values().length];
            try {
                iArr[androidx.compose.foundation.text.selection.Direction.BEFORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.selection.Direction.ON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.selection.Direction.AFTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
