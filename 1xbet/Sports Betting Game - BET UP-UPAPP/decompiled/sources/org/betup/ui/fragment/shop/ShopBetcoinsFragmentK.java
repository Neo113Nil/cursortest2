package org.betup.ui.fragment.shop;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.ViewModelProvider;
import com.android.billingclient.api.ProductDetails;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.PurchaseSuccessMessage;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.shop.ShopEntitlementClaimInteractor;
import org.betup.model.remote.api.rest.shop.ShopLayoutInteractor;
import org.betup.model.remote.api.rest.shop.ShopRequestParams;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.analytics.PurchaseType;
import org.betup.model.remote.entity.shop.NewShopItemModel;
import org.betup.model.remote.entity.shop.ShopEntitlementClaimResultModel;
import org.betup.model.remote.entity.shop.ShopEntitlementModel;
import org.betup.model.remote.entity.shop.ShopLayoutModel;
import org.betup.model.remote.entity.shop.ShopRewardType;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.ProductDetailsPrice;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.BackPressedController;
import org.betup.ui.TabMenuItem;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment;
import org.betup.ui.dialogs.PurchaseCompletedUiMapper;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.ui.fragment.shop.compose.ShopContentUiModel;
import org.betup.ui.fragment.shop.compose.ShopEntitlementUi;
import org.betup.ui.fragment.shop.compose.ShopItemDataModel;
import org.betup.ui.fragment.shop.compose.ShopSectionUiModel;
import org.betup.ui.fragment.shop.compose.ShopVideoRewardHtml;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.balance.BalanceHolder;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: ShopBetcoinsFragmentK.kt */
@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 Ò\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Ò\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010tH\u0016J$\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010z2\b\u0010s\u001a\u0004\u0018\u00010tH\u0016J\u001a\u0010{\u001a\u00020r2\u0006\u0010|\u001a\u00020v2\b\u0010s\u001a\u0004\u0018\u00010tH\u0016J\b\u0010}\u001a\u00020rH\u0002J\b\u0010~\u001a\u00020rH\u0002J\b\u0010\u007f\u001a\u00020rH\u0002J\t\u0010\u0080\u0001\u001a\u00020rH\u0002J\t\u0010\u0081\u0001\u001a\u00020rH\u0002J\t\u0010\u0082\u0001\u001a\u00020rH\u0002J\t\u0010\u0083\u0001\u001a\u00020rH\u0002J\u0012\u0010\u0084\u0001\u001a\u00020r2\u0007\u0010\u0085\u0001\u001a\u00020\u0010H\u0002J\u0019\u0010\u0086\u0001\u001a\u00020r2\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020_0\u0088\u0001H\u0002J\u0012\u0010\u0089\u0001\u001a\u00020r2\u0007\u0010\u0085\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010\u008a\u0001\u001a\u00020r2\u0007\u0010\u008b\u0001\u001a\u00020FH\u0002J\t\u0010\u008c\u0001\u001a\u00020rH\u0002J\u001e\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0Z2\u0007\u0010\u008b\u0001\u001a\u00020FH\u0002J\u001d\u0010\u008e\u0001\u001a\u0004\u0018\u00010T2\u0007\u0010\u008b\u0001\u001a\u00020F2\u0007\u0010\u008f\u0001\u001a\u00020PH\u0002J\u0012\u0010\u0090\u0001\u001a\u00020r2\u0007\u0010\u008b\u0001\u001a\u00020FH\u0002J\u0012\u0010\u0091\u0001\u001a\u00020\u00132\u0007\u0010\u0092\u0001\u001a\u00020_H\u0002J\u0012\u0010\u0093\u0001\u001a\u00020r2\u0007\u0010\u008b\u0001\u001a\u00020FH\u0002J\u001c\u0010\u0094\u0001\u001a\u00020r2\u000b\b\u0002\u0010\u0095\u0001\u001a\u0004\u0018\u00010[H\u0002¢\u0006\u0003\u0010\u0096\u0001J\u0012\u0010\u0097\u0001\u001a\u00020r2\u0007\u0010\u0098\u0001\u001a\u00020TH\u0002J/\u0010\u0099\u0001\u001a\u00020r2\u0007\u0010\u0098\u0001\u001a\u00020T2\u0007\u0010\u009a\u0001\u001a\u00020[2\u0012\b\u0002\u0010\u009b\u0001\u001a\u000b\u0012\u0004\u0012\u00020r\u0018\u00010\u009c\u0001H\u0002J\t\u0010\u009d\u0001\u001a\u00020rH\u0002J\t\u0010\u009e\u0001\u001a\u00020rH\u0002J\t\u0010\u009f\u0001\u001a\u00020rH\u0002J\t\u0010 \u0001\u001a\u00020rH\u0002J\t\u0010¡\u0001\u001a\u00020rH\u0016J\t\u0010¢\u0001\u001a\u00020rH\u0016J\t\u0010£\u0001\u001a\u00020rH\u0002J\t\u0010¤\u0001\u001a\u00020rH\u0016J\t\u0010¥\u0001\u001a\u00020rH\u0002J\t\u0010¦\u0001\u001a\u00020\u0013H\u0016J\t\u0010§\u0001\u001a\u00020rH\u0016J!\u0010¨\u0001\u001a\u00020r2\u0016\u0010©\u0001\u001a\u0011\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020i\u0018\u00010ª\u0001H\u0016J\t\u0010«\u0001\u001a\u00020rH\u0002J\t\u0010¬\u0001\u001a\u00020rH\u0016J\t\u0010\u00ad\u0001\u001a\u00020rH\u0002J\t\u0010®\u0001\u001a\u00020rH\u0002J\u0012\u0010¯\u0001\u001a\u00020r2\u0007\u0010\u0092\u0001\u001a\u00020_H\u0002J\u0014\u0010°\u0001\u001a\u00020r2\t\u0010Q\u001a\u0005\u0018\u00010±\u0001H\u0016J\u0014\u0010²\u0001\u001a\u00020r2\t\u0010Q\u001a\u0005\u0018\u00010±\u0001H\u0002J\u0010\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020_0\u0088\u0001H\u0002J\t\u0010´\u0001\u001a\u00020rH\u0002J\u0013\u0010µ\u0001\u001a\u00020r2\b\u0010¶\u0001\u001a\u00030·\u0001H\u0016J\u0012\u0010¸\u0001\u001a\u00020T2\u0007\u0010\u0092\u0001\u001a\u00020TH\u0002J&\u0010¹\u0001\u001a\u00020r2\u0007\u0010º\u0001\u001a\u00020\u00132\b\u0010»\u0001\u001a\u00030¼\u00012\b\u0010¶\u0001\u001a\u00030·\u0001H\u0002J\t\u0010½\u0001\u001a\u00020rH\u0002J\t\u0010¾\u0001\u001a\u00020rH\u0002J\t\u0010¿\u0001\u001a\u00020rH\u0002J\t\u0010À\u0001\u001a\u00020rH\u0002J\u001e\u0010Á\u0001\u001a\u00020r2\n\u0010Â\u0001\u001a\u0005\u0018\u00010Ã\u00012\u0007\u0010Ä\u0001\u001a\u00020[H\u0016J\u0012\u0010Å\u0001\u001a\u00020r2\u0007\u0010Ä\u0001\u001a\u00020[H\u0002J\u0015\u0010Æ\u0001\u001a\u00020r2\n\u0010Â\u0001\u001a\u0005\u0018\u00010Ã\u0001H\u0002J\t\u0010Ç\u0001\u001a\u00020rH\u0002J\t\u0010È\u0001\u001a\u00020rH\u0002J\t\u0010É\u0001\u001a\u00020rH\u0002J\u0007\u0010Ê\u0001\u001a\u00020rJ\u0012\u0010Ë\u0001\u001a\u00020r2\u0007\u0010\u0098\u0001\u001a\u00020TH\u0002J\u0012\u0010Ì\u0001\u001a\u00020\u00132\u0007\u0010\u0098\u0001\u001a\u00020TH\u0002J\u0012\u0010Í\u0001\u001a\u00020r2\u0007\u0010\u0098\u0001\u001a\u00020TH\u0002J\u0014\u0010Î\u0001\u001a\u0004\u0018\u00010_2\u0007\u0010\u0098\u0001\u001a\u00020TH\u0002J\u0012\u0010Ï\u0001\u001a\u00020r2\u0007\u0010\u0098\u0001\u001a\u00020TH\u0002J\u0012\u0010Ð\u0001\u001a\u00020r2\u0007\u0010\u0092\u0001\u001a\u00020_H\u0002J\u0007\u0010Ñ\u0001\u001a\u00020rR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0EX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0H¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0014\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00130EX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00130H¢\u0006\b\n\u0000\u001a\u0004\bL\u0010JR\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00130EX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00130H¢\u0006\b\n\u0000\u001a\u0004\bN\u0010JR\u0016\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0EX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0H¢\u0006\b\n\u0000\u001a\u0004\bR\u0010JR\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020T0EX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020T0H¢\u0006\b\n\u0000\u001a\u0004\bV\u0010JR\u000e\u0010W\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\\u0018\u00010ZX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010]\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0ZX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010^\u001a\u0004\u0018\u00010_X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010`\u001a\u0004\u0018\u00010[X\u0082\u000e¢\u0006\u0004\n\u0002\u0010aR\u001c\u0010b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u0004\u0018\u00010_X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010g\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010h\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020i\u0018\u00010ZX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010k\u001a\b\u0012\u0004\u0012\u00020P0lX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010o\u001a\u0004\u0018\u00010pX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Ó\u0001"}, d2 = {"Lorg/betup/ui/fragment/shop/ShopBetcoinsFragmentK;", "Lorg/betup/ui/fragment/BaseFragment;", "Lorg/betup/services/billing/BillingService$DetailsGotListener;", "Lorg/betup/services/billing/BillingService$PurchaseListener;", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "shopViewModel", "Lorg/betup/ui/fragment/shop/ShopViewModel;", "getShopViewModel", "()Lorg/betup/ui/fragment/shop/ShopViewModel;", "shopViewModel$delegate", "Lkotlin/Lazy;", "layoutFetchedListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/shop/ShopLayoutModel;", "Ljava/lang/Void;", "isActive", "", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "shopLayoutInteractor", "Lorg/betup/model/remote/api/rest/shop/ShopLayoutInteractor;", "getShopLayoutInteractor", "()Lorg/betup/model/remote/api/rest/shop/ShopLayoutInteractor;", "setShopLayoutInteractor", "(Lorg/betup/model/remote/api/rest/shop/ShopLayoutInteractor;)V", "shopEntitlementClaimInteractor", "Lorg/betup/model/remote/api/rest/shop/ShopEntitlementClaimInteractor;", "getShopEntitlementClaimInteractor", "()Lorg/betup/model/remote/api/rest/shop/ShopEntitlementClaimInteractor;", "setShopEntitlementClaimInteractor", "(Lorg/betup/model/remote/api/rest/shop/ShopEntitlementClaimInteractor;)V", "dailyBonusController", "Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "getDailyBonusController", "()Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "setDailyBonusController", "(Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;)V", "balanceHolder", "Lorg/betup/utils/balance/BalanceHolder;", "getBalanceHolder", "()Lorg/betup/utils/balance/BalanceHolder;", "setBalanceHolder", "(Lorg/betup/utils/balance/BalanceHolder;)V", "_shopContent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/ui/fragment/shop/compose/ShopContentUiModel;", "shopContent", "Lkotlinx/coroutines/flow/StateFlow;", "getShopContent", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoading", "isLoading", "_isRefreshing", "isRefreshing", "_error", "", "error", "getError", "_videoRewardItem", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "videoRewardItem", "getVideoRewardItem", "shopItemsLoaded", "refreshLayoutPending", "trackedEntitlementDaysClaimedById", "", "", "", "entitlementDaysClaimedSnapshot", "pendingPurchaseDialogItem", "Lorg/betup/model/remote/entity/shop/NewShopItemModel;", "loadedForUserId", "Ljava/lang/Long;", "layoutResponseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "pendingItem", "videoRewardCheckJob", "Lkotlinx/coroutines/Job;", "videoRewardSearchTimeoutJob", "productDetailsMap", "Lcom/android/billingclient/api/ProductDetails;", "isFetchingOldPriceDetails", "requestedOldPriceStoreCodes", "", "videoRewardRetryHandler", "Landroid/os/Handler;", "videoRewardRetryRunnable", "Ljava/lang/Runnable;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "scheduleShopItemsVerification", "resetFragmentState", "setupVideoRewards", "loadShopItems", "loadShopLayout", "invalidateShopCaches", "resetShopUiStateForReload", "resolveBillingAndPublish", TtmlNode.TAG_LAYOUT, "applyCachedBillingDetails", "layoutItems", "", "publishShopContent", "prefetchShopHtmlImages", "content", "completePendingPurchaseDialogsIfPossible", "entitlementDaysClaimedMap", "findShopItemInContent", "storeCode", "completePendingPurchaseDialogs", "purchaseExpectsEntitlement", "item", "syncBalanceIfEntitlementsProgressed", "refreshUserBalance", "serverBalance", "(Ljava/lang/Long;)V", "handleEntitlementClaim", "shopItem", "showDailyClaimCompletedDialog", "claimedAmount", "onDismiss", "Lkotlin/Function0;", "forceReloadShopItems", "refreshShopItems", "completeRefreshLayoutFetch", "finishRefreshIfDone", "onStart", X3.i.u0, "registerBackPressedListener", X3.i.t0, "removeBackPressedListener", "onBackPressed", "onDestroy", "detailsGot", "details", "", "applyPricesToLoadedItems", "purchaseCompleted", "handleSuccessfulPurchase", "reloadShopItemsAfterPurchase", "showPurchaseCompletedDialog", "purchaseFailed", "Lorg/betup/services/billing/BillingService$BillingError;", "handlePurchaseFailure", "layoutShopItems", "requestOldPriceBillingDetails", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "withShopV2VideoHtml", "updateVideoRewardState", "isAvailable", TypedValues.CycleType.S_WAVE_PHASE, "Lorg/betup/ui/common/video/VideoOfferAvailabilityPhase;", "refreshVideoRewardAvailability", "beginVideoRewardSearch", "retryVideoRewardSearch", "scheduleVideoRewardSearchTimeout", "onVideoRewardRequestProcessed", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "amount", "handleVideoRewardSuccess", "handleVideoRewardFailure", "scheduleVideoRewardRetry", "cancelVideoRewardRetry", "scheduleVideoRewardRefresh", "displayProgress", "handleShopItemClick", "isVideoRewardItem", "handleVideoRewardClick", "findShopItemModel", "handleRegularShopItemClick", "initiatePurchase", "hideProgress", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopBetcoinsFragmentK extends BaseFragment implements BillingService.DetailsGotListener, BillingService.PurchaseListener, VideoRewardService.VideoRewardServiceClient, BackPressedController.BackPressedListener {
    private static final String TAG = "ShopBetcoinsFragmentK";
    private static final long VIDEO_REWARD_REFRESH_DELAY = 400;
    private static final long VIDEO_REWARD_RETRY_DELAY = 2500;
    private static final long VIDEO_REWARD_SEARCH_RESTART_DELAY = 12000;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isRefreshing;
    private final MutableStateFlow<ShopContentUiModel> _shopContent;
    private final MutableStateFlow<ShopItemDataModel> _videoRewardItem;

    @Inject
    public AnalyticsService analyticsService;

    @Inject
    public BalanceHolder balanceHolder;

    @Inject
    public BillingService billingService;

    @Inject
    public DailyBonusController dailyBonusController;
    private Map<Long, Integer> entitlementDaysClaimedSnapshot;
    private final StateFlow<String> error;
    private boolean isFetchingOldPriceDetails;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isRefreshing;
    private FetchedResponseMessage<ShopLayoutModel, Void> layoutResponseMessage;
    private Long loadedForUserId;
    private NewShopItemModel pendingItem;
    private NewShopItemModel pendingPurchaseDialogItem;
    private Map<String, ProductDetails> productDetailsMap;
    private boolean refreshLayoutPending;
    private final Set<String> requestedOldPriceStoreCodes;
    private final StateFlow<ShopContentUiModel> shopContent;

    @Inject
    public ShopEntitlementClaimInteractor shopEntitlementClaimInteractor;
    private boolean shopItemsLoaded;

    @Inject
    public ShopLayoutInteractor shopLayoutInteractor;
    private Map<Long, Integer> trackedEntitlementDaysClaimedById;

    @Inject
    public UserService userService;
    private Job videoRewardCheckJob;
    private final StateFlow<ShopItemDataModel> videoRewardItem;
    private final Handler videoRewardRetryHandler;
    private Runnable videoRewardRetryRunnable;
    private Job videoRewardSearchTimeoutJob;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: shopViewModel$delegate, reason: from kotlin metadata */
    private final Lazy shopViewModel = LazyKt.lazy(new Function0() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ShopViewModel shopViewModel_delegate$lambda$0;
            shopViewModel_delegate$lambda$0 = ShopBetcoinsFragmentK.shopViewModel_delegate$lambda$0(ShopBetcoinsFragmentK.this);
            return shopViewModel_delegate$lambda$0;
        }
    });
    private final BaseCachedSharedInteractor.OnFetchedListener<ShopLayoutModel, Void> layoutFetchedListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$$ExternalSyntheticLambda4
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            ShopBetcoinsFragmentK.layoutFetchedListener$lambda$1(ShopBetcoinsFragmentK.this, fetchedResponseMessage);
        }
    };

    /* compiled from: ShopBetcoinsFragmentK.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShopRewardType.values().length];
            try {
                iArr[ShopRewardType.DAILY_COIN_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopRewardType.HYBRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoOfferAvailabilityPhase.values().length];
            try {
                iArr2[VideoOfferAvailabilityPhase.CHECKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VideoOfferAvailabilityPhase.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoOfferAvailabilityPhase.COOLDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoOfferAvailabilityPhase.LIMIT_REACHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VideoOfferAvailabilityPhase.READY.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ShopBetcoinsFragmentK() {
        MutableStateFlow<ShopContentUiModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._shopContent = MutableStateFlow;
        this.shopContent = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(true);
        this._isLoading = MutableStateFlow2;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isRefreshing = MutableStateFlow3;
        this.isRefreshing = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow4;
        this.error = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<ShopItemDataModel> MutableStateFlow5 = StateFlowKt.MutableStateFlow(ShopItemDataModel.Companion.createVideoReward$default(ShopItemDataModel.INSTANCE, 0L, false, null, 0, 0, 28, null));
        this._videoRewardItem = MutableStateFlow5;
        this.videoRewardItem = FlowKt.asStateFlow(MutableStateFlow5);
        this.entitlementDaysClaimedSnapshot = MapsKt.emptyMap();
        this.requestedOldPriceStoreCodes = new LinkedHashSet();
        this.videoRewardRetryHandler = new Handler(Looper.getMainLooper());
    }

    private final ShopViewModel getShopViewModel() {
        return (ShopViewModel) this.shopViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShopViewModel shopViewModel_delegate$lambda$0(ShopBetcoinsFragmentK shopBetcoinsFragmentK) {
        return (ShopViewModel) new ViewModelProvider(shopBetcoinsFragmentK).get(ShopViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutFetchedListener$lambda$1(ShopBetcoinsFragmentK shopBetcoinsFragmentK, FetchedResponseMessage fetchedResponseMessage) {
        if (shopBetcoinsFragmentK.isActive()) {
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
                Log.w(TAG, "layoutFetchedListener: layout fetch failed");
                shopBetcoinsFragmentK._error.setValue(shopBetcoinsFragmentK.getString(R.string.error));
                shopBetcoinsFragmentK._isLoading.setValue(false);
                shopBetcoinsFragmentK.completePendingPurchaseDialogsIfPossible();
                shopBetcoinsFragmentK.completeRefreshLayoutFetch();
                return;
            }
            shopBetcoinsFragmentK.layoutResponseMessage = fetchedResponseMessage;
            Object model = fetchedResponseMessage.getModel();
            Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
            shopBetcoinsFragmentK.resolveBillingAndPublish((ShopLayoutModel) model);
            shopBetcoinsFragmentK.completeRefreshLayoutFetch();
        }
    }

    /* compiled from: ShopBetcoinsFragmentK.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/shop/ShopBetcoinsFragmentK$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "VIDEO_REWARD_REFRESH_DELAY", "", "VIDEO_REWARD_RETRY_DELAY", "VIDEO_REWARD_SEARCH_RESTART_DELAY", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/shop/ShopBetcoinsFragmentK;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ShopBetcoinsFragmentK newInstance() {
            return new ShopBetcoinsFragmentK();
        }
    }

    @Override // org.betup.ui.fragment.BaseFragment
    public boolean isActive() {
        return isAdded();
    }

    public final VideoRewardService getVideoRewardService() {
        VideoRewardService videoRewardService = this.videoRewardService;
        if (videoRewardService != null) {
            return videoRewardService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoRewardService");
        return null;
    }

    public final void setVideoRewardService(VideoRewardService videoRewardService) {
        Intrinsics.checkNotNullParameter(videoRewardService, "<set-?>");
        this.videoRewardService = videoRewardService;
    }

    public final BillingService getBillingService() {
        BillingService billingService = this.billingService;
        if (billingService != null) {
            return billingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("billingService");
        return null;
    }

    public final void setBillingService(BillingService billingService) {
        Intrinsics.checkNotNullParameter(billingService, "<set-?>");
        this.billingService = billingService;
    }

    public final AnalyticsService getAnalyticsService() {
        AnalyticsService analyticsService = this.analyticsService;
        if (analyticsService != null) {
            return analyticsService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsService");
        return null;
    }

    public final void setAnalyticsService(AnalyticsService analyticsService) {
        Intrinsics.checkNotNullParameter(analyticsService, "<set-?>");
        this.analyticsService = analyticsService;
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    public final ShopLayoutInteractor getShopLayoutInteractor() {
        ShopLayoutInteractor shopLayoutInteractor = this.shopLayoutInteractor;
        if (shopLayoutInteractor != null) {
            return shopLayoutInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shopLayoutInteractor");
        return null;
    }

    public final void setShopLayoutInteractor(ShopLayoutInteractor shopLayoutInteractor) {
        Intrinsics.checkNotNullParameter(shopLayoutInteractor, "<set-?>");
        this.shopLayoutInteractor = shopLayoutInteractor;
    }

    public final ShopEntitlementClaimInteractor getShopEntitlementClaimInteractor() {
        ShopEntitlementClaimInteractor shopEntitlementClaimInteractor = this.shopEntitlementClaimInteractor;
        if (shopEntitlementClaimInteractor != null) {
            return shopEntitlementClaimInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shopEntitlementClaimInteractor");
        return null;
    }

    public final void setShopEntitlementClaimInteractor(ShopEntitlementClaimInteractor shopEntitlementClaimInteractor) {
        Intrinsics.checkNotNullParameter(shopEntitlementClaimInteractor, "<set-?>");
        this.shopEntitlementClaimInteractor = shopEntitlementClaimInteractor;
    }

    public final DailyBonusController getDailyBonusController() {
        DailyBonusController dailyBonusController = this.dailyBonusController;
        if (dailyBonusController != null) {
            return dailyBonusController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dailyBonusController");
        return null;
    }

    public final void setDailyBonusController(DailyBonusController dailyBonusController) {
        Intrinsics.checkNotNullParameter(dailyBonusController, "<set-?>");
        this.dailyBonusController = dailyBonusController;
    }

    public final BalanceHolder getBalanceHolder() {
        BalanceHolder balanceHolder = this.balanceHolder;
        if (balanceHolder != null) {
            return balanceHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("balanceHolder");
        return null;
    }

    public final void setBalanceHolder(BalanceHolder balanceHolder) {
        Intrinsics.checkNotNullParameter(balanceHolder, "<set-?>");
        this.balanceHolder = balanceHolder;
    }

    public final StateFlow<ShopContentUiModel> getShopContent() {
        return this.shopContent;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> isRefreshing() {
        return this.isRefreshing;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final StateFlow<ShopItemDataModel> getVideoRewardItem() {
        return this.videoRewardItem;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1938126952, true, new ShopBetcoinsFragmentK$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated: Starting shop loading process");
        resetFragmentState();
        setupVideoRewards();
        loadShopItems();
        updateMenuBars(getString(R.string.drawer_shop), TabMenuItem.SHOP);
        scheduleShopItemsVerification();
    }

    private final void scheduleShopItemsVerification() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ShopBetcoinsFragmentK$scheduleShopItemsVerification$1(this, null), 3, null);
    }

    private final void resetFragmentState() {
        this.shopItemsLoaded = false;
        this.layoutResponseMessage = null;
        this.pendingItem = null;
        this.pendingPurchaseDialogItem = null;
        this.entitlementDaysClaimedSnapshot = MapsKt.emptyMap();
        this.loadedForUserId = null;
        this.requestedOldPriceStoreCodes.clear();
        this.isFetchingOldPriceDetails = false;
        this._isLoading.setValue(true);
        this._error.setValue(null);
        this._shopContent.setValue(null);
        this.trackedEntitlementDaysClaimedById = null;
        Log.d(TAG, "resetFragmentState: Fragment state reset");
    }

    private final void setupVideoRewards() {
        getVideoRewardService().connectClient(PromoService.PromoPlacement.SHOP_BONUS, null, this);
        beginVideoRewardSearch();
        getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.SHOP_BONUS, null, null);
    }

    private final void loadShopItems() {
        long betupUserIdOrZero = getUserService().getBetupUserIdOrZero();
        Long l = this.loadedForUserId;
        if (l != null && (l == null || l.longValue() != betupUserIdOrZero)) {
            Log.d(TAG, "loadShopItems: User changed (" + this.loadedForUserId + " -> " + betupUserIdOrZero + "), invalidating shop caches");
            invalidateShopCaches();
            resetShopUiStateForReload();
        }
        Long valueOf = Long.valueOf(betupUserIdOrZero);
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        this.loadedForUserId = valueOf;
        Log.d(TAG, "loadShopItems: Loading shop layout first");
        loadShopLayout();
    }

    private final void loadShopLayout() {
        getShopLayoutInteractor().load(this.layoutFetchedListener, null, ShopRequestParams.bundle(ShopRequestParams.defaultShopType()));
    }

    private final void invalidateShopCaches() {
        getShopLayoutInteractor().invalidate();
        getVideoRewardService().invalidateVideoRewardState(PromoService.PromoPlacement.SHOP_BONUS);
    }

    private final void resetShopUiStateForReload() {
        this.layoutResponseMessage = null;
        this._shopContent.setValue(null);
        this.trackedEntitlementDaysClaimedById = null;
        this._isLoading.setValue(true);
        this._error.setValue(null);
    }

    private final void resolveBillingAndPublish(ShopLayoutModel layout) {
        List<NewShopItemModel> flattenLayoutItems = getShopViewModel().flattenLayoutItems(layout);
        getShopViewModel().prepareItemsForBilling(flattenLayoutItems);
        applyCachedBillingDetails(flattenLayoutItems);
        List<String> itemsMissingPlayPrice = getShopViewModel().itemsMissingPlayPrice(flattenLayoutItems);
        if (itemsMissingPlayPrice.isEmpty()) {
            publishShopContent(layout);
            requestOldPriceBillingDetails();
        } else {
            Log.d(TAG, "resolveBillingAndPublish: fetching Play prices for " + itemsMissingPlayPrice);
            getBillingService().getProductDetails(itemsMissingPlayPrice, this);
        }
    }

    private final void applyCachedBillingDetails(List<NewShopItemModel> layoutItems) {
        ProductDetails cachedProductDetails;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = layoutItems.iterator();
        while (it.hasNext()) {
            String storeCode = ((NewShopItemModel) it.next()).getStoreCode();
            Pair pair = null;
            if (StringsKt.isBlank(storeCode)) {
                storeCode = null;
            }
            if (storeCode != null && (cachedProductDetails = getBillingService().getCachedProductDetails(storeCode)) != null) {
                pair = TuplesKt.to(storeCode, cachedProductDetails);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map map = MapsKt.toMap(arrayList);
        if (map.isEmpty()) {
            return;
        }
        Map<String, ProductDetails> map2 = this.productDetailsMap;
        if (map2 == null) {
            map2 = MapsKt.emptyMap();
        }
        this.productDetailsMap = MapsKt.toMap(MapsKt.plus(map2, map));
        ShopViewModel shopViewModel = getShopViewModel();
        Map<String, ProductDetails> map3 = this.productDetailsMap;
        if (map3 == null) {
            map3 = MapsKt.emptyMap();
        }
        shopViewModel.applyPrices(layoutItems, map3);
    }

    private final void publishShopContent(ShopLayoutModel layout) {
        ShopContentUiModel buildContentFromLayout$default = ShopViewModel.buildContentFromLayout$default(getShopViewModel(), layout, withShopV2VideoHtml(this._videoRewardItem.getValue()), null, 4, null);
        this._shopContent.setValue(buildContentFromLayout$default);
        this.shopItemsLoaded = true;
        prefetchShopHtmlImages(buildContentFromLayout$default);
        completePendingPurchaseDialogs(buildContentFromLayout$default);
        syncBalanceIfEntitlementsProgressed(buildContentFromLayout$default);
        this._isLoading.setValue(false);
        this._error.setValue(null);
    }

    private final void prefetchShopHtmlImages(ShopContentUiModel content) {
        Context applicationContext;
        Context context = getContext();
        if (context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ShopBetcoinsFragmentK$prefetchShopHtmlImages$1(applicationContext, content, null), 3, null);
    }

    private final void completePendingPurchaseDialogsIfPossible() {
        NewShopItemModel newShopItemModel = this.pendingPurchaseDialogItem;
        if (newShopItemModel == null) {
            return;
        }
        this.pendingPurchaseDialogItem = null;
        this.entitlementDaysClaimedSnapshot = MapsKt.emptyMap();
        showPurchaseCompletedDialog(newShopItemModel);
    }

    private final Map<Long, Integer> entitlementDaysClaimedMap(ShopContentUiModel content) {
        List<ShopEntitlementModel> entitlements = content.getEntitlements();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entitlements, 10)), 16));
        for (ShopEntitlementModel shopEntitlementModel : entitlements) {
            Pair pair = TuplesKt.to(Long.valueOf(shopEntitlementModel.getId()), Integer.valueOf(shopEntitlementModel.getDaysClaimed()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    private final ShopItemDataModel findShopItemInContent(ShopContentUiModel content, String storeCode) {
        Object obj;
        Iterator it = SequencesKt.flatMap(CollectionsKt.asSequence(content.getSections()), new Function1() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Sequence findShopItemInContent$lambda$8;
                findShopItemInContent$lambda$8 = ShopBetcoinsFragmentK.findShopItemInContent$lambda$8((ShopSectionUiModel) obj2);
                return findShopItemInContent$lambda$8;
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ShopItemDataModel) obj).getStoreCode(), storeCode)) {
                break;
            }
        }
        return (ShopItemDataModel) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence findShopItemInContent$lambda$8(ShopSectionUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.asSequence(it.getItems());
    }

    private final void completePendingPurchaseDialogs(ShopContentUiModel content) {
        ShopEntitlementModel entitlement;
        final NewShopItemModel newShopItemModel = this.pendingPurchaseDialogItem;
        if (newShopItemModel == null) {
            return;
        }
        if (purchaseExpectsEntitlement(newShopItemModel)) {
            ShopItemDataModel findShopItemInContent = findShopItemInContent(content, newShopItemModel.getStoreCode());
            if (!ShopEntitlementUi.INSTANCE.hasActiveEntitlement(findShopItemInContent != null ? findShopItemInContent.getEntitlement() : null)) {
                return;
            }
        }
        this.pendingPurchaseDialogItem = null;
        ShopItemDataModel findShopItemInContent2 = findShopItemInContent(content, newShopItemModel.getStoreCode());
        boolean z = false;
        if (findShopItemInContent2 != null && (entitlement = findShopItemInContent2.getEntitlement()) != null) {
            Integer num = this.entitlementDaysClaimedSnapshot.get(Long.valueOf(entitlement.getId()));
            if (entitlement.getDaysClaimed() > (num != null ? num.intValue() : 0)) {
                showDailyClaimCompletedDialog(findShopItemInContent2, entitlement.getDailyAmount() * (entitlement.getDaysClaimed() - r5), new Function0() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit completePendingPurchaseDialogs$lambda$11$lambda$10;
                        completePendingPurchaseDialogs$lambda$11$lambda$10 = ShopBetcoinsFragmentK.completePendingPurchaseDialogs$lambda$11$lambda$10(ShopBetcoinsFragmentK.this, newShopItemModel);
                        return completePendingPurchaseDialogs$lambda$11$lambda$10;
                    }
                });
                refreshUserBalance$default(this, null, 1, null);
                z = true;
            }
        }
        this.entitlementDaysClaimedSnapshot = MapsKt.emptyMap();
        if (!z) {
            showPurchaseCompletedDialog(newShopItemModel);
        }
        this.trackedEntitlementDaysClaimedById = entitlementDaysClaimedMap(content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit completePendingPurchaseDialogs$lambda$11$lambda$10(ShopBetcoinsFragmentK shopBetcoinsFragmentK, NewShopItemModel newShopItemModel) {
        shopBetcoinsFragmentK.showPurchaseCompletedDialog(newShopItemModel);
        return Unit.INSTANCE;
    }

    private final boolean purchaseExpectsEntitlement(NewShopItemModel item) {
        ShopRewardType rewardType = item.getRewardType();
        int i = rewardType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[rewardType.ordinal()];
        return i == 1 || i == 2;
    }

    private final void syncBalanceIfEntitlementsProgressed(ShopContentUiModel content) {
        Map<Long, Integer> entitlementDaysClaimedMap = entitlementDaysClaimedMap(content);
        Map<Long, Integer> map = this.trackedEntitlementDaysClaimedById;
        this.trackedEntitlementDaysClaimedById = entitlementDaysClaimedMap;
        if (map == null) {
            return;
        }
        boolean z = false;
        for (ShopEntitlementModel shopEntitlementModel : content.getEntitlements()) {
            Integer num = map.get(Long.valueOf(shopEntitlementModel.getId()));
            if (shopEntitlementModel.getDaysClaimed() > (num != null ? num.intValue() : 0)) {
                ShopItemDataModel findShopItemInContent = findShopItemInContent(content, shopEntitlementModel.getStoreCode());
                if (findShopItemInContent != null) {
                    showDailyClaimCompletedDialog$default(this, findShopItemInContent, shopEntitlementModel.getDailyAmount() * (shopEntitlementModel.getDaysClaimed() - r6), null, 4, null);
                }
                z = true;
            }
        }
        if (z) {
            refreshUserBalance$default(this, null, 1, null);
        }
    }

    static /* synthetic */ void refreshUserBalance$default(ShopBetcoinsFragmentK shopBetcoinsFragmentK, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        shopBetcoinsFragmentK.refreshUserBalance(l);
    }

    private final void refreshUserBalance(Long serverBalance) {
        UserProgressModel userProgressModel;
        if (serverBalance != null) {
            long longValue = serverBalance.longValue();
            ShortUserProfileModel shortProfile = getUserService().getShortProfile();
            if (shortProfile != null && (userProgressModel = shortProfile.getUserProgressModel()) != null) {
                userProgressModel.setMoneyBalance(longValue);
            }
            getBalanceHolder().postOptimisticBalance(longValue);
        }
        getUserService().invalidate(UserService.InfoKind.PROGRESS);
        getUserService().syncProfile(UserService.InfoKind.PROGRESS);
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEntitlementClaim(final ShopItemDataModel shopItem) {
        final ShopEntitlementModel entitlement = shopItem.getEntitlement();
        if (entitlement == null) {
            return;
        }
        final long id = entitlement.getId();
        getShopEntitlementClaimInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ShopBetcoinsFragmentK.handleEntitlementClaim$lambda$14(ShopBetcoinsFragmentK.this, id, entitlement, shopItem, fetchedResponseMessage);
            }
        }, Long.valueOf(id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleEntitlementClaim$lambda$14(final ShopBetcoinsFragmentK shopBetcoinsFragmentK, long j, ShopEntitlementModel shopEntitlementModel, ShopItemDataModel shopItemDataModel, FetchedResponseMessage fetchedResponseMessage) {
        if (shopBetcoinsFragmentK.isActive() && fetchedResponseMessage.getStat() == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            ShopEntitlementClaimResultModel shopEntitlementClaimResultModel = (ShopEntitlementClaimResultModel) fetchedResponseMessage.getModel();
            shopBetcoinsFragmentK.refreshUserBalance(Long.valueOf(shopEntitlementClaimResultModel.getMoneyBalance()));
            Map<Long, Integer> map = shopBetcoinsFragmentK.trackedEntitlementDaysClaimedById;
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            shopBetcoinsFragmentK.trackedEntitlementDaysClaimedById = MapsKt.plus(map, TuplesKt.to(Long.valueOf(j), Integer.valueOf(shopEntitlementModel.getDaysClaimed() + 1)));
            showDailyClaimCompletedDialog$default(shopBetcoinsFragmentK, shopItemDataModel, shopEntitlementClaimResultModel.getClaimedAmount(), null, 4, null);
            shopBetcoinsFragmentK.getShopLayoutInteractor().invalidate((Void) null);
            shopBetcoinsFragmentK.getShopLayoutInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$$ExternalSyntheticLambda5
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage2) {
                    ShopBetcoinsFragmentK.handleEntitlementClaim$lambda$14$lambda$13(ShopBetcoinsFragmentK.this, fetchedResponseMessage2);
                }
            }, null, ShopRequestParams.bundle(ShopRequestParams.defaultShopType()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleEntitlementClaim$lambda$14$lambda$13(ShopBetcoinsFragmentK shopBetcoinsFragmentK, FetchedResponseMessage fetchedResponseMessage) {
        if (shopBetcoinsFragmentK.isActive() && fetchedResponseMessage.getStat() == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            shopBetcoinsFragmentK.layoutResponseMessage = fetchedResponseMessage;
            Object model = fetchedResponseMessage.getModel();
            Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
            shopBetcoinsFragmentK.resolveBillingAndPublish((ShopLayoutModel) model);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showDailyClaimCompletedDialog$default(ShopBetcoinsFragmentK shopBetcoinsFragmentK, ShopItemDataModel shopItemDataModel, long j, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        shopBetcoinsFragmentK.showDailyClaimCompletedDialog(shopItemDataModel, j, function0);
    }

    private final void showDailyClaimCompletedDialog(ShopItemDataModel shopItem, long claimedAmount, final Function0<Unit> onDismiss) {
        if (claimedAmount > 0) {
            PurchaseCompletedNewDialogFragment.INSTANCE.newInstance(PurchaseCompletedUiMapper.INSTANCE.fromDailyClaim(shopItem, claimedAmount), onDismiss != null ? new PurchaseCompletedNewDialogFragment.OnDismissListener() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$showDailyClaimCompletedDialog$1$1
                @Override // org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment.OnDismissListener
                public void onDismiss() {
                    onDismiss.invoke();
                }
            } : null).show(getParentFragmentManager(), "ShopDailyClaimCompletedDialog");
        } else if (onDismiss != null) {
            onDismiss.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forceReloadShopItems() {
        Log.d(TAG, "forceReloadShopItems: Forcing reload of shop items");
        resetFragmentState();
        loadShopItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshShopItems() {
        if (this._isRefreshing.getValue().booleanValue()) {
            return;
        }
        Log.d(TAG, "refreshShopItems: Invalidating shop cache and reloading");
        this._isRefreshing.setValue(true);
        this.refreshLayoutPending = true;
        getShopLayoutInteractor().invalidate((Void) null);
        getVideoRewardService().invalidateVideoRewardState(PromoService.PromoPlacement.SHOP_BONUS);
        getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.SHOP_BONUS, null, null);
        loadShopLayout();
    }

    private final void completeRefreshLayoutFetch() {
        if (this.refreshLayoutPending) {
            this.refreshLayoutPending = false;
            finishRefreshIfDone();
        }
    }

    private final void finishRefreshIfDone() {
        if (this.refreshLayoutPending) {
            return;
        }
        this._isRefreshing.setValue(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
        registerBackPressedListener();
        long betupUserIdOrZero = getUserService().getBetupUserIdOrZero();
        Long l = this.loadedForUserId;
        if (l != null && betupUserIdOrZero > 0 && (l == null || l.longValue() != betupUserIdOrZero)) {
            Log.w(TAG, "onResume: Detected user switch, forcing shop reload");
            forceReloadShopItems();
            return;
        }
        if (isActive()) {
            getVideoRewardService().invalidateVideoRewardState(PromoService.PromoPlacement.SHOP_BONUS);
            getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.SHOP_BONUS, null, null);
        }
        if (isActive() && this._shopContent.getValue() == null && this.shopItemsLoaded) {
            Log.w(TAG, "onResume: Shop items not properly loaded, forcing reload");
            forceReloadShopItems();
        }
    }

    private final void registerBackPressedListener() {
        try {
            KeyEventDispatcher.Component requireActivity = requireActivity();
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.BackPressedController");
            ((BackPressedController) requireActivity).setOnBackPressedListener(this);
        } catch (ClassCastException unused) {
            Log.e(TAG, "Activity must implement BackPressedController");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
        this._isLoading.setValue(false);
        removeBackPressedListener();
    }

    private final void removeBackPressedListener() {
        try {
            KeyEventDispatcher.Component requireActivity = requireActivity();
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.BackPressedController");
            ((BackPressedController) requireActivity).removeListener();
        } catch (ClassCastException unused) {
            Log.e(TAG, "Activity must implement BackPressedController");
        }
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        Log.d(TAG, "onBackPressed called");
        return true;
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.videoRewardSearchTimeoutJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        cancelVideoRewardRetry();
        getVideoRewardService().disconnectClient(PromoService.PromoPlacement.SHOP_BONUS, null);
    }

    @Override // org.betup.services.billing.BillingService.DetailsGotListener
    public void detailsGot(Map<String, ProductDetails> details) {
        Log.d(TAG, "detailsGot: Called with details size = " + (details != null ? Integer.valueOf(details.size()) : null) + ", oldPricePhase=" + this.isFetchingOldPriceDetails);
        if (!isActive()) {
            Log.d(TAG, "detailsGot: Fragment not active, returning");
            this._isLoading.setValue(false);
            return;
        }
        if (details == null) {
            details = MapsKt.emptyMap();
        }
        if (this.isFetchingOldPriceDetails) {
            this.isFetchingOldPriceDetails = false;
            Map<String, ProductDetails> map = this.productDetailsMap;
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            this.productDetailsMap = MapsKt.toMap(MapsKt.plus(map, details));
            applyPricesToLoadedItems();
            return;
        }
        Map<String, ProductDetails> map2 = this.productDetailsMap;
        if (map2 == null) {
            map2 = MapsKt.emptyMap();
        }
        this.productDetailsMap = MapsKt.toMap(MapsKt.plus(map2, details));
        applyPricesToLoadedItems();
        if (this.isFetchingOldPriceDetails) {
            return;
        }
        requestOldPriceBillingDetails();
    }

    private final void applyPricesToLoadedItems() {
        ShopLayoutModel model;
        FetchedResponseMessage<ShopLayoutModel, Void> fetchedResponseMessage = this.layoutResponseMessage;
        if (fetchedResponseMessage == null || (model = fetchedResponseMessage.getModel()) == null) {
            return;
        }
        List<NewShopItemModel> flattenLayoutItems = getShopViewModel().flattenLayoutItems(model);
        ShopViewModel shopViewModel = getShopViewModel();
        Map<String, ProductDetails> map = this.productDetailsMap;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        shopViewModel.applyPrices(flattenLayoutItems, map);
        publishShopContent(model);
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseCompleted() {
        hideProgress();
        if (!isActive()) {
            Log.d(TAG, "purchaseCompleted: Fragment not active, returning");
        } else {
            handleSuccessfulPurchase();
        }
    }

    private final void handleSuccessfulPurchase() {
        String str;
        FirebaseAnalyticsHelper.trackPurchase(PurchasePlacement.SHOP, PurchaseType.PACKS);
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("analytics", 0);
        NewShopItemModel newShopItemModel = this.pendingItem;
        if (newShopItemModel != null) {
            Map<String, ProductDetails> map = this.productDetailsMap;
            double priceAmountMicros = ProductDetailsPrice.priceAmountMicros(r6) / 1000000.0d;
            String priceCurrencyCode = ProductDetailsPrice.priceCurrencyCode(map != null ? map.get(newShopItemModel.getStoreCode()) : null);
            if (priceCurrencyCode == null) {
                priceCurrencyCode = "USD";
            }
            String str2 = priceCurrencyCode;
            int i = sharedPreferences.getInt("purchase_count", 0);
            long j = sharedPreferences.getLong("registration_timestamp", 0L);
            int currentTimeMillis = j > 0 ? (int) ((System.currentTimeMillis() - j) / 86400000) : 0;
            AnalyticsHelper analyticsHelper = AnalyticsHelper.INSTANCE;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            int i2 = i + 1;
            analyticsHelper.logPurchase(uuid, priceAmountMicros, str2, newShopItemModel.getStoreCode(), i2, currentTimeMillis);
            sharedPreferences.edit().putInt("purchase_count", i2).apply();
            float f = sharedPreferences.getFloat("total_spent_usd", 0.0f) + ((float) priceAmountMicros);
            sharedPreferences.edit().putFloat("total_spent_usd", f).apply();
            if (f >= 100.0f) {
                str = "whale";
            } else if (f >= 10.0f) {
                str = "dolphin";
            } else {
                str = "minnow";
            }
            AnalyticsHelper.INSTANCE.setUserSegment(str);
            getAnalyticsService().sendPurchaseEvent(newShopItemModel.getStoreCode(), PurchasePlacement.SHOP, PurchaseType.PACKS);
            EventBus.getDefault().post(new PurchaseSuccessMessage(newShopItemModel.toShopItemModel()));
            ShopContentUiModel value = this._shopContent.getValue();
            if (value == null) {
                value = new ShopContentUiModel(null, null, null, false, 15, null);
            }
            this.entitlementDaysClaimedSnapshot = entitlementDaysClaimedMap(value);
            this.pendingPurchaseDialogItem = newShopItemModel;
            this.pendingItem = null;
        }
        getUserService().invalidate(UserService.InfoKind.PROGRESS);
        getUserService().syncProfile(UserService.InfoKind.PROGRESS);
        if (this.dailyBonusController != null) {
            DailyBonusController dailyBonusController = getDailyBonusController();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            dailyBonusController.initialize(requireContext);
            getDailyBonusController().invalidate();
            getDailyBonusController().load();
        }
        getShopLayoutInteractor().invalidate((Void) null);
        reloadShopItemsAfterPurchase();
    }

    private final void reloadShopItemsAfterPurchase() {
        Log.d(TAG, "reloadShopItemsAfterPurchase: Reloading shop items after purchase");
        getShopLayoutInteractor().invalidate((Void) null);
        this.shopItemsLoaded = false;
        this.requestedOldPriceStoreCodes.clear();
        this.isFetchingOldPriceDetails = false;
        this._isLoading.setValue(true);
        this._error.setValue(null);
        loadShopLayout();
        Log.d(TAG, "reloadShopItemsAfterPurchase: Shop items reload initiated");
    }

    private final void showPurchaseCompletedDialog(NewShopItemModel item) {
        PurchaseCompletedNewDialogFragment.INSTANCE.newInstance(PurchaseCompletedUiMapper.INSTANCE.fromShopItem(item), new PurchaseCompletedNewDialogFragment.OnDismissListener() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$showPurchaseCompletedDialog$1
            @Override // org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment.OnDismissListener
            public void onDismiss() {
            }
        }).show(getParentFragmentManager(), "PurchaseCompletedDialog");
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseFailed(BillingService.BillingError error) {
        hideProgress();
        if (!isActive()) {
            Log.d(TAG, "purchaseFailed: Fragment not active, returning");
        } else {
            handlePurchaseFailure(error);
        }
    }

    private final void handlePurchaseFailure(BillingService.BillingError error) {
        NewShopItemModel newShopItemModel;
        if (error != BillingService.BillingError.CANCELED || (newShopItemModel = this.pendingItem) == null) {
            if (error != null) {
                SnackbarHelper.showShort(getActivity(), R.string.one_click_bet_unlock_failed_detail);
            }
        } else if (newShopItemModel != null) {
            getAnalyticsService().sendPurchaseCanceled(newShopItemModel.getStoreCode());
        }
        this.pendingItem = null;
    }

    private final List<NewShopItemModel> layoutShopItems() {
        ShopLayoutModel model;
        FetchedResponseMessage<ShopLayoutModel, Void> fetchedResponseMessage = this.layoutResponseMessage;
        List<NewShopItemModel> flattenLayoutItems = (fetchedResponseMessage == null || (model = fetchedResponseMessage.getModel()) == null) ? null : getShopViewModel().flattenLayoutItems(model);
        return flattenLayoutItems == null ? CollectionsKt.emptyList() : flattenLayoutItems;
    }

    private final void requestOldPriceBillingDetails() {
        String obj;
        List<NewShopItemModel> layoutShopItems = layoutShopItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = layoutShopItems.iterator();
        while (it.hasNext()) {
            String oldStoreCode = ((NewShopItemModel) it.next()).getOldStoreCode();
            String str = null;
            if (oldStoreCode != null && (obj = StringsKt.trim((CharSequence) oldStoreCode).toString()) != null && obj.length() > 0) {
                str = obj;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        List distinct = CollectionsKt.distinct(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : distinct) {
            if (!this.requestedOldPriceStoreCodes.contains((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            return;
        }
        Log.d(TAG, "requestOldPriceBillingDetails: Requesting " + arrayList3.size() + " old-price SKUs for display only");
        this.requestedOldPriceStoreCodes.addAll(arrayList3);
        this.isFetchingOldPriceDetails = true;
        getBillingService().getProductDetails(arrayList3, this);
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        boolean z;
        VideoOfferAvailabilityPhase videoOfferAvailabilityPhase;
        ShopLayoutModel model;
        Long resetsAtEpochMs;
        Intrinsics.checkNotNullParameter(info, "info");
        Log.d(TAG, "onVideoRewardInfoUpdated: available=" + info.isAvailable() + ", amount=" + info.getPrizeAmount() + ", shopItemsLoaded=" + this.shopItemsLoaded);
        if (!isActive()) {
            Log.d(TAG, "onVideoRewardInfoUpdated: Fragment not active, returning");
            return;
        }
        boolean z2 = false;
        try {
            z = getVideoRewardService().isRewardedReady(PromoService.PromoPlacement.SHOP_BONUS);
        } catch (Exception e) {
            Log.e(TAG, "Error checking rewarded ad availability", e);
            z = false;
        }
        boolean z3 = info.isAvailable() && !info.isQuotaExhausted();
        if (z3 && z) {
            z2 = true;
        }
        if (info.isQuotaExhausted() && (resetsAtEpochMs = info.getResetsAtEpochMs()) != null && resetsAtEpochMs.longValue() > System.currentTimeMillis()) {
            videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.COOLDOWN;
        } else if (info.isQuotaExhausted()) {
            videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.LIMIT_REACHED;
        } else if (z2) {
            videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.READY;
        } else if (z3) {
            videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.CHECKING;
        } else {
            videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.UNAVAILABLE;
        }
        Log.d(TAG, "Video reward updated: backendAvailable=" + z3 + ", adSdkAvailable=" + z + ", finalAvailable=" + z2 + ", amount=" + info.getPrizeAmount());
        if (z3 && !getVideoRewardService().isRewardedReady(PromoService.PromoPlacement.SHOP_BONUS)) {
            getVideoRewardService().preloadRewarded(PromoService.PromoPlacement.SHOP_BONUS);
            scheduleVideoRewardRetry();
            Job job = this.videoRewardSearchTimeoutJob;
            if (job == null || !job.isActive()) {
                scheduleVideoRewardSearchTimeout();
            }
        } else {
            cancelVideoRewardRetry();
            Job job2 = this.videoRewardSearchTimeoutJob;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.videoRewardSearchTimeoutJob = null;
        }
        updateVideoRewardState(z2, videoOfferAvailabilityPhase, info);
        if (this.shopItemsLoaded) {
            Log.d(TAG, "onVideoRewardInfoUpdated: Shop layout loaded, refreshing content");
            FetchedResponseMessage<ShopLayoutModel, Void> fetchedResponseMessage = this.layoutResponseMessage;
            if (fetchedResponseMessage == null || (model = fetchedResponseMessage.getModel()) == null) {
                return;
            }
            publishShopContent(model);
            return;
        }
        Log.d(TAG, "onVideoRewardInfoUpdated: Shop items not loaded yet, will update when they arrive");
    }

    private final ShopItemDataModel withShopV2VideoHtml(ShopItemDataModel item) {
        ShopVideoRewardHtml shopVideoRewardHtml = ShopVideoRewardHtml.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return shopVideoRewardHtml.enrichForShopV2(requireContext, item);
    }

    private final void updateVideoRewardState(boolean isAvailable, VideoOfferAvailabilityPhase phase, VideoRewardPlacementInfo info) {
        ShopLayoutModel model;
        if (this._videoRewardItem.getValue().getVideoOfferPhase() == VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS) {
            phase = VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS;
        }
        this._videoRewardItem.setValue(withShopV2VideoHtml(ShopItemDataModel.INSTANCE.createVideoReward(info.getPrizeAmount(), isAvailable, phase, info.getRemainingInInterval(), info.getMaxPerInterval())));
        FetchedResponseMessage<ShopLayoutModel, Void> fetchedResponseMessage = this.layoutResponseMessage;
        if (fetchedResponseMessage != null && (model = fetchedResponseMessage.getModel()) != null) {
            publishShopContent(model);
        }
        Log.d(TAG, "updateVideoRewardState: amount=" + info.getPrizeAmount() + ", isAvailable=" + isAvailable + ", remaining=" + info.getRemainingInInterval() + "/" + info.getMaxPerInterval());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshVideoRewardAvailability() {
        getVideoRewardService().invalidateVideoRewardState(PromoService.PromoPlacement.SHOP_BONUS);
        getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.SHOP_BONUS, null, null);
    }

    private final void beginVideoRewardSearch() {
        ShopItemDataModel copy;
        ShopLayoutModel model;
        MutableStateFlow<ShopItemDataModel> mutableStateFlow = this._videoRewardItem;
        copy = r3.copy((r50 & 1) != 0 ? r3.id : 0L, (r50 & 2) != 0 ? r3.type : null, (r50 & 4) != 0 ? r3.title : null, (r50 & 8) != 0 ? r3.description : null, (r50 & 16) != 0 ? r3.amount : 0L, (r50 & 32) != 0 ? r3.price : null, (r50 & 64) != 0 ? r3.oldPrice : null, (r50 & 128) != 0 ? r3.imgUrl : null, (r50 & 256) != 0 ? r3.multiplier : null, (r50 & 512) != 0 ? r3.popular : false, (r50 & 1024) != 0 ? r3.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? r3.videoOfferPhase : VideoOfferAvailabilityPhase.CHECKING, (r50 & 4096) != 0 ? r3.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? r3.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? r3.storeCode : null, (r50 & 32768) != 0 ? r3.effectCoef : null, (r50 & 65536) != 0 ? r3.effectDuration : null, (r50 & 131072) != 0 ? r3.displaySection : null, (r50 & 262144) != 0 ? r3.displayLabel : null, (r50 & 524288) != 0 ? r3.badgeType : null, (r50 & 1048576) != 0 ? r3.unitPriceLabel : null, (r50 & 2097152) != 0 ? r3.entitlement : null, (r50 & 4194304) != 0 ? r3.noAds : false, (r50 & 8388608) != 0 ? r3.packageDays : null, (r50 & 16777216) != 0 ? r3.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? r3.discountPercent : 0, (r50 & 67108864) != 0 ? r3.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.htmlContent : null, (r50 & 268435456) != 0 ? r3.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? mutableStateFlow.getValue().columnsInRow : 0);
        mutableStateFlow.setValue(copy);
        FetchedResponseMessage<ShopLayoutModel, Void> fetchedResponseMessage = this.layoutResponseMessage;
        if (fetchedResponseMessage != null && (model = fetchedResponseMessage.getModel()) != null) {
            publishShopContent(model);
        }
        getVideoRewardService().preloadRewarded(PromoService.PromoPlacement.SHOP_BONUS);
        scheduleVideoRewardSearchTimeout();
    }

    private final void retryVideoRewardSearch() {
        beginVideoRewardSearch();
        refreshVideoRewardAvailability();
    }

    private final void scheduleVideoRewardSearchTimeout() {
        Job job = this.videoRewardSearchTimeoutJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardSearchTimeoutJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ShopBetcoinsFragmentK$scheduleVideoRewardSearchTimeout$1(this, null), 3, null);
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        if (!isActive()) {
            Log.d(TAG, "onVideoRewardRequestProcessed: Fragment not active, returning");
        } else if (result != VideoRewardService.RewardedVideoResult.SUCCESS) {
            handleVideoRewardFailure(result);
        } else {
            handleVideoRewardSuccess(amount);
        }
    }

    private final void handleVideoRewardSuccess(long amount) {
        ShopItemDataModel copy;
        ShopLayoutModel model;
        ShopItemDataModel value = this._videoRewardItem.getValue();
        MutableStateFlow<ShopItemDataModel> mutableStateFlow = this._videoRewardItem;
        VideoOfferAvailabilityPhase videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.CHECKING;
        Long valueOf = Long.valueOf(amount);
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        copy = value.copy((r50 & 1) != 0 ? value.id : 0L, (r50 & 2) != 0 ? value.type : null, (r50 & 4) != 0 ? value.title : null, (r50 & 8) != 0 ? value.description : null, (r50 & 16) != 0 ? value.amount : valueOf != null ? valueOf.longValue() : value.getAmount(), (r50 & 32) != 0 ? value.price : null, (r50 & 64) != 0 ? value.oldPrice : null, (r50 & 128) != 0 ? value.imgUrl : null, (r50 & 256) != 0 ? value.multiplier : null, (r50 & 512) != 0 ? value.popular : false, (r50 & 1024) != 0 ? value.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? value.videoOfferPhase : videoOfferAvailabilityPhase, (r50 & 4096) != 0 ? value.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? value.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? value.storeCode : null, (r50 & 32768) != 0 ? value.effectCoef : null, (r50 & 65536) != 0 ? value.effectDuration : null, (r50 & 131072) != 0 ? value.displaySection : null, (r50 & 262144) != 0 ? value.displayLabel : null, (r50 & 524288) != 0 ? value.badgeType : null, (r50 & 1048576) != 0 ? value.unitPriceLabel : null, (r50 & 2097152) != 0 ? value.entitlement : null, (r50 & 4194304) != 0 ? value.noAds : false, (r50 & 8388608) != 0 ? value.packageDays : null, (r50 & 16777216) != 0 ? value.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? value.discountPercent : 0, (r50 & 67108864) != 0 ? value.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? value.htmlContent : null, (r50 & 268435456) != 0 ? value.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? value.columnsInRow : 0);
        mutableStateFlow.setValue(copy);
        FetchedResponseMessage<ShopLayoutModel, Void> fetchedResponseMessage = this.layoutResponseMessage;
        if (fetchedResponseMessage != null && (model = fetchedResponseMessage.getModel()) != null) {
            publishShopContent(model);
        }
        refreshVideoRewardAvailability();
    }

    private final void handleVideoRewardFailure(VideoRewardService.RewardedVideoResult result) {
        VideoOfferAvailabilityPhase videoOfferAvailabilityPhase;
        ShopItemDataModel copy;
        ShopLayoutModel model;
        ShopItemDataModel copy2;
        ShopLayoutModel model2;
        if (result == VideoRewardService.RewardedVideoResult.NO_FILL) {
            MutableStateFlow<ShopItemDataModel> mutableStateFlow = this._videoRewardItem;
            copy2 = r3.copy((r50 & 1) != 0 ? r3.id : 0L, (r50 & 2) != 0 ? r3.type : null, (r50 & 4) != 0 ? r3.title : null, (r50 & 8) != 0 ? r3.description : null, (r50 & 16) != 0 ? r3.amount : 0L, (r50 & 32) != 0 ? r3.price : null, (r50 & 64) != 0 ? r3.oldPrice : null, (r50 & 128) != 0 ? r3.imgUrl : null, (r50 & 256) != 0 ? r3.multiplier : null, (r50 & 512) != 0 ? r3.popular : false, (r50 & 1024) != 0 ? r3.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? r3.videoOfferPhase : VideoOfferAvailabilityPhase.CHECKING, (r50 & 4096) != 0 ? r3.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? r3.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? r3.storeCode : null, (r50 & 32768) != 0 ? r3.effectCoef : null, (r50 & 65536) != 0 ? r3.effectDuration : null, (r50 & 131072) != 0 ? r3.displaySection : null, (r50 & 262144) != 0 ? r3.displayLabel : null, (r50 & 524288) != 0 ? r3.badgeType : null, (r50 & 1048576) != 0 ? r3.unitPriceLabel : null, (r50 & 2097152) != 0 ? r3.entitlement : null, (r50 & 4194304) != 0 ? r3.noAds : false, (r50 & 8388608) != 0 ? r3.packageDays : null, (r50 & 16777216) != 0 ? r3.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? r3.discountPercent : 0, (r50 & 67108864) != 0 ? r3.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.htmlContent : null, (r50 & 268435456) != 0 ? r3.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? mutableStateFlow.getValue().columnsInRow : 0);
            mutableStateFlow.setValue(copy2);
            FetchedResponseMessage<ShopLayoutModel, Void> fetchedResponseMessage = this.layoutResponseMessage;
            if (fetchedResponseMessage != null && (model2 = fetchedResponseMessage.getModel()) != null) {
                publishShopContent(model2);
            }
            SnackbarHelper.showShort(getActivity(), R.string.video_ads_still_checking);
            getVideoRewardService().preloadRewarded(PromoService.PromoPlacement.SHOP_BONUS);
            scheduleVideoRewardRetry();
            Job job = this.videoRewardSearchTimeoutJob;
            if (job == null || !job.isActive()) {
                scheduleVideoRewardSearchTimeout();
                return;
            }
            return;
        }
        MutableStateFlow<ShopItemDataModel> mutableStateFlow2 = this._videoRewardItem;
        ShopItemDataModel value = mutableStateFlow2.getValue();
        if (this._videoRewardItem.getValue().isVideoRewardAvailable()) {
            videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.READY;
        } else {
            videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.CHECKING;
        }
        copy = value.copy((r50 & 1) != 0 ? value.id : 0L, (r50 & 2) != 0 ? value.type : null, (r50 & 4) != 0 ? value.title : null, (r50 & 8) != 0 ? value.description : null, (r50 & 16) != 0 ? value.amount : 0L, (r50 & 32) != 0 ? value.price : null, (r50 & 64) != 0 ? value.oldPrice : null, (r50 & 128) != 0 ? value.imgUrl : null, (r50 & 256) != 0 ? value.multiplier : null, (r50 & 512) != 0 ? value.popular : false, (r50 & 1024) != 0 ? value.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? value.videoOfferPhase : videoOfferAvailabilityPhase, (r50 & 4096) != 0 ? value.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? value.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? value.storeCode : null, (r50 & 32768) != 0 ? value.effectCoef : null, (r50 & 65536) != 0 ? value.effectDuration : null, (r50 & 131072) != 0 ? value.displaySection : null, (r50 & 262144) != 0 ? value.displayLabel : null, (r50 & 524288) != 0 ? value.badgeType : null, (r50 & 1048576) != 0 ? value.unitPriceLabel : null, (r50 & 2097152) != 0 ? value.entitlement : null, (r50 & 4194304) != 0 ? value.noAds : false, (r50 & 8388608) != 0 ? value.packageDays : null, (r50 & 16777216) != 0 ? value.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? value.discountPercent : 0, (r50 & 67108864) != 0 ? value.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? value.htmlContent : null, (r50 & 268435456) != 0 ? value.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? value.columnsInRow : 0);
        mutableStateFlow2.setValue(copy);
        FetchedResponseMessage<ShopLayoutModel, Void> fetchedResponseMessage2 = this.layoutResponseMessage;
        if (fetchedResponseMessage2 != null && (model = fetchedResponseMessage2.getModel()) != null) {
            publishShopContent(model);
        }
        SnackbarHelper.showShort(getActivity(), R.string.error);
    }

    private final void scheduleVideoRewardRetry() {
        cancelVideoRewardRetry();
        Runnable runnable = new Runnable() { // from class: org.betup.ui.fragment.shop.ShopBetcoinsFragmentK$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ShopBetcoinsFragmentK.scheduleVideoRewardRetry$lambda$30(ShopBetcoinsFragmentK.this);
            }
        };
        this.videoRewardRetryRunnable = runnable;
        Handler handler = this.videoRewardRetryHandler;
        Intrinsics.checkNotNull(runnable);
        handler.postDelayed(runnable, VIDEO_REWARD_RETRY_DELAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleVideoRewardRetry$lambda$30(ShopBetcoinsFragmentK shopBetcoinsFragmentK) {
        shopBetcoinsFragmentK.videoRewardRetryRunnable = null;
        if (shopBetcoinsFragmentK.isActive()) {
            Log.d(TAG, "scheduleVideoRewardRetry: Retrying video reward availability check");
            shopBetcoinsFragmentK.getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.SHOP_BONUS, null, null);
        }
    }

    private final void cancelVideoRewardRetry() {
        Runnable runnable = this.videoRewardRetryRunnable;
        if (runnable != null) {
            this.videoRewardRetryHandler.removeCallbacks(runnable);
            this.videoRewardRetryRunnable = null;
        }
    }

    private final void scheduleVideoRewardRefresh() {
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ShopBetcoinsFragmentK$scheduleVideoRewardRefresh$1(this, null), 3, null);
    }

    public final void displayProgress() {
        Log.d(TAG, "displayProgress: Called");
        if (!isActive()) {
            Log.d(TAG, "displayProgress: Fragment not active, returning");
        } else {
            this._isLoading.setValue(true);
            Log.d(TAG, "displayProgress: Set isLoading = true");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleShopItemClick(ShopItemDataModel shopItem) {
        if (isVideoRewardItem(shopItem)) {
            handleVideoRewardClick(shopItem);
        } else {
            handleRegularShopItemClick(shopItem);
        }
    }

    private final boolean isVideoRewardItem(ShopItemDataModel shopItem) {
        return shopItem.getId() == -1 && shopItem.getType() == ShopItemType.Bonus;
    }

    private final void handleVideoRewardClick(ShopItemDataModel shopItem) {
        ShopItemDataModel copy;
        ShopLayoutModel model;
        switch (WhenMappings.$EnumSwitchMapping$1[shopItem.getVideoOfferPhase().ordinal()]) {
            case 1:
                SnackbarHelper.showShort(getActivity(), R.string.video_ads_still_checking);
                return;
            case 2:
                SnackbarHelper.showShort(getActivity(), R.string.video_ads_still_checking);
                retryVideoRewardSearch();
                return;
            case 3:
            case 4:
                SnackbarHelper.showShort(getActivity(), R.string.home_video_reward_limit_reached);
                return;
            case 5:
                return;
            case 6:
                MutableStateFlow<ShopItemDataModel> mutableStateFlow = this._videoRewardItem;
                copy = r3.copy((r50 & 1) != 0 ? r3.id : 0L, (r50 & 2) != 0 ? r3.type : null, (r50 & 4) != 0 ? r3.title : null, (r50 & 8) != 0 ? r3.description : null, (r50 & 16) != 0 ? r3.amount : 0L, (r50 & 32) != 0 ? r3.price : null, (r50 & 64) != 0 ? r3.oldPrice : null, (r50 & 128) != 0 ? r3.imgUrl : null, (r50 & 256) != 0 ? r3.multiplier : null, (r50 & 512) != 0 ? r3.popular : false, (r50 & 1024) != 0 ? r3.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? r3.videoOfferPhase : VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS, (r50 & 4096) != 0 ? r3.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? r3.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? r3.storeCode : null, (r50 & 32768) != 0 ? r3.effectCoef : null, (r50 & 65536) != 0 ? r3.effectDuration : null, (r50 & 131072) != 0 ? r3.displaySection : null, (r50 & 262144) != 0 ? r3.displayLabel : null, (r50 & 524288) != 0 ? r3.badgeType : null, (r50 & 1048576) != 0 ? r3.unitPriceLabel : null, (r50 & 2097152) != 0 ? r3.entitlement : null, (r50 & 4194304) != 0 ? r3.noAds : false, (r50 & 8388608) != 0 ? r3.packageDays : null, (r50 & 16777216) != 0 ? r3.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? r3.discountPercent : 0, (r50 & 67108864) != 0 ? r3.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.htmlContent : null, (r50 & 268435456) != 0 ? r3.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? mutableStateFlow.getValue().columnsInRow : 0);
                mutableStateFlow.setValue(copy);
                FetchedResponseMessage<ShopLayoutModel, Void> fetchedResponseMessage = this.layoutResponseMessage;
                if (fetchedResponseMessage != null && (model = fetchedResponseMessage.getModel()) != null) {
                    publishShopContent(model);
                }
                getVideoRewardService().attemptRewardedVideoWithFreshStateCheck(PromoService.PromoPlacement.SHOP_BONUS, null, null);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final NewShopItemModel findShopItemModel(ShopItemDataModel shopItem) {
        ShopLayoutModel model;
        FetchedResponseMessage<ShopLayoutModel, Void> fetchedResponseMessage = this.layoutResponseMessage;
        Object obj = null;
        if (fetchedResponseMessage == null || (model = fetchedResponseMessage.getModel()) == null) {
            return null;
        }
        Iterator<T> it = getShopViewModel().flattenLayoutItems(model).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((NewShopItemModel) next).getId() == shopItem.getId()) {
                obj = next;
                break;
            }
        }
        return (NewShopItemModel) obj;
    }

    private final void handleRegularShopItemClick(ShopItemDataModel shopItem) {
        if (ShopEntitlementUi.INSTANCE.hasActiveEntitlement(shopItem.getEntitlement())) {
            ShopEntitlementModel entitlement = shopItem.getEntitlement();
            if (entitlement == null || !entitlement.getCanClaim()) {
                return;
            }
            handleEntitlementClaim(shopItem);
            return;
        }
        NewShopItemModel findShopItemModel = findShopItemModel(shopItem);
        if (findShopItemModel != null) {
            if (findShopItemModel.getItemType() == ShopItemType.Bonus) {
                getVideoRewardService().redeemReward(PromoService.PromoPlacement.SHOP_BONUS, null, null);
            } else {
                initiatePurchase(findShopItemModel);
            }
        }
    }

    private final void initiatePurchase(NewShopItemModel item) {
        if (StringsKt.isBlank(item.getStoreCode())) {
            Log.e(TAG, "initiatePurchase: storeCode is blank for item " + item.getId());
            SnackbarHelper.showShort(getActivity(), R.string.one_click_bet_unlock_failed_detail);
            return;
        }
        Map<String, ProductDetails> map = this.productDetailsMap;
        if (map == null || !map.containsKey(item.getStoreCode())) {
            Log.e(TAG, "initiatePurchase: No Play billing details for purchase storeCode=" + item.getStoreCode());
            SnackbarHelper.showShort(getActivity(), R.string.one_click_bet_unlock_failed_detail);
        } else {
            this.pendingItem = item;
            displayProgress();
            getBillingService().purchaseItem(requireActivity(), item.getStoreCode(), this);
        }
    }

    public final void hideProgress() {
        Log.d(TAG, "hideProgress: Called");
        if (!isActive()) {
            Log.d(TAG, "hideProgress: Fragment not active, returning");
            this._isLoading.setValue(false);
        } else {
            this._isLoading.setValue(false);
            Log.d(TAG, "hideProgress: Set isLoading = false");
        }
    }
}
