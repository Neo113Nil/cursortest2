package org.betup.model.remote.entity.matches.statistics;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchStatisticsItemModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/entity/matches/statistics/NewMatchStatisticsItemModel;", "", "name", "", "homeStat", "Lorg/betup/model/remote/entity/matches/statistics/NewMatchStatisticsValueModel;", "awayStat", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/model/remote/entity/matches/statistics/NewMatchStatisticsValueModel;Lorg/betup/model/remote/entity/matches/statistics/NewMatchStatisticsValueModel;)V", "getName", "()Ljava/lang/String;", "getHomeStat", "()Lorg/betup/model/remote/entity/matches/statistics/NewMatchStatisticsValueModel;", "getAwayStat", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewMatchStatisticsItemModel {
    public static final int $stable = 0;

    @SerializedName("awayStat")
    private final NewMatchStatisticsValueModel awayStat;

    @SerializedName("homeStat")
    private final NewMatchStatisticsValueModel homeStat;

    @SerializedName("name")
    private final String name;

    public static /* synthetic */ NewMatchStatisticsItemModel copy$default(NewMatchStatisticsItemModel newMatchStatisticsItemModel, String str, NewMatchStatisticsValueModel newMatchStatisticsValueModel, NewMatchStatisticsValueModel newMatchStatisticsValueModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newMatchStatisticsItemModel.name;
        }
        if ((i & 2) != 0) {
            newMatchStatisticsValueModel = newMatchStatisticsItemModel.homeStat;
        }
        if ((i & 4) != 0) {
            newMatchStatisticsValueModel2 = newMatchStatisticsItemModel.awayStat;
        }
        return newMatchStatisticsItemModel.copy(str, newMatchStatisticsValueModel, newMatchStatisticsValueModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final NewMatchStatisticsValueModel getHomeStat() {
        return this.homeStat;
    }

    /* renamed from: component3, reason: from getter */
    public final NewMatchStatisticsValueModel getAwayStat() {
        return this.awayStat;
    }

    public final NewMatchStatisticsItemModel copy(String name, NewMatchStatisticsValueModel homeStat, NewMatchStatisticsValueModel awayStat) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(homeStat, "homeStat");
        Intrinsics.checkNotNullParameter(awayStat, "awayStat");
        return new NewMatchStatisticsItemModel(name, homeStat, awayStat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMatchStatisticsItemModel)) {
            return false;
        }
        NewMatchStatisticsItemModel newMatchStatisticsItemModel = (NewMatchStatisticsItemModel) other;
        return Intrinsics.areEqual(this.name, newMatchStatisticsItemModel.name) && Intrinsics.areEqual(this.homeStat, newMatchStatisticsItemModel.homeStat) && Intrinsics.areEqual(this.awayStat, newMatchStatisticsItemModel.awayStat);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.homeStat.hashCode()) * 31) + this.awayStat.hashCode();
    }

    public String toString() {
        return "NewMatchStatisticsItemModel(name=" + this.name + ", homeStat=" + this.homeStat + ", awayStat=" + this.awayStat + ")";
    }

    public NewMatchStatisticsItemModel(String name, NewMatchStatisticsValueModel homeStat, NewMatchStatisticsValueModel awayStat) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(homeStat, "homeStat");
        Intrinsics.checkNotNullParameter(awayStat, "awayStat");
        this.name = name;
        this.homeStat = homeStat;
        this.awayStat = awayStat;
    }

    public final String getName() {
        return this.name;
    }

    public final NewMatchStatisticsValueModel getHomeStat() {
        return this.homeStat;
    }

    public final NewMatchStatisticsValueModel getAwayStat() {
        return this.awayStat;
    }
}
