package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengesResponseModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJD\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengesResponseModel;", "", "items", "", "Lorg/betup/model/remote/entity/challenges/NewUserBattleModel;", "offset", "", MatchMyBetsInteractor.PARAM_LIMIT, "totalItems", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getItems", "()Ljava/util/List;", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLimit", "getTotalItems", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lorg/betup/model/remote/entity/challenges/NewChallengesResponseModel;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengesResponseModel {
    public static final int $stable = 8;

    @SerializedName("items")
    private final List<NewUserBattleModel> items;

    @SerializedName(MatchMyBetsInteractor.PARAM_LIMIT)
    private final Integer limit;

    @SerializedName("offset")
    private final Integer offset;

    @SerializedName("totalItems")
    private final Integer totalItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewChallengesResponseModel copy$default(NewChallengesResponseModel newChallengesResponseModel, List list, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newChallengesResponseModel.items;
        }
        if ((i & 2) != 0) {
            num = newChallengesResponseModel.offset;
        }
        if ((i & 4) != 0) {
            num2 = newChallengesResponseModel.limit;
        }
        if ((i & 8) != 0) {
            num3 = newChallengesResponseModel.totalItems;
        }
        return newChallengesResponseModel.copy(list, num, num2, num3);
    }

    public final List<NewUserBattleModel> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTotalItems() {
        return this.totalItems;
    }

    public final NewChallengesResponseModel copy(List<NewUserBattleModel> items, Integer offset, Integer limit, Integer totalItems) {
        return new NewChallengesResponseModel(items, offset, limit, totalItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengesResponseModel)) {
            return false;
        }
        NewChallengesResponseModel newChallengesResponseModel = (NewChallengesResponseModel) other;
        return Intrinsics.areEqual(this.items, newChallengesResponseModel.items) && Intrinsics.areEqual(this.offset, newChallengesResponseModel.offset) && Intrinsics.areEqual(this.limit, newChallengesResponseModel.limit) && Intrinsics.areEqual(this.totalItems, newChallengesResponseModel.totalItems);
    }

    public int hashCode() {
        List<NewUserBattleModel> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.offset;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.limit;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalItems;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengesResponseModel(items=" + this.items + ", offset=" + this.offset + ", limit=" + this.limit + ", totalItems=" + this.totalItems + ")";
    }

    public NewChallengesResponseModel(List<NewUserBattleModel> list, Integer num, Integer num2, Integer num3) {
        this.items = list;
        this.offset = num;
        this.limit = num2;
        this.totalItems = num3;
    }

    public final List<NewUserBattleModel> getItems() {
        return this.items;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getTotalItems() {
        return this.totalItems;
    }
}
