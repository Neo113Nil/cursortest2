package org.betup.ui.tour.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.model.remote.entity.sports.NewSportsItem;
import org.betup.model.remote.entity.sports.NewSportsResponse;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;

/* compiled from: TourFavoriteSportsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.controller.TourFavoriteSportsController$loadPage$1$1", f = "TourFavoriteSportsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class TourFavoriteSportsController$loadPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $append;
    final /* synthetic */ FetchedResponseMessage<NewSportsResponse, Integer> $response;
    int label;
    final /* synthetic */ TourFavoriteSportsController this$0;

    /* compiled from: TourFavoriteSportsController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FetchStat.values().length];
            try {
                iArr[FetchStat.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchStat.NO_CONNECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TourFavoriteSportsController$loadPage$1$1(TourFavoriteSportsController tourFavoriteSportsController, FetchedResponseMessage<NewSportsResponse, Integer> fetchedResponseMessage, boolean z, Continuation<? super TourFavoriteSportsController$loadPage$1$1> continuation) {
        super(2, continuation);
        this.this$0 = tourFavoriteSportsController;
        this.$response = fetchedResponseMessage;
        this.$append = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TourFavoriteSportsController$loadPage$1$1(this.this$0, this.$response, this.$append, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TourFavoriteSportsController$loadPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        ArrayList emptyList;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        int i;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        List<NewSportsItem> items;
        String str;
        String photoUrl;
        String name;
        MutableStateFlow mutableStateFlow7;
        MutableStateFlow mutableStateFlow8;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.this$0.getIsActive()) {
            return Unit.INSTANCE;
        }
        mutableStateFlow = this.this$0._isLoading;
        mutableStateFlow.setValue(Boxing.boxBoolean(false));
        mutableStateFlow2 = this.this$0._isLoadingMore;
        mutableStateFlow2.setValue(Boxing.boxBoolean(false));
        FetchStat stat = this.$response.getStat();
        int i2 = stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()];
        if (i2 == 1) {
            NewSportsResponse model = this.$response.getModel();
            if (model == null || (items = model.getItems()) == null) {
                emptyList = CollectionsKt.emptyList();
            } else {
                List<NewSportsItem> list = items;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (NewSportsItem newSportsItem : list) {
                    NewSport sport = newSportsItem.getSport();
                    int id = sport != null ? sport.getId() : 0;
                    NewSport sport2 = newSportsItem.getSport();
                    if (sport2 != null && (name = sport2.getName()) != null) {
                        String upperCase = name.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        if (upperCase != null) {
                            str = upperCase;
                            NewSport sport3 = newSportsItem.getSport();
                            arrayList.add(new SportListItemUiModel(id, str, (sport3 != null || (photoUrl = sport3.getPhotoUrl()) == null) ? "" : photoUrl, 0, 0, newSportsItem.isFavorite(), new Function0() { // from class: org.betup.ui.tour.controller.TourFavoriteSportsController$loadPage$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit unit;
                                    unit = Unit.INSTANCE;
                                    return unit;
                                }
                            }));
                        }
                    }
                    str = "";
                    NewSport sport32 = newSportsItem.getSport();
                    arrayList.add(new SportListItemUiModel(id, str, (sport32 != null || (photoUrl = sport32.getPhotoUrl()) == null) ? "" : photoUrl, 0, 0, newSportsItem.isFavorite(), new Function0() { // from class: org.betup.ui.tour.controller.TourFavoriteSportsController$loadPage$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    }));
                }
                emptyList = arrayList;
            }
            if (this.$append) {
                mutableStateFlow5 = this.this$0._items;
                mutableStateFlow6 = this.this$0._items;
                mutableStateFlow5.setValue(CollectionsKt.plus((Collection) mutableStateFlow6.getValue(), (Iterable) emptyList));
            } else {
                mutableStateFlow3 = this.this$0._items;
                mutableStateFlow3.setValue(emptyList);
            }
            mutableStateFlow4 = this.this$0._hasMore;
            mutableStateFlow4.setValue(Boxing.boxBoolean(emptyList.size() >= 50));
            TourFavoriteSportsController tourFavoriteSportsController = this.this$0;
            i = tourFavoriteSportsController.offset;
            tourFavoriteSportsController.offset = i + emptyList.size();
        } else if (i2 != 2) {
            mutableStateFlow8 = this.this$0._error;
            mutableStateFlow8.setValue("Failed to load sports");
        } else {
            mutableStateFlow7 = this.this$0._error;
            mutableStateFlow7.setValue("No internet");
        }
        return Unit.INSTANCE;
    }
}
