package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserRankingStatisticsModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/entity/user/NewUserRankingStatisticsModel;", "", "day", "", "Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;", "week", "month", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDay", "()Ljava/util/List;", "getWeek", "getMonth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserRankingStatisticsModel {
    public static final int $stable = 8;

    @SerializedName("day")
    private final List<NewUserRankingItemModel> day;

    @SerializedName("month")
    private final List<NewUserRankingItemModel> month;

    @SerializedName("week")
    private final List<NewUserRankingItemModel> week;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewUserRankingStatisticsModel copy$default(NewUserRankingStatisticsModel newUserRankingStatisticsModel, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newUserRankingStatisticsModel.day;
        }
        if ((i & 2) != 0) {
            list2 = newUserRankingStatisticsModel.week;
        }
        if ((i & 4) != 0) {
            list3 = newUserRankingStatisticsModel.month;
        }
        return newUserRankingStatisticsModel.copy(list, list2, list3);
    }

    public final List<NewUserRankingItemModel> component1() {
        return this.day;
    }

    public final List<NewUserRankingItemModel> component2() {
        return this.week;
    }

    public final List<NewUserRankingItemModel> component3() {
        return this.month;
    }

    public final NewUserRankingStatisticsModel copy(List<NewUserRankingItemModel> day, List<NewUserRankingItemModel> week, List<NewUserRankingItemModel> month) {
        return new NewUserRankingStatisticsModel(day, week, month);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserRankingStatisticsModel)) {
            return false;
        }
        NewUserRankingStatisticsModel newUserRankingStatisticsModel = (NewUserRankingStatisticsModel) other;
        return Intrinsics.areEqual(this.day, newUserRankingStatisticsModel.day) && Intrinsics.areEqual(this.week, newUserRankingStatisticsModel.week) && Intrinsics.areEqual(this.month, newUserRankingStatisticsModel.month);
    }

    public int hashCode() {
        List<NewUserRankingItemModel> list = this.day;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NewUserRankingItemModel> list2 = this.week;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<NewUserRankingItemModel> list3 = this.month;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "NewUserRankingStatisticsModel(day=" + this.day + ", week=" + this.week + ", month=" + this.month + ")";
    }

    public NewUserRankingStatisticsModel(List<NewUserRankingItemModel> list, List<NewUserRankingItemModel> list2, List<NewUserRankingItemModel> list3) {
        this.day = list;
        this.week = list2;
        this.month = list3;
    }

    public final List<NewUserRankingItemModel> getDay() {
        return this.day;
    }

    public final List<NewUserRankingItemModel> getWeek() {
        return this.week;
    }

    public final List<NewUserRankingItemModel> getMonth() {
        return this.month;
    }
}
