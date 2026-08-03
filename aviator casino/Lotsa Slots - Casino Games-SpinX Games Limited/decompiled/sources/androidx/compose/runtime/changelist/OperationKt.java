package androidx.compose.runtime.changelist;

/* compiled from: Operation.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a(\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002\u001a(\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\f\u001a\u00020\u0001H\u0002\u001a(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0014"}, d2 = {"currentNodeIndex", "", "slots", "Landroidx/compose/runtime/SlotWriter;", "positionToInsert", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "applier", "Landroidx/compose/runtime/Applier;", "", "positionToParentOf", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "releaseMovableGroupAtCurrent", "composition", "Landroidx/compose/runtime/ControlledComposition;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void positionToParentOf(androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.Applier<java.lang.Object> applier, int i) {
        while (!slotWriter.indexInParent(i)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private static final int currentNodeIndex(androidx.compose.runtime.SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i = parent + 1;
        int i2 = 0;
        while (i < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i)) {
                if (slotWriter.isNode(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                i2 += slotWriter.isNode(i) ? 1 : slotWriter.nodeCount(i);
                i += slotWriter.groupSize(i);
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int positionToInsert(androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.Applier<java.lang.Object> applier) {
        int anchorIndex = slotWriter.anchorIndex(anchor);
        androidx.compose.runtime.ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() < anchorIndex);
        positionToParentOf(slotWriter, applier, anchorIndex);
        int currentNodeIndex = currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                currentNodeIndex += slotWriter.skipGroup();
            }
        }
        androidx.compose.runtime.ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() == anchorIndex);
        return currentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseMovableGroupAtCurrent(final androidx.compose.runtime.ControlledComposition controlledComposition, androidx.compose.runtime.CompositionContext compositionContext, final androidx.compose.runtime.MovableContentStateReference movableContentStateReference, androidx.compose.runtime.SlotWriter slotWriter) {
        androidx.compose.runtime.SlotTable slotTable = new androidx.compose.runtime.SlotTable();
        androidx.compose.runtime.SlotWriter openWriter = slotTable.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(androidx.compose.runtime.MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            androidx.compose.runtime.SlotWriter.markGroup$default(openWriter, 0, 1, null);
            openWriter.update(movableContentStateReference.getParameter());
            java.util.List<androidx.compose.runtime.Anchor> moveTo = slotWriter.moveTo(movableContentStateReference.getAnchor(), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            openWriter.close();
            androidx.compose.runtime.MovableContentState movableContentState = new androidx.compose.runtime.MovableContentState(slotTable);
            if (androidx.compose.runtime.RecomposeScopeImpl.INSTANCE.hasAnchoredRecomposeScopes$runtime_release(slotTable, moveTo)) {
                androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner = new androidx.compose.runtime.RecomposeScopeOwner() { // from class: androidx.compose.runtime.changelist.OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1
                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public void recomposeScopeReleased(androidx.compose.runtime.RecomposeScopeImpl scope) {
                    }

                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public void recordReadOf(java.lang.Object value) {
                    }

                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public androidx.compose.runtime.InvalidationResult invalidate(androidx.compose.runtime.RecomposeScopeImpl scope, java.lang.Object instance) {
                        androidx.compose.runtime.InvalidationResult invalidationResult;
                        androidx.compose.runtime.ControlledComposition controlledComposition2 = androidx.compose.runtime.ControlledComposition.this;
                        androidx.compose.runtime.collection.IdentityArraySet identityArraySet = null;
                        androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof androidx.compose.runtime.RecomposeScopeOwner ? (androidx.compose.runtime.RecomposeScopeOwner) controlledComposition2 : null;
                        if (recomposeScopeOwner2 == null || (invalidationResult = recomposeScopeOwner2.invalidate(scope, instance)) == null) {
                            invalidationResult = androidx.compose.runtime.InvalidationResult.IGNORED;
                        }
                        if (invalidationResult != androidx.compose.runtime.InvalidationResult.IGNORED) {
                            return invalidationResult;
                        }
                        androidx.compose.runtime.MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                        java.util.List<kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>>> invalidations$runtime_release = movableContentStateReference2.getInvalidations$runtime_release();
                        if (instance != null) {
                            identityArraySet = new androidx.compose.runtime.collection.IdentityArraySet();
                            identityArraySet.add(identityArraySet);
                        }
                        movableContentStateReference2.setInvalidations$runtime_release(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.Pair>) invalidations$runtime_release, kotlin.TuplesKt.to(scope, identityArraySet)));
                        return androidx.compose.runtime.InvalidationResult.SCHEDULED;
                    }
                };
                try {
                    androidx.compose.runtime.RecomposeScopeImpl.INSTANCE.adoptAnchoredScopes$runtime_release(slotTable.openWriter(), moveTo, recomposeScopeOwner);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                }
            }
            compositionContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        } finally {
        }
    }
}
