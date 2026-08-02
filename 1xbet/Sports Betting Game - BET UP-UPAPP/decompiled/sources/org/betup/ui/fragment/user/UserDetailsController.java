package org.betup.ui.fragment.user;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import com.google.android.material.internal.ViewUtils;
import com.ironsource.C3473f8;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.DisplayEditFavouritesDialogMessage;
import org.betup.bus.DisplayEventPushMessage;
import org.betup.bus.DisplayFollowersDialogMessage;
import org.betup.bus.FavoritesUpdatedMessage;
import org.betup.bus.NavigateMessage;
import org.betup.bus.ReturnToLastTabMessage;
import org.betup.model.local.entity.NotificationType;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserAvailableChallengesInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserBattleCountsInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserChallengesHistoryInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserPrivateChallengesInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.messaging.GetChatsInteractor;
import org.betup.model.remote.api.rest.messaging.GetPrivateMessagesInteractor;
import org.betup.model.remote.api.rest.messaging.SendPrivateMessasgesInteractor;
import org.betup.model.remote.api.rest.user.UserProfileStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserFavouritesInteractor;
import org.betup.model.remote.api.rest.user.V7UserFollowersInteractor;
import org.betup.model.remote.api.rest.user.V7UserInfoInteractor;
import org.betup.model.remote.api.rest.user.V7UserRankingStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserRanksInteractor;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.PageModel;
import org.betup.model.remote.entity.achievements.NewAchievementsResponseModel;
import org.betup.model.remote.entity.challenges.BattleCountModel;
import org.betup.model.remote.entity.challenges.ChallengeCreator;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.model.remote.entity.challenges.NewUserBattleLeagueModel;
import org.betup.model.remote.entity.challenges.NewUserBattleMatchModel;
import org.betup.model.remote.entity.challenges.NewUserBattleModel;
import org.betup.model.remote.entity.challenges.NewUserBattleSportModel;
import org.betup.model.remote.entity.challenges.NewUserBattleTeamModel;
import org.betup.model.remote.entity.challenges.NewUserBattlesResponseModel;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsMapperKt;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.model.remote.entity.challenges.V7UserBattlesHistoryResponseModel;
import org.betup.model.remote.entity.country.NewCountryModel;
import org.betup.model.remote.entity.messaging.ChatModel;
import org.betup.model.remote.entity.messaging.ExtendedMessageModel;
import org.betup.model.remote.entity.messaging.MessageModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.NewUserAchievementsModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserFavouritesModel;
import org.betup.model.remote.entity.user.NewUserFollowersModel;
import org.betup.model.remote.entity.user.NewUserInfoModel;
import org.betup.model.remote.entity.user.NewUserRankingItemModel;
import org.betup.model.remote.entity.user.NewUserRankingStatisticsModel;
import org.betup.model.remote.entity.user.NewUserRanksModel;
import org.betup.model.remote.entity.user.profile.CompetitionStatsResponse;
import org.betup.model.remote.entity.user.profile.QuizStatsResponse;
import org.betup.model.remote.entity.user.profile.UserProfileStatsResponse;
import org.betup.services.user.UserService;
import org.betup.ui.base.BaseActivity;
import org.betup.ui.dialogs.events.ChallengeAcceptedOrCreatedEvent;
import org.betup.ui.dialogs.events.OpenBetSelectionEvent;
import org.betup.ui.dialogs.events.OpenChallengePreviewDialog;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.details.compose.butons.base.BaseButtonMatchUIItem;
import org.betup.ui.fragment.user.UserDetailsTab;
import org.betup.ui.fragment.user.compose.RankingCupBaseItemKt;
import org.betup.ui.fragment.user.compose.RankingCupType;
import org.betup.ui.fragment.user.compose.RankingTimeType;
import org.betup.ui.fragment.user.compose.items.NewUserBattleCreator;
import org.betup.ui.fragment.user.compose.items.NewUserBattleLeague;
import org.betup.ui.fragment.user.compose.items.NewUserBattleMatch;
import org.betup.ui.fragment.user.compose.items.NewUserBattleSport;
import org.betup.ui.fragment.user.compose.items.NewUserBattleTeam;
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserDetailsController.kt */
@Metadata(d1 = {"\u0000À\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 â\u00022\u00020\u0001:\u0002â\u0002B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0080\u0002\u001a\u00030\u0081\u00022\b\u0010«\u0001\u001a\u00030¬\u00012\b\u0010\u00ad\u0001\u001a\u00030®\u00012\n\b\u0002\u0010\u0082\u0002\u001a\u00030\u008b\u00012\n\b\u0002\u0010\u0083\u0002\u001a\u00030\u008b\u0001J\b\u0010\u0084\u0002\u001a\u00030\u0081\u0002J\u0014\u0010\u0085\u0002\u001a\u00030\u0081\u00022\b\u0010\u0086\u0002\u001a\u00030\u0087\u0002H\u0007J\u0014\u0010\u0088\u0002\u001a\u00030\u0081\u00022\b\u0010\u0086\u0002\u001a\u00030\u0089\u0002H\u0007J\u0014\u0010\u008a\u0002\u001a\u00030\u0081\u00022\b\u0010\u0086\u0002\u001a\u00030\u008b\u0002H\u0007J\b\u0010\u008c\u0002\u001a\u00030\u0081\u0002J\b\u0010\u008d\u0002\u001a\u00030\u0081\u0002J\u0012\u0010\u008e\u0002\u001a\u00030\u0081\u00022\b\u0010\u008f\u0002\u001a\u00030¬\u0001J\b\u0010\u0090\u0002\u001a\u00030\u0081\u0002J\n\u0010\u0091\u0002\u001a\u00030\u0081\u0002H\u0002J\n\u0010\u0092\u0002\u001a\u00030\u0081\u0002H\u0002J\u0014\u0010\u0093\u0002\u001a\u00030\u0081\u00022\b\u0010\u0094\u0002\u001a\u00030\u0095\u0002H\u0002J\n\u0010\u009f\u0002\u001a\u00030\u0081\u0002H\u0002J\u0012\u0010 \u0002\u001a\u00030\u0081\u00022\b\u0010¡\u0002\u001a\u00030¬\u0001J\u0012\u0010¢\u0002\u001a\u00030\u0081\u00022\b\u0010¡\u0002\u001a\u00030¬\u0001J\b\u0010£\u0002\u001a\u00030\u0081\u0002J\u0012\u0010£\u0002\u001a\u00030\u0081\u00022\b\u0010¤\u0002\u001a\u00030¥\u0002J\b\u0010¦\u0002\u001a\u00030\u0081\u0002J\b\u0010§\u0002\u001a\u00030\u0081\u0002J\b\u0010¨\u0002\u001a\u00030\u0081\u0002J\b\u0010©\u0002\u001a\u00030\u0081\u0002J\u0014\u0010ª\u0002\u001a\u00030\u0081\u00022\b\u0010«\u0002\u001a\u00030\u008b\u0001H\u0002J\u0012\u0010¯\u0002\u001a\u00030\u0081\u00022\b\u0010°\u0002\u001a\u00030\u0087\u0001J\b\u0010±\u0002\u001a\u00030\u0081\u0002J\b\u0010²\u0002\u001a\u00030\u0081\u0002J\u0014\u0010³\u0002\u001a\u00030\u0081\u00022\b\u0010«\u0002\u001a\u00030\u008b\u0001H\u0002J\u0012\u0010¶\u0002\u001a\u00030\u0081\u00022\b\u0010·\u0002\u001a\u00030°\u0001J\b\u0010º\u0002\u001a\u00030\u0081\u0002J\b\u0010¾\u0001\u001a\u00030¬\u0001J\b\u0010»\u0002\u001a\u00030\u0081\u0002J\u0014\u0010¼\u0002\u001a\u00030°\u00012\b\u0010°\u0002\u001a\u00030\u0087\u0001H\u0002J\u0014\u0010½\u0002\u001a\u00030\u0087\u00012\b\u0010°\u0002\u001a\u00030\u0087\u0001H\u0002J\u0014\u0010¾\u0002\u001a\u00030\u0081\u00022\b\u0010°\u0002\u001a\u00030\u0087\u0001H\u0002J\n\u0010¿\u0002\u001a\u00030\u0081\u0002H\u0002J\u0012\u0010À\u0002\u001a\u00030\u0081\u00022\b\u0010¡\u0002\u001a\u00030¬\u0001J\b\u0010Æ\u0001\u001a\u00030¬\u0001J\u0012\u0010Á\u0002\u001a\u00030\u0081\u00022\b\u0010Â\u0002\u001a\u00030Ã\u0002J\u0014\u0010Ä\u0002\u001a\u00030\u0081\u00022\b\u0010Å\u0002\u001a\u00030Æ\u0002H\u0007J\b\u0010Ì\u0002\u001a\u00030\u0081\u0002J\n\u0010Í\u0002\u001a\u00030\u0081\u0002H\u0002J\b\u0010Î\u0002\u001a\u00030\u0081\u0002J\b\u0010Ï\u0002\u001a\u00030\u0081\u0002J\u001c\u0010Ð\u0002\u001a\u00030\u0081\u00022\f\b\u0002\u0010Ñ\u0002\u001a\u0005\u0018\u00010¬\u0001¢\u0006\u0003\u0010Ò\u0002J\b\u0010Ó\u0002\u001a\u00030\u0081\u0002J\b\u0010Ô\u0002\u001a\u00030\u0081\u0002J\b\u0010Õ\u0002\u001a\u00030\u0081\u0002J\b\u0010Ö\u0002\u001a\u00030\u0081\u0002J\b\u0010×\u0002\u001a\u00030\u0081\u0002J\u001a\u0010Ù\u0002\u001a\u00030¬\u00012\n\u0010Ú\u0002\u001a\u0005\u0018\u00010¬\u0001¢\u0006\u0003\u0010Û\u0002J\u0012\u0010Ü\u0002\u001a\u00030\u0081\u00022\b\u0010Ý\u0002\u001a\u00030µ\u0002J&\u0010Þ\u0002\u001a\u00030\u0081\u00022\b\u0010Ý\u0002\u001a\u00030µ\u00022\u0012\b\u0002\u0010ß\u0002\u001a\u000b\u0012\u0005\u0012\u00030µ\u0002\u0018\u00010~J\u0012\u0010à\u0002\u001a\u00030\u0081\u00022\b\u0010«\u0001\u001a\u00030¬\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010@\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010F\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010L\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001e\u0010R\u001a\u00020S8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010X\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010^\u001a\u00020_8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001e\u0010d\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0016\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010l0kX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010l0n¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0016\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0kX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0n¢\u0006\b\n\u0000\u001a\u0004\bt\u0010pR\u0016\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010v0kX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010v0n¢\u0006\b\n\u0000\u001a\u0004\bx\u0010pR\u0016\u0010y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010z0kX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010z0n¢\u0006\b\n\u0000\u001a\u0004\b|\u0010pR\u001a\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0~0kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0~0n¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010pR\u0018\u0010\u0082\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0083\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0084\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0083\u00010n¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010pR\u001c\u0010\u0086\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010~0kX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0088\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010~0n¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010pR\u0016\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010pR\u0016\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010pR\u0016\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010pR\u0018\u0010\u0092\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0087\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0093\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0087\u00010n¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010pR\u001c\u0010\u0095\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0096\u00010~0kX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0097\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0096\u00010~0n¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010pR\u0016\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u009a\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010pR\u0016\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010pR\u0016\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010pR\u0016\u0010 \u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010pR\u001c\u0010¢\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030£\u00010~0kX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010¤\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030£\u00010~0n¢\u0006\t\n\u0000\u001a\u0005\b¥\u0001\u0010pR\u0016\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010pR\u0016\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010©\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010pR\u0010\u0010«\u0001\u001a\u00030¬\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010¯\u0001\u001a\u0005\u0018\u00010°\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010±\u0001\u001a\u0005\u0018\u00010°\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010²\u0001\u001a\u00030\u008b\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010³\u0001\u001a\u00030\u008b\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010´\u0001\u001a\t\u0012\u0005\u0012\u00030µ\u00010~X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u00030µ\u00010~8F¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0016\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010º\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010n¢\u0006\t\n\u0000\u001a\u0005\b»\u0001\u0010pR\u0016\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010n¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010pR\u0010\u0010¿\u0001\u001a\u00030¬\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010À\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Á\u00010~0kX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010Â\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Á\u00010~0n¢\u0006\t\n\u0000\u001a\u0005\bÃ\u0001\u0010pR\u0016\u0010Ä\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010Å\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010n¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010pR\u0010\u0010Ç\u0001\u001a\u00030È\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010É\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ê\u00010~0kX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010Ë\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ê\u00010~0n¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0001\u0010pR\u001c\u0010Í\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ê\u00010~0kX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010Î\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ê\u00010~0n¢\u0006\t\n\u0000\u001a\u0005\bÏ\u0001\u0010pR\u001c\u0010Ð\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ñ\u00010~0kX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010Ò\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ñ\u00010~0n¢\u0006\t\n\u0000\u001a\u0005\bÓ\u0001\u0010pR\u0016\u0010Ô\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010Õ\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\bÕ\u0001\u0010pR\u0016\u0010Ö\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010×\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\bØ\u0001\u0010pR\u0016\u0010Ù\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010Ú\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\bÛ\u0001\u0010pR\u0016\u0010Ü\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010Ý\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\bÞ\u0001\u0010pR\u0016\u0010ß\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010à\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\bà\u0001\u0010pR\u0016\u0010á\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010â\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\bâ\u0001\u0010pR\u0016\u0010ã\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010ä\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\bä\u0001\u0010pR\u001c\u0010å\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030æ\u00010~0kX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010ç\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030æ\u00010~0n¢\u0006\t\n\u0000\u001a\u0005\bè\u0001\u0010pR\u0016\u0010é\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010ê\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\bê\u0001\u0010pR\u0016\u0010ë\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010ì\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010n¢\u0006\t\n\u0000\u001a\u0005\bí\u0001\u0010pR\u0018\u0010î\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ï\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ð\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ï\u00010n¢\u0006\t\n\u0000\u001a\u0005\bñ\u0001\u0010pR\u0016\u0010ò\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010kX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010ó\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010n¢\u0006\t\n\u0000\u001a\u0005\bó\u0001\u0010pR\u001c\u0010ô\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010õ\u00010n8F¢\u0006\u0007\u001a\u0005\bö\u0001\u0010pR\u001c\u0010÷\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010ø\u00010n8F¢\u0006\u0007\u001a\u0005\bù\u0001\u0010pR\u0010\u0010ú\u0001\u001a\u00030¬\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010û\u0001\u001a\u00030¬\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010ü\u0001\u001a\u00030¬\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010ý\u0001\u001a\u0005\u0018\u00010¬\u0001X\u0082\u000e¢\u0006\u0005\n\u0003\u0010þ\u0001R\u0010\u0010ÿ\u0001\u001a\u00030¬\u0001X\u0082D¢\u0006\u0002\n\u0000R\u001d\u0010\u0096\u0002\u001a\u0010\u0012\u0004\u0012\u00020l\u0012\u0005\u0012\u00030¬\u00010\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0098\u0002\u001a\u0010\u0012\u0004\u0012\u00020r\u0012\u0005\u0012\u00030¬\u00010\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0099\u0002\u001a\u0010\u0012\u0004\u0012\u00020v\u0012\u0005\u0012\u00030¬\u00010\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u009a\u0002\u001a\u0010\u0012\u0004\u0012\u00020z\u0012\u0005\u0012\u00030¬\u00010\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u009b\u0002\u001a\u0017\u0012\u0007\u0012\u0005\u0018\u00010\u009c\u0002\u0012\u0007\u0012\u0005\u0018\u00010¬\u0001\u0018\u00010\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u009d\u0002\u001a\u0011\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0005\u0012\u00030¬\u00010\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u009e\u0002\u001a\u0011\u0012\u0005\u0012\u00030\u0095\u0002\u0012\u0005\u0012\u00030¬\u00010\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010¬\u0002\u001a\u0018\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0087\u00010\u00ad\u0002\u0012\u0005\u0012\u00030®\u00020\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010´\u0002\u001a\u0018\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0096\u00010\u00ad\u0002\u0012\u0005\u0012\u00030µ\u00020\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010¸\u0002\u001a\u0011\u0012\u0005\u0012\u00030¹\u0002\u0012\u0005\u0012\u00030µ\u00020\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010Ç\u0002\u001a\u0015\u0012\u0007\u0012\u0005\u0018\u00010È\u0002\u0012\u0007\u0012\u0005\u0018\u00010µ\u00020\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010É\u0002\u001a\u0015\u0012\u0007\u0012\u0005\u0018\u00010È\u0002\u0012\u0007\u0012\u0005\u0018\u00010µ\u00020\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010Ê\u0002\u001a\u0015\u0012\u0007\u0012\u0005\u0018\u00010Ë\u0002\u0012\u0007\u0012\u0005\u0018\u00010µ\u00020\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010Ø\u0002\u001a\u0017\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030æ\u00010~\u0012\u0005\u0012\u00030µ\u00020\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010á\u0002\u001a\u0011\u0012\u0005\u0012\u00030ï\u0001\u0012\u0005\u0012\u00030¬\u00010\u0097\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006ã\u0002"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "v7UserInfoInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserInfoInteractor;", "getV7UserInfoInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserInfoInteractor;", "setV7UserInfoInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserInfoInteractor;)V", "v7UserRanksInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserRanksInteractor;", "getV7UserRanksInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserRanksInteractor;", "setV7UserRanksInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserRanksInteractor;)V", "v7UserBetStatisticsInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserBetStatisticsInteractor;", "getV7UserBetStatisticsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserBetStatisticsInteractor;", "setV7UserBetStatisticsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserBetStatisticsInteractor;)V", "v7UserFollowersInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserFollowersInteractor;", "getV7UserFollowersInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserFollowersInteractor;", "setV7UserFollowersInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserFollowersInteractor;)V", "v7UserAchievementsInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserAchievementsInteractor;", "getV7UserAchievementsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserAchievementsInteractor;", "setV7UserAchievementsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserAchievementsInteractor;)V", "v7UserFavouritesInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserFavouritesInteractor;", "getV7UserFavouritesInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserFavouritesInteractor;", "setV7UserFavouritesInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserFavouritesInteractor;)V", "v7UserRankingStatisticsInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserRankingStatisticsInteractor;", "getV7UserRankingStatisticsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserRankingStatisticsInteractor;", "setV7UserRankingStatisticsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserRankingStatisticsInteractor;)V", "betsListInteractor", "Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;", "getBetsListInteractor", "()Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;", "setBetsListInteractor", "(Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;)V", "userServiceP", "Lorg/betup/services/user/UserService;", "getUserServiceP", "()Lorg/betup/services/user/UserService;", "setUserServiceP", "(Lorg/betup/services/user/UserService;)V", "getChatsInteractor", "Lorg/betup/model/remote/api/rest/messaging/GetChatsInteractor;", "getGetChatsInteractor", "()Lorg/betup/model/remote/api/rest/messaging/GetChatsInteractor;", "setGetChatsInteractor", "(Lorg/betup/model/remote/api/rest/messaging/GetChatsInteractor;)V", "getPrivateMessagesInteractor", "Lorg/betup/model/remote/api/rest/messaging/GetPrivateMessagesInteractor;", "getGetPrivateMessagesInteractor", "()Lorg/betup/model/remote/api/rest/messaging/GetPrivateMessagesInteractor;", "setGetPrivateMessagesInteractor", "(Lorg/betup/model/remote/api/rest/messaging/GetPrivateMessagesInteractor;)V", "sendPrivateMessagesInteractor", "Lorg/betup/model/remote/api/rest/messaging/SendPrivateMessasgesInteractor;", "getSendPrivateMessagesInteractor", "()Lorg/betup/model/remote/api/rest/messaging/SendPrivateMessasgesInteractor;", "setSendPrivateMessagesInteractor", "(Lorg/betup/model/remote/api/rest/messaging/SendPrivateMessasgesInteractor;)V", "newUserAvailableChallengesInteractor", "Lorg/betup/model/remote/api/rest/challenges/NewUserAvailableChallengesInteractor;", "getNewUserAvailableChallengesInteractor", "()Lorg/betup/model/remote/api/rest/challenges/NewUserAvailableChallengesInteractor;", "setNewUserAvailableChallengesInteractor", "(Lorg/betup/model/remote/api/rest/challenges/NewUserAvailableChallengesInteractor;)V", "newUserPrivateChallengesInteractor", "Lorg/betup/model/remote/api/rest/challenges/NewUserPrivateChallengesInteractor;", "getNewUserPrivateChallengesInteractor", "()Lorg/betup/model/remote/api/rest/challenges/NewUserPrivateChallengesInteractor;", "setNewUserPrivateChallengesInteractor", "(Lorg/betup/model/remote/api/rest/challenges/NewUserPrivateChallengesInteractor;)V", "newUserChallengesHistoryInteractor", "Lorg/betup/model/remote/api/rest/challenges/NewUserChallengesHistoryInteractor;", "getNewUserChallengesHistoryInteractor", "()Lorg/betup/model/remote/api/rest/challenges/NewUserChallengesHistoryInteractor;", "setNewUserChallengesHistoryInteractor", "(Lorg/betup/model/remote/api/rest/challenges/NewUserChallengesHistoryInteractor;)V", "newUserBattleCountsInteractor", "Lorg/betup/model/remote/api/rest/challenges/NewUserBattleCountsInteractor;", "getNewUserBattleCountsInteractor", "()Lorg/betup/model/remote/api/rest/challenges/NewUserBattleCountsInteractor;", "setNewUserBattleCountsInteractor", "(Lorg/betup/model/remote/api/rest/challenges/NewUserBattleCountsInteractor;)V", "userProfileStatisticsInteractor", "Lorg/betup/model/remote/api/rest/user/UserProfileStatisticsInteractor;", "getUserProfileStatisticsInteractor", "()Lorg/betup/model/remote/api/rest/user/UserProfileStatisticsInteractor;", "setUserProfileStatisticsInteractor", "(Lorg/betup/model/remote/api/rest/user/UserProfileStatisticsInteractor;)V", "_newUserInfo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/model/remote/entity/user/NewUserInfoModel;", "newUserInfo", "Lkotlinx/coroutines/flow/StateFlow;", "getNewUserInfo", "()Lkotlinx/coroutines/flow/StateFlow;", "_newUserRanks", "Lorg/betup/model/remote/entity/user/NewUserRanksModel;", "newUserRanks", "getNewUserRanks", "_newUserBetStatistics", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "newUserBetStatistics", "getNewUserBetStatistics", "_newUserFollowers", "Lorg/betup/model/remote/entity/user/NewUserFollowersModel;", "newUserFollowers", "getNewUserFollowers", "_newUserAchievements", "", "Lorg/betup/model/remote/entity/user/NewUserAchievementsModel;", "newUserAchievements", "getNewUserAchievements", "_newUserFavourites", "Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;", "newUserFavourites", "getNewUserFavourites", "_userChats", "Lorg/betup/model/remote/entity/messaging/ChatModel;", "userChats", "getUserChats", "_isChatsLoading", "", "isChatsLoading", "_isChatsLoadingMore", "isChatsLoadingMore", "_hasMoreChats", "hasMoreChats", "getHasMoreChats", "_selectedChat", "selectedChat", "getSelectedChat", "_chatMessages", "Lorg/betup/model/remote/entity/messaging/ExtendedMessageModel;", "chatMessages", "getChatMessages", "_isChatMessagesLoading", "isChatMessagesLoading", "_isChatMessagesLoadingMore", "isChatMessagesLoadingMore", "_hasMoreChatMessages", "hasMoreChatMessages", "getHasMoreChatMessages", "_isSendingMessage", "isSendingMessage", "_baseTabs", "Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;", "baseTabs", "getBaseTabs", "_isLoading", "isLoading", "_userInfoLoadFailed", "userInfoLoadFailed", "getUserInfoLoadFailed", "userId", "", "context", "Lorg/betup/ui/base/BaseActivity;", "chatsContinuationToken", "", "messagesContinuationToken", "pendingChatsRefresh", "pendingMessagesRefresh", "_userTabs", "Lorg/betup/ui/fragment/user/UserDetailsTab;", "userTabs", "getUserTabs", "()Ljava/util/List;", "_selectedTabIndex", "selectedTabIndex", "getSelectedTabIndex", "_selectedBaseTabIndex", "selectedBaseTabIndex", "getSelectedBaseTabIndex", "lastSelectedTabBeforeFollowers", "_rankingTabs", "Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "rankingTabs", "getRankingTabs", "_selectedRankingTabIndex", "selectedRankingTabIndex", "getSelectedRankingTabIndex", "betHistoryController", "Lorg/betup/ui/fragment/user/BetHistoryController;", "_availableBattles", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleUiItem;", "availableBattles", "getAvailableBattles", "_privateBattles", "privateBattles", "getPrivateBattles", "_statsBattles", "Lorg/betup/model/remote/entity/challenges/NewUserBattleModel;", "statsBattles", "getStatsBattles", "_isBattlesLoading", "isBattlesLoading", "_hasMoreAvailableBattles", "hasMoreAvailableBattles", "getHasMoreAvailableBattles", "_hasMorePrivateBattles", "hasMorePrivateBattles", "getHasMorePrivateBattles", "_hasMoreStatsBattles", "hasMoreStatsBattles", "getHasMoreStatsBattles", "_isLoadMoreAvailableBattles", "isLoadMoreAvailableBattles", "_isLoadMorePrivateBattles", "isLoadMorePrivateBattles", "_isLoadMoreStatsBattles", "isLoadMoreStatsBattles", "_battleCounts", "Lorg/betup/model/remote/entity/challenges/BattleCountModel;", "battleCounts", "getBattleCounts", "_isLoadingBattleCounts", "isLoadingBattleCounts", "_totalItems", "totalItems", "getTotalItems", "_profileStats", "Lorg/betup/model/remote/entity/user/profile/UserProfileStatsResponse;", "profileStats", "getProfileStats", "_isLoadingProfileStats", "isLoadingProfileStats", "competitionStats", "Lorg/betup/model/remote/entity/user/profile/CompetitionStatsResponse;", "getCompetitionStats", "quizStats", "Lorg/betup/model/remote/entity/user/profile/QuizStatsResponse;", "getQuizStats", "availableBattlesOffset", "privateBattlesOffset", "statsBattlesOffset", "currentParticipantState", "Ljava/lang/Integer;", "battlesLimit", "initialize", "", "openToMessages", "openToRankings", "cleanup", "onFavoritesUpdated", "event", "Lorg/betup/bus/FavoritesUpdatedMessage;", "onNewMessage", "Lorg/betup/bus/DisplayEventPushMessage;", "onReturnToLastTab", "Lorg/betup/bus/ReturnToLastTabMessage;", "updateFavorites", "refreshUserInfo", "onUserCLick", "id", "retryLoadUserInfo", "loadUserData", "initializeBaseTabs", "initializeRankingTabs", "rankingStatistics", "Lorg/betup/model/remote/entity/user/NewUserRankingStatisticsModel;", "newUserInfoListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "newUserRanksListener", "newUserBetStatisticsListener", "newUserFollowersListener", "newUserAchievementsListener", "Lorg/betup/model/remote/entity/achievements/NewAchievementsResponseModel;", "newUserFavouritesListener", "newUserRankingStatisticsListener", "updateLoadingState", "setSelectedTab", "index", "selectBaseTab", "goToMatches", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "ensureChatsLoaded", "refreshChats", "refreshActiveChat", "loadMoreChats", "loadChatsInternal", "reset", "chatsListener", "Lorg/betup/model/remote/entity/PageModel;", "Ljava/lang/Void;", "openChat", "chat", "closeChat", "loadMoreMessages", "loadChatMessagesInternal", "messagesListener", "", C3473f8.j, "text", "sendMessageListener", "Lorg/betup/model/remote/entity/messaging/MessageModel;", "loadUserFollowers", "returnToLastSelectedTab", "chatKey", "copyChatModel", "markChatAsRead", "updateMessagesTabIndicator", "setSelectedRankingTab", "onBetClick", "betModel", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "onChallengesChanged", "message", "Lorg/betup/ui/dialogs/events/ChallengeAcceptedOrCreatedEvent;", "availableBattlesListener", "Lorg/betup/model/remote/entity/challenges/NewUserBattlesResponseModel;", "privateBattlesListener", "statsBattlesListener", "Lorg/betup/model/remote/entity/challenges/V7UserBattlesHistoryResponseModel;", "loadAvailableBattles", "loadAvailableBattlesInitial", "loadPrivateBattles", "forceRefreshPrivateBattles", "loadStatsBattles", "participantState", "(Ljava/lang/Integer;)V", "loadMoreAvailableBattles", "loadMorePrivateBattles", "loadMoreStatsBattles", "refreshAllBattles", "loadBattleCounts", "battleCountsListener", "getCountForState", "state", "(Ljava/lang/Integer;)I", "acceptBattle", "battleId", "openBattlePreview", "challengeIds", "loadProfileStatistics", "profileStatsListener", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserDetailsController {
    private static final int MESSAGES_TAB_INDEX = 3;
    private final MutableStateFlow<List<NewUserBattleUiItem>> _availableBattles;
    private final MutableStateFlow<List<BaseButtonMatchUIItem>> _baseTabs;
    private final MutableStateFlow<List<BattleCountModel>> _battleCounts;
    private final MutableStateFlow<List<ExtendedMessageModel>> _chatMessages;
    private final MutableStateFlow<Boolean> _hasMoreAvailableBattles;
    private final MutableStateFlow<Boolean> _hasMoreChatMessages;
    private final MutableStateFlow<Boolean> _hasMoreChats;
    private final MutableStateFlow<Boolean> _hasMorePrivateBattles;
    private final MutableStateFlow<Boolean> _hasMoreStatsBattles;
    private final MutableStateFlow<Boolean> _isBattlesLoading;
    private final MutableStateFlow<Boolean> _isChatMessagesLoading;
    private final MutableStateFlow<Boolean> _isChatMessagesLoadingMore;
    private final MutableStateFlow<Boolean> _isChatsLoading;
    private final MutableStateFlow<Boolean> _isChatsLoadingMore;
    private final MutableStateFlow<Boolean> _isLoadMoreAvailableBattles;
    private final MutableStateFlow<Boolean> _isLoadMorePrivateBattles;
    private final MutableStateFlow<Boolean> _isLoadMoreStatsBattles;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isLoadingBattleCounts;
    private final MutableStateFlow<Boolean> _isLoadingProfileStats;
    private final MutableStateFlow<Boolean> _isSendingMessage;
    private final MutableStateFlow<List<NewUserAchievementsModel>> _newUserAchievements;
    private final MutableStateFlow<NewUserBetStatisticsModel> _newUserBetStatistics;
    private final MutableStateFlow<NewUserFavouritesModel> _newUserFavourites;
    private final MutableStateFlow<NewUserFollowersModel> _newUserFollowers;
    private final MutableStateFlow<NewUserInfoModel> _newUserInfo;
    private final MutableStateFlow<NewUserRanksModel> _newUserRanks;
    private final MutableStateFlow<List<NewUserBattleUiItem>> _privateBattles;
    private final MutableStateFlow<UserProfileStatsResponse> _profileStats;
    private final MutableStateFlow<List<RankingTimeType>> _rankingTabs;
    private final MutableStateFlow<Integer> _selectedBaseTabIndex;
    private final MutableStateFlow<ChatModel> _selectedChat;
    private final MutableStateFlow<Integer> _selectedRankingTabIndex;
    private final MutableStateFlow<Integer> _selectedTabIndex;
    private final MutableStateFlow<List<NewUserBattleModel>> _statsBattles;
    private final MutableStateFlow<Integer> _totalItems;
    private final MutableStateFlow<List<ChatModel>> _userChats;
    private final MutableStateFlow<Boolean> _userInfoLoadFailed;
    private final List<UserDetailsTab> _userTabs;
    private final StateFlow<List<NewUserBattleUiItem>> availableBattles;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBattlesResponseModel, Long> availableBattlesListener;
    private int availableBattlesOffset;
    private final StateFlow<List<BaseButtonMatchUIItem>> baseTabs;
    private final StateFlow<List<BattleCountModel>> battleCounts;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<BattleCountModel>, Long> battleCountsListener;
    private final int battlesLimit;
    private final BetHistoryController betHistoryController;

    @Inject
    public BetsListInteractor betsListInteractor;
    private final StateFlow<List<ExtendedMessageModel>> chatMessages;
    private String chatsContinuationToken;
    private final BaseCachedSharedInteractor.OnFetchedListener<PageModel<ChatModel>, Void> chatsListener;
    private BaseActivity context;
    private Integer currentParticipantState;

    @Inject
    public GetChatsInteractor getChatsInteractor;

    @Inject
    public GetPrivateMessagesInteractor getPrivateMessagesInteractor;
    private final StateFlow<Boolean> hasMoreAvailableBattles;
    private final StateFlow<Boolean> hasMoreChatMessages;
    private final StateFlow<Boolean> hasMoreChats;
    private final StateFlow<Boolean> hasMorePrivateBattles;
    private final StateFlow<Boolean> hasMoreStatsBattles;
    private final StateFlow<Boolean> isBattlesLoading;
    private final StateFlow<Boolean> isChatMessagesLoading;
    private final StateFlow<Boolean> isChatMessagesLoadingMore;
    private final StateFlow<Boolean> isChatsLoading;
    private final StateFlow<Boolean> isChatsLoadingMore;
    private final StateFlow<Boolean> isLoadMoreAvailableBattles;
    private final StateFlow<Boolean> isLoadMorePrivateBattles;
    private final StateFlow<Boolean> isLoadMoreStatsBattles;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isLoadingBattleCounts;
    private final StateFlow<Boolean> isLoadingProfileStats;
    private final StateFlow<Boolean> isSendingMessage;
    private int lastSelectedTabBeforeFollowers;
    private String messagesContinuationToken;
    private final BaseCachedSharedInteractor.OnFetchedListener<PageModel<ExtendedMessageModel>, Long> messagesListener;
    private final StateFlow<List<NewUserAchievementsModel>> newUserAchievements;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewAchievementsResponseModel, Integer> newUserAchievementsListener;

    @Inject
    public NewUserAvailableChallengesInteractor newUserAvailableChallengesInteractor;

    @Inject
    public NewUserBattleCountsInteractor newUserBattleCountsInteractor;
    private final StateFlow<NewUserBetStatisticsModel> newUserBetStatistics;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBetStatisticsModel, Integer> newUserBetStatisticsListener;

    @Inject
    public NewUserChallengesHistoryInteractor newUserChallengesHistoryInteractor;
    private final StateFlow<NewUserFavouritesModel> newUserFavourites;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserFavouritesModel, Integer> newUserFavouritesListener;
    private final StateFlow<NewUserFollowersModel> newUserFollowers;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserFollowersModel, Integer> newUserFollowersListener;
    private final StateFlow<NewUserInfoModel> newUserInfo;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserInfoModel, Integer> newUserInfoListener;

    @Inject
    public NewUserPrivateChallengesInteractor newUserPrivateChallengesInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserRankingStatisticsModel, Integer> newUserRankingStatisticsListener;
    private final StateFlow<NewUserRanksModel> newUserRanks;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserRanksModel, Integer> newUserRanksListener;
    private boolean pendingChatsRefresh;
    private boolean pendingMessagesRefresh;
    private final StateFlow<List<NewUserBattleUiItem>> privateBattles;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBattlesResponseModel, Long> privateBattlesListener;
    private int privateBattlesOffset;
    private final StateFlow<UserProfileStatsResponse> profileStats;
    private final BaseCachedSharedInteractor.OnFetchedListener<UserProfileStatsResponse, Integer> profileStatsListener;
    private final StateFlow<List<RankingTimeType>> rankingTabs;
    private final StateFlow<Integer> selectedBaseTabIndex;
    private final StateFlow<ChatModel> selectedChat;
    private final StateFlow<Integer> selectedRankingTabIndex;
    private final StateFlow<Integer> selectedTabIndex;
    private final BaseCachedSharedInteractor.OnFetchedListener<MessageModel, Long> sendMessageListener;

    @Inject
    public SendPrivateMessasgesInteractor sendPrivateMessagesInteractor;
    private final StateFlow<List<NewUserBattleModel>> statsBattles;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7UserBattlesHistoryResponseModel, Long> statsBattlesListener;
    private int statsBattlesOffset;
    private final StateFlow<Integer> totalItems;
    private final StateFlow<List<ChatModel>> userChats;
    private int userId;
    private final StateFlow<Boolean> userInfoLoadFailed;

    @Inject
    public UserProfileStatisticsInteractor userProfileStatisticsInteractor;

    @Inject
    public UserService userServiceP;

    @Inject
    public V7UserAchievementsInteractor v7UserAchievementsInteractor;

    @Inject
    public V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor;

    @Inject
    public V7UserFavouritesInteractor v7UserFavouritesInteractor;

    @Inject
    public V7UserFollowersInteractor v7UserFollowersInteractor;

    @Inject
    public V7UserInfoInteractor v7UserInfoInteractor;

    @Inject
    public V7UserRankingStatisticsInteractor v7UserRankingStatisticsInteractor;

    @Inject
    public V7UserRanksInteractor v7UserRanksInteractor;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public UserDetailsController() {
        MutableStateFlow<NewUserInfoModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._newUserInfo = MutableStateFlow;
        this.newUserInfo = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<NewUserRanksModel> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._newUserRanks = MutableStateFlow2;
        this.newUserRanks = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<NewUserBetStatisticsModel> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this._newUserBetStatistics = MutableStateFlow3;
        this.newUserBetStatistics = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<NewUserFollowersModel> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._newUserFollowers = MutableStateFlow4;
        this.newUserFollowers = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<List<NewUserAchievementsModel>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._newUserAchievements = MutableStateFlow5;
        this.newUserAchievements = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<NewUserFavouritesModel> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this._newUserFavourites = MutableStateFlow6;
        this.newUserFavourites = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<List<ChatModel>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._userChats = MutableStateFlow7;
        this.userChats = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(false);
        this._isChatsLoading = MutableStateFlow8;
        this.isChatsLoading = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(false);
        this._isChatsLoadingMore = MutableStateFlow9;
        this.isChatsLoadingMore = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreChats = MutableStateFlow10;
        this.hasMoreChats = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<ChatModel> MutableStateFlow11 = StateFlowKt.MutableStateFlow(null);
        this._selectedChat = MutableStateFlow11;
        this.selectedChat = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<List<ExtendedMessageModel>> MutableStateFlow12 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._chatMessages = MutableStateFlow12;
        this.chatMessages = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow<Boolean> MutableStateFlow13 = StateFlowKt.MutableStateFlow(false);
        this._isChatMessagesLoading = MutableStateFlow13;
        this.isChatMessagesLoading = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow<Boolean> MutableStateFlow14 = StateFlowKt.MutableStateFlow(false);
        this._isChatMessagesLoadingMore = MutableStateFlow14;
        this.isChatMessagesLoadingMore = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow<Boolean> MutableStateFlow15 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreChatMessages = MutableStateFlow15;
        this.hasMoreChatMessages = FlowKt.asStateFlow(MutableStateFlow15);
        MutableStateFlow<Boolean> MutableStateFlow16 = StateFlowKt.MutableStateFlow(false);
        this._isSendingMessage = MutableStateFlow16;
        this.isSendingMessage = FlowKt.asStateFlow(MutableStateFlow16);
        MutableStateFlow<List<BaseButtonMatchUIItem>> MutableStateFlow17 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._baseTabs = MutableStateFlow17;
        this.baseTabs = FlowKt.asStateFlow(MutableStateFlow17);
        MutableStateFlow<Boolean> MutableStateFlow18 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow18;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow18);
        MutableStateFlow<Boolean> MutableStateFlow19 = StateFlowKt.MutableStateFlow(false);
        this._userInfoLoadFailed = MutableStateFlow19;
        this.userInfoLoadFailed = FlowKt.asStateFlow(MutableStateFlow19);
        this._userTabs = UserDetailsTab.INSTANCE.getAllTabs();
        MutableStateFlow<Integer> MutableStateFlow20 = StateFlowKt.MutableStateFlow(0);
        this._selectedTabIndex = MutableStateFlow20;
        this.selectedTabIndex = FlowKt.asStateFlow(MutableStateFlow20);
        MutableStateFlow<Integer> MutableStateFlow21 = StateFlowKt.MutableStateFlow(0);
        this._selectedBaseTabIndex = MutableStateFlow21;
        this.selectedBaseTabIndex = FlowKt.asStateFlow(MutableStateFlow21);
        MutableStateFlow<List<RankingTimeType>> MutableStateFlow22 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._rankingTabs = MutableStateFlow22;
        this.rankingTabs = FlowKt.asStateFlow(MutableStateFlow22);
        MutableStateFlow<Integer> MutableStateFlow23 = StateFlowKt.MutableStateFlow(0);
        this._selectedRankingTabIndex = MutableStateFlow23;
        this.selectedRankingTabIndex = FlowKt.asStateFlow(MutableStateFlow23);
        this.betHistoryController = new BetHistoryController(false, 1, null);
        MutableStateFlow<List<NewUserBattleUiItem>> MutableStateFlow24 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._availableBattles = MutableStateFlow24;
        this.availableBattles = FlowKt.asStateFlow(MutableStateFlow24);
        MutableStateFlow<List<NewUserBattleUiItem>> MutableStateFlow25 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._privateBattles = MutableStateFlow25;
        this.privateBattles = FlowKt.asStateFlow(MutableStateFlow25);
        MutableStateFlow<List<NewUserBattleModel>> MutableStateFlow26 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._statsBattles = MutableStateFlow26;
        this.statsBattles = FlowKt.asStateFlow(MutableStateFlow26);
        MutableStateFlow<Boolean> MutableStateFlow27 = StateFlowKt.MutableStateFlow(false);
        this._isBattlesLoading = MutableStateFlow27;
        this.isBattlesLoading = FlowKt.asStateFlow(MutableStateFlow27);
        MutableStateFlow<Boolean> MutableStateFlow28 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreAvailableBattles = MutableStateFlow28;
        this.hasMoreAvailableBattles = FlowKt.asStateFlow(MutableStateFlow28);
        MutableStateFlow<Boolean> MutableStateFlow29 = StateFlowKt.MutableStateFlow(true);
        this._hasMorePrivateBattles = MutableStateFlow29;
        this.hasMorePrivateBattles = FlowKt.asStateFlow(MutableStateFlow29);
        MutableStateFlow<Boolean> MutableStateFlow30 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreStatsBattles = MutableStateFlow30;
        this.hasMoreStatsBattles = FlowKt.asStateFlow(MutableStateFlow30);
        MutableStateFlow<Boolean> MutableStateFlow31 = StateFlowKt.MutableStateFlow(false);
        this._isLoadMoreAvailableBattles = MutableStateFlow31;
        this.isLoadMoreAvailableBattles = FlowKt.asStateFlow(MutableStateFlow31);
        MutableStateFlow<Boolean> MutableStateFlow32 = StateFlowKt.MutableStateFlow(false);
        this._isLoadMorePrivateBattles = MutableStateFlow32;
        this.isLoadMorePrivateBattles = FlowKt.asStateFlow(MutableStateFlow32);
        MutableStateFlow<Boolean> MutableStateFlow33 = StateFlowKt.MutableStateFlow(false);
        this._isLoadMoreStatsBattles = MutableStateFlow33;
        this.isLoadMoreStatsBattles = FlowKt.asStateFlow(MutableStateFlow33);
        MutableStateFlow<List<BattleCountModel>> MutableStateFlow34 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._battleCounts = MutableStateFlow34;
        this.battleCounts = FlowKt.asStateFlow(MutableStateFlow34);
        MutableStateFlow<Boolean> MutableStateFlow35 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingBattleCounts = MutableStateFlow35;
        this.isLoadingBattleCounts = FlowKt.asStateFlow(MutableStateFlow35);
        MutableStateFlow<Integer> MutableStateFlow36 = StateFlowKt.MutableStateFlow(0);
        this._totalItems = MutableStateFlow36;
        this.totalItems = FlowKt.asStateFlow(MutableStateFlow36);
        MutableStateFlow<UserProfileStatsResponse> MutableStateFlow37 = StateFlowKt.MutableStateFlow(null);
        this._profileStats = MutableStateFlow37;
        this.profileStats = FlowKt.asStateFlow(MutableStateFlow37);
        MutableStateFlow<Boolean> MutableStateFlow38 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingProfileStats = MutableStateFlow38;
        this.isLoadingProfileStats = FlowKt.asStateFlow(MutableStateFlow38);
        this.battlesLimit = 5;
        this.newUserInfoListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda13
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.newUserInfoListener$lambda$16(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserRanksListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.newUserRanksListener$lambda$18(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserBetStatisticsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.newUserBetStatisticsListener$lambda$20(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserFollowersListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda3
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.newUserFollowersListener$lambda$22(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserAchievementsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda4
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.newUserAchievementsListener$lambda$24(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserFavouritesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda5
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.newUserFavouritesListener$lambda$26(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserRankingStatisticsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda6
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.newUserRankingStatisticsListener$lambda$28(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.chatsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda7
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.chatsListener$lambda$32(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.messagesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda8
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.messagesListener$lambda$36(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.sendMessageListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda9
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.sendMessageListener$lambda$39(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.availableBattlesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda14
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.availableBattlesListener$lambda$52(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.privateBattlesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda15
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.privateBattlesListener$lambda$60(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.statsBattlesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda16
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.statsBattlesListener$lambda$62(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.battleCountsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda17
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.battleCountsListener$lambda$71(UserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.profileStatsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda18
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserDetailsController.profileStatsListener$lambda$75(UserDetailsController.this, fetchedResponseMessage);
            }
        };
    }

    /* compiled from: UserDetailsController.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsController$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "MESSAGES_TAB_INDEX", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final V7UserInfoInteractor getV7UserInfoInteractor() {
        V7UserInfoInteractor v7UserInfoInteractor = this.v7UserInfoInteractor;
        if (v7UserInfoInteractor != null) {
            return v7UserInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserInfoInteractor");
        return null;
    }

    public final void setV7UserInfoInteractor(V7UserInfoInteractor v7UserInfoInteractor) {
        Intrinsics.checkNotNullParameter(v7UserInfoInteractor, "<set-?>");
        this.v7UserInfoInteractor = v7UserInfoInteractor;
    }

    public final V7UserRanksInteractor getV7UserRanksInteractor() {
        V7UserRanksInteractor v7UserRanksInteractor = this.v7UserRanksInteractor;
        if (v7UserRanksInteractor != null) {
            return v7UserRanksInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserRanksInteractor");
        return null;
    }

    public final void setV7UserRanksInteractor(V7UserRanksInteractor v7UserRanksInteractor) {
        Intrinsics.checkNotNullParameter(v7UserRanksInteractor, "<set-?>");
        this.v7UserRanksInteractor = v7UserRanksInteractor;
    }

    public final V7UserBetStatisticsInteractor getV7UserBetStatisticsInteractor() {
        V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor = this.v7UserBetStatisticsInteractor;
        if (v7UserBetStatisticsInteractor != null) {
            return v7UserBetStatisticsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserBetStatisticsInteractor");
        return null;
    }

    public final void setV7UserBetStatisticsInteractor(V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor) {
        Intrinsics.checkNotNullParameter(v7UserBetStatisticsInteractor, "<set-?>");
        this.v7UserBetStatisticsInteractor = v7UserBetStatisticsInteractor;
    }

    public final V7UserFollowersInteractor getV7UserFollowersInteractor() {
        V7UserFollowersInteractor v7UserFollowersInteractor = this.v7UserFollowersInteractor;
        if (v7UserFollowersInteractor != null) {
            return v7UserFollowersInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserFollowersInteractor");
        return null;
    }

    public final void setV7UserFollowersInteractor(V7UserFollowersInteractor v7UserFollowersInteractor) {
        Intrinsics.checkNotNullParameter(v7UserFollowersInteractor, "<set-?>");
        this.v7UserFollowersInteractor = v7UserFollowersInteractor;
    }

    public final V7UserAchievementsInteractor getV7UserAchievementsInteractor() {
        V7UserAchievementsInteractor v7UserAchievementsInteractor = this.v7UserAchievementsInteractor;
        if (v7UserAchievementsInteractor != null) {
            return v7UserAchievementsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserAchievementsInteractor");
        return null;
    }

    public final void setV7UserAchievementsInteractor(V7UserAchievementsInteractor v7UserAchievementsInteractor) {
        Intrinsics.checkNotNullParameter(v7UserAchievementsInteractor, "<set-?>");
        this.v7UserAchievementsInteractor = v7UserAchievementsInteractor;
    }

    public final V7UserFavouritesInteractor getV7UserFavouritesInteractor() {
        V7UserFavouritesInteractor v7UserFavouritesInteractor = this.v7UserFavouritesInteractor;
        if (v7UserFavouritesInteractor != null) {
            return v7UserFavouritesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserFavouritesInteractor");
        return null;
    }

    public final void setV7UserFavouritesInteractor(V7UserFavouritesInteractor v7UserFavouritesInteractor) {
        Intrinsics.checkNotNullParameter(v7UserFavouritesInteractor, "<set-?>");
        this.v7UserFavouritesInteractor = v7UserFavouritesInteractor;
    }

    public final V7UserRankingStatisticsInteractor getV7UserRankingStatisticsInteractor() {
        V7UserRankingStatisticsInteractor v7UserRankingStatisticsInteractor = this.v7UserRankingStatisticsInteractor;
        if (v7UserRankingStatisticsInteractor != null) {
            return v7UserRankingStatisticsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserRankingStatisticsInteractor");
        return null;
    }

    public final void setV7UserRankingStatisticsInteractor(V7UserRankingStatisticsInteractor v7UserRankingStatisticsInteractor) {
        Intrinsics.checkNotNullParameter(v7UserRankingStatisticsInteractor, "<set-?>");
        this.v7UserRankingStatisticsInteractor = v7UserRankingStatisticsInteractor;
    }

    public final BetsListInteractor getBetsListInteractor() {
        BetsListInteractor betsListInteractor = this.betsListInteractor;
        if (betsListInteractor != null) {
            return betsListInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betsListInteractor");
        return null;
    }

    public final void setBetsListInteractor(BetsListInteractor betsListInteractor) {
        Intrinsics.checkNotNullParameter(betsListInteractor, "<set-?>");
        this.betsListInteractor = betsListInteractor;
    }

    public final UserService getUserServiceP() {
        UserService userService = this.userServiceP;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userServiceP");
        return null;
    }

    public final void setUserServiceP(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userServiceP = userService;
    }

    public final GetChatsInteractor getGetChatsInteractor() {
        GetChatsInteractor getChatsInteractor = this.getChatsInteractor;
        if (getChatsInteractor != null) {
            return getChatsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getChatsInteractor");
        return null;
    }

    public final void setGetChatsInteractor(GetChatsInteractor getChatsInteractor) {
        Intrinsics.checkNotNullParameter(getChatsInteractor, "<set-?>");
        this.getChatsInteractor = getChatsInteractor;
    }

    public final GetPrivateMessagesInteractor getGetPrivateMessagesInteractor() {
        GetPrivateMessagesInteractor getPrivateMessagesInteractor = this.getPrivateMessagesInteractor;
        if (getPrivateMessagesInteractor != null) {
            return getPrivateMessagesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getPrivateMessagesInteractor");
        return null;
    }

    public final void setGetPrivateMessagesInteractor(GetPrivateMessagesInteractor getPrivateMessagesInteractor) {
        Intrinsics.checkNotNullParameter(getPrivateMessagesInteractor, "<set-?>");
        this.getPrivateMessagesInteractor = getPrivateMessagesInteractor;
    }

    public final SendPrivateMessasgesInteractor getSendPrivateMessagesInteractor() {
        SendPrivateMessasgesInteractor sendPrivateMessasgesInteractor = this.sendPrivateMessagesInteractor;
        if (sendPrivateMessasgesInteractor != null) {
            return sendPrivateMessasgesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sendPrivateMessagesInteractor");
        return null;
    }

    public final void setSendPrivateMessagesInteractor(SendPrivateMessasgesInteractor sendPrivateMessasgesInteractor) {
        Intrinsics.checkNotNullParameter(sendPrivateMessasgesInteractor, "<set-?>");
        this.sendPrivateMessagesInteractor = sendPrivateMessasgesInteractor;
    }

    public final NewUserAvailableChallengesInteractor getNewUserAvailableChallengesInteractor() {
        NewUserAvailableChallengesInteractor newUserAvailableChallengesInteractor = this.newUserAvailableChallengesInteractor;
        if (newUserAvailableChallengesInteractor != null) {
            return newUserAvailableChallengesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newUserAvailableChallengesInteractor");
        return null;
    }

    public final void setNewUserAvailableChallengesInteractor(NewUserAvailableChallengesInteractor newUserAvailableChallengesInteractor) {
        Intrinsics.checkNotNullParameter(newUserAvailableChallengesInteractor, "<set-?>");
        this.newUserAvailableChallengesInteractor = newUserAvailableChallengesInteractor;
    }

    public final NewUserPrivateChallengesInteractor getNewUserPrivateChallengesInteractor() {
        NewUserPrivateChallengesInteractor newUserPrivateChallengesInteractor = this.newUserPrivateChallengesInteractor;
        if (newUserPrivateChallengesInteractor != null) {
            return newUserPrivateChallengesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newUserPrivateChallengesInteractor");
        return null;
    }

    public final void setNewUserPrivateChallengesInteractor(NewUserPrivateChallengesInteractor newUserPrivateChallengesInteractor) {
        Intrinsics.checkNotNullParameter(newUserPrivateChallengesInteractor, "<set-?>");
        this.newUserPrivateChallengesInteractor = newUserPrivateChallengesInteractor;
    }

    public final NewUserChallengesHistoryInteractor getNewUserChallengesHistoryInteractor() {
        NewUserChallengesHistoryInteractor newUserChallengesHistoryInteractor = this.newUserChallengesHistoryInteractor;
        if (newUserChallengesHistoryInteractor != null) {
            return newUserChallengesHistoryInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newUserChallengesHistoryInteractor");
        return null;
    }

    public final void setNewUserChallengesHistoryInteractor(NewUserChallengesHistoryInteractor newUserChallengesHistoryInteractor) {
        Intrinsics.checkNotNullParameter(newUserChallengesHistoryInteractor, "<set-?>");
        this.newUserChallengesHistoryInteractor = newUserChallengesHistoryInteractor;
    }

    public final NewUserBattleCountsInteractor getNewUserBattleCountsInteractor() {
        NewUserBattleCountsInteractor newUserBattleCountsInteractor = this.newUserBattleCountsInteractor;
        if (newUserBattleCountsInteractor != null) {
            return newUserBattleCountsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newUserBattleCountsInteractor");
        return null;
    }

    public final void setNewUserBattleCountsInteractor(NewUserBattleCountsInteractor newUserBattleCountsInteractor) {
        Intrinsics.checkNotNullParameter(newUserBattleCountsInteractor, "<set-?>");
        this.newUserBattleCountsInteractor = newUserBattleCountsInteractor;
    }

    public final UserProfileStatisticsInteractor getUserProfileStatisticsInteractor() {
        UserProfileStatisticsInteractor userProfileStatisticsInteractor = this.userProfileStatisticsInteractor;
        if (userProfileStatisticsInteractor != null) {
            return userProfileStatisticsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userProfileStatisticsInteractor");
        return null;
    }

    public final void setUserProfileStatisticsInteractor(UserProfileStatisticsInteractor userProfileStatisticsInteractor) {
        Intrinsics.checkNotNullParameter(userProfileStatisticsInteractor, "<set-?>");
        this.userProfileStatisticsInteractor = userProfileStatisticsInteractor;
    }

    public final StateFlow<NewUserInfoModel> getNewUserInfo() {
        return this.newUserInfo;
    }

    public final StateFlow<NewUserRanksModel> getNewUserRanks() {
        return this.newUserRanks;
    }

    public final StateFlow<NewUserBetStatisticsModel> getNewUserBetStatistics() {
        return this.newUserBetStatistics;
    }

    public final StateFlow<NewUserFollowersModel> getNewUserFollowers() {
        return this.newUserFollowers;
    }

    public final StateFlow<List<NewUserAchievementsModel>> getNewUserAchievements() {
        return this.newUserAchievements;
    }

    public final StateFlow<NewUserFavouritesModel> getNewUserFavourites() {
        return this.newUserFavourites;
    }

    public final StateFlow<List<ChatModel>> getUserChats() {
        return this.userChats;
    }

    public final StateFlow<Boolean> isChatsLoading() {
        return this.isChatsLoading;
    }

    public final StateFlow<Boolean> isChatsLoadingMore() {
        return this.isChatsLoadingMore;
    }

    public final StateFlow<Boolean> getHasMoreChats() {
        return this.hasMoreChats;
    }

    public final StateFlow<ChatModel> getSelectedChat() {
        return this.selectedChat;
    }

    public final StateFlow<List<ExtendedMessageModel>> getChatMessages() {
        return this.chatMessages;
    }

    public final StateFlow<Boolean> isChatMessagesLoading() {
        return this.isChatMessagesLoading;
    }

    public final StateFlow<Boolean> isChatMessagesLoadingMore() {
        return this.isChatMessagesLoadingMore;
    }

    public final StateFlow<Boolean> getHasMoreChatMessages() {
        return this.hasMoreChatMessages;
    }

    public final StateFlow<Boolean> isSendingMessage() {
        return this.isSendingMessage;
    }

    public final StateFlow<List<BaseButtonMatchUIItem>> getBaseTabs() {
        return this.baseTabs;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> getUserInfoLoadFailed() {
        return this.userInfoLoadFailed;
    }

    public final List<UserDetailsTab> getUserTabs() {
        return this._userTabs;
    }

    public final StateFlow<Integer> getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    /* renamed from: getSelectedBaseTabIndex, reason: collision with other method in class */
    public final StateFlow<Integer> m14198getSelectedBaseTabIndex() {
        return this.selectedBaseTabIndex;
    }

    public final StateFlow<List<RankingTimeType>> getRankingTabs() {
        return this.rankingTabs;
    }

    /* renamed from: getSelectedRankingTabIndex, reason: collision with other method in class */
    public final StateFlow<Integer> m14199getSelectedRankingTabIndex() {
        return this.selectedRankingTabIndex;
    }

    public final StateFlow<List<NewUserBattleUiItem>> getAvailableBattles() {
        return this.availableBattles;
    }

    public final StateFlow<List<NewUserBattleUiItem>> getPrivateBattles() {
        return this.privateBattles;
    }

    public final StateFlow<List<NewUserBattleModel>> getStatsBattles() {
        return this.statsBattles;
    }

    public final StateFlow<Boolean> isBattlesLoading() {
        return this.isBattlesLoading;
    }

    public final StateFlow<Boolean> getHasMoreAvailableBattles() {
        return this.hasMoreAvailableBattles;
    }

    public final StateFlow<Boolean> getHasMorePrivateBattles() {
        return this.hasMorePrivateBattles;
    }

    public final StateFlow<Boolean> getHasMoreStatsBattles() {
        return this.hasMoreStatsBattles;
    }

    public final StateFlow<Boolean> isLoadMoreAvailableBattles() {
        return this.isLoadMoreAvailableBattles;
    }

    public final StateFlow<Boolean> isLoadMorePrivateBattles() {
        return this.isLoadMorePrivateBattles;
    }

    public final StateFlow<Boolean> isLoadMoreStatsBattles() {
        return this.isLoadMoreStatsBattles;
    }

    public final StateFlow<List<BattleCountModel>> getBattleCounts() {
        return this.battleCounts;
    }

    public final StateFlow<Boolean> isLoadingBattleCounts() {
        return this.isLoadingBattleCounts;
    }

    public final StateFlow<Integer> getTotalItems() {
        return this.totalItems;
    }

    public final StateFlow<UserProfileStatsResponse> getProfileStats() {
        return this.profileStats;
    }

    public final StateFlow<Boolean> isLoadingProfileStats() {
        return this.isLoadingProfileStats;
    }

    public final StateFlow<CompetitionStatsResponse> getCompetitionStats() {
        final MutableStateFlow<UserProfileStatsResponse> mutableStateFlow = this._profileStats;
        return FlowKt.stateIn(new Flow<CompetitionStatsResponse>() { // from class: org.betup.ui.fragment.user.UserDetailsController$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CompetitionStatsResponse> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: org.betup.ui.fragment.user.UserDetailsController$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "org.betup.ui.fragment.user.UserDetailsController$special$$inlined$map$1$2", f = "UserDetailsController.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: org.betup.ui.fragment.user.UserDetailsController$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                UserProfileStatsResponse userProfileStatsResponse = (UserProfileStatsResponse) obj;
                                CompetitionStatsResponse competitionStats = userProfileStatsResponse != null ? userProfileStatsResponse.getCompetitionStats() : null;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(competitionStats, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), SharingStarted.INSTANCE.getEagerly(), null);
    }

    public final StateFlow<QuizStatsResponse> getQuizStats() {
        final MutableStateFlow<UserProfileStatsResponse> mutableStateFlow = this._profileStats;
        return FlowKt.stateIn(new Flow<QuizStatsResponse>() { // from class: org.betup.ui.fragment.user.UserDetailsController$special$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super QuizStatsResponse> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: org.betup.ui.fragment.user.UserDetailsController$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "org.betup.ui.fragment.user.UserDetailsController$special$$inlined$map$2$2", f = "UserDetailsController.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: org.betup.ui.fragment.user.UserDetailsController$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                UserProfileStatsResponse userProfileStatsResponse = (UserProfileStatsResponse) obj;
                                QuizStatsResponse quizStats = userProfileStatsResponse != null ? userProfileStatsResponse.getQuizStats() : null;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(quizStats, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), SharingStarted.INSTANCE.getEagerly(), null);
    }

    public static /* synthetic */ void initialize$default(UserDetailsController userDetailsController, int i, BaseActivity baseActivity, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        userDetailsController.initialize(i, baseActivity, z, z2);
    }

    public final void initialize(int userId, BaseActivity context, boolean openToMessages, boolean openToRankings) {
        int indexOf;
        Intrinsics.checkNotNullParameter(context, "context");
        this.userId = userId;
        this.context = context;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        this._isLoading.setValue(true);
        if (!EventBus.getDefault().isRegistered(this)) {
            Log.d("UserDetailsController", "Registering for EventBus");
            EventBus.getDefault().register(this);
        } else {
            Log.d("UserDetailsController", "Already registered for EventBus");
        }
        Log.d("UserDetailsController", "EventBus registration status after init: " + EventBus.getDefault().isRegistered(this));
        loadUserData();
        initializeBaseTabs();
        if (openToMessages) {
            selectBaseTab(3);
        } else if (openToRankings && (indexOf = UserDetailsTab.INSTANCE.getAllTabs().indexOf(UserDetailsTab.Ranking.INSTANCE)) >= 0) {
            setSelectedTab(indexOf);
        }
        refreshChats();
        loadAvailableBattlesInitial();
    }

    public final void cleanup() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onFavoritesUpdated(FavoritesUpdatedMessage event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("UserDetailsController", "Received FavoritesUpdatedMessage: type=" + event.getFavouriteType() + ", success=" + event.getSuccess());
        Log.d("UserDetailsController", "EventBus registration status: " + EventBus.getDefault().isRegistered(this));
        Log.d("UserDetailsController", "Controller userId: " + this.userId + ", context: " + this.context);
        Log.d("UserDetailsController", "v7UserFavouritesInteractor injected: " + (this.v7UserFavouritesInteractor != null));
        Log.d("UserDetailsController", "Current favorites state: " + this._newUserFavourites.getValue());
        if (event.getSuccess()) {
            Log.d("UserDetailsController", "Invalidating cache and reloading user favorites for userId: " + this.userId);
            updateFavorites();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onNewMessage(DisplayEventPushMessage event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Bundle data = event.getData();
        if (data != null && NotificationType.fromString(data.getString("type")) == NotificationType.MESSAGE) {
            refreshChats();
            String string = data.getString("userId");
            Long longOrNull = string != null ? StringsKt.toLongOrNull(string) : null;
            ChatModel value = this._selectedChat.getValue();
            if (longOrNull != null) {
                if (Intrinsics.areEqual(value != null ? value.getCorrespondentId() : null, longOrNull)) {
                    refreshActiveChat();
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReturnToLastTab(ReturnToLastTabMessage event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("UserDetailsController", "Received ReturnToLastTabMessage");
        returnToLastSelectedTab();
    }

    public final void updateFavorites() {
        getV7UserFavouritesInteractor().invalidate(this.userId);
        getV7UserFavouritesInteractor().load(this.newUserFavouritesListener, Integer.valueOf(this.userId));
    }

    public final void refreshUserInfo() {
        getV7UserInfoInteractor().invalidate(this.userId);
        getV7UserInfoInteractor().load(this.newUserInfoListener, Integer.valueOf(this.userId));
    }

    public final void onUserCLick(int id) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", id);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.USER_DETAILS, bundle));
    }

    public final void retryLoadUserInfo() {
        this._userInfoLoadFailed.setValue(false);
        getV7UserInfoInteractor().load(this.newUserInfoListener, Integer.valueOf(this.userId));
    }

    private final void loadUserData() {
        this._userInfoLoadFailed.setValue(false);
        getV7UserInfoInteractor().load(this.newUserInfoListener, Integer.valueOf(this.userId));
        getV7UserRanksInteractor().load(this.newUserRanksListener, Integer.valueOf(this.userId));
        getV7UserBetStatisticsInteractor().load(this.newUserBetStatisticsListener, Integer.valueOf(this.userId));
        getV7UserAchievementsInteractor().load(this.newUserAchievementsListener, Integer.valueOf(this.userId));
        getV7UserFavouritesInteractor().load(this.newUserFavouritesListener, Integer.valueOf(this.userId));
        getV7UserRankingStatisticsInteractor().load(this.newUserRankingStatisticsListener, Integer.valueOf(this.userId));
        loadProfileStatistics(this.userId);
    }

    private final void initializeBaseTabs() {
        MutableStateFlow<List<BaseButtonMatchUIItem>> mutableStateFlow = this._baseTabs;
        BaseButtonMatchUIItem[] baseButtonMatchUIItemArr = new BaseButtonMatchUIItem[4];
        baseButtonMatchUIItemArr[0] = new BaseButtonMatchUIItem(R.drawable.profile_ic_selected, R.drawable.profile_ic_unselected, this._selectedBaseTabIndex.getValue().intValue() == 0, R.string.profile, new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit initializeBaseTabs$lambda$2;
                initializeBaseTabs$lambda$2 = UserDetailsController.initializeBaseTabs$lambda$2(UserDetailsController.this);
                return initializeBaseTabs$lambda$2;
            }
        }, false, null, 0.0f, 0.0f, null, 960, null);
        baseButtonMatchUIItemArr[1] = new BaseButtonMatchUIItem(R.drawable.followers_ic_selected, R.drawable.followers_ic_unselected, this._selectedBaseTabIndex.getValue().intValue() == 1, R.string.followers, new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit initializeBaseTabs$lambda$3;
                initializeBaseTabs$lambda$3 = UserDetailsController.initializeBaseTabs$lambda$3(UserDetailsController.this);
                return initializeBaseTabs$lambda$3;
            }
        }, false, null, 0.0f, 0.0f, null, 960, null);
        baseButtonMatchUIItemArr[2] = new BaseButtonMatchUIItem(R.drawable.battles_icon_new_selected, R.drawable.battles_icon_new_unselected, this._selectedBaseTabIndex.getValue().intValue() == 2, R.string.battles, new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit initializeBaseTabs$lambda$4;
                initializeBaseTabs$lambda$4 = UserDetailsController.initializeBaseTabs$lambda$4(UserDetailsController.this);
                return initializeBaseTabs$lambda$4;
            }
        }, false, null, 0.0f, 0.0f, null, 960, null);
        baseButtonMatchUIItemArr[3] = new BaseButtonMatchUIItem(R.drawable.comments_icon_new_selected, R.drawable.comments_icon_new_unselected, this._selectedBaseTabIndex.getValue().intValue() == 3, R.string.messages, new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsController$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit initializeBaseTabs$lambda$5;
                initializeBaseTabs$lambda$5 = UserDetailsController.initializeBaseTabs$lambda$5(UserDetailsController.this);
                return initializeBaseTabs$lambda$5;
            }
        }, false, Alignment.INSTANCE.getTopEnd(), Dp.m7774constructorimpl(-6), 0.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        mutableStateFlow.setValue(CollectionsKt.listOf((Object[]) baseButtonMatchUIItemArr));
        updateMessagesTabIndicator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeBaseTabs$lambda$2(UserDetailsController userDetailsController) {
        userDetailsController.selectBaseTab(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeBaseTabs$lambda$3(UserDetailsController userDetailsController) {
        userDetailsController.selectBaseTab(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeBaseTabs$lambda$4(UserDetailsController userDetailsController) {
        userDetailsController.selectBaseTab(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeBaseTabs$lambda$5(UserDetailsController userDetailsController) {
        userDetailsController.selectBaseTab(3);
        return Unit.INSTANCE;
    }

    private final void initializeRankingTabs(NewUserRankingStatisticsModel rankingStatistics) {
        String str;
        RankingCupType.Bronze placeholderRankingBronze;
        RankingCupType.Silver placeholderRankingSilver;
        RankingCupType.Gold placeholderRankingGold;
        String photoUrl;
        String photoUrl2;
        String photoUrl3;
        RankingCupType.Bronze placeholderRankingBronze2;
        RankingCupType.Silver placeholderRankingSilver2;
        RankingCupType.Gold placeholderRankingGold2;
        String photoUrl4;
        String photoUrl5;
        String str2;
        String photoUrl6;
        RankingCupType.Bronze placeholderRankingBronze3;
        RankingCupType.Silver placeholderRankingSilver3;
        RankingCupType.Gold placeholderRankingGold3;
        String photoUrl7;
        String photoUrl8;
        String photoUrl9;
        List<NewUserRankingItemModel> day = rankingStatistics.getDay();
        if (day == null) {
            day = CollectionsKt.emptyList();
        }
        List<NewUserRankingItemModel> week = rankingStatistics.getWeek();
        if (week == null) {
            week = CollectionsKt.emptyList();
        }
        List<NewUserRankingItemModel> month = rankingStatistics.getMonth();
        if (month == null) {
            month = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (!day.isEmpty()) {
            NewUserRankingItemModel newUserRankingItemModel = (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 0);
            NewUserRankingItemModel newUserRankingItemModel2 = (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 1);
            NewUserRankingItemModel newUserRankingItemModel3 = (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 2);
            ArrayList arrayList2 = arrayList;
            if (newUserRankingItemModel != null) {
                String name = newUserRankingItemModel.getName();
                String photoUrl10 = newUserRankingItemModel.getPhotoUrl();
                String str3 = photoUrl10 == null ? "" : photoUrl10;
                String valueOf = String.valueOf(newUserRankingItemModel.getLevel());
                NewCountryModel country = newUserRankingItemModel.getCountry();
                placeholderRankingBronze3 = new RankingCupType.Bronze(name, str3, valueOf, (country == null || (photoUrl9 = country.getPhotoUrl()) == null) ? "" : photoUrl9, (int) newUserRankingItemModel.getId());
            } else {
                placeholderRankingBronze3 = RankingCupBaseItemKt.placeholderRankingBronze();
            }
            RankingCupType.Bronze bronze = placeholderRankingBronze3;
            if (newUserRankingItemModel2 != null) {
                String name2 = newUserRankingItemModel2.getName();
                String photoUrl11 = newUserRankingItemModel2.getPhotoUrl();
                String str4 = photoUrl11 == null ? "" : photoUrl11;
                String valueOf2 = String.valueOf(newUserRankingItemModel2.getLevel());
                NewCountryModel country2 = newUserRankingItemModel2.getCountry();
                placeholderRankingSilver3 = new RankingCupType.Silver(name2, str4, valueOf2, (country2 == null || (photoUrl8 = country2.getPhotoUrl()) == null) ? "" : photoUrl8, (int) newUserRankingItemModel2.getId());
            } else {
                placeholderRankingSilver3 = RankingCupBaseItemKt.placeholderRankingSilver();
            }
            RankingCupType.Silver silver = placeholderRankingSilver3;
            if (newUserRankingItemModel3 != null) {
                String name3 = newUserRankingItemModel3.getName();
                String photoUrl12 = newUserRankingItemModel3.getPhotoUrl();
                String str5 = photoUrl12 == null ? "" : photoUrl12;
                String valueOf3 = String.valueOf(newUserRankingItemModel3.getLevel());
                NewCountryModel country3 = newUserRankingItemModel3.getCountry();
                placeholderRankingGold3 = new RankingCupType.Gold(name3, str5, valueOf3, (country3 == null || (photoUrl7 = country3.getPhotoUrl()) == null) ? "" : photoUrl7, (int) newUserRankingItemModel3.getId());
            } else {
                placeholderRankingGold3 = RankingCupBaseItemKt.placeholderRankingGold();
            }
            arrayList2.add(new RankingTimeType.Day(bronze, silver, placeholderRankingGold3, (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 3), (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 4), CollectionsKt.drop(day, 5)));
        }
        if (week.isEmpty()) {
            str = "";
        } else {
            NewUserRankingItemModel newUserRankingItemModel4 = (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 0);
            NewUserRankingItemModel newUserRankingItemModel5 = (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 1);
            NewUserRankingItemModel newUserRankingItemModel6 = (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 2);
            ArrayList arrayList3 = arrayList;
            if (newUserRankingItemModel4 != null) {
                String name4 = newUserRankingItemModel4.getName();
                String photoUrl13 = newUserRankingItemModel4.getPhotoUrl();
                String str6 = photoUrl13 == null ? "" : photoUrl13;
                String valueOf4 = String.valueOf(newUserRankingItemModel4.getLevel());
                NewCountryModel country4 = newUserRankingItemModel4.getCountry();
                if (country4 == null || (photoUrl6 = country4.getPhotoUrl()) == null) {
                    str2 = "";
                    str = str2;
                } else {
                    str = "";
                    str2 = photoUrl6;
                }
                placeholderRankingBronze2 = new RankingCupType.Bronze(name4, str6, valueOf4, str2, (int) newUserRankingItemModel4.getId());
            } else {
                str = "";
                placeholderRankingBronze2 = RankingCupBaseItemKt.placeholderRankingBronze();
            }
            RankingCupType.Bronze bronze2 = placeholderRankingBronze2;
            if (newUserRankingItemModel5 != null) {
                String name5 = newUserRankingItemModel5.getName();
                String photoUrl14 = newUserRankingItemModel5.getPhotoUrl();
                String str7 = photoUrl14 == null ? str : photoUrl14;
                String valueOf5 = String.valueOf(newUserRankingItemModel5.getLevel());
                NewCountryModel country5 = newUserRankingItemModel5.getCountry();
                placeholderRankingSilver2 = new RankingCupType.Silver(name5, str7, valueOf5, (country5 == null || (photoUrl5 = country5.getPhotoUrl()) == null) ? str : photoUrl5, (int) newUserRankingItemModel5.getId());
            } else {
                placeholderRankingSilver2 = RankingCupBaseItemKt.placeholderRankingSilver();
            }
            if (newUserRankingItemModel6 != null) {
                String name6 = newUserRankingItemModel6.getName();
                String photoUrl15 = newUserRankingItemModel6.getPhotoUrl();
                String str8 = photoUrl15 == null ? str : photoUrl15;
                String valueOf6 = String.valueOf(newUserRankingItemModel6.getLevel());
                NewCountryModel country6 = newUserRankingItemModel6.getCountry();
                placeholderRankingGold2 = new RankingCupType.Gold(name6, str8, valueOf6, (country6 == null || (photoUrl4 = country6.getPhotoUrl()) == null) ? str : photoUrl4, (int) newUserRankingItemModel6.getId());
            } else {
                placeholderRankingGold2 = RankingCupBaseItemKt.placeholderRankingGold();
            }
            arrayList3.add(new RankingTimeType.Week(bronze2, placeholderRankingSilver2, placeholderRankingGold2, (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 3), (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 4), CollectionsKt.drop(week, 5)));
        }
        if (!month.isEmpty()) {
            NewUserRankingItemModel newUserRankingItemModel7 = (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 0);
            NewUserRankingItemModel newUserRankingItemModel8 = (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 1);
            NewUserRankingItemModel newUserRankingItemModel9 = (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 2);
            ArrayList arrayList4 = arrayList;
            if (newUserRankingItemModel7 != null) {
                String name7 = newUserRankingItemModel7.getName();
                String photoUrl16 = newUserRankingItemModel7.getPhotoUrl();
                String str9 = photoUrl16 == null ? str : photoUrl16;
                String valueOf7 = String.valueOf(newUserRankingItemModel7.getLevel());
                NewCountryModel country7 = newUserRankingItemModel7.getCountry();
                placeholderRankingBronze = new RankingCupType.Bronze(name7, str9, valueOf7, (country7 == null || (photoUrl3 = country7.getPhotoUrl()) == null) ? str : photoUrl3, (int) newUserRankingItemModel7.getId());
            } else {
                placeholderRankingBronze = RankingCupBaseItemKt.placeholderRankingBronze();
            }
            RankingCupType.Bronze bronze3 = placeholderRankingBronze;
            if (newUserRankingItemModel8 != null) {
                String name8 = newUserRankingItemModel8.getName();
                String photoUrl17 = newUserRankingItemModel8.getPhotoUrl();
                String str10 = photoUrl17 == null ? str : photoUrl17;
                String valueOf8 = String.valueOf(newUserRankingItemModel8.getLevel());
                NewCountryModel country8 = newUserRankingItemModel8.getCountry();
                placeholderRankingSilver = new RankingCupType.Silver(name8, str10, valueOf8, (country8 == null || (photoUrl2 = country8.getPhotoUrl()) == null) ? str : photoUrl2, (int) newUserRankingItemModel8.getId());
            } else {
                placeholderRankingSilver = RankingCupBaseItemKt.placeholderRankingSilver();
            }
            if (newUserRankingItemModel9 != null) {
                String name9 = newUserRankingItemModel9.getName();
                String photoUrl18 = newUserRankingItemModel9.getPhotoUrl();
                String str11 = photoUrl18 == null ? str : photoUrl18;
                String valueOf9 = String.valueOf(newUserRankingItemModel9.getLevel());
                NewCountryModel country9 = newUserRankingItemModel9.getCountry();
                placeholderRankingGold = new RankingCupType.Gold(name9, str11, valueOf9, (country9 == null || (photoUrl = country9.getPhotoUrl()) == null) ? str : photoUrl, (int) newUserRankingItemModel9.getId());
            } else {
                placeholderRankingGold = RankingCupBaseItemKt.placeholderRankingGold();
            }
            arrayList4.add(new RankingTimeType.Month(bronze3, placeholderRankingSilver, placeholderRankingGold, (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 3), (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 4), CollectionsKt.drop(month, 5)));
        }
        this._rankingTabs.setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserInfoListener$lambda$16(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            NewUserInfoModel newUserInfoModel = (NewUserInfoModel) fetchedResponseMessage.getModel();
            if (newUserInfoModel != null) {
                userDetailsController._newUserInfo.setValue(newUserInfoModel);
            }
            userDetailsController._userInfoLoadFailed.setValue(false);
        } else {
            userDetailsController._userInfoLoadFailed.setValue(true);
        }
        userDetailsController.updateLoadingState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserRanksListener$lambda$18(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        NewUserRanksModel newUserRanksModel;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && (newUserRanksModel = (NewUserRanksModel) fetchedResponseMessage.getModel()) != null) {
            userDetailsController._newUserRanks.setValue(newUserRanksModel);
        }
        userDetailsController.updateLoadingState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserBetStatisticsListener$lambda$20(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        NewUserBetStatisticsModel newUserBetStatisticsModel;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && (newUserBetStatisticsModel = (NewUserBetStatisticsModel) fetchedResponseMessage.getModel()) != null) {
            userDetailsController._newUserBetStatistics.setValue(newUserBetStatisticsModel);
        }
        userDetailsController.updateLoadingState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserFollowersListener$lambda$22(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        NewUserFollowersModel newUserFollowersModel;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && (newUserFollowersModel = (NewUserFollowersModel) fetchedResponseMessage.getModel()) != null) {
            userDetailsController._newUserFollowers.setValue(newUserFollowersModel);
        }
        userDetailsController.updateLoadingState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserAchievementsListener$lambda$24(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        NewAchievementsResponseModel newAchievementsResponseModel;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && (newAchievementsResponseModel = (NewAchievementsResponseModel) fetchedResponseMessage.getModel()) != null) {
            MutableStateFlow<List<NewUserAchievementsModel>> mutableStateFlow = userDetailsController._newUserAchievements;
            List<NewUserAchievementsModel> items = newAchievementsResponseModel.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            mutableStateFlow.setValue(items);
        }
        userDetailsController.updateLoadingState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserFavouritesListener$lambda$26(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        NewUserFavouritesModel newUserFavouritesModel;
        Log.d("UserDetailsController", "newUserFavouritesListener called: stat=" + fetchedResponseMessage.getStat());
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && (newUserFavouritesModel = (NewUserFavouritesModel) fetchedResponseMessage.getModel()) != null) {
            Log.d("UserDetailsController", "Updating favorites: sports=" + newUserFavouritesModel.getFavouriteSports().size() + ", leagues=" + newUserFavouritesModel.getFavouriteLeagues().size() + ", teams=" + newUserFavouritesModel.getFavouriteTeams().size());
            userDetailsController._newUserFavourites.setValue(newUserFavouritesModel);
        }
        userDetailsController.updateLoadingState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserRankingStatisticsListener$lambda$28(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        NewUserRankingStatisticsModel newUserRankingStatisticsModel;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && (newUserRankingStatisticsModel = (NewUserRankingStatisticsModel) fetchedResponseMessage.getModel()) != null) {
            userDetailsController.initializeRankingTabs(newUserRankingStatisticsModel);
        }
        userDetailsController.updateLoadingState();
    }

    private final void updateLoadingState() {
        this._isLoading.setValue(Boolean.valueOf(!(((this._newUserInfo.getValue() == null && !this._userInfoLoadFailed.getValue().booleanValue()) || this._newUserRanks.getValue() == null || this._newUserBetStatistics.getValue() == null) ? false : true)));
    }

    public final void setSelectedTab(int index) {
        if (index < 0 || index >= this._userTabs.size()) {
            return;
        }
        this._selectedTabIndex.setValue(Integer.valueOf(index));
        if (index == 1) {
            Log.d("UserDetailsController", "Activity tab selected, loading bet history for userId: " + this.userId);
            this.betHistoryController.reloadBetsHistory(this.userId, getBetsListInteractor());
        }
    }

    public final void selectBaseTab(int index) {
        BaseButtonMatchUIItem m14005copyenQ_JUA;
        if (index < 0 || index >= 4) {
            return;
        }
        int intValue = this._selectedBaseTabIndex.getValue().intValue();
        this._selectedBaseTabIndex.setValue(Integer.valueOf(index));
        List<BaseButtonMatchUIItem> value = this._baseTabs.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        int i = 0;
        for (Object obj : value) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            m14005copyenQ_JUA = r10.m14005copyenQ_JUA((r22 & 1) != 0 ? r10.selectedImage : 0, (r22 & 2) != 0 ? r10.unselectedImage : 0, (r22 & 4) != 0 ? r10.isSelected : i == index, (r22 & 8) != 0 ? r10.label : 0, (r22 & 16) != 0 ? r10.onClick : null, (r22 & 32) != 0 ? r10.isActive : false, (r22 & 64) != 0 ? r10.indicatorAlignment : null, (r22 & 128) != 0 ? r10.indicatorOffsetX : 0.0f, (r22 & 256) != 0 ? r10.indicatorOffsetY : 0.0f, (r22 & 512) != 0 ? ((BaseButtonMatchUIItem) obj).tab : null);
            arrayList.add(m14005copyenQ_JUA);
            i = i2;
        }
        this._baseTabs.setValue(arrayList);
        if (index == 1) {
            this.lastSelectedTabBeforeFollowers = intValue;
            Log.d("UserDetailsController", "Followers tab selected, showing dialog for userId: " + this.userId + ", lastTab: " + intValue);
            EventBus.getDefault().post(new DisplayFollowersDialogMessage(this.userId, this.lastSelectedTabBeforeFollowers));
        }
        if (index == 3) {
            ensureChatsLoaded();
        }
    }

    public final void goToMatches() {
        Log.d("UserDetailsController", "Sending FavouriteTypeK.Sports");
        EventBus.getDefault().post(new DisplayEditFavouritesDialogMessage(FavouriteTypeK.Sports.INSTANCE));
    }

    public final void goToMatches(FavouriteTypeK favouriteType) {
        Intrinsics.checkNotNullParameter(favouriteType, "favouriteType");
        Log.d("UserDetailsController", "Sending " + favouriteType);
        EventBus.getDefault().post(new DisplayEditFavouritesDialogMessage(favouriteType));
    }

    public final void ensureChatsLoaded() {
        if (!this._userChats.getValue().isEmpty() || this._isChatsLoading.getValue().booleanValue()) {
            return;
        }
        refreshChats();
    }

    public final void refreshChats() {
        if (this._isChatsLoading.getValue().booleanValue()) {
            return;
        }
        this.pendingChatsRefresh = true;
        this.chatsContinuationToken = null;
        this._hasMoreChats.setValue(true);
        loadChatsInternal(true);
    }

    public final void refreshActiveChat() {
        if (this._selectedChat.getValue() == null || this._isChatMessagesLoading.getValue().booleanValue() || this._isChatMessagesLoadingMore.getValue().booleanValue()) {
            return;
        }
        this._hasMoreChatMessages.setValue(true);
        loadChatMessagesInternal(true);
    }

    public final void loadMoreChats() {
        if (this._isChatsLoading.getValue().booleanValue() || this._isChatsLoadingMore.getValue().booleanValue() || !this._hasMoreChats.getValue().booleanValue()) {
            return;
        }
        loadChatsInternal(false);
    }

    private final void loadChatsInternal(boolean reset) {
        String str;
        Integer intOrNull;
        if (reset) {
            if (this._isChatsLoading.getValue().booleanValue()) {
                return;
            } else {
                this._isChatsLoading.setValue(true);
            }
        } else if (this._isChatsLoadingMore.getValue().booleanValue()) {
            return;
        } else {
            this._isChatsLoadingMore.setValue(true);
        }
        int i = 0;
        if (!reset && (str = this.chatsContinuationToken) != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
            i = intOrNull.intValue();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("continuationToken", i);
        this.pendingChatsRefresh = reset;
        getGetChatsInteractor().load(this.chatsListener, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void chatsListener$lambda$32(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        userDetailsController._isChatsLoading.setValue(false);
        userDetailsController._isChatsLoadingMore.setValue(false);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS) {
            userDetailsController.pendingChatsRefresh = false;
            return;
        }
        PageModel pageModel = (PageModel) fetchedResponseMessage.getModel();
        ArrayList content = pageModel != null ? pageModel.getContent() : null;
        if (content == null) {
            content = CollectionsKt.emptyList();
        }
        if (!userDetailsController.pendingChatsRefresh) {
            List mutableList = CollectionsKt.toMutableList((Collection) userDetailsController._userChats.getValue());
            mutableList.addAll(content);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mutableList) {
                if (hashSet.add(userDetailsController.chatKey((ChatModel) obj))) {
                    arrayList.add(obj);
                }
            }
            content = arrayList;
        }
        userDetailsController._userChats.setValue(CollectionsKt.toList(content));
        userDetailsController.updateMessagesTabIndicator();
        PageModel pageModel2 = (PageModel) fetchedResponseMessage.getModel();
        String continuationToken = pageModel2 != null ? pageModel2.getContinuationToken() : null;
        userDetailsController.chatsContinuationToken = continuationToken;
        String str = continuationToken;
        userDetailsController._hasMoreChats.setValue(Boolean.valueOf(!(str == null || str.length() == 0)));
        userDetailsController.pendingChatsRefresh = false;
    }

    public final void openChat(ChatModel chat) {
        Long correspondentId;
        Intrinsics.checkNotNullParameter(chat, "chat");
        Long correspondentId2 = chat.getCorrespondentId();
        if (correspondentId2 != null) {
            long longValue = correspondentId2.longValue();
            ChatModel value = this._selectedChat.getValue();
            if (value == null || (correspondentId = value.getCorrespondentId()) == null || correspondentId.longValue() != longValue || this._chatMessages.getValue().isEmpty()) {
                ChatModel copyChatModel = copyChatModel(chat);
                copyChatModel.setRead(true);
                this._selectedChat.setValue(copyChatModel);
                markChatAsRead(chat);
                this.messagesContinuationToken = null;
                this.pendingMessagesRefresh = true;
                this._chatMessages.setValue(CollectionsKt.emptyList());
                this._hasMoreChatMessages.setValue(true);
                loadChatMessagesInternal(true);
            }
        }
    }

    public final void closeChat() {
        this._selectedChat.setValue(null);
        this._chatMessages.setValue(CollectionsKt.emptyList());
        this.messagesContinuationToken = null;
        this.pendingMessagesRefresh = false;
        this._hasMoreChatMessages.setValue(true);
    }

    public final void loadMoreMessages() {
        loadChatMessagesInternal(false);
    }

    private final void loadChatMessagesInternal(boolean reset) {
        Long correspondentId;
        ChatModel value = this._selectedChat.getValue();
        if (value == null || (correspondentId = value.getCorrespondentId()) == null) {
            return;
        }
        long longValue = correspondentId.longValue();
        if (reset) {
            if (this._isChatMessagesLoading.getValue().booleanValue()) {
                return;
            }
            this._isChatMessagesLoading.setValue(true);
            this.messagesContinuationToken = null;
            this.pendingMessagesRefresh = true;
        } else if (this._isChatMessagesLoading.getValue().booleanValue() || this._isChatMessagesLoadingMore.getValue().booleanValue() || !this._hasMoreChatMessages.getValue().booleanValue()) {
            return;
        } else {
            this._isChatMessagesLoadingMore.setValue(true);
        }
        Bundle bundle = new Bundle();
        String str = this.messagesContinuationToken;
        if (str != null) {
            bundle.putString("continuationToken", str);
        }
        getGetPrivateMessagesInteractor().load(this.messagesListener, Long.valueOf(longValue), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void messagesListener$lambda$36(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        userDetailsController._isChatMessagesLoading.setValue(false);
        userDetailsController._isChatMessagesLoadingMore.setValue(false);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS) {
            userDetailsController.pendingMessagesRefresh = false;
            return;
        }
        PageModel pageModel = (PageModel) fetchedResponseMessage.getModel();
        List<ExtendedMessageModel> content = pageModel != null ? pageModel.getContent() : null;
        if (content == null) {
            content = CollectionsKt.emptyList();
        }
        MutableStateFlow<List<ExtendedMessageModel>> mutableStateFlow = userDetailsController._chatMessages;
        if (!userDetailsController.pendingMessagesRefresh) {
            List<ExtendedMessageModel> mutableList = CollectionsKt.toMutableList((Collection) mutableStateFlow.getValue());
            mutableList.addAll(content);
            content = mutableList;
        }
        mutableStateFlow.setValue(content);
        PageModel pageModel2 = (PageModel) fetchedResponseMessage.getModel();
        String continuationToken = pageModel2 != null ? pageModel2.getContinuationToken() : null;
        userDetailsController.messagesContinuationToken = continuationToken;
        String str = continuationToken;
        userDetailsController._hasMoreChatMessages.setValue(Boolean.valueOf(!(str == null || str.length() == 0)));
        userDetailsController.pendingMessagesRefresh = false;
    }

    public final void sendMessage(String text) {
        Long correspondentId;
        Intrinsics.checkNotNullParameter(text, "text");
        ChatModel value = this._selectedChat.getValue();
        if (value == null || (correspondentId = value.getCorrespondentId()) == null) {
            return;
        }
        long longValue = correspondentId.longValue();
        String obj = StringsKt.trim((CharSequence) text).toString();
        if (obj.length() == 0 || this._isSendingMessage.getValue().booleanValue()) {
            return;
        }
        this._isSendingMessage.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putString("message", obj);
        getSendPrivateMessagesInteractor().load(this.sendMessageListener, Long.valueOf(longValue), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendMessageListener$lambda$39(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        MessageModel messageModel;
        userDetailsController._isSendingMessage.setValue(false);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && (messageModel = (MessageModel) fetchedResponseMessage.getModel()) != null) {
            ExtendedMessageModel extendedMessageModel = new ExtendedMessageModel();
            extendedMessageModel.setMessage(messageModel);
            userDetailsController._chatMessages.setValue(CollectionsKt.plus((Collection) CollectionsKt.listOf(extendedMessageModel), (Iterable) userDetailsController._chatMessages.getValue()));
            ChatModel value = userDetailsController._selectedChat.getValue();
            if (value != null) {
                value.setLastMessageText(messageModel.getMessage());
                value.setLastMessageDate(messageModel.getSendDate());
                value.setRead(true);
                userDetailsController._selectedChat.setValue(userDetailsController.copyChatModel(value));
            }
            userDetailsController.refreshChats();
        }
    }

    public final void loadUserFollowers() {
        Bundle bundle = new Bundle();
        bundle.putInt("offset", 0);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
        getV7UserFollowersInteractor().load(this.newUserFollowersListener, Integer.valueOf(this.userId), bundle);
    }

    public final int getSelectedBaseTabIndex() {
        return this._selectedBaseTabIndex.getValue().intValue();
    }

    public final void returnToLastSelectedTab() {
        Log.d("UserDetailsController", "Returning to last selected tab: " + this.lastSelectedTabBeforeFollowers);
        selectBaseTab(this.lastSelectedTabBeforeFollowers);
    }

    private final String chatKey(ChatModel chat) {
        String str;
        String l;
        Long chatId = chat.getChatId();
        String str2 = AbstractJsonLexerKt.NULL;
        if (chatId == null || (str = chatId.toString()) == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        Long correspondentId = chat.getCorrespondentId();
        if (correspondentId != null && (l = correspondentId.toString()) != null) {
            str2 = l;
        }
        return str + "-" + str2;
    }

    private final ChatModel copyChatModel(ChatModel chat) {
        ChatModel chatModel = new ChatModel();
        chatModel.setName(chat.getName());
        chatModel.setChatType(chat.getChatType());
        chatModel.setPhotoUrl(chat.getPhotoUrl());
        chatModel.setLastMessageText(chat.getLastMessageText());
        chatModel.setChatId(chat.getChatId());
        chatModel.setCorrespondentId(chat.getCorrespondentId());
        chatModel.setLastMessageDate(chat.getLastMessageDate());
        chatModel.setRead(chat.isRead());
        return chatModel;
    }

    private final void markChatAsRead(ChatModel chat) {
        Long correspondentId = chat.getCorrespondentId();
        Long chatId = chat.getChatId();
        if (this._userChats.getValue().isEmpty()) {
            updateMessagesTabIndicator();
            return;
        }
        List<ChatModel> value = this._userChats.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        for (ChatModel chatModel : value) {
            boolean z = false;
            boolean z2 = correspondentId != null && Intrinsics.areEqual(chatModel.getCorrespondentId(), correspondentId);
            if (chatId != null && Intrinsics.areEqual(chatModel.getChatId(), chatId)) {
                z = true;
            }
            if (z2 || z) {
                chatModel = copyChatModel(chatModel);
                chatModel.setRead(true);
            }
            arrayList.add(chatModel);
        }
        ArrayList arrayList2 = arrayList;
        if (!Intrinsics.areEqual(this._userChats.getValue(), arrayList2)) {
            this._userChats.setValue(arrayList2);
        }
        updateMessagesTabIndicator();
    }

    private final void updateMessagesTabIndicator() {
        boolean z;
        ArrayList arrayList;
        if (this._baseTabs.getValue().isEmpty()) {
            return;
        }
        List<ChatModel> value = this._userChats.getValue();
        int i = 0;
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (!((ChatModel) it.next()).isRead()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        List<BaseButtonMatchUIItem> value2 = this._baseTabs.getValue();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(value2, 10));
        for (Object obj : value2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BaseButtonMatchUIItem baseButtonMatchUIItem = (BaseButtonMatchUIItem) obj;
            if (i == 3) {
                baseButtonMatchUIItem = baseButtonMatchUIItem.m14005copyenQ_JUA((r22 & 1) != 0 ? baseButtonMatchUIItem.selectedImage : 0, (r22 & 2) != 0 ? baseButtonMatchUIItem.unselectedImage : 0, (r22 & 4) != 0 ? baseButtonMatchUIItem.isSelected : false, (r22 & 8) != 0 ? baseButtonMatchUIItem.label : 0, (r22 & 16) != 0 ? baseButtonMatchUIItem.onClick : null, (r22 & 32) != 0 ? baseButtonMatchUIItem.isActive : z, (r22 & 64) != 0 ? baseButtonMatchUIItem.indicatorAlignment : null, (r22 & 128) != 0 ? baseButtonMatchUIItem.indicatorOffsetX : 0.0f, (r22 & 256) != 0 ? baseButtonMatchUIItem.indicatorOffsetY : 0.0f, (r22 & 512) != 0 ? baseButtonMatchUIItem.tab : null);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
            }
            arrayList.add(baseButtonMatchUIItem);
            arrayList2 = arrayList;
            i = i2;
        }
        ArrayList arrayList3 = arrayList2;
        if (Intrinsics.areEqual(this._baseTabs.getValue(), arrayList3)) {
            return;
        }
        this._baseTabs.setValue(arrayList3);
    }

    public final void setSelectedRankingTab(int index) {
        if (index < 0 || index >= 3) {
            return;
        }
        this._selectedRankingTabIndex.setValue(Integer.valueOf(index));
    }

    public final int getSelectedRankingTabIndex() {
        return this._selectedRankingTabIndex.getValue().intValue();
    }

    public final void onBetClick(BetsListModel betModel) {
        Intrinsics.checkNotNullParameter(betModel, "betModel");
        this.betHistoryController.onBetClick(betModel, this.context);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onChallengesChanged(ChallengeAcceptedOrCreatedEvent message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("UserDetailsController", "ChallengesChangedMessage received");
        Log.d("UserDetailsController", "Current available battles count: " + this._availableBattles.getValue().size());
        refreshAllBattles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void availableBattlesListener$lambda$52(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        NewUserBattleCreator newUserBattleCreator;
        NewUserBattleMatch newUserBattleMatch;
        NewUserBattleLeague newUserBattleLeague;
        NewUserBattleTeam newUserBattleTeam;
        NewUserBattleTeam newUserBattleTeam2;
        NewUserBattleSport newUserBattleSport;
        String str;
        String str2;
        String str3;
        String name;
        userDetailsController._isBattlesLoading.setValue(false);
        userDetailsController._isLoadMoreAvailableBattles.setValue(false);
        Log.d("UserDetailsController", "Available battles response received: " + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null));
        Log.d("UserDetailsController", "Response message: " + fetchedResponseMessage);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS) {
            Log.d("UserDetailsController", "Available battles fetch failed: " + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null));
            return;
        }
        NewUserBattlesResponseModel newUserBattlesResponseModel = (NewUserBattlesResponseModel) fetchedResponseMessage.getModel();
        if (newUserBattlesResponseModel == null) {
            return;
        }
        List<NewUserBattleModel> items = newUserBattlesResponseModel.getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        Log.d("UserDetailsController", "Received " + items.size() + " available battles");
        Log.d("UserDetailsController", "Battles model: " + newUserBattlesResponseModel);
        List<NewUserBattleModel> list = items;
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str4 = AbstractJsonLexerKt.NULL;
            if (!hasNext) {
                break;
            }
            NewUserBattleModel newUserBattleModel = (NewUserBattleModel) it.next();
            long id = newUserBattleModel.getId();
            ChallengeState state = newUserBattleModel.getState();
            ChallengeCreator createdBy = newUserBattleModel.getCreatedBy();
            if (createdBy != null && (name = createdBy.getName()) != null) {
                str4 = name;
            }
            Log.d("UserDetailsController", "Battle: id=" + id + ", state=" + state + ", createdBy=" + str4);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (NewUserBattleModel newUserBattleModel2 : list) {
            NewUserBattleMatchModel match = newUserBattleModel2.getMatch();
            if (match != null) {
                long id2 = newUserBattleModel2.getId();
                NewUserBattleLeagueModel league = match.getLeague();
                if (league == null || (str = league.getName()) == null) {
                    str = AbstractJsonLexerKt.NULL;
                }
                NewUserBattleTeamModel homeTeam = match.getHomeTeam();
                if (homeTeam == null || (str2 = homeTeam.getName()) == null) {
                    str2 = AbstractJsonLexerKt.NULL;
                }
                NewUserBattleTeamModel awayTeam = match.getAwayTeam();
                if (awayTeam == null || (str3 = awayTeam.getName()) == null) {
                    str3 = AbstractJsonLexerKt.NULL;
                }
                Log.d("UserDetailsController", "Converting battle: " + id2 + ", league: " + str + ", homeTeam: " + str2 + ", awayTeam: " + str3);
            } else {
                Log.d("UserDetailsController", "Converting battle without match: " + newUserBattleModel2.getId());
            }
            long id3 = newUserBattleModel2.getId();
            long moneyAccept = newUserBattleModel2.getMoneyAccept();
            long enterFee = newUserBattleModel2.getEnterFee();
            long moneyToWin = newUserBattleModel2.getMoneyToWin();
            ChallengeState state2 = newUserBattleModel2.getState();
            ChallengeCreator createdBy2 = newUserBattleModel2.getCreatedBy();
            if (createdBy2 != null) {
                long id4 = createdBy2.getId();
                String name2 = createdBy2.getName();
                String str5 = name2 == null ? "" : name2;
                String email = createdBy2.getEmail();
                String str6 = email == null ? "" : email;
                String photoUrl = createdBy2.getPhotoUrl();
                newUserBattleCreator = new NewUserBattleCreator(id4, str5, str6, photoUrl == null ? "" : photoUrl);
            } else {
                newUserBattleCreator = new NewUserBattleCreator(0L, "", "", "");
            }
            if (match != null) {
                long id5 = match.getId();
                NewUserBattleLeagueModel league2 = match.getLeague();
                if (league2 != null) {
                    Integer id6 = league2.getId();
                    int intValue = id6 != null ? id6.intValue() : 0;
                    String photoUrl2 = league2.getPhotoUrl();
                    if (photoUrl2 == null) {
                        photoUrl2 = "";
                    }
                    String name3 = league2.getName();
                    if (name3 == null) {
                        name3 = "";
                    }
                    newUserBattleLeague = new NewUserBattleLeague(intValue, photoUrl2, name3);
                } else {
                    newUserBattleLeague = new NewUserBattleLeague(0, "", "");
                }
                NewUserBattleTeamModel awayTeam2 = match.getAwayTeam();
                if (awayTeam2 != null) {
                    Integer id7 = awayTeam2.getId();
                    int intValue2 = id7 != null ? id7.intValue() : 0;
                    String photoUrl3 = awayTeam2.getPhotoUrl();
                    if (photoUrl3 == null) {
                        photoUrl3 = "";
                    }
                    String name4 = awayTeam2.getName();
                    if (name4 == null) {
                        name4 = "";
                    }
                    newUserBattleTeam = new NewUserBattleTeam(intValue2, photoUrl3, name4);
                } else {
                    newUserBattleTeam = new NewUserBattleTeam(0, "", "");
                }
                NewUserBattleTeamModel homeTeam2 = match.getHomeTeam();
                if (homeTeam2 != null) {
                    Integer id8 = homeTeam2.getId();
                    int intValue3 = id8 != null ? id8.intValue() : 0;
                    String photoUrl4 = homeTeam2.getPhotoUrl();
                    if (photoUrl4 == null) {
                        photoUrl4 = "";
                    }
                    String name5 = homeTeam2.getName();
                    if (name5 == null) {
                        name5 = "";
                    }
                    newUserBattleTeam2 = new NewUserBattleTeam(intValue3, photoUrl4, name5);
                } else {
                    newUserBattleTeam2 = new NewUserBattleTeam(0, "", "");
                }
                NewUserBattleSportModel sport = match.getSport();
                if (sport != null) {
                    Integer id9 = sport.getId();
                    int intValue4 = id9 != null ? id9.intValue() : 0;
                    String photoUrl5 = sport.getPhotoUrl();
                    String str7 = photoUrl5 == null ? "" : photoUrl5;
                    String name6 = sport.getName();
                    String str8 = name6 == null ? "" : name6;
                    String period = sport.getPeriod();
                    newUserBattleSport = new NewUserBattleSport(intValue4, str7, str8, period == null ? "" : period, sport.getPhotoBackground());
                } else {
                    newUserBattleSport = new NewUserBattleSport(0, "", "", "", null);
                }
                Integer scoreAway = match.getScoreAway();
                int intValue5 = scoreAway != null ? scoreAway.intValue() : 0;
                Integer scoreHome = match.getScoreHome();
                int intValue6 = scoreHome != null ? scoreHome.intValue() : 0;
                String date = match.getDate();
                String str9 = date == null ? "" : date;
                Integer matchState = match.getMatchState();
                int intValue7 = matchState != null ? matchState.intValue() : 0;
                String currentPeriod = match.getCurrentPeriod();
                String str10 = currentPeriod == null ? "" : currentPeriod;
                String currentTime = match.getCurrentTime();
                newUserBattleMatch = new NewUserBattleMatch(id5, newUserBattleLeague, newUserBattleTeam, newUserBattleTeam2, newUserBattleSport, intValue5, intValue6, str9, intValue7, str10, currentTime == null ? "" : currentTime, match.getResultRaw());
            } else {
                newUserBattleMatch = null;
            }
            ChallengeState.NONE participantState = newUserBattleModel2.getParticipantState();
            if (participantState == null) {
                participantState = ChallengeState.NONE.INSTANCE;
            }
            arrayList.add(new NewUserBattleUiItem(id3, moneyAccept, enterFee, moneyToWin, state2, participantState, newUserBattleCreator, newUserBattleMatch));
        }
        ArrayList arrayList2 = arrayList;
        if (userDetailsController.availableBattlesOffset == 0) {
            userDetailsController._availableBattles.setValue(arrayList2);
        } else {
            MutableStateFlow<List<NewUserBattleUiItem>> mutableStateFlow = userDetailsController._availableBattles;
            mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) arrayList2));
        }
        userDetailsController._hasMoreAvailableBattles.setValue(Boolean.valueOf(items.size() >= userDetailsController.battlesLimit));
        Log.d("UserDetailsController", "Available battles - received: " + items.size() + ", limit: " + userDetailsController.battlesLimit + ", hasMore: " + userDetailsController._hasMoreAvailableBattles.getValue() + ", current offset: " + userDetailsController.availableBattlesOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v23 */
    public static final void privateBattlesListener$lambda$60(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        NewUserBattleCreator newUserBattleCreator;
        Iterator it;
        NewUserBattleMatch newUserBattleMatch;
        boolean z;
        NewUserBattleLeague newUserBattleLeague;
        NewUserBattleTeam newUserBattleTeam;
        boolean z2;
        NewUserBattleTeam newUserBattleTeam2;
        NewUserBattleSport newUserBattleSport;
        String str;
        String str2;
        String name;
        boolean z3 = false;
        userDetailsController._isBattlesLoading.setValue(false);
        userDetailsController._isLoadMorePrivateBattles.setValue(false);
        Log.d("UserDetailsController", "Private battles response received: " + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null));
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS) {
            Log.d("UserDetailsController", "Private battles fetch failed: " + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null));
            return;
        }
        NewUserBattlesResponseModel newUserBattlesResponseModel = (NewUserBattlesResponseModel) fetchedResponseMessage.getModel();
        if (newUserBattlesResponseModel == null) {
            return;
        }
        List<NewUserBattleModel> items = newUserBattlesResponseModel.getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        Log.d("UserDetailsController", "Received " + items.size() + " private battles");
        List<NewUserBattleModel> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            NewUserBattleModel newUserBattleModel = (NewUserBattleModel) it2.next();
            NewUserBattleMatchModel match = newUserBattleModel.getMatch();
            if (match != null) {
                long id = newUserBattleModel.getId();
                NewUserBattleLeagueModel league = match.getLeague();
                String str3 = AbstractJsonLexerKt.NULL;
                if (league == null || (str = league.getName()) == null) {
                    str = AbstractJsonLexerKt.NULL;
                }
                NewUserBattleTeamModel homeTeam = match.getHomeTeam();
                if (homeTeam == null || (str2 = homeTeam.getName()) == null) {
                    str2 = AbstractJsonLexerKt.NULL;
                }
                NewUserBattleTeamModel awayTeam = match.getAwayTeam();
                if (awayTeam != null && (name = awayTeam.getName()) != null) {
                    str3 = name;
                }
                Log.d("UserDetailsController", "Converting private battle: " + id + ", league: " + str + ", homeTeam: " + str2 + ", awayTeam: " + str3);
            } else {
                Log.d("UserDetailsController", "Converting private battle without match: " + newUserBattleModel.getId());
            }
            long id2 = newUserBattleModel.getId();
            long moneyAccept = newUserBattleModel.getMoneyAccept();
            long enterFee = newUserBattleModel.getEnterFee();
            long moneyToWin = newUserBattleModel.getMoneyToWin();
            ChallengeState state = newUserBattleModel.getState();
            ChallengeCreator createdBy = newUserBattleModel.getCreatedBy();
            if (createdBy != null) {
                long id3 = createdBy.getId();
                String name2 = createdBy.getName();
                String str4 = name2 == null ? "" : name2;
                String email = createdBy.getEmail();
                String str5 = email == null ? "" : email;
                String photoUrl = createdBy.getPhotoUrl();
                newUserBattleCreator = new NewUserBattleCreator(id3, str4, str5, photoUrl == null ? "" : photoUrl);
            } else {
                newUserBattleCreator = new NewUserBattleCreator(0L, "", "", "");
            }
            if (match != null) {
                long id4 = match.getId();
                NewUserBattleLeagueModel league2 = match.getLeague();
                if (league2 != null) {
                    Integer id5 = league2.getId();
                    ?? r2 = z3;
                    if (id5 != null) {
                        r2 = id5.intValue();
                    }
                    String photoUrl2 = league2.getPhotoUrl();
                    it = it2;
                    String str6 = photoUrl2 == null ? "" : photoUrl2;
                    String name3 = league2.getName();
                    if (name3 == null) {
                        name3 = "";
                    }
                    newUserBattleLeague = new NewUserBattleLeague(r2, str6, name3);
                } else {
                    it = it2;
                    newUserBattleLeague = new NewUserBattleLeague(0, "", "");
                }
                NewUserBattleLeague newUserBattleLeague2 = newUserBattleLeague;
                NewUserBattleTeamModel awayTeam2 = match.getAwayTeam();
                if (awayTeam2 != null) {
                    Integer id6 = awayTeam2.getId();
                    int intValue = id6 != null ? id6.intValue() : 0;
                    String photoUrl3 = awayTeam2.getPhotoUrl();
                    if (photoUrl3 == null) {
                        photoUrl3 = "";
                    }
                    String name4 = awayTeam2.getName();
                    if (name4 == null) {
                        name4 = "";
                    }
                    newUserBattleTeam = new NewUserBattleTeam(intValue, photoUrl3, name4);
                } else {
                    newUserBattleTeam = new NewUserBattleTeam(0, "", "");
                }
                NewUserBattleTeamModel homeTeam2 = match.getHomeTeam();
                if (homeTeam2 != null) {
                    Integer id7 = homeTeam2.getId();
                    int intValue2 = id7 != null ? id7.intValue() : 0;
                    String photoUrl4 = homeTeam2.getPhotoUrl();
                    if (photoUrl4 == null) {
                        photoUrl4 = "";
                    }
                    String name5 = homeTeam2.getName();
                    if (name5 == null) {
                        name5 = "";
                    }
                    newUserBattleTeam2 = new NewUserBattleTeam(intValue2, photoUrl4, name5);
                    z2 = false;
                } else {
                    z2 = false;
                    newUserBattleTeam2 = new NewUserBattleTeam(0, "", "");
                }
                NewUserBattleSportModel sport = match.getSport();
                if (sport != null) {
                    Integer id8 = sport.getId();
                    int intValue3 = id8 != null ? id8.intValue() : z2 ? 1 : 0;
                    String photoUrl5 = sport.getPhotoUrl();
                    String str7 = photoUrl5 == null ? "" : photoUrl5;
                    String name6 = sport.getName();
                    String str8 = name6 == null ? "" : name6;
                    String period = sport.getPeriod();
                    newUserBattleSport = new NewUserBattleSport(intValue3, str7, str8, period == null ? "" : period, sport.getPhotoBackground());
                } else {
                    newUserBattleSport = new NewUserBattleSport(0, "", "", "", null);
                }
                Integer scoreAway = match.getScoreAway();
                int intValue4 = scoreAway != null ? scoreAway.intValue() : z2 ? 1 : 0;
                Integer scoreHome = match.getScoreHome();
                int intValue5 = scoreHome != null ? scoreHome.intValue() : z2 ? 1 : 0;
                String date = match.getDate();
                String str9 = date == null ? "" : date;
                Integer matchState = match.getMatchState();
                int intValue6 = matchState != null ? matchState.intValue() : z2 ? 1 : 0;
                String currentPeriod = match.getCurrentPeriod();
                String str10 = currentPeriod == null ? "" : currentPeriod;
                String currentTime = match.getCurrentTime();
                newUserBattleMatch = new NewUserBattleMatch(id4, newUserBattleLeague2, newUserBattleTeam, newUserBattleTeam2, newUserBattleSport, intValue4, intValue5, str9, intValue6, str10, currentTime == null ? "" : currentTime, match.getResultRaw());
                z = z2;
            } else {
                it = it2;
                newUserBattleMatch = null;
                z = z3;
            }
            ChallengeState.NONE participantState = newUserBattleModel.getParticipantState();
            if (participantState == null) {
                participantState = ChallengeState.NONE.INSTANCE;
            }
            arrayList.add(new NewUserBattleUiItem(id2, moneyAccept, enterFee, moneyToWin, state, participantState, newUserBattleCreator, newUserBattleMatch));
            it2 = it;
            z3 = z;
        }
        ArrayList arrayList2 = arrayList;
        if (userDetailsController.privateBattlesOffset == 0) {
            userDetailsController._privateBattles.setValue(arrayList2);
        } else {
            MutableStateFlow<List<NewUserBattleUiItem>> mutableStateFlow = userDetailsController._privateBattles;
            mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) arrayList2));
        }
        MutableStateFlow<Boolean> mutableStateFlow2 = userDetailsController._hasMorePrivateBattles;
        boolean z4 = z3;
        if (items.size() >= userDetailsController.battlesLimit) {
            z4 = true;
        }
        mutableStateFlow2.setValue(Boolean.valueOf(z4));
        Log.d("UserDetailsController", "Private battles - received: " + items.size() + ", limit: " + userDetailsController.battlesLimit + ", hasMore: " + userDetailsController._hasMorePrivateBattles.getValue() + ", current offset: " + userDetailsController.privateBattlesOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void statsBattlesListener$lambda$62(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        Integer id;
        userDetailsController._isBattlesLoading.setValue(false);
        userDetailsController._isLoadMoreStatsBattles.setValue(false);
        Long l = null;
        l = null;
        Log.d("UserDetailsController", "Stats battles response received: " + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null));
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS) {
            Log.d("UserDetailsController", "Stats battles fetch failed: " + (fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null));
            return;
        }
        V7UserBattlesHistoryResponseModel v7UserBattlesHistoryResponseModel = (V7UserBattlesHistoryResponseModel) fetchedResponseMessage.getModel();
        if (v7UserBattlesHistoryResponseModel == null) {
            return;
        }
        BaseUserModel userModel = userDetailsController.getUserServiceP().getShortProfile().getUserModel();
        if (userModel != null && (id = userModel.getId()) != null) {
            l = Long.valueOf(id.intValue());
        }
        List<V7ChallengeDetailsResponseModel> items = v7UserBattlesHistoryResponseModel.getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        List<V7ChallengeDetailsResponseModel> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(V7ChallengeDetailsMapperKt.toHistoryBattle((V7ChallengeDetailsResponseModel) it.next(), l));
        }
        ArrayList arrayList2 = arrayList;
        Log.d("UserDetailsController", "Received " + arrayList2.size() + " stats battles");
        if (userDetailsController.statsBattlesOffset == 0) {
            userDetailsController._statsBattles.setValue(arrayList2);
            Integer num = userDetailsController.currentParticipantState;
            if (num == null) {
                MutableStateFlow<Integer> mutableStateFlow = userDetailsController._totalItems;
                Integer totalItems = v7UserBattlesHistoryResponseModel.getTotalItems();
                mutableStateFlow.setValue(Integer.valueOf(totalItems != null ? totalItems.intValue() : 0));
                Log.d("UserDetailsController", "Storing totalItems: " + v7UserBattlesHistoryResponseModel.getTotalItems() + " (no filter)");
            } else {
                Log.d("UserDetailsController", "Skipping totalItems update (filtered load with participantState: " + num + ")");
            }
        } else {
            MutableStateFlow<List<NewUserBattleModel>> mutableStateFlow2 = userDetailsController._statsBattles;
            mutableStateFlow2.setValue(CollectionsKt.plus((Collection) mutableStateFlow2.getValue(), (Iterable) arrayList2));
        }
        userDetailsController._hasMoreStatsBattles.setValue(Boolean.valueOf(arrayList2.size() >= userDetailsController.battlesLimit));
        Log.d("UserDetailsController", "Stats battles - received: " + arrayList2.size() + ", limit: " + userDetailsController.battlesLimit + ", hasMore: " + userDetailsController._hasMoreStatsBattles.getValue() + ", current offset: " + userDetailsController.statsBattlesOffset + ", participantState: " + userDetailsController.currentParticipantState);
    }

    public final void loadAvailableBattles() {
        if (this._isBattlesLoading.getValue().booleanValue()) {
            return;
        }
        Log.d("UserDetailsController", "loadAvailableBattles called - offset: " + this.availableBattlesOffset + ", limit: " + this.battlesLimit);
        Log.d("UserDetailsController", "newUserAvailableChallengesInteractor is initialized: " + (this.newUserAvailableChallengesInteractor != null));
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.availableBattlesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserAvailableChallengesInteractor().invalidate(0L);
        getNewUserAvailableChallengesInteractor().load(this.availableBattlesListener, 0L, bundle);
    }

    private final void loadAvailableBattlesInitial() {
        Log.d("UserDetailsController", "loadAvailableBattlesInitial called");
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", 0);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserAvailableChallengesInteractor().invalidate(0L);
        getNewUserAvailableChallengesInteractor().load(this.availableBattlesListener, 0L, bundle);
    }

    public final void loadPrivateBattles() {
        if (this._isBattlesLoading.getValue().booleanValue()) {
            return;
        }
        Log.d("UserDetailsController", "loadPrivateBattles called - offset: " + this.privateBattlesOffset + ", limit: " + this.battlesLimit);
        Log.d("UserDetailsController", "newUserPrivateChallengesInteractor is initialized: " + (this.newUserPrivateChallengesInteractor != null));
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.privateBattlesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserPrivateChallengesInteractor().invalidate(0L);
        getNewUserPrivateChallengesInteractor().load(this.privateBattlesListener, 0L, bundle);
    }

    public final void forceRefreshPrivateBattles() {
        Log.d("UserDetailsController", "forceRefreshPrivateBattles called");
        this.privateBattlesOffset = 0;
        this._hasMorePrivateBattles.setValue(true);
        this._privateBattles.setValue(CollectionsKt.emptyList());
        getNewUserPrivateChallengesInteractor().invalidate(0L);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.privateBattlesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserPrivateChallengesInteractor().load(this.privateBattlesListener, 0L, bundle);
    }

    public static /* synthetic */ void loadStatsBattles$default(UserDetailsController userDetailsController, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        userDetailsController.loadStatsBattles(num);
    }

    public final void loadStatsBattles(Integer participantState) {
        if (this._isBattlesLoading.getValue().booleanValue()) {
            return;
        }
        if (!Intrinsics.areEqual(this.currentParticipantState, participantState)) {
            this.statsBattlesOffset = 0;
            this._statsBattles.setValue(CollectionsKt.emptyList());
            this._hasMoreStatsBattles.setValue(true);
        }
        this.currentParticipantState = participantState;
        Log.d("UserDetailsController", "loadStatsBattles called - offset: " + this.statsBattlesOffset + ", limit: " + this.battlesLimit + ", participantState: " + participantState);
        Log.d("UserDetailsController", "newUserChallengesHistoryInteractor is initialized: " + (this.newUserChallengesHistoryInteractor != null));
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.statsBattlesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        bundle.putInt("participantState", participantState != null ? participantState.intValue() : 0);
        getNewUserChallengesHistoryInteractor().invalidate(0L);
        getNewUserChallengesHistoryInteractor().load(this.statsBattlesListener, 0L, bundle);
    }

    public final void loadMoreAvailableBattles() {
        Log.d("UserDetailsController", "loadMoreAvailableBattles called - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMoreAvailableBattles.getValue());
        if (this._isBattlesLoading.getValue().booleanValue() || !this._hasMoreAvailableBattles.getValue().booleanValue()) {
            Log.d("UserDetailsController", "loadMoreAvailableBattles skipped - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMoreAvailableBattles.getValue());
        } else {
            this._isLoadMoreAvailableBattles.setValue(true);
            int i = this.availableBattlesOffset + this.battlesLimit;
            this.availableBattlesOffset = i;
            Log.d("UserDetailsController", "loadMoreAvailableBattles - new offset: " + i);
            loadAvailableBattles();
        }
    }

    public final void loadMorePrivateBattles() {
        Log.d("UserDetailsController", "loadMorePrivateBattles called - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMorePrivateBattles.getValue());
        if (this._isBattlesLoading.getValue().booleanValue() || !this._hasMorePrivateBattles.getValue().booleanValue()) {
            Log.d("UserDetailsController", "loadMorePrivateBattles skipped - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMorePrivateBattles.getValue());
        } else {
            this._isLoadMorePrivateBattles.setValue(true);
            int i = this.privateBattlesOffset + this.battlesLimit;
            this.privateBattlesOffset = i;
            Log.d("UserDetailsController", "loadMorePrivateBattles - new offset: " + i);
            loadPrivateBattles();
        }
    }

    public final void loadMoreStatsBattles() {
        Log.d("UserDetailsController", "loadMoreStatsBattles called - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMoreStatsBattles.getValue());
        if (this._isBattlesLoading.getValue().booleanValue() || !this._hasMoreStatsBattles.getValue().booleanValue()) {
            Log.d("UserDetailsController", "loadMoreStatsBattles skipped - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMoreStatsBattles.getValue());
        } else {
            this._isLoadMoreStatsBattles.setValue(true);
            int i = this.statsBattlesOffset + this.battlesLimit;
            this.statsBattlesOffset = i;
            Log.d("UserDetailsController", "loadMoreStatsBattles - new offset: " + i + ", participantState: " + this.currentParticipantState);
            loadStatsBattles(this.currentParticipantState);
        }
    }

    public final void refreshAllBattles() {
        this.availableBattlesOffset = 0;
        this.privateBattlesOffset = 0;
        this.statsBattlesOffset = 0;
        this.currentParticipantState = null;
        this._hasMoreAvailableBattles.setValue(true);
        this._hasMorePrivateBattles.setValue(true);
        this._hasMoreStatsBattles.setValue(true);
        this._availableBattles.setValue(CollectionsKt.emptyList());
        this._privateBattles.setValue(CollectionsKt.emptyList());
        this._statsBattles.setValue(CollectionsKt.emptyList());
        getNewUserAvailableChallengesInteractor().invalidate(0L);
        getNewUserPrivateChallengesInteractor().invalidate(0L);
        getNewUserChallengesHistoryInteractor().invalidate(0L);
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.availableBattlesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserAvailableChallengesInteractor().load(this.availableBattlesListener, 0L, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("offset", this.privateBattlesOffset);
        bundle2.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserPrivateChallengesInteractor().load(this.privateBattlesListener, 0L, bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putInt("offset", this.statsBattlesOffset);
        bundle3.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserChallengesHistoryInteractor().load(this.statsBattlesListener, 0L, bundle3);
    }

    public final void loadBattleCounts() {
        if (this._isLoadingBattleCounts.getValue().booleanValue()) {
            return;
        }
        Log.d("UserDetailsController", "Loading battle counts");
        this._isLoadingBattleCounts.setValue(true);
        getNewUserBattleCountsInteractor().load(this.battleCountsListener, 0L, new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void battleCountsListener$lambda$71(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        FetchStat stat;
        userDetailsController._isLoadingBattleCounts.setValue(false);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            List<BattleCountModel> list = (List) fetchedResponseMessage.getModel();
            Log.d("UserDetailsController", "Battle counts loaded: " + list.size());
            MutableStateFlow<List<BattleCountModel>> mutableStateFlow = userDetailsController._battleCounts;
            Intrinsics.checkNotNull(list);
            mutableStateFlow.setValue(list);
            return;
        }
        if (fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.e("UserDetailsController", "Failed to load battle counts: " + str);
    }

    public final int getCountForState(Integer state) {
        Object obj;
        if (state == null) {
            return this._totalItems.getValue().intValue();
        }
        Iterator<T> it = this._battleCounts.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int state2 = ((BattleCountModel) obj).getState();
            if (state != null && state2 == state.intValue()) {
                break;
            }
        }
        BattleCountModel battleCountModel = (BattleCountModel) obj;
        if (battleCountModel != null) {
            return battleCountModel.getCount();
        }
        return 0;
    }

    public final void acceptBattle(long battleId) {
        Long l;
        Object obj;
        NewUserBattleMatch match;
        Log.d("UserDetailsController", "Opening battle dialog with ID: " + battleId);
        Iterator it = CollectionsKt.plus((Collection) this._availableBattles.getValue(), (Iterable) this._privateBattles.getValue()).iterator();
        while (true) {
            l = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((NewUserBattleUiItem) obj).getId() == battleId) {
                    break;
                }
            }
        }
        NewUserBattleUiItem newUserBattleUiItem = (NewUserBattleUiItem) obj;
        if (newUserBattleUiItem != null && (match = newUserBattleUiItem.getMatch()) != null) {
            l = Long.valueOf(match.getId());
        }
        if (l != null) {
            EventBus.getDefault().post(new OpenBetSelectionEvent(l.longValue(), Long.valueOf(battleId), null, null, null, 24, null));
        } else {
            Log.e("UserDetailsController", "Battle not found or missing match data for battleId: " + battleId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openBattlePreview$default(UserDetailsController userDetailsController, long j, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        userDetailsController.openBattlePreview(j, list);
    }

    public final void openBattlePreview(long battleId, List<Long> challengeIds) {
        ArrayList arrayList = null;
        Log.d("UserDetailsController", "Opening battle preview with ID: " + battleId + ", list size: " + (challengeIds != null ? Integer.valueOf(challengeIds.size()) : null));
        EventBus eventBus = EventBus.getDefault();
        Integer valueOf = Integer.valueOf((int) battleId);
        if (challengeIds != null) {
            List<Long> list = challengeIds;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
            }
            arrayList = arrayList2;
        }
        eventBus.post(new OpenChallengePreviewDialog(valueOf, arrayList));
    }

    public final void loadProfileStatistics(int userId) {
        if (this._isLoadingProfileStats.getValue().booleanValue()) {
            return;
        }
        this._isLoadingProfileStats.setValue(true);
        getUserProfileStatisticsInteractor().load(this.profileStatsListener, Integer.valueOf(userId), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void profileStatsListener$lambda$75(UserDetailsController userDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        userDetailsController._isLoadingProfileStats.setValue(false);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            return;
        }
        userDetailsController._profileStats.setValue(fetchedResponseMessage.getModel());
    }
}
