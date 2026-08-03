package androidx.compose.foundation.layout;

/* compiled from: WindowInsetsSize.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"windowInsetsBottomHeight", "Landroidx/compose/ui/Modifier;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsetsEndWidth", "windowInsetsStartWidth", "windowInsetsTopHeight", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsetsSizeKt {
    public static final androidx.compose.ui.Modifier windowInsetsStartWidth(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.WindowInsets windowInsets) {
        return modifier.then(new androidx.compose.foundation.layout.DerivedWidthModifier(windowInsets, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsStartWidth");
                inspectorInfo.getProperties().set("insets", androidx.compose.foundation.layout.WindowInsets.this);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Integer invoke(androidx.compose.foundation.layout.WindowInsets windowInsets2, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
                int right;
                if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                    right = windowInsets2.getLeft(density, layoutDirection);
                } else {
                    right = windowInsets2.getRight(density, layoutDirection);
                }
                return java.lang.Integer.valueOf(right);
            }
        }));
    }

    public static final androidx.compose.ui.Modifier windowInsetsEndWidth(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.WindowInsets windowInsets) {
        return modifier.then(new androidx.compose.foundation.layout.DerivedWidthModifier(windowInsets, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsEndWidth");
                inspectorInfo.getProperties().set("insets", androidx.compose.foundation.layout.WindowInsets.this);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Integer invoke(androidx.compose.foundation.layout.WindowInsets windowInsets2, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
                int right;
                if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Rtl) {
                    right = windowInsets2.getLeft(density, layoutDirection);
                } else {
                    right = windowInsets2.getRight(density, layoutDirection);
                }
                return java.lang.Integer.valueOf(right);
            }
        }));
    }

    public static final androidx.compose.ui.Modifier windowInsetsTopHeight(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.WindowInsets windowInsets) {
        return modifier.then(new androidx.compose.foundation.layout.DerivedHeightModifier(windowInsets, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsTopHeight");
                inspectorInfo.getProperties().set("insets", androidx.compose.foundation.layout.WindowInsets.this);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function2<androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.unit.Density, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Integer invoke(androidx.compose.foundation.layout.WindowInsets windowInsets2, androidx.compose.ui.unit.Density density) {
                return java.lang.Integer.valueOf(windowInsets2.getTop(density));
            }
        }));
    }

    public static final androidx.compose.ui.Modifier windowInsetsBottomHeight(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.WindowInsets windowInsets) {
        return modifier.then(new androidx.compose.foundation.layout.DerivedHeightModifier(windowInsets, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsBottomHeight");
                inspectorInfo.getProperties().set("insets", androidx.compose.foundation.layout.WindowInsets.this);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function2<androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.unit.Density, java.lang.Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Integer invoke(androidx.compose.foundation.layout.WindowInsets windowInsets2, androidx.compose.ui.unit.Density density) {
                return java.lang.Integer.valueOf(windowInsets2.getBottom(density));
            }
        }));
    }
}
