package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/paging/DiffingChangePayload;", "", "<init>", "(Ljava/lang/String;I)V", "ITEM_TO_PLACEHOLDER", "PLACEHOLDER_TO_ITEM", "PLACEHOLDER_POSITION_CHANGE"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiffingChangePayload {
    private static final /* synthetic */ androidx.paging.DiffingChangePayload[] Camera2StreamConfigurationMap;
    public static final androidx.paging.DiffingChangePayload ITEM_TO_PLACEHOLDER;
    public static final androidx.paging.DiffingChangePayload PLACEHOLDER_POSITION_CHANGE;
    public static final androidx.paging.DiffingChangePayload PLACEHOLDER_TO_ITEM;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private DiffingChangePayload(java.lang.String str, int i) {
    }

    static {
        androidx.paging.DiffingChangePayload diffingChangePayload = new androidx.paging.DiffingChangePayload("ITEM_TO_PLACEHOLDER", 0);
        ITEM_TO_PLACEHOLDER = diffingChangePayload;
        androidx.paging.DiffingChangePayload diffingChangePayload2 = new androidx.paging.DiffingChangePayload("PLACEHOLDER_TO_ITEM", 1);
        PLACEHOLDER_TO_ITEM = diffingChangePayload2;
        androidx.paging.DiffingChangePayload diffingChangePayload3 = new androidx.paging.DiffingChangePayload("PLACEHOLDER_POSITION_CHANGE", 2);
        PLACEHOLDER_POSITION_CHANGE = diffingChangePayload3;
        androidx.paging.DiffingChangePayload[] diffingChangePayloadArr = {diffingChangePayload, diffingChangePayload2, diffingChangePayload3};
        Camera2StreamConfigurationMap = diffingChangePayloadArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(diffingChangePayloadArr);
    }

    public static androidx.paging.DiffingChangePayload[] values() {
        return (androidx.paging.DiffingChangePayload[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.paging.DiffingChangePayload valueOf(java.lang.String str) {
        return (androidx.paging.DiffingChangePayload) java.lang.Enum.valueOf(androidx.paging.DiffingChangePayload.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.paging.DiffingChangePayload> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
