package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class TypeMappingMode {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode CLASS_DECLARATION;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode DEFAULT;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode DEFAULT_UAST;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode GENERIC_ARGUMENT;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode GENERIC_ARGUMENT_FOR_SUPER_TYPES_AS_IS;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode GENERIC_ARGUMENT_UAST;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode INVOKE_DYNAMIC_BOOTSTRAP_ARGUMENT;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode RETURN_TYPE_BOXED;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode SUPER_TYPE;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode SUPER_TYPE_AS_IS;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode VALUE_FOR_ANNOTATION;
    private final boolean Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode getHighSpeedVideoSizes;
    private final boolean getHighSpeedVideoSizesFor;
    private final boolean getInputFormats;
    private final boolean getInputSizeshNQ4ISI;
    private final boolean getOutputFormats;
    private final boolean getOutputMinFrameDuration;
    private final boolean getOutputStallDuration;

    public TypeMappingMode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode, boolean z6, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode2, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode3, boolean z7, boolean z8) {
        this.getInputSizeshNQ4ISI = z;
        this.getInputFormats = z2;
        this.getHighSpeedVideoFpsRangesFor = z3;
        this.getHighSpeedVideoSizesFor = z4;
        this.getOutputStallDuration = z5;
        this.getHighSpeedVideoSizes = typeMappingMode;
        this.getOutputFormats = z6;
        this.getHighResolutionOutputSizeshNQ4ISI = typeMappingMode2;
        this.getHighSpeedVideoFpsRanges = typeMappingMode3;
        this.getOutputMinFrameDuration = z7;
        this.Camera2StreamConfigurationMap = z8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TypeMappingMode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode, boolean z6, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode2, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode3, boolean z7, boolean z8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r6, r7, r8, (i & 64) == 0 ? z6 : true, (i & 128) != 0 ? r8 : typeMappingMode2, (i & 256) != 0 ? r8 : typeMappingMode3, (i & 512) != 0 ? false : z7, (i & 1024) == 0 ? z8 : false);
        boolean z9 = (i & 1) != 0 ? true : z;
        boolean z10 = (i & 2) != 0 ? true : z2;
        boolean z11 = (i & 4) != 0 ? false : z3;
        boolean z12 = (i & 8) != 0 ? false : z4;
        boolean z13 = (i & 16) != 0 ? false : z5;
        kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode4 = (i & 32) != 0 ? null : typeMappingMode;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.getInputSizeshNQ4ISI;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.getInputFormats;
    }

    public final boolean isForAnnotationParameter() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.getOutputFormats;
    }

    public final boolean getMapTypeAliases() {
        return this.getOutputMinFrameDuration;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode = null;
        boolean z6 = false;
        kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode2 = null;
        kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode3 = null;
        boolean z7 = false;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode4 = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(z, z2, z3, z4, z5, typeMappingMode, z6, typeMappingMode2, typeMappingMode3, false, z7, 2047, defaultConstructorMarker);
        GENERIC_ARGUMENT = typeMappingMode4;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode5 = null;
        kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode6 = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(false, z8, false, z9, z10, null, false, null, typeMappingMode5, false, true, 1023, null);
        GENERIC_ARGUMENT_FOR_SUPER_TYPES_AS_IS = typeMappingMode6;
        kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode7 = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(z, z2, z3, z4, z5, typeMappingMode, z6, typeMappingMode2, typeMappingMode3, true, z7, 1535, defaultConstructorMarker);
        GENERIC_ARGUMENT_UAST = typeMappingMode7;
        RETURN_TYPE_BOXED = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(z8, true, z9, z10, false, null, false, typeMappingMode5, null, false, false, 2045, null);
        DEFAULT = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(z, z2, z3, z4, z5, typeMappingMode4, z6, typeMappingMode2, typeMappingMode3, false, z7, 2012, defaultConstructorMarker);
        DEFAULT_UAST = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(z, z2, z3, z4, z5, typeMappingMode7, z6, typeMappingMode2, typeMappingMode3, true, z7, 1500, defaultConstructorMarker);
        boolean z11 = false;
        CLASS_DECLARATION = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(z, true, z3, z4, z5, typeMappingMode4, z6, typeMappingMode2, typeMappingMode3, z11, z7, 2012, defaultConstructorMarker);
        boolean z12 = false;
        SUPER_TYPE = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(z, z12, z3, true, z5, typeMappingMode4, z6, typeMappingMode2, typeMappingMode3, z11, z7, androidx.media3.common.PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, defaultConstructorMarker);
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = true;
        boolean z16 = false;
        kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode8 = null;
        boolean z17 = false;
        boolean z18 = true;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
        SUPER_TYPE_AS_IS = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(z13, z8, z14, z15, z10, typeMappingMode6, z16, typeMappingMode8, typeMappingMode5, z17, z18, 983, defaultConstructorMarker2);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(z13, z8, z14, z15, z10, typeMappingMode6, z16, typeMappingMode8, typeMappingMode5, z17, z18, 919, defaultConstructorMarker2);
        VALUE_FOR_ANNOTATION = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(z, z12, true, false, z5, typeMappingMode4, z6, typeMappingMode2, typeMappingMode3, z11, z7, androidx.media3.common.PlaybackException.ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE, defaultConstructorMarker);
        INVOKE_DYNAMIC_BOOTSTRAP_ARGUMENT = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(true, true, z14, false, z10, null, true, typeMappingMode8, typeMappingMode5, z17, false, 1980, defaultConstructorMarker2);
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode toGenericArgumentMode(kotlin.reflect.jvm.internal.impl.types.Variance variance, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variance, "");
        if (!z || !this.getHighSpeedVideoFpsRangesFor) {
            int i = kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
            if (i == 1) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode = this.getHighResolutionOutputSizeshNQ4ISI;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i == 2) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode2 = this.getHighSpeedVideoFpsRanges;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode3 = this.getHighSpeedVideoSizes;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode wrapInlineClassesMode() {
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode(this.getInputSizeshNQ4ISI, true, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getOutputStallDuration, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap);
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, false, 2047, null);
    }
}
