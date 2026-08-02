package org.betup.ui.common.compose.slider;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.google.logging.type.LogSeverity;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;

/* compiled from: CustomBorderSlider.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"CustomBorderSlider", "", "modifier", "Landroidx/compose/ui/Modifier;", "value", "", "totalValue", "minValue", "step", "enabled", "", "onValueChange", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;IIIIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewCustomSlider", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomBorderSliderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomBorderSlider$lambda$2(Modifier modifier, int i, int i2, int i3, int i4, boolean z, Function1 function1, int i5, int i6, Composer composer, int i7) {
        CustomBorderSlider(modifier, i, i2, i3, i4, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCustomSlider$lambda$5(int i, Composer composer, int i2) {
        PreviewCustomSlider(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomBorderSlider(Modifier modifier, final int i, int i2, int i3, int i4, boolean z, final Function1<? super Integer, Unit> onValueChange, Composer composer, final int i5, final int i6) {
        Modifier modifier2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Composer composer2;
        final boolean z3;
        final int i14;
        final int i15;
        final Modifier modifier3;
        final int i16;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(547946714);
        int i17 = i6 & 1;
        if (i17 != 0) {
            i7 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i7 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            i7 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i18 = i6 & 4;
        if (i18 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 = i2;
            i7 |= startRestartGroup.changed(i8) ? 256 : 128;
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
            } else if ((i5 & 3072) == 0) {
                i10 = i3;
                i7 |= startRestartGroup.changed(i10) ? 2048 : 1024;
                i11 = i6 & 16;
                if (i11 != 0) {
                    i7 |= 24576;
                } else if ((i5 & 24576) == 0) {
                    i12 = i4;
                    i7 |= startRestartGroup.changed(i12) ? 16384 : 8192;
                    i13 = i6 & 32;
                    if (i13 == 0) {
                        i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i7 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        }
                    }
                    if ((i6 & 64) == 0) {
                        i7 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        i7 |= startRestartGroup.changedInstance(onValueChange) ? 1048576 : 524288;
                    }
                    if ((i7 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i17 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i18 != 0) {
                            i8 = 2000;
                        }
                        int i19 = i9 == 0 ? 0 : i10;
                        int i20 = i11 == 0 ? 1 : i12;
                        boolean z4 = i13 == 0 ? true : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(547946714, i7, -1, "org.betup.ui.common.compose.slider.CustomBorderSlider (CustomBorderSlider.kt:51)");
                        }
                        int coerceAtLeast = RangesKt.coerceAtLeast(i8, 0);
                        float m7774constructorimpl = Dp.m7774constructorimpl(8);
                        float f = 4;
                        float m7774constructorimpl2 = Dp.m7774constructorimpl(f);
                        float m7774constructorimpl3 = Dp.m7774constructorimpl(2 * m7774constructorimpl);
                        long j = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
                        long j2 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                        long j3 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Modifier modifier4 = companion;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(i + i19);
                        Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated, "getShopBetcoinsFormated(...)");
                        ValueWithIconKt.m12978ValueWithIconiJQMabo(shopBetcoinsFormated, 0L, startRestartGroup, 0, 2);
                        String shopBetcoinsFormated2 = FormatHelper.getShopBetcoinsFormated(coerceAtLeast + i19);
                        Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated2, "getShopBetcoinsFormated(...)");
                        ValueWithIconKt.m12978ValueWithIconiJQMabo(shopBetcoinsFormated2, 0L, startRestartGroup, 0, 2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
                        int i21 = i8;
                        composer2 = startRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(-1926306418, true, new CustomBorderSliderKt$CustomBorderSlider$1$2(coerceAtLeast, i, z4, i20, onValueChange, m7774constructorimpl, m7774constructorimpl2, j, j2, j3, m7774constructorimpl3), composer2, 54), composer2, 3072, 7);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z3 = z4;
                        i14 = i19;
                        i15 = i20;
                        modifier3 = modifier4;
                        i16 = i21;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z3 = z2;
                        modifier3 = modifier2;
                        i16 = i8;
                        i14 = i10;
                        i15 = i12;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.slider.CustomBorderSliderKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit CustomBorderSlider$lambda$2;
                                CustomBorderSlider$lambda$2 = CustomBorderSliderKt.CustomBorderSlider$lambda$2(Modifier.this, i, i16, i14, i15, z3, onValueChange, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                return CustomBorderSlider$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                i12 = i4;
                i13 = i6 & 32;
                if (i13 == 0) {
                }
                if ((i6 & 64) == 0) {
                }
                if ((i7 & 599187) == 599186) {
                }
                if (i17 == 0) {
                }
                if (i18 != 0) {
                }
                if (i9 == 0) {
                }
                if (i11 == 0) {
                }
                if (i13 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int coerceAtLeast2 = RangesKt.coerceAtLeast(i8, 0);
                float m7774constructorimpl4 = Dp.m7774constructorimpl(8);
                float f2 = 4;
                float m7774constructorimpl22 = Dp.m7774constructorimpl(f2);
                float m7774constructorimpl32 = Dp.m7774constructorimpl(2 * m7774constructorimpl4);
                long j4 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
                long j22 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                long j32 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier42 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                String shopBetcoinsFormated3 = FormatHelper.getShopBetcoinsFormated(i + i19);
                Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated3, "getShopBetcoinsFormated(...)");
                ValueWithIconKt.m12978ValueWithIconiJQMabo(shopBetcoinsFormated3, 0L, startRestartGroup, 0, 2);
                String shopBetcoinsFormated22 = FormatHelper.getShopBetcoinsFormated(coerceAtLeast2 + i19);
                Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated22, "getShopBetcoinsFormated(...)");
                ValueWithIconKt.m12978ValueWithIconiJQMabo(shopBetcoinsFormated22, 0L, startRestartGroup, 0, 2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                int i212 = i8;
                composer2 = startRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(-1926306418, true, new CustomBorderSliderKt$CustomBorderSlider$1$2(coerceAtLeast2, i, z4, i20, onValueChange, m7774constructorimpl4, m7774constructorimpl22, j4, j22, j32, m7774constructorimpl32), composer2, 54), composer2, 3072, 7);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z4;
                i14 = i19;
                i15 = i20;
                modifier3 = modifier42;
                i16 = i212;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i10 = i3;
            i11 = i6 & 16;
            if (i11 != 0) {
            }
            i12 = i4;
            i13 = i6 & 32;
            if (i13 == 0) {
            }
            if ((i6 & 64) == 0) {
            }
            if ((i7 & 599187) == 599186) {
            }
            if (i17 == 0) {
            }
            if (i18 != 0) {
            }
            if (i9 == 0) {
            }
            if (i11 == 0) {
            }
            if (i13 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int coerceAtLeast22 = RangesKt.coerceAtLeast(i8, 0);
            float m7774constructorimpl42 = Dp.m7774constructorimpl(8);
            float f22 = 4;
            float m7774constructorimpl222 = Dp.m7774constructorimpl(f22);
            float m7774constructorimpl322 = Dp.m7774constructorimpl(2 * m7774constructorimpl42);
            long j42 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
            long j222 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            long j322 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier422 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween22, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            String shopBetcoinsFormated32 = FormatHelper.getShopBetcoinsFormated(i + i19);
            Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated32, "getShopBetcoinsFormated(...)");
            ValueWithIconKt.m12978ValueWithIconiJQMabo(shopBetcoinsFormated32, 0L, startRestartGroup, 0, 2);
            String shopBetcoinsFormated222 = FormatHelper.getShopBetcoinsFormated(coerceAtLeast22 + i19);
            Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated222, "getShopBetcoinsFormated(...)");
            ValueWithIconKt.m12978ValueWithIconiJQMabo(shopBetcoinsFormated222, 0L, startRestartGroup, 0, 2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), startRestartGroup, 6);
            int i2122 = i8;
            composer2 = startRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(-1926306418, true, new CustomBorderSliderKt$CustomBorderSlider$1$2(coerceAtLeast22, i, z4, i20, onValueChange, m7774constructorimpl42, m7774constructorimpl222, j42, j222, j322, m7774constructorimpl322), composer2, 54), composer2, 3072, 7);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4;
            i14 = i19;
            i15 = i20;
            modifier3 = modifier422;
            i16 = i2122;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i2;
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i3;
        i11 = i6 & 16;
        if (i11 != 0) {
        }
        i12 = i4;
        i13 = i6 & 32;
        if (i13 == 0) {
        }
        if ((i6 & 64) == 0) {
        }
        if ((i7 & 599187) == 599186) {
        }
        if (i17 == 0) {
        }
        if (i18 != 0) {
        }
        if (i9 == 0) {
        }
        if (i11 == 0) {
        }
        if (i13 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int coerceAtLeast222 = RangesKt.coerceAtLeast(i8, 0);
        float m7774constructorimpl422 = Dp.m7774constructorimpl(8);
        float f222 = 4;
        float m7774constructorimpl2222 = Dp.m7774constructorimpl(f222);
        float m7774constructorimpl3222 = Dp.m7774constructorimpl(2 * m7774constructorimpl422);
        long j422 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
        long j2222 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
        long j3222 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier4222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        Arrangement.HorizontalOrVertical spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceBetween222, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        String shopBetcoinsFormated322 = FormatHelper.getShopBetcoinsFormated(i + i19);
        Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated322, "getShopBetcoinsFormated(...)");
        ValueWithIconKt.m12978ValueWithIconiJQMabo(shopBetcoinsFormated322, 0L, startRestartGroup, 0, 2);
        String shopBetcoinsFormated2222 = FormatHelper.getShopBetcoinsFormated(coerceAtLeast222 + i19);
        Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated2222, "getShopBetcoinsFormated(...)");
        ValueWithIconKt.m12978ValueWithIconiJQMabo(shopBetcoinsFormated2222, 0L, startRestartGroup, 0, 2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f222)), startRestartGroup, 6);
        int i21222 = i8;
        composer2 = startRestartGroup;
        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(-1926306418, true, new CustomBorderSliderKt$CustomBorderSlider$1$2(coerceAtLeast222, i, z4, i20, onValueChange, m7774constructorimpl422, m7774constructorimpl2222, j422, j2222, j3222, m7774constructorimpl3222), composer2, 54), composer2, 3072, 7);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z4;
        i14 = i19;
        i15 = i20;
        modifier3 = modifier4222;
        i16 = i21222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PreviewCustomSlider(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2119727558);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2119727558, i, -1, "org.betup.ui.common.compose.slider.PreviewCustomSlider (CustomBorderSlider.kt:186)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.slider.CustomBorderSliderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PreviewCustomSlider$lambda$4$lambda$3;
                        PreviewCustomSlider$lambda$4$lambda$3 = CustomBorderSliderKt.PreviewCustomSlider$lambda$4$lambda$3(((Integer) obj).intValue());
                        return PreviewCustomSlider$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CustomBorderSlider(null, LogSeverity.EMERGENCY_VALUE, 0, 0, 0, false, (Function1) rememberedValue, startRestartGroup, 1572912, 61);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.slider.CustomBorderSliderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewCustomSlider$lambda$5;
                    PreviewCustomSlider$lambda$5 = CustomBorderSliderKt.PreviewCustomSlider$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewCustomSlider$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCustomSlider$lambda$4$lambda$3(int i) {
        return Unit.INSTANCE;
    }
}
