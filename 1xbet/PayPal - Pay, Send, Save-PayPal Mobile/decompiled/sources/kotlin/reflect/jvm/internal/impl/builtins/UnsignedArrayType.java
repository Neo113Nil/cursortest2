package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class UnsignedArrayType {
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType UBYTEARRAY;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType UINTARRAY;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType ULONGARRAY;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType USHORTARRAY;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRanges;

    private UnsignedArrayType(java.lang.String str, int i, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        this.Camera2StreamConfigurationMap = classId;
        this.getHighSpeedVideoFpsRanges = classId.getShortClassName();
    }

    static {
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType unsignedArrayType = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType("UBYTEARRAY", 0, kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.fromString$default(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion, "kotlin/UByteArray", false, 2, null));
        UBYTEARRAY = unsignedArrayType;
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType unsignedArrayType2 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType("USHORTARRAY", 1, kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.fromString$default(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion, "kotlin/UShortArray", false, 2, null));
        USHORTARRAY = unsignedArrayType2;
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType unsignedArrayType3 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType("UINTARRAY", 2, kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.fromString$default(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion, "kotlin/UIntArray", false, 2, null));
        UINTARRAY = unsignedArrayType3;
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType unsignedArrayType4 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType("ULONGARRAY", 3, kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.fromString$default(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion, "kotlin/ULongArray", false, 2, null));
        ULONGARRAY = unsignedArrayType4;
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] unsignedArrayTypeArr = {unsignedArrayType, unsignedArrayType2, unsignedArrayType3, unsignedArrayType4};
        getHighResolutionOutputSizeshNQ4ISI = unsignedArrayTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(unsignedArrayTypeArr);
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getTypeName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] values() {
        return (kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.class, str);
    }
}
