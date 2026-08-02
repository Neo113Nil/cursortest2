package org.betup.model.remote.entity.matches.topmatches;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.entity.matches.championship.specific.NewListedMatchModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HotMatchesResponseModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lorg/betup/model/remote/entity/matches/topmatches/HotMatchesResponseModel;", "", "items", "", "Lorg/betup/model/remote/entity/matches/championship/specific/NewListedMatchModel;", "offset", "", MatchMyBetsInteractor.PARAM_LIMIT, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;II)V", "getItems", "()Ljava/util/List;", "getOffset", "()I", "getLimit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HotMatchesResponseModel {
    public static final int $stable = 8;

    @SerializedName("items")
    private final List<NewListedMatchModel> items;

    @SerializedName(MatchMyBetsInteractor.PARAM_LIMIT)
    private final int limit;

    @SerializedName("offset")
    private final int offset;

    public HotMatchesResponseModel() {
        this(null, 0, 0, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotMatchesResponseModel copy$default(HotMatchesResponseModel hotMatchesResponseModel, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = hotMatchesResponseModel.items;
        }
        if ((i3 & 2) != 0) {
            i = hotMatchesResponseModel.offset;
        }
        if ((i3 & 4) != 0) {
            i2 = hotMatchesResponseModel.limit;
        }
        return hotMatchesResponseModel.copy(list, i, i2);
    }

    public final List<NewListedMatchModel> component1() {
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

    public final HotMatchesResponseModel copy(List<NewListedMatchModel> items, int offset, int limit) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new HotMatchesResponseModel(items, offset, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotMatchesResponseModel)) {
            return false;
        }
        HotMatchesResponseModel hotMatchesResponseModel = (HotMatchesResponseModel) other;
        return Intrinsics.areEqual(this.items, hotMatchesResponseModel.items) && this.offset == hotMatchesResponseModel.offset && this.limit == hotMatchesResponseModel.limit;
    }

    public int hashCode() {
        return (((this.items.hashCode() * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.limit);
    }

    public String toString() {
        return "HotMatchesResponseModel(items=" + this.items + ", offset=" + this.offset + ", limit=" + this.limit + ")";
    }

    public HotMatchesResponseModel(List<NewListedMatchModel> items, int i, int i2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.offset = i;
        this.limit = i2;
    }

    public final List<NewListedMatchModel> getItems() {
        return this.items;
    }

    public /* synthetic */ HotMatchesResponseModel(List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt.emptyList() : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getLimit() {
        return this.limit;
    }
}
