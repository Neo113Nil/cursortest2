package androidx.compose.foundation.selection;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "selectableGroup", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectableGroupKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.ui.Modifier selectableGroup(androidx.compose.ui.Modifier modifier) {
        return androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.selection.SelectableGroupKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.selection.SelectableGroupKt.Camera2StreamConfigurationMap((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                return Camera2StreamConfigurationMap;
            }
        }, 1, null);
    }
}
