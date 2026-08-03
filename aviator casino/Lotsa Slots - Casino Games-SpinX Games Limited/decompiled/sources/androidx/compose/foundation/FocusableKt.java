package androidx.compose.foundation;

/* compiled from: Focusable.kt */
@kotlin.Metadata(d1 = {"\u0000%\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0007\u001a \u0010\u0007\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a\u001e\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"FocusableInNonTouchModeElement", "androidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1", "Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;", "focusGroupInspectorInfo", "Landroidx/compose/ui/platform/InspectableModifier;", "focusGroup", "Landroidx/compose/ui/Modifier;", "focusable", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "focusableInNonTouchMode", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusableKt {
    private static final androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1 FocusableInNonTouchModeElement;
    private static final androidx.compose.ui.platform.InspectableModifier focusGroupInspectorInfo;

    public static /* synthetic */ androidx.compose.ui.Modifier focusable$default(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }

    public static final androidx.compose.ui.Modifier focusable(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        androidx.compose.ui.Modifier.Companion companion;
        if (z) {
            companion = androidx.compose.ui.focus.FocusModifierKt.focusTarget(new androidx.compose.foundation.FocusableElement(mutableInteractionSource));
        } else {
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        return modifier.then(companion);
    }

    public static final androidx.compose.ui.Modifier focusGroup(androidx.compose.ui.Modifier modifier) {
        return androidx.compose.ui.focus.FocusModifierKt.focusTarget(androidx.compose.ui.focus.FocusPropertiesKt.focusProperties(modifier.then(focusGroupInspectorInfo), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusProperties, kotlin.Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusGroup$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusProperties focusProperties) {
                invoke2(focusProperties);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.focus.FocusProperties focusProperties) {
                focusProperties.setCanFocus(false);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        focusGroupInspectorInfo = new androidx.compose.ui.platform.InspectableModifier(androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("focusGroup");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo());
        FocusableInNonTouchModeElement = new androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.FocusableInNonTouchMode>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(java.lang.Object other) {
                return this == other;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(androidx.compose.foundation.FocusableInNonTouchMode node) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public androidx.compose.foundation.FocusableInNonTouchMode create() {
                return new androidx.compose.foundation.FocusableInNonTouchMode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return java.lang.System.identityHashCode(this);
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("focusableInNonTouchMode");
            }
        };
    }

    public static final androidx.compose.ui.Modifier focusableInNonTouchMode(androidx.compose.ui.Modifier modifier, final boolean z, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$1
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
                inspectorInfo.setName("focusableInNonTouchMode");
                inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        };
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        return androidx.compose.ui.platform.InspectableValueKt.inspectableWrapper(modifier, function1, focusable(androidx.compose.ui.Modifier.INSTANCE.then(FocusableInNonTouchModeElement), z, mutableInteractionSource));
    }
}
