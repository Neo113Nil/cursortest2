package org.betup.model.remote.entity.energy;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EnergyRewardModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lorg/betup/model/remote/entity/energy/RewardType;", "", "type", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "getType", "()I", "DEFAULT_DAILY_BONUS", "SHOP_BONUS", "LOST_BET", "ENERGY_DAILY_BONUS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RewardType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardType[] $VALUES;
    private final int type;
    public static final RewardType DEFAULT_DAILY_BONUS = new RewardType("DEFAULT_DAILY_BONUS", 0, 1);
    public static final RewardType SHOP_BONUS = new RewardType("SHOP_BONUS", 1, 2);
    public static final RewardType LOST_BET = new RewardType("LOST_BET", 2, 3);
    public static final RewardType ENERGY_DAILY_BONUS = new RewardType("ENERGY_DAILY_BONUS", 3, 4);

    private static final /* synthetic */ RewardType[] $values() {
        return new RewardType[]{DEFAULT_DAILY_BONUS, SHOP_BONUS, LOST_BET, ENERGY_DAILY_BONUS};
    }

    public static EnumEntries<RewardType> getEntries() {
        return $ENTRIES;
    }

    private RewardType(String str, int i, int i2) {
        this.type = i2;
    }

    public final int getType() {
        return this.type;
    }

    static {
        RewardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static RewardType valueOf(String str) {
        return (RewardType) Enum.valueOf(RewardType.class, str);
    }

    public static RewardType[] values() {
        return (RewardType[]) $VALUES.clone();
    }
}
