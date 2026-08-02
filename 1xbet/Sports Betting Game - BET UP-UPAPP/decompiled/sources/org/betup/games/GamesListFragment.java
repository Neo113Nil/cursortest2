package org.betup.games;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.O6;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.databinding.FragmentGamesListBinding;
import org.betup.games.GameListItem;
import org.betup.games.common.remote.interactor.WebGameSessionCodeInteractor;
import org.betup.games.common.remote.interactor.WebGamesListInteractor;
import org.betup.games.webgame.WebGameUrlBuilder;
import org.betup.games.webgame.model.WebGameListItemModel;
import org.betup.games.webgame.model.WebGameSessionCodeModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.services.LocaleService;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.ui.BackPressedController;
import org.betup.ui.dialogs.webgame.WebGameDialogFragment;
import org.betup.utils.DimensionsUtil;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GamesListFragment.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u00017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u000fH\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000206H\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u000e\u0012\u0004\u0012\u00020\u001d0)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lorg/betup/games/GamesListFragment;", "Lorg/betup/games/BaseGameFragment;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", "Lorg/betup/games/GameListTapListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "_binding", "Lorg/betup/databinding/FragmentGamesListBinding;", "binding", "getBinding", "()Lorg/betup/databinding/FragmentGamesListBinding;", O6.G1, "Lorg/betup/games/GameListFragmentAdapter;", "webItems", "", "Lorg/betup/games/GameListItem$Web;", "webGamesListInteractor", "Lorg/betup/games/common/remote/interactor/WebGamesListInteractor;", "getWebGamesListInteractor", "()Lorg/betup/games/common/remote/interactor/WebGamesListInteractor;", "setWebGamesListInteractor", "(Lorg/betup/games/common/remote/interactor/WebGamesListInteractor;)V", "webGameSessionCodeInteractor", "Lorg/betup/games/common/remote/interactor/WebGameSessionCodeInteractor;", "getWebGameSessionCodeInteractor", "()Lorg/betup/games/common/remote/interactor/WebGameSessionCodeInteractor;", "setWebGameSessionCodeInteractor", "(Lorg/betup/games/common/remote/interactor/WebGameSessionCodeInteractor;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "webGamesFetchListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/games/webgame/model/WebGameListItemModel;", "rebuildGridList", "resolveAppLocaleLang", "", "onNativeGameClicked", "target", "Lorg/betup/bus/NavigateMessage$TargetGame;", "onWebGameClicked", "item", "onBackPressed", "", "getAmount", "", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GamesListFragment extends BaseGameFragment implements BackPressedController.BackPressedListener, GameListTapListener {
    private FragmentGamesListBinding _binding;
    private GameListFragmentAdapter adapter;

    @Inject
    public WebGameSessionCodeInteractor webGameSessionCodeInteractor;

    @Inject
    public WebGamesListInteractor webGamesListInteractor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private List<GameListItem.Web> webItems = CollectionsKt.emptyList();
    private final BaseCachedSharedInteractor.OnFetchedListener<List<WebGameListItemModel>, Unit> webGamesFetchListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.GamesListFragment$$ExternalSyntheticLambda0
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            GamesListFragment.webGamesFetchListener$lambda$4(GamesListFragment.this, fetchedResponseMessage);
        }
    };

    @Override // org.betup.games.BaseGameFragment
    protected long getAmount() {
        return 0L;
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        return true;
    }

    private final FragmentGamesListBinding getBinding() {
        FragmentGamesListBinding fragmentGamesListBinding = this._binding;
        Intrinsics.checkNotNull(fragmentGamesListBinding);
        return fragmentGamesListBinding;
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

    public final WebGameSessionCodeInteractor getWebGameSessionCodeInteractor() {
        WebGameSessionCodeInteractor webGameSessionCodeInteractor = this.webGameSessionCodeInteractor;
        if (webGameSessionCodeInteractor != null) {
            return webGameSessionCodeInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webGameSessionCodeInteractor");
        return null;
    }

    public final void setWebGameSessionCodeInteractor(WebGameSessionCodeInteractor webGameSessionCodeInteractor) {
        Intrinsics.checkNotNullParameter(webGameSessionCodeInteractor, "<set-?>");
        this.webGameSessionCodeInteractor = webGameSessionCodeInteractor;
    }

    @Override // org.betup.games.BaseGameFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        Context applicationContext = activity != null ? activity.getApplicationContext() : null;
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        List listOf = CollectionsKt.listOf((Object[]) new Integer[]{8, 6});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOf, 10));
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(DimensionsUtil.getPixelsFromDp(requireContext(), ((Number) it.next()).intValue())));
        }
        int sumOfInt = (DimensionsUtil.getDisplayMetrics(requireContext()).widthPixels / 2) - CollectionsKt.sumOfInt(arrayList);
        Context context = getContext();
        this.adapter = context != null ? new GameListFragmentAdapter(context, this, sumOfInt) : null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentGamesListBinding.inflate(inflater, container, false);
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().gameListRecycle.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        getBinding().gameListRecycle.setAdapter(this.adapter);
        getBinding().progress.setVisibility(0);
        Bundle bundle = new Bundle();
        bundle.putString(WebGamesListInteractor.KEY_LANG, resolveAppLocaleLang());
        getWebGamesListInteractor().load(this.webGamesFetchListener, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webGamesFetchListener$lambda$4(GamesListFragment gamesListFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (gamesListFragment.isActive()) {
            gamesListFragment.getBinding().progress.setVisibility(8);
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
                Object model = fetchedResponseMessage.getModel();
                Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
                Iterable<WebGameListItemModel> iterable = (Iterable) model;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (WebGameListItemModel webGameListItemModel : iterable) {
                    arrayList.add(new GameListItem.Web(webGameListItemModel.getCode(), webGameListItemModel.getName(), webGameListItemModel.getCoverImageUrl(), webGameListItemModel.getGameUrl(), webGameListItemModel.getOrder()));
                }
                gamesListFragment.webItems = arrayList;
                AnalyticsHelper.INSTANCE.logMiniGamesCatalogLoaded(gamesListFragment.webItems.size());
            } else {
                SnackbarHelper.showShort(gamesListFragment.requireContext(), R.string.web_games_load_failed);
            }
            gamesListFragment.rebuildGridList();
        }
    }

    private final void rebuildGridList() {
        GameListFragmentAdapter gameListFragmentAdapter = this.adapter;
        if (gameListFragmentAdapter != null) {
            gameListFragmentAdapter.addNewItems(CollectionsKt.sortedWith(this.webItems, new Comparator() { // from class: org.betup.games.GamesListFragment$rebuildGridList$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((GameListItem.Web) t).getOrder()), Integer.valueOf(((GameListItem.Web) t2).getOrder()));
                }
            }));
        }
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

    @Override // org.betup.games.GameListTapListener
    public void onNativeGameClicked(NavigateMessage.TargetGame target) {
        Intrinsics.checkNotNullParameter(target, "target");
        EventBus.getDefault().post(new NavigateMessage(target, null));
    }

    @Override // org.betup.games.GameListTapListener
    public void onWebGameClicked(final GameListItem.Web item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getBinding().progress.setVisibility(0);
        getWebGameSessionCodeInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.GamesListFragment$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                GamesListFragment.onWebGameClicked$lambda$6(GamesListFragment.this, item, fetchedResponseMessage);
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWebGameClicked$lambda$6(GamesListFragment gamesListFragment, GameListItem.Web web, FetchedResponseMessage fetchedResponseMessage) {
        if (gamesListFragment.isActive()) {
            gamesListFragment.getBinding().progress.setVisibility(8);
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || StringsKt.isBlank(((WebGameSessionCodeModel) fetchedResponseMessage.getModel()).getGameSessionCode())) {
                SnackbarHelper.showShort(gamesListFragment.requireContext(), R.string.web_game_session_failed);
                AnalyticsHelper.INSTANCE.logMiniGameSessionCode(web.getCode(), false);
                return;
            }
            AnalyticsHelper.INSTANCE.logMiniGameSessionCode(web.getCode(), true);
            String buildPlayUrl = WebGameUrlBuilder.INSTANCE.buildPlayUrl(web.getGameUrl(), ((WebGameSessionCodeModel) fetchedResponseMessage.getModel()).getGameSessionCode(), gamesListFragment.resolveAppLocaleLang());
            AnalyticsHelper.INSTANCE.logMiniGameStarted(web.getCode());
            WebGameDialogFragment.INSTANCE.newInstance(buildPlayUrl, web.getCode()).show(gamesListFragment.getParentFragmentManager(), WebGameDialogFragment.TAG);
        }
    }

    /* compiled from: GamesListFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/games/GamesListFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getInstance", "Lorg/betup/games/GamesListFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GamesListFragment getInstance() {
            return new GamesListFragment();
        }
    }
}
