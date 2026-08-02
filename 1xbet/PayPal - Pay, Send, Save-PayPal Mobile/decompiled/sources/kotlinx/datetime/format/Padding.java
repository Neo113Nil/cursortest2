package kotlinx.datetime.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlinx/datetime/format/Padding;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ZERO", "SPACE"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Padding {
    public static final kotlinx.datetime.format.Padding NONE;
    public static final kotlinx.datetime.format.Padding SPACE;
    public static final kotlinx.datetime.format.Padding ZERO;
    private static final /* synthetic */ kotlinx.datetime.format.Padding[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private Padding(java.lang.String str, int i) {
    }

    static {
        kotlinx.datetime.format.Padding padding = new kotlinx.datetime.format.Padding("NONE", 0);
        NONE = padding;
        kotlinx.datetime.format.Padding padding2 = new kotlinx.datetime.format.Padding("ZERO", 1);
        ZERO = padding2;
        kotlinx.datetime.format.Padding padding3 = new kotlinx.datetime.format.Padding("SPACE", 2);
        SPACE = padding3;
        kotlinx.datetime.format.Padding[] paddingArr = {padding, padding2, padding3};
        getHighSpeedVideoFpsRanges = paddingArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paddingArr);
    }

    public static kotlinx.datetime.format.Padding valueOf(java.lang.String str) {
        return (kotlinx.datetime.format.Padding) java.lang.Enum.valueOf(kotlinx.datetime.format.Padding.class, str);
    }

    public static kotlinx.datetime.format.Padding[] values() {
        return (kotlinx.datetime.format.Padding[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.enums.EnumEntries<kotlinx.datetime.format.Padding> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
