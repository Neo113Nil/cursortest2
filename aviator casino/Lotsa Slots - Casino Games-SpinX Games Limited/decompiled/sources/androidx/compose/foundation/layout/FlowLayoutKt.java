package androidx.compose.foundation.layout;

/* compiled from: FlowLayout.kt */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aT\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0087\b¢\u0006\u0002\u0010\u0012\u001aT\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0087\b¢\u0006\u0002\u0010\u0016\u001a%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\u001a\u001a\u0080\u0001\u0010\u001b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2#\u0010\u001f\u001a\u001f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u00112#\u0010!\u001a\u001f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u00112\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002\u001aF\u0010\u001b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002\u001aS\u0010(\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2#\u0010\u001f\u001a\u001f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u00112\u0006\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002\u001a\u0080\u0001\u0010*\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2#\u0010\u001f\u001a\u001f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u00112#\u0010!\u001a\u001f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u00112\u0006\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002\u001a%\u0010+\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\fH\u0001¢\u0006\u0002\u0010,\u001a6\u0010-\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010\u0019\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u001c\u00108\u001a\u00020\f*\u0002092\u0006\u00102\u001a\u0002032\u0006\u0010\u001f\u001a\u00020\fH\u0000\u001a\u0014\u0010!\u001a\u00020\f*\u00020:2\u0006\u00102\u001a\u000203H\u0000\u001a\u001c\u0010;\u001a\u00020\f*\u0002092\u0006\u00102\u001a\u0002032\u0006\u0010!\u001a\u00020\fH\u0000\u001a\u0014\u0010\u001f\u001a\u00020\f*\u00020:2\u0006\u00102\u001a\u000203H\u0000\u001a<\u0010<\u001a\u00020\f*\u0002092\u0006\u00104\u001a\u0002052\u0006\u00102\u001a\u0002032\u0014\u0010=\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0004\u0012\u00020\u00040\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b>\u0010?\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"CROSS_AXIS_ALIGNMENT_START", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "FlowColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "maxItemsInEachColumn", "", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/FlowRowScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "intrinsicCrossAxisSize", com.helpshift.proactive.InAppViewConstants.CHILDREN, "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "mainAxisSizes", "", "crossAxisSizes", "maxIntrinsicMainAxisSize", "crossAxisAvailable", "minIntrinsicMainAxisSize", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "breakDownItems", "Landroidx/compose/foundation/layout/FlowResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measureHelper", "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "breakDownItems-w1Onq5I", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;Landroidx/compose/foundation/layout/LayoutOrientation;JI)Landroidx/compose/foundation/layout/FlowResult;", "crossAxisMin", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "mainAxisMin", "measureAndCache", "storePlaceable", "measureAndCache-6m2dt9o", "(Landroidx/compose/ui/layout/Measurable;JLandroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function1;)I", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final androidx.compose.foundation.layout.CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP = androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(androidx.compose.ui.Alignment.INSTANCE.getTop());
    private static final androidx.compose.foundation.layout.CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START = androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(androidx.compose.ui.Alignment.INSTANCE.getStart());

    public static final void FlowRow(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, int i, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1098475987);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
        if ((i3 & 1) != 0) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            horizontal = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
        }
        if ((i3 & 4) != 0) {
            vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
        }
        if ((i3 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        int i4 = i2 >> 3;
        androidx.compose.ui.layout.MeasurePolicy rowMeasurementHelper = rowMeasurementHelper(horizontal, vertical, i, composer, (i4 & 896) | (i4 & 14) | (i4 & 112));
        composer.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier);
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurementHelper, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
        function3.invoke(androidx.compose.foundation.layout.FlowRowScopeInstance.INSTANCE, composer, java.lang.Integer.valueOf(((i2 >> 9) & 112) | 6));
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final void FlowColumn(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, int i, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-310290901);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(FlowColumn)P(3,4,1,2)116@4804L119,121@4928L137:FlowLayout.kt#2w3rfo");
        if ((i3 & 1) != 0) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
        }
        if ((i3 & 4) != 0) {
            horizontal = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
        }
        if ((i3 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        int i4 = i2 >> 3;
        androidx.compose.ui.layout.MeasurePolicy columnMeasurementHelper = columnMeasurementHelper(vertical, horizontal, i, composer, (i4 & 896) | (i4 & 14) | (i4 & 112));
        composer.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier);
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurementHelper, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -681937041, "C122@4980L9:FlowLayout.kt#2w3rfo");
        function3.invoke(androidx.compose.foundation.layout.FlowColumnScopeInstance.INSTANCE, composer, java.lang.Integer.valueOf(((i2 >> 9) & 112) | 6));
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final androidx.compose.ui.layout.MeasurePolicy rowMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, int i, androidx.compose.runtime.Composer composer, int i2) {
        composer.startReplaceableGroup(1479255111);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rowMeasurementHelper)P(!1,2)157@5820L584:FlowLayout.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1479255111, i2, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:156)");
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf) | composer.changed(horizontal) | composer.changed(vertical);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.layout.FlowMeasurePolicy(androidx.compose.foundation.layout.LayoutOrientation.Horizontal, horizontal, vertical, horizontal.getSpacing(), androidx.compose.foundation.layout.SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy = (androidx.compose.foundation.layout.FlowMeasurePolicy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return flowMeasurePolicy;
    }

    public static final androidx.compose.ui.layout.MeasurePolicy columnMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, int i, androidx.compose.runtime.Composer composer, int i2) {
        composer.startReplaceableGroup(-2013098357);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(columnMeasurementHelper)P(2)178@6629L585:FlowLayout.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2013098357, i2, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:177)");
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf) | composer.changed(vertical) | composer.changed(horizontal);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.layout.FlowMeasurePolicy(androidx.compose.foundation.layout.LayoutOrientation.Vertical, horizontal, vertical, vertical.getSpacing(), androidx.compose.foundation.layout.SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy = (androidx.compose.foundation.layout.FlowMeasurePolicy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return flowMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.IntIterator] */
    public static final int minIntrinsicMainAxisSize(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> function3, kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> function32, int i, int i2, int i3, int i4) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            iArr2[i6] = 0;
        }
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = list.get(i7);
            int intValue = function3.invoke(intrinsicMeasurable, java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(i)).intValue();
            iArr[i7] = intValue;
            iArr2[i7] = function32.invoke(intrinsicMeasurable, java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(intValue)).intValue();
        }
        int sum = kotlin.collections.ArraysKt.sum(iArr);
        if (size2 != 0) {
            int i8 = iArr2[0];
            ?? it = new kotlin.ranges.IntRange(1, kotlin.collections.ArraysKt.getLastIndex(iArr2)).iterator();
            while (it.hasNext()) {
                int i9 = iArr2[it.nextInt()];
                if (i8 < i9) {
                    i8 = i9;
                }
            }
            if (size != 0) {
                int i10 = iArr[0];
                ?? it2 = new kotlin.ranges.IntRange(1, kotlin.collections.ArraysKt.getLastIndex(iArr)).iterator();
                while (it2.hasNext()) {
                    int i11 = iArr[it2.nextInt()];
                    if (i10 < i11) {
                        i10 = i11;
                    }
                }
                int i12 = sum;
                while (i10 < i12 && i8 != i) {
                    int i13 = (i10 + i12) / 2;
                    i8 = intrinsicCrossAxisSize(list, iArr, iArr2, i13, i2, i3, i4);
                    if (i8 == i) {
                        return i13;
                    }
                    if (i8 > i) {
                        i10 = i13 + 1;
                    } else {
                        i12 = i13 - 1;
                    }
                    sum = i13;
                }
                return sum;
            }
            throw new java.util.NoSuchElementException();
        }
        throw new java.util.NoSuchElementException();
    }

    private static final int intrinsicCrossAxisSize(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, final int[] iArr, final int[] iArr2, int i, int i2, int i3, int i4) {
        return intrinsicCrossAxisSize(list, new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num, java.lang.Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                return java.lang.Integer.valueOf(iArr[i5]);
            }
        }, new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntrinsicMeasurable, java.lang.Integer, java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, java.lang.Integer num, java.lang.Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final java.lang.Integer invoke(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                return java.lang.Integer.valueOf(iArr2[i5]);
            }
        }, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicCrossAxisSize(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> function3, kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> function32, int i, int i2, int i3, int i4) {
        if (list.isEmpty()) {
            return 0;
        }
        java.lang.Object orNull = kotlin.collections.CollectionsKt.getOrNull(list, 0);
        androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) orNull;
        int intValue = intrinsicMeasurable != null ? function32.invoke(intrinsicMeasurable, 0, java.lang.Integer.valueOf(i)).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? function3.invoke(intrinsicMeasurable, 0, java.lang.Integer.valueOf(intValue)).intValue() : 0;
        int size = list.size();
        int i5 = i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < size) {
            list.get(i6);
            kotlin.jvm.internal.Intrinsics.checkNotNull(orNull);
            i5 -= intValue2;
            int max = java.lang.Math.max(i8, intValue);
            i6++;
            java.lang.Object orNull2 = kotlin.collections.CollectionsKt.getOrNull(list, i6);
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = (androidx.compose.ui.layout.IntrinsicMeasurable) orNull2;
            int intValue3 = intrinsicMeasurable2 != null ? function32.invoke(intrinsicMeasurable2, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i)).intValue() : 0;
            int intValue4 = intrinsicMeasurable2 != null ? function3.invoke(intrinsicMeasurable2, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(intValue3)).intValue() + i2 : 0;
            if (i5 >= 0 && i6 != list.size()) {
                if (i6 - i9 != i4 && i5 - intValue4 >= 0) {
                    int i10 = intValue3;
                    i8 = max;
                    orNull = orNull2;
                    intValue2 = intValue4;
                    intValue = i10;
                }
            }
            i7 += max + i3;
            intValue4 -= i2;
            i5 = i;
            i9 = i6;
            max = 0;
            int i102 = intValue3;
            i8 = max;
            orNull = orNull2;
            intValue2 = intValue4;
            intValue = i102;
        }
        return i7 - i3;
    }

    public static final int mainAxisMin(androidx.compose.ui.layout.Measurable measurable, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation, int i) {
        if (layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicWidth(i);
        }
        return measurable.minIntrinsicHeight(i);
    }

    public static final int crossAxisMin(androidx.compose.ui.layout.Measurable measurable, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation, int i) {
        if (layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicHeight(i);
        }
        return measurable.minIntrinsicWidth(i);
    }

    public static final int mainAxisSize(androidx.compose.ui.layout.Placeable placeable, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation) {
        return layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    public static final int crossAxisSize(androidx.compose.ui.layout.Placeable placeable, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation) {
        return layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: measureAndCache-6m2dt9o, reason: not valid java name */
    private static final int m513measureAndCache6m2dt9o(androidx.compose.ui.layout.Measurable measurable, long j, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable, kotlin.Unit> function1) {
        if (androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(androidx.compose.foundation.layout.OrientationIndependentConstraints.m550toBoxConstraintsOenEA2s(androidx.compose.foundation.layout.OrientationIndependentConstraints.m539copyyUG9Ft0$default(j, 0, 0, 0, 0, 14, null), layoutOrientation));
            function1.invoke(mo3402measureBRTryo0);
            return mainAxisSize(mo3402measureBRTryo0, layoutOrientation);
        }
        return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> function3, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = function3.invoke(list.get(i4), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i)).intValue() + i2;
            int i8 = i4 + 1;
            if (i8 - i6 == i3 || i8 == list.size()) {
                i5 = java.lang.Math.max(i5, (i7 + intValue) - i2);
                i6 = i4;
                i7 = 0;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    /* renamed from: breakDownItems-w1Onq5I, reason: not valid java name */
    public static final androidx.compose.foundation.layout.FlowResult m512breakDownItemsw1Onq5I(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.foundation.layout.RowColumnMeasurementHelper rowColumnMeasurementHelper, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation, long j, int i) {
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.foundation.layout.RowColumnMeasureHelperResult[16], 0);
        int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
        int m4426getMinWidthimpl = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j);
        int m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
        java.util.List<androidx.compose.ui.layout.Measurable> measurables = rowColumnMeasurementHelper.getMeasurables();
        final androidx.compose.ui.layout.Placeable[] placeables = rowColumnMeasurementHelper.getPlaceables();
        int ceil = (int) java.lang.Math.ceil(measureScope.mo315toPx0680j_4(rowColumnMeasurementHelper.getArrangementSpacing()));
        long m535constructorimpl = androidx.compose.foundation.layout.OrientationIndependentConstraints.m535constructorimpl(m4426getMinWidthimpl, m4424getMaxWidthimpl, 0, m4423getMaxHeightimpl);
        androidx.compose.ui.layout.Measurable measurable = (androidx.compose.ui.layout.Measurable) kotlin.collections.CollectionsKt.getOrNull(measurables, 0);
        java.lang.Integer valueOf = measurable != null ? java.lang.Integer.valueOf(m513measureAndCache6m2dt9o(measurable, m535constructorimpl, layoutOrientation, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable placeable) {
                invoke2(placeable);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable placeable) {
                placeables[0] = placeable;
            }
        })) : null;
        java.lang.Integer[] numArr = new java.lang.Integer[measurables.size()];
        int size = measurables.size();
        int i2 = m4424getMaxWidthimpl;
        final int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
            int intValue = valueOf.intValue();
            int i7 = i4 + intValue;
            i2 -= intValue;
            int i8 = i3 + 1;
            androidx.compose.ui.layout.Measurable measurable2 = (androidx.compose.ui.layout.Measurable) kotlin.collections.CollectionsKt.getOrNull(measurables, i8);
            int i9 = size;
            java.lang.Integer valueOf2 = measurable2 != null ? java.lang.Integer.valueOf(m513measureAndCache6m2dt9o(measurable2, m535constructorimpl, layoutOrientation, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable placeable) {
                    invoke2(placeable);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.Placeable placeable) {
                    placeables[i3 + 1] = placeable;
                }
            }) + ceil) : null;
            if (i8 < measurables.size() && i8 - i5 < i) {
                if (i2 - (valueOf2 != null ? valueOf2.intValue() : 0) >= 0) {
                    i3 = i8;
                    size = i9;
                    valueOf = valueOf2;
                    i4 = i7;
                }
            }
            m4426getMinWidthimpl = java.lang.Math.min(java.lang.Math.max(m4426getMinWidthimpl, i7), m4424getMaxWidthimpl);
            numArr[i6] = java.lang.Integer.valueOf(i8);
            i6++;
            valueOf2 = valueOf2 != null ? java.lang.Integer.valueOf(valueOf2.intValue() - ceil) : null;
            i2 = m4424getMaxWidthimpl;
            i5 = i8;
            i7 = 0;
            i3 = i8;
            size = i9;
            valueOf = valueOf2;
            i4 = i7;
        }
        long m550toBoxConstraintsOenEA2s = androidx.compose.foundation.layout.OrientationIndependentConstraints.m550toBoxConstraintsOenEA2s(androidx.compose.foundation.layout.OrientationIndependentConstraints.m539copyyUG9Ft0$default(m535constructorimpl, m4426getMinWidthimpl, 0, 0, 0, 14, null), layoutOrientation);
        int i10 = 0;
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.ArraysKt.getOrNull(numArr, 0);
        int i11 = 0;
        int i12 = m4426getMinWidthimpl;
        int i13 = 0;
        while (num != null) {
            java.lang.Integer[] numArr2 = numArr;
            androidx.compose.foundation.layout.RowColumnMeasureHelperResult m597measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m597measureWithoutPlacing_EkL_Y(measureScope, m550toBoxConstraintsOenEA2s, i11, num.intValue());
            i10 += m597measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            i12 = java.lang.Math.max(i12, m597measureWithoutPlacing_EkL_Y.getMainAxisSize());
            mutableVector.add(m597measureWithoutPlacing_EkL_Y);
            i11 = num.intValue();
            i13++;
            num = (java.lang.Integer) kotlin.collections.ArraysKt.getOrNull(numArr2, i13);
            numArr = numArr2;
        }
        return new androidx.compose.foundation.layout.FlowResult(java.lang.Math.max(i12, androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j)), java.lang.Math.max(i10, androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j)), mutableVector);
    }
}
