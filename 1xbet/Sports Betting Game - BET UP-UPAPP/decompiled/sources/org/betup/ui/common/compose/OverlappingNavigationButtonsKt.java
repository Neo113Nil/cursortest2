package org.betup.ui.common.compose;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.greenrobot.eventbus.EventBus;

/* compiled from: OverlappingNavigationButtons.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"OverlappingNavigationButtons", "", "modifier", "Landroidx/compose/ui/Modifier;", "onBattlesClick", "Lkotlin/Function0;", "onCompetitionsClick", "onBattlesBoundsReported", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "onCompetitionsBoundsReported", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OverlappingNavigationButtonsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverlappingNavigationButtons$lambda$19(Modifier modifier, Function0 function0, Function0 function02, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        OverlappingNavigationButtons(modifier, function0, function02, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverlappingNavigationButtons$lambda$1$lambda$0() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.BATTLES, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverlappingNavigationButtons$lambda$3$lambda$2() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.DAILY_COMPETITIONS, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OverlappingNavigationButtons(Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function03;
        int i4;
        Function0<Unit> function04;
        int i5;
        final Function1<? super Rect, Unit> function13;
        int i6;
        Function1<? super Rect, Unit> function14;
        Modifier.Companion companion;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        int currentCompositeKeyHash;
        Function1<? super Rect, Unit> function15;
        Composer m4610constructorimpl;
        boolean changedInstance;
        Object rememberedValue;
        boolean z;
        Object rememberedValue2;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        boolean changedInstance2;
        Object rememberedValue3;
        final Function1<? super Rect, Unit> function16;
        boolean z2;
        Object rememberedValue4;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        final Function1<? super Rect, Unit> function17;
        final Function0<Unit> function07;
        final Function1<? super Rect, Unit> function18;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-150376586);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function03 = function0;
            i3 |= startRestartGroup.changedInstance(function03) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function04 = function02;
                i3 |= startRestartGroup.changedInstance(function04) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function13 = function1;
                    i3 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function14 = function12;
                        i3 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                            companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i8 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit OverlappingNavigationButtons$lambda$1$lambda$0;
                                            OverlappingNavigationButtons$lambda$1$lambda$0 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$1$lambda$0();
                                            return OverlappingNavigationButtons$lambda$1$lambda$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                function05 = (Function0) rememberedValue5;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function05 = function03;
                            }
                            if (i4 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue6 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit OverlappingNavigationButtons$lambda$3$lambda$2;
                                            OverlappingNavigationButtons$lambda$3$lambda$2 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$3$lambda$2();
                                            return OverlappingNavigationButtons$lambda$3$lambda$2;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                }
                                function06 = (Function0) rememberedValue6;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function06 = function04;
                            }
                            if (i5 != 0) {
                                function13 = null;
                            }
                            if (i6 != 0) {
                                function14 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-150376586, i3, -1, "org.betup.ui.common.compose.OverlappingNavigationButtons (OverlappingNavigationButtons.kt:33)");
                            }
                            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localView);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final View view = (View) consume;
                            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
                            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            function15 = function14;
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
                            Modifier aspectRatio$default = AspectRatioKt.aspectRatio$default(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 1.64f, false, 2, null);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance = ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(view);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6;
                                        OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6(Function1.this, view, (LayoutCoordinates) obj);
                                        return OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default, (Function1) rememberedValue);
                            startRestartGroup.startReplaceGroup(5004770);
                            z = (i3 & 112) == 32;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8;
                                        OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8(Function0.this);
                                        return OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceGroup();
                            Function1<? super Rect, Unit> function19 = function13;
                            Function0<Unit> function08 = function05;
                            Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getBattlesDrawable(), startRestartGroup, 0), "Battles Button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier aspectRatio$default2 = AspectRatioKt.aspectRatio$default(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 1.64f, false, 2, null);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance2 = startRestartGroup.changedInstance(view) | ((57344 & i3) == 16384);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                function16 = function15;
                                rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13;
                                        OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13(Function1.this, view, (LayoutCoordinates) obj);
                                        return OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                function16 = function15;
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default2, (Function1) rememberedValue3);
                            startRestartGroup.startReplaceGroup(5004770);
                            z2 = (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15;
                                        OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15(Function0.this);
                                        return OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            Function0 function09 = (Function0) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                            Function1<? super Rect, Unit> function110 = function16;
                            Modifier clickAnimation2 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned2, function09, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2);
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
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getCompetitionsDrawable(), startRestartGroup, 0), "Competitions Button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
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
                            function17 = function110;
                            function07 = function06;
                            function18 = function19;
                            function03 = function08;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            function07 = function04;
                            function18 = function13;
                            function17 = function14;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = companion;
                            final Function0<Unit> function010 = function03;
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit OverlappingNavigationButtons$lambda$19;
                                    OverlappingNavigationButtons$lambda$19 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$19(Modifier.this, function010, function07, function18, function17, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return OverlappingNavigationButtons$lambda$19;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function14 = function12;
                    if ((i3 & 9363) == 9362) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localView2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final View view2 = (View) consume2;
                    Modifier wrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
                    Arrangement.HorizontalOrVertical spaceEvenly2 = Arrangement.INSTANCE.getSpaceEvenly();
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceEvenly2, centerVertically2, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default2);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    function15 = function14;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Modifier aspectRatio$default3 = AspectRatioKt.aspectRatio$default(rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), 1.64f, false, 2, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance = ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(view2);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6;
                            OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6(Function1.this, view2, (LayoutCoordinates) obj);
                            return OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    Modifier onGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default3, (Function1) rememberedValue);
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 112) == 32) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8;
                            OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8(Function0.this);
                            return OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    Function1<? super Rect, Unit> function192 = function13;
                    Function0<Unit> function082 = function05;
                    Modifier clickAnimation3 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned3, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation3);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getBattlesDrawable(), startRestartGroup, 0), "Battles Button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier aspectRatio$default22 = AspectRatioKt.aspectRatio$default(rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), 1.64f, false, 2, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance2 = startRestartGroup.changedInstance(view2) | ((57344 & i3) == 16384);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance2) {
                    }
                    function16 = function15;
                    rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13;
                            OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13(Function1.this, view2, (LayoutCoordinates) obj);
                            return OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                    Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default22, (Function1) rememberedValue3);
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) {
                    }
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15;
                            OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15(Function0.this);
                            return OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    Function0 function092 = (Function0) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    Function1<? super Rect, Unit> function1102 = function16;
                    Modifier clickAnimation22 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned22, function092, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22);
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
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getCompetitionsDrawable(), startRestartGroup, 0), "Competitions Button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
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
                    function17 = function1102;
                    function07 = function06;
                    function18 = function192;
                    function03 = function082;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function13 = function1;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function14 = function12;
                if ((i3 & 9363) == 9362) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<View> localView22 = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localView22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final View view22 = (View) consume22;
                Modifier wrapContentHeight$default22 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
                Arrangement.HorizontalOrVertical spaceEvenly22 = Arrangement.INSTANCE.getSpaceEvenly();
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceEvenly22, centerVertically22, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default22);
                Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                function15 = function14;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                Modifier aspectRatio$default32 = AspectRatioKt.aspectRatio$default(rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, false), 1.64f, false, 2, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(view22);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6;
                        OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6(Function1.this, view22, (LayoutCoordinates) obj);
                        return OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier onGloballyPositioned32 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default32, (Function1) rememberedValue);
                startRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 112) == 32) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8;
                        OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8(Function0.this);
                        return OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                Function1<? super Rect, Unit> function1922 = function13;
                Function0<Unit> function0822 = function05;
                Modifier clickAnimation32 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned32, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation32);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getBattlesDrawable(), startRestartGroup, 0), "Battles Button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier aspectRatio$default222 = AspectRatioKt.aspectRatio$default(rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, false), 1.64f, false, 2, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance2 = startRestartGroup.changedInstance(view22) | ((57344 & i3) == 16384);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2) {
                }
                function16 = function15;
                rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13;
                        OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13(Function1.this, view22, (LayoutCoordinates) obj);
                        return OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                Modifier onGloballyPositioned222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default222, (Function1) rememberedValue3);
                startRestartGroup.startReplaceGroup(5004770);
                if ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15;
                        OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15(Function0.this);
                        return OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                Function0 function0922 = (Function0) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                Function1<? super Rect, Unit> function11022 = function16;
                Modifier clickAnimation222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned222, function0922, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222);
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
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getCompetitionsDrawable(), startRestartGroup, 0), "Competitions Button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
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
                function17 = function11022;
                function07 = function06;
                function18 = function1922;
                function03 = function0822;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function04 = function02;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function13 = function1;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function14 = function12;
            if ((i3 & 9363) == 9362) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<View> localView222 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localView222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final View view222 = (View) consume222;
            Modifier wrapContentHeight$default222 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
            Arrangement.HorizontalOrVertical spaceEvenly222 = Arrangement.INSTANCE.getSpaceEvenly();
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceEvenly222, centerVertically222, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default222);
            Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
            function15 = function14;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            Modifier aspectRatio$default322 = AspectRatioKt.aspectRatio$default(rowScopeInstance222.weight(Modifier.INSTANCE, 1.0f, false), 1.64f, false, 2, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(view222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6;
                    OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6(Function1.this, view222, (LayoutCoordinates) obj);
                    return OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier onGloballyPositioned322 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default322, (Function1) rememberedValue);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 112) == 32) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8;
                    OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8(Function0.this);
                    return OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            Function1<? super Rect, Unit> function19222 = function13;
            Function0<Unit> function08222 = function05;
            Modifier clickAnimation322 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned322, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation322);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getBattlesDrawable(), startRestartGroup, 0), "Battles Button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier aspectRatio$default2222 = AspectRatioKt.aspectRatio$default(rowScopeInstance222.weight(Modifier.INSTANCE, 1.0f, false), 1.64f, false, 2, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance2 = startRestartGroup.changedInstance(view222) | ((57344 & i3) == 16384);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2) {
            }
            function16 = function15;
            rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13;
                    OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13(Function1.this, view222, (LayoutCoordinates) obj);
                    return OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            Modifier onGloballyPositioned2222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default2222, (Function1) rememberedValue3);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15;
                    OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15(Function0.this);
                    return OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            Function0 function09222 = (Function0) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            Function1<? super Rect, Unit> function110222 = function16;
            Modifier clickAnimation2222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned2222, function09222, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2222);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getCompetitionsDrawable(), startRestartGroup, 0), "Competitions Button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
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
            function17 = function110222;
            function07 = function06;
            function18 = function19222;
            function03 = function08222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function03 = function0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function04 = function02;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function13 = function1;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function14 = function12;
        if ((i3 & 9363) == 9362) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<View> localView2222 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localView2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final View view2222 = (View) consume2222;
        Modifier wrapContentHeight$default2222 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
        Arrangement.HorizontalOrVertical spaceEvenly2222 = Arrangement.INSTANCE.getSpaceEvenly();
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(spaceEvenly2222, centerVertically2222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default2222);
        Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
        function15 = function14;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        Modifier aspectRatio$default3222 = AspectRatioKt.aspectRatio$default(rowScopeInstance2222.weight(Modifier.INSTANCE, 1.0f, false), 1.64f, false, 2, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(view2222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6;
                OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6(Function1.this, view2222, (LayoutCoordinates) obj);
                return OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier onGloballyPositioned3222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default3222, (Function1) rememberedValue);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & 112) == 32) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8;
                OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8(Function0.this);
                return OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        Function1<? super Rect, Unit> function192222 = function13;
        Function0<Unit> function082222 = function05;
        Modifier clickAnimation3222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned3222, (Function0) rememberedValue2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation3222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getBattlesDrawable(), startRestartGroup, 0), "Battles Button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier aspectRatio$default22222 = AspectRatioKt.aspectRatio$default(rowScopeInstance2222.weight(Modifier.INSTANCE, 1.0f, false), 1.64f, false, 2, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance2 = startRestartGroup.changedInstance(view2222) | ((57344 & i3) == 16384);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changedInstance2) {
        }
        function16 = function15;
        rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13;
                OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13(Function1.this, view2222, (LayoutCoordinates) obj);
                return OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        Modifier onGloballyPositioned22222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default22222, (Function1) rememberedValue3);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15;
                OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15(Function0.this);
                return OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        Function0 function092222 = (Function0) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        Function1<? super Rect, Unit> function1102222 = function16;
        Modifier clickAnimation22222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned22222, function092222, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getCompetitionsDrawable(), startRestartGroup, 0), "Competitions Button", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
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
        function17 = function1102222;
        function07 = function06;
        function18 = function192222;
        function03 = function082222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6(final Function1 function1, View view, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (function1 != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
            int intBitsToFloat = iArr[0] + ((int) Float.intBitsToFloat((int) (positionInRoot >> 32)));
            int intBitsToFloat2 = iArr[1] + ((int) Float.intBitsToFloat((int) (positionInRoot & 4294967295L)));
            final Rect rect = new Rect(intBitsToFloat, intBitsToFloat2, ((int) (coordinates.mo6536getSizeYbymL2g() >> 32)) + intBitsToFloat, ((int) (coordinates.mo6536getSizeYbymL2g() & 4294967295L)) + intBitsToFloat2);
            ComposeLayoutIdleKt.postWhenComposeLayoutIdle(view, new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6$lambda$5$lambda$4;
                    OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6$lambda$5$lambda$4 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6$lambda$5$lambda$4(Function1.this, rect);
                    return OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6$lambda$5$lambda$4;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverlappingNavigationButtons$lambda$18$lambda$7$lambda$6$lambda$5$lambda$4(Function1 function1, Rect rect) {
        function1.invoke(rect);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverlappingNavigationButtons$lambda$18$lambda$9$lambda$8(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13(final Function1 function1, View view, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (function1 != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
            int intBitsToFloat = iArr[0] + ((int) Float.intBitsToFloat((int) (positionInRoot >> 32)));
            int intBitsToFloat2 = iArr[1] + ((int) Float.intBitsToFloat((int) (positionInRoot & 4294967295L)));
            final Rect rect = new Rect(intBitsToFloat, intBitsToFloat2, ((int) (coordinates.mo6536getSizeYbymL2g() >> 32)) + intBitsToFloat, ((int) (coordinates.mo6536getSizeYbymL2g() & 4294967295L)) + intBitsToFloat2);
            ComposeLayoutIdleKt.postWhenComposeLayoutIdle(view, new Function0() { // from class: org.betup.ui.common.compose.OverlappingNavigationButtonsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13$lambda$12$lambda$11;
                    OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13$lambda$12$lambda$11 = OverlappingNavigationButtonsKt.OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13$lambda$12$lambda$11(Function1.this, rect);
                    return OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13$lambda$12$lambda$11;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverlappingNavigationButtons$lambda$18$lambda$14$lambda$13$lambda$12$lambda$11(Function1 function1, Rect rect) {
        function1.invoke(rect);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OverlappingNavigationButtons$lambda$18$lambda$16$lambda$15(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
