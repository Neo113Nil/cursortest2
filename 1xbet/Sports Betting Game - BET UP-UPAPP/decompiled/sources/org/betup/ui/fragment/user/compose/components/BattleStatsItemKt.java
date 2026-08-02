package org.betup.ui.fragment.user.compose.components;

import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.model.remote.entity.challenges.NewUserBattleMatchModel;
import org.betup.model.remote.entity.challenges.NewUserBattleModel;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.ChallengeEffectiveStateResolver;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BattleStatsItem.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"getFormattedDateDDMMYYYY", "", "BattleStatsItem", "", "item", "Lorg/betup/model/remote/entity/challenges/NewUserBattleModel;", "modifier", "Landroidx/compose/ui/Modifier;", "onPreviewClick", "Lkotlin/Function1;", "", "(Lorg/betup/model/remote/entity/challenges/NewUserBattleModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattleStatsItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleStatsItem$lambda$6(NewUserBattleModel newUserBattleModel, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        BattleStatsItem(newUserBattleModel, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final String getFormattedDateDDMMYYYY(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Instant instantSafe = UiExtensionsKt.toInstantSafe(str);
        if (instantSafe != null) {
            String format = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(instantSafe.atZone(ZoneId.systemDefault()).toLocalDate());
            if (format != null) {
                return format;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleStatsItem(final NewUserBattleModel item, Modifier modifier, Function1<? super Long, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function1<? super Long, Unit> function12;
        ChallengeState resolveEffectiveState$default;
        BattleInfo battleInfo;
        NewUserBattleMatchModel match;
        boolean changedInstance;
        Object rememberedValue;
        final Function1<? super Long, Unit> function13;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        String photoUrl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(-571625773);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        function12 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571625773, i3, -1, "org.betup.ui.fragment.user.compose.components.BattleStatsItem (BattleStatsItem.kt:61)");
                    }
                    Log.d("BattleStatsItem", "Challenge " + item.getId() + " - state: " + item.getState() + ", participantState: " + item.getParticipantState());
                    resolveEffectiveState$default = ChallengeEffectiveStateResolver.resolveEffectiveState$default(ChallengeEffectiveStateResolver.INSTANCE, item.getState(), item.getParticipantState(), false, false, 12, null);
                    Log.d("BattleStatsItem", "Challenge " + item.getId() + " - effectiveState: " + resolveEffectiveState$default);
                    if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.WON.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(243317068);
                        String str = "+" + (2 * item.getMoneyToWin());
                        long j = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                        String stringResource = StringResources_androidKt.stringResource(R.string.won, startRestartGroup, 6);
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                        String upperCase = stringResource.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        battleInfo = new BattleInfo(j, str, upperCase, ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), null);
                        startRestartGroup.endReplaceGroup();
                    } else if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.DRAW.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(243705839);
                        String str2 = "+" + item.getMoneyToWin();
                        long j2 = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                        String stringResource2 = StringResources_androidKt.stringResource(R.string.draw, startRestartGroup, 6);
                        Locale locale2 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                        String upperCase2 = stringResource2.toUpperCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                        battleInfo = new BattleInfo(j2, str2, upperCase2, ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), null);
                        startRestartGroup.endReplaceGroup();
                    } else if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.LOST.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(244093122);
                        String str3 = "-" + (item.getMoneyAccept() + item.getEnterFee());
                        long j3 = ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
                        String stringResource3 = StringResources_androidKt.stringResource(R.string.lost, startRestartGroup, 6);
                        Locale locale3 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale3, "getDefault(...)");
                        String upperCase3 = stringResource3.toUpperCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                        battleInfo = new BattleInfo(j3, str3, upperCase3, ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), null);
                        startRestartGroup.endReplaceGroup();
                    } else if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.PENDING.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(244525231);
                        String valueOf = String.valueOf(item.getMoneyToWin());
                        long j4 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                        String stringResource4 = StringResources_androidKt.stringResource(R.string.pending, startRestartGroup, 6);
                        Locale locale4 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale4, "getDefault(...)");
                        String upperCase4 = stringResource4.toUpperCase(locale4);
                        Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                        battleInfo = new BattleInfo(j4, valueOf, upperCase4, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), null);
                        startRestartGroup.endReplaceGroup();
                    } else if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.ACCEPTED.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(244915087);
                        String valueOf2 = String.valueOf(item.getMoneyToWin());
                        long j5 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                        String stringResource5 = StringResources_androidKt.stringResource(R.string.started, startRestartGroup, 6);
                        Locale locale5 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale5, "getDefault(...)");
                        String upperCase5 = stringResource5.toUpperCase(locale5);
                        Intrinsics.checkNotNullExpressionValue(upperCase5, "toUpperCase(...)");
                        battleInfo = new BattleInfo(j5, valueOf2, upperCase5, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), null);
                        startRestartGroup.endReplaceGroup();
                    } else if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.STARTED.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(245303951);
                        String valueOf3 = String.valueOf(item.getMoneyToWin());
                        long j6 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                        String stringResource6 = StringResources_androidKt.stringResource(R.string.started, startRestartGroup, 6);
                        Locale locale6 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale6, "getDefault(...)");
                        String upperCase6 = stringResource6.toUpperCase(locale6);
                        Intrinsics.checkNotNullExpressionValue(upperCase6, "toUpperCase(...)");
                        battleInfo = new BattleInfo(j6, valueOf3, upperCase6, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), null);
                        startRestartGroup.endReplaceGroup();
                    } else if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.FINISHED.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(245693838);
                        String valueOf4 = String.valueOf(item.getMoneyToWin());
                        long j7 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                        String stringResource7 = StringResources_androidKt.stringResource(R.string.finished, startRestartGroup, 6);
                        Locale locale7 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale7, "getDefault(...)");
                        String upperCase7 = stringResource7.toUpperCase(locale7);
                        Intrinsics.checkNotNullExpressionValue(upperCase7, "toUpperCase(...)");
                        battleInfo = new BattleInfo(j7, valueOf4, upperCase7, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), null);
                        startRestartGroup.endReplaceGroup();
                    } else if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.REJECTED.INSTANCE) || Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.RETURN.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(246107502);
                        String valueOf5 = String.valueOf(item.getMoneyToWin());
                        long j8 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                        String stringResource8 = StringResources_androidKt.stringResource(R.string.returned, startRestartGroup, 6);
                        Locale locale8 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale8, "getDefault(...)");
                        String upperCase8 = stringResource8.toUpperCase(locale8);
                        Intrinsics.checkNotNullExpressionValue(upperCase8, "toUpperCase(...)");
                        battleInfo = new BattleInfo(j8, valueOf5, upperCase8, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), null);
                        startRestartGroup.endReplaceGroup();
                    } else if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.CANCELED.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(246498536);
                        String valueOf6 = String.valueOf(item.getMoneyToWin());
                        long j9 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                        String stringResource9 = StringResources_androidKt.stringResource(R.string.canceled_label, startRestartGroup, 6);
                        Locale locale9 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale9, "getDefault(...)");
                        String upperCase9 = stringResource9.toUpperCase(locale9);
                        Intrinsics.checkNotNullExpressionValue(upperCase9, "toUpperCase(...)");
                        battleInfo = new BattleInfo(j9, valueOf6, upperCase9, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), null);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(246876271);
                        String valueOf7 = String.valueOf(item.getMoneyToWin());
                        long j10 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                        String stringResource10 = StringResources_androidKt.stringResource(R.string.pending, startRestartGroup, 6);
                        Locale locale10 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale10, "getDefault(...)");
                        String upperCase10 = stringResource10.toUpperCase(locale10);
                        Intrinsics.checkNotNullExpressionValue(upperCase10, "toUpperCase(...)");
                        battleInfo = new BattleInfo(j10, valueOf7, upperCase10, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), null);
                        startRestartGroup.endReplaceGroup();
                    }
                    long m14284getAmountColor0d7_KjU = battleInfo.m14284getAmountColor0d7_KjU();
                    String amountText = battleInfo.getAmountText();
                    String statusText = battleInfo.getStatusText();
                    long m14285getStatusColor0d7_KjU = battleInfo.m14285getStatusColor0d7_KjU();
                    match = item.getMatch();
                    if (match != null || (r6 = match.getDate()) == null) {
                        String str4 = "";
                    }
                    String str5 = str4;
                    float f = 4;
                    Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance = startRestartGroup.changedInstance(item) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattleStatsItemKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit BattleStatsItem$lambda$2$lambda$1;
                                BattleStatsItem$lambda$2$lambda$1 = BattleStatsItemKt.BattleStatsItem$lambda$2$lambda$1(Function1.this, item);
                                return BattleStatsItem$lambda$2$lambda$1;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    function13 = function12;
                    modifier3 = modifier4;
                    float f2 = 16;
                    float f3 = 12;
                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickAnimationModifierKt.subtleClickAnimation(m1024backgroundbw27NRU, (Function0) rememberedValue, null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 1006), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f3));
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                    photoUrl = item.getCreatorOrFromParticipants().getPhotoUrl();
                    if (photoUrl != null || StringsKt.isBlank(photoUrl)) {
                        photoUrl = null;
                    }
                    SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(photoUrl, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), RoundedCornerShapeKt.getCircleShape()), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), null, null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 48, 6, 31712);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), startRestartGroup, 6);
                    TextKt.m2642Text4IGK_g(getFormattedDateDDMMYYYY(str5), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(amountText, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m14284getAmountColor0d7_KjU, TextUnitKt.getSp(16), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), startRestartGroup, 6);
                    TextKt.m2642Text4IGK_g(statusText, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m14285getStatusColor0d7_KjU, TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                    modifier3 = modifier2;
                    function13 = function12;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.components.BattleStatsItemKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BattleStatsItem$lambda$6;
                            BattleStatsItem$lambda$6 = BattleStatsItemKt.BattleStatsItem$lambda$6(NewUserBattleModel.this, modifier5, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BattleStatsItem$lambda$6;
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
            Log.d("BattleStatsItem", "Challenge " + item.getId() + " - state: " + item.getState() + ", participantState: " + item.getParticipantState());
            resolveEffectiveState$default = ChallengeEffectiveStateResolver.resolveEffectiveState$default(ChallengeEffectiveStateResolver.INSTANCE, item.getState(), item.getParticipantState(), false, false, 12, null);
            Log.d("BattleStatsItem", "Challenge " + item.getId() + " - effectiveState: " + resolveEffectiveState$default);
            if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.WON.INSTANCE)) {
            }
            long m14284getAmountColor0d7_KjU2 = battleInfo.m14284getAmountColor0d7_KjU();
            String amountText2 = battleInfo.getAmountText();
            String statusText2 = battleInfo.getStatusText();
            long m14285getStatusColor0d7_KjU2 = battleInfo.m14285getStatusColor0d7_KjU();
            match = item.getMatch();
            if (match != null) {
            }
            String str42 = "";
            String str52 = str42;
            float f4 = 4;
            Modifier m1024backgroundbw27NRU2 = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)));
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = startRestartGroup.changedInstance(item) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattleStatsItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BattleStatsItem$lambda$2$lambda$1;
                    BattleStatsItem$lambda$2$lambda$1 = BattleStatsItemKt.BattleStatsItem$lambda$2$lambda$1(Function1.this, item);
                    return BattleStatsItem$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            function13 = function12;
            modifier3 = modifier4;
            float f22 = 16;
            float f32 = 12;
            Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(ClickAnimationModifierKt.subtleClickAnimation(m1024backgroundbw27NRU2, (Function0) rememberedValue, null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 1006), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f32));
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            photoUrl = item.getCreatorOrFromParticipants().getPhotoUrl();
            if (photoUrl != null) {
            }
            photoUrl = null;
            SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(photoUrl, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), RoundedCornerShapeKt.getCircleShape()), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), null, null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 48, 6, 31712);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f32)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(getFormattedDateDDMMYYYY(str52), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(amountText2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m14284getAmountColor0d7_KjU2, TextUnitKt.getSp(16), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f32)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(statusText2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m14285getStatusColor0d7_KjU2, TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
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
        Log.d("BattleStatsItem", "Challenge " + item.getId() + " - state: " + item.getState() + ", participantState: " + item.getParticipantState());
        resolveEffectiveState$default = ChallengeEffectiveStateResolver.resolveEffectiveState$default(ChallengeEffectiveStateResolver.INSTANCE, item.getState(), item.getParticipantState(), false, false, 12, null);
        Log.d("BattleStatsItem", "Challenge " + item.getId() + " - effectiveState: " + resolveEffectiveState$default);
        if (Intrinsics.areEqual(resolveEffectiveState$default, ChallengeState.WON.INSTANCE)) {
        }
        long m14284getAmountColor0d7_KjU22 = battleInfo.m14284getAmountColor0d7_KjU();
        String amountText22 = battleInfo.getAmountText();
        String statusText22 = battleInfo.getStatusText();
        long m14285getStatusColor0d7_KjU22 = battleInfo.m14285getStatusColor0d7_KjU();
        match = item.getMatch();
        if (match != null) {
        }
        String str422 = "";
        String str522 = str422;
        float f42 = 4;
        Modifier m1024backgroundbw27NRU22 = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundListBetsItem.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f42)));
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(item) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattleStatsItemKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BattleStatsItem$lambda$2$lambda$1;
                BattleStatsItem$lambda$2$lambda$1 = BattleStatsItemKt.BattleStatsItem$lambda$2$lambda$1(Function1.this, item);
                return BattleStatsItem$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        function13 = function12;
        modifier3 = modifier4;
        float f222 = 16;
        float f322 = 12;
        Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(ClickAnimationModifierKt.subtleClickAnimation(m1024backgroundbw27NRU22, (Function0) rememberedValue, null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 1006), Dp.m7774constructorimpl(f222), Dp.m7774constructorimpl(f322));
        Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(spaceBetween22, centerVertically32, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
        photoUrl = item.getCreatorOrFromParticipants().getPhotoUrl();
        if (photoUrl != null) {
        }
        photoUrl = null;
        SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(photoUrl, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), RoundedCornerShapeKt.getCircleShape()), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), null, null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 48, 6, 31712);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f322)), startRestartGroup, 6);
        TextKt.m2642Text4IGK_g(getFormattedDateDDMMYYYY(str522), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance32, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion22 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(amountText22, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m14284getAmountColor0d7_KjU22, TextUnitKt.getSp(16), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42)), startRestartGroup, 6);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f222)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f322)), startRestartGroup, 6);
        TextKt.m2642Text4IGK_g(statusText22, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m14285getStatusColor0d7_KjU22, TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleStatsItem$lambda$2$lambda$1(Function1 function1, NewUserBattleModel newUserBattleModel) {
        if (function1 != null) {
            function1.invoke(Long.valueOf(newUserBattleModel.getId()));
        }
        return Unit.INSTANCE;
    }
}
