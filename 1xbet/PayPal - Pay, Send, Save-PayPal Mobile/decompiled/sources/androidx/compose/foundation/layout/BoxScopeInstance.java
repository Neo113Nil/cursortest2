package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/layout/BoxScopeInstance;", "Landroidx/compose/foundation/layout/BoxScope;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;", "matchParentSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BoxScopeInstance implements androidx.compose.foundation.layout.BoxScope {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.layout.BoxScopeInstance INSTANCE = new androidx.compose.foundation.layout.BoxScopeInstance();

    private BoxScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final androidx.compose.ui.Modifier matchParentSize(androidx.compose.ui.Modifier modifier) {
        return modifier.then(new androidx.compose.foundation.layout.BoxChildDataElement(androidx.compose.ui.Alignment.INSTANCE.getCenter(), true, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("matchParentSize");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final androidx.compose.ui.Modifier align(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.Alignment alignment) {
        return modifier.then(new androidx.compose.foundation.layout.BoxChildDataElement(alignment, false, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$align$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("align");
                inspectorInfo.setValue(androidx.compose.ui.Alignment.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }
}
