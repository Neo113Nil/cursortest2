package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Visibility {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.Visibility[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility INTERNAL;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility LOCAL;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility PRIVATE;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility PRIVATE_TO_THIS;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility PROTECTED;
    public static final kotlin.reflect.jvm.internal.impl.km.Visibility PUBLIC;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl getHighSpeedVideoSizes;

    private Visibility(java.lang.String str, int i, int i2) {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility> flagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(flagField, "");
        this.getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(flagField, i2);
    }

    static {
        kotlin.reflect.jvm.internal.impl.km.Visibility visibility = new kotlin.reflect.jvm.internal.impl.km.Visibility("INTERNAL", 0, 0);
        INTERNAL = visibility;
        kotlin.reflect.jvm.internal.impl.km.Visibility visibility2 = new kotlin.reflect.jvm.internal.impl.km.Visibility("PRIVATE", 1, 1);
        PRIVATE = visibility2;
        kotlin.reflect.jvm.internal.impl.km.Visibility visibility3 = new kotlin.reflect.jvm.internal.impl.km.Visibility("PROTECTED", 2, 2);
        PROTECTED = visibility3;
        kotlin.reflect.jvm.internal.impl.km.Visibility visibility4 = new kotlin.reflect.jvm.internal.impl.km.Visibility("PUBLIC", 3, 3);
        PUBLIC = visibility4;
        kotlin.reflect.jvm.internal.impl.km.Visibility visibility5 = new kotlin.reflect.jvm.internal.impl.km.Visibility("PRIVATE_TO_THIS", 4, 4);
        PRIVATE_TO_THIS = visibility5;
        kotlin.reflect.jvm.internal.impl.km.Visibility visibility6 = new kotlin.reflect.jvm.internal.impl.km.Visibility("LOCAL", 5, 5);
        LOCAL = visibility6;
        kotlin.reflect.jvm.internal.impl.km.Visibility[] visibilityArr = {visibility, visibility2, visibility3, visibility4, visibility5, visibility6};
        Camera2StreamConfigurationMap = visibilityArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(visibilityArr);
    }

    public final kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl getFlag$kotlin_metadata() {
        return this.getHighSpeedVideoSizes;
    }

    public static kotlin.reflect.jvm.internal.impl.km.Visibility[] values() {
        return (kotlin.reflect.jvm.internal.impl.km.Visibility[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.km.Visibility valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.km.Visibility) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.km.Visibility.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.Visibility> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
