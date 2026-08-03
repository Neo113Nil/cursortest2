package androidx.compose.material;

/* compiled from: NavigationRail.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0091\u0001\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u00162\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u001d2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u00162\b\b\u0002\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a=\u0010*\u001a\u00020\f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\f0\u001f¢\u0006\u0002\b\u00162\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u00162\u0006\u0010+\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010,\u001aU\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2&\u0010\u0018\u001a\"\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a)\u00105\u001a\u000206*\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=\u001a9\u0010>\u001a\u000206*\u0002072\u0006\u0010?\u001a\u0002092\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010+\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010A\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"HeaderPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ItemIconTopOffset", "ItemLabelBaselineBottomOffset", "NavigationRailAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "NavigationRailItemCompactSize", "NavigationRailItemSize", "NavigationRailPadding", "NavigationRail", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", "onClick", "Lkotlin/Function0;", "icon", "enabled", "label", "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItemBaselineLayout", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "NavigationRailTransition", "activeColor", "inactiveColor", "Lkotlin/ParameterName;", "name", "animationProgress", "NavigationRailTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailKt {
    private static final float HeaderPadding;
    private static final float NavigationRailPadding;
    private static final androidx.compose.animation.core.TweenSpec<java.lang.Float> NavigationRailAnimationSpec = new androidx.compose.animation.core.TweenSpec<>(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float NavigationRailItemSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(72);
    private static final float NavigationRailItemCompactSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(56);
    private static final float ItemLabelBaselineBottomOffset = androidx.compose.ui.unit.Dp.m4478constructorimpl(16);
    private static final float ItemIconTopOffset = androidx.compose.ui.unit.Dp.m4478constructorimpl(14);

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008e  */
    /* renamed from: NavigationRail-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1436NavigationRailHsRjFd4(androidx.compose.ui.Modifier modifier, long j, long j2, float f, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        int i5;
        final androidx.compose.ui.Modifier.Companion companion;
        final int i6;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        float f3;
        final float f4;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        final long j5;
        final long j6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1790971523);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRail)P(5,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp,4)94@4333L6,95@4375L32,100@4577L552:NavigationRail.kt#jmzs0o");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                function32 = function3;
                i3 |= startRestartGroup.changed(function32) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(content) ? 131072 : 65536;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i9 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1319getSurface0d7_KjU();
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i10 != 0) {
                                f2 = androidx.compose.material.NavigationRailDefaults.INSTANCE.m1435getElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                i6 = i3;
                                function33 = null;
                                f3 = f2;
                                startRestartGroup.endDefaults();
                                int i11 = i6 << 3;
                                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j3, j4, null, f3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                        invoke(composer2, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                                        float f5;
                                        float f6;
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C106@4731L392:NavigationRail.kt#jmzs0o");
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                            f5 = androidx.compose.material.NavigationRailKt.NavigationRailPadding;
                                            androidx.compose.ui.Modifier selectableGroup = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.layout.PaddingKt.m570paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f5, 1, null));
                                            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function33;
                                            int i13 = i6;
                                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function36 = content;
                                            composer2.startReplaceableGroup(-483455358);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume = composer2.consume(localDensity);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume2 = composer2.consume(localLayoutDirection);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume3 = composer2.consume(localViewConfiguration);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(selectableGroup);
                                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            composer2.disableReusing();
                                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer2.enableReusing();
                                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            composer2.startReplaceableGroup(-1163856341);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(-497173955);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C117@5104L9:NavigationRail.kt#jmzs0o");
                                            composer2.startReplaceableGroup(65525382);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "114@5014L8,115@5039L38");
                                            if (function35 != null) {
                                                function35.invoke(columnScopeInstance, composer2, java.lang.Integer.valueOf(((i13 >> 9) & 112) | 6));
                                                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                                f6 = androidx.compose.material.NavigationRailKt.HeaderPadding;
                                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(companion2, f6), composer2, 6);
                                            }
                                            composer2.endReplaceableGroup();
                                            function36.invoke(columnScopeInstance, composer2, java.lang.Integer.valueOf(6 | ((i13 >> 12) & 112)));
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, (i6 & 14) | 1572864 | (i11 & 896) | (i11 & 7168) | ((i6 << 6) & 458752), 18);
                                long j7 = j4;
                                f4 = f3;
                                function34 = function33;
                                j5 = j3;
                                j6 = j7;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            companion = modifier2;
                        }
                        i6 = i3;
                        f3 = f2;
                        function33 = function32;
                        startRestartGroup.endDefaults();
                        int i112 = i6 << 3;
                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j3, j4, null, f3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                                float f5;
                                float f6;
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C106@4731L392:NavigationRail.kt#jmzs0o");
                                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                    androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                    f5 = androidx.compose.material.NavigationRailKt.NavigationRailPadding;
                                    androidx.compose.ui.Modifier selectableGroup = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.layout.PaddingKt.m570paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f5, 1, null));
                                    androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function33;
                                    int i13 = i6;
                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function36 = content;
                                    composer2.startReplaceableGroup(-483455358);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume = composer2.consume(localDensity);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume2 = composer2.consume(localLayoutDirection);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume3 = composer2.consume(localViewConfiguration);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(selectableGroup);
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-1163856341);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(-497173955);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C117@5104L9:NavigationRail.kt#jmzs0o");
                                    composer2.startReplaceableGroup(65525382);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "114@5014L8,115@5039L38");
                                    if (function35 != null) {
                                        function35.invoke(columnScopeInstance, composer2, java.lang.Integer.valueOf(((i13 >> 9) & 112) | 6));
                                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                        f6 = androidx.compose.material.NavigationRailKt.HeaderPadding;
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(companion2, f6), composer2, 6);
                                    }
                                    composer2.endReplaceableGroup();
                                    function36.invoke(columnScopeInstance, composer2, java.lang.Integer.valueOf(6 | ((i13 >> 12) & 112)));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i6 & 14) | 1572864 | (i112 & 896) | (i112 & 7168) | ((i6 << 6) & 458752), 18);
                        long j72 = j4;
                        f4 = f3;
                        function34 = function33;
                        j5 = j3;
                        j6 = j72;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        j5 = j3;
                        j6 = j4;
                        f4 = f2;
                        function34 = function32;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                            androidx.compose.material.NavigationRailKt.m1436NavigationRailHsRjFd4(androidx.compose.ui.Modifier.this, j5, j6, f4, function34, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i5 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i5;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                i6 = i3;
                f3 = f2;
                function33 = function32;
                startRestartGroup.endDefaults();
                int i1122 = i6 << 3;
                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j3, j4, null, f3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                        float f5;
                        float f6;
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C106@4731L392:NavigationRail.kt#jmzs0o");
                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                            androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            f5 = androidx.compose.material.NavigationRailKt.NavigationRailPadding;
                            androidx.compose.ui.Modifier selectableGroup = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.layout.PaddingKt.m570paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f5, 1, null));
                            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function33;
                            int i13 = i6;
                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function36 = content;
                            composer2.startReplaceableGroup(-483455358);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume = composer2.consume(localDensity);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume2 = composer2.consume(localLayoutDirection);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume3 = composer2.consume(localViewConfiguration);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(selectableGroup);
                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1163856341);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-497173955);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C117@5104L9:NavigationRail.kt#jmzs0o");
                            composer2.startReplaceableGroup(65525382);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "114@5014L8,115@5039L38");
                            if (function35 != null) {
                                function35.invoke(columnScopeInstance, composer2, java.lang.Integer.valueOf(((i13 >> 9) & 112) | 6));
                                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                f6 = androidx.compose.material.NavigationRailKt.HeaderPadding;
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(companion2, f6), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function36.invoke(columnScopeInstance, composer2, java.lang.Integer.valueOf(6 | ((i13 >> 12) & 112)));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i6 & 14) | 1572864 | (i1122 & 896) | (i1122 & 7168) | ((i6 << 6) & 458752), 18);
                long j722 = j4;
                f4 = f3;
                function34 = function33;
                j5 = j3;
                j6 = j722;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function32 = function3;
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            i6 = i3;
            f3 = f2;
            function33 = function32;
            startRestartGroup.endDefaults();
            int i11222 = i6 << 3;
            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j3, j4, null, f3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                    float f5;
                    float f6;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C106@4731L392:NavigationRail.kt#jmzs0o");
                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                        androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        f5 = androidx.compose.material.NavigationRailKt.NavigationRailPadding;
                        androidx.compose.ui.Modifier selectableGroup = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.layout.PaddingKt.m570paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f5, 1, null));
                        androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function33;
                        int i13 = i6;
                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function36 = content;
                        composer2.startReplaceableGroup(-483455358);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume = composer2.consume(localDensity);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume2 = composer2.consume(localLayoutDirection);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume3 = composer2.consume(localViewConfiguration);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(selectableGroup);
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1163856341);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-497173955);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C117@5104L9:NavigationRail.kt#jmzs0o");
                        composer2.startReplaceableGroup(65525382);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "114@5014L8,115@5039L38");
                        if (function35 != null) {
                            function35.invoke(columnScopeInstance, composer2, java.lang.Integer.valueOf(((i13 >> 9) & 112) | 6));
                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            f6 = androidx.compose.material.NavigationRailKt.HeaderPadding;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(companion2, f6), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function36.invoke(columnScopeInstance, composer2, java.lang.Integer.valueOf(6 | ((i13 >> 12) & 112)));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i6 & 14) | 1572864 | (i11222 & 896) | (i11222 & 7168) | ((i6 << 6) & 458752), 18);
            long j7222 = j4;
            f4 = f3;
            function34 = function33;
            j5 = j3;
            j6 = j7222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function32 = function3;
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        i6 = i3;
        f3 = f2;
        function33 = function32;
        startRestartGroup.endDefaults();
        int i112222 = i6 << 3;
        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j3, j4, null, f3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                float f5;
                float f6;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C106@4731L392:NavigationRail.kt#jmzs0o");
                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                    androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    f5 = androidx.compose.material.NavigationRailKt.NavigationRailPadding;
                    androidx.compose.ui.Modifier selectableGroup = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.layout.PaddingKt.m570paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f5, 1, null));
                    androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function33;
                    int i13 = i6;
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function36 = content;
                    composer2.startReplaceableGroup(-483455358);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume = composer2.consume(localDensity);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume2 = composer2.consume(localLayoutDirection);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume3 = composer2.consume(localViewConfiguration);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(selectableGroup);
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1163856341);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-497173955);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C117@5104L9:NavigationRail.kt#jmzs0o");
                    composer2.startReplaceableGroup(65525382);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "114@5014L8,115@5039L38");
                    if (function35 != null) {
                        function35.invoke(columnScopeInstance, composer2, java.lang.Integer.valueOf(((i13 >> 9) & 112) | 6));
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        f6 = androidx.compose.material.NavigationRailKt.HeaderPadding;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(companion2, f6), composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    function36.invoke(columnScopeInstance, composer2, java.lang.Integer.valueOf(6 | ((i13 >> 12) & 112)));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i6 & 14) | 1572864 | (i112222 & 896) | (i112222 & 7168) | ((i6 << 6) & 458752), 18);
        long j72222 = j4;
        f4 = f3;
        function34 = function33;
        j5 = j3;
        j6 = j72222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ce  */
    /* renamed from: NavigationRailItem-0S3VyRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1437NavigationRailItem0S3VyRs(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> icon, androidx.compose.ui.Modifier modifier, boolean z2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, boolean z3, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, long j, long j2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        int i6;
        final boolean z5;
        int i7;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        long j3;
        long m2112copywmQWz5c$default;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z6;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        final boolean z7;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        final long j4;
        final long j5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "icon");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1813548445);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailItem)P(7,6,2,5,1,4!2,8:c#ui.graphics.Color,9:c#ui.graphics.Color)154@6931L39,155@7020L6,156@7090L7,156@7124L6,171@7922L83,175@8010L791:NavigationRail.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    function22 = function2;
                    i3 |= startRestartGroup.changed(function22) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        z5 = z3;
                        i3 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i3 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        }
                        if ((i & 234881024) == 0) {
                            if ((i2 & 256) == 0 && startRestartGroup.changed(j)) {
                                i9 = androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i3 |= i9;
                            }
                            i9 = 33554432;
                            i3 |= i9;
                        }
                        if ((i & 1879048192) == 0) {
                            if ((i2 & 512) == 0 && startRestartGroup.changed(j2)) {
                                i8 = 536870912;
                                i3 |= i8;
                            }
                            i8 = 268435456;
                            i3 |= i8;
                        }
                        if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i5 != 0) {
                                    function22 = null;
                                }
                                if (i6 != 0) {
                                    z5 = true;
                                }
                                if (i7 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i2 & 256) != 0) {
                                    j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1315getPrimary0d7_KjU();
                                    i3 &= -234881025;
                                } else {
                                    j3 = j;
                                }
                                if ((i2 & 512) != 0) {
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume = startRestartGroup.consume(localContentColor);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    m2112copywmQWz5c$default = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(((androidx.compose.ui.graphics.Color) consume).m2123unboximpl(), androidx.compose.material.ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i3 &= -1879048193;
                                    startRestartGroup.endDefaults();
                                    final androidx.compose.runtime.internal.ComposableLambda composableLambda = function22 != null ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                            invoke(composer2, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.runtime.Composer composer2, int i11) {
                                            androidx.compose.ui.text.TextStyle m3986copyHL5avdY;
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C160@7258L10,161@7324L40:NavigationRail.kt#jmzs0o");
                                            if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                            } else {
                                                m3986copyHL5avdY = r3.m3986copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m3923getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? androidx.compose.ui.text.style.TextAlign.m4353boximpl(r3.paragraphStyle.getTextAlign()) : androidx.compose.ui.text.style.TextAlign.m4353boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk()), (r42 & 32768) != 0 ? androidx.compose.ui.text.style.TextDirection.m4367boximpl(r3.paragraphStyle.getTextDirection()) : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption().paragraphStyle.getTextIndent() : null);
                                                androidx.compose.material.TextKt.ProvideTextStyle(m3986copyHL5avdY, function22, composer2, (i3 >> 12) & 112);
                                            }
                                        }
                                    }) : null;
                                    androidx.compose.ui.Modifier m617size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(companion, z, mutableInteractionSource2, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick), function22 != null ? NavigationRailItemCompactSize : NavigationRailItemSize);
                                    androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                                    startRestartGroup.startReplaceableGroup(733328855);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                                    startRestartGroup.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume2 = startRestartGroup.consume(localDensity);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume2;
                                    androidx.compose.ui.Modifier modifier4 = companion;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume3 = startRestartGroup.consume(localLayoutDirection);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume4 = startRestartGroup.consume(localViewConfiguration);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m617size3ABfNKs);
                                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (!startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    startRestartGroup.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    startRestartGroup.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                    startRestartGroup.startReplaceableGroup(2058660585);
                                    startRestartGroup.startReplaceableGroup(-2137368960);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    startRestartGroup.startReplaceableGroup(-172871267);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C187@8378L417:NavigationRail.kt#jmzs0o");
                                    int i11 = i3 >> 24;
                                    m1438NavigationRailTransitionKlgxPg(j3, m2112copywmQWz5c$default, z, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new kotlin.jvm.functions.Function3<java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                            invoke(f.floatValue(), composer2, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(float f, androidx.compose.runtime.Composer composer2, int i12) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C194@8606L179:NavigationRail.kt#jmzs0o");
                                            if ((i12 & 14) == 0) {
                                                i12 |= composer2.changed(f) ? 4 : 2;
                                            }
                                            if ((i12 & 91) != 18 || !composer2.getSkipping()) {
                                                if (z5) {
                                                    f = 1.0f;
                                                }
                                                androidx.compose.material.NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f, composer2, (i3 >> 6) & 14);
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), startRestartGroup, (i11 & 112) | (i11 & 14) | 3072 | ((i3 << 6) & 896));
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endNode();
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    modifier3 = modifier4;
                                    z6 = z4;
                                    function23 = function22;
                                    z7 = z5;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    j4 = j3;
                                    j5 = m2112copywmQWz5c$default;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                if ((i2 & 512) != 0) {
                                    i3 &= -1879048193;
                                }
                                companion = modifier;
                                mutableInteractionSource2 = mutableInteractionSource;
                                j3 = j;
                            }
                            m2112copywmQWz5c$default = j2;
                            startRestartGroup.endDefaults();
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda2 = function22 != null ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i112) {
                                    androidx.compose.ui.text.TextStyle m3986copyHL5avdY;
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C160@7258L10,161@7324L40:NavigationRail.kt#jmzs0o");
                                    if ((i112 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        m3986copyHL5avdY = r3.m3986copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m3923getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? androidx.compose.ui.text.style.TextAlign.m4353boximpl(r3.paragraphStyle.getTextAlign()) : androidx.compose.ui.text.style.TextAlign.m4353boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk()), (r42 & 32768) != 0 ? androidx.compose.ui.text.style.TextDirection.m4367boximpl(r3.paragraphStyle.getTextDirection()) : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption().paragraphStyle.getTextIndent() : null);
                                        androidx.compose.material.TextKt.ProvideTextStyle(m3986copyHL5avdY, function22, composer2, (i3 >> 12) & 112);
                                    }
                                }
                            }) : null;
                            androidx.compose.ui.Modifier m617size3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(companion, z, mutableInteractionSource2, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick), function22 != null ? NavigationRailItemCompactSize : NavigationRailItemSize);
                            androidx.compose.ui.Alignment center2 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                            startRestartGroup.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume22 = startRestartGroup.consume(localDensity2);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume22;
                            androidx.compose.ui.Modifier modifier42 = companion;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume32 = startRestartGroup.consume(localLayoutDirection2);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume32;
                            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume42 = startRestartGroup.consume(localViewConfiguration2);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume42;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(m617size3ABfNKs2);
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            startRestartGroup.disableReusing();
                            androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            startRestartGroup.enableReusing();
                            materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            startRestartGroup.startReplaceableGroup(-2137368960);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-172871267);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C187@8378L417:NavigationRail.kt#jmzs0o");
                            int i112 = i3 >> 24;
                            m1438NavigationRailTransitionKlgxPg(j3, m2112copywmQWz5c$default, z, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new kotlin.jvm.functions.Function3<java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(f.floatValue(), composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(float f, androidx.compose.runtime.Composer composer2, int i12) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C194@8606L179:NavigationRail.kt#jmzs0o");
                                    if ((i12 & 14) == 0) {
                                        i12 |= composer2.changed(f) ? 4 : 2;
                                    }
                                    if ((i12 & 91) != 18 || !composer2.getSkipping()) {
                                        if (z5) {
                                            f = 1.0f;
                                        }
                                        androidx.compose.material.NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda2, f, composer2, (i3 >> 6) & 14);
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, (i112 & 112) | (i112 & 14) | 3072 | ((i3 << 6) & 896));
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            modifier3 = modifier42;
                            z6 = z4;
                            function23 = function22;
                            z7 = z5;
                            mutableInteractionSource3 = mutableInteractionSource42;
                            j4 = j3;
                            j5 = m2112copywmQWz5c$default;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z6 = z4;
                            function23 = function22;
                            z7 = z5;
                            mutableInteractionSource3 = mutableInteractionSource;
                            j4 = j;
                            j5 = j2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                                androidx.compose.material.NavigationRailKt.m1437NavigationRailItem0S3VyRs(z, onClick, icon, modifier3, z6, function23, z7, mutableInteractionSource3, j4, j5, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    z5 = z3;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i & 234881024) == 0) {
                    }
                    if ((i & 1879048192) == 0) {
                    }
                    if ((i3 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    if ((i2 & 512) != 0) {
                    }
                    m2112copywmQWz5c$default = j2;
                    startRestartGroup.endDefaults();
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda22 = function22 != null ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i1122) {
                            androidx.compose.ui.text.TextStyle m3986copyHL5avdY;
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C160@7258L10,161@7324L40:NavigationRail.kt#jmzs0o");
                            if ((i1122 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                m3986copyHL5avdY = r3.m3986copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m3923getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? androidx.compose.ui.text.style.TextAlign.m4353boximpl(r3.paragraphStyle.getTextAlign()) : androidx.compose.ui.text.style.TextAlign.m4353boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk()), (r42 & 32768) != 0 ? androidx.compose.ui.text.style.TextDirection.m4367boximpl(r3.paragraphStyle.getTextDirection()) : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption().paragraphStyle.getTextIndent() : null);
                                androidx.compose.material.TextKt.ProvideTextStyle(m3986copyHL5avdY, function22, composer2, (i3 >> 12) & 112);
                            }
                        }
                    }) : null;
                    androidx.compose.ui.Modifier m617size3ABfNKs22 = androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(companion, z, mutableInteractionSource2, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick), function22 != null ? NavigationRailItemCompactSize : NavigationRailItemSize);
                    androidx.compose.ui.Alignment center22 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                    startRestartGroup.startReplaceableGroup(733328855);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume222 = startRestartGroup.consume(localDensity22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.ui.unit.Density density22 = (androidx.compose.ui.unit.Density) consume222;
                    androidx.compose.ui.Modifier modifier422 = companion;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume322 = startRestartGroup.consume(localLayoutDirection22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection22 = (androidx.compose.ui.unit.LayoutDirection) consume322;
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume422 = startRestartGroup.consume(localViewConfiguration22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration22 = (androidx.compose.ui.platform.ViewConfiguration) consume422;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf22 = androidx.compose.ui.layout.LayoutKt.materializerOf(m617size3ABfNKs22);
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    startRestartGroup.disableReusing();
                    androidx.compose.runtime.Composer m1641constructorimpl22 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, rememberBoxMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, density22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, layoutDirection22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, viewConfiguration22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-172871267);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C187@8378L417:NavigationRail.kt#jmzs0o");
                    int i1122 = i3 >> 24;
                    m1438NavigationRailTransitionKlgxPg(j3, m2112copywmQWz5c$default, z, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new kotlin.jvm.functions.Function3<java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(f.floatValue(), composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(float f, androidx.compose.runtime.Composer composer2, int i12) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C194@8606L179:NavigationRail.kt#jmzs0o");
                            if ((i12 & 14) == 0) {
                                i12 |= composer2.changed(f) ? 4 : 2;
                            }
                            if ((i12 & 91) != 18 || !composer2.getSkipping()) {
                                if (z5) {
                                    f = 1.0f;
                                }
                                androidx.compose.material.NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda22, f, composer2, (i3 >> 6) & 14);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, (i1122 & 112) | (i1122 & 14) | 3072 | ((i3 << 6) & 896));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    modifier3 = modifier422;
                    z6 = z4;
                    function23 = function22;
                    z7 = z5;
                    mutableInteractionSource3 = mutableInteractionSource422;
                    j4 = j3;
                    j5 = m2112copywmQWz5c$default;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function22 = function2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z5 = z3;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((i & 1879048192) == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                m2112copywmQWz5c$default = j2;
                startRestartGroup.endDefaults();
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda222 = function22 != null ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i11222) {
                        androidx.compose.ui.text.TextStyle m3986copyHL5avdY;
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C160@7258L10,161@7324L40:NavigationRail.kt#jmzs0o");
                        if ((i11222 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            m3986copyHL5avdY = r3.m3986copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m3923getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? androidx.compose.ui.text.style.TextAlign.m4353boximpl(r3.paragraphStyle.getTextAlign()) : androidx.compose.ui.text.style.TextAlign.m4353boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk()), (r42 & 32768) != 0 ? androidx.compose.ui.text.style.TextDirection.m4367boximpl(r3.paragraphStyle.getTextDirection()) : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption().paragraphStyle.getTextIndent() : null);
                            androidx.compose.material.TextKt.ProvideTextStyle(m3986copyHL5avdY, function22, composer2, (i3 >> 12) & 112);
                        }
                    }
                }) : null;
                androidx.compose.ui.Modifier m617size3ABfNKs222 = androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(companion, z, mutableInteractionSource2, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick), function22 != null ? NavigationRailItemCompactSize : NavigationRailItemSize);
                androidx.compose.ui.Alignment center222 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume2222 = startRestartGroup.consume(localDensity222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.Density density222 = (androidx.compose.ui.unit.Density) consume2222;
                androidx.compose.ui.Modifier modifier4222 = companion;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume3222 = startRestartGroup.consume(localLayoutDirection222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.LayoutDirection layoutDirection222 = (androidx.compose.ui.unit.LayoutDirection) consume3222;
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume4222 = startRestartGroup.consume(localViewConfiguration222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration222 = (androidx.compose.ui.platform.ViewConfiguration) consume4222;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf222 = androidx.compose.ui.layout.LayoutKt.materializerOf(m617size3ABfNKs222);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                androidx.compose.runtime.Composer m1641constructorimpl222 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, rememberBoxMeasurePolicy222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, density222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, layoutDirection222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl222, viewConfiguration222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-172871267);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C187@8378L417:NavigationRail.kt#jmzs0o");
                int i11222 = i3 >> 24;
                m1438NavigationRailTransitionKlgxPg(j3, m2112copywmQWz5c$default, z, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new kotlin.jvm.functions.Function3<java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(f.floatValue(), composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(float f, androidx.compose.runtime.Composer composer2, int i12) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C194@8606L179:NavigationRail.kt#jmzs0o");
                        if ((i12 & 14) == 0) {
                            i12 |= composer2.changed(f) ? 4 : 2;
                        }
                        if ((i12 & 91) != 18 || !composer2.getSkipping()) {
                            if (z5) {
                                f = 1.0f;
                            }
                            androidx.compose.material.NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda222, f, composer2, (i3 >> 6) & 14);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i11222 & 112) | (i11222 & 14) | 3072 | ((i3 << 6) & 896));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                modifier3 = modifier4222;
                z6 = z4;
                function23 = function22;
                z7 = z5;
                mutableInteractionSource3 = mutableInteractionSource4222;
                j4 = j3;
                j5 = m2112copywmQWz5c$default;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function22 = function2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z5 = z3;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            m2112copywmQWz5c$default = j2;
            startRestartGroup.endDefaults();
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda2222 = function22 != null ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i112222) {
                    androidx.compose.ui.text.TextStyle m3986copyHL5avdY;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C160@7258L10,161@7324L40:NavigationRail.kt#jmzs0o");
                    if ((i112222 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        m3986copyHL5avdY = r3.m3986copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m3923getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? androidx.compose.ui.text.style.TextAlign.m4353boximpl(r3.paragraphStyle.getTextAlign()) : androidx.compose.ui.text.style.TextAlign.m4353boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk()), (r42 & 32768) != 0 ? androidx.compose.ui.text.style.TextDirection.m4367boximpl(r3.paragraphStyle.getTextDirection()) : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption().paragraphStyle.getTextIndent() : null);
                        androidx.compose.material.TextKt.ProvideTextStyle(m3986copyHL5avdY, function22, composer2, (i3 >> 12) & 112);
                    }
                }
            }) : null;
            androidx.compose.ui.Modifier m617size3ABfNKs2222 = androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(companion, z, mutableInteractionSource2, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick), function22 != null ? NavigationRailItemCompactSize : NavigationRailItemSize);
            androidx.compose.ui.Alignment center2222 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume22222 = startRestartGroup.consume(localDensity2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density2222 = (androidx.compose.ui.unit.Density) consume22222;
            androidx.compose.ui.Modifier modifier42222 = companion;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume32222 = startRestartGroup.consume(localLayoutDirection2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection2222 = (androidx.compose.ui.unit.LayoutDirection) consume32222;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume42222 = startRestartGroup.consume(localViewConfiguration2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration2222 = (androidx.compose.ui.platform.ViewConfiguration) consume42222;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2222 = androidx.compose.ui.layout.LayoutKt.materializerOf(m617size3ABfNKs2222);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            androidx.compose.runtime.Composer m1641constructorimpl2222 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, rememberBoxMeasurePolicy2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, density2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, layoutDirection2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2222, viewConfiguration2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-172871267);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C187@8378L417:NavigationRail.kt#jmzs0o");
            int i112222 = i3 >> 24;
            m1438NavigationRailTransitionKlgxPg(j3, m2112copywmQWz5c$default, z, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new kotlin.jvm.functions.Function3<java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(f.floatValue(), composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(float f, androidx.compose.runtime.Composer composer2, int i12) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C194@8606L179:NavigationRail.kt#jmzs0o");
                    if ((i12 & 14) == 0) {
                        i12 |= composer2.changed(f) ? 4 : 2;
                    }
                    if ((i12 & 91) != 18 || !composer2.getSkipping()) {
                        if (z5) {
                            f = 1.0f;
                        }
                        androidx.compose.material.NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda2222, f, composer2, (i3 >> 6) & 14);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i112222 & 112) | (i112222 & 14) | 3072 | ((i3 << 6) & 896));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            modifier3 = modifier42222;
            z6 = z4;
            function23 = function22;
            z7 = z5;
            mutableInteractionSource3 = mutableInteractionSource42222;
            j4 = j3;
            j5 = m2112copywmQWz5c$default;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function22 = function2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z5 = z3;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        m2112copywmQWz5c$default = j2;
        startRestartGroup.endDefaults();
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composableLambda22222 = function22 != null ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i1122222) {
                androidx.compose.ui.text.TextStyle m3986copyHL5avdY;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C160@7258L10,161@7324L40:NavigationRail.kt#jmzs0o");
                if ((i1122222 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    m3986copyHL5avdY = r3.m3986copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m3923getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? androidx.compose.ui.text.style.TextAlign.m4353boximpl(r3.paragraphStyle.getTextAlign()) : androidx.compose.ui.text.style.TextAlign.m4353boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk()), (r42 & 32768) != 0 ? androidx.compose.ui.text.style.TextDirection.m4367boximpl(r3.paragraphStyle.getTextDirection()) : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption().paragraphStyle.getTextIndent() : null);
                    androidx.compose.material.TextKt.ProvideTextStyle(m3986copyHL5avdY, function22, composer2, (i3 >> 12) & 112);
                }
            }
        }) : null;
        androidx.compose.ui.Modifier m617size3ABfNKs22222 = androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.selection.SelectableKt.m817selectableO2vRcR0(companion, z, mutableInteractionSource2, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c()), onClick), function22 != null ? NavigationRailItemCompactSize : NavigationRailItemSize);
        androidx.compose.ui.Alignment center22222 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center22222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume222222 = startRestartGroup.consume(localDensity22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density22222 = (androidx.compose.ui.unit.Density) consume222222;
        androidx.compose.ui.Modifier modifier422222 = companion;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume322222 = startRestartGroup.consume(localLayoutDirection22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection22222 = (androidx.compose.ui.unit.LayoutDirection) consume322222;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume422222 = startRestartGroup.consume(localViewConfiguration22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration22222 = (androidx.compose.ui.platform.ViewConfiguration) consume422222;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf22222 = androidx.compose.ui.layout.LayoutKt.materializerOf(m617size3ABfNKs22222);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m1641constructorimpl22222 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, rememberBoxMeasurePolicy22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, density22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, layoutDirection22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22222, viewConfiguration22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-172871267);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C187@8378L417:NavigationRail.kt#jmzs0o");
        int i1122222 = i3 >> 24;
        m1438NavigationRailTransitionKlgxPg(j3, m2112copywmQWz5c$default, z, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new kotlin.jvm.functions.Function3<java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(f.floatValue(), composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(float f, androidx.compose.runtime.Composer composer2, int i12) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C194@8606L179:NavigationRail.kt#jmzs0o");
                if ((i12 & 14) == 0) {
                    i12 |= composer2.changed(f) ? 4 : 2;
                }
                if ((i12 & 91) != 18 || !composer2.getSkipping()) {
                    if (z5) {
                        f = 1.0f;
                    }
                    androidx.compose.material.NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda22222, f, composer2, (i3 >> 6) & 14);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i1122222 & 112) | (i1122222 & 14) | 3072 | ((i3 << 6) & 896));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        modifier3 = modifier422222;
        z6 = z4;
        function23 = function22;
        z7 = z5;
        mutableInteractionSource3 = mutableInteractionSource422222;
        j4 = j3;
        j5 = m2112copywmQWz5c$default;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationRailTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1438NavigationRailTransitionKlgxPg(final long j, final long j2, final boolean z, final kotlin.jvm.functions.Function3<? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-207161906);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)232@9909L126,239@10110L181:NavigationRail.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(function3) ? 2048 : 1024;
        }
        final int i3 = i2;
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            final androidx.compose.runtime.State animateFloatAsState = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, NavigationRailAnimationSpec, 0.0f, null, startRestartGroup, 48, 12);
            long m2164lerpjxsXWHM = androidx.compose.ui.graphics.ColorKt.m2164lerpjxsXWHM(j2, j, m1439NavigationRailTransition_Klgx_Pg$lambda3(animateFloatAsState));
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2164lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.ui.graphics.Color.m2115getAlphaimpl(m2164lerpjxsXWHM)))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1688205042, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                    float m1439NavigationRailTransition_Klgx_Pg$lambda3;
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C243@10259L26:NavigationRail.kt#jmzs0o");
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    kotlin.jvm.functions.Function3<java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                    m1439NavigationRailTransition_Klgx_Pg$lambda3 = androidx.compose.material.NavigationRailKt.m1439NavigationRailTransition_Klgx_Pg$lambda3(animateFloatAsState);
                    function32.invoke(java.lang.Float.valueOf(m1439NavigationRailTransition_Klgx_Pg$lambda3), composer2, java.lang.Integer.valueOf((i3 >> 6) & 112));
                }
            }), startRestartGroup, 56);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                androidx.compose.material.NavigationRailKt.m1438NavigationRailTransitionKlgxPg(j, j2, z, function3, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationRailItemBaselineLayout(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, final float f, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1903861684);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailItemBaselineLayout)P(!1,2)264@10960L1118:NavigationRail.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i3) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i3) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i3) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i3) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope Layout, java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables, long j) {
                    androidx.compose.ui.layout.Placeable placeable;
                    androidx.compose.ui.layout.MeasureResult m1445placeLabelAndIconDIyivk0;
                    androidx.compose.ui.layout.MeasureResult m1444placeIcon3p2s80s;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
                    java.util.List<? extends androidx.compose.ui.layout.Measurable> list = measurables;
                    for (androidx.compose.ui.layout.Measurable measurable : list) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "icon")) {
                            androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(j);
                            if (function22 != null) {
                                for (androidx.compose.ui.layout.Measurable measurable2 : list) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "label")) {
                                        placeable = measurable2.mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                    }
                                }
                                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            placeable = null;
                            if (function22 == null) {
                                m1444placeIcon3p2s80s = androidx.compose.material.NavigationRailKt.m1444placeIcon3p2s80s(Layout, mo3402measureBRTryo0, j);
                                return m1444placeIcon3p2s80s;
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNull(placeable);
                            m1445placeLabelAndIconDIyivk0 = androidx.compose.material.NavigationRailKt.m1445placeLabelAndIconDIyivk0(Layout, placeable, mo3402measureBRTryo0, j, f);
                            return m1445placeLabelAndIconDIyivk0;
                        }
                    }
                    throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localDensity);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3 = startRestartGroup.consume(localViewConfiguration);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1943278197);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C266@10990L41,268@11081L168:NavigationRail.kt#jmzs0o");
            androidx.compose.ui.Modifier layoutId = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, "icon");
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume4 = startRestartGroup.consume(localDensity2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume5 = startRestartGroup.consume(localLayoutDirection2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume5;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume6 = startRestartGroup.consume(localViewConfiguration2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume6;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1405563567);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C266@11023L6:NavigationRail.kt#jmzs0o");
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                androidx.compose.ui.Modifier alpha = androidx.compose.ui.draw.AlphaKt.alpha(androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, "label"), f);
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume7 = startRestartGroup.consume(localDensity3);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) consume7;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume8 = startRestartGroup.consume(localLayoutDirection3);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) consume8;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume9 = startRestartGroup.consume(localViewConfiguration3);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) consume9;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(alpha);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                androidx.compose.runtime.Composer m1641constructorimpl3 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, density3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, layoutDirection3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, viewConfiguration3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(2107148020);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C272@11240L7:NavigationRail.kt#jmzs0o");
                function22.invoke(startRestartGroup, java.lang.Integer.valueOf((i2 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                androidx.compose.material.NavigationRailKt.NavigationRailItemBaselineLayout(function2, function22, f, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final androidx.compose.ui.layout.MeasureResult m1444placeIcon3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, final androidx.compose.ui.layout.Placeable placeable, long j) {
        final int max = java.lang.Math.max(0, (androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) - placeable.getWidth()) / 2);
        final int max2 = java.lang.Math.max(0, (androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) - placeable.getHeight()) / 2);
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, androidx.compose.ui.layout.Placeable.this, max, max2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final androidx.compose.ui.layout.MeasureResult m1445placeLabelAndIconDIyivk0(androidx.compose.ui.layout.MeasureScope measureScope, final androidx.compose.ui.layout.Placeable placeable, final androidx.compose.ui.layout.Placeable placeable2, long j, final float f) {
        final int m4423getMaxHeightimpl = (androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) - placeable.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline())) - measureScope.mo309roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        final int m4424getMaxWidthimpl = (androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) - placeable.getWidth()) / 2;
        final int i = measureScope.mo309roundToPx0680j_4(ItemIconTopOffset);
        int m4423getMaxHeightimpl2 = (androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) - placeable2.getHeight()) / 2;
        final int m4424getMaxWidthimpl2 = (androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) - placeable2.getWidth()) / 2;
        final int roundToInt = kotlin.math.MathKt.roundToInt((m4423getMaxHeightimpl2 - i) * (1 - f));
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                if (f != 0.0f) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, placeable, m4424getMaxWidthimpl, m4423getMaxHeightimpl + roundToInt, 0.0f, 4, null);
                }
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, placeable2, m4424getMaxWidthimpl2, i + roundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }

    static {
        float f = 8;
        NavigationRailPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        HeaderPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationRailTransition_Klgx_Pg$lambda-3, reason: not valid java name */
    public static final float m1439NavigationRailTransition_Klgx_Pg$lambda3(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }
}
