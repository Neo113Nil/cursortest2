package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes5.dex */
public final class AnnotationUtilKt {
    private static final kotlin.reflect.jvm.internal.impl.name.Name Camera2StreamConfigurationMap;
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighResolutionOutputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRanges;
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRangesFor;
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoSizes;

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor createDeprecatedAnnotation$default(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3, z);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor createDeprecatedAnnotation(final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor(kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.replaceWith, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(getHighSpeedVideoFpsRangesFor, new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue(str2)), kotlin.TuplesKt.to(getHighResolutionOutputSizeshNQ4ISI, new kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue(kotlin.collections.CollectionsKt.emptyList(), new kotlin.jvm.functions.Function1(kotlinBuiltIns) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) obj);
            }

            {
                this.Camera2StreamConfigurationMap = kotlinBuiltIns;
            }
        }))), false, 8, null);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.deprecated;
        kotlin.Pair pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes, new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue(str));
        kotlin.Pair pair2 = kotlin.TuplesKt.to(Camera2StreamConfigurationMap, new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue(builtInAnnotationDescriptor));
        kotlin.reflect.jvm.internal.impl.name.Name name2 = getHighSpeedVideoFpsRanges;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.deprecationLevel);
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, kotlin.collections.MapsKt.mapOf(pair, pair2, kotlin.TuplesKt.to(name2, new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(classId, identifier))), z);
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier("message");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        getHighSpeedVideoSizes = identifier;
        kotlin.reflect.jvm.internal.impl.name.Name identifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("replaceWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier2, "");
        Camera2StreamConfigurationMap = identifier2;
        kotlin.reflect.jvm.internal.impl.name.Name identifier3 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("level");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier3, "");
        getHighSpeedVideoFpsRanges = identifier3;
        kotlin.reflect.jvm.internal.impl.name.Name identifier4 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("expression");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier4, "");
        getHighSpeedVideoFpsRangesFor = identifier4;
        kotlin.reflect.jvm.internal.impl.name.Name identifier5 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("imports");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier5, "");
        getHighResolutionOutputSizeshNQ4ISI = identifier5;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType = moduleDescriptor.getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, kotlinBuiltIns.getStringType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrayType, "");
        return arrayType;
    }
}
