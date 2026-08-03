package androidx.compose.material;

/* compiled from: AppBar.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aq\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0087\u0001\u0010\u001f\u001a\u00020\n2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\n0!¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010!¢\u0006\u0002\b\u00172\u001e\b\u0002\u0010#\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001ae\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0080\b\u001a,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0-2\u0006\u0010.\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010/\u001a\u00020)H\u0000\u001a\u0011\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020)H\u0082\b\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"AppBarHeight", "Landroidx/compose/ui/unit/Dp;", "F", "AppBarHorizontalPadding", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "TitleIconModifier", "Landroidx/compose/ui/Modifier;", "TitleInsetWithoutIcon", "AppBar", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "shape", "Landroidx/compose/ui/graphics/Shape;", "modifier", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "AppBar-celAv9A", "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "cutoutShape", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TopAppBar", "title", "Lkotlin/Function0;", "navigationIcon", "actions", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "calculateCutoutCircleYIntercept", "", "cutoutRadius", "verticalOffset", "calculateRoundedEdgeIntercept", "Lkotlin/Pair;", "controlPointX", com.helpshift.proactive.InAppViewConstants.RADIUS, "square", "x", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float AppBarHeight = androidx.compose.ui.unit.Dp.m4478constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;
    private static final androidx.compose.ui.Modifier TitleIconModifier;
    private static final androidx.compose.ui.Modifier TitleInsetWithoutIcon;

    private static final float square(float f) {
        return f * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0051  */
    /* renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1226TopAppBarxWeB9s(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> title, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, long j, long j2, float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        long j3;
        long j4;
        int i6;
        final float f2;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m1338getLambda1$material_release;
        long j5;
        long j6;
        long j7;
        final androidx.compose.ui.Modifier modifier2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        final long j8;
        final long j9;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2087748139);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)P(6,4,5!1,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp)81@3902L6,82@3951L32,85@4047L1254:AppBar.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(function2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changed(function32) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        j3 = j;
                        i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j3)) ? 16384 : 8192;
                    } else {
                        j3 = j;
                    }
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            j4 = j2;
                            if (startRestartGroup.changed(j4)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            j4 = j2;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        j4 = j2;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            function22 = i4 == 0 ? null : function2;
                            m1338getLambda1$material_release = i5 == 0 ? androidx.compose.material.ComposableSingletons$AppBarKt.INSTANCE.m1338getLambda1$material_release() : function32;
                            if ((i2 & 16) == 0) {
                                j5 = androidx.compose.material.ColorsKt.getPrimarySurface(androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i3 &= -57345;
                            } else {
                                j5 = j3;
                            }
                            if ((i2 & 32) == 0) {
                                j6 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j5, startRestartGroup, (i3 >> 12) & 14);
                                i3 &= -458753;
                            } else {
                                j6 = j4;
                            }
                            if (i6 != 0) {
                                f2 = androidx.compose.material.AppBarDefaults.INSTANCE.m1222getTopAppBarElevationD9Ej5fM();
                            }
                            j7 = j6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier;
                            function22 = function2;
                            m1338getLambda1$material_release = function32;
                            j5 = j3;
                            j7 = j4;
                        }
                        startRestartGroup.endDefaults();
                        int i9 = i3 >> 12;
                        m1223AppBarcelAv9A(j5, j7, f2, androidx.compose.material.AppBarDefaults.INSTANCE.getContentPadding(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape(), companion, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(rowScope, composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.foundation.layout.RowScope AppBar, androidx.compose.runtime.Composer composer2, int i10) {
                                int i11;
                                androidx.compose.ui.Modifier modifier3;
                                int i12;
                                androidx.compose.ui.Modifier modifier4;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C104@4595L378,116@5048L6,116@4983L312:AppBar.kt#jmzs0o");
                                if ((i10 & 14) == 0) {
                                    i11 = i10 | (composer2.changed(AppBar) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                                    if (function22 == null) {
                                        composer2.startReplaceableGroup(-512812651);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "94@4259L29");
                                        modifier4 = androidx.compose.material.AppBarKt.TitleInsetWithoutIcon;
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(modifier4, composer2, 6);
                                        composer2.endReplaceableGroup();
                                        i12 = 6;
                                    } else {
                                        composer2.startReplaceableGroup(-512812592);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "96@4318L257");
                                        modifier3 = androidx.compose.material.AppBarKt.TitleIconModifier;
                                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function22;
                                        int i13 = i3;
                                        composer2.startReplaceableGroup(693286680);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
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
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(modifier3);
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
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                        composer2.enableReusing();
                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        composer2.startReplaceableGroup(-678309503);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                        composer2.startReplaceableGroup(1485618042);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C98@4493L4,97@4407L154:AppBar.kt#jmzs0o");
                                        i12 = 6;
                                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function24, composer2, ((i13 >> 3) & 112) | 8);
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.CC.weight$default(AppBar, androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                                    androidx.compose.ui.Alignment.Vertical centerVertically2 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                    final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = title;
                                    final int i14 = i3;
                                    composer2.startReplaceableGroup(693286680);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume4 = composer2.consume(localDensity2);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume5 = composer2.consume(localLayoutDirection2);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume5;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume6 = composer2.consume(localViewConfiguration2);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume6;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(weight$default);
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-678309503);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(159489950);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C108@4771L10,108@4732L231:AppBar.kt#jmzs0o");
                                    androidx.compose.material.TextKt.ProvideTextStyle(androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, i12).getH6(), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                        public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C110@4890L4,109@4804L145:AppBar.kt#jmzs0o");
                                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function25, composer3, ((i14 << 3) & 112) | 8);
                                            } else {
                                                composer3.skipToGroupEnd();
                                            }
                                        }
                                    }), composer2, 48);
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer2, i12)))};
                                    final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function34 = m1338getLambda1$material_release;
                                    final int i15 = i3;
                                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                                        public final void invoke(androidx.compose.runtime.Composer composer3, int i16) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C117@5070L215:AppBar.kt#jmzs0o");
                                            if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                                androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                                androidx.compose.foundation.layout.Arrangement.Horizontal end = androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd();
                                                androidx.compose.ui.Alignment.Vertical centerVertically3 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function34;
                                                int i17 = (i15 & 7168) | 438;
                                                composer3.startReplaceableGroup(693286680);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(end, centerVertically3, composer3, 54);
                                                composer3.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume7 = composer3.consume(localDensity3);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) consume7;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume8 = composer3.consume(localLayoutDirection3);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) consume8;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume9 = composer3.consume(localViewConfiguration3);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) consume9;
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxHeight$default);
                                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor3);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                androidx.compose.runtime.Composer m1641constructorimpl3 = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, rowMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, density3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, layoutDirection3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, viewConfiguration3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-678309503);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                                function35.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i17 >> 6) & 112) | 6));
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 56);
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i9 & 896) | (i9 & 14) | 1600512 | (i9 & 112) | ((i3 << 12) & 458752), 0);
                        modifier2 = companion;
                        function23 = function22;
                        function33 = m1338getLambda1$material_release;
                        j8 = j5;
                        j9 = j7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function23 = function2;
                        function33 = function32;
                        j8 = j3;
                        j9 = j4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i10) {
                            androidx.compose.material.AppBarKt.m1226TopAppBarxWeB9s(title, modifier2, function23, function33, j8, j9, f2, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                function32 = function3;
                if ((57344 & i) != 0) {
                }
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i6 != 0) {
                }
                j7 = j6;
                startRestartGroup.endDefaults();
                int i92 = i3 >> 12;
                m1223AppBarcelAv9A(j5, j7, f2, androidx.compose.material.AppBarDefaults.INSTANCE.getContentPadding(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape(), companion, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.foundation.layout.RowScope AppBar, androidx.compose.runtime.Composer composer2, int i10) {
                        int i11;
                        androidx.compose.ui.Modifier modifier3;
                        int i12;
                        androidx.compose.ui.Modifier modifier4;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C104@4595L378,116@5048L6,116@4983L312:AppBar.kt#jmzs0o");
                        if ((i10 & 14) == 0) {
                            i11 = i10 | (composer2.changed(AppBar) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                            if (function22 == null) {
                                composer2.startReplaceableGroup(-512812651);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "94@4259L29");
                                modifier4 = androidx.compose.material.AppBarKt.TitleInsetWithoutIcon;
                                androidx.compose.foundation.layout.SpacerKt.Spacer(modifier4, composer2, 6);
                                composer2.endReplaceableGroup();
                                i12 = 6;
                            } else {
                                composer2.startReplaceableGroup(-512812592);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "96@4318L257");
                                modifier3 = androidx.compose.material.AppBarKt.TitleIconModifier;
                                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function22;
                                int i13 = i3;
                                composer2.startReplaceableGroup(693286680);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
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
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(modifier3);
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
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-678309503);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(1485618042);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C98@4493L4,97@4407L154:AppBar.kt#jmzs0o");
                                i12 = 6;
                                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function24, composer2, ((i13 >> 3) & 112) | 8);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.CC.weight$default(AppBar, androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                            androidx.compose.ui.Alignment.Vertical centerVertically2 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = title;
                            final int i14 = i3;
                            composer2.startReplaceableGroup(693286680);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume4 = composer2.consume(localDensity2);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume5 = composer2.consume(localLayoutDirection2);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume5;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume6 = composer2.consume(localViewConfiguration2);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume6;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(weight$default);
                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-678309503);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(159489950);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C108@4771L10,108@4732L231:AppBar.kt#jmzs0o");
                            androidx.compose.material.TextKt.ProvideTextStyle(androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, i12).getH6(), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C110@4890L4,109@4804L145:AppBar.kt#jmzs0o");
                                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function25, composer3, ((i14 << 3) & 112) | 8);
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                }
                            }), composer2, 48);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer2, i12)))};
                            final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34 = m1338getLambda1$material_release;
                            final int i15 = i3;
                            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i16) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C117@5070L215:AppBar.kt#jmzs0o");
                                    if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                        androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                        androidx.compose.foundation.layout.Arrangement.Horizontal end = androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd();
                                        androidx.compose.ui.Alignment.Vertical centerVertically3 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function34;
                                        int i17 = (i15 & 7168) | 438;
                                        composer3.startReplaceableGroup(693286680);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(end, centerVertically3, composer3, 54);
                                        composer3.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume7 = composer3.consume(localDensity3);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) consume7;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume8 = composer3.consume(localLayoutDirection3);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) consume8;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume9 = composer3.consume(localViewConfiguration3);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) consume9;
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxHeight$default);
                                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        androidx.compose.runtime.Composer m1641constructorimpl3 = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, rowMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, density3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, layoutDirection3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, viewConfiguration3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-678309503);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                        function35.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i17 >> 6) & 112) | 6));
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 56);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i92 & 896) | (i92 & 14) | 1600512 | (i92 & 112) | ((i3 << 12) & 458752), 0);
                modifier2 = companion;
                function23 = function22;
                function33 = m1338getLambda1$material_release;
                j8 = j5;
                j9 = j7;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((57344 & i) != 0) {
            }
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i6 != 0) {
            }
            j7 = j6;
            startRestartGroup.endDefaults();
            int i922 = i3 >> 12;
            m1223AppBarcelAv9A(j5, j7, f2, androidx.compose.material.AppBarDefaults.INSTANCE.getContentPadding(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape(), companion, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.foundation.layout.RowScope AppBar, androidx.compose.runtime.Composer composer2, int i10) {
                    int i11;
                    androidx.compose.ui.Modifier modifier3;
                    int i12;
                    androidx.compose.ui.Modifier modifier4;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C104@4595L378,116@5048L6,116@4983L312:AppBar.kt#jmzs0o");
                    if ((i10 & 14) == 0) {
                        i11 = i10 | (composer2.changed(AppBar) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                        if (function22 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "94@4259L29");
                            modifier4 = androidx.compose.material.AppBarKt.TitleInsetWithoutIcon;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(modifier4, composer2, 6);
                            composer2.endReplaceableGroup();
                            i12 = 6;
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "96@4318L257");
                            modifier3 = androidx.compose.material.AppBarKt.TitleIconModifier;
                            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function22;
                            int i13 = i3;
                            composer2.startReplaceableGroup(693286680);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
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
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(modifier3);
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
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-678309503);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1485618042);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C98@4493L4,97@4407L154:AppBar.kt#jmzs0o");
                            i12 = 6;
                            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function24, composer2, ((i13 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.CC.weight$default(AppBar, androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                        androidx.compose.ui.Alignment.Vertical centerVertically2 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = title;
                        final int i14 = i3;
                        composer2.startReplaceableGroup(693286680);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume4 = composer2.consume(localDensity2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume5 = composer2.consume(localLayoutDirection2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume5;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume6 = composer2.consume(localViewConfiguration2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume6;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(weight$default);
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(159489950);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C108@4771L10,108@4732L231:AppBar.kt#jmzs0o");
                        androidx.compose.material.TextKt.ProvideTextStyle(androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, i12).getH6(), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C110@4890L4,109@4804L145:AppBar.kt#jmzs0o");
                                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function25, composer3, ((i14 << 3) & 112) | 8);
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer2, i12)))};
                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34 = m1338getLambda1$material_release;
                        final int i15 = i3;
                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i16) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C117@5070L215:AppBar.kt#jmzs0o");
                                if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                    androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                    androidx.compose.foundation.layout.Arrangement.Horizontal end = androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd();
                                    androidx.compose.ui.Alignment.Vertical centerVertically3 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function34;
                                    int i17 = (i15 & 7168) | 438;
                                    composer3.startReplaceableGroup(693286680);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(end, centerVertically3, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume7 = composer3.consume(localDensity3);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) consume7;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume8 = composer3.consume(localLayoutDirection3);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) consume8;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume9 = composer3.consume(localViewConfiguration3);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) consume9;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxHeight$default);
                                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl3 = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, rowMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, density3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, layoutDirection3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, viewConfiguration3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-678309503);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                    function35.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i17 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i922 & 896) | (i922 & 14) | 1600512 | (i922 & 112) | ((i3 << 12) & 458752), 0);
            modifier2 = companion;
            function23 = function22;
            function33 = m1338getLambda1$material_release;
            j8 = j5;
            j9 = j7;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((57344 & i) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i6 != 0) {
        }
        j7 = j6;
        startRestartGroup.endDefaults();
        int i9222 = i3 >> 12;
        m1223AppBarcelAv9A(j5, j7, f2, androidx.compose.material.AppBarDefaults.INSTANCE.getContentPadding(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape(), companion, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(rowScope, composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.layout.RowScope AppBar, androidx.compose.runtime.Composer composer2, int i10) {
                int i11;
                androidx.compose.ui.Modifier modifier3;
                int i12;
                androidx.compose.ui.Modifier modifier4;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C104@4595L378,116@5048L6,116@4983L312:AppBar.kt#jmzs0o");
                if ((i10 & 14) == 0) {
                    i11 = i10 | (composer2.changed(AppBar) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                    if (function22 == null) {
                        composer2.startReplaceableGroup(-512812651);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "94@4259L29");
                        modifier4 = androidx.compose.material.AppBarKt.TitleInsetWithoutIcon;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(modifier4, composer2, 6);
                        composer2.endReplaceableGroup();
                        i12 = 6;
                    } else {
                        composer2.startReplaceableGroup(-512812592);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "96@4318L257");
                        modifier3 = androidx.compose.material.AppBarKt.TitleIconModifier;
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = function22;
                        int i13 = i3;
                        composer2.startReplaceableGroup(693286680);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
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
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(modifier3);
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
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1485618042);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C98@4493L4,97@4407L154:AppBar.kt#jmzs0o");
                        i12 = 6;
                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function24, composer2, ((i13 >> 3) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.CC.weight$default(AppBar, androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    androidx.compose.ui.Alignment.Vertical centerVertically2 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = title;
                    final int i14 = i3;
                    composer2.startReplaceableGroup(693286680);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume4 = composer2.consume(localDensity2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume5 = composer2.consume(localLayoutDirection2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume5;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume6 = composer2.consume(localViewConfiguration2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume6;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(weight$default);
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(159489950);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C108@4771L10,108@4732L231:AppBar.kt#jmzs0o");
                    androidx.compose.material.TextKt.ProvideTextStyle(androidx.compose.material.MaterialTheme.INSTANCE.getTypography(composer2, i12).getH6(), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C110@4890L4,109@4804L145:AppBar.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function25, composer3, ((i14 << 3) & 112) | 8);
                            } else {
                                composer3.skipToGroupEnd();
                            }
                        }
                    }), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer2, i12)))};
                    final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34 = m1338getLambda1$material_release;
                    final int i15 = i3;
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i16) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C117@5070L215:AppBar.kt#jmzs0o");
                            if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                androidx.compose.foundation.layout.Arrangement.Horizontal end = androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd();
                                androidx.compose.ui.Alignment.Vertical centerVertically3 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function34;
                                int i17 = (i15 & 7168) | 438;
                                composer3.startReplaceableGroup(693286680);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(end, centerVertically3, composer3, 54);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume7 = composer3.consume(localDensity3);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) consume7;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume8 = composer3.consume(localLayoutDirection3);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) consume8;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume9 = composer3.consume(localViewConfiguration3);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) consume9;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxHeight$default);
                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                androidx.compose.runtime.Composer m1641constructorimpl3 = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, rowMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, density3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, layoutDirection3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, viewConfiguration3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-678309503);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                function35.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i17 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 56);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i9222 & 896) | (i9222 & 14) | 1600512 | (i9222 & 112) | ((i3 << 12) & 458752), 0);
        modifier2 = companion;
        function23 = function22;
        function33 = m1338getLambda1$material_release;
        j8 = j5;
        j9 = j7;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008e  */
    /* renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1225TopAppBarHsRjFd4(androidx.compose.ui.Modifier modifier, long j, long j2, float f, androidx.compose.foundation.layout.PaddingValues paddingValues, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i5;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.foundation.layout.PaddingValues contentPadding;
        long j5;
        long j6;
        float f3;
        final long j7;
        final long j8;
        final float f4;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        int i6;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1897058582);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)P(5,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,3)156@6973L6,157@7022L32,162@7231L182:AppBar.kt#jmzs0o");
        int i8 = i2 & 1;
        if (i8 != 0) {
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
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                j3 = j;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                j4 = j2;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            j4 = j2;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(content) ? 131072 : 65536;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                j3 = androidx.compose.material.ColorsKt.getPrimarySurface(androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i9 != 0) {
                                f2 = androidx.compose.material.AppBarDefaults.INSTANCE.m1222getTopAppBarElevationD9Ej5fM();
                            }
                            if (i4 == 0) {
                                modifier3 = companion;
                                contentPadding = androidx.compose.material.AppBarDefaults.INSTANCE.getContentPadding();
                                j5 = j3;
                                j6 = j4;
                                f3 = f2;
                                startRestartGroup.endDefaults();
                                int i10 = i3 >> 3;
                                m1223AppBarcelAv9A(j5, j6, f3, contentPadding, androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape(), modifier3, content, startRestartGroup, (i10 & 7168) | (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                                modifier2 = modifier3;
                                j7 = j5;
                                j8 = j6;
                                f4 = f3;
                                paddingValues3 = contentPadding;
                            } else {
                                modifier3 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            modifier3 = modifier2;
                        }
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        contentPadding = paddingValues2;
                        startRestartGroup.endDefaults();
                        int i102 = i3 >> 3;
                        m1223AppBarcelAv9A(j5, j6, f3, contentPadding, androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape(), modifier3, content, startRestartGroup, (i102 & 7168) | (i102 & 14) | 24576 | (i102 & 112) | (i102 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                        modifier2 = modifier3;
                        j7 = j5;
                        j8 = j6;
                        f4 = f3;
                        paddingValues3 = contentPadding;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j7 = j3;
                        j8 = j4;
                        f4 = f2;
                        paddingValues3 = paddingValues2;
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                            androidx.compose.material.AppBarKt.m1225TopAppBarHsRjFd4(androidx.compose.ui.Modifier.this, j7, j8, f4, paddingValues3, content, composer2, i | 1, i2);
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
                if (i8 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 == 0) {
                }
            }
            paddingValues2 = paddingValues;
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 == 0) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008e  */
    /* renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1224BottomAppBarY1yfwus(androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.ui.graphics.Shape shape, float f, androidx.compose.foundation.layout.PaddingValues paddingValues, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        androidx.compose.ui.graphics.Shape shape2;
        int i4;
        float f2;
        int i5;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        long j4;
        long j5;
        long j6;
        androidx.compose.ui.graphics.Shape shape3;
        float f3;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.graphics.Shape rectangleShape;
        final androidx.compose.ui.Modifier modifier3;
        final float f4;
        final long j7;
        final long j8;
        final androidx.compose.foundation.layout.PaddingValues paddingValues4;
        final androidx.compose.ui.graphics.Shape shape4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1651948973);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)P(6,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4,5:c#ui.unit.Dp,3)216@9902L6,217@9951L32,223@10232L7,229@10422L152:AppBar.kt#jmzs0o");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(j)) {
                i8 = 32;
                i3 |= i8;
            }
            i8 = 16;
            i3 |= i8;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j2;
                if (startRestartGroup.changed(j3)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j3 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j3 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    paddingValues2 = paddingValues;
                } else {
                    paddingValues2 = paddingValues;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) == 0) {
                    i6 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion = i9 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i2 & 2) == 0) {
                                j4 = androidx.compose.material.ColorsKt.getPrimarySurface(androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i3 &= -113;
                            } else {
                                j4 = j;
                            }
                            if ((i2 & 4) != 0) {
                                j3 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i10 != 0) {
                                shape2 = null;
                            }
                            if (i4 != 0) {
                                f2 = androidx.compose.material.AppBarDefaults.INSTANCE.m1221getBottomAppBarElevationD9Ej5fM();
                            }
                            if (i5 == 0) {
                                modifier2 = companion;
                                paddingValues3 = androidx.compose.material.AppBarDefaults.INSTANCE.getContentPadding();
                                j5 = j4;
                                j6 = j3;
                                shape3 = shape2;
                                f3 = f2;
                            } else {
                                j5 = j4;
                                j6 = j3;
                                shape3 = shape2;
                                f3 = f2;
                                paddingValues3 = paddingValues2;
                                modifier2 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            j5 = j;
                            j6 = j3;
                            shape3 = shape2;
                            f3 = f2;
                            paddingValues3 = paddingValues2;
                            modifier2 = modifier;
                        }
                        startRestartGroup.endDefaults();
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.FabPlacement> localFabPlacement = androidx.compose.material.ScaffoldKt.getLocalFabPlacement();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume = startRestartGroup.consume(localFabPlacement);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        androidx.compose.material.FabPlacement fabPlacement = (androidx.compose.material.FabPlacement) consume;
                        if (shape3 == null && fabPlacement != null && fabPlacement.getIsDocked()) {
                            rectangleShape = new androidx.compose.material.BottomAppBarCutoutShape(shape3, fabPlacement);
                        } else {
                            rectangleShape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
                        }
                        int i11 = i3 >> 3;
                        int i12 = i3 >> 6;
                        m1223AppBarcelAv9A(j5, j6, f3, paddingValues3, rectangleShape, modifier2, content, startRestartGroup, (i11 & 112) | (i11 & 14) | (i12 & 896) | (i12 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                        modifier3 = modifier2;
                        f4 = f3;
                        j7 = j5;
                        j8 = j6;
                        paddingValues4 = paddingValues3;
                        shape4 = shape3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j7 = j;
                        j8 = j3;
                        shape4 = shape2;
                        f4 = f2;
                        paddingValues4 = paddingValues2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i13) {
                            androidx.compose.material.AppBarKt.m1224BottomAppBarY1yfwus(androidx.compose.ui.Modifier.this, j7, j8, shape4, f4, paddingValues4, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i6;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                startRestartGroup.endDefaults();
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.FabPlacement> localFabPlacement2 = androidx.compose.material.ScaffoldKt.getLocalFabPlacement();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume2 = startRestartGroup.consume(localFabPlacement2);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.material.FabPlacement fabPlacement2 = (androidx.compose.material.FabPlacement) consume2;
                if (shape3 == null) {
                }
                rectangleShape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
                int i112 = i3 >> 3;
                int i122 = i3 >> 6;
                m1223AppBarcelAv9A(j5, j6, f3, paddingValues3, rectangleShape, modifier2, content, startRestartGroup, (i112 & 112) | (i112 & 14) | (i122 & 896) | (i122 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                modifier3 = modifier2;
                f4 = f3;
                j7 = j5;
                j8 = j6;
                paddingValues4 = paddingValues3;
                shape4 = shape3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i6;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 2) == 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            startRestartGroup.endDefaults();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.FabPlacement> localFabPlacement22 = androidx.compose.material.ScaffoldKt.getLocalFabPlacement();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume22 = startRestartGroup.consume(localFabPlacement22);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.material.FabPlacement fabPlacement22 = (androidx.compose.material.FabPlacement) consume22;
            if (shape3 == null) {
            }
            rectangleShape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
            int i1122 = i3 >> 3;
            int i1222 = i3 >> 6;
            m1223AppBarcelAv9A(j5, j6, f3, paddingValues3, rectangleShape, modifier2, content, startRestartGroup, (i1122 & 112) | (i1122 & 14) | (i1222 & 896) | (i1222 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
            modifier3 = modifier2;
            f4 = f3;
            j7 = j5;
            j8 = j6;
            paddingValues4 = paddingValues3;
            shape4 = shape3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        shape2 = shape;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i6;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        startRestartGroup.endDefaults();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.FabPlacement> localFabPlacement222 = androidx.compose.material.ScaffoldKt.getLocalFabPlacement();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume222 = startRestartGroup.consume(localFabPlacement222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.material.FabPlacement fabPlacement222 = (androidx.compose.material.FabPlacement) consume222;
        if (shape3 == null) {
        }
        rectangleShape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        int i11222 = i3 >> 3;
        int i12222 = i3 >> 6;
        m1223AppBarcelAv9A(j5, j6, f3, paddingValues3, rectangleShape, modifier2, content, startRestartGroup, (i11222 & 112) | (i11222 & 14) | (i12222 & 896) | (i12222 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
        modifier3 = modifier2;
        f4 = f3;
        j7 = j5;
        j8 = j6;
        paddingValues4 = paddingValues3;
        shape4 = shape3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final float calculateCutoutCircleYIntercept(float f, float f2) {
        return -((float) java.lang.Math.sqrt((f * f) - (f2 * f2)));
    }

    public static final kotlin.Pair<java.lang.Float, java.lang.Float> calculateRoundedEdgeIntercept(float f, float f2, float f3) {
        java.lang.Float valueOf;
        java.lang.Float valueOf2;
        kotlin.Pair pair;
        java.lang.Float valueOf3;
        java.lang.Float valueOf4;
        float f4 = f2 * f2;
        float f5 = f3 * f3;
        float f6 = (f * f) + f4;
        float f7 = f4 * f5 * (f6 - f5);
        float f8 = f * f5;
        double d = f7;
        float sqrt = (f8 - ((float) java.lang.Math.sqrt(d))) / f6;
        float sqrt2 = (f8 + ((float) java.lang.Math.sqrt(d))) / f6;
        float sqrt3 = (float) java.lang.Math.sqrt(f5 - (sqrt * sqrt));
        float sqrt4 = (float) java.lang.Math.sqrt(f5 - (sqrt2 * sqrt2));
        if (f2 > 0.0f) {
            if (sqrt3 > sqrt4) {
                valueOf3 = java.lang.Float.valueOf(sqrt);
                valueOf4 = java.lang.Float.valueOf(sqrt3);
            } else {
                valueOf3 = java.lang.Float.valueOf(sqrt2);
                valueOf4 = java.lang.Float.valueOf(sqrt4);
            }
            pair = kotlin.TuplesKt.to(valueOf3, valueOf4);
        } else {
            if (sqrt3 < sqrt4) {
                valueOf = java.lang.Float.valueOf(sqrt);
                valueOf2 = java.lang.Float.valueOf(sqrt3);
            } else {
                valueOf = java.lang.Float.valueOf(sqrt2);
                valueOf2 = java.lang.Float.valueOf(sqrt4);
            }
            pair = kotlin.TuplesKt.to(valueOf, valueOf2);
        }
        float floatValue = ((java.lang.Number) pair.component1()).floatValue();
        float floatValue2 = ((java.lang.Number) pair.component2()).floatValue();
        if (floatValue < f) {
            floatValue2 = -floatValue2;
        }
        return kotlin.TuplesKt.to(java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(floatValue2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0055  */
    /* renamed from: AppBar-celAv9A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1223AppBarcelAv9A(final long j, final long j2, final float f, final androidx.compose.foundation.layout.PaddingValues paddingValues, final androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1249680788);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AppBar)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,3,6,5)513@22344L583:AppBar.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(f) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(shape) ? 16384 : 8192;
                    i4 = i2 & 32;
                    if (i4 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        modifier2 = modifier;
                        i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            i3 |= startRestartGroup.changed(function3) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            int i5 = i3 << 6;
                            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(modifier3, shape, j, j2, null, f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C520@22586L6,520@22521L400:AppBar.kt#jmzs0o");
                                    if ((i6 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                                    final androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingValues.this;
                                    final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                                    final int i7 = i3;
                                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                                        public final void invoke(androidx.compose.runtime.Composer composer3, int i8) {
                                            float f2;
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C521@22608L303:AppBar.kt#jmzs0o");
                                            if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                                androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.PaddingValues.this);
                                                f2 = androidx.compose.material.AppBarKt.AppBarHeight;
                                                androidx.compose.ui.Modifier m603height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(padding, f2);
                                                androidx.compose.foundation.layout.Arrangement.Horizontal start = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
                                                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function32;
                                                int i9 = ((i7 >> 9) & 7168) | 432;
                                                composer3.startReplaceableGroup(693286680);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                                composer3.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume = composer3.consume(localDensity);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume2 = composer3.consume(localLayoutDirection);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                java.lang.Object consume3 = composer3.consume(localViewConfiguration);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m603height3ABfNKs);
                                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-678309503);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                                function33.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i9 >> 6) & 112) | 6));
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 56);
                                }
                            }), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i5 & 896) | (i5 & 7168) | ((i3 << 9) & 458752), 16);
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        final androidx.compose.ui.Modifier modifier4 = modifier3;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                                androidx.compose.material.AppBarKt.m1223AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier4, function3, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    modifier2 = modifier;
                    if ((i2 & 64) != 0) {
                    }
                    if ((2995931 & i3) == 599186) {
                    }
                    if (i4 != 0) {
                    }
                    int i52 = i3 << 6;
                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(modifier3, shape, j, j2, null, f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C520@22586L6,520@22521L400:AppBar.kt#jmzs0o");
                            if ((i6 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                            final androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingValues.this;
                            final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32 = function3;
                            final int i7 = i3;
                            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i8) {
                                    float f2;
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C521@22608L303:AppBar.kt#jmzs0o");
                                    if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                        androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.PaddingValues.this);
                                        f2 = androidx.compose.material.AppBarKt.AppBarHeight;
                                        androidx.compose.ui.Modifier m603height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(padding, f2);
                                        androidx.compose.foundation.layout.Arrangement.Horizontal start = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
                                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function32;
                                        int i9 = ((i7 >> 9) & 7168) | 432;
                                        composer3.startReplaceableGroup(693286680);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                        composer3.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume = composer3.consume(localDensity);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume2 = composer3.consume(localLayoutDirection);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        java.lang.Object consume3 = composer3.consume(localViewConfiguration);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m603height3ABfNKs);
                                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-678309503);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                        function33.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i9 >> 6) & 112) | 6));
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 56);
                        }
                    }), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i52 & 896) | (i52 & 7168) | ((i3 << 9) & 458752), 16);
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i4 = i2 & 32;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                }
                if ((2995931 & i3) == 599186) {
                }
                if (i4 != 0) {
                }
                int i522 = i3 << 6;
                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(modifier3, shape, j, j2, null, f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C520@22586L6,520@22521L400:AppBar.kt#jmzs0o");
                        if ((i6 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingValues.this;
                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32 = function3;
                        final int i7 = i3;
                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i8) {
                                float f2;
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C521@22608L303:AppBar.kt#jmzs0o");
                                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                    androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.PaddingValues.this);
                                    f2 = androidx.compose.material.AppBarKt.AppBarHeight;
                                    androidx.compose.ui.Modifier m603height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(padding, f2);
                                    androidx.compose.foundation.layout.Arrangement.Horizontal start = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
                                    androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function32;
                                    int i9 = ((i7 >> 9) & 7168) | 432;
                                    composer3.startReplaceableGroup(693286680);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume = composer3.consume(localDensity);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume2 = composer3.consume(localLayoutDirection);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume3 = composer3.consume(localViewConfiguration);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m603height3ABfNKs);
                                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-678309503);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                    function33.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i9 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
                    }
                }), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i522 & 896) | (i522 & 7168) | ((i3 << 9) & 458752), 16);
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
            }
            if ((2995931 & i3) == 599186) {
            }
            if (i4 != 0) {
            }
            int i5222 = i3 << 6;
            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(modifier3, shape, j, j2, null, f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C520@22586L6,520@22521L400:AppBar.kt#jmzs0o");
                    if ((i6 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                    final androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingValues.this;
                    final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32 = function3;
                    final int i7 = i3;
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i8) {
                            float f2;
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C521@22608L303:AppBar.kt#jmzs0o");
                            if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.PaddingValues.this);
                                f2 = androidx.compose.material.AppBarKt.AppBarHeight;
                                androidx.compose.ui.Modifier m603height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(padding, f2);
                                androidx.compose.foundation.layout.Arrangement.Horizontal start = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
                                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function32;
                                int i9 = ((i7 >> 9) & 7168) | 432;
                                composer3.startReplaceableGroup(693286680);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume = composer3.consume(localDensity);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume2 = composer3.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume3 = composer3.consume(localViewConfiguration);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m603height3ABfNKs);
                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-678309503);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                function33.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i9 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 56);
                }
            }), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i5222 & 896) | (i5222 & 7168) | ((i3 << 9) & 458752), 16);
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
        }
        if ((2995931 & i3) == 599186) {
        }
        if (i4 != 0) {
        }
        int i52222 = i3 << 6;
        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(modifier3, shape, j, j2, null, f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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

            public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C520@22586L6,520@22521L400:AppBar.kt#jmzs0o");
                if ((i6 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(androidx.compose.material.ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                final androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingValues.this;
                final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32 = function3;
                final int i7 = i3;
                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i8) {
                        float f2;
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C521@22608L303:AppBar.kt#jmzs0o");
                        if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.PaddingValues.this);
                            f2 = androidx.compose.material.AppBarKt.AppBarHeight;
                            androidx.compose.ui.Modifier m603height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(padding, f2);
                            androidx.compose.foundation.layout.Arrangement.Horizontal start = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
                            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function32;
                            int i9 = ((i7 >> 9) & 7168) | 432;
                            composer3.startReplaceableGroup(693286680);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume = composer3.consume(localDensity);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume2 = composer3.consume(localLayoutDirection);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume3 = composer3.consume(localViewConfiguration);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m603height3ABfNKs);
                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.Companion.getSetDensity());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.Companion.getSetLayoutDirection());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.Companion.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-678309503);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                            function33.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i9 >> 6) & 112) | 6));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 56);
            }
        }), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i52222 & 896) | (i52222 & 7168) | ((i3 << 9) & 458752), 16);
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    static {
        float f = 4;
        float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        AppBarHorizontalPadding = m4478constructorimpl;
        TitleInsetWithoutIcon = androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.ui.unit.Dp.m4478constructorimpl(16) - m4478constructorimpl));
        TitleIconModifier = androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.ui.unit.Dp.m4478constructorimpl(72) - m4478constructorimpl));
        BottomAppBarCutoutOffset = androidx.compose.ui.unit.Dp.m4478constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
    }
}
