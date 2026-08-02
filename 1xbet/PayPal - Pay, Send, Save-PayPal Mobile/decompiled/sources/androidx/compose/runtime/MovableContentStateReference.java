package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001Bo\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R6\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b+\u0010%"}, d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "Landroidx/compose/runtime/MovableContent;", "content", "parameter", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/Anchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidations", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "locals", "nestedReferences", "<init>", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContent;", "getContent$runtime", "()Landroidx/compose/runtime/MovableContent;", "Ljava/lang/Object;", "getParameter$runtime", "()Ljava/lang/Object;", "Landroidx/compose/runtime/ControlledComposition;", "getComposition$runtime", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "getAnchor$runtime", "()Landroidx/compose/runtime/Anchor;", "Ljava/util/List;", "getInvalidations$runtime", "()Ljava/util/List;", "setInvalidations$runtime", "(Ljava/util/List;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getLocals$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getNestedReferences$runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MovableContentStateReference {
    public static final int $stable = 8;
    private final androidx.compose.runtime.Anchor anchor;
    private final androidx.compose.runtime.ControlledComposition composition;
    private final androidx.compose.runtime.MovableContent<java.lang.Object> content;
    private java.util.List<? extends kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, ? extends java.lang.Object>> invalidations;
    private final androidx.compose.runtime.PersistentCompositionLocalMap locals;
    private final java.util.List<androidx.compose.runtime.MovableContentStateReference> nestedReferences;
    private final java.lang.Object parameter;
    private final androidx.compose.runtime.SlotTable slotTable;

    public MovableContentStateReference(androidx.compose.runtime.MovableContent<java.lang.Object> movableContent, java.lang.Object obj, androidx.compose.runtime.ControlledComposition controlledComposition, androidx.compose.runtime.SlotTable slotTable, androidx.compose.runtime.Anchor anchor, java.util.List<? extends kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, ? extends java.lang.Object>> list, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, java.util.List<androidx.compose.runtime.MovableContentStateReference> list2) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
        this.nestedReferences = list2;
    }

    public final androidx.compose.runtime.MovableContent<java.lang.Object> getContent$runtime() {
        return this.content;
    }

    /* renamed from: getParameter$runtime, reason: from getter */
    public final java.lang.Object getParameter() {
        return this.parameter;
    }

    /* renamed from: getComposition$runtime, reason: from getter */
    public final androidx.compose.runtime.ControlledComposition getComposition() {
        return this.composition;
    }

    /* renamed from: getSlotTable$runtime, reason: from getter */
    public final androidx.compose.runtime.SlotTable getSlotTable() {
        return this.slotTable;
    }

    /* renamed from: getAnchor$runtime, reason: from getter */
    public final androidx.compose.runtime.Anchor getAnchor() {
        return this.anchor;
    }

    public final java.util.List<kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, java.lang.Object>> getInvalidations$runtime() {
        return this.invalidations;
    }

    public final void setInvalidations$runtime(java.util.List<? extends kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, ? extends java.lang.Object>> list) {
        this.invalidations = list;
    }

    /* renamed from: getLocals$runtime, reason: from getter */
    public final androidx.compose.runtime.PersistentCompositionLocalMap getLocals() {
        return this.locals;
    }

    public final java.util.List<androidx.compose.runtime.MovableContentStateReference> getNestedReferences$runtime() {
        return this.nestedReferences;
    }
}
