package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: BottomNavigation.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a[\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u0017\u001a\u00020\t2\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0002\b\u00132\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\u0002\b\u00132\u0006\u0010\u001b\u001a\u00020\u0002H\u0003¢\u0006\u0002\u0010\u001c\u001aU\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2&\u0010\u0010\u001a\"\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0013H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a\u0095\u0001\u0010'\u001a\u00020\t*\u00020\u00122\u0006\u0010 \u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00192\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0002\b\u00132\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020!2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\u0002\b\u00132\b\b\u0002\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\r2\b\b\u0002\u0010.\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001a)\u00101\u001a\u000202*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a9\u0010:\u001a\u000202*\u0002032\u0006\u0010;\u001a\u0002052\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010\u001b\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"BottomNavigationAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "BottomNavigationHeight", "Landroidx/compose/ui/unit/Dp;", "F", "BottomNavigationItemHorizontalPadding", "CombinedItemTextBaseline", "BottomNavigation", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomNavigation-PEIptTM", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomNavigationItemBaselineLayout", "icon", "Lkotlin/Function0;", "label", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "BottomNavigationTransition", "activeColor", "inactiveColor", "selected", "", "Lkotlin/ParameterName;", "name", "animationProgress", "BottomNavigationTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "BottomNavigationItem", "onClick", "enabled", "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "BottomNavigationItem-jY6E1Zs", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomNavigationKt {
    private static final TweenSpec<Float> BottomNavigationAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float BottomNavigationHeight = Dp.m3840constructorimpl(56);
    private static final float BottomNavigationItemHorizontalPadding;
    private static final float CombinedItemTextBaseline;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008c  */
    /* renamed from: BottomNavigation-PEIptTM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m905BottomNavigationPEIptTM(Modifier modifier, long j, long j2, float f, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        final Modifier.Companion companion;
        final float m904getElevationD9Ej5fM;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(456489494);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomNavigation)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp)91@4097L6,92@4146L32,96@4289L403:BottomNavigation.kt#jmzs0o");
        int i5 = i2 & 1;
        if (i5 != 0) {
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
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                j3 = j;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(content) ? 16384 : 8192;
            }
            if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        j4 = ColorsKt.m994contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i6 != 0) {
                        m904getElevationD9Ej5fM = BottomNavigationDefaults.INSTANCE.m904getElevationD9Ej5fM();
                        long j7 = j4;
                        final int i7 = i3;
                        startRestartGroup.endDefaults();
                        int i8 = i7 << 3;
                        SurfaceKt.m1172SurfaceFjzlyU(companion, null, j3, j7, null, m904getElevationD9Ej5fM, ComposableLambdaKt.composableLambda(startRestartGroup, 678339930, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                float f3;
                                ComposerKt.sourceInformation(composer2, "C102@4443L243:BottomNavigation.kt#jmzs0o");
                                if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    f3 = BottomNavigationKt.BottomNavigationHeight;
                                    Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m447height3ABfNKs(fillMaxWidth$default, f3));
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                    int i10 = ((i7 >> 3) & 7168) | 48;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer2, 6);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = composer2.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Density density = (Density) consume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2 = composer2.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer2.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(selectableGroup);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                                    Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-678309503);
                                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                    function3.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i7 & 14) | 1572864 | (i8 & 896) | (i8 & 7168) | ((i7 << 6) & 458752), 18);
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
                m904getElevationD9Ej5fM = f2;
                long j72 = j4;
                final int i72 = i3;
                startRestartGroup.endDefaults();
                int i82 = i72 << 3;
                SurfaceKt.m1172SurfaceFjzlyU(companion, null, j3, j72, null, m904getElevationD9Ej5fM, ComposableLambdaKt.composableLambda(startRestartGroup, 678339930, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        float f3;
                        ComposerKt.sourceInformation(composer2, "C102@4443L243:BottomNavigation.kt#jmzs0o");
                        if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            f3 = BottomNavigationKt.BottomNavigationHeight;
                            Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m447height3ABfNKs(fillMaxWidth$default, f3));
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            Function3<RowScope, Composer, Integer, Unit> function3 = content;
                            int i10 = ((i72 >> 3) & 7168) | 48;
                            composer2.startReplaceableGroup(693286680);
                            ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = composer2.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) consume;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer2.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(selectableGroup);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                            Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-678309503);
                            ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                            function3.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i72 & 14) | 1572864 | (i82 & 896) | (i82 & 7168) | ((i72 << 6) & 458752), 18);
                j5 = j3;
                j6 = j72;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                j5 = j3;
                j6 = j4;
                m904getElevationD9Ej5fM = f2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    BottomNavigationKt.m905BottomNavigationPEIptTM(Modifier.this, j5, j6, m904getElevationD9Ej5fM, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        f2 = f;
        if ((i2 & 16) == 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i6 != 0) {
        }
        m904getElevationD9Ej5fM = f2;
        long j722 = j4;
        final int i722 = i3;
        startRestartGroup.endDefaults();
        int i822 = i722 << 3;
        SurfaceKt.m1172SurfaceFjzlyU(companion, null, j3, j722, null, m904getElevationD9Ej5fM, ComposableLambdaKt.composableLambda(startRestartGroup, 678339930, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i9) {
                float f3;
                ComposerKt.sourceInformation(composer2, "C102@4443L243:BottomNavigation.kt#jmzs0o");
                if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    f3 = BottomNavigationKt.BottomNavigationHeight;
                    Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m447height3ABfNKs(fillMaxWidth$default, f3));
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Function3<RowScope, Composer, Integer, Unit> function3 = content;
                    int i10 = ((i722 >> 3) & 7168) | 48;
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(selectableGroup);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                    Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                    function3.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i722 & 14) | 1572864 | (i822 & 896) | (i822 & 7168) | ((i722 << 6) & 458752), 18);
        j5 = j3;
        j6 = j722;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ed  */
    /* renamed from: BottomNavigationItem-jY6E1Zs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m906BottomNavigationItemjY6E1Zs(final RowScope BottomNavigationItem, final boolean z, final Function0<Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> icon, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2, final int i3) {
        final int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z4;
        int i7;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        int i8;
        boolean z5;
        int i9;
        int i10;
        Modifier.Companion companion;
        final boolean z6;
        MutableInteractionSource mutableInteractionSource2;
        long j3;
        long j4;
        final Modifier modifier3;
        final long j5;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final long j6;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(BottomNavigationItem, "$this$BottomNavigationItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1473735525);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomNavigationItem)P(7,6,2,5,1,4!2,8:c#ui.graphics.Color,9:c#ui.graphics.Color)154@7016L39,155@7109L7,156@7201L6,167@7704L61,169@7771L804:BottomNavigation.kt#jmzs0o");
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(BottomNavigationItem) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
            if ((i3 & 2) == 0) {
                i4 |= 384;
            } else if ((i & 896) == 0) {
                i4 |= startRestartGroup.changed(onClick) ? 256 : 128;
            }
            if ((i3 & 4) == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(icon) ? 2048 : 1024;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((57344 & i) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    z4 = z2;
                    i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        function22 = function2;
                        i4 |= startRestartGroup.changed(function22) ? 1048576 : 524288;
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 12582912;
                            z5 = z3;
                        } else {
                            z5 = z3;
                            if ((i & 29360128) == 0) {
                                i4 |= startRestartGroup.changed(z5) ? 8388608 : 4194304;
                            }
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i & 1879048192) == 0) {
                            i4 |= ((i3 & 512) == 0 && startRestartGroup.changed(j)) ? 536870912 : 268435456;
                        }
                        if ((i2 & 14) == 0) {
                            i10 = i2 | (((i3 & 1024) == 0 && startRestartGroup.changed(j2)) ? 4 : 2);
                        } else {
                            i10 = i2;
                        }
                        if ((i4 & 1533916891) == 306783378 || (i10 & 11) != 2 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i6 != 0) {
                                    z4 = true;
                                }
                                if (i7 != 0) {
                                    function22 = null;
                                }
                                z6 = i8 != 0 ? true : z3;
                                if (i9 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i3 & 256) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j3 = ((Color) consume).m1638unboximpl();
                                    i4 &= -1879048193;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & 512) != 0) {
                                    j4 = Color.m1627copywmQWz5c$default(j3, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i10 &= -15;
                                } else {
                                    j4 = j2;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 256) != 0) {
                                    i4 &= -1879048193;
                                }
                                if ((i3 & 512) != 0) {
                                    i10 &= -15;
                                }
                                z6 = z3;
                                mutableInteractionSource2 = mutableInteractionSource;
                                j4 = j2;
                                companion = modifier2;
                                j3 = j;
                            }
                            startRestartGroup.endDefaults();
                            final ComposableLambda composableLambda = function22 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, 1343298261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i11) {
                                    TextStyle m3497copyHL5avdY;
                                    ComposerKt.sourceInformation(composer2, "C160@7335L10,161@7401L40:BottomNavigation.kt#jmzs0o");
                                    if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        m3497copyHL5avdY = r3.m3497copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m3459getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.m3741boximpl(TextAlign.INSTANCE.m3748getCentere0LSkKk()), (r42 & 32768) != 0 ? r3.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption().paragraphStyle.getTextIndent() : null);
                                        TextKt.ProvideTextStyle(m3497copyHL5avdY, function22, composer2, (i4 >> 15) & 112);
                                    }
                                }
                            }) : null;
                            Modifier weight$default = RowScope.weight$default(BottomNavigationItem, SelectableKt.m636selectableO2vRcR0(companion, z, mutableInteractionSource2, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i4 >> 21) & 896) | 6, 2), z4, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            Modifier modifier4 = companion;
                            startRestartGroup.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density = (Density) consume2;
                            boolean z8 = z4;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = startRestartGroup.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            LayoutDirection layoutDirection = (LayoutDirection) consume3;
                            Function2<? super Composer, ? super Integer, Unit> function24 = function22;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = startRestartGroup.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(weight$default);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            startRestartGroup.disableReusing();
                            Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
                            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            startRestartGroup.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            startRestartGroup.startReplaceableGroup(-2137368960);
                            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-1538530399);
                            ComposerKt.sourceInformation(startRestartGroup, "C182@8148L421:BottomNavigation.kt#jmzs0o");
                            m907BottomNavigationTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1411872801, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Float f, Composer composer2, Integer num) {
                                    invoke(f.floatValue(), composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(float f, Composer composer2, int i11) {
                                    ComposerKt.sourceInformation(composer2, "C189@8378L181:BottomNavigation.kt#jmzs0o");
                                    if ((i11 & 14) == 0) {
                                        i11 |= composer2.changed(f) ? 4 : 2;
                                    }
                                    if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                                        if (z6) {
                                            f = 1.0f;
                                        }
                                        BottomNavigationKt.BottomNavigationItemBaselineLayout(icon, composableLambda, f, composer2, (i4 >> 9) & 14);
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, ((i10 << 3) & 112) | ((i4 >> 27) & 14) | 3072 | ((i4 << 3) & 896));
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            modifier3 = modifier4;
                            j5 = j3;
                            z7 = z8;
                            function23 = function24;
                            j6 = j4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z6 = z5;
                            modifier3 = modifier2;
                            z7 = z4;
                            function23 = function22;
                            mutableInteractionSource3 = mutableInteractionSource;
                            j5 = j;
                            j6 = j2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                BottomNavigationKt.m906BottomNavigationItemjY6E1Zs(RowScope.this, z, onClick, icon, modifier3, z7, function23, z6, mutableInteractionSource3, j5, j6, composer2, i | 1, i2, i3);
                            }
                        });
                        return;
                    }
                    function22 = function2;
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    if ((i & 1879048192) == 0) {
                    }
                    if ((i2 & 14) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (function22 != null) {
                    }
                    Modifier weight$default2 = RowScope.weight$default(BottomNavigationItem, SelectableKt.m636selectableO2vRcR0(companion, z, mutableInteractionSource2, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i4 >> 21) & 896) | 6, 2), z4, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    Modifier modifier42 = companion;
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density2 = (Density) consume22;
                    boolean z82 = z4;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(localLayoutDirection2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection2 = (LayoutDirection) consume32;
                    Function2<? super Composer, ? super Integer, Unit> function242 = function22;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume42 = startRestartGroup.consume(localViewConfiguration2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume42;
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(weight$default2);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    startRestartGroup.disableReusing();
                    Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
                    Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-1538530399);
                    ComposerKt.sourceInformation(startRestartGroup, "C182@8148L421:BottomNavigation.kt#jmzs0o");
                    m907BottomNavigationTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1411872801, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f, Composer composer2, Integer num) {
                            invoke(f.floatValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f, Composer composer2, int i11) {
                            ComposerKt.sourceInformation(composer2, "C189@8378L181:BottomNavigation.kt#jmzs0o");
                            if ((i11 & 14) == 0) {
                                i11 |= composer2.changed(f) ? 4 : 2;
                            }
                            if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                                if (z6) {
                                    f = 1.0f;
                                }
                                BottomNavigationKt.BottomNavigationItemBaselineLayout(icon, composableLambda, f, composer2, (i4 >> 9) & 14);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, ((i10 << 3) & 112) | ((i4 >> 27) & 14) | 3072 | ((i4 << 3) & 896));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    modifier3 = modifier42;
                    j5 = j3;
                    z7 = z82;
                    function23 = function242;
                    j6 = j4;
                    mutableInteractionSource3 = mutableInteractionSource42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z4 = z2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                function22 = function2;
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                if ((i & 1879048192) == 0) {
                }
                if ((i2 & 14) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                startRestartGroup.endDefaults();
                if (function22 != null) {
                }
                Modifier weight$default22 = RowScope.weight$default(BottomNavigationItem, SelectableKt.m636selectableO2vRcR0(companion, z, mutableInteractionSource2, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i4 >> 21) & 896) | 6, 2), z4, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                Alignment center22 = Alignment.INSTANCE.getCenter();
                Modifier modifier422 = companion;
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localDensity22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density22 = (Density) consume222;
                boolean z822 = z4;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(localLayoutDirection22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection22 = (LayoutDirection) consume322;
                Function2<? super Composer, ? super Integer, Unit> function2422 = function22;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration22 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume422 = startRestartGroup.consume(localViewConfiguration22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume422;
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(weight$default22);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl22 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl22, rememberBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl22, density22, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1538530399);
                ComposerKt.sourceInformation(startRestartGroup, "C182@8148L421:BottomNavigation.kt#jmzs0o");
                m907BottomNavigationTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1411872801, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Float f, Composer composer2, Integer num) {
                        invoke(f.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f, Composer composer2, int i11) {
                        ComposerKt.sourceInformation(composer2, "C189@8378L181:BottomNavigation.kt#jmzs0o");
                        if ((i11 & 14) == 0) {
                            i11 |= composer2.changed(f) ? 4 : 2;
                        }
                        if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                            if (z6) {
                                f = 1.0f;
                            }
                            BottomNavigationKt.BottomNavigationItemBaselineLayout(icon, composableLambda, f, composer2, (i4 >> 9) & 14);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, ((i10 << 3) & 112) | ((i4 >> 27) & 14) | 3072 | ((i4 << 3) & 896));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                modifier3 = modifier422;
                j5 = j3;
                z7 = z822;
                function23 = function2422;
                j6 = j4;
                mutableInteractionSource3 = mutableInteractionSource422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z4 = z2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            function22 = function2;
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            if ((i2 & 14) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            startRestartGroup.endDefaults();
            if (function22 != null) {
            }
            Modifier weight$default222 = RowScope.weight$default(BottomNavigationItem, SelectableKt.m636selectableO2vRcR0(companion, z, mutableInteractionSource2, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i4 >> 21) & 896) | 6, 2), z4, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
            Alignment center222 = Alignment.INSTANCE.getCenter();
            Modifier modifier4222 = companion;
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localDensity222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density222 = (Density) consume2222;
            boolean z8222 = z4;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(localLayoutDirection222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection222 = (LayoutDirection) consume3222;
            Function2<? super Composer, ? super Integer, Unit> function24222 = function22;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration222 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4222 = startRestartGroup.consume(localViewConfiguration222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume4222;
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(weight$default222);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl222 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl222, rememberBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl222, density222, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl222, layoutDirection222, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl222, viewConfiguration222, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1538530399);
            ComposerKt.sourceInformation(startRestartGroup, "C182@8148L421:BottomNavigation.kt#jmzs0o");
            m907BottomNavigationTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1411872801, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Float f, Composer composer2, Integer num) {
                    invoke(f.floatValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f, Composer composer2, int i11) {
                    ComposerKt.sourceInformation(composer2, "C189@8378L181:BottomNavigation.kt#jmzs0o");
                    if ((i11 & 14) == 0) {
                        i11 |= composer2.changed(f) ? 4 : 2;
                    }
                    if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                        if (z6) {
                            f = 1.0f;
                        }
                        BottomNavigationKt.BottomNavigationItemBaselineLayout(icon, composableLambda, f, composer2, (i4 >> 9) & 14);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ((i10 << 3) & 112) | ((i4 >> 27) & 14) | 3072 | ((i4 << 3) & 896));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            modifier3 = modifier4222;
            j5 = j3;
            z7 = z8222;
            function23 = function24222;
            j6 = j4;
            mutableInteractionSource3 = mutableInteractionSource4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 2) == 0) {
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z4 = z2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        function22 = function2;
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((i2 & 14) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        startRestartGroup.endDefaults();
        if (function22 != null) {
        }
        Modifier weight$default2222 = RowScope.weight$default(BottomNavigationItem, SelectableKt.m636selectableO2vRcR0(companion, z, mutableInteractionSource2, RippleKt.m1262rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i4 >> 21) & 896) | 6, 2), z4, Role.m3377boximpl(Role.INSTANCE.m3389getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
        Alignment center2222 = Alignment.INSTANCE.getCenter();
        Modifier modifier42222 = companion;
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localDensity2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2222 = (Density) consume22222;
        boolean z82222 = z4;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(localLayoutDirection2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection2222 = (LayoutDirection) consume32222;
        Function2<? super Composer, ? super Integer, Unit> function242222 = function22;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2222 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume42222 = startRestartGroup.consume(localViewConfiguration2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration2222 = (ViewConfiguration) consume42222;
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2222 = LayoutKt.materializerOf(weight$default2222);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1283constructorimpl2222 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl2222, rememberBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl2222, density2222, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl2222, layoutDirection2222, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl2222, viewConfiguration2222, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1538530399);
        ComposerKt.sourceInformation(startRestartGroup, "C182@8148L421:BottomNavigation.kt#jmzs0o");
        m907BottomNavigationTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1411872801, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Float f, Composer composer2, Integer num) {
                invoke(f.floatValue(), composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f, Composer composer2, int i11) {
                ComposerKt.sourceInformation(composer2, "C189@8378L181:BottomNavigation.kt#jmzs0o");
                if ((i11 & 14) == 0) {
                    i11 |= composer2.changed(f) ? 4 : 2;
                }
                if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                    if (z6) {
                        f = 1.0f;
                    }
                    BottomNavigationKt.BottomNavigationItemBaselineLayout(icon, composableLambda, f, composer2, (i4 >> 9) & 14);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ((i10 << 3) & 112) | ((i4 >> 27) & 14) | 3072 | ((i4 << 3) & 896));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        modifier3 = modifier42222;
        j5 = j3;
        z7 = z82222;
        function23 = function242222;
        j6 = j4;
        mutableInteractionSource3 = mutableInteractionSource42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomNavigationTransition-Klgx-Pg, reason: not valid java name */
    public static final void m907BottomNavigationTransitionKlgxPg(final long j, final long j2, final boolean z, final Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-985175058);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomNavigationTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)227@9693L128,234@9896L181:BottomNavigation.kt#jmzs0o");
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
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, BottomNavigationAnimationSpec, 0.0f, null, startRestartGroup, 48, 12);
            long m1680lerpjxsXWHM = ColorKt.m1680lerpjxsXWHM(j2, j, m908BottomNavigationTransition_Klgx_Pg$lambda3(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1618boximpl(Color.m1627copywmQWz5c$default(m1680lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1630getAlphaimpl(m1680lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(startRestartGroup, -138092754, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    float m908BottomNavigationTransition_Klgx_Pg$lambda3;
                    ComposerKt.sourceInformation(composer2, "C238@10045L26:BottomNavigation.kt#jmzs0o");
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Function3<Float, Composer, Integer, Unit> function32 = function3;
                    m908BottomNavigationTransition_Klgx_Pg$lambda3 = BottomNavigationKt.m908BottomNavigationTransition_Klgx_Pg$lambda3(animateFloatAsState);
                    function32.invoke(Float.valueOf(m908BottomNavigationTransition_Klgx_Pg$lambda3), composer2, Integer.valueOf((i3 >> 6) & 112));
                }
            }), startRestartGroup, 56);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                BottomNavigationKt.m907BottomNavigationTransitionKlgxPg(j, j2, z, function3, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomNavigationItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final float f, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1162995092);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomNavigationItemBaselineLayout)P(!1,2)259@10750L1203:BottomNavigation.kt#jmzs0o");
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
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo15measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    Placeable placeable;
                    MeasureResult m914placeLabelAndIconDIyivk0;
                    MeasureResult m913placeIcon3p2s80s;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                            Placeable mo3121measureBRTryo0 = measurable.mo3121measureBRTryo0(j);
                            if (function22 != null) {
                                for (Measurable measurable2 : list) {
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "label")) {
                                        placeable = measurable2.mo3121measureBRTryo0(Constraints.m3787copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            placeable = null;
                            if (function22 == null) {
                                m913placeIcon3p2s80s = BottomNavigationKt.m913placeIcon3p2s80s(Layout, mo3121measureBRTryo0, j);
                                return m913placeIcon3p2s80s;
                            }
                            Intrinsics.checkNotNull(placeable);
                            m914placeLabelAndIconDIyivk0 = BottomNavigationKt.m914placeLabelAndIconDIyivk0(Layout, placeable, mo3121measureBRTryo0, j, f);
                            return m914placeLabelAndIconDIyivk0;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(395677717);
            ComposerKt.sourceInformation(startRestartGroup, "C261@10780L41,263@10871L253:BottomNavigation.kt#jmzs0o");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "icon");
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume4;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(localViewConfiguration2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1943403697);
            ComposerKt.sourceInformation(startRestartGroup, "C261@10813L6:BottomNavigation.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                Modifier m422paddingVpY3zN4$default = PaddingKt.m422paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.INSTANCE, "label"), f), BottomNavigationItemHorizontalPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(localDensity3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume7;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(localLayoutDirection3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9 = startRestartGroup.consume(localViewConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m422paddingVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl3 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(150842644);
                ComposerKt.sourceInformation(startRestartGroup, "C268@11115L7:BottomNavigation.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                BottomNavigationKt.BottomNavigationItemBaselineLayout(function2, function22, f, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m913placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j) {
        int m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j);
        final int height = (m3795getMaxHeightimpl - placeable.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, placeable.getWidth(), m3795getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, height, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m914placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j, final float f) {
        int m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j);
        int i = placeable.get(AlignmentLineKt.getLastBaseline());
        int i2 = measureScope.mo309roundToPx0680j_4(CombinedItemTextBaseline);
        final int i3 = (m3795getMaxHeightimpl - i) - i2;
        int height = (m3795getMaxHeightimpl - placeable2.getHeight()) / 2;
        final int height2 = (m3795getMaxHeightimpl - (i2 * 2)) - placeable2.getHeight();
        int max = Math.max(placeable.getWidth(), placeable2.getWidth());
        final int width = (max - placeable.getWidth()) / 2;
        final int width2 = (max - placeable2.getWidth()) / 2;
        final int roundToInt = MathKt.roundToInt((height - height2) * (1 - f));
        return MeasureScope.layout$default(measureScope, max, m3795getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                if (f != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, width, i3 + roundToInt, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, width2, height2 + roundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }

    static {
        float f = 12;
        BottomNavigationItemHorizontalPadding = Dp.m3840constructorimpl(f);
        CombinedItemTextBaseline = Dp.m3840constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomNavigationTransition_Klgx_Pg$lambda-3, reason: not valid java name */
    public static final float m908BottomNavigationTransition_Klgx_Pg$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }
}
