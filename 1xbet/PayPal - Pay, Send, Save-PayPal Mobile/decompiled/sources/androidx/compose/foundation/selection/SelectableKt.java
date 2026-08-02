package androidx.compose.foundation.selection;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001aQ\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "", com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "selectable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "selectable", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectable-oSLSa3U", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/semantics/Role;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/Indication;", "indication", "selectable-O2vRcR0", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectableKt {
    /* renamed from: selectable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1944selectableXHw0xAI$default(androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m1943selectableXHw0xAI(modifier, z, z2, role, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier Camera2StreamConfigurationMap(boolean z, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(-2124609672);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2124609672, i, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:82)");
        }
        androidx.compose.foundation.Indication indication = (androidx.compose.foundation.Indication) composer.consume(androidx.compose.foundation.IndicationKt.getLocalIndication());
        if (indication instanceof androidx.compose.foundation.IndicationNodeFactory) {
            composer.startReplaceGroup(686451247);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(686583865);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
            composer.endReplaceGroup();
        }
        androidx.compose.ui.Modifier m1941selectableO2vRcR0 = m1941selectableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, z, mutableInteractionSource, indication, z2, role, function0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m1941selectableO2vRcR0;
    }

    /* renamed from: selectable-oSLSa3U$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1946selectableoSLSa3U$default(androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.semantics.Role role, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m1945selectableoSLSa3U(modifier, z, z2, (i & 4) != 0 ? null : role, (i & 8) != 0 ? null : mutableInteractionSource, function0);
    }

    /* renamed from: selectable-oSLSa3U, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1945selectableoSLSa3U(androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.semantics.Role role, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        return modifier.then(new androidx.compose.foundation.selection.SelectableElement(z, mutableInteractionSource, null, true, z2, role, function0, null));
    }

    /* renamed from: selectable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1942selectableO2vRcR0$default(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.Indication indication, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            role = null;
        }
        return m1941selectableO2vRcR0(modifier, z, mutableInteractionSource, indication, z3, role, function0);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced with new overload that only supports IndicationNodeFactory instances inside LocalIndication, and does not use composed")
    /* renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.Modifier m1943selectableXHw0xAI(androidx.compose.ui.Modifier modifier, final boolean z, final boolean z2, final androidx.compose.ui.semantics.Role role, final kotlin.jvm.functions.Function0 function0) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-XHw0xAI$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("selectable");
                inspectorInfo.getProperties().set(com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, java.lang.Boolean.valueOf(z));
                inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", function0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.selection.SelectableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.Modifier Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.selection.SelectableKt.Camera2StreamConfigurationMap(z, z2, role, function0, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return Camera2StreamConfigurationMap;
            }
        });
    }

    /* renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1941selectableO2vRcR0(androidx.compose.ui.Modifier modifier, final boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.foundation.Indication indication, final boolean z2, final androidx.compose.ui.semantics.Role role, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        androidx.compose.foundation.selection.SelectableElement composed$default;
        androidx.compose.foundation.selection.SelectableElement selectableElement;
        if (indication instanceof androidx.compose.foundation.IndicationNodeFactory) {
            selectableElement = new androidx.compose.foundation.selection.SelectableElement(z, mutableInteractionSource, (androidx.compose.foundation.IndicationNodeFactory) indication, false, z2, role, function0, null);
        } else {
            if (indication != null) {
                if (mutableInteractionSource != null) {
                    composed$default = androidx.compose.foundation.IndicationKt.indication(androidx.compose.ui.Modifier.INSTANCE, mutableInteractionSource, indication).then(new androidx.compose.foundation.selection.SelectableElement(z, mutableInteractionSource, null, false, z2, role, function0, null));
                } else {
                    composed$default = androidx.compose.ui.ComposedModifierKt.composed$default(androidx.compose.ui.Modifier.INSTANCE, null, new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                        @Override // kotlin.jvm.functions.Function3
                        public final /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                            return invoke(modifier2, composer, num.intValue());
                        }

                        public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                            composer.startReplaceGroup(-1525724089);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1525724089, i, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:634)");
                            }
                            java.lang.Object rememberedValue = composer.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                composer.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                            androidx.compose.ui.Modifier then = androidx.compose.foundation.IndicationKt.indication(androidx.compose.ui.Modifier.INSTANCE, mutableInteractionSource2, androidx.compose.foundation.Indication.this).then(new androidx.compose.foundation.selection.SelectableElement(z, mutableInteractionSource2, null, false, z2, role, function0, null));
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceGroup();
                            return then;
                        }
                    }, 1, null);
                }
                return modifier.then(composed$default);
            }
            selectableElement = new androidx.compose.foundation.selection.SelectableElement(z, mutableInteractionSource, null, false, z2, role, function0, null);
        }
        composed$default = selectableElement;
        return modifier.then(composed$default);
    }
}
