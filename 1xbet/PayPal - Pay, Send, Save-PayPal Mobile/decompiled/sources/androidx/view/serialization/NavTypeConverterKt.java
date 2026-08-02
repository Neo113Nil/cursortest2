package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "Landroidx/navigation/NavType;", "getNavType", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Landroidx/navigation/NavType;", "Landroidx/navigation/serialization/InternalType;", "Camera2StreamConfigurationMap", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Landroidx/navigation/serialization/InternalType;", "Lkotlin/reflect/KType;", "kType", "", "matchKType", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/reflect/KType;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavTypeConverterKt {
    public static final androidx.view.NavType<?> getNavType(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        switch (androidx.navigation.serialization.NavTypeConverterKt.WhenMappings.$EnumSwitchMapping$0[Camera2StreamConfigurationMap(serialDescriptor).ordinal()]) {
            case 1:
                return androidx.view.serialization.InternalNavType.INSTANCE.getStringNonNullableType();
            case 2:
                return androidx.view.NavType.StringType;
            case 3:
                return androidx.view.NavType.IntType;
            case 4:
                return androidx.view.NavType.BoolType;
            case 5:
                return androidx.view.serialization.InternalNavType.INSTANCE.getDoubleType();
            case 6:
                return androidx.view.NavType.FloatType;
            case 7:
                return androidx.view.NavType.LongType;
            case 8:
                return androidx.view.serialization.NavTypeConverter_androidKt.parseEnum(serialDescriptor);
            case 9:
                return androidx.view.serialization.InternalNavType.INSTANCE.getIntNullableType();
            case 10:
                return androidx.view.serialization.InternalNavType.INSTANCE.getBoolNullableType();
            case 11:
                return androidx.view.serialization.InternalNavType.INSTANCE.getDoubleNullableType();
            case 12:
                return androidx.view.serialization.InternalNavType.INSTANCE.getFloatNullableType();
            case 13:
                return androidx.view.serialization.InternalNavType.INSTANCE.getLongNullableType();
            case 14:
                return androidx.view.NavType.IntArrayType;
            case 15:
                return androidx.view.NavType.BoolArrayType;
            case 16:
                return androidx.view.serialization.InternalNavType.INSTANCE.getDoubleArrayType();
            case 17:
                return androidx.view.NavType.FloatArrayType;
            case 18:
                return androidx.view.NavType.LongArrayType;
            case 19:
                int i = androidx.navigation.serialization.NavTypeConverterKt.WhenMappings.$EnumSwitchMapping$0[Camera2StreamConfigurationMap(serialDescriptor.getElementDescriptor(0)).ordinal()];
                if (i == 1) {
                    return androidx.view.NavType.StringArrayType;
                }
                if (i == 2) {
                    return androidx.view.serialization.InternalNavType.INSTANCE.getStringNullableArrayType();
                }
                return androidx.view.serialization.UNKNOWN.INSTANCE;
            case 20:
                switch (androidx.navigation.serialization.NavTypeConverterKt.WhenMappings.$EnumSwitchMapping$0[Camera2StreamConfigurationMap(serialDescriptor.getElementDescriptor(0)).ordinal()]) {
                    case 1:
                        return androidx.view.NavType.StringListType;
                    case 2:
                        return androidx.view.serialization.InternalNavType.INSTANCE.getStringNullableListType();
                    case 3:
                        return androidx.view.NavType.IntListType;
                    case 4:
                        return androidx.view.NavType.BoolListType;
                    case 5:
                        return androidx.view.serialization.InternalNavType.INSTANCE.getDoubleListType();
                    case 6:
                        return androidx.view.NavType.FloatListType;
                    case 7:
                        return androidx.view.NavType.LongListType;
                    case 8:
                        return androidx.view.serialization.NavTypeConverter_androidKt.parseEnumList(serialDescriptor);
                    default:
                        return androidx.view.serialization.UNKNOWN.INSTANCE;
                }
            case 21:
                return androidx.view.serialization.NavTypeConverter_androidKt.parseNullableEnum(serialDescriptor);
            default:
                return androidx.view.serialization.UNKNOWN.INSTANCE;
        }
    }

    private static final androidx.view.serialization.InternalType Camera2StreamConfigurationMap(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(serialDescriptor.getGetHighSpeedVideoSizes(), com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, "", false, 4, (java.lang.Object) null);
        return kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE) ? serialDescriptor.isNullable() ? androidx.view.serialization.InternalType.getHighSpeedVideoSizesFor : androidx.view.serialization.InternalType.getOutputFormats : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.Int") ? serialDescriptor.isNullable() ? androidx.view.serialization.InternalType.getOutputSizes : androidx.view.serialization.InternalType.getOutputStallDuration : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.Boolean") ? serialDescriptor.isNullable() ? androidx.view.serialization.InternalType.getHighSpeedVideoSizes : androidx.view.serialization.InternalType.getHighResolutionOutputSizeshNQ4ISI : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.Double") ? serialDescriptor.isNullable() ? androidx.view.serialization.InternalType.getInputFormats : androidx.view.serialization.InternalType.Camera2StreamConfigurationMap : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.Float") ? serialDescriptor.isNullable() ? androidx.view.serialization.InternalType.getOutputSizeshNQ4ISI : androidx.view.serialization.InternalType.getOutputMinFrameDuration : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.Long") ? serialDescriptor.isNullable() ? androidx.view.serialization.InternalType.unwrapAs : androidx.view.serialization.InternalType.getValidOutputFormatsForInputhNQ4ISI : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.String") ? serialDescriptor.isNullable() ? androidx.view.serialization.InternalType.coroutineCreation : androidx.view.serialization.InternalType.toString : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.IntArray") ? androidx.view.serialization.InternalType.getOutputMinFrameDurationlomOqCM : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.DoubleArray") ? androidx.view.serialization.InternalType.getInputSizeshNQ4ISI : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.BooleanArray") ? androidx.view.serialization.InternalType.getHighSpeedVideoFpsRanges : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.FloatArray") ? androidx.view.serialization.InternalType.getOutputStallDurationlomOqCM : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, "kotlin.LongArray") ? androidx.view.serialization.InternalType.isOutputSupportedForhNQ4ISI : kotlin.jvm.internal.Intrinsics.areEqual(replace$default, kotlinx.serialization.internal.CollectionDescriptorsKt.ARRAY_NAME) ? androidx.view.serialization.InternalType.getHighSpeedVideoFpsRangesFor : kotlin.text.StringsKt.startsWith$default(replace$default, kotlinx.serialization.internal.CollectionDescriptorsKt.ARRAY_LIST_NAME, false, 2, (java.lang.Object) null) ? androidx.view.serialization.InternalType.isOutputSupportedFor : androidx.view.serialization.InternalType.coroutineBoundary;
    }

    public static final boolean matchKType(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        if (serialDescriptor.isNullable() != kType.getIsMarkedNullable()) {
            return false;
        }
        kotlinx.serialization.KSerializer<java.lang.Object> serializerOrNull = kotlinx.serialization.SerializersKt.serializerOrNull(kType);
        if (serializerOrNull == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot find KSerializer for [");
            sb.append(serialDescriptor.getGetHighSpeedVideoSizes());
            sb.append("]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor, serializerOrNull.getDescriptor());
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.view.serialization.InternalType.values().length];
            try {
                iArr[androidx.view.serialization.InternalType.toString.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.coroutineCreation.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getOutputStallDuration.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.Camera2StreamConfigurationMap.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getOutputMinFrameDuration.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getValidOutputFormatsForInputhNQ4ISI.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getOutputFormats.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getOutputSizes.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getHighSpeedVideoSizes.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getInputFormats.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getOutputSizeshNQ4ISI.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.unwrapAs.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getOutputMinFrameDurationlomOqCM.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getHighSpeedVideoFpsRanges.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getInputSizeshNQ4ISI.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getOutputStallDurationlomOqCM.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.isOutputSupportedForhNQ4ISI.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getHighSpeedVideoFpsRangesFor.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.isOutputSupportedFor.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[androidx.view.serialization.InternalType.getHighSpeedVideoSizesFor.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
