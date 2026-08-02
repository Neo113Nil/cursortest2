package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.OnClick;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.O6;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import me.relex.circleindicator.CircleIndicator;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.analytics.GetOffersListInteractor;
import org.betup.model.remote.api.rest.analytics.GetSingleOfferInfoInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.analytics.OfferModel;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.analytics.AnalyticsService;
import org.betup.ui.dialogs.pager.OffersDialogViewAdapter;
import org.betup.utils.ApiUtils;
import org.betup.utils.ViewPagerUtilsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: OffersDialogFragment.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 V2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u0005:\u0001VB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0012\u0010?\u001a\u00020\u00042\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010@\u001a\u00020\u0010H\u0014J\u001a\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020$2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0010H\u0016J \u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0010H\u0016J\u0010\u0010J\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0010H\u0016J\u0010\u0010K\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0010H\u0002J\u0010\u0010L\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0010H\u0002J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020OH\u0016J\u001c\u0010Q\u001a\u00020\u00042\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040SH\u0016J\b\u0010T\u001a\u00020\u0004H\u0007J\b\u0010U\u001a\u00020\u0004H\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\u001a\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lorg/betup/ui/dialogs/OffersDialogFragment;", "Lorg/betup/ui/dialogs/BaseFullscreenDialogFragment;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "", "", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", O6.G1, "Lorg/betup/ui/dialogs/pager/OffersDialogViewAdapter;", "offerId", "displayedOffers", "", "Lorg/betup/model/remote/entity/analytics/OfferModel;", "lastVisibleOfferIdForClose", "lastAnalyticsPageIndex", "", "getOffersListInteractor", "Lorg/betup/model/remote/api/rest/analytics/GetOffersListInteractor;", "getGetOffersListInteractor", "()Lorg/betup/model/remote/api/rest/analytics/GetOffersListInteractor;", "setGetOffersListInteractor", "(Lorg/betup/model/remote/api/rest/analytics/GetOffersListInteractor;)V", "singleSingleOfferInteractor", "Lorg/betup/model/remote/api/rest/analytics/GetSingleOfferInfoInteractor;", "getSingleSingleOfferInteractor", "()Lorg/betup/model/remote/api/rest/analytics/GetSingleOfferInfoInteractor;", "setSingleSingleOfferInteractor", "(Lorg/betup/model/remote/api/rest/analytics/GetSingleOfferInfoInteractor;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "leftArrow", "Landroid/view/View;", "getLeftArrow", "()Landroid/view/View;", "setLeftArrow", "(Landroid/view/View;)V", "rightArrow", "getRightArrow", "setRightArrow", "pager", "Landroidx/viewpager/widget/ViewPager;", "getPager", "()Landroidx/viewpager/widget/ViewPager;", "setPager", "(Landroidx/viewpager/widget/ViewPager;)V", "indicator", "Lme/relex/circleindicator/CircleIndicator;", "getIndicator", "()Lme/relex/circleindicator/CircleIndicator;", "setIndicator", "(Lme/relex/circleindicator/CircleIndicator;)V", "progressBar", "getProgressBar", "setProgressBar", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "getLayoutId", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "reportOfferPageVisibleIfChanged", "setupArrows", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "getOfferInfoListener", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "leftArrowOnClick", "rightArrowOnClick", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OffersDialogFragment extends BaseFullscreenDialogFragment implements BaseCachedSharedInteractor.OnFetchedListener<String, Unit>, ViewPager.OnPageChangeListener {
    private OffersDialogViewAdapter adapter;

    @Inject
    public AnalyticsService analyticsService;

    @Inject
    public GetOffersListInteractor getOffersListInteractor;

    @BindView(R.id.indicator)
    public CircleIndicator indicator;
    private String lastVisibleOfferIdForClose;

    @BindView(R.id.leftArrow)
    public View leftArrow;
    private String offerId;

    @BindView(R.id.pager)
    public ViewPager pager;

    @BindView(R.id.progressBar)
    public View progressBar;

    @BindView(R.id.rightArrow)
    public View rightArrow;

    @Inject
    public GetSingleOfferInfoInteractor singleSingleOfferInteractor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private List<OfferModel> displayedOffers = CollectionsKt.emptyList();
    private int lastAnalyticsPageIndex = -1;
    private final BaseCachedSharedInteractor.OnFetchedListener<String, String> getOfferInfoListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.OffersDialogFragment$$ExternalSyntheticLambda0
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            OffersDialogFragment.getOfferInfoListener$lambda$4(OffersDialogFragment.this, fetchedResponseMessage);
        }
    };

    @Override // org.betup.ui.dialogs.BaseFullscreenDialogFragment
    protected int getLayoutId() {
        return R.layout.dialog_offers;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    public final GetOffersListInteractor getGetOffersListInteractor() {
        GetOffersListInteractor getOffersListInteractor = this.getOffersListInteractor;
        if (getOffersListInteractor != null) {
            return getOffersListInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getOffersListInteractor");
        return null;
    }

    public final void setGetOffersListInteractor(GetOffersListInteractor getOffersListInteractor) {
        Intrinsics.checkNotNullParameter(getOffersListInteractor, "<set-?>");
        this.getOffersListInteractor = getOffersListInteractor;
    }

    public final GetSingleOfferInfoInteractor getSingleSingleOfferInteractor() {
        GetSingleOfferInfoInteractor getSingleOfferInfoInteractor = this.singleSingleOfferInteractor;
        if (getSingleOfferInfoInteractor != null) {
            return getSingleOfferInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("singleSingleOfferInteractor");
        return null;
    }

    public final void setSingleSingleOfferInteractor(GetSingleOfferInfoInteractor getSingleOfferInfoInteractor) {
        Intrinsics.checkNotNullParameter(getSingleOfferInfoInteractor, "<set-?>");
        this.singleSingleOfferInteractor = getSingleOfferInfoInteractor;
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

    public final View getLeftArrow() {
        View view = this.leftArrow;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leftArrow");
        return null;
    }

    public final void setLeftArrow(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.leftArrow = view;
    }

    public final View getRightArrow() {
        View view = this.rightArrow;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rightArrow");
        return null;
    }

    public final void setRightArrow(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.rightArrow = view;
    }

    public final ViewPager getPager() {
        ViewPager viewPager = this.pager;
        if (viewPager != null) {
            return viewPager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pager");
        return null;
    }

    public final void setPager(ViewPager viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "<set-?>");
        this.pager = viewPager;
    }

    public final CircleIndicator getIndicator() {
        CircleIndicator circleIndicator = this.indicator;
        if (circleIndicator != null) {
            return circleIndicator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("indicator");
        return null;
    }

    public final void setIndicator(CircleIndicator circleIndicator) {
        Intrinsics.checkNotNullParameter(circleIndicator, "<set-?>");
        this.indicator = circleIndicator;
    }

    public final View getProgressBar() {
        View view = this.progressBar;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
        return null;
    }

    public final void setProgressBar(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.progressBar = view;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.offerId = arguments != null ? arguments.getString("offerId") : null;
        FragmentActivity activity = getActivity();
        Context applicationContext = activity != null ? activity.getApplicationContext() : null;
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // org.betup.ui.dialogs.BaseFullscreenDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.offerId != null) {
            getSingleSingleOfferInteractor().load(this.getOfferInfoListener, this.offerId);
        } else {
            getGetOffersListInteractor().load(this, null);
        }
        getLeftArrow().setVisibility(8);
        getRightArrow().setVisibility(8);
        getPager().addOnPageChangeListener(this);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        setupArrows(position);
        reportOfferPageVisibleIfChanged(position);
    }

    private final void reportOfferPageVisibleIfChanged(int position) {
        String id;
        if (!isAdded() || position == this.lastAnalyticsPageIndex) {
            return;
        }
        this.lastAnalyticsPageIndex = position;
        OfferModel offerModel = (OfferModel) CollectionsKt.getOrNull(this.displayedOffers, position);
        if (offerModel == null || (id = offerModel.getId()) == null) {
            return;
        }
        this.lastVisibleOfferIdForClose = id;
        AnalyticsHelper.INSTANCE.logOfferShown(id);
    }

    private final void setupArrows(int position) {
        getLeftArrow().setVisibility(position == 0 ? 8 : 0);
        getRightArrow().setVisibility(position + 1 != getPager().getChildCount() ? 0 : 8);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        String str = this.lastVisibleOfferIdForClose;
        if (str != null && isAdded()) {
            AnalyticsHelper.INSTANCE.logOfferClosed(str);
        }
        super.onDismiss(dialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOfferInfoListener$lambda$4(final OffersDialogFragment offersDialogFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || !offersDialogFragment.isActive()) {
            offersDialogFragment.dismissAllowingStateLoss();
            return;
        }
        String str = (String) fetchedResponseMessage.getModel();
        Json defaultModel = ApiUtils.INSTANCE.getDefaultModel();
        Intrinsics.checkNotNull(str);
        defaultModel.getSerializersModule();
        OfferModel offerModel = (OfferModel) defaultModel.decodeFromString(OfferModel.INSTANCE.serializer(), str);
        offersDialogFragment.displayedOffers = CollectionsKt.listOf(offerModel);
        offersDialogFragment.lastAnalyticsPageIndex = -1;
        FragmentManager childFragmentManager = offersDialogFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        offersDialogFragment.adapter = new OffersDialogViewAdapter(childFragmentManager, CollectionsKt.listOf(offerModel), PurchasePlacement.OFFER_PUSH);
        offersDialogFragment.getPager().setAdapter(offersDialogFragment.adapter);
        offersDialogFragment.getIndicator().setVisibility(8);
        offersDialogFragment.getProgressBar().setVisibility(8);
        offersDialogFragment.getPager().post(new Runnable() { // from class: org.betup.ui.dialogs.OffersDialogFragment$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                OffersDialogFragment.getOfferInfoListener$lambda$4$lambda$3(OffersDialogFragment.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOfferInfoListener$lambda$4$lambda$3(OffersDialogFragment offersDialogFragment) {
        int currentItem = offersDialogFragment.getPager().getCurrentItem();
        offersDialogFragment.setupArrows(currentItem);
        offersDialogFragment.reportOfferPageVisibleIfChanged(currentItem);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<String, Unit> responseMessage) {
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        if (responseMessage.getStat() != FetchStat.SUCCESS || !isActive()) {
            dismissAllowingStateLoss();
            return;
        }
        String model = responseMessage.getModel();
        Json defaultModel = ApiUtils.INSTANCE.getDefaultModel();
        Intrinsics.checkNotNull(model);
        defaultModel.getSerializersModule();
        List<OfferModel> list = (List) defaultModel.decodeFromString(new ArrayListSerializer(OfferModel.INSTANCE.serializer()), model);
        this.displayedOffers = list;
        this.lastAnalyticsPageIndex = -1;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.adapter = new OffersDialogViewAdapter(childFragmentManager, list, PurchasePlacement.OFFER_HOME);
        getPager().setAdapter(this.adapter);
        getIndicator().setViewPager(getPager());
        getProgressBar().setVisibility(8);
        getPager().post(new Runnable() { // from class: org.betup.ui.dialogs.OffersDialogFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OffersDialogFragment.onFetched$lambda$5(OffersDialogFragment.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetched$lambda$5(OffersDialogFragment offersDialogFragment) {
        int currentItem = offersDialogFragment.getPager().getCurrentItem();
        offersDialogFragment.setupArrows(currentItem);
        offersDialogFragment.reportOfferPageVisibleIfChanged(currentItem);
    }

    @OnClick({R.id.leftArrow})
    public final void leftArrowOnClick() {
        ViewPagerUtilsKt.scrollPreviousTabIfExist(getPager());
    }

    @OnClick({R.id.rightArrow})
    public final void rightArrowOnClick() {
        ViewPagerUtilsKt.scrollNextTabIfExist(getPager());
    }

    /* compiled from: OffersDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/dialogs/OffersDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/OffersDialogFragment;", "offerId", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OffersDialogFragment newInstance(String offerId) {
            if (offerId != null) {
                OffersDialogFragment offersDialogFragment = new OffersDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("offerId", offerId);
                offersDialogFragment.setArguments(bundle);
                return offersDialogFragment;
            }
            return new OffersDialogFragment();
        }
    }
}
