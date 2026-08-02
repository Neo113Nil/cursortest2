package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a<\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001aH\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0019\b\b\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0000¢\u0006\u0002\b\u0003H\u0087\b¢\u0006\u0004\b\n\u0010\u000b\u001a4\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\"(\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00038\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\"\u0010\u0014\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "definitions", "debugInspectorInfo", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "factory", "inspectable", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "wrapped", "inspectableWrapper", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "NoInspectorInfo", "Lkotlin/jvm/functions/Function1;", "getNoInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "", "isDebugInspectorInfoEnabled", "Z", "()Z", "setDebugInspectorInfoEnabled", "(Z)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InspectableValueKt {
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> NoInspectorInfo = new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        public final void getHighSpeedVideoSizes(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
            getHighSpeedVideoSizes(inspectorInfo);
            return kotlin.Unit.INSTANCE;
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    public static final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        isDebugInspectorInfoEnabled = z;
    }

    public static final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> debugInspectorInfo(final kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        return isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.ui.platform.InspectableValueKt$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                function1.invoke(inspectorInfo);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        } : getNoInspectorInfo();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This API will create more invalidations of your modifier than necessary, so it's use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
    public static final androidx.compose.ui.Modifier inspectable(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier, ? extends androidx.compose.ui.Modifier> function12) {
        return inspectableWrapper(modifier, function1, function12.invoke(androidx.compose.ui.Modifier.INSTANCE));
    }

    public static final androidx.compose.ui.Modifier inspectableWrapper(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier2) {
        androidx.compose.ui.platform.InspectableModifier inspectableModifier = new androidx.compose.ui.platform.InspectableModifier(function1);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }
}
