package org.betup.ui.fragment.user.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
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
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.country.NewCountryModel;
import org.betup.model.remote.entity.matches.championship.specific.NewTeamModel;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.model.remote.entity.user.NewLeagueSimple;
import org.betup.model.remote.entity.user.NewUserAchievementsModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserFavouritesModel;
import org.betup.model.remote.entity.user.NewUserRankingItemModel;
import org.betup.model.remote.entity.user.profile.CompetitionStatsResponse;
import org.betup.model.remote.entity.user.profile.QuizStatsResponse;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.betup.ui.fragment.matches.compose.SportsListKt;
import org.betup.ui.fragment.user.ForeignUserDetailsController;
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.OddHelper;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: UserProfileComponents.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a/\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0013\u001a\u00020\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u001b\u001a\u008d\u0001\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\b\u0010%\u001a\u0004\u0018\u00010&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010*\u001a\u00020\u00182\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0001\u0018\u00010(H\u0007¢\u0006\u0002\u0010-\u001a\u0010\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020&H\u0002\u001aI\u00100\u001a\u00020\u00012\u0006\u0010/\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010(2\u0006\u0010*\u001a\u00020\u00182\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0001\u0018\u00010(H\u0007¢\u0006\u0002\u00101\u001aK\u00102\u001a\u00020\u00012\f\u00103\u001a\b\u0012\u0004\u0012\u0002040#2\u0006\u00105\u001a\u00020\u000b2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010(2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010(H\u0007¢\u0006\u0002\u00108\u001a1\u00109\u001a\u00020\u00012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020<H\u0007¢\u0006\u0004\b>\u0010?\u001a)\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020B2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010(H\u0003¢\u0006\u0002\u0010C¨\u0006D²\u0006\f\u0010E\u001a\u0004\u0018\u00010FX\u008a\u0084\u0002²\u0006\f\u0010G\u001a\u0004\u0018\u00010HX\u008a\u0084\u0002²\u0006\n\u0010I\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u00105\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010J\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010K\u001a\u00020\u000bX\u008a\u008e\u0002"}, d2 = {"UserStatsContent", "", "userStats", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "userDetailsController", "Lorg/betup/ui/fragment/user/UserDetailsController;", "oddType", "Lorg/betup/model/local/entity/OddType;", "(Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;Lorg/betup/ui/fragment/user/UserDetailsController;Lorg/betup/model/local/entity/OddType;Landroidx/compose/runtime/Composer;II)V", "UserStatsRow", X3.i.H0, "", "label", "", "value", "valueColor", "Landroidx/compose/ui/graphics/Color;", "UserStatsRow-Bx497Mc", "(ILjava/lang/String;Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V", "UserBattlesContent", "controller", "foreignUserDetailsController", "Lorg/betup/ui/fragment/user/ForeignUserDetailsController;", "isForeignUser", "", "(Lorg/betup/ui/fragment/user/UserDetailsController;Lorg/betup/ui/fragment/user/ForeignUserDetailsController;ZLandroidx/compose/runtime/Composer;II)V", "ForeignUserBattlesContent", "(Lorg/betup/ui/fragment/user/ForeignUserDetailsController;Landroidx/compose/runtime/Composer;I)V", "UserAboutContent", "referralCode", "onClickVk", "Lkotlin/Function0;", "onClickFb", "onClickShare", "userAchievements", "", "Lorg/betup/model/remote/entity/user/NewUserAchievementsModel;", "newUserFavourites", "Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;", "onGoToMatches", "Lkotlin/Function1;", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "isAnotherUser", "onTeamClick", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "hasFavorites", "favourites", "FavouritesSection", "(Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "UserRankingContent", "tabTitles", "Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "selectedTab", "onTabSelected", "onUserClick", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "UserAchievementsCarousel", "achievements", "itemSizeDp", "Landroidx/compose/ui/unit/Dp;", "itemSpacingDp", "UserAchievementsCarousel-WMci_g0", "(Ljava/util/List;FFLandroidx/compose/runtime/Composer;II)V", "RankingListItemProfile", "item", "Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;", "(Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "competitionStats", "Lorg/betup/model/remote/entity/user/profile/CompetitionStatsResponse;", "quizStats", "Lorg/betup/model/remote/entity/user/profile/QuizStatsResponse;", "isCopied", "isFavoritesSectionVisible", "startIndex"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserProfileComponentsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$61(NewUserFavouritesModel newUserFavouritesModel, Function1 function1, boolean z, Function1 function12, int i, int i2, Composer composer, int i3) {
        FavouritesSection(newUserFavouritesModel, function1, z, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ForeignUserBattlesContent$lambda$14(ForeignUserDetailsController foreignUserDetailsController, int i, Composer composer, int i2) {
        ForeignUserBattlesContent(foreignUserDetailsController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RankingListItemProfile$lambda$73(NewUserRankingItemModel newUserRankingItemModel, Function1 function1, int i, Composer composer, int i2) {
        RankingListItemProfile(newUserRankingItemModel, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserAboutContent$lambda$21(String str, Function0 function0, Function0 function02, Function0 function03, List list, NewUserFavouritesModel newUserFavouritesModel, Function1 function1, boolean z, Function1 function12, int i, int i2, Composer composer, int i3) {
        UserAboutContent(str, function0, function02, function03, list, newUserFavouritesModel, function1, z, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserAchievementsCarousel_WMci_g0$lambda$66(List list, float f, float f2, int i, int i2, Composer composer, int i3) {
        m14271UserAchievementsCarouselWMci_g0(list, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserBattlesContent$lambda$10(UserDetailsController userDetailsController, ForeignUserDetailsController foreignUserDetailsController, boolean z, int i, int i2, Composer composer, int i3) {
        UserBattlesContent(userDetailsController, foreignUserDetailsController, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserRankingContent$lambda$62(List list, int i, Function1 function1, Function1 function12, int i2, Composer composer, int i3) {
        UserRankingContent(list, i, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserRankingContent$lambda$65(List list, int i, Function1 function1, Function1 function12, int i2, Composer composer, int i3) {
        UserRankingContent(list, i, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserStatsContent$lambda$6(NewUserBetStatisticsModel newUserBetStatisticsModel, UserDetailsController userDetailsController, OddType oddType, int i, int i2, Composer composer, int i3) {
        UserStatsContent(newUserBetStatisticsModel, userDetailsController, oddType, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserStatsRow_Bx497Mc$lambda$9(int i, String str, String str2, long j, int i2, Composer composer, int i3) {
        m14272UserStatsRowBx497Mc(i, str, str2, j, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserStatsContent(final NewUserBetStatisticsModel newUserBetStatisticsModel, UserDetailsController userDetailsController, OddType oddType, Composer composer, final int i, final int i2) {
        int i3;
        UserDetailsController userDetailsController2;
        int i4;
        UserDetailsController userDetailsController3;
        final OddType oddType2;
        final MutableState collectAsState;
        final MutableState collectAsState2;
        boolean changed;
        Object rememberedValue;
        final OddType oddType3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-798860842);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(newUserBetStatisticsModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            userDetailsController2 = userDetailsController;
            i3 |= startRestartGroup.changedInstance(userDetailsController2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 256 : 128;
            }
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                userDetailsController3 = i5 == 0 ? null : userDetailsController2;
                oddType2 = i4 == 0 ? OddType.DECIMAL : oddType;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-798860842, i3, -1, "org.betup.ui.fragment.user.compose.UserStatsContent (UserProfileComponents.kt:85)");
                }
                StateFlow<CompetitionStatsResponse> competitionStats = userDetailsController3 == null ? userDetailsController3.getCompetitionStats() : null;
                startRestartGroup.startReplaceGroup(1093885606);
                collectAsState = competitionStats != null ? null : SnapshotStateKt.collectAsState(competitionStats, null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1093884470);
                if (collectAsState == null) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    collectAsState = (MutableState) rememberedValue2;
                }
                startRestartGroup.endReplaceGroup();
                StateFlow<QuizStatsResponse> quizStats = userDetailsController3 == null ? userDetailsController3.getQuizStats() : null;
                startRestartGroup.startReplaceGroup(1093892230);
                collectAsState2 = quizStats != null ? null : SnapshotStateKt.collectAsState(quizStats, null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1093891304);
                if (collectAsState2 == null) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    collectAsState2 = (MutableState) rememberedValue3;
                }
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues m1513PaddingValuesa9UjIt4$default = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(16), 7, null);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed = ((i3 & 14) != 4) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit UserStatsContent$lambda$5$lambda$4;
                            UserStatsContent$lambda$5$lambda$4 = UserProfileComponentsKt.UserStatsContent$lambda$5$lambda$4(NewUserBetStatisticsModel.this, oddType2, collectAsState, collectAsState2, (LazyListScope) obj);
                            return UserStatsContent$lambda$5$lambda$4;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                OddType oddType4 = oddType2;
                LazyDslKt.LazyColumn(fillMaxSize$default, null, m1513PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 390, 506);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                oddType3 = oddType4;
            } else {
                startRestartGroup.skipToGroupEnd();
                oddType3 = oddType;
                userDetailsController3 = userDetailsController2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final UserDetailsController userDetailsController4 = userDetailsController3;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit UserStatsContent$lambda$6;
                        UserStatsContent$lambda$6 = UserProfileComponentsKt.UserStatsContent$lambda$6(NewUserBetStatisticsModel.this, userDetailsController4, oddType3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return UserStatsContent$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        userDetailsController2 = userDetailsController;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i5 == 0) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (userDetailsController3 == null) {
        }
        startRestartGroup.startReplaceGroup(1093885606);
        if (competitionStats != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1093884470);
        if (collectAsState == null) {
        }
        startRestartGroup.endReplaceGroup();
        if (userDetailsController3 == null) {
        }
        startRestartGroup.startReplaceGroup(1093892230);
        if (quizStats != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1093891304);
        if (collectAsState2 == null) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        PaddingValues m1513PaddingValuesa9UjIt4$default2 = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(16), 7, null);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed = ((i3 & 14) != 4) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit UserStatsContent$lambda$5$lambda$4;
                UserStatsContent$lambda$5$lambda$4 = UserProfileComponentsKt.UserStatsContent$lambda$5$lambda$4(NewUserBetStatisticsModel.this, oddType2, collectAsState, collectAsState2, (LazyListScope) obj);
                return UserStatsContent$lambda$5$lambda$4;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        OddType oddType42 = oddType2;
        LazyDslKt.LazyColumn(fillMaxSize$default2, null, m1513PaddingValuesa9UjIt4$default2, false, null, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 390, 506);
        if (ComposerKt.isTraceInProgress()) {
        }
        oddType3 = oddType42;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserStatsContent$lambda$5$lambda$4(final NewUserBetStatisticsModel newUserBetStatisticsModel, final OddType oddType, final State state, final State state2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1057531231, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserStatsContent$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                CompetitionStatsResponse UserStatsContent$lambda$1;
                QuizStatsResponse UserStatsContent$lambda$3;
                String mostProfitableBet;
                String mostPopularBet;
                String l;
                String format;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1057531231, i, -1, "org.betup.ui.fragment.user.compose.UserStatsContent.<anonymous>.<anonymous>.<anonymous> (UserProfileComponents.kt:99)");
                }
                Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(Modifier.INSTANCE, ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
                NewUserBetStatisticsModel newUserBetStatisticsModel2 = NewUserBetStatisticsModel.this;
                OddType oddType2 = oddType;
                State<CompetitionStatsResponse> state3 = state;
                State<QuizStatsResponse> state4 = state2;
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1024backgroundbw27NRU);
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
                Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f = 14;
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f), 0.0f, 8, null);
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1520paddingqDBjuR0$default);
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
                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                UserCompetitionsSectionKt.UserCompetitionsSection(newUserBetStatisticsModel2 != null ? newUserBetStatisticsModel2.getWon() : 0, newUserBetStatisticsModel2 != null ? newUserBetStatisticsModel2.getLost() : 0, newUserBetStatisticsModel2 != null ? newUserBetStatisticsModel2.getBetWinningStreak() : 0, composer, 0);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), composer, 6);
                UserProfileComponentsKt.m14272UserStatsRowBx497Mc(R.drawable.kubik_ig_gold, StringResources_androidKt.stringResource(R.string.maximum_winning_odds, composer, 6), (newUserBetStatisticsModel2 == null || (format = OddHelper.format(oddType2, newUserBetStatisticsModel2.getMaxWinningOdds())) == null) ? "0" : format, ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), composer, 6);
                UserProfileComponentsKt.m14272UserStatsRowBx497Mc(R.drawable.balance_ic_gold, StringResources_androidKt.stringResource(R.string.average_bet_amount, composer, 6), (newUserBetStatisticsModel2 == null || (l = Long.valueOf(newUserBetStatisticsModel2.getAverageBetAmount()).toString()) == null) ? "0" : l, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), composer, 6);
                UserProfileComponentsKt.m14272UserStatsRowBx497Mc(R.drawable.fire_ic_gold, StringResources_androidKt.stringResource(R.string.most_popular_bet, composer, 6), (newUserBetStatisticsModel2 == null || (mostPopularBet = newUserBetStatisticsModel2.getMostPopularBet()) == null) ? "0" : mostPopularBet, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), composer, 6);
                UserProfileComponentsKt.m14272UserStatsRowBx497Mc(R.drawable.bets_all, StringResources_androidKt.stringResource(R.string.most_profitable_bet, composer, 6), (newUserBetStatisticsModel2 == null || (mostProfitableBet = newUserBetStatisticsModel2.getMostProfitableBet()) == null) ? "0" : mostProfitableBet, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), composer, 6);
                Modifier.Companion companion = Modifier.INSTANCE;
                UserStatsContent$lambda$1 = UserProfileComponentsKt.UserStatsContent$lambda$1(state3);
                UserStatsContent$lambda$3 = UserProfileComponentsKt.UserStatsContent$lambda$3(state4);
                UserProfileBottomInfoKt.UserProfileBottomInfo(companion, UserStatsContent$lambda$1, UserStatsContent$lambda$3, composer, 6);
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
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: UserStatsRow-Bx497Mc, reason: not valid java name */
    public static final void m14272UserStatsRowBx497Mc(final int i, final String label, final String value, final long j, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer startRestartGroup = composer.startRestartGroup(-1059493479);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(label) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(value) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        int i4 = i3;
        if ((i4 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1059493479, i4, -1, "org.betup.ui.fragment.user.compose.UserStatsRow (UserProfileComponents.kt:170)");
            }
            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(4), 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, i4 & 14), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(label, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i4 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(value, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, (i4 >> 6) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UserStatsRow_Bx497Mc$lambda$9;
                    UserStatsRow_Bx497Mc$lambda$9 = UserProfileComponentsKt.UserStatsRow_Bx497Mc$lambda$9(i, label, value, j, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return UserStatsRow_Bx497Mc$lambda$9;
                }
            });
        }
    }

    public static final void UserBattlesContent(UserDetailsController userDetailsController, ForeignUserDetailsController foreignUserDetailsController, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-698294964);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(userDetailsController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(foreignUserDetailsController) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                userDetailsController = null;
            }
            if (i5 != 0) {
                foreignUserDetailsController = null;
            }
            if (i6 != 0) {
                z = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-698294964, i3, -1, "org.betup.ui.fragment.user.compose.UserBattlesContent (UserProfileComponents.kt:214)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(1916556527);
                if (foreignUserDetailsController != null) {
                    ForeignUserBattlesContent(foreignUserDetailsController, startRestartGroup, (i3 >> 3) & 14);
                }
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1916725043);
                UserBattlesContentWithTabsKt.UserBattlesContentWithTabs(userDetailsController, startRestartGroup, i3 & 14, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final UserDetailsController userDetailsController2 = userDetailsController;
        final ForeignUserDetailsController foreignUserDetailsController2 = foreignUserDetailsController;
        final boolean z2 = z;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UserBattlesContent$lambda$10;
                    UserBattlesContent$lambda$10 = UserProfileComponentsKt.UserBattlesContent$lambda$10(UserDetailsController.this, foreignUserDetailsController2, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return UserBattlesContent$lambda$10;
                }
            });
        }
    }

    public static final void ForeignUserBattlesContent(final ForeignUserDetailsController controller, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(889606111);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(889606111, i2, -1, "org.betup.ui.fragment.user.compose.ForeignUserBattlesContent (UserProfileComponents.kt:230)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(36), 1, null), 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
            String str = StringResources_androidKt.stringResource(R.string.battle, startRestartGroup, 6) + "!";
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(controller);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ForeignUserBattlesContent$lambda$13$lambda$12$lambda$11;
                        ForeignUserBattlesContent$lambda$13$lambda$12$lambda$11 = UserProfileComponentsKt.ForeignUserBattlesContent$lambda$13$lambda$12$lambda$11(ForeignUserDetailsController.this);
                        return ForeignUserBattlesContent$lambda$13$lambda$12$lambda$11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, true, str, false, false, true, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 199728, 0, 0, 2097041);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ForeignUserBattlesContent$lambda$14;
                    ForeignUserBattlesContent$lambda$14 = UserProfileComponentsKt.ForeignUserBattlesContent$lambda$14(ForeignUserDetailsController.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ForeignUserBattlesContent$lambda$14;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ForeignUserBattlesContent$lambda$13$lambda$12$lambda$11(ForeignUserDetailsController foreignUserDetailsController) {
        foreignUserDetailsController.battleWithThisUser();
        return Unit.INSTANCE;
    }

    public static final void UserAboutContent(final String referralCode, final Function0<Unit> onClickVk, final Function0<Unit> onClickFb, final Function0<Unit> onClickShare, final List<NewUserAchievementsModel> userAchievements, final NewUserFavouritesModel newUserFavouritesModel, final Function1<? super FavouriteTypeK, Unit> onGoToMatches, boolean z, Function1<? super Long, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Object obj;
        Composer composer2;
        final boolean z3;
        final Function1<? super Long, Unit> function12;
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        Intrinsics.checkNotNullParameter(onClickVk, "onClickVk");
        Intrinsics.checkNotNullParameter(onClickFb, "onClickFb");
        Intrinsics.checkNotNullParameter(onClickShare, "onClickShare");
        Intrinsics.checkNotNullParameter(userAchievements, "userAchievements");
        Intrinsics.checkNotNullParameter(onGoToMatches, "onGoToMatches");
        Composer startRestartGroup = composer.startRestartGroup(-585458837);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(referralCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onClickVk) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onClickFb) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onClickShare) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(userAchievements) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(newUserFavouritesModel) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(onGoToMatches) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
            }
        }
        int i5 = i2 & 256;
        if (i5 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
        }
        if ((i3 & 38347923) != 38347922 || !startRestartGroup.getSkipping()) {
            boolean z4 = i4 != 0 ? false : z2;
            Function1<? super Long, Unit> function13 = i5 != 0 ? null : function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-585458837, i3, -1, "org.betup.ui.fragment.user.compose.UserAboutContent (UserProfileComponents.kt:265)");
            }
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj = null;
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                obj = null;
            }
            final MutableState mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changedInstance = ((29360128 & i3) == 8388608) | ((i3 & 112) == 32) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(context) | ((i3 & 14) == 4) | startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(userAchievements) | startRestartGroup.changedInstance(newUserFavouritesModel) | ((3670016 & i3) == 1048576) | ((i3 & 234881024) == 67108864);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                final boolean z5 = z4;
                composer2 = startRestartGroup;
                final Function1<? super Long, Unit> function14 = function13;
                Function1 function15 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit UserAboutContent$lambda$20$lambda$19$lambda$18;
                        UserAboutContent$lambda$20$lambda$19$lambda$18 = UserProfileComponentsKt.UserAboutContent$lambda$20$lambda$19$lambda$18(z5, newUserFavouritesModel, onClickVk, onClickFb, onClickShare, context, referralCode, coroutineScope, mutableState, userAchievements, onGoToMatches, function14, (LazyListScope) obj2);
                        return UserAboutContent$lambda$20$lambda$19$lambda$18;
                    }
                };
                composer2.updateRememberedValue(function15);
                rememberedValue3 = function15;
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(fillMaxWidth$default, rememberLazyListStateWithoutSavedState, null, false, null, centerHorizontally, null, false, null, (Function1) rememberedValue3, composer2, 196614, 476);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z4;
            function12 = function13;
        } else {
            startRestartGroup.skipToGroupEnd();
            function12 = function1;
            z3 = z2;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit UserAboutContent$lambda$21;
                    UserAboutContent$lambda$21 = UserProfileComponentsKt.UserAboutContent$lambda$21(referralCode, onClickVk, onClickFb, onClickShare, userAchievements, newUserFavouritesModel, onGoToMatches, z3, function12, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    return UserAboutContent$lambda$21;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserAboutContent$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserAboutContent$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserAboutContent$lambda$20$lambda$19$lambda$18(final boolean z, final NewUserFavouritesModel newUserFavouritesModel, Function0 function0, Function0 function02, Function0 function03, Context context, String str, CoroutineScope coroutineScope, MutableState mutableState, final List list, final Function1 function1, final Function1 function12, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (!z) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2003570721, true, new UserProfileComponentsKt$UserAboutContent$1$1$1$1(function0, function02, function03, context, str, coroutineScope, mutableState)), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserProfileComponentsKt.INSTANCE.getLambda$161923864$app_release(), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1650064454, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserAboutContent$1$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1650064454, i, -1, "org.betup.ui.fragment.user.compose.UserAboutContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserProfileComponents.kt:377)");
                }
                float f = 4;
                Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                List<NewUserAchievementsModel> list2 = list;
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1024backgroundbw27NRU);
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
                Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f2 = 20;
                Modifier m1024backgroundbw27NRU2 = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f2), 1, null), 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1024backgroundbw27NRU2);
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
                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.drawer_achievements, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer, 6);
                UserProfileComponentsKt.m14271UserAchievementsCarouselWMci_g0(list2, 0.0f, 0.0f, composer, 0, 6);
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
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        if (newUserFavouritesModel != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1467010792, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserAboutContent$1$1$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1467010792, i, -1, "org.betup.ui.fragment.user.compose.UserAboutContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserProfileComponents.kt:415)");
                    }
                    float f = 4;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer, 6);
                    Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                    NewUserFavouritesModel newUserFavouritesModel2 = NewUserFavouritesModel.this;
                    Function1<FavouriteTypeK, Unit> function13 = function1;
                    boolean z2 = z;
                    Function1<Long, Unit> function14 = function12;
                    ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1024backgroundbw27NRU);
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
                    Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    UserProfileComponentsKt.FavouritesSection(newUserFavouritesModel2, function13, z2, function14, composer, 0, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    private static final boolean hasFavorites(NewUserFavouritesModel newUserFavouritesModel) {
        return (newUserFavouritesModel.getFavouriteSports().isEmpty() && newUserFavouritesModel.getFavouriteLeagues().isEmpty() && newUserFavouritesModel.getFavouriteTeams().isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x09b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FavouritesSection(final NewUserFavouritesModel favourites, final Function1<? super FavouriteTypeK, Unit> onGoToMatches, final boolean z, Function1<? super Long, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Long, Unit> function12;
        int i4;
        Object rememberedValue;
        final MutableIntState mutableIntState;
        Object rememberedValue2;
        final MutableState mutableState;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        BoxScopeInstance boxScopeInstance;
        boolean changedInstance;
        Object rememberedValue3;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        boolean changed;
        Object rememberedValue4;
        int FavouritesSection$lambda$23;
        Function1<? super Long, Unit> function13;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        Object rememberedValue5;
        int i7;
        final Function1<? super Long, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(favourites, "favourites");
        Intrinsics.checkNotNullParameter(onGoToMatches, "onGoToMatches");
        Composer startRestartGroup = composer.startRestartGroup(828931436);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(favourites) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onGoToMatches) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            i4 = i3;
            if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Function1<? super Long, Unit> function15 = i8 == 0 ? null : function12;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(828931436, i4, -1, "org.betup.ui.fragment.user.compose.FavouritesSection (UserProfileComponents.kt:452)");
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableIntState = (MutableIntState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localView);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final View view = (View) consume;
                Function1<? super Long, Unit> function16 = function15;
                final List listOf = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R.string.favourite_sports, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.favourite_leagues, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.favourite_teams, startRestartGroup, 6)});
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f = 16;
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4))), 0.0f, Dp.m7774constructorimpl(f), 1, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = startRestartGroup.changedInstance(view);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit FavouritesSection$lambda$60$lambda$30$lambda$29;
                            FavouritesSection$lambda$60$lambda$30$lambda$29 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$30$lambda$29(view, mutableState, (LayoutCoordinates) obj);
                            return FavouritesSection$lambda$60$lambda$30$lambda$29;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(m1518paddingVpY3zN4$default, (Function1) rememberedValue3);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
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
                float f2 = 12;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                PaddingValues m1511PaddingValuesYgX7TsA$default = PaddingKt.m1511PaddingValuesYgX7TsA$default(Dp.m7774constructorimpl(f), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVertical = m1397spacedBy0680j_4;
                startRestartGroup.startReplaceGroup(-1633490746);
                changed = startRestartGroup.changed(listOf);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit FavouritesSection$lambda$60$lambda$57$lambda$32$lambda$31;
                            FavouritesSection$lambda$60$lambda$57$lambda$32$lambda$31 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$57$lambda$32$lambda$31(listOf, mutableIntState, (LazyListScope) obj);
                            return FavouritesSection$lambda$60$lambda$57$lambda$32$lambda$31;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                Function1<? super Long, Unit> function17 = function16;
                int i9 = i4;
                LazyDslKt.LazyRow(fillMaxWidth$default, null, m1511PaddingValuesYgX7TsA$default, false, horizontalOrVertical, null, null, false, null, (Function1) rememberedValue4, startRestartGroup, 24966, 490);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                FavouritesSection$lambda$23 = FavouritesSection$lambda$23(mutableIntState);
                int i10 = 60;
                if (FavouritesSection$lambda$23 == 0) {
                    boolean z5 = true;
                    if (FavouritesSection$lambda$23 == 1) {
                        z2 = true;
                        function13 = function17;
                        i5 = i9;
                        startRestartGroup.startReplaceGroup(774272648);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(1334113840);
                        if (!favourites.getFavouriteLeagues().isEmpty()) {
                            for (NewLeagueSimple newLeagueSimple : favourites.getFavouriteLeagues()) {
                                int id = newLeagueSimple.getId();
                                String name = newLeagueSimple.getName();
                                String str = name == null ? "" : name;
                                String photoUrl = newLeagueSimple.getPhotoUrl();
                                String str2 = photoUrl == null ? "" : photoUrl;
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit unit;
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                }
                                startRestartGroup.endReplaceGroup();
                                SportListItemUiModel sportListItemUiModel = new SportListItemUiModel(id, str, str2, 0, 0, true, (Function0) rememberedValue6);
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue7 = startRestartGroup.rememberedValue();
                                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit FavouritesSection$lambda$60$lambda$57$lambda$48$lambda$47$lambda$44$lambda$43;
                                            FavouritesSection$lambda$60$lambda$57$lambda$48$lambda$47$lambda$44$lambda$43 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$57$lambda$48$lambda$47$lambda$44$lambda$43((SportListItemUiModel) obj);
                                            return FavouritesSection$lambda$60$lambda$57$lambda$48$lambda$47$lambda$44$lambda$43;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                }
                                Function1 function18 = (Function1) rememberedValue7;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue8 = startRestartGroup.rememberedValue();
                                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue8 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit FavouritesSection$lambda$60$lambda$57$lambda$48$lambda$47$lambda$46$lambda$45;
                                            FavouritesSection$lambda$60$lambda$57$lambda$48$lambda$47$lambda$46$lambda$45 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$57$lambda$48$lambda$47$lambda$46$lambda$45((SportListItemUiModel) obj);
                                            return FavouritesSection$lambda$60$lambda$57$lambda$48$lambda$47$lambda$46$lambda$45;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue8);
                                }
                                startRestartGroup.endReplaceGroup();
                                SportsListKt.SportItem(sportListItemUiModel, function18, (Function1) rememberedValue8, null, null, null, null, false, null, null, null, false, startRestartGroup, 432, 0, 4088);
                                i10 = i10;
                            }
                        }
                        startRestartGroup.endReplaceGroup();
                        i7 = 6;
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(i10)), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                    } else if (FavouritesSection$lambda$23 == 2) {
                        startRestartGroup.startReplaceGroup(775385703);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                        Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(1412234962);
                        if (!favourites.getFavouriteTeams().isEmpty()) {
                            for (final NewTeamModel newTeamModel : favourites.getFavouriteTeams()) {
                                int id2 = newTeamModel.getId();
                                String name2 = newTeamModel.getName();
                                String str3 = name2 == null ? "" : name2;
                                String photoUrl2 = newTeamModel.getPhotoUrl();
                                String str4 = photoUrl2 == null ? "" : photoUrl2;
                                startRestartGroup.startReplaceGroup(-1633490746);
                                int i11 = i9;
                                boolean changed2 = startRestartGroup.changed(newTeamModel) | ((i11 & 7168) == 2048 ? z5 : false);
                                Object rememberedValue9 = startRestartGroup.rememberedValue();
                                if (changed2 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    function14 = function17;
                                    rememberedValue9 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$50$lambda$49;
                                            FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$50$lambda$49 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$50$lambda$49(Function1.this, newTeamModel);
                                            return FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$50$lambda$49;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue9);
                                } else {
                                    function14 = function17;
                                }
                                startRestartGroup.endReplaceGroup();
                                SportListItemUiModel sportListItemUiModel2 = new SportListItemUiModel(id2, str3, str4, 0, 0, true, (Function0) rememberedValue9);
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue10 = startRestartGroup.rememberedValue();
                                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue10 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$52$lambda$51;
                                            FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$52$lambda$51 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$52$lambda$51((SportListItemUiModel) obj);
                                            return FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$52$lambda$51;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue10);
                                }
                                Function1 function19 = (Function1) rememberedValue10;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue11 = startRestartGroup.rememberedValue();
                                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue11 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53;
                                            FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53((SportListItemUiModel) obj);
                                            return FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue11);
                                }
                                startRestartGroup.endReplaceGroup();
                                SportsListKt.SportItem(sportListItemUiModel2, function19, (Function1) rememberedValue11, null, null, null, null, false, null, null, null, false, startRestartGroup, 432, 0, 4088);
                                i10 = i10;
                                i9 = i11;
                                z5 = z5;
                                function17 = function14;
                            }
                        }
                        z2 = z5;
                        function13 = function17;
                        i5 = i9;
                        startRestartGroup.endReplaceGroup();
                        i7 = 6;
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(i10)), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        startRestartGroup.startReplaceGroup(776486482);
                        startRestartGroup.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                        z2 = true;
                        i6 = 6;
                        function13 = function17;
                        i5 = i9;
                        z3 = false;
                    }
                    i6 = i7;
                    z3 = false;
                } else {
                    function13 = function17;
                    i5 = i9;
                    z2 = true;
                    startRestartGroup.startReplaceGroup(773162538);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    boolean z6 = false;
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
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
                    Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(2066114167);
                    if (!favourites.getFavouriteSports().isEmpty()) {
                        for (NewSport newSport : favourites.getFavouriteSports()) {
                            int id3 = newSport.getId();
                            String name3 = newSport.getName();
                            String str5 = name3 == null ? "" : name3;
                            String photoUrl3 = newSport.getPhotoUrl();
                            String str6 = photoUrl3 == null ? "" : photoUrl3;
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue12 = startRestartGroup.rememberedValue();
                            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue12 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit unit4;
                                        unit4 = Unit.INSTANCE;
                                        return unit4;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue12);
                            }
                            startRestartGroup.endReplaceGroup();
                            SportListItemUiModel sportListItemUiModel3 = new SportListItemUiModel(id3, str5, str6, 0, 0, true, (Function0) rememberedValue12);
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue13 = startRestartGroup.rememberedValue();
                            if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue13 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit FavouritesSection$lambda$60$lambda$57$lambda$40$lambda$39$lambda$36$lambda$35;
                                        FavouritesSection$lambda$60$lambda$57$lambda$40$lambda$39$lambda$36$lambda$35 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$57$lambda$40$lambda$39$lambda$36$lambda$35((SportListItemUiModel) obj);
                                        return FavouritesSection$lambda$60$lambda$57$lambda$40$lambda$39$lambda$36$lambda$35;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue13);
                            }
                            Function1 function110 = (Function1) rememberedValue13;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue14 = startRestartGroup.rememberedValue();
                            if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue14 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit FavouritesSection$lambda$60$lambda$57$lambda$40$lambda$39$lambda$38$lambda$37;
                                        FavouritesSection$lambda$60$lambda$57$lambda$40$lambda$39$lambda$38$lambda$37 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$57$lambda$40$lambda$39$lambda$38$lambda$37((SportListItemUiModel) obj);
                                        return FavouritesSection$lambda$60$lambda$57$lambda$40$lambda$39$lambda$38$lambda$37;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue14);
                            }
                            startRestartGroup.endReplaceGroup();
                            SportsListKt.SportItem(sportListItemUiModel3, function110, (Function1) rememberedValue14, null, null, null, null, false, null, null, null, false, startRestartGroup, 432, 0, 4088);
                            i10 = i10;
                            z6 = z6;
                        }
                    }
                    z3 = z6;
                    startRestartGroup.endReplaceGroup();
                    i6 = 6;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(i10)), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                    Unit unit4 = Unit.INSTANCE;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(310873036);
                if (FavouritesSection$lambda$26(mutableState) && hasFavorites(favourites) && !z) {
                    String stringResource = StringResources_androidKt.stringResource(R.string.edit, startRestartGroup, i6);
                    float f3 = 32;
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomEnd()), 0.0f, 0.0f, Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f3), 3, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    z4 = (i5 & 112) != 32 ? z2 : z3;
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!z4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit FavouritesSection$lambda$60$lambda$59$lambda$58;
                                FavouritesSection$lambda$60$lambda$59$lambda$58 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$59$lambda$58(Function1.this, mutableIntState);
                                return FavouritesSection$lambda$60$lambda$59$lambda$58;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    CommonButtonKt.m12915CommonButtonUPEs2M4(m1520paddingqDBjuR0$default, false, stringResource, false, false, false, (Function0) rememberedValue5, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 0, 0, 0, 2097082);
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
                function12 = function13;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Function1<? super Long, Unit> function111 = function12;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FavouritesSection$lambda$61;
                        FavouritesSection$lambda$61 = UserProfileComponentsKt.FavouritesSection$lambda$61(NewUserFavouritesModel.this, onGoToMatches, z, function111, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return FavouritesSection$lambda$61;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableIntState = (MutableIntState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localView2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final View view2 = (View) consume2;
        Function1<? super Long, Unit> function162 = function15;
        final List listOf2 = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R.string.favourite_sports, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.favourite_leagues, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.favourite_teams, startRestartGroup, 6)});
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        boxScopeInstance = BoxScopeInstance.INSTANCE;
        float f4 = 16;
        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4))), 0.0f, Dp.m7774constructorimpl(f4), 1, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(view2);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit FavouritesSection$lambda$60$lambda$30$lambda$29;
                FavouritesSection$lambda$60$lambda$30$lambda$29 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$30$lambda$29(view2, mutableState, (LayoutCoordinates) obj);
                return FavouritesSection$lambda$60$lambda$30$lambda$29;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(m1518paddingVpY3zN4$default2, (Function1) rememberedValue3);
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
        float f22 = 12;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), startRestartGroup, 6);
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
        PaddingValues m1511PaddingValuesYgX7TsA$default2 = PaddingKt.m1511PaddingValuesYgX7TsA$default(Dp.m7774constructorimpl(f4), 0.0f, 2, null);
        Arrangement.HorizontalOrVertical horizontalOrVertical2 = m1397spacedBy0680j_42;
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(listOf2);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit FavouritesSection$lambda$60$lambda$57$lambda$32$lambda$31;
                FavouritesSection$lambda$60$lambda$57$lambda$32$lambda$31 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$57$lambda$32$lambda$31(listOf2, mutableIntState, (LazyListScope) obj);
                return FavouritesSection$lambda$60$lambda$57$lambda$32$lambda$31;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        Function1<? super Long, Unit> function172 = function162;
        int i92 = i4;
        LazyDslKt.LazyRow(fillMaxWidth$default2, null, m1511PaddingValuesYgX7TsA$default2, false, horizontalOrVertical2, null, null, false, null, (Function1) rememberedValue4, startRestartGroup, 24966, 490);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f22)), startRestartGroup, 6);
        FavouritesSection$lambda$23 = FavouritesSection$lambda$23(mutableIntState);
        int i102 = 60;
        if (FavouritesSection$lambda$23 == 0) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(310873036);
        if (FavouritesSection$lambda$26(mutableState)) {
            String stringResource2 = StringResources_androidKt.stringResource(R.string.edit, startRestartGroup, i6);
            float f32 = 32;
            Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomEnd()), 0.0f, 0.0f, Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f32), 3, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            if ((i5 & 112) != 32) {
            }
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit FavouritesSection$lambda$60$lambda$59$lambda$58;
                    FavouritesSection$lambda$60$lambda$59$lambda$58 = UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$59$lambda$58(Function1.this, mutableIntState);
                    return FavouritesSection$lambda$60$lambda$59$lambda$58;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(m1520paddingqDBjuR0$default2, false, stringResource2, false, false, false, (Function0) rememberedValue5, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 0, 0, 0, 2097082);
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function12 = function13;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FavouritesSection$lambda$23(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final boolean FavouritesSection$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FavouritesSection$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$60$lambda$30$lambda$29(View view, final MutableState mutableState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        LayoutCoordinates parentLayoutCoordinates = coordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            Rect boundsInParent = LayoutCoordinatesKt.boundsInParent(coordinates);
            final boolean z = boundsInParent.getTop() < ((float) ((int) (parentLayoutCoordinates.mo6536getSizeYbymL2g() & 4294967295L))) && boundsInParent.getBottom() > 0.0f;
            view.post(new Runnable() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UserProfileComponentsKt.FavouritesSection$lambda$60$lambda$30$lambda$29$lambda$28(z, mutableState);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FavouritesSection$lambda$60$lambda$30$lambda$29$lambda$28(boolean z, MutableState mutableState) {
        if (FavouritesSection$lambda$26(mutableState) != z) {
            FavouritesSection$lambda$27(mutableState, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$60$lambda$57$lambda$32$lambda$31(List list, MutableIntState mutableIntState, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.items$default(LazyRow, list.size(), null, null, ComposableLambdaKt.composableLambdaInstance(790918044, true, new UserProfileComponentsKt$FavouritesSection$1$2$1$1$1(list, mutableIntState)), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$60$lambda$57$lambda$40$lambda$39$lambda$36$lambda$35(SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$60$lambda$57$lambda$40$lambda$39$lambda$38$lambda$37(SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$60$lambda$57$lambda$48$lambda$47$lambda$44$lambda$43(SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$60$lambda$57$lambda$48$lambda$47$lambda$46$lambda$45(SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$50$lambda$49(Function1 function1, NewTeamModel newTeamModel) {
        if (function1 != null) {
            function1.invoke(Long.valueOf(newTeamModel.getId()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$52$lambda$51(SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$60$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53(SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavouritesSection$lambda$60$lambda$59$lambda$58(Function1 function1, MutableIntState mutableIntState) {
        FavouriteTypeK favouriteTypeK;
        int FavouritesSection$lambda$23 = FavouritesSection$lambda$23(mutableIntState);
        if (FavouritesSection$lambda$23 == 0) {
            favouriteTypeK = FavouriteTypeK.Sports.INSTANCE;
        } else if (FavouritesSection$lambda$23 == 1) {
            favouriteTypeK = FavouriteTypeK.Leagues.INSTANCE;
        } else if (FavouritesSection$lambda$23 == 2) {
            favouriteTypeK = FavouriteTypeK.Teams.INSTANCE;
        } else {
            favouriteTypeK = FavouriteTypeK.Sports.INSTANCE;
        }
        function1.invoke(favouriteTypeK);
        return Unit.INSTANCE;
    }

    public static final void UserRankingContent(final List<? extends RankingTimeType> tabTitles, final int i, final Function1<? super Integer, Unit> onTabSelected, final Function1<? super Integer, Unit> onUserClick, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(tabTitles, "tabTitles");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(onUserClick, "onUserClick");
        Composer startRestartGroup = composer.startRestartGroup(1096951182);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(tabTitles) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onTabSelected) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onUserClick) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1096951182, i3, -1, "org.betup.ui.fragment.user.compose.UserRankingContent (UserProfileComponents.kt:608)");
            }
            final int coerceIn = RangesKt.coerceIn(i, 0, RangesKt.coerceAtLeast(tabTitles.size() - 1, 0));
            final RankingTimeType rankingTimeType = (RankingTimeType) CollectionsKt.getOrNull(tabTitles, coerceIn);
            if (rankingTimeType == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit UserRankingContent$lambda$62;
                            UserRankingContent$lambda$62 = UserProfileComponentsKt.UserRankingContent$lambda$62(tabTitles, i, onTabSelected, onUserClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return UserRankingContent$lambda$62;
                        }
                    });
                    return;
                }
                return;
            }
            final NewUserRankingItemModel fourthItem = rankingTimeType.getFourthItem();
            final NewUserRankingItemModel fiveItem = rankingTimeType.getFiveItem();
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changedInstance = startRestartGroup.changedInstance(tabTitles) | startRestartGroup.changed(coerceIn) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changedInstance(rankingTimeType) | ((i3 & 7168) == 2048) | startRestartGroup.changed(fourthItem) | startRestartGroup.changed(fiveItem);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit UserRankingContent$lambda$64$lambda$63;
                        UserRankingContent$lambda$64$lambda$63 = UserProfileComponentsKt.UserRankingContent$lambda$64$lambda$63(RankingTimeType.this, tabTitles, coerceIn, onTabSelected, onUserClick, fourthItem, fiveItem, (LazyListScope) obj);
                        return UserRankingContent$lambda$64$lambda$63;
                    }
                };
                startRestartGroup.updateRememberedValue(function1);
                rememberedValue = function1;
            }
            Function1 function12 = (Function1) rememberedValue;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, function12, composer2, 0, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UserRankingContent$lambda$65;
                    UserRankingContent$lambda$65 = UserProfileComponentsKt.UserRankingContent$lambda$65(tabTitles, i, onTabSelected, onUserClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return UserRankingContent$lambda$65;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserRankingContent$lambda$64$lambda$63(final RankingTimeType rankingTimeType, List list, int i, Function1 function1, final Function1 function12, final NewUserRankingItemModel newUserRankingItemModel, final NewUserRankingItemModel newUserRankingItemModel2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-857977245, true, new UserProfileComponentsKt$UserRankingContent$1$1$1(list, i, function1, rankingTimeType, function12)), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(690186394, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserRankingContent$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i2 & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(690186394, i2, -1, "org.betup.ui.fragment.user.compose.UserRankingContent.<anonymous>.<anonymous>.<anonymous> (UserProfileComponents.kt:666)");
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer, 6);
                NewUserRankingItemModel newUserRankingItemModel3 = NewUserRankingItemModel.this;
                if (newUserRankingItemModel3 != null) {
                    UserProfileComponentsKt.RankingListItemProfile(newUserRankingItemModel3, function12, composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1461296741, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserRankingContent$1$1$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i2 & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1461296741, i2, -1, "org.betup.ui.fragment.user.compose.UserRankingContent.<anonymous>.<anonymous>.<anonymous> (UserProfileComponents.kt:676)");
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer, 6);
                NewUserRankingItemModel newUserRankingItemModel3 = NewUserRankingItemModel.this;
                if (newUserRankingItemModel3 != null) {
                    UserProfileComponentsKt.RankingListItemProfile(newUserRankingItemModel3, function12, composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.items$default(LazyColumn, rankingTimeType.getRemainingItems().size(), null, null, ComposableLambdaKt.composableLambdaInstance(-80669780, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserRankingContent$1$1$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i2, Composer composer, int i3) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i3 & 48) == 0) {
                    i3 |= composer.changed(i2) ? 32 : 16;
                }
                if ((i3 & Opcodes.I2B) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-80669780, i3, -1, "org.betup.ui.fragment.user.compose.UserRankingContent.<anonymous>.<anonymous>.<anonymous> (UserProfileComponents.kt:688)");
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer, 6);
                UserProfileComponentsKt.RankingListItemProfile(RankingTimeType.this.getRemainingItems().get(i2), function12, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    /* renamed from: UserAchievementsCarousel-WMci_g0, reason: not valid java name */
    public static final void m14271UserAchievementsCarouselWMci_g0(final List<NewUserAchievementsModel> achievements, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(achievements, "achievements");
        Composer startRestartGroup = composer.startRestartGroup(935055344);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(achievements) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                f = Dp.m7774constructorimpl(54);
            }
            if (i5 != 0) {
                f2 = Dp.m7774constructorimpl(0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(935055344, i3, -1, "org.betup.ui.fragment.user.compose.UserAchievementsCarousel (UserProfileComponents.kt:703)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(118684998, true, new UserProfileComponentsKt$UserAchievementsCarousel$1(achievements, f, f2), startRestartGroup, 54), startRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final float f3 = f;
        final float f4 = f2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UserAchievementsCarousel_WMci_g0$lambda$66;
                    UserAchievementsCarousel_WMci_g0$lambda$66 = UserProfileComponentsKt.UserAchievementsCarousel_WMci_g0$lambda$66(achievements, f3, f4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return UserAchievementsCarousel_WMci_g0$lambda$66;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RankingListItemProfile(final NewUserRankingItemModel newUserRankingItemModel, final Function1<? super Integer, Unit> function1, Composer composer, final int i) {
        int i2;
        String str;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1919499321);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(newUserRankingItemModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1919499321, i2, -1, "org.betup.ui.fragment.user.compose.RankingListItemProfile (UserProfileComponents.kt:772)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit RankingListItemProfile$lambda$68$lambda$67;
                        RankingListItemProfile$lambda$68$lambda$67 = UserProfileComponentsKt.RankingListItemProfile$lambda$68$lambda$67(Function1.this, newUserRankingItemModel);
                        return RankingListItemProfile$lambda$68$lambda$67;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            float f = 4;
            Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(ClickableKt.m1059clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null), 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU);
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
            float f2 = 12;
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2));
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.ranking_place_format, new Object[]{Integer.valueOf(newUserRankingItemModel.getRank())}, startRestartGroup, 6), SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(28), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(700), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
            float f3 = 8;
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), startRestartGroup, 6);
            String photoUrl = newUserRankingItemModel.getPhotoUrl();
            if (photoUrl == null) {
                photoUrl = "";
            }
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), RoundedCornerShapeKt.getCircleShape()), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(newUserRankingItemModel.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
            Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            NewCountryModel country = newUserRankingItemModel.getCountry();
            if (country == null || (str = country.getPhotoUrl()) == null) {
                str = "";
            }
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), RoundedCornerShapeKt.getCircleShape()), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.level, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(String.valueOf(newUserRankingItemModel.getLevel()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.ranking_roi_percentage_format, new Object[]{UiExtensionsKt.formatRoiPercent(newUserRankingItemModel.getWinningRate())}, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(700), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RankingListItemProfile$lambda$73;
                    RankingListItemProfile$lambda$73 = UserProfileComponentsKt.RankingListItemProfile$lambda$73(NewUserRankingItemModel.this, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return RankingListItemProfile$lambda$73;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RankingListItemProfile$lambda$68$lambda$67(Function1 function1, NewUserRankingItemModel newUserRankingItemModel) {
        function1.invoke(Integer.valueOf((int) newUserRankingItemModel.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompetitionStatsResponse UserStatsContent$lambda$1(State<CompetitionStatsResponse> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuizStatsResponse UserStatsContent$lambda$3(State<QuizStatsResponse> state) {
        return state.getValue();
    }
}
