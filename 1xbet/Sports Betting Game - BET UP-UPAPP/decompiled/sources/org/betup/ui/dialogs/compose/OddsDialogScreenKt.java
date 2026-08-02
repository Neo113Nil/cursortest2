package org.betup.ui.dialogs.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.OddHelper;
import org.betup.utils.SharedPrefs;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: OddsDialogScreen.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\u001a%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a§\u0001\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\f\u0010#\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010'X\u008a\u008e\u0002²\u0006\f\u0010(\u001a\u0004\u0018\u00010'X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u008e\u0002"}, d2 = {"OddsDialogMatchPreviewOuterShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "OddsDialogMatchPreviewInnerShape", "OddsDialogSelectedBetOuterShape", "OddsDialogSelectedBetInnerShape", "OddsPreviewAmountRow", "", "label", "", "value", "valueGold", "", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "OddsDialogScreen", "currentOddType", "Lorg/betup/model/local/entity/OddType;", "allowBetAmountConfiguration", "onDismiss", "Lkotlin/Function1;", "onCancel", "Lkotlin/Function0;", "onOpenDefaultBetAmount", "showTopCloseRow", "demoCoefficientWin1", "", "demoCoefficientDraw", "demoCoefficientWin2", "dialogHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "dialogVerticalPadding", "scaleVerticalPadding", "isInTour", "OddsDialogScreen-g3amZ_k", "(Lorg/betup/model/local/entity/OddType;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZDDDFFFZLandroidx/compose/runtime/Composer;III)V", "app_release", "selectedOddType", "selectedDemoOutcome", "Lorg/betup/ui/dialogs/compose/DemoBetOutcome;", "contentSize", "Landroidx/compose/ui/unit/IntSize;", "contentBottomSize", "contentBottomY", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OddsDialogScreenKt {
    private static final RoundedCornerShape OddsDialogMatchPreviewInnerShape;
    private static final RoundedCornerShape OddsDialogMatchPreviewOuterShape;
    private static final RoundedCornerShape OddsDialogSelectedBetInnerShape;
    private static final RoundedCornerShape OddsDialogSelectedBetOuterShape;

    /* compiled from: OddsDialogScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DemoBetOutcome.values().length];
            try {
                iArr[DemoBetOutcome.WIN1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DemoBetOutcome.DRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DemoBetOutcome.WIN2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OddsDialogScreen_g3amZ_k$lambda$23(OddType oddType, boolean z, Function1 function1, Function0 function0, Function0 function02, boolean z2, double d, double d2, double d3, float f, float f2, float f3, boolean z3, int i, int i2, int i3, Composer composer, int i4) {
        m13316OddsDialogScreeng3amZ_k(oddType, z, function1, function0, function02, z2, d, d2, d3, f, f2, f3, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OddsPreviewAmountRow$lambda$2(String str, String str2, boolean z, int i, Composer composer, int i2) {
        OddsPreviewAmountRow(str, str2, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OddsPreviewAmountRow(final String str, final String str2, final boolean z, Composer composer, final int i) {
        int i2;
        long j;
        Composer startRestartGroup = composer.startRestartGroup(-1074488019);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1074488019, i2, -1, "org.betup.ui.dialogs.compose.OddsPreviewAmountRow (OddsDialogScreen.kt:86)");
            }
            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(2), 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
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
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            TextKt.m2642Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(10), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            long sp = TextUnitKt.getSp(13);
            FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
            FontWeight bold = FontWeight.INSTANCE.getBold();
            if (z) {
                j = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            } else {
                j = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
            }
            TextKt.m2642Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, sp, bold, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i2 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            startRestartGroup = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OddsPreviewAmountRow$lambda$2;
                    OddsPreviewAmountRow$lambda$2 = OddsDialogScreenKt.OddsPreviewAmountRow$lambda$2(str, str2, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return OddsPreviewAmountRow$lambda$2;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ea  */
    /* renamed from: OddsDialogScreen-g3amZ_k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13316OddsDialogScreeng3amZ_k(final OddType oddType, final boolean z, final Function1<? super OddType, Unit> onDismiss, final Function0<Unit> onCancel, Function0<Unit> function0, boolean z2, double d, double d2, double d3, float f, float f2, float f3, boolean z3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object rememberedValue;
        Object rememberedValue2;
        Context context;
        boolean changed;
        Object rememberedValue3;
        long coerceAtLeast;
        boolean changed2;
        Object rememberedValue4;
        int i15;
        double d4;
        OddType OddsDialogScreen_g3amZ_k$lambda$4;
        boolean changed3;
        Object rememberedValue5;
        boolean changed4;
        Object rememberedValue6;
        String str;
        boolean changed5;
        Object rememberedValue7;
        Object rememberedValue8;
        int i16;
        Object rememberedValue9;
        Object rememberedValue10;
        Composer composer2;
        final Function0<Unit> function02;
        final boolean z4;
        final double d5;
        final double d6;
        final double d7;
        final float f4;
        final float f5;
        final float f6;
        final boolean z5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Composer startRestartGroup = composer.startRestartGroup(-1781833794);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onCancel) ? 2048 : 1024;
        }
        int i17 = i3 & 16;
        if (i17 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(d) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                    i8 = i17;
                } else {
                    i8 = i17;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(d2) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(d3) ? 67108864 : 33554432;
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                    i4 |= 805306368;
                } else if ((805306368 & i) == 0) {
                    i4 |= startRestartGroup.changed(f) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i12 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i12 = i2 | (startRestartGroup.changed(f2) ? 4 : 2);
                    } else {
                        i12 = i2;
                    }
                    i13 = i3 & 2048;
                    if (i13 == 0) {
                        i12 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i12 |= startRestartGroup.changed(f3) ? 32 : 16;
                    }
                    int i18 = i12;
                    i14 = i3 & 4096;
                    if (i14 == 0) {
                        i18 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i18 |= startRestartGroup.changed(z3) ? 256 : 128;
                        if ((i4 & 306783363) != 306783362 && (i18 & Opcodes.I2S) == 146 && startRestartGroup.getSkipping()) {
                            startRestartGroup.skipToGroupEnd();
                            function02 = function0;
                            z4 = z2;
                            d5 = d;
                            d7 = d3;
                            f4 = f;
                            f5 = f2;
                            f6 = f3;
                            z5 = z3;
                            composer2 = startRestartGroup;
                            d6 = d2;
                        } else {
                            Function0<Unit> function03 = i8 != 0 ? null : function0;
                            boolean z6 = i5 != 0 ? true : z2;
                            double d8 = i6 != 0 ? 2.5d : d;
                            double d9 = i7 != 0 ? 4.0d : d2;
                            double d10 = i9 != 0 ? 3.5d : d3;
                            float m7774constructorimpl = i10 != 0 ? Dp.m7774constructorimpl(28) : f;
                            float m7774constructorimpl2 = i11 != 0 ? Dp.m7774constructorimpl(20) : f2;
                            float m7774constructorimpl3 = i13 != 0 ? Dp.m7774constructorimpl(36) : f3;
                            boolean z7 = i14 != 0 ? false : z3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1781833794, i4, i18, "org.betup.ui.dialogs.compose.OddsDialogScreen (OddsDialogScreen.kt:147)");
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(oddType == null ? OddType.DECIMAL : oddType, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            MutableState mutableState = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DemoBetOutcome.WIN1, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            MutableState mutableState2 = (MutableState) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localContext);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            context = (Context) consume;
                            startRestartGroup.startReplaceGroup(5004770);
                            changed = startRestartGroup.changed(context);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                if (SharedPrefs.isSelectedDefaultsBetsAmounts(context)) {
                                    coerceAtLeast = 100;
                                } else {
                                    Long customBetAmount = SharedPrefs.getCustomBetAmount(context);
                                    Intrinsics.checkNotNullExpressionValue(customBetAmount, "getCustomBetAmount(...)");
                                    coerceAtLeast = RangesKt.coerceAtLeast(customBetAmount.longValue(), 100L);
                                }
                                rememberedValue3 = Long.valueOf(coerceAtLeast);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            long longValue = ((Number) rememberedValue3).longValue();
                            startRestartGroup.endReplaceGroup();
                            DemoBetOutcome OddsDialogScreen_g3amZ_k$lambda$7 = OddsDialogScreen_g3amZ_k$lambda$7(mutableState2);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            changed2 = ((i4 & 234881024) == 67108864) | startRestartGroup.changed(OddsDialogScreen_g3amZ_k$lambda$7.ordinal()) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                i15 = WhenMappings.$EnumSwitchMapping$0[OddsDialogScreen_g3amZ_k$lambda$7(mutableState2).ordinal()];
                                if (i15 == 1) {
                                    d4 = d8;
                                } else if (i15 == 2) {
                                    d4 = d9;
                                } else {
                                    if (i15 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    d4 = d10;
                                }
                                rememberedValue4 = Double.valueOf(d4);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            double doubleValue = ((Number) rememberedValue4).doubleValue();
                            startRestartGroup.endReplaceGroup();
                            OddsDialogScreen_g3amZ_k$lambda$4 = OddsDialogScreen_g3amZ_k$lambda$4(mutableState);
                            if (OddsDialogScreen_g3amZ_k$lambda$4 == null) {
                                OddsDialogScreen_g3amZ_k$lambda$4 = OddType.DECIMAL;
                            }
                            OddType oddType2 = OddsDialogScreen_g3amZ_k$lambda$4;
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changed3 = startRestartGroup.changed(oddType2.ordinal()) | startRestartGroup.changed(doubleValue);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = OddHelper.format(oddType2, doubleValue);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            String str2 = (String) rememberedValue5;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changed4 = startRestartGroup.changed(longValue) | startRestartGroup.changed(doubleValue);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!changed4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                str = "CC(<get-current>):CompositionLocal.kt#9igjgp";
                                rememberedValue6 = Long.valueOf(MathKt.roundToLong(longValue * doubleValue));
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            } else {
                                str = "CC(<get-current>):CompositionLocal.kt#9igjgp";
                            }
                            long longValue2 = ((Number) rememberedValue6).longValue();
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changed5 = startRestartGroup.changed(longValue2) | startRestartGroup.changed(longValue);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (!changed5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = Long.valueOf(longValue2 - longValue);
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            long longValue3 = ((Number) rememberedValue7).longValue();
                            startRestartGroup.endReplaceGroup();
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            String str3 = str;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str3);
                            Object consume2 = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density = (Density) consume2;
                            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str3);
                            Object consume3 = startRestartGroup.consume(localView);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            View view = (View) consume3;
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                i16 = 2;
                                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            } else {
                                i16 = 2;
                            }
                            MutableState mutableState3 = (MutableState) rememberedValue8;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue9 = startRestartGroup.rememberedValue();
                            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i16, null);
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                            }
                            MutableState mutableState4 = (MutableState) rememberedValue9;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue10 = startRestartGroup.rememberedValue();
                            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue10);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            OddsDialogScreenKt$OddsDialogScreen$1 oddsDialogScreenKt$OddsDialogScreen$1 = new OddsDialogScreenKt$OddsDialogScreen$1(m7774constructorimpl3, m7774constructorimpl, m7774constructorimpl2, view, mutableState3, density, (MutableState) rememberedValue10, mutableState4, z6, onCancel, z7, function03, mutableState, oddType2, d8, d9, d10, mutableState2, longValue, longValue2, longValue3, str2, onDismiss);
                            composer2 = startRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(fillMaxWidth$default, null, false, ComposableLambdaKt.rememberComposableLambda(592984724, true, oddsDialogScreenKt$OddsDialogScreen$1, composer2, 54), composer2, 3078, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function02 = function03;
                            z4 = z6;
                            d5 = d8;
                            d6 = d9;
                            d7 = d10;
                            f4 = m7774constructorimpl;
                            f5 = m7774constructorimpl2;
                            f6 = m7774constructorimpl3;
                            z5 = z7;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit OddsDialogScreen_g3amZ_k$lambda$23;
                                    OddsDialogScreen_g3amZ_k$lambda$23 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$23(OddType.this, z, onDismiss, onCancel, function02, z4, d5, d6, d7, f4, f5, f6, z5, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return OddsDialogScreen_g3amZ_k$lambda$23;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i4 & 306783363) != 306783362) {
                    }
                    if (i8 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState5 = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState22 = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume4 = startRestartGroup.consume(localContext2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    context = (Context) consume4;
                    startRestartGroup.startReplaceGroup(5004770);
                    changed = startRestartGroup.changed(context);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    if (SharedPrefs.isSelectedDefaultsBetsAmounts(context)) {
                    }
                    rememberedValue3 = Long.valueOf(coerceAtLeast);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    long longValue4 = ((Number) rememberedValue3).longValue();
                    startRestartGroup.endReplaceGroup();
                    DemoBetOutcome OddsDialogScreen_g3amZ_k$lambda$72 = OddsDialogScreen_g3amZ_k$lambda$7(mutableState22);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changed2 = ((i4 & 234881024) == 67108864) | startRestartGroup.changed(OddsDialogScreen_g3amZ_k$lambda$72.ordinal()) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    i15 = WhenMappings.$EnumSwitchMapping$0[OddsDialogScreen_g3amZ_k$lambda$7(mutableState22).ordinal()];
                    if (i15 == 1) {
                    }
                    rememberedValue4 = Double.valueOf(d4);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    double doubleValue2 = ((Number) rememberedValue4).doubleValue();
                    startRestartGroup.endReplaceGroup();
                    OddsDialogScreen_g3amZ_k$lambda$4 = OddsDialogScreen_g3amZ_k$lambda$4(mutableState5);
                    if (OddsDialogScreen_g3amZ_k$lambda$4 == null) {
                    }
                    OddType oddType22 = OddsDialogScreen_g3amZ_k$lambda$4;
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed3 = startRestartGroup.changed(oddType22.ordinal()) | startRestartGroup.changed(doubleValue2);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue5 = OddHelper.format(oddType22, doubleValue2);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    String str22 = (String) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed4 = startRestartGroup.changed(longValue4) | startRestartGroup.changed(doubleValue2);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    str = "CC(<get-current>):CompositionLocal.kt#9igjgp";
                    rememberedValue6 = Long.valueOf(MathKt.roundToLong(longValue4 * doubleValue2));
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    long longValue22 = ((Number) rememberedValue6).longValue();
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed5 = startRestartGroup.changed(longValue22) | startRestartGroup.changed(longValue4);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changed5) {
                    }
                    rememberedValue7 = Long.valueOf(longValue22 - longValue4);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                    long longValue32 = ((Number) rememberedValue7).longValue();
                    startRestartGroup.endReplaceGroup();
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    String str32 = str;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str32);
                    Object consume22 = startRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density2 = (Density) consume22;
                    ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str32);
                    Object consume32 = startRestartGroup.consume(localView2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    View view2 = (View) consume32;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState32 = (MutableState) rememberedValue8;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState42 = (MutableState) rememberedValue9;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue10 = startRestartGroup.rememberedValue();
                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    OddsDialogScreenKt$OddsDialogScreen$1 oddsDialogScreenKt$OddsDialogScreen$12 = new OddsDialogScreenKt$OddsDialogScreen$1(m7774constructorimpl3, m7774constructorimpl, m7774constructorimpl2, view2, mutableState32, density2, (MutableState) rememberedValue10, mutableState42, z6, onCancel, z7, function03, mutableState5, oddType22, d8, d9, d10, mutableState22, longValue4, longValue22, longValue32, str22, onDismiss);
                    composer2 = startRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(fillMaxWidth$default2, null, false, ComposableLambdaKt.rememberComposableLambda(592984724, true, oddsDialogScreenKt$OddsDialogScreen$12, composer2, 54), composer2, 3078, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function02 = function03;
                    z4 = z6;
                    d5 = d8;
                    d6 = d9;
                    d7 = d10;
                    f4 = m7774constructorimpl;
                    f5 = m7774constructorimpl2;
                    f6 = m7774constructorimpl3;
                    z5 = z7;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                i13 = i3 & 2048;
                if (i13 == 0) {
                }
                int i182 = i12;
                i14 = i3 & 4096;
                if (i14 == 0) {
                }
                if ((i4 & 306783363) != 306783362) {
                }
                if (i8 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState52 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState222 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume42 = startRestartGroup.consume(localContext22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                context = (Context) consume42;
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(context);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                if (SharedPrefs.isSelectedDefaultsBetsAmounts(context)) {
                }
                rememberedValue3 = Long.valueOf(coerceAtLeast);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                long longValue42 = ((Number) rememberedValue3).longValue();
                startRestartGroup.endReplaceGroup();
                DemoBetOutcome OddsDialogScreen_g3amZ_k$lambda$722 = OddsDialogScreen_g3amZ_k$lambda$7(mutableState222);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed2 = ((i4 & 234881024) == 67108864) | startRestartGroup.changed(OddsDialogScreen_g3amZ_k$lambda$722.ordinal()) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                i15 = WhenMappings.$EnumSwitchMapping$0[OddsDialogScreen_g3amZ_k$lambda$7(mutableState222).ordinal()];
                if (i15 == 1) {
                }
                rememberedValue4 = Double.valueOf(d4);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                double doubleValue22 = ((Number) rememberedValue4).doubleValue();
                startRestartGroup.endReplaceGroup();
                OddsDialogScreen_g3amZ_k$lambda$4 = OddsDialogScreen_g3amZ_k$lambda$4(mutableState52);
                if (OddsDialogScreen_g3amZ_k$lambda$4 == null) {
                }
                OddType oddType222 = OddsDialogScreen_g3amZ_k$lambda$4;
                startRestartGroup.startReplaceGroup(-1633490746);
                changed3 = startRestartGroup.changed(oddType222.ordinal()) | startRestartGroup.changed(doubleValue22);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue5 = OddHelper.format(oddType222, doubleValue22);
                startRestartGroup.updateRememberedValue(rememberedValue5);
                String str222 = (String) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changed4 = startRestartGroup.changed(longValue42) | startRestartGroup.changed(doubleValue22);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                str = "CC(<get-current>):CompositionLocal.kt#9igjgp";
                rememberedValue6 = Long.valueOf(MathKt.roundToLong(longValue42 * doubleValue22));
                startRestartGroup.updateRememberedValue(rememberedValue6);
                long longValue222 = ((Number) rememberedValue6).longValue();
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changed5 = startRestartGroup.changed(longValue222) | startRestartGroup.changed(longValue42);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changed5) {
                }
                rememberedValue7 = Long.valueOf(longValue222 - longValue42);
                startRestartGroup.updateRememberedValue(rememberedValue7);
                long longValue322 = ((Number) rememberedValue7).longValue();
                startRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                String str322 = str;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str322);
                Object consume222 = startRestartGroup.consume(localDensity22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density22 = (Density) consume222;
                ProvidableCompositionLocal<View> localView22 = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str322);
                Object consume322 = startRestartGroup.consume(localView22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                View view22 = (View) consume322;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState322 = (MutableState) rememberedValue8;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState422 = (MutableState) rememberedValue9;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                OddsDialogScreenKt$OddsDialogScreen$1 oddsDialogScreenKt$OddsDialogScreen$122 = new OddsDialogScreenKt$OddsDialogScreen$1(m7774constructorimpl3, m7774constructorimpl, m7774constructorimpl2, view22, mutableState322, density22, (MutableState) rememberedValue10, mutableState422, z6, onCancel, z7, function03, mutableState52, oddType222, d8, d9, d10, mutableState222, longValue42, longValue222, longValue322, str222, onDismiss);
                composer2 = startRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(fillMaxWidth$default22, null, false, ComposableLambdaKt.rememberComposableLambda(592984724, true, oddsDialogScreenKt$OddsDialogScreen$122, composer2, 54), composer2, 3078, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                function02 = function03;
                z4 = z6;
                d5 = d8;
                d6 = d9;
                d7 = d10;
                f4 = m7774constructorimpl;
                f5 = m7774constructorimpl2;
                f6 = m7774constructorimpl3;
                z5 = z7;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            i13 = i3 & 2048;
            if (i13 == 0) {
            }
            int i1822 = i12;
            i14 = i3 & 4096;
            if (i14 == 0) {
            }
            if ((i4 & 306783363) != 306783362) {
            }
            if (i8 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState522 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState2222 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume422 = startRestartGroup.consume(localContext222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            context = (Context) consume422;
            startRestartGroup.startReplaceGroup(5004770);
            changed = startRestartGroup.changed(context);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            if (SharedPrefs.isSelectedDefaultsBetsAmounts(context)) {
            }
            rememberedValue3 = Long.valueOf(coerceAtLeast);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            long longValue422 = ((Number) rememberedValue3).longValue();
            startRestartGroup.endReplaceGroup();
            DemoBetOutcome OddsDialogScreen_g3amZ_k$lambda$7222 = OddsDialogScreen_g3amZ_k$lambda$7(mutableState2222);
            startRestartGroup.startReplaceGroup(-1224400529);
            changed2 = ((i4 & 234881024) == 67108864) | startRestartGroup.changed(OddsDialogScreen_g3amZ_k$lambda$7222.ordinal()) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            i15 = WhenMappings.$EnumSwitchMapping$0[OddsDialogScreen_g3amZ_k$lambda$7(mutableState2222).ordinal()];
            if (i15 == 1) {
            }
            rememberedValue4 = Double.valueOf(d4);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            double doubleValue222 = ((Number) rememberedValue4).doubleValue();
            startRestartGroup.endReplaceGroup();
            OddsDialogScreen_g3amZ_k$lambda$4 = OddsDialogScreen_g3amZ_k$lambda$4(mutableState522);
            if (OddsDialogScreen_g3amZ_k$lambda$4 == null) {
            }
            OddType oddType2222 = OddsDialogScreen_g3amZ_k$lambda$4;
            startRestartGroup.startReplaceGroup(-1633490746);
            changed3 = startRestartGroup.changed(oddType2222.ordinal()) | startRestartGroup.changed(doubleValue222);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue5 = OddHelper.format(oddType2222, doubleValue222);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            String str2222 = (String) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1633490746);
            changed4 = startRestartGroup.changed(longValue422) | startRestartGroup.changed(doubleValue222);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            str = "CC(<get-current>):CompositionLocal.kt#9igjgp";
            rememberedValue6 = Long.valueOf(MathKt.roundToLong(longValue422 * doubleValue222));
            startRestartGroup.updateRememberedValue(rememberedValue6);
            long longValue2222 = ((Number) rememberedValue6).longValue();
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1633490746);
            changed5 = startRestartGroup.changed(longValue2222) | startRestartGroup.changed(longValue422);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changed5) {
            }
            rememberedValue7 = Long.valueOf(longValue2222 - longValue422);
            startRestartGroup.updateRememberedValue(rememberedValue7);
            long longValue3222 = ((Number) rememberedValue7).longValue();
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
            String str3222 = str;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str3222);
            Object consume2222 = startRestartGroup.consume(localDensity222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density222 = (Density) consume2222;
            ProvidableCompositionLocal<View> localView222 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str3222);
            Object consume3222 = startRestartGroup.consume(localView222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view222 = (View) consume3222;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState3222 = (MutableState) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState4222 = (MutableState) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            OddsDialogScreenKt$OddsDialogScreen$1 oddsDialogScreenKt$OddsDialogScreen$1222 = new OddsDialogScreenKt$OddsDialogScreen$1(m7774constructorimpl3, m7774constructorimpl, m7774constructorimpl2, view222, mutableState3222, density222, (MutableState) rememberedValue10, mutableState4222, z6, onCancel, z7, function03, mutableState522, oddType2222, d8, d9, d10, mutableState2222, longValue422, longValue2222, longValue3222, str2222, onDismiss);
            composer2 = startRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(fillMaxWidth$default222, null, false, ComposableLambdaKt.rememberComposableLambda(592984724, true, oddsDialogScreenKt$OddsDialogScreen$1222, composer2, 54), composer2, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            function02 = function03;
            z4 = z6;
            d5 = d8;
            d6 = d9;
            d7 = d10;
            f4 = m7774constructorimpl;
            f5 = m7774constructorimpl2;
            f6 = m7774constructorimpl3;
            z5 = z7;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        int i18222 = i12;
        i14 = i3 & 4096;
        if (i14 == 0) {
        }
        if ((i4 & 306783363) != 306783362) {
        }
        if (i8 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState5222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState22222 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume4222 = startRestartGroup.consume(localContext2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        context = (Context) consume4222;
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(context);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        if (SharedPrefs.isSelectedDefaultsBetsAmounts(context)) {
        }
        rememberedValue3 = Long.valueOf(coerceAtLeast);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        long longValue4222 = ((Number) rememberedValue3).longValue();
        startRestartGroup.endReplaceGroup();
        DemoBetOutcome OddsDialogScreen_g3amZ_k$lambda$72222 = OddsDialogScreen_g3amZ_k$lambda$7(mutableState22222);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed2 = ((i4 & 234881024) == 67108864) | startRestartGroup.changed(OddsDialogScreen_g3amZ_k$lambda$72222.ordinal()) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        i15 = WhenMappings.$EnumSwitchMapping$0[OddsDialogScreen_g3amZ_k$lambda$7(mutableState22222).ordinal()];
        if (i15 == 1) {
        }
        rememberedValue4 = Double.valueOf(d4);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        double doubleValue2222 = ((Number) rememberedValue4).doubleValue();
        startRestartGroup.endReplaceGroup();
        OddsDialogScreen_g3amZ_k$lambda$4 = OddsDialogScreen_g3amZ_k$lambda$4(mutableState5222);
        if (OddsDialogScreen_g3amZ_k$lambda$4 == null) {
        }
        OddType oddType22222 = OddsDialogScreen_g3amZ_k$lambda$4;
        startRestartGroup.startReplaceGroup(-1633490746);
        changed3 = startRestartGroup.changed(oddType22222.ordinal()) | startRestartGroup.changed(doubleValue2222);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue5 = OddHelper.format(oddType22222, doubleValue2222);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        String str22222 = (String) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        changed4 = startRestartGroup.changed(longValue4222) | startRestartGroup.changed(doubleValue2222);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        str = "CC(<get-current>):CompositionLocal.kt#9igjgp";
        rememberedValue6 = Long.valueOf(MathKt.roundToLong(longValue4222 * doubleValue2222));
        startRestartGroup.updateRememberedValue(rememberedValue6);
        long longValue22222 = ((Number) rememberedValue6).longValue();
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        changed5 = startRestartGroup.changed(longValue22222) | startRestartGroup.changed(longValue4222);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changed5) {
        }
        rememberedValue7 = Long.valueOf(longValue22222 - longValue4222);
        startRestartGroup.updateRememberedValue(rememberedValue7);
        long longValue32222 = ((Number) rememberedValue7).longValue();
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
        String str32222 = str;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str32222);
        Object consume22222 = startRestartGroup.consume(localDensity2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2222 = (Density) consume22222;
        ProvidableCompositionLocal<View> localView2222 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str32222);
        Object consume32222 = startRestartGroup.consume(localView2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        View view2222 = (View) consume32222;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState32222 = (MutableState) rememberedValue8;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState42222 = (MutableState) rememberedValue9;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        OddsDialogScreenKt$OddsDialogScreen$1 oddsDialogScreenKt$OddsDialogScreen$12222 = new OddsDialogScreenKt$OddsDialogScreen$1(m7774constructorimpl3, m7774constructorimpl, m7774constructorimpl2, view2222, mutableState32222, density2222, (MutableState) rememberedValue10, mutableState42222, z6, onCancel, z7, function03, mutableState5222, oddType22222, d8, d9, d10, mutableState22222, longValue4222, longValue22222, longValue32222, str22222, onDismiss);
        composer2 = startRestartGroup;
        BoxWithConstraintsKt.BoxWithConstraints(fillMaxWidth$default2222, null, false, ComposableLambdaKt.rememberComposableLambda(592984724, true, oddsDialogScreenKt$OddsDialogScreen$12222, composer2, 54), composer2, 3078, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        function02 = function03;
        z4 = z6;
        d5 = d8;
        d6 = d9;
        d7 = d10;
        f4 = m7774constructorimpl;
        f5 = m7774constructorimpl2;
        f6 = m7774constructorimpl3;
        z5 = z7;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OddType OddsDialogScreen_g3amZ_k$lambda$4(MutableState<OddType> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DemoBetOutcome OddsDialogScreen_g3amZ_k$lambda$7(MutableState<DemoBetOutcome> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntSize OddsDialogScreen_g3amZ_k$lambda$15(MutableState<IntSize> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntSize OddsDialogScreen_g3amZ_k$lambda$18(MutableState<IntSize> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OddsDialogScreen_g3amZ_k$lambda$21(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OddsDialogScreen_g3amZ_k$lambda$22(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    static {
        float f = 8;
        OddsDialogMatchPreviewOuterShape = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f));
        float f2 = 6;
        OddsDialogMatchPreviewInnerShape = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2));
        OddsDialogSelectedBetOuterShape = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f));
        OddsDialogSelectedBetInnerShape = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2));
    }
}
