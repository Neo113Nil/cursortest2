package org.betup.ui.fragment.matches.details.compose;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.BorderKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
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
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.ui.fragment.matches.details.compose.butons.base.BaseButtonMatchKt;
import org.betup.ui.fragment.matches.details.compose.butons.base.BaseButtonMatchUIItem;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: MatchTopBaseItem.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001ai\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000f\u001a;\u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0018\u001a\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002"}, d2 = {"MatchTopBaseItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "matchBaseData", "Lorg/betup/ui/fragment/matches/details/compose/MatchTopBaseData;", "listBaseButtons", "", "Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;", "onFirstTeamClick", "Lkotlin/Function0;", "onSecondTeamClick", "onHeaderBoundsInWindow", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/fragment/matches/details/compose/MatchTopBaseData;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LiveTimerDisplay", "matchDateTime", "", "matchId", "", "onPollMatchState", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewMatchTopBaseItem", "(Landroidx/compose/runtime/Composer;I)V", "getMockListBaseMatchItems", "app_release", "timerText", "isFinished", "", "textWidthDp", "Landroidx/compose/ui/unit/Dp;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchTopBaseItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveTimerDisplay$lambda$27(String str, Long l, Function1 function1, int i, int i2, Composer composer, int i3) {
        LiveTimerDisplay(str, l, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchTopBaseItem$lambda$12(Modifier modifier, MatchTopBaseData matchTopBaseData, List list, Function0 function0, Function0 function02, Function1 function1, int i, int i2, Composer composer, int i3) {
        MatchTopBaseItem(modifier, matchTopBaseData, list, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMatchTopBaseItem$lambda$29(int i, Composer composer, int i2) {
        PreviewMatchTopBaseItem(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchTopBaseItem(Modifier modifier, final MatchTopBaseData matchBaseData, final List<BaseButtonMatchUIItem> listBaseButtons, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Rect, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function03;
        int i4;
        Function0<Unit> function04;
        int i5;
        final Function1<? super Rect, Unit> function12;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        float f;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        float f2;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        String formattedTime;
        String formattedDateWithYear;
        String formattedDurationUntil;
        boolean changedInstance;
        Object rememberedValue;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        final Function1<? super Rect, Unit> function13;
        String currentTimeForMatchDetail;
        String currentDateForMatchDetail;
        String matchDateTime;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(matchBaseData, "matchBaseData");
        Intrinsics.checkNotNullParameter(listBaseButtons, "listBaseButtons");
        Composer startRestartGroup = composer.startRestartGroup(845508702);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(matchBaseData) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(listBaseButtons) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function03 = function0;
            i3 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function04 = function02;
                i3 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function12 = function1;
                } else {
                    function12 = function1;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    }
                }
                if ((i3 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                    companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    Function0<Unit> function07 = i7 != 0 ? null : function03;
                    Function0<Unit> function08 = i4 != 0 ? null : function04;
                    if (i5 != 0) {
                        function12 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(845508702, i3, -1, "org.betup.ui.fragment.matches.details.compose.MatchTopBaseItem (MatchTopBaseItem.kt:67)");
                    }
                    ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localView);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final View view = (View) consume;
                    float f3 = 1;
                    float f4 = 4;
                    Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(f3), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)));
                    startRestartGroup.startReplaceGroup(785069508);
                    if (function12 != null) {
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1633490746);
                        boolean changedInstance2 = startRestartGroup.changedInstance(view) | ((458752 & i3) == 131072);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit MatchTopBaseItem$lambda$2$lambda$1;
                                    MatchTopBaseItem$lambda$2$lambda$1 = MatchTopBaseItemKt.MatchTopBaseItem$lambda$2$lambda$1(view, function12, (LayoutCoordinates) obj);
                                    return MatchTopBaseItem$lambda$2$lambda$1;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        companion2 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (Function1) rememberedValue2);
                    } else {
                        companion2 = Modifier.INSTANCE;
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier then = m1038borderziNgDLE.then(companion2);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    int i8 = i3;
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
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    Function1<? super Rect, Unit> function14 = function12;
                    ImageKt.Image(PainterResources_androidKt.painterResource(UiExtensionsKt.getBackgroundImageResource(matchBaseData.getSportId()), startRestartGroup, 0), (String) null, PaddingKt.m1516padding3ABfNKs(BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f3)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
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
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    f = 6;
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f), 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (matchBaseData.getSportId() != 64 || matchBaseData.getSportId() == 65) {
                        f2 = f;
                        startRestartGroup.startReplaceGroup(1681098297);
                        Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(16));
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor4);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        String str = "0m";
                        if (matchBaseData.getMatchStat() == MatchState.SCHEDULED) {
                            startRestartGroup.startReplaceGroup(-731377202);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, companion5);
                            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor5);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            String matchDateTime2 = matchBaseData.getMatchDateTime();
                            if (matchDateTime2 != null && (formattedDurationUntil = UiExtensionsKt.getFormattedDurationUntil(matchDateTime2)) != null) {
                                str = formattedDurationUntil;
                            }
                            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.kick_off_in, new Object[]{str}, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.race_not_started, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-729462673);
                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            Modifier.Companion companion6 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, companion6);
                            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor6);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl6, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                            String matchDateTime3 = matchBaseData.getMatchDateTime();
                            TextKt.m2642Text4IGK_g((matchDateTime3 == null || (formattedDateWithYear = UiExtensionsKt.getFormattedDateWithYear(matchDateTime3)) == null) ? "0m" : formattedDateWithYear, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                            String matchDateTime4 = matchBaseData.getMatchDateTime();
                            TextKt.m2642Text4IGK_g((matchDateTime4 == null || (formattedTime = UiExtensionsKt.getFormattedTime(matchDateTime4)) == null) ? "0m" : formattedTime, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(-2017020803);
                            String stringResource = matchBaseData.getMatchStat() == MatchState.FINISHED ? StringResources_androidKt.stringResource(R.string.race_finished, startRestartGroup, 6) : "";
                            startRestartGroup.endReplaceGroup();
                            TextKt.m2642Text4IGK_g(stringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1685785590);
                        String scoreFirstTeam = matchBaseData.getScoreFirstTeam();
                        String scoreSecondTeam = matchBaseData.getScoreSecondTeam();
                        String periodScoresDisplay = matchBaseData.getPeriodScoresDisplay();
                        startRestartGroup.startReplaceGroup(-222706590);
                        if (matchBaseData.isScoreAvailable()) {
                            if (matchBaseData.isLive()) {
                                currentTimeForMatchDetail = matchBaseData.getPlayTime();
                            } else {
                                currentTimeForMatchDetail = StringResources_androidKt.stringResource(R.string.toto_finished, startRestartGroup, 6);
                            }
                        } else {
                            currentTimeForMatchDetail = matchBaseData.getCurrentTimeForMatchDetail();
                        }
                        String str2 = currentTimeForMatchDetail;
                        startRestartGroup.endReplaceGroup();
                        if (matchBaseData.isScoreAvailable()) {
                            if (matchBaseData.isLive()) {
                                currentDateForMatchDetail = matchBaseData.getPlayTimeName();
                            } else {
                                currentDateForMatchDetail = "";
                            }
                        } else {
                            currentDateForMatchDetail = matchBaseData.getCurrentDateForMatchDetail();
                        }
                        String str3 = currentDateForMatchDetail;
                        String formattedDateWithoutYear = (!matchBaseData.isScoreAvailable() || matchBaseData.isLive() || (matchDateTime = matchBaseData.getMatchDateTime()) == null) ? null : UiExtensionsKt.getFormattedDateWithoutYear(matchDateTime);
                        int i9 = i8 << 15;
                        f2 = f;
                        TeamsRowKt.m13615TeamsRowUiefj4(null, matchBaseData.getFirstTeamName(), matchBaseData.getSecondTeamName(), matchBaseData.getFirstTeamImage(), matchBaseData.getSecondTeamImage(), scoreFirstTeam, scoreSecondTeam, periodScoresDisplay, str2, str3, formattedDateWithoutYear, true, matchBaseData.isScoreAvailable(), false, false, false, false, 0, function07, function08, 0.0f, 0.0f, false, startRestartGroup, 0, (i9 & 234881024) | 48 | (i9 & 1879048192), 0, 7593985);
                        startRestartGroup.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(12), 7, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance = startRestartGroup.changedInstance(listBaseButtons);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8;
                                MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8 = MatchTopBaseItemKt.MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8(listBaseButtons, (LazyListScope) obj);
                                return MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    LazyDslKt.LazyRow(m1520paddingqDBjuR0$default, null, null, false, spaceBetween, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24582, 494);
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
                    modifier2 = companion;
                    function05 = function07;
                    function06 = function08;
                    function13 = function14;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function05 = function03;
                    function06 = function04;
                    function13 = function12;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit MatchTopBaseItem$lambda$12;
                            MatchTopBaseItem$lambda$12 = MatchTopBaseItemKt.MatchTopBaseItem$lambda$12(Modifier.this, matchBaseData, listBaseButtons, function05, function06, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return MatchTopBaseItem$lambda$12;
                        }
                    });
                    return;
                }
                return;
            }
            function04 = function02;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localView2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final View view2 = (View) consume2;
            float f32 = 1;
            float f42 = 4;
            Modifier m1038borderziNgDLE2 = BorderKt.m1038borderziNgDLE(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(f32), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f42)));
            startRestartGroup.startReplaceGroup(785069508);
            if (function12 != null) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier then2 = m1038borderziNgDLE2.then(companion2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            int i82 = i3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash7);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            Function1<? super Rect, Unit> function142 = function12;
            ImageKt.Image(PainterResources_androidKt.painterResource(UiExtensionsKt.getBackgroundImageResource(matchBaseData.getSportId()), startRestartGroup, 0), (String) null, PaddingKt.m1516padding3ABfNKs(BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f32)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion42 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion42);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
            f = 6;
            Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f), 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (matchBaseData.getSportId() != 64) {
            }
            f2 = f;
            startRestartGroup.startReplaceGroup(1681098297);
            Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(16));
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            String str4 = "0m";
            if (matchBaseData.getMatchStat() == MatchState.SCHEDULED) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(12), 7, null);
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(listBaseButtons);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8;
                    MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8 = MatchTopBaseItemKt.MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8(listBaseButtons, (LazyListScope) obj);
                    return MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            LazyDslKt.LazyRow(m1520paddingqDBjuR0$default2, null, null, false, spaceBetween2, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24582, 494);
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
            }
            modifier2 = companion;
            function05 = function07;
            function06 = function08;
            function13 = function142;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function03 = function0;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function04 = function02;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<View> localView22 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localView22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final View view22 = (View) consume22;
        float f322 = 1;
        float f422 = 4;
        Modifier m1038borderziNgDLE22 = BorderKt.m1038borderziNgDLE(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(f322), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f422)));
        startRestartGroup.startReplaceGroup(785069508);
        if (function12 != null) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier then22 = m1038borderziNgDLE22.then(companion2);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap72 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
        Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
        int i822 = i3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash72);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        Function1<? super Rect, Unit> function1422 = function12;
        ImageKt.Image(PainterResources_androidKt.painterResource(UiExtensionsKt.getBackgroundImageResource(matchBaseData.getSportId()), startRestartGroup, 0), (String) null, PaddingKt.m1516padding3ABfNKs(BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f322)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier.Companion companion422 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy42 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion422);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance42 = ColumnScopeInstance.INSTANCE;
        f = 6;
        Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f), 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        if (matchBaseData.getSportId() != 64) {
        }
        f2 = f;
        startRestartGroup.startReplaceGroup(1681098297);
        Modifier m1516padding3ABfNKs22 = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(16));
        Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs22);
        Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        String str42 = "0m";
        if (matchBaseData.getMatchStat() == MatchState.SCHEDULED) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(12), 7, null);
        Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(listBaseButtons);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8;
                MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8 = MatchTopBaseItemKt.MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8(listBaseButtons, (LazyListScope) obj);
                return MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        LazyDslKt.LazyRow(m1520paddingqDBjuR0$default22, null, null, false, spaceBetween22, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24582, 494);
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
        }
        modifier2 = companion;
        function05 = function07;
        function06 = function08;
        function13 = function1422;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchTopBaseItem$lambda$2$lambda$1(final View view, final Function1 function1, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        androidx.compose.ui.geometry.Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(coords);
        final Rect rect = new Rect(MathKt.roundToInt(boundsInWindow.getLeft()), MathKt.roundToInt(boundsInWindow.getTop()), MathKt.roundToInt(boundsInWindow.getRight()), MathKt.roundToInt(boundsInWindow.getBottom()));
        view.post(new Runnable() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                MatchTopBaseItemKt.MatchTopBaseItem$lambda$2$lambda$1$lambda$0(view, function1, rect);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MatchTopBaseItem$lambda$2$lambda$1$lambda$0(View view, Function1 function1, Rect rect) {
        if (view.isAttachedToWindow()) {
            function1.invoke(rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LiveTimerDisplay(final String str, Long l, Function1<? super Long, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Long l2;
        int i4;
        Function1<? super Long, Unit> function12;
        Long l3;
        Function1<? super Long, Unit> function13;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        boolean z;
        MatchTopBaseItemKt$LiveTimerDisplay$1$1 rememberedValue4;
        boolean z2;
        MatchTopBaseItemKt$LiveTimerDisplay$2$1 rememberedValue5;
        boolean changed;
        MatchTopBaseItemKt$LiveTimerDisplay$3$1 rememberedValue6;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Function1<? super Long, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-632839588);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            l2 = l;
            i3 |= startRestartGroup.changed(l2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                    l3 = i5 != 0 ? null : l2;
                    function13 = i4 != 0 ? null : function12;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632839588, i3, -1, "org.betup.ui.fragment.matches.details.compose.LiveTimerDisplay (MatchTopBaseItem.kt:264)");
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("00:00:00", null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    TextMeasurer rememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, startRestartGroup, 0, 1);
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density = (Density) consume;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m7772boximpl(Dp.m7774constructorimpl(100)), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    MutableState mutableState3 = (MutableState) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1746271574);
                    int i6 = i3 & 14;
                    z = i6 == 4;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new MatchTopBaseItemKt$LiveTimerDisplay$1$1(str, mutableState2, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, i6);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    z2 = ((i3 & 112) == 32) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!z2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new MatchTopBaseItemKt$LiveTimerDisplay$2$1(l3, function13, mutableState2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(l3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i3 >> 3) & 14);
                    String LiveTimerDisplay$lambda$14 = LiveTimerDisplay$lambda$14(mutableState);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changed = startRestartGroup.changed(rememberTextMeasurer) | startRestartGroup.changed(density);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new MatchTopBaseItemKt$LiveTimerDisplay$3$1(rememberTextMeasurer, density, mutableState, mutableState3, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(LiveTimerDisplay$lambda$14, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier m1568width3ABfNKs = SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(LiveTimerDisplay$lambda$20(mutableState3) + Dp.m7774constructorimpl(20)));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1568width3ABfNKs);
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
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Long l4 = l3;
                    function14 = function13;
                    TextKt.m2642Text4IGK_g(LiveTimerDisplay$lambda$14(mutableState), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(32), new FontWeight(900), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7663getStarte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                    l2 = l4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function14 = function12;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Long l5 = l2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit LiveTimerDisplay$lambda$27;
                            LiveTimerDisplay$lambda$27 = MatchTopBaseItemKt.LiveTimerDisplay$lambda$27(str, l5, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return LiveTimerDisplay$lambda$27;
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i3 & Opcodes.I2S) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState4 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState22 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            TextMeasurer rememberTextMeasurer2 = TextMeasurerHelperKt.rememberTextMeasurer(0, startRestartGroup, 0, 1);
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume2;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState32 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1746271574);
            int i62 = i3 & 14;
            if (i62 == 4) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue4 = new MatchTopBaseItemKt$LiveTimerDisplay$1$1(str, mutableState22, mutableState4, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, i62);
            startRestartGroup.startReplaceGroup(-1746271574);
            z2 = ((i3 & 112) == 32) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue5 = new MatchTopBaseItemKt$LiveTimerDisplay$2$1(l3, function13, mutableState22, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(l3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i3 >> 3) & 14);
            String LiveTimerDisplay$lambda$142 = LiveTimerDisplay$lambda$14(mutableState4);
            startRestartGroup.startReplaceGroup(-1224400529);
            changed = startRestartGroup.changed(rememberTextMeasurer2) | startRestartGroup.changed(density2);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue6 = new MatchTopBaseItemKt$LiveTimerDisplay$3$1(rememberTextMeasurer2, density2, mutableState4, mutableState32, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(LiveTimerDisplay$lambda$142, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Modifier m1568width3ABfNKs2 = SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(LiveTimerDisplay$lambda$20(mutableState32) + Dp.m7774constructorimpl(20)));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1568width3ABfNKs2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Long l42 = l3;
            function14 = function13;
            TextKt.m2642Text4IGK_g(LiveTimerDisplay$lambda$14(mutableState4), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(32), new FontWeight(900), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7663getStarte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            }
            l2 = l42;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        l2 = l;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState42 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState222 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        TextMeasurer rememberTextMeasurer22 = TextMeasurerHelperKt.rememberTextMeasurer(0, startRestartGroup, 0, 1);
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume22;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState322 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1746271574);
        int i622 = i3 & 14;
        if (i622 == 4) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue4 = new MatchTopBaseItemKt$LiveTimerDisplay$1$1(str, mutableState222, mutableState42, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, i622);
        startRestartGroup.startReplaceGroup(-1746271574);
        z2 = ((i3 & 112) == 32) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue5 = new MatchTopBaseItemKt$LiveTimerDisplay$2$1(l3, function13, mutableState222, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(l3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i3 >> 3) & 14);
        String LiveTimerDisplay$lambda$1422 = LiveTimerDisplay$lambda$14(mutableState42);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed = startRestartGroup.changed(rememberTextMeasurer22) | startRestartGroup.changed(density22);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue6 = new MatchTopBaseItemKt$LiveTimerDisplay$3$1(rememberTextMeasurer22, density22, mutableState42, mutableState322, null);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(LiveTimerDisplay$lambda$1422, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        Modifier m1568width3ABfNKs22 = SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(LiveTimerDisplay$lambda$20(mutableState322) + Dp.m7774constructorimpl(20)));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1568width3ABfNKs22);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        Long l422 = l3;
        function14 = function13;
        TextKt.m2642Text4IGK_g(LiveTimerDisplay$lambda$14(mutableState42), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(32), new FontWeight(900), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7663getStarte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
        }
        l2 = l422;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String LiveTimerDisplay$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LiveTimerDisplay$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final float LiveTimerDisplay$lambda$20(MutableState<Dp> mutableState) {
        return mutableState.getValue().m7788unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LiveTimerDisplay$lambda$21(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m7772boximpl(f));
    }

    public static final void PreviewMatchTopBaseItem(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1301684675);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1301684675, i, -1, "org.betup.ui.fragment.matches.details.compose.PreviewMatchTopBaseItem (MatchTopBaseItem.kt:326)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
            MatchTopBaseItem(null, new MatchTopBaseData("Stade Brestois 29", "Stade Brestois 29", "data:image/png;base64,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", "data:image/png;base64,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", null, null, "2025-06-02 08:23:50.0", false, "", "", false, 22, MatchState.SCHEDULED, null, 9216, null), getMockListBaseMatchItems(), null, null, null, startRestartGroup, 0, 57);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), startRestartGroup, 6);
            MatchTopBaseItem(null, new MatchTopBaseData("Stade Brestois 29", "Stade Brestois 29", "data:image/png;base64,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", "data:image/png;base64,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", ExifInterface.GPS_MEASUREMENT_2D, "6", "2025-06-02 08:23:50.0", true, "34:56", "5th half", false, 22, MatchState.SCHEDULED, null, 9216, null), getMockListBaseMatchItems(), null, null, null, startRestartGroup, 0, 57);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewMatchTopBaseItem$lambda$29;
                    PreviewMatchTopBaseItem$lambda$29 = MatchTopBaseItemKt.PreviewMatchTopBaseItem$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewMatchTopBaseItem$lambda$29;
                }
            });
        }
    }

    public static final List<BaseButtonMatchUIItem> getMockListBaseMatchItems() {
        return CollectionsKt.listOf((Object[]) new BaseButtonMatchUIItem[]{new BaseButtonMatchUIItem(R.drawable.list_icon_selected, R.drawable.list_icon_unselected, false, R.string.bet_groups, new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, false, null, 0.0f, 0.0f, null, 960, null), new BaseButtonMatchUIItem(R.drawable.statistics_icon_new_selected, R.drawable.statistics_icon_new_unselected, false, R.string.bet_groups, new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, false, null, 0.0f, 0.0f, null, 960, null), new BaseButtonMatchUIItem(R.drawable.comments_icon_new_selected, R.drawable.comments_icon_new_unselected, false, R.string.bet_groups, new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, false, null, 0.0f, 0.0f, null, 960, null), new BaseButtonMatchUIItem(R.drawable.battles_icon_new_selected, R.drawable.battles_icon_new_unselected, true, R.string.bet_groups, new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, true, null, 0.0f, 0.0f, null, 960, null), new BaseButtonMatchUIItem(R.drawable.puzzle_icon_new_selected, R.drawable.puzzle_icon_new_unselected, false, R.string.bet_groups, new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, true, null, 0.0f, 0.0f, null, 960, null)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8(final List list, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final MatchTopBaseItemKt$MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 matchTopBaseItemKt$MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BaseButtonMatchUIItem baseButtonMatchUIItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((BaseButtonMatchUIItem) obj);
            }
        };
        LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.MatchTopBaseItemKt$MatchTopBaseItem$lambda$11$lambda$10$lambda$9$lambda$8$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                BaseButtonMatchUIItem baseButtonMatchUIItem = (BaseButtonMatchUIItem) list.get(i);
                composer.startReplaceGroup(156606453);
                BaseButtonMatchKt.BaseButtonMatch(null, baseButtonMatchUIItem, composer, 0, 1);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
