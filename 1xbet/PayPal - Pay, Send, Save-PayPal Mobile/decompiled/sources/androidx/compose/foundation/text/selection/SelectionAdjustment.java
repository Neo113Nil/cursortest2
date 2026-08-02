package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "Landroidx/compose/foundation/text/selection/SelectionLayout;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Landroidx/compose/foundation/text/selection/Selection;", "adjust", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)Landroidx/compose/foundation/text/selection/Selection;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SelectionAdjustment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.selection.SelectionAdjustment.Companion INSTANCE = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.getHighResolutionOutputSizeshNQ4ISI;

    androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout layout);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getNone", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "Character", "getCharacter", "Word", "getWord", "Paragraph", "getParagraph", "CharacterWithWordAccelerate", "getCharacterWithWordAccelerate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.foundation.text.selection.SelectionAdjustment.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.text.selection.SelectionAdjustment.Companion();
        private static final androidx.compose.foundation.text.selection.SelectionAdjustment None = new androidx.compose.foundation.text.selection.SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
                return androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.$r8$lambda$kXhnWLiofEAGpWtFpHqUcdmpuMo(selectionLayout);
            }
        };
        private static final androidx.compose.foundation.text.selection.SelectionAdjustment Character = new androidx.compose.foundation.text.selection.SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
                androidx.compose.foundation.text.selection.Selection ensureAtLeastOneChar;
                ensureAtLeastOneChar = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.ensureAtLeastOneChar(androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.None.adjust(selectionLayout), selectionLayout);
                return ensureAtLeastOneChar;
            }
        };
        private static final androidx.compose.foundation.text.selection.SelectionAdjustment Word = new androidx.compose.foundation.text.selection.SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda2
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
                androidx.compose.foundation.text.selection.Selection access$adjustToBoundaries;
                access$adjustToBoundaries = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.access$adjustToBoundaries(selectionLayout, new androidx.compose.foundation.text.selection.BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1$1
                    @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                    public final long getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, int i) {
                        return selectableInfo.getTextLayoutResult().m8013getWordBoundaryjx7JFs(i);
                    }
                });
                return access$adjustToBoundaries;
            }
        };
        private static final androidx.compose.foundation.text.selection.SelectionAdjustment Paragraph = new androidx.compose.foundation.text.selection.SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda3
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
                androidx.compose.foundation.text.selection.Selection access$adjustToBoundaries;
                access$adjustToBoundaries = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.access$adjustToBoundaries(selectionLayout, new androidx.compose.foundation.text.selection.BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1$1
                    @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                    public final long getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, int i) {
                        return androidx.compose.foundation.text.StringHelpersKt.getParagraphBoundary(selectableInfo.getInputText(), i);
                    }
                });
                return access$adjustToBoundaries;
            }
        };
        private static final androidx.compose.foundation.text.selection.SelectionAdjustment CharacterWithWordAccelerate = new androidx.compose.foundation.text.selection.SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda4
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
                return androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.$r8$lambda$f05LFRjqLiE7GXIHcHvxFHJ7abw(selectionLayout);
            }
        };

        private Companion() {
        }

        public final androidx.compose.foundation.text.selection.SelectionAdjustment getNone() {
            return None;
        }

        public final androidx.compose.foundation.text.selection.SelectionAdjustment getCharacter() {
            return Character;
        }

        public final androidx.compose.foundation.text.selection.SelectionAdjustment getWord() {
            return Word;
        }

        public final androidx.compose.foundation.text.selection.SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        public final androidx.compose.foundation.text.selection.SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        public static /* synthetic */ androidx.compose.foundation.text.selection.Selection $r8$lambda$f05LFRjqLiE7GXIHcHvxFHJ7abw(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
            androidx.compose.foundation.text.selection.Selection.AnchorInfo end;
            androidx.compose.foundation.text.selection.Selection.AnchorInfo access$updateSelectionBoundary;
            androidx.compose.foundation.text.selection.Selection.AnchorInfo start;
            androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo;
            androidx.compose.foundation.text.selection.Selection previousSelection = selectionLayout.getPreviousSelection();
            if (previousSelection == null) {
                return Word.adjust(selectionLayout);
            }
            if (selectionLayout.isStartHandle()) {
                end = previousSelection.getStart();
                access$updateSelectionBoundary = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.access$updateSelectionBoundary(selectionLayout, selectionLayout.getStartInfo(), end);
                anchorInfo = previousSelection.getEnd();
                start = access$updateSelectionBoundary;
            } else {
                end = previousSelection.getEnd();
                access$updateSelectionBoundary = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.access$updateSelectionBoundary(selectionLayout, selectionLayout.getEndInfo(), end);
                start = previousSelection.getStart();
                anchorInfo = access$updateSelectionBoundary;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(access$updateSelectionBoundary, end)) {
                return previousSelection;
            }
            return androidx.compose.foundation.text.selection.SelectionAdjustmentKt.ensureAtLeastOneChar(new androidx.compose.foundation.text.selection.Selection(start, anchorInfo, selectionLayout.getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED || (selectionLayout.getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.COLLAPSED && start.getOffset() > anchorInfo.getOffset())), selectionLayout);
        }

        public static /* synthetic */ androidx.compose.foundation.text.selection.Selection $r8$lambda$kXhnWLiofEAGpWtFpHqUcdmpuMo(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
            return new androidx.compose.foundation.text.selection.Selection(selectionLayout.getStartInfo().anchorForOffset(selectionLayout.getStartInfo().getRawStartHandleOffset()), selectionLayout.getEndInfo().anchorForOffset(selectionLayout.getEndInfo().getRawEndHandleOffset()), selectionLayout.getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED);
        }
    }
}
