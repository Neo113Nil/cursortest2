package org.betup.ui.fragment.matches.compose;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: DateSelectorElement.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a;\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a\"\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0002\u001a\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"ITEM_MIN_WIDTH_DP", "", "ITEM_SELECTED_WIDTH_DP", "ITEM_SPACING_DP", "DateSelectorElement", "", "selectedDate", "", "onDateSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;II)V", "DateItem", "dateString", "displayText", "isSelected", "", "isPastDate", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "generateDateList", "", "Lkotlin/Pair;", "context", "Landroid/content/Context;", "formatDisplayText", "date", "Ljava/time/LocalDate;", "formatDate", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DateSelectorElementKt {
    private static final int ITEM_MIN_WIDTH_DP = 60;
    private static final int ITEM_SELECTED_WIDTH_DP = 96;
    private static final int ITEM_SPACING_DP = 16;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateItem$lambda$6(String str, String str2, boolean z, boolean z2, Function0 function0, int i, Composer composer, int i2) {
        DateItem(str, str2, z, z2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateSelectorElement$lambda$1(String str, Function1 function1, Modifier modifier, LazyListState lazyListState, int i, int i2, Composer composer, int i3) {
        DateSelectorElement(str, function1, modifier, lazyListState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        if ((r14 & 8) != 0) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DateSelectorElement(final String selectedDate, final Function1<? super String, Unit> onDateSelected, Modifier modifier, LazyListState lazyListState, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(onDateSelected, "onDateSelected");
        Composer startRestartGroup = composer.startRestartGroup(-675224451);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(selectedDate) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onDateSelected) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(lazyListState)) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 8) != 0) {
                    lazyListState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                    i3 &= -7169;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-675224451, i3, -1, "org.betup.ui.fragment.matches.compose.DateSelectorElement (DateSelectorElement.kt:56)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = generateDateList(context);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-85441561, true, new DateSelectorElementKt$DateSelectorElement$1(selectedDate, (List) rememberedValue, lazyListState, onDateSelected), startRestartGroup, 54), startRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final LazyListState lazyListState2 = lazyListState;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.compose.DateSelectorElementKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DateSelectorElement$lambda$1;
                    DateSelectorElement$lambda$1 = DateSelectorElementKt.DateSelectorElement$lambda$1(selectedDate, onDateSelected, modifier2, lazyListState2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return DateSelectorElement$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DateItem(final String str, final String str2, final boolean z, final boolean z2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        long j;
        Composer startRestartGroup = composer.startRestartGroup(159385687);
        if ((i & 48) == 0) {
            i2 = (startRestartGroup.changed(str2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & 9361) != 9360 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(159385687, i2, -1, "org.betup.ui.fragment.matches.compose.DateItem (DateSelectorElement.kt:107)");
            }
            if (z) {
                j = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            } else if (z2) {
                j = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                j = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
            }
            long j2 = j;
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            boolean z3 = (57344 & i2) == 16384;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.compose.DateSelectorElementKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DateItem$lambda$3$lambda$2;
                        DateItem$lambda$3$lambda$2 = DateSelectorElementKt.DateItem$lambda$3$lambda$2(Function0.this);
                        return DateItem$lambda$3$lambda$2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null);
            float f = 8;
            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(m1059clickableXHw0xAI$default, 0.0f, Dp.m7774constructorimpl(f), 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(60), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1570widthInVpY3zN4$default);
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
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str3 = str2;
            TextKt.m2642Text4IGK_g((String) StringsKt.split$default((CharSequence) str3, new String[]{"\n"}, false, 0, 6, (Object) null).get(0), (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777179, (DefaultConstructorMarker) null), startRestartGroup, 199680, 0, 65490);
            TextKt.m2642Text4IGK_g((String) StringsKt.split$default((CharSequence) str3, new String[]{"\n"}, false, 0, 6, (Object) null).get(1), (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777179, (DefaultConstructorMarker) null), startRestartGroup, 199680, 0, 65490);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-960606897);
            if (z) {
                float f2 = 50;
                BoxKt.Box(ShadowKt.m4803shadows4CzXII$default(BackgroundKt.background$default(SizeKt.m1568width3ABfNKs(boxScopeInstance.align(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), Alignment.INSTANCE.getBottomCenter()), Dp.m7774constructorimpl(40)), ComposeUtils.AppBrushPalette.ButtonBackgroundGoldBorder.INSTANCE.getBrush(), RoundedCornerShapeKt.m1812RoundedCornerShapea9UjIt4$default(Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2), 0.0f, 0.0f, 12, null), 0.0f, 4, null), Dp.m7774constructorimpl(7), RoundedCornerShapeKt.RoundedCornerShape(50), false, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 4, null), startRestartGroup, 0);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.compose.DateSelectorElementKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DateItem$lambda$6;
                    DateItem$lambda$6 = DateSelectorElementKt.DateItem$lambda$6(str, str2, z, z2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DateItem$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateItem$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final List<Pair<String, String>> generateDateList(Context context) {
        ArrayList arrayList = new ArrayList();
        LocalDate now = LocalDate.now();
        for (int i = 7; i > 0; i--) {
            LocalDate minusDays = now.minusDays(i);
            String localDate = minusDays.toString();
            Intrinsics.checkNotNull(minusDays);
            arrayList.add(new Pair(localDate, formatDisplayText(minusDays)));
        }
        String string = context.getString(R.string.today);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String upperCase = string.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String localDate2 = now.toString();
        Intrinsics.checkNotNull(now);
        arrayList.add(new Pair(localDate2, upperCase + "\n" + formatDate(now)));
        for (int i2 = 1; i2 < 8; i2++) {
            LocalDate plusDays = now.plusDays(i2);
            String localDate3 = plusDays.toString();
            Intrinsics.checkNotNull(plusDays);
            arrayList.add(new Pair(localDate3, formatDisplayText(plusDays)));
        }
        return arrayList;
    }

    private static final String formatDisplayText(LocalDate localDate) {
        return localDate.getDayOfWeek().getDisplayName(java.time.format.TextStyle.SHORT, Locale.getDefault()) + "\n" + formatDate(localDate);
    }

    private static final String formatDate(LocalDate localDate) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02d.%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localDate.getDayOfMonth()), Integer.valueOf(localDate.getMonthValue())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
