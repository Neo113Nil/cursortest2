package org.betup.ui.fragment.flashbet.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.games.flashbet.model.FlashBetCategoryDto;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetCategoriesInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.fragment.flashbet.compose.FlashBetLeagueCardItem;
import org.betup.ui.fragment.flashbet.controller.FlashBetCategoriesState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetCategoriesController.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000eJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesController;", "", "getFlashBetCategoriesInteractor", "Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetCategoriesInteractor;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/flashbet/GetFlashBetCategoriesInteractor;)V", "_categoriesState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState;", "categoriesState", "Lkotlinx/coroutines/flow/StateFlow;", "getCategoriesState", "()Lkotlinx/coroutines/flow/StateFlow;", "_isRefreshing", "", "isRefreshing", "loadCategories", "", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "", "forceRefresh", "mapToLeagueCard", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetLeagueCardItem;", "dto", "Lorg/betup/games/flashbet/model/FlashBetCategoryDto;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetCategoriesController {
    public static final int $stable = 8;
    private final MutableStateFlow<FlashBetCategoriesState> _categoriesState;
    private final MutableStateFlow<Boolean> _isRefreshing;
    private final StateFlow<FlashBetCategoriesState> categoriesState;
    private final GetFlashBetCategoriesInteractor getFlashBetCategoriesInteractor;
    private final StateFlow<Boolean> isRefreshing;

    @Inject
    public FlashBetCategoriesController(GetFlashBetCategoriesInteractor getFlashBetCategoriesInteractor) {
        Intrinsics.checkNotNullParameter(getFlashBetCategoriesInteractor, "getFlashBetCategoriesInteractor");
        this.getFlashBetCategoriesInteractor = getFlashBetCategoriesInteractor;
        MutableStateFlow<FlashBetCategoriesState> MutableStateFlow = StateFlowKt.MutableStateFlow(FlashBetCategoriesState.Loading.INSTANCE);
        this._categoriesState = MutableStateFlow;
        this.categoriesState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isRefreshing = MutableStateFlow2;
        this.isRefreshing = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final StateFlow<FlashBetCategoriesState> getCategoriesState() {
        return this.categoriesState;
    }

    public final StateFlow<Boolean> isRefreshing() {
        return this.isRefreshing;
    }

    public static /* synthetic */ void loadCategories$default(FlashBetCategoriesController flashBetCategoriesController, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        flashBetCategoriesController.loadCategories(str, z);
    }

    public final void loadCategories(String sportId, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(sportId, "sportId");
        if (forceRefresh) {
            this.getFlashBetCategoriesInteractor.invalidate(sportId);
        }
        FlashBetCategoriesState value = this._categoriesState.getValue();
        boolean z = (value instanceof FlashBetCategoriesState.Success) && !((FlashBetCategoriesState.Success) value).getItems().isEmpty();
        if (!forceRefresh || !z) {
            this._categoriesState.setValue(FlashBetCategoriesState.Loading.INSTANCE);
        } else {
            this._isRefreshing.setValue(true);
        }
        this.getFlashBetCategoriesInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<List<? extends FlashBetCategoryDto>, String>() { // from class: org.betup.ui.fragment.flashbet.controller.FlashBetCategoriesController$loadCategories$1

            /* compiled from: FlashBetCategoriesController.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FetchStat.values().length];
                    try {
                        iArr[FetchStat.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<List<? extends FlashBetCategoryDto>, String> response) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                MutableStateFlow mutableStateFlow3;
                FlashBetLeagueCardItem mapToLeagueCard;
                Intrinsics.checkNotNullParameter(response, "response");
                mutableStateFlow = FlashBetCategoriesController.this._isRefreshing;
                mutableStateFlow.setValue(false);
                FetchStat stat = response.getStat();
                if ((stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()]) != 1) {
                    mutableStateFlow2 = FlashBetCategoriesController.this._categoriesState;
                    mutableStateFlow2.setValue(FlashBetCategoriesState.Error.INSTANCE);
                    return;
                }
                List<? extends FlashBetCategoryDto> model = response.getModel();
                if (model == null) {
                    model = CollectionsKt.emptyList();
                }
                mutableStateFlow3 = FlashBetCategoriesController.this._categoriesState;
                List<? extends FlashBetCategoryDto> list = model;
                FlashBetCategoriesController flashBetCategoriesController = FlashBetCategoriesController.this;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    mapToLeagueCard = flashBetCategoriesController.mapToLeagueCard((FlashBetCategoryDto) it.next());
                    arrayList.add(mapToLeagueCard);
                }
                mutableStateFlow3.setValue(new FlashBetCategoriesState.Success(arrayList));
            }
        }, sportId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlashBetLeagueCardItem mapToLeagueCard(FlashBetCategoryDto dto) {
        String id = dto.getId();
        String name = dto.getName();
        String subtitle = dto.getSubtitle();
        String str = subtitle == null ? "" : subtitle;
        String photoUrl = dto.getPhotoUrl();
        return new FlashBetLeagueCardItem(id, name, str, photoUrl == null ? "" : photoUrl, dto.getSmallPhotoUrl(), dto.getEntryFee(), dto.getPlayedMatches(), dto.getTotalMatches(), null, 256, null);
    }
}
