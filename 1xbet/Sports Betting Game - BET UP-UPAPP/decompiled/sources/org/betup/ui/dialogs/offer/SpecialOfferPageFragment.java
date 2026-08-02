package org.betup.ui.dialogs.offer;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
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
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.analytics.OfferHtmlTemplateData;
import org.betup.model.remote.entity.analytics.OfferModel;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.analytics.PurchaseType;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.ProductDetailsPrice;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.OffersDialogFragment;
import org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment;
import org.betup.ui.dialogs.offer.content.DefaultOfferSubtitleAnalyzer;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.utils.ApiUtils;
import org.betup.utils.BillingServiceUtilsKt;
import org.betup.utils.DateHelper;
import org.betup.utils.PriceFormatUtils;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: SpecialOfferPageFragment.kt */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001^B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\u0012\u0010C\u001a\u00020@2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u001e\u0010F\u001a\u00020@2\u0014\u0010G\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020I\u0018\u00010HH\u0016J\u0010\u0010J\u001a\u00020@2\u0006\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020@H\u0002J\u0010\u0010N\u001a\u00020@2\u0006\u0010O\u001a\u00020(H\u0002J$\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010V\u001a\u00020@H\u0002J\b\u0010Y\u001a\u00020@H\u0016J\u0010\u0010Z\u001a\u00020@2\u0006\u0010[\u001a\u00020\\H\u0016J\b\u0010]\u001a\u00020@H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020(0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020(0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020/0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u0002020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020/0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010W\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0XX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_²\u0006\n\u0010`\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u0010a\u001a\u000202X\u008a\u0084\u0002²\u0006\f\u0010b\u001a\u0004\u0018\u00010&X\u008a\u0084\u0002²\u0006\n\u0010c\u001a\u00020(X\u008a\u0084\u0002²\u0006\f\u0010d\u001a\u0004\u0018\u00010(X\u008a\u0084\u0002²\u0006\n\u0010e\u001a\u00020(X\u008a\u0084\u0002²\u0006\f\u0010f\u001a\u0004\u0018\u00010,X\u008a\u0084\u0002²\u0006\n\u0010g\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010h\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u0010i\u001a\u00020/X\u008a\u0084\u0002²\u0006\f\u0010j\u001a\u0004\u0018\u00010(X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/dialogs/offer/SpecialOfferPageFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/betup/services/billing/BillingService$PurchaseListener;", "Lorg/betup/services/billing/BillingService$DetailsGotListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getSignatureForOfferInteractor", "Lorg/betup/model/remote/api/rest/analytics/GetSignatureForOfferInteractor;", "getGetSignatureForOfferInteractor", "()Lorg/betup/model/remote/api/rest/analytics/GetSignatureForOfferInteractor;", "setGetSignatureForOfferInteractor", "(Lorg/betup/model/remote/api/rest/analytics/GetSignatureForOfferInteractor;)V", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "dailyBonusController", "Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "getDailyBonusController", "()Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "setDailyBonusController", "(Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;)V", "offerState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/model/remote/entity/analytics/OfferModel;", "imageUrlState", "", "formattedOldPriceState", "formattedNewPriceState", "discountPercentState", "", "timerStringState", "isLoadingState", "", "showContentState", "offerWebPresentationModeState", "Lorg/betup/ui/dialogs/offer/OfferWebPresentationMode;", "remoteOfferHtmlReadyState", "remoteOfferPrefetchedHtmlState", "subtitleAnalyzer", "Lorg/betup/ui/dialogs/offer/content/DefaultOfferSubtitleAnalyzer;", "mainHandler", "Landroid/os/Handler;", "timerRunnable", "Ljava/lang/Runnable;", "currentOffer", "newStoreCodeForPurchase", "placement", "Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "detailsGot", "details", "", "Lcom/android/billingclient/api/ProductDetails;", "startTimer", "expiresAtMillis", "", "dismissParent", "startRemoteOfferDocumentPrefetch", "url", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPurchaseClick", "getSignatureListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "purchaseCompleted", "purchaseFailed", "error", "Lorg/betup/services/billing/BillingService$BillingError;", "onDestroyView", VastTagName.COMPANION, "app_release", "showContent", "webMode", "offer", UnifiedMediationParams.KEY_IMAGE_URL, "formattedOldPrice", "formattedNewPrice", "discountPercent", "timerString", "isLoading", "remoteReady", "prefetched"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SpecialOfferPageFragment extends Fragment implements BillingService.PurchaseListener, BillingService.DetailsGotListener {
    private static final String ARG_OFFER_JSON = "offer_model_json";
    private static final String ARG_PLACEMENT = "placement";

    @Inject
    public AnalyticsService analyticsService;

    @Inject
    public BillingService billingService;
    private OfferModel currentOffer;

    @Inject
    public DailyBonusController dailyBonusController;

    @Inject
    public GetSignatureForOfferInteractor getSignatureForOfferInteractor;
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
    private PurchasePlacement placement = PurchasePlacement.OFFER_HOME;
    private final BaseCachedSharedInteractor.OnFetchedListener<String, String> getSignatureListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.offer.SpecialOfferPageFragment$$ExternalSyntheticLambda0
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            SpecialOfferPageFragment.getSignatureListener$lambda$5(SpecialOfferPageFragment.this, fetchedResponseMessage);
        }
    };

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

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        Bundle arguments;
        String string2;
        String url;
        super.onCreate(savedInstanceState);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString(ARG_OFFER_JSON)) == null || (arguments = getArguments()) == null || (string2 = arguments.getString("placement")) == null) {
            return;
        }
        Json defaultModel = ApiUtils.INSTANCE.getDefaultModel();
        defaultModel.getSerializersModule();
        OfferModel offerModel = (OfferModel) defaultModel.decodeFromString(OfferModel.INSTANCE.serializer(), string);
        this.placement = PurchasePlacement.valueOf(string2);
        this.currentOffer = offerModel;
        this.offerState.setValue(offerModel);
        MutableStateFlow<String> mutableStateFlow = this.imageUrlState;
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
        if (BillingServiceUtilsKt.isOfferExpired(Long.valueOf(offerModel.getExpiresAt().getTime()))) {
            dismissParent();
            return;
        }
        OfferWebPresentationMode resolveOfferWebPresentationMode = OfferWebPresentationKt.resolveOfferWebPresentationMode(offerModel, this.subtitleAnalyzer);
        this.offerWebPresentationModeState.setValue(resolveOfferWebPresentationMode);
        if (resolveOfferWebPresentationMode == OfferWebPresentationMode.RemoteUrl) {
            OfferHtmlTemplateData htmlTemplateData = offerModel.getHtmlTemplateData();
            if (htmlTemplateData != null && (url = htmlTemplateData.getUrl()) != null) {
                str = StringsKt.trim((CharSequence) url).toString();
            }
            String str2 = str != null ? str : "";
            if (str2.length() > 0) {
                startRemoteOfferDocumentPrefetch(str2);
            } else {
                this.remoteOfferHtmlReadyState.setValue(true);
            }
            this.showContentState.setValue(true);
        } else {
            this.remoteOfferHtmlReadyState.setValue(true);
        }
        getBillingService().getProductDetails(CollectionsKt.listOf((Object[]) new String[]{offerModel.getOldStoreCode(), offerModel.getNewStoreCode()}), this);
        startTimer(offerModel.getExpiresAt().getTime());
    }

    @Override // org.betup.services.billing.BillingService.DetailsGotListener
    public void detailsGot(Map<String, ProductDetails> details) {
        OfferModel offerModel = this.currentOffer;
        if (offerModel == null) {
            return;
        }
        if (BillingServiceUtilsKt.isOfferExpired(Long.valueOf(offerModel.getExpiresAt().getTime()))) {
            dismissParent();
            return;
        }
        if (details == null || details.isEmpty()) {
            if (this.offerWebPresentationModeState.getValue() == OfferWebPresentationMode.RemoteUrl) {
                this.showContentState.setValue(true);
                return;
            } else {
                dismissParent();
                return;
            }
        }
        ProductDetails productDetails = details.get(offerModel.getNewStoreCode());
        if (productDetails == null) {
            if (this.offerWebPresentationModeState.getValue() == OfferWebPresentationMode.RemoteUrl) {
                this.showContentState.setValue(true);
                return;
            } else {
                dismissParent();
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
        startTimer(offerModel.getExpiresAt().getTime());
    }

    private final void startTimer(final long expiresAtMillis) {
        Runnable runnable = this.timerRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: org.betup.ui.dialogs.offer.SpecialOfferPageFragment$startTimer$updateRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                MutableStateFlow mutableStateFlow;
                Handler handler;
                MutableStateFlow mutableStateFlow2;
                if (SpecialOfferPageFragment.this.isAdded()) {
                    long currentTimeMillis = expiresAtMillis - System.currentTimeMillis();
                    if (currentTimeMillis <= 0) {
                        mutableStateFlow2 = SpecialOfferPageFragment.this.timerStringState;
                        mutableStateFlow2.setValue("00:00:00");
                        SpecialOfferPageFragment.this.dismissParent();
                    } else {
                        mutableStateFlow = SpecialOfferPageFragment.this.timerStringState;
                        String formatMillisToHourMinSecs = DateHelper.formatMillisToHourMinSecs(currentTimeMillis);
                        Intrinsics.checkNotNullExpressionValue(formatMillisToHourMinSecs, "formatMillisToHourMinSecs(...)");
                        mutableStateFlow.setValue(formatMillisToHourMinSecs);
                        handler = SpecialOfferPageFragment.this.mainHandler;
                        handler.postDelayed(this, 1000L);
                    }
                }
            }
        };
        this.timerRunnable = runnable2;
        runnable2.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissParent() {
        Fragment parentFragment = getParentFragment();
        OffersDialogFragment offersDialogFragment = parentFragment instanceof OffersDialogFragment ? (OffersDialogFragment) parentFragment : null;
        if (offersDialogFragment != null) {
            offersDialogFragment.dismissAllowingStateLoss();
        }
    }

    private final void startRemoteOfferDocumentPrefetch(String url) {
        this.remoteOfferHtmlReadyState.setValue(false);
        this.remoteOfferPrefetchedHtmlState.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1(this, requireContext().getApplicationContext(), url, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-582345173, true, new SpecialOfferPageFragment$onCreateView$1$1(this, this)));
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
    public static final void getSignatureListener$lambda$5(SpecialOfferPageFragment specialOfferPageFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            specialOfferPageFragment.isLoadingState.setValue(false);
            SnackbarHelper.showShort(specialOfferPageFragment.requireContext(), R.string.error);
            return;
        }
        Json defaultModel = ApiUtils.INSTANCE.getDefaultModel();
        Object model = fetchedResponseMessage.getModel();
        Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
        defaultModel.getSerializersModule();
        OfferModel offerModel = (OfferModel) defaultModel.decodeFromString(OfferModel.INSTANCE.serializer(), (String) model);
        specialOfferPageFragment.newStoreCodeForPurchase = offerModel.getNewStoreCode();
        String signature = offerModel.getSignature();
        if (signature == null) {
            specialOfferPageFragment.isLoadingState.setValue(false);
            SnackbarHelper.showShort(specialOfferPageFragment.requireContext(), R.string.error);
            return;
        }
        FragmentActivity activity = specialOfferPageFragment.getActivity();
        if (!(activity instanceof MainActivity)) {
            specialOfferPageFragment.isLoadingState.setValue(false);
        } else {
            specialOfferPageFragment.getBillingService().purchaseOfferItem(activity, offerModel.getNewStoreCode(), signature, specialOfferPageFragment);
        }
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseCompleted() {
        this.isLoadingState.setValue(false);
        getUserService().invalidate(new UserService.InfoKind[0]);
        getUserService().invalidate(UserService.InfoKind.PROGRESS, UserService.InfoKind.GENERAL);
        getUserService().syncProfile(UserService.InfoKind.PROGRESS, UserService.InfoKind.GENERAL);
        getAnalyticsService().sendPurchaseEvent(this.newStoreCodeForPurchase, this.placement, PurchaseType.PACKS);
        if (this.dailyBonusController != null && getContext() != null) {
            DailyBonusController dailyBonusController = getDailyBonusController();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            dailyBonusController.initialize(requireContext);
            getDailyBonusController().invalidate();
            getDailyBonusController().load();
        }
        dismissParent();
        EventBus.getDefault().post(new OffersUpdatedMessage());
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        PurchaseCompletedNewDialogFragment.INSTANCE.newInstance(this.currentOffer != null ? r3.getBetcoins() : 0, new PurchaseCompletedNewDialogFragment.OnDismissListener() { // from class: org.betup.ui.dialogs.offer.SpecialOfferPageFragment$purchaseCompleted$1
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
            dismissParent();
            SnackbarHelper.showShort(requireContext(), R.string.error);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Runnable runnable = this.timerRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.timerRunnable = null;
        super.onDestroyView();
    }

    /* compiled from: SpecialOfferPageFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/betup/ui/dialogs/offer/SpecialOfferPageFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_OFFER_JSON", "", "ARG_PLACEMENT", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/offer/SpecialOfferPageFragment;", "offer", "Lorg/betup/model/remote/entity/analytics/OfferModel;", "placement", "Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SpecialOfferPageFragment newInstance(OfferModel offer, PurchasePlacement placement) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            Intrinsics.checkNotNullParameter(placement, "placement");
            SpecialOfferPageFragment specialOfferPageFragment = new SpecialOfferPageFragment();
            Bundle bundle = new Bundle();
            bundle.putString(SpecialOfferPageFragment.ARG_OFFER_JSON, ApiUtils.INSTANCE.getDefaultModel().encodeToString(OfferModel.INSTANCE.serializer(), offer));
            bundle.putString("placement", placement.name());
            specialOfferPageFragment.setArguments(bundle);
            return specialOfferPageFragment;
        }
    }
}
