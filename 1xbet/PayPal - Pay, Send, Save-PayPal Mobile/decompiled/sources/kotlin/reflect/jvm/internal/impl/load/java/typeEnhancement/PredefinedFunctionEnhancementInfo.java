package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public final class PredefinedFunctionEnhancementInfo {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo getHighSpeedVideoFpsRanges;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus getHighSpeedVideoSizes;

    public PredefinedFunctionEnhancementInfo(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo, java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> list, java.lang.String str, kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus returnValueStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighResolutionOutputSizeshNQ4ISI = typeEnhancementInfo;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = returnValueStatus;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = null;
        if (str != null) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo copyForWarnings = typeEnhancementInfo != null ? typeEnhancementInfo.copyForWarnings() : null;
            java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo2 : list2) {
                arrayList.add(typeEnhancementInfo2 != null ? typeEnhancementInfo2.copyForWarnings() : null);
            }
            predefinedFunctionEnhancementInfo = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo(copyForWarnings, arrayList, null, null, 8, null);
        }
        this.getHighSpeedVideoFpsRanges = predefinedFunctionEnhancementInfo;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo getReturnTypeInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo, java.util.List list, java.lang.String str, kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus returnValueStatus, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeEnhancementInfo, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : returnValueStatus);
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> getParametersInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String getErrorsSinceLanguageVersion() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo getWarningModeClone() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, null, null, 15, null);
    }
}
