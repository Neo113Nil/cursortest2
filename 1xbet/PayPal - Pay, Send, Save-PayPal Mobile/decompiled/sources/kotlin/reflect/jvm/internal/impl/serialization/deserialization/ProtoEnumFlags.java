package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class ProtoEnumFlags {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags();

    private ProtoEnumFlags() {
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.Modality modality(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality modality) {
        int i = modality == null ? -1 : kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.WhenMappings.$EnumSwitchMapping$0[modality.ordinal()];
        if (i == 1) {
            return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        }
        if (i == 2) {
            return kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
        }
        if (i == 3) {
            return kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
        }
        if (i == 4) {
            return kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind kind) {
        switch (kind == null ? -1 : kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.WhenMappings.$EnumSwitchMapping$5[kind.ordinal()]) {
            case 1:
                return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS;
            case 2:
                return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE;
            case 3:
                return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS;
            case 4:
                return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY;
            case 5:
                return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS;
            case 6:
            case 7:
                return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT;
            default:
                return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS;
        }
    }

    public final kotlin.reflect.jvm.internal.impl.types.Variance variance(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance variance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variance, "");
        int i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.WhenMappings.$EnumSwitchMapping$7[variance.ordinal()];
        if (i == 1) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
    }

    public final kotlin.reflect.jvm.internal.impl.types.Variance variance(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection projection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(projection, "");
        int i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.WhenMappings.$EnumSwitchMapping$8[projection.ordinal()];
        if (i == 1) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        throw new java.lang.IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: ".concat(java.lang.String.valueOf(projection)));
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.FINAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.OPEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.ABSTRACT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.SEALED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.descriptors.Modality.values().length];
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.values().length];
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.INTERNAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.PRIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.PROTECTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.PUBLIC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.LOCAL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus.values().length];
            try {
                iArr4[kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus.MustUse.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr4[kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus.ExplicitlyIgnorable.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr4[kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus.Unspecified.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus.values().length];
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus.MUST_USE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus.EXPLICITLY_IGNORABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ReturnValueStatus.UNSPECIFIED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.values().length];
            try {
                iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.CLASS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.INTERFACE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_ENTRY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.OBJECT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.values().length];
            try {
                iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.values().length];
            try {
                iArr8[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr8[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr8[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.INV.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.values().length];
            try {
                iArr9[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr9[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr9[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.INV.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr9[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.STAR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            try {
                iArr10[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                iArr10[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                iArr10[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$9 = iArr10;
        }
    }
}
