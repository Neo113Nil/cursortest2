package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class UnsignedType {
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType UBYTE;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType UINT;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType ULONG;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType USHORT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.name.Name Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoSizes;

    private UnsignedType(java.lang.String str, int i, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        this.getHighSpeedVideoSizes = classId;
        kotlin.reflect.jvm.internal.impl.name.Name shortClassName = classId.getShortClassName();
        this.Camera2StreamConfigurationMap = shortClassName;
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(shortClassName.asString());
        sb.append("Array");
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(sb.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName, identifier);
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        return this.getHighSpeedVideoSizes;
    }

    static {
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType("UBYTE", 0, kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.fromString$default(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion, "kotlin/UByte", false, 2, null));
        UBYTE = unsignedType;
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType2 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType("USHORT", 1, kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.fromString$default(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion, "kotlin/UShort", false, 2, null));
        USHORT = unsignedType2;
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType3 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType("UINT", 2, kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.fromString$default(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion, "kotlin/UInt", false, 2, null));
        UINT = unsignedType3;
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType4 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType("ULONG", 3, kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.fromString$default(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion, "kotlin/ULong", false, 2, null));
        ULONG = unsignedType4;
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] unsignedTypeArr = {unsignedType, unsignedType2, unsignedType3, unsignedType4};
        getHighSpeedVideoFpsRangesFor = unsignedTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(unsignedTypeArr);
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getTypeName() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getArrayClassId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] values() {
        return (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.UnsignedType valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.class, str);
    }
}
