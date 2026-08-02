package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* loaded from: classes5.dex */
public class Flags {
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind> CLASS_KIND;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField DECLARES_DEFAULT_VALUE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField DEFINITELY_NOT_NULL_TYPE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField HAS_ANNOTATIONS;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField HAS_CONSTANT;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField HAS_ENUM_ENTRIES;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField HAS_GETTER;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField HAS_SETTER;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_CONST;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_CROSSINLINE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_DATA;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_DELEGATED;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXPECT_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXPECT_FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXPECT_PROPERTY;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXTERNAL_ACCESSOR;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXTERNAL_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXTERNAL_FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXTERNAL_PROPERTY;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_FUN_INTERFACE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_INFIX;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_INLINE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_INLINE_ACCESSOR;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_INNER;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_LATEINIT;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_NEGATED;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_NOINLINE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_NOT_DEFAULT;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_NULL_CHECK_PREDICATE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_OPERATOR;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_SECONDARY;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_SUSPEND;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_TAILREC;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_UNSIGNED;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_VALUE_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_VAR;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind> MEMBER_KIND;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality> MODALITY;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus> RETURN_VALUE_STATUS_CTOR;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus> RETURN_VALUE_STATUS_FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus> RETURN_VALUE_STATUS_PROPERTY;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField SUSPEND_TYPE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility> VISIBILITY;

