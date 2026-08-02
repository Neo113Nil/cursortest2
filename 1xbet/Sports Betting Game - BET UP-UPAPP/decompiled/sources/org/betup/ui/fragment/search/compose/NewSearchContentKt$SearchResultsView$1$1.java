package org.betup.ui.fragment.search.compose;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.betup.model.remote.entity.search.V7LeagueSearchResult;
import org.betup.model.remote.entity.search.V7MatchSearchResult;
import org.betup.model.remote.entity.search.V7TeamSearchResult;
import org.betup.model.remote.entity.search.V7UserSearchResult;
import org.betup.ui.fragment.search.controller.SearchAllResults;
import org.betup.ui.fragment.search.controller.SearchType;

/* compiled from: NewSearchContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$1$1", f = "NewSearchContent.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class NewSearchContentKt$SearchResultsView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SearchAllResults $allResults;
    final /* synthetic */ boolean $hasMore;
    final /* synthetic */ boolean $isLoadingMore;
    final /* synthetic */ List<V7LeagueSearchResult> $leaguesResults;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ List<V7MatchSearchResult> $matchesResults;
    final /* synthetic */ Function0<Unit> $onLoadMore;
    final /* synthetic */ SearchType $searchType;
    final /* synthetic */ List<V7TeamSearchResult> $teamsResults;
    final /* synthetic */ List<V7UserSearchResult> $usersResults;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewSearchContentKt$SearchResultsView$1$1(LazyListState lazyListState, SearchType searchType, SearchAllResults searchAllResults, List<V7LeagueSearchResult> list, List<V7TeamSearchResult> list2, List<V7MatchSearchResult> list3, List<V7UserSearchResult> list4, boolean z, boolean z2, Function0<Unit> function0, Continuation<? super NewSearchContentKt$SearchResultsView$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$searchType = searchType;
        this.$allResults = searchAllResults;
        this.$leaguesResults = list;
        this.$teamsResults = list2;
        this.$matchesResults = list3;
        this.$usersResults = list4;
        this.$hasMore = z;
        this.$isLoadingMore = z2;
        this.$onLoadMore = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewSearchContentKt$SearchResultsView$1$1(this.$listState, this.$searchType, this.$allResults, this.$leaguesResults, this.$teamsResults, this.$matchesResults, this.$usersResults, this.$hasMore, this.$isLoadingMore, this.$onLoadMore, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewSearchContentKt$SearchResultsView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = NewSearchContentKt$SearchResultsView$1$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final SearchType searchType = this.$searchType;
            final SearchAllResults searchAllResults = this.$allResults;
            final List<V7LeagueSearchResult> list = this.$leaguesResults;
            final List<V7TeamSearchResult> list2 = this.$teamsResults;
            final List<V7MatchSearchResult> list3 = this.$matchesResults;
            final List<V7UserSearchResult> list4 = this.$usersResults;
            final boolean z = this.$hasMore;
            final boolean z2 = this.$isLoadingMore;
            final Function0<Unit> function0 = this.$onLoadMore;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$1$1.2

                /* compiled from: NewSearchContent.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$1$1$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[SearchType.values().length];
                        try {
                            iArr[SearchType.ALL.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[SearchType.LEAGUES.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[SearchType.TEAMS.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[SearchType.MATCHES.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[SearchType.USERS.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    int size;
                    int i2 = WhenMappings.$EnumSwitchMapping$0[SearchType.this.ordinal()];
                    if (i2 == 1) {
                        size = searchAllResults.getLeagues().size() + searchAllResults.getTeams().size() + searchAllResults.getMatches().size() + searchAllResults.getUsers().size() + (!searchAllResults.getLeagues().isEmpty() ? 1 : 0) + (!searchAllResults.getTeams().isEmpty() ? 1 : 0) + (!searchAllResults.getMatches().isEmpty() ? 1 : 0) + (1 ^ (searchAllResults.getUsers().isEmpty() ? 1 : 0));
                    } else if (i2 == 2) {
                        size = list.size();
                    } else if (i2 == 3) {
                        size = list2.size();
                    } else if (i2 == 4) {
                        size = list3.size();
                    } else {
                        if (i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        size = list4.size();
                    }
                    if (num != null && num.intValue() >= size - 3 && z && !z2) {
                        function0.invoke();
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer invokeSuspend$lambda$0(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return Integer.valueOf(lazyListItemInfo.getIndex());
        }
        return null;
    }
}
