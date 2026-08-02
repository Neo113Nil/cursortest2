package org.betup.ui.tour.controller;

import android.content.Context;
import android.os.Bundle;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsInteractor;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TourFavoriteSportsController.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010*\u001a\u00020+2\u0006\u0010$\u001a\u00020%J\u0006\u0010,\u001a\u00020+J\u0006\u0010-\u001a\u00020+J\u000e\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u0017J\u0006\u00100\u001a\u00020+J\u000e\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020\u0011J\u000e\u00103\u001a\u00020+2\u0006\u00102\u001a\u00020\u0011J\u0018\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u0017H\u0002J\u0006\u00107\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0013¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00069"}, d2 = {"Lorg/betup/ui/tour/controller/TourFavoriteSportsController;", "", "newSportsInteractor", "Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;", "putFavoriteSportsInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsInteractor;", "deleteFavoriteSportsInteractor", "Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteSportsInteractor;", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsInteractor;Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteSportsInteractor;Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "_items", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "items", "Lkotlinx/coroutines/flow/StateFlow;", "getItems", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoading", "", "isLoading", "_isLoadingMore", "isLoadingMore", "_hasMore", "hasMore", "getHasMore", "_error", "", "error", "getError", "offset", "", "context", "Landroid/content/Context;", "isActive", "()Z", "setActive", "(Z)V", "bind", "", "unbind", "refresh", "loadPage", "append", "loadNextPage", "onAddToFavorite", "item", "onDeleteFromFavorite", "updateItemFavorite", "itemId", "isFavorite", "canAddFavorite", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourFavoriteSportsController {
    public static final int MAX_FAVORITES = 3;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Boolean> _hasMore;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isLoadingMore;
    private final MutableStateFlow<List<SportListItemUiModel>> _items;
    private Context context;
    private final DeleteFavoriteSportsInteractor deleteFavoriteSportsInteractor;
    private final StateFlow<String> error;
    private final StateFlow<Boolean> hasMore;
    private boolean isActive;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isLoadingMore;
    private final StateFlow<List<SportListItemUiModel>> items;
    private final MatchFilterState matchFilterState;
    private final NewSportsInteractor newSportsInteractor;
    private int offset;
    private final PutFavoriteSportsInteractor putFavoriteSportsInteractor;
    private final CoroutineScope scope;
    public static final int $stable = 8;

    @Inject
    public TourFavoriteSportsController(NewSportsInteractor newSportsInteractor, PutFavoriteSportsInteractor putFavoriteSportsInteractor, DeleteFavoriteSportsInteractor deleteFavoriteSportsInteractor, MatchFilterState matchFilterState) {
        Intrinsics.checkNotNullParameter(newSportsInteractor, "newSportsInteractor");
        Intrinsics.checkNotNullParameter(putFavoriteSportsInteractor, "putFavoriteSportsInteractor");
        Intrinsics.checkNotNullParameter(deleteFavoriteSportsInteractor, "deleteFavoriteSportsInteractor");
        Intrinsics.checkNotNullParameter(matchFilterState, "matchFilterState");
        this.newSportsInteractor = newSportsInteractor;
        this.putFavoriteSportsInteractor = putFavoriteSportsInteractor;
        this.deleteFavoriteSportsInteractor = deleteFavoriteSportsInteractor;
        this.matchFilterState = matchFilterState;
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        MutableStateFlow<List<SportListItemUiModel>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._items = MutableStateFlow;
        this.items = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow2;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingMore = MutableStateFlow3;
        this.isLoadingMore = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(true);
        this._hasMore = MutableStateFlow4;
        this.hasMore = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow5;
        this.error = FlowKt.asStateFlow(MutableStateFlow5);
    }

    public final StateFlow<List<SportListItemUiModel>> getItems() {
        return this.items;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> isLoadingMore() {
        return this.isLoadingMore;
    }

    public final StateFlow<Boolean> getHasMore() {
        return this.hasMore;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void bind(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.isActive = true;
    }

    public final void unbind() {
        this.isActive = false;
        this.context = null;
    }

    public final void refresh() {
        this.offset = 0;
        loadPage(false);
    }

    public final void loadPage(final boolean append) {
        if (this.isActive) {
            if (append) {
                this._isLoadingMore.setValue(true);
            } else {
                this._isLoading.setValue(true);
            }
            this._error.setValue(null);
            Bundle bundle = new Bundle();
            bundle.putInt("offset", this.offset);
            bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 50);
            bundle.putString("name", "");
            bundle.putString("matchDateFilter", this.matchFilterState.getSelectedFilter().getValue().getName());
            this.newSportsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.tour.controller.TourFavoriteSportsController$$ExternalSyntheticLambda2
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    TourFavoriteSportsController.loadPage$lambda$1(TourFavoriteSportsController.this, append, fetchedResponseMessage);
                }
            }, null, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadPage$lambda$1(TourFavoriteSportsController tourFavoriteSportsController, boolean z, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(tourFavoriteSportsController.scope, Dispatchers.getMain(), null, new TourFavoriteSportsController$loadPage$1$1(tourFavoriteSportsController, fetchedResponseMessage, z, null), 2, null);
    }

    public final void loadNextPage() {
        if (!this._hasMore.getValue().booleanValue() || this._isLoadingMore.getValue().booleanValue() || this._isLoading.getValue().booleanValue()) {
            return;
        }
        loadPage(true);
    }

    public final void onAddToFavorite(final SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.isActive) {
            List<SportListItemUiModel> value = this._items.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (((SportListItemUiModel) obj).isFavorite()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((SportListItemUiModel) it.next()).getId()));
            }
            ArrayList arrayList4 = arrayList3;
            if (arrayList4.size() >= 3 || arrayList4.contains(Integer.valueOf(item.getId()))) {
                return;
            }
            this.putFavoriteSportsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.tour.controller.TourFavoriteSportsController$$ExternalSyntheticLambda1
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    TourFavoriteSportsController.onAddToFavorite$lambda$4(TourFavoriteSportsController.this, item, fetchedResponseMessage);
                }
            }, CollectionsKt.plus((Collection<? extends Integer>) arrayList4, Integer.valueOf(item.getId())), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAddToFavorite$lambda$4(TourFavoriteSportsController tourFavoriteSportsController, SportListItemUiModel sportListItemUiModel, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(tourFavoriteSportsController.scope, Dispatchers.getMain(), null, new TourFavoriteSportsController$onAddToFavorite$1$1(tourFavoriteSportsController, fetchedResponseMessage, sportListItemUiModel, null), 2, null);
    }

    public final void onDeleteFromFavorite(final SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.isActive) {
            List<SportListItemUiModel> value = this._items.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                SportListItemUiModel sportListItemUiModel = (SportListItemUiModel) obj;
                if (sportListItemUiModel.isFavorite() && sportListItemUiModel.getId() != item.getId()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((SportListItemUiModel) it.next()).getId()));
            }
            this.putFavoriteSportsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.tour.controller.TourFavoriteSportsController$$ExternalSyntheticLambda0
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    TourFavoriteSportsController.onDeleteFromFavorite$lambda$7(TourFavoriteSportsController.this, item, fetchedResponseMessage);
                }
            }, arrayList3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDeleteFromFavorite$lambda$7(TourFavoriteSportsController tourFavoriteSportsController, SportListItemUiModel sportListItemUiModel, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(tourFavoriteSportsController.scope, Dispatchers.getMain(), null, new TourFavoriteSportsController$onDeleteFromFavorite$1$1(tourFavoriteSportsController, fetchedResponseMessage, sportListItemUiModel, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemFavorite(int itemId, boolean isFavorite) {
        MutableStateFlow<List<SportListItemUiModel>> mutableStateFlow = this._items;
        List<SportListItemUiModel> value = mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        for (SportListItemUiModel sportListItemUiModel : value) {
            if (sportListItemUiModel.getId() == itemId) {
                sportListItemUiModel = SportListItemUiModel.copy$default(sportListItemUiModel, 0, null, null, 0, 0, isFavorite, null, 95, null);
            }
            arrayList.add(sportListItemUiModel);
        }
        mutableStateFlow.setValue(arrayList);
    }

    public final boolean canAddFavorite() {
        int i;
        List<SportListItemUiModel> value = this._items.getValue();
        if ((value instanceof Collection) && value.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = value.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((SportListItemUiModel) it.next()).isFavorite() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i < 3;
    }
}
