package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "Landroidx/compose/runtime/SlotTable;", "slotTable", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/collection/ObjectList;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "Landroidx/collection/ScatterMap;", "extractNestedStates$runtime", "(Landroidx/compose/runtime/Applier;Landroidx/collection/ObjectList;)Landroidx/collection/ScatterMap;", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MovableContentState {
    public static final int $stable = 8;
    private final androidx.compose.runtime.SlotTable slotTable;

    public MovableContentState(androidx.compose.runtime.SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    /* renamed from: getSlotTable$runtime, reason: from getter */
    public final androidx.compose.runtime.SlotTable getSlotTable() {
        return this.slotTable;
    }

    public final androidx.collection.ScatterMap<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState> extractNestedStates$runtime(androidx.compose.runtime.Applier<?> applier, androidx.collection.ObjectList<androidx.compose.runtime.MovableContentStateReference> references) {
        int Camera2StreamConfigurationMap;
        java.lang.Object[] objArr = references.content;
        int i = references._size;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= i) {
                break;
            }
            if (this.slotTable.ownsAnchor(((androidx.compose.runtime.MovableContentStateReference) objArr[i3]).getAnchor())) {
                i3++;
            } else {
                androidx.collection.MutableObjectList mutableObjectList = new androidx.collection.MutableObjectList(i2, i4, null);
                java.lang.Object[] objArr2 = references.content;
                int i5 = references._size;
                for (int i6 = 0; i6 < i5; i6++) {
                    java.lang.Object obj = objArr2[i6];
                    if (this.slotTable.ownsAnchor(((androidx.compose.runtime.MovableContentStateReference) obj).getAnchor())) {
                        mutableObjectList.add(obj);
                    }
                }
                references = mutableObjectList;
            }
        }
        androidx.collection.ObjectList sortedBy = androidx.compose.runtime.collection.ExtensionsKt.sortedBy(references, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.MovableContentState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                java.lang.Integer valueOf;
                valueOf = java.lang.Integer.valueOf(androidx.compose.runtime.MovableContentState.this.slotTable.anchorIndex(((androidx.compose.runtime.MovableContentStateReference) obj2).getAnchor()));
                return valueOf;
            }
        });
        if (sortedBy.isEmpty()) {
            return androidx.collection.ScatterMapKt.emptyScatterMap();
        }
        androidx.collection.MutableScatterMap mutableScatterMapOf = androidx.collection.ScatterMapKt.mutableScatterMapOf();
        androidx.compose.runtime.SlotWriter openWriter = this.slotTable.openWriter();
        try {
            java.lang.Object[] objArr3 = sortedBy.content;
            int i7 = sortedBy._size;
            for (int i8 = 0; i8 < i7; i8++) {
                androidx.compose.runtime.MovableContentStateReference movableContentStateReference = (androidx.compose.runtime.MovableContentStateReference) objArr3[i8];
                int anchorIndex = openWriter.anchorIndex(movableContentStateReference.getAnchor());
                int parent = openWriter.parent(anchorIndex);
                while (openWriter.getParent() >= 0 && openWriter.getCurrentGroupEnd() <= parent) {
                    openWriter.skipToGroupEnd();
                    openWriter.endGroup();
                }
                while (openWriter.getParent() >= 0 && openWriter.getCurrentGroupEnd() <= parent) {
                    openWriter.skipToGroupEnd();
                    openWriter.endGroup();
                }
                while (openWriter.getCurrentGroup() != parent && !openWriter.isGroupEnd()) {
                    Camera2StreamConfigurationMap = androidx.compose.runtime.ComposerKt.Camera2StreamConfigurationMap(openWriter);
                    if (parent < Camera2StreamConfigurationMap) {
                        openWriter.startGroup();
                    } else {
                        openWriter.skipGroup();
                    }
                }
                if (openWriter.getCurrentGroup() != parent) {
                    androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
                }
                openWriter.startGroup();
                openWriter.advanceBy(anchorIndex - openWriter.getCurrentGroup());
                mutableScatterMapOf.set(movableContentStateReference, androidx.compose.runtime.ComposerKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition(), movableContentStateReference, openWriter, applier));
            }
            while (openWriter.getParent() >= 0 && openWriter.getCurrentGroupEnd() <= Integer.MAX_VALUE) {
                openWriter.skipToGroupEnd();
                openWriter.endGroup();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            openWriter.close(true);
            return mutableScatterMapOf;
        } catch (java.lang.Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }
}
