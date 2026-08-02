package org.betup.model.remote.entity.matches.statistics;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchStatisticsValueModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/entity/matches/statistics/NewMatchStatisticsValueModel;", "", "unit", "Lorg/betup/model/remote/entity/matches/statistics/StatisticsUnit;", "value", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/matches/statistics/StatisticsUnit;F)V", "getUnit", "()Lorg/betup/model/remote/entity/matches/statistics/StatisticsUnit;", "getValue", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewMatchStatisticsValueModel {
    public static final int $stable = 0;

    @SerializedName("unit")
    private final StatisticsUnit unit;

    @SerializedName("value")
    private final float value;

    public static /* synthetic */ NewMatchStatisticsValueModel copy$default(NewMatchStatisticsValueModel newMatchStatisticsValueModel, StatisticsUnit statisticsUnit, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            statisticsUnit = newMatchStatisticsValueModel.unit;
        }
        if ((i & 2) != 0) {
            f = newMatchStatisticsValueModel.value;
        }
        return newMatchStatisticsValueModel.copy(statisticsUnit, f);
    }

    /* renamed from: component1, reason: from getter */
    public final StatisticsUnit getUnit() {
        return this.unit;
    }

    /* renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final NewMatchStatisticsValueModel copy(StatisticsUnit unit, float value) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new NewMatchStatisticsValueModel(unit, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMatchStatisticsValueModel)) {
            return false;
        }
        NewMatchStatisticsValueModel newMatchStatisticsValueModel = (NewMatchStatisticsValueModel) other;
        return this.unit == newMatchStatisticsValueModel.unit && Float.compare(this.value, newMatchStatisticsValueModel.value) == 0;
    }

    public int hashCode() {
        return (this.unit.hashCode() * 31) + Float.hashCode(this.value);
    }

    public String toString() {
        return "NewMatchStatisticsValueModel(unit=" + this.unit + ", value=" + this.value + ")";
    }

    public NewMatchStatisticsValueModel(StatisticsUnit unit, float f) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.value = f;
    }

    public final StatisticsUnit getUnit() {
        return this.unit;
    }

    public /* synthetic */ NewMatchStatisticsValueModel(StatisticsUnit statisticsUnit, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? StatisticsUnit.NONE : statisticsUnit, f);
    }

    public final float getValue() {
        return this.value;
    }
}
