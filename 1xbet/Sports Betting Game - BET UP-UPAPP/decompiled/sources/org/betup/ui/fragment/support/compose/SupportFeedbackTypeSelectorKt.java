package org.betup.ui.fragment.support.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: SupportFeedbackTypeSelector.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aI\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\r\u001a;\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u008a\u0084\u0002"}, d2 = {"SupportFeedbackTypeSelector", "", "modifier", "Landroidx/compose/ui/Modifier;", "types", "", "", "selectedIndex", "", "enabled", "", "onSelect", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;IZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SupportFeedbackTypeItem", "text", "showDivider", "isSelected", "isOpen", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "orderedTypeIndices"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportFeedbackTypeSelectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportFeedbackTypeItem$lambda$26(String str, boolean z, boolean z2, boolean z3, Function0 function0, int i, Composer composer, int i2) {
        SupportFeedbackTypeItem(str, z, z2, z3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportFeedbackTypeSelector$lambda$1(Modifier modifier, List list, int i, boolean z, Function1 function1, int i2, int i3, Composer composer, int i4) {
        SupportFeedbackTypeSelector(modifier, list, i, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportFeedbackTypeSelector$lambda$21(Modifier modifier, List list, int i, boolean z, Function1 function1, int i2, int i3, Composer composer, int i4) {
        SupportFeedbackTypeSelector(modifier, list, i, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void SupportFeedbackTypeSelector(Modifier modifier, final List<String> types, final int i, final boolean z, final Function1<? super Integer, Unit> onSelect, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Composer composer2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Composer startRestartGroup = composer.startRestartGroup(-1824618698);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(types) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(onSelect) ? 16384 : 8192;
        }
        if ((i4 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1824618698, i4, -1, "org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelector (SupportFeedbackTypeSelector.kt:43)");
            }
            startRestartGroup.startReplaceGroup(-1111905318);
            if (types.isEmpty()) {
                float f = 24;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(modifier2, ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), Dp.m7774constructorimpl(20), Dp.m7774constructorimpl(14));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextKt.m3621Text4IGK_g("-", (Modifier) null, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3078, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SupportFeedbackTypeSelector$lambda$1;
                            SupportFeedbackTypeSelector$lambda$1 = SupportFeedbackTypeSelectorKt.SupportFeedbackTypeSelector$lambda$1(Modifier.this, types, i, z, onSelect, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return SupportFeedbackTypeSelector$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            startRestartGroup.endReplaceGroup();
            Integer valueOf = Integer.valueOf(i);
            int intValue = valueOf.intValue();
            if (intValue < 0 || intValue >= types.size()) {
                valueOf = null;
            }
            final int intValue2 = valueOf != null ? valueOf.intValue() : 0;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        RoundedCornerShape SupportFeedbackTypeSelector$lambda$5$lambda$4;
                        SupportFeedbackTypeSelector$lambda$5$lambda$4 = SupportFeedbackTypeSelectorKt.SupportFeedbackTypeSelector$lambda$5$lambda$4(MutableState.this);
                        return SupportFeedbackTypeSelector$lambda$5$lambda$4;
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            State state = (State) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            Boolean valueOf2 = Boolean.valueOf(z);
            startRestartGroup.startReplaceGroup(-1633490746);
            int i6 = i4 & 7168;
            boolean z2 = i6 == 2048;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function2) new SupportFeedbackTypeSelectorKt$SupportFeedbackTypeSelector$3$1(z, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, (i4 >> 9) & 14);
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (Function2) new SupportFeedbackTypeSelectorKt$SupportFeedbackTypeSelector$4$1(mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(types, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i4 >> 3) & 14);
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            startRestartGroup.startReplaceGroup(-1746271574);
            boolean changed = startRestartGroup.changed(booleanValue) | startRestartGroup.changed(types) | startRestartGroup.changed(intValue2);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        List SupportFeedbackTypeSelector$lambda$12$lambda$11;
                        SupportFeedbackTypeSelector$lambda$12$lambda$11 = SupportFeedbackTypeSelectorKt.SupportFeedbackTypeSelector$lambda$12$lambda$11(MutableState.this, intValue2, types);
                        return SupportFeedbackTypeSelector$lambda$12$lambda$11;
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final State state2 = (State) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            Modifier modifier5 = modifier2;
            Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(AlphaKt.alpha(modifier2, z ? 1.0f : 0.6f), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), SupportFeedbackTypeSelector$lambda$6(state), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), SupportFeedbackTypeSelector$lambda$6(state));
            startRestartGroup.startReplaceGroup(-1746271574);
            boolean changedInstance = (i6 == 2048) | startRestartGroup.changedInstance(types);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SupportFeedbackTypeSelector$lambda$15$lambda$14;
                        SupportFeedbackTypeSelector$lambda$15$lambda$14 = SupportFeedbackTypeSelectorKt.SupportFeedbackTypeSelector$lambda$15$lambda$14(z, types, mutableState);
                        return SupportFeedbackTypeSelector$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceGroup();
            int i7 = i4;
            Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(m1038borderziNgDLE, (Function0) rememberedValue6, null, z, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, i6, 0, 4090);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changed2 = startRestartGroup.changed(state2) | startRestartGroup.changed(intValue2) | startRestartGroup.changedInstance(types) | (i6 == 2048) | ((i7 & 57344) == 16384);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                final int i8 = intValue2;
                modifier3 = modifier5;
                composer2 = startRestartGroup;
                Object obj = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit SupportFeedbackTypeSelector$lambda$20$lambda$19$lambda$18;
                        SupportFeedbackTypeSelector$lambda$20$lambda$19$lambda$18 = SupportFeedbackTypeSelectorKt.SupportFeedbackTypeSelector$lambda$20$lambda$19$lambda$18(State.this, i8, types, mutableState, z, onSelect, (LazyListScope) obj2);
                        return SupportFeedbackTypeSelector$lambda$20$lambda$19$lambda$18;
                    }
                };
                composer2.updateRememberedValue(obj);
                rememberedValue7 = obj;
            } else {
                composer2 = startRestartGroup;
                modifier3 = modifier5;
            }
            composer2.endReplaceGroup();
            composer3 = composer2;
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) rememberedValue7, composer3, 0, 511);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup2 = composer3.endRestartGroup();
        if (endRestartGroup2 != null) {
            final Modifier modifier6 = modifier2;
            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit SupportFeedbackTypeSelector$lambda$21;
                    SupportFeedbackTypeSelector$lambda$21 = SupportFeedbackTypeSelectorKt.SupportFeedbackTypeSelector$lambda$21(Modifier.this, types, i, z, onSelect, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                    return SupportFeedbackTypeSelector$lambda$21;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoundedCornerShape SupportFeedbackTypeSelector$lambda$5$lambda$4(MutableState mutableState) {
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            return RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(16));
        }
        return RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List SupportFeedbackTypeSelector$lambda$12$lambda$11(MutableState mutableState, int i, List list) {
        if (!((Boolean) mutableState.getValue()).booleanValue()) {
            return CollectionsKt.listOf(Integer.valueOf(i));
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(Integer.valueOf(i));
        IntRange indices = CollectionsKt.getIndices(list);
        ArrayList arrayList = new ArrayList();
        for (Integer num : indices) {
            if (num.intValue() != i) {
                arrayList.add(num);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            createListBuilder.add(Integer.valueOf(((Number) it.next()).intValue()));
        }
        return CollectionsKt.build(createListBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportFeedbackTypeSelector$lambda$15$lambda$14(boolean z, List list, MutableState mutableState) {
        if (!z || list.size() <= 1) {
            return Unit.INSTANCE;
        }
        mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportFeedbackTypeSelector$lambda$20$lambda$19$lambda$18(final State state, final int i, final List list, final MutableState mutableState, final boolean z, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<Integer> SupportFeedbackTypeSelector$lambda$13 = SupportFeedbackTypeSelector$lambda$13(state);
        LazyColumn.items(SupportFeedbackTypeSelector$lambda$13.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$SupportFeedbackTypeSelector$lambda$20$lambda$19$lambda$18$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                SupportFeedbackTypeSelector$lambda$13.get(i2);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$SupportFeedbackTypeSelector$lambda$20$lambda$19$lambda$18$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i4;
                boolean z2;
                boolean changed;
                Object rememberedValue;
                List SupportFeedbackTypeSelector$lambda$132;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i3 & 6) == 0) {
                    i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if (!composer.shouldExecute((i4 & Opcodes.I2S) != 146, i4 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final int intValue = ((Number) SupportFeedbackTypeSelector$lambda$13.get(i2)).intValue();
                composer.startReplaceGroup(1094904417);
                boolean z3 = intValue == i;
                String str = (String) list.get(intValue);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    SupportFeedbackTypeSelector$lambda$132 = SupportFeedbackTypeSelectorKt.SupportFeedbackTypeSelector$lambda$13(state);
                    if (i2 < CollectionsKt.getLastIndex(SupportFeedbackTypeSelector$lambda$132)) {
                        z2 = true;
                        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                        composer.startReplaceGroup(-1224400529);
                        changed = composer.changed(z) | composer.changed(function1) | composer.changed(intValue);
                        rememberedValue = composer.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            final MutableState mutableState2 = mutableState;
                            final boolean z4 = z;
                            final Function1 function12 = function1;
                            rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$SupportFeedbackTypeSelector$6$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (mutableState2.getValue().booleanValue() && z4) {
                                        function12.invoke(Integer.valueOf(intValue));
                                    }
                                    if (z4) {
                                        mutableState2.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
                                    }
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceGroup();
                        SupportFeedbackTypeSelectorKt.SupportFeedbackTypeItem(str, z2, z3, booleanValue, (Function0) rememberedValue, composer, 0);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            return;
                        }
                        ComposerKt.traceEventEnd();
                        return;
                    }
                }
                z2 = false;
                boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                composer.startReplaceGroup(-1224400529);
                changed = composer.changed(z) | composer.changed(function1) | composer.changed(intValue);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                final MutableState<Boolean> mutableState22 = mutableState;
                final boolean z42 = z;
                final Function1<? super Integer, Unit> function122 = function1;
                rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$SupportFeedbackTypeSelector$6$1$1$1$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (mutableState22.getValue().booleanValue() && z42) {
                            function122.invoke(Integer.valueOf(intValue));
                        }
                        if (z42) {
                            mutableState22.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
                        }
                    }
                };
                composer.updateRememberedValue(rememberedValue);
                composer.endReplaceGroup();
                SupportFeedbackTypeSelectorKt.SupportFeedbackTypeItem(str, z2, z3, booleanValue2, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SupportFeedbackTypeItem(final String str, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1386952762);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1386952762, i2, -1, "org.betup.ui.fragment.support.compose.SupportFeedbackTypeItem (SupportFeedbackTypeSelector.kt:140)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            boolean z4 = (57344 & i2) == 16384;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SupportFeedbackTypeItem$lambda$23$lambda$22;
                        SupportFeedbackTypeItem$lambda$23$lambda$22 = SupportFeedbackTypeSelectorKt.SupportFeedbackTypeItem$lambda$23$lambda$22(Function0.this);
                        return SupportFeedbackTypeItem$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7774constructorimpl(20), Dp.m7774constructorimpl(14));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m3621Text4IGK_g(str, (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (14 & i2) | 199680, 0, 131026);
            startRestartGroup.startReplaceGroup(1398219643);
            if (z2) {
                ImageKt.Image(PainterResources_androidKt.painterResource(z3 ? R.drawable.arrow_up_gold : R.drawable.arrow_down_gold, startRestartGroup, 0), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1470706417);
            if (z) {
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), startRestartGroup, 6);
                BoxKt.Box(BackgroundKt.background$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(1)), ComposeUtils.AppBrushPalette.BorderGrayTransparentHorizontal.INSTANCE.getBrush(), null, 0.0f, 6, null), startRestartGroup, 0);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.support.compose.SupportFeedbackTypeSelectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SupportFeedbackTypeItem$lambda$26;
                    SupportFeedbackTypeItem$lambda$26 = SupportFeedbackTypeSelectorKt.SupportFeedbackTypeItem$lambda$26(str, z, z2, z3, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SupportFeedbackTypeItem$lambda$26;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SupportFeedbackTypeItem$lambda$23$lambda$22(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final RoundedCornerShape SupportFeedbackTypeSelector$lambda$6(State<RoundedCornerShape> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> SupportFeedbackTypeSelector$lambda$13(State<? extends List<Integer>> state) {
        return state.getValue();
    }
}
