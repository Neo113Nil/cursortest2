package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureBlocks;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Layout.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u009d\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00052-\u0010\u000b\u001a)\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u0011¢\u0006\u0002\b\u00122-\u0010\u0013\u001a)\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u0011¢\u0006\u0002\b\u00122-\u0010\u0014\u001a)\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u0011¢\u0006\u0002\b\u00122-\u0010\u0015\u001a)\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u00072-\u0010\u0016\u001a)\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\fj\u0002`\u001b¢\u0006\u0002\b\u0012H\u0001ø\u0001\u0001¢\u0006\u0002\u0010\u001c\u001a \u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087\b¢\u0006\u0002\u0010\u001d\u001a:\u0010\u001e\u001a\u00020\u001f2-\u0010\u0016\u001a)\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\fj\u0002`\u001b¢\u0006\u0002\b\u0012H\u0001ø\u0001\u0001\u001a7\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00052\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010!\u001a4\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0004\u0012\u00020\u00010#¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00122\u0006\u0010\u0006\u001a\u00020\u0007H\u0001ø\u0001\u0001¢\u0006\u0002\u0010&\u001aö\u0001\u0010'\u001a\u00020\u001f2-\u0010\u000b\u001a)\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u0011¢\u0006\u0002\b\u00122-\u0010\u0013\u001a)\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u0011¢\u0006\u0002\b\u00122-\u0010\u0014\u001a)\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u0011¢\u0006\u0002\b\u00122-\u0010\u0015\u001a)\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\fj\u0002`\u0011¢\u0006\u0002\b\u00122-\u0010\u0016\u001a)\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\fj\u0002`\u001b¢\u0006\u0002\b\u0012H\u0001ø\u0001\u0001\u001aX\u0010(\u001a\u00020\u0010*\u00020)2)\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\f¢\u0006\u0002\b\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0001\u001aX\u0010.\u001a\u00020\u0010*\u00020)2)\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\f¢\u0006\u0002\b\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010/\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0001\u001aX\u00100\u001a\u00020\u0010*\u00020)2)\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\f¢\u0006\u0002\b\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0001\u001aX\u00101\u001a\u00020\u0010*\u00020)2)\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\f¢\u0006\u0002\b\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010/\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u00062"}, d2 = {"Layout", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "modifier", "Landroidx/compose/ui/Modifier;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "minIntrinsicWidthMeasureBlock", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "Landroidx/compose/ui/layout/IntrinsicMeasureBlock;", "Lkotlin/ExtensionFunctionType;", "minIntrinsicHeightMeasureBlock", "maxIntrinsicWidthMeasureBlock", "maxIntrinsicHeightMeasureBlock", "measureBlock", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureBlock;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "MeasuringIntrinsicsMeasureBlocks", "Landroidx/compose/ui/node/MeasureBlocks;", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "materializerOf", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "measureBlocksOf", "MeasuringMaxIntrinsicHeight", "Landroidx/compose/ui/unit/Density;", "measurables", "w", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "MeasuringMaxIntrinsicWidth", "h", "MeasuringMinIntrinsicHeight", "MeasuringMinIntrinsicWidth", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutKt {
    public static final void Layout(Function2<? super Composer, ? super Integer, Unit> content, Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LayoutDirection layoutDirection = (LayoutDirection) consume2;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3 = composer.consume(localViewConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = materializerOf(modifier);
        int i3 = ((i << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer);
        Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(composer, Integer.valueOf((i3 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    public static final void Layout(Modifier modifier, MeasurePolicy measurePolicy, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        composer.startReplaceableGroup(544976794);
        ComposerKt.sourceInformation(composer, "C(Layout)P(1)120@4597L7,121@4652L7,122@4711L7,124@4784L439:Layout.kt#80mrfh");
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LayoutDirection layoutDirection = (LayoutDirection) consume2;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3 = composer.consume(localViewConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
        Modifier materialize = ComposedModifierKt.materialize(composer, modifier);
        final Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        composer.startReplaceableGroup(1405779621);
        ComposerKt.sourceInformation(composer, "C(ReusableComposeNode):Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new Function0<ComposeUiNode>() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$$inlined$ReusableComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final ComposeUiNode invoke() {
                    return Function0.this.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer);
        Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        Updater.m1290setimpl(m1283constructorimpl, materialize, ComposeUiNode.INSTANCE.getSetModifier());
        composer.enableReusing();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    @Deprecated(message = "This composable was deprecated. Please use the alternative Layout overloads instead.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Layout(final Function2<? super Composer, ? super Integer, Unit> content, final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> minIntrinsicWidthMeasureBlock, final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> minIntrinsicHeightMeasureBlock, final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> maxIntrinsicWidthMeasureBlock, final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> maxIntrinsicHeightMeasureBlock, Modifier modifier, final Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> measureBlock, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(minIntrinsicWidthMeasureBlock, "minIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(minIntrinsicHeightMeasureBlock, "minIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(maxIntrinsicWidthMeasureBlock, "maxIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(maxIntrinsicHeightMeasureBlock, "maxIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Composer startRestartGroup = composer.startRestartGroup(1164819031);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,5,4,2!1,6)178@6854L40:Layout.kt#80mrfh");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(minIntrinsicWidthMeasureBlock) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(minIntrinsicHeightMeasureBlock) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(maxIntrinsicWidthMeasureBlock) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(maxIntrinsicHeightMeasureBlock) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if ((i2 & 64) != 0) {
                i5 = (3670016 & i) == 0 ? startRestartGroup.changed(measureBlock) ? 1048576 : 524288 : 1572864;
                i4 = i3;
                if ((2995931 & i4) == 599186 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public MeasureResult mo15measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
                            Intrinsics.checkNotNullParameter(measure, "$this$measure");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            return measureBlock.invoke(measure, measurables, Constraints.m3784boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i7) {
                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            return minIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i7)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i7) {
                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            return minIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i7)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i7) {
                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            return maxIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i7)).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i7) {
                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            return maxIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i7)).intValue();
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
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
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = materializerOf(modifier4);
                    int i7 = ((((i4 & 14) | ((i4 >> 12) & 112)) << 9) & 7168) | 6;
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
                    content.invoke(startRestartGroup, Integer.valueOf((i7 >> 9) & 14));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$3
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

                    public final void invoke(Composer composer2, int i8) {
                        LayoutKt.Layout(content, minIntrinsicWidthMeasureBlock, minIntrinsicHeightMeasureBlock, maxIntrinsicWidthMeasureBlock, maxIntrinsicHeightMeasureBlock, modifier3, measureBlock, composer2, i | 1, i2);
                    }
                });
                return;
            }
            i3 |= i5;
            i4 = i3;
            if ((2995931 & i4) == 599186) {
            }
            if (i6 != 0) {
            }
            MeasurePolicy measurePolicy2 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public MeasureResult mo15measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
                    Intrinsics.checkNotNullParameter(measure, "$this$measure");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    return measureBlock.invoke(measure, measurables, Constraints.m3784boximpl(j));
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i72) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    return minIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i72)).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i72) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    return minIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i72)).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i72) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    return maxIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i72)).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i72) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    return maxIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i72)).intValue();
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume4;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume32 = startRestartGroup.consume(localViewConfiguration2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume32;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = materializerOf(modifier4);
            int i72 = ((((i4 & 14) | ((i4 >> 12) & 112)) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl2, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            content.invoke(startRestartGroup, Integer.valueOf((i72 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            modifier3 = modifier4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
        }
        i3 |= i5;
        i4 = i3;
        if ((2995931 & i4) == 599186) {
        }
        if (i6 != 0) {
        }
        MeasurePolicy measurePolicy22 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo15measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return measureBlock.invoke(measure, measurables, Constraints.m3784boximpl(j));
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i722) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return minIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i722)).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i722) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return minIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i722)).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i722) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return maxIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i722)).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i722) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return maxIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i722)).intValue();
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume42 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume42;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localLayoutDirection22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration22 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(localViewConfiguration22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume322;
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = materializerOf(modifier4);
        int i722 = ((((i4 & 14) | ((i4 >> 12) & 112)) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1283constructorimpl22 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl22, measurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl22, density22, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        content.invoke(startRestartGroup, Integer.valueOf((i722 >> 9) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @Deprecated(message = "MeasureBlocks was deprecated. Please use MeasurePolicy and the Layout overloads using it instead.")
    public static final MeasureBlocks measureBlocksOf(final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> minIntrinsicWidthMeasureBlock, final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> minIntrinsicHeightMeasureBlock, final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> maxIntrinsicWidthMeasureBlock, final Function3<? super IntrinsicMeasureScope, ? super List<? extends IntrinsicMeasurable>, ? super Integer, Integer> maxIntrinsicHeightMeasureBlock, final Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> measureBlock) {
        Intrinsics.checkNotNullParameter(minIntrinsicWidthMeasureBlock, "minIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(minIntrinsicHeightMeasureBlock, "minIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(maxIntrinsicWidthMeasureBlock, "maxIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(maxIntrinsicHeightMeasureBlock, "maxIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        return new MeasureBlocks() { // from class: androidx.compose.ui.layout.LayoutKt$measureBlocksOf$1
            @Override // androidx.compose.ui.node.MeasureBlocks
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo3128measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> measurables, long constraints) {
                Intrinsics.checkNotNullParameter(measureScope, "measureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return measureBlock.invoke(measureScope, measurables, Constraints.m3784boximpl(constraints));
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int h) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return minIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(h)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int w) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return minIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(w)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int h) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return maxIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(h)).intValue();
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int w) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return maxIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(w)).intValue();
            }
        };
    }

    public static final Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf(final Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m3129invokeDeg8D_g(skippableUpdater.getComposer(), composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m3129invokeDeg8D_g(Composer composer, Composer composer2, int i) {
                Intrinsics.checkNotNullParameter(composer, "$this$null");
                ComposerKt.sourceInformation(composer2, "C:Layout.kt#80mrfh");
                Modifier materialize = ComposedModifierKt.materialize(composer2, Modifier.this);
                composer.startReplaceableGroup(509942095);
                Updater.m1290setimpl(Updater.m1283constructorimpl(composer), materialize, ComposeUiNode.INSTANCE.getSetModifier());
                composer.endReplaceableGroup();
            }
        });
    }

    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void MultiMeasureLayout(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> content, final MeasurePolicy measurePolicy, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(1949933075);
        ComposerKt.sourceInformation(startRestartGroup, "C(MultiMeasureLayout)P(2)244@9374L7,245@9429L7,246@9488L7,248@9501L545:Layout.kt#80mrfh");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, modifier);
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
            Function0<LayoutNode> constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
            int i5 = ((i3 << 3) & 896) | 6;
            startRestartGroup.startReplaceableGroup(-692256719);
            ComposerKt.sourceInformation(startRestartGroup, "C(ReusableComposeNode)P(1,2)376@14027L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui_release);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl, materialize, ComposeUiNode.INSTANCE.getSetModifier());
            Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            Updater.m1287initimpl(m1283constructorimpl, new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode init) {
                    Intrinsics.checkNotNullParameter(init, "$this$init");
                    init.setCanMultiMeasure$ui_release(true);
                }
            });
            startRestartGroup.enableReusing();
            content.invoke(startRestartGroup, Integer.valueOf((i5 >> 6) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2
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

            public final void invoke(Composer composer2, int i6) {
                LayoutKt.MultiMeasureLayout(Modifier.this, content, measurePolicy, composer2, i | 1, i2);
            }
        });
    }

    @Deprecated(message = "MeasuringIntrinsicsMeasureBlocks was deprecated. Please use MeasurePolicy instead.")
    public static final MeasureBlocks MeasuringIntrinsicsMeasureBlocks(final Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> measureBlock) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        return new MeasureBlocks() { // from class: androidx.compose.ui.layout.LayoutKt$MeasuringIntrinsicsMeasureBlocks$1
            @Override // androidx.compose.ui.node.MeasureBlocks
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public MeasureResult mo3128measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> measurables, long constraints) {
                Intrinsics.checkNotNullParameter(measureScope, "measureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return measureBlock.invoke(measureScope, measurables, Constraints.m3784boximpl(constraints));
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int h) {
                int MeasuringMinIntrinsicWidth;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MeasuringMinIntrinsicWidth = LayoutKt.MeasuringMinIntrinsicWidth(intrinsicMeasureScope, measureBlock, measurables, h, intrinsicMeasureScope.getLayoutDirection());
                return MeasuringMinIntrinsicWidth;
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int w) {
                int MeasuringMinIntrinsicHeight;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MeasuringMinIntrinsicHeight = LayoutKt.MeasuringMinIntrinsicHeight(intrinsicMeasureScope, measureBlock, measurables, w, intrinsicMeasureScope.getLayoutDirection());
                return MeasuringMinIntrinsicHeight;
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int h) {
                int MeasuringMaxIntrinsicWidth;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MeasuringMaxIntrinsicWidth = LayoutKt.MeasuringMaxIntrinsicWidth(intrinsicMeasureScope, measureBlock, measurables, h, intrinsicMeasureScope.getLayoutDirection());
                return MeasuringMaxIntrinsicWidth;
            }

            @Override // androidx.compose.ui.node.MeasureBlocks
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int w) {
                int MeasuringMaxIntrinsicHeight;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MeasuringMaxIntrinsicHeight = LayoutKt.MeasuringMaxIntrinsicHeight(intrinsicMeasureScope, measureBlock, measurables, w, intrinsicMeasureScope.getLayoutDirection());
                return MeasuringMaxIntrinsicHeight;
            }

            public String toString() {
                return JvmActuals_jvmKt.simpleIdentityToString(this, "MeasuringIntrinsicsMeasureBlocks") + "{ measureBlock=" + JvmActuals_jvmKt.simpleIdentityToString(measureBlock, null) + " }";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMinIntrinsicWidth(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        long Constraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null);
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m3784boximpl(Constraints$default)).getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMinIntrinsicHeight(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        long Constraints$default = ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null);
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m3784boximpl(Constraints$default)).getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMaxIntrinsicWidth(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        long Constraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null);
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m3784boximpl(Constraints$default)).getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MeasuringMaxIntrinsicHeight(Density density, Function3<? super MeasureScope, ? super List<? extends Measurable>, ? super Constraints, ? extends MeasureResult> function3, List<? extends IntrinsicMeasurable> list, int i, LayoutDirection layoutDirection) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        long Constraints$default = ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null);
        return function3.invoke(new IntrinsicsMeasureScope(density, layoutDirection), arrayList, Constraints.m3784boximpl(Constraints$default)).getHeight();
    }
}
