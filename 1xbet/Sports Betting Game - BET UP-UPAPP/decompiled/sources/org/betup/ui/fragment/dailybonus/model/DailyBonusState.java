package org.betup.ui.fragment.dailybonus.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DailyBonusModels.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/fragment/dailybonus/model/DailyBonusState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "AVAILABLE", "LOCKED", "TAKEN", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DailyBonusState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DailyBonusState[] $VALUES;
    public static final DailyBonusState AVAILABLE = new DailyBonusState("AVAILABLE", 0);
    public static final DailyBonusState LOCKED = new DailyBonusState("LOCKED", 1);
    public static final DailyBonusState TAKEN = new DailyBonusState("TAKEN", 2);

    private static final /* synthetic */ DailyBonusState[] $values() {
        return new DailyBonusState[]{AVAILABLE, LOCKED, TAKEN};
    }

    public static EnumEntries<DailyBonusState> getEntries() {
        return $ENTRIES;
    }

    private DailyBonusState(String str, int i) {
    }

    static {
        DailyBonusState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DailyBonusState valueOf(String str) {
        return (DailyBonusState) Enum.valueOf(DailyBonusState.class, str);
    }

    public static DailyBonusState[] values() {
        return (DailyBonusState[]) $VALUES.clone();
    }
}
