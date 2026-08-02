package org.betup.model.remote.entity.matches.statistics;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewMatchStatisticsValueModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lorg/betup/model/remote/entity/matches/statistics/StatisticsUnit;", "", "value", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "INT", "FLOAT", "PERCENTAGE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StatisticsUnit {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StatisticsUnit[] $VALUES;
    private final int value;

    @SerializedName("NONE")
    public static final StatisticsUnit NONE = new StatisticsUnit("NONE", 0, 0);

    @SerializedName("INT")
    public static final StatisticsUnit INT = new StatisticsUnit("INT", 1, 1);

    @SerializedName("FLOAT")
    public static final StatisticsUnit FLOAT = new StatisticsUnit("FLOAT", 2, 2);

    @SerializedName("PERCENTAGE")
    public static final StatisticsUnit PERCENTAGE = new StatisticsUnit("PERCENTAGE", 3, 3);

    private static final /* synthetic */ StatisticsUnit[] $values() {
        return new StatisticsUnit[]{NONE, INT, FLOAT, PERCENTAGE};
    }

    public static EnumEntries<StatisticsUnit> getEntries() {
        return $ENTRIES;
    }

    private StatisticsUnit(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        StatisticsUnit[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static StatisticsUnit valueOf(String str) {
        return (StatisticsUnit) Enum.valueOf(StatisticsUnit.class, str);
    }

    public static StatisticsUnit[] values() {
        return (StatisticsUnit[]) $VALUES.clone();
    }
}
