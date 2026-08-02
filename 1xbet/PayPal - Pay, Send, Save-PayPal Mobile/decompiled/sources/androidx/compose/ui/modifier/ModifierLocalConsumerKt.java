package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "", "Lkotlin/ExtensionFunctionType;", "consumer", "modifierLocalConsumer", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModifierLocalConsumerKt {
    public static final androidx.compose.ui.Modifier modifierLocalConsumer(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.modifier.ModifierLocalReadScope, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.ui.modifier.ModifierLocalConsumerImpl(function1, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.ui.modifier.ModifierLocalConsumerKt$modifierLocalConsumer$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("modifierLocalConsumer");
                inspectorInfo.getProperties().set("consumer", kotlin.jvm.functions.Function1.this);
            }

            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo()));
    }
}
