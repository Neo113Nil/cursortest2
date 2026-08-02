package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0004\"1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"1\u0010\u0010\u001a\u001f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"+\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"+\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "windowInsetsStartWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/ui/Modifier;", "windowInsetsEndWidth", "windowInsetsTopHeight", "windowInsetsBottomHeight", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ExtensionFunctionType;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function3;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlin/Function2;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowInsetsSizeKt {
    private static final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, java.lang.Integer> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            int highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.layout.WindowInsetsSizeKt.getHighSpeedVideoFpsRanges((androidx.compose.foundation.layout.WindowInsets) obj, (androidx.compose.ui.unit.LayoutDirection) obj2, (androidx.compose.ui.unit.Density) obj3);
            return java.lang.Integer.valueOf(highSpeedVideoFpsRanges);
        }
    };
    private static final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, java.lang.Integer> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            int Camera2StreamConfigurationMap2;
            Camera2StreamConfigurationMap2 = androidx.compose.foundation.layout.WindowInsetsSizeKt.Camera2StreamConfigurationMap((androidx.compose.foundation.layout.WindowInsets) obj, (androidx.compose.ui.unit.LayoutDirection) obj2, (androidx.compose.ui.unit.Density) obj3);
            return java.lang.Integer.valueOf(Camera2StreamConfigurationMap2);
        }
    };
    private static final kotlin.jvm.functions.Function2<androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.unit.Density, java.lang.Integer> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            int Camera2StreamConfigurationMap2;
            Camera2StreamConfigurationMap2 = androidx.compose.foundation.layout.WindowInsetsSizeKt.Camera2StreamConfigurationMap((androidx.compose.foundation.layout.WindowInsets) obj, (androidx.compose.ui.unit.Density) obj2);
            return java.lang.Integer.valueOf(Camera2StreamConfigurationMap2);
        }
    };
    private static final kotlin.jvm.functions.Function2<androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.unit.Density, java.lang.Integer> Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            int highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.WindowInsetsSizeKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.foundation.layout.WindowInsets) obj, (androidx.compose.ui.unit.Density) obj2);
            return java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            return windowInsets.getLeft(density, layoutDirection);
        }
        return windowInsets.getRight(density, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Rtl) {
            return windowInsets.getLeft(density, layoutDirection);
        }
        return windowInsets.getRight(density, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.ui.unit.Density density) {
        return windowInsets.getTop(density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.ui.unit.Density density) {
        return windowInsets.getBottom(density);
    }

    public static final androidx.compose.ui.Modifier windowInsetsStartWidth(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.WindowInsets windowInsets) {
        return modifier.then(new androidx.compose.foundation.layout.DerivedWidthModifierElement(windowInsets, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsStartWidth");
                inspectorInfo.getProperties().set("insets", androidx.compose.foundation.layout.WindowInsets.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), getHighSpeedVideoSizes));
    }

    public static final androidx.compose.ui.Modifier windowInsetsEndWidth(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.WindowInsets windowInsets) {
        return modifier.then(new androidx.compose.foundation.layout.DerivedWidthModifierElement(windowInsets, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsEndWidth");
                inspectorInfo.getProperties().set("insets", androidx.compose.foundation.layout.WindowInsets.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), getHighSpeedVideoFpsRangesFor));
    }

    public static final androidx.compose.ui.Modifier windowInsetsTopHeight(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.WindowInsets windowInsets) {
        return modifier.then(new androidx.compose.foundation.layout.DerivedHeightModifierElement(windowInsets, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsTopHeight");
                inspectorInfo.getProperties().set("insets", androidx.compose.foundation.layout.WindowInsets.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), getHighSpeedVideoFpsRanges));
    }

    public static final androidx.compose.ui.Modifier windowInsetsBottomHeight(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.WindowInsets windowInsets) {
        return modifier.then(new androidx.compose.foundation.layout.DerivedHeightModifierElement(windowInsets, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsBottomHeight");
                inspectorInfo.getProperties().set("insets", androidx.compose.foundation.layout.WindowInsets.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), Camera2StreamConfigurationMap));
    }
}
