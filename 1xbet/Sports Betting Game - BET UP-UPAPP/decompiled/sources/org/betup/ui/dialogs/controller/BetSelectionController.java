package org.betup.ui.dialogs.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.bus.ChallengesChangedMessage;
import org.betup.bus.ShowNotEnoughBetcoinsVideoOfferMessage;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.interactor.NewChallengeDetailsInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeAcceptInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeAcceptRequest;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.PurchaseCompletedListener;
import org.betup.services.billing.UnlockBetTypesFlow;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.dialogs.events.ChallengeAcceptedOrCreatedEvent;
import org.betup.ui.dialogs.events.OpenChallengeAcceptDialogEvent;
import org.betup.ui.dialogs.events.OpenChallengePreviewDialog;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.BasePagingController;
import org.betup.ui.fragment.matches.FavoriteSaver;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetSelectionController.kt */
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-*\u0002\u0090\u0001\b\u0007\u0018\u0000 æ\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002æ\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010R\u001a\u00020\u0002H\u0014J*\u0010W\u001a\u00020X2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020X0]H\u0016J8\u0010_\u001a\u00020X2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020[0Z2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020X0]H\u0016J\u0012\u0010¶\u0001\u001a\u00020X2\u0007\u0010·\u0001\u001a\u00020[H\u0002J\u0081\u0001\u0010¸\u0001\u001a\u00020X2\b\u0010¹\u0001\u001a\u00030º\u00012\u000e\u0010°\u0001\u001a\t\u0012\u0004\u0012\u00020X0±\u00012\b\u0010»\u0001\u001a\u00030³\u00012\u0006\u0010}\u001a\u00020u2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010u2\u0006\u0010x\u001a\u00020w2\u000b\b\u0002\u0010¼\u0001\u001a\u0004\u0018\u00010u2\u000b\b\u0002\u0010½\u0001\u001a\u0004\u0018\u00010u2\u0018\b\u0002\u0010´\u0001\u001a\u0011\u0012\u0005\u0012\u00030µ\u0001\u0012\u0004\u0012\u00020X\u0018\u00010]¢\u0006\u0003\u0010¾\u0001J\u0011\u0010¿\u0001\u001a\u00020X2\u0006\u0010}\u001a\u00020[H\u0002J\u0018\u0010À\u0001\u001a\u00020X2\r\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020u0ZH\u0002J\u0010\u0010Â\u0001\u001a\u00020X2\u0007\u0010Ã\u0001\u001a\u00020[J\u0019\u0010Ä\u0001\u001a\u00020X2\u0007\u0010Å\u0001\u001a\u00020u2\u0007\u0010Æ\u0001\u001a\u00020[J\u0010\u0010Ç\u0001\u001a\u00020X2\u0007\u0010Å\u0001\u001a\u00020uJ(\u0010È\u0001\u001a\u00020X2\u0007\u0010É\u0001\u001a\u00020[2\u0007\u0010Ê\u0001\u001a\u00020^2\r\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u00020u0ZJ\u0007\u0010Ì\u0001\u001a\u00020XJ\u001a\u0010Í\u0001\u001a\u00020X2\u0007\u0010Î\u0001\u001a\u00020u2\u0006\u0010}\u001a\u00020uH\u0002J\u001a\u0010Ï\u0001\u001a\u00020X2\u0007\u0010Î\u0001\u001a\u00020u2\u0006\u0010}\u001a\u00020uH\u0002J\u0010\u0010Ð\u0001\u001a\u00020X2\u0007\u0010Ñ\u0001\u001a\u00020uJ\u0007\u0010Ò\u0001\u001a\u00020XJ*\u0010Ó\u0001\u001a\u00020X2\u0006\u0010}\u001a\u00020u2\b\u0010{\u001a\u0004\u0018\u00010u2\t\u0010¼\u0001\u001a\u0004\u0018\u00010u¢\u0006\u0003\u0010Ô\u0001J\t\u0010Õ\u0001\u001a\u00020XH\u0016J\t\u0010Ö\u0001\u001a\u00020XH\u0016J\t\u0010×\u0001\u001a\u00020XH\u0016J\u0012\u0010Ø\u0001\u001a\u00020X2\u0007\u0010Ù\u0001\u001a\u00020^H\u0014J\t\u0010Ú\u0001\u001a\u00020XH\u0016J\u0013\u0010Û\u0001\u001a\u00020X2\b\u0010Ü\u0001\u001a\u00030\u0093\u0001H\u0002J\u0013\u0010Ý\u0001\u001a\u00020X2\b\u0010Ü\u0001\u001a\u00030\u0093\u0001H\u0002J\u0013\u0010Þ\u0001\u001a\u00020X2\b\u0010Ü\u0001\u001a\u00030\u0093\u0001H\u0002J\u0007\u0010ß\u0001\u001a\u00020XJ\u0007\u0010à\u0001\u001a\u00020XJ\u0007\u0010á\u0001\u001a\u00020XJ\u0007\u0010â\u0001\u001a\u00020XJ\u0007\u0010ã\u0001\u001a\u00020XJ\u0007\u0010ä\u0001\u001a\u00020XJ\u0007\u0010å\u0001\u001a\u00020XR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020DX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010E\u001a\u00020F8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u000e\u0010K\u001a\u00020LX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010M\u001a\u0004\u0018\u00010NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u0004\u0018\u00010NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010S\u001a\u00020TX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0016\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0f¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u001a\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0Z0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0Z0f¢\u0006\b\n\u0000\u001a\u0004\bl\u0010hR\u001a\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0Z0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0Z0f¢\u0006\b\n\u0000\u001a\u0004\bp\u0010hR\u0014\u0010q\u001a\b\u0012\u0004\u0012\u00020[0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020[0f¢\u0006\b\n\u0000\u001a\u0004\bs\u0010hR\u0016\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010u0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010v\u001a\u0004\u0018\u00010wX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010x\u001a\u0004\u0018\u00010w8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0012\u0010{\u001a\u0004\u0018\u00010uX\u0082\u000e¢\u0006\u0004\n\u0002\u0010|R\u0012\u0010}\u001a\u0004\u0018\u00010uX\u0082\u000e¢\u0006\u0004\n\u0002\u0010|R\u0016\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u007f0cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0080\u0001\u001a\u0004\u0018\u00010uX\u0082\u000e¢\u0006\u0004\n\u0002\u0010|R\u0013\u0010\u0081\u0001\u001a\u0004\u0018\u00010uX\u0082\u000e¢\u0006\u0004\n\u0002\u0010|R\u001b\u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u007f0f¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010hR\u0015\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020^0cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020^0f¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010hR\u0015\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020^0cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020^0f¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010hR\u0015\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020^0cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020^0f¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010hR\u0015\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020^0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020^0f¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010hR\u0015\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020u0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020u0f¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010hR\u0013\u0010\u008f\u0001\u001a\u00030\u0090\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u0091\u0001R\u0018\u0010\u0092\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0094\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010f¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010hR\u0018\u0010\u0096\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0097\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010f¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010hR\u0018\u0010\u0099\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u009a\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010f¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010hR\u0015\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020^0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020^0f¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010hR\u0015\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020^0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020^0f¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010hR\u0015\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020^0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020^0f¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010hR\u0015\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020[0cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020[0f¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010hR\u0013\u0010¨\u0001\u001a\u0004\u0018\u00010uX\u0082\u000e¢\u0006\u0004\n\u0002\u0010|R \u0010©\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020u0ª\u00010f¢\u0006\t\n\u0000\u001a\u0005\b«\u0001\u0010hR/\u0010¬\u0001\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020[\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020^0\u00ad\u00010\u00ad\u00010cX\u0082\u0004¢\u0006\u0002\n\u0000R3\u0010®\u0001\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020[\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020^0\u00ad\u00010\u00ad\u00010f¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010hR\u0018\u0010°\u0001\u001a\u000b\u0012\u0004\u0012\u00020X\u0018\u00010±\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010²\u0001\u001a\u0005\u0018\u00010³\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010´\u0001\u001a\u0011\u0012\u0005\u0012\u00030µ\u0001\u0012\u0004\u0012\u00020X\u0018\u00010]X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006ç\u0001"}, d2 = {"Lorg/betup/ui/dialogs/controller/BetSelectionController;", "Lorg/betup/ui/fragment/matches/BasePagingController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", "Lorg/betup/services/billing/PurchaseCompletedListener;", "Lorg/betup/ui/ProgressDisplay;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "matchBetGroupsInteractor", "Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;", "getMatchBetGroupsInteractor", "()Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;", "setMatchBetGroupsInteractor", "(Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;)V", "matchDetailsInteractor", "Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;", "getMatchDetailsInteractor", "()Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;", "setMatchDetailsInteractor", "(Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;)V", "challengeAcceptInteractor", "Lorg/betup/model/remote/api/rest/energy/ChallengeAcceptInteractor;", "getChallengeAcceptInteractor", "()Lorg/betup/model/remote/api/rest/energy/ChallengeAcceptInteractor;", "setChallengeAcceptInteractor", "(Lorg/betup/model/remote/api/rest/energy/ChallengeAcceptInteractor;)V", "newChallengeDetailsInteractor", "Lorg/betup/model/remote/api/interactor/NewChallengeDetailsInteractor;", "getNewChallengeDetailsInteractor", "()Lorg/betup/model/remote/api/interactor/NewChallengeDetailsInteractor;", "setNewChallengeDetailsInteractor", "(Lorg/betup/model/remote/api/interactor/NewChallengeDetailsInteractor;)V", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getFirebaseRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setFirebaseRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "singleShopInteractor", "Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "getSingleShopInteractor", "()Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "setSingleShopInteractor", "(Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "unlockBetTypesFlow", "Lorg/betup/services/billing/UnlockBetTypesFlow;", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "matchLoadingJob", "Lkotlinx/coroutines/Job;", "betGroupsLoadingJob", "challengeLoadingJob", "acceptBattleJob", "getFavoriteSaver", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "saveFavorites", "", "ids", "", "", "onResult", "Lkotlin/Function1;", "", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "_selectedMatch", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/model/remote/entity/matches/NewMatchItemModel;", "selectedMatch", "Lkotlinx/coroutines/flow/StateFlow;", "getSelectedMatch", "()Lkotlinx/coroutines/flow/StateFlow;", "_subMatches", "Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;", "subMatches", "getSubMatches", "_betGroups", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "betGroups", "getBetGroups", "_selectedBetGroupTabIndex", "selectedBetGroupTabIndex", "getSelectedBetGroupTabIndex", "_selectedBetId", "", "_betSelectionState", "Lorg/betup/ui/dialogs/controller/BattleBetSelectionState;", "betSelectionState", "getBetSelectionState", "()Lorg/betup/ui/dialogs/controller/BattleBetSelectionState;", "battleId", "Ljava/lang/Long;", "matchId", "_battleInfo", "Lorg/betup/ui/dialogs/controller/BattleUserUi;", "_userIdBat", "_rematchBuyIn", "battleInfo", "getBattleInfo", "_isLoadingMatch", "isLoadingMatch", "_isLoadingBets", "isLoadingBets", "_isAcceptingBattle", "isAcceptingBattle", "_isVideoRewardAvailable", "isVideoRewardAvailable", "_videoRewardAmount", "videoRewardAmount", "getVideoRewardAmount", "videoRewardClient", "org/betup/ui/dialogs/controller/BetSelectionController$videoRewardClient$1", "Lorg/betup/ui/dialogs/controller/BetSelectionController$videoRewardClient$1;", "_matchLoadingError", "", "matchLoadingError", "getMatchLoadingError", "_betGroupsLoadingError", "betGroupsLoadingError", "getBetGroupsLoadingError", "_challengeLoadingError", "challengeLoadingError", "getChallengeLoadingError", "_canRetryMatch", "canRetryMatch", "getCanRetryMatch", "_canRetryBetGroups", "canRetryBetGroups", "getCanRetryBetGroups", "_canRetryChallenge", "canRetryChallenge", "getCanRetryChallenge", "_retryCount", "retryCount", "getRetryCount", "_opponentBetId", "selectedBetIds", "", "getSelectedBetIds", "_expandedStatesPerTab", "", "expandedStatesPerTab", "getExpandedStatesPerTab", "onDismiss", "Lkotlin/Function0;", "appContext", "Landroid/content/Context;", "onShowMessage", "", "showMessage", "stringResId", "bind", "activity", "Lorg/betup/ui/MainActivity;", "context", "userId", "rematchBuyIn", "(Lorg/betup/ui/MainActivity;Lkotlin/jvm/functions/Function0;Landroid/content/Context;JLjava/lang/Long;Lorg/betup/ui/dialogs/controller/BattleBetSelectionState;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "loadMatchDetails", "loadBetGroups", "submatchIds", "onBetGroupTabSelected", "index", "onBetClick", "groupId", "betIndex", "onExpandToggle", "setAllExpanded", "tabIndex", "expanded", "groupIds", "createBattle", "acceptExistingBattle", "betId", "openChallengeAcceptDialog", "loadChallengeDetails", "challengeId", "dismiss", "resetAndLoad", "(JLjava/lang/Long;Ljava/lang/Long;)V", "purchaseCompleted", "displayProgress", "hideProgress", "loadPage", "append", "loadNextPage", "handleMatchLoadingError", "errorMessage", "handleBetGroupsLoadingError", "handleChallengeLoadingError", "retryMatchLoading", "retryBetGroupsLoading", "retryChallengeLoading", "clearAllErrors", "refreshAllData", "destroy", "onVideoRewardButtonClicked", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BetSelectionController extends BasePagingController implements FavoriteSaver, PurchaseCompletedListener, ProgressDisplay {

    @Deprecated
    public static final long LOADING_TIMEOUT_MS = 15000;

    @Deprecated
    public static final int MAX_RETRY_COUNT = 2;

    @Deprecated
    public static final long RETRY_DELAY_MS = 1000;
    private MutableStateFlow<BattleUserUi> _battleInfo;
    private final MutableStateFlow<List<MatchVarietyGroupBetsModel>> _betGroups;
    private final MutableStateFlow<String> _betGroupsLoadingError;
    private BattleBetSelectionState _betSelectionState;
    private final MutableStateFlow<Boolean> _canRetryBetGroups;
    private final MutableStateFlow<Boolean> _canRetryChallenge;
    private final MutableStateFlow<Boolean> _canRetryMatch;
    private final MutableStateFlow<String> _challengeLoadingError;
    private final MutableStateFlow<Map<Integer, Map<Long, Boolean>>> _expandedStatesPerTab;
    private MutableStateFlow<Boolean> _isAcceptingBattle;
    private MutableStateFlow<Boolean> _isLoadingBets;
    private MutableStateFlow<Boolean> _isLoadingMatch;
    private final MutableStateFlow<Boolean> _isVideoRewardAvailable;
    private final MutableStateFlow<String> _matchLoadingError;
    private Long _opponentBetId;
    private Long _rematchBuyIn;
    private final MutableStateFlow<Integer> _retryCount;
    private final MutableStateFlow<Integer> _selectedBetGroupTabIndex;
    private final MutableStateFlow<Long> _selectedBetId;
    private final MutableStateFlow<NewMatchItemModel> _selectedMatch;
    private final MutableStateFlow<List<BetGroupsTabs>> _subMatches;
    private Long _userIdBat;
    private final MutableStateFlow<Long> _videoRewardAmount;
    private Job acceptBattleJob;

    @Inject
    public AnalyticsService analyticsService;
    private Context appContext;
    private Long battleId;
    private final StateFlow<BattleUserUi> battleInfo;
    private final StateFlow<List<MatchVarietyGroupBetsModel>> betGroups;
    private final StateFlow<String> betGroupsLoadingError;
    private Job betGroupsLoadingJob;

    @Inject
    public BillingService billingService;
    private final StateFlow<Boolean> canRetryBetGroups;
    private final StateFlow<Boolean> canRetryChallenge;
    private final StateFlow<Boolean> canRetryMatch;

    @Inject
    public ChallengeAcceptInteractor challengeAcceptInteractor;
    private final StateFlow<String> challengeLoadingError;
    private Job challengeLoadingJob;
    private final CoroutineScope coroutineScope;
    private final StateFlow<Map<Integer, Map<Long, Boolean>>> expandedStatesPerTab;
    private final FavouriteTypeK favouriteType;

    @Inject
    public FirebaseRemoteConfig firebaseRemoteConfig;
    private final StateFlow<Boolean> isAcceptingBattle;
    private final StateFlow<Boolean> isLoadingBets;
    private final StateFlow<Boolean> isLoadingMatch;
    private final StateFlow<Boolean> isVideoRewardAvailable;

    @Inject
    public MatchVarietiesInteractor matchBetGroupsInteractor;

    @Inject
    public MatchShortInfoInteractor matchDetailsInteractor;

    @Inject
    public MatchFilterState matchFilterState;
    private Long matchId;
    private final StateFlow<String> matchLoadingError;
    private Job matchLoadingJob;

    @Inject
    public NewChallengeDetailsInteractor newChallengeDetailsInteractor;
    private Function0<Unit> onDismiss;
    private Function1<? super CharSequence, Unit> onShowMessage;
    private final StateFlow<Integer> retryCount;
    private final StateFlow<Integer> selectedBetGroupTabIndex;
    private final StateFlow<Set<Long>> selectedBetIds;
    private final StateFlow<NewMatchItemModel> selectedMatch;

    @Inject
    public NewSingleShopInteractor singleShopInteractor;
    private final StateFlow<List<BetGroupsTabs>> subMatches;
    private UnlockBetTypesFlow unlockBetTypesFlow;

    @Inject
    public UserService userService;
    private final StateFlow<Long> videoRewardAmount;
    private final BetSelectionController$videoRewardClient$1 videoRewardClient;

    @Inject
    public VideoRewardService videoRewardService;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadNextPage() {
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected void loadPage(boolean append) {
    }

    public final MatchVarietiesInteractor getMatchBetGroupsInteractor() {
        MatchVarietiesInteractor matchVarietiesInteractor = this.matchBetGroupsInteractor;
        if (matchVarietiesInteractor != null) {
            return matchVarietiesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchBetGroupsInteractor");
        return null;
    }

    public final void setMatchBetGroupsInteractor(MatchVarietiesInteractor matchVarietiesInteractor) {
        Intrinsics.checkNotNullParameter(matchVarietiesInteractor, "<set-?>");
        this.matchBetGroupsInteractor = matchVarietiesInteractor;
    }

    public final MatchShortInfoInteractor getMatchDetailsInteractor() {
        MatchShortInfoInteractor matchShortInfoInteractor = this.matchDetailsInteractor;
        if (matchShortInfoInteractor != null) {
            return matchShortInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchDetailsInteractor");
        return null;
    }

    public final void setMatchDetailsInteractor(MatchShortInfoInteractor matchShortInfoInteractor) {
        Intrinsics.checkNotNullParameter(matchShortInfoInteractor, "<set-?>");
        this.matchDetailsInteractor = matchShortInfoInteractor;
    }

    public final ChallengeAcceptInteractor getChallengeAcceptInteractor() {
        ChallengeAcceptInteractor challengeAcceptInteractor = this.challengeAcceptInteractor;
        if (challengeAcceptInteractor != null) {
            return challengeAcceptInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challengeAcceptInteractor");
        return null;
    }

    public final void setChallengeAcceptInteractor(ChallengeAcceptInteractor challengeAcceptInteractor) {
        Intrinsics.checkNotNullParameter(challengeAcceptInteractor, "<set-?>");
        this.challengeAcceptInteractor = challengeAcceptInteractor;
    }

    public final NewChallengeDetailsInteractor getNewChallengeDetailsInteractor() {
        NewChallengeDetailsInteractor newChallengeDetailsInteractor = this.newChallengeDetailsInteractor;
        if (newChallengeDetailsInteractor != null) {
            return newChallengeDetailsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newChallengeDetailsInteractor");
        return null;
    }

    public final void setNewChallengeDetailsInteractor(NewChallengeDetailsInteractor newChallengeDetailsInteractor) {
        Intrinsics.checkNotNullParameter(newChallengeDetailsInteractor, "<set-?>");
        this.newChallengeDetailsInteractor = newChallengeDetailsInteractor;
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

    public final FirebaseRemoteConfig getFirebaseRemoteConfig() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.firebaseRemoteConfig;
        if (firebaseRemoteConfig != null) {
            return firebaseRemoteConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firebaseRemoteConfig");
        return null;
    }

    public final void setFirebaseRemoteConfig(FirebaseRemoteConfig firebaseRemoteConfig) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<set-?>");
        this.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public final NewSingleShopInteractor getSingleShopInteractor() {
        NewSingleShopInteractor newSingleShopInteractor = this.singleShopInteractor;
        if (newSingleShopInteractor != null) {
            return newSingleShopInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("singleShopInteractor");
        return null;
    }

    public final void setSingleShopInteractor(NewSingleShopInteractor newSingleShopInteractor) {
        Intrinsics.checkNotNullParameter(newSingleShopInteractor, "<set-?>");
        this.singleShopInteractor = newSingleShopInteractor;
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

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public MatchFilterState getMatchFilterState() {
        MatchFilterState matchFilterState = this.matchFilterState;
        if (matchFilterState != null) {
            return matchFilterState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchFilterState");
        return null;
    }

    public void setMatchFilterState(MatchFilterState matchFilterState) {
        Intrinsics.checkNotNullParameter(matchFilterState, "<set-?>");
        this.matchFilterState = matchFilterState;
    }

    /* compiled from: BetSelectionController.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/betup/ui/dialogs/controller/BetSelectionController$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LOADING_TIMEOUT_MS", "", "MAX_RETRY_COUNT", "", "RETRY_DELAY_MS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected FavoriteSaver getFavoriteSaver() {
        return this;
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected FavouriteTypeK getFavouriteType() {
        return this.favouriteType;
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavorites(List<Integer> ids, Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        onResult.invoke(false);
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavoritesWithDeleteAndPut(List<Integer> initialIds, List<Integer> newIds, Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(initialIds, "initialIds");
        Intrinsics.checkNotNullParameter(newIds, "newIds");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        onResult.invoke(false);
    }

    public final StateFlow<NewMatchItemModel> getSelectedMatch() {
        return this.selectedMatch;
    }

    public final StateFlow<List<BetGroupsTabs>> getSubMatches() {
        return this.subMatches;
    }

    public final StateFlow<List<MatchVarietyGroupBetsModel>> getBetGroups() {
        return this.betGroups;
    }

    @Inject
    public BetSelectionController() {
        super(0, 1, null);
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.favouriteType = FavouriteTypeK.Sports.INSTANCE;
        MutableStateFlow<NewMatchItemModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._selectedMatch = MutableStateFlow;
        this.selectedMatch = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<BetGroupsTabs>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._subMatches = MutableStateFlow2;
        this.subMatches = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<MatchVarietyGroupBetsModel>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._betGroups = MutableStateFlow3;
        this.betGroups = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this._selectedBetGroupTabIndex = MutableStateFlow4;
        this.selectedBetGroupTabIndex = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Long> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._selectedBetId = MutableStateFlow5;
        MutableStateFlow<BattleUserUi> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this._battleInfo = MutableStateFlow6;
        this.battleInfo = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<Boolean> MutableStateFlow7 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingMatch = MutableStateFlow7;
        this.isLoadingMatch = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingBets = MutableStateFlow8;
        this.isLoadingBets = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(false);
        this._isAcceptingBattle = MutableStateFlow9;
        this.isAcceptingBattle = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(false);
        this._isVideoRewardAvailable = MutableStateFlow10;
        this.isVideoRewardAvailable = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<Long> MutableStateFlow11 = StateFlowKt.MutableStateFlow(0L);
        this._videoRewardAmount = MutableStateFlow11;
        this.videoRewardAmount = FlowKt.asStateFlow(MutableStateFlow11);
        this.videoRewardClient = new BetSelectionController$videoRewardClient$1(this);
        MutableStateFlow<String> MutableStateFlow12 = StateFlowKt.MutableStateFlow(null);
        this._matchLoadingError = MutableStateFlow12;
        this.matchLoadingError = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow<String> MutableStateFlow13 = StateFlowKt.MutableStateFlow(null);
        this._betGroupsLoadingError = MutableStateFlow13;
        this.betGroupsLoadingError = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow<String> MutableStateFlow14 = StateFlowKt.MutableStateFlow(null);
        this._challengeLoadingError = MutableStateFlow14;
        this.challengeLoadingError = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow<Boolean> MutableStateFlow15 = StateFlowKt.MutableStateFlow(false);
        this._canRetryMatch = MutableStateFlow15;
        this.canRetryMatch = FlowKt.asStateFlow(MutableStateFlow15);
        MutableStateFlow<Boolean> MutableStateFlow16 = StateFlowKt.MutableStateFlow(false);
        this._canRetryBetGroups = MutableStateFlow16;
        this.canRetryBetGroups = FlowKt.asStateFlow(MutableStateFlow16);
        MutableStateFlow<Boolean> MutableStateFlow17 = StateFlowKt.MutableStateFlow(false);
        this._canRetryChallenge = MutableStateFlow17;
        this.canRetryChallenge = FlowKt.asStateFlow(MutableStateFlow17);
        MutableStateFlow<Integer> MutableStateFlow18 = StateFlowKt.MutableStateFlow(0);
        this._retryCount = MutableStateFlow18;
        this.retryCount = FlowKt.asStateFlow(MutableStateFlow18);
        final MutableStateFlow<Long> mutableStateFlow = MutableStateFlow5;
        this.selectedBetIds = FlowKt.stateIn(new Flow<Set<? extends Long>>() { // from class: org.betup.ui.dialogs.controller.BetSelectionController$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Set<? extends Long>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: org.betup.ui.dialogs.controller.BetSelectionController$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "org.betup.ui.dialogs.controller.BetSelectionController$special$$inlined$map$1$2", f = "BetSelectionController.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: org.betup.ui.dialogs.controller.BetSelectionController$special$$inlined$map$1$2$1, reason: invalid class name */
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
                                Long l = (Long) obj;
                                Set of = l != null ? SetsKt.setOf(l) : SetsKt.emptySet();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(of, anonymousClass1) == coroutine_suspended) {
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
        }, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), SetsKt.emptySet());
        MutableStateFlow<Map<Integer, Map<Long, Boolean>>> MutableStateFlow19 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this._expandedStatesPerTab = MutableStateFlow19;
        this.expandedStatesPerTab = FlowKt.asStateFlow(MutableStateFlow19);
    }

    public final StateFlow<Integer> getSelectedBetGroupTabIndex() {
        return this.selectedBetGroupTabIndex;
    }

    /* renamed from: getBetSelectionState, reason: from getter */
    public final BattleBetSelectionState get_betSelectionState() {
        return this._betSelectionState;
    }

    public final StateFlow<BattleUserUi> getBattleInfo() {
        return this.battleInfo;
    }

    public final StateFlow<Boolean> isLoadingMatch() {
        return this.isLoadingMatch;
    }

    public final StateFlow<Boolean> isLoadingBets() {
        return this.isLoadingBets;
    }

    public final StateFlow<Boolean> isAcceptingBattle() {
        return this.isAcceptingBattle;
    }

    public final StateFlow<Boolean> isVideoRewardAvailable() {
        return this.isVideoRewardAvailable;
    }

    public final StateFlow<Long> getVideoRewardAmount() {
        return this.videoRewardAmount;
    }

    public final StateFlow<String> getMatchLoadingError() {
        return this.matchLoadingError;
    }

    public final StateFlow<String> getBetGroupsLoadingError() {
        return this.betGroupsLoadingError;
    }

    public final StateFlow<String> getChallengeLoadingError() {
        return this.challengeLoadingError;
    }

    public final StateFlow<Boolean> getCanRetryMatch() {
        return this.canRetryMatch;
    }

    public final StateFlow<Boolean> getCanRetryBetGroups() {
        return this.canRetryBetGroups;
    }

    public final StateFlow<Boolean> getCanRetryChallenge() {
        return this.canRetryChallenge;
    }

    public final StateFlow<Integer> getRetryCount() {
        return this.retryCount;
    }

    public final StateFlow<Set<Long>> getSelectedBetIds() {
        return this.selectedBetIds;
    }

    public final StateFlow<Map<Integer, Map<Long, Boolean>>> getExpandedStatesPerTab() {
        return this.expandedStatesPerTab;
    }

    private final void showMessage(int stringResId) {
        Context context = this.appContext;
        if (context == null) {
            return;
        }
        String string = context.getString(stringResId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Function1<? super CharSequence, Unit> function1 = this.onShowMessage;
        if (function1 != null) {
            function1.invoke(string);
        } else {
            SnackbarHelper.showShortIfForeground(context, string);
        }
    }

    public final void bind(MainActivity activity, Function0<Unit> onDismiss, Context context, long matchId, Long battleId, BattleBetSelectionState betSelectionState, Long userId, Long rematchBuyIn, Function1<? super CharSequence, Unit> onShowMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(betSelectionState, "betSelectionState");
        this.onDismiss = onDismiss;
        this.onShowMessage = onShowMessage;
        this.appContext = context;
        super.bind(context);
        loadMatchDetails((int) matchId);
        this.battleId = battleId;
        this._betSelectionState = betSelectionState;
        this.matchId = Long.valueOf(matchId);
        this._userIdBat = userId;
        this._rematchBuyIn = rematchBuyIn;
        loadChallengeDetails(battleId != null ? battleId.longValue() : 0L);
        getVideoRewardService().connectClient(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, this.videoRewardClient);
        getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, null);
        this.unlockBetTypesFlow = new UnlockBetTypesFlow(activity, getBillingService(), getFirebaseRemoteConfig(), getSingleShopInteractor(), this, PurchasePlacement.CHALLENGE_BET_DIALOG, getAnalyticsService(), getUserService(), getVideoRewardService());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMatchDetails(int matchId) {
        Job job = this.matchLoadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this._isLoadingMatch.setValue(true);
        this._matchLoadingError.setValue(null);
        this._canRetryMatch.setValue(false);
        Log.d("BetSelectionController", "Loading match details for ID: " + matchId);
        this.matchLoadingJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BetSelectionController$loadMatchDetails$1(this, matchId, null), 3, null);
        getMatchDetailsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.BetSelectionController$$ExternalSyntheticLambda3
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                BetSelectionController.loadMatchDetails$lambda$1(BetSelectionController.this, fetchedResponseMessage);
            }
        }, Integer.valueOf(matchId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadMatchDetails$lambda$1(BetSelectionController betSelectionController, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(betSelectionController.coroutineScope, Dispatchers.getMain(), null, new BetSelectionController$loadMatchDetails$2$1(betSelectionController, fetchedResponseMessage, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadBetGroups(List<Long> submatchIds) {
        Job job = this.betGroupsLoadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Log.d("BetSelectionController", "Loading bet groups for submatch IDs: " + submatchIds);
        this._isLoadingBets.setValue(true);
        this._betGroupsLoadingError.setValue(null);
        this._canRetryBetGroups.setValue(false);
        this.betGroupsLoadingJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BetSelectionController$loadBetGroups$1(this, submatchIds, null), 3, null);
        List<Long> list = submatchIds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
        }
        getMatchBetGroupsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.BetSelectionController$$ExternalSyntheticLambda4
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                BetSelectionController.loadBetGroups$lambda$3(BetSelectionController.this, fetchedResponseMessage);
            }
        }, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBetGroups$lambda$3(BetSelectionController betSelectionController, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(betSelectionController.coroutineScope, Dispatchers.getMain(), null, new BetSelectionController$loadBetGroups$2$1(betSelectionController, fetchedResponseMessage, null), 2, null);
    }

    public final void onBetGroupTabSelected(int index) {
        List<MatchVarietyGroupBetsModel> emptyList;
        this._selectedBetGroupTabIndex.setValue(Integer.valueOf(index));
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(this._subMatches.getValue(), index);
        if (betGroupsTabs == null || (emptyList = betGroupsTabs.getBets()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        this._betGroups.setValue(emptyList);
    }

    public final void onBetClick(long groupId, int betIndex) {
        UnlockBetTypesFlow unlockBetTypesFlow;
        Object obj;
        List<MatchVarietyBetOptionModel> bets;
        Iterator<T> it = this._betGroups.getValue().iterator();
        while (true) {
            unlockBetTypesFlow = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((MatchVarietyGroupBetsModel) obj).getGroup().getId() == groupId) {
                    break;
                }
            }
        }
        MatchVarietyGroupBetsModel matchVarietyGroupBetsModel = (MatchVarietyGroupBetsModel) obj;
        MatchVarietyBetOptionModel matchVarietyBetOptionModel = (matchVarietyGroupBetsModel == null || (bets = matchVarietyGroupBetsModel.getBets()) == null) ? null : (MatchVarietyBetOptionModel) CollectionsKt.getOrNull(bets, betIndex);
        if (matchVarietyBetOptionModel == null) {
            Log.w("BetSelectionController", "Bet option not found for groupId: " + groupId + ", betIndex: " + betIndex);
            return;
        }
        long grabbedBetId = matchVarietyBetOptionModel.getGrabbedBetId();
        Long value = this._selectedBetId.getValue();
        Long l = this._opponentBetId;
        if (l != null && l.longValue() == grabbedBetId) {
            showMessage(R.string.bet_already_selected_by_opponent);
            return;
        }
        if (!matchVarietyGroupBetsModel.getGroup().getUserAvailable()) {
            showMessage(R.string.bet_type_locked);
            UnlockBetTypesFlow unlockBetTypesFlow2 = this.unlockBetTypesFlow;
            if (unlockBetTypesFlow2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unlockBetTypesFlow");
            } else {
                unlockBetTypesFlow = unlockBetTypesFlow2;
            }
            unlockBetTypesFlow.start(this, new String[0]);
            return;
        }
        if (!matchVarietyBetOptionModel.isAvailable()) {
            showMessage(R.string.bet_not_available);
            return;
        }
        if (value != null && value.longValue() == grabbedBetId) {
            this._selectedBetId.setValue(null);
            Log.d("BetSelectionController", "Bet deselected: " + grabbedBetId);
        } else {
            this._selectedBetId.setValue(Long.valueOf(grabbedBetId));
            Log.d("BetSelectionController", "Single bet selected: " + grabbedBetId + " oponent bet = " + this._opponentBetId);
        }
    }

    public final void onExpandToggle(long groupId) {
        LinkedHashMap linkedHashMap;
        int intValue = this._selectedBetGroupTabIndex.getValue().intValue();
        Map<Integer, Map<Long, Boolean>> mutableMap = MapsKt.toMutableMap(this._expandedStatesPerTab.getValue());
        Map<Long, Boolean> map = mutableMap.get(Integer.valueOf(intValue));
        if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(Long.valueOf(groupId), Boolean.valueOf(!(linkedHashMap.get(Long.valueOf(groupId)) != null ? r3.booleanValue() : false)));
        mutableMap.put(Integer.valueOf(intValue), linkedHashMap);
        this._expandedStatesPerTab.setValue(mutableMap);
    }

    public final void setAllExpanded(int tabIndex, boolean expanded, List<Long> groupIds) {
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        Map<Integer, Map<Long, Boolean>> mutableMap = MapsKt.toMutableMap(this._expandedStatesPerTab.getValue());
        List<Long> list = groupIds;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            ((Number) obj).longValue();
            linkedHashMap.put(obj, Boolean.valueOf(expanded));
        }
        mutableMap.put(Integer.valueOf(tabIndex), linkedHashMap);
        this._expandedStatesPerTab.setValue(mutableMap);
    }

    public final void createBattle() {
        UnlockBetTypesFlow unlockBetTypesFlow;
        Object obj;
        MatchVarietyBetOptionModel matchVarietyBetOptionModel;
        List<MatchVarietyBetOptionModel> bets;
        Object obj2;
        Long value = this._selectedBetId.getValue();
        Log.d("BetSelectionController", "Creating battle with selected bet: " + value);
        if (value == null) {
            Log.w("BetSelectionController", "No bet selected for battle creation");
            return;
        }
        Iterator<T> it = this._betGroups.getValue().iterator();
        loop0: while (true) {
            unlockBetTypesFlow = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List<MatchVarietyBetOptionModel> bets2 = ((MatchVarietyGroupBetsModel) obj).getBets();
            if (!(bets2 instanceof Collection) || !bets2.isEmpty()) {
                Iterator<T> it2 = bets2.iterator();
                while (it2.hasNext()) {
                    long grabbedBetId = ((MatchVarietyBetOptionModel) it2.next()).getGrabbedBetId();
                    if (value != null && grabbedBetId == value.longValue()) {
                        break loop0;
                    }
                }
            }
        }
        MatchVarietyGroupBetsModel matchVarietyGroupBetsModel = (MatchVarietyGroupBetsModel) obj;
        if (matchVarietyGroupBetsModel == null || (bets = matchVarietyGroupBetsModel.getBets()) == null) {
            matchVarietyBetOptionModel = null;
        } else {
            Iterator<T> it3 = bets.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                long grabbedBetId2 = ((MatchVarietyBetOptionModel) obj2).getGrabbedBetId();
                if (value != null && grabbedBetId2 == value.longValue()) {
                    break;
                }
            }
            matchVarietyBetOptionModel = (MatchVarietyBetOptionModel) obj2;
        }
        if (matchVarietyBetOptionModel == null) {
            Log.w("BetSelectionController", "Selected bet not found in current groups");
            return;
        }
        if (!matchVarietyGroupBetsModel.getGroup().getUserAvailable()) {
            showMessage(R.string.bet_type_locked);
            UnlockBetTypesFlow unlockBetTypesFlow2 = this.unlockBetTypesFlow;
            if (unlockBetTypesFlow2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unlockBetTypesFlow");
            } else {
                unlockBetTypesFlow = unlockBetTypesFlow2;
            }
            unlockBetTypesFlow.start(this, new String[0]);
            return;
        }
        if (!matchVarietyBetOptionModel.isAvailable()) {
            showMessage(R.string.bet_not_available);
            return;
        }
        Long l = this.battleId;
        if (l != null && l.longValue() > 0) {
            Log.d("BetSelectionController", "Accepting existing battle with ID: " + l);
            Long l2 = this.matchId;
            if (l2 != null) {
                acceptExistingBattle(value.longValue(), l2.longValue());
                return;
            }
            return;
        }
        Log.d("BetSelectionController", "Opening ChallengeAcceptDialogFragment for new battle (battleId: " + l + ")");
        Long l3 = this.matchId;
        if (l3 != null) {
            openChallengeAcceptDialog(value.longValue(), l3.longValue());
        }
    }

    private final void acceptExistingBattle(long betId, long matchId) {
        Object obj;
        Object obj2;
        String amount;
        Long longOrNull;
        List<MatchVarietyBetOptionModel> bets;
        Long l = this.battleId;
        if (l != null) {
            long longValue = l.longValue();
            Log.d("BetSelectionController", "Accepting existing battle: battleId=" + longValue + ", betId=" + betId + ", matchId=" + matchId);
            this._isAcceptingBattle.setValue(true);
            Iterator<T> it = this._betGroups.getValue().iterator();
            loop0: while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                List<MatchVarietyBetOptionModel> bets2 = ((MatchVarietyGroupBetsModel) obj2).getBets();
                if (!(bets2 instanceof Collection) || !bets2.isEmpty()) {
                    Iterator<T> it2 = bets2.iterator();
                    while (it2.hasNext()) {
                        if (((MatchVarietyBetOptionModel) it2.next()).getGrabbedBetId() == betId) {
                            break loop0;
                        }
                    }
                }
            }
            MatchVarietyGroupBetsModel matchVarietyGroupBetsModel = (MatchVarietyGroupBetsModel) obj2;
            if (matchVarietyGroupBetsModel != null && (bets = matchVarietyGroupBetsModel.getBets()) != null) {
                Iterator<T> it3 = bets.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (((MatchVarietyBetOptionModel) next).getGrabbedBetId() == betId) {
                        obj = next;
                        break;
                    }
                }
                obj = (MatchVarietyBetOptionModel) obj;
            }
            if (obj == null) {
                Log.e("BetSelectionController", "Selected bet not found in current groups");
                this._isAcceptingBattle.setValue(false);
                showMessage(R.string.battles_error);
                return;
            }
            BattleUserUi value = this.battleInfo.getValue();
            long longValue2 = (value == null || (amount = value.getAmount()) == null || (longOrNull = StringsKt.toLongOrNull(amount)) == null) ? 0L : longOrNull.longValue();
            if (longValue2 > 0) {
                long moneyBalance = getUserService().getShortProfile().getUserProgressModel().getMoneyBalance();
                long j = (long) (longValue2 * 0.05d);
                long j2 = longValue2 + j;
                if (moneyBalance < j2) {
                    Log.w("BetSelectionController", "Insufficient balance for acceptance: userBalance=" + moneyBalance + ", requiredAmount=" + j2 + " (moneyAccept=" + longValue2 + " + enterFee=" + j + ")");
                    this._isAcceptingBattle.setValue(false);
                    EventBus.getDefault().post(new ShowNotEnoughBetcoinsVideoOfferMessage());
                    return;
                }
            }
            getChallengeAcceptInteractor().load((BaseCachedSharedInteractor.OnFetchedListener<T, BaseCachedSharedInteractor.OnFetchedListener>) new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.BetSelectionController$$ExternalSyntheticLambda1
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    BetSelectionController.acceptExistingBattle$lambda$13(BetSelectionController.this, fetchedResponseMessage);
                }
            }, (BaseCachedSharedInteractor.OnFetchedListener) new ChallengeAcceptRequest(longValue, 2, betId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acceptExistingBattle$lambda$13(BetSelectionController betSelectionController, FetchedResponseMessage fetchedResponseMessage) {
        betSelectionController._isAcceptingBattle.setValue(false);
        if (Intrinsics.areEqual(fetchedResponseMessage.getStat().name(), "SUCCESS") && fetchedResponseMessage.getModel() != null) {
            long id = ((V7ChallengeDetailsResponseModel) fetchedResponseMessage.getModel()).getId();
            Log.d("BetSelectionController", "Battle accepted successfully: " + id);
            EventBus.getDefault().post(new ChallengeAcceptedOrCreatedEvent(Long.valueOf(id)));
            EventBus.getDefault().post(new OpenChallengePreviewDialog(Integer.valueOf((int) id), null, 2, null));
            EventBus.getDefault().post(new ChallengesChangedMessage());
            Log.d("BetSelectionController", "ChallengesChangedMessage posted successfully");
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.controller.BetSelectionController$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    BetSelectionController.acceptExistingBattle$lambda$13$lambda$12();
                }
            }, 3000L);
            Function0<Unit> function0 = betSelectionController.onDismiss;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Log.e("BetSelectionController", "Failed to accept battle: " + fetchedResponseMessage.getStat().name());
        EventBus.getDefault().post(new ShowNotEnoughBetcoinsVideoOfferMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acceptExistingBattle$lambda$13$lambda$12() {
        Log.d("BetSelectionController", "Posting UserProfileUpdatedMessage to update balance after battle acceptance");
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void openChallengeAcceptDialog(long betId, long matchId) {
        Object obj;
        MatchVarietyBetOptionModel matchVarietyBetOptionModel;
        Object obj2;
        String str;
        String l;
        Function0<Unit> function0;
        List<MatchVarietyBetOptionModel> bets;
        Object obj3;
        Log.d("BetSelectionController", "Opening ChallengeAcceptDialogFragment: betId=" + betId + ", matchId=" + matchId + ",");
        setLoadingStates(true);
        Iterator<T> it = this._betGroups.getValue().iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List<MatchVarietyBetOptionModel> bets2 = ((MatchVarietyGroupBetsModel) obj).getBets();
            if (!(bets2 instanceof Collection) || !bets2.isEmpty()) {
                Iterator<T> it2 = bets2.iterator();
                while (it2.hasNext()) {
                    if (((MatchVarietyBetOptionModel) it2.next()).getGrabbedBetId() == betId) {
                        break loop0;
                    }
                }
            }
        }
        MatchVarietyGroupBetsModel matchVarietyGroupBetsModel = (MatchVarietyGroupBetsModel) obj;
        if (matchVarietyGroupBetsModel == null || (bets = matchVarietyGroupBetsModel.getBets()) == null) {
            matchVarietyBetOptionModel = null;
        } else {
            Iterator<T> it3 = bets.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it3.next();
                    if (((MatchVarietyBetOptionModel) obj3).getGrabbedBetId() == betId) {
                        break;
                    }
                }
            }
            matchVarietyBetOptionModel = (MatchVarietyBetOptionModel) obj3;
        }
        if (matchVarietyBetOptionModel == null) {
            Log.e("BetSelectionController", "Selected bet not found in current groups");
            setLoadingStates(false);
            return;
        }
        Iterator<T> it4 = this._subMatches.getValue().iterator();
        loop3: while (true) {
            if (!it4.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it4.next();
            List<MatchVarietyGroupBetsModel> bets3 = ((BetGroupsTabs) obj2).getBets();
            if (!(bets3 instanceof Collection) || !bets3.isEmpty()) {
                Iterator<T> it5 = bets3.iterator();
                while (it5.hasNext()) {
                    List<MatchVarietyBetOptionModel> bets4 = ((MatchVarietyGroupBetsModel) it5.next()).getBets();
                    if (!(bets4 instanceof Collection) || !bets4.isEmpty()) {
                        Iterator<T> it6 = bets4.iterator();
                        while (it6.hasNext()) {
                            if (((MatchVarietyBetOptionModel) it6.next()).getGrabbedBetId() == betId) {
                                break loop3;
                            }
                        }
                    }
                }
            }
        }
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) obj2;
        String title = betGroupsTabs != null ? betGroupsTabs.getTitle() : null;
        EventBus eventBus = EventBus.getDefault();
        Long l2 = this._userIdBat;
        String betName = matchVarietyBetOptionModel.getBetName();
        String name = matchVarietyGroupBetsModel.getGroup().getName();
        BattleUserUi value = this.battleInfo.getValue();
        if (value == null || (l = value.getAmount()) == null) {
            Long l3 = this._rematchBuyIn;
            if (l3 == null) {
                str = null;
                BattleUserUi value2 = this.battleInfo.getValue();
                eventBus.post(new OpenChallengeAcceptDialogEvent(null, matchId, l2, betId, betName, name, title, matchVarietyBetOptionModel.getGrabbedCoefficient(), this._rematchBuyIn, value2 == null ? value2.getPrize() : null, str));
                function0 = this.onDismiss;
                if (function0 == null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            l = l3.toString();
        }
        str = l;
        BattleUserUi value22 = this.battleInfo.getValue();
        eventBus.post(new OpenChallengeAcceptDialogEvent(null, matchId, l2, betId, betName, name, title, matchVarietyBetOptionModel.getGrabbedCoefficient(), this._rematchBuyIn, value22 == null ? value22.getPrize() : null, str));
        function0 = this.onDismiss;
        if (function0 == null) {
        }
    }

    public final void loadChallengeDetails(long challengeId) {
        if (challengeId <= 0) {
            Log.d("BetSelectionController", "Skipping challenge details load for invalid challengeId: " + challengeId);
            return;
        }
        Job job = this.challengeLoadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Log.d("BetSelectionController", "Loading challenge details for challengeId: " + challengeId);
        this._challengeLoadingError.setValue(null);
        this._canRetryChallenge.setValue(false);
        this.challengeLoadingJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BetSelectionController$loadChallengeDetails$1(challengeId, this, null), 3, null);
        getNewChallengeDetailsInteractor().load((BaseCachedSharedInteractor.OnFetchedListener<T, BaseCachedSharedInteractor.OnFetchedListener>) new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.BetSelectionController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                BetSelectionController.loadChallengeDetails$lambda$20(BetSelectionController.this, fetchedResponseMessage);
            }
        }, (BaseCachedSharedInteractor.OnFetchedListener) Long.valueOf(challengeId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadChallengeDetails$lambda$20(BetSelectionController betSelectionController, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(betSelectionController.coroutineScope, Dispatchers.getMain(), null, new BetSelectionController$loadChallengeDetails$2$1(betSelectionController, fetchedResponseMessage, null), 2, null);
    }

    public final void dismiss() {
        Function0<Unit> function0 = this.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void resetAndLoad(long matchId, Long battleId, Long userId) {
        Log.d("BetSelectionController", "Resetting and loading for matchId: " + matchId + ", battleId: " + battleId + ", userId: " + userId);
        this.matchId = Long.valueOf(matchId);
        this.battleId = battleId;
        this._userIdBat = userId;
        this._selectedMatch.setValue(null);
        this._subMatches.setValue(CollectionsKt.emptyList());
        this._betGroups.setValue(CollectionsKt.emptyList());
        this._selectedBetGroupTabIndex.setValue(0);
        this._selectedBetId.setValue(null);
        resetState();
        loadMatchDetails((int) matchId);
    }

    @Override // org.betup.services.billing.PurchaseCompletedListener
    public void purchaseCompleted() {
        Log.d("BetSelectionController", "Purchase completed, refreshing bet groups and availability");
        try {
            getMatchBetGroupsInteractor().invalidate();
            getMatchDetailsInteractor().invalidate();
            List<BetGroupsTabs> value = this._subMatches.getValue();
            ArrayList arrayList = null;
            if (value.isEmpty()) {
                value = null;
            }
            List<BetGroupsTabs> list = value;
            if (list != null) {
                List<BetGroupsTabs> list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((BetGroupsTabs) it.next()).getId()));
                }
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                Log.d("BetSelectionController", "Reloading bet groups for submatches: " + arrayList);
                loadBetGroups(arrayList);
                return;
            }
            Long l = this.matchId;
            if (l != null) {
                long longValue = l.longValue();
                Log.d("BetSelectionController", "Reloading match details for id=" + longValue);
                loadMatchDetails((int) longValue);
            }
        } catch (Throwable th) {
            Log.e("BetSelectionController", "Error refreshing after unlock: " + th.getMessage());
        }
    }

    @Override // org.betup.ui.ProgressDisplay
    public void displayProgress() {
        Log.d("BetSelectionController", "Displaying progress");
    }

    @Override // org.betup.ui.ProgressDisplay
    public void hideProgress() {
        Log.d("BetSelectionController", "Hiding progress");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMatchLoadingError(String errorMessage) {
        Log.e("BetSelectionController", "Match loading error: " + errorMessage);
        this._isLoadingMatch.setValue(false);
        this._matchLoadingError.setValue(errorMessage);
        if (this._retryCount.getValue().intValue() < 2) {
            this._canRetryMatch.setValue(true);
        } else {
            this._canRetryMatch.setValue(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBetGroupsLoadingError(String errorMessage) {
        Log.e("BetSelectionController", "Bet groups loading error: " + errorMessage);
        this._isLoadingBets.setValue(false);
        this._betGroupsLoadingError.setValue(errorMessage);
        if (this._retryCount.getValue().intValue() < 2) {
            this._canRetryBetGroups.setValue(true);
        } else {
            this._canRetryBetGroups.setValue(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleChallengeLoadingError(String errorMessage) {
        Log.e("BetSelectionController", "Challenge loading error: " + errorMessage);
        this._challengeLoadingError.setValue(errorMessage);
        if (this._retryCount.getValue().intValue() < 2) {
            this._canRetryChallenge.setValue(true);
        } else {
            this._canRetryChallenge.setValue(false);
        }
    }

    public final void retryMatchLoading() {
        if (this._retryCount.getValue().intValue() >= 2) {
            Log.w("BetSelectionController", "Cannot retry - max retry count reached");
            return;
        }
        MutableStateFlow<Integer> mutableStateFlow = this._retryCount;
        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
        Log.d("BetSelectionController", "Retrying match loading, attempt: " + this._retryCount.getValue());
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BetSelectionController$retryMatchLoading$1(this, null), 3, null);
    }

    public final void retryBetGroupsLoading() {
        if (this._retryCount.getValue().intValue() >= 2) {
            Log.w("BetSelectionController", "Cannot retry - max retry count reached");
            return;
        }
        MutableStateFlow<Integer> mutableStateFlow = this._retryCount;
        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
        Log.d("BetSelectionController", "Retrying bet groups loading, attempt: " + this._retryCount.getValue());
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BetSelectionController$retryBetGroupsLoading$1(this, null), 3, null);
    }

    public final void retryChallengeLoading() {
        if (this._retryCount.getValue().intValue() >= 2) {
            Log.w("BetSelectionController", "Cannot retry - max retry count reached");
            return;
        }
        MutableStateFlow<Integer> mutableStateFlow = this._retryCount;
        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
        Log.d("BetSelectionController", "Retrying challenge loading, attempt: " + this._retryCount.getValue());
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BetSelectionController$retryChallengeLoading$1(this, null), 3, null);
    }

    public final void clearAllErrors() {
        this._matchLoadingError.setValue(null);
        this._betGroupsLoadingError.setValue(null);
        this._challengeLoadingError.setValue(null);
        this._canRetryMatch.setValue(false);
        this._canRetryBetGroups.setValue(false);
        this._canRetryChallenge.setValue(false);
        this._retryCount.setValue(0);
    }

    public final void refreshAllData() {
        Log.d("BetSelectionController", "Refreshing all data");
        this._retryCount.setValue(0);
        clearAllErrors();
        Long l = this.matchId;
        if (l != null) {
            loadMatchDetails((int) l.longValue());
        }
        Long l2 = this.battleId;
        if (l2 != null) {
            loadChallengeDetails(l2.longValue());
        }
    }

    public final void destroy() {
        Job job = this.matchLoadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.betGroupsLoadingJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Job job3 = this.challengeLoadingJob;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        Job job4 = this.acceptBattleJob;
        if (job4 != null) {
            Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
        }
        this.matchLoadingJob = null;
        this.betGroupsLoadingJob = null;
        this.challengeLoadingJob = null;
        this.acceptBattleJob = null;
        getVideoRewardService().disconnectClient(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null);
    }

    public final void onVideoRewardButtonClicked() {
        getVideoRewardService().redeemReward(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, null);
    }
}
