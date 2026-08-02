package kotlinx.serialization.json;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlinx/serialization/json/ClassDiscriminatorMode;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ALL_JSON_OBJECTS", "POLYMORPHIC"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClassDiscriminatorMode {
    public static final kotlinx.serialization.json.ClassDiscriminatorMode ALL_JSON_OBJECTS;
    private static final /* synthetic */ kotlinx.serialization.json.ClassDiscriminatorMode[] Camera2StreamConfigurationMap;
    public static final kotlinx.serialization.json.ClassDiscriminatorMode NONE;
    public static final kotlinx.serialization.json.ClassDiscriminatorMode POLYMORPHIC;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ClassDiscriminatorMode(java.lang.String str, int i) {
    }

    static {
        kotlinx.serialization.json.ClassDiscriminatorMode classDiscriminatorMode = new kotlinx.serialization.json.ClassDiscriminatorMode("NONE", 0);
        NONE = classDiscriminatorMode;
        kotlinx.serialization.json.ClassDiscriminatorMode classDiscriminatorMode2 = new kotlinx.serialization.json.ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
        ALL_JSON_OBJECTS = classDiscriminatorMode2;
        kotlinx.serialization.json.ClassDiscriminatorMode classDiscriminatorMode3 = new kotlinx.serialization.json.ClassDiscriminatorMode("POLYMORPHIC", 2);
        POLYMORPHIC = classDiscriminatorMode3;
        kotlinx.serialization.json.ClassDiscriminatorMode[] classDiscriminatorModeArr = {classDiscriminatorMode, classDiscriminatorMode2, classDiscriminatorMode3};
        Camera2StreamConfigurationMap = classDiscriminatorModeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(classDiscriminatorModeArr);
    }

    public static kotlinx.serialization.json.ClassDiscriminatorMode[] values() {
        return (kotlinx.serialization.json.ClassDiscriminatorMode[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlinx.serialization.json.ClassDiscriminatorMode valueOf(java.lang.String str) {
        return (kotlinx.serialization.json.ClassDiscriminatorMode) java.lang.Enum.valueOf(kotlinx.serialization.json.ClassDiscriminatorMode.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlinx.serialization.json.ClassDiscriminatorMode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
