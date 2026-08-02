package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "PUBLIC", "PROTECTED", "INTERNAL", "PRIVATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KVisibility {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlin.reflect.KVisibility INTERNAL;
    public static final kotlin.reflect.KVisibility PRIVATE;
    public static final kotlin.reflect.KVisibility PROTECTED;
    public static final kotlin.reflect.KVisibility PUBLIC;
    private static final /* synthetic */ kotlin.reflect.KVisibility[] getHighResolutionOutputSizeshNQ4ISI;

    private KVisibility(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.KVisibility kVisibility = new kotlin.reflect.KVisibility("PUBLIC", 0);
        PUBLIC = kVisibility;
        kotlin.reflect.KVisibility kVisibility2 = new kotlin.reflect.KVisibility("PROTECTED", 1);
        PROTECTED = kVisibility2;
        kotlin.reflect.KVisibility kVisibility3 = new kotlin.reflect.KVisibility("INTERNAL", 2);
        INTERNAL = kVisibility3;
        kotlin.reflect.KVisibility kVisibility4 = new kotlin.reflect.KVisibility("PRIVATE", 3);
        PRIVATE = kVisibility4;
        kotlin.reflect.KVisibility[] kVisibilityArr = {kVisibility, kVisibility2, kVisibility3, kVisibility4};
        getHighResolutionOutputSizeshNQ4ISI = kVisibilityArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(kVisibilityArr);
    }

    public static kotlin.reflect.KVisibility[] values() {
        return (kotlin.reflect.KVisibility[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.reflect.KVisibility valueOf(java.lang.String str) {
        return (kotlin.reflect.KVisibility) java.lang.Enum.valueOf(kotlin.reflect.KVisibility.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.reflect.KVisibility> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
