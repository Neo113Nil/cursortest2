package org.betup.ui.fragment.user;

import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.ViewModel;
import com.google.android.material.internal.ViewUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.bus.DisplayFollowersDialogMessage;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.messaging.GetPrivateMessagesInteractor;
import org.betup.model.remote.api.rest.messaging.SendPrivateMessasgesInteractor;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserFavouritesInteractor;
import org.betup.model.remote.api.rest.user.V7UserFollowActionInteractor;
import org.betup.model.remote.api.rest.user.V7UserInfoInteractor;
import org.betup.model.remote.api.rest.user.V7UserRankingStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserRanksInteractor;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.PageModel;
import org.betup.model.remote.entity.achievements.NewAchievementsResponseModel;
import org.betup.model.remote.entity.country.NewCountryModel;
import org.betup.model.remote.entity.followers.NewUserFollowerResponseModel;
import org.betup.model.remote.entity.messaging.ExtendedMessageModel;
import org.betup.model.remote.entity.messaging.MessageModel;
import org.betup.model.remote.entity.user.NewUserAchievementsModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserFavouritesModel;
import org.betup.model.remote.entity.user.NewUserInfoModel;
import org.betup.model.remote.entity.user.NewUserRankingItemModel;
import org.betup.model.remote.entity.user.NewUserRankingStatisticsModel;
import org.betup.model.remote.entity.user.NewUserRanksModel;
import org.betup.ui.base.BaseActivity;
import org.betup.ui.dialogs.events.FollowerSelectedForBattleEvent;
import org.betup.ui.fragment.matches.details.compose.butons.base.BaseButtonMatchUIItem;
import org.betup.ui.fragment.user.UserDetailsTab;
import org.betup.ui.fragment.user.compose.RankingCupBaseItemKt;
import org.betup.ui.fragment.user.compose.RankingCupType;
import org.betup.ui.fragment.user.compose.RankingTimeType;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ForeignUserDetailsController.kt */
@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 Á\u00012\u00020\u0001:\u0002Á\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0093\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u008b\u0001\u001a\u00020u2\b\u0010\u0095\u0001\u001a\u00030\u008d\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020aJ\n\u0010\u0097\u0001\u001a\u00030\u0094\u0001H\u0002J\b\u0010\u0098\u0001\u001a\u00030\u0094\u0001J\u0011\u0010\u0099\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u009a\u0001\u001a\u00020uJ\b\u0010\u009b\u0001\u001a\u00030\u0094\u0001J\b\u0010\u009c\u0001\u001a\u00030\u0094\u0001J\b\u0010\u009d\u0001\u001a\u00030\u0094\u0001J\u0013\u0010\u009e\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u009f\u0001\u001a\u00020aH\u0002J\u0011\u0010¤\u0001\u001a\u00030\u0094\u00012\u0007\u0010¥\u0001\u001a\u00020mJ\n\u0010¯\u0001\u001a\u00030\u0094\u0001H\u0002J\n\u0010°\u0001\u001a\u00030\u0094\u0001H\u0002J\u0013\u0010±\u0001\u001a\u00030\u0094\u00012\u0007\u0010²\u0001\u001a\u00020YH\u0002J\u0011\u0010³\u0001\u001a\u00030\u0094\u00012\u0007\u0010´\u0001\u001a\u00020uJ\b\u0010µ\u0001\u001a\u00030\u0094\u0001J\u0011\u0010¶\u0001\u001a\u00030\u0094\u00012\u0007\u0010´\u0001\u001a\u00020uJ\u0011\u0010·\u0001\u001a\u00030\u0094\u00012\u0007\u0010´\u0001\u001a\u00020uJ\b\u0010¸\u0001\u001a\u00030\u0094\u0001J\n\u0010»\u0001\u001a\u00030\u0094\u0001H\u0002J\b\u0010¼\u0001\u001a\u00030\u0092\u0001J\u0007\u0010½\u0001\u001a\u00020uJ\u0012\u0010¾\u0001\u001a\u00030\u0094\u00012\b\u0010¿\u0001\u001a\u00030À\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0D¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0D¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010FR\u0016\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0D¢\u0006\b\n\u0000\u001a\u0004\bN\u0010FR\u001a\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0P0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0P0D¢\u0006\b\n\u0000\u001a\u0004\bS\u0010FR\u0016\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0D¢\u0006\b\n\u0000\u001a\u0004\bW\u0010FR\u0016\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0D¢\u0006\b\n\u0000\u001a\u0004\b[\u0010FR\u001a\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0P0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0P0D¢\u0006\b\n\u0000\u001a\u0004\b_\u0010FR\u0014\u0010`\u001a\b\u0012\u0004\u0012\u00020a0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020a0D¢\u0006\b\n\u0000\u001a\u0004\bb\u0010FR\u0014\u0010c\u001a\b\u0012\u0004\u0012\u00020a0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020a0D¢\u0006\b\n\u0000\u001a\u0004\bd\u0010FR\u0014\u0010e\u001a\b\u0012\u0004\u0012\u00020a0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020a0D¢\u0006\b\n\u0000\u001a\u0004\bg\u0010FR\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020a0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020a0D¢\u0006\b\n\u0000\u001a\u0004\bi\u0010FR\u0014\u0010j\u001a\b\u0012\u0004\u0012\u00020a0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020a0D¢\u0006\b\n\u0000\u001a\u0004\bk\u0010FR\u0016\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010m0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010m0D¢\u0006\b\n\u0000\u001a\u0004\bo\u0010FR\u001a\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0P0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0P0D¢\u0006\b\n\u0000\u001a\u0004\bs\u0010FR\u0014\u0010t\u001a\b\u0012\u0004\u0012\u00020u0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020u0D¢\u0006\b\n\u0000\u001a\u0004\bw\u0010FR\u0014\u0010x\u001a\b\u0012\u0004\u0012\u00020u0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020u0D¢\u0006\b\n\u0000\u001a\u0004\bz\u0010FR\u001a\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0P0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0P0D¢\u0006\b\n\u0000\u001a\u0004\b~\u0010FR\u0014\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020u0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020u0D¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010FR\u0015\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020a0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020a0D¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010FR\u0015\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020a0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020a0D¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010FR\u0016\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010PX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010P8F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u000f\u0010\u008b\u0001\u001a\u00020uX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010mX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0091\u0001\u001a\u00030\u0092\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010 \u0001\u001a\u0017\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020]0¢\u0001\u0012\u0005\u0012\u00030£\u00010¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010¦\u0001\u001a\u0011\u0012\u0005\u0012\u00030§\u0001\u0012\u0005\u0012\u00030£\u00010¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010¨\u0001\u001a\u000f\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020u0¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010©\u0001\u001a\u000f\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020u0¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ª\u0001\u001a\u000f\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020u0¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010«\u0001\u001a\u0014\u0012\u0005\u0012\u00030¬\u0001\u0012\u0006\u0012\u0004\u0018\u00010u\u0018\u00010¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u00ad\u0001\u001a\u000f\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020u0¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010®\u0001\u001a\u000f\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020u0¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010¹\u0001\u001a\u0010\u0012\u0005\u0012\u00030º\u0001\u0012\u0004\u0012\u00020u0¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Â\u0001"}, d2 = {"Lorg/betup/ui/fragment/user/ForeignUserDetailsController;", "Landroidx/lifecycle/ViewModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "v7UserInfoInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserInfoInteractor;", "getV7UserInfoInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserInfoInteractor;", "setV7UserInfoInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserInfoInteractor;)V", "v7UserRanksInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserRanksInteractor;", "getV7UserRanksInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserRanksInteractor;", "setV7UserRanksInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserRanksInteractor;)V", "v7UserBetStatisticsInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserBetStatisticsInteractor;", "getV7UserBetStatisticsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserBetStatisticsInteractor;", "setV7UserBetStatisticsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserBetStatisticsInteractor;)V", "v7UserAchievementsInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserAchievementsInteractor;", "getV7UserAchievementsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserAchievementsInteractor;", "setV7UserAchievementsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserAchievementsInteractor;)V", "v7UserFavouritesInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserFavouritesInteractor;", "getV7UserFavouritesInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserFavouritesInteractor;", "setV7UserFavouritesInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserFavouritesInteractor;)V", "v7UserRankingStatisticsInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserRankingStatisticsInteractor;", "getV7UserRankingStatisticsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserRankingStatisticsInteractor;", "setV7UserRankingStatisticsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserRankingStatisticsInteractor;)V", "v7UserFollowActionInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserFollowActionInteractor;", "getV7UserFollowActionInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserFollowActionInteractor;", "setV7UserFollowActionInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserFollowActionInteractor;)V", "getPrivateMessagesInteractor", "Lorg/betup/model/remote/api/rest/messaging/GetPrivateMessagesInteractor;", "getGetPrivateMessagesInteractor", "()Lorg/betup/model/remote/api/rest/messaging/GetPrivateMessagesInteractor;", "setGetPrivateMessagesInteractor", "(Lorg/betup/model/remote/api/rest/messaging/GetPrivateMessagesInteractor;)V", "sendPrivateMessagesInteractor", "Lorg/betup/model/remote/api/rest/messaging/SendPrivateMessasgesInteractor;", "getSendPrivateMessagesInteractor", "()Lorg/betup/model/remote/api/rest/messaging/SendPrivateMessasgesInteractor;", "setSendPrivateMessagesInteractor", "(Lorg/betup/model/remote/api/rest/messaging/SendPrivateMessasgesInteractor;)V", "betsListInteractor", "Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;", "getBetsListInteractor", "()Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;", "setBetsListInteractor", "(Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;)V", "_userInfo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/model/remote/entity/user/NewUserInfoModel;", "userInfo", "Lkotlinx/coroutines/flow/StateFlow;", "getUserInfo", "()Lkotlinx/coroutines/flow/StateFlow;", "_userRanks", "Lorg/betup/model/remote/entity/user/NewUserRanksModel;", "userRanks", "getUserRanks", "_userBetStatistics", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "userBetStatistics", "getUserBetStatistics", "_userAchievements", "", "Lorg/betup/model/remote/entity/user/NewUserAchievementsModel;", "userAchievements", "getUserAchievements", "_userFavourites", "Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;", "userFavourites", "getUserFavourites", "_userRankingStatistics", "Lorg/betup/model/remote/entity/user/NewUserRankingStatisticsModel;", "userRankingStatistics", "getUserRankingStatistics", "_conversationMessages", "Lorg/betup/model/remote/entity/messaging/ExtendedMessageModel;", "conversationMessages", "getConversationMessages", "_isConversationLoading", "", "isConversationLoading", "_isConversationLoadingMore", "isConversationLoadingMore", "_hasMoreConversationMessages", "hasMoreConversationMessages", "getHasMoreConversationMessages", "_isSendingMessage", "isSendingMessage", "_isLoading", "isLoading", "_error", "", "error", "getError", "_baseTabs", "Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;", "baseTabs", "getBaseTabs", "_selectedBaseTabIndex", "", "selectedBaseTabIndex", "getSelectedBaseTabIndex", "_selectedTabIndex", "selectedTabIndex", "getSelectedTabIndex", "_rankingTabs", "Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "rankingTabs", "getRankingTabs", "_selectedRankingTabIndex", "selectedRankingTabIndex", "getSelectedRankingTabIndex", "_isFollowing", "isFollowing", "_isFollowLoading", "isFollowLoading", "_userTabs", "Lorg/betup/ui/fragment/user/UserDetailsTab;", "userTabs", "getUserTabs", "()Ljava/util/List;", "foreignUserId", "activity", "Lorg/betup/ui/base/BaseActivity;", "conversationContinuationToken", "conversationInitialized", "pendingConversationReset", "betHistoryController", "Lorg/betup/ui/fragment/user/BetHistoryController;", "initialize", "", "context", "openToMessages", "loadUserData", "refreshUserInfo", "navigateToForeignUser", "userId", "battleWithThisUser", "ensureConversationLoaded", "loadMoreConversationMessages", "loadConversation", "reset", "conversationListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/PageModel;", "", "sendMessageToForeignUser", "text", "sendMessageListener", "Lorg/betup/model/remote/entity/messaging/MessageModel;", "newUserInfoListener", "newUserRanksListener", "newUserBetStatisticsListener", "newUserAchievementsListener", "Lorg/betup/model/remote/entity/achievements/NewAchievementsResponseModel;", "newUserFavouritesListener", "newUserRankingStatisticsListener", "checkIfAllDataLoaded", "initializeBaseTabs", "initializeRankingTabs", "rankingStatistics", "setSelectedTab", "index", "refreshBetStatistics", "selectBaseTab", "setSelectedRankingTab", "toggleFollowUser", "followActionListener", "Lorg/betup/model/remote/entity/followers/NewUserFollowerResponseModel;", "updateFollowersTabIcon", "getBetHistoryController", "getForeignUserId", "onBetClick", "betModel", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ForeignUserDetailsController extends ViewModel {
    private static final int MESSAGES_TAB_INDEX = 3;
    private final MutableStateFlow<List<BaseButtonMatchUIItem>> _baseTabs;
    private final MutableStateFlow<List<ExtendedMessageModel>> _conversationMessages;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Boolean> _hasMoreConversationMessages;
    private final MutableStateFlow<Boolean> _isConversationLoading;
    private final MutableStateFlow<Boolean> _isConversationLoadingMore;
    private final MutableStateFlow<Boolean> _isFollowLoading;
    private final MutableStateFlow<Boolean> _isFollowing;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isSendingMessage;
    private final MutableStateFlow<List<RankingTimeType>> _rankingTabs;
    private final MutableStateFlow<Integer> _selectedBaseTabIndex;
    private final MutableStateFlow<Integer> _selectedRankingTabIndex;
    private final MutableStateFlow<Integer> _selectedTabIndex;
    private final MutableStateFlow<List<NewUserAchievementsModel>> _userAchievements;
    private final MutableStateFlow<NewUserBetStatisticsModel> _userBetStatistics;
    private final MutableStateFlow<NewUserFavouritesModel> _userFavourites;
    private final MutableStateFlow<NewUserInfoModel> _userInfo;
    private final MutableStateFlow<NewUserRankingStatisticsModel> _userRankingStatistics;
    private final MutableStateFlow<NewUserRanksModel> _userRanks;
    private final List<UserDetailsTab> _userTabs;
    private BaseActivity activity;
    private final StateFlow<List<BaseButtonMatchUIItem>> baseTabs;
    private final BetHistoryController betHistoryController;

    @Inject
    public BetsListInteractor betsListInteractor;
    private String conversationContinuationToken;
    private boolean conversationInitialized;
    private final BaseCachedSharedInteractor.OnFetchedListener<PageModel<ExtendedMessageModel>, Long> conversationListener;
    private final StateFlow<List<ExtendedMessageModel>> conversationMessages;
    private final StateFlow<String> error;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserFollowerResponseModel, Integer> followActionListener;
    private int foreignUserId;

    @Inject
    public GetPrivateMessagesInteractor getPrivateMessagesInteractor;
    private final StateFlow<Boolean> hasMoreConversationMessages;
    private final StateFlow<Boolean> isConversationLoading;
    private final StateFlow<Boolean> isConversationLoadingMore;
    private final StateFlow<Boolean> isFollowLoading;
    private final StateFlow<Boolean> isFollowing;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isSendingMessage;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewAchievementsResponseModel, Integer> newUserAchievementsListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBetStatisticsModel, Integer> newUserBetStatisticsListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserFavouritesModel, Integer> newUserFavouritesListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserInfoModel, Integer> newUserInfoListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserRankingStatisticsModel, Integer> newUserRankingStatisticsListener;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserRanksModel, Integer> newUserRanksListener;
    private boolean pendingConversationReset;
    private final StateFlow<List<RankingTimeType>> rankingTabs;
    private final StateFlow<Integer> selectedBaseTabIndex;
    private final StateFlow<Integer> selectedRankingTabIndex;
    private final StateFlow<Integer> selectedTabIndex;
    private final BaseCachedSharedInteractor.OnFetchedListener<MessageModel, Long> sendMessageListener;

    @Inject
    public SendPrivateMessasgesInteractor sendPrivateMessagesInteractor;
    private final StateFlow<List<NewUserAchievementsModel>> userAchievements;
    private final StateFlow<NewUserBetStatisticsModel> userBetStatistics;
    private final StateFlow<NewUserFavouritesModel> userFavourites;
    private final StateFlow<NewUserInfoModel> userInfo;
    private final StateFlow<NewUserRankingStatisticsModel> userRankingStatistics;
    private final StateFlow<NewUserRanksModel> userRanks;

    @Inject
    public V7UserAchievementsInteractor v7UserAchievementsInteractor;

    @Inject
    public V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor;

    @Inject
    public V7UserFavouritesInteractor v7UserFavouritesInteractor;

    @Inject
    public V7UserFollowActionInteractor v7UserFollowActionInteractor;

    @Inject
    public V7UserInfoInteractor v7UserInfoInteractor;

    @Inject
    public V7UserRankingStatisticsInteractor v7UserRankingStatisticsInteractor;

    @Inject
    public V7UserRanksInteractor v7UserRanksInteractor;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public ForeignUserDetailsController() {
        MutableStateFlow<NewUserInfoModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._userInfo = MutableStateFlow;
        this.userInfo = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<NewUserRanksModel> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._userRanks = MutableStateFlow2;
        this.userRanks = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<NewUserBetStatisticsModel> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this._userBetStatistics = MutableStateFlow3;
        this.userBetStatistics = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<List<NewUserAchievementsModel>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._userAchievements = MutableStateFlow4;
        this.userAchievements = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<NewUserFavouritesModel> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._userFavourites = MutableStateFlow5;
        this.userFavourites = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<NewUserRankingStatisticsModel> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this._userRankingStatistics = MutableStateFlow6;
        this.userRankingStatistics = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<List<ExtendedMessageModel>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._conversationMessages = MutableStateFlow7;
        this.conversationMessages = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(false);
        this._isConversationLoading = MutableStateFlow8;
        this.isConversationLoading = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(false);
        this._isConversationLoadingMore = MutableStateFlow9;
        this.isConversationLoadingMore = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreConversationMessages = MutableStateFlow10;
        this.hasMoreConversationMessages = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<Boolean> MutableStateFlow11 = StateFlowKt.MutableStateFlow(false);
        this._isSendingMessage = MutableStateFlow11;
        this.isSendingMessage = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<Boolean> MutableStateFlow12 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow12;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow<String> MutableStateFlow13 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow13;
        this.error = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow<List<BaseButtonMatchUIItem>> MutableStateFlow14 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._baseTabs = MutableStateFlow14;
        this.baseTabs = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow<Integer> MutableStateFlow15 = StateFlowKt.MutableStateFlow(0);
        this._selectedBaseTabIndex = MutableStateFlow15;
        this.selectedBaseTabIndex = FlowKt.asStateFlow(MutableStateFlow15);
        MutableStateFlow<Integer> MutableStateFlow16 = StateFlowKt.MutableStateFlow(0);
        this._selectedTabIndex = MutableStateFlow16;
        this.selectedTabIndex = FlowKt.asStateFlow(MutableStateFlow16);
        MutableStateFlow<List<RankingTimeType>> MutableStateFlow17 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._rankingTabs = MutableStateFlow17;
        this.rankingTabs = FlowKt.asStateFlow(MutableStateFlow17);
        MutableStateFlow<Integer> MutableStateFlow18 = StateFlowKt.MutableStateFlow(0);
        this._selectedRankingTabIndex = MutableStateFlow18;
        this.selectedRankingTabIndex = FlowKt.asStateFlow(MutableStateFlow18);
        MutableStateFlow<Boolean> MutableStateFlow19 = StateFlowKt.MutableStateFlow(false);
        this._isFollowing = MutableStateFlow19;
        this.isFollowing = FlowKt.asStateFlow(MutableStateFlow19);
        MutableStateFlow<Boolean> MutableStateFlow20 = StateFlowKt.MutableStateFlow(false);
        this._isFollowLoading = MutableStateFlow20;
        this.isFollowLoading = FlowKt.asStateFlow(MutableStateFlow20);
        this._userTabs = UserDetailsTab.INSTANCE.getAllTabs();
        this.betHistoryController = new BetHistoryController(true);
        this.conversationListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda7
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ForeignUserDetailsController.conversationListener$lambda$2(ForeignUserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.sendMessageListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda8
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ForeignUserDetailsController.sendMessageListener$lambda$4(ForeignUserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserInfoListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda9
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ForeignUserDetailsController.newUserInfoListener$lambda$7(ForeignUserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserRanksListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda10
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ForeignUserDetailsController.newUserRanksListener$lambda$9(ForeignUserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserBetStatisticsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda11
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ForeignUserDetailsController.newUserBetStatisticsListener$lambda$11(ForeignUserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserAchievementsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda12
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ForeignUserDetailsController.newUserAchievementsListener$lambda$13(ForeignUserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserFavouritesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ForeignUserDetailsController.newUserFavouritesListener$lambda$15(ForeignUserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.newUserRankingStatisticsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ForeignUserDetailsController.newUserRankingStatisticsListener$lambda$17(ForeignUserDetailsController.this, fetchedResponseMessage);
            }
        };
        this.followActionListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda3
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ForeignUserDetailsController.followActionListener$lambda$36(ForeignUserDetailsController.this, fetchedResponseMessage);
            }
        };
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

    public final V7UserFollowActionInteractor getV7UserFollowActionInteractor() {
        V7UserFollowActionInteractor v7UserFollowActionInteractor = this.v7UserFollowActionInteractor;
        if (v7UserFollowActionInteractor != null) {
            return v7UserFollowActionInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserFollowActionInteractor");
        return null;
    }

    public final void setV7UserFollowActionInteractor(V7UserFollowActionInteractor v7UserFollowActionInteractor) {
        Intrinsics.checkNotNullParameter(v7UserFollowActionInteractor, "<set-?>");
        this.v7UserFollowActionInteractor = v7UserFollowActionInteractor;
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

    public final StateFlow<NewUserInfoModel> getUserInfo() {
        return this.userInfo;
    }

    public final StateFlow<NewUserRanksModel> getUserRanks() {
        return this.userRanks;
    }

    public final StateFlow<NewUserBetStatisticsModel> getUserBetStatistics() {
        return this.userBetStatistics;
    }

    public final StateFlow<List<NewUserAchievementsModel>> getUserAchievements() {
        return this.userAchievements;
    }

    public final StateFlow<NewUserFavouritesModel> getUserFavourites() {
        return this.userFavourites;
    }

    public final StateFlow<NewUserRankingStatisticsModel> getUserRankingStatistics() {
        return this.userRankingStatistics;
    }

    public final StateFlow<List<ExtendedMessageModel>> getConversationMessages() {
        return this.conversationMessages;
    }

    public final StateFlow<Boolean> isConversationLoading() {
        return this.isConversationLoading;
    }

    public final StateFlow<Boolean> isConversationLoadingMore() {
        return this.isConversationLoadingMore;
    }

    public final StateFlow<Boolean> getHasMoreConversationMessages() {
        return this.hasMoreConversationMessages;
    }

    public final StateFlow<Boolean> isSendingMessage() {
        return this.isSendingMessage;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final StateFlow<List<BaseButtonMatchUIItem>> getBaseTabs() {
        return this.baseTabs;
    }

    public final StateFlow<Integer> getSelectedBaseTabIndex() {
        return this.selectedBaseTabIndex;
    }

    public final StateFlow<Integer> getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final StateFlow<List<RankingTimeType>> getRankingTabs() {
        return this.rankingTabs;
    }

    public final StateFlow<Integer> getSelectedRankingTabIndex() {
        return this.selectedRankingTabIndex;
    }

    public final StateFlow<Boolean> isFollowing() {
        return this.isFollowing;
    }

    public final StateFlow<Boolean> isFollowLoading() {
        return this.isFollowLoading;
    }

    public final List<UserDetailsTab> getUserTabs() {
        return this._userTabs;
    }

    /* compiled from: ForeignUserDetailsController.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/fragment/user/ForeignUserDetailsController$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "MESSAGES_TAB_INDEX", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void initialize$default(ForeignUserDetailsController foreignUserDetailsController, int i, BaseActivity baseActivity, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        foreignUserDetailsController.initialize(i, baseActivity, z);
    }

    public final void initialize(int foreignUserId, BaseActivity context, boolean openToMessages) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.foreignUserId = foreignUserId;
        this.activity = context;
        initializeBaseTabs();
        if (openToMessages) {
            selectBaseTab(3);
        }
        loadUserData();
    }

    private final void loadUserData() {
        this._isLoading.setValue(true);
        getV7UserInfoInteractor().load(this.newUserInfoListener, Integer.valueOf(this.foreignUserId));
        getV7UserRanksInteractor().load(this.newUserRanksListener, Integer.valueOf(this.foreignUserId));
        getV7UserBetStatisticsInteractor().load(this.newUserBetStatisticsListener, Integer.valueOf(this.foreignUserId));
        getV7UserAchievementsInteractor().load(this.newUserAchievementsListener, Integer.valueOf(this.foreignUserId));
        getV7UserFavouritesInteractor().load(this.newUserFavouritesListener, Integer.valueOf(this.foreignUserId));
        getV7UserRankingStatisticsInteractor().load(this.newUserRankingStatisticsListener, Integer.valueOf(this.foreignUserId));
    }

    public final void refreshUserInfo() {
        getV7UserInfoInteractor().invalidate(this.foreignUserId);
        getV7UserInfoInteractor().load(this.newUserInfoListener, Integer.valueOf(this.foreignUserId));
    }

    public final void navigateToForeignUser(int userId) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", userId);
        bundle.putBoolean("return", false);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.USER_DETAILS, bundle));
    }

    public final void battleWithThisUser() {
        String str;
        String photoUrl;
        Log.d("ForeignUserDetailsController", "battleWithThisUser called for user: " + this.foreignUserId);
        NewUserInfoModel value = this.userInfo.getValue();
        String name = value != null ? value.getName() : null;
        NewUserInfoModel value2 = this.userInfo.getValue();
        Log.d("ForeignUserDetailsController", "User info: name=" + name + ", photoUrl=" + (value2 != null ? value2.getPhotoUrl() : null));
        long j = this.foreignUserId;
        NewUserInfoModel value3 = this.userInfo.getValue();
        String str2 = "";
        if (value3 == null || (str = value3.getName()) == null) {
            str = "";
        }
        NewUserInfoModel value4 = this.userInfo.getValue();
        if (value4 != null && (photoUrl = value4.getPhotoUrl()) != null) {
            str2 = photoUrl;
        }
        FollowerSelectedForBattleEvent followerSelectedForBattleEvent = new FollowerSelectedForBattleEvent(j, str, str2);
        Log.d("ForeignUserDetailsController", "Posting FollowerSelectedForBattleEvent: " + followerSelectedForBattleEvent);
        EventBus.getDefault().post(followerSelectedForBattleEvent);
        Log.d("ForeignUserDetailsController", "Event posted successfully");
    }

    public final void ensureConversationLoaded() {
        if (this.conversationInitialized || this._isConversationLoading.getValue().booleanValue()) {
            return;
        }
        loadConversation(true);
    }

    public final void loadMoreConversationMessages() {
        loadConversation(false);
    }

    private final void loadConversation(boolean reset) {
        if (this.foreignUserId == 0) {
            return;
        }
        if (reset) {
            if (this._isConversationLoading.getValue().booleanValue()) {
                return;
            }
            this._isConversationLoading.setValue(true);
            this.conversationContinuationToken = null;
        } else if (this._isConversationLoading.getValue().booleanValue() || this._isConversationLoadingMore.getValue().booleanValue() || !this._hasMoreConversationMessages.getValue().booleanValue()) {
            return;
        } else {
            this._isConversationLoadingMore.setValue(true);
        }
        this.pendingConversationReset = reset;
        Bundle bundle = new Bundle();
        String str = this.conversationContinuationToken;
        if (str != null) {
            bundle.putString("continuationToken", str);
        }
        getGetPrivateMessagesInteractor().load(this.conversationListener, Long.valueOf(this.foreignUserId), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void conversationListener$lambda$2(ForeignUserDetailsController foreignUserDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        foreignUserDetailsController._isConversationLoading.setValue(false);
        foreignUserDetailsController._isConversationLoadingMore.setValue(false);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS) {
            foreignUserDetailsController.pendingConversationReset = false;
            return;
        }
        PageModel pageModel = (PageModel) fetchedResponseMessage.getModel();
        List<ExtendedMessageModel> content = pageModel != null ? pageModel.getContent() : null;
        if (content == null) {
            content = CollectionsKt.emptyList();
        }
        MutableStateFlow<List<ExtendedMessageModel>> mutableStateFlow = foreignUserDetailsController._conversationMessages;
        if (!foreignUserDetailsController.pendingConversationReset) {
            List<ExtendedMessageModel> mutableList = CollectionsKt.toMutableList((Collection) mutableStateFlow.getValue());
            mutableList.addAll(content);
            content = mutableList;
        }
        mutableStateFlow.setValue(content);
        PageModel pageModel2 = (PageModel) fetchedResponseMessage.getModel();
        String continuationToken = pageModel2 != null ? pageModel2.getContinuationToken() : null;
        foreignUserDetailsController.conversationContinuationToken = continuationToken;
        String str = continuationToken;
        foreignUserDetailsController._hasMoreConversationMessages.setValue(Boolean.valueOf(!(str == null || str.length() == 0)));
        foreignUserDetailsController.conversationInitialized = true;
        foreignUserDetailsController.pendingConversationReset = false;
    }

    public final void sendMessageToForeignUser(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String obj = StringsKt.trim((CharSequence) text).toString();
        if (obj.length() == 0 || this._isSendingMessage.getValue().booleanValue() || this.foreignUserId == 0) {
            return;
        }
        this._isSendingMessage.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putString("message", obj);
        getSendPrivateMessagesInteractor().load(this.sendMessageListener, Long.valueOf(this.foreignUserId), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendMessageListener$lambda$4(ForeignUserDetailsController foreignUserDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        MessageModel messageModel;
        foreignUserDetailsController._isSendingMessage.setValue(false);
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && (messageModel = (MessageModel) fetchedResponseMessage.getModel()) != null) {
            ExtendedMessageModel extendedMessageModel = new ExtendedMessageModel();
            extendedMessageModel.setMessage(messageModel);
            foreignUserDetailsController._conversationMessages.setValue(CollectionsKt.plus((Collection) CollectionsKt.listOf(extendedMessageModel), (Iterable) foreignUserDetailsController._conversationMessages.getValue()));
            foreignUserDetailsController.conversationInitialized = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserInfoListener$lambda$7(ForeignUserDetailsController foreignUserDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            NewUserInfoModel newUserInfoModel = (NewUserInfoModel) fetchedResponseMessage.getModel();
            if (newUserInfoModel != null) {
                foreignUserDetailsController._userInfo.setValue(newUserInfoModel);
                Integer following = newUserInfoModel.getFollowing();
                if (following != null) {
                    foreignUserDetailsController._isFollowing.setValue(Boolean.valueOf(following.intValue() == 1));
                    foreignUserDetailsController.updateFollowersTabIcon();
                }
            }
        } else {
            foreignUserDetailsController._error.setValue("Failed to load user info");
        }
        foreignUserDetailsController.checkIfAllDataLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserRanksListener$lambda$9(ForeignUserDetailsController foreignUserDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            NewUserRanksModel newUserRanksModel = (NewUserRanksModel) fetchedResponseMessage.getModel();
            if (newUserRanksModel != null) {
                foreignUserDetailsController._userRanks.setValue(newUserRanksModel);
            }
        } else {
            foreignUserDetailsController._error.setValue("Failed to load user ranks");
        }
        foreignUserDetailsController.checkIfAllDataLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserBetStatisticsListener$lambda$11(ForeignUserDetailsController foreignUserDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            NewUserBetStatisticsModel newUserBetStatisticsModel = (NewUserBetStatisticsModel) fetchedResponseMessage.getModel();
            if (newUserBetStatisticsModel != null) {
                foreignUserDetailsController._userBetStatistics.setValue(newUserBetStatisticsModel);
            }
        } else {
            foreignUserDetailsController._error.setValue("Failed to load user bet statistics");
        }
        foreignUserDetailsController.checkIfAllDataLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserAchievementsListener$lambda$13(ForeignUserDetailsController foreignUserDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            NewAchievementsResponseModel newAchievementsResponseModel = (NewAchievementsResponseModel) fetchedResponseMessage.getModel();
            if (newAchievementsResponseModel != null) {
                MutableStateFlow<List<NewUserAchievementsModel>> mutableStateFlow = foreignUserDetailsController._userAchievements;
                List<NewUserAchievementsModel> items = newAchievementsResponseModel.getItems();
                Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
                mutableStateFlow.setValue(items);
            }
        } else {
            foreignUserDetailsController._error.setValue("Failed to load user achievements");
        }
        foreignUserDetailsController.checkIfAllDataLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserFavouritesListener$lambda$15(ForeignUserDetailsController foreignUserDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            NewUserFavouritesModel newUserFavouritesModel = (NewUserFavouritesModel) fetchedResponseMessage.getModel();
            if (newUserFavouritesModel != null) {
                foreignUserDetailsController._userFavourites.setValue(newUserFavouritesModel);
            }
        } else {
            foreignUserDetailsController._error.setValue("Failed to load user favourites");
        }
        foreignUserDetailsController.checkIfAllDataLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newUserRankingStatisticsListener$lambda$17(ForeignUserDetailsController foreignUserDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            NewUserRankingStatisticsModel newUserRankingStatisticsModel = (NewUserRankingStatisticsModel) fetchedResponseMessage.getModel();
            if (newUserRankingStatisticsModel != null) {
                foreignUserDetailsController._userRankingStatistics.setValue(newUserRankingStatisticsModel);
                foreignUserDetailsController.initializeRankingTabs(newUserRankingStatisticsModel);
            }
        } else {
            foreignUserDetailsController._error.setValue("Failed to load user ranking statistics");
        }
        foreignUserDetailsController.checkIfAllDataLoaded();
    }

    private final void checkIfAllDataLoaded() {
        if (this._userInfo.getValue() == null || this._userRanks.getValue() == null || this._userBetStatistics.getValue() == null || this._userAchievements.getValue() == null || this._userFavourites.getValue() == null || this._userRankingStatistics.getValue() == null) {
            return;
        }
        this._isLoading.setValue(false);
    }

    private final void initializeBaseTabs() {
        MutableStateFlow<List<BaseButtonMatchUIItem>> mutableStateFlow = this._baseTabs;
        BaseButtonMatchUIItem[] baseButtonMatchUIItemArr = new BaseButtonMatchUIItem[4];
        baseButtonMatchUIItemArr[0] = new BaseButtonMatchUIItem(R.drawable.profile_ic_selected, R.drawable.profile_ic_unselected, this._selectedBaseTabIndex.getValue().intValue() == 0, R.string.profile, new Function0() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit initializeBaseTabs$lambda$18;
                initializeBaseTabs$lambda$18 = ForeignUserDetailsController.initializeBaseTabs$lambda$18(ForeignUserDetailsController.this);
                return initializeBaseTabs$lambda$18;
            }
        }, false, null, 0.0f, 0.0f, null, 960, null);
        baseButtonMatchUIItemArr[1] = new BaseButtonMatchUIItem(R.drawable.followers_ic_selected, R.drawable.followers_ic_unselected, this._isFollowing.getValue().booleanValue(), this._isFollowing.getValue().booleanValue() ? R.string.following : R.string.follow, new Function0() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit initializeBaseTabs$lambda$19;
                initializeBaseTabs$lambda$19 = ForeignUserDetailsController.initializeBaseTabs$lambda$19(ForeignUserDetailsController.this);
                return initializeBaseTabs$lambda$19;
            }
        }, false, null, 0.0f, 0.0f, null, 960, null);
        baseButtonMatchUIItemArr[2] = new BaseButtonMatchUIItem(R.drawable.battles_icon_new_selected, R.drawable.battles_icon_new_unselected, this._selectedBaseTabIndex.getValue().intValue() == 2, R.string.battles, new Function0() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit initializeBaseTabs$lambda$20;
                initializeBaseTabs$lambda$20 = ForeignUserDetailsController.initializeBaseTabs$lambda$20(ForeignUserDetailsController.this);
                return initializeBaseTabs$lambda$20;
            }
        }, false, null, 0.0f, 0.0f, null, 960, null);
        baseButtonMatchUIItemArr[3] = new BaseButtonMatchUIItem(R.drawable.comments_icon_new_selected, R.drawable.comments_icon_new_unselected, this._selectedBaseTabIndex.getValue().intValue() == 3, R.string.messages, new Function0() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit initializeBaseTabs$lambda$21;
                initializeBaseTabs$lambda$21 = ForeignUserDetailsController.initializeBaseTabs$lambda$21(ForeignUserDetailsController.this);
                return initializeBaseTabs$lambda$21;
            }
        }, false, Alignment.INSTANCE.getTopEnd(), Dp.m7774constructorimpl(-6), 0.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        mutableStateFlow.setValue(CollectionsKt.listOf((Object[]) baseButtonMatchUIItemArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeBaseTabs$lambda$18(ForeignUserDetailsController foreignUserDetailsController) {
        foreignUserDetailsController.selectBaseTab(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeBaseTabs$lambda$19(ForeignUserDetailsController foreignUserDetailsController) {
        foreignUserDetailsController.toggleFollowUser();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeBaseTabs$lambda$20(ForeignUserDetailsController foreignUserDetailsController) {
        foreignUserDetailsController.selectBaseTab(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeBaseTabs$lambda$21(ForeignUserDetailsController foreignUserDetailsController) {
        foreignUserDetailsController.selectBaseTab(3);
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
        ArrayList arrayList = new ArrayList();
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
        if (!day.isEmpty()) {
            NewUserRankingItemModel newUserRankingItemModel = (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 0);
            NewUserRankingItemModel newUserRankingItemModel2 = (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 1);
            NewUserRankingItemModel newUserRankingItemModel3 = (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 2);
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
            arrayList.add(new RankingTimeType.Day(bronze, silver, placeholderRankingGold3, (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 3), (NewUserRankingItemModel) CollectionsKt.getOrNull(day, 4), CollectionsKt.drop(day, 5)));
        }
        if (week.isEmpty()) {
            str = "";
        } else {
            NewUserRankingItemModel newUserRankingItemModel4 = (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 0);
            NewUserRankingItemModel newUserRankingItemModel5 = (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 1);
            NewUserRankingItemModel newUserRankingItemModel6 = (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 2);
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
            arrayList.add(new RankingTimeType.Week(bronze2, placeholderRankingSilver2, placeholderRankingGold2, (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 3), (NewUserRankingItemModel) CollectionsKt.getOrNull(week, 4), CollectionsKt.drop(week, 5)));
        }
        if (!month.isEmpty()) {
            NewUserRankingItemModel newUserRankingItemModel7 = (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 0);
            NewUserRankingItemModel newUserRankingItemModel8 = (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 1);
            NewUserRankingItemModel newUserRankingItemModel9 = (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 2);
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
            arrayList.add(new RankingTimeType.Month(bronze3, placeholderRankingSilver, placeholderRankingGold, (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 3), (NewUserRankingItemModel) CollectionsKt.getOrNull(month, 4), CollectionsKt.drop(month, 5)));
        }
        this._rankingTabs.setValue(arrayList);
    }

    public final void setSelectedTab(int index) {
        List<UserDetailsTab> list = this._userTabs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((UserDetailsTab) obj) instanceof UserDetailsTab.Activity)) {
                arrayList.add(obj);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsController$setSelectedTab$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int i;
                UserDetailsTab userDetailsTab = (UserDetailsTab) t;
                int i2 = 3;
                if (userDetailsTab instanceof UserDetailsTab.Stats) {
                    i = 0;
                } else if (userDetailsTab instanceof UserDetailsTab.Bets) {
                    i = 1;
                } else if (userDetailsTab instanceof UserDetailsTab.About) {
                    i = 2;
                } else {
                    i = userDetailsTab instanceof UserDetailsTab.Ranking ? 3 : 4;
                }
                Integer valueOf = Integer.valueOf(i);
                UserDetailsTab userDetailsTab2 = (UserDetailsTab) t2;
                if (userDetailsTab2 instanceof UserDetailsTab.Stats) {
                    i2 = 0;
                } else if (userDetailsTab2 instanceof UserDetailsTab.Bets) {
                    i2 = 1;
                } else if (userDetailsTab2 instanceof UserDetailsTab.About) {
                    i2 = 2;
                } else if (!(userDetailsTab2 instanceof UserDetailsTab.Ranking)) {
                    i2 = 4;
                }
                return ComparisonsKt.compareValues(valueOf, Integer.valueOf(i2));
            }
        });
        if (index < 0 || index >= sortedWith.size()) {
            return;
        }
        this._selectedTabIndex.setValue(Integer.valueOf(index));
        if (((UserDetailsTab) CollectionsKt.getOrNull(sortedWith, index)) instanceof UserDetailsTab.Bets) {
            Log.d("ForeignUserDetailsController", "Bets tab selected, loading bet history for userId: " + this.foreignUserId);
            this.betHistoryController.reloadBetsHistory(this.foreignUserId, getBetsListInteractor());
        }
    }

    public final void refreshBetStatistics() {
        getV7UserBetStatisticsInteractor().invalidate(this.foreignUserId);
        getV7UserBetStatisticsInteractor().load(this.newUserBetStatisticsListener, Integer.valueOf(this.foreignUserId));
    }

    public final void selectBaseTab(int index) {
        if (index < 0 || index >= 4) {
            return;
        }
        this._selectedBaseTabIndex.setValue(Integer.valueOf(index));
        List<BaseButtonMatchUIItem> value = this._baseTabs.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        int i = 0;
        for (Object obj : value) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BaseButtonMatchUIItem baseButtonMatchUIItem = (BaseButtonMatchUIItem) obj;
            if (i != 1) {
                baseButtonMatchUIItem = baseButtonMatchUIItem.m14005copyenQ_JUA((r22 & 1) != 0 ? baseButtonMatchUIItem.selectedImage : 0, (r22 & 2) != 0 ? baseButtonMatchUIItem.unselectedImage : 0, (r22 & 4) != 0 ? baseButtonMatchUIItem.isSelected : i == index, (r22 & 8) != 0 ? baseButtonMatchUIItem.label : 0, (r22 & 16) != 0 ? baseButtonMatchUIItem.onClick : null, (r22 & 32) != 0 ? baseButtonMatchUIItem.isActive : false, (r22 & 64) != 0 ? baseButtonMatchUIItem.indicatorAlignment : null, (r22 & 128) != 0 ? baseButtonMatchUIItem.indicatorOffsetX : 0.0f, (r22 & 256) != 0 ? baseButtonMatchUIItem.indicatorOffsetY : 0.0f, (r22 & 512) != 0 ? baseButtonMatchUIItem.tab : null);
            }
            arrayList.add(baseButtonMatchUIItem);
            i = i2;
        }
        this._baseTabs.setValue(arrayList);
        if (index == 1) {
            Log.d("ForeignUserDetailsController", "Followers tab selected, showing dialog for userId: " + this.foreignUserId);
            EventBus.getDefault().post(new DisplayFollowersDialogMessage(this.foreignUserId, 0));
        }
        if (index == 3) {
            ensureConversationLoaded();
        }
    }

    public final void setSelectedRankingTab(int index) {
        if (index < 0 || index >= this._rankingTabs.getValue().size()) {
            return;
        }
        this._selectedRankingTabIndex.setValue(Integer.valueOf(index));
    }

    public final void toggleFollowUser() {
        if (this._isFollowLoading.getValue().booleanValue()) {
            return;
        }
        this._isFollowLoading.setValue(true);
        getV7UserFollowActionInteractor().load(this.followActionListener, Integer.valueOf(this.foreignUserId), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void followActionListener$lambda$36(ForeignUserDetailsController foreignUserDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        String string;
        boolean z = false;
        foreignUserDetailsController._isFollowLoading.setValue(false);
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            NewUserFollowerResponseModel newUserFollowerResponseModel = (NewUserFollowerResponseModel) fetchedResponseMessage.getModel();
            if (newUserFollowerResponseModel != null) {
                MutableStateFlow<Boolean> mutableStateFlow = foreignUserDetailsController._isFollowing;
                Integer following = newUserFollowerResponseModel.getFollowing();
                if (following != null && following.intValue() == 1) {
                    z = true;
                }
                mutableStateFlow.setValue(Boolean.valueOf(z));
                foreignUserDetailsController.updateFollowersTabIcon();
                NewUserInfoModel value = foreignUserDetailsController._userInfo.getValue();
                if (value == null || (str = value.getName()) == null) {
                    str = "";
                }
                BaseActivity baseActivity = foreignUserDetailsController.activity;
                if (baseActivity != null) {
                    if (foreignUserDetailsController._isFollowing.getValue().booleanValue()) {
                        string = baseActivity.getString(R.string.follow_started_format, new Object[]{str});
                    } else {
                        string = baseActivity.getString(R.string.follow_stopped_format, new Object[]{str});
                    }
                    Intrinsics.checkNotNull(string);
                    SnackbarHelper.showShortIfForeground(baseActivity, string);
                    return;
                }
                return;
            }
            return;
        }
        foreignUserDetailsController._error.setValue("Failed to update follow status");
    }

    private final void updateFollowersTabIcon() {
        List<BaseButtonMatchUIItem> value = this._baseTabs.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        int i = 0;
        for (Object obj : value) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BaseButtonMatchUIItem baseButtonMatchUIItem = (BaseButtonMatchUIItem) obj;
            if (i == 1) {
                baseButtonMatchUIItem = baseButtonMatchUIItem.m14005copyenQ_JUA((r22 & 1) != 0 ? baseButtonMatchUIItem.selectedImage : this._isFollowing.getValue().booleanValue() ? R.drawable.followers_ic_selected : R.drawable.followers_ic_unselected, (r22 & 2) != 0 ? baseButtonMatchUIItem.unselectedImage : 0, (r22 & 4) != 0 ? baseButtonMatchUIItem.isSelected : this._isFollowing.getValue().booleanValue(), (r22 & 8) != 0 ? baseButtonMatchUIItem.label : this._isFollowing.getValue().booleanValue() ? R.string.following : R.string.follow, (r22 & 16) != 0 ? baseButtonMatchUIItem.onClick : null, (r22 & 32) != 0 ? baseButtonMatchUIItem.isActive : false, (r22 & 64) != 0 ? baseButtonMatchUIItem.indicatorAlignment : null, (r22 & 128) != 0 ? baseButtonMatchUIItem.indicatorOffsetX : 0.0f, (r22 & 256) != 0 ? baseButtonMatchUIItem.indicatorOffsetY : 0.0f, (r22 & 512) != 0 ? baseButtonMatchUIItem.tab : null);
            }
            arrayList.add(baseButtonMatchUIItem);
            i = i2;
        }
        this._baseTabs.setValue(arrayList);
    }

    public final BetHistoryController getBetHistoryController() {
        return this.betHistoryController;
    }

    public final int getForeignUserId() {
        return this.foreignUserId;
    }

    public final void onBetClick(BetsListModel betModel) {
        Intrinsics.checkNotNullParameter(betModel, "betModel");
        this.betHistoryController.onBetClick(betModel, this.activity);
    }
}
