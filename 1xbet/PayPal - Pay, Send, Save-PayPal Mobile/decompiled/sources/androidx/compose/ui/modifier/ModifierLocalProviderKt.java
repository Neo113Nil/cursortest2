package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "Lkotlin/Function0;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "modifierLocalProvider", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/modifier/ProvidableModifierLocal;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModifierLocalProviderKt {
    public static final <T> androidx.compose.ui.Modifier modifierLocalProvider(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.modifier.ProvidableModifierLocal<T> providableModifierLocal, final kotlin.jvm.functions.Function0<? extends T> function0) {
        return modifier.then(new androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$1(providableModifierLocal, function0, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("modifierLocalProvider");
                inspectorInfo.getProperties().set("key", androidx.compose.ui.modifier.ProvidableModifierLocal.this);
                inspectorInfo.getProperties().set(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, function0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }
}
