package org.betup.ui.fragment.wheeloffortune.compose;

import android.content.Context;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
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
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.MainActivity;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.HapticFeedbackEffectKt;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.fragment.wheeloffortune.WheelOfFortuneSpinSoundEffect;
import org.betup.ui.fragment.wheeloffortune.model.WheelSegment;
import org.betup.ui.fragment.wheeloffortune.utils.WheelDrawUtilsKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;

/* compiled from: WheelOfFortuneContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\t\u001a%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"WheelOfFortuneContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "onSpinComplete", "Lkotlin/Function1;", "", "winningSegmentValue", "dailyBonusBoostMultiplier", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;ILandroidx/compose/runtime/Composer;II)V", "generateWheelSegments", "", "Lorg/betup/ui/fragment/wheeloffortune/model/WheelSegment;", "winningValue", "(Ljava/lang/Integer;I)Ljava/util/List;", "app_release", "isSpinning", "", "hasSpun", "currentRotation", "", "targetRotation", "spinDuration", "animatedRotation"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WheelOfFortuneContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WheelOfFortuneContent$lambda$27(Modifier modifier, Function1 function1, Integer num, int i, int i2, int i3, Composer composer, int i4) {
        WheelOfFortuneContent(modifier, function1, num, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x058a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WheelOfFortuneContent(Modifier modifier, final Function1<? super Integer, Unit> onSpinComplete, Integer num, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Integer num2;
        int i5;
        int i6;
        int i7;
        boolean z;
        Object rememberedValue;
        Object rememberedValue2;
        final MutableState mutableState;
        Object rememberedValue3;
        final MutableState mutableState2;
        Object rememberedValue4;
        final MutableState mutableState3;
        Object rememberedValue5;
        final MutableState mutableState4;
        Object rememberedValue6;
        Object rememberedValue7;
        Object rememberedValue8;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        boolean changedInstance;
        Object rememberedValue9;
        int i8;
        int i9;
        boolean changed;
        Object rememberedValue10;
        Composer composer2;
        final Modifier modifier3;
        final Integer num3;
        final int i10;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onSpinComplete, "onSpinComplete");
        Composer startRestartGroup = composer.startRestartGroup(576904395);
        int i11 = i3 & 1;
        if (i11 != 0) {
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
            i4 |= startRestartGroup.changedInstance(onSpinComplete) ? 32 : 16;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            num2 = num;
            i4 |= startRestartGroup.changed(num2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 2048 : 1024;
                i7 = i4;
                if ((i7 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i5 != 0) {
                        i6 = 1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(576904395, i7, -1, "org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContent (WheelOfFortuneContent.kt:53)");
                    }
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context context = (Context) consume;
                    final Function1<HapticFeedbackType, Unit> rememberHapticFeedback = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    int i13 = i7 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
                    z = (i13 == 256) | ((i7 & 7168) == 2048);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = generateWheelSegments(num2, i6);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final List list = (List) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    mutableState = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    mutableState2 = (MutableState) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    mutableState3 = (MutableState) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    mutableState4 = (MutableState) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(3000, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    final MutableState mutableState5 = (MutableState) rememberedValue6;
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue7;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float WheelOfFortuneContent$lambda$11 = WheelOfFortuneContent$lambda$11(mutableState4);
                    final Integer num4 = num2;
                    TweenSpec tween$default = AnimationSpecKt.tween$default(WheelOfFortuneContent$lambda$14(mutableState5), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new Function1() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit WheelOfFortuneContent$lambda$17$lambda$16;
                                WheelOfFortuneContent$lambda$17$lambda$16 = WheelOfFortuneContentKt.WheelOfFortuneContent$lambda$17$lambda$16(MutableState.this, mutableState4, mutableState3, ((Float) obj).floatValue());
                                return WheelOfFortuneContent$lambda$17$lambda$16;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    startRestartGroup.endReplaceGroup();
                    State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(WheelOfFortuneContent$lambda$11, tween$default, 0.0f, "wheel_rotation", (Function1) rememberedValue8, startRestartGroup, 27648, 4);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Modifier modifier5 = modifier4;
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
                    Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
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
                    int i14 = i6;
                    TextKt.m2642Text4IGK_g(UiExtensionsKt.toMultiLineIfNeeded(StringResources_androidKt.stringResource(R.string.daily_reward, startRestartGroup, 6)), boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(48), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, TextUnitKt.getSp(48), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613336, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.back_coins, startRestartGroup, 6), (String) null, boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter()), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(36), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    WheelBordersKt.m14314OuterCircleBorderkHDZbjc(Dp.m7774constructorimpl(254), startRestartGroup, 6, 0);
                    WheelBordersKt.m14316OuterCircleBorderGoldkHDZbjc(Dp.m7774constructorimpl(312), startRestartGroup, 6, 0);
                    Modifier rotate = RotateKt.rotate(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(232)), WheelOfFortuneContent$lambda$18(animateFloatAsState));
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance = startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(context);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19;
                                WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19 = WheelOfFortuneContentKt.WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19(list, context, (DrawScope) obj);
                                return WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    startRestartGroup.endReplaceGroup();
                    CanvasKt.Canvas(rotate, (Function1) rememberedValue9, startRestartGroup, 0);
                    WheelBordersKt.m14315OuterCircleBorder2kHDZbjc(Dp.m7774constructorimpl(MainActivity.CHALLENGE_TOUR), startRestartGroup, 6, 0);
                    WheelBordersKt.m14317WheelFramePNGkHDZbjc(Dp.m7774constructorimpl(358), startRestartGroup, 6, 0);
                    WheelBordersKt.m14313CenterCircleBorderkHDZbjc(Dp.m7774constructorimpl(78), startRestartGroup, 6, 0);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.front_coins, startRestartGroup, 6), (String) null, boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter()), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                    boolean z2 = WheelOfFortuneContent$lambda$2(mutableState) && !WheelOfFortuneContent$lambda$5(mutableState2);
                    Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(120)), Dp.m7774constructorimpl(50));
                    if (WheelOfFortuneContent$lambda$2(mutableState)) {
                        startRestartGroup.startReplaceGroup(-2014469802);
                        i9 = R.string.spinning;
                        i8 = 6;
                    } else {
                        i8 = 6;
                        startRestartGroup.startReplaceGroup(-2014468558);
                        i9 = R.string.spin;
                    }
                    String stringResource = StringResources_androidKt.stringResource(i9, startRestartGroup, i8);
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changed = startRestartGroup.changed(rememberHapticFeedback) | (i13 == 256) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(coroutineScope) | ((i7 & 112) == 32);
                    rememberedValue10 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        composer2 = startRestartGroup;
                        Function0 function0 = new Function0() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit WheelOfFortuneContent$lambda$26$lambda$25$lambda$24;
                                WheelOfFortuneContent$lambda$26$lambda$25$lambda$24 = WheelOfFortuneContentKt.WheelOfFortuneContent$lambda$26$lambda$25$lambda$24(Function1.this, num4, list, context, coroutineScope, mutableState, mutableState2, mutableState5, mutableState3, mutableState4, onSpinComplete);
                                return WheelOfFortuneContent$lambda$26$lambda$25$lambda$24;
                            }
                        };
                        composer2.updateRememberedValue(function0);
                        rememberedValue10 = function0;
                    } else {
                        composer2 = startRestartGroup;
                    }
                    composer2.endReplaceGroup();
                    CommonButtonKt.m12915CommonButtonUPEs2M4(m1549height3ABfNKs, false, stringResource, false, false, z2, (Function0) rememberedValue10, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 6, 0, 0, 2097050);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    num3 = num4;
                    i10 = i14;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    num3 = num2;
                    composer2 = startRestartGroup;
                    i10 = i6;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit WheelOfFortuneContent$lambda$27;
                            WheelOfFortuneContent$lambda$27 = WheelOfFortuneContentKt.WheelOfFortuneContent$lambda$27(Modifier.this, onSpinComplete, num3, i10, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return WheelOfFortuneContent$lambda$27;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            i7 = i4;
            if ((i7 & 1171) == 1170) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context2 = (Context) consume2;
            final Function1 rememberHapticFeedback2 = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-1633490746);
            int i132 = i7 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
            z = (i132 == 256) | ((i7 & 7168) == 2048);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = generateWheelSegments(num2, i6);
            startRestartGroup.updateRememberedValue(rememberedValue);
            final List list2 = (List) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState2 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState3 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState4 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState52 = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float WheelOfFortuneContent$lambda$112 = WheelOfFortuneContent$lambda$11(mutableState4);
            final Integer num42 = num2;
            TweenSpec tween$default2 = AnimationSpecKt.tween$default(WheelOfFortuneContent$lambda$14(mutableState52), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
            startRestartGroup.startReplaceGroup(-1746271574);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(WheelOfFortuneContent$lambda$112, tween$default2, 0.0f, "wheel_rotation", (Function1) rememberedValue8, startRestartGroup, 27648, 4);
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
            Modifier wrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center3, centerHorizontally2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier52 = modifier4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier wrapContentSize$default2 = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default2);
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
            int i142 = i6;
            TextKt.m2642Text4IGK_g(UiExtensionsKt.toMultiLineIfNeeded(StringResources_androidKt.stringResource(R.string.daily_reward, startRestartGroup, 6)), boxScopeInstance3.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(48), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, TextUnitKt.getSp(48), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613336, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.back_coins, startRestartGroup, 6), (String) null, boxScopeInstance3.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter()), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(36), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            Alignment center22 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
            WheelBordersKt.m14314OuterCircleBorderkHDZbjc(Dp.m7774constructorimpl(254), startRestartGroup, 6, 0);
            WheelBordersKt.m14316OuterCircleBorderGoldkHDZbjc(Dp.m7774constructorimpl(312), startRestartGroup, 6, 0);
            Modifier rotate2 = RotateKt.rotate(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(232)), WheelOfFortuneContent$lambda$18(animateFloatAsState2));
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = startRestartGroup.changedInstance(list2) | startRestartGroup.changedInstance(context2);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19;
                    WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19 = WheelOfFortuneContentKt.WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19(list2, context2, (DrawScope) obj);
                    return WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue9);
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(rotate2, (Function1) rememberedValue9, startRestartGroup, 0);
            WheelBordersKt.m14315OuterCircleBorder2kHDZbjc(Dp.m7774constructorimpl(MainActivity.CHALLENGE_TOUR), startRestartGroup, 6, 0);
            WheelBordersKt.m14317WheelFramePNGkHDZbjc(Dp.m7774constructorimpl(358), startRestartGroup, 6, 0);
            WheelBordersKt.m14313CenterCircleBorderkHDZbjc(Dp.m7774constructorimpl(78), startRestartGroup, 6, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.front_coins, startRestartGroup, 6), (String) null, boxScopeInstance3.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter()), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), startRestartGroup, 6);
            if (WheelOfFortuneContent$lambda$2(mutableState)) {
            }
            Modifier m1549height3ABfNKs2 = SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(120)), Dp.m7774constructorimpl(50));
            if (WheelOfFortuneContent$lambda$2(mutableState)) {
            }
            String stringResource2 = StringResources_androidKt.stringResource(i9, startRestartGroup, i8);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1224400529);
            changed = startRestartGroup.changed(rememberHapticFeedback2) | (i132 == 256) | startRestartGroup.changedInstance(list2) | startRestartGroup.changedInstance(context2) | startRestartGroup.changedInstance(coroutineScope2) | ((i7 & 112) == 32);
            rememberedValue10 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            composer2 = startRestartGroup;
            Function0 function02 = new Function0() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit WheelOfFortuneContent$lambda$26$lambda$25$lambda$24;
                    WheelOfFortuneContent$lambda$26$lambda$25$lambda$24 = WheelOfFortuneContentKt.WheelOfFortuneContent$lambda$26$lambda$25$lambda$24(Function1.this, num42, list2, context2, coroutineScope2, mutableState, mutableState2, mutableState52, mutableState3, mutableState4, onSpinComplete);
                    return WheelOfFortuneContent$lambda$26$lambda$25$lambda$24;
                }
            };
            composer2.updateRememberedValue(function02);
            rememberedValue10 = function02;
            composer2.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(m1549height3ABfNKs2, false, stringResource2, false, false, z2, (Function0) rememberedValue10, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 6, 0, 0, 2097050);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            num3 = num42;
            i10 = i142;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        num2 = num;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i4;
        if ((i7 & 1171) == 1170) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localContext22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context22 = (Context) consume22;
        final Function1 rememberHapticFeedback22 = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-1633490746);
        int i1322 = i7 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH;
        z = (i1322 == 256) | ((i7 & 7168) == 2048);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = generateWheelSegments(num2, i6);
        startRestartGroup.updateRememberedValue(rememberedValue);
        final List list22 = (List) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState3 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState4 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState522 = (MutableState) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        final CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue7;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float WheelOfFortuneContent$lambda$1122 = WheelOfFortuneContent$lambda$11(mutableState4);
        final Integer num422 = num2;
        TweenSpec tween$default22 = AnimationSpecKt.tween$default(WheelOfFortuneContent$lambda$14(mutableState522), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        startRestartGroup.startReplaceGroup(-1746271574);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        State<Float> animateFloatAsState22 = AnimateAsStateKt.animateFloatAsState(WheelOfFortuneContent$lambda$1122, tween$default22, 0.0f, "wheel_rotation", (Function1) rememberedValue8, startRestartGroup, 27648, 4);
        Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center32 = Arrangement.INSTANCE.getCenter();
        Modifier wrapContentHeight$default22 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(center32, centerHorizontally22, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default22);
        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier522 = modifier4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        Modifier wrapContentSize$default22 = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default22);
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
        int i1422 = i6;
        TextKt.m2642Text4IGK_g(UiExtensionsKt.toMultiLineIfNeeded(StringResources_androidKt.stringResource(R.string.daily_reward, startRestartGroup, 6)), boxScopeInstance32.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(48), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, TextUnitKt.getSp(48), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613336, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.back_coins, startRestartGroup, 6), (String) null, boxScopeInstance32.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter()), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(36), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
        Alignment center222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
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
        WheelBordersKt.m14314OuterCircleBorderkHDZbjc(Dp.m7774constructorimpl(254), startRestartGroup, 6, 0);
        WheelBordersKt.m14316OuterCircleBorderGoldkHDZbjc(Dp.m7774constructorimpl(312), startRestartGroup, 6, 0);
        Modifier rotate22 = RotateKt.rotate(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(232)), WheelOfFortuneContent$lambda$18(animateFloatAsState22));
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(list22) | startRestartGroup.changedInstance(context22);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19;
                WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19 = WheelOfFortuneContentKt.WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19(list22, context22, (DrawScope) obj);
                return WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue9);
        startRestartGroup.endReplaceGroup();
        CanvasKt.Canvas(rotate22, (Function1) rememberedValue9, startRestartGroup, 0);
        WheelBordersKt.m14315OuterCircleBorder2kHDZbjc(Dp.m7774constructorimpl(MainActivity.CHALLENGE_TOUR), startRestartGroup, 6, 0);
        WheelBordersKt.m14317WheelFramePNGkHDZbjc(Dp.m7774constructorimpl(358), startRestartGroup, 6, 0);
        WheelBordersKt.m14313CenterCircleBorderkHDZbjc(Dp.m7774constructorimpl(78), startRestartGroup, 6, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.front_coins, startRestartGroup, 6), (String) null, boxScopeInstance32.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter()), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), startRestartGroup, 6);
        if (WheelOfFortuneContent$lambda$2(mutableState)) {
        }
        Modifier m1549height3ABfNKs22 = SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(120)), Dp.m7774constructorimpl(50));
        if (WheelOfFortuneContent$lambda$2(mutableState)) {
        }
        String stringResource22 = StringResources_androidKt.stringResource(i9, startRestartGroup, i8);
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1224400529);
        changed = startRestartGroup.changed(rememberHapticFeedback22) | (i1322 == 256) | startRestartGroup.changedInstance(list22) | startRestartGroup.changedInstance(context22) | startRestartGroup.changedInstance(coroutineScope22) | ((i7 & 112) == 32);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        composer2 = startRestartGroup;
        Function0 function022 = new Function0() { // from class: org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit WheelOfFortuneContent$lambda$26$lambda$25$lambda$24;
                WheelOfFortuneContent$lambda$26$lambda$25$lambda$24 = WheelOfFortuneContentKt.WheelOfFortuneContent$lambda$26$lambda$25$lambda$24(Function1.this, num422, list22, context22, coroutineScope22, mutableState, mutableState2, mutableState522, mutableState3, mutableState4, onSpinComplete);
                return WheelOfFortuneContent$lambda$26$lambda$25$lambda$24;
            }
        };
        composer2.updateRememberedValue(function022);
        rememberedValue10 = function022;
        composer2.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(m1549height3ABfNKs22, false, stringResource22, false, false, z2, (Function0) rememberedValue10, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 6, 0, 0, 2097050);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier522;
        num3 = num422;
        i10 = i1422;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final boolean WheelOfFortuneContent$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void WheelOfFortuneContent$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean WheelOfFortuneContent$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void WheelOfFortuneContent$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final float WheelOfFortuneContent$lambda$8(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final void WheelOfFortuneContent$lambda$9(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    private static final float WheelOfFortuneContent$lambda$11(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final void WheelOfFortuneContent$lambda$12(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    private static final int WheelOfFortuneContent$lambda$14(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void WheelOfFortuneContent$lambda$15(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WheelOfFortuneContent$lambda$17$lambda$16(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, float f) {
        if (WheelOfFortuneContent$lambda$2(mutableState)) {
            WheelOfFortuneContent$lambda$3(mutableState, false);
            WheelOfFortuneContent$lambda$9(mutableState3, WheelOfFortuneContent$lambda$11(mutableState2) % 360.0f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WheelOfFortuneContent$lambda$26$lambda$22$lambda$21$lambda$20$lambda$19(List list, Context context, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        WheelDrawUtilsKt.drawWheel(list, Canvas, context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[LOOP:1: B:21:0x00a8->B:23:0x00ad, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit WheelOfFortuneContent$lambda$26$lambda$25$lambda$24(Function1 function1, Integer num, List list, Context context, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Function1 function12) {
        WheelSegment wheelSegment;
        WheelSegment wheelSegment2;
        float WheelOfFortuneContent$lambda$8;
        Object obj;
        if (!WheelOfFortuneContent$lambda$2(mutableState) && !WheelOfFortuneContent$lambda$5(mutableState2)) {
            function1.invoke(HapticFeedbackType.LightTap);
            WheelOfFortuneContent$lambda$3(mutableState, true);
            WheelOfFortuneContent$lambda$6(mutableState2, true);
            if (num == null) {
                wheelSegment = (WheelSegment) CollectionsKt.random(list, Random.INSTANCE);
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    int value = ((WheelSegment) obj).getValue();
                    if (num != null && value == num.intValue()) {
                        break;
                    }
                }
                WheelSegment wheelSegment3 = (WheelSegment) obj;
                if (wheelSegment3 == null) {
                    wheelSegment = (WheelSegment) CollectionsKt.random(list, Random.INSTANCE);
                } else {
                    wheelSegment2 = wheelSegment3;
                    float size = 360.0f / list.size();
                    float indexOf = (list.indexOf(wheelSegment2) * size) + (((Random.INSTANCE.nextFloat() * 0.6f) + 0.2f) * size);
                    int nextInt = Random.INSTANCE.nextInt(2500, 4000);
                    WheelOfFortuneContent$lambda$15(mutableState3, nextInt);
                    WheelOfFortuneSpinSoundEffect.INSTANCE.playForSpin(context, nextInt);
                    float nextInt2 = Random.INSTANCE.nextInt(5, 9) * 360.0f;
                    WheelOfFortuneContent$lambda$8 = (-indexOf) - (WheelOfFortuneContent$lambda$8(mutableState4) % 360.0f);
                    while (WheelOfFortuneContent$lambda$8 < 0.0f) {
                        WheelOfFortuneContent$lambda$8 += 360.0f;
                    }
                    WheelOfFortuneContent$lambda$12(mutableState5, WheelOfFortuneContent$lambda$8(mutableState4) + nextInt2 + WheelOfFortuneContent$lambda$8);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WheelOfFortuneContentKt$WheelOfFortuneContent$1$2$1$1(nextInt, function1, function12, wheelSegment2, null), 3, null);
                }
            }
            wheelSegment2 = wheelSegment;
            float size2 = 360.0f / list.size();
            float indexOf2 = (list.indexOf(wheelSegment2) * size2) + (((Random.INSTANCE.nextFloat() * 0.6f) + 0.2f) * size2);
            int nextInt3 = Random.INSTANCE.nextInt(2500, 4000);
            WheelOfFortuneContent$lambda$15(mutableState3, nextInt3);
            WheelOfFortuneSpinSoundEffect.INSTANCE.playForSpin(context, nextInt3);
            float nextInt22 = Random.INSTANCE.nextInt(5, 9) * 360.0f;
            WheelOfFortuneContent$lambda$8 = (-indexOf2) - (WheelOfFortuneContent$lambda$8(mutableState4) % 360.0f);
            while (WheelOfFortuneContent$lambda$8 < 0.0f) {
            }
            WheelOfFortuneContent$lambda$12(mutableState5, WheelOfFortuneContent$lambda$8(mutableState4) + nextInt22 + WheelOfFortuneContent$lambda$8);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WheelOfFortuneContentKt$WheelOfFortuneContent$1$2$1$1(nextInt3, function1, function12, wheelSegment2, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    private static final List<WheelSegment> generateWheelSegments(Integer num, int i) {
        int i2;
        long j;
        int nextInt;
        int coerceAtLeast = RangesKt.coerceAtLeast(i, 1);
        int intValue = num != null ? num.intValue() : coerceAtLeast * 500;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Integer.valueOf(intValue));
        while (true) {
            i2 = 0;
            if (linkedHashSet.size() >= 10) {
                break;
            }
            int nextInt2 = Random.INSTANCE.nextInt(0, 100);
            if (nextInt2 >= 0 && nextInt2 < 50) {
                nextInt = Random.INSTANCE.nextInt(10, 100) * 10;
            } else {
                nextInt = Random.INSTANCE.nextInt(1, 10) * 100;
            }
            int i3 = nextInt * coerceAtLeast;
            if (i3 != intValue) {
                linkedHashSet.add(Integer.valueOf(i3));
            }
        }
        List shuffled = CollectionsKt.shuffled(CollectionsKt.toList(linkedHashSet));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(shuffled, 10));
        for (Object obj : shuffled) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int intValue2 = ((Number) obj).intValue();
            if (i2 % 2 == 0) {
                j = ComposeUtils.AppColorPalette.GoldBackgroundFortune1.INSTANCE.getColor();
            } else {
                j = ComposeUtils.AppColorPalette.GoldBackgroundFortune2.INSTANCE.getColor();
            }
            arrayList.add(new WheelSegment(intValue2, j, String.valueOf(intValue2), null));
            i2 = i4;
        }
        return arrayList;
    }

    private static final float WheelOfFortuneContent$lambda$18(State<Float> state) {
        return state.getValue().floatValue();
    }
}
