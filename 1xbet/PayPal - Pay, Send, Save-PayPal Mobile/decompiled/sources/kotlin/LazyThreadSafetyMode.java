package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "<init>", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyThreadSafetyMode {
    public static final kotlin.LazyThreadSafetyMode NONE;
    public static final kotlin.LazyThreadSafetyMode PUBLICATION;
    public static final kotlin.LazyThreadSafetyMode SYNCHRONIZED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.LazyThreadSafetyMode[] getHighSpeedVideoSizes;

    private LazyThreadSafetyMode(java.lang.String str, int i) {
    }

    static {
        kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = new kotlin.LazyThreadSafetyMode("SYNCHRONIZED", 0);
        SYNCHRONIZED = lazyThreadSafetyMode;
        kotlin.LazyThreadSafetyMode lazyThreadSafetyMode2 = new kotlin.LazyThreadSafetyMode("PUBLICATION", 1);
        PUBLICATION = lazyThreadSafetyMode2;
        kotlin.LazyThreadSafetyMode lazyThreadSafetyMode3 = new kotlin.LazyThreadSafetyMode("NONE", 2);
        NONE = lazyThreadSafetyMode3;
        kotlin.LazyThreadSafetyMode[] lazyThreadSafetyModeArr = {lazyThreadSafetyMode, lazyThreadSafetyMode2, lazyThreadSafetyMode3};
        getHighSpeedVideoSizes = lazyThreadSafetyModeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(lazyThreadSafetyModeArr);
    }

    public static kotlin.LazyThreadSafetyMode[] values() {
        return (kotlin.LazyThreadSafetyMode[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.LazyThreadSafetyMode valueOf(java.lang.String str) {
        return (kotlin.LazyThreadSafetyMode) java.lang.Enum.valueOf(kotlin.LazyThreadSafetyMode.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.LazyThreadSafetyMode> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
