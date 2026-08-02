package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0005\u0010\b\u001a*\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "windowInsetsPadding", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/ui/Modifier;", "consumeWindowInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "block", "onConsumedWindowInsetsChanged", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "recalculateWindowInsets", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt {
    public static final androidx.compose.ui.Modifier recalculateWindowInsets(androidx.compose.ui.Modifier modifier) {
        return modifier.then(androidx.compose.foundation.layout.RecalculateWindowInsetsModifierElement.INSTANCE);
    }

    public static final androidx.compose.ui.Modifier windowInsetsPadding(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.WindowInsets windowInsets) {
        return modifier.then(new androidx.compose.foundation.layout.InsetsPaddingModifierElement(windowInsets, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("windowInsetsPadding");
                inspectorInfo.getProperties().set("insets", androidx.compose.foundation.layout.WindowInsets.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }

    public static final androidx.compose.ui.Modifier consumeWindowInsets(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.WindowInsets windowInsets) {
        return modifier.then(new androidx.compose.foundation.layout.UnionInsetsConsumingModifierElement(windowInsets, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("consumeWindowInsets");
                inspectorInfo.getProperties().set("insets", androidx.compose.foundation.layout.WindowInsets.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }

    public static final androidx.compose.ui.Modifier consumeWindowInsets(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.layout.PaddingValues paddingValues) {
        return modifier.then(new androidx.compose.foundation.layout.PaddingValuesConsumingModifierElement(paddingValues, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("consumeWindowInsets");
                inspectorInfo.getProperties().set("paddingValues", androidx.compose.foundation.layout.PaddingValues.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }

    public static final androidx.compose.ui.Modifier onConsumedWindowInsetsChanged(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.WindowInsets, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.foundation.layout.ConsumedInsetsModifierElement(function1, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("onConsumedWindowInsetsChanged");
                inspectorInfo.getProperties().set("block", kotlin.jvm.functions.Function1.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }
}
