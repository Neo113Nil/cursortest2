package kotlin.io;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_DOWN", "BOTTOM_UP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FileWalkDirection {
    public static final kotlin.io.FileWalkDirection BOTTOM_UP;
    public static final kotlin.io.FileWalkDirection TOP_DOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.io.FileWalkDirection[] getHighSpeedVideoFpsRangesFor;

    private FileWalkDirection(java.lang.String str, int i) {
    }

    static {
        kotlin.io.FileWalkDirection fileWalkDirection = new kotlin.io.FileWalkDirection("TOP_DOWN", 0);
        TOP_DOWN = fileWalkDirection;
        kotlin.io.FileWalkDirection fileWalkDirection2 = new kotlin.io.FileWalkDirection("BOTTOM_UP", 1);
        BOTTOM_UP = fileWalkDirection2;
        kotlin.io.FileWalkDirection[] fileWalkDirectionArr = {fileWalkDirection, fileWalkDirection2};
        getHighSpeedVideoFpsRangesFor = fileWalkDirectionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(fileWalkDirectionArr);
    }

    public static kotlin.io.FileWalkDirection[] values() {
        return (kotlin.io.FileWalkDirection[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.io.FileWalkDirection valueOf(java.lang.String str) {
        return (kotlin.io.FileWalkDirection) java.lang.Enum.valueOf(kotlin.io.FileWalkDirection.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.io.FileWalkDirection> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
