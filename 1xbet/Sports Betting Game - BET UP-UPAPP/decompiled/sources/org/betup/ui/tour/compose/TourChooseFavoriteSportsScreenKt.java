package org.betup.ui.tour.compose;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.betup.ui.fragment.matches.compose.SportsListKt;
import org.betup.ui.tour.controller.TourFavoriteSportsController;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.SnackbarHelper;

/* compiled from: TourChooseFavoriteSportsScreen.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002"}, d2 = {"TourChooseFavoriteSportsScreen", "", "controller", "Lorg/betup/ui/tour/controller/TourFavoriteSportsController;", "currentStepIndex", "", "totalSteps", "onNext", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/tour/controller/TourFavoriteSportsController;IILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "items", "", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "isLoading", "", "isLoadingMore", "hasMore", "error", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourChooseFavoriteSportsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourChooseFavoriteSportsScreen$lambda$25(TourFavoriteSportsController tourFavoriteSportsController, int i, int i2, Function0 function0, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        TourChooseFavoriteSportsScreen(tourFavoriteSportsController, i, i2, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x09db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TourChooseFavoriteSportsScreen(final TourFavoriteSportsController controller, final int i, final int i2, final Function0<Unit> onNext, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        State collectAsState;
        final Context context;
        boolean changedInstance;
        TourChooseFavoriteSportsScreenKt$TourChooseFavoriteSportsScreen$1$1 rememberedValue;
        boolean changedInstance2;
        Object rememberedValue2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Composer composer2;
        String str;
        String str2;
        String str3;
        String str4;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Composer startRestartGroup = composer.startRestartGroup(-212330090);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(onNext) ? 2048 : 1024;
        }
        int i7 = i4 & 16;
        if (i7 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i6 = i5;
            if ((i6 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-212330090, i6, -1, "org.betup.ui.tour.compose.TourChooseFavoriteSportsScreen (TourChooseFavoriteSportsScreen.kt:48)");
                }
                State collectAsState2 = SnapshotStateKt.collectAsState(controller.getItems(), null, startRestartGroup, 0, 1);
                collectAsState = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
                State collectAsState3 = SnapshotStateKt.collectAsState(controller.isLoadingMore(), null, startRestartGroup, 0, 1);
                State collectAsState4 = SnapshotStateKt.collectAsState(controller.getHasMore(), null, startRestartGroup, 0, 1);
                State collectAsState5 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                context = (Context) consume;
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = startRestartGroup.changedInstance(controller) | startRestartGroup.changedInstance(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new TourChooseFavoriteSportsScreenKt$TourChooseFavoriteSportsScreen$1$1(controller, context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
                Unit unit2 = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance2 = startRestartGroup.changedInstance(controller);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: org.betup.ui.tour.compose.TourChooseFavoriteSportsScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DisposableEffectResult TourChooseFavoriteSportsScreen$lambda$8$lambda$7;
                            TourChooseFavoriteSportsScreen$lambda$8$lambda$7 = TourChooseFavoriteSportsScreenKt.TourChooseFavoriteSportsScreen$lambda$8$lambda$7(TourFavoriteSportsController.this, (DisposableEffectScope) obj);
                            return TourChooseFavoriteSportsScreen$lambda$8$lambda$7;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 6);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier5 = modifier4;
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
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.main_app_bg, startRestartGroup, 6), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                float f = 16;
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
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
                float f2 = 32;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                float f3 = 24;
                composer2 = startRestartGroup;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_choose_up_to_3_favorite_sports, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3), 0.0f, 2, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(22), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 131024);
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_you_can_change_anytime, composer2, 6), PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(4), 0.0f, 0.0f, 13, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(11)), composer2, 6);
                if (!TourChooseFavoriteSportsScreen$lambda$1(collectAsState)) {
                    composer2.startReplaceGroup(122638920);
                    Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl6, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer2, 6, 28);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceGroup();
                    str4 = "C72@3468L9:Box.kt#2w3rfo";
                    str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    str3 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                } else if (TourChooseFavoriteSportsScreen$lambda$4(collectAsState5) != null) {
                    composer2.startReplaceGroup(123109934);
                    Modifier weight$default2 = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, weight$default2);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash4);
                    }
                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    String TourChooseFavoriteSportsScreen$lambda$4 = TourChooseFavoriteSportsScreen$lambda$4(collectAsState5);
                    if (TourChooseFavoriteSportsScreen$lambda$4 == null) {
                        TourChooseFavoriteSportsScreen$lambda$4 = "";
                    }
                    TextKt.m2642Text4IGK_g(TourChooseFavoriteSportsScreen$lambda$4, (Modifier) null, ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceGroup();
                    str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    str3 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                    str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    str4 = "C72@3468L9:Box.kt#2w3rfo";
                } else {
                    composer2.startReplaceGroup(123646420);
                    Modifier weight$default3 = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, weight$default3);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl8, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                        m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash5);
                    }
                    Updater.m4617setimpl(m4610constructorimpl8, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    List<SportListItemUiModel> TourChooseFavoriteSportsScreen$lambda$0 = TourChooseFavoriteSportsScreen$lambda$0(collectAsState2);
                    composer2.startReplaceGroup(5004770);
                    boolean changedInstance3 = composer2.changedInstance(controller);
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function0() { // from class: org.betup.ui.tour.compose.TourChooseFavoriteSportsScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$12$lambda$11;
                                TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$12$lambda$11 = TourChooseFavoriteSportsScreenKt.TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$12$lambda$11(TourFavoriteSportsController.this);
                                return TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$12$lambda$11;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function0 = (Function0) rememberedValue3;
                    composer2.endReplaceGroup();
                    boolean TourChooseFavoriteSportsScreen$lambda$2 = TourChooseFavoriteSportsScreen$lambda$2(collectAsState3);
                    boolean TourChooseFavoriteSportsScreen$lambda$3 = TourChooseFavoriteSportsScreen$lambda$3(collectAsState4);
                    composer2.startReplaceGroup(-1633490746);
                    boolean changedInstance4 = composer2.changedInstance(controller) | composer2.changedInstance(context);
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: org.betup.ui.tour.compose.TourChooseFavoriteSportsScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$14$lambda$13;
                                TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$14$lambda$13 = TourChooseFavoriteSportsScreenKt.TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$14$lambda$13(TourFavoriteSportsController.this, context, (SportListItemUiModel) obj);
                                return TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$14$lambda$13;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    Function1 function1 = (Function1) rememberedValue4;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    boolean changedInstance5 = composer2.changedInstance(controller);
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (changedInstance5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function1() { // from class: org.betup.ui.tour.compose.TourChooseFavoriteSportsScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$16$lambda$15;
                                TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$16$lambda$15 = TourChooseFavoriteSportsScreenKt.TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$16$lambda$15(TourFavoriteSportsController.this, (SportListItemUiModel) obj);
                                return TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$16$lambda$15;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    Function1 function12 = (Function1) rememberedValue5;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1633490746);
                    boolean changedInstance6 = composer2.changedInstance(controller) | composer2.changedInstance(context);
                    Object rememberedValue6 = composer2.rememberedValue();
                    if (changedInstance6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new Function1() { // from class: org.betup.ui.tour.compose.TourChooseFavoriteSportsScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$18$lambda$17;
                                TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$18$lambda$17 = TourChooseFavoriteSportsScreenKt.TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$18$lambda$17(TourFavoriteSportsController.this, context, (SportListItemUiModel) obj);
                                return TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$18$lambda$17;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    composer2.endReplaceGroup();
                    str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    str3 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                    str4 = "C72@3468L9:Box.kt#2w3rfo";
                    SportsListKt.m13963SportsListBUBvxpI(TourChooseFavoriteSportsScreen$lambda$0, function0, TourChooseFavoriteSportsScreen$lambda$2, TourChooseFavoriteSportsScreen$lambda$3, function1, function12, (Function1) rememberedValue6, 0.0f, null, null, null, null, null, null, null, null, 0, 0, null, composer2, 0, 0, 524160);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceGroup();
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), composer2, 6);
                Modifier background$default = BackgroundKt.background$default(Modifier.INSTANCE, ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), null, 0.0f, 6, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str3);
                MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                String str5 = str2;
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str5);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, background$default);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash6);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str4);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f));
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str5);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer2, m1517paddingVpY3zN4);
                Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor7);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash7);
                }
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str5);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer2, companion);
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor8);
                } else {
                    composer2.useNode();
                }
                m4610constructorimpl5 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash8);
                }
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(String.valueOf(i), (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                TextKt.m2642Text4IGK_g("/" + i2, (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                CommonButtonKt.m12915CommonButtonUPEs2M4(Modifier.INSTANCE, false, StringResources_androidKt.stringResource(R.string.tour_next, composer2, 6), false, false, false, onNext, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, ((i6 << 9) & 3670016) | 54, 0, 0, 2097080);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourChooseFavoriteSportsScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TourChooseFavoriteSportsScreen$lambda$25;
                        TourChooseFavoriteSportsScreen$lambda$25 = TourChooseFavoriteSportsScreenKt.TourChooseFavoriteSportsScreen$lambda$25(TourFavoriteSportsController.this, i, i2, onNext, modifier3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        return TourChooseFavoriteSportsScreen$lambda$25;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i6 = i5;
        if ((i6 & 9363) == 9362) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        State collectAsState22 = SnapshotStateKt.collectAsState(controller.getItems(), null, startRestartGroup, 0, 1);
        collectAsState = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
        State collectAsState32 = SnapshotStateKt.collectAsState(controller.isLoadingMore(), null, startRestartGroup, 0, 1);
        State collectAsState42 = SnapshotStateKt.collectAsState(controller.getHasMore(), null, startRestartGroup, 0, 1);
        State collectAsState52 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        context = (Context) consume2;
        Unit unit3 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(controller) | startRestartGroup.changedInstance(context);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new TourChooseFavoriteSportsScreenKt$TourChooseFavoriteSportsScreen$1$1(controller, context, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
        Unit unit22 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance2 = startRestartGroup.changedInstance(controller);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue2 = new Function1() { // from class: org.betup.ui.tour.compose.TourChooseFavoriteSportsScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult TourChooseFavoriteSportsScreen$lambda$8$lambda$7;
                TourChooseFavoriteSportsScreen$lambda$8$lambda$7 = TourChooseFavoriteSportsScreenKt.TourChooseFavoriteSportsScreen$lambda$8$lambda$7(TourFavoriteSportsController.this, (DisposableEffectScope) obj);
                return TourChooseFavoriteSportsScreen$lambda$8$lambda$7;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(unit22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 6);
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap9 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
        Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier52 = modifier4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash9);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.main_app_bg, startRestartGroup, 6), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
        float f4 = 16;
        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f4), 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        float f22 = 32;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), startRestartGroup, 6);
        float f32 = 24;
        composer2 = startRestartGroup;
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_choose_up_to_3_favorite_sports, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f32), 0.0f, 2, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(22), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 131024);
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_you_can_change_anytime, composer2, 6), PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f32), 0.0f, 2, null), 0.0f, Dp.m7774constructorimpl(4), 0.0f, 0.0f, 13, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(11)), composer2, 6);
        if (!TourChooseFavoriteSportsScreen$lambda$1(collectAsState)) {
        }
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), composer2, 6);
        Modifier background$default2 = BackgroundKt.background$default(Modifier.INSTANCE, ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), null, 0.0f, 6, null);
        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str3);
        MeasurePolicy maybeCachedBoxMeasurePolicy52 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        String str52 = str2;
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str52);
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap62 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(composer2, background$default2);
        Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash62);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str4);
        BoxScopeInstance boxScopeInstance52 = BoxScopeInstance.INSTANCE;
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f4));
        Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, composer2, 54);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str52);
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap72 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(composer2, m1517paddingVpY3zN42);
        Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash72);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, composer2, 48);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str52);
        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap82 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier82 = ComposedModifierKt.materializeModifier(composer2, companion2);
        Function0<ComposeUiNode> constructor82 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl5 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap82, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash82 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl5.getInserting()) {
        }
        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash82);
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier82, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(String.valueOf(i), (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
        TextKt.m2642Text4IGK_g("/" + i2, (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        CommonButtonKt.m12915CommonButtonUPEs2M4(Modifier.INSTANCE, false, StringResources_androidKt.stringResource(R.string.tour_next, composer2, 6), false, false, false, onNext, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, ((i6 << 9) & 3670016) | 54, 0, 0, 2097080);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$12$lambda$11(TourFavoriteSportsController tourFavoriteSportsController) {
        tourFavoriteSportsController.loadNextPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$14$lambda$13(TourFavoriteSportsController tourFavoriteSportsController, Context context, SportListItemUiModel sport) {
        Intrinsics.checkNotNullParameter(sport, "sport");
        if (tourFavoriteSportsController.canAddFavorite()) {
            tourFavoriteSportsController.onAddToFavorite(sport);
        } else {
            SnackbarHelper.showShort(context, R.string.tour_max_favorites_reached);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$16$lambda$15(TourFavoriteSportsController tourFavoriteSportsController, SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tourFavoriteSportsController.onDeleteFromFavorite(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourChooseFavoriteSportsScreen$lambda$24$lambda$23$lambda$19$lambda$18$lambda$17(TourFavoriteSportsController tourFavoriteSportsController, Context context, SportListItemUiModel sport) {
        Intrinsics.checkNotNullParameter(sport, "sport");
        if (sport.isFavorite()) {
            tourFavoriteSportsController.onDeleteFromFavorite(sport);
        } else if (tourFavoriteSportsController.canAddFavorite()) {
            tourFavoriteSportsController.onAddToFavorite(sport);
        } else {
            SnackbarHelper.showShort(context, R.string.tour_max_favorites_reached);
        }
        return Unit.INSTANCE;
    }

    private static final List<SportListItemUiModel> TourChooseFavoriteSportsScreen$lambda$0(State<? extends List<SportListItemUiModel>> state) {
        return state.getValue();
    }

    private static final boolean TourChooseFavoriteSportsScreen$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean TourChooseFavoriteSportsScreen$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean TourChooseFavoriteSportsScreen$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final String TourChooseFavoriteSportsScreen$lambda$4(State<String> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult TourChooseFavoriteSportsScreen$lambda$8$lambda$7(final TourFavoriteSportsController tourFavoriteSportsController, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: org.betup.ui.tour.compose.TourChooseFavoriteSportsScreenKt$TourChooseFavoriteSportsScreen$lambda$8$lambda$7$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                TourFavoriteSportsController.this.unbind();
            }
        };
    }
}
