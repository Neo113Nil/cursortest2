package org.betup.ui.fragment.balance;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.LocaleListCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.games.common.remote.interactor.WebGamesListInteractor;
import org.betup.games.webgame.model.WebGameListItemModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.user.balance.V7BalanceHistoryInteractor;
import org.betup.model.remote.entity.user.balance.BalanceDataModel;
import org.betup.model.remote.entity.user.balance.BalanceModel;
import org.betup.model.remote.entity.user.balance.BalanceResponseModel;
import org.betup.services.LocaleService;
import org.betup.ui.fragment.BaseFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: BalanceHistoryFragmentK.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 72\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u00017B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010/\u001a\u00020\"H\u0002J\b\u00100\u001a\u00020\u001bH\u0002J\u001c\u00101\u001a\u00020\"2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000403H\u0016J\b\u00104\u001a\u00020\"H\u0002J\b\u00105\u001a\u00020\"H\u0002J\b\u00106\u001a\u00020\"H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u0017\u0012\u0004\u0012\u00020\"0\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068²\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u008a\u0084\u0002²\u0006\u0016\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aX\u008a\u0084\u0002²\u0006\n\u0010;\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u0004\u0018\u00010\u001bX\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/balance/BalanceHistoryFragmentK;", "Lorg/betup/ui/fragment/BaseFragment;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/user/balance/BalanceModel;", "Ljava/lang/Void;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "v7BalanceHistoryInteractor", "Lorg/betup/model/remote/api/rest/user/balance/V7BalanceHistoryInteractor;", "getV7BalanceHistoryInteractor", "()Lorg/betup/model/remote/api/rest/user/balance/V7BalanceHistoryInteractor;", "setV7BalanceHistoryInteractor", "(Lorg/betup/model/remote/api/rest/user/balance/V7BalanceHistoryInteractor;)V", "webGamesListInteractor", "Lorg/betup/games/common/remote/interactor/WebGamesListInteractor;", "getWebGamesListInteractor", "()Lorg/betup/games/common/remote/interactor/WebGamesListInteractor;", "setWebGamesListInteractor", "(Lorg/betup/games/common/remote/interactor/WebGamesListInteractor;)V", "offset", "", "balanceHistoryFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/betup/model/remote/entity/user/balance/BalanceDataModel;", "gameNamesByCodeFlow", "", "", "isLoadingFlow", "", "isLoadingMoreFlow", "hasMoreFlow", "errorMessageFlow", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "webGamesFetchListener", "Lorg/betup/games/webgame/model/WebGameListItemModel;", "loadWebGameNames", "resolveAppLocaleLang", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "refresh", "loadNextPage", "requestData", VastTagName.COMPANION, "app_release", "balanceHistory", "gameNamesByCode", "isLoading", "isLoadingMore", "hasMore", "errorMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BalanceHistoryFragmentK extends BaseFragment implements BaseCachedSharedInteractor.OnFetchedListener<BalanceModel, Void> {
    private static final String DEFAULT_LANG = "en";
    private static final int LIMIT = 15;
    private int offset;

    @Inject
    public V7BalanceHistoryInteractor v7BalanceHistoryInteractor;

    @Inject
    public WebGamesListInteractor webGamesListInteractor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final MutableStateFlow<List<BalanceDataModel>> balanceHistoryFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
    private final MutableStateFlow<Map<String, String>> gameNamesByCodeFlow = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
    private final MutableStateFlow<Boolean> isLoadingFlow = StateFlowKt.MutableStateFlow(false);
    private final MutableStateFlow<Boolean> isLoadingMoreFlow = StateFlowKt.MutableStateFlow(false);
    private final MutableStateFlow<Boolean> hasMoreFlow = StateFlowKt.MutableStateFlow(true);
    private final MutableStateFlow<String> errorMessageFlow = StateFlowKt.MutableStateFlow(null);
    private final BaseCachedSharedInteractor.OnFetchedListener<List<WebGameListItemModel>, Unit> webGamesFetchListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.balance.BalanceHistoryFragmentK$$ExternalSyntheticLambda0
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            BalanceHistoryFragmentK.webGamesFetchListener$lambda$2(BalanceHistoryFragmentK.this, fetchedResponseMessage);
        }
    };

    @JvmStatic
    public static final BalanceHistoryFragmentK newInstance() {
        return INSTANCE.newInstance();
    }

    public final V7BalanceHistoryInteractor getV7BalanceHistoryInteractor() {
        V7BalanceHistoryInteractor v7BalanceHistoryInteractor = this.v7BalanceHistoryInteractor;
        if (v7BalanceHistoryInteractor != null) {
            return v7BalanceHistoryInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7BalanceHistoryInteractor");
        return null;
    }

    public final void setV7BalanceHistoryInteractor(V7BalanceHistoryInteractor v7BalanceHistoryInteractor) {
        Intrinsics.checkNotNullParameter(v7BalanceHistoryInteractor, "<set-?>");
        this.v7BalanceHistoryInteractor = v7BalanceHistoryInteractor;
    }

    public final WebGamesListInteractor getWebGamesListInteractor() {
        WebGamesListInteractor webGamesListInteractor = this.webGamesListInteractor;
        if (webGamesListInteractor != null) {
            return webGamesListInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webGamesListInteractor");
        return null;
    }

    public final void setWebGamesListInteractor(WebGamesListInteractor webGamesListInteractor) {
        Intrinsics.checkNotNullParameter(webGamesListInteractor, "<set-?>");
        this.webGamesListInteractor = webGamesListInteractor;
    }

    /* compiled from: BalanceHistoryFragmentK.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/balance/BalanceHistoryFragmentK$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LIMIT", "", "DEFAULT_LANG", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/balance/BalanceHistoryFragmentK;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BalanceHistoryFragmentK newInstance() {
            return new BalanceHistoryFragmentK();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        setTitle(getString(R.string.balance_history));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1946981244, true, new BalanceHistoryFragmentK$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            this.offset = 0;
            this.balanceHistoryFlow.setValue(CollectionsKt.emptyList());
            this.hasMoreFlow.setValue(true);
            this.isLoadingFlow.setValue(true);
            loadWebGameNames();
            requestData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webGamesFetchListener$lambda$2(BalanceHistoryFragmentK balanceHistoryFragmentK, FetchedResponseMessage fetchedResponseMessage) {
        if (balanceHistoryFragmentK.isAdded() && fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            MutableStateFlow<Map<String, String>> mutableStateFlow = balanceHistoryFragmentK.gameNamesByCodeFlow;
            Object model = fetchedResponseMessage.getModel();
            Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
            Iterable<WebGameListItemModel> iterable = (Iterable) model;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
            for (WebGameListItemModel webGameListItemModel : iterable) {
                Pair pair = TuplesKt.to(webGameListItemModel.getCode(), webGameListItemModel.getName());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            mutableStateFlow.setValue(linkedHashMap);
        }
    }

    private final void loadWebGameNames() {
        Bundle bundle = new Bundle();
        bundle.putString(WebGamesListInteractor.KEY_LANG, resolveAppLocaleLang());
        getWebGamesListInteractor().load(this.webGamesFetchListener, null, bundle);
    }

    private final String resolveAppLocaleLang() {
        String language;
        String language2;
        String language3 = LocaleService.getLanguage(requireContext());
        Intrinsics.checkNotNullExpressionValue(language3, "getLanguage(...)");
        String lowerCase = language3.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!StringsKt.isBlank(lowerCase)) {
            return lowerCase;
        }
        LocaleListCompat applicationLocales = AppCompatDelegate.getApplicationLocales();
        Intrinsics.checkNotNullExpressionValue(applicationLocales, "getApplicationLocales(...)");
        if (applicationLocales.isEmpty()) {
            Locale locale = requireContext().getResources().getConfiguration().getLocales().get(0);
            return (locale == null || (language = locale.getLanguage()) == null) ? "en" : language;
        }
        Locale locale2 = applicationLocales.get(0);
        return (locale2 == null || (language2 = locale2.getLanguage()) == null) ? "en" : language2;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<BalanceModel, Void> responseMessage) {
        List<BalanceDataModel> emptyList;
        BalanceResponseModel response;
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        this.isLoadingFlow.setValue(false);
        this.isLoadingMoreFlow.setValue(false);
        if (isAdded()) {
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                this.errorMessageFlow.setValue(getString(R.string.no_inet_connection));
                return;
            }
            this.errorMessageFlow.setValue(null);
            BalanceModel model = responseMessage.getModel();
            if (model == null || (response = model.getResponse()) == null || (emptyList = response.getHistory()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            if (emptyList.size() < 15) {
                this.hasMoreFlow.setValue(false);
            }
            List<BalanceDataModel> mutableList = CollectionsKt.toMutableList((Collection) this.balanceHistoryFlow.getValue());
            mutableList.addAll(emptyList);
            this.balanceHistoryFlow.setValue(mutableList);
            this.offset += 15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh() {
        if (this.isLoadingFlow.getValue().booleanValue()) {
            return;
        }
        this.offset = 0;
        this.balanceHistoryFlow.setValue(CollectionsKt.emptyList());
        this.hasMoreFlow.setValue(true);
        this.errorMessageFlow.setValue(null);
        getV7BalanceHistoryInteractor().invalidate();
        this.isLoadingFlow.setValue(true);
        requestData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadNextPage() {
        if (this.isLoadingMoreFlow.getValue().booleanValue() || !this.hasMoreFlow.getValue().booleanValue() || this.balanceHistoryFlow.getValue().isEmpty() || this.isLoadingFlow.getValue().booleanValue()) {
            return;
        }
        this.isLoadingMoreFlow.setValue(true);
        requestData();
    }

    private final void requestData() {
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.offset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 15);
        bundle.putString("lang", resolveAppLocaleLang());
        getV7BalanceHistoryInteractor().load(this, null, bundle);
    }
}
