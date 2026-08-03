package androidx.compose.foundation.selection;

/* compiled from: Toggleable.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aV\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0002\b\u000e\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0002\b\u000f\u001aP\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014ø\u0001\u0000¢\u0006\u0002\b\u0015\u001a>\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014ø\u0001\u0000¢\u0006\u0002\b\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"toggleable", "Landroidx/compose/ui/Modifier;", "value", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "role", "Landroidx/compose/ui/semantics/Role;", "onValueChange", "Lkotlin/Function1;", "", "toggleable-O2vRcR0", "toggleable-XHw0xAI", "triStateToggleable", "state", "Landroidx/compose/ui/state/ToggleableState;", "onClick", "Lkotlin/Function0;", "triStateToggleable-O2vRcR0", "triStateToggleable-XHw0xAI", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ToggleableKt {
    /* renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m824toggleableXHw0xAI$default(androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m823toggleableXHw0xAI(modifier, z, z2, role, function1);
    }

    /* renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m822toggleableO2vRcR0$default(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.Indication indication, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        boolean z3 = (i & 8) != 0 ? true : z2;
        if ((i & 16) != 0) {
            role = null;
        }
        return m821toggleableO2vRcR0(modifier, z, mutableInteractionSource, indication, z3, role, function1);
    }

    /* renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m828triStateToggleableXHw0xAI$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.state.ToggleableState toggleableState, boolean z, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m827triStateToggleableXHw0xAI(modifier, toggleableState, z, role, function0);
    }

    /* renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m826triStateToggleableO2vRcR0$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.state.ToggleableState toggleableState, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.Indication indication, boolean z, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        boolean z2 = (i & 8) != 0 ? true : z;
        if ((i & 16) != 0) {
            role = null;
        }
        return m825triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z2, role, function0);
    }

    /* renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m823toggleableXHw0xAI(androidx.compose.ui.Modifier modifier, final boolean z, final boolean z2, final androidx.compose.ui.semantics.Role role, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("toggleable");
                inspectorInfo.getProperties().set("value", java.lang.Boolean.valueOf(z));
                inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onValueChange", function1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                composer.startReplaceableGroup(290332169);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C68@2718L39,69@2796L7:Toggleable.kt#gro6r2");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(290332169, i, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:66)");
                }
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                boolean z3 = z;
                composer.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.Indication> localIndication = androidx.compose.foundation.IndicationKt.getLocalIndication();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = composer.consume(localIndication);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                androidx.compose.ui.Modifier m821toggleableO2vRcR0 = androidx.compose.foundation.selection.ToggleableKt.m821toggleableO2vRcR0(companion, z3, mutableInteractionSource, (androidx.compose.foundation.Indication) consume, z2, role, function1);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return m821toggleableO2vRcR0;
            }
        });
    }

    /* renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m821toggleableO2vRcR0(androidx.compose.ui.Modifier modifier, final boolean z, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.foundation.Indication indication, final boolean z2, final androidx.compose.ui.semantics.Role role, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> noInspectorInfo = androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("toggleable");
                inspectorInfo.getProperties().set("value", java.lang.Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onValueChange", function1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo();
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        return androidx.compose.ui.platform.InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, m825triStateToggleableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.state.ToggleableStateKt.ToggleableState(z), mutableInteractionSource, indication, z2, role, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                function1.invoke(java.lang.Boolean.valueOf(!z));
            }
        }));
    }

    /* renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m827triStateToggleableXHw0xAI(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.state.ToggleableState toggleableState, final boolean z, final androidx.compose.ui.semantics.Role role, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("triStateToggleable");
                inspectorInfo.getProperties().set("state", androidx.compose.ui.state.ToggleableState.this);
                inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(z));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", function0);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                composer.startReplaceableGroup(-1808118329);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C165@6476L39,166@6554L7:Toggleable.kt#gro6r2");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1808118329, i, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:163)");
                }
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.state.ToggleableState toggleableState2 = androidx.compose.ui.state.ToggleableState.this;
                composer.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.Indication> localIndication = androidx.compose.foundation.IndicationKt.getLocalIndication();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = composer.consume(localIndication);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                androidx.compose.ui.Modifier m825triStateToggleableO2vRcR0 = androidx.compose.foundation.selection.ToggleableKt.m825triStateToggleableO2vRcR0(companion, toggleableState2, mutableInteractionSource, (androidx.compose.foundation.Indication) consume, z, role, function0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return m825triStateToggleableO2vRcR0;
            }
        });
    }

    /* renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m825triStateToggleableO2vRcR0(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.state.ToggleableState toggleableState, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.foundation.Indication indication, final boolean z, final androidx.compose.ui.semantics.Role role, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        androidx.compose.ui.Modifier m243clickableO2vRcR0;
        kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> noInspectorInfo = androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("triStateToggleable");
                inspectorInfo.getProperties().set("state", androidx.compose.ui.state.ToggleableState.this);
                inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(z));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("onClick", function0);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo();
        m243clickableO2vRcR0 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(androidx.compose.ui.Modifier.INSTANCE, mutableInteractionSource, indication, (r14 & 4) != 0 ? true : z, (r14 & 8) != 0 ? null : null, (r14 & 16) != 0 ? null : role, function0);
        return androidx.compose.ui.platform.InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m243clickableO2vRcR0, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$4$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, androidx.compose.ui.state.ToggleableState.this);
            }
        }, 1, null));
    }
}
