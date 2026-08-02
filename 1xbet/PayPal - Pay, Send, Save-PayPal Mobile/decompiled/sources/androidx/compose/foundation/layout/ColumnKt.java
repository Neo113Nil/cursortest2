package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\b¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0000¢\u0006\u0002\u0010\u001f\"\u001c\u0010\u000e\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Column", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DefaultColumnMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy$annotations", "()V", "getDefaultColumnMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "createColumnConstraints", "Landroidx/compose/ui/unit/Constraints;", "isPrioritizing", "", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "(ZIIII)J", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColumnKt {
    private static final androidx.compose.ui.layout.MeasurePolicy getHighSpeedVideoSizes = new androidx.compose.foundation.layout.ColumnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart());

    public static /* synthetic */ void getDefaultColumnMeasurePolicy$annotations() {
    }

    public static final void Column(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
        }
        if ((i2 & 4) != 0) {
            horizontal = androidx.compose.ui.Alignment.INSTANCE.getStart();
        }
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = columnMeasurePolicy(vertical, horizontal, composer, (i >> 3) & 126);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, modifier);
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        function3.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer, java.lang.Integer.valueOf(((i >> 6) & 112) | 6));
        composer.endNode();
    }

    public static final androidx.compose.ui.layout.MeasurePolicy getDefaultColumnMeasurePolicy() {
        return getHighSpeedVideoSizes;
    }

    public static final androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.foundation.layout.ColumnMeasurePolicy columnMeasurePolicy;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1089876336, i, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:108)");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(vertical, androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop()) && kotlin.jvm.internal.Intrinsics.areEqual(horizontal, androidx.compose.ui.Alignment.INSTANCE.getStart())) {
            composer.startReplaceGroup(-1446604504);
            composer.endReplaceGroup();
            columnMeasurePolicy = getHighSpeedVideoSizes;
        } else {
            composer.startReplaceGroup(-1446550657);
            boolean z = true;
            boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(vertical)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !composer.changed(horizontal)) && (i & 48) != 32) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.foundation.layout.ColumnMeasurePolicy(vertical, horizontal);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            columnMeasurePolicy = (androidx.compose.foundation.layout.ColumnMeasurePolicy) rememberedValue;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return columnMeasurePolicy;
    }

    public static final long createColumnConstraints(boolean z, int i, int i2, int i3, int i4) {
        if (!z) {
            return androidx.compose.ui.unit.ConstraintsKt.Constraints(i2, i4, i, i3);
        }
        return androidx.compose.ui.unit.Constraints.INSTANCE.m8562fitPrioritizingHeightZbe2FdA(i2, i4, i, i3);
    }
}
