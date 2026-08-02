package org.betup.ui.dialogs.offer;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.squareup.picasso.Callback;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.sentry.protocol.OperatingSystem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.OffersUpdatedMessage;
import org.betup.databinding.FragmentOfferBinding;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.config.ApiConfigResolver;
import org.betup.model.remote.api.rest.analytics.GetSignatureForOfferInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.analytics.OfferModel;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.analytics.PurchaseType;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.billing.BillingService;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.OffersDialogFragment;
import org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.utils.ApiUtils;
import org.betup.utils.PicassoHelper;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: OfferFragment.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002BCB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J$\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u00106\u001a\u00020\n2\u0006\u00107\u001a\u0002012\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u00108\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020\nH\u0003J\b\u0010>\u001a\u00020\nH\u0016J\u0010\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020AH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u0010:\u001a\u00020;X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020;0=X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/betup/services/billing/BillingService$PurchaseListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "builder", "Lorg/betup/ui/dialogs/offer/OfferFragment$Builder;", "placementType", "Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "_binding", "Lorg/betup/databinding/FragmentOfferBinding;", "binding", "getBinding", "()Lorg/betup/databinding/FragmentOfferBinding;", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "getSignatureForOfferInteractor", "Lorg/betup/model/remote/api/rest/analytics/GetSignatureForOfferInteractor;", "getGetSignatureForOfferInteractor", "()Lorg/betup/model/remote/api/rest/analytics/GetSignatureForOfferInteractor;", "setGetSignatureForOfferInteractor", "(Lorg/betup/model/remote/api/rest/analytics/GetSignatureForOfferInteractor;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "dailyBonusController", "Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "getDailyBonusController", "()Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "setDailyBonusController", "(Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "initClickListeners", "initLayout", "newStoreCode", "", "getSignatureForOfferListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "purchaseCompleted", "purchaseFailed", "error", "Lorg/betup/services/billing/BillingService$BillingError;", VastTagName.COMPANION, "Builder", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferFragment extends Fragment implements BillingService.PurchaseListener {
    private static final String ARGS_OFFER_JSON = "offer_model_json";
    private static final String ARGS_PLACEMENT = "placement";
    private FragmentOfferBinding _binding;

    @Inject
    public AnalyticsService analyticsService;

    @Inject
    public BillingService billingService;
    private Builder builder;

    @Inject
    public DailyBonusController dailyBonusController;

    @Inject
    public GetSignatureForOfferInteractor getSignatureForOfferInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<String, String> getSignatureForOfferListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.offer.OfferFragment$$ExternalSyntheticLambda0
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            OfferFragment.getSignatureForOfferListener$lambda$3(OfferFragment.this, fetchedResponseMessage);
        }
    };
    private String newStoreCode;
    private PurchasePlacement placementType;

    @Inject
    public UserService userService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Bundle arguments;
        super.onCreate(savedInstanceState);
        if (this.builder == null && (arguments = getArguments()) != null) {
            String string = arguments.getString(ARGS_OFFER_JSON);
            String string2 = arguments.getString("placement");
            if (string != null && string2 != null) {
                Json defaultModel = ApiUtils.INSTANCE.getDefaultModel();
                defaultModel.getSerializersModule();
                OfferModel offerModel = (OfferModel) defaultModel.decodeFromString(OfferModel.INSTANCE.serializer(), string);
                this.placementType = PurchasePlacement.valueOf(string2);
                Builder builder = new Builder();
                builder.id(offerModel.getId());
                Iterator<OfferItemContent> it = offerModel.getElements().iterator();
                while (it.hasNext()) {
                    builder.addElement(it.next());
                }
                builder.betcoins(offerModel.getBetcoins());
                builder.expiresAt(offerModel.getExpiresAt().getTime());
                String strapiApiBaseUrl = ApiConfigResolver.getApiConfig().getStrapiApiBaseUrl();
                Intrinsics.checkNotNullExpressionValue(strapiApiBaseUrl, "getStrapiApiBaseUrl(...)");
                builder.backgroundImageUrl(StringsKt.removeSuffix(strapiApiBaseUrl, (CharSequence) "/api/") + offerModel.getIconUrl());
                builder.oldStoreCode(offerModel.getOldStoreCode());
                builder.newStoreCode(offerModel.getNewStoreCode());
                this.builder = builder.build();
            }
        }
        FragmentActivity activity = getActivity();
        Context applicationContext = activity != null ? activity.getApplicationContext() : null;
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    /* compiled from: OfferFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARGS_OFFER_JSON", "", "ARGS_PLACEMENT", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/offer/OfferFragment;", "offerModel", "Lorg/betup/model/remote/entity/analytics/OfferModel;", "placement", "Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OfferFragment newInstance(OfferModel offerModel, PurchasePlacement placement) {
            Intrinsics.checkNotNullParameter(offerModel, "offerModel");
            Intrinsics.checkNotNullParameter(placement, "placement");
            OfferFragment offerFragment = new OfferFragment();
            Bundle bundle = new Bundle();
            bundle.putString(OfferFragment.ARGS_OFFER_JSON, ApiUtils.INSTANCE.getDefaultModel().encodeToString(OfferModel.INSTANCE.serializer(), offerModel));
            bundle.putString("placement", placement.name());
            offerFragment.setArguments(bundle);
            return offerFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentOfferBinding getBinding() {
        FragmentOfferBinding fragmentOfferBinding = this._binding;
        if (fragmentOfferBinding != null) {
            return fragmentOfferBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_binding");
        return null;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentOfferBinding.inflate(inflater, container, false);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().offerBgIv.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.betup.ui.dialogs.offer.OfferFragment$onViewCreated$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                FragmentOfferBinding binding;
                binding = OfferFragment.this.getBinding();
                binding.offerBgIv.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                OfferFragment.this.initLayout();
            }
        });
        initClickListeners();
    }

    private final void initClickListeners() {
        getBinding().closeBtnIv.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.dialogs.offer.OfferFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfferFragment.initClickListeners$lambda$2(OfferFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$2(OfferFragment offerFragment, View view) {
        Fragment parentFragment = offerFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type org.betup.ui.dialogs.OffersDialogFragment");
        ((OffersDialogFragment) parentFragment).dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initLayout() {
        if (this.builder == null) {
            return;
        }
        PicassoHelper imageView = PicassoHelper.with(getContext()).setImageView(getBinding().offerBgIv);
        Builder builder = this.builder;
        if (builder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("builder");
            builder = null;
        }
        imageView.setImageUrl(builder.getBackgroundImageUrl()).load(new Callback() { // from class: org.betup.ui.dialogs.offer.OfferFragment$initLayout$1
            @Override // com.squareup.picasso.Callback
            public void onSuccess() {
                FragmentOfferBinding binding;
                binding = OfferFragment.this.getBinding();
                binding.offerBgIv.getViewTreeObserver().addOnGlobalLayoutListener(new OfferFragment$initLayout$1$onSuccess$1(OfferFragment.this));
            }

            @Override // com.squareup.picasso.Callback
            public void onError(Exception e) {
                Log.e("Picasso", "Image load failed", e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSignatureForOfferListener$lambda$3(OfferFragment offerFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            SnackbarHelper.showShort(offerFragment.requireContext(), R.string.error);
            return;
        }
        String str = (String) fetchedResponseMessage.getModel();
        Json defaultModel = ApiUtils.INSTANCE.getDefaultModel();
        Intrinsics.checkNotNull(str);
        defaultModel.getSerializersModule();
        OfferModel offerModel = (OfferModel) defaultModel.decodeFromString(OfferModel.INSTANCE.serializer(), str);
        offerFragment.newStoreCode = offerModel.getNewStoreCode();
        String signature = offerModel.getSignature();
        if (signature == null) {
            return;
        }
        BillingService billingService = offerFragment.getBillingService();
        Context context = offerFragment.getBinding().getRoot().getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type org.betup.ui.MainActivity");
        billingService.purchaseOfferItem((MainActivity) context, offerModel.getNewStoreCode(), signature, offerFragment);
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseCompleted() {
        getBinding().progress.setVisibility(8);
        getUserService().invalidate(new UserService.InfoKind[0]);
        getUserService().invalidate(UserService.InfoKind.PROGRESS, UserService.InfoKind.GENERAL);
        getUserService().syncProfile(UserService.InfoKind.PROGRESS, UserService.InfoKind.GENERAL);
        AnalyticsService analyticsService = getAnalyticsService();
        String str = this.newStoreCode;
        Builder builder = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newStoreCode");
            str = null;
        }
        PurchasePlacement purchasePlacement = this.placementType;
        if (purchasePlacement == null) {
            Intrinsics.throwUninitializedPropertyAccessException("placementType");
            purchasePlacement = null;
        }
        analyticsService.sendPurchaseEvent(str, purchasePlacement, PurchaseType.PACKS);
        if (this.dailyBonusController != null && getContext() != null) {
            DailyBonusController dailyBonusController = getDailyBonusController();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            dailyBonusController.initialize(requireContext);
            getDailyBonusController().invalidate();
            getDailyBonusController().load();
        }
        Fragment parentFragment = getParentFragment();
        OffersDialogFragment offersDialogFragment = parentFragment instanceof OffersDialogFragment ? (OffersDialogFragment) parentFragment : null;
        if (offersDialogFragment != null) {
            offersDialogFragment.dismiss();
        }
        EventBus.getDefault().post(new OffersUpdatedMessage());
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        PurchaseCompletedNewDialogFragment.Companion companion = PurchaseCompletedNewDialogFragment.INSTANCE;
        Builder builder2 = this.builder;
        if (builder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("builder");
        } else {
            builder = builder2;
        }
        companion.newInstance(builder.getBetcoins(), new PurchaseCompletedNewDialogFragment.OnDismissListener() { // from class: org.betup.ui.dialogs.offer.OfferFragment$purchaseCompleted$1$1
            @Override // org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment.OnDismissListener
            public void onDismiss() {
            }
        }).show(supportFragmentManager, "PurchaseCompletedDialog");
    }

    @Override // org.betup.services.billing.BillingService.PurchaseListener
    public void purchaseFailed(BillingService.BillingError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        getBinding().progress.setVisibility(8);
        if (error != BillingService.BillingError.CANCELED) {
            Fragment parentFragment = getParentFragment();
            Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type org.betup.ui.dialogs.OffersDialogFragment");
            ((OffersDialogFragment) parentFragment).dismissAllowingStateLoss();
            SnackbarHelper.showShort(requireContext(), R.string.error);
        }
    }

    /* compiled from: OfferFragment.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010#\u001a\u00020\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u001e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\u001e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferFragment$Builder;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "builder", "(Lorg/betup/ui/dialogs/offer/OfferFragment$Builder;)V", "value", "", "id", "getId", "()Ljava/lang/String;", "", "Lorg/betup/ui/dialogs/offer/OfferItemContent;", "elements", "getElements", "()Ljava/util/List;", "", "expiresAt", "getExpiresAt", "()J", "backgroundImageUrl", "getBackgroundImageUrl", "oldStoreCode", "getOldStoreCode", "newStoreCode", "getNewStoreCode", "", "betcoins", "getBetcoins", "()I", "addElement", "element", "date", "url", "storeCode", OperatingSystem.JsonKeys.BUILD, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String backgroundImageUrl;
        private int betcoins;
        private List<? extends OfferItemContent> elements;
        private long expiresAt;
        private String id;
        private String newStoreCode;
        private String oldStoreCode;

        public Builder() {
            this.elements = CollectionsKt.emptyList();
            this.backgroundImageUrl = "";
            this.oldStoreCode = "";
            this.newStoreCode = "";
        }

        public Builder(Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            this.elements = CollectionsKt.emptyList();
            this.backgroundImageUrl = "";
            this.oldStoreCode = "";
            this.newStoreCode = "";
            this.id = builder.getId();
            this.elements = builder.elements;
            this.expiresAt = builder.expiresAt;
            this.backgroundImageUrl = builder.backgroundImageUrl;
            this.oldStoreCode = builder.oldStoreCode;
            this.newStoreCode = builder.newStoreCode;
            this.betcoins = builder.betcoins;
        }

        public final String getId() {
            String str = this.id;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("id");
            return null;
        }

        public final List<OfferItemContent> getElements() {
            return this.elements;
        }

        public final long getExpiresAt() {
            return this.expiresAt;
        }

        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final String getOldStoreCode() {
            return this.oldStoreCode;
        }

        public final String getNewStoreCode() {
            return this.newStoreCode;
        }

        public final int getBetcoins() {
            return this.betcoins;
        }

        public final Builder id(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            return this;
        }

        public final Builder addElement(OfferItemContent element) {
            Intrinsics.checkNotNullParameter(element, "element");
            this.elements = CollectionsKt.plus((Collection<? extends OfferItemContent>) this.elements, element);
            return this;
        }

        public final Builder expiresAt(long date) {
            this.expiresAt = date;
            return this;
        }

        public final Builder backgroundImageUrl(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.backgroundImageUrl = url;
            return this;
        }

        public final Builder oldStoreCode(String storeCode) {
            Intrinsics.checkNotNullParameter(storeCode, "storeCode");
            this.oldStoreCode = storeCode;
            return this;
        }

        public final Builder newStoreCode(String storeCode) {
            Intrinsics.checkNotNullParameter(storeCode, "storeCode");
            this.newStoreCode = storeCode;
            return this;
        }

        public final Builder betcoins(int betcoins) {
            this.betcoins = betcoins;
            return this;
        }

        public final Builder build() {
            return new Builder(this);
        }
    }
}
