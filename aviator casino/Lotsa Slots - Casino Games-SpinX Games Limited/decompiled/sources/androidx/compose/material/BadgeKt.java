package androidx.compose.material;

/* compiled from: Badge.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aS\u0010\u001e\u001a\u00020\u00112\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0002\u0010!\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0003\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\"\u0019\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\"\u0019\u0010\n\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\"\u0019\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\"\u0019\u0010\u000e\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"BadgeContentFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "BadgeHorizontalOffset", "Landroidx/compose/ui/unit/Dp;", "getBadgeHorizontalOffset", "()F", "F", "BadgeRadius", "getBadgeRadius", "BadgeWithContentHorizontalOffset", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalPadding", "getBadgeWithContentHorizontalPadding", "BadgeWithContentRadius", "getBadgeWithContentRadius", "Badge", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BadgedBox", "badge", "Landroidx/compose/foundation/layout/BoxScope;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BadgeKt {
    private static final float BadgeHorizontalOffset;
    private static final float BadgeRadius;
    private static final float BadgeWithContentHorizontalPadding;
    private static final float BadgeWithContentRadius = androidx.compose.ui.unit.Dp.m4478constructorimpl(8);
    private static final long BadgeContentFontSize = androidx.compose.ui.unit.TextUnitKt.getSp(10);
    private static final float BadgeWithContentHorizontalOffset = androidx.compose.ui.unit.Dp.m4478constructorimpl(-androidx.compose.ui.unit.Dp.m4478constructorimpl(6));

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BadgedBox(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> badge, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badge, "badge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(859805272);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BadgedBox)P(!1,2)63@2513L1971:Badge.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(badge) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(content) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                androidx.compose.ui.Modifier.Companion companion = i4 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                androidx.compose.material.BadgeKt$BadgedBox$2 badgeKt$BadgedBox$2 = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i5) {
                        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i5) {
                        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i5) {
                        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i5) {
                        return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(final androidx.compose.ui.layout.MeasureScope Layout, java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables, long j) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
                        java.util.List<? extends androidx.compose.ui.layout.Measurable> list = measurables;
                        for (androidx.compose.ui.layout.Measurable measurable : list) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "badge")) {
                                final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                for (androidx.compose.ui.layout.Measurable measurable2 : list) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), io.ktor.http.LinkHeader.Parameters.Anchor)) {
                                        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo02 = measurable2.mo3402measureBRTryo0(j);
                                        return Layout.layout(mo3402measureBRTryo02.getWidth(), mo3402measureBRTryo02.getHeight(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(mo3402measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline()))), kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(mo3402measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline())))), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2$measure$1
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
                                                float badgeWithContentHorizontalOffset = androidx.compose.ui.layout.Placeable.this.getWidth() > Layout.mo309roundToPx0680j_4(androidx.compose.material.BadgeKt.getBadgeRadius()) * 2 ? androidx.compose.material.BadgeKt.getBadgeWithContentHorizontalOffset() : androidx.compose.material.BadgeKt.getBadgeHorizontalOffset();
                                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo02, 0, 0, 0.0f, 4, null);
                                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, androidx.compose.ui.layout.Placeable.this, mo3402measureBRTryo02.getWidth() + Layout.mo309roundToPx0680j_4(badgeWithContentHorizontalOffset), (-androidx.compose.ui.layout.Placeable.this.getHeight()) / 2, 0.0f, 4, null);
                                            }
                                        });
                                    }
                                }
                                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
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
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, badgeKt$BadgedBox$2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(1799938959);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C65@2543L161,70@2717L105:Badge.kt#jmzs0o");
                androidx.compose.ui.Modifier layoutId = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, io.ktor.http.LinkHeader.Parameters.Anchor);
                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                int i5 = ((i3 << 3) & 7168) | 54;
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
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
                modifier3 = companion;
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                content.invoke(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE, startRestartGroup, java.lang.Integer.valueOf(((i5 >> 6) & 112) | 6));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.Modifier layoutId2 = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, "badge");
                int i6 = ((i3 << 9) & 7168) | 6;
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
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(layoutId2);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                badge.invoke(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE, startRestartGroup, java.lang.Integer.valueOf(6 | ((i6 >> 6) & 112)));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            final androidx.compose.ui.Modifier modifier4 = modifier3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$3
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i7) {
                    androidx.compose.material.BadgeKt.BadgedBox(badge, modifier4, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 731) == 146) {
        }
        if (i4 == 0) {
        }
        androidx.compose.material.BadgeKt$BadgedBox$2 badgeKt$BadgedBox$22 = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i52) {
                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i52);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i52) {
                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i52);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i52) {
                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i52);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i52) {
                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i52);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(final androidx.compose.ui.layout.MeasureScope Layout, java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables, long j) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
                java.util.List<? extends androidx.compose.ui.layout.Measurable> list = measurables;
                for (androidx.compose.ui.layout.Measurable measurable : list) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "badge")) {
                        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                        for (androidx.compose.ui.layout.Measurable measurable2 : list) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), io.ktor.http.LinkHeader.Parameters.Anchor)) {
                                final androidx.compose.ui.layout.Placeable mo3402measureBRTryo02 = measurable2.mo3402measureBRTryo0(j);
                                return Layout.layout(mo3402measureBRTryo02.getWidth(), mo3402measureBRTryo02.getHeight(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(mo3402measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline()))), kotlin.TuplesKt.to(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(mo3402measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline())))), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2$measure$1
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
                                        float badgeWithContentHorizontalOffset = androidx.compose.ui.layout.Placeable.this.getWidth() > Layout.mo309roundToPx0680j_4(androidx.compose.material.BadgeKt.getBadgeRadius()) * 2 ? androidx.compose.material.BadgeKt.getBadgeWithContentHorizontalOffset() : androidx.compose.material.BadgeKt.getBadgeHorizontalOffset();
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo02, 0, 0, 0.0f, 4, null);
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, androidx.compose.ui.layout.Placeable.this, mo3402measureBRTryo02.getWidth() + Layout.mo309roundToPx0680j_4(badgeWithContentHorizontalOffset), (-androidx.compose.ui.layout.Placeable.this.getHeight()) / 2, 0.0f, 4, null);
                                    }
                                });
                            }
                        }
                        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume10 = startRestartGroup.consume(localDensity4);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density4 = (androidx.compose.ui.unit.Density) consume10;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22 = startRestartGroup.consume(localLayoutDirection4);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection4 = (androidx.compose.ui.unit.LayoutDirection) consume22;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume32 = startRestartGroup.consume(localViewConfiguration4);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration4 = (androidx.compose.ui.platform.ViewConfiguration) consume32;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf4 = androidx.compose.ui.layout.LayoutKt.materializerOf(companion);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m1641constructorimpl4 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl4, badgeKt$BadgedBox$22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl4, density4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl4, layoutDirection4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl4, viewConfiguration4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(1799938959);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C65@2543L161,70@2717L105:Badge.kt#jmzs0o");
        androidx.compose.ui.Modifier layoutId3 = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, io.ktor.http.LinkHeader.Parameters.Anchor);
        androidx.compose.ui.Alignment center2 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
        int i52 = ((i3 << 3) & 7168) | 54;
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume42 = startRestartGroup.consume(localDensity22);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density22 = (androidx.compose.ui.unit.Density) consume42;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume52 = startRestartGroup.consume(localLayoutDirection22);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection22 = (androidx.compose.ui.unit.LayoutDirection) consume52;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume62 = startRestartGroup.consume(localViewConfiguration22);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration22 = (androidx.compose.ui.platform.ViewConfiguration) consume62;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf22 = androidx.compose.ui.layout.LayoutKt.materializerOf(layoutId3);
        modifier3 = companion;
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m1641constructorimpl22 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, rememberBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, density22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, layoutDirection22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl22, viewConfiguration22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        content.invoke(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE, startRestartGroup, java.lang.Integer.valueOf(((i52 >> 6) & 112) | 6));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.Modifier layoutId22 = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, "badge");
        int i62 = ((i3 << 9) & 7168) | 6;
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity32 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume72 = startRestartGroup.consume(localDensity32);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density32 = (androidx.compose.ui.unit.Density) consume72;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection32 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume82 = startRestartGroup.consume(localLayoutDirection32);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection32 = (androidx.compose.ui.unit.LayoutDirection) consume82;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration32 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume92 = startRestartGroup.consume(localViewConfiguration32);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration32 = (androidx.compose.ui.platform.ViewConfiguration) consume92;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor32 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf32 = androidx.compose.ui.layout.LayoutKt.materializerOf(layoutId22);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m1641constructorimpl32 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl32, rememberBoxMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl32, density32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl32, layoutDirection32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl32, viewConfiguration32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf32.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        badge.invoke(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE, startRestartGroup, java.lang.Integer.valueOf(6 | ((i62 >> 6) & 112)));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* renamed from: Badge-eopBjH0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1242BadgeeopBjH0(androidx.compose.ui.Modifier modifier, long j, long j2, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        final int i3;
        long j3;
        long j4;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        final androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1133484502);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Badge)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color)131@5169L6,132@5209L32,139@5458L857:Badge.kt#jmzs0o");
        int i6 = i2 & 1;
        if (i6 != 0) {
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
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j3 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                j4 = j2;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j4 = j2;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            function32 = function3;
            i3 |= startRestartGroup.changed(function32) ? 2048 : 1024;
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i6 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getError0d7_KjU();
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        j4 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i7 != 0) {
                        function32 = null;
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
                startRestartGroup.endDefaults();
                float f = function32 == null ? BadgeWithContentRadius : BadgeRadius;
                androidx.compose.foundation.shape.RoundedCornerShape m846RoundedCornerShape0680j_4 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(f);
                float f2 = f * 2;
                androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape = m846RoundedCornerShape0680j_4;
                androidx.compose.ui.Modifier m570paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m570paddingVpY3zN4$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(companion, androidx.compose.ui.unit.Dp.m4478constructorimpl(f2), androidx.compose.ui.unit.Dp.m4478constructorimpl(f2)), j3, roundedCornerShape), roundedCornerShape), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(693286680);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
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
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m570paddingVpY3zN4$default);
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
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-678309503);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C80@3988L9:Row.kt#2w3rfo");
                final androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1024875974);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C154@5959L340:Badge.kt#jmzs0o");
                if (function32 != null) {
                    final int i8 = 6;
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m2103boximpl(j4))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1784526485, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i9) {
                            long j5;
                            androidx.compose.ui.text.TextStyle m3986copyHL5avdY;
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C157@6099L10,158@6171L114:Badge.kt#jmzs0o");
                            if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                androidx.compose.ui.text.TextStyle button = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                                j5 = androidx.compose.material.BadgeKt.BadgeContentFontSize;
                                m3986copyHL5avdY = button.m3986copyHL5avdY((r42 & 1) != 0 ? button.spanStyle.m3923getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? button.spanStyle.getFontSize() : j5, (r42 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? button.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? button.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? button.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? androidx.compose.ui.text.style.TextAlign.m4353boximpl(button.paragraphStyle.getTextAlign()) : null, (r42 & 32768) != 0 ? androidx.compose.ui.text.style.TextDirection.m4367boximpl(button.paragraphStyle.getTextDirection()) : null, (r42 & 65536) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? button.paragraphStyle.getTextIndent() : null);
                                final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function32;
                                final androidx.compose.foundation.layout.RowScope rowScope = rowScopeInstance;
                                final int i10 = i8;
                                final int i11 = i3;
                                androidx.compose.material.TextKt.ProvideTextStyle(m3986copyHL5avdY, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 915155142, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                        invoke(composer3, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer3, int i12) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C160@6256L9:Badge.kt#jmzs0o");
                                        if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                        } else {
                                            function33.invoke(rowScope, composer3, java.lang.Integer.valueOf((i10 & 14) | ((i11 >> 6) & 112)));
                                        }
                                    }
                                }), composer2, 48);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, 56);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            final long j5 = j3;
            final long j6 = j4;
            final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33 = function32;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$2
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i9) {
                    androidx.compose.material.BadgeKt.m1242BadgeeopBjH0(androidx.compose.ui.Modifier.this, j5, j6, function33, composer2, i | 1, i2);
                }
            });
            return;
        }
        function32 = function3;
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i7 != 0) {
        }
        startRestartGroup.endDefaults();
        if (function32 == null) {
        }
        androidx.compose.foundation.shape.RoundedCornerShape m846RoundedCornerShape0680j_42 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(f);
        float f22 = f * 2;
        androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape2 = m846RoundedCornerShape0680j_42;
        androidx.compose.ui.Modifier m570paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m570paddingVpY3zN4$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.m601defaultMinSizeVpY3zN4(companion, androidx.compose.ui.unit.Dp.m4478constructorimpl(f22), androidx.compose.ui.unit.Dp.m4478constructorimpl(f22)), j3, roundedCornerShape2), roundedCornerShape2), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
        androidx.compose.ui.Alignment.Vertical centerVertically2 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center2 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(693286680);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume4 = startRestartGroup.consume(localDensity2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22 = startRestartGroup.consume(localLayoutDirection2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume22;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume32 = startRestartGroup.consume(localViewConfiguration2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume32;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(m570paddingVpY3zN4$default2);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-678309503);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C80@3988L9:Row.kt#2w3rfo");
        final androidx.compose.foundation.layout.RowScope rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1024875974);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C154@5959L340:Badge.kt#jmzs0o");
        if (function32 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        final long j52 = j3;
        final long j62 = j4;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function332 = function32;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final float getBadgeRadius() {
        return BadgeRadius;
    }

    public static final float getBadgeWithContentRadius() {
        return BadgeWithContentRadius;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeHorizontalOffset() {
        return BadgeHorizontalOffset;
    }

    static {
        float f = 4;
        BadgeRadius = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        BadgeWithContentHorizontalPadding = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        BadgeHorizontalOffset = androidx.compose.ui.unit.Dp.m4478constructorimpl(-androidx.compose.ui.unit.Dp.m4478constructorimpl(f));
    }
}
