package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class PrimitiveType {
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType BOOLEAN;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType BYTE;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType CHAR;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.Companion Companion;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType DOUBLE;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType FLOAT;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType INT;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType LONG;
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> NUMBER_TYPES;
    public static final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType SHORT;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRanges;
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoSizesFor;

    private PrimitiveType(java.lang.String str, int i, java.lang.String str2) {
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        this.getHighSpeedVideoSizesFor = identifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append("Array");
        kotlin.reflect.jvm.internal.impl.name.Name identifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(sb.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier2, "");
        this.getHighSpeedVideoFpsRanges = identifier2;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.name.FqName child;
                child = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor);
                return child;
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.name.FqName child;
                child = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges);
                return child;
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    static {
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType("BOOLEAN", 0, "Boolean");
        BOOLEAN = primitiveType;
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType2 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType("CHAR", 1, "Char");
        CHAR = primitiveType2;
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType3 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType("BYTE", 2, "Byte");
        BYTE = primitiveType3;
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType4 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType("SHORT", 3, "Short");
        SHORT = primitiveType4;
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType5 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType("INT", 4, "Int");
        INT = primitiveType5;
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType6 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType("FLOAT", 5, "Float");
        FLOAT = primitiveType6;
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType7 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType("LONG", 6, "Long");
        LONG = primitiveType7;
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType8 = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType("DOUBLE", 7, "Double");
        DOUBLE = primitiveType8;
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] primitiveTypeArr = {primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7, primitiveType8};
        getHighResolutionOutputSizeshNQ4ISI = primitiveTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(primitiveTypeArr);
        Companion = new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.Companion(null);
        NUMBER_TYPES = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[]{primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7, primitiveType8});
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getTypeName() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getArrayTypeName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName getTypeFqName() {
        return (kotlin.reflect.jvm.internal.impl.name.FqName) this.Camera2StreamConfigurationMap.getValue();
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName getArrayTypeFqName() {
        return (kotlin.reflect.jvm.internal.impl.name.FqName) this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] values() {
        return (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.class, str);
    }
}
