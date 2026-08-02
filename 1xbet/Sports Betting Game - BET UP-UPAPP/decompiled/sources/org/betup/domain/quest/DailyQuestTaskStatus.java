package org.betup.domain.quest;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DailyQuestModels.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/betup/domain/quest/DailyQuestTaskStatus;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "ASSIGNED", "IN_PROGRESS", "COMPLETED", "EXPIRED", "CANCELLED", "UNKNOWN", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DailyQuestTaskStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DailyQuestTaskStatus[] $VALUES;
    public static final DailyQuestTaskStatus ASSIGNED = new DailyQuestTaskStatus("ASSIGNED", 0);
    public static final DailyQuestTaskStatus IN_PROGRESS = new DailyQuestTaskStatus("IN_PROGRESS", 1);
    public static final DailyQuestTaskStatus COMPLETED = new DailyQuestTaskStatus("COMPLETED", 2);
    public static final DailyQuestTaskStatus EXPIRED = new DailyQuestTaskStatus("EXPIRED", 3);
    public static final DailyQuestTaskStatus CANCELLED = new DailyQuestTaskStatus("CANCELLED", 4);
    public static final DailyQuestTaskStatus UNKNOWN = new DailyQuestTaskStatus("UNKNOWN", 5);

    private static final /* synthetic */ DailyQuestTaskStatus[] $values() {
        return new DailyQuestTaskStatus[]{ASSIGNED, IN_PROGRESS, COMPLETED, EXPIRED, CANCELLED, UNKNOWN};
    }

    public static EnumEntries<DailyQuestTaskStatus> getEntries() {
        return $ENTRIES;
    }

    private DailyQuestTaskStatus(String str, int i) {
    }

    static {
        DailyQuestTaskStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DailyQuestTaskStatus valueOf(String str) {
        return (DailyQuestTaskStatus) Enum.valueOf(DailyQuestTaskStatus.class, str);
    }

    public static DailyQuestTaskStatus[] values() {
        return (DailyQuestTaskStatus[]) $VALUES.clone();
    }
}
