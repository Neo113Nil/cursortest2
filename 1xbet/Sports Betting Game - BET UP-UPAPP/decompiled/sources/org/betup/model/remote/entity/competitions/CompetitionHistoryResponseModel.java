package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionHistoryResponseModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionHistoryResponseModel;", "", "items", "", "Lorg/betup/model/remote/entity/competitions/CompetitionHistoryItemModel;", "offset", "", MatchMyBetsInteractor.PARAM_LIMIT, "totalItems", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;III)V", "getItems", "()Ljava/util/List;", "getOffset", "()I", "getLimit", "getTotalItems", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionHistoryResponseModel {
    public static final int $stable = 8;

    @SerializedName("items")
    private final List<CompetitionHistoryItemModel> items;

    @SerializedName(MatchMyBetsInteractor.PARAM_LIMIT)
    private final int limit;

    @SerializedName("offset")
    private final int offset;

    @SerializedName("totalItems")
    private final int totalItems;

    public CompetitionHistoryResponseModel() {
        this(null, 0, 0, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompetitionHistoryResponseModel copy$default(CompetitionHistoryResponseModel competitionHistoryResponseModel, List list, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = competitionHistoryResponseModel.items;
        }
        if ((i4 & 2) != 0) {
            i = competitionHistoryResponseModel.offset;
        }
        if ((i4 & 4) != 0) {
            i2 = competitionHistoryResponseModel.limit;
        }
        if ((i4 & 8) != 0) {
            i3 = competitionHistoryResponseModel.totalItems;
        }
        return competitionHistoryResponseModel.copy(list, i, i2, i3);
    }

    public final List<CompetitionHistoryItemModel> component1() {
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
    public final int getTotalItems() {
        return this.totalItems;
    }

    public final CompetitionHistoryResponseModel copy(List<CompetitionHistoryItemModel> items, int offset, int limit, int totalItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CompetitionHistoryResponseModel(items, offset, limit, totalItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionHistoryResponseModel)) {
            return false;
        }
        CompetitionHistoryResponseModel competitionHistoryResponseModel = (CompetitionHistoryResponseModel) other;
        return Intrinsics.areEqual(this.items, competitionHistoryResponseModel.items) && this.offset == competitionHistoryResponseModel.offset && this.limit == competitionHistoryResponseModel.limit && this.totalItems == competitionHistoryResponseModel.totalItems;
    }

    public int hashCode() {
        return (((((this.items.hashCode() * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.limit)) * 31) + Integer.hashCode(this.totalItems);
    }

    public String toString() {
        return "CompetitionHistoryResponseModel(items=" + this.items + ", offset=" + this.offset + ", limit=" + this.limit + ", totalItems=" + this.totalItems + ")";
    }

    public CompetitionHistoryResponseModel(List<CompetitionHistoryItemModel> items, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.offset = i;
        this.limit = i2;
        this.totalItems = i3;
    }

    public final List<CompetitionHistoryItemModel> getItems() {
        return this.items;
    }

    public /* synthetic */ CompetitionHistoryResponseModel(List list, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? CollectionsKt.emptyList() : list, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 10 : i2, (i4 & 8) != 0 ? 0 : i3);
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getTotalItems() {
        return this.totalItems;
    }
}
