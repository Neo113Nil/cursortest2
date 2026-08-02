package org.betup.domain.quest;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DailyQuestModels.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/betup/domain/quest/DailyQuestStatus;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "PENDING", "COMPLETED", "EXPIRED", "CANCELLED", "UNKNOWN", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DailyQuestStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DailyQuestStatus[] $VALUES;
    public static final DailyQuestStatus PENDING = new DailyQuestStatus("PENDING", 0);
    public static final DailyQuestStatus COMPLETED = new DailyQuestStatus("COMPLETED", 1);
    public static final DailyQuestStatus EXPIRED = new DailyQuestStatus("EXPIRED", 2);
    public static final DailyQuestStatus CANCELLED = new DailyQuestStatus("CANCELLED", 3);
    public static final DailyQuestStatus UNKNOWN = new DailyQuestStatus("UNKNOWN", 4);

    private static final /* synthetic */ DailyQuestStatus[] $values() {
        return new DailyQuestStatus[]{PENDING, COMPLETED, EXPIRED, CANCELLED, UNKNOWN};
    }

    public static EnumEntries<DailyQuestStatus> getEntries() {
        return $ENTRIES;
    }

    private DailyQuestStatus(String str, int i) {
    }

    static {
        DailyQuestStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DailyQuestStatus valueOf(String str) {
        return (DailyQuestStatus) Enum.valueOf(DailyQuestStatus.class, str);
    }

    public static DailyQuestStatus[] values() {
        return (DailyQuestStatus[]) $VALUES.clone();
    }
}