    static {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFirst = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();
        SUSPEND_TYPE = booleanFirst;
        DEFINITELY_NOT_NULL_TYPE = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFirst);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFirst2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();
        HAS_ANNOTATIONS = booleanFirst2;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility> after = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(booleanFirst2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.values());
        VISIBILITY = after;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality> after2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(after, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.values());
        MODALITY = after2;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind> after3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(after2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.values());
        CLASS_KIND = after3;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(after3);
        IS_INNER = booleanAfter;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter);
        IS_DATA = booleanAfter2;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter2);
        IS_EXTERNAL_CLASS = booleanAfter3;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter3);
        IS_EXPECT_CLASS = booleanAfter4;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter4);
        IS_VALUE_CLASS = booleanAfter5;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter5);
        IS_FUN_INTERFACE = booleanAfter6;
        HAS_ENUM_ENTRIES = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter6);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(after);
        IS_SECONDARY = booleanAfter7;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter7);
        IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES = booleanAfter8;
        RETURN_VALUE_STATUS_CTOR = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(booleanAfter8, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus.values());
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind> after4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(after2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.values());
        MEMBER_KIND = after4;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(after4);
        IS_OPERATOR = booleanAfter9;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter9);
        IS_INFIX = booleanAfter10;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter10);
        IS_INLINE = booleanAfter11;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter11);
        IS_TAILREC = booleanAfter12;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter13 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter12);
        IS_EXTERNAL_FUNCTION = booleanAfter13;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter14 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter13);
        IS_SUSPEND = booleanAfter14;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter15 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter14);
        IS_EXPECT_FUNCTION = booleanAfter15;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter16 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter15);
        IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES = booleanAfter16;
        RETURN_VALUE_STATUS_FUNCTION = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(booleanAfter16, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus.values());
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter17 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(after4);
        IS_VAR = booleanAfter17;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter18 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter17);
        HAS_GETTER = booleanAfter18;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter19 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter18);
        HAS_SETTER = booleanAfter19;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter20 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter19);
        IS_CONST = booleanAfter20;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter21 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter20);
        IS_LATEINIT = booleanAfter21;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter22 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter21);
        HAS_CONSTANT = booleanAfter22;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter23 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter22);
        IS_EXTERNAL_PROPERTY = booleanAfter23;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter24 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter23);
        IS_DELEGATED = booleanAfter24;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter25 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter24);
        IS_EXPECT_PROPERTY = booleanAfter25;
        RETURN_VALUE_STATUS_PROPERTY = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(booleanAfter25, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus.values());
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter26 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFirst2);
        DECLARES_DEFAULT_VALUE = booleanAfter26;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter27 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter26);
        IS_CROSSINLINE = booleanAfter27;
        IS_NOINLINE = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter27);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter28 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(after2);
        IS_NOT_DEFAULT = booleanAfter28;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter29 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter28);
        IS_EXTERNAL_ACCESSOR = booleanAfter29;
        IS_INLINE_ACCESSOR = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanAfter29);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFirst3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();
        IS_NEGATED = booleanFirst3;
        IS_NULL_CHECK_PREDICATE = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFirst3);
        IS_UNSIGNED = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();
    }

    public static int getAccessorFlags(boolean z, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility visibility, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality modality, boolean z2, boolean z3, boolean z4) {
        if (visibility == null) {
            Camera2StreamConfigurationMap(10);
        }
        if (modality == null) {
            Camera2StreamConfigurationMap(11);
        }
        int flags = HAS_ANNOTATIONS.toFlags(java.lang.Boolean.valueOf(z));
        int flags2 = MODALITY.toFlags(modality);
        int flags3 = VISIBILITY.toFlags(visibility);
        int flags4 = IS_NOT_DEFAULT.toFlags(java.lang.Boolean.valueOf(z2));
        return flags | flags2 | flags3 | flags4 | IS_EXTERNAL_ACCESSOR.toFlags(java.lang.Boolean.valueOf(z3)) | IS_INLINE_ACCESSOR.toFlags(java.lang.Boolean.valueOf(z4));
    }

    public static abstract class FlagField<E> {
        public final int bitWidth;
        public final int offset;

        public abstract E get(int i);

        public abstract int toFlags(E e);

        /* synthetic */ FlagField(int i, int i2, byte b) {
            this(i, i2);
        }

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/Internal$EnumLite;>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<*>;[TE;)Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<TE;>; */
        public static kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField after(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField flagField, kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite[] enumLiteArr) {
            return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.EnumLiteFlagField(flagField.offset + flagField.bitWidth, enumLiteArr);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFirst() {
            return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField(0);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<?> flagField) {
            return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField(flagField.offset + flagField.bitWidth);
        }

        private FlagField(int i, int i2) {
            this.offset = i;
            this.bitWidth = i2;
        }
    }

    public static class BooleanFlagField extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<java.lang.Boolean> {
        public BooleanFlagField(int i) {
            super(i, 1, (byte) 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public java.lang.Boolean get(int i) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf((i & (1 << this.offset)) != 0);
            if (valueOf != null) {
                return valueOf;
            }
            throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public int toFlags(java.lang.Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.offset;
            }
            return 0;
        }
    }

    static class EnumLiteFlagField<E extends kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite> extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<E> {
        private final E[] getHighSpeedVideoSizes;

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public /* synthetic */ int toFlags(java.lang.Object obj) {
            return ((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) obj).getNumber() << this.offset;
        }

        public EnumLiteFlagField(int i, E[] eArr) {
            super(i, getHighSpeedVideoFpsRanges(eArr), (byte) 0);
            this.getHighSpeedVideoSizes = eArr;
        }

        private static <E> int getHighSpeedVideoFpsRanges(E[] eArr) {
            if (eArr != null) {
                int length = eArr.length - 1;
                if (length == 0) {
                    return 1;
                }
                for (int i = 31; i >= 0; i--) {
                    if (((1 << i) & length) != 0) {
                        return i + 1;
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Empty enum: ");
                sb.append(eArr.getClass());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public /* synthetic */ java.lang.Object get(int i) {
            int i2 = this.bitWidth;
            int i3 = this.offset;
            int i4 = this.offset;
            for (E e : this.getHighSpeedVideoSizes) {
                if (e.getNumber() == (((((1 << i2) - 1) << i3) & i) >> i4)) {
                    return e;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 1) {
            if (i == 2) {
                objArr[0] = "kind";
            } else if (i != 5) {
                if (i != 6) {
                    if (i != 8) {
                        if (i != 9) {
                            if (i != 11) {
                                objArr[0] = "visibility";
                            }
                        }
                    }
                }
                objArr[0] = "memberKind";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
            switch (i) {
                case 3:
                    objArr[2] = "getConstructorFlags";
                    break;
                case 4:
                case 5:
                case 6:
                    objArr[2] = "getFunctionFlags";
                    break;
                case 7:
                case 8:
                case 9:
                    objArr[2] = "getPropertyFlags";
                    break;
                case 10:
                case 11:
                    objArr[2] = "getAccessorFlags";
                    break;
                default:
                    objArr[2] = "getClassFlags";
                    break;
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        objArr[0] = "modality";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i) {
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
