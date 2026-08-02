package org.betup.ui.dialogs.offer;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.billingclient.api.ProductDetails;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.Json;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.OffersUpdatedMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.analytics.GetSignatureForOfferInteractor;
import org.betup.model.remote.api.rest.analytics.GetSingleOfferInfoInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.analytics.OfferHtmlTemplateData;
import org.betup.model.remote.entity.analytics.OfferModel;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.analytics.PurchaseType;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.ProductDetailsPrice;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment;
import org.betup.ui.dialogs.offer.content.DefaultOfferSubtitleAnalyzer;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.utils.ApiUtils;
import org.betup.utils.BillingServiceUtilsKt;
import org.betup.utils.DateHelper;
import org.betup.utils.PriceFormatUtils;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.WebViewDialogStateGuard;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: SpecialOfferDialogFragment.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001kB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010F\u001a\u00020G2\u0014\u0010H\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020J\u0018\u00010IH\u0016J\u0010\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020,H\u0002J\u0010\u0010M\u001a\u00020G2\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010P\u001a\u00020G2\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u00020G2\u0006\u0010T\u001a\u00020.H\u0002J\u0012\u0010U\u001a\u00020G2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J$\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010^\u001a\u00020GH\u0002J\b\u0010`\u001a\u00020GH\u0016J\u0010\u0010a\u001a\u00020G2\u0006\u0010b\u001a\u00020cH\u0016J\u0010\u0010d\u001a\u00020G2\u0006\u0010e\u001a\u00020WH\u0016J\b\u0010f\u001a\u00020GH\u0016J\u0010\u0010g\u001a\u00020G2\u0006\u0010h\u001a\u00020iH\u0016J\b\u0010j\u001a\u00020GH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020.0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020.0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002050+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u0002080+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u0002050+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010D\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0EX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010_\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0EX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006l²\u0006\n\u0010m\u001a\u000205X\u008a\u0084\u0002²\u0006\n\u0010n\u001a\u000208X\u008a\u0084\u0002²\u0006\f\u0010L\u001a\u0004\u0018\u00010,X\u008a\u0084\u0002²\u0006\n\u0010o\u001a\u00020.X\u008a\u0084\u0002²\u0006\f\u0010p\u001a\u0004\u0018\u00010.X\u008a\u0084\u0002²\u0006\n\u0010q\u001a\u00020.X\u008a\u0084\u0002²\u0006\f\u0010r\u001a\u0004\u0018\u000102X\u008a\u0084\u0002²\u0006\n\u0010s\u001a\u00020.X\u008a\u0084\u0002²\u0006\n\u0010t\u001a\u000205X\u008a\u0084\u0002²\u0006\n\u0010u\u001a\u000205X\u008a\u0084\u0002²\u0006\f\u0010v\u001a\u0004\u0018\u00010.X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/dialogs/offer/SpecialOfferDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/services/billing/BillingService$PurchaseListener;", "Lorg/betup/services/billing/BillingService$DetailsGotListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getSingleOfferInteractor", "Lorg/betup/model/remote/api/rest/analytics/GetSingleOfferInfoInteractor;", "getGetSingleOfferInteractor", "()Lorg/betup/model/remote/api/rest/analytics/GetSingleOfferInfoInteractor;", "setGetSingleOfferInteractor", "(Lorg/betup/model/remote/api/rest/analytics/GetSingleOfferInfoInteractor;)V", "getSignatureForOfferInteractor", "Lorg/betup/model/remote/api/rest/analytics/GetSignatureForOfferInteractor;", "getGetSignatureForOfferInteractor", "()Lorg/betup/model/remote/api/rest/analytics/GetSignatureForOfferInteractor;", "setGetSignatureForOfferInteractor", "(Lorg/betup/model/remote/api/rest/analytics/GetSignatureForOfferInteractor;)V", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "dailyBonusController", "Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "getDailyBonusController", "()Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "setDailyBonusController", "(Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;)V", "offerState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/model/remote/entity/analytics/OfferModel;", "imageUrlState", "", "formattedOldPriceState", "formattedNewPriceState", "discountPercentState", "", "timerStringState", "isLoadingState", "", "showContentState", "offerWebPresentationModeState", "Lorg/betup/ui/dialogs/offer/OfferWebPresentationMode;", "remoteOfferHtmlReadyState", "remoteOfferPrefetchedHtmlState", "subtitleAnalyzer", "Lorg/betup/ui/dialogs/offer/content/DefaultOfferSubtitleAnalyzer;", "mainHandler", "Landroid/os/Handler;", "timerRunnable", "Ljava/lang/Runnable;", "currentOffer", "newStoreCodeForPurchase", "offerContentShownTracked", "offerLoadedListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "detailsGot", "", "details", "", "Lcom/android/billingclient/api/ProductDetails;", "markOfferContentVisible", "offer", "startTimer", "expiresAtMillis", "", "onAttach", "context", "Landroid/content/Context;", "startRemoteOfferDocumentPrefetch", "url", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPurchaseClick", "getSignatureListener", "purchaseCompleted", "purchaseFailed", "error", "Lorg/betup/services/billing/BillingService$BillingError;", "onSaveInstanceState", "outState", "onDestroyView", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onStart", VastTagName.COMPANION, "app_release", "showContent", "webMode", UnifiedMediationParams.KEY_IMAGE_URL, "formattedOldPrice", "formattedNewPrice", "discountPercent", "timerString", "isLoading", "remoteReady", "prefetched"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SpecialOfferDialogFragment extends DialogFragment implements BillingService.PurchaseListener, BillingService.DetailsGotListener {
    private static final String ARG_OFFER_ID = "offerId";

    @Inject
    public AnalyticsService analyticsService;

    @Inject
    public BillingService billingService;
    private OfferModel currentOffer;

    @Inject
    public DailyBonusController dailyBonusController;

    @Inject
    public GetSignatureForOfferInteractor getSignatureForOfferInteractor;

    @Inject
    public GetSingleOfferInfoInteractor getSingleOfferInteractor;
    private boolean offerContentShownTracked;
    private Runnable timerRunnable;

    @Inject
    public UserService userService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final MutableStateFlow<OfferModel> offerState = StateFlowKt.MutableStateFlow(null);
    private final MutableStateFlow<String> imageUrlState = StateFlowKt.MutableStateFlow("");
    private final MutableStateFlow<String> formattedOldPriceState = StateFlowKt.MutableStateFlow(null);
    private final MutableStateFlow<String> formattedNewPriceState = StateFlowKt.MutableStateFlow("");
    private final MutableStateFlow<Integer> discountPercentState = StateFlowKt.MutableStateFlow(null);
    private final MutableStateFlow<String> timerStringState = StateFlowKt.MutableStateFlow("00:00:00");
    private final MutableStateFlow<Boolean> isLoadingState = StateFlowKt.MutableStateFlow(false);
    private final MutableStateFlow<Boolean> showContentState = StateFlowKt.MutableStateFlow(false);
    private final MutableStateFlow<OfferWebPresentationMode> offerWebPresentationModeState = StateFlowKt.MutableStateFlow(OfferWebPresentationMode.None);
    private final MutableStateFlow<Boolean> remoteOfferHtmlReadyState = StateFlowKt.MutableStateFlow(true);
    private final MutableStateFlow<String> remoteOfferPrefetchedHtmlState = StateFlowKt.MutableStateFlow(null);
    private final DefaultOfferSubtitleAnalyzer subtitleAnalyzer = new DefaultOfferSubtitleAnalyzer();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private String newStoreCodeForPurchase = "";
    private final BaseCachedSharedInteractor.OnFetchedListener<String, String> offerLoadedListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.offer.SpecialOfferDialogFragment$$ExternalSyntheticLambda0
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            SpecialOfferDialogFragment.offerLoadedListener$lambda$1(SpecialOfferDialogFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<String, String> getSignatureListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.offer.SpecialOfferDialogFragment$$ExternalSyntheticLambda1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            SpecialOfferDialogFragment.getSignatureListener$lambda$7(SpecialOfferDialogFragment.this, fetchedResponseMessage);
        }
    };

    public final GetSingleOfferInfoInteractor getGetSingleOfferInteractor() {
        GetSingleOfferInfoInteractor getSingleOfferInfoInteractor = this.getSingleOfferInteractor;
        if (getSingleOfferInfoInteractor != null) {
            return getSingleOfferInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getSingleOfferInteractor");
        return null;
    }

    public final void setGetSingleOfferInteractor(GetSingleOfferInfoInteractor getSingleOfferInfoInteractor) {
        Intrinsics.checkNotNullParameter(getSingleOfferInfoInteractor, "<set-?>");
        this.getSingleOfferInteractor = getSingleOfferInfoInteractor;
    }

    public final GetSignatureForOfferInteractor getGetSignatureForOfferInteractor() {
        GetSignatureForOfferInteractor getSignatureForOfferInteractor = this.getSignatureForOfferInteractor;
        if (getSignatureForOfferInteractor != null) {
            return getSignatureForOfferInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getSignatureForOfferInteractor");
        return null;
    }

    public final void setGetSignatureForOfferInteractor(GetSignatureForOfferInteractor getSignatureForOfferInteractor) {
        Intrinsics.checkNotNullParameter(getSignatureForOfferInteractor, "<set-?>");
        this.getSignatureForOfferInteractor = getSignatureForOfferInteractor;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offerLoadedListener$lambda$1(SpecialOfferDialogFragment specialOfferDialogFragment, FetchedResponseMessage fetchedResponseMessage) {
        String url;
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || !specialOfferDialogFragment.isAdded()) {
            specialOfferDialogFragment.dismissAllowingStateLoss();
            return;
        }
        Json defaultModel = ApiUtils.INSTANCE.getDefaultModel();
        Object model = fetchedResponseMessage.getModel();
        Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
        defaultModel.getSerializersModule();
        OfferModel offerModel = (OfferModel) defaultModel.decodeFromString(OfferModel.INSTANCE.serializer(), (String) model);
        specialOfferDialogFragment.currentOffer = offerModel;
        specialOfferDialogFragment.offerState.setValue(offerModel);
        MutableStateFlow<String> mutableStateFlow = specialOfferDialogFragment.imageUrlState;
        String iconUrl = offerModel.getIconUrl();
        String str = null;
        if (StringsKt.isBlank(iconUrl)) {
            iconUrl = null;
        }
        String buildOfferImageDisplayUrl = iconUrl != null ? OfferImageUrlKt.buildOfferImageDisplayUrl(iconUrl) : null;
        if (buildOfferImageDisplayUrl == null) {
            buildOfferImageDisplayUrl = "";
        }
        mutableStateFlow.setValue(buildOfferImageDisplayUrl);
        OfferWebPresentationMode resolveOfferWebPresentationMode = OfferWebPresentationKt.resolveOfferWebPresentationMode(offerModel, specialOfferDialogFragment.subtitleAnalyzer);
        specialOfferDialogFragment.offerWebPresentationModeState.setValue(resolveOfferWebPresentationMode);
        if (resolveOfferWebPresentationMode == OfferWebPresentationMode.RemoteUrl) {
            OfferHtmlTemplateData htmlTemplateData = offerModel.getHtmlTemplateData();
            if (htmlTemplateData != null && (url = htmlTemplateData.getUrl()) != null) {
                str = StringsKt.trim((CharSequence) url).toString();
            }
            String str2 = str != null ? str : "";
            if (str2.length() > 0) {
                specialOfferDialogFragment.startRemoteOfferDocumentPrefetch(str2);
            } else {
                specialOfferDialogFragment.remoteOfferHtmlReadyState.setValue(true);
            }
            specialOfferDialogFragment.showContentState.setValue(true);
            specialOfferDialogFragment.markOfferContentVisible(offerModel);
        } else {
            specialOfferDialogFragment.remoteOfferHtmlReadyState.setValue(true);
        }
        if (BillingServiceUtilsKt.isOfferExpired(Long.valueOf(offerModel.getExpiresAt().getTime()))) {
            specialOfferDialogFragment.dismissAllowingStateLoss();
        } else {
            specialOfferDialogFragment.getBillingService().getProductDetails(CollectionsKt.listOf((Object[]) new String[]{offerModel.getOldStoreCode(), offerModel.getNewStoreCode()}), specialOfferDialogFragment);
        }
    }

    @Override // org.betup.services.billing.BillingService.DetailsGotListener
    public void detailsGot(Map<String, ProductDetails> details) {
        OfferModel offerModel = this.currentOffer;
        if (offerModel == null) {
            return;
        }
        if (BillingServiceUtilsKt.isOfferExpired(Long.valueOf(offerModel.getExpiresAt().getTime()))) {
            dismissAllowingStateLoss();
            return;
        }
        if (details == null || details.isEmpty()) {
            if (this.offerWebPresentationModeState.getValue() == OfferWebPresentationMode.RemoteUrl) {
                this.showContentState.setValue(true);
                markOfferContentVisible(offerModel);
                return;
            } else {
                dismissAllowingStateLoss();
                return;
            }
        }
        ProductDetails productDetails = details.get(offerModel.getNewStoreCode());
        if (productDetails == null) {
            if (this.offerWebPresentationModeState.getValue() == OfferWebPresentationMode.RemoteUrl) {
                this.showContentState.setValue(true);
                markOfferContentVisible(offerModel);
                return;
            } else {
                dismissAllowingStateLoss();
                return;
            }
        }
        ProductDetails productDetails2 = details.get(offerModel.getOldStoreCode());
        long priceAmountMicros = ProductDetailsPrice.priceAmountMicros(productDetails);
        this.formattedNewPriceState.setValue(PriceFormatUtils.INSTANCE.formatPriceWithCurrencySymbol(priceAmountMicros, ProductDetailsPrice.priceCurrencyCode(productDetails)));
        long priceAmountMicros2 = ProductDetailsPrice.priceAmountMicros(productDetails2);
        String formatPriceWithCurrencySymbol = productDetails2 != null ? PriceFormatUtils.INSTANCE.formatPriceWithCurrencySymbol(priceAmountMicros2, ProductDetailsPrice.priceCurrencyCode(productDetails2)) : null;
        if (productDetails2 != null) {
            this.formattedOldPriceState.setValue(formatPriceWithCurrencySymbol);
            this.discountPercentState.setValue(Integer.valueOf((int) ((1.0d - (priceAmountMicros / priceAmountMicros2)) * 100)));
        } else {
            this.formattedOldPriceState.setValue(null);
            this.discountPercentState.setValue(null);
        }
        this.showContentState.setValue(true);
        markOfferContentVisible(offerModel);
        startTimer(offerModel.getExpiresAt().getTime());
    }

    private final void markOfferContentVisible(OfferModel offer) {
        if (this.offerContentShownTracked || !isAdded()) {
            return;
        }
        this.offerContentShownTracked = true;
        AnalyticsHelper.INSTANCE.logOfferShown(offer.getId());
    }

    private final void startTimer(final long expiresAtMillis) {
        Runnable runnable = this.timerRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: org.betup.ui.dialogs.offer.SpecialOfferDialogFragment$startTimer$updateRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                MutableStateFlow mutableStateFlow;
                Handler handler;
                MutableStateFlow mutableStateFlow2;
                if (SpecialOfferDialogFragment.this.isAdded()) {
                    long currentTimeMillis = expiresAtMillis - System.currentTimeMillis();
                    if (currentTimeMillis <= 0) {
                        mutableStateFlow2 = SpecialOfferDialogFragment.this.timerStringState;
                        mutableStateFlow2.setValue("00:00:00");
                        SpecialOfferDialogFragment.this.dismissAllowingStateLoss();
                    } else {
                        mutableStateFlow = SpecialOfferDialogFragment.this.timerStringState;
                        String formatMillisToHourMinSecs = DateHelper.formatMillisToHourMinSecs(currentTimeMillis);
                        Intrinsics.checkNotNullExpressionValue(formatMillisToHourMinSecs, "formatMillisToHourMinSecs(...)");
                        mutableStateFlow.setValue(formatMillisToHourMinSecs);
                        handler = SpecialOfferDialogFragment.this.mainHandler;
                        handler.postDelayed(this, 1000L);
                    }
                }
            }
        };
        this.timerRunnable = runnable2;
        runnable2.run();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    private final void startRemoteOfferDocumentPrefetch(String url) {
        this.remoteOfferHtmlReadyState.setValue(false);
        this.remoteOfferPrefetchedHtmlState.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SpecialOfferDialogFragment$startRemoteOfferDocumentPrefetch$1(this, requireContext().getApplicationContext(), url, null), 3, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(ARG_OFFER_ID)) == null) {
            dismissAllowingStateLoss();
        } else {
            getGetSingleOfferInteractor().load(this.offerLoadedListener, string);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1482457205, true, new SpecialOfferDialogFragment$onCreateView$1$1(this, this)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchaseClick() {
        OfferModel offerModel = this.currentOffer;
        if (offerModel == null) {
            return;
        }
        this.isLoadingState.setValue(true);
        getGetSignatureForOfferInteractor().load(this.getSignatureListener, offerModel.getId(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSignatureListener$lambda$7(SpecialOfferDialogFragment specialOfferDialogFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            specialOfferDialogFragment.isLoadingState.setValue(false);
            SnackbarHelper.showShort(specialOfferDialogFragment.requireContext(), R.string.error);
            return;
        }
        Json defaultModel = ApiUtils.INSTANCE.getDefaultModel();
        Object model = fetchedResponseMessage.getModel();
        Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
        defaultModel.getSerializersModule();
        OfferModel offerModel = (OfferModel) defaultModel.decodeFromString(OfferModel.INSTANCE.serializer(), (String) model);
        specialOfferDialogFragment.newStoreCodeForPurchase = offerModel.getNewStoreCode();
        String signature = offerModel.getSignature();
        if (signature == null) {
            specialOfferDialogFragment.isLoadingState.setValue(false);
            SnackbarHelper.showShort(specialOfferDialogFragment.requireContext(), R.string.error);
            return;
        }
        FragmentActivity activity = specialOfferDialogFragment.getActivity();
        if (!(activity instanceof MainActivity)) {
            specialOfferDialogFragment.isLoadingState.setValue(false);
        } else {
            specialOfferDialogFragment.getBillingService().purchaseOfferItem(activity, offerModel.getNewStoreCode(), signature, specialOfferDialogFragment);
        }
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseCompleted() {
        this.isLoadingState.setValue(false);
        getUserService().invalidate(new UserService.InfoKind[0]);
        getUserService().invalidate(UserService.InfoKind.PROGRESS, UserService.InfoKind.GENERAL);
        getUserService().syncProfile(UserService.InfoKind.PROGRESS, UserService.InfoKind.GENERAL);
        getAnalyticsService().sendPurchaseEvent(this.newStoreCodeForPurchase, PurchasePlacement.OFFER_PUSH, PurchaseType.PACKS);
        if (this.dailyBonusController != null && getContext() != null) {
            DailyBonusController dailyBonusController = getDailyBonusController();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            dailyBonusController.initialize(requireContext);
            getDailyBonusController().invalidate();
            getDailyBonusController().load();
        }
        dismiss();
        EventBus.getDefault().post(new OffersUpdatedMessage());
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        PurchaseCompletedNewDialogFragment.INSTANCE.newInstance(this.currentOffer != null ? r3.getBetcoins() : 0, new PurchaseCompletedNewDialogFragment.OnDismissListener() { // from class: org.betup.ui.dialogs.offer.SpecialOfferDialogFragment$purchaseCompleted$1
            @Override // org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment.OnDismissListener
            public void onDismiss() {
            }
        }).show(supportFragmentManager, "PurchaseCompletedDialog");
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseFailed(BillingService.BillingError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.isLoadingState.setValue(false);
        if (error != BillingService.BillingError.CANCELED) {
            dismiss();
            SnackbarHelper.showShort(requireContext(), R.string.error);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        WebViewDialogStateGuard.INSTANCE.stripFragmentViewState(outState);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Runnable runnable = this.timerRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.timerRunnable = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        OfferModel offerModel;
        String id;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (this.offerContentShownTracked && this.currentOffer != null && isAdded() && (offerModel = this.currentOffer) != null && (id = offerModel.getId()) != null) {
            AnalyticsHelper.INSTANCE.logOfferClosed(id);
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.6f);
    }

    /* compiled from: SpecialOfferDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/betup/ui/dialogs/offer/SpecialOfferDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_OFFER_ID", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/offer/SpecialOfferDialogFragment;", SpecialOfferDialogFragment.ARG_OFFER_ID, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SpecialOfferDialogFragment newInstance(String offerId) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            SpecialOfferDialogFragment specialOfferDialogFragment = new SpecialOfferDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(SpecialOfferDialogFragment.ARG_OFFER_ID, offerId);
            specialOfferDialogFragment.setArguments(bundle);
            return specialOfferDialogFragment;
        }
    }
}
