package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/paging/TerminalSeparatorType;", "", "<init>", "(Ljava/lang/String;I)V", "FULLY_COMPLETE", "SOURCE_COMPLETE"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TerminalSeparatorType {
    public static final androidx.paging.TerminalSeparatorType FULLY_COMPLETE;
    public static final androidx.paging.TerminalSeparatorType SOURCE_COMPLETE;
    private static final /* synthetic */ androidx.paging.TerminalSeparatorType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private TerminalSeparatorType(java.lang.String str, int i) {
    }

    static {
        androidx.paging.TerminalSeparatorType terminalSeparatorType = new androidx.paging.TerminalSeparatorType("FULLY_COMPLETE", 0);
        FULLY_COMPLETE = terminalSeparatorType;
        androidx.paging.TerminalSeparatorType terminalSeparatorType2 = new androidx.paging.TerminalSeparatorType("SOURCE_COMPLETE", 1);
        SOURCE_COMPLETE = terminalSeparatorType2;
        androidx.paging.TerminalSeparatorType[] terminalSeparatorTypeArr = {terminalSeparatorType, terminalSeparatorType2};
        getHighSpeedVideoFpsRangesFor = terminalSeparatorTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(terminalSeparatorTypeArr);
    }

    public static androidx.paging.TerminalSeparatorType[] values() {
        return (androidx.paging.TerminalSeparatorType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static androidx.paging.TerminalSeparatorType valueOf(java.lang.String str) {
        return (androidx.paging.TerminalSeparatorType) java.lang.Enum.valueOf(androidx.paging.TerminalSeparatorType.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.paging.TerminalSeparatorType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
