package androidx.compose.material;

/* compiled from: TouchTarget.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\bH\u0000\"\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"LocalMinimumTouchTargetEnforcement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalMinimumTouchTargetEnforcement$annotations", "()V", "getLocalMinimumTouchTargetEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "minimumTouchTargetSize", "Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TouchTargetKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> LocalMinimumTouchTargetEnforcement = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.TouchTargetKt$LocalMinimumTouchTargetEnforcement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Boolean invoke() {
            return true;
        }
    });

    @androidx.compose.material.ExperimentalMaterialApi
    public static /* synthetic */ void getLocalMinimumTouchTargetEnforcement$annotations() {
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> getLocalMinimumTouchTargetEnforcement() {
        return LocalMinimumTouchTargetEnforcement;
    }

    public static final androidx.compose.ui.Modifier minimumTouchTargetSize(androidx.compose.ui.Modifier modifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "<this>");
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.material.TouchTargetKt$minimumTouchTargetSize$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("minimumTouchTargetSize");
                inspectorInfo.getProperties().set("README", "Adds outer padding to measure at least 48.dp (default) in size to disambiguate touch interactions if the element would measure smaller");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.material.TouchTargetKt$minimumTouchTargetSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier composed, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.ui.Modifier.Companion companion;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1220403677);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C43@1920L7,46@2147L7:TouchTarget.kt#jmzs0o");
                androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> localMinimumTouchTargetEnforcement = androidx.compose.material.TouchTargetKt.getLocalMinimumTouchTargetEnforcement();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = composer.consume(localMinimumTouchTargetEnforcement);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                if (((java.lang.Boolean) consume).booleanValue()) {
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume2 = composer.consume(localViewConfiguration);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                    companion = new androidx.compose.material.MinimumTouchTargetModifier(((androidx.compose.ui.platform.ViewConfiguration) consume2).mo3540getMinimumTouchTargetSizeMYxV2XQ(), null);
                } else {
                    companion = androidx.compose.ui.Modifier.INSTANCE;
                }
                composer.endReplaceableGroup();
                return companion;
            }
        });
    }
}
