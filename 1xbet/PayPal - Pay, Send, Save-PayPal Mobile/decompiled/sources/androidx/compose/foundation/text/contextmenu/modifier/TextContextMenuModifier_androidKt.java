package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "Landroid/content/Context;", "", "Lkotlin/ExtensionFunctionType;", "builder", "addTextContextMenuComponentsWithContext", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextContextMenuModifier_androidKt {
    public static final androidx.compose.ui.Modifier addTextContextMenuComponentsWithContext(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, ? super android.content.Context, kotlin.Unit> function2) {
        return modifier.then(new androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextElement(function2));
    }
}
