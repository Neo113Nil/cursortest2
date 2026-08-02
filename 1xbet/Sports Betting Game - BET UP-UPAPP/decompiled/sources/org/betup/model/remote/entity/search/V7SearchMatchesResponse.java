package org.betup.model.remote.entity.search;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7SearchResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lorg/betup/model/remote/entity/search/V7SearchMatchesResponse;", "", "items", "", "Lorg/betup/model/remote/entity/search/V7MatchSearchResult;", "offset", "", MatchMyBetsInteractor.PARAM_LIMIT, "totalItems", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;IIJ)V", "getItems", "()Ljava/util/List;", "getOffset", "()I", "getLimit", "getTotalItems", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7SearchMatchesResponse {
    public static final int $stable = 8;

    @SerializedName("items")
    private final List<V7MatchSearchResult> items;

    @SerializedName(MatchMyBetsInteractor.PARAM_LIMIT)
    private final int limit;

    @SerializedName("offset")
    private final int offset;

    @SerializedName("totalItems")
    private final long totalItems;

    public V7SearchMatchesResponse() {
        this(null, 0, 0, 0L, 15, null);
    }

    public static /* synthetic */ V7SearchMatchesResponse copy$default(V7SearchMatchesResponse v7SearchMatchesResponse, List list, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = v7SearchMatchesResponse.items;
        }
        if ((i3 & 2) != 0) {
            i = v7SearchMatchesResponse.offset;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = v7SearchMatchesResponse.limit;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            j = v7SearchMatchesResponse.totalItems;
        }
        return v7SearchMatchesResponse.copy(list, i4, i5, j);
    }

    public final List<V7MatchSearchResult> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTotalItems() {
        return this.totalItems;
    }

    public final V7SearchMatchesResponse copy(List<V7MatchSearchResult> items, int offset, int limit, long totalItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new V7SearchMatchesResponse(items, offset, limit, totalItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7SearchMatchesResponse)) {
            return false;
        }
        V7SearchMatchesResponse v7SearchMatchesResponse = (V7SearchMatchesResponse) other;
        return Intrinsics.areEqual(this.items, v7SearchMatchesResponse.items) && this.offset == v7SearchMatchesResponse.offset && this.limit == v7SearchMatchesResponse.limit && this.totalItems == v7SearchMatchesResponse.totalItems;
    }

    public int hashCode() {
        return (((((this.items.hashCode() * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.limit)) * 31) + Long.hashCode(this.totalItems);
    }

    public String toString() {
        return "V7SearchMatchesResponse(items=" + this.items + ", offset=" + this.offset + ", limit=" + this.limit + ", totalItems=" + this.totalItems + ")";
    }

    public V7SearchMatchesResponse(List<V7MatchSearchResult> items, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.offset = i;
        this.limit = i2;
        this.totalItems = j;
    }

    public final List<V7MatchSearchResult> getItems() {
        return this.items;
    }

    public /* synthetic */ V7SearchMatchesResponse(List list, int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt.emptyList() : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? 0L : j);
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final long getTotalItems() {
        return this.totalItems;
    }
}
