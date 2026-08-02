package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserRanksModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"Lorg/betup/model/remote/entity/user/NewUserRanksModel;", "", "rankDay", "", "rankMonth", "winningRateDay", "", "winningRateMonth", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Integer;Ljava/lang/Integer;DD)V", "getRankDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRankMonth", "getWinningRateDay", "()D", "getWinningRateMonth", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;DD)Lorg/betup/model/remote/entity/user/NewUserRanksModel;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserRanksModel {
    public static final int $stable = 0;

    @SerializedName("rankDay")
    private final Integer rankDay;

    @SerializedName("rankMonth")
    private final Integer rankMonth;

    @SerializedName("winningRateDay")
    private final double winningRateDay;

    @SerializedName("winningRateMonth")
    private final double winningRateMonth;

    public static /* synthetic */ NewUserRanksModel copy$default(NewUserRanksModel newUserRanksModel, Integer num, Integer num2, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = newUserRanksModel.rankDay;
        }
        if ((i & 2) != 0) {
            num2 = newUserRanksModel.rankMonth;
        }
        Integer num3 = num2;
        if ((i & 4) != 0) {
            d = newUserRanksModel.winningRateDay;
        }
        double d3 = d;
        if ((i & 8) != 0) {
            d2 = newUserRanksModel.winningRateMonth;
        }
        return newUserRanksModel.copy(num, num3, d3, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getRankDay() {
        return this.rankDay;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getRankMonth() {
        return this.rankMonth;
    }

    /* renamed from: component3, reason: from getter */
    public final double getWinningRateDay() {
        return this.winningRateDay;
    }

    /* renamed from: component4, reason: from getter */
    public final double getWinningRateMonth() {
        return this.winningRateMonth;
    }

    public final NewUserRanksModel copy(Integer rankDay, Integer rankMonth, double winningRateDay, double winningRateMonth) {
        return new NewUserRanksModel(rankDay, rankMonth, winningRateDay, winningRateMonth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserRanksModel)) {
            return false;
        }
        NewUserRanksModel newUserRanksModel = (NewUserRanksModel) other;
        return Intrinsics.areEqual(this.rankDay, newUserRanksModel.rankDay) && Intrinsics.areEqual(this.rankMonth, newUserRanksModel.rankMonth) && Double.compare(this.winningRateDay, newUserRanksModel.winningRateDay) == 0 && Double.compare(this.winningRateMonth, newUserRanksModel.winningRateMonth) == 0;
    }

    public int hashCode() {
        Integer num = this.rankDay;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.rankMonth;
        return ((((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + Double.hashCode(this.winningRateDay)) * 31) + Double.hashCode(this.winningRateMonth);
    }

    public String toString() {
        return "NewUserRanksModel(rankDay=" + this.rankDay + ", rankMonth=" + this.rankMonth + ", winningRateDay=" + this.winningRateDay + ", winningRateMonth=" + this.winningRateMonth + ")";
    }

    public NewUserRanksModel(Integer num, Integer num2, double d, double d2) {
        this.rankDay = num;
        this.rankMonth = num2;
        this.winningRateDay = d;
        this.winningRateMonth = d2;
    }

    public final Integer getRankDay() {
        return this.rankDay;
    }

    public final Integer getRankMonth() {
        return this.rankMonth;
    }

    public final double getWinningRateDay() {
        return this.winningRateDay;
    }

    public final double getWinningRateMonth() {
        return this.winningRateMonth;
    }
}
