package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
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
import com.google.firebase.crashlytics.internal.common.IdManager;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.challenges.NewChallengeBetDetailsModel;
import org.betup.model.remote.entity.challenges.NewChallengeBetModel;
import org.betup.model.remote.entity.challenges.NewChallengeBetTypeGroupModel;
import org.betup.model.remote.entity.challenges.NewChallengeCreatorModel;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsModel;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsResponseModelP;
import org.betup.model.remote.entity.challenges.NewChallengeMatchModel;
import org.betup.model.remote.entity.challenges.NewChallengeParticipantModel;
import org.betup.ui.MainActivity;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.dialogs.BattleDialogStateManager;
import org.betup.ui.fragment.bets.sheet.compose.BettingSheetLoadingStateKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.BattleBetHighlightStyle;
import org.betup.utils.BattleBetOutcomeResolver;
import org.betup.utils.BattleBetOutcomeResult;
import org.betup.utils.BattleDetailsMapper;
import org.betup.utils.BattleOutcomeMessage;
import org.betup.utils.BattleOutcomeScenario;
import org.betup.utils.BattleParticipantOrder;
import org.betup.utils.BattleShareCaptureAnchor;
import org.betup.utils.NavigationHelper;
import org.betup.utils.OddHelper;
import org.betup.utils.OrderedBattleParticipants;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: ChallengePreviewScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MainActivity $activity;
    final /* synthetic */ BattleDetailsMapper.AmountDisplay $amountDisplay;
    final /* synthetic */ boolean $animationsEnabled;
    final /* synthetic */ boolean $canCancelBattle;
    final /* synthetic */ NewChallengeDetailsResponseModelP $challengeDetails;
    final /* synthetic */ boolean $compact;
    final /* synthetic */ float $contentBottomPadding;
    final /* synthetic */ float $contentTopPadding;
    final /* synthetic */ Long $currentUserId;
    final /* synthetic */ BattleResultPalette $detailsPalette;
    final /* synthetic */ float $emblemTopPad;
    final /* synthetic */ float $emblemVerticalOffset;
    final /* synthetic */ Integer $globalState;
    final /* synthetic */ String $headerAmountText;
    final /* synthetic */ String $headerSubtitleOverride;
    final /* synthetic */ boolean $isCancelInProgress;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ boolean $isSettledBattle;
    final /* synthetic */ float $maxDialogHeight;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function0<Unit> $onAcceptChallenge;
    final /* synthetic */ Function0<Unit> $onCancelChallenge;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function0<Unit> $onHowBattlesDecided;
    final /* synthetic */ Function2<Long, Boolean, Unit> $onMatchClick;
    final /* synthetic */ Function0<Unit> $onRematch;
    final /* synthetic */ Function0<Unit> $onShare;
    final /* synthetic */ int $resolvedEffectiveState;
    final /* synthetic */ int $revealPhase;
    final /* synthetic */ BattleShareCaptureAnchor $shareCaptureAnchor;
    final /* synthetic */ boolean $showPremiumShell;
    final /* synthetic */ boolean $showResultActions;
    final /* synthetic */ float $sidePadding;
    final /* synthetic */ BoxScope $this_Box;
    final /* synthetic */ boolean $veryCompact;

    /* JADX WARN: Multi-variable type inference failed */
    ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2(BoxScope boxScope, boolean z, float f, boolean z2, float f2, BattleShareCaptureAnchor battleShareCaptureAnchor, BattleResultPalette battleResultPalette, float f3, boolean z3, int i, float f4, float f5, float f6, String str, BattleDetailsMapper.AmountDisplay amountDisplay, String str2, NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP, Function0<Unit> function0, boolean z4, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, boolean z5, Function2<? super Long, ? super Boolean, Unit> function2, Long l, Integer num, int i2, boolean z6, OddType oddType, MainActivity mainActivity, Function0<Unit> function05, boolean z7, boolean z8, boolean z9, Function0<Unit> function06) {
        this.$this_Box = boxScope;
        this.$compact = z;
        this.$sidePadding = f;
        this.$showPremiumShell = z2;
        this.$emblemTopPad = f2;
        this.$shareCaptureAnchor = battleShareCaptureAnchor;
        this.$detailsPalette = battleResultPalette;
        this.$emblemVerticalOffset = f3;
        this.$animationsEnabled = z3;
        this.$revealPhase = i;
        this.$maxDialogHeight = f4;
        this.$contentTopPadding = f5;
        this.$contentBottomPadding = f6;
        this.$headerAmountText = str;
        this.$amountDisplay = amountDisplay;
        this.$headerSubtitleOverride = str2;
        this.$challengeDetails = newChallengeDetailsResponseModelP;
        this.$onAcceptChallenge = function0;
        this.$showResultActions = z4;
        this.$onShare = function02;
        this.$onRematch = function03;
        this.$onHowBattlesDecided = function04;
        this.$isLoading = z5;
        this.$onMatchClick = function2;
        this.$currentUserId = l;
        this.$globalState = num;
        this.$resolvedEffectiveState = i2;
        this.$veryCompact = z6;
        this.$oddType = oddType;
        this.$activity = mainActivity;
        this.$onDismiss = function05;
        this.$isSettledBattle = z7;
        this.$canCancelBattle = z8;
        this.$isCancelInProgress = z9;
        this.$onCancelChallenge = function06;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(BattleShareCaptureAnchor battleShareCaptureAnchor, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        battleShareCaptureAnchor.setCoordinates(coordinates);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(Function2 function2, long j, boolean z) {
        if (function2 != null) {
            function2.invoke(Long.valueOf(j), Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$26$lambda$25$lambda$19$lambda$16$lambda$15$lambda$14(NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP, MainActivity mainActivity, Function0 function0, long j) {
        Long id;
        NewChallengeDetailsModel challenge = newChallengeDetailsResponseModelP.getChallenge();
        Integer valueOf = (challenge == null || (id = challenge.getId()) == null) ? null : Integer.valueOf((int) id.longValue());
        if (valueOf != null && mainActivity != null) {
            BattleDialogStateManager.INSTANCE.storeDialogState(new BattleDialogStateManager.DialogState(BattleDialogStateManager.DialogType.CHALLENGE_PREVIEW, valueOf, null, null, null, null, null, null, null, null, null, null, null, 8188, null), mainActivity);
        }
        function0.invoke();
        NavigationHelper.navigateToForeignUser$default(NavigationHelper.INSTANCE, (int) j, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$26$lambda$25$lambda$24$lambda$23(NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP, MainActivity mainActivity, Function0 function0) {
        NewChallengeDetailsModel challenge;
        Long id;
        Integer valueOf = (newChallengeDetailsResponseModelP == null || (challenge = newChallengeDetailsResponseModelP.getChallenge()) == null || (id = challenge.getId()) == null) ? null : Integer.valueOf((int) id.longValue());
        if (valueOf != null && mainActivity != null) {
            BattleDialogStateManager.INSTANCE.storeDialogState(new BattleDialogStateManager.DialogState(BattleDialogStateManager.DialogType.CHALLENGE_PREVIEW, valueOf, null, null, null, null, null, null, null, null, null, null, null, 8188, null), mainActivity);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$30$lambda$29$lambda$28(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$32$lambda$31(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$34$lambda$33(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$36$lambda$35(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$42$lambda$39$lambda$38(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$42$lambda$41$lambda$40(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44$lambda$43(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x0742, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r7) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x07f3, code lost:
    
        if ((r10 != null ? r10.getLeftHighlight() : null) == org.betup.utils.BattleBetHighlightStyle.WINNER) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0807, code lost:
    
        if (r1 == null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x08a6, code lost:
    
        if (r5 == null) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0b98, code lost:
    
        if (r2 == null) goto L350;
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x074c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        Modifier.Companion companion;
        boolean z;
        String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        int i2;
        float f;
        boolean z2;
        BoxScopeInstance boxScopeInstance;
        int i3;
        BattleResultPalette battleResultPalette;
        boolean z3;
        int i4;
        boolean z4;
        Long l;
        boolean z5;
        Object obj2;
        String str5;
        String str6;
        int i5;
        String str7;
        Function0<Unit> function0;
        boolean z6;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Function0<Unit> function04;
        boolean z7;
        boolean z8;
        Function0<Unit> function05;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        final Function0<Unit> function06;
        NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP;
        int i6;
        int i7;
        NewChallengeBetDetailsModel bet;
        NewChallengeBetDetailsModel bet2;
        NewChallengeBetDetailsModel bet3;
        NewChallengeBetDetailsModel bet4;
        NewChallengeBetTypeGroupModel betTypeGroup;
        BattleBetOutcomeResult battleBetOutcomeResult;
        int i8;
        int i9;
        boolean z9;
        boolean z10;
        OddType oddType;
        BattleOutcomeMessage battleOutcomeMessage;
        String str13;
        float m7774constructorimpl;
        OrderedBattleParticipants orderedBattleParticipants;
        float m7774constructorimpl2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean shouldShowStakesStrip;
        BattleOutcomeMessage battleOutcomeMessage2;
        int i10;
        String str14;
        final NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP2;
        OddType oddType2;
        final MainActivity mainActivity;
        boolean z11;
        int i11;
        final Function0<Unit> function07;
        Function0<Unit> function08;
        NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP3;
        Composer composer2;
        int i12;
        float f2;
        Object obj3;
        Unit unit;
        Integer statusHintMessageRes;
        NewChallengeBetModel leftBet;
        NewChallengeBetDetailsModel bet5;
        Double placedCoefficient;
        Long enterFee;
        Long moneyAccept;
        NewChallengeParticipantModel leftUser;
        Integer num;
        NewChallengeBetDetailsModel newChallengeBetDetailsModel;
        NewChallengeBetDetailsModel bet6;
        Integer participantState;
        final Function0<Unit> function09;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-580854500, i, -1, "org.betup.ui.dialogs.compose.ChallengePreviewScreen.<anonymous>.<anonymous>.<anonymous> (ChallengePreviewScreen.kt:232)");
        }
        Modifier align = this.$this_Box.align(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getCenter());
        float m7774constructorimpl3 = Dp.m7774constructorimpl(this.$compact ? 2 : 4);
        float f3 = this.$sidePadding;
        Modifier then = PaddingKt.m1520paddingqDBjuR0$default(align, f3, m7774constructorimpl3, f3, 0.0f, 8, null).then(this.$showPremiumShell ? PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, this.$emblemTopPad, 0.0f, 0.0f, 13, null) : Modifier.INSTANCE);
        composer.startReplaceGroup(144591987);
        if (this.$shareCaptureAnchor != null) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean changedInstance = composer.changedInstance(this.$shareCaptureAnchor);
            final BattleShareCaptureAnchor battleShareCaptureAnchor = this.$shareCaptureAnchor;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$1$lambda$0(BattleShareCaptureAnchor.this, (LayoutCoordinates) obj4);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            companion = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) rememberedValue);
        } else {
            companion = Modifier.INSTANCE;
        }
        composer.endReplaceGroup();
        Modifier then2 = then.then(companion);
        boolean z12 = this.$showPremiumShell;
        BattleResultPalette battleResultPalette2 = this.$detailsPalette;
        float f4 = this.$emblemVerticalOffset;
        boolean z13 = this.$animationsEnabled;
        int i13 = this.$revealPhase;
        boolean z14 = this.$compact;
        float f5 = this.$maxDialogHeight;
        float f6 = this.$contentTopPadding;
        float f7 = this.$contentBottomPadding;
        String str15 = this.$headerAmountText;
        BattleDetailsMapper.AmountDisplay amountDisplay = this.$amountDisplay;
        String str16 = this.$headerSubtitleOverride;
        final NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP4 = this.$challengeDetails;
        Function0<Unit> function010 = this.$onAcceptChallenge;
        boolean z15 = this.$showResultActions;
        Function0<Unit> function011 = this.$onShare;
        Function0<Unit> function012 = this.$onRematch;
        Function0<Unit> function013 = this.$onHowBattlesDecided;
        boolean z16 = this.$isLoading;
        final Function2<Long, Boolean, Unit> function2 = this.$onMatchClick;
        Long l2 = this.$currentUserId;
        Integer num2 = this.$globalState;
        int i14 = this.$resolvedEffectiveState;
        boolean z17 = this.$veryCompact;
        OddType oddType3 = this.$oddType;
        final MainActivity mainActivity2 = this.$activity;
        Function0<Unit> function014 = this.$onDismiss;
        boolean z18 = this.$isSettledBattle;
        boolean z19 = this.$canCancelBattle;
        boolean z20 = this.$isCancelInProgress;
        Function0<Unit> function015 = this.$onCancelChallenge;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, then2);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        float f8 = 12;
        Modifier background$default = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(SizeKt.wrapContentSize$default(boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), null, false, 3, null), z12 ? Dp.m7774constructorimpl((float) 1.5d) : Dp.m7774constructorimpl(1), z12 ? battleResultPalette2.getDialogBorder() : ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8))), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), null, 0.0f, 6, null);
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, background$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Modifier.Companion companion3 = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion3);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash3);
        }
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(PaddingKt.m1519paddingqDBjuR0(ScrollKt.verticalScroll$default(SizeKt.m1551heightInVpY3zN4$default(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0.0f, f5, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), Dp.m7774constructorimpl(z14 ? 7 : 9), f6, Dp.m7774constructorimpl(z14 ? 7 : 9), f7).then(z12 ? BattleResultVisualModifiersKt.m13249battleCardInnerGlowHht5A8o$default(Modifier.INSTANCE, Color.m5167copywmQWz5c$default(battleResultPalette2.m13243getGlow0d7_KjU(), 0.23f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 2, null) : Modifier.INSTANCE), Dp.m7774constructorimpl(1), z12 ? battleResultPalette2.getDialogBorder() : ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8))), z12 ? BattleResultThemeKt.cardBodyBrush(battleResultPalette2) : ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), null, 0.0f, 6, null), null, false, 3, null);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, centerHorizontally, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, wrapContentHeight$default);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor4);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash4);
        }
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceGroup(1128526942);
        if (!z12 || Intrinsics.areEqual(str15, AbstractJsonLexerKt.NULL)) {
            z = z14;
            str = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
            obj = AbstractJsonLexerKt.NULL;
            str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            str3 = "C89@4556L9:Column.kt#2w3rfo";
            str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            i2 = i13;
            f = f4;
            z2 = z13;
            boxScopeInstance = boxScopeInstance2;
            i3 = -1323940314;
            battleResultPalette = battleResultPalette2;
            z3 = z12;
        } else {
            long m14441getAmountColor0d7_KjU = amountDisplay.m14441getAmountColor0d7_KjU();
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(z14 ? 0 : 2), 7, null);
            Color m5158boximpl = Color.m5158boximpl(m14441getAmountColor0d7_KjU);
            z = z14;
            str = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
            i2 = i13;
            i3 = -1323940314;
            obj = AbstractJsonLexerKt.NULL;
            z2 = z13;
            boxScopeInstance = boxScopeInstance2;
            str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            f = f4;
            battleResultPalette = battleResultPalette2;
            z3 = z12;
            str3 = "C89@4556L9:Column.kt#2w3rfo";
            str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            BattleResultComponentsKt.m13218BattleResultHeaderBandEoQKNkA(battleResultPalette2, str15, m1520paddingqDBjuR0$default, m5158boximpl, str16, z2, i2, z, composer, 0, 0);
        }
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Modifier.Companion companion4 = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, i3, str2);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, companion4);
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
        String str17 = str4;
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str17);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor5);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash5);
        }
        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
        if (z16) {
            composer.startReplaceGroup(-1099299498);
            BettingSheetLoadingStateKt.BettingSheetLoadingState(null, composer, 0, 1);
            composer.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
            i4 = i2;
        } else {
            composer.startReplaceGroup(-1099152992);
            NewChallengeMatchModel match = newChallengeDetailsResponseModelP4 != null ? newChallengeDetailsResponseModelP4.getMatch() : null;
            if (match == null) {
                i4 = i2;
            } else {
                final boolean isStarted = UiExtensionsKt.isStarted(match);
                BattleResultPalette battleResultPalette3 = z3 ? battleResultPalette : null;
                float f9 = 2;
                Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f9), 0.0f, Dp.m7774constructorimpl(f9), 5, null);
                if (z2 && z3) {
                    i4 = i2;
                    z4 = true;
                } else {
                    i4 = i2;
                    z4 = false;
                }
                Modifier battleRevealRise = BattleResultAnimationsKt.battleRevealRise(m1520paddingqDBjuR0$default2, i4, 2, z4);
                final long id = match.getId();
                composer.startReplaceGroup(-1975084562);
                composer.startReplaceGroup(-1746271574);
                boolean changed = composer.changed(function2) | composer.changed(id) | composer.changed(isStarted);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2;
                            invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(Function2.this, id, isStarted);
                            return invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                BattleResultComponentsKt.BattleMatchChip(match, battleRevealRise, battleResultPalette3, (Function0) rememberedValue2, composer, 0, 0);
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        List<NewChallengeParticipantModel> participantUsers = newChallengeDetailsResponseModelP4 != null ? newChallengeDetailsResponseModelP4.getParticipantUsers() : null;
        composer.startReplaceGroup(1128625161);
        if (participantUsers == null) {
            i6 = 6;
            str6 = str17;
            i5 = i4;
            str7 = str2;
            newChallengeDetailsResponseModelP = newChallengeDetailsResponseModelP4;
            function0 = function010;
            z6 = z15;
            function02 = function011;
            function03 = function012;
            function04 = function013;
            function06 = function014;
            z7 = z19;
            z8 = z20;
            function05 = function015;
            str8 = str;
            str9 = str3;
            i7 = 2;
        } else {
            String stringResource = StringResources_androidKt.stringResource(R.string.bet_hidden_short, composer, 6);
            List<NewChallengeBetModel> bets = newChallengeDetailsResponseModelP4.getBets();
            if (bets == null) {
                bets = CollectionsKt.emptyList();
            }
            NewChallengeBetModel newChallengeBetModel = (NewChallengeBetModel) CollectionsKt.getOrNull(bets, 0);
            NewChallengeBetModel newChallengeBetModel2 = (NewChallengeBetModel) CollectionsKt.getOrNull(bets, 1);
            NewChallengeCreatorModel createdBy = newChallengeDetailsResponseModelP4.getCreatedBy();
            Long valueOf = createdBy != null ? Long.valueOf(createdBy.getId()) : null;
            if (l2 == null || valueOf == null) {
                l = l2;
            } else {
                l = l2;
                if (Intrinsics.areEqual(l, valueOf)) {
                    z5 = true;
                    if (newChallengeBetModel2 != null || (bet6 = newChallengeBetModel2.getBet()) == null || (str5 = bet6.getBetName()) == null) {
                        obj2 = obj;
                    } else {
                        obj2 = obj;
                        if (!Intrinsics.areEqual(str5, obj2)) {
                        }
                    }
                    str5 = null;
                    boolean z21 = str5 == null;
                    boolean z22 = z21 && !z5;
                    composer.startReplaceGroup(1128674235);
                    if (participantUsers.size() <= 1) {
                        composer.startReplaceGroup(1611379120);
                        NewChallengeParticipantModel newChallengeParticipantModel = participantUsers.get(0);
                        if (z21) {
                            BattleBetOutcomeResolver battleBetOutcomeResolver = BattleBetOutcomeResolver.INSTANCE;
                            NewChallengeBetDetailsModel bet7 = newChallengeBetModel != null ? newChallengeBetModel.getBet() : null;
                            if (newChallengeBetModel2 != null) {
                                newChallengeBetDetailsModel = newChallengeBetModel2.getBet();
                                num = num2;
                            } else {
                                num = num2;
                                newChallengeBetDetailsModel = null;
                            }
                            battleBetOutcomeResult = battleBetOutcomeResolver.resolve(bet7, newChallengeBetDetailsModel, num);
                        } else {
                            battleBetOutcomeResult = new BattleBetOutcomeResult(BattleBetHighlightStyle.DEFAULT, BattleBetHighlightStyle.DEFAULT, BattleOutcomeScenario.UNRESOLVED);
                        }
                        OrderedBattleParticipants reorderTwoUsers = BattleParticipantOrder.INSTANCE.reorderTwoUsers(participantUsers, bets, l, battleBetOutcomeResult.getFirstHighlight(), battleBetOutcomeResult.getSecondHighlight());
                        boolean z23 = (reorderTwoUsers == null || (leftUser = reorderTwoUsers.getLeftUser()) == null || leftUser.getId() != newChallengeParticipantModel.getId()) ? false : true;
                        boolean z24 = z23 ? z22 : !z21;
                        if (z23) {
                            i8 = i14;
                            i9 = 4;
                            z9 = !z21;
                        } else {
                            z9 = z22;
                            i8 = i14;
                            i9 = 4;
                        }
                        if (i8 != i9) {
                            if (battleBetOutcomeResult.getScenario() == BattleOutcomeScenario.BOTH_WIN) {
                            }
                            z10 = false;
                            if (reorderTwoUsers == null) {
                                oddType = oddType3;
                                battleOutcomeMessage = BattleBetOutcomeResolver.INSTANCE.buildOutcomeMessage(battleBetOutcomeResult.getScenario(), reorderTwoUsers, oddType, z10);
                            } else {
                                oddType = oddType3;
                            }
                            Integer messageResId = BattleBetOutcomeResolver.INSTANCE.messageResId(battleBetOutcomeResult.getScenario());
                            battleOutcomeMessage = messageResId == null ? new BattleOutcomeMessage(messageResId.intValue(), null, 2, null) : null;
                            BattleOutcomeMessage battleOutcomeMessage3 = battleOutcomeMessage;
                            NewChallengeDetailsModel challenge = newChallengeDetailsResponseModelP4.getChallenge();
                            long longValue = (challenge != null || (moneyAccept = challenge.getMoneyAccept()) == null) ? 0L : moneyAccept.longValue();
                            NewChallengeDetailsModel challenge2 = newChallengeDetailsResponseModelP4.getChallenge();
                            long longValue2 = longValue + ((challenge2 != null || (enterFee = challenge2.getEnterFee()) == null) ? 0L : enterFee.longValue());
                            long j = 2 * longValue2;
                            if (reorderTwoUsers != null && (leftBet = reorderTwoUsers.getLeftBet()) != null && (bet5 = leftBet.getBet()) != null && (placedCoefficient = bet5.getPlacedCoefficient()) != null) {
                                if (placedCoefficient.doubleValue() <= 0.0d) {
                                    placedCoefficient = null;
                                }
                                if (placedCoefficient != null && (str13 = OddHelper.format(oddType, placedCoefficient.doubleValue())) != null) {
                                    if (!StringsKt.isBlank(str13) || Intrinsics.areEqual(str13, obj2) || Intrinsics.areEqual(str13, "0") || Intrinsics.areEqual(str13, IdManager.DEFAULT_VERSION_NAME)) {
                                        str13 = null;
                                    }
                                }
                            }
                            str13 = "-";
                            OddType oddType4 = oddType;
                            float f10 = 0.0f;
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            if (z) {
                                m7774constructorimpl = Dp.m7774constructorimpl(6);
                                orderedBattleParticipants = reorderTwoUsers;
                                f10 = 0.0f;
                            } else {
                                m7774constructorimpl = Dp.m7774constructorimpl(3);
                                orderedBattleParticipants = reorderTwoUsers;
                            }
                            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(fillMaxWidth$default, f10, m7774constructorimpl, 1, null);
                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            if (!z17) {
                                m7774constructorimpl2 = Dp.m7774constructorimpl(4);
                            } else if (z) {
                                m7774constructorimpl2 = Dp.m7774constructorimpl(5);
                            } else {
                                m7774constructorimpl2 = Dp.m7774constructorimpl(6);
                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = arrangement.m1397spacedBy0680j_4(m7774constructorimpl2);
                                ComposerKt.sourceInformationMarkerStart(composer, -483455358, str);
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally2, composer, 48);
                                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str2);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer, m1518paddingVpY3zN4$default);
                                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                String str18 = str2;
                                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str17);
                                if (!(composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor6);
                                } else {
                                    composer.useNode();
                                }
                                m4610constructorimpl = Updater.m4610constructorimpl(composer);
                                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
                                }
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                String str19 = str3;
                                ComposerKt.sourceInformationMarkerStart(composer, -384672921, str19);
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                shouldShowStakesStrip = BattleDetailsMapper.INSTANCE.shouldShowStakesStrip(i8, true, !z24);
                                composer.startReplaceGroup(-545912219);
                                if (shouldShowStakesStrip) {
                                    oddType2 = oddType4;
                                    int i15 = i8;
                                    int i16 = i4;
                                    str8 = str;
                                    battleOutcomeMessage2 = battleOutcomeMessage3;
                                    str6 = str17;
                                    str14 = str19;
                                    newChallengeDetailsResponseModelP2 = newChallengeDetailsResponseModelP4;
                                    function0 = function010;
                                    z6 = z15;
                                    function02 = function011;
                                    function03 = function012;
                                    function04 = function013;
                                    i10 = i15;
                                    mainActivity = mainActivity2;
                                    z11 = z18;
                                    z7 = z19;
                                    z8 = z20;
                                    function05 = function015;
                                    i11 = i4;
                                    function07 = function014;
                                    BattleResultComponentsKt.BattleStakesStrip(longValue2, j, str13, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(4), 0.0f, 2, null), battleResultPalette, z2, i16, composer, 3072, 0);
                                } else {
                                    battleOutcomeMessage2 = battleOutcomeMessage3;
                                    i10 = i8;
                                    str6 = str17;
                                    str14 = str19;
                                    newChallengeDetailsResponseModelP2 = newChallengeDetailsResponseModelP4;
                                    function0 = function010;
                                    z6 = z15;
                                    function02 = function011;
                                    function03 = function012;
                                    function04 = function013;
                                    oddType2 = oddType4;
                                    mainActivity = mainActivity2;
                                    z11 = z18;
                                    z7 = z19;
                                    z8 = z20;
                                    function05 = function015;
                                    str8 = str;
                                    i11 = i4;
                                    function07 = function014;
                                }
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-545884965);
                                if (orderedBattleParticipants == null) {
                                    function08 = function07;
                                    newChallengeDetailsResponseModelP3 = newChallengeDetailsResponseModelP2;
                                    composer2 = composer;
                                    i5 = i11;
                                    str7 = str18;
                                    str9 = str14;
                                } else {
                                    composer.startReplaceGroup(-1746271574);
                                    boolean changedInstance2 = composer.changedInstance(newChallengeDetailsResponseModelP2) | composer.changedInstance(mainActivity) | composer.changed(function07);
                                    Object rememberedValue3 = composer.rememberedValue();
                                    if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new Function1() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj4) {
                                                Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$26$lambda$25$lambda$19$lambda$16$lambda$15$lambda$14;
                                                invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$26$lambda$25$lambda$19$lambda$16$lambda$15$lambda$14 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$26$lambda$25$lambda$19$lambda$16$lambda$15$lambda$14(NewChallengeDetailsResponseModelP.this, mainActivity, function07, ((Long) obj4).longValue());
                                                return invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$26$lambda$25$lambda$19$lambda$16$lambda$15$lambda$14;
                                            }
                                        };
                                        composer.updateRememberedValue(rememberedValue3);
                                    }
                                    composer.endReplaceGroup();
                                    function08 = function07;
                                    i5 = i11;
                                    newChallengeDetailsResponseModelP3 = newChallengeDetailsResponseModelP2;
                                    str7 = str18;
                                    str9 = str14;
                                    composer2 = composer;
                                    BattleResultComponentsKt.BattleDuelSection(orderedBattleParticipants, oddType2, z24, z9, stringResource, null, battleResultPalette, z2, i11, z, (Function1) rememberedValue3, composer, 0, 0, 32);
                                    Unit unit5 = Unit.INSTANCE;
                                    Unit unit6 = Unit.INSTANCE;
                                }
                                composer.endReplaceGroup();
                                composer2.startReplaceGroup(-545810862);
                                if (battleOutcomeMessage2 == null) {
                                    unit = null;
                                    i12 = 2;
                                    f2 = 0.0f;
                                    obj3 = null;
                                } else {
                                    i12 = 2;
                                    f2 = 0.0f;
                                    obj3 = null;
                                    BattleResultComponentsKt.BattleOutcomeCaption(battleOutcomeMessage2, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(4), 0.0f, 2, null), battleResultPalette, z2, i5, composer, 48, 0);
                                    Unit unit7 = Unit.INSTANCE;
                                    unit = Unit.INSTANCE;
                                }
                                composer.endReplaceGroup();
                                composer2.startReplaceGroup(-545810458);
                                if (unit != null && (statusHintMessageRes = BattleDetailsMapper.INSTANCE.statusHintMessageRes(i10)) != null) {
                                    int intValue = statusHintMessageRes.intValue();
                                    composer2.startReplaceGroup(-545785522);
                                    if (!z11) {
                                        BattleResultComponentsKt.BattleDetailsStatusBanner(StringResources_androidKt.stringResource(intValue, composer2, 0), battleResultPalette, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(4), f2, i12, obj3), z2, i5, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                    }
                                    composer.endReplaceGroup();
                                    Unit unit8 = Unit.INSTANCE;
                                    Unit unit9 = Unit.INSTANCE;
                                }
                                composer.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endReplaceGroup();
                                i7 = i12;
                                function06 = function08;
                                newChallengeDetailsResponseModelP = newChallengeDetailsResponseModelP3;
                                i6 = 6;
                            }
                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = arrangement.m1397spacedBy0680j_4(m7774constructorimpl2);
                            ComposerKt.sourceInformationMarkerStart(composer, -483455358, str);
                            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42, centerHorizontally2, composer, 48);
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str2);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap62 = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(composer, m1518paddingVpY3zN4$default);
                            Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
                            String str182 = str2;
                            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str17);
                            if (!(composer.getApplier() instanceof Applier)) {
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(composer);
                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                            String str192 = str3;
                            ComposerKt.sourceInformationMarkerStart(composer, -384672921, str192);
                            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                            shouldShowStakesStrip = BattleDetailsMapper.INSTANCE.shouldShowStakesStrip(i8, true, !z24);
                            composer.startReplaceGroup(-545912219);
                            if (shouldShowStakesStrip) {
                            }
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-545884965);
                            if (orderedBattleParticipants == null) {
                            }
                            composer.endReplaceGroup();
                            composer2.startReplaceGroup(-545810862);
                            if (battleOutcomeMessage2 == null) {
                            }
                            composer.endReplaceGroup();
                            composer2.startReplaceGroup(-545810458);
                            if (unit != null) {
                            }
                            composer.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endReplaceGroup();
                            i7 = i12;
                            function06 = function08;
                            newChallengeDetailsResponseModelP = newChallengeDetailsResponseModelP3;
                            i6 = 6;
                        }
                        z10 = true;
                        if (reorderTwoUsers == null) {
                        }
                        Integer messageResId2 = BattleBetOutcomeResolver.INSTANCE.messageResId(battleBetOutcomeResult.getScenario());
                        if (messageResId2 == null) {
                        }
                        BattleOutcomeMessage battleOutcomeMessage32 = battleOutcomeMessage;
                        NewChallengeDetailsModel challenge3 = newChallengeDetailsResponseModelP4.getChallenge();
                        if (challenge3 != null) {
                        }
                        NewChallengeDetailsModel challenge22 = newChallengeDetailsResponseModelP4.getChallenge();
                        long longValue22 = longValue + ((challenge22 != null || (enterFee = challenge22.getEnterFee()) == null) ? 0L : enterFee.longValue());
                        long j2 = 2 * longValue22;
                        if (reorderTwoUsers != null) {
                            if (placedCoefficient.doubleValue() <= 0.0d) {
                            }
                            if (placedCoefficient != null) {
                                if (!StringsKt.isBlank(str13)) {
                                }
                                str13 = null;
                            }
                        }
                        str13 = "-";
                        OddType oddType42 = oddType;
                        float f102 = 0.0f;
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        if (z) {
                        }
                        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(fillMaxWidth$default2, f102, m7774constructorimpl, 1, null);
                        Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        if (!z17) {
                        }
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = arrangement2.m1397spacedBy0680j_4(m7774constructorimpl2);
                        ComposerKt.sourceInformationMarkerStart(composer, -483455358, str);
                        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_422, centerHorizontally22, composer, 48);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str2);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap622 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(composer, m1518paddingVpY3zN4$default2);
                        Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
                        String str1822 = str2;
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str17);
                        if (!(composer.getApplier() instanceof Applier)) {
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(composer);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash622);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
                        String str1922 = str3;
                        ComposerKt.sourceInformationMarkerStart(composer, -384672921, str1922);
                        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                        shouldShowStakesStrip = BattleDetailsMapper.INSTANCE.shouldShowStakesStrip(i8, true, !z24);
                        composer.startReplaceGroup(-545912219);
                        if (shouldShowStakesStrip) {
                        }
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-545884965);
                        if (orderedBattleParticipants == null) {
                        }
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-545810862);
                        if (battleOutcomeMessage2 == null) {
                        }
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-545810458);
                        if (unit != null) {
                        }
                        composer.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endReplaceGroup();
                        i7 = i12;
                        function06 = function08;
                        newChallengeDetailsResponseModelP = newChallengeDetailsResponseModelP3;
                        i6 = 6;
                    } else {
                        str6 = str17;
                        i5 = i4;
                        str7 = str2;
                        function0 = function010;
                        z6 = z15;
                        function02 = function011;
                        function03 = function012;
                        function04 = function013;
                        z7 = z19;
                        z8 = z20;
                        function05 = function015;
                        str8 = str;
                        str9 = str3;
                        composer.startReplaceGroup(1621115879);
                        NewChallengeParticipantModel newChallengeParticipantModel2 = participantUsers.get(0);
                        if (z5) {
                            if (newChallengeBetModel != null && (bet4 = newChallengeBetModel.getBet()) != null && (betTypeGroup = bet4.getBetTypeGroup()) != null && (str10 = betTypeGroup.getName()) != null) {
                                if (Intrinsics.areEqual(str10, obj2) || StringsKt.isBlank(str10)) {
                                    str10 = null;
                                }
                            }
                            str10 = "";
                        } else {
                            str10 = "";
                        }
                        String str20 = str10;
                        composer.startReplaceGroup(-1610252247);
                        if (z5) {
                            if (newChallengeBetModel == null || (bet3 = newChallengeBetModel.getBet()) == null || (str11 = bet3.getBetName()) == null || Intrinsics.areEqual(str11, obj2) || StringsKt.isBlank(str11)) {
                                str11 = null;
                            }
                            if (str11 == null) {
                                str11 = StringResources_androidKt.stringResource(R.string.not_set, composer, 6);
                            }
                        } else {
                            str11 = stringResource;
                        }
                        composer.endReplaceGroup();
                        if (!z5 || newChallengeBetModel == null || (bet2 = newChallengeBetModel.getBet()) == null || (str12 = bet2.getBetsGameType()) == null || Intrinsics.areEqual(str12, obj2) || StringsKt.isBlank(str12)) {
                            str12 = null;
                        }
                        Double placedCoefficient2 = (!z5 || newChallengeBetModel == null || (bet = newChallengeBetModel.getBet()) == null) ? null : bet.getPlacedCoefficient();
                        Modifier m1520paddingqDBjuR0$default3 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f8), 0.0f, Dp.m7774constructorimpl(f8), 5, null);
                        String photoUrl = newChallengeParticipantModel2.getPhotoUrl();
                        String name = newChallengeParticipantModel2.getName();
                        Long valueOf2 = Long.valueOf(newChallengeParticipantModel2.getId());
                        composer.startReplaceGroup(-1746271574);
                        function06 = function014;
                        boolean changedInstance3 = composer.changedInstance(newChallengeDetailsResponseModelP4) | composer.changedInstance(mainActivity2) | composer.changed(function06);
                        Object rememberedValue4 = composer.rememberedValue();
                        if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$26$lambda$25$lambda$24$lambda$23;
                                    invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$26$lambda$25$lambda$24$lambda$23 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$26$lambda$25$lambda$24$lambda$23(NewChallengeDetailsResponseModelP.this, mainActivity2, function06);
                                    return invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$26$lambda$25$lambda$24$lambda$23;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue4);
                        }
                        composer.endReplaceGroup();
                        newChallengeDetailsResponseModelP = newChallengeDetailsResponseModelP4;
                        i6 = 6;
                        i7 = 2;
                        ChallengeAcceptScreenKt.BattleBetInfoRow(m1520paddingqDBjuR0$default3, str11, str20, str12, placedCoefficient2, photoUrl, name, oddType3, valueOf2, (Function0) rememberedValue4, composer, 6, 0);
                        composer.endReplaceGroup();
                    }
                    Unit unit10 = Unit.INSTANCE;
                    composer.endReplaceGroup();
                    Unit unit11 = Unit.INSTANCE;
                    Unit unit12 = Unit.INSTANCE;
                }
            }
            z5 = false;
            if (newChallengeBetModel2 != null) {
            }
            obj2 = obj;
            str5 = null;
            if (str5 == null) {
            }
            if (z21) {
            }
            composer.startReplaceGroup(1128674235);
            if (participantUsers.size() <= 1) {
            }
            Unit unit102 = Unit.INSTANCE;
            composer.endReplaceGroup();
            Unit unit112 = Unit.INSTANCE;
            Unit unit122 = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        float m7774constructorimpl4 = z ? Dp.m7774constructorimpl(4) : Dp.m7774constructorimpl(i6);
        float m7774constructorimpl5 = Dp.m7774constructorimpl(z ? i6 : 8);
        if (newChallengeDetailsResponseModelP == null || (participantState = newChallengeDetailsResponseModelP.getParticipantState()) == null || participantState.intValue() != 1 || (function09 = function0) == null) {
            String str21 = str8;
            final Function0<Unit> function016 = function04;
            String str22 = str6;
            String str23 = str9;
            String str24 = str7;
            if (z6) {
                composer.startReplaceGroup(644676156);
                Modifier m1520paddingqDBjuR0$default4 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(4), 0.0f, i7, null), 0.0f, m7774constructorimpl4, 0.0f, 0.0f, 13, null);
                composer.startReplaceGroup(5004770);
                final Function0<Unit> function017 = function02;
                boolean changed2 = composer.changed(function017);
                Object rememberedValue5 = composer.rememberedValue();
                if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$32$lambda$31;
                            invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$32$lambda$31 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$32$lambda$31(Function0.this);
                            return invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$32$lambda$31;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                Function0 function018 = (Function0) rememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                final Function0<Unit> function019 = function03;
                boolean changed3 = composer.changed(function019);
                Object rememberedValue6 = composer.rememberedValue();
                if (changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$34$lambda$33;
                            invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$34$lambda$33 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$34$lambda$33(Function0.this);
                            return invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$34$lambda$33;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue6);
                }
                Function0 function020 = (Function0) rememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean changed4 = composer.changed(function016);
                Object rememberedValue7 = composer.rememberedValue();
                if (changed4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$36$lambda$35;
                            invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$36$lambda$35 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$36$lambda$35(Function0.this);
                            return invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$36$lambda$35;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue7);
                }
                composer.endReplaceGroup();
                BattleResultComponentsKt.BattleResultActions(function018, function020, (Function0) rememberedValue7, m1520paddingqDBjuR0$default4, battleResultPalette, z2, i5, z, composer, 0, 0);
                composer.endReplaceGroup();
            } else if (z3) {
                composer.startReplaceGroup(645576737);
                Modifier m1520paddingqDBjuR0$default5 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(4), 0.0f, i7, null), 0.0f, m7774constructorimpl4, 0.0f, 0.0f, 13, null);
                Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_43 = Arrangement.INSTANCE.m1397spacedBy0680j_4(m7774constructorimpl5);
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, str21);
                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_43, centerHorizontally3, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str24);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer, m1520paddingqDBjuR0$default5);
                Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str22);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor7);
                } else {
                    composer.useNode();
                }
                Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384672921, str23);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                composer.startReplaceGroup(-1976889068);
                if (function016 != null) {
                    BattleResultComponentsKt.BattleHowDecidedLink(function016, null, battleResultPalette, z2, i5, z, composer, 0, 2);
                    Unit unit13 = Unit.INSTANCE;
                    Unit unit14 = Unit.INSTANCE;
                }
                composer.endReplaceGroup();
                String stringResource2 = StringResources_androidKt.stringResource(R.string.ok, composer, 6);
                composer.startReplaceGroup(5004770);
                boolean changed5 = composer.changed(function06);
                Object rememberedValue8 = composer.rememberedValue();
                if (changed5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$42$lambda$39$lambda$38;
                            invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$42$lambda$39$lambda$38 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$42$lambda$39$lambda$38(Function0.this);
                            return invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$42$lambda$39$lambda$38;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue8);
                }
                Function0 function021 = (Function0) rememberedValue8;
                composer.endReplaceGroup();
                BattleResultComponentsKt.BattleDetailsOkButton(stringResource2, battleResultPalette, function021, SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z ? Opcodes.F2L : 160)), z, composer, 0, 0);
                composer.startReplaceGroup(-1976855481);
                if (z7) {
                    String stringResource3 = StringResources_androidKt.stringResource(z8 ? R.string.battles_loading : R.string.battle_cancel, composer, 0);
                    Modifier m1520paddingqDBjuR0$default6 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(2), 0.0f, 0.0f, 13, null);
                    boolean z25 = !z8;
                    composer.startReplaceGroup(5004770);
                    final Function0<Unit> function022 = function05;
                    boolean changed6 = composer.changed(function022);
                    Object rememberedValue9 = composer.rememberedValue();
                    if (changed6 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$42$lambda$41$lambda$40;
                                invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$42$lambda$41$lambda$40 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$42$lambda$41$lambda$40(Function0.this);
                                return invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$42$lambda$41$lambda$40;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue9);
                    }
                    composer.endReplaceGroup();
                    TextKt.m2642Text4IGK_g(stringResource3, ClickableKt.m1059clickableXHw0xAI$default(m1520paddingqDBjuR0$default6, z25, null, null, (Function0) rememberedValue9, 6, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), z8 ? 0.45f : 0.75f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(z ? 11 : 12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(648767164);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion5 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str24);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer, companion5);
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str22);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor8);
                } else {
                    composer.useNode();
                }
                Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl8, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier m1568width3ABfNKs = SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(121));
                String stringResource4 = StringResources_androidKt.stringResource(R.string.ok, composer, 6);
                composer.startReplaceGroup(5004770);
                boolean changed7 = composer.changed(function06);
                Object rememberedValue10 = composer.rememberedValue();
                if (changed7 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44$lambda$43;
                            invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44$lambda$43 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44$lambda$43(Function0.this);
                            return invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44$lambda$43;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue10);
                }
                composer.endReplaceGroup();
                CommonButtonKt.m12915CommonButtonUPEs2M4(m1568width3ABfNKs, true, stringResource4, false, false, false, (Function0) rememberedValue10, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 3126, 0, 0, 2097072);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
        } else {
            composer.startReplaceGroup(643164689);
            Modifier m1520paddingqDBjuR0$default7 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(4), 0.0f, i7, null), 0.0f, m7774constructorimpl4, 0.0f, 0.0f, 13, null);
            Alignment.Horizontal centerHorizontally4 = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_44 = Arrangement.INSTANCE.m1397spacedBy0680j_4(m7774constructorimpl5);
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, str8);
            MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_44, centerHorizontally4, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str7);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer, m1520paddingqDBjuR0$default7);
            Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str6);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor9);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl9 = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl9, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
            }
            Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384672921, str9);
            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
            composer.startReplaceGroup(-641097652);
            Function0<Unit> function023 = function04;
            if (function023 != null) {
                BattleResultComponentsKt.BattleHowDecidedLink(function023, null, battleResultPalette, z2, i5, z, composer, 0, 2);
                Unit unit15 = Unit.INSTANCE;
                Unit unit16 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            String stringResource5 = StringResources_androidKt.stringResource(R.string.accept, composer, i6);
            composer.startReplaceGroup(5004770);
            boolean changed8 = composer.changed(function09);
            Object rememberedValue11 = composer.rememberedValue();
            if (changed8 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$30$lambda$29$lambda$28;
                        invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$30$lambda$29$lambda$28 = ChallengePreviewScreenKt$ChallengePreviewScreen$1$2$2.invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$30$lambda$29$lambda$28(Function0.this);
                        return invoke$lambda$49$lambda$48$lambda$47$lambda$46$lambda$30$lambda$29$lambda$28;
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            composer.endReplaceGroup();
            BattleResultComponentsKt.BattleDetailsOkButton(stringResource5, battleResultPalette, (Function0) rememberedValue11, null, z, composer, 0, 8);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.startReplaceGroup(132149250);
        if (z3) {
            BattleResultComponentsKt.BattleResultEmblemOverlay(battleResultPalette, OffsetKt.m1476offsetVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0.0f, f, 1, null), z2, i5, z, composer, 0, 0);
        }
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
