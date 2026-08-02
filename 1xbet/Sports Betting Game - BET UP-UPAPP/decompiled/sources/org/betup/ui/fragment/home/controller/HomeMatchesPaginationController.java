package org.betup.ui.fragment.home.controller;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.betup.model.remote.entity.matches.championship.specific.NewListedMatchModel;
import org.betup.model.remote.entity.matches.topmatches.HotMatchesResponseModel;
import org.betup.ui.fragment.home.controller.HomeMatchesPaginationController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeMatchesPaginationController.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0019R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006 "}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeMatchesPaginationController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "value", "Lorg/betup/ui/fragment/home/controller/HomeMatchesPaginationController$PageState;", "livePage", "getLivePage", "()Lorg/betup/ui/fragment/home/controller/HomeMatchesPaginationController$PageState;", "morePage", "getMorePage", "resetForRefresh", "", "finishInitialLoad", "isLive", "", "applyPageResponse", "model", "Lorg/betup/model/remote/entity/matches/topmatches/HotMatchesResponseModel;", "requestOffset", "", "beginLoadMore", "(Z)Ljava/lang/Integer;", "cancelLoadMore", "findListedMatch", "Lorg/betup/model/remote/entity/matches/championship/specific/NewListedMatchModel;", "matchId", "", "replaceListedMatch", "updated", "PageState", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchesPaginationController {
    public static final int PAGE_SIZE = 20;
    private PageState livePage = new PageState(null, 0, false, false, true, 15, null);
    private PageState morePage = new PageState(null, 0, false, false, true, 15, null);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HomeMatchesPaginationController.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012¨\u0006\u001e"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeMatchesPaginationController$PageState;", "", "items", "", "Lorg/betup/model/remote/entity/matches/championship/specific/NewListedMatchModel;", "nextOffset", "", "hasMore", "", "isLoadingMore", "isInitialLoading", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;IZZZ)V", "getItems", "()Ljava/util/List;", "getNextOffset", "()I", "getHasMore", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PageState {
        public static final int $stable = 8;
        private final boolean hasMore;
        private final boolean isInitialLoading;
        private final boolean isLoadingMore;
        private final List<NewListedMatchModel> items;
        private final int nextOffset;

        public PageState() {
            this(null, 0, false, false, false, 31, null);
        }

        public static /* synthetic */ PageState copy$default(PageState pageState, List list, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = pageState.items;
            }
            if ((i2 & 2) != 0) {
                i = pageState.nextOffset;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z = pageState.hasMore;
            }
            boolean z4 = z;
            if ((i2 & 8) != 0) {
                z2 = pageState.isLoadingMore;
            }
            boolean z5 = z2;
            if ((i2 & 16) != 0) {
                z3 = pageState.isInitialLoading;
            }
            return pageState.copy(list, i3, z4, z5, z3);
        }

        public final List<NewListedMatchModel> component1() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final int getNextOffset() {
            return this.nextOffset;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasMore() {
            return this.hasMore;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsLoadingMore() {
            return this.isLoadingMore;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsInitialLoading() {
            return this.isInitialLoading;
        }

        public final PageState copy(List<NewListedMatchModel> items, int nextOffset, boolean hasMore, boolean isLoadingMore, boolean isInitialLoading) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new PageState(items, nextOffset, hasMore, isLoadingMore, isInitialLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageState)) {
                return false;
            }
            PageState pageState = (PageState) other;
            return Intrinsics.areEqual(this.items, pageState.items) && this.nextOffset == pageState.nextOffset && this.hasMore == pageState.hasMore && this.isLoadingMore == pageState.isLoadingMore && this.isInitialLoading == pageState.isInitialLoading;
        }

        public int hashCode() {
            return (((((((this.items.hashCode() * 31) + Integer.hashCode(this.nextOffset)) * 31) + Boolean.hashCode(this.hasMore)) * 31) + Boolean.hashCode(this.isLoadingMore)) * 31) + Boolean.hashCode(this.isInitialLoading);
        }

        public String toString() {
            return "PageState(items=" + this.items + ", nextOffset=" + this.nextOffset + ", hasMore=" + this.hasMore + ", isLoadingMore=" + this.isLoadingMore + ", isInitialLoading=" + this.isInitialLoading + ")";
        }

        public PageState(List<NewListedMatchModel> items, int i, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.nextOffset = i;
            this.hasMore = z;
            this.isLoadingMore = z2;
            this.isInitialLoading = z3;
        }

        public /* synthetic */ PageState(List list, int i, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) == 0 ? z3 : false);
        }

        public final List<NewListedMatchModel> getItems() {
            return this.items;
        }

        public final int getNextOffset() {
            return this.nextOffset;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public final boolean isInitialLoading() {
            return this.isInitialLoading;
        }
    }

    public final PageState getLivePage() {
        return this.livePage;
    }

    public final PageState getMorePage() {
        return this.morePage;
    }

    public final void resetForRefresh() {
        this.livePage = new PageState(null, 0, false, false, true, 15, null);
        this.morePage = new PageState(null, 0, false, false, true, 15, null);
    }

    public final void finishInitialLoad(boolean isLive) {
        PageState pageState = isLive ? this.livePage : this.morePage;
        if (pageState.isInitialLoading()) {
            PageState copy$default = PageState.copy$default(pageState, null, 0, false, false, false, 15, null);
            if (isLive) {
                this.livePage = copy$default;
            } else {
                this.morePage = copy$default;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyPageResponse(boolean isLive, HotMatchesResponseModel model, int requestOffset) {
        int i;
        List<NewListedMatchModel> items = model != null ? model.getItems() : null;
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        if (model != null) {
            Integer valueOf = Integer.valueOf(model.getLimit());
            Integer num = valueOf.intValue() > 0 ? valueOf : null;
            if (num != null) {
                i = num.intValue();
                List<NewListedMatchModel> mergeListedMatches$app_release = INSTANCE.mergeListedMatches$app_release(requestOffset != 0 ? CollectionsKt.emptyList() : (!isLive ? this.livePage : this.morePage).getItems(), items);
                boolean z = items.size() < i && !items.isEmpty();
                if (model != null) {
                    requestOffset = model.getOffset();
                }
                PageState pageState = new PageState(mergeListedMatches$app_release, requestOffset + items.size(), z, false, false);
                if (!isLive) {
                    this.livePage = pageState;
                    return;
                } else {
                    this.morePage = pageState;
                    return;
                }
            }
        }
        i = 20;
        if (!isLive) {
        }
        List<NewListedMatchModel> mergeListedMatches$app_release2 = INSTANCE.mergeListedMatches$app_release(requestOffset != 0 ? CollectionsKt.emptyList() : (!isLive ? this.livePage : this.morePage).getItems(), items);
        boolean z2 = items.size() < i && !items.isEmpty();
        if (model != null) {
        }
        PageState pageState2 = new PageState(mergeListedMatches$app_release2, requestOffset + items.size(), z2, false, false);
        if (!isLive) {
        }
    }

    public final Integer beginLoadMore(boolean isLive) {
        PageState pageState = isLive ? this.livePage : this.morePage;
        if (pageState.isLoadingMore() || !pageState.getHasMore() || pageState.getItems().isEmpty()) {
            return null;
        }
        PageState copy$default = PageState.copy$default(pageState, null, 0, false, true, false, 23, null);
        if (isLive) {
            this.livePage = copy$default;
        } else {
            this.morePage = copy$default;
        }
        return Integer.valueOf(pageState.getNextOffset());
    }

    public final void cancelLoadMore(boolean isLive) {
        PageState pageState = isLive ? this.livePage : this.morePage;
        if (pageState.isLoadingMore()) {
            PageState copy$default = PageState.copy$default(pageState, null, 0, false, false, false, 23, null);
            if (isLive) {
                this.livePage = copy$default;
            } else {
                this.morePage = copy$default;
            }
        }
    }

    public final NewListedMatchModel findListedMatch(long matchId) {
        Object obj;
        Object obj2 = null;
        if (matchId <= 0) {
            return null;
        }
        Iterator<T> it = this.livePage.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((NewListedMatchModel) obj).getMatch().getId() == matchId) {
                break;
            }
        }
        NewListedMatchModel newListedMatchModel = (NewListedMatchModel) obj;
        if (newListedMatchModel != null) {
            return newListedMatchModel;
        }
        Iterator<T> it2 = this.morePage.getItems().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((NewListedMatchModel) next).getMatch().getId() == matchId) {
                obj2 = next;
                break;
            }
        }
        return (NewListedMatchModel) obj2;
    }

    public final boolean replaceListedMatch(long matchId, NewListedMatchModel updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        if (matchId <= 0) {
            return false;
        }
        List<NewListedMatchModel> items = this.livePage.getItems();
        if (!(items instanceof Collection) || !items.isEmpty()) {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                if (((NewListedMatchModel) it.next()).getMatch().getId() == matchId) {
                    PageState pageState = this.livePage;
                    List<NewListedMatchModel> items2 = pageState.getItems();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items2, 10));
                    for (NewListedMatchModel newListedMatchModel : items2) {
                        if (newListedMatchModel.getMatch().getId() == matchId) {
                            newListedMatchModel = updated;
                        }
                        arrayList.add(newListedMatchModel);
                    }
                    this.livePage = PageState.copy$default(pageState, arrayList, 0, false, false, false, 30, null);
                    return true;
                }
            }
        }
        List<NewListedMatchModel> items3 = this.morePage.getItems();
        if (!(items3 instanceof Collection) || !items3.isEmpty()) {
            Iterator<T> it2 = items3.iterator();
            while (it2.hasNext()) {
                if (((NewListedMatchModel) it2.next()).getMatch().getId() == matchId) {
                    PageState pageState2 = this.morePage;
                    List<NewListedMatchModel> items4 = pageState2.getItems();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(items4, 10));
                    for (NewListedMatchModel newListedMatchModel2 : items4) {
                        if (newListedMatchModel2.getMatch().getId() == matchId) {
                            newListedMatchModel2 = updated;
                        }
                        arrayList2.add(newListedMatchModel2);
                    }
                    this.morePage = PageState.copy$default(pageState2, arrayList2, 0, false, false, false, 30, null);
                    return true;
                }
            }
        }
        return false;
    }

    /* compiled from: HomeMatchesPaginationController.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeMatchesPaginationController$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "PAGE_SIZE", "", "mergeListedMatches", "", "Lorg/betup/model/remote/entity/matches/championship/specific/NewListedMatchModel;", "existing", "incoming", "mergeListedMatches$app_release", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<NewListedMatchModel> mergeListedMatches$app_release(List<NewListedMatchModel> existing, List<NewListedMatchModel> incoming) {
            Intrinsics.checkNotNullParameter(existing, "existing");
            Intrinsics.checkNotNullParameter(incoming, "incoming");
            if (incoming.isEmpty()) {
                return existing;
            }
            Set mutableSet = SequencesKt.toMutableSet(SequencesKt.map(CollectionsKt.asSequence(existing), new Function1() { // from class: org.betup.ui.fragment.home.controller.HomeMatchesPaginationController$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    long mergeListedMatches$lambda$0;
                    mergeListedMatches$lambda$0 = HomeMatchesPaginationController.Companion.mergeListedMatches$lambda$0((NewListedMatchModel) obj);
                    return Long.valueOf(mergeListedMatches$lambda$0);
                }
            }));
            ArrayList arrayList = new ArrayList();
            for (Object obj : incoming) {
                if (mutableSet.add(Long.valueOf(((NewListedMatchModel) obj).getMatch().getId()))) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            return existing.isEmpty() ? arrayList2 : CollectionsKt.plus((Collection) existing, (Iterable) arrayList2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long mergeListedMatches$lambda$0(NewListedMatchModel it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getMatch().getId();
        }
    }
}
