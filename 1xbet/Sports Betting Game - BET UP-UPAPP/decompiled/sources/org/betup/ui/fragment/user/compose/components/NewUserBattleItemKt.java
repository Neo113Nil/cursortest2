package org.betup.ui.fragment.user.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.ui.common.compose.MatchLeagueItemKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.items.BattleCreator;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.items.BattleUiItem;
import org.betup.ui.fragment.user.compose.UserBattleListDimens;
import org.betup.ui.fragment.user.compose.items.NewUserBattleMatch;
import org.betup.ui.fragment.user.compose.items.NewUserBattleTeam;
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.MatchUtils;
import org.betup.utils.UiExtensionsKt;

/* compiled from: NewUserBattleItem.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"NewUserBattleItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "item", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleUiItem;", "onAcceptClick", "Lkotlin/Function1;", "", "onPreviewClick", "onNavigateToLeague", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "leagueId", "", "isLive", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/fragment/user/compose/items/NewUserBattleUiItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NewUserBattleItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewUserBattleItem$lambda$12(Modifier modifier, NewUserBattleUiItem newUserBattleUiItem, Function1 function1, Function1 function12, Function2 function2, int i, int i2, Composer composer, int i3) {
        NewUserBattleItem(modifier, newUserBattleUiItem, function1, function12, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NewUserBattleItem(Modifier modifier, final NewUserBattleUiItem item, final Function1<? super Long, Unit> onAcceptClick, Function1<? super Long, Unit> function1, Function2<? super Integer, ? super Boolean, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super Long, Unit> function12;
        int i4;
        final Function2<? super Integer, ? super Boolean, Unit> function22;
        Modifier.Companion companion;
        final Function1<? super Long, Unit> function13;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final NewUserBattleMatch match;
        int i5;
        Function2<? super Integer, ? super Boolean, Unit> function23;
        Function1<? super Long, Unit> function14;
        boolean changed;
        Object rememberedValue2;
        boolean z2;
        Object rememberedValue3;
        final Function1<? super Long, Unit> function15;
        final Function2<? super Integer, ? super Boolean, Unit> function24;
        String formattedDateWithoutYear;
        String formattedTime;
        String resultRaw;
        String photoUrl;
        String name;
        Function0 function0;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAcceptClick, "onAcceptClick");
        Composer startRestartGroup = composer.startRestartGroup(325267880);
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
            i3 |= startRestartGroup.changed(item) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onAcceptClick) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    function13 = i7 != 0 ? null : function12;
                    if (i4 != 0) {
                        function22 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(325267880, i3, -1, "org.betup.ui.fragment.user.compose.components.NewUserBattleItem (NewUserBattleItem.kt:36)");
                    }
                    RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(UserBattleListDimens.INSTANCE.m14215getCardCornerRadiusD9Ej5fM());
                    Modifier background$default = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), m1810RoundedCornerShape0680j_4), UserBattleListDimens.INSTANCE.m14214getCardBorderWidthD9Ej5fM(), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_4), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_4, 0.0f, 4, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    int i8 = i3 & 7168;
                    z = (i8 == 2048) | ((i3 & 112) == 32);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit NewUserBattleItem$lambda$1$lambda$0;
                                NewUserBattleItem$lambda$1$lambda$0 = NewUserBattleItemKt.NewUserBattleItem$lambda$1$lambda$0(Function1.this, item);
                                return NewUserBattleItem$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(background$default, false, null, null, (Function0) rememberedValue, 7, null), UserBattleListDimens.INSTANCE.m14216getCardPaddingHD9Ej5fM(), UserBattleListDimens.INSTANCE.m14217getCardPaddingVD9Ej5fM());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    match = item.getMatch();
                    startRestartGroup.startReplaceGroup(691238666);
                    if (match != null) {
                        boolean isStarted = UiExtensionsKt.isStarted(match);
                        String photoUrl2 = match.getLeague().getPhotoUrl();
                        if (StringsKt.isBlank(photoUrl2)) {
                            photoUrl2 = null;
                        }
                        if (photoUrl2 == null) {
                            photoUrl2 = match.getSport().getPhotoUrl();
                        }
                        String name2 = match.getLeague().getName();
                        if (StringsKt.isBlank(name2)) {
                            name2 = null;
                        }
                        if (name2 == null) {
                            name2 = match.getSport().getName();
                        }
                        startRestartGroup.startReplaceGroup(691247447);
                        if (StringsKt.isBlank(name2)) {
                            i5 = i3;
                            function23 = function22;
                            function14 = function13;
                        } else {
                            final Integer valueOf = Integer.valueOf(match.getLeague().getId());
                            if (valueOf.intValue() <= 0) {
                                valueOf = null;
                            }
                            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, UserBattleListDimens.INSTANCE.m14236getLeagueBottomPaddingD9Ej5fM(), 7, null);
                            startRestartGroup.startReplaceGroup(691263535);
                            if (valueOf == null || function22 == null) {
                                function0 = null;
                            } else {
                                startRestartGroup.startReplaceGroup(-1746271574);
                                boolean changed2 = ((57344 & i3) == 16384) | startRestartGroup.changed(valueOf) | startRestartGroup.changed(match);
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit NewUserBattleItem$lambda$11$lambda$6$lambda$5;
                                            NewUserBattleItem$lambda$11$lambda$6$lambda$5 = NewUserBattleItemKt.NewUserBattleItem$lambda$11$lambda$6$lambda$5(Function2.this, valueOf, match);
                                            return NewUserBattleItem$lambda$11$lambda$6$lambda$5;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                function0 = (Function0) rememberedValue4;
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endReplaceGroup();
                            i5 = i3;
                            function23 = function22;
                            function14 = function13;
                            MatchLeagueItemKt.MatchLeagueItem(m1520paddingqDBjuR0$default, photoUrl2, name2, true, true, true, function0, startRestartGroup, 224262, 0);
                        }
                        startRestartGroup.endReplaceGroup();
                        NewUserBattleTeam homeTeam = match.getHomeTeam();
                        String str = (homeTeam == null || (name = homeTeam.getName()) == null) ? "" : name;
                        String name3 = match.getAwayTeam().getName();
                        NewUserBattleTeam homeTeam2 = match.getHomeTeam();
                        String str2 = (homeTeam2 == null || (photoUrl = homeTeam2.getPhotoUrl()) == null) ? "" : photoUrl;
                        String photoUrl3 = match.getAwayTeam().getPhotoUrl();
                        String valueOf2 = isStarted ? String.valueOf(match.getScoreHome()) : null;
                        String valueOf3 = isStarted ? String.valueOf(match.getScoreAway()) : null;
                        String extractPeriodScoresFromResultRaw = (!isStarted || (resultRaw = match.getResultRaw()) == null || StringsKt.isBlank(resultRaw)) ? null : MatchUtils.INSTANCE.extractPeriodScoresFromResultRaw(match.getResultRaw());
                        if (isStarted) {
                            String currentTime = match.getCurrentTime();
                            if (currentTime == null) {
                                currentTime = "";
                            }
                            formattedDateWithoutYear = UiExtensionsKt.normalizeMatchTime(currentTime);
                        } else {
                            formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(match.getDate());
                        }
                        String str3 = formattedDateWithoutYear;
                        if (isStarted) {
                            String currentPeriod = match.getCurrentPeriod();
                            formattedTime = UiExtensionsKt.normalizeMatchTime(currentPeriod != null ? currentPeriod : "");
                        } else {
                            formattedTime = UiExtensionsKt.getFormattedTime(match.getDate());
                        }
                        TeamsRowKt.m13615TeamsRowUiefj4(null, str, name3, str2, photoUrl3, valueOf2, valueOf3, extractPeriodScoresFromResultRaw, str3, formattedTime, null, false, isStarted, false, false, false, false, 0, null, null, UserBattleListDimens.INSTANCE.m14242getTeamImageSizeD9Ej5fM(), UserBattleListDimens.INSTANCE.m14244getTeamRowPaddingD9Ej5fM(), true, startRestartGroup, 0, 0, 438, 1043457);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        i5 = i3;
                        function23 = function22;
                        function14 = function13;
                        new BattleUiItem(item.getId(), item.getMoneyAccept(), item.getEnterFee(), item.getMoneyToWin(), item.getState(), new BattleCreator(item.getCreatedBy().getId(), item.getCreatedBy().getName(), item.getCreatedBy().getEmail(), item.getCreatedBy().getPhotoUrl()), null, false, 0, 448, null);
                    }
                    startRestartGroup.endReplaceGroup();
                    BattleUiItem battleUiItem = new BattleUiItem(item.getId(), item.getMoneyAccept(), item.getEnterFee(), item.getMoneyToWin(), item.getState(), new BattleCreator(item.getCreatedBy().getId(), item.getCreatedBy().getName(), item.getCreatedBy().getEmail(), item.getCreatedBy().getPhotoUrl()), item.getParticipantState(), false, 0, RendererCapabilities.DECODER_SUPPORT_MASK, null);
                    SpacerKt.Spacer(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, UserBattleListDimens.INSTANCE.m14234getDividerHorizontalInsetD9Ej5fM(), UserBattleListDimens.INSTANCE.m14235getDividerVerticalPaddingD9Ej5fM()), Dp.m7774constructorimpl(1)), 0.0f, 1, null), ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor(), null, 2, null), startRestartGroup, 0);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed = startRestartGroup.changed(match) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit NewUserBattleItem$lambda$11$lambda$8$lambda$7;
                                NewUserBattleItem$lambda$11$lambda$8$lambda$7 = NewUserBattleItemKt.NewUserBattleItem$lambda$11$lambda$8$lambda$7(NewUserBattleMatch.this, onAcceptClick, ((Long) obj).longValue());
                                return NewUserBattleItem$lambda$11$lambda$8$lambda$7;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function16 = (Function1) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    z2 = i8 == 2048;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        function15 = function14;
                        rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit NewUserBattleItem$lambda$11$lambda$10$lambda$9;
                                NewUserBattleItem$lambda$11$lambda$10$lambda$9 = NewUserBattleItemKt.NewUserBattleItem$lambda$11$lambda$10$lambda$9(Function1.this, ((Long) obj).longValue());
                                return NewUserBattleItem$lambda$11$lambda$10$lambda$9;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    } else {
                        function15 = function14;
                    }
                    startRestartGroup.endReplaceGroup();
                    BattleMatchDetItemKt.BattleMatchDetItem(fillMaxWidth$default, battleUiItem, function16, (Function1) rememberedValue3, false, true, startRestartGroup, 196614, 16);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function12 = function15;
                    function24 = function23;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    function24 = function22;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    final Function1<? super Long, Unit> function17 = function12;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit NewUserBattleItem$lambda$12;
                            NewUserBattleItem$lambda$12 = NewUserBattleItemKt.NewUserBattleItem$lambda$12(Modifier.this, item, onAcceptClick, function17, function24, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return NewUserBattleItem$lambda$12;
                        }
                    });
                    return;
                }
                return;
            }
            function22 = function2;
            if ((i3 & 9363) == 9362) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(UserBattleListDimens.INSTANCE.m14215getCardCornerRadiusD9Ej5fM());
            Modifier background$default2 = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), m1810RoundedCornerShape0680j_42), UserBattleListDimens.INSTANCE.m14214getCardBorderWidthD9Ej5fM(), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_42), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_42, 0.0f, 4, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            int i82 = i3 & 7168;
            z = (i82 == 2048) | ((i3 & 112) == 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit NewUserBattleItem$lambda$1$lambda$0;
                    NewUserBattleItem$lambda$1$lambda$0 = NewUserBattleItemKt.NewUserBattleItem$lambda$1$lambda$0(Function1.this, item);
                    return NewUserBattleItem$lambda$1$lambda$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(background$default2, false, null, null, (Function0) rememberedValue, 7, null), UserBattleListDimens.INSTANCE.m14216getCardPaddingHD9Ej5fM(), UserBattleListDimens.INSTANCE.m14217getCardPaddingVD9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            match = item.getMatch();
            startRestartGroup.startReplaceGroup(691238666);
            if (match != null) {
            }
            startRestartGroup.endReplaceGroup();
            BattleUiItem battleUiItem2 = new BattleUiItem(item.getId(), item.getMoneyAccept(), item.getEnterFee(), item.getMoneyToWin(), item.getState(), new BattleCreator(item.getCreatedBy().getId(), item.getCreatedBy().getName(), item.getCreatedBy().getEmail(), item.getCreatedBy().getPhotoUrl()), item.getParticipantState(), false, 0, RendererCapabilities.DECODER_SUPPORT_MASK, null);
            SpacerKt.Spacer(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, UserBattleListDimens.INSTANCE.m14234getDividerHorizontalInsetD9Ej5fM(), UserBattleListDimens.INSTANCE.m14235getDividerVerticalPaddingD9Ej5fM()), Dp.m7774constructorimpl(1)), 0.0f, 1, null), ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor(), null, 2, null), startRestartGroup, 0);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed = startRestartGroup.changed(match) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit NewUserBattleItem$lambda$11$lambda$8$lambda$7;
                    NewUserBattleItem$lambda$11$lambda$8$lambda$7 = NewUserBattleItemKt.NewUserBattleItem$lambda$11$lambda$8$lambda$7(NewUserBattleMatch.this, onAcceptClick, ((Long) obj).longValue());
                    return NewUserBattleItem$lambda$11$lambda$8$lambda$7;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            Function1 function162 = (Function1) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            if (i82 == 2048) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2) {
            }
            function15 = function14;
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit NewUserBattleItem$lambda$11$lambda$10$lambda$9;
                    NewUserBattleItem$lambda$11$lambda$10$lambda$9 = NewUserBattleItemKt.NewUserBattleItem$lambda$11$lambda$10$lambda$9(Function1.this, ((Long) obj).longValue());
                    return NewUserBattleItem$lambda$11$lambda$10$lambda$9;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            BattleMatchDetItemKt.BattleMatchDetItem(fillMaxWidth$default2, battleUiItem2, function162, (Function1) rememberedValue3, false, true, startRestartGroup, 196614, 16);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            function12 = function15;
            function24 = function23;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function12 = function1;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i3 & 9363) == 9362) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(UserBattleListDimens.INSTANCE.m14215getCardCornerRadiusD9Ej5fM());
        Modifier background$default22 = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), m1810RoundedCornerShape0680j_422), UserBattleListDimens.INSTANCE.m14214getCardBorderWidthD9Ej5fM(), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_422), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_422, 0.0f, 4, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        int i822 = i3 & 7168;
        z = (i822 == 2048) | ((i3 & 112) == 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit NewUserBattleItem$lambda$1$lambda$0;
                NewUserBattleItem$lambda$1$lambda$0 = NewUserBattleItemKt.NewUserBattleItem$lambda$1$lambda$0(Function1.this, item);
                return NewUserBattleItem$lambda$1$lambda$0;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(background$default22, false, null, null, (Function0) rememberedValue, 7, null), UserBattleListDimens.INSTANCE.m14216getCardPaddingHD9Ej5fM(), UserBattleListDimens.INSTANCE.m14217getCardPaddingVD9Ej5fM());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        match = item.getMatch();
        startRestartGroup.startReplaceGroup(691238666);
        if (match != null) {
        }
        startRestartGroup.endReplaceGroup();
        BattleUiItem battleUiItem22 = new BattleUiItem(item.getId(), item.getMoneyAccept(), item.getEnterFee(), item.getMoneyToWin(), item.getState(), new BattleCreator(item.getCreatedBy().getId(), item.getCreatedBy().getName(), item.getCreatedBy().getEmail(), item.getCreatedBy().getPhotoUrl()), item.getParticipantState(), false, 0, RendererCapabilities.DECODER_SUPPORT_MASK, null);
        SpacerKt.Spacer(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, UserBattleListDimens.INSTANCE.m14234getDividerHorizontalInsetD9Ej5fM(), UserBattleListDimens.INSTANCE.m14235getDividerVerticalPaddingD9Ej5fM()), Dp.m7774constructorimpl(1)), 0.0f, 1, null), ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor(), null, 2, null), startRestartGroup, 0);
        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(match) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit NewUserBattleItem$lambda$11$lambda$8$lambda$7;
                NewUserBattleItem$lambda$11$lambda$8$lambda$7 = NewUserBattleItemKt.NewUserBattleItem$lambda$11$lambda$8$lambda$7(NewUserBattleMatch.this, onAcceptClick, ((Long) obj).longValue());
                return NewUserBattleItem$lambda$11$lambda$8$lambda$7;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        Function1 function1622 = (Function1) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        if (i822 == 2048) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (z2) {
        }
        function15 = function14;
        rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit NewUserBattleItem$lambda$11$lambda$10$lambda$9;
                NewUserBattleItem$lambda$11$lambda$10$lambda$9 = NewUserBattleItemKt.NewUserBattleItem$lambda$11$lambda$10$lambda$9(Function1.this, ((Long) obj).longValue());
                return NewUserBattleItem$lambda$11$lambda$10$lambda$9;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        BattleMatchDetItemKt.BattleMatchDetItem(fillMaxWidth$default22, battleUiItem22, function1622, (Function1) rememberedValue3, false, true, startRestartGroup, 196614, 16);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function12 = function15;
        function24 = function23;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewUserBattleItem$lambda$1$lambda$0(Function1 function1, NewUserBattleUiItem newUserBattleUiItem) {
        if (function1 != null) {
            function1.invoke(Long.valueOf(newUserBattleUiItem.getId()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewUserBattleItem$lambda$11$lambda$6$lambda$5(Function2 function2, Integer num, NewUserBattleMatch newUserBattleMatch) {
        function2.invoke(num, Boolean.valueOf(UiExtensionsKt.isLive(newUserBattleMatch)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewUserBattleItem$lambda$11$lambda$8$lambda$7(NewUserBattleMatch newUserBattleMatch, Function1 function1, long j) {
        if (newUserBattleMatch != null) {
            function1.invoke(Long.valueOf(j));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewUserBattleItem$lambda$11$lambda$10$lambda$9(Function1 function1, long j) {
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
        return Unit.INSTANCE;
    }
}
