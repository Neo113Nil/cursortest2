package kotlinx.serialization.json;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JsonConfiguration.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/ClassDiscriminatorMode;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ALL_JSON_OBJECTS", "POLYMORPHIC", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClassDiscriminatorMode {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlinx.serialization.json.ClassDiscriminatorMode[] $VALUES;
    public static final kotlinx.serialization.json.ClassDiscriminatorMode NONE = new kotlinx.serialization.json.ClassDiscriminatorMode("NONE", 0);
    public static final kotlinx.serialization.json.ClassDiscriminatorMode ALL_JSON_OBJECTS = new kotlinx.serialization.json.ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
    public static final kotlinx.serialization.json.ClassDiscriminatorMode POLYMORPHIC = new kotlinx.serialization.json.ClassDiscriminatorMode("POLYMORPHIC", 2);

    private static final /* synthetic */ kotlinx.serialization.json.ClassDiscriminatorMode[] $values() {
        return new kotlinx.serialization.json.ClassDiscriminatorMode[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    public static kotlin.enums.EnumEntries<kotlinx.serialization.json.ClassDiscriminatorMode> getEntries() {
        return $ENTRIES;
    }

    private ClassDiscriminatorMode(java.lang.String str, int i) {
    }

    static {
        kotlinx.serialization.json.ClassDiscriminatorMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlinx.serialization.json.ClassDiscriminatorMode valueOf(java.lang.String str) {
        return (kotlinx.serialization.json.ClassDiscriminatorMode) java.lang.Enum.valueOf(kotlinx.serialization.json.ClassDiscriminatorMode.class, str);
    }

    public static kotlinx.serialization.json.ClassDiscriminatorMode[] values() {
        return (kotlinx.serialization.json.ClassDiscriminatorMode[]) $VALUES.clone();
    }
}
