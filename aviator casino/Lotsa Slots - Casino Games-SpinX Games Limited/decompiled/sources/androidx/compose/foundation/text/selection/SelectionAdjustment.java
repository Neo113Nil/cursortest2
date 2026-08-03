package androidx.compose.foundation.text.selection;

/* compiled from: SelectionAdjustment.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "adjust", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SelectionAdjustment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.selection.SelectionAdjustment.Companion INSTANCE = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.$$INSTANCE;

    androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout layout);

    /* compiled from: SelectionAdjustment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "()V", "Character", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getCharacter", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "CharacterWithWordAccelerate", "getCharacterWithWordAccelerate", "None", "getNone", "Paragraph", "getParagraph", "Word", "getWord", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.foundation.text.selection.SelectionAdjustment.Companion $$INSTANCE = new androidx.compose.foundation.text.selection.SelectionAdjustment.Companion();
        private static final androidx.compose.foundation.text.selection.SelectionAdjustment None = new androidx.compose.foundation.text.selection.SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
                androidx.compose.foundation.text.selection.Selection None$lambda$0;
                None$lambda$0 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.None$lambda$0(selectionLayout);
                return None$lambda$0;
            }
        };
        private static final androidx.compose.foundation.text.selection.SelectionAdjustment Character = new androidx.compose.foundation.text.selection.SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
                androidx.compose.foundation.text.selection.Selection Character$lambda$1;
                Character$lambda$1 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.Character$lambda$1(selectionLayout);
                return Character$lambda$1;
            }
        };
        private static final androidx.compose.foundation.text.selection.SelectionAdjustment Word = new androidx.compose.foundation.text.selection.SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda2
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
                androidx.compose.foundation.text.selection.Selection Word$lambda$2;
                Word$lambda$2 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.Word$lambda$2(selectionLayout);
                return Word$lambda$2;
            }
        };
        private static final androidx.compose.foundation.text.selection.SelectionAdjustment Paragraph = new androidx.compose.foundation.text.selection.SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda3
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
                androidx.compose.foundation.text.selection.Selection Paragraph$lambda$3;
                Paragraph$lambda$3 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.Paragraph$lambda$3(selectionLayout);
                return Paragraph$lambda$3;
            }
        };
        private static final androidx.compose.foundation.text.selection.SelectionAdjustment CharacterWithWordAccelerate = new androidx.compose.foundation.text.selection.SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda4
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final androidx.compose.foundation.text.selection.Selection adjust(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
                androidx.compose.foundation.text.selection.Selection CharacterWithWordAccelerate$lambda$4;
                CharacterWithWordAccelerate$lambda$4 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.CharacterWithWordAccelerate$lambda$4(selectionLayout);
                return CharacterWithWordAccelerate$lambda$4;
            }
        };

        private Companion() {
        }

        public final androidx.compose.foundation.text.selection.SelectionAdjustment getNone() {
            return None;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.text.selection.Selection None$lambda$0(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
            return new androidx.compose.foundation.text.selection.Selection(selectionLayout.getStartInfo().anchorForOffset(selectionLayout.getStartInfo().getRawStartHandleOffset()), selectionLayout.getEndInfo().anchorForOffset(selectionLayout.getEndInfo().getRawEndHandleOffset()), selectionLayout.getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED);
        }

        public final androidx.compose.foundation.text.selection.SelectionAdjustment getCharacter() {
            return Character;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.text.selection.Selection Character$lambda$1(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
            return androidx.compose.foundation.text.selection.SelectionAdjustmentKt.ensureAtLeastOneChar(None.adjust(selectionLayout), selectionLayout);
        }

        public final androidx.compose.foundation.text.selection.SelectionAdjustment getWord() {
            return Word;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.text.selection.Selection Word$lambda$2(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
            androidx.compose.foundation.text.selection.Selection adjustToBoundaries;
            adjustToBoundaries = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.adjustToBoundaries(selectionLayout, new androidx.compose.foundation.text.selection.BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1$1
                @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                /* renamed from: getBoundary-fzxv0v0 */
                public final long mo1001getBoundaryfzxv0v0(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, int i) {
                    return selectableInfo.getTextLayoutResult().m3938getWordBoundaryjx7JFs(i);
                }
            });
            return adjustToBoundaries;
        }

        public final androidx.compose.foundation.text.selection.SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.text.selection.Selection Paragraph$lambda$3(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
            androidx.compose.foundation.text.selection.Selection adjustToBoundaries;
            adjustToBoundaries = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.adjustToBoundaries(selectionLayout, new androidx.compose.foundation.text.selection.BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1$1
                @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                /* renamed from: getBoundary-fzxv0v0 */
                public final long mo1001getBoundaryfzxv0v0(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, int i) {
                    return androidx.compose.foundation.text.StringHelpersKt.getParagraphBoundary(selectableInfo.getInputText(), i);
                }
            });
            return adjustToBoundaries;
        }

        public final androidx.compose.foundation.text.selection.SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.text.selection.Selection CharacterWithWordAccelerate$lambda$4(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
            androidx.compose.foundation.text.selection.Selection.AnchorInfo end;
            androidx.compose.foundation.text.selection.Selection.AnchorInfo updateSelectionBoundary;
            androidx.compose.foundation.text.selection.Selection.AnchorInfo start;
            androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo;
            androidx.compose.foundation.text.selection.Selection previousSelection = selectionLayout.getPreviousSelection();
            if (previousSelection == null) {
                return Word.adjust(selectionLayout);
            }
            if (selectionLayout.isStartHandle()) {
                end = previousSelection.getStart();
                updateSelectionBoundary = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.updateSelectionBoundary(selectionLayout, selectionLayout.getStartInfo(), end);
                anchorInfo = previousSelection.getEnd();
                start = updateSelectionBoundary;
            } else {
                end = previousSelection.getEnd();
                updateSelectionBoundary = androidx.compose.foundation.text.selection.SelectionAdjustmentKt.updateSelectionBoundary(selectionLayout, selectionLayout.getEndInfo(), end);
                start = previousSelection.getStart();
                anchorInfo = updateSelectionBoundary;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(updateSelectionBoundary, end)) {
                return previousSelection;
            }
            return androidx.compose.foundation.text.selection.SelectionAdjustmentKt.ensureAtLeastOneChar(new androidx.compose.foundation.text.selection.Selection(start, anchorInfo, selectionLayout.getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED || (selectionLayout.getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.COLLAPSED && start.getOffset() > anchorInfo.getOffset())), selectionLayout);
        }
    }
}
